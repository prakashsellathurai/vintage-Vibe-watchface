package androidx.health.services.client.impl.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import q7.k;

public final class HsConnectionManager {
    public static final HsConnectionManager INSTANCE = new HsConnectionManager();
    @SuppressLint({"StaticFieldLeak"})
    private static ConnectionManager instance;
    private static final Object lock = new Object();

    private HsConnectionManager() {
    }

    public static final ConnectionManager getInstance(Context context) {
        ConnectionManager connectionManager;
        k.e(context, "context");
        synchronized (lock) {
            if (instance == null) {
                instance = new ConnectionManager(context.getApplicationContext(), INSTANCE.startHandlerThread());
            }
            connectionManager = instance;
            if (connectionManager == null) {
                k.h("instance");
                throw null;
            }
        }
        return connectionManager;
    }

    private final Looper startHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("HsConnectionManager", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        k.d(looper, "handlerThread.looper");
        return looper;
    }
}
