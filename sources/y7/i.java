package y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class i extends q {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8574c = AtomicIntegerFieldUpdater.newUpdater(i.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(j7.d<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001a:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.i.<init>(j7.d, java.lang.Throwable, boolean):void");
    }
}
