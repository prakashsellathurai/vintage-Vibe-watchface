package n1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import q7.k;
import t1.v;
import u1.l;
import y7.n;

public final class i0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f5609g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<ComponentName, b> f5610h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static ComponentName f5611i;

    /* renamed from: j  reason: collision with root package name */
    public static n<b> f5612j;

    /* renamed from: a  reason: collision with root package name */
    public final int f5613a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f5614b;

    /* renamed from: c  reason: collision with root package name */
    public e f5615c;

    /* renamed from: d  reason: collision with root package name */
    public final c f5616d = new c();
    public final d e = new d();

    /* renamed from: f  reason: collision with root package name */
    public Instant f5617f;

    public static final class a {

        @l7.e(c = "androidx.wear.watchface.WatchFace$Companion", f = "WatchFace.kt", l = {259}, m = "createHeadlessSessionDelegate")
        /* renamed from: n1.i0$a$a  reason: collision with other inner class name */
        public static final class C0087a extends l7.c {

            /* renamed from: i  reason: collision with root package name */
            public Object f5618i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f5619j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a f5620k;

            /* renamed from: l  reason: collision with root package name */
            public int f5621l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0087a(a aVar, j7.d<? super C0087a> dVar) {
                super(dVar);
                this.f5620k = aVar;
            }

            public final Object h(Object obj) {
                this.f5619j = obj;
                this.f5621l |= Integer.MIN_VALUE;
                return this.f5620k.a((ComponentName) null, (HeadlessWatchFaceInstanceParams) null, (Context) null, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(android.content.ComponentName r5, androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams r6, android.content.Context r7, j7.d<? super n1.i0.b> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof n1.i0.a.C0087a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                n1.i0$a$a r0 = (n1.i0.a.C0087a) r0
                int r1 = r0.f5621l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f5621l = r1
                goto L_0x0018
            L_0x0013:
                n1.i0$a$a r0 = new n1.i0$a$a
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r4 = r0.f5619j
                k7.a r8 = k7.a.f5217f
                int r1 = r0.f5621l
                r2 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 != r2) goto L_0x002c
                java.lang.Object r5 = r0.f5618i
                androidx.wear.watchface.control.a r5 = (androidx.wear.watchface.control.a) r5
                a1.a.I(r4)
                goto L_0x00b2
            L_0x002c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0034:
                a1.a.I(r4)
                java.lang.String r4 = "componentName"
                q7.k.e(r5, r4)
                java.lang.String r4 = "context"
                q7.k.e(r7, r4)
                android.content.pm.PackageManager r4 = r7.getPackageManager()
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r3 = "com.google.android.wearable.action.WATCH_FACE_CONTROL"
                r1.<init>(r3)
                java.lang.String r3 = r7.getPackageName()
                r1.setPackage(r3)
                r3 = 0
                java.util.List r4 = r4.queryIntentServices(r1, r3)
                java.lang.String r1 = "context.packageManager.q…      0\n                )"
                q7.k.d(r4, r1)
                int r1 = r4.size()
                if (r1 != r2) goto L_0x00d2
                java.lang.Object r4 = r4.get(r3)
                android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
                android.content.pm.ServiceInfo r4 = r4.serviceInfo
                java.lang.String r4 = r4.name
                java.lang.Class r4 = java.lang.Class.forName(r4)
                java.lang.Class[] r1 = new java.lang.Class[r3]
                java.lang.reflect.Constructor r4 = r4.getConstructor(r1)
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.Object r4 = r4.newInstance(r1)
                java.lang.String r1 = "null cannot be cast to non-null type androidx.wear.watchface.control.WatchFaceControlService"
                q7.k.c(r4, r1)
                androidx.wear.watchface.control.WatchFaceControlService r4 = (androidx.wear.watchface.control.WatchFaceControlService) r4
                n1.t0 r4 = androidx.wear.watchface.control.WatchFaceControlService.b(r5)
                if (r4 == 0) goto L_0x00ba
                android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
                r4.i(r7)
                n1.t0$c r7 = new n1.t0$c
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r1.<init>(r3)
                android.os.Handler r3 = r4.d()
                r7.<init>(r1, r3, r5)
                androidx.wear.watchface.control.a r5 = r7.r(r6)
                r0.f5618i = r5
                r0.f5621l = r2
                y7.o r4 = r7.f5748i
                java.lang.Object r4 = r4.s(r0)
                if (r4 != r8) goto L_0x00b2
                return r8
            L_0x00b2:
                n1.p0 r4 = (n1.p0) r4
                n1.p0$a r6 = new n1.p0$a
                r6.<init>(r5)
                return r6
            L_0x00ba:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Can't create "
                r6.<init>(r7)
                java.lang.String r5 = r5.getClassName()
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r4.<init>(r5)
                throw r4
            L_0x00d2:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r8 = "WatchFaceControlService cannot be uniquely resolved ("
                r6.<init>(r8)
                int r4 = r4.size()
                r6.append(r4)
                java.lang.String r4 = ") for "
                r6.append(r4)
                java.lang.String r4 = r7.getPackageName()
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r5.<init>(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.i0.a.a(android.content.ComponentName, androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams, android.content.Context, j7.d):java.lang.Object");
        }
    }

    public interface b {
        void a();

        u1.e b();

        Handler c();

        void d(boolean z8);

        l e();

        Instant f();

        void g(v vVar);

        void h(u1.e eVar);

        l i();

        Bitmap j(z zVar, Instant instant, Map<Integer, ? extends q1.b> map);

        Rect k();

        Intent l();

        Intent m();
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5622a = -1;
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Color f5623a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Color f5624b = null;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!k.a(d.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.WatchFace.OverlayStyle");
            d dVar = (d) obj;
            return k.a(this.f5623a, dVar.f5623a) && k.a(this.f5624b, dVar.f5624b);
        }

        public final int hashCode() {
            int i8 = 0;
            Color color = this.f5623a;
            int hashCode = (color != null ? color.hashCode() : 0) * 31;
            Color color2 = this.f5624b;
            if (color2 != null) {
                i8 = color2.hashCode();
            }
            return hashCode + i8;
        }

        public final String toString() {
            return "OverlayStyle(backgroundColor=" + this.f5623a + ", foregroundColor=" + this.f5624b + ')';
        }
    }

    public interface e {
    }

    public i0(int i8, com.samsung.android.wearable.watchfacestudio.a aVar) {
        k.e(aVar, "renderer");
        this.f5613a = i8;
        this.f5614b = aVar;
    }
}
