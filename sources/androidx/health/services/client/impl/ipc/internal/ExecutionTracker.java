package androidx.health.services.client.impl.ipc.internal;

import g5.l;

public interface ExecutionTracker {
    void cancelPendingFutures(Throwable th);

    void track(l<?> lVar);
}
