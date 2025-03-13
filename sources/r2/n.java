package r2;

import androidx.appcompat.widget.p;
import g3.g;
import g3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l3.a;
import l3.d;
import r2.j;
import r2.q;

public final class n<R> implements j.a<R>, a.d {
    public static final c E = new c();
    public q<?> A;
    public j<R> B;
    public volatile boolean C;
    public boolean D;

    /* renamed from: f  reason: collision with root package name */
    public final e f6849f;

    /* renamed from: g  reason: collision with root package name */
    public final d.a f6850g;

    /* renamed from: h  reason: collision with root package name */
    public final q.a f6851h;

    /* renamed from: i  reason: collision with root package name */
    public final i0.d<n<?>> f6852i;

    /* renamed from: j  reason: collision with root package name */
    public final c f6853j;

    /* renamed from: k  reason: collision with root package name */
    public final o f6854k;

    /* renamed from: l  reason: collision with root package name */
    public final u2.a f6855l;

    /* renamed from: m  reason: collision with root package name */
    public final u2.a f6856m;

    /* renamed from: n  reason: collision with root package name */
    public final u2.a f6857n;

    /* renamed from: o  reason: collision with root package name */
    public final u2.a f6858o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicInteger f6859p;

    /* renamed from: q  reason: collision with root package name */
    public p2.e f6860q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6861s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6862t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6863u;

    /* renamed from: v  reason: collision with root package name */
    public v<?> f6864v;
    public p2.a w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6865x;
    public r y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6866z;

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final g f6867f;

        public a(g gVar) {
            this.f6867f = gVar;
        }

        public final void run() {
            h hVar = (h) this.f6867f;
            hVar.f4575a.a();
            synchronized (hVar.f4576b) {
                synchronized (n.this) {
                    e eVar = n.this.f6849f;
                    g gVar = this.f6867f;
                    eVar.getClass();
                    if (eVar.f6873f.contains(new d(gVar, k3.e.f5136b))) {
                        n nVar = n.this;
                        g gVar2 = this.f6867f;
                        nVar.getClass();
                        try {
                            ((h) gVar2).k(nVar.y, 5);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final g f6869f;

        public b(g gVar) {
            this.f6869f = gVar;
        }

        public final void run() {
            h hVar = (h) this.f6869f;
            hVar.f4575a.a();
            synchronized (hVar.f4576b) {
                synchronized (n.this) {
                    e eVar = n.this.f6849f;
                    g gVar = this.f6869f;
                    eVar.getClass();
                    if (eVar.f6873f.contains(new d(gVar, k3.e.f5136b))) {
                        n.this.A.a();
                        n nVar = n.this;
                        g gVar2 = this.f6869f;
                        nVar.getClass();
                        try {
                            ((h) gVar2).m(nVar.A, nVar.w, nVar.D);
                            n.this.g(this.f6869f);
                        } catch (Throwable th) {
                            throw new d(th);
                        }
                    }
                    n.this.c();
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final g f6871a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f6872b;

        public d(g gVar, Executor executor) {
            this.f6871a = gVar;
            this.f6872b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f6871a.equals(((d) obj).f6871a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6871a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: f  reason: collision with root package name */
        public final List<d> f6873f;

        public e(ArrayList arrayList) {
            this.f6873f = arrayList;
        }

        public final Iterator<d> iterator() {
            return this.f6873f.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(u2.a aVar, u2.a aVar2, u2.a aVar3, u2.a aVar4, o oVar, q.a aVar5, a.c cVar) {
        c cVar2 = E;
        this.f6849f = new e(new ArrayList(2));
        this.f6850g = new d.a();
        this.f6859p = new AtomicInteger();
        this.f6855l = aVar;
        this.f6856m = aVar2;
        this.f6857n = aVar3;
        this.f6858o = aVar4;
        this.f6854k = oVar;
        this.f6851h = aVar5;
        this.f6852i = cVar;
        this.f6853j = cVar2;
    }

    public final synchronized void a(g gVar, Executor executor) {
        Runnable runnable;
        this.f6850g.a();
        e eVar = this.f6849f;
        eVar.getClass();
        eVar.f6873f.add(new d(gVar, executor));
        boolean z8 = true;
        if (this.f6865x) {
            d(1);
            runnable = new b(gVar);
        } else if (this.f6866z) {
            d(1);
            runnable = new a(gVar);
        } else {
            if (this.C) {
                z8 = false;
            }
            k3.j.j("Cannot add callbacks to a cancelled EngineJob", z8);
        }
        executor.execute(runnable);
    }

    public final void b() {
        if (!e()) {
            this.C = true;
            j<R> jVar = this.B;
            jVar.I = true;
            h hVar = jVar.G;
            if (hVar != null) {
                hVar.cancel();
            }
            o oVar = this.f6854k;
            p2.e eVar = this.f6860q;
            m mVar = (m) oVar;
            synchronized (mVar) {
                p pVar = mVar.f6827a;
                pVar.getClass();
                Map map = (Map) (this.f6863u ? pVar.f786c : pVar.f785b);
                if (equals(map.get(eVar))) {
                    map.remove(eVar);
                }
            }
        }
    }

    public final void c() {
        q<?> qVar;
        synchronized (this) {
            this.f6850g.a();
            k3.j.j("Not yet complete!", e());
            int decrementAndGet = this.f6859p.decrementAndGet();
            k3.j.j("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                qVar = this.A;
                f();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public final synchronized void d(int i8) {
        q<?> qVar;
        k3.j.j("Not yet complete!", e());
        if (this.f6859p.getAndAdd(i8) == 0 && (qVar = this.A) != null) {
            qVar.a();
        }
    }

    public final boolean e() {
        return this.f6866z || this.f6865x || this.C;
    }

    public final synchronized void f() {
        boolean a9;
        if (this.f6860q != null) {
            this.f6849f.f6873f.clear();
            this.f6860q = null;
            this.A = null;
            this.f6864v = null;
            this.f6866z = false;
            this.C = false;
            this.f6865x = false;
            this.D = false;
            j<R> jVar = this.B;
            j.e eVar = jVar.f6792l;
            synchronized (eVar) {
                eVar.f6809a = true;
                a9 = eVar.a();
            }
            if (a9) {
                jVar.q();
            }
            this.B = null;
            this.y = null;
            this.w = null;
            this.f6852i.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void g(g gVar) {
        boolean z8;
        this.f6850g.a();
        e eVar = this.f6849f;
        eVar.f6873f.remove(new d(gVar, k3.e.f5136b));
        if (this.f6849f.f6873f.isEmpty()) {
            b();
            if (!this.f6865x) {
                if (!this.f6866z) {
                    z8 = false;
                    if (z8 && this.f6859p.get() == 0) {
                        f();
                    }
                }
            }
            z8 = true;
            f();
        }
    }

    public final d.a h() {
        return this.f6850g;
    }
}
