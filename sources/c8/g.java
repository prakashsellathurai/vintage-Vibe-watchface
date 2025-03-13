package c8;

import d8.k;
import j7.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y7.d0;
import y7.g0;
import y7.h;
import y7.m0;
import y7.w;
import y7.y;

public final class g extends w implements g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2844m = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");

    /* renamed from: h  reason: collision with root package name */
    public final w f2845h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2846i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0 f2847j;

    /* renamed from: k  reason: collision with root package name */
    public final j<Runnable> f2848k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f2849l;
    private volatile int runningWorkers;

    public final class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public Runnable f2850f;

        public a(Runnable runnable) {
            this.f2850f = runnable;
        }

        public final void run() {
            int i8 = 0;
            while (true) {
                try {
                    this.f2850f.run();
                } catch (Throwable th) {
                    y.a(j7.g.f5052f, th);
                }
                g gVar = g.this;
                Runnable P = gVar.P();
                if (P != null) {
                    this.f2850f = P;
                    i8++;
                    if (i8 >= 16) {
                        w wVar = gVar.f2845h;
                        if (wVar.O()) {
                            wVar.N(gVar, this);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public g(k kVar, int i8) {
        this.f2845h = kVar;
        this.f2846i = i8;
        g0 g0Var = kVar instanceof g0 ? (g0) kVar : null;
        this.f2847j = g0Var == null ? d0.f8554a : g0Var;
        this.f2848k = new j<>();
        this.f2849l = new Object();
    }

    public final void N(f fVar, Runnable runnable) {
        boolean z8;
        Runnable P;
        this.f2848k.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2844m;
        if (atomicIntegerFieldUpdater.get(this) < this.f2846i) {
            synchronized (this.f2849l) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f2846i) {
                    z8 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z8 = true;
                }
            }
            if (z8 && (P = P()) != null) {
                this.f2845h.N(this, new a(P));
            }
        }
    }

    public final Runnable P() {
        while (true) {
            Runnable d9 = this.f2848k.d();
            if (d9 != null) {
                return d9;
            }
            synchronized (this.f2849l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2844m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2848k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final void a(long j8, h hVar) {
        this.f2847j.a(j8, hVar);
    }

    public final m0 s(long j8, Runnable runnable, f fVar) {
        return this.f2847j.s(j8, runnable, fVar);
    }
}
