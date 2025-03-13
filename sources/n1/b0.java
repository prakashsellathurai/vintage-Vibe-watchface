package n1;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.appcompat.widget.p;
import com.samsung.android.wearable.watchfacestudio.WatchFaceStudioRuntime;
import h7.d;
import i5.f;
import i5.i;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l7.e;
import n1.z;
import q7.k;
import r5.h;
import x0.a;

public abstract class b0 {

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<String, d0> f5512l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    public static final f8.b f5513m = new f8.b(false);

    /* renamed from: a  reason: collision with root package name */
    public final j1 f5514a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5515b = 60000;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceHolder f5516c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5517d;
    public j0 e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f5518f;

    /* renamed from: g  reason: collision with root package name */
    public float f5519g;

    /* renamed from: h  reason: collision with root package name */
    public float f5520h;

    /* renamed from: i  reason: collision with root package name */
    public z f5521i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f5522j;

    /* renamed from: k  reason: collision with root package name */
    public Collection<d<Integer, q>> f5523k;

    public static abstract class a<SharedAssetsT extends c> extends b {

        @e(c = "androidx.wear.watchface.Renderer$CanvasRenderer2", f = "Renderer.kt", l = {880}, m = "backgroundThreadInitInternal$suspendImpl")
        /* renamed from: n1.b0$a$a  reason: collision with other inner class name */
        public static final class C0085a<SharedAssetsT extends c> extends l7.c {

            /* renamed from: i  reason: collision with root package name */
            public Object f5524i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f5525j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a<SharedAssetsT> f5526k;

            /* renamed from: l  reason: collision with root package name */
            public int f5527l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0085a(a<SharedAssetsT> aVar, j7.d<? super C0085a> dVar) {
                super(dVar);
                this.f5526k = aVar;
            }

