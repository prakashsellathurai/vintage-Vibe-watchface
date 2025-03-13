package n1;

import j7.d;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$WslFlow$requestWatchFaceStyle$1", f = "WatchFaceService.kt", l = {970}, m = "invokeSuspend")
public final class e1 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public Object f5549j;

    /* renamed from: k  reason: collision with root package name */
    public Object f5550k;

    /* renamed from: l  reason: collision with root package name */
    public Object f5551l;

    /* renamed from: m  reason: collision with root package name */
    public int f5552m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ t0.e f5553n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(t0.e eVar, d<? super e1> dVar) {
        super(2, dVar);
        this.f5553n = eVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new e1(this.f5553n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((e1) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[SYNTHETIC, Splitter:B:27:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Object r7) {
        /*
            r6 = this;
            k7.a r0 = k7.a.f5217f
            int r1 = r6.f5552m
            r2 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r0 = r6.f5551l
            a.a r0 = (a.a) r0
            java.lang.Object r1 = r6.f5550k
            n1.t0$e r1 = (n1.t0.e) r1
            java.lang.Object r6 = r6.f5549j
            java.io.Closeable r6 = (java.io.Closeable) r6
            a1.a.I(r7)     // Catch:{ RemoteException -> 0x001c }
            goto L_0x004d
        L_0x0019:
            r7 = move-exception
            goto L_0x0084
        L_0x001c:
            r7 = move-exception
            goto L_0x005d
        L_0x001e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0026:
            a1.a.I(r7)
            v1.c r7 = new v1.c
            java.lang.String r1 = "requestWatchFaceStyle"
            r7.<init>(r1)
            n1.t0$e r1 = r6.f5553n
            a.a r3 = r1.b()     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            n1.t0$c r4 = r1.f5835a     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            y7.o r4 = r4.f5748i     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            r6.f5549j = r7     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            r6.f5550k = r1     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            r6.f5551l = r3     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            r6.f5552m = r2     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            java.lang.Object r6 = r4.s(r6)     // Catch:{ RemoteException -> 0x0059, all -> 0x0057 }
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r0 = r3
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x004d:
            n1.p0 r7 = (n1.p0) r7     // Catch:{ RemoteException -> 0x001c }
            a.c r7 = r7.a()     // Catch:{ RemoteException -> 0x001c }
            r0.d(r7)     // Catch:{ RemoteException -> 0x001c }
            goto L_0x0064
        L_0x0057:
            r6 = move-exception
            goto L_0x0087
        L_0x0059:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x005d:
            java.lang.String r0 = "WatchFaceService"
            java.lang.String r3 = "Failed to set WatchFaceStyle: "
            android.util.Log.e(r0, r3, r7)     // Catch:{ all -> 0x0019 }
        L_0x0064:
            int[] r7 = r1.f5842i     // Catch:{ all -> 0x0019 }
            n1.t0$c r0 = r1.f5835a
            if (r7 == 0) goto L_0x006d
            r0.j(r7)     // Catch:{ all -> 0x0019 }
        L_0x006d:
            b.a[] r7 = r0.f5762z     // Catch:{ all -> 0x0019 }
            int r1 = r7.length     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0074
            r1 = r2
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x007b
            r0.E(r7)     // Catch:{ all -> 0x0019 }
        L_0x007b:
            h7.h r7 = h7.h.f4787a     // Catch:{ all -> 0x0019 }
            r7 = 0
            k3.j.n(r6, r7)
            h7.h r6 = h7.h.f4787a
            return r6
        L_0x0084:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0087:
            throw r6     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            k3.j.n(r7, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e1.h(java.lang.Object):java.lang.Object");
    }
}
