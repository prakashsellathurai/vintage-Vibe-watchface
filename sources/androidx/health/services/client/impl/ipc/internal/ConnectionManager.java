package androidx.health.services.client.impl.ipc.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.health.services.client.impl.ipc.internal.ServiceConnection;
import java.util.HashMap;
import java.util.Map;

public final class ConnectionManager implements Handler.Callback, ServiceConnection.Callback {
    private static final int MSG_CONNECTED = 1;
    private static final int MSG_DISCONNECTED = 2;
    private static final int MSG_EXECUTE = 3;
    private static final int MSG_REGISTER_LISTENER = 4;
    private static final int MSG_UNREGISTER_LISTENER = 5;
    private static final String TAG = "ConnectionManager";
    private boolean mBindToSelfEnabled;
    private final Context mContext;
    private final Handler mHandler;
    private final Map<String, ServiceConnection> mServiceConnectionMap = new HashMap();

    public static class ListenerHolder {
        private final ListenerKey mListenerKey;
        private final QueueOperation mListenerOperation;

        public ListenerHolder(ListenerKey listenerKey, QueueOperation queueOperation) {
            this.mListenerKey = listenerKey;
            this.mListenerOperation = queueOperation;
        }

        public ListenerKey getListenerKey() {
            return this.mListenerKey;
        }

        public QueueOperation getListenerOperation() {
            return this.mListenerOperation;
        }
    }

    public ConnectionManager(Context context, Looper looper) {
        this.mContext = context;
        this.mHandler = new Handler(looper, this);
    }

    private ServiceConnection getConnection(ConnectionConfiguration connectionConfiguration) {
        String key = connectionConfiguration.getKey();
        ServiceConnection serviceConnection = this.mServiceConnectionMap.get(key);
        if (serviceConnection != null) {
            return serviceConnection;
        }
        ServiceConnection serviceConnection2 = new ServiceConnection(this.mContext, connectionConfiguration, new DefaultExecutionTracker(), this);
        this.mServiceConnectionMap.put(key, serviceConnection2);
        return serviceConnection2;
    }

    public boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 1) {
            ServiceConnection serviceConnection = (ServiceConnection) message.obj;
            serviceConnection.reRegisterAllListeners();
            serviceConnection.refreshServiceVersion();
            serviceConnection.flushQueue();
            return true;
        } else if (i8 == 2) {
            ((ServiceConnection) message.obj).maybeReconnect();
            return true;
        } else if (i8 == 3) {
            QueueOperation queueOperation = (QueueOperation) message.obj;
            getConnection(queueOperation.getConnectionConfiguration()).enqueue(queueOperation);
            return true;
        } else if (i8 == 4) {
            ListenerHolder listenerHolder = (ListenerHolder) message.obj;
            getConnection(listenerHolder.getListenerOperation().getConnectionConfiguration()).registerListener(listenerHolder.getListenerKey(), listenerHolder.getListenerOperation());
            return true;
        } else if (i8 != 5) {
            Log.e(TAG, "Received unknown message: " + message.what);
            return false;
        } else {
            ListenerHolder listenerHolder2 = (ListenerHolder) message.obj;
            getConnection(listenerHolder2.getListenerOperation().getConnectionConfiguration()).unregisterListener(listenerHolder2.getListenerKey(), listenerHolder2.getListenerOperation());
            return true;
        }
    }

    public boolean isBindToSelfEnabled() {
        return this.mBindToSelfEnabled;
    }

    public void onConnected(ServiceConnection serviceConnection) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, serviceConnection));
    }

    public void onDisconnected(ServiceConnection serviceConnection, long j8) {
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(2, serviceConnection), j8);
    }

    public void registerListener(ListenerKey listenerKey, QueueOperation queueOperation) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new ListenerHolder(listenerKey, queueOperation)));
    }

    public void scheduleForExecution(QueueOperation queueOperation) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, queueOperation));
    }

    public void setBindToSelf(boolean z8) {
        this.mBindToSelfEnabled = z8;
    }

    public void unregisterListener(ListenerKey listenerKey, QueueOperation queueOperation) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(5, new ListenerHolder(listenerKey, queueOperation)));
    }
}
