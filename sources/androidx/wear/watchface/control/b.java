package androidx.wear.watchface.control;

import android.content.ComponentName;
import c8.c;
import k3.j;
import n1.t0;
import p7.l;
import r1.m;
import y7.z;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public WatchFaceControlService f2253a;

    /* renamed from: b  reason: collision with root package name */
    public final z f2254b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t0 f2255a;

        /* renamed from: b  reason: collision with root package name */
        public final t0.c f2256b;

        public a(t0.c cVar, t0 t0Var) {
            this.f2255a = t0Var;
            this.f2256b = cVar;
        }
    }

    public b(WatchFaceControlService watchFaceControlService, c cVar) {
        this.f2253a = watchFaceControlService;
        this.f2254b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        k3.j.n(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        throw r11;
     */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.wear.watchface.control.b.a c(android.content.ComponentName r11) {
        /*
            r10 = this;
            v1.c r0 = new v1.c
            java.lang.String r1 = "IWatchFaceInstanceServiceStub.createEngine"
            r0.<init>(r1)
            androidx.wear.watchface.control.WatchFaceControlService r1 = r10.f2253a     // Catch:{ all -> 0x0011 }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            n1.t0 r1 = androidx.wear.watchface.control.WatchFaceControlService.b(r11)     // Catch:{ all -> 0x0011 }
            goto L_0x0015
        L_0x0011:
            r10 = move-exception
            goto L_0x009f
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x009a
            java.lang.Class<android.app.Service> r3 = android.app.Service.class
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "Service::class.java.declaredMethods"
            q7.k.d(r3, r4)     // Catch:{ Exception -> 0x0074 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0074 }
            r5 = 0
            r6 = r5
        L_0x0025:
            if (r6 >= r4) goto L_0x0039
            r7 = r3[r6]     // Catch:{ Exception -> 0x0074 }
            java.lang.String r8 = r7.getName()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r9 = "attach"
            boolean r8 = q7.k.a(r8, r9)     // Catch:{ Exception -> 0x0074 }
            if (r8 == 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0039:
            r7 = r2
        L_0x003a:
            q7.k.b(r7)     // Catch:{ Exception -> 0x0074 }
            r3 = 1
            r7.setAccessible(r3)     // Catch:{ Exception -> 0x0074 }
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0074 }
            androidx.wear.watchface.control.WatchFaceControlService r6 = r10.f2253a     // Catch:{ Exception -> 0x0074 }
            java.lang.String r8 = "null cannot be cast to non-null type android.content.Context"
            q7.k.c(r6, r8)     // Catch:{ Exception -> 0x0074 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0074 }
            r4[r3] = r2     // Catch:{ Exception -> 0x0074 }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Exception -> 0x0074 }
            q7.f r3 = q7.q.a(r3)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x0074 }
            r5 = 2
            r4[r5] = r3     // Catch:{ Exception -> 0x0074 }
            r3 = 3
            r4[r3] = r2     // Catch:{ Exception -> 0x0074 }
            androidx.wear.watchface.control.WatchFaceControlService r10 = r10.f2253a     // Catch:{ Exception -> 0x0074 }
            q7.k.b(r10)     // Catch:{ Exception -> 0x0074 }
            android.app.Application r10 = r10.getApplication()     // Catch:{ Exception -> 0x0074 }
            r3 = 4
            r4[r3] = r10     // Catch:{ Exception -> 0x0074 }
            r10 = 5
            r4[r10] = r2     // Catch:{ Exception -> 0x0074 }
            r7.invoke(r1, r4)     // Catch:{ Exception -> 0x0074 }
            goto L_0x007f
        L_0x0074:
            r10 = move-exception
            java.lang.String r3 = "IWatchFaceInstanceServiceStub"
            java.lang.String r4 = "createServiceAndHeadlessEngine can't call attach by reflection, falling back to setContext"
            android.util.Log.w(r3, r4, r10)     // Catch:{ all -> 0x0011 }
            r1.i(r1)     // Catch:{ all -> 0x0011 }
        L_0x007f:
            r1.onCreate()     // Catch:{ all -> 0x0011 }
            n1.t0$c r10 = new n1.t0$c     // Catch:{ all -> 0x0011 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0011 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0011 }
            r3.<init>(r4)     // Catch:{ all -> 0x0011 }
            android.os.Handler r4 = r1.d()     // Catch:{ all -> 0x0011 }
            r10.<init>(r3, r4, r11)     // Catch:{ all -> 0x0011 }
            androidx.wear.watchface.control.b$a r11 = new androidx.wear.watchface.control.b$a     // Catch:{ all -> 0x0011 }
            r11.<init>(r10, r1)     // Catch:{ all -> 0x0011 }
            goto L_0x009b
        L_0x009a:
            r11 = r2
        L_0x009b:
            k3.j.n(r0, r2)
            return r11
        L_0x009f:
            throw r10     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r11 = move-exception
            k3.j.n(r0, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.b.c(android.content.ComponentName):androidx.wear.watchface.control.b$a");
    }

    public final <T> T h(ComponentName componentName, String str, l<? super a, ? extends T> lVar) {
        a c9;
        T t8;
        v1.c cVar = new v1.c(str);
        try {
            c9 = c(componentName);
            if (c9 != null) {
                t8 = lVar.invoke(c9);
                c9.f2256b.onDestroy();
                c9.f2255a.onDestroy();
            } else {
                t8 = null;
            }
            j.n(cVar, (Throwable) null);
            return t8;
        } catch (Throwable th) {
            j.n(cVar, th);
            throw th;
        }
    }
}
