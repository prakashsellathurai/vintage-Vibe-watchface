package androidx.wear.watchface.control;

import android.app.Service;
import android.content.ComponentName;
import android.util.Log;
import androidx.wear.watchface.control.a;
import androidx.wear.watchface.control.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import n1.t;
import n1.t0;
import q7.k;

public class WatchFaceControlService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public b f2241a;

    public static t0 b(ComponentName componentName) {
        k.e(componentName, "watchFaceName");
        try {
            Class<?> cls = Class.forName(componentName.getClassName());
            if (!t0.class.isAssignableFrom(cls)) {
                return null;
            }
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            k.c(newInstance, "null cannot be cast to non-null type androidx.wear.watchface.WatchFaceService");
            return (t0) newInstance;
        } catch (ClassNotFoundException e) {
            Log.w("IWatchFaceInstanceServiceStub", "createWatchFaceService failed for " + componentName, e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        k3.j.n(r0, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.wear.watchface.control.b a() {
        /*
            r6 = this;
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceControlService.createServiceStub"
            r0.<init>(r1)
            androidx.wear.watchface.control.b r1 = new androidx.wear.watchface.control.b     // Catch:{ all -> 0x0023 }
            c8.c r2 = new c8.c     // Catch:{ all -> 0x0023 }
            y7.o1 r3 = new y7.o1     // Catch:{ all -> 0x0023 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x0023 }
            d8.c r5 = y7.l0.f8580a     // Catch:{ all -> 0x0023 }
            y7.g1 r5 = c8.m.f2865a     // Catch:{ all -> 0x0023 }
            j7.f r3 = r3.t(r5)     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0023 }
            k3.j.n(r0, r4)
            return r1
        L_0x0023:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            k3.j.n(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.WatchFaceControlService.a():androidx.wear.watchface.control.b");
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        k.e(fileDescriptor, "fd");
        k.e(printWriter, "writer");
        k.e(strArr, "args");
        t tVar = new t(printWriter);
        tVar.println("WatchFaceControlService:");
        HashMap<String, h.c> hashMap = h.f2292a;
        h.a.b(tVar);
        HashSet<a> hashSet = a.f2242c;
        a.b.a(tVar);
        tVar.f5729b.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        k3.j.n(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceControlService.onBind"
            r0.<init>(r1)
            java.lang.String r1 = "com.google.android.wearable.action.WATCH_FACE_CONTROL"
            r2 = 0
            if (r4 == 0) goto L_0x0011
            java.lang.String r4 = r4.getAction()     // Catch:{ all -> 0x002a }
            goto L_0x0012
        L_0x0011:
            r4 = r2
        L_0x0012:
            boolean r4 = q7.k.a(r1, r4)     // Catch:{ all -> 0x002a }
            if (r4 == 0) goto L_0x0025
            androidx.wear.watchface.control.b r4 = r3.f2241a     // Catch:{ all -> 0x002a }
            if (r4 != 0) goto L_0x0022
            androidx.wear.watchface.control.b r4 = r3.a()     // Catch:{ all -> 0x002a }
            r3.f2241a = r4     // Catch:{ all -> 0x002a }
        L_0x0022:
            androidx.wear.watchface.control.b r3 = r3.f2241a     // Catch:{ all -> 0x002a }
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            k3.j.n(r0, r2)
            return r3
        L_0x002a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002c }
        L_0x002c:
            r4 = move-exception
            k3.j.n(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.WatchFaceControlService.onBind(android.content.Intent):android.os.IBinder");
    }

    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.f2241a;
        if (bVar != null) {
            bVar.f2253a = null;
        }
    }
}
