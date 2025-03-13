package y7;

import h7.h;
import p7.l;

public final class n0 extends e {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8584f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8585g;

    public /* synthetic */ n0(int i8, Object obj) {
        this.f8584f = i8;
        this.f8585g = obj;
    }

    public final void a(Throwable th) {
        int i8 = this.f8584f;
        Object obj = this.f8585g;
        switch (i8) {
            case 0:
                ((m0) obj).f();
                return;
            default:
                ((l) obj).invoke(th);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f8584f) {
            case 0:
                a((Throwable) obj);
                return h.f4787a;
            default:
                a((Throwable) obj);
                return h.f4787a;
        }
    }

    public final String toString() {
        int i8 = this.f8584f;
        Object obj = this.f8585g;
        switch (i8) {
            case 0:
                return "DisposeOnCancel[" + ((m0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((l) obj).getClass().getSimpleName() + '@' + b0.l(this) + ']';
        }
    }
}
