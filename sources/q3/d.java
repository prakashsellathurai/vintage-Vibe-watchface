package q3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p.b;
import r3.m;
import r3.o;
import r3.x;
import t3.c;
import v3.a;
import y3.e;

public final class d implements Handler.Callback {
    @RecentlyNonNull

    /* renamed from: n  reason: collision with root package name */
    public static final Status f6535n = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: o  reason: collision with root package name */
    public static final Status f6536o = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: p  reason: collision with root package name */
    public static final Object f6537p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public static d f6538q;

    /* renamed from: a  reason: collision with root package name */
    public long f6539a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6540b = false;

    /* renamed from: c  reason: collision with root package name */
    public o f6541c;

    /* renamed from: d  reason: collision with root package name */
    public c f6542d;
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final o3.d f6543f;

    /* renamed from: g  reason: collision with root package name */
    public final x f6544g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f6545h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f6546i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f6547j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k  reason: collision with root package name */
    public final Set<a<?>> f6548k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f6549l;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f6550m;

    public d(Context context, Looper looper) {
        o3.d dVar = o3.d.f6090c;
        new b(0);
        this.f6548k = new b(0);
        this.f6550m = true;
        this.e = context;
        e eVar = new e(looper, this);
        this.f6549l = eVar;
        this.f6543f = dVar;
        this.f6544g = new x();
        PackageManager packageManager = context.getPackageManager();
        if (a.f7928d == null) {
            a.f7928d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (a.f7928d.booleanValue()) {
            this.f6550m = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    public static Status b(a<?> aVar, o3.a aVar2) {
        String str = aVar.f6525b.f6317b;
        String valueOf = String.valueOf(aVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), aVar2.f6081h, aVar2);
    }

    @RecentlyNonNull
    public static d c(@RecentlyNonNull Context context) {
        d dVar;
        synchronized (f6537p) {
            if (f6538q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = o3.d.f6089b;
                f6538q = new d(applicationContext, looper);
            }
            dVar = f6538q;
        }
        return dVar;
    }

    public final t<?> a(p3.c<?> cVar) {
        a<O> aVar = cVar.e;
        ConcurrentHashMap concurrentHashMap = this.f6547j;
        t<?> tVar = (t) concurrentHashMap.get(aVar);
        if (tVar == null) {
            tVar = new t<>(this, cVar);
            concurrentHashMap.put(aVar, tVar);
        }
        if (tVar.f6581b.o()) {
            ((b) this.f6548k).add(aVar);
        }
        tVar.q();
        return tVar;
    }

    public final boolean d() {
        m mVar;
        if (this.f6540b) {
            return false;
        }
        m mVar2 = m.f7011a;
        synchronized (m.class) {
            if (m.f7011a == null) {
                m.f7011a = new m();
            }
            mVar = m.f7011a;
        }
        mVar.getClass();
        int i8 = this.f6544g.f7052a.get(203390000, -1);
        return i8 == -1 || i8 == 0;
    }

    public final boolean e(o3.a aVar, int i8) {
        PendingIntent pendingIntent;
        o3.d dVar = this.f6543f;
        dVar.getClass();
        int i9 = aVar.f6080g;
        boolean z8 = (i9 == 0 || aVar.f6081h == null) ? false : true;
        Context context = this.e;
        if (z8) {
            pendingIntent = aVar.f6081h;
        } else {
            pendingIntent = null;
            Intent a9 = dVar.a(context, i9, (String) null);
            if (a9 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a9, 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i10 = GoogleApiActivity.f3015b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i8);
        intent.putExtra("notify_manager", true);
        dVar.e(context, i9, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r0 >= 0) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0175, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(@androidx.annotation.RecentlyNonNull android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 300000(0x493e0, double:1.482197E-318)
            r3 = 17
            r4 = 0
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L_0x0421;
                case 2: goto L_0x0419;
                case 3: goto L_0x03f6;
                case 4: goto L_0x03bb;
                case 5: goto L_0x031e;
                case 6: goto L_0x02bf;
                case 7: goto L_0x02b6;
                case 8: goto L_0x03bb;
                case 9: goto L_0x0292;
                case 10: goto L_0x0263;
                case 11: goto L_0x0203;
                case 12: goto L_0x01ea;
                case 13: goto L_0x03bb;
                case 14: goto L_0x01ce;
                case 15: goto L_0x0196;
                case 16: goto L_0x0108;
                case 17: goto L_0x00e4;
                case 18: goto L_0x002a;
                case 19: goto L_0x0026;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 31
            r10.<init>(r11)
            java.lang.String r11 = "Unknown message id: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = "GoogleApiManager"
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r11, r10)
            return r4
        L_0x0026:
            r10.f6540b = r4
            goto L_0x0459
        L_0x002a:
            java.lang.Object r11 = r11.obj
            q3.y r11 = (q3.y) r11
            r0 = 0
            r11.getClass()
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            r3.o r0 = new r3.o
            r1 = 0
            r11.getClass()
            r3.k[] r2 = new r3.k[r6]
            r3 = 0
            r11.getClass()
            r2[r4] = r3
            java.util.List r11 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r11)
            t3.c r11 = r10.f6542d
            if (r11 != 0) goto L_0x005b
            t3.c r11 = new t3.c
            android.content.Context r1 = r10.e
            r11.<init>(r1)
            r10.f6542d = r11
        L_0x005b:
            t3.c r10 = r10.f6542d
            r10.b(r0)
            goto L_0x0459
        L_0x0062:
            r3.o r0 = r10.f6541c
            if (r0 == 0) goto L_0x00b9
            java.util.List<r3.k> r1 = r0.f7021g
            int r0 = r0.f7020f
            r11.getClass()
            if (r0 != 0) goto L_0x0092
            if (r1 == 0) goto L_0x007b
            int r0 = r1.size()
            r11.getClass()
            if (r0 < 0) goto L_0x007b
            goto L_0x0092
        L_0x007b:
            r3.o r0 = r10.f6541c
            r1 = 0
            r11.getClass()
            java.util.List<r3.k> r2 = r0.f7021g
            if (r2 != 0) goto L_0x008c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f7021g = r2
        L_0x008c:
            java.util.List<r3.k> r0 = r0.f7021g
            r0.add(r1)
            goto L_0x00b9
        L_0x0092:
            android.os.Handler r0 = r10.f6549l
            r0.removeMessages(r3)
            r3.o r0 = r10.f6541c
            if (r0 == 0) goto L_0x00b9
            int r1 = r0.f7020f
            if (r1 > 0) goto L_0x00a5
            boolean r1 = r10.d()
            if (r1 == 0) goto L_0x00b7
        L_0x00a5:
            t3.c r1 = r10.f6542d
            if (r1 != 0) goto L_0x00b2
            t3.c r1 = new t3.c
            android.content.Context r2 = r10.e
            r1.<init>(r2)
            r10.f6542d = r1
        L_0x00b2:
            t3.c r1 = r10.f6542d
            r1.b(r0)
        L_0x00b7:
            r10.f6541c = r5
        L_0x00b9:
            r3.o r0 = r10.f6541c
            if (r0 != 0) goto L_0x0459
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r11.getClass()
            r0.add(r1)
            r3.o r1 = new r3.o
            r2 = 0
            r11.getClass()
            r1.<init>(r2, r0)
            r10.f6541c = r1
            android.os.Handler r10 = r10.f6549l
            android.os.Message r0 = r10.obtainMessage(r3)
            r1 = 0
            r11.getClass()
            r10.sendMessageDelayed(r0, r1)
            goto L_0x0459
        L_0x00e4:
            r3.o r11 = r10.f6541c
            if (r11 == 0) goto L_0x0459
            int r0 = r11.f7020f
            if (r0 > 0) goto L_0x00f2
            boolean r0 = r10.d()
            if (r0 == 0) goto L_0x0104
        L_0x00f2:
            t3.c r0 = r10.f6542d
            if (r0 != 0) goto L_0x00ff
            t3.c r0 = new t3.c
            android.content.Context r1 = r10.e
            r0.<init>(r1)
            r10.f6542d = r0
        L_0x00ff:
            t3.c r0 = r10.f6542d
            r0.b(r11)
        L_0x0104:
            r10.f6541c = r5
            goto L_0x0459
        L_0x0108:
            java.lang.Object r11 = r11.obj
            q3.u r11 = (q3.u) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            q3.a<?> r1 = r11.f6591a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0459
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            q3.a<?> r0 = r11.f6591a
            java.lang.Object r10 = r10.get(r0)
            q3.t r10 = (q3.t) r10
            java.util.ArrayList r0 = r10.f6588j
            boolean r0 = r0.remove(r11)
            if (r0 == 0) goto L_0x0459
            q3.d r0 = r10.f6590l
            android.os.Handler r1 = r0.f6549l
            r2 = 15
            r1.removeMessages(r2, r11)
            android.os.Handler r0 = r0.f6549l
            r1 = 16
            r0.removeMessages(r1, r11)
            o3.c r11 = r11.f6592b
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.LinkedList r1 = r10.f6580a
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0149:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x017c
            java.lang.Object r3 = r2.next()
            q3.j0 r3 = (q3.j0) r3
            boolean r5 = r3 instanceof q3.a0
            if (r5 == 0) goto L_0x0149
            r5 = r3
            q3.a0 r5 = (q3.a0) r5
            o3.c[] r5 = r5.f(r10)
            if (r5 == 0) goto L_0x0149
            int r7 = r5.length
            r8 = r4
        L_0x0164:
            if (r8 >= r7) goto L_0x0175
            r9 = r5[r8]
            boolean r9 = r3.l.a(r9, r11)
            if (r9 == 0) goto L_0x0172
            if (r8 < 0) goto L_0x0175
            r5 = r6
            goto L_0x0176
        L_0x0172:
            int r8 = r8 + 1
            goto L_0x0164
        L_0x0175:
            r5 = r4
        L_0x0176:
            if (r5 == 0) goto L_0x0149
            r0.add(r3)
            goto L_0x0149
        L_0x017c:
            int r10 = r0.size()
        L_0x0180:
            if (r4 >= r10) goto L_0x0459
            java.lang.Object r2 = r0.get(r4)
            q3.j0 r2 = (q3.j0) r2
            r1.remove(r2)
            p3.j r3 = new p3.j
            r3.<init>(r11)
            r2.b(r3)
            int r4 = r4 + 1
            goto L_0x0180
        L_0x0196:
            java.lang.Object r11 = r11.obj
            q3.u r11 = (q3.u) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            q3.a<?> r1 = r11.f6591a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0459
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            q3.a<?> r0 = r11.f6591a
            java.lang.Object r10 = r10.get(r0)
            q3.t r10 = (q3.t) r10
            java.util.ArrayList r0 = r10.f6588j
            boolean r11 = r0.contains(r11)
            if (r11 != 0) goto L_0x01b8
            goto L_0x0459
        L_0x01b8:
            boolean r11 = r10.f6587i
            if (r11 != 0) goto L_0x0459
            p3.a$e r11 = r10.f6581b
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x01c9
            r10.q()
            goto L_0x0459
        L_0x01c9:
            r10.d()
            goto L_0x0459
        L_0x01ce:
            java.lang.Object r11 = r11.obj
            q3.l r11 = (q3.l) r11
            r11.getClass()
            java.util.concurrent.ConcurrentHashMap r11 = r10.f6547j
            boolean r11 = r11.containsKey(r5)
            if (r11 != 0) goto L_0x01de
            throw r5
        L_0x01de:
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            java.lang.Object r10 = r10.get(r5)
            q3.t r10 = (q3.t) r10
            r10.l(r4)
            throw r5
        L_0x01ea:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0459
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            java.lang.Object r11 = r11.obj
            java.lang.Object r10 = r10.get(r11)
            q3.t r10 = (q3.t) r10
            r10.l(r6)
            goto L_0x0459
        L_0x0203:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0459
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            java.lang.Object r11 = r11.obj
            java.lang.Object r10 = r10.get(r11)
            q3.t r10 = (q3.t) r10
            q3.d r11 = r10.f6590l
            android.os.Handler r0 = r11.f6549l
            r3.b.a(r0)
            boolean r0 = r10.f6587i
            if (r0 == 0) goto L_0x0459
            if (r0 == 0) goto L_0x0238
            q3.d r0 = r10.f6590l
            android.os.Handler r1 = r0.f6549l
            q3.a<O> r2 = r10.f6582c
            r3 = 11
            r1.removeMessages(r3, r2)
            android.os.Handler r0 = r0.f6549l
            r1 = 9
            r0.removeMessages(r1, r2)
            r10.f6587i = r4
        L_0x0238:
            o3.d r0 = r11.f6543f
            android.content.Context r11 = r11.e
            int r11 = r0.c(r11)
            r0 = 18
            if (r11 != r0) goto L_0x024e
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status
            r0 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
            r11.<init>(r0, r1)
            goto L_0x0257
        L_0x024e:
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status
            r0 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            r11.<init>(r0, r1)
        L_0x0257:
            r10.j(r11)
            p3.a$e r10 = r10.f6581b
            java.lang.String r11 = "Timing out connection while resuming."
            r10.e(r11)
            goto L_0x0459
        L_0x0263:
            java.util.Set<q3.a<?>> r11 = r10.f6548k
            p.b r11 = (p.b) r11
            r11.getClass()
            p.b$a r0 = new p.b$a
            r0.<init>()
        L_0x026f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0289
            java.lang.Object r11 = r0.next()
            q3.a r11 = (q3.a) r11
            java.util.concurrent.ConcurrentHashMap r1 = r10.f6547j
            java.lang.Object r11 = r1.remove(r11)
            q3.t r11 = (q3.t) r11
            if (r11 == 0) goto L_0x026f
            r11.p()
            goto L_0x026f
        L_0x0289:
            java.util.Set<q3.a<?>> r10 = r10.f6548k
            p.b r10 = (p.b) r10
            r10.clear()
            goto L_0x0459
        L_0x0292:
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            java.lang.Object r1 = r11.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0459
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            java.lang.Object r11 = r11.obj
            java.lang.Object r10 = r10.get(r11)
            q3.t r10 = (q3.t) r10
            q3.d r11 = r10.f6590l
            android.os.Handler r11 = r11.f6549l
            r3.b.a(r11)
            boolean r11 = r10.f6587i
            if (r11 == 0) goto L_0x0459
            r10.q()
            goto L_0x0459
        L_0x02b6:
            java.lang.Object r11 = r11.obj
            p3.c r11 = (p3.c) r11
            r10.a(r11)
            goto L_0x0459
        L_0x02bf:
            android.content.Context r11 = r10.e
            android.content.Context r11 = r11.getApplicationContext()
            boolean r11 = r11 instanceof android.app.Application
            if (r11 == 0) goto L_0x0459
            android.content.Context r11 = r10.e
            android.content.Context r11 = r11.getApplicationContext()
            android.app.Application r11 = (android.app.Application) r11
            q3.b r0 = q3.b.e
            monitor-enter(r0)
            boolean r3 = r0.f6531d     // Catch:{ all -> 0x031b }
            if (r3 != 0) goto L_0x02e0
            r11.registerActivityLifecycleCallbacks(r0)     // Catch:{ all -> 0x031b }
            r11.registerComponentCallbacks(r0)     // Catch:{ all -> 0x031b }
            r0.f6531d = r6     // Catch:{ all -> 0x031b }
        L_0x02e0:
            monitor-exit(r0)     // Catch:{ all -> 0x031b }
            q3.o r11 = new q3.o
            r11.<init>(r10)
            monitor-enter(r0)
            java.util.ArrayList<q3.b$a> r3 = r0.f6530c     // Catch:{ all -> 0x0318 }
            r3.add(r11)     // Catch:{ all -> 0x0318 }
            monitor-exit(r0)     // Catch:{ all -> 0x0318 }
            java.util.concurrent.atomic.AtomicBoolean r11 = r0.f6529b
            boolean r3 = r11.get()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f6528a
            if (r3 != 0) goto L_0x030e
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            boolean r11 = r11.getAndSet(r6)
            if (r11 != 0) goto L_0x030e
            int r11 = r3.importance
            r3 = 100
            if (r11 <= r3) goto L_0x030e
            r0.set(r6)
        L_0x030e:
            boolean r11 = r0.get()
            if (r11 != 0) goto L_0x0459
            r10.f6539a = r1
            goto L_0x0459
        L_0x0318:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0318 }
            throw r10
        L_0x031b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x031b }
            throw r10
        L_0x031e:
            int r0 = r11.arg1
            java.lang.Object r11 = r11.obj
            o3.a r11 = (o3.a) r11
            java.util.concurrent.ConcurrentHashMap r1 = r10.f6547j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x032e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x033f
            java.lang.Object r2 = r1.next()
            q3.t r2 = (q3.t) r2
            int r4 = r2.f6585g
            if (r4 != r0) goto L_0x032e
            r5 = r2
        L_0x033f:
            if (r5 == 0) goto L_0x0397
            int r0 = r11.f6080g
            r1 = 13
            if (r0 != r1) goto L_0x038c
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            o3.d r10 = r10.f6543f
            int r1 = r11.f6080g
            r10.getClass()
            java.util.concurrent.atomic.AtomicBoolean r10 = o3.g.f6093a
            java.lang.String r10 = o3.a.b(r1)
            java.lang.String r11 = r11.f6082i
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r11)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 69
            int r1 = r1 + r2
            r4.<init>(r1)
            java.lang.String r1 = "Error resolution was canceled by the user, original error message: "
            r4.append(r1)
            r4.append(r10)
            java.lang.String r10 = ": "
            r4.append(r10)
            r4.append(r11)
            java.lang.String r10 = r4.toString()
            r0.<init>(r3, r10)
            r5.j(r0)
            goto L_0x0459
        L_0x038c:
            q3.a<O> r10 = r5.f6582c
            com.google.android.gms.common.api.Status r10 = b(r10, r11)
            r5.j(r10)
            goto L_0x0459
        L_0x0397:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 76
            r10.<init>(r11)
            java.lang.String r11 = "Could not find API instance "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = " while trying to fail enqueued calls."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>()
            java.lang.String r0 = "GoogleApiManager"
            android.util.Log.wtf(r0, r10, r11)
            goto L_0x0459
        L_0x03bb:
            java.lang.Object r11 = r11.obj
            q3.b0 r11 = (q3.b0) r11
            java.util.concurrent.ConcurrentHashMap r0 = r10.f6547j
            p3.c<?> r1 = r11.f6534c
            q3.a<O> r1 = r1.e
            java.lang.Object r0 = r0.get(r1)
            q3.t r0 = (q3.t) r0
            if (r0 != 0) goto L_0x03d3
            p3.c<?> r0 = r11.f6534c
            q3.t r0 = r10.a(r0)
        L_0x03d3:
            p3.a$e r1 = r0.f6581b
            boolean r1 = r1.o()
            if (r1 == 0) goto L_0x03f0
            java.util.concurrent.atomic.AtomicInteger r10 = r10.f6546i
            int r10 = r10.get()
            int r1 = r11.f6533b
            if (r10 == r1) goto L_0x03f0
            q3.j0 r10 = r11.f6532a
            com.google.android.gms.common.api.Status r11 = f6535n
            r10.a(r11)
            r0.p()
            goto L_0x0459
        L_0x03f0:
            q3.j0 r10 = r11.f6532a
            r0.o(r10)
            goto L_0x0459
        L_0x03f6:
            java.util.concurrent.ConcurrentHashMap r10 = r10.f6547j
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L_0x0400:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0459
            java.lang.Object r11 = r10.next()
            q3.t r11 = (q3.t) r11
            q3.d r0 = r11.f6590l
            android.os.Handler r0 = r0.f6549l
            r3.b.a(r0)
            r11.f6589k = r5
            r11.q()
            goto L_0x0400
        L_0x0419:
            java.lang.Object r10 = r11.obj
            q3.k0 r10 = (q3.k0) r10
            r10.getClass()
            throw r5
        L_0x0421:
            java.lang.Object r11 = r11.obj
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r6 == r11) goto L_0x042c
            goto L_0x042e
        L_0x042c:
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x042e:
            r10.f6539a = r1
            android.os.Handler r11 = r10.f6549l
            r0 = 12
            r11.removeMessages(r0)
            java.util.concurrent.ConcurrentHashMap r11 = r10.f6547j
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0441:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0459
            java.lang.Object r1 = r11.next()
            q3.a r1 = (q3.a) r1
            android.os.Handler r2 = r10.f6549l
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r10.f6539a
            r2.sendMessageDelayed(r1, r3)
            goto L_0x0441
        L_0x0459:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.handleMessage(android.os.Message):boolean");
    }
}
