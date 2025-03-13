package c8;

import h2.d;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k<E> {
    public static final AtomicReferenceFieldUpdater e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2858f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f2859g = new d(9, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f2860a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2861b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2862c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f2863d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2864a;

        public a(int i8) {
            this.f2864a = i8;
        }
    }

    static {
        Class<k> cls = k.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f2858f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public k(int i8, boolean z8) {
        this.f2860a = i8;
        this.f2861b = z8;
        int i9 = i8 - 1;
        this.f2862c = i9;
        this.f2863d = new AtomicReferenceArray(i8);
        boolean z9 = false;
        if (i9 <= 1073741823) {
            if (!((i8 & i9) == 0 ? true : z9)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e4) {
        k kVar = this;
        E e9 = e4;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2858f;
            long j8 = atomicLongFieldUpdater.get(kVar);
            if ((3458764513820540928L & j8) != 0) {
                return (j8 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i8 = (int) ((1073741823 & j8) >> 0);
            int i9 = (int) ((1152921503533105152L & j8) >> 30);
            int i10 = kVar.f2862c;
            if (((i9 + 2) & i10) == (i8 & i10)) {
                return 1;
            }
            boolean z8 = kVar.f2861b;
            AtomicReferenceArray atomicReferenceArray = kVar.f2863d;
            if (z8 || atomicReferenceArray.get(i9 & i10) == null) {
                if (f2858f.compareAndSet(this, j8, (-1152921503533105153L & j8) | (((long) ((i9 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i9 & i10, e9);
                    while ((atomicLongFieldUpdater.get(kVar) & 1152921504606846976L) != 0) {
                        k c9 = kVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = c9.f2863d;
                        int i11 = c9.f2862c & i9;
                        Object obj = atomicReferenceArray2.get(i11);
                        if (!(obj instanceof a) || ((a) obj).f2864a != i9) {
                            c9 = null;
                        } else {
                            atomicReferenceArray2.set(i11, e9);
                        }
                        kVar = c9;
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i12 = kVar.f2860a;
                if (i12 < 1024 || ((i9 - i8) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        do {
            atomicLongFieldUpdater = f2858f;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, 2305843009213693952L | j8));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c A[LOOP:3: B:16:0x006c->B:19:0x0078, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c8.k<E> c() {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f2858f
            long r2 = r6.get(r10)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            long r7 = r2 | r0
            r0 = r6
            r1 = r10
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r7
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = e
            java.lang.Object r1 = r0.get(r10)
            c8.k r1 = (c8.k) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            c8.k r1 = new c8.k
            int r4 = r10.f2860a
            int r4 = r4 * 2
            boolean r5 = r10.f2861b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r7 = 0
            long r4 = r4 >> r7
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0044:
            int r7 = r10.f2862c
            r8 = r4 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0063
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f2863d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0058
            c8.k$a r7 = new c8.k$a
            r7.<init>(r4)
        L_0x0058:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.f2863d
            int r9 = r1.f2862c
            r9 = r9 & r4
            r8.set(r9, r7)
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0063:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r6.set(r1, r4)
        L_0x006c:
            r4 = 0
            boolean r4 = r0.compareAndSet(r10, r4, r1)
            if (r4 == 0) goto L_0x0074
            goto L_0x001d
        L_0x0074:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == 0) goto L_0x006c
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.k.c():c8.k");
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2858f;
            long j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                return f2859g;
            }
            int i8 = (int) ((j8 & 1073741823) >> 0);
            int i9 = this.f2862c;
            int i10 = i8 & i9;
            if ((((int) ((1152921503533105152L & j8) >> 30)) & i9) == i10) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f2863d;
            Object obj = atomicReferenceArray.get(i10);
            boolean z8 = this.f2861b;
            if (obj == null) {
                if (z8) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j9 = ((long) ((i8 + 1) & 1073741823)) << 0;
                AtomicReferenceArray atomicReferenceArray2 = atomicReferenceArray;
                Object obj2 = obj;
                if (atomicLongFieldUpdater.compareAndSet(this, j8, j9 | (j8 & -1073741824))) {
                    atomicReferenceArray2.set(i10, (Object) null);
                    return obj2;
                } else if (z8) {
                    k kVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2858f;
                        long j10 = atomicLongFieldUpdater2.get(kVar);
                        int i11 = (int) ((j10 & 1073741823) >> 0);
                        if ((j10 & 1152921504606846976L) != 0) {
                            kVar = kVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(kVar, j10, (j10 & -1073741824) | j9)) {
                                kVar.f2863d.set(kVar.f2862c & i11, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
