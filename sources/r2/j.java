package r2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.p;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import l3.a;
import l3.d;
import p2.g;
import r2.h;
import r2.m;
import r2.n;
import r2.q;

public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public Thread A;
    public p2.e B;
    public p2.e C;
    public Object D;
    public p2.a E;
    public com.bumptech.glide.load.data.d<?> F;
    public volatile h G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;

    /* renamed from: f  reason: collision with root package name */
    public final i<R> f6786f = new i<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6787g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final d.a f6788h = new d.a();

    /* renamed from: i  reason: collision with root package name */
    public final d f6789i;

    /* renamed from: j  reason: collision with root package name */
    public final i0.d<j<?>> f6790j;

    /* renamed from: k  reason: collision with root package name */
    public final c<?> f6791k = new c<>();

    /* renamed from: l  reason: collision with root package name */
    public final e f6792l = new e();

    /* renamed from: m  reason: collision with root package name */
    public com.bumptech.glide.f f6793m;

    /* renamed from: n  reason: collision with root package name */
    public p2.e f6794n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.h f6795o;

    /* renamed from: p  reason: collision with root package name */
    public p f6796p;

    /* renamed from: q  reason: collision with root package name */
    public int f6797q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public l f6798s;

    /* renamed from: t  reason: collision with root package name */
    public g f6799t;

    /* renamed from: u  reason: collision with root package name */
    public a<R> f6800u;

    /* renamed from: v  reason: collision with root package name */
    public int f6801v;
    public f w;

    /* renamed from: x  reason: collision with root package name */
    public int f6802x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public Object f6803z;

    public interface a<R> {
    }

    public final class b<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final p2.a f6804a;

        public b(p2.a aVar) {
            this.f6804a = aVar;
        }
    }

    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public p2.e f6806a;

        /* renamed from: b  reason: collision with root package name */
        public p2.j<Z> f6807b;

        /* renamed from: c  reason: collision with root package name */
        public u<Z> f6808c;
    }

    public interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6809a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6810b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6811c;

        public final boolean a() {
            return (this.f6811c || this.f6810b) && this.f6809a;
        }
    }

    public enum f {
        f6812f,
        f6813g,
        f6814h,
        f6815i,
        f6816j,
        f6817k;

        /* access modifiers changed from: public */
        f() {
        }
    }

    public j(d dVar, a.c cVar) {
        this.f6789i = dVar;
        this.f6790j = cVar;
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.f6795o.ordinal() - jVar.f6795o.ordinal();
        return ordinal == 0 ? this.f6801v - jVar.f6801v : ordinal;
    }

    public final void e() {
        this.f6802x = 2;
        n nVar = (n) this.f6800u;
        (nVar.f6861s ? nVar.f6857n : nVar.f6862t ? nVar.f6858o : nVar.f6856m).execute(this);
    }

    public final void f(p2.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, p2.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a9 = dVar.a();
        rVar.f6891g = eVar;
        rVar.f6892h = aVar;
        rVar.f6893i = a9;
        this.f6787g.add(rVar);
        if (Thread.currentThread() != this.A) {
            this.f6802x = 2;
            n nVar = (n) this.f6800u;
            (nVar.f6861s ? nVar.f6857n : nVar.f6862t ? nVar.f6858o : nVar.f6856m).execute(this);
            return;
        }
        r();
    }

    public final void g(p2.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, p2.a aVar, p2.e eVar2) {
        this.B = eVar;
        this.D = obj;
        this.F = dVar;
        this.E = aVar;
        this.C = eVar2;
        boolean z8 = false;
        if (eVar != this.f6786f.a().get(0)) {
            z8 = true;
        }
        this.J = z8;
        if (Thread.currentThread() != this.A) {
            this.f6802x = 3;
            n nVar = (n) this.f6800u;
            (nVar.f6861s ? nVar.f6857n : nVar.f6862t ? nVar.f6858o : nVar.f6856m).execute(this);
            return;
        }
        l();
    }

    public final d.a h() {
        return this.f6788h;
    }

    public final <Data> v<R> i(com.bumptech.glide.load.data.d<?> dVar, Data data, p2.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i8 = k3.f.f5137a;
            SystemClock.elapsedRealtimeNanos();
            v<R> j8 = j(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j8.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f6796p);
                Thread.currentThread().getName();
            }
            return j8;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> j(Data data, p2.a aVar) {
        com.bumptech.glide.load.data.e b9;
        t<Data, ?, R> c9 = this.f6786f.c(data.getClass());
        g gVar = this.f6799t;
        boolean z8 = aVar == p2.a.f6297i || this.f6786f.r;
        p2.f fVar = y2.h.f8358j;
        Boolean bool = (Boolean) gVar.c(fVar);
        if (bool == null || (bool.booleanValue() && !z8)) {
            gVar = new g();
            gVar.f6312b.i(this.f6799t.f6312b);
            gVar.f6312b.put(fVar, Boolean.valueOf(z8));
        }
        g gVar2 = gVar;
        com.bumptech.glide.load.data.f fVar2 = this.f6793m.f2922b.e;
        synchronized (fVar2) {
            e.a aVar2 = (e.a) fVar2.f2984a.get(data.getClass());
            if (aVar2 == null) {
                Iterator it = fVar2.f2984a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar3 = (e.a) it.next();
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = com.bumptech.glide.load.data.f.f2983b;
            }
            b9 = aVar2.b(data);
        }
        try {
            return c9.a(this.f6797q, this.r, gVar2, b9, new b(aVar));
        } finally {
            b9.b();
        }
    }

    public final void l() {
        v<R> vVar;
        c<?> cVar;
        boolean a9;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.D + ", cache key: " + this.B + ", fetcher: " + this.F;
            int i8 = k3.f.f5137a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f6796p);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        u uVar = null;
        try {
            vVar = i(this.F, this.D, this.E);
        } catch (r e4) {
            p2.e eVar = this.C;
            p2.a aVar = this.E;
            e4.f6891g = eVar;
            e4.f6892h = aVar;
            e4.f6893i = null;
            this.f6787g.add(e4);
            vVar = null;
        }
        if (vVar != null) {
            p2.a aVar2 = this.E;
            boolean z8 = this.J;
            if (vVar instanceof s) {
                ((s) vVar).a();
            }
            boolean z9 = false;
            if (this.f6791k.f6808c != null) {
                uVar = (u) u.f6900j.b();
                k3.j.l(uVar);
                uVar.f6904i = false;
                uVar.f6903h = true;
                uVar.f6902g = vVar;
                vVar = uVar;
            }
            t();
            n nVar = (n) this.f6800u;
            synchronized (nVar) {
                nVar.f6864v = vVar;
                nVar.w = aVar2;
                nVar.D = z8;
            }
            synchronized (nVar) {
                nVar.f6850g.a();
                if (nVar.C) {
                    nVar.f6864v.d();
                    nVar.f();
                } else if (nVar.f6849f.f6873f.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!nVar.f6865x) {
                    n.c cVar2 = nVar.f6853j;
                    v<?> vVar2 = nVar.f6864v;
                    boolean z10 = nVar.r;
                    p2.e eVar2 = nVar.f6860q;
                    q.a aVar3 = nVar.f6851h;
                    cVar2.getClass();
                    nVar.A = new q(vVar2, z10, true, eVar2, aVar3);
                    nVar.f6865x = true;
                    n.e eVar3 = nVar.f6849f;
                    eVar3.getClass();
                    ArrayList<n.d> arrayList = new ArrayList<>(eVar3.f6873f);
                    nVar.d(arrayList.size() + 1);
                    p2.e eVar4 = nVar.f6860q;
                    q<?> qVar = nVar.A;
                    m mVar = (m) nVar.f6854k;
                    synchronized (mVar) {
                        if (qVar != null) {
                            if (qVar.f6882f) {
                                mVar.f6832g.a(eVar4, qVar);
                            }
                        }
                        p pVar = mVar.f6827a;
                        pVar.getClass();
                        Map map = (Map) (nVar.f6863u ? pVar.f786c : pVar.f785b);
                        if (nVar.equals(map.get(eVar4))) {
                            map.remove(eVar4);
                        }
                    }
                    for (n.d dVar : arrayList) {
                        dVar.f6872b.execute(new n.b(dVar.f6871a));
                    }
                    nVar.c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.w = f.f6816j;
            try {
                cVar = this.f6791k;
                if (cVar.f6808c != null) {
                    z9 = true;
                }
                if (z9) {
                    d dVar2 = this.f6789i;
                    g gVar = this.f6799t;
                    cVar.getClass();
                    ((m.c) dVar2).a().c(cVar.f6806a, new g(cVar.f6807b, cVar.f6808c, gVar));
                    cVar.f6808c.a();
                }
                if (uVar != null) {
                    uVar.a();
                }
                e eVar5 = this.f6792l;
                synchronized (eVar5) {
                    eVar5.f6810b = true;
                    a9 = eVar5.a();
                }
                if (a9) {
                    q();
                }
            } catch (Throwable th) {
                if (uVar != null) {
                    uVar.a();
                }
                throw th;
            }
        } else {
            r();
        }
    }

    public final h n() {
        int ordinal = this.w.ordinal();
        i<R> iVar = this.f6786f;
        if (ordinal == 1) {
            return new w(iVar, this);
        }
        if (ordinal == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (ordinal == 3) {
            return new a0(iVar, this);
        }
        if (ordinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.w);
    }

    public final f o(f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            boolean b9 = this.f6798s.b();
            f fVar2 = f.f6813g;
            return b9 ? fVar2 : o(fVar2);
        } else if (ordinal != 1) {
            f fVar3 = f.f6817k;
            if (ordinal == 2) {
                return this.y ? fVar3 : f.f6815i;
            }
            if (ordinal == 3 || ordinal == 5) {
                return fVar3;
            }
            throw new IllegalArgumentException("Unrecognized stage: " + fVar);
        } else {
            boolean a9 = this.f6798s.a();
            f fVar4 = f.f6814h;
            return a9 ? fVar4 : o(fVar4);
        }
    }

    public final void p() {
        boolean a9;
        t();
        r rVar = new r("Failed to load resource", new ArrayList(this.f6787g));
        n nVar = (n) this.f6800u;
        synchronized (nVar) {
            nVar.y = rVar;
        }
        synchronized (nVar) {
            nVar.f6850g.a();
            if (nVar.C) {
                nVar.f();
            } else if (nVar.f6849f.f6873f.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!nVar.f6866z) {
                nVar.f6866z = true;
                p2.e eVar = nVar.f6860q;
                n.e eVar2 = nVar.f6849f;
                eVar2.getClass();
                ArrayList<n.d> arrayList = new ArrayList<>(eVar2.f6873f);
                nVar.d(arrayList.size() + 1);
                m mVar = (m) nVar.f6854k;
                synchronized (mVar) {
                    p pVar = mVar.f6827a;
                    pVar.getClass();
                    Map map = (Map) (nVar.f6863u ? pVar.f786c : pVar.f785b);
                    if (nVar.equals(map.get(eVar))) {
                        map.remove(eVar);
                    }
                }
                for (n.d dVar : arrayList) {
                    dVar.f6872b.execute(new n.a(dVar.f6871a));
                }
                nVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        e eVar3 = this.f6792l;
        synchronized (eVar3) {
            eVar3.f6811c = true;
            a9 = eVar3.a();
        }
        if (a9) {
            q();
        }
    }

    public final void q() {
        e eVar = this.f6792l;
        synchronized (eVar) {
            eVar.f6810b = false;
            eVar.f6809a = false;
            eVar.f6811c = false;
        }
        c<?> cVar = this.f6791k;
        cVar.f6806a = null;
        cVar.f6807b = null;
        cVar.f6808c = null;
        i<R> iVar = this.f6786f;
        iVar.f6772c = null;
        iVar.f6773d = null;
        iVar.f6782n = null;
        iVar.f6775g = null;
        iVar.f6779k = null;
        iVar.f6777i = null;
        iVar.f6783o = null;
        iVar.f6778j = null;
        iVar.f6784p = null;
        iVar.f6770a.clear();
        iVar.f6780l = false;
        iVar.f6771b.clear();
        iVar.f6781m = false;
        this.H = false;
        this.f6793m = null;
        this.f6794n = null;
        this.f6799t = null;
        this.f6795o = null;
        this.f6796p = null;
        this.f6800u = null;
        this.w = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.I = false;
        this.f6803z = null;
        this.f6787g.clear();
        this.f6790j.a(this);
    }

    public final void r() {
        this.A = Thread.currentThread();
        int i8 = k3.f.f5137a;
        SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        while (!this.I && this.G != null && !(z8 = this.G.a())) {
            this.w = o(this.w);
            this.G = n();
            if (this.w == f.f6815i) {
                e();
                return;
            }
        }
        if ((this.w == f.f6817k || this.I) && !z8) {
            p();
        }
    }

    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.F;
        try {
            if (this.I) {
                p();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            s();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e4) {
            throw e4;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }

    public final void s() {
        int b9 = s.g.b(this.f6802x);
        if (b9 == 0) {
            this.w = o(f.f6812f);
            this.G = n();
        } else if (b9 != 1) {
            if (b9 == 2) {
                l();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(b6.a.r(this.f6802x)));
        }
        r();
    }

    public final void t() {
        Throwable th;
        this.f6788h.a();
        if (this.H) {
            if (this.f6787g.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f6787g;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.H = true;
    }
}
