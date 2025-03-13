package androidx.health.services.client.impl.internal;

import androidx.health.services.client.impl.internal.IStatusCallback;
import g5.l;
import q7.k;

public class StatusCallback extends IStatusCallback.Stub {
    private final l<Void> resultFuture;

    public StatusCallback(l<Void> lVar) {
        k.e(lVar, "resultFuture");
        this.resultFuture = lVar;
    }

    public void onFailure(String str) {
        k.e(str, "msg");
        this.resultFuture.l(new Exception(str));
    }

    public void onSuccess() {
        this.resultFuture.m(null);
    }
}
