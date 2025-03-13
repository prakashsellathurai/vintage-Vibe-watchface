package y7;

import j7.f;

public final class t1 extends w {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f8613h = 0;

    static {
        new t1();
    }

    public final void N(f fVar, Runnable runnable) {
        if (((w1) fVar.d(w1.f8623g)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
