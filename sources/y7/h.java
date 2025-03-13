package y7;

import a1.a;
import c1.c;
import c8.r;
import h7.e;
import j7.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.j;
import l7.d;
import p7.l;
import q7.k;
import y7.z0;

public class h<T> extends k0<T> implements g<T>, d {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8569k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8570l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8571m;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = b.f8546f;

    /* renamed from: i  reason: collision with root package name */
    public final j7.d<T> f8572i;

    /* renamed from: j  reason: collision with root package name */
    public final f f8573j;

    static {
        Class<h> cls = h.class;
        f8569k = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f8570l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f8571m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public h(int i8, j7.d dVar) {
        super(i8);
        this.f8572i = dVar;
        this.f8573j = dVar.a();
    }

    public static Object D(j1 j1Var, Object obj, int i8, l lVar) {
        if (obj instanceof q) {
            return obj;
        }
        boolean z8 = true;
        if (!(i8 == 1 || i8 == 2)) {
            z8 = false;
        }
        if (!z8) {
            return obj;
        }
        if (lVar == null && !(j1Var instanceof e)) {
            return obj;
        }
        return new p(obj, j1Var instanceof e ? (e) j1Var : null, lVar, (CancellationException) null, 16);
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        j7.d<T> dVar = this.f8572i;
        Throwable th = null;
        c8.f fVar = dVar instanceof c8.f ? (c8.f) dVar : null;
        if (fVar != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c8.f.f2839m;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                h2.d dVar2 = a.f30k;
                boolean z8 = false;
                if (obj == dVar2) {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(fVar, dVar2, this)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != dVar2) {
                                continue;
                                break;
                            }
                        } else {
                            z8 = true;
                            continue;
                            break;
                        }
                    }
                    if (z8) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                break;
                            }
                        } else {
                            z8 = true;
                            break;
                        }
                    }
                    if (z8) {
                        th = obj;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                r();
                q(th);
            }
        }
    }

    public final void C(Object obj, int i8, l<? super Throwable, h7.h> lVar) {
        boolean z8;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8570l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z8 = false;
            if (obj2 instanceof j1) {
                Object D = D((j1) obj2, obj, i8, lVar);
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z8 = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof i) {
                    i iVar = (i) obj2;
                    iVar.getClass();
                    if (i.f8574c.compareAndSet(iVar, 0, 1)) {
                        if (lVar != null) {
                            o(lVar, iVar.f8593a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z8);
        if (!y()) {
            r();
        }
        s(i8);
    }

    public final f a() {
        return this.f8573j;
    }

    public final void b(l<? super Throwable, h7.h> lVar) {
        x(lVar instanceof e ? (e) lVar : new n0(1, lVar));
    }

    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8570l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof j1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof q)) {
                boolean z8 = true;
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (!(pVar.e != null)) {
                        p a9 = p.a(pVar, (e) null, cancellationException, 15);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z8 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z8) {
                            e eVar = pVar.f8588b;
                            if (eVar != null) {
                                n(eVar, cancellationException);
                            }
                            l<Throwable, h7.h> lVar = pVar.f8589c;
                            if (lVar != null) {
                                o(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    p pVar2 = new p(obj2, (e) null, (l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z8 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z8) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final j7.d<T> d() {
        return this.f8572i;
    }

    public final d e() {
        j7.d<T> dVar = this.f8572i;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final Throwable f(Object obj) {
        Throwable f9 = super.f(obj);
        if (f9 != null) {
            return f9;
        }
        return null;
    }

    public final <T> T g(Object obj) {
        return obj instanceof p ? ((p) obj).f8587a : obj;
    }

    public final void i(Object obj) {
        Throwable a9 = e.a(obj);
        if (a9 != null) {
            obj = new q(a9, false);
        }
        C(obj, this.f8578h, (l<? super Throwable, h7.h>) null);
    }

    public final Object j() {
        return f8570l.get(this);
    }

    public final Object k(Object obj, l lVar) {
        h2.d dVar;
        boolean z8;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8570l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj2 instanceof j1;
            dVar = j.M;
            if (z9) {
                Object D = D((j1) obj2, obj, this.f8578h, lVar);
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z8 = false;
                            continue;
                            break;
                        }
                    } else {
                        z8 = true;
                        continue;
                        break;
                    }
                }
            } else {
                boolean z10 = obj2 instanceof p;
                return null;
            }
        } while (!z8);
        if (y()) {
            return dVar;
        }
        r();
        return dVar;
    }

    public final void l(w wVar, T t8) {
        j7.d<T> dVar = this.f8572i;
        c8.f fVar = dVar instanceof c8.f ? (c8.f) dVar : null;
        C(t8, (fVar != null ? fVar.f2840i : null) == wVar ? 4 : this.f8578h, (l<? super Throwable, h7.h>) null);
    }

    public final void m(Object obj) {
        s(this.f8578h);
    }

    public final void n(e eVar, Throwable th) {
        try {
            eVar.a(th);
        } catch (Throwable th2) {
            y.a(this.f8573j, new c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(l<? super Throwable, h7.h> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            y.a(this.f8573j, new c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p(r<?> rVar, Throwable th) {
        int i8 = f8569k.get(this) & 536870911;
        if (i8 != 536870911) {
            try {
                rVar.e(i8);
            } catch (Throwable th2) {
                y.a(this.f8573j, new c("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public final void q(Throwable th) {
        Object obj;
        boolean z8;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8570l;
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof j1) {
                z8 = false;
                i iVar = new i(this, th, (obj instanceof e) || (obj instanceof r));
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z8 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z8);
        j1 j1Var = (j1) obj;
        if (j1Var instanceof e) {
            n((e) obj, th);
        } else if (j1Var instanceof r) {
            p((r) obj, th);
        }
        if (!y()) {
            r();
        }
        s(this.f8578h);
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8571m;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var != null) {
            m0Var.f();
            atomicReferenceFieldUpdater.set(this, i1.f8575f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(int r10) {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8569k
            int r1 = r0.get(r9)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001c
            if (r2 != r3) goto L_0x0010
            r0 = r4
            goto L_0x002a
        L_0x0010:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Already resumed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x001c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 == 0) goto L_0x0000
            r0 = r3
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            return
        L_0x002d:
            r0 = 4
            if (r10 != r0) goto L_0x0032
            r0 = r3
            goto L_0x0033
        L_0x0032:
            r0 = r4
        L_0x0033:
            j7.d<T> r1 = r9.f8572i
            if (r0 != 0) goto L_0x009f
            boolean r2 = r1 instanceof c8.f
            if (r2 == 0) goto L_0x009f
            r2 = 2
            if (r10 == r3) goto L_0x0043
            if (r10 != r2) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r10 = r4
            goto L_0x0044
        L_0x0043:
            r10 = r3
        L_0x0044:
            int r5 = r9.f8578h
            if (r5 == r3) goto L_0x004d
            if (r5 != r2) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r4
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            if (r10 != r2) goto L_0x009f
            r10 = r1
            c8.f r10 = (c8.f) r10
            y7.w r10 = r10.f2840i
            j7.f r0 = r1.a()
            boolean r2 = r10.O()
            if (r2 == 0) goto L_0x0063
            r10.N(r0, r9)
            goto L_0x00a2
        L_0x0063:
            y7.q0 r10 = y7.q1.a()
            long r5 = r10.f8595h
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            r4 = r3
        L_0x0073:
            if (r4 == 0) goto L_0x0084
            i7.c<y7.k0<?>> r0 = r10.f8597j
            if (r0 != 0) goto L_0x0080
            i7.c r0 = new i7.c
            r0.<init>()
            r10.f8597j = r0
        L_0x0080:
            r0.addLast(r9)
            goto L_0x00a2
        L_0x0084:
            r10.Q(r3)
            k3.j.Y(r9, r1, r3)     // Catch:{ all -> 0x0091 }
        L_0x008a:
            boolean r0 = r10.S()     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008a
            goto L_0x0096
        L_0x0091:
            r0 = move-exception
            r1 = 0
            r9.h(r0, r1)     // Catch:{ all -> 0x009a }
        L_0x0096:
            r10.P(r3)
            goto L_0x00a2
        L_0x009a:
            r9 = move-exception
            r10.P(r3)
            throw r9
        L_0x009f:
            k3.j.Y(r9, r1, r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.h.s(int):void");
    }

    public Throwable t(e1 e1Var) {
        return e1Var.D();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(b0.m(this.f8572i));
        sb.append("){");
        Object obj = f8570l.get(this);
        sb.append(obj instanceof j1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(b0.l(this));
        return sb.toString();
    }

    public final Object u() {
        boolean z8;
        boolean z9;
        boolean y = y();
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8569k;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            z8 = false;
            if (i9 == 0) {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, (536870911 & i8) + 536870912)) {
                    z9 = true;
                    break;
                }
            } else if (i9 == 2) {
                z9 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z9) {
            if (((m0) f8571m.get(this)) == null) {
                w();
            }
            if (y) {
                B();
            }
            return k7.a.f5217f;
        }
        if (y) {
            B();
        }
        Object obj = f8570l.get(this);
        if (!(obj instanceof q)) {
            int i10 = this.f8578h;
            if (i10 == 1 || i10 == 2) {
                z8 = true;
            }
            if (z8) {
                z0 z0Var = (z0) this.f8573j.d(z0.b.f8628f);
                if (z0Var != null && !z0Var.c()) {
                    CancellationException D = z0Var.D();
                    c(obj, D);
                    throw D;
                }
            }
            return g(obj);
        }
        throw ((q) obj).f8593a;
    }

    public final void v() {
        m0 w = w();
        if (w != null && (!(f8570l.get(this) instanceof j1))) {
            w.f();
            f8571m.set(this, i1.f8575f);
        }
    }

    public final m0 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z0 z0Var = (z0) this.f8573j.d(z0.b.f8628f);
        if (z0Var == null) {
            return null;
        }
        m0 a9 = z0.a.a(z0Var, true, new j(this), 2);
        do {
            atomicReferenceFieldUpdater = f8571m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, a9) || atomicReferenceFieldUpdater.get(this) != null) {
                return a9;
            }
            atomicReferenceFieldUpdater = f8571m;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return a9;
    }

    public final void x(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8570l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z8 = true;
            if (obj2 instanceof b) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z8 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z8) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj2 instanceof e ? true : obj2 instanceof r)) {
                    boolean z9 = obj2 instanceof q;
                    if (z9) {
                        q qVar = (q) obj2;
                        qVar.getClass();
                        if (!q.f8592b.compareAndSet(qVar, 0, 1)) {
                            z(obj, obj2);
                            throw null;
                        } else if (obj2 instanceof i) {
                            if (!z9) {
                                qVar = null;
                            }
                            if (qVar != null) {
                                th = qVar.f8593a;
                            }
                            if (obj instanceof e) {
                                n((e) obj, th);
                                return;
                            }
                            k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            p((r) obj, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj2 instanceof p) {
                        p pVar = (p) obj2;
                        if (pVar.f8588b != null) {
                            z(obj, obj2);
                            throw null;
                        } else if (!(obj instanceof r)) {
                            k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            e eVar = (e) obj;
                            Throwable th2 = pVar.e;
                            if (th2 != null) {
                                n(eVar, th2);
                                return;
                            }
                            p a9 = p.a(pVar, eVar, (CancellationException) null, 29);
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                        z8 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z8) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj instanceof r)) {
                        k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        p pVar2 = new p(obj2, (e) obj, (l) null, (CancellationException) null, 28);
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z8 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z8) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    z(obj, obj2);
                    throw null;
                }
            }
        }
    }

    public final boolean y() {
        if (this.f8578h == 2) {
            j7.d<T> dVar = this.f8572i;
            k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (c8.f.f2839m.get((c8.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
