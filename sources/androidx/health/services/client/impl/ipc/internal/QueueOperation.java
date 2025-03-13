package androidx.health.services.client.impl.ipc.internal;

import android.os.IBinder;

public interface QueueOperation {
    void execute(IBinder iBinder);

    ConnectionConfiguration getConnectionConfiguration();

    void setException(Throwable th);

    QueueOperation trackExecution(ExecutionTracker executionTracker);
}
