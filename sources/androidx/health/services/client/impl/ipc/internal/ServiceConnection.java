package androidx.health.services.client.impl.ipc.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ServiceConnection implements android.content.ServiceConnection {
    private static final int MAX_RETRIES = 10;
    private static final String TAG = "ServiceConnection";
    IBinder mBinder;
    private final Callback mCallback;
    private final ConnectionConfiguration mConnectionConfiguration;
    private final Context mContext;
    private final ExecutionTracker mExecutionTracker;
    private volatile boolean mIsServiceBound;
    private final Queue<QueueOperation> mOperationQueue = new ConcurrentLinkedQueue();
    private final Map<ListenerKey, QueueOperation> mRegisteredListeners = new HashMap();
    private int mServiceConnectionRetry;

    public interface Callback {
        boolean isBindToSelfEnabled();

        void onConnected(ServiceConnection serviceConnection);

        void onDisconnected(ServiceConnection serviceConnection, long j8);
    }

    public ServiceConnection(Context context, ConnectionConfiguration connectionConfiguration, ExecutionTracker executionTracker, Callback callback) {
        context.getClass();
        this.mContext = context;
        connectionConfiguration.getClass();
        this.mConnectionConfiguration = connectionConfiguration;
        executionTracker.getClass();
        this.mExecutionTracker = executionTracker;
        callback.getClass();
        this.mCallback = callback;
    }

    private void cancelAllOperationsInQueue(Throwable th) {
        Iterator it = new ArrayList(this.mOperationQueue).iterator();
        while (it.hasNext()) {
            QueueOperation queueOperation = (QueueOperation) it.next();
            if (this.mOperationQueue.remove(queueOperation)) {
                queueOperation.setException(th);
                execute(queueOperation);
            }
        }
    }

    private void cleanOnDeath(IBinder iBinder) {
        try {
            iBinder.linkToDeath(new a(0, this), 0);
        } catch (RemoteException e) {
            Log.w(TAG, "Cannot link to death, binder already died. Cleaning operations.", e);
            handleRetriableDisconnection(e);
        }
    }

    private String getBindPackageName() {
        return this.mCallback.isBindToSelfEnabled() ? this.mContext.getPackageName() : this.mConnectionConfiguration.getPackageName();
    }

    private static int getRetryDelayMs(int i8) {
        return 200 << i8;
    }

    private void handleNonRetriableDisconnection(Throwable th) {
        this.mServiceConnectionRetry = 10;
        handleRetriableDisconnection(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void handleRetriableDisconnection(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.String r0 = "WCS SDK Client '"
            monitor-enter(r3)
            boolean r1 = r3.isConnected()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0012
            java.lang.String r4 = "ServiceConnection"
            java.lang.String r0 = "Connection is already re-established. No need to reconnect again"
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            return
        L_0x0012:
            r3.clearConnection(r4)     // Catch:{ all -> 0x0052 }
            int r1 = r3.mServiceConnectionRetry     // Catch:{ all -> 0x0052 }
            r2 = 10
            if (r1 >= r2) goto L_0x0049
            java.lang.String r1 = "ServiceConnection"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r2.<init>(r0)     // Catch:{ all -> 0x0052 }
            androidx.health.services.client.impl.ipc.internal.ConnectionConfiguration r0 = r3.mConnectionConfiguration     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r0.getClientName()     // Catch:{ all -> 0x0052 }
            r2.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "' disconnected, retrying connection. Retry attempt: "
            r2.append(r0)     // Catch:{ all -> 0x0052 }
            int r0 = r3.mServiceConnectionRetry     // Catch:{ all -> 0x0052 }
            r2.append(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0052 }
            android.util.Log.w(r1, r0, r4)     // Catch:{ all -> 0x0052 }
            androidx.health.services.client.impl.ipc.internal.ServiceConnection$Callback r4 = r3.mCallback     // Catch:{ all -> 0x0052 }
            int r0 = r3.mServiceConnectionRetry     // Catch:{ all -> 0x0052 }
            int r0 = getRetryDelayMs(r0)     // Catch:{ all -> 0x0052 }
            long r0 = (long) r0     // Catch:{ all -> 0x0052 }
            r4.onDisconnected(r3, r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0050
        L_0x0049:
            java.lang.String r0 = "ServiceConnection"
            java.lang.String r1 = "Connection disconnected and maximum number of retries reached."
            android.util.Log.e(r0, r1, r4)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r3)
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.ipc.internal.ServiceConnection.handleRetriableDisconnection(java.lang.Throwable):void");
    }

    private boolean isConnected() {
        IBinder iBinder = this.mBinder;
        return iBinder != null && iBinder.isBinderAlive();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanOnDeath$0() {
        Log.w(TAG, "Binder died for client:" + this.mConnectionConfiguration.getClientName());
        handleRetriableDisconnection(new CancellationException());
    }

    public void clearConnection(Throwable th) {
        if (this.mIsServiceBound) {
            try {
                this.mContext.unbindService(this);
                this.mIsServiceBound = false;
            } catch (IllegalArgumentException e) {
                Log.e(TAG, "Failed to unbind the service. Ignoring and continuing", e);
            }
        }
        this.mBinder = null;
        this.mExecutionTracker.cancelPendingFutures(th);
        cancelAllOperationsInQueue(th);
    }

    public void connect() {
        if (!this.mIsServiceBound) {
            try {
                this.mIsServiceBound = this.mContext.bindService(new Intent().setPackage(getBindPackageName()).setAction(this.mConnectionConfiguration.getBindAction()), this, 129);
                if (!this.mIsServiceBound) {
                    Log.e(TAG, "Connection to service is not available for package '" + this.mConnectionConfiguration.getPackageName() + "' and action '" + this.mConnectionConfiguration.getBindAction() + "'.");
                    handleNonRetriableDisconnection(new CancellationException("Service not available"));
                }
            } catch (SecurityException e) {
                Log.w(TAG, "Failed to bind connection '" + this.mConnectionConfiguration.getKey() + "', no permission or service not found.", e);
                this.mIsServiceBound = false;
                this.mBinder = null;
                throw e;
            }
        }
    }

    public void enqueue(QueueOperation queueOperation) {
        if (isConnected()) {
            execute(queueOperation);
            return;
        }
        this.mOperationQueue.add(queueOperation);
        connect();
    }

    public void execute(QueueOperation queueOperation) {
        try {
            queueOperation.trackExecution(this.mExecutionTracker);
            IBinder iBinder = this.mBinder;
            iBinder.getClass();
            queueOperation.execute(iBinder);
        } catch (DeadObjectException e) {
            handleRetriableDisconnection(e);
        } catch (RemoteException | RuntimeException e4) {
            queueOperation.setException(e4);
        }
    }

    public void flushQueue() {
        Iterator it = new ArrayList(this.mOperationQueue).iterator();
        while (it.hasNext()) {
            QueueOperation queueOperation = (QueueOperation) it.next();
            if (this.mOperationQueue.remove(queueOperation)) {
                execute(queueOperation);
            }
        }
    }

    public void maybeReconnect() {
        if (this.mRegisteredListeners.isEmpty()) {
            this.mConnectionConfiguration.getClientName();
            return;
        }
        this.mServiceConnectionRetry++;
        this.mConnectionConfiguration.getClientName();
        connect();
    }

    public void onBindingDied(ComponentName componentName) {
        Log.e(TAG, "Binding died for client '" + this.mConnectionConfiguration.getClientName() + "'.");
        handleRetriableDisconnection(new CancellationException());
    }

    public void onNullBinding(ComponentName componentName) {
        Log.e(TAG, "Cannot bind client '" + this.mConnectionConfiguration.getClientName() + "', binder is null");
        handleRetriableDisconnection(new CancellationException("Null binding"));
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Objects.toString(componentName);
        if (iBinder == null) {
            Log.e(TAG, "Service connected but binder is null.");
            return;
        }
        this.mServiceConnectionRetry = 0;
        cleanOnDeath(iBinder);
        this.mBinder = iBinder;
        this.mCallback.onConnected(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Objects.toString(componentName);
    }

    public void reRegisterAllListeners() {
        for (Map.Entry next : this.mRegisteredListeners.entrySet()) {
            Objects.toString(next.getKey());
            execute((QueueOperation) next.getValue());
        }
    }

    public void refreshServiceVersion() {
        this.mOperationQueue.add(this.mConnectionConfiguration.getRefreshVersionOperation());
    }

    public void registerListener(ListenerKey listenerKey, QueueOperation queueOperation) {
        this.mRegisteredListeners.put(listenerKey, queueOperation);
        if (isConnected()) {
            enqueue(queueOperation);
        } else {
            connect();
        }
    }

    public void unregisterListener(ListenerKey listenerKey, QueueOperation queueOperation) {
        this.mRegisteredListeners.remove(listenerKey);
        enqueue(queueOperation);
    }
}
