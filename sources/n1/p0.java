package n1;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.health.services.client.impl.i;
import androidx.wear.watchface.ComplicationHelperActivity;
import androidx.wear.watchface.control.h;
import c8.m;
import com.samsung.android.wearable.watchfacestudio.WatchFaceStudioRuntime;
import h7.d;
import java.security.InvalidParameterException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k3.j;
import n1.i0;
import n1.l;
import n1.t0;
import n1.z;
import q7.k;
import r1.h0;
import t1.v;
import u1.b;
import u1.e;
import u1.l;
import u1.s;
import v1.c;
import y7.a0;
import y7.g1;
import y7.l0;
import y7.n;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f5683a;

    /* renamed from: b  reason: collision with root package name */
    public final j1 f5684b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5685c;

    /* renamed from: d  reason: collision with root package name */
    public final l f5686d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public c f5687f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5688g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<s, z> f5689h;

    /* renamed from: i  reason: collision with root package name */
    public final t0.d f5690i;

    /* renamed from: j  reason: collision with root package name */
    public final i0.c f5691j;

    /* renamed from: k  reason: collision with root package name */
    public final b0 f5692k;

    /* renamed from: l  reason: collision with root package name */
    public final i0.e f5693l;

    /* renamed from: m  reason: collision with root package name */
    public final i0.d f5694m;

    /* renamed from: n  reason: collision with root package name */
    public final x f5695n;

    /* renamed from: o  reason: collision with root package name */
    public Integer f5696o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5697p;

    /* renamed from: q  reason: collision with root package name */
    public long f5698q;
    public long r;

    /* renamed from: s  reason: collision with root package name */
    public final ComponentName f5699s;

    /* renamed from: t  reason: collision with root package name */
    public final DisplayManager f5700t;

    /* renamed from: u  reason: collision with root package name */
    public final DisplayManager.DisplayListener f5701u;

    /* renamed from: v  reason: collision with root package name */
    public final Instant f5702v;
    public boolean w;

    public final class a implements i0.b {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.wear.watchface.control.a f5703a;

        public a(androidx.wear.watchface.control.a aVar) {
            this.f5703a = aVar;
        }

        @SuppressLint({"NewApi"})
        public final void a() {
            t0.c cVar;
            c cVar2 = new c("WFEditorDelegate.onDestroy");
            p0 p0Var = p0.this;
            try {
                HashMap<String, h.c> hashMap = h.f2292a;
                h0 c9 = h.a.c();
                if (!(c9 == null || (cVar = c9.f6708a) == null)) {
                    p0 z8 = cVar.z();
                    if (z8 != null) {
                        z8.f5688g = false;
                        z8.j();
                    }
                }
                if (p0Var.f5684b.f5639j) {
                    androidx.wear.watchface.control.a aVar = this.f5703a;
                    k.b(aVar);
                    aVar.c();
                    p0Var.d();
                }
                h7.h hVar = h7.h.f4787a;
                j.n(cVar2, (Throwable) null);
            } catch (Throwable th) {
                j.n(cVar2, th);
                throw th;
            }
        }

        public final e b() {
            return (e) p0.this.f5685c.f7606b.getValue();
        }

        public final Handler c() {
            return p0.this.f5683a.c();
        }

        public final void d(boolean z8) {
            t0.c cVar;
            p0 z9;
            HashMap<String, h.c> hashMap = h.f2292a;
            h0 c9 = h.a.c();
            if (c9 != null && (cVar = c9.f6708a) != null && (z9 = cVar.z()) != null) {
                z9.f5688g = z8;
                if (!z8) {
                    z9.j();
                }
            }
        }

        public final l e() {
            return p0.this.f5685c.f7605a;
        }

        public final Instant f() {
            return p0.this.f5702v;
        }

        public final void g(v vVar) {
            p0.this.f5686d.getClass();
        }

        public final void h(e eVar) {
            p0.this.f5685c.a(eVar);
        }

        public final l i() {
            return p0.this.f5686d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            k3.j.o(r6, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            k3.j.n(r0, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            throw r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap j(n1.z r4, java.time.Instant r5, java.util.Map<java.lang.Integer, ? extends q1.b> r6) {
            /*
                r3 = this;
                java.lang.String r0 = "instant"
                q7.k.e(r5, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "WFEditorDelegate.takeScreenshot"
                r0.<init>(r1)
                n1.p0 r3 = n1.p0.this
                r1 = 0
                if (r6 == 0) goto L_0x001a
                n1.l r2 = r3.f5686d     // Catch:{ all -> 0x0018 }
                java.lang.AutoCloseable r6 = r2.g(r6, r5)     // Catch:{ all -> 0x0018 }
                goto L_0x001b
            L_0x0018:
                r3 = move-exception
                goto L_0x003e
            L_0x001a:
                r6 = r1
            L_0x001b:
                n1.b0 r3 = r3.f5692k     // Catch:{ all -> 0x0037 }
                java.lang.String r2 = "UTC"
                java.time.ZoneId r2 = java.time.ZoneId.of(r2)     // Catch:{ all -> 0x0037 }
                java.time.ZonedDateTime r5 = java.time.ZonedDateTime.ofInstant(r5, r2)     // Catch:{ all -> 0x0037 }
                java.lang.String r2 = "ofInstant(instant, ZoneId.of(\"UTC\"))"
                q7.k.d(r5, r2)     // Catch:{ all -> 0x0037 }
                android.graphics.Bitmap r3 = r3.g(r5, r4)     // Catch:{ all -> 0x0037 }
                k3.j.o(r6, r1)     // Catch:{ all -> 0x0018 }
                k3.j.n(r0, r1)
                return r3
            L_0x0037:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r4 = move-exception
                k3.j.o(r6, r3)     // Catch:{ all -> 0x0018 }
                throw r4     // Catch:{ all -> 0x0018 }
            L_0x003e:
                throw r3     // Catch:{ all -> 0x003f }
            L_0x003f:
                r4 = move-exception
                k3.j.n(r0, r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.p0.a.j(n1.z, java.time.Instant, java.util.Map):android.graphics.Bitmap");
        }

        public final Rect k() {
            return p0.this.f5692k.f5518f;
        }

        public final Intent l() {
            p0.this.f5683a.d();
            return null;
        }

        public final Intent m() {
            p0.this.f5683a.h();
            return null;
        }
    }

    public p0(i0 i0Var, t0.c cVar, j1 j1Var, b bVar, l lVar, b bVar2, c cVar2) {
        long j8;
        k.e(i0Var, "watchface");
        k.e(j1Var, "watchState");
        k.e(bVar, "currentUserStyleRepository");
        k.e(lVar, "complicationSlotsManager");
        k.e(bVar2, "broadcastsObserver");
        this.f5683a = cVar;
        this.f5684b = j1Var;
        this.f5685c = bVar;
        this.f5686d = lVar;
        this.e = bVar2;
        this.f5687f = cVar2;
        s sVar = s.f5714i;
        Set<s> set = s.f7715f;
        d dVar = new d(sVar, new z(sVar, set, (z.a) null, lVar.f5655f));
        s sVar2 = s.f5711f;
        s sVar3 = s.f5712g;
        s sVar4 = s.f5713h;
        d[] dVarArr = {dVar, new d(sVar2, new z(sVar2, set, (z.a) null, lVar.f5655f)), new d(sVar3, new z(sVar3, set, (z.a) null, lVar.f5655f)), new d(sVar4, new z(sVar4, set, (z.a) null, lVar.f5655f))};
        HashMap<s, z> hashMap = new HashMap<>(a1.a.C(4));
        for (int i8 = 0; i8 < 4; i8++) {
            d dVar2 = dVarArr[i8];
            hashMap.put(dVar2.f4781f, dVar2.f4782g);
        }
        this.f5689h = hashMap;
        this.f5690i = cVar.f5758t;
        this.f5691j = i0Var.f5616d;
        b0 b0Var = i0Var.f5614b;
        this.f5692k = b0Var;
        this.f5693l = i0Var.f5615c;
        this.f5694m = i0Var.e;
        this.f5695n = new x();
        ComponentName x8 = cVar.x();
        this.f5699s = x8;
        Object systemService = cVar.e.getSystemService("display");
        k.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        DisplayManager displayManager = (DisplayManager) systemService;
        this.f5700t = displayManager;
        l0 l0Var = new l0(this);
        this.f5701u = l0Var;
        displayManager.registerDisplayListener(l0Var, cVar.f5741a);
        Instant instant = i0Var.f5617f;
        if (instant == null) {
            int i9 = i0Var.f5613a;
            if (i9 == 0) {
                j8 = j1Var.f5636g;
            } else if (i9 == 1) {
                j8 = j1Var.f5637h;
            } else {
                throw new InvalidParameterException("Unrecognized watchFaceType");
            }
            instant = Instant.ofEpochMilli(j8);
            k.d(instant, "ofEpochMilli(\n          …          }\n            )");
        }
        this.f5702v = instant;
        synchronized (b0Var.f5517d) {
            b0Var.e = cVar;
        }
        if ((!b0Var.f5523k.isEmpty()) || lVar.e.isEmpty()) {
            cVar.g();
        }
        if (!j1Var.f5639j) {
            a aVar = new a((androidx.wear.watchface.control.a) null);
            i0.f5610h.put(x8, aVar);
            if (k.a(x8, i0.f5611i)) {
                n<i0.b> nVar = i0.f5612j;
                if (nVar != null) {
                    nVar.u(aVar);
                }
            } else {
                n<i0.b> nVar2 = i0.f5612j;
                if (nVar2 != null) {
                    nVar2.G(new IllegalStateException("Expected " + i0.f5611i + " to be created but got " + x8));
                }
            }
            i0.f5611i = null;
            i0.f5612j = null;
            h();
        }
        d8.c cVar3 = l0.f8580a;
        c8.c a9 = a0.a(m.f2865a.P());
        j.K(a9, (g1) null, new m0(this, (j7.d<? super m0>) null), 3);
        if (!j1Var.f5639j) {
            j.K(a9, (g1) null, new n0(this, (j7.d<? super n0>) null), 3);
        }
        j.K(a9, (g1) null, new o0(this, (j7.d<? super o0>) null), 3);
    }

    public final a.c a() {
        ComponentName componentName = this.f5699s;
        i0.c cVar = this.f5691j;
        cVar.getClass();
        cVar.getClass();
        int i8 = cVar.f5622a;
        cVar.getClass();
        return new a.c(componentName, 0, 0, i8, false, false, true, (Bundle) null);
    }

    public final ZonedDateTime b() {
        t0.d dVar = this.f5690i;
        long a9 = dVar.a();
        x xVar = this.f5695n;
        double d9 = xVar.f5863a;
        long j8 = xVar.f5864b;
        long j9 = (long) (d9 * ((double) (a9 - j8)));
        long j10 = xVar.f5865c - j8;
        long j11 = j9 % j10;
        if (j11 < 0) {
            j11 += j10;
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(j8 + j11);
        k.d(ofEpochMilli, "ofEpochMilli(mockTime.ap…r.getSystemTimeMillis()))");
        return ZonedDateTime.ofInstant(ofEpochMilli, dVar.b());
    }

    public final void c() {
        j1 j1Var = this.f5684b;
        s sVar = ((Boolean) j.C(j1Var.f5633c, Boolean.FALSE)).booleanValue() ? s.f5712g : s.f5711f;
        Boolean value = j1Var.f5632b.getValue();
        k.b(value);
        boolean booleanValue = value.booleanValue();
        b0 b0Var = this.f5692k;
        if (booleanValue && !b0Var.f()) {
            sVar = s.f5714i;
        } else if (this.f5697p) {
            sVar = s.f5713h;
        }
        if (b0Var.f5521i.f5891a != sVar) {
            z zVar = this.f5689h.get(sVar);
            k.b(zVar);
            b0Var.e(zVar);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d() {
        b0 b0Var = this.f5692k;
        b0Var.getClass();
        try {
            b0Var.a();
            j.Z(new f0(b0Var, (j7.d<? super f0>) null));
            if (!this.f5684b.f5639j) {
                i0.a aVar = i0.f5609g;
                ComponentName componentName = this.f5699s;
                k.e(componentName, "componentName");
                i0.f5610h.remove(componentName);
            }
            l();
            this.f5700t.unregisterDisplayListener(this.f5701u);
        } catch (Throwable th) {
            j.Z(new f0(b0Var, (j7.d<? super f0>) null));
            throw th;
        }
    }

    public final void e() {
        ZonedDateTime b9 = b();
        Instant instant = b9.toInstant();
        t0.d dVar = this.f5690i;
        long a9 = dVar.a();
        c();
        k.d(instant, "startInstant");
        l lVar = this.f5686d;
        lVar.getClass();
        LinkedHashMap linkedHashMap = lVar.e;
        for (Map.Entry value : linkedHashMap.entrySet()) {
            RectF rectF = h.G;
            ((h) value.getValue()).f(instant, false, false);
        }
        if (!linkedHashMap.isEmpty()) {
            lVar.f();
        }
        b0 b0Var = this.f5692k;
        b0Var.c(b9);
        this.f5698q = a9;
        if (b0Var.f() && !this.f5688g) {
            long a10 = dVar.a();
            Instant now = Instant.now();
            k.d(now, "now()");
            boolean booleanValue = ((Boolean) j.C(this.f5684b.f5633c, Boolean.FALSE)).booleanValue();
            long j8 = b0Var.f5515b;
            if (booleanValue) {
                j8 = Math.max(j8, 100);
            }
            long j9 = this.r;
            if (j9 < a9 - j8) {
                j9 = a9;
            }
            if (j9 <= a9) {
                a9 = j9;
            }
            long j10 = j8 >= 500 ? a9 + (j8 - ((a9 + j8) % j8)) : a9 + j8;
            long j11 = (long) 60000;
            if (j8 % j11 == 0) {
                j10 += (j11 - (j10 % j11)) % j11;
            }
            long j12 = j10 - a10;
            Instant instant2 = Instant.MAX;
            for (Map.Entry value2 : linkedHashMap.entrySet()) {
                h hVar = (h) value2.getValue();
                if (hVar.f5576q) {
                    Instant d9 = ((q1.b) hVar.D.getValue()).d(now);
                    if (d9.isBefore(instant2)) {
                        instant2 = d9;
                    }
                }
            }
            k.d(instant2, "minInstant");
            if (!k.a(instant2, Instant.MAX)) {
                j12 = Long.min(j12, Math.max(0, instant2.toEpochMilli() - now.toEpochMilli()));
            }
            this.r = a10 + j12;
            long j13 = j12 - ((long) 10);
            int i8 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
            j0 j0Var = this.f5683a;
            if (i8 <= 0) {
                j0Var.f();
                return;
            }
            Duration ofMillis = Duration.ofMillis(j13);
            k.d(ofMillis, "ofMillis(delayMillis)");
            j0Var.l(ofMillis);
        }
    }

    public final void f(int i8, h0 h0Var) {
        e c9;
        q1.b a9;
        l lVar = this.f5686d;
        lVar.getClass();
        int i9 = h0Var.f5592a;
        int i10 = h0Var.f5593b;
        h b9 = lVar.b(new m(lVar, i9, i10));
        if (b9 == null) {
            b9 = lVar.b(new n(lVar, i9, i10));
        }
        i0.e eVar = this.f5693l;
        if (eVar != null) {
            ((WatchFaceStudioRuntime) ((i) eVar).f1385b).f3835g.w.a((float) i9, (float) i10, i8 != 0 ? i8 != 2 ? 3 : 1 : 0);
        }
        if (b9 == null) {
            this.f5696o = null;
            return;
        }
        int i11 = b9.f5561a;
        if (i8 != 0) {
            if (i8 == 2) {
                Integer num = this.f5696o;
                if ((num != null && i11 == num.intValue()) || this.f5696o == null) {
                    h hVar = (h) lVar.e.get(Integer.valueOf(i11));
                    if (!(hVar == null || (c9 = hVar.c()) == null || (a9 = c9.a()) == null)) {
                        if (a9.f6418a == q1.d.NO_PERMISSION) {
                            Context a10 = lVar.d().a();
                            Context a11 = lVar.d().a();
                            Context a12 = lVar.d().a();
                            ComponentName componentName = new ComponentName(a12.getPackageName(), a12.getClass().getName());
                            lVar.d().h();
                            lVar.d().d();
                            a10.startActivity(ComplicationHelperActivity.h(a11, componentName, (Intent) null, (Intent) null).addFlags(268435456));
                        } else {
                            try {
                                PendingIntent pendingIntent = a9.f6419b;
                                if (pendingIntent != null) {
                                    pendingIntent.send();
                                }
                            } catch (PendingIntent.CanceledException unused) {
                            }
                            Iterator<l.b> it = lVar.f5657h.iterator();
                            while (it.hasNext()) {
                                it.next().getClass();
                            }
                        }
                    }
                    this.f5683a.f();
                } else {
                    this.f5696o = null;
                    return;
                }
            }
            this.f5696o = null;
            return;
        }
        HashMap hashMap = lVar.f5655f;
        k.c(hashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, androidx.wear.watchface.TapEvent>");
        hashMap.put(Integer.valueOf(i11), h0Var);
        this.f5696o = Integer.valueOf(i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        k3.j.n(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(boolean r3) {
        /*
            r2 = this;
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceImpl.visibility"
            r0.<init>(r1)
            if (r3 == 0) goto L_0x001c
            r2.h()     // Catch:{ all -> 0x0026 }
            n1.j0 r3 = r2.f5683a     // Catch:{ all -> 0x0026 }
            r3.f()     // Catch:{ all -> 0x0026 }
            boolean r3 = r2.w     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x0018
            r2.e()     // Catch:{ all -> 0x0026 }
        L_0x0018:
            r2.j()     // Catch:{ all -> 0x0026 }
            goto L_0x001f
        L_0x001c:
            r2.l()     // Catch:{ all -> 0x0026 }
        L_0x001f:
            h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x0026 }
            r2 = 0
            k3.j.n(r0, r2)
            return
        L_0x0026:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r3 = move-exception
            k3.j.n(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.p0.g(boolean):void");
    }

    public final void h() {
        j0 j0Var = this.f5683a;
        if (!j0Var.i().getLooper().isCurrentThread()) {
            throw new IllegalArgumentException("registerReceivers must be called the UiThread".toString());
        } else if (this.f5687f == null && !this.f5684b.f5639j) {
            this.f5687f = new c(j0Var.a(), this.e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        k3.j.o(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle i(androidx.wear.watchface.control.data.WatchFaceRenderParams r10) {
        /*
            r9 = this;
            java.lang.String r0 = "params"
            q7.k.e(r10, r0)
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceImpl.renderWatchFaceToBitmap"
            r0.<init>(r1)
            long r1 = r10.f2286g     // Catch:{ all -> 0x0063 }
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)     // Catch:{ all -> 0x0063 }
            androidx.wear.watchface.style.data.UserStyleWireFormat r2 = r10.f2287h     // Catch:{ all -> 0x0063 }
            r3 = 0
            if (r2 == 0) goto L_0x0026
            u1.e r4 = new u1.e     // Catch:{ all -> 0x0063 }
            u1.f r5 = new u1.f     // Catch:{ all -> 0x0063 }
            r5.<init>((androidx.wear.watchface.style.data.UserStyleWireFormat) r2)     // Catch:{ all -> 0x0063 }
            u1.b r2 = r9.f5685c     // Catch:{ all -> 0x0063 }
            u1.l r2 = r2.f7605a     // Catch:{ all -> 0x0063 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            java.util.List<androidx.wear.watchface.data.IdAndComplicationDataWireFormat> r2 = r10.f2288i     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0065
            int r5 = i7.f.M(r2)     // Catch:{ all -> 0x0063 }
            int r5 = a1.a.C(r5)     // Catch:{ all -> 0x0063 }
            r6 = 16
            if (r5 >= r6) goto L_0x0038
            r5 = r6
        L_0x0038:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0063 }
            r6.<init>(r5)     // Catch:{ all -> 0x0063 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0063 }
        L_0x0041:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0063 }
            androidx.wear.watchface.data.IdAndComplicationDataWireFormat r5 = (androidx.wear.watchface.data.IdAndComplicationDataWireFormat) r5     // Catch:{ all -> 0x0063 }
            int r7 = r5.f2341f     // Catch:{ all -> 0x0063 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0063 }
            android.support.wearable.complications.ComplicationData r5 = r5.f2342g     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "it.complicationData"
            q7.k.d(r5, r8)     // Catch:{ all -> 0x0063 }
            r8 = 0
            q1.b r5 = q1.e.i(r5, r8)     // Catch:{ all -> 0x0063 }
            r6.put(r7, r5)     // Catch:{ all -> 0x0063 }
            goto L_0x0041
        L_0x0063:
            r9 = move-exception
            goto L_0x00a2
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r2 = "instant"
            q7.k.d(r1, r2)     // Catch:{ all -> 0x0063 }
            java.lang.AutoCloseable r2 = r9.k(r4, r6, r1)     // Catch:{ all -> 0x0063 }
            n1.b0 r9 = r9.f5692k     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "UTC"
            java.time.ZoneId r4 = java.time.ZoneId.of(r4)     // Catch:{ all -> 0x009b }
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r4)     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "ofInstant(instant, ZoneId.of(\"UTC\"))"
            q7.k.d(r1, r4)     // Catch:{ all -> 0x009b }
            n1.z r4 = new n1.z     // Catch:{ all -> 0x009b }
            androidx.wear.watchface.data.RenderParametersWireFormat r10 = r10.f2285f     // Catch:{ all -> 0x009b }
            java.lang.String r5 = "params.renderParametersWireFormat"
            q7.k.d(r10, r5)     // Catch:{ all -> 0x009b }
            r4.<init>(r10)     // Catch:{ all -> 0x009b }
            android.graphics.Bitmap r9 = r9.g(r1, r4)     // Catch:{ all -> 0x009b }
            k3.j.o(r2, r3)     // Catch:{ all -> 0x0063 }
            android.os.Bundle r9 = a.b.a(r9)     // Catch:{ all -> 0x0063 }
            k3.j.n(r0, r3)
            return r9
        L_0x009b:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            k3.j.o(r2, r9)     // Catch:{ all -> 0x0063 }
            throw r10     // Catch:{ all -> 0x0063 }
        L_0x00a2:
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r10 = move-exception
            k3.j.n(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.p0.i(androidx.wear.watchface.control.data.WatchFaceRenderParams):android.os.Bundle");
    }

    public final void j() {
        j1 j1Var = this.f5684b;
        if (j.E(j1Var.f5632b) && j.E(j1Var.f5634d) && !this.f5688g && this.f5692k.f()) {
            Duration duration = Duration.ZERO;
            k.d(duration, "ZERO");
            this.f5683a.l(duration);
        }
    }

    public final AutoCloseable k(e eVar, Map<Integer, ? extends q1.b> map, Instant instant) {
        u1.a aVar;
        AutoCloseable autoCloseable = null;
        if (eVar != null) {
            b bVar = this.f5685c;
            bVar.getClass();
            bVar.a(eVar);
            aVar = new u1.a(bVar, eVar, (e) bVar.f7606b.getValue());
        } else {
            aVar = null;
        }
        if (map != null) {
            try {
                autoCloseable = this.f5686d.g(map, instant);
            } catch (Throwable th) {
                if (aVar != null) {
                    aVar.close();
                }
                throw th;
            }
        }
        return new k0(aVar, autoCloseable);
    }

    public final void l() {
        if (this.f5683a.i().getLooper().isCurrentThread()) {
            c cVar = this.f5687f;
            if (cVar != null) {
                try {
                    cVar.f5533a.unregisterReceiver(cVar.f5535c);
                } catch (Exception e4) {
                    Log.e("BroadcastsReceiver", "Exception occurred in BroadcastsReceiver.onDestroy", e4);
                }
            }
            this.f5687f = null;
            return;
        }
        throw new IllegalArgumentException("unregisterReceivers must be called the UiThread".toString());
    }
}
