package h7;

import q7.k;

public final class c extends Error {
    public /* synthetic */ c() {
        this("An operation is not implemented.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str) {
        super(str);
        k.e(str, "message");
    }

    public /* synthetic */ c(String str, Throwable th) {
        super(str, th);
    }
}
