package e7;

import e7.i;
import i5.j;
import java.util.ArrayList;
import s5.d;
import s5.q;
import s5.r;
import w5.f;

public final class k extends d implements q, r, c, o6.k {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4291b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4292c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4293d;
    public final o6.k e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4294f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4295g;

    public class a implements c {
        public a() {
        }

        public final f a(i.a aVar) {
            return k.this.a(aVar);
        }

        public final void j(i.a aVar, f fVar) {
        }
    }

    public class b implements o6.k {
        public final boolean isEnabled() {
            return true;
        }
    }

    public k(d dVar) {
        this(dVar, new b());
    }

    public k(d dVar, o6.k kVar) {
        this.f4291b = new ArrayList();
        this.f4292c = new ArrayList();
        this.f4295g = new a();
        this.f4293d = dVar;
        this.e = kVar;
    }

    public final f a(i.a aVar) {
        return this.f4293d.a(aVar);
    }

    public final void d(boolean z8) {
        this.f4294f = z8;
        this.f4292c.forEach(new j(this, z8, 1));
        this.f4291b.forEach(new x6.i(1, z8));
    }

    public final void f(boolean z8) {
        this.f4291b.forEach(new j(this, z8, 0));
    }

    public final boolean isEnabled() {
        return this.e.isEnabled();
    }

    public final void j(i.a aVar, f fVar) {
        this.f4293d.e(aVar, fVar);
    }

    public final void l(h hVar) {
        this.f4291b.add(hVar);
        hVar.f4279g = this;
        hVar.f4276c = this;
    }

    public final void m() {
        this.f7217a.forEach(new j(3));
        this.f4291b.forEach(new j(12));
        this.f4292c.forEach(new j(13));
    }
}
