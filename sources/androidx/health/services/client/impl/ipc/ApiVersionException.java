package androidx.health.services.client.impl.ipc;

import java.util.concurrent.ExecutionException;

public class ApiVersionException extends ExecutionException {
    private final int mMinVersion;
    private final int mRemoteVersion;

    public ApiVersionException(int i8, int i9) {
        super("Version requirements for calling the method was not met, remoteVersion: " + i8 + ", minVersion: " + i9);
        this.mRemoteVersion = i8;
        this.mMinVersion = i9;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getRemoteVersion() {
        return this.mRemoteVersion;
    }
}
