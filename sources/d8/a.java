package d8;

import c8.p;
import h2.d;
import h7.h;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q7.k;
import r7.c;
import s.g;
import y7.b0;

public final class a implements Executor, Closeable {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4126m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4127n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4128o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f4129p = new d(9, "NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: f  reason: collision with root package name */
    public final int f4130f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4131g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4132h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4133i;

    /* renamed from: j  reason: collision with root package name */
    public final d f4134j;

    /* renamed from: k  reason: collision with root package name */
    public final d f4135k;

    /* renamed from: l  reason: collision with root package name */
    public final p<C0049a> f4136l;
    private volatile long parkedWorkersStack;

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    public final class C0049a extends Thread {

        /* renamed from: n  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f4137n = AtomicIntegerFieldUpdater.newUpdater(C0049a.class, "workerCtl");

        /* renamed from: f  reason: collision with root package name */
        public final l f4138f;

        /* renamed from: g  reason: collision with root package name */
        public final q7.p<g> f4139g;

        /* renamed from: h  reason: collision with root package name */
        public int f4140h;

        /* renamed from: i  reason: collision with root package name */
        public long f4141i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public long f4142j;

        /* renamed from: k  reason: collision with root package name */
        public int f4143k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f4144l;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public C0049a() {
            throw null;
        }

        public C0049a(int i8) {
            setDaemon(true);
            this.f4138f = new l();
            this.f4139g = new q7.p<>();
            this.f4140h = 4;
            this.nextParkedWorker = a.f4129p;
            this.f4143k = c.f7119f.a();
            f(i8);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final d8.g a(boolean r11) {
            /*
                r10 = this;
                int r0 = r10.f4140h
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0007
                goto L_0x0032
            L_0x0007:
                d8.a r0 = d8.a.this
                java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = d8.a.f4127n
            L_0x000b:
                long r5 = r9.get(r0)
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L_0x001d
                r0 = r2
                goto L_0x002e
            L_0x001d:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = d8.a.f4127n
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L_0x000b
                r0 = r1
            L_0x002e:
                if (r0 == 0) goto L_0x0034
                r10.f4140h = r1
            L_0x0032:
                r0 = r1
                goto L_0x0035
            L_0x0034:
                r0 = r2
            L_0x0035:
                d8.a r3 = d8.a.this
                r4 = 0
                d8.l r5 = r10.f4138f
                if (r0 == 0) goto L_0x007d
                if (r11 == 0) goto L_0x0070
                int r11 = r3.f4130f
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L_0x0049
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                if (r1 == 0) goto L_0x0053
                d8.g r11 = r10.e()
                if (r11 == 0) goto L_0x0053
                goto L_0x007c
            L_0x0053:
                r5.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = d8.l.f4162b
                java.lang.Object r11 = r11.getAndSet(r5, r4)
                d8.g r11 = (d8.g) r11
                if (r11 != 0) goto L_0x0064
                d8.g r11 = r5.b()
            L_0x0064:
                if (r11 == 0) goto L_0x0067
                goto L_0x007c
            L_0x0067:
                if (r1 != 0) goto L_0x0077
                d8.g r11 = r10.e()
                if (r11 == 0) goto L_0x0077
                goto L_0x007c
            L_0x0070:
                d8.g r11 = r10.e()
                if (r11 == 0) goto L_0x0077
                goto L_0x007c
            L_0x0077:
                r11 = 3
                d8.g r11 = r10.i(r11)
            L_0x007c:
                return r11
            L_0x007d:
                r5.getClass()
            L_0x0080:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = d8.l.f4162b
                java.lang.Object r0 = r11.get(r5)
                d8.g r0 = (d8.g) r0
                if (r0 != 0) goto L_0x008b
                goto L_0x00ab
            L_0x008b:
                d8.h r6 = r0.f4152g
                int r6 = r6.g()
                if (r6 != r1) goto L_0x0095
                r6 = r1
                goto L_0x0096
            L_0x0095:
                r6 = r2
            L_0x0096:
                if (r6 != r1) goto L_0x00ab
            L_0x0098:
                boolean r6 = r11.compareAndSet(r5, r0, r4)
                if (r6 == 0) goto L_0x00a0
                r11 = r1
                goto L_0x00a7
            L_0x00a0:
                java.lang.Object r6 = r11.get(r5)
                if (r6 == r0) goto L_0x0098
                r11 = r2
            L_0x00a7:
                if (r11 == 0) goto L_0x0080
                r4 = r0
                goto L_0x00cb
            L_0x00ab:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = d8.l.f4164d
                int r11 = r11.get(r5)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = d8.l.f4163c
                int r0 = r0.get(r5)
            L_0x00b7:
                if (r11 == r0) goto L_0x00cb
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = d8.l.e
                int r2 = r2.get(r5)
                if (r2 != 0) goto L_0x00c2
                goto L_0x00cb
            L_0x00c2:
                int r0 = r0 + -1
                d8.g r2 = r5.c(r0, r1)
                if (r2 == 0) goto L_0x00b7
                r4 = r2
            L_0x00cb:
                if (r4 != 0) goto L_0x00dc
                d8.d r11 = r3.f4135k
                java.lang.Object r11 = r11.d()
                r4 = r11
                d8.g r4 = (d8.g) r4
                if (r4 != 0) goto L_0x00dc
                d8.g r4 = r10.i(r1)
            L_0x00dc:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d8.a.C0049a.a(boolean):d8.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i8) {
            int i9 = this.f4143k;
            int i10 = i9 ^ (i9 << 13);
            int i11 = i10 ^ (i10 >> 17);
            int i12 = i11 ^ (i11 << 5);
            this.f4143k = i12;
            int i13 = i8 - 1;
            return (i13 & i8) == 0 ? i13 & i12 : (Integer.MAX_VALUE & i12) % i8;
        }

        public final g e() {
            d dVar;
            int d9 = d(2);
            a aVar = a.this;
            if (d9 == 0) {
                g gVar = (g) aVar.f4134j.d();
                if (gVar != null) {
                    return gVar;
                }
                dVar = aVar.f4135k;
            } else {
                g gVar2 = (g) aVar.f4135k.d();
                if (gVar2 != null) {
                    return gVar2;
                }
                dVar = aVar.f4134j;
            }
            return (g) dVar.d();
        }

        public final void f(int i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f4133i);
            sb.append("-worker-");
            sb.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb.toString());
            this.indexInArray = i8;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i8) {
            int i9 = this.f4140h;
            boolean z8 = true;
            if (i9 != 1) {
                z8 = false;
            }
            if (z8) {
                a.f4127n.addAndGet(a.this, 4398046511104L);
            }
            if (i9 != i8) {
                this.f4140h = i8;
            }
            return z8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
            r7 = -2;
            r18 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
            r5 = -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final d8.g i(int r21) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = d8.a.f4127n
                d8.a r3 = d8.a.this
                long r4 = r2.get(r3)
                r6 = 2097151(0x1fffff, double:1.0361303E-317)
                long r4 = r4 & r6
                int r2 = (int) r4
                r4 = 2
                r5 = 0
                if (r2 >= r4) goto L_0x0016
                return r5
            L_0x0016:
                int r6 = r0.d(r2)
                r10 = 0
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0020:
                if (r10 >= r2) goto L_0x00f0
                r15 = 1
                int r6 = r6 + r15
                if (r6 <= r2) goto L_0x0027
                r6 = r15
            L_0x0027:
                c8.p<d8.a$a> r4 = r3.f4136l
                java.lang.Object r4 = r4.b(r6)
                d8.a$a r4 = (d8.a.C0049a) r4
                if (r4 == 0) goto L_0x00e6
                if (r4 == r0) goto L_0x00e6
                r9 = 3
                d8.l r4 = r4.f4138f
                if (r1 != r9) goto L_0x003d
                d8.g r9 = r4.b()
                goto L_0x0069
            L_0x003d:
                r4.getClass()
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = d8.l.f4164d
                int r9 = r9.get(r4)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = d8.l.f4163c
                int r7 = r7.get(r4)
                if (r1 != r15) goto L_0x0050
                r8 = r15
                goto L_0x0051
            L_0x0050:
                r8 = 0
            L_0x0051:
                if (r9 == r7) goto L_0x0068
                if (r8 == 0) goto L_0x005e
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = d8.l.e
                int r13 = r13.get(r4)
                if (r13 != 0) goto L_0x005e
                goto L_0x0068
            L_0x005e:
                int r13 = r9 + 1
                d8.g r9 = r4.c(r9, r8)
                if (r9 != 0) goto L_0x0069
                r9 = r13
                goto L_0x0051
            L_0x0068:
                r9 = r5
            L_0x0069:
                q7.p<d8.g> r13 = r0.f4139g
                if (r9 == 0) goto L_0x0072
                r13.f6643f = r9
                r18 = r6
                goto L_0x00c2
            L_0x0072:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = d8.l.f4162b
                java.lang.Object r14 = r9.get(r4)
                d8.g r14 = (d8.g) r14
                if (r14 != 0) goto L_0x007d
                goto L_0x0090
            L_0x007d:
                d8.h r7 = r14.f4152g
                int r7 = r7.g()
                if (r7 != r15) goto L_0x0087
                r7 = r15
                goto L_0x0088
            L_0x0087:
                r7 = 0
            L_0x0088:
                if (r7 == 0) goto L_0x008c
                r7 = r15
                goto L_0x008d
            L_0x008c:
                r7 = 2
            L_0x008d:
                r7 = r7 & r1
                if (r7 != 0) goto L_0x0097
            L_0x0090:
                r7 = -2
                r18 = r6
            L_0x0094:
                r5 = -1
                goto L_0x00c6
            L_0x0097:
                d8.e r7 = d8.j.f4158f
                r7.getClass()
                long r7 = java.lang.System.nanoTime()
                r18 = r6
                long r5 = r14.f4151f
                long r7 = r7 - r5
                long r5 = d8.j.f4155b
                int r19 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r19 >= 0) goto L_0x00ae
                long r7 = r5 - r7
                goto L_0x0094
            L_0x00ae:
                r5 = 0
                boolean r6 = r9.compareAndSet(r4, r14, r5)
                if (r6 == 0) goto L_0x00b7
                r5 = r15
                goto L_0x00be
            L_0x00b7:
                java.lang.Object r5 = r9.get(r4)
                if (r5 == r14) goto L_0x00e3
                r5 = 0
            L_0x00be:
                if (r5 == 0) goto L_0x00dd
                r13.f6643f = r14
            L_0x00c2:
                r5 = -1
                r7 = -1
            L_0x00c6:
                int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x00d2
                T r0 = r13.f6643f
                d8.g r0 = (d8.g) r0
                r1 = 0
                r13.f6643f = r1
                return r0
            L_0x00d2:
                r16 = 0
                int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r4 <= 0) goto L_0x00e8
                long r11 = java.lang.Math.min(r11, r7)
                goto L_0x00e8
            L_0x00dd:
                r16 = 0
                r6 = r18
                r5 = 0
                goto L_0x0072
            L_0x00e3:
                r16 = 0
                goto L_0x00ae
            L_0x00e6:
                r18 = r6
            L_0x00e8:
                int r10 = r10 + 1
                r6 = r18
                r4 = 2
                r5 = 0
                goto L_0x0020
            L_0x00f0:
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r16 = 0
                int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r1 == 0) goto L_0x00fc
                goto L_0x00fe
            L_0x00fc:
                r11 = r16
            L_0x00fe:
                r0.f4142j = r11
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d8.a.C0049a.i(int):d8.g");
        }

        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j8;
            int i8;
            loop0:
            while (true) {
                boolean z8 = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    int i9 = 5;
                    if (!(a.f4128o.get(aVar) != 0) && this.f4140h != 5) {
                        g a9 = a(this.f4144l);
                        if (a9 == null) {
                            this.f4144l = false;
                            if (this.f4142j != 0) {
                                if (z8) {
                                    h(3);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f4142j);
                                    this.f4142j = 0;
                                    break;
                                }
                                z8 = true;
                            } else {
                                Object obj = this.nextParkedWorker;
                                d dVar = a.f4129p;
                                if (obj != dVar) {
                                    f4137n.set(this, -1);
                                    while (true) {
                                        if (!(this.nextParkedWorker != a.f4129p)) {
                                            continue;
                                            break;
                                        }
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4137n;
                                        if (atomicIntegerFieldUpdater.get(this) != -1) {
                                            continue;
                                            break;
                                        }
                                        a aVar2 = a.this;
                                        aVar2.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.f4128o;
                                        if ((atomicIntegerFieldUpdater2.get(aVar2) != 0) || this.f4140h == i9) {
                                            break;
                                        }
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f4141i == 0) {
                                            this.f4141i = System.nanoTime() + a.this.f4132h;
                                        }
                                        LockSupport.parkNanos(a.this.f4132h);
                                        if (System.nanoTime() - this.f4141i >= 0) {
                                            this.f4141i = 0;
                                            a aVar3 = a.this;
                                            synchronized (aVar3.f4136l) {
                                                if (!(atomicIntegerFieldUpdater2.get(aVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.f4127n;
                                                    if (((int) (atomicLongFieldUpdater2.get(aVar3) & 2097151)) > aVar3.f4130f) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i10 = this.indexInArray;
                                                            f(0);
                                                            aVar3.d(this, i10, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(aVar3) & 2097151);
                                                            if (andDecrement != i10) {
                                                                C0049a b9 = aVar3.f4136l.b(andDecrement);
                                                                k.b(b9);
                                                                C0049a aVar4 = b9;
                                                                aVar3.f4136l.c(i10, aVar4);
                                                                aVar4.f(i10);
                                                                aVar3.d(aVar4, andDecrement, i10);
                                                            }
                                                            aVar3.f4136l.c(andDecrement, null);
                                                            h hVar = h.f4787a;
                                                            this.f4140h = 5;
                                                            i9 = 5;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i9 = 5;
                                    }
                                } else {
                                    a aVar5 = a.this;
                                    aVar5.getClass();
                                    if (this.nextParkedWorker == dVar) {
                                        do {
                                            atomicLongFieldUpdater = a.f4126m;
                                            j8 = atomicLongFieldUpdater.get(aVar5);
                                            i8 = this.indexInArray;
                                            this.nextParkedWorker = aVar5.f4136l.b((int) (j8 & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(aVar5, j8, ((j8 + 2097152) & -2097152) | ((long) i8)));
                                    }
                                }
                            }
                        } else {
                            this.f4142j = 0;
                            int g9 = a9.f4152g.g();
                            this.f4141i = 0;
                            if (this.f4140h == 3) {
                                this.f4140h = 2;
                            }
                            a aVar6 = a.this;
                            if (g9 != 0 && h(2) && !aVar6.h() && !aVar6.g(a.f4127n.get(aVar6))) {
                                aVar6.h();
                            }
                            aVar6.getClass();
                            try {
                                a9.run();
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                            }
                            if (g9 != 0) {
                                a.f4127n.addAndGet(aVar6, -2097152);
                                if (this.f4140h != 5) {
                                    this.f4140h = 4;
                                }
                            }
                        }
                    } else {
                        h(5);
                    }
                }
            }
            h(5);
            return;
        }
    }

    static {
        Class<a> cls = a.class;
        f4126m = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f4127n = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f4128o = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public a(int i8, int i9, long j8, String str) {
        this.f4130f = i8;
        this.f4131g = i9;
        this.f4132h = j8;
        this.f4133i = str;
        boolean z8 = true;
        if (i8 >= 1) {
            if (i9 >= i8) {
                if (i9 <= 2097150) {
                    if (j8 <= 0 ? false : z8) {
                        this.f4134j = new d();
                        this.f4135k = new d();
                        this.f4136l = new p<>((i8 + 1) * 2);
                        this.controlState = ((long) i8) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j8 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i9 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i9 + " should be greater than or equals to core pool size " + i8).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i8 + " should be at least 1").toString());
    }

    public final int a() {
        synchronized (this.f4136l) {
            boolean z8 = false;
            if (f4128o.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4127n;
            long j8 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j8 & 2097151);
            int i9 = i8 - ((int) ((j8 & 4398044413952L) >> 21));
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 >= this.f4130f) {
                return 0;
            }
            if (i8 >= this.f4131g) {
                return 0;
            }
            int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i10 > 0 && this.f4136l.b(i10) == null) {
                C0049a aVar = new C0049a(i10);
                this.f4136l.c(i10, aVar);
                if (i10 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z8 = true;
                }
                if (z8) {
                    int i11 = i9 + 1;
                    aVar.start();
                    return i11;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void c(Runnable runnable, h hVar, boolean z8) {
        g gVar;
        j.f4158f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f4151f = nanoTime;
            gVar.f4152g = hVar;
        } else {
            gVar = new i(runnable, nanoTime, hVar);
        }
        boolean z9 = false;
        boolean z10 = gVar.f4152g.g() == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4127n;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152) : 0;
        Thread currentThread = Thread.currentThread();
        C0049a aVar = currentThread instanceof C0049a ? (C0049a) currentThread : null;
        if (aVar == null || !k.a(a.this, this)) {
            aVar = null;
        }
        if (!(aVar == null || aVar.f4140h == 5 || (gVar.f4152g.g() == 0 && aVar.f4140h == 2))) {
            aVar.f4144l = true;
            l lVar = aVar.f4138f;
            if (z8) {
                gVar = lVar.a(gVar);
            } else {
                lVar.getClass();
                g gVar2 = (g) l.f4162b.getAndSet(lVar, gVar);
                gVar = gVar2 == null ? null : lVar.a(gVar2);
            }
        }
        if (gVar != null) {
            if (!(gVar.f4152g.g() == 1 ? this.f4135k : this.f4134j).a(gVar)) {
                throw new RejectedExecutionException(this.f4133i + " was terminated");
            }
        }
        if (z8 && aVar != null) {
            z9 = true;
        }
        if (z10) {
            if (!z9 && !h() && !g(addAndGet)) {
                h();
            }
        } else if (!z9 && !h() && !g(atomicLongFieldUpdater.get(this))) {
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (r1 == null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f4128o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof d8.a.C0049a
            r4 = 0
            if (r3 == 0) goto L_0x0018
            d8.a$a r0 = (d8.a.C0049a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            d8.a r3 = d8.a.this
            boolean r3 = q7.k.a(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            c8.p<d8.a$a> r3 = r9.f4136l
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = f4127n     // Catch:{ all -> 0x00c6 }
            long r5 = r5.get(r9)     // Catch:{ all -> 0x00c6 }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L_0x007a
            r3 = r2
        L_0x0037:
            c8.p<d8.a$a> r6 = r9.f4136l
            java.lang.Object r6 = r6.b(r3)
            q7.k.b(r6)
            d8.a$a r6 = (d8.a.C0049a) r6
            if (r6 == r0) goto L_0x0075
        L_0x0044:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L_0x0053
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L_0x0044
        L_0x0053:
            d8.l r6 = r6.f4138f
            d8.d r7 = r9.f4135k
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = d8.l.f4162b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            d8.g r8 = (d8.g) r8
            if (r8 == 0) goto L_0x0067
            r7.a(r8)
        L_0x0067:
            d8.g r8 = r6.b()
            if (r8 != 0) goto L_0x006f
            r8 = r1
            goto L_0x0073
        L_0x006f:
            r7.a(r8)
            r8 = r2
        L_0x0073:
            if (r8 != 0) goto L_0x0067
        L_0x0075:
            if (r3 == r5) goto L_0x007a
            int r3 = r3 + 1
            goto L_0x0037
        L_0x007a:
            d8.d r1 = r9.f4135k
            r1.b()
            d8.d r1 = r9.f4134j
            r1.b()
        L_0x0084:
            if (r0 == 0) goto L_0x008c
            d8.g r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00b3
        L_0x008c:
            d8.d r1 = r9.f4134j
            java.lang.Object r1 = r1.d()
            d8.g r1 = (d8.g) r1
            if (r1 != 0) goto L_0x00b3
            d8.d r1 = r9.f4135k
            java.lang.Object r1 = r1.d()
            d8.g r1 = (d8.g) r1
            if (r1 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x00a6
            r1 = 5
            r0.h(r1)
        L_0x00a6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f4126m
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f4127n
            r0.set(r9, r1)
        L_0x00b2:
            return
        L_0x00b3:
            r1.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x0084
        L_0x00b7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c4 }
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00c4 }
            r4.uncaughtException(r3, r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x0084
        L_0x00c4:
            r9 = move-exception
            throw r9
        L_0x00c6:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.close():void");
    }

    public final void d(C0049a aVar, int i8, int i9) {
        while (true) {
            long j8 = f4126m.get(this);
            int i10 = (int) (2097151 & j8);
            long j9 = (2097152 + j8) & -2097152;
            if (i10 == i8) {
                if (i9 == 0) {
                    C0049a aVar2 = aVar;
                    while (true) {
                        Object c9 = aVar2.c();
                        if (c9 != f4129p) {
                            if (c9 != null) {
                                aVar2 = (C0049a) c9;
                                int b9 = aVar2.b();
                                if (b9 != 0) {
                                    i10 = b9;
                                    break;
                                }
                            } else {
                                i10 = 0;
                                break;
                            }
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                } else {
                    i10 = i9;
                }
            }
            if (i10 >= 0) {
                if (f4126m.compareAndSet(this, j8, ((long) i10) | j9)) {
                    return;
                }
            }
        }
    }

    public final void execute(Runnable runnable) {
        c(runnable, j.f4159g, false);
    }

    public final boolean g(long j8) {
        int i8 = ((int) (2097151 & j8)) - ((int) ((j8 & 4398044413952L) >> 21));
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = this.f4130f;
        if (i8 < i9) {
            int a9 = a();
            if (a9 == 1 && i9 > 1) {
                a();
            }
            if (a9 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        d dVar;
        int i8;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4126m;
            long j8 = atomicLongFieldUpdater.get(this);
            C0049a b9 = this.f4136l.b((int) (2097151 & j8));
            if (b9 == null) {
                b9 = null;
            } else {
                long j9 = (2097152 + j8) & -2097152;
                C0049a aVar = b9;
                while (true) {
                    Object c9 = aVar.c();
                    dVar = f4129p;
                    if (c9 != dVar) {
                        if (c9 != null) {
                            aVar = (C0049a) c9;
                            i8 = aVar.b();
                            if (i8 != 0) {
                                break;
                            }
                        } else {
                            i8 = 0;
                            break;
                        }
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j8, j9 | ((long) i8))) {
                        b9.g(dVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b9 == null) {
                return false;
            }
            if (C0049a.f4137n.compareAndSet(b9, -1, 0)) {
                LockSupport.unpark(b9);
                return true;
            }
        }
    }

    public final String toString() {
        char c9;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        p<C0049a> pVar = this.f4136l;
        int a9 = pVar.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a9; i13++) {
            C0049a b9 = pVar.b(i13);
            if (b9 != null) {
                l lVar = b9.f4138f;
                lVar.getClass();
                Object obj = l.f4162b.get(lVar);
                int i14 = l.f4163c.get(lVar) - l.f4164d.get(lVar);
                if (obj != null) {
                    i14++;
                }
                int b10 = g.b(b9.f4140h);
                if (b10 == 0) {
                    i8++;
                    sb = new StringBuilder();
                    sb.append(i14);
                    c9 = 'c';
                } else if (b10 == 1) {
                    i9++;
                    sb = new StringBuilder();
                    sb.append(i14);
                    c9 = 'b';
                } else if (b10 == 2) {
                    i10++;
                } else if (b10 == 3) {
                    i11++;
                    if (i14 > 0) {
                        sb = new StringBuilder();
                        sb.append(i14);
                        c9 = 'd';
                    }
                } else if (b10 == 4) {
                    i12++;
                }
                sb.append(c9);
                arrayList.add(sb.toString());
            }
        }
        long j8 = f4127n.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4133i);
        sb2.append('@');
        sb2.append(b0.l(this));
        sb2.append("[Pool Size {core = ");
        int i15 = this.f4130f;
        sb2.append(i15);
        sb2.append(", max = ");
        sb2.append(this.f4131g);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i8);
        sb2.append(", blocking = ");
        sb2.append(i9);
        sb2.append(", parked = ");
        sb2.append(i10);
        sb2.append(", dormant = ");
        sb2.append(i11);
        sb2.append(", terminated = ");
        sb2.append(i12);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.f4134j.c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f4135k.c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j8));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j8) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i15 - ((int) ((j8 & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }
}