            public final Object h(Object obj) {
                this.f5525j = obj;
                this.f5527l |= Integer.MIN_VALUE;
                return a.k(this.f5526k, this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SurfaceHolder surfaceHolder, u1.b bVar, j1 j1Var) {
            super(surfaceHolder, bVar, j1Var);
            k.e(surfaceHolder, "surfaceHolder");
            k.e(bVar, "currentUserStyleRepository");
            k.e(j1Var, "watchState");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <SharedAssetsT extends n1.b0.c> java.lang.Object k(n1.b0.a<SharedAssetsT> r4, j7.d<? super h7.h> r5) {
            /*
                boolean r0 = r5 instanceof n1.b0.a.C0085a
                if (r0 == 0) goto L_0x0013
                r0 = r5
                n1.b0$a$a r0 = (n1.b0.a.C0085a) r0
                int r1 = r0.f5527l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f5527l = r1
                goto L_0x0018
            L_0x0013:
                n1.b0$a$a r0 = new n1.b0$a$a
                r0.<init>(r4, r5)
            L_0x0018:
                java.lang.Object r5 = r0.f5525j
                k7.a r1 = k7.a.f5217f
                int r2 = r0.f5527l
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r4 = r0.f5524i
                n1.d0 r4 = (n1.d0) r4
                a1.a.I(r5)
                goto L_0x0048
            L_0x002b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0033:
                a1.a.I(r5)
                n1.d0 r4 = r4.f5522j
                n1.b0$c r5 = r4.f5544a
                if (r5 != 0) goto L_0x004c
                r0.f5524i = r4
                r0.f5527l = r3
                i5.h r5 = new i5.h
                r5.<init>()
                if (r5 != r1) goto L_0x0048
                return r1
            L_0x0048:
                n1.b0$c r5 = (n1.b0.c) r5
                r4.f5544a = r5
            L_0x004c:
                h7.h r4 = h7.h.f4787a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.b0.a.k(n1.b0$a, j7.d):java.lang.Object");
        }

        public final void j(Canvas canvas, Rect rect, ZonedDateTime zonedDateTime) {
            k.e(rect, "bounds");
            k.b(this.f5522j.f5544a);
            com.samsung.android.wearable.watchfacestudio.a aVar = (com.samsung.android.wearable.watchfacestudio.a) this;
            z.a aVar2 = aVar.f5521i.f5893c;
            if (aVar2 == null) {
                Log.e("DWF:WatchFaceRenderer", "renderHighlightLayer: incorrect render parameter");
                return;
            }
            z.b bVar = aVar2.f5895a;
            if (bVar instanceof z.b.c) {
                Log.i("DWF:WatchFaceRenderer", String.format("Request renderHighlightLayer UserStyle %s", new Object[]{((z.b.c) bVar).f5900a.f7683a}));
                g6.c cVar = aVar.y.f7108f;
                Path path = new Path();
                int ordinal = cVar.f4675g.ordinal();
                if (ordinal == 1) {
                    path.addCircle(((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f, ((float) Math.min(rect.width(), rect.height())) / 2.0f, Path.Direction.CW);
                } else if (ordinal != 2) {
                    RectF rectF = new RectF(rect);
                    path.addRoundRect(rectF, rectF.width() / 7.0f, rectF.height() / 7.0f, Path.Direction.CW);
                } else {
                    RectF rectF2 = new RectF(rect);
                    float f9 = cVar.f4676h;
                    int i8 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                    float f10 = cVar.f4677i;
                    if (i8 == 0 && f10 == 0.0f) {
                        path.addRect(rectF2, Path.Direction.CW);
                    } else {
                        path.addRoundRect(rectF2, f9, f10, Path.Direction.CW);
                    }
                }
                aVar.y.c(canvas, path, aVar2.f5896b);
                return;
            }
            boolean z8 = bVar instanceof z.b.C0093b;
            h hVar = aVar.f3846t;
            if (z8) {
                int i9 = ((z.b.C0093b) bVar).f5899a;
                Log.i("DWF:WatchFaceRenderer", String.format("Request renderHighlightLayer complication id %d", new Object[]{Integer.valueOf(i9)}));
                h hVar2 = (h) aVar.r.e.get(Integer.valueOf(i9));
                if (hVar2 != null && hVar2.f5576q) {
                    hVar.a().stream().filter(new i5.d(i9, 0)).findFirst().ifPresent(new i5.e(aVar, canvas, rect, aVar2, hVar2, 0));
                }
            } else if (bVar instanceof z.b.a) {
                Log.i("DWF:WatchFaceRenderer", "Request renderHighlightLayer complication All");
                ((ArrayList) hVar.a()).forEach(new f(aVar, canvas, rect, aVar2, 0));
            }
        }
    }

    public static abstract class b extends b0 {

        /* renamed from: n  reason: collision with root package name */
        public final int f5528n = 1;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f5529o = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SurfaceHolder surfaceHolder, u1.b bVar, j1 j1Var) {
            super(surfaceHolder, j1Var);
            k.e(surfaceHolder, "surfaceHolder");
            k.e(bVar, "currentUserStyleRepository");
            k.e(j1Var, "watchState");
        }

        public final void b() {
            Canvas lockCanvas = this.f5528n == 0 ? this.f5516c.lockCanvas() : this.f5516c.lockHardwareCanvas();
            try {
                lockCanvas.drawColor(-16777216);
            } finally {
                this.f5516c.unlockCanvasAndPost(lockCanvas);
            }
        }

        public final void c(ZonedDateTime zonedDateTime) {
            Canvas lockHardwareCanvas = this.f5528n == 1 ? this.f5516c.lockHardwareCanvas() : this.f5516c.lockCanvas();
            if (lockHardwareCanvas != null) {
                try {
                    i(lockHardwareCanvas, zonedDateTime);
                } finally {
                    this.f5516c.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
            throw r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
            k3.j.n(r3, r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(java.time.ZonedDateTime r6, n1.z r7, android.view.SurfaceHolder r8) {
            /*
                r5 = this;
                java.lang.String r0 = "screenShotSurfaceHolder"
                q7.k.e(r8, r0)
                n1.z r0 = r5.f5521i
                boolean r1 = r7.e
                android.view.SurfaceHolder r2 = r5.f5516c
                r5.f5516c = r8
                r8 = 1
                r7.e = r8
                r5.e(r7)
                android.view.SurfaceHolder r8 = r5.f5516c
                android.view.Surface r8 = r8.getSurface()
                android.graphics.Canvas r8 = r8.lockHardwareCanvas()
                v1.c r3 = new v1.c
                java.lang.String r4 = "CanvasRenderer.renderScreenshotToSurface"
                r3.<init>(r4)
                java.lang.String r4 = "canvas"
                q7.k.d(r8, r4)     // Catch:{ all -> 0x0048 }
                r5.i(r8, r6)     // Catch:{ all -> 0x0048 }
                h7.h r6 = h7.h.f4787a     // Catch:{ all -> 0x0048 }
                r6 = 0
                k3.j.n(r3, r6)
                android.view.SurfaceHolder r6 = r5.f5516c
                android.view.Surface r6 = r6.getSurface()
                r6.unlockCanvasAndPost(r8)
                r5.e(r0)
                r7.e = r1
                java.lang.String r6 = "<set-?>"
                q7.k.e(r2, r6)
                r5.f5516c = r2
                return
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r6 = move-exception
                k3.j.n(r3, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.b0.b.d(java.time.ZonedDateTime, n1.z, android.view.SurfaceHolder):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
            throw r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
            k3.j.n(r0, r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Bitmap g(java.time.ZonedDateTime r7, n1.z r8) {
            /*
                r6 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "CanvasRenderer.takeScreenshot"
                r0.<init>(r1)
                n1.z r1 = r6.f5521i     // Catch:{ all -> 0x0057 }
                boolean r2 = r8.e     // Catch:{ all -> 0x0057 }
                r3 = 1
                r8.e = r3     // Catch:{ all -> 0x0057 }
                r6.e(r8)     // Catch:{ all -> 0x0057 }
                android.graphics.Picture r3 = new android.graphics.Picture     // Catch:{ all -> 0x0057 }
                r3.<init>()     // Catch:{ all -> 0x0057 }
                android.graphics.Rect r4 = r6.f5518f     // Catch:{ all -> 0x0057 }
                int r4 = r4.width()     // Catch:{ all -> 0x0057 }
                android.graphics.Rect r5 = r6.f5518f     // Catch:{ all -> 0x0057 }
                int r5 = r5.height()     // Catch:{ all -> 0x0057 }
                android.graphics.Canvas r4 = r3.beginRecording(r4, r5)     // Catch:{ all -> 0x0057 }
                java.lang.String r5 = "picture.beginRecording(s…), screenBounds.height())"
                q7.k.d(r4, r5)     // Catch:{ all -> 0x0057 }
                r6.i(r4, r7)     // Catch:{ all -> 0x0057 }
                r3.endRecording()     // Catch:{ all -> 0x0057 }
                r6.e(r1)     // Catch:{ all -> 0x0057 }
                r8.e = r2     // Catch:{ all -> 0x0057 }
                android.graphics.Rect r7 = r6.f5518f     // Catch:{ all -> 0x0057 }
                int r7 = r7.width()     // Catch:{ all -> 0x0057 }
                android.graphics.Rect r6 = r6.f5518f     // Catch:{ all -> 0x0057 }
                int r6 = r6.height()     // Catch:{ all -> 0x0057 }
                android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0057 }
                java.lang.String r1 = "config"
                q7.k.e(r8, r1)     // Catch:{ all -> 0x0057 }
                android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r3, r7, r6, r8)     // Catch:{ all -> 0x0057 }
                java.lang.String r7 = "createBitmap(picture, width, height, config)"
                q7.k.d(r6, r7)     // Catch:{ all -> 0x0057 }
                r7 = 0
                k3.j.n(r0, r7)
                return r6
            L_0x0057:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x0059 }
            L_0x0059:
                r7 = move-exception
                k3.j.n(r0, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.b0.b.g(java.time.ZonedDateTime, n1.z):android.graphics.Bitmap");
        }

        public final Object h() {
            com.samsung.android.wearable.watchfacestudio.a aVar = (com.samsung.android.wearable.watchfacestudio.a) this;
            Log.i("DWF:WatchFaceRenderer", String.format("WatchFaceRenderer uiThreadInit: headless(%s), renderer: %s", new Object[]{Boolean.valueOf(aVar.f3844q.f5639j), aVar}));
            com.samsung.android.wearable.watchfacestudio.c cVar = (com.samsung.android.wearable.watchfacestudio.c) aVar.f3848v;
            WatchFaceStudioRuntime watchFaceStudioRuntime = cVar.f3860b;
            Map<Integer, WatchFaceStudioRuntime.b> map = watchFaceStudioRuntime.f3837i;
            if (map != null && map.size() > 0) {
                Log.i("DWF:WatchFaceStudioRuntime", String.format("update pending complication data: headless(%s), runtime: %s", new Object[]{Boolean.valueOf(cVar.f3859a.f5639j), cVar}));
                for (Map.Entry next : watchFaceStudioRuntime.f3837i.entrySet()) {
                    watchFaceStudioRuntime.f3834f.u(((Integer) next.getKey()).intValue(), ((WatchFaceStudioRuntime.b) next.getValue()).f3841a, Instant.now(), ((WatchFaceStudioRuntime.b) next.getValue()).f3842b);
                }
                watchFaceStudioRuntime.f3837i = null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.samsung.watchface.debug.ENABLE_FPS");
            intentFilter.addAction("com.samsung.watchface.debug.SET_DATA_VALUE");
            intentFilter.addAction("com.samsung.watchface.debug.DEBUG_RESUME_DATA_MANAGER");
            intentFilter.addAction("com.samsung.watchface.debug.DEBUG_RESUME_VIEWER");
            intentFilter.addAction("com.samsung.watchface.debug.DEBUG_PAUSE_VIEWER");
            intentFilter.addAction("com.samsung.watchface.debug.DEBUG_DRAW_BOUNDS");
            intentFilter.addAction("com.samsung.watchface.ON_REQUEST_PERMISSION_RESULT");
            x0.a a9 = x0.a.a(aVar.f3843p);
            BroadcastReceiver broadcastReceiver = aVar.H;
            synchronized (a9.f8101b) {
                a.c cVar2 = new a.c(broadcastReceiver, intentFilter);
                ArrayList arrayList = a9.f8101b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    a9.f8101b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar2);
                for (int i8 = 0; i8 < intentFilter.countActions(); i8++) {
                    String action = intentFilter.getAction(i8);
                    ArrayList arrayList2 = a9.f8102c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        a9.f8102c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar2);
                }
            }
            aVar.f3849x = new j5.a(aVar.f3843p, aVar.f3844q.f5639j);
            q5.c cVar3 = new q5.c(aVar.f3843p, aVar.f3846t.b(), aVar.f3845s);
            aVar.E = new p(aVar.f3843p);
            aVar.y = new r5.k(aVar.f3843p, new i5.b(aVar), aVar.f3849x, cVar3, aVar.f3847u, aVar.f3844q.f5639j);
            if (!aVar.f3844q.f5639j) {
                j5.e eVar = new j5.e(aVar.f3843p, aVar.f3846t.f7096j, aVar.E);
                d6.d dVar = aVar.y.f7113k.f7952a;
                if (dVar.f4054h) {
                    Log.w("DWF:DefaultDataProvider", "setExternalModelHealth should be called before listen()");
                } else {
                    int ordinal = w5.d.I0.ordinal();
                    dVar.f4065q.getClass();
                    w5.d dVar2 = w5.d.J0;
                    if (ordinal <= dVar2.ordinal()) {
                        int ordinal2 = w5.d.S0.ordinal();
                        dVar.f4065q.getClass();
                        if (ordinal2 >= w5.d.N0.ordinal()) {
                            c6.f fVar = dVar.f4065q;
                            fVar.getClass();
                            for (int ordinal3 = dVar2.ordinal(); ordinal3 < w5.d.N0.ordinal(); ordinal3++) {
                                dVar.f4062n.remove(w5.d.values()[ordinal3]);
                            }
                            dVar.f4061m.remove(fVar);
                        }
                    }
                    eVar.f2717b = new androidx.health.services.client.impl.c(dVar, 5, eVar);
                    dVar.v(eVar);
                    boolean z8 = dVar.e;
                    if (eVar.e != z8) {
                        eVar.e = z8;
                    }
                    eVar.f2718c = dVar.r;
                }
                if (!eVar.f5027n) {
                    int intValue = ((Integer) eVar.f5022i.a()).intValue();
                    if (intValue == -1) {
                        eVar.t(6000);
                    } else {
                        eVar.t(intValue);
                    }
                    w5.c cVar4 = new w5.c("COMPLICATION.internal_step_complication.TEXT");
                    eVar.u(eVar.q(eVar.f2718c.b(cVar4).h()));
                    eVar.f2718c.a(cVar4, new j5.c(eVar, 0));
                    eVar.f5027n = true;
                }
            }
            aVar.y.d(aVar.f3846t, aVar.A.booleanValue());
            aVar.f3850z = new q5.e(new androidx.activity.b(4, aVar));
            j1 j1Var = aVar.f3844q;
            if (j1Var != null && !j1Var.f5639j) {
                j1Var.f5631a.collect(aVar.J, new i());
                j1Var.f5632b.collect(new i5.c(1, aVar), new i());
                j1Var.f5633c.collect(new i5.c(2, aVar), new i());
                j1Var.f5634d.collect(new i5.c(3, aVar), new i());
                aVar.f3843p.registerReceiver(aVar.I, new IntentFilter("android.intent.action.TIME_SET"));
            }
            aVar.y.f7112j.f7081l.f7211b = new i5.b(aVar);
            return h7.h.f4787a;
        }

        public final void i(Canvas canvas, ZonedDateTime zonedDateTime) {
            boolean z8 = true;
            boolean z9 = !this.f5521i.f5892b.isEmpty();
            boolean z10 = this.f5529o;
            if (z9) {
                a aVar = (a) this;
                k.e(this.f5518f, "bounds");
                k.b(aVar.f5522j.f5544a);
                com.samsung.android.wearable.watchfacestudio.a aVar2 = (com.samsung.android.wearable.watchfacestudio.a) aVar;
                j1 j1Var = aVar2.f3844q;
                aVar2.n(j1Var.f5632b.getValue().booleanValue());
                boolean booleanValue = j1Var.f5634d.getValue().booleanValue();
                if (!aVar2.B.equals(Boolean.valueOf(booleanValue))) {
                    aVar2.B = Boolean.valueOf(booleanValue);
                    aVar2.l();
                }
                if (j1Var.f5639j) {
                    Log.i("DWF:WatchFaceRenderer", "render watch face in headless mode");
                    d6.d dVar = aVar2.y.f7113k.f7952a;
                    if (!dVar.f4058j) {
                        dVar.f4058j = true;
                        dVar.r();
                    }
                    aVar2.y.h(r5.k.e(zonedDateTime.toInstant()));
                    aVar2.y.g();
                }
                if (aVar2.A.booleanValue()) {
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis());
                    Log.i("DWF:WatchFaceRenderer", "Update Ambient [Prev:" + aVar2.C + ", now:" + minutes + "]");
                    if (aVar2.C != minutes) {
                        aVar2.C = minutes;
                        aVar2.y.h(zonedDateTime);
                    }
                }
                aVar2.y.b(canvas);
                if (aVar2.F) {
                    aVar2.o();
                    aVar2.F = false;
                }
                k5.a aVar3 = aVar2.G;
                if (aVar3 != null) {
                    if (aVar3.f5180d == null) {
                        Paint paint = new Paint(1);
                        aVar3.f5180d = paint;
                        paint.setColor(-65536);
                        aVar3.f5180d.setTextAlign(Paint.Align.CENTER);
                        aVar3.f5180d.setTextSize(20.0f);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    long j8 = aVar3.f5178b + 1;
                    aVar3.f5178b = j8;
                    long j9 = aVar3.f5177a;
                    if (currentTimeMillis > 1000 + j9) {
                        aVar3.f5179c = String.format(Locale.US, "%.2f", new Object[]{Float.valueOf((((float) j8) * 1000.0f) / ((float) (currentTimeMillis - j9)))});
                        aVar3.f5177a = currentTimeMillis;
                        aVar3.f5178b = 0;
                        Log.i("DWF:FpsRenderer", "FrameRate : " + aVar3.f5179c);
                    }
                    canvas.save();
                    canvas.setMatrix(new Matrix());
                    canvas.drawText(aVar3.f5179c, ((float) canvas.getWidth()) / 2.0f, (float) (canvas.getHeight() - 10), aVar3.f5180d);
                    canvas.restore();
                }
                z.a aVar4 = this.f5521i.f5893c;
                if (aVar4 != null) {
                    Picture picture = new Picture();
                    Canvas beginRecording = picture.beginRecording(this.f5518f.width(), this.f5518f.height());
                    k.d(beginRecording, "picture.beginRecording(s…), screenBounds.height())");
                    if (z10) {
                        beginRecording.drawColor(aVar4.f5897c);
                    }
                    j(beginRecording, this.f5518f, zonedDateTime);
                    picture.endRecording();
                    int width = this.f5518f.width();
                    int height = this.f5518f.height();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    k.e(config, "config");
                    Bitmap createBitmap = Bitmap.createBitmap(picture, width, height, config);
                    k.d(createBitmap, "createBitmap(picture, width, height, config)");
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, g0.f5560a);
                    createBitmap.recycle();
                    return;
                }
                return;
            }
            z.a aVar5 = this.f5521i.f5893c;
            if (aVar5 == null) {
                z8 = false;
            }
            if (z8) {
                if (z10) {
                    canvas.drawColor(aVar5.f5897c);
                }
                j(canvas, this.f5518f, zonedDateTime);
                return;
            }
            throw new IllegalArgumentException("We don't support empty renderParameters.watchFaceWatchFaceLayers without a non-null renderParameters.highlightLayer".toString());
        }

        public abstract void j(Canvas canvas, Rect rect, ZonedDateTime zonedDateTime);
    }

    public interface c {
        void a();
    }

    public b0(SurfaceHolder surfaceHolder, j1 j1Var) {
        d0 d0Var;
        this.f5514a = j1Var;
        this.f5516c = surfaceHolder;
        this.f5517d = new Object();
        surfaceHolder.addCallback(new a0(this));
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        k.d(surfaceFrame, "surfaceHolder.surfaceFrame");
        this.f5518f = surfaceFrame;
        this.f5519g = surfaceFrame.exactCenterX();
        this.f5520h = this.f5518f.exactCenterY();
        this.f5521i = z.f5890f;
        String name = getClass().getName();
        synchronized (f5513m) {
            HashMap<String, d0> hashMap = f5512l;
            hashMap.computeIfAbsent(name, new c0(0, e0.f5548f));
            d0 d0Var2 = hashMap.get(name);
            k.b(d0Var2);
            d0Var = d0Var2;
            d0Var.f5545b++;
        }
        this.f5522j = d0Var;
        this.f5523k = i7.k.f4879f;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(ZonedDateTime zonedDateTime);

    public abstract void d(ZonedDateTime zonedDateTime, z zVar, SurfaceHolder surfaceHolder);

    public final void e(z zVar) {
        k.e(zVar, "value");
        if (!k.a(zVar, this.f5521i)) {
            this.f5521i = zVar;
        }
    }

    public abstract boolean f();

    public abstract Bitmap g(ZonedDateTime zonedDateTime, z zVar);

    public abstract Object h();
}
