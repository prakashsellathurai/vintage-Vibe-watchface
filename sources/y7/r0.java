package y7;

import c8.k;
import c8.u;
import c8.v;
import h7.h;
import j7.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k3.j;
import y7.g0;

public abstract class r0 extends s0 implements g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8601l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8602m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8603n;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public final class a extends c {

        /* renamed from: h  reason: collision with root package name */
        public final g<h> f8604h;

        public a(long j8, h hVar) {
            super(j8);
            this.f8604h = hVar;
        }

        public final void run() {
            this.f8604h.l(r0.this, h.f4787a);
        }

        public final String toString() {
            return super.toString() + this.f8604h;
        }
    }

    public static final class b extends c {

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f8606h;

        public b(Runnable runnable, long j8) {
            super(j8);
            this.f8606h = runnable;
        }

        public final void run() {
            this.f8606h.run();
        }

        public final String toString() {
            return super.toString() + this.f8606h;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, m0, v {
        private volatile Object _heap;

        /* renamed from: f  reason: collision with root package name */
        public long f8607f;

        /* renamed from: g  reason: collision with root package name */
        public int f8608g = -1;

        public c(long j8) {
            this.f8607f = j8;
        }

        public final int compareTo(Object obj) {
            int i8 = ((this.f8607f - ((c) obj).f8607f) > 0 ? 1 : ((this.f8607f - ((c) obj).f8607f) == 0 ? 0 : -1));
            if (i8 > 0) {
                return 1;
            }
            return i8 < 0 ? -1 : 0;
        }

        public final void e(d dVar) {
            if (this._heap != j.N) {
                this._heap = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: c8.u} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5._heap     // Catch:{ all -> 0x0031 }
                h2.d r1 = k3.j.N     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof y7.r0.d     // Catch:{ all -> 0x0031 }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                y7.r0$d r0 = (y7.r0.d) r0     // Catch:{ all -> 0x0031 }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 == 0) goto L_0x002b
                monitor-enter(r0)     // Catch:{ all -> 0x0031 }
                java.lang.Object r2 = r5._heap     // Catch:{ all -> 0x0028 }
                boolean r4 = r2 instanceof c8.u     // Catch:{ all -> 0x0028 }
                if (r4 == 0) goto L_0x001e
                r3 = r2
                c8.u r3 = (c8.u) r3     // Catch:{ all -> 0x0028 }
            L_0x001e:
                if (r3 != 0) goto L_0x0021
                goto L_0x0026
            L_0x0021:
                int r2 = r5.f8608g     // Catch:{ all -> 0x0028 }
                r0.c(r2)     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                goto L_0x002b
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x002b:
                r5._heap = r1     // Catch:{ all -> 0x0031 }
                h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x0031 }
                monitor-exit(r5)
                return
            L_0x0031:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.r0.c.f():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
            if ((r9 - r11.f8609c) > 0) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int g(long r9, y7.r0.d r11, y7.r0 r12) {
            /*
                r8 = this;
                monitor-enter(r8)
                java.lang.Object r0 = r8._heap     // Catch:{ all -> 0x004e }
                h2.d r1 = k3.j.N     // Catch:{ all -> 0x004e }
                if (r0 != r1) goto L_0x000a
                monitor-exit(r8)
                r8 = 2
                return r8
            L_0x000a:
                monitor-enter(r11)     // Catch:{ all -> 0x004e }
                T[] r0 = r11.f2879a     // Catch:{ all -> 0x0013 }
                r1 = 0
                if (r0 == 0) goto L_0x0015
                r0 = r0[r1]     // Catch:{ all -> 0x0013 }
                goto L_0x0016
            L_0x0013:
                r9 = move-exception
                goto L_0x004c
            L_0x0015:
                r0 = 0
            L_0x0016:
                y7.r0$c r0 = (y7.r0.c) r0     // Catch:{ all -> 0x0013 }
                boolean r12 = y7.r0.V(r12)     // Catch:{ all -> 0x0013 }
                if (r12 == 0) goto L_0x0022
                monitor-exit(r11)     // Catch:{ all -> 0x004e }
                monitor-exit(r8)
                r8 = 1
                return r8
            L_0x0022:
                r2 = 0
                if (r0 != 0) goto L_0x0027
                goto L_0x0039
            L_0x0027:
                long r4 = r0.f8607f     // Catch:{ all -> 0x0013 }
                long r6 = r4 - r9
                int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r12 < 0) goto L_0x0030
                goto L_0x0031
            L_0x0030:
                r9 = r4
            L_0x0031:
                long r4 = r11.f8609c     // Catch:{ all -> 0x0013 }
                long r4 = r9 - r4
                int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r12 <= 0) goto L_0x003b
            L_0x0039:
                r11.f8609c = r9     // Catch:{ all -> 0x0013 }
            L_0x003b:
                long r9 = r8.f8607f     // Catch:{ all -> 0x0013 }
                long r4 = r11.f8609c     // Catch:{ all -> 0x0013 }
                long r9 = r9 - r4
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L_0x0046
                r8.f8607f = r4     // Catch:{ all -> 0x0013 }
            L_0x0046:
                r11.a(r8)     // Catch:{ all -> 0x0013 }
                monitor-exit(r11)     // Catch:{ all -> 0x004e }
                monitor-exit(r8)
                return r1
            L_0x004c:
                monitor-exit(r11)     // Catch:{ all -> 0x004e }
                throw r9     // Catch:{ all -> 0x004e }
            L_0x004e:
                r9 = move-exception
                monitor-exit(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.r0.c.g(long, y7.r0$d, y7.r0):int");
        }

        public final void setIndex(int i8) {
            this.f8608g = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f8607f + ']';
        }
    }

    public static final class d extends u<c> {

        /* renamed from: c  reason: collision with root package name */
        public long f8609c;

        public d(long j8) {
            this.f8609c = j8;
        }
    }

    static {
        Class<r0> cls = r0.class;
        Class<Object> cls2 = Object.class;
        f8601l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f8602m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f8603n = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    public static final boolean V(r0 r0Var) {
        r0Var.getClass();
        return f8603n.get(r0Var) != 0;
    }

    public final void N(f fVar, Runnable runnable) {
        W(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        r8 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078 A[LOOP:2: B:45:0x0078->B:48:0x0083, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long R() {
        /*
            r12 = this;
            boolean r0 = r12.S()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8602m
            java.lang.Object r0 = r0.get(r12)
            y7.r0$d r0 = (y7.r0.d) r0
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0059
            int r6 = r0.b()
            if (r6 != 0) goto L_0x001e
            r6 = r4
            goto L_0x001f
        L_0x001e:
            r6 = r5
        L_0x001f:
            if (r6 != 0) goto L_0x0059
            long r6 = java.lang.System.nanoTime()
        L_0x0025:
            monitor-enter(r0)
            T[] r8 = r0.f2879a     // Catch:{ all -> 0x0056 }
            if (r8 == 0) goto L_0x002d
            r8 = r8[r5]     // Catch:{ all -> 0x0056 }
            goto L_0x002e
        L_0x002d:
            r8 = r3
        L_0x002e:
            if (r8 != 0) goto L_0x0033
            monitor-exit(r0)
            r8 = r3
            goto L_0x0051
        L_0x0033:
            y7.r0$c r8 = (y7.r0.c) r8     // Catch:{ all -> 0x0056 }
            long r9 = r8.f8607f     // Catch:{ all -> 0x0056 }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x003f
            r9 = r4
            goto L_0x0040
        L_0x003f:
            r9 = r5
        L_0x0040:
            if (r9 == 0) goto L_0x0047
            boolean r8 = r12.X(r8)     // Catch:{ all -> 0x0056 }
            goto L_0x0048
        L_0x0047:
            r8 = r5
        L_0x0048:
            if (r8 == 0) goto L_0x004f
            c8.v r8 = r0.c(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0050
        L_0x004f:
            r8 = r3
        L_0x0050:
            monitor-exit(r0)
        L_0x0051:
            y7.r0$c r8 = (y7.r0.c) r8
            if (r8 != 0) goto L_0x0025
            goto L_0x0059
        L_0x0056:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x0059:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8601l
            java.lang.Object r6 = r0.get(r12)
            if (r6 != 0) goto L_0x0062
            goto L_0x008a
        L_0x0062:
            boolean r7 = r6 instanceof c8.k
            if (r7 == 0) goto L_0x0086
            r7 = r6
            c8.k r7 = (c8.k) r7
            java.lang.Object r8 = r7.d()
            h2.d r9 = c8.k.f2859g
            if (r8 == r9) goto L_0x0074
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            goto L_0x00a0
        L_0x0074:
            c8.k r7 = r7.c()
        L_0x0078:
            boolean r8 = r0.compareAndSet(r12, r6, r7)
            if (r8 == 0) goto L_0x007f
            goto L_0x0059
        L_0x007f:
            java.lang.Object r8 = r0.get(r12)
            if (r8 == r6) goto L_0x0078
            goto L_0x0059
        L_0x0086:
            h2.d r7 = k3.j.O
            if (r6 != r7) goto L_0x008c
        L_0x008a:
            r8 = r3
            goto L_0x00a0
        L_0x008c:
            boolean r7 = r0.compareAndSet(r12, r6, r3)
            if (r7 == 0) goto L_0x0094
            r0 = r4
            goto L_0x009b
        L_0x0094:
            java.lang.Object r7 = r0.get(r12)
            if (r7 == r6) goto L_0x008c
            r0 = r5
        L_0x009b:
            if (r0 == 0) goto L_0x0059
            r8 = r6
            java.lang.Runnable r8 = (java.lang.Runnable) r8
        L_0x00a0:
            if (r8 == 0) goto L_0x00a6
            r8.run()
            return r1
        L_0x00a6:
            i7.c<y7.k0<?>> r0 = r12.f8597j
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b8
        L_0x00b6:
            r8 = r6
            goto L_0x00b9
        L_0x00b8:
            r8 = r1
        L_0x00b9:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            goto L_0x0117
        L_0x00be:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8601l
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L_0x00ee
            boolean r8 = r0 instanceof c8.k
            if (r8 == 0) goto L_0x00e9
            c8.k r0 = (c8.k) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = c8.k.f2858f
            long r8 = r8.get(r0)
            r10 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r10 = r10 & r8
            long r10 = r10 >> r5
            int r0 = (int) r10
            r10 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r8 = r8 & r10
            r10 = 30
            long r8 = r8 >> r10
            int r8 = (int) r8
            if (r0 != r8) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r4 = r5
        L_0x00e6:
            if (r4 != 0) goto L_0x00ee
            goto L_0x0117
        L_0x00e9:
            h2.d r12 = k3.j.O
            if (r0 != r12) goto L_0x0117
            goto L_0x0116
        L_0x00ee:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8602m
            java.lang.Object r12 = r0.get(r12)
            y7.r0$d r12 = (y7.r0.d) r12
            if (r12 == 0) goto L_0x0116
            monitor-enter(r12)
            T[] r0 = r12.f2879a     // Catch:{ all -> 0x0113 }
            if (r0 == 0) goto L_0x00ff
            r3 = r0[r5]     // Catch:{ all -> 0x0113 }
        L_0x00ff:
            monitor-exit(r12)
            y7.r0$c r3 = (y7.r0.c) r3
            if (r3 != 0) goto L_0x0105
            goto L_0x0116
        L_0x0105:
            long r3 = r3.f8607f
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r12 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0111
            goto L_0x0117
        L_0x0111:
            r1 = r3
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0116:
            r1 = r6
        L_0x0117:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.r0.R():long");
    }

    public void W(Runnable runnable) {
        if (X(runnable)) {
            Thread T = T();
            if (Thread.currentThread() != T) {
                LockSupport.unpark(T);
                return;
            }
            return;
        }
        c0.f8550o.W(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[LOOP:2: B:23:0x0042->B:26:0x004d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8601l
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f8603n
            int r2 = r2.get(r6)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = r4
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r4
        L_0x0016:
            if (r1 != 0) goto L_0x002a
        L_0x0018:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L_0x0021
            r4 = r3
            goto L_0x0027
        L_0x0021:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L_0x0018
        L_0x0027:
            if (r4 == 0) goto L_0x0000
            return r3
        L_0x002a:
            boolean r2 = r1 instanceof c8.k
            if (r2 == 0) goto L_0x0051
            r2 = r1
            c8.k r2 = (c8.k) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L_0x0050
            if (r5 == r3) goto L_0x003e
            r0 = 2
            if (r5 == r0) goto L_0x003d
            goto L_0x0000
        L_0x003d:
            return r4
        L_0x003e:
            c8.k r2 = r2.c()
        L_0x0042:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x0049
            goto L_0x0000
        L_0x0049:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x0042
            goto L_0x0000
        L_0x0050:
            return r3
        L_0x0051:
            h2.d r2 = k3.j.O
            if (r1 != r2) goto L_0x0056
            return r4
        L_0x0056:
            c8.k r2 = new c8.k
            r5 = 8
            r2.<init>(r5, r3)
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r2.a(r5)
            r2.a(r7)
        L_0x0066:
            boolean r5 = r0.compareAndSet(r6, r1, r2)
            if (r5 == 0) goto L_0x006e
            r4 = r3
            goto L_0x0074
        L_0x006e:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L_0x0066
        L_0x0074:
            if (r4 == 0) goto L_0x0000
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.r0.X(java.lang.Runnable):boolean");
    }

    public final boolean Y() {
        i7.c<k0<?>> cVar = this.f8597j;
        if (!(cVar != null ? cVar.isEmpty() : true)) {
            return false;
        }
        d dVar = (d) f8602m.get(this);
        if (dVar != null) {
            if (!(dVar.b() == 0)) {
                return false;
            }
        }
        Object obj = f8601l.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof k) {
            long j8 = k.f2858f.get((k) obj);
            if (((int) ((1073741823 & j8) >> 0)) == ((int) ((j8 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == j.O) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[LOOP:0: B:10:0x0021->B:13:0x002c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(long r7, y7.r0.c r9) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8603n
            int r0 = r0.get(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r0 = r1
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f8602m
            r4 = 0
            if (r0 == 0) goto L_0x0014
            r0 = r1
            goto L_0x003b
        L_0x0014:
            java.lang.Object r0 = r3.get(r6)
            y7.r0$d r0 = (y7.r0.d) r0
            if (r0 != 0) goto L_0x0037
            y7.r0$d r5 = new y7.r0$d
            r5.<init>(r7)
        L_0x0021:
            boolean r0 = r3.compareAndSet(r6, r4, r5)
            if (r0 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x0021
        L_0x002e:
            java.lang.Object r0 = r3.get(r6)
            q7.k.b(r0)
            y7.r0$d r0 = (y7.r0.d) r0
        L_0x0037:
            int r0 = r9.g(r7, r0, r6)
        L_0x003b:
            if (r0 == 0) goto L_0x0053
            if (r0 == r1) goto L_0x004f
            r6 = 2
            if (r0 != r6) goto L_0x0043
            goto L_0x007c
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x004f:
            r6.U(r7, r9)
            goto L_0x007c
        L_0x0053:
            java.lang.Object r7 = r3.get(r6)
            y7.r0$d r7 = (y7.r0.d) r7
            if (r7 == 0) goto L_0x0069
            monitor-enter(r7)
            T[] r8 = r7.f2879a     // Catch:{ all -> 0x0066 }
            if (r8 == 0) goto L_0x0062
            r4 = r8[r2]     // Catch:{ all -> 0x0066 }
        L_0x0062:
            monitor-exit(r7)
            y7.r0$c r4 = (y7.r0.c) r4
            goto L_0x0069
        L_0x0066:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L_0x0069:
            if (r4 != r9) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r1 = r2
        L_0x006d:
            if (r1 == 0) goto L_0x007c
            java.lang.Thread r6 = r6.T()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L_0x007c
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.r0.Z(long, y7.r0$c):void");
    }

    public final void a(long j8, h hVar) {
        long j9 = 0;
        if (j8 > 0) {
            j9 = j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8;
        }
        if (j9 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j9 + nanoTime, hVar);
            Z(nanoTime, aVar);
            hVar.b(new n0(0, aVar));
        }
    }

    public m0 s(long j8, Runnable runnable, f fVar) {
        return g0.a.a(j8, runnable, fVar);
    }

    public void shutdown() {
        v c9;
        boolean z8;
        boolean z9;
        ThreadLocal<q0> threadLocal = q1.f8598a;
        q1.f8598a.set((Object) null);
        f8603n.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8601l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            h2.d dVar = j.O;
            if (obj == null) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, dVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    break;
                }
            } else if (obj instanceof k) {
                ((k) obj).b();
                break;
            } else if (obj == dVar) {
                break;
            } else {
                k kVar = new k(8, true);
                kVar.a((Runnable) obj);
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z8 = false;
                            break;
                        }
                    } else {
                        z8 = true;
                        break;
                    }
                }
                if (z8) {
                    break;
                }
            }
        }
        do {
        } while (R() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar2 = (d) f8602m.get(this);
            if (dVar2 != null) {
                synchronized (dVar2) {
                    c9 = dVar2.b() > 0 ? dVar2.c(0) : null;
                }
                c cVar = (c) c9;
                if (cVar != null) {
                    U(nanoTime, cVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
