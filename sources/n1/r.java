package n1;

import android.content.Context;
import android.os.IBinder;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import h7.h;
import p7.p;
import q7.k;
import q7.l;
import r1.k0;

public final class r {

    public static final class a extends l implements p<SurfaceHolder, WatchFaceRenderParams, h> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p0 f5708f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p0 p0Var) {
            super(2);
            this.f5708f = p0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
            k3.j.o(r1, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
            throw r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object g(java.lang.Object r9, java.lang.Object r10) {
            /*
                r8 = this;
                android.view.SurfaceHolder r9 = (android.view.SurfaceHolder) r9
                androidx.wear.watchface.control.data.WatchFaceRenderParams r10 = (androidx.wear.watchface.control.data.WatchFaceRenderParams) r10
                java.lang.String r0 = "surfaceHolder"
                q7.k.e(r9, r0)
                java.lang.String r0 = "params"
                q7.k.e(r10, r0)
                long r0 = r10.f2286g
                java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
                androidx.wear.watchface.style.data.UserStyleWireFormat r1 = r10.f2287h
                n1.p0 r8 = r8.f5708f
                r2 = 0
                if (r1 == 0) goto L_0x002a
                u1.e r3 = new u1.e
                u1.f r4 = new u1.f
                r4.<init>((androidx.wear.watchface.style.data.UserStyleWireFormat) r1)
                u1.b r1 = r8.f5685c
                u1.l r1 = r1.f7605a
                r3.<init>(r4, r1)
                goto L_0x002b
            L_0x002a:
                r3 = r2
            L_0x002b:
                java.util.List<androidx.wear.watchface.data.IdAndComplicationDataWireFormat> r1 = r10.f2288i
                if (r1 == 0) goto L_0x0067
                int r4 = i7.f.M(r1)
                int r4 = a1.a.C(r4)
                r5 = 16
                if (r4 >= r5) goto L_0x003c
                r4 = r5
            L_0x003c:
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>(r4)
                java.util.Iterator r1 = r1.iterator()
            L_0x0045:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x0068
                java.lang.Object r4 = r1.next()
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r4 = (androidx.wear.watchface.data.IdAndComplicationDataWireFormat) r4
                int r6 = r4.f2341f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                android.support.wearable.complications.ComplicationData r4 = r4.f2342g
                java.lang.String r7 = "it.complicationData"
                q7.k.d(r4, r7)
                r7 = 0
                q1.b r4 = q1.e.i(r4, r7)
                r5.put(r6, r4)
                goto L_0x0045
            L_0x0067:
                r5 = r2
            L_0x0068:
                java.lang.String r1 = "instant"
                q7.k.d(r0, r1)
                java.lang.AutoCloseable r1 = r8.k(r3, r5, r0)
                n1.b0 r8 = r8.f5692k     // Catch:{ all -> 0x0099 }
                java.lang.String r3 = "UTC"
                java.time.ZoneId r3 = java.time.ZoneId.of(r3)     // Catch:{ all -> 0x0099 }
                java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofInstant(r0, r3)     // Catch:{ all -> 0x0099 }
                java.lang.String r3 = "ofInstant(instant, ZoneId.of(\"UTC\"))"
                q7.k.d(r0, r3)     // Catch:{ all -> 0x0099 }
                n1.z r3 = new n1.z     // Catch:{ all -> 0x0099 }
                androidx.wear.watchface.data.RenderParametersWireFormat r10 = r10.f2285f     // Catch:{ all -> 0x0099 }
                java.lang.String r4 = "params.renderParametersWireFormat"
                q7.k.d(r10, r4)     // Catch:{ all -> 0x0099 }
                r3.<init>(r10)     // Catch:{ all -> 0x0099 }
                r8.d(r0, r3, r9)     // Catch:{ all -> 0x0099 }
                h7.h r8 = h7.h.f4787a     // Catch:{ all -> 0x0099 }
                k3.j.o(r1, r2)
                h7.h r8 = h7.h.f4787a
                return r8
            L_0x0099:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x009b }
            L_0x009b:
                r9 = move-exception
                k3.j.o(r1, r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.r.a.g(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static k0 a(j0 j0Var, p0 p0Var, IBinder iBinder, int i8, int i9) {
        k.e(j0Var, "watchFaceHostApi");
        k.e(p0Var, "watchFaceImpl");
        Context a9 = j0Var.a();
        SurfaceControlViewHost surfaceControlViewHost = new SurfaceControlViewHost(a9, ((WindowManager) a9.getSystemService(WindowManager.class)).getDefaultDisplay(), iBinder);
        SurfaceView surfaceView = new SurfaceView(a9);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 16777216, -3);
        layoutParams.setTitle("RemoteWatchFaceView");
        surfaceView.setLayoutParams(layoutParams);
        surfaceControlViewHost.setView(surfaceView, i8, i9);
        return new k0(surfaceView, surfaceControlViewHost, j0Var.e(), new a(p0Var));
    }
}
