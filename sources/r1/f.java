package r1;

import android.os.Bundle;
import androidx.wear.watchface.control.data.ComplicationRenderParams;
import n1.p0;
import q7.l;

public final class f extends l implements p7.l<p0, Bundle> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ComplicationRenderParams f6700f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ComplicationRenderParams complicationRenderParams) {
        super(1);
        this.f6700f = complicationRenderParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0100, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        k3.j.o(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0104, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            n1.p0 r11 = (n1.p0) r11
            java.lang.String r0 = "it"
            q7.k.e(r11, r0)
            java.lang.String r0 = "params"
            androidx.wear.watchface.control.data.ComplicationRenderParams r10 = r10.f6700f
            q7.k.e(r10, r0)
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceImpl.renderComplicationToBitmap"
            r0.<init>(r1)
            n1.l r1 = r11.f5686d     // Catch:{ all -> 0x0058 }
            int r2 = r10.f2260f     // Catch:{ all -> 0x0058 }
            java.util.LinkedHashMap r1 = r1.e     // Catch:{ all -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0058 }
            n1.h r1 = (n1.h) r1     // Catch:{ all -> 0x0058 }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            r1 = r2
            goto L_0x00fa
        L_0x002b:
            androidx.wear.watchface.style.data.UserStyleWireFormat r3 = r10.f2264j     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x003e
            u1.e r4 = new u1.e     // Catch:{ all -> 0x0058 }
            u1.f r5 = new u1.f     // Catch:{ all -> 0x0058 }
            r5.<init>((androidx.wear.watchface.style.data.UserStyleWireFormat) r3)     // Catch:{ all -> 0x0058 }
            u1.b r3 = r11.f5685c     // Catch:{ all -> 0x0058 }
            u1.l r3 = r3.f7605a     // Catch:{ all -> 0x0058 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0058 }
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            android.support.wearable.complications.ComplicationData r3 = r10.f2263i     // Catch:{ all -> 0x0058 }
            r5 = 0
            if (r3 == 0) goto L_0x005b
            int r6 = r10.f2260f     // Catch:{ all -> 0x0058 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0058 }
            q1.b r3 = q1.e.i(r3, r5)     // Catch:{ all -> 0x0058 }
            java.util.Map r3 = java.util.Collections.singletonMap(r6, r3)     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = "singletonMap(pair.first, pair.second)"
            q7.k.d(r3, r6)     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r10 = move-exception
            goto L_0x0105
        L_0x005b:
            r3 = r2
        L_0x005c:
            long r6 = r10.f2262h     // Catch:{ all -> 0x0058 }
            java.time.Instant r6 = java.time.Instant.ofEpochMilli(r6)     // Catch:{ all -> 0x0058 }
            java.lang.String r7 = "ofEpochMilli(params.calendarTimeMillis)"
            q7.k.d(r6, r7)     // Catch:{ all -> 0x0058 }
            java.lang.AutoCloseable r11 = r11.k(r4, r3, r6)     // Catch:{ all -> 0x0058 }
            long r3 = r10.f2262h     // Catch:{ all -> 0x00fe }
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r3)     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "UTC"
            java.time.ZoneId r4 = java.time.ZoneId.of(r4)     // Catch:{ all -> 0x00fe }
            java.time.ZonedDateTime r3 = java.time.ZonedDateTime.ofInstant(r3, r4)     // Catch:{ all -> 0x00fe }
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ all -> 0x00fe }
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x00fe }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x00fe }
            int r6 = r6.widthPixels     // Catch:{ all -> 0x00fe }
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x00fe }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x00fe }
            int r7 = r7.heightPixels     // Catch:{ all -> 0x00fe }
            r4.<init>(r5, r5, r6, r7)     // Catch:{ all -> 0x00fe }
            android.graphics.RectF r6 = n1.h.G     // Catch:{ all -> 0x00fe }
            android.graphics.Rect r4 = r1.b(r4, r5)     // Catch:{ all -> 0x00fe }
            android.graphics.Picture r6 = new android.graphics.Picture     // Catch:{ all -> 0x00fe }
            r6.<init>()     // Catch:{ all -> 0x00fe }
            n1.e r1 = r1.c()     // Catch:{ all -> 0x00fe }
            int r7 = r4.width()     // Catch:{ all -> 0x00fe }
            int r8 = r4.height()     // Catch:{ all -> 0x00fe }
            android.graphics.Canvas r7 = r6.beginRecording(r7, r8)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = "picture.beginRecording(b…width(), bounds.height())"
            q7.k.d(r7, r8)     // Catch:{ all -> 0x00fe }
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ all -> 0x00fe }
            int r8 = r4.width()     // Catch:{ all -> 0x00fe }
            int r9 = r4.height()     // Catch:{ all -> 0x00fe }
            r7.<init>(r5, r5, r8, r9)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = "zonedDateTime"
            q7.k.d(r3, r5)     // Catch:{ all -> 0x00fe }
            n1.z r3 = new n1.z     // Catch:{ all -> 0x00fe }
            androidx.wear.watchface.data.RenderParametersWireFormat r10 = r10.f2261g     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = "params.renderParametersWireFormat"
            q7.k.d(r10, r5)     // Catch:{ all -> 0x00fe }
            r3.<init>(r10)     // Catch:{ all -> 0x00fe }
            r1.d()     // Catch:{ all -> 0x00fe }
            r6.endRecording()     // Catch:{ all -> 0x00fe }
            int r10 = r4.width()     // Catch:{ all -> 0x00fe }
            int r1 = r4.height()     // Catch:{ all -> 0x00fe }
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "config"
            q7.k.e(r3, r4)     // Catch:{ all -> 0x00fe }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r6, r10, r1, r3)     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = "createBitmap(picture, width, height, config)"
            q7.k.d(r10, r1)     // Catch:{ all -> 0x00fe }
            android.os.Bundle r1 = a.b.a(r10)     // Catch:{ all -> 0x00fe }
            r10.recycle()     // Catch:{ all -> 0x00fe }
            k3.j.o(r11, r2)     // Catch:{ all -> 0x0058 }
        L_0x00fa:
            k3.j.n(r0, r2)
            return r1
        L_0x00fe:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r1 = move-exception
            k3.j.o(r11, r10)     // Catch:{ all -> 0x0058 }
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0105:
            throw r10     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r11 = move-exception
            k3.j.n(r0, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.f.invoke(java.lang.Object):java.lang.Object");
    }
}
