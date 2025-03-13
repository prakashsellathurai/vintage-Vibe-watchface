package androidx.health.services.client.impl.ipc;

public interface RemoteOperation<S, R> {
    R execute(S s8);
}
