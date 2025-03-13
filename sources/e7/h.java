package e7;

import android.graphics.Color;
import android.util.Log;
import android.util.Pair;
import c0.a;
import com.samsung.android.wearable.watchfacestudio.editor.n;
import e7.i;
import java.util.function.BiFunction;
import o6.k;
import s.g;
import w5.f;

public class h extends p6.b {

    /* renamed from: c  reason: collision with root package name */
    public k f4276c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4277d;
    public BiFunction<f, f, Pair<f, f>> e = new e(1);

    /* renamed from: f  reason: collision with root package name */
    public final int f4278f;

    /* renamed from: g  reason: collision with root package name */
    public c f4279g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a f4280h;

    /* renamed from: i  reason: collision with root package name */
    public final z5.b f4281i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4282j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4283k = true;

    /* renamed from: l  reason: collision with root package name */
    public final g f4284l;

    /* renamed from: m  reason: collision with root package name */
    public final Runnable f4285m;

    public class a implements k {
        public final boolean isEnabled() {
            return true;
        }
    }

    public class b extends f6.a {
        public b(v5.b bVar, z5.b bVar2) {
            super(bVar, bVar2);
        }

        public final void b(f fVar) {
            h hVar = h.this;
            hVar.n(hVar.f4279g.a(hVar.f4280h), fVar);
            if (hVar.f4283k) {
                hVar.f6332b.c();
            } else {
                hVar.f6332b.h(true);
            }
        }
    }

    public class c extends f6.a {
        public c(v5.b bVar, z5.b bVar2) {
            super(bVar, bVar2);
        }

        public final void b(f fVar) {
            h.this.o(fVar);
        }
    }

    public class d extends p6.d {
        public d() {
        }

        public final void b(p6.c cVar) {
            h hVar = h.this;
            hVar.f4279g.j(hVar.f4280h, cVar.f6337f);
            if (!hVar.f4283k) {
                Log.i("DWF:Transform", "onAnimationUpdated in non-resume state for " + hVar.f4280h.getKey() + " (" + cVar.f6337f.d() + ")");
            }
        }
    }

    public h(i.a aVar, z5.b bVar, int i8) {
        this.f4280h = aVar;
        this.f4281i = bVar;
        this.f4278f = i8;
        this.f4284l = i8 == 1 ? new g(this, aVar, 0) : new g(this, aVar, 1);
        boolean z8 = !bVar.f8702d.isEmpty();
        this.f4277d = z8;
        this.f4285m = z8 ? new androidx.activity.b(12, this) : new n(3);
    }

    public void l(v5.b bVar) {
        p6.c cVar = this.f6332b;
        cVar.getClass();
        boolean z8 = !(cVar instanceof p6.k);
        z5.b bVar2 = this.f4281i;
        f6.a bVar3 = z8 ? new b(bVar, bVar2) : new c(bVar, bVar2);
        o(bVar3.f4416b);
        k(new s5.f(bVar3, 8));
    }

    public void m(p6.c cVar) {
        cVar.g(this.f6332b.f6336d);
        this.f6332b = cVar;
        cVar.f6341j.add(new d());
        this.e = cVar.e == 1 ? new e(0) : new f(cVar);
    }

    public final void n(f fVar, f fVar2) {
        f fVar3;
        BiFunction<f, f, Pair<f, f>> biFunction = this.e;
        if (this.f4278f == 2) {
            int i8 = fVar.f8067a;
            if (i8 != fVar2.f8067a) {
                fVar2 = fVar;
            } else {
                int b9 = g.b(i8);
                if (b9 == 0) {
                    fVar3 = new f(fVar.e() + fVar2.e());
                } else if (b9 == 1) {
                    fVar3 = new f(fVar.f() + fVar2.f());
                } else if (b9 == 2) {
                    fVar3 = new f(fVar.d() + fVar2.d());
                } else if (b9 == 3) {
                    fVar3 = new f(fVar.c() + fVar2.c());
                } else if (b9 == 5) {
                    fVar3 = new f(fVar.h() + fVar2.h());
                } else if (b9 != 6) {
                    fVar2 = new f();
                } else {
                    Color b10 = fVar.b();
                    Color b11 = fVar2.b();
                    int i9 = c0.a.f2633a;
                    fVar3 = new f(a.C0030a.a(b10, b11));
                }
                fVar2 = fVar3;
            }
        }
        Pair apply = biFunction.apply(fVar, fVar2);
        this.f6332b.f((f) apply.first, (f) apply.second);
    }

    public final void o(f fVar) {
        this.f4284l.accept(fVar);
    }

    public final void p(boolean z8) {
        boolean z9 = false;
        if ((this.f4282j && this.f4276c.isEnabled()) && z8) {
            z9 = true;
        }
        this.f4283k = z9;
        this.f4285m.run();
        if (this.f4283k) {
            this.f6332b.e();
            return;
        }
        p6.c cVar = this.f6332b;
        if (cVar.f6335c == -1) {
            cVar.b();
        } else {
            cVar.h(true);
        }
    }
}
