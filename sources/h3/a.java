package h3;

import g3.c;
import g3.h;
import k3.k;

public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f4748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4749b;

    /* renamed from: c  reason: collision with root package name */
    public c f4750c;

    public a() {
        if (k.g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f4748a = Integer.MIN_VALUE;
            this.f4749b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c(c cVar) {
        this.f4750c = cVar;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f(b bVar) {
        ((h) bVar).n(this.f4748a, this.f4749b);
    }

    public final void g() {
    }

    public final c h() {
        return this.f4750c;
    }

    public final void j() {
    }
}
