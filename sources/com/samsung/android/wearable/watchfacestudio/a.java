package com.samsung.android.wearable.watchfacestudio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.appcompat.widget.p;
import com.samsung.android.wearable.watchfacestudio.editor.q;
import d6.f;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import n1.b0;
import n1.j0;
import n1.j1;
import n1.l;
import p6.g;
import q5.e;
import r5.h;
import r5.k;
import x0.a;

public final class a extends b0.a {
    public Boolean A;
    public Boolean B;
    public long C;
    public final c D;
    public p E;
    public boolean F = true;
    public k5.a G;
    public final BroadcastReceiver H = new C0045a();
    public final BroadcastReceiver I = new b();
    public final i5.c J = new i5.c(0, this);

    /* renamed from: p  reason: collision with root package name */
    public final Context f3843p;

    /* renamed from: q  reason: collision with root package name */
    public final j1 f3844q;
    public final l r;

    /* renamed from: s  reason: collision with root package name */
    public final u1.b f3845s;

    /* renamed from: t  reason: collision with root package name */
    public final h f3846t;

    /* renamed from: u  reason: collision with root package name */
    public final f7.a f3847u;

    /* renamed from: v  reason: collision with root package name */
    public final d f3848v;
    public final h6.a w;

    /* renamed from: x  reason: collision with root package name */
    public j5.a f3849x;
    public k y;

    /* renamed from: z  reason: collision with root package name */
    public e f3850z;

