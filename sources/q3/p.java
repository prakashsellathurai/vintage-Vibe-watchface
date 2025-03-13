package q3;

import o3.a;

public final class p implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6574f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6575g;

    public /* synthetic */ p(int i8, Object obj) {
        this.f6574f = i8;
        this.f6575g = obj;
    }

    public final void run() {
        int i8 = this.f6574f;
        Object obj = this.f6575g;
        switch (i8) {
            case 0:
                ((t) obj).a();
                return;
            default:
                ((w) ((e0) obj).f6557h).b(new a(4));
                return;
        }
    }
}
