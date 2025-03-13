package androidx.health.services.client.impl.ipc;

import g5.l;

public interface RemoteFutureOperation<S, R> {
    void execute(S s8, l<R> lVar);
}