    /* renamed from: com.samsung.android.wearable.watchfacestudio.a$a  reason: collision with other inner class name */
    public class C0045a extends BroadcastReceiver {
        public C0045a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r13, android.content.Intent r14) {
            /*
                r12 = this;
                java.lang.String r13 = r14.getAction()
                if (r13 != 0) goto L_0x0007
                return
            L_0x0007:
                int r0 = r13.hashCode()
                r1 = -1
                r2 = 1
                r3 = 2
                r4 = 3
                r5 = 4
                r6 = 5
                r7 = 6
                r8 = 0
                switch(r0) {
                    case -2113217082: goto L_0x005a;
                    case -1335805824: goto L_0x004f;
                    case -543084576: goto L_0x0044;
                    case 824225419: goto L_0x0039;
                    case 1270223895: goto L_0x002e;
                    case 2040201125: goto L_0x0023;
                    case 2081916058: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x0065
            L_0x0018:
                java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_RESUME_VIEWER"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x0021
                goto L_0x0065
            L_0x0021:
                r13 = r7
                goto L_0x0066
            L_0x0023:
                java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_PAUSE_VIEWER"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x002c
                goto L_0x0065
            L_0x002c:
                r13 = r6
                goto L_0x0066
            L_0x002e:
                java.lang.String r0 = "com.samsung.watchface.debug.SET_DATA_VALUE"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x0037
                goto L_0x0065
            L_0x0037:
                r13 = r5
                goto L_0x0066
            L_0x0039:
                java.lang.String r0 = "com.samsung.watchface.debug.ENABLE_FPS"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x0042
                goto L_0x0065
            L_0x0042:
                r13 = r4
                goto L_0x0066
            L_0x0044:
                java.lang.String r0 = "com.samsung.watchface.ON_REQUEST_PERMISSION_RESULT"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x004d
                goto L_0x0065
            L_0x004d:
                r13 = r3
                goto L_0x0066
            L_0x004f:
                java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_RESUME_DATA_MANAGER"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x0058
                goto L_0x0065
            L_0x0058:
                r13 = r2
                goto L_0x0066
            L_0x005a:
                java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_DRAW_BOUNDS"
                boolean r13 = r13.equals(r0)
                if (r13 != 0) goto L_0x0063
                goto L_0x0065
            L_0x0063:
                r13 = r8
                goto L_0x0066
            L_0x0065:
                r13 = r1
            L_0x0066:
                java.lang.String r0 = "enabled"
                r9 = 0
                com.samsung.android.wearable.watchfacestudio.a r12 = com.samsung.android.wearable.watchfacestudio.a.this
                switch(r13) {
                    case 0: goto L_0x0232;
                    case 1: goto L_0x0208;
                    case 2: goto L_0x01c1;
                    case 3: goto L_0x0194;
                    case 4: goto L_0x0082;
                    case 5: goto L_0x0079;
                    case 6: goto L_0x0070;
                    default: goto L_0x006e;
                }
            L_0x006e:
                goto L_0x024f
            L_0x0070:
                r5.k r12 = r12.y
                if (r12 == 0) goto L_0x024f
                r12.g()
                goto L_0x024f
            L_0x0079:
                r5.k r12 = r12.y
                if (r12 == 0) goto L_0x024f
                r12.f()
                goto L_0x024f
            L_0x0082:
                r5.k r13 = r12.y
                if (r13 == 0) goto L_0x024f
                android.os.Bundle r13 = r14.getExtras()
                if (r13 != 0) goto L_0x008d
                return
            L_0x008d:
                java.lang.String r14 = "source"
                java.lang.String r14 = r13.getString(r14, r9)
                java.lang.String r0 = "value"
                java.lang.String r0 = r13.getString(r0, r9)
                java.lang.String r9 = "pause"
                boolean r13 = r13.getBoolean(r9, r8)
                if (r14 == 0) goto L_0x024f
                if (r0 == 0) goto L_0x024f
                r5.k r12 = r12.y
                v5.b r12 = r12.f7113k
                r12.getClass()
                w5.c r9 = new w5.c
                r9.<init>(r14)
                d6.b r10 = r12.d(r9)
                boolean r11 = w5.e.b(r9)
                if (r11 == 0) goto L_0x0183
                int r11 = r14.hashCode()
                switch(r11) {
                    case -2020697580: goto L_0x0103;
                    case -1852950412: goto L_0x00f8;
                    case -479390165: goto L_0x00ed;
                    case -199595423: goto L_0x00e2;
                    case 67452: goto L_0x00d7;
                    case 2719805: goto L_0x00cc;
                    case 73542240: goto L_0x00c1;
                    default: goto L_0x00c0;
                }
            L_0x00c0:
                goto L_0x010d
            L_0x00c1:
                java.lang.String r3 = "MONTH"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x00ca
                goto L_0x010d
            L_0x00ca:
                r1 = r7
                goto L_0x010d
            L_0x00cc:
                java.lang.String r3 = "YEAR"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x00d5
                goto L_0x010d
            L_0x00d5:
                r1 = r6
                goto L_0x010d
            L_0x00d7:
                java.lang.String r3 = "DAY"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x00e0
                goto L_0x010d
            L_0x00e0:
                r1 = r5
                goto L_0x010d
            L_0x00e2:
                java.lang.String r3 = "MILLISECOND"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x00eb
                goto L_0x010d
            L_0x00eb:
                r1 = r4
                goto L_0x010d
            L_0x00ed:
                java.lang.String r4 = "HOUR_0_23"
                boolean r14 = r14.equals(r4)
                if (r14 != 0) goto L_0x00f6
                goto L_0x010d
            L_0x00f6:
                r1 = r3
                goto L_0x010d
            L_0x00f8:
                java.lang.String r3 = "SECOND"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x0101
                goto L_0x010d
            L_0x0101:
                r1 = r2
                goto L_0x010d
            L_0x0103:
                java.lang.String r3 = "MINUTE"
                boolean r14 = r14.equals(r3)
                if (r14 != 0) goto L_0x010c
                goto L_0x010d
            L_0x010c:
                r1 = r8
            L_0x010d:
                switch(r1) {
                    case 0: goto L_0x0177;
                    case 1: goto L_0x016c;
                    case 2: goto L_0x0140;
                    case 3: goto L_0x0133;
                    case 4: goto L_0x0128;
                    case 5: goto L_0x011d;
                    case 6: goto L_0x0112;
                    default: goto L_0x0110;
                }
            L_0x0110:
                goto L_0x0183
            L_0x0112:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withMonth(r1)
                goto L_0x0181
            L_0x011d:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withYear(r1)
                goto L_0x0181
            L_0x0128:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withDayOfMonth(r1)
                goto L_0x0181
            L_0x0133:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                int r1 = r1 * 1000
                java.time.ZonedDateTime r14 = r14.withNano(r1)
                goto L_0x0181
            L_0x0140:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withHour(r1)
                r12.f7955d = r14
                w5.c r12 = new w5.c
                java.lang.String r14 = "AMPM_STATE"
                r12.<init>(r14)
                w5.f r14 = new w5.f
                int r1 = java.lang.Integer.parseInt(r0)
                r3 = 12
                if (r1 >= r3) goto L_0x015e
                r2 = r8
            L_0x015e:
                r14.<init>((int) r2)
                r10.f4055i = r8
                r10.o(r12, r14)
                r10.b()
                r10.f4055i = r13
                goto L_0x0183
            L_0x016c:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withSecond(r1)
                goto L_0x0181
            L_0x0177:
                java.time.ZonedDateTime r14 = r12.f7955d
                int r1 = java.lang.Integer.parseInt(r0)
                java.time.ZonedDateTime r14 = r14.withMinute(r1)
            L_0x0181:
                r12.f7955d = r14
            L_0x0183:
                w5.f r12 = new w5.f
                r12.<init>((java.lang.String) r0)
                r10.f4055i = r8
                r10.o(r9, r12)
                r10.b()
                r10.f4055i = r13
                goto L_0x024f
            L_0x0194:
                android.os.Bundle r13 = r14.getExtras()
                if (r13 != 0) goto L_0x019b
                return
            L_0x019b:
                boolean r13 = r13.getBoolean(r0, r8)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                java.lang.String r0 = "Show fps : "
                r14.<init>(r0)
                r14.append(r13)
                java.lang.String r14 = r14.toString()
                java.lang.String r0 = "DWF:WatchFaceRenderer"
                android.util.Log.i(r0, r14)
                if (r13 == 0) goto L_0x01bd
                k5.a r13 = new k5.a
                r13.<init>()
                r12.G = r13
                goto L_0x024f
            L_0x01bd:
                r12.G = r9
                goto L_0x024f
            L_0x01c1:
                androidx.appcompat.widget.p r12 = r12.E
                if (r12 == 0) goto L_0x024f
                java.lang.String r13 = "REQUEST_CODE"
                int r13 = r14.getIntExtra(r13, r1)
                java.lang.String r0 = "PERMISSIONS"
                java.lang.String[] r0 = r14.getStringArrayExtra(r0)
                java.lang.String r2 = "RESULTS"
                int[] r14 = r14.getIntArrayExtra(r2)
                if (r13 == r1) goto L_0x0200
                if (r0 == 0) goto L_0x0200
                if (r14 != 0) goto L_0x01de
                goto L_0x0200
            L_0x01de:
                java.lang.Object r1 = r12.f785b
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L_0x024f
                java.lang.Object r12 = r12.f785b
                java.util.Map r12 = (java.util.Map) r12
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Object r12 = r12.get(r13)
                r5.c r12 = (r5.c) r12
                if (r12 == 0) goto L_0x024f
                r12.a(r0, r14)
                goto L_0x024f
            L_0x0200:
                java.lang.String r12 = "DWF:PermissionHelper"
                java.lang.String r13 = "onRequestPermissionResult: invalid results"
                android.util.Log.w(r12, r13)
                goto L_0x024f
            L_0x0208:
                r5.k r12 = r12.y
                if (r12 == 0) goto L_0x024f
                v5.b r12 = r12.f7113k
                java.util.HashMap r13 = r12.f7953b
                java.util.Collection r13 = r13.values()
                java.util.Iterator r13 = r13.iterator()
            L_0x0218:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x022a
                java.lang.Object r14 = r13.next()
                d6.b r14 = (d6.b) r14
                r14.f4055i = r8
                r14.b()
                goto L_0x0218
            L_0x022a:
                d6.d r12 = r12.f7952a
                r12.f4055i = r8
                r12.b()
                goto L_0x024f
            L_0x0232:
                r5.k r13 = r12.y
                if (r13 == 0) goto L_0x024f
                android.os.Bundle r13 = r14.getExtras()
                if (r13 != 0) goto L_0x023d
                return
            L_0x023d:
                boolean r13 = r13.getBoolean(r0, r8)
                r5.k r12 = r12.y
                r12.getClass()
                o6.g.E = r13
                r5.d r12 = r12.f7114l
                if (r12 == 0) goto L_0x024f
                r12.c()
            L_0x024f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.a.C0045a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.TIME_SET".equals(intent.getAction())) {
                a aVar = a.this;
                j1 j1Var = aVar.f3844q;
                if (!j1Var.f5639j && j1Var.f5634d.getValue().booleanValue()) {
                    if (aVar.f3844q.f5632b.getValue().booleanValue()) {
                        k kVar = aVar.y;
                        if (kVar != null) {
                            kVar.h(ZonedDateTime.now());
                        }
                    } else {
                        e eVar = aVar.f3850z;
                        eVar.a(eVar.e, 60000);
                    }
                    k kVar2 = aVar.y;
                    if (kVar2 != null) {
                        r5.e eVar2 = kVar2.f7112j;
                        if (eVar2 != null && !eVar2.f7082m) {
                            g gVar = eVar2.f7073c;
                            if (gVar.f6351c.size() > 0) {
                                Log.w("DWF:FrameTimerVsync", "FrameTimer is restarted");
                                gVar.f6349a = 0;
                                gVar.f6350b = true;
                                gVar.f6354d.postFrameCallback(gVar.e);
                            }
                        }
                        v5.b bVar = kVar2.f7113k;
                        if (bVar != null) {
                            bVar.e();
                        }
                    }
                }
                f7.a aVar2 = aVar.f3847u;
                if (aVar2 != null) {
                    aVar2.s(Instant.now(), true);
                }
            }
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3853a = false;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f3854b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        public Timer f3855c;

        public c() {
        }
    }

    public interface d {
    }

    public a(Context context, SurfaceHolder surfaceHolder, l lVar, u1.b bVar, j1 j1Var, h hVar, f7.a aVar, c cVar) {
        super(surfaceHolder, bVar, j1Var);
        Boolean bool = Boolean.FALSE;
        this.A = bool;
        this.B = bool;
        this.f3843p = context;
        this.r = lVar;
        this.f3845s = bVar;
        this.f3844q = j1Var;
        this.f3846t = hVar;
        this.f3847u = aVar;
        this.f3848v = cVar;
        this.w = new h6.a(new i5.b(this));
        this.D = new c();
        Log.i("DWF:WatchFaceRenderer", String.format("WatchFaceRenderer create: headless(%s), renderer: %s", new Object[]{Boolean.valueOf(j1Var.f5639j), this}));
    }

    public final void a() {
        Log.i("DWF:WatchFaceRenderer", String.format("WatchFaceRenderer onDestroy: headless(%s), renderer: %s", new Object[]{Boolean.valueOf(this.f3844q.f5639j), this}));
        if (this.y != null) {
            j1 j1Var = this.f3844q;
            if (j1Var != null && !j1Var.f5639j) {
                this.f3843p.unregisterReceiver(this.I);
            }
            this.f3850z.b();
            c cVar = this.D;
            cVar.f3853a = false;
            Timer timer = cVar.f3855c;
            if (timer != null) {
                timer.cancel();
                cVar.f3855c = null;
            }
            this.y.a();
        }
        x0.a a9 = x0.a.a(this.f3843p);
        BroadcastReceiver broadcastReceiver = this.H;
        synchronized (a9.f8101b) {
            ArrayList remove = a9.f8101b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    a.c cVar2 = (a.c) remove.get(size);
                    cVar2.f8110d = true;
                    for (int i8 = 0; i8 < cVar2.f8107a.countActions(); i8++) {
                        String action = cVar2.f8107a.getAction(i8);
                        ArrayList arrayList = a9.f8102c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                a.c cVar3 = (a.c) arrayList.get(size2);
                                if (cVar3.f8108b == broadcastReceiver) {
                                    cVar3.f8110d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                a9.f8102c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean f() {
        return this.B.booleanValue() && (!this.A.booleanValue() || this.D.f3853a);
    }

    public final void l() {
        Log.i("DWF:WatchFaceRenderer", "State changed visible [ " + this.B + " ] ambient [ " + this.A + " ]");
        this.f3849x.s(f.b.f4083i, new w5.f((Object) this.A));
        this.f3849x.s(f.b.f4084j, new w5.f((Object) this.B));
        if (this.B.booleanValue()) {
            if (this.A.booleanValue()) {
                this.f3850z.b();
            } else {
                e eVar = this.f3850z;
                eVar.a(eVar.e, 60000);
            }
            this.y.g();
            return;
        }
        this.f3850z.b();
        this.y.f();
    }

    public final void m(Canvas canvas, Rect rect, int i8, n1.h hVar, x5.c cVar) {
        hVar.getClass();
        q7.k.e(rect, "screen");
        RectF rectF = new RectF(hVar.b(rect, false));
        RectF f9 = cVar.f8157l.f();
        float height = rectF.height() / f9.height();
        Path e = cVar.f8157l.e(5.0f);
        Matrix matrix = new Matrix();
        matrix.setScale(rectF.width() / f9.width(), height);
        e.transform(matrix);
        this.y.c(canvas, e, i8);
    }

    public final void n(boolean z8) {
        if (!this.A.equals(Boolean.valueOf(z8))) {
            this.A = Boolean.valueOf(z8);
            l();
            c cVar = this.D;
            k kVar = a.this.y;
            if (kVar.e && kVar.f7111i != z8) {
                kVar.f7111i = z8;
                v5.b bVar = kVar.f7113k;
                bVar.f(z8);
                if (!kVar.f7111i) {
                    bVar.i(ZonedDateTime.now());
                }
                kVar.f7112j.e(kVar.f7111i);
                kVar.f7114l.c();
            }
            cVar.f3853a = false;
            Timer timer = cVar.f3855c;
            if (timer != null) {
                timer.cancel();
                cVar.f3855c = null;
            }
            Timer timer2 = new Timer("AmbientTransition");
            cVar.f3855c = timer2;
            int i8 = r5.e.f7070o + 100;
            if (z8 && i8 > 132) {
                cVar.f3853a = true;
                timer2.schedule(new b(cVar), (long) i8);
            }
        }
    }

    public final void o() {
        boolean z8;
        s5.b bVar = this.y.f7112j.f7081l;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        ((List) bVar.f7210a.entrySet().stream().filter(new q(3)).collect(Collectors.toList())).forEach(new s5.a(0, arrayList));
        ArrayList arrayList2 = new ArrayList();
        arrayList.forEach(new i5.g(this, arrayList2, new AtomicInteger(19), 0));
        this.f5523k = arrayList2;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((Number) ((h7.d) it.next()).f4781f).intValue() >= 0) {
                z8 = true;
                continue;
            } else {
                z8 = false;
                continue;
            }
            if (!z8) {
                throw new IllegalArgumentException("Each accessibility label index in additionalContentDescriptionLabels must be >= 0".toString());
            }
        }
        j0 j0Var = this.e;
        if (j0Var != null) {
            j0Var.g();
        }
    }
}
