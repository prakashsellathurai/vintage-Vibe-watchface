package c8;

import a1.a;
import c8.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y7.j1;

public abstract class r<S extends r<S>> extends b<S> implements j1 {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2868i = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: h  reason: collision with root package name */
    public final long f2869h;

    public r(long j8, S s8, int i8) {
        super(s8);
        this.f2869h = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    public final boolean a() {
        if (f2868i.get(this) != d()) {
            return false;
        }
        Object obj = b.f2834f.get(this);
        return !((obj == a.f26i ? null : (b) obj) == null);
    }

    public final boolean c() {
        if (f2868i.addAndGet(this, -65536) != d()) {
            return false;
        }
        Object obj = b.f2834f.get(this);
        return !((obj == a.f26i ? null : (b) obj) == null);
    }

    public abstract int d();

    public abstract void e(int i8);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2868i
            int r1 = r0.get(r6)
            int r2 = r6.d()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x0026
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = c8.b.f2834f
            java.lang.Object r2 = r2.get(r6)
            h2.d r5 = a1.a.f26i
            if (r2 != r5) goto L_0x001a
            r2 = 0
            goto L_0x001c
        L_0x001a:
            c8.b r2 = (c8.b) r2
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r4
        L_0x0021:
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = r4
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            if (r2 != 0) goto L_0x002b
            r3 = r4
            goto L_0x0034
        L_0x002b:
            r2 = 65536(0x10000, float:9.18355E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r6, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.r.f():boolean");
    }
}
