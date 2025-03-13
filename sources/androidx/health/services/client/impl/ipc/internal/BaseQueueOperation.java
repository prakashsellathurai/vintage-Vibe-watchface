package androidx.health.services.client.impl.ipc.internal;

import android.os.IBinder;

public class BaseQueueOperation implements QueueOperation {
    private final ConnectionConfiguration mConnectionConfiguration;

    public BaseQueueOperation(ConnectionConfiguration connectionConfiguration) {
        connectionConfiguration.getClass();
        this.mConnectionConfiguration = connectionConfiguration;
    }

    public void execute(IBinder iBinder) {
    }

    public ConnectionConfiguration getConnectionConfiguration() {
        return this.mConnectionConfiguration;
    }

    public void setException(Throwable th) {
    }

    public QueueOperation trackExecution(ExecutionTracker executionTracker) {
        return this;
    }
}
