package r2;

import l3.a;
import l3.d;

public final class u<Z> implements v<Z>, a.d {

    /* renamed from: j  reason: collision with root package name */
    public static final a.c f6900j = l3.a.a(20, new a());

    /* renamed from: f  reason: collision with root package name */
    public final d.a f6901f = new d.a();

    /* renamed from: g  reason: collision with root package name */
    public v<Z> f6902g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6903h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6904i;

    public class a implements a.b<u<?>> {
        public final Object a() {
            return new u();
        }
    }

    public final synchronized void a() {
        this.f6901f.a();
        if (this.f6903h) {
            this.f6903h = false;
            if (this.f6904i) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final int b() {
        return this.f6902g.b();
    }

    public final Class<Z> c() {
        return this.f6902g.c();
    }

    public final synchronized void d() {
        this.f6901f.a();
        this.f6904i = true;
        if (!this.f6903h) {
            this.f6902g.d();
            this.f6902g = null;
            f6900j.a(this);
        }
    }

    public final Z get() {
        return this.f6902g.get();
    }

    public final d.a h() {
        return this.f6901f;
    }
}
