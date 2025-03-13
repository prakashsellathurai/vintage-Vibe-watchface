package y7;

import c8.i;
import c8.n;
import h7.h;
import j7.f;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.j;
import p7.p;
import q7.k;
import y7.z0;

public class e1 implements z0, m, k1 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8556f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8557g;
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a<T> extends h<T> {

        /* renamed from: n  reason: collision with root package name */
        public final e1 f8558n;

        public a(j7.d<? super T> dVar, e1 e1Var) {
            super(1, dVar);
            this.f8558n = e1Var;
        }

        public final String A() {
            return "AwaitContinuation";
        }

        public final Throwable t(e1 e1Var) {
            Throwable b9;
            Object R = this.f8558n.R();
            return (!(R instanceof c) || (b9 = ((c) R).b()) == null) ? R instanceof q ? ((q) R).f8593a : e1Var.D() : b9;
        }
    }

    public static final class b extends d1 {

        /* renamed from: j  reason: collision with root package name */
        public final e1 f8559j;

        /* renamed from: k  reason: collision with root package name */
        public final c f8560k;

        /* renamed from: l  reason: collision with root package name */
        public final l f8561l;

        /* renamed from: m  reason: collision with root package name */
        public final Object f8562m;

        public b(e1 e1Var, c cVar, l lVar, Object obj) {
            this.f8559j = e1Var;
            this.f8560k = cVar;
            this.f8561l = lVar;
            this.f8562m = obj;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return h.f4787a;
        }

        public final void n(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1.f8556f;
            e1 e1Var = this.f8559j;
            e1Var.getClass();
            l a02 = e1.a0(this.f8561l);
            c cVar = this.f8560k;
            Object obj = this.f8562m;
            if (a02 == null || !e1Var.i0(cVar, a02, obj)) {
                e1Var.r(e1Var.L(cVar, obj));
            }
        }
    }

    public static final class c implements w0 {

        /* renamed from: g  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f8563g;

        /* renamed from: h  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f8564h;

        /* renamed from: i  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f8565i;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting = 0;
        private volatile Object _rootCause;

        /* renamed from: f  reason: collision with root package name */
        public final h1 f8566f;

        static {
            Class<c> cls = c.class;
            f8563g = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
            Class<Object> cls2 = Object.class;
            f8564h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
            f8565i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
        }

        public c(h1 h1Var, Throwable th) {
            this.f8566f = h1Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable b9 = b();
            if (b9 == null) {
                f8564h.set(this, th);
            } else if (th != b9) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8565i;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(this, th);
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        atomicReferenceFieldUpdater.set(this, arrayList);
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable b() {
            return (Throwable) f8564h.get(this);
        }

        public final boolean c() {
            return b() == null;
        }

        public final boolean d() {
            return b() != null;
        }

        public final h1 e() {
            return this.f8566f;
        }

        public final boolean f() {
            return f8563g.get(this) != 0;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8565i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable b9 = b();
            if (b9 != null) {
                arrayList.add(0, b9);
            }
            if (th != null && !k.a(th, b9)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, j.T);
            return arrayList;
        }

        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + f() + ", rootCause=" + b() + ", exceptions=" + f8565i.get(this) + ", list=" + this.f8566f + ']';
        }
    }

    public static final class d extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e1 f8567d;
        public final /* synthetic */ Object e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(i iVar, e1 e1Var, Object obj) {
            super(iVar);
            this.f8567d = e1Var;
            this.e = obj;
        }

        public final Object c(Object obj) {
            i iVar = (i) obj;
            if (this.f8567d.R() == this.e) {
                return null;
            }
            return a1.a.f32l;
        }
    }

    static {
        Class<e1> cls = e1.class;
        Class<Object> cls2 = Object.class;
        f8556f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f8557g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public e1(boolean z8) {
        this._state = z8 ? j.V : j.U;
    }

    public static l a0(i iVar) {
        while (iVar.m()) {
            iVar = iVar.l();
        }
        while (true) {
            iVar = iVar.k();
            if (!iVar.m()) {
                if (iVar instanceof l) {
                    return (l) iVar;
                }
                if (iVar instanceof h1) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof w0 ? ((w0) obj).c() ? "Active" : "New" : obj instanceof q ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.d()) {
            return "Cancelling";
        }
        if (cVar.f()) {
            return "Completing";
        }
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [y7.v0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y7.m0 A(boolean r8, boolean r9, y7.d1 r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof y7.b1
            if (r1 == 0) goto L_0x000b
            r1 = r10
            y7.b1 r1 = (y7.b1) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0015
            y7.y0 r1 = new y7.y0
            r1.<init>(r10)
            goto L_0x0015
        L_0x0014:
            r1 = r10
        L_0x0015:
            r1.f8555i = r7
        L_0x0017:
            java.lang.Object r2 = r7.R()
            boolean r3 = r2 instanceof y7.p0
            if (r3 == 0) goto L_0x005a
            r3 = r2
            y7.p0 r3 = (y7.p0) r3
            boolean r4 = r3.f8591f
            if (r4 == 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f8556f
        L_0x0028:
            boolean r3 = r4.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0037
        L_0x0030:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r2) goto L_0x0028
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x003a:
            y7.h1 r2 = new y7.h1
            r2.<init>()
            boolean r4 = r3.f8591f
            if (r4 == 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            y7.v0 r4 = new y7.v0
            r4.<init>(r2)
            r2 = r4
        L_0x004a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f8556f
            boolean r5 = r4.compareAndSet(r7, r3, r2)
            if (r5 == 0) goto L_0x0053
            goto L_0x0017
        L_0x0053:
            java.lang.Object r4 = r4.get(r7)
            if (r4 == r3) goto L_0x004a
            goto L_0x0017
        L_0x005a:
            boolean r3 = r2 instanceof y7.w0
            if (r3 == 0) goto L_0x00b6
            r3 = r2
            y7.w0 r3 = (y7.w0) r3
            y7.h1 r3 = r3.e()
            if (r3 != 0) goto L_0x0072
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            q7.k.c(r2, r3)
            y7.d1 r2 = (y7.d1) r2
            r7.e0(r2)
            goto L_0x0017
        L_0x0072:
            y7.i1 r4 = y7.i1.f8575f
            if (r8 == 0) goto L_0x00a6
            boolean r5 = r2 instanceof y7.e1.c
            if (r5 == 0) goto L_0x00a6
            monitor-enter(r2)
            r5 = r2
            y7.e1$c r5 = (y7.e1.c) r5     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r5 = r5.b()     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0091
            boolean r6 = r10 instanceof y7.l     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x009f
            r6 = r2
            y7.e1$c r6 = (y7.e1.c) r6     // Catch:{ all -> 0x00a3 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x00a3 }
            if (r6 != 0) goto L_0x009f
        L_0x0091:
            boolean r4 = r7.p(r2, r3, r1)     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x009a
            monitor-exit(r2)
            goto L_0x0017
        L_0x009a:
            if (r5 != 0) goto L_0x009e
            monitor-exit(r2)
            return r1
        L_0x009e:
            r4 = r1
        L_0x009f:
            h7.h r6 = h7.h.f4787a     // Catch:{ all -> 0x00a3 }
            monitor-exit(r2)
            goto L_0x00a7
        L_0x00a3:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x00a6:
            r5 = r0
        L_0x00a7:
            if (r5 == 0) goto L_0x00af
            if (r9 == 0) goto L_0x00ae
            r10.invoke(r5)
        L_0x00ae:
            return r4
        L_0x00af:
            boolean r2 = r7.p(r2, r3, r1)
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x00b6:
            if (r9 == 0) goto L_0x00c7
            boolean r7 = r2 instanceof y7.q
            if (r7 == 0) goto L_0x00bf
            y7.q r2 = (y7.q) r2
            goto L_0x00c0
        L_0x00bf:
            r2 = r0
        L_0x00c0:
            if (r2 == 0) goto L_0x00c4
            java.lang.Throwable r0 = r2.f8593a
        L_0x00c4:
            r10.invoke(r0)
        L_0x00c7:
            y7.i1 r7 = y7.i1.f8575f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.A(boolean, boolean, y7.d1):y7.m0");
    }

    public final CancellationException B() {
        Throwable th;
        Object R = R();
        CancellationException cancellationException = null;
        if (R instanceof c) {
            th = ((c) R).b();
        } else if (R instanceof q) {
            th = ((q) R).f8593a;
        } else if (!(R instanceof w0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + R).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new a1("Parent job is ".concat(g0(R)), th, this) : cancellationException;
    }

    public final boolean C(Throwable th) {
        if (W()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        k kVar = (k) f8557g.get(this);
        return (kVar == null || kVar == i1.f8575f) ? z8 : kVar.h(th) || z8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException D() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.R()
            boolean r1 = r0 instanceof y7.e1.c
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x004c
            y7.e1$c r0 = (y7.e1.c) r0
            java.lang.Throwable r0 = r0.b()
            if (r0 == 0) goto L_0x0036
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = r1.concat(r3)
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0028
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0028:
            if (r2 != 0) goto L_0x0080
            y7.a1 r2 = new y7.a1
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = r4.E()
        L_0x0032:
            r2.<init>(r1, r0, r4)
            goto L_0x0080
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L_0x004c:
            boolean r1 = r0 instanceof y7.w0
            if (r1 != 0) goto L_0x0081
            boolean r1 = r0 instanceof y7.q
            if (r1 == 0) goto L_0x006c
            y7.q r0 = (y7.q) r0
            java.lang.Throwable r0 = r0.f8593a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x005f
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x005f:
            if (r2 != 0) goto L_0x0080
            y7.a1 r1 = new y7.a1
            java.lang.String r2 = r4.E()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0080
        L_0x006c:
            y7.a1 r0 = new y7.a1
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0080:
            return r2
        L_0x0081:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.D():java.util.concurrent.CancellationException");
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && O();
    }

    public final void H(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a1(E(), (Throwable) null, this);
        }
        y(cancellationException);
    }

    public final void J(w0 w0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8557g;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.f();
            atomicReferenceFieldUpdater.set(this, i1.f8575f);
        }
        c1.c cVar = null;
        q qVar = obj instanceof q ? (q) obj : null;
        Throwable th = qVar != null ? qVar.f8593a : null;
        if (w0Var instanceof d1) {
            try {
                ((d1) w0Var).n(th);
            } catch (Throwable th2) {
                T(new c1.c("Exception in completion handler " + w0Var + " for " + this, th2));
            }
        } else {
            h1 e = w0Var.e();
            if (e != null) {
                Object i8 = e.i();
                k.c(i8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                for (i iVar = (i) i8; !k.a(iVar, e); iVar = iVar.k()) {
                    if (iVar instanceof d1) {
                        d1 d1Var = (d1) iVar;
                        try {
                            d1Var.n(th);
                        } catch (Throwable th3) {
                            if (cVar != null) {
                                a1.a.f(cVar, th3);
                            } else {
                                cVar = new c1.c("Exception in completion handler " + d1Var + " for " + this, th3);
                                h hVar = h.f4787a;
                            }
                        }
                    }
                }
                if (cVar != null) {
                    T(cVar);
                }
            }
        }
    }

    public final Throwable K(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new a1(E(), (Throwable) null, this) : th;
        }
        k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((k1) obj).B();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[LOOP:1: B:42:0x0094->B:45:0x009f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(y7.e1.c r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y7.q
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            y7.q r0 = (y7.q) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f8593a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x00a5 }
            java.util.ArrayList r0 = r8.g(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r2 = r7.N(r8, r0)     // Catch:{ all -> 0x00a5 }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x00a5 }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x00a5 }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00a5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a5 }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00a5 }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00a5 }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0035
            a1.a.f(r2, r5)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            y7.q r9 = new y7.q
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0081
            boolean r1 = r7.C(r2)
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.S(r2)
            if (r1 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = r0
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            q7.k.c(r9, r1)
            r1 = r9
            y7.q r1 = (y7.q) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = y7.q.f8592b
            r2.compareAndSet(r1, r0, r3)
        L_0x0081:
            r7.c0(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8556f
            boolean r1 = r9 instanceof y7.w0
            if (r1 == 0) goto L_0x0093
            y7.x0 r1 = new y7.x0
            r2 = r9
            y7.w0 r2 = (y7.w0) r2
            r1.<init>(r2)
            goto L_0x0094
        L_0x0093:
            r1 = r9
        L_0x0094:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x0094
        L_0x00a1:
            r7.J(r8, r9)
            return r9
        L_0x00a5:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.L(y7.e1$c, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable N(y7.e1.c r5, java.util.ArrayList r6) {
        /*
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0017
            y7.a1 r5 = new y7.a1
            java.lang.String r6 = r4.E()
            r5.<init>(r6, r1, r4)
            return r5
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r4 = r6.iterator()
        L_0x001c:
            boolean r5 = r4.hasNext()
            r0 = 1
            if (r5 == 0) goto L_0x0030
            java.lang.Object r5 = r4.next()
            r2 = r5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r5 = r1
        L_0x0031:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L_0x0036
            return r5
        L_0x0036:
            r4 = 0
            java.lang.Object r5 = r6.get(r4)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r2 = r5 instanceof y7.r1
            if (r2 == 0) goto L_0x0063
            java.util.Iterator r6 = r6.iterator()
        L_0x0045:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r6.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == r5) goto L_0x005a
            boolean r3 = r3 instanceof y7.r1
            if (r3 == 0) goto L_0x005a
            r3 = r0
            goto L_0x005b
        L_0x005a:
            r3 = r4
        L_0x005b:
            if (r3 == 0) goto L_0x0045
            r1 = r2
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.N(y7.e1$c, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean O() {
        return true;
    }

    public boolean P() {
        return this instanceof o;
    }

    public final h1 Q(w0 w0Var) {
        h1 e = w0Var.e();
        if (e != null) {
            return e;
        }
        if (w0Var instanceof p0) {
            return new h1();
        }
        if (w0Var instanceof d1) {
            e0((d1) w0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + w0Var).toString());
    }

    public final Object R() {
        while (true) {
            Object obj = f8556f.get(this);
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public boolean S(Throwable th) {
        return false;
    }

    public void T(Throwable th) {
        throw th;
    }

    public final void U(z0 z0Var) {
        i1 i1Var = i1.f8575f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8557g;
        if (z0Var == null) {
            atomicReferenceFieldUpdater.set(this, i1Var);
            return;
        }
        z0Var.start();
        k n8 = z0Var.n(this);
        atomicReferenceFieldUpdater.set(this, n8);
        if (V()) {
            n8.f();
            atomicReferenceFieldUpdater.set(this, i1Var);
        }
    }

    public final boolean V() {
        return !(R() instanceof w0);
    }

    public boolean W() {
        return this instanceof c;
    }

    public final boolean X(Object obj) {
        Object h02;
        do {
            h02 = h0(R(), obj);
            if (h02 == j.P) {
                return false;
            }
            if (h02 == j.Q) {
                return true;
            }
        } while (h02 == j.R);
        r(h02);
        return true;
    }

    public final Object Y(Object obj) {
        Object h02;
        do {
            h02 = h0(R(), obj);
            if (h02 == j.P) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                q qVar = obj instanceof q ? (q) obj : null;
                if (qVar != null) {
                    th = qVar.f8593a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (h02 == j.R);
        return h02;
    }

    public String Z() {
        return getClass().getSimpleName();
    }

    public final void b0(h1 h1Var, Throwable th) {
        Object i8 = h1Var.i();
        k.c(i8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        c1.c cVar = null;
        for (i iVar = (i) i8; !k.a(iVar, h1Var); iVar = iVar.k()) {
            if (iVar instanceof b1) {
                d1 d1Var = (d1) iVar;
                try {
                    d1Var.n(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        a1.a.f(cVar, th2);
                    } else {
                        cVar = new c1.c("Exception in completion handler " + d1Var + " for " + this, th2);
                        h hVar = h.f4787a;
                    }
                }
            }
        }
        if (cVar != null) {
            T(cVar);
        }
        C(th);
    }

    public boolean c() {
        Object R = R();
        return (R instanceof w0) && ((w0) R).c();
    }

    public void c0(Object obj) {
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public void d0() {
    }

    public final void e0(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z8;
        h1 h1Var = new h1();
        d1Var.getClass();
        i.f2853g.lazySet(h1Var, d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f2852f;
        atomicReferenceFieldUpdater2.lazySet(h1Var, d1Var);
        while (true) {
            if (d1Var.i() == d1Var) {
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(d1Var, d1Var, h1Var)) {
                        if (atomicReferenceFieldUpdater2.get(d1Var) != d1Var) {
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
                if (z8) {
                    h1Var.b(d1Var);
                    break;
                }
            } else {
                break;
            }
        }
        i k8 = d1Var.k();
        do {
            atomicReferenceFieldUpdater = f8556f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d1Var, k8) || atomicReferenceFieldUpdater.get(this) != d1Var) {
            }
            atomicReferenceFieldUpdater = f8556f;
            return;
        } while (atomicReferenceFieldUpdater.get(this) != d1Var);
    }

    public final int f0(Object obj) {
        boolean z8 = obj instanceof p0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8556f;
        boolean z9 = false;
        if (z8) {
            if (((p0) obj).f8591f) {
                return 0;
            }
            p0 p0Var = j.V;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                return -1;
            }
            d0();
            return 1;
        } else if (!(obj instanceof v0)) {
            return 0;
        } else {
            h1 h1Var = ((v0) obj).f8619f;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z9 = true;
                    break;
                }
            }
            if (!z9) {
                return -1;
            }
            d0();
            return 1;
        }
    }

    public final f g(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f.c<?> getKey() {
        return z0.b.f8628f;
    }

    public final z0 getParent() {
        k kVar = (k) f8557g.get(this);
        if (kVar != null) {
            return kVar.getParent();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bf, code lost:
        if (r6 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c1, code lost:
        b0(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c6, code lost:
        if ((r9 instanceof y7.l) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c8, code lost:
        r0 = (y7.l) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00cc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cd, code lost:
        if (r0 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cf, code lost:
        r9 = r9.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d3, code lost:
        if (r9 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d5, code lost:
        r4 = a0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00da, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00db, code lost:
        if (r4 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00e1, code lost:
        if (i0(r3, r4, r10) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return L(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return k3.j.Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h0(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof y7.w0
            if (r0 != 0) goto L_0x0007
            h2.d r8 = k3.j.P
            return r8
        L_0x0007:
            boolean r0 = r9 instanceof y7.p0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9 instanceof y7.d1
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r9 instanceof y7.l
            if (r0 != 0) goto L_0x004c
            boolean r0 = r10 instanceof y7.q
            if (r0 != 0) goto L_0x004c
            r0 = r9
            y7.w0 r0 = (y7.w0) r0
            boolean r9 = r10 instanceof y7.w0
            if (r9 == 0) goto L_0x002a
            y7.x0 r9 = new y7.x0
            r3 = r10
            y7.w0 r3 = (y7.w0) r3
            r9.<init>(r3)
            r3 = r9
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f8556f
            boolean r4 = r9.compareAndSet(r8, r0, r3)
            if (r4 == 0) goto L_0x0035
            r9 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r9 = r9.get(r8)
            if (r9 == r0) goto L_0x002b
            r9 = r2
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r8.c0(r10)
            r8.J(r0, r10)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r10
        L_0x0049:
            h2.d r8 = k3.j.R
            return r8
        L_0x004c:
            y7.w0 r9 = (y7.w0) r9
            y7.h1 r0 = r8.Q(r9)
            if (r0 != 0) goto L_0x0058
            h2.d r8 = k3.j.R
            goto L_0x00ea
        L_0x0058:
            boolean r3 = r9 instanceof y7.e1.c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r9
            y7.e1$c r3 = (y7.e1.c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            y7.e1$c r3 = new y7.e1$c
            r3.<init>(r0, r4)
        L_0x0069:
            q7.p r5 = new q7.p
            r5.<init>()
            monitor-enter(r3)
            boolean r6 = r3.f()     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x0078
            h2.d r8 = k3.j.P     // Catch:{ all -> 0x00eb }
            goto L_0x0093
        L_0x0078:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = y7.e1.c.f8563g     // Catch:{ all -> 0x00eb }
            r6.set(r3, r1)     // Catch:{ all -> 0x00eb }
            if (r3 == r9) goto L_0x0095
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f8556f     // Catch:{ all -> 0x00eb }
        L_0x0081:
            boolean r7 = r6.compareAndSet(r8, r9, r3)     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x0089
            r2 = r1
            goto L_0x008f
        L_0x0089:
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x00eb }
            if (r7 == r9) goto L_0x0081
        L_0x008f:
            if (r2 != 0) goto L_0x0095
            h2.d r8 = k3.j.R     // Catch:{ all -> 0x00eb }
        L_0x0093:
            monitor-exit(r3)
            goto L_0x00ea
        L_0x0095:
            boolean r2 = r3.d()     // Catch:{ all -> 0x00eb }
            boolean r6 = r10 instanceof y7.q     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00a1
            r6 = r10
            y7.q r6 = (y7.q) r6     // Catch:{ all -> 0x00eb }
            goto L_0x00a2
        L_0x00a1:
            r6 = r4
        L_0x00a2:
            if (r6 == 0) goto L_0x00a9
            java.lang.Throwable r6 = r6.f8593a     // Catch:{ all -> 0x00eb }
            r3.a(r6)     // Catch:{ all -> 0x00eb }
        L_0x00a9:
            java.lang.Throwable r6 = r3.b()     // Catch:{ all -> 0x00eb }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00eb }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            r5.f6643f = r6     // Catch:{ all -> 0x00eb }
            h7.h r1 = h7.h.f4787a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            if (r6 == 0) goto L_0x00c4
            r8.b0(r0, r6)
        L_0x00c4:
            boolean r0 = r9 instanceof y7.l
            if (r0 == 0) goto L_0x00cc
            r0 = r9
            y7.l r0 = (y7.l) r0
            goto L_0x00cd
        L_0x00cc:
            r0 = r4
        L_0x00cd:
            if (r0 != 0) goto L_0x00da
            y7.h1 r9 = r9.e()
            if (r9 == 0) goto L_0x00db
            y7.l r4 = a0(r9)
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            boolean r9 = r8.i0(r3, r4, r10)
            if (r9 == 0) goto L_0x00e6
            h2.d r8 = k3.j.Q
            goto L_0x00ea
        L_0x00e6:
            java.lang.Object r8 = r8.L(r3, r10)
        L_0x00ea:
            return r8
        L_0x00eb:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.h0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean i0(c cVar, l lVar, Object obj) {
        do {
            if (z0.a.a(lVar.f8579j, false, new b(this, cVar, lVar, obj), 1) != i1.f8575f) {
                return true;
            }
            lVar = a0(lVar);
        } while (lVar != null);
        return false;
    }

    public final k n(e1 e1Var) {
        m0 a9 = z0.a.a(this, true, new l(e1Var), 2);
        k.c(a9, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (k) a9;
    }

    public final boolean p(Object obj, h1 h1Var, d1 d1Var) {
        boolean z8;
        boolean z9;
        d dVar = new d(d1Var, this, obj);
        do {
            i l8 = h1Var.l();
            i.f2853g.lazySet(d1Var, l8);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f2852f;
            atomicReferenceFieldUpdater.lazySet(d1Var, h1Var);
            dVar.f2856c = h1Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(l8, h1Var, dVar)) {
                    if (atomicReferenceFieldUpdater.get(l8) != h1Var) {
                        z8 = false;
                        break;
                    }
                } else {
                    z8 = true;
                    break;
                }
            }
            z9 = !z8 ? false : dVar.a(l8) == null ? true : true;
            if (z9) {
                return true;
            }
        } while (!z9);
        return false;
    }

    public final <R> R q(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return pVar.g(r, this);
    }

    public void r(Object obj) {
    }

    public final Object s(j7.d<Object> dVar) {
        Object R;
        do {
            R = R();
            if (!(R instanceof w0)) {
                if (!(R instanceof q)) {
                    return j.h0(R);
                }
                throw ((q) R).f8593a;
            }
        } while (f0(R) < 0);
        a aVar = new a(a1.a.x(dVar), this);
        aVar.v();
        aVar.b(new n0(0, A(false, true, new l1(aVar))));
        return aVar.u();
    }

    public final boolean start() {
        int f02;
        do {
            f02 = f0(R());
            if (f02 == 0) {
                return false;
            }
        } while (f02 != 1);
        return true;
    }

    public final f t(f fVar) {
        k.e(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Z() + '{' + g0(R()) + '}');
        sb.append('@');
        sb.append(b0.l(this));
        return sb.toString();
    }

    public final void w(e1 e1Var) {
        y(e1Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ca, code lost:
        r10 = k3.j.P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fa, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ca A[EDGE_INSN: B:89:0x00ca->B:66:0x00ca ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(java.lang.Object r10) {
        /*
            r9 = this;
            h2.d r0 = k3.j.P
            boolean r1 = r9.P()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.R()
            boolean r1 = r0 instanceof y7.w0
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof y7.e1.c
            if (r1 == 0) goto L_0x0020
            r1 = r0
            y7.e1$c r1 = (y7.e1.c) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            y7.q r1 = new y7.q
            java.lang.Throwable r4 = r9.K(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.h0(r0, r1)
            h2.d r1 = k3.j.R
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            h2.d r0 = k3.j.P
        L_0x0034:
            h2.d r1 = k3.j.Q
            if (r0 != r1) goto L_0x0039
            return r3
        L_0x0039:
            h2.d r1 = k3.j.P
            if (r0 != r1) goto L_0x00fb
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.R()
            boolean r5 = r4 instanceof y7.e1.c
            if (r5 == 0) goto L_0x0090
            monitor-enter(r4)
            r5 = r4
            y7.e1$c r5 = (y7.e1.c) r5     // Catch:{ all -> 0x008d }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = y7.e1.c.f8565i     // Catch:{ all -> 0x008d }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x008d }
            h2.d r6 = k3.j.T     // Catch:{ all -> 0x008d }
            if (r5 != r6) goto L_0x0057
            r5 = r3
            goto L_0x0058
        L_0x0057:
            r5 = r2
        L_0x0058:
            if (r5 == 0) goto L_0x005f
            h2.d r10 = k3.j.S     // Catch:{ all -> 0x008d }
            monitor-exit(r4)
            goto L_0x00fa
        L_0x005f:
            r5 = r4
            y7.e1$c r5 = (y7.e1.c) r5     // Catch:{ all -> 0x008d }
            boolean r5 = r5.d()     // Catch:{ all -> 0x008d }
            if (r10 != 0) goto L_0x006a
            if (r5 != 0) goto L_0x0076
        L_0x006a:
            if (r1 != 0) goto L_0x0070
            java.lang.Throwable r1 = r9.K(r10)     // Catch:{ all -> 0x008d }
        L_0x0070:
            r10 = r4
            y7.e1$c r10 = (y7.e1.c) r10     // Catch:{ all -> 0x008d }
            r10.a(r1)     // Catch:{ all -> 0x008d }
        L_0x0076:
            r10 = r4
            y7.e1$c r10 = (y7.e1.c) r10     // Catch:{ all -> 0x008d }
            java.lang.Throwable r10 = r10.b()     // Catch:{ all -> 0x008d }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0082
            r0 = r10
        L_0x0082:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x00ca
            y7.e1$c r4 = (y7.e1.c) r4
            y7.h1 r10 = r4.f8566f
            r9.b0(r10, r0)
            goto L_0x00ca
        L_0x008d:
            r9 = move-exception
            monitor-exit(r4)
            throw r9
        L_0x0090:
            boolean r5 = r4 instanceof y7.w0
            if (r5 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x009a
            java.lang.Throwable r1 = r9.K(r10)
        L_0x009a:
            r5 = r4
            y7.w0 r5 = (y7.w0) r5
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00cd
            y7.h1 r6 = r9.Q(r5)
            if (r6 != 0) goto L_0x00aa
            goto L_0x00c2
        L_0x00aa:
            y7.e1$c r7 = new y7.e1$c
            r7.<init>(r6, r1)
        L_0x00af:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f8556f
            boolean r8 = r4.compareAndSet(r9, r5, r7)
            if (r8 == 0) goto L_0x00b9
            r4 = r3
            goto L_0x00c0
        L_0x00b9:
            java.lang.Object r4 = r4.get(r9)
            if (r4 == r5) goto L_0x00af
            r4 = r2
        L_0x00c0:
            if (r4 != 0) goto L_0x00c4
        L_0x00c2:
            r4 = r2
            goto L_0x00c8
        L_0x00c4:
            r9.b0(r6, r1)
            r4 = r3
        L_0x00c8:
            if (r4 == 0) goto L_0x003f
        L_0x00ca:
            h2.d r10 = k3.j.P
            goto L_0x00fa
        L_0x00cd:
            y7.q r5 = new y7.q
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.h0(r4, r5)
            h2.d r6 = k3.j.P
            if (r5 == r6) goto L_0x00e0
            h2.d r4 = k3.j.R
            if (r5 == r4) goto L_0x003f
            r0 = r5
            goto L_0x00fb
        L_0x00e0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00f8:
            h2.d r10 = k3.j.S
        L_0x00fa:
            r0 = r10
        L_0x00fb:
            h2.d r10 = k3.j.P
            if (r0 != r10) goto L_0x0100
            goto L_0x010d
        L_0x0100:
            h2.d r10 = k3.j.Q
            if (r0 != r10) goto L_0x0105
            goto L_0x010d
        L_0x0105:
            h2.d r10 = k3.j.S
            if (r0 != r10) goto L_0x010a
            goto L_0x010e
        L_0x010a:
            r9.r(r0)
        L_0x010d:
            r2 = r3
        L_0x010e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e1.y(java.lang.Object):boolean");
    }
}
