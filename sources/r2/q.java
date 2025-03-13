package r2;

import k3.j;
import p2.e;

public final class q<Z> implements v<Z> {

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6882f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6883g;

    /* renamed from: h  reason: collision with root package name */
    public final v<Z> f6884h;

    /* renamed from: i  reason: collision with root package name */
    public final a f6885i;

    /* renamed from: j  reason: collision with root package name */
    public final e f6886j;

    /* renamed from: k  reason: collision with root package name */
    public int f6887k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6888l;

    public interface a {
        void a(e eVar, q<?> qVar);
    }

    public q(v<Z> vVar, boolean z8, boolean z9, e eVar, a aVar) {
        j.l(vVar);
        this.f6884h = vVar;
        this.f6882f = z8;
        this.f6883g = z9;
        this.f6886j = eVar;
        j.l(aVar);
        this.f6885i = aVar;
    }

    public final synchronized void a() {
        if (!this.f6888l) {
            this.f6887k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final int b() {
        return this.f6884h.b();
    }

    public final Class<Z> c() {
        return this.f6884h.c();
    }

    public final synchronized void d() {
        if (this.f6887k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f6888l) {
            this.f6888l = true;
            if (this.f6883g) {
                this.f6884h.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void e() {
        boolean z8;
        synchronized (this) {
            int i8 = this.f6887k;
            if (i8 > 0) {
                z8 = true;
                int i9 = i8 - 1;
                this.f6887k = i9;
                if (i9 != 0) {
                    z8 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z8) {
            this.f6885i.a(this.f6886j, this);
        }
    }

    public final Z get() {
        return this.f6884h.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6882f + ", listener=" + this.f6885i + ", key=" + this.f6886j + ", acquired=" + this.f6887k + ", isRecycled=" + this.f6888l + ", resource=" + this.f6884h + '}';
    }
}
