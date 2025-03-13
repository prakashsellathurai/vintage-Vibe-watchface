package r2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.p;
import com.bumptech.glide.f;
import g3.g;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.g;
import l3.a;
import p2.k;
import r2.c;
import r2.j;
import r2.q;
import t2.a;
import t2.e;
import t2.h;
import y7.b0;

public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f6826h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final p f6827a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f6828b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6829c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6830d;
    public final y e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6831f;

    /* renamed from: g  reason: collision with root package name */
    public final c f6832g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f6833a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f6834b = l3.a.a(150, new C0118a());

        /* renamed from: c  reason: collision with root package name */
        public int f6835c;

        /* renamed from: r2.m$a$a  reason: collision with other inner class name */
        public class C0118a implements a.b<j<?>> {
            public C0118a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f6833a, aVar.f6834b);
            }
        }

        public a(c cVar) {
            this.f6833a = cVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final u2.a f6837a;

        /* renamed from: b  reason: collision with root package name */
        public final u2.a f6838b;

        /* renamed from: c  reason: collision with root package name */
        public final u2.a f6839c;

        /* renamed from: d  reason: collision with root package name */
        public final u2.a f6840d;
        public final o e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f6841f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f6842g = l3.a.a(150, new a());

        public class a implements a.b<n<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new n(bVar.f6837a, bVar.f6838b, bVar.f6839c, bVar.f6840d, bVar.e, bVar.f6841f, bVar.f6842g);
            }
        }

        public b(u2.a aVar, u2.a aVar2, u2.a aVar3, u2.a aVar4, o oVar, q.a aVar5) {
            this.f6837a = aVar;
            this.f6838b = aVar2;
            this.f6839c = aVar3;
            this.f6840d = aVar4;
            this.e = oVar;
            this.f6841f = aVar5;
        }
    }

    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0123a f6844a;

        /* renamed from: b  reason: collision with root package name */
        public volatile t2.a f6845b;

        public c(a.C0123a aVar) {
            this.f6844a = aVar;
        }

        public final t2.a a() {
            if (this.f6845b == null) {
                synchronized (this) {
                    if (this.f6845b == null) {
                        t2.c cVar = (t2.c) this.f6844a;
                        e eVar = (e) cVar.f7470b;
                        File cacheDir = eVar.f7475a.getCacheDir();
                        t2.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f7476b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new t2.d(cacheDir, cVar.f7469a);
                            }
                        }
                        this.f6845b = dVar;
                    }
                    if (this.f6845b == null) {
                        this.f6845b = new k3.j();
                    }
                }
            }
            return this.f6845b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f6846a;

        /* renamed from: b  reason: collision with root package name */
        public final g f6847b;

        public d(g gVar, n<?> nVar) {
            this.f6847b = gVar;
            this.f6846a = nVar;
        }
    }

    public m(h hVar, a.C0123a aVar, u2.a aVar2, u2.a aVar3, u2.a aVar4, u2.a aVar5) {
        this.f6829c = hVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.f6832g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f6752d = this;
            }
        }
        this.f6828b = new b0(5);
        this.f6827a = new p(3);
        this.f6830d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f6831f = new a(cVar);
        this.e = new y();
        ((t2.g) hVar).f7477d = this;
    }

    public static void d(v vVar) {
        if (vVar instanceof q) {
            ((q) vVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void a(p2.e eVar, q<?> qVar) {
        c cVar = this.f6832g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f6750b.remove(eVar);
            if (aVar != null) {
                aVar.f6755c = null;
                aVar.clear();
            }
        }
        if (qVar.f6882f) {
            v vVar = (v) ((t2.g) this.f6829c).d(eVar, qVar);
        } else {
            this.e.a(qVar, false);
        }
    }

    public final <R> d b(f fVar, Object obj, p2.e eVar, int i8, int i9, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, l lVar, Map<Class<?>, k<?>> map, boolean z8, boolean z9, p2.g gVar, boolean z10, boolean z11, boolean z12, boolean z13, g gVar2, Executor executor) {
        long j8;
        if (f6826h) {
            int i10 = k3.f.f5137a;
            j8 = SystemClock.elapsedRealtimeNanos();
        } else {
            j8 = 0;
        }
        long j9 = j8;
        this.f6828b.getClass();
        p pVar = new p(obj, eVar, i8, i9, map, cls, cls2, gVar);
        synchronized (this) {
            q<?> c9 = c(pVar, z10, j9);
            if (c9 == null) {
                d e4 = e(fVar, obj, eVar, i8, i9, cls, cls2, hVar, lVar, map, z8, z9, gVar, z10, z11, z12, z13, gVar2, executor, pVar, j9);
                return e4;
            }
            ((g3.h) gVar2).m(c9, p2.a.f6298j, false);
            return null;
        }
    }

    public final q<?> c(p pVar, boolean z8, long j8) {
        q<?> qVar;
        Y y;
        if (!z8) {
            return null;
        }
        c cVar = this.f6832g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f6750b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = (q) aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f6826h) {
                int i8 = k3.f.f5137a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return qVar;
        }
        t2.g gVar = (t2.g) this.f6829c;
        synchronized (gVar) {
            g.a aVar2 = (g.a) gVar.f5138a.remove(pVar);
            if (aVar2 == null) {
                y = null;
            } else {
                gVar.f5140c -= (long) aVar2.f5142b;
                y = aVar2.f5141a;
            }
        }
        v vVar = (v) y;
        q<?> qVar2 = vVar == null ? null : vVar instanceof q ? (q) vVar : new q<>(vVar, true, true, pVar, this);
        if (qVar2 != null) {
            qVar2.a();
            this.f6832g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f6826h) {
            int i9 = k3.f.f5137a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return qVar2;
    }

    public final <R> d e(f fVar, Object obj, p2.e eVar, int i8, int i9, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, l lVar, Map<Class<?>, k<?>> map, boolean z8, boolean z9, p2.g gVar, boolean z10, boolean z11, boolean z12, boolean z13, g3.g gVar2, Executor executor, p pVar, long j8) {
        f fVar2 = fVar;
        Object obj2 = obj;
        p2.e eVar2 = eVar;
        int i10 = i8;
        int i11 = i9;
        com.bumptech.glide.h hVar2 = hVar;
        l lVar2 = lVar;
        p2.g gVar3 = gVar;
        boolean z14 = z13;
        g3.g gVar4 = gVar2;
        Executor executor2 = executor;
        p pVar2 = pVar;
        p pVar3 = this.f6827a;
        n nVar = (n) ((Map) (z14 ? pVar3.f786c : pVar3.f785b)).get(pVar2);
        if (nVar != null) {
            nVar.a(gVar4, executor2);
            if (f6826h) {
                int i12 = k3.f.f5137a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return new d(gVar4, nVar);
        }
        n nVar2 = (n) this.f6830d.f6842g.b();
        k3.j.l(nVar2);
        synchronized (nVar2) {
            nVar2.f6860q = pVar2;
            nVar2.r = z10;
            nVar2.f6861s = z11;
            nVar2.f6862t = z12;
            nVar2.f6863u = z14;
        }
        a aVar = this.f6831f;
        j<R> jVar = (j) aVar.f6834b.b();
        k3.j.l(jVar);
        int i13 = aVar.f6835c;
        aVar.f6835c = i13 + 1;
        i<R> iVar = jVar.f6786f;
        iVar.f6772c = fVar2;
        iVar.f6773d = obj2;
        iVar.f6782n = eVar2;
        iVar.e = i10;
        iVar.f6774f = i11;
        iVar.f6784p = lVar2;
        iVar.f6775g = cls;
        iVar.f6776h = jVar.f6789i;
        iVar.f6779k = cls2;
        iVar.f6783o = hVar2;
        iVar.f6777i = gVar3;
        iVar.f6778j = map;
        iVar.f6785q = z8;
        iVar.r = z9;
        jVar.f6793m = fVar2;
        jVar.f6794n = eVar2;
        jVar.f6795o = hVar2;
        jVar.f6796p = pVar2;
        jVar.f6797q = i10;
        jVar.r = i11;
        jVar.f6798s = lVar2;
        jVar.y = z14;
        jVar.f6799t = gVar3;
        jVar.f6800u = nVar2;
        jVar.f6801v = i13;
        boolean z15 = true;
        jVar.f6802x = 1;
        jVar.f6803z = obj2;
        p pVar4 = this.f6827a;
        pVar4.getClass();
        ((Map) (nVar2.f6863u ? pVar4.f786c : pVar4.f785b)).put(pVar2, nVar2);
        g3.g gVar5 = gVar2;
        nVar2.a(gVar5, executor);
        synchronized (nVar2) {
            nVar2.B = jVar;
            j.f o8 = jVar.o(j.f.f6812f);
            if (o8 != j.f.f6813g) {
                if (o8 != j.f.f6814h) {
                    z15 = false;
                }
            }
            (z15 ? nVar2.f6855l : nVar2.f6861s ? nVar2.f6857n : nVar2.f6862t ? nVar2.f6858o : nVar2.f6856m).execute(jVar);
        }
        if (f6826h) {
            int i14 = k3.f.f5137a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return new d(gVar5, nVar2);
    }
}
