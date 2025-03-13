package d8;

import j7.f;
import j7.g;
import java.util.concurrent.Executor;
import y7.u0;
import y7.w;

public final class b extends u0 implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final b f4146h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final w f4147i;

    /* JADX WARNING: type inference failed for: r2v3, types: [c8.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            d8.b r0 = new d8.b
            r0.<init>()
            f4146h = r0
            d8.k r0 = d8.k.f4161h
            int r1 = c8.s.f2870a
            r2 = 64
            if (r2 >= r1) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r4 = 0
            int r1 = k3.j.e0(r3, r1, r4, r4, r2)
            r0.getClass()
            k3.j.m(r1)
            int r2 = d8.j.f4157d
            if (r1 < r2) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            k3.j.m(r1)
            c8.g r2 = new c8.g
            r2.<init>(r0, r1)
            r0 = r2
        L_0x002e:
            f4147i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.b.<clinit>():void");
    }

    public final void N(f fVar, Runnable runnable) {
        f4147i.N(fVar, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        N(g.f5052f, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
