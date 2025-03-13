package androidx.health.services.client.impl.ipc;

import android.os.IBinder;
import android.os.IInterface;
import androidx.health.services.client.impl.ipc.internal.BaseQueueOperation;
import androidx.health.services.client.impl.ipc.internal.ConnectionConfiguration;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import androidx.health.services.client.impl.ipc.internal.ExecutionTracker;
import androidx.health.services.client.impl.ipc.internal.ListenerKey;
import androidx.health.services.client.impl.ipc.internal.QueueOperation;
import g5.d;
import g5.f;
import g5.g;
import g5.i;
import g5.j;
import g5.l;

public abstract class Client<S extends IInterface> {
    private static final int UNKNOWN_VERSION = -1;
    /* access modifiers changed from: private */
    public final ConnectionConfiguration mConnectionConfiguration;
    /* access modifiers changed from: private */
    public final ConnectionManager mConnectionManager;
    /* access modifiers changed from: private */
    public volatile int mCurrentVersion = -1;
    private final RemoteOperation<S, Integer> mRemoteVersionGetter;
    private final ServiceGetter<S> mServiceGetter;

    public interface ServiceGetter<S> {
        S getService(IBinder iBinder);
    }

    public Client(ClientConfiguration clientConfiguration, ConnectionManager connectionManager, final ServiceGetter<S> serviceGetter, final RemoteOperation<S, Integer> remoteOperation) {
        this.mConnectionConfiguration = new ConnectionConfiguration(clientConfiguration.getServicePackageName(), clientConfiguration.getApiClientName(), clientConfiguration.getBindAction(), new QueueOperation() {
            public void execute(IBinder iBinder) {
                int unused = Client.this.mCurrentVersion = ((Integer) remoteOperation.execute((IInterface) serviceGetter.getService(iBinder))).intValue();
            }

            public ConnectionConfiguration getConnectionConfiguration() {
                return Client.this.mConnectionConfiguration;
            }

            public void setException(Throwable th) {
            }

            public QueueOperation trackExecution(ExecutionTracker executionTracker) {
                return this;
            }
        });
        this.mConnectionManager = connectionManager;
        this.mServiceGetter = serviceGetter;
        this.mRemoteVersionGetter = remoteOperation;
    }

    /* access modifiers changed from: private */
    public <R> QueueOperation createQueueOperation(final RemoteFutureOperation<S, R> remoteFutureOperation, final l<R> lVar) {
        return new BaseQueueOperation(this.mConnectionConfiguration) {
            public void execute(IBinder iBinder) {
                remoteFutureOperation.execute(Client.this.getService(iBinder), lVar);
            }

            public void setException(Throwable th) {
                lVar.l(th);
            }

            public QueueOperation trackExecution(ExecutionTracker executionTracker) {
                executionTracker.track(lVar);
                return this;
            }
        };
    }

    /* access modifiers changed from: private */
    public S getService(IBinder iBinder) {
        return (IInterface) this.mServiceGetter.getService(iBinder);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getCurrentRemoteVersion$1(Integer num) {
        this.mCurrentVersion = num.intValue();
        return Integer.valueOf(this.mCurrentVersion);
    }

    public <R> j<R> execute(RemoteFutureOperation<S, R> remoteFutureOperation) {
        l lVar = new l();
        this.mConnectionManager.scheduleForExecution(createQueueOperation(remoteFutureOperation, lVar));
        return lVar;
    }

    public <R> j<R> execute(RemoteOperation<S, R> remoteOperation) {
        return execute(new a(remoteOperation, 2));
    }

    public <R> j<R> executeWithVersionCheck(final RemoteFutureOperation<S, R> remoteFutureOperation, final int i8) {
        final l lVar = new l();
        j<Integer> currentRemoteVersion = getCurrentRemoteVersion(false);
        AnonymousClass2 r22 = new f<Integer>() {
            public void onFailure(Throwable th) {
                lVar.l(th);
            }

            public void onSuccess(Integer num) {
                if (num.intValue() < i8) {
                    Client.this.mConnectionManager.scheduleForExecution(new BaseQueueOperation(Client.this.mConnectionConfiguration));
                    lVar.l(Client.this.getApiVersionCheckFailureException(num.intValue(), i8));
                    return;
                }
                Client.this.mConnectionManager.scheduleForExecution(Client.this.createQueueOperation(remoteFutureOperation, lVar));
            }
        };
        currentRemoteVersion.a(new g.a(currentRemoteVersion, r22), d.f4656f);
        return lVar;
    }

    public Exception getApiVersionCheckFailureException(int i8, int i9) {
        return new ApiVersionException(i8, i9);
    }

    public ConnectionConfiguration getConnectionConfiguration() {
        return this.mConnectionConfiguration;
    }

    public ConnectionManager getConnectionManager() {
        return this.mConnectionManager;
    }

    public j<Integer> getCurrentRemoteVersion(boolean z8) {
        if (this.mCurrentVersion == -1 || z8) {
            return g.k(execute(this.mRemoteVersionGetter), new androidx.health.services.client.impl.g(3, this), d.f4656f);
        }
        Integer valueOf = Integer.valueOf(this.mCurrentVersion);
        return valueOf == null ? i.f4660g : new i(valueOf);
    }

    public <R> j<R> registerListener(ListenerKey listenerKey, RemoteFutureOperation<S, R> remoteFutureOperation) {
        l lVar = new l();
        this.mConnectionManager.registerListener(listenerKey, createQueueOperation(remoteFutureOperation, lVar));
        return lVar;
    }

    public <R> j<R> registerListener(ListenerKey listenerKey, RemoteOperation<S, R> remoteOperation) {
        return registerListener(listenerKey, new a(remoteOperation, 0));
    }

    public <R> j<R> unregisterListener(ListenerKey listenerKey, RemoteFutureOperation<S, R> remoteFutureOperation) {
        l lVar = new l();
        this.mConnectionManager.unregisterListener(listenerKey, createQueueOperation(remoteFutureOperation, lVar));
        return lVar;
    }

    public <R> j<R> unregisterListener(ListenerKey listenerKey, RemoteOperation<S, R> remoteOperation) {
        return unregisterListener(listenerKey, new a(remoteOperation, 1));
    }
}
