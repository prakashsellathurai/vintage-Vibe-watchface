package r5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.SystemClock;
import android.util.Log;
import android.util.SizeF;
import d6.a;
import g6.c;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import n6.d;
import n6.h;
import o6.t;
import o6.u;
import p6.g;
import s5.e;
import s5.i;
import s5.j0;
import t1.f;
import v5.b;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public SizeF f7104a = new SizeF(0.0f, 0.0f);

    /* renamed from: b  reason: collision with root package name */
    public final d f7105b = new d(1.0f, 1.0f);

    /* renamed from: c  reason: collision with root package name */
    public SizeF f7106c = new SizeF(0.0f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    public final PointF f7107d = new PointF(0.0f, 0.0f);
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public c f7108f;

    /* renamed from: g  reason: collision with root package name */
    public f f7109g;

    /* renamed from: h  reason: collision with root package name */
    public j0 f7110h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7111i;

    /* renamed from: j  reason: collision with root package name */
    public final e f7112j;

    /* renamed from: k  reason: collision with root package name */
    public final b f7113k;

    /* renamed from: l  reason: collision with root package name */
    public final d f7114l;

    /* renamed from: m  reason: collision with root package name */
    public a f7115m;

    /* renamed from: n  reason: collision with root package name */
    public e6.d f7116n;

    /* renamed from: o  reason: collision with root package name */
    public Paint f7117o = null;

    public k(Context context, d dVar, d6.f fVar, a aVar, f7.a aVar2, boolean z8) {
        e eVar = new e(context, dVar, z8 ? 3 : this.f7111i ? 2 : 1, aVar2 != null);
        this.f7112j = eVar;
        b bVar = new b(context, z8, new j(this));
        this.f7113k = bVar;
        this.f7114l = dVar;
        this.f7115m = aVar;
        HashMap hashMap = bVar.f7953b;
        if (aVar != null) {
            hashMap.remove("CONFIGURATION.");
            hashMap.put("CONFIGURATION.", aVar);
        }
        this.f7116n = aVar2;
        if (aVar2 != null) {
            hashMap.remove("COMPLICATION.");
            hashMap.put("COMPLICATION.", aVar2);
        }
        if (fVar != null) {
            hashMap.remove("STATE.");
            hashMap.put("STATE.", fVar);
            bVar.b(new w5.c("STATE.IS_DEVICE_LOCKED"), new i(this, 0));
            bVar.g(fVar.c(new w5.c("STATE.IS_DEVICE_LOCKED")).a());
            bVar.b(new w5.c("STATE.HIDE_INFORMATION"), new i(this, 1));
            bVar.h(fVar.c(new w5.c("STATE.HIDE_INFORMATION")).a());
        }
        eVar.f7077h = bVar;
        eVar.f7081l = new s5.b();
        h.e.put(h.b.f5971f, new h.a(Math.max(1, Runtime.getRuntime().availableProcessors() / 2)));
    }

    public static ZonedDateTime e(Instant instant) {
        ZonedDateTime now = ZonedDateTime.now();
        return ZonedDateTime.ofInstant(instant, TimeZone.getTimeZone("UTC").toZoneId()).withDayOfMonth(28).withMonth(now.getMonthValue()).withYear(now.getYear());
    }

    public final void a() {
        u uVar;
        t tVar;
        Log.i("DWF:WatchFaceViewer", "[" + hashCode() + "] destroy");
        b bVar = this.f7113k;
        for (d6.b a9 : bVar.f7953b.values()) {
            a9.a();
        }
        bVar.f7952a.a();
        j0 j0Var = this.f7110h;
        if (!(j0Var == null || (uVar = j0Var.f7238b) == null || (tVar = uVar.f6183d) == null)) {
            tVar.r();
        }
        if (this.e) {
            e eVar = this.f7112j;
            g gVar = eVar.f7073c;
            gVar.f6350b = false;
            gVar.f6354d.removeFrameCallback(gVar.e);
            Log.w("DWF:FrameTimerVsync", "FrameTimer is reset");
            eVar.f(false);
            j6.b bVar2 = eVar.f7078i;
            if (bVar2 != null) {
                l6.a aVar = bVar2.f5041h.f5206a;
                aVar.f5323a.clear();
                aVar.f5324b.clear();
                aVar.e = 0;
                eVar.f7078i.f5041h.f5206a.f5320f = null;
            }
            i iVar = eVar.f7080k;
            if (iVar != null) {
                iVar.f7232a.clear();
            }
            s5.b bVar3 = eVar.f7081l;
            if (bVar3 != null) {
                bVar3.f7210a.clear();
            }
            eVar.f7075f.clear();
            eVar.e.clear();
        }
        h.a(h.b.f5971f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x025d, code lost:
        if (s.g.a(r3.f7072b, 1) != false) goto L_0x0261;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.graphics.Canvas r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r0.e
            if (r2 != 0) goto L_0x0009
            return
        L_0x0009:
            android.util.SizeF r2 = r0.f7104a
            float r2 = r2.getWidth()
            int r3 = r26.getWidth()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            android.graphics.PointF r3 = r0.f7107d
            r4 = 1
            r5 = 2
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            r8 = 0
            if (r2 != 0) goto L_0x002f
            android.util.SizeF r2 = r0.f7104a
            float r2 = r2.getHeight()
            int r9 = r26.getHeight()
            float r9 = (float) r9
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0180
        L_0x002f:
            r2 = 5
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r10 = r25.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r7] = r10
            android.util.SizeF r10 = r0.f7104a
            float r10 = r10.getWidth()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r9[r4] = r10
            android.util.SizeF r10 = r0.f7104a
            float r10 = r10.getHeight()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r9[r5] = r10
            int r10 = r26.getWidth()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 3
            r9[r11] = r10
            int r10 = r26.getHeight()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = 4
            r9[r12] = r10
            java.lang.String r10 = "[%d] project %.1f x %.1f, canvas %d x %d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            java.lang.String r10 = "DWF:WatchFaceViewer"
            android.util.Log.i(r10, r9)
            android.util.SizeF r9 = new android.util.SizeF
            int r13 = r26.getWidth()
            float r13 = (float) r13
            int r14 = r26.getHeight()
            float r14 = (float) r14
            r9.<init>(r13, r14)
            r0.f7104a = r9
            float r9 = r9.getWidth()
            g6.c r13 = r0.f7108f
            int r13 = r13.e
            float r13 = (float) r13
            float r9 = r9 / r13
            android.util.SizeF r13 = r0.f7104a
            float r13 = r13.getHeight()
            g6.c r14 = r0.f7108f
            int r14 = r14.f4674f
            float r14 = (float) r14
            float r13 = r13 / r14
            float r14 = java.lang.Math.min(r9, r13)
            n6.d r15 = r0.f7105b
            r15.f5961a = r14
            r15.f5962b = r14
            android.util.SizeF r12 = new android.util.SizeF
            g6.c r11 = r0.f7108f
            int r5 = r11.e
            float r5 = (float) r5
            float r5 = r5 * r14
            int r11 = r11.f4674f
            float r11 = (float) r11
            float r11 = r11 * r14
            r12.<init>(r5, r11)
            r0.f7106c = r12
            int r5 = java.lang.Float.compare(r9, r13)
            if (r5 == 0) goto L_0x00dd
            android.util.SizeF r5 = r0.f7104a
            float r5 = r5.getWidth()
            android.util.SizeF r9 = r0.f7106c
            float r9 = r9.getWidth()
            float r5 = r5 - r9
            float r5 = r5 * r6
            android.util.SizeF r9 = r0.f7104a
            float r9 = r9.getHeight()
            android.util.SizeF r11 = r0.f7106c
            float r11 = r11.getHeight()
            float r9 = r9 - r11
            float r9 = r9 * r6
            r3.set(r5, r9)
            goto L_0x00e0
        L_0x00dd:
            r3.set(r8, r8)
        L_0x00e0:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r5 = r25.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r7] = r5
            float r5 = r15.f5961a
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2[r4] = r5
            float r5 = r15.f5962b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9 = 2
            r2[r9] = r5
            float r5 = r3.x
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9 = 3
            r2[r9] = r5
            float r5 = r3.y
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9 = 4
            r2[r9] = r5
            java.lang.String r5 = "[%d] draw: update scale: %f/%f translate %f/%f"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            android.util.Log.i(r10, r2)
            s5.j0 r2 = r0.f7110h
            java.util.ArrayList<o6.u> r2 = r2.f7237a
            java.util.Iterator r2 = r2.iterator()
        L_0x0120:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r2.next()
            o6.u r5 = (o6.u) r5
            r5.getClass()
            float r9 = r15.f5961a
            float r10 = r15.f5962b
            n6.d r11 = r5.e
            r11.f5961a = r9
            r11.f5962b = r10
            float r9 = r15.f5961a
            float r10 = r15.f5962b
            o6.t r5 = r5.f6183d
            r5.O(r9, r10)
            goto L_0x0120
        L_0x0143:
            s5.j0 r2 = r0.f7110h
            java.util.ArrayList<o6.u> r2 = r2.f7237a
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0166
            java.lang.Object r5 = r2.next()
            o6.u r5 = (o6.u) r5
            r5.getClass()
            float r9 = r3.x
            float r10 = r3.y
            o6.t r5 = r5.f6183d
            android.graphics.PointF r5 = r5.J
            r5.set(r9, r10)
            goto L_0x014b
        L_0x0166:
            s5.j0 r2 = r0.f7110h
            o6.u r2 = r2.f7238b
            o6.t r2 = r2.f6183d
            r2.getClass()
            androidx.health.services.client.impl.d r5 = new androidx.health.services.client.impl.d
            r9 = 12
            r5.<init>(r9)
            com.samsung.android.wearable.watchfacestudio.editor.q r9 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r10 = 16
            r9.<init>(r10)
            r2.m(r5, r9)
        L_0x0180:
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            g6.c r5 = r0.f7108f
            g6.a r5 = r5.f4675g
            int r5 = r5.ordinal()
            if (r5 == r4) goto L_0x01f1
            r9 = 2
            if (r5 == r9) goto L_0x0194
            goto L_0x021e
        L_0x0194:
            g6.c r5 = r0.f7108f
            float r5 = r5.f4676h
            int r5 = java.lang.Float.compare(r5, r8)
            if (r5 == 0) goto L_0x01d4
            g6.c r5 = r0.f7108f
            float r5 = r5.f4677i
            int r5 = java.lang.Float.compare(r5, r8)
            if (r5 == 0) goto L_0x01d4
            float r5 = r3.x
            float r6 = r3.y
            android.util.SizeF r9 = r0.f7106c
            float r9 = r9.getWidth()
            float r20 = r5 + r9
            float r3 = r3.y
            android.util.SizeF r9 = r0.f7106c
            float r9 = r9.getHeight()
            float r21 = r3 + r9
            g6.c r3 = r0.f7108f
            float r9 = r3.f4676h
            float r3 = r3.f4677i
            android.graphics.Path$Direction r24 = android.graphics.Path.Direction.CCW
            r17 = r2
            r18 = r5
            r19 = r6
            r22 = r9
            r23 = r3
            r17.addRoundRect(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x021b
        L_0x01d4:
            float r12 = r3.x
            float r13 = r3.y
            android.util.SizeF r5 = r0.f7106c
            float r5 = r5.getWidth()
            float r14 = r12 + r5
            float r3 = r3.y
            android.util.SizeF r5 = r0.f7106c
            float r5 = r5.getHeight()
            float r15 = r5 + r3
            android.graphics.Path$Direction r16 = android.graphics.Path.Direction.CCW
            r11 = r2
            r11.addRect(r12, r13, r14, r15, r16)
            goto L_0x021b
        L_0x01f1:
            android.util.SizeF r5 = r0.f7106c
            float r5 = r5.getWidth()
            float r5 = r5 * r6
            float r9 = r3.x
            float r5 = r5 + r9
            android.util.SizeF r9 = r0.f7106c
            float r9 = r9.getHeight()
            float r9 = r9 * r6
            float r3 = r3.y
            float r9 = r9 + r3
            android.util.SizeF r3 = r0.f7106c
            float r3 = r3.getWidth()
            android.util.SizeF r10 = r0.f7106c
            float r10 = r10.getHeight()
            float r3 = java.lang.Math.min(r3, r10)
            float r3 = r3 * r6
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CCW
            r2.addCircle(r5, r9, r3, r6)
        L_0x021b:
            r1.clipPath(r2)
        L_0x021e:
            s5.j0 r2 = r0.f7110h
            o6.u r3 = r2.f7238b
            o6.v r5 = r3.f6182c
            r5.getClass()
            o6.v$a r6 = o6.v.a.f6185h
            w5.f r5 = r5.b(r6)
            int r5 = r5.e()
            r1.drawColor(r5)
            androidx.health.services.client.impl.i r5 = new androidx.health.services.client.impl.i
            r6 = 8
            r5.<init>(r6, r1)
            com.samsung.android.wearable.watchfacestudio.editor.q r6 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r9 = 17
            r6.<init>(r9)
            o6.t r3 = r3.f6183d
            r3.m(r5, r6)
            u5.b r3 = r2.f7240d
            boolean r3 = r3 instanceof u5.d
            if (r3 == 0) goto L_0x0260
            r5.e r3 = r2.f7239c
            boolean r5 = r3.f7083n
            if (r5 == 0) goto L_0x0260
            boolean r5 = r3.f7082m
            if (r5 != 0) goto L_0x0260
            int r3 = r3.f7072b
            boolean r3 = s.g.a(r3, r4)
            if (r3 == 0) goto L_0x0260
            goto L_0x0261
        L_0x0260:
            r4 = r7
        L_0x0261:
            if (r4 == 0) goto L_0x0277
            u5.b r2 = r2.f7240d
            u5.d r2 = (u5.d) r2
            u5.d$b r2 = r2.e
            boolean r3 = r2.f7795b
            if (r3 != 0) goto L_0x026e
            goto L_0x0277
        L_0x026e:
            r26.save()
            r2.a(r1)
            r26.restore()
        L_0x0277:
            r5.e r0 = r0.f7112j
            boolean r0 = r0.f7082m
            if (r0 == 0) goto L_0x028d
            r0 = 1041865114(0x3e19999a, float:0.15)
            android.graphics.Color r0 = android.graphics.Color.valueOf(r8, r8, r8, r0)
            int r0 = r0.toArgb()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            r1.drawColor(r0, r2)
        L_0x028d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.k.b(android.graphics.Canvas):void");
    }

    public final void c(Canvas canvas, Path path, int i8) {
        if (this.f7117o == null) {
            Paint paint = new Paint(1);
            this.f7117o = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f7117o.setStrokeWidth(5.0f);
        }
        this.f7117o.setColor(i8);
        canvas.drawPath(path, this.f7117o);
    }

    public final void d(h hVar, boolean z8) {
        if (!hVar.f7100n) {
            Log.w("DWF:WatchFaceViewer", "load: document isn't valid");
            return;
        }
        if (this.e) {
            f();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f7111i = z8;
        e eVar = this.f7112j;
        eVar.e(z8);
        j6.b bVar = hVar.e;
        eVar.f7078i = bVar;
        if (hVar.f7097k == null) {
            hVar.f7097k = i6.g.b(hVar.f7099m, "BitmapFonts");
        }
        eVar.f7079j = new e(hVar.f7097k, bVar);
        this.f7108f = hVar.c();
        c cVar = this.f7108f;
        SizeF sizeF = new SizeF((float) cVar.e, (float) cVar.f4674f);
        this.f7104a = sizeF;
        d dVar = this.f7105b;
        dVar.f5961a = 1.0f;
        dVar.f5962b = 1.0f;
        this.f7106c = sizeF;
        this.f7107d.set(0.0f, 0.0f);
        this.f7109g = hVar.f7096j;
        if (!(this.f7116n == null && this.f7115m == null) && hVar.b().size() > 0) {
            eVar.f7080k = new i(eVar);
        }
        if (hVar.f7098l == null) {
            hVar.f7098l = i6.g.b(hVar.f7099m, "Scene");
        }
        ArrayList arrayList = hVar.f7098l;
        c cVar2 = this.f7108f;
        this.f7110h = new j0(eVar, arrayList, cVar2.e, cVar2.f4674f);
        b bVar2 = this.f7113k;
        for (d6.b f9 : bVar2.f7953b.values()) {
            f9.f();
        }
        bVar2.f7952a.f();
        bVar2.f(this.f7111i);
        if (this.f7111i) {
            h(ZonedDateTime.now());
        }
        this.e = true;
        this.f7114l.c();
        Log.i("DWF:WatchFaceViewer", String.format("[%d] loading time(%s): %d isAmbient(%b)", new Object[]{Integer.valueOf(hashCode()), hVar.f7091d, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Boolean.valueOf(this.f7111i)}));
    }

    public final void f() {
        Log.i("DWF:WatchFaceViewer", "[" + hashCode() + "] pause");
        b bVar = this.f7113k;
        for (d6.b bVar2 : bVar.f7953b.values()) {
            if (bVar2.f4048a != 2) {
                bVar2.f4048a = 2;
                bVar2.m();
            }
        }
        d6.d dVar = bVar.f7952a;
        if (dVar.f4048a != 2) {
            dVar.f4048a = 2;
            dVar.m();
        }
        if (this.e) {
            this.f7112j.f(false);
        }
        h.a(h.b.f5971f);
    }

    public final void g() {
        Log.i("DWF:WatchFaceViewer", "[" + hashCode() + "] resume");
        b bVar = this.f7113k;
        for (d6.b bVar2 : bVar.f7953b.values()) {
            if (bVar2.f4048a != 3) {
                bVar2.f4048a = 3;
                if (!bVar2.e) {
                    bVar2.b();
                }
                bVar2.n();
            }
        }
        d6.d dVar = bVar.f7952a;
        if (dVar.f4048a != 3) {
            dVar.f4048a = 3;
            if (!dVar.e) {
                dVar.b();
            }
            dVar.n();
        }
        if (this.e) {
            this.f7112j.f(true);
        }
    }

    public final void h(ZonedDateTime zonedDateTime) {
        b bVar = this.f7113k;
        if (bVar != null) {
            e6.d dVar = this.f7116n;
            if (dVar != null) {
                dVar.s(zonedDateTime.toInstant(), false);
            }
            bVar.i(zonedDateTime);
        }
    }
}
