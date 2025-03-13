package n1;

import a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.service.wallpaper.WallpaperService;
import android.support.wearable.complications.ComplicationData;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.accessibility.AccessibilityManager;
import androidx.wear.watchface.control.a;
import androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams;
import androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams;
import androidx.wear.watchface.control.h;
import androidx.wear.watchface.data.DeviceConfig;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import androidx.wear.watchface.data.WatchUiState;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l7.h;
import n1.b0;
import n1.h;
import n1.i0;
import n1.z;
import p7.l;
import p7.p;
import q7.k;
import r1.h0;
import t1.l;
import t1.n;
import u1.j;
import y7.a0;
import y7.g1;
import y7.o;
import y7.z;

public abstract class t0 extends WallpaperService {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f5732d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h7.f f5733a = a1.a.z(new f(this));

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f5734b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5735c = Build.VERSION.SDK_INT;

    public static final class a {

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredWatchFaceImplThenRunOnUiThreadBlocking$1", f = "WatchFaceService.kt", l = {407}, m = "invokeSuspend")
        /* renamed from: n1.t0$a$a  reason: collision with other inner class name */
        public static final class C0091a extends h implements p<c, j7.d<? super p0>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5736j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f5737k;

            public C0091a(j7.d<? super C0091a> dVar) {
                super(2, dVar);
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                C0091a aVar = new C0091a(dVar);
                aVar.f5737k = obj;
                return aVar;
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0091a) c((c) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5736j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    o oVar = ((c) this.f5737k).f5748i;
                    this.f5736j = 1;
                    obj = oVar.s(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        public static Object a(c cVar, String str, int i8, l lVar) {
            b6.a.j(i8, "executionThread");
            k.e(lVar, "task");
            return b(cVar, str, i8, lVar, new r0((j7.d<? super r0>) null));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
            k3.j.n(r1, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
            throw r10;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object b(n1.t0.c r9, java.lang.String r10, int r11, p7.l r12, p7.p r13) {
            /*
                java.lang.String r0 = "Task "
                v1.c r1 = new v1.c
                r1.<init>(r10)
                java.lang.String r2 = android.os.Build.TYPE     // Catch:{ all -> 0x003e }
                java.lang.String r3 = "userdebug"
                r2.equals(r3)     // Catch:{ all -> 0x003e }
                r2 = 0
                if (r9 != 0) goto L_0x002b
                java.lang.String r9 = "WatchFaceService"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
                r11.<init>(r0)     // Catch:{ all -> 0x003e }
                r11.append(r10)     // Catch:{ all -> 0x003e }
                java.lang.String r10 = " posted after close(), ignoring."
                r11.append(r10)     // Catch:{ all -> 0x003e }
                java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x003e }
                android.util.Log.w(r9, r10)     // Catch:{ all -> 0x003e }
                k3.j.n(r1, r2)
                return r2
            L_0x002b:
                n1.s0 r10 = new n1.s0     // Catch:{ all -> 0x003e }
                r8 = 0
                r3 = r10
                r4 = r13
                r5 = r9
                r6 = r11
                r7 = r12
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003e }
                java.lang.Object r9 = k3.j.Z(r10)     // Catch:{ all -> 0x003e }
                k3.j.n(r1, r2)
                return r9
            L_0x003e:
                r9 = move-exception
                throw r9     // Catch:{ all -> 0x0040 }
            L_0x0040:
                r10 = move-exception
                k3.j.n(r1, r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.a.b(n1.t0$c, java.lang.String, int, p7.l, p7.p):java.lang.Object");
        }

        public static Object c(c cVar, String str, l lVar) {
            k.e(lVar, "task");
            return b(cVar, str, 1, lVar, new C0091a((j7.d<? super C0091a>) null));
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final l f5738a;

        /* renamed from: b  reason: collision with root package name */
        public final u1.b f5739b;

        /* renamed from: c  reason: collision with root package name */
        public final j f5740c;

        public b(l lVar, u1.b bVar, j jVar) {
            this.f5738a = lVar;
            this.f5739b = bVar;
            this.f5740c = jVar;
        }
    }

    public final class c extends WallpaperService.Engine implements j0, AccessibilityManager.AccessibilityStateChangeListener {
        public static final /* synthetic */ int O = 0;
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public final a8.g F;
        public UserStyleWireFormat G;
        public String H;
        public String I;
        public final k3.j J;
        public final Object K;
        public final RemoteCallbackList<r1.q> L;
        public Rect M;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f5741a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f5742b;

        /* renamed from: c  reason: collision with root package name */
        public final c8.c f5743c;

        /* renamed from: d  reason: collision with root package name */
        public final c8.c f5744d;
        public final Context e;

        /* renamed from: f  reason: collision with root package name */
        public final e f5745f = new e(this);

        /* renamed from: g  reason: collision with root package name */
        public final y7.o f5746g = k3.j.d();

        /* renamed from: h  reason: collision with root package name */
        public final y7.o f5747h = k3.j.d();

        /* renamed from: i  reason: collision with root package name */
        public final y7.o f5748i = k3.j.d();

        /* renamed from: j  reason: collision with root package name */
        public final y7.o f5749j = k3.j.d();

        /* renamed from: k  reason: collision with root package name */
        public final y7.o f5750k = k3.j.d();

        /* renamed from: l  reason: collision with root package name */
        public final androidx.appcompat.widget.p f5751l;

        /* renamed from: m  reason: collision with root package name */
        public final y f5752m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5753n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5754o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f5755p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f5756q;
        public PowerManager.WakeLock r;

        /* renamed from: s  reason: collision with root package name */
        public f1 f5757s;

        /* renamed from: t  reason: collision with root package name */
        public final g1 f5758t;

        /* renamed from: u  reason: collision with root package name */
        public final int f5759u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f5760v;
        public final f w;

        /* renamed from: x  reason: collision with root package name */
        public final Runnable f5761x;
        public WallpaperInteractiveWatchFaceInstanceParams y;

        /* renamed from: z  reason: collision with root package name */
        public b.a[] f5762z;

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$addWatchFaceListener$2", f = "WatchFaceService.kt", l = {2808}, m = "invokeSuspend")
        public static final class a extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5763j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5764k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ r1.q f5765l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, r1.q qVar, j7.d<? super a> dVar) {
                super(2, dVar);
                this.f5764k = cVar;
                this.f5765l = qVar;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new a(this.f5764k, this.f5765l, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((a) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5763j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = this.f5764k.f5748i;
                    this.f5763j = 1;
                    if (oVar.s(this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    this.f5765l.a();
                } catch (Exception e) {
                    Log.e("WatchFaceService", "listener.onWatchfaceReady failed", e);
                }
                return h7.h.f4787a;
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper", f = "WatchFaceService.kt", l = {1625}, m = "addWatchfaceReadyListener$watchface_release")
        public static final class b extends l7.c {

            /* renamed from: i  reason: collision with root package name */
            public Object f5766i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f5767j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5768k;

            /* renamed from: l  reason: collision with root package name */
            public int f5769l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(c cVar, j7.d<? super b> dVar) {
                super(dVar);
                this.f5768k = cVar;
            }

            public final Object h(Object obj) {
                this.f5767j = obj;
                this.f5769l |= Integer.MIN_VALUE;
                return this.f5768k.o((r1.s) null, this);
            }
        }

        /* renamed from: n1.t0$c$c  reason: collision with other inner class name */
        public static final class C0092c implements SurfaceHolder {

            /* renamed from: a  reason: collision with root package name */
            public final HashSet<SurfaceHolder.Callback> f5770a = new HashSet<>();

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ HeadlessWatchFaceInstanceParams f5771b;

            public C0092c(HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams) {
                this.f5771b = headlessWatchFaceInstanceParams;
            }

            public final void addCallback(SurfaceHolder.Callback callback) {
                q7.k.e(callback, "callback");
                this.f5770a.add(callback);
            }

            public final Surface getSurface() {
                throw new h7.c();
            }

            public final Rect getSurfaceFrame() {
                HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams = this.f5771b;
                return new Rect(0, 0, headlessWatchFaceInstanceParams.f2271h, headlessWatchFaceInstanceParams.f2272i);
            }

            public final boolean isCreating() {
                throw new h7.c();
            }

            public final Canvas lockCanvas() {
                throw new h7.c();
            }

            public final Canvas lockCanvas(Rect rect) {
                throw new h7.c();
            }

            public final void removeCallback(SurfaceHolder.Callback callback) {
                q7.k.e(callback, "callback");
                this.f5770a.remove(callback);
            }

            public final void setFixedSize(int i8, int i9) {
                throw new h7.c();
            }

            public final void setFormat(int i8) {
                throw new h7.c();
            }

            public final void setKeepScreenOn(boolean z8) {
                throw new h7.c();
            }

            public final void setSizeFromLayout() {
                throw new h7.c();
            }

            public final void setType(int i8) {
                throw new h7.c();
            }

            public final void unlockCanvasAndPost(Canvas canvas) {
                throw new h7.c();
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$createWatchFaceInternal$1", f = "WatchFaceService.kt", l = {2255, 2262, 2272}, m = "invokeSuspend")
        public static final class d extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public long f5772j;

            /* renamed from: k  reason: collision with root package name */
            public Object f5773k;

            /* renamed from: l  reason: collision with root package name */
            public Object f5774l;

            /* renamed from: m  reason: collision with root package name */
            public Object f5775m;

            /* renamed from: n  reason: collision with root package name */
            public Object f5776n;

            /* renamed from: o  reason: collision with root package name */
            public Object f5777o;

            /* renamed from: p  reason: collision with root package name */
            public int f5778p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ c f5779q;
            public final /* synthetic */ j1 r;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ t0 f5780s;

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ SurfaceHolder f5781t;

            @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$createWatchFaceInternal$1$1", f = "WatchFaceService.kt", l = {2245}, m = "invokeSuspend")
            public static final class a extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

                /* renamed from: j  reason: collision with root package name */
                public int f5782j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ c f5783k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ l f5784l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ u1.b f5785m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ y7.n<i0> f5786n;

                /* renamed from: o  reason: collision with root package name */
                public final /* synthetic */ y7.n<h7.h> f5787o;

                /* renamed from: p  reason: collision with root package name */
                public final /* synthetic */ j1 f5788p;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(c cVar, l lVar, u1.b bVar, y7.n<i0> nVar, y7.n<h7.h> nVar2, j1 j1Var, j7.d<? super a> dVar) {
                    super(2, dVar);
                    this.f5783k = cVar;
                    this.f5784l = lVar;
                    this.f5785m = bVar;
                    this.f5786n = nVar;
                    this.f5787o = nVar2;
                    this.f5788p = j1Var;
                }

                public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                    return new a(this.f5783k, this.f5784l, this.f5785m, this.f5786n, this.f5787o, this.f5788p, dVar);
                }

                public final Object g(Object obj, Object obj2) {
                    return ((a) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
                }

                public final Object h(Object obj) {
                    k7.a aVar = k7.a.f5217f;
                    int i8 = this.f5782j;
                    if (i8 == 0) {
                        a1.a.I(obj);
                        c cVar = this.f5783k;
                        l lVar = this.f5784l;
                        u1.b bVar = this.f5785m;
                        y7.n<i0> nVar = this.f5786n;
                        y7.n<h7.h> nVar2 = this.f5787o;
                        j1 j1Var = this.f5788p;
                        this.f5782j = 1;
                        if (c.m(cVar, lVar, bVar, nVar, nVar2, j1Var, this) == aVar) {
                            return aVar;
                        }
                    } else if (i8 == 1) {
                        a1.a.I(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return h7.h.f4787a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(c cVar, j1 j1Var, t0 t0Var, SurfaceHolder surfaceHolder, j7.d<? super d> dVar) {
                super(2, dVar);
                this.f5779q = cVar;
                this.r = j1Var;
                this.f5780s = t0Var;
                this.f5781t = surfaceHolder;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new d(this.f5779q, this.r, this.f5780s, this.f5781t, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((d) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e0, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e2, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f0, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f1, code lost:
                r2 = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
                k3.j.n(r3, r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f5, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:129:0x0308, code lost:
                throw r0;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0030, B:79:0x022c, B:119:0x02ef] */
            /* JADX WARNING: Removed duplicated region for block: B:103:0x02b2 A[Catch:{ all -> 0x02f0, CancellationException -> 0x02e2, Exception -> 0x02e0 }, RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x02b3 A[Catch:{ all -> 0x02f0, CancellationException -> 0x02e2, Exception -> 0x02e0 }] */
            /* JADX WARNING: Removed duplicated region for block: B:107:0x02c4 A[Catch:{ all -> 0x02f0, CancellationException -> 0x02e2, Exception -> 0x02e0 }] */
            /* JADX WARNING: Removed duplicated region for block: B:110:0x02da A[Catch:{ all -> 0x02f0, CancellationException -> 0x02e2, Exception -> 0x02e0 }] */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x02e2 A[ExcHandler: CancellationException (r0v4 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:6:0x0030] */
            /* JADX WARNING: Removed duplicated region for block: B:95:0x0284 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:96:0x0285  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object h(java.lang.Object r27) {
                /*
                    r26 = this;
                    r0 = r26
                    n1.t0 r7 = r0.f5780s
                    k7.a r8 = k7.a.f5217f
                    int r1 = r0.f5778p
                    java.lang.String r9 = "WatchFaceService"
                    r10 = 3
                    r11 = 2
                    n1.j1 r12 = r0.r
                    r13 = 1
                    r14 = 0
                    n1.t0$c r6 = r0.f5779q
                    if (r1 == 0) goto L_0x0083
                    if (r1 == r13) goto L_0x0063
                    if (r1 == r11) goto L_0x003e
                    if (r1 != r10) goto L_0x0036
                    long r1 = r0.f5772j
                    java.lang.Object r3 = r0.f5777o
                    n1.i0 r3 = (n1.i0) r3
                    java.lang.Object r4 = r0.f5776n
                    y7.n r4 = (y7.n) r4
                    java.lang.Object r5 = r0.f5775m
                    y7.n r5 = (y7.n) r5
                    java.lang.Object r7 = r0.f5774l
                    n1.l r7 = (n1.l) r7
                    java.lang.Object r0 = r0.f5773k
                    u1.b r0 = (u1.b) r0
                    a1.a.I(r27)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x007f }
                    r13 = r6
                    goto L_0x02b6
                L_0x0036:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x003e:
                    long r1 = r0.f5772j
                    java.lang.Object r3 = r0.f5777o
                    java.io.Closeable r3 = (java.io.Closeable) r3
                    java.lang.Object r4 = r0.f5776n
                    y7.n r4 = (y7.n) r4
                    java.lang.Object r5 = r0.f5775m
                    y7.n r5 = (y7.n) r5
                    java.lang.Object r7 = r0.f5774l
                    n1.l r7 = (n1.l) r7
                    java.lang.Object r11 = r0.f5773k
                    u1.b r11 = (u1.b) r11
                    a1.a.I(r27)     // Catch:{ all -> 0x005e }
                    r14 = r1
                    r13 = r6
                    r10 = r11
                    r1 = r27
                    goto L_0x028b
                L_0x005e:
                    r0 = move-exception
                    r1 = r0
                    r13 = r6
                    goto L_0x02ef
                L_0x0063:
                    long r1 = r0.f5772j
                    java.lang.Object r3 = r0.f5776n
                    y7.n r3 = (y7.n) r3
                    java.lang.Object r4 = r0.f5775m
                    y7.n r4 = (y7.n) r4
                    java.lang.Object r5 = r0.f5774l
                    n1.l r5 = (n1.l) r5
                    java.lang.Object r7 = r0.f5773k
                    u1.b r7 = (u1.b) r7
                    a1.a.I(r27)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x007f }
                    r10 = r5
                    r13 = r6
                    r5 = r1
                    r2 = r27
                    goto L_0x024a
                L_0x007f:
                    r0 = move-exception
                    r13 = r6
                    goto L_0x02f6
                L_0x0083:
                    a1.a.I(r27)
                    long r4 = java.lang.System.currentTimeMillis()
                    v1.c r1 = new v1.c
                    java.lang.String r2 = "WatchFaceService.createUserStyleSchema"
                    r1.<init>(r2)
                    u1.b r3 = new u1.b     // Catch:{ all -> 0x032f }
                    r6.getClass()     // Catch:{ all -> 0x032f }
                    u1.l r2 = r7.b()     // Catch:{ all -> 0x032f }
                    r3.<init>(r2)     // Catch:{ all -> 0x032f }
                    k3.j.n(r1, r14)
                    java.lang.String r1 = "watchface_prefs_"
                    v1.c r2 = new v1.c
                    java.lang.String r15 = "initStyle"
                    r2.<init>(r15)
                    n1.t0 r15 = n1.t0.this
                    androidx.wear.watchface.style.data.UserStyleWireFormat r11 = r6.G     // Catch:{ all -> 0x0326 }
                    android.content.Context r13 = r6.e
                    u1.l r10 = r3.f7605a
                    if (r11 == 0) goto L_0x00da
                    v1.c r1 = new v1.c     // Catch:{ all -> 0x0326 }
                    java.lang.String r15 = "WatchFaceImpl.init apply userStyle"
                    r1.<init>(r15)     // Catch:{ all -> 0x0326 }
                    u1.e r15 = new u1.e     // Catch:{ all -> 0x00d1 }
                    u1.f r14 = new u1.f     // Catch:{ all -> 0x00d1 }
                    r14.<init>((androidx.wear.watchface.style.data.UserStyleWireFormat) r11)     // Catch:{ all -> 0x00d1 }
                    r15.<init>(r14, r10)     // Catch:{ all -> 0x00d1 }
                    r3.a(r15)     // Catch:{ all -> 0x00d1 }
                    h7.h r10 = h7.h.f4787a     // Catch:{ all -> 0x00d1 }
                    r10 = 0
                    k3.j.n(r1, r10)     // Catch:{ all -> 0x0326 }
                    r21 = r4
                    r10 = 0
                    goto L_0x012b
                L_0x00d1:
                    r0 = move-exception
                    r3 = r0
                    throw r3     // Catch:{ all -> 0x00d4 }
                L_0x00d4:
                    r0 = move-exception
                    r4 = r0
                    k3.j.n(r1, r3)     // Catch:{ all -> 0x0326 }
                    throw r4     // Catch:{ all -> 0x0326 }
                L_0x00da:
                    v1.c r11 = new v1.c     // Catch:{ all -> 0x0326 }
                    java.lang.String r14 = "WatchFaceImpl.init apply userStyle from prefs"
                    r11.<init>(r14)     // Catch:{ all -> 0x0326 }
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x031d }
                    r14.<init>(r1)     // Catch:{ all -> 0x031d }
                    java.lang.Class r1 = r13.getClass()     // Catch:{ all -> 0x031d }
                    java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x031d }
                    r14.append(r1)     // Catch:{ all -> 0x031d }
                    java.lang.String r1 = ".txt"
                    r14.append(r1)     // Catch:{ all -> 0x031d }
                    java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x031d }
                    u1.e r14 = new u1.e     // Catch:{ all -> 0x031d }
                    r21 = r4
                    u1.f r4 = new u1.f     // Catch:{ all -> 0x031d }
                    r15.getClass()     // Catch:{ all -> 0x031d }
                    androidx.wear.watchface.style.data.UserStyleWireFormat r5 = n1.t0.h(r13, r1)     // Catch:{ all -> 0x031d }
                    r4.<init>((androidx.wear.watchface.style.data.UserStyleWireFormat) r5)     // Catch:{ all -> 0x031d }
                    r14.<init>(r4, r10)     // Catch:{ all -> 0x031d }
                    r3.a(r14)     // Catch:{ all -> 0x031d }
                    c8.c r4 = r6.f5743c     // Catch:{ all -> 0x031d }
                    n1.x0 r5 = new n1.x0     // Catch:{ all -> 0x031d }
                    r20 = 0
                    r10 = r15
                    r15 = r5
                    r16 = r3
                    r17 = r10
                    r18 = r6
                    r19 = r1
                    r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x031d }
                    r1 = 3
                    r10 = 0
                    k3.j.K(r4, r10, r5, r1)     // Catch:{ all -> 0x031d }
                    k3.j.n(r11, r10)     // Catch:{ all -> 0x0326 }
                L_0x012b:
                    k3.j.n(r2, r10)
                    v1.c r1 = new v1.c
                    java.lang.String r2 = "WatchFaceService.createComplicationsManager"
                    r1.<init>(r2)
                    n1.l r10 = r7.a(r3)     // Catch:{ all -> 0x0314 }
                    r2 = 0
                    k3.j.n(r1, r2)
                    r10.getClass()
                    r10.f5653c = r6
                    java.lang.String r1 = "<set-?>"
                    q7.k.e(r12, r1)
                    r10.f5652b = r12
                    java.lang.String r1 = "coroutineScope"
                    c8.c r2 = r6.f5744d
                    q7.k.e(r2, r1)
                    q7.p r1 = new q7.p
                    r1.<init>()
                    u1.b r4 = r10.f5651a
                    u1.l r5 = r4.f7605a
                    a8.g r4 = r4.f7606b
                    java.lang.Object r4 = r4.getValue()
                    u1.e r4 = (u1.e) r4
                    u1.m$c$c r4 = r5.b(r4)
                    r1.f6643f = r4
                    if (r4 == 0) goto L_0x016c
                    r10.a(r4)
                L_0x016c:
                    n1.o r4 = new n1.o
                    r5 = 0
                    r4.<init>(r10, r1, r5)
                    r1 = 3
                    k3.j.K(r2, r5, r4, r1)
                    n1.y0 r4 = new n1.y0
                    r4.<init>(r6, r10, r5)
                    k3.j.K(r2, r5, r4, r1)
                    boolean r1 = r12.f5639j
                    if (r1 != 0) goto L_0x01da
                    a8.f<java.lang.String> r1 = r12.f5640k
                    java.lang.Object r1 = r1.getValue()
                    r5 = r1
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.String r1 = "context"
                    q7.k.e(r13, r1)
                    java.lang.String r1 = "fileName"
                    q7.k.e(r5, r1)
                    java.lang.String r1 = "complicationsFlow"
                    a8.g r2 = r6.F
                    q7.k.e(r2, r1)
                    v1.c r11 = new v1.c
                    java.lang.String r1 = "WatchFaceService.writeComplicationCache"
                    r11.<init>(r1)
                    android.os.Handler r1 = r7.d()     // Catch:{ all -> 0x01d1 }
                    int r4 = z7.h.f8729a     // Catch:{ all -> 0x01d1 }
                    z7.f r4 = new z7.f     // Catch:{ all -> 0x01d1 }
                    r14 = 0
                    r15 = 0
                    r4.<init>(r1, r15, r14)     // Catch:{ all -> 0x01d1 }
                    z7.f r1 = r4.f8728k     // Catch:{ all -> 0x01d1 }
                    c8.c r14 = y7.a0.a(r1)     // Catch:{ all -> 0x01d1 }
                    n1.h1 r15 = new n1.h1     // Catch:{ all -> 0x01d1 }
                    r16 = 0
                    r1 = r15
                    r4 = r3
                    r3 = r7
                    r25 = r4
                    r23 = r21
                    r4 = r13
                    r13 = r6
                    r6 = r16
                    r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01d1 }
                    r1 = 3
                    r2 = 0
                    k3.j.K(r14, r2, r15, r1)     // Catch:{ all -> 0x01d1 }
                    k3.j.n(r11, r2)
                    goto L_0x01df
                L_0x01d1:
                    r0 = move-exception
                    r1 = r0
                    throw r1     // Catch:{ all -> 0x01d4 }
                L_0x01d4:
                    r0 = move-exception
                    r2 = r0
                    k3.j.n(r11, r1)
                    throw r2
                L_0x01da:
                    r25 = r3
                    r13 = r6
                    r23 = r21
                L_0x01df:
                    v1.c r1 = new v1.c
                    java.lang.String r2 = "WatchFaceService.createUserStyleFlavors"
                    r1.<init>(r2)
                    h7.f r2 = r7.f5733a     // Catch:{ all -> 0x030b }
                    java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x030b }
                    n1.k1 r2 = (n1.k1) r2     // Catch:{ all -> 0x030b }
                    u1.j r2 = r2.f5647c     // Catch:{ all -> 0x030b }
                    if (r2 != 0) goto L_0x01f7
                    u1.j r2 = new u1.j     // Catch:{ all -> 0x030b }
                    r2.<init>()     // Catch:{ all -> 0x030b }
                L_0x01f7:
                    r3 = 0
                    k3.j.n(r1, r3)
                    n1.t0$b r1 = new n1.t0$b
                    r3 = r25
                    r1.<init>(r10, r3, r2)
                    y7.o r2 = r13.f5746g
                    r2.X(r1)
                    y7.o r4 = k3.j.d()
                    y7.o r1 = k3.j.d()
                    c8.c r2 = r13.f5744d
                    n1.t0$c$d$a r5 = new n1.t0$c$d$a
                    n1.j1 r6 = r0.r
                    r22 = 0
                    r15 = r5
                    r16 = r13
                    r17 = r10
                    r18 = r3
                    r19 = r4
                    r20 = r1
                    r21 = r6
                    r15.<init>(r16, r17, r18, r19, r20, r21, r22)
                    r6 = 3
                    r7 = 0
                    k3.j.K(r2, r7, r5, r6)
                    android.view.SurfaceHolder r2 = r0.f5781t     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    if (r2 != 0) goto L_0x0252
                    y7.o r2 = r13.f5750k     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5773k = r3     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5774l = r10     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5775m = r4     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5776n = r1     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r5 = r23
                    r0.f5772j = r5     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r7 = 1
                    r0.f5778p = r7     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    java.lang.Object r2 = r2.s(r0)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    if (r2 != r8) goto L_0x0248
                    return r8
                L_0x0248:
                    r7 = r3
                    r3 = r1
                L_0x024a:
                    android.view.SurfaceHolder r2 = (android.view.SurfaceHolder) r2     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r11 = r4
                    r14 = r5
                    r6 = r10
                    r10 = r7
                    r7 = r3
                    goto L_0x0259
                L_0x0252:
                    r5 = r23
                    r7 = r1
                    r11 = r4
                    r14 = r5
                    r6 = r10
                    r10 = r3
                L_0x0259:
                    v1.c r5 = new v1.c     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    java.lang.String r1 = "WatchFaceService.createWatchFace"
                    r5.<init>(r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    n1.t0 r1 = r0.f5780s     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    n1.j1 r3 = r0.r     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r13.getClass()     // Catch:{ all -> 0x02e9 }
                    r0.f5773k = r10     // Catch:{ all -> 0x02e9 }
                    r0.f5774l = r6     // Catch:{ all -> 0x02e9 }
                    r0.f5775m = r11     // Catch:{ all -> 0x02e9 }
                    r0.f5776n = r7     // Catch:{ all -> 0x02e9 }
                    r0.f5777o = r5     // Catch:{ all -> 0x02e9 }
                    r0.f5772j = r14     // Catch:{ all -> 0x02e9 }
                    r4 = 2
                    r0.f5778p = r4     // Catch:{ all -> 0x02e9 }
                    r4 = r6
                    r16 = r5
                    r5 = r10
                    r17 = r6
                    r6 = r26
                    java.lang.Object r1 = r1.c(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x02e7 }
                    if (r1 != r8) goto L_0x0285
                    return r8
                L_0x0285:
                    r4 = r7
                    r5 = r11
                    r3 = r16
                    r7 = r17
                L_0x028b:
                    n1.i0 r1 = (n1.i0) r1     // Catch:{ all -> 0x02e4 }
                    r2 = 0
                    k3.j.n(r3, r2)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    y7.o r2 = r13.f5747h     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r2.X(r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    n1.b0 r2 = r1.f5614b     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5773k = r10     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5774l = r7     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5775m = r5     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5776n = r4     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5777o = r1     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r0.f5772j = r14     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r3 = 3
                    r0.f5778p = r3     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    n1.b0$a r2 = (n1.b0.a) r2     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r2.getClass()     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    java.lang.Object r0 = n1.b0.a.k(r2, r0)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    if (r0 != r8) goto L_0x02b3
                    return r8
                L_0x02b3:
                    r3 = r1
                    r0 = r10
                    r1 = r14
                L_0x02b6:
                    r5.u(r3)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    long r5 = r5 - r1
                    r1 = 5000(0x1388, double:2.4703E-320)
                    int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r1 <= 0) goto L_0x02c9
                    java.lang.String r1 = "createUserStyleSchema, createComplicationSlotsManager and createWatchFace should complete in less than 5000 milliseconds."
                    android.util.Log.e(r9, r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                L_0x02c9:
                    n1.b0 r1 = r3.f5614b     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r13.getClass()     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    n1.t0.c.A(r7, r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    h7.h r1 = h7.h.f4787a     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r4.u(r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    boolean r1 = r12.f5639j     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    if (r1 != 0) goto L_0x0300
                    u1.l r0 = r0.f7605a     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    r13.J(r0)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    goto L_0x0300
                L_0x02e0:
                    r0 = move-exception
                    goto L_0x02f6
                L_0x02e2:
                    r0 = move-exception
                    goto L_0x0308
                L_0x02e4:
                    r0 = move-exception
                    r1 = r0
                    goto L_0x02ef
                L_0x02e7:
                    r0 = move-exception
                    goto L_0x02ec
                L_0x02e9:
                    r0 = move-exception
                    r16 = r5
                L_0x02ec:
                    r1 = r0
                    r3 = r16
                L_0x02ef:
                    throw r1     // Catch:{ all -> 0x02f0 }
                L_0x02f0:
                    r0 = move-exception
                    r2 = r0
                    k3.j.n(r3, r1)     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                    throw r2     // Catch:{ CancellationException -> 0x02e2, Exception -> 0x02e0 }
                L_0x02f6:
                    java.lang.String r1 = "WatchFace crashed during init"
                    android.util.Log.e(r9, r1, r0)
                    y7.o r1 = r13.f5749j
                    r1.G(r0)
                L_0x0300:
                    y7.o r0 = r13.f5749j
                    h7.h r1 = h7.h.f4787a
                    r0.X(r1)
                    return r1
                L_0x0308:
                    throw r0
                L_0x0309:
                    r2 = r0
                    goto L_0x030d
                L_0x030b:
                    r0 = move-exception
                    goto L_0x0309
                L_0x030d:
                    throw r2     // Catch:{ all -> 0x030e }
                L_0x030e:
                    r0 = move-exception
                    r3 = r0
                    k3.j.n(r1, r2)
                    throw r3
                L_0x0314:
                    r0 = move-exception
                    r2 = r0
                    throw r2     // Catch:{ all -> 0x0317 }
                L_0x0317:
                    r0 = move-exception
                    r3 = r0
                    k3.j.n(r1, r2)
                    throw r3
                L_0x031d:
                    r0 = move-exception
                    r1 = r0
                    throw r1     // Catch:{ all -> 0x0320 }
                L_0x0320:
                    r0 = move-exception
                    r3 = r0
                    k3.j.n(r11, r1)     // Catch:{ all -> 0x0326 }
                    throw r3     // Catch:{ all -> 0x0326 }
                L_0x0326:
                    r0 = move-exception
                    r1 = r0
                    throw r1     // Catch:{ all -> 0x0329 }
                L_0x0329:
                    r0 = move-exception
                    r3 = r0
                    k3.j.n(r2, r1)
                    throw r3
                L_0x032f:
                    r0 = move-exception
                    r2 = r0
                    throw r2     // Catch:{ all -> 0x0332 }
                L_0x0332:
                    r0 = move-exception
                    r3 = r0
                    k3.j.n(r1, r2)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.d.h(java.lang.Object):java.lang.Object");
            }
        }

        public static final class e extends q7.l implements p7.l<r1.q, h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ t f5789f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(t tVar) {
                super(1);
                this.f5789f = tVar;
            }

            public final Object invoke(Object obj) {
                r1.q qVar = (r1.q) obj;
                q7.k.e(qVar, "it");
                this.f5789f.println("listener = " + qVar.asBinder());
                return h7.h.f4787a;
            }
        }

        public static final class f implements Choreographer.FrameCallback {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5790f;

            public f(c cVar) {
                this.f5790f = cVar;
            }

            public final void doFrame(long j8) {
                b0 b0Var;
                c cVar = this.f5790f;
                if (!cVar.f5754o) {
                    if (cVar.f5753n) {
                        boolean z8 = false;
                        cVar.f5760v = false;
                        p0 z9 = cVar.z();
                        if (!(z9 == null || (b0Var = z9.f5692k) == null || b0Var.f())) {
                            z8 = true;
                        }
                        if (!z8 && z9 != null) {
                            z9.e();
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Choreographer doFrame called but allowWatchfaceToAnimate is false".toString());
                }
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$getWatchFaceImplOrNull$1", f = "WatchFaceService.kt", l = {1356}, m = "invokeSuspend")
        public static final class g extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5791j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5792k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(c cVar, j7.d<? super g> dVar) {
                super(2, dVar);
                this.f5792k = cVar;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new g(this.f5792k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((g) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5791j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = this.f5792k.f5749j;
                    this.f5791j = 1;
                    if (oVar.s(this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return h7.h.f4787a;
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$getWatchFaceImplOrNull$2", f = "WatchFaceService.kt", l = {1361}, m = "invokeSuspend")
        public static final class h extends l7.h implements p7.p<z, j7.d<? super p0>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5793j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5794k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public h(c cVar, j7.d<? super h> dVar) {
                super(2, dVar);
                this.f5794k = cVar;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new h(this.f5794k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((h) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5793j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = this.f5794k.f5748i;
                    this.f5793j = 1;
                    obj = oVar.s(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        public static final class i {
        }

        public static final class j extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5795f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public j(c cVar) {
                super(0);
                this.f5795f = cVar;
            }

            public final Object invoke() {
                this.f5795f.p();
                return h7.h.f4787a;
            }
        }

        public static final class k extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5796f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Bundle f5797g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public k(c cVar, Bundle bundle) {
                super(0);
                this.f5796f = cVar;
                this.f5797g = bundle;
            }

            public final Object invoke() {
                e eVar = this.f5796f.f5745f;
                Bundle bundle = this.f5797g;
                q7.k.b(bundle);
                eVar.d(bundle);
                return h7.h.f4787a;
            }
        }

        public static final class l extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5798f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Bundle f5799g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public l(c cVar, Bundle bundle) {
                super(0);
                this.f5798f = cVar;
                this.f5799g = bundle;
            }

            public final Object invoke() {
                e eVar = this.f5798f.f5745f;
                Bundle bundle = this.f5799g;
                q7.k.b(bundle);
                eVar.getClass();
                bundle.setClassLoader(ComplicationData.class.getClassLoader());
                Parcelable parcelable = bundle.getParcelable("complication_data");
                q7.k.b(parcelable);
                eVar.f5835a.D(a1.a.A(new IdAndComplicationDataWireFormat(bundle.getInt("complication_id"), (ComplicationData) parcelable)));
                return h7.h.f4787a;
            }
        }

        public static final class m extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5800f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public m(c cVar) {
                super(0);
                this.f5800f = cVar;
            }

            public final Object invoke() {
                this.f5800f.f5745f.f();
                return h7.h.f4787a;
            }
        }

        public static final class n extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5801f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Bundle f5802g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public n(c cVar, Bundle bundle) {
                super(0);
                this.f5801f = cVar;
                this.f5802g = bundle;
            }

            public final Object invoke() {
                e eVar = this.f5801f.f5745f;
                Bundle bundle = this.f5802g;
                q7.k.b(bundle);
                eVar.getClass();
                IBinder binder = bundle.getBinder("binder");
                if (binder == null) {
                    Log.w("WatchFaceService", "Binder is null.");
                } else {
                    int i8 = a.C0000a.f0a;
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.wearable.watchface.IWatchFaceService");
                    eVar.f5836b = (queryLocalInterface == null || !(queryLocalInterface instanceof a.a)) ? new a.C0000a.C0001a(binder) : (a.a) queryLocalInterface;
                    synchronized (androidx.wear.watchface.control.h.f2293b) {
                        androidx.wear.watchface.control.h.f2295d = null;
                        h7.h hVar = h7.h.f4787a;
                    }
                    try {
                        eVar.f5843j = eVar.b().getApiVersion();
                    } catch (RemoteException e) {
                        Log.w("WatchFaceService", "Failed to getVersion: ", e);
                    }
                    k3.j.K(eVar.f5835a.f5744d, (g1) null, new d1(eVar, (j7.d<? super d1>) null), 3);
                }
                return h7.h.f4787a;
            }
        }

        public static final class o extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5803f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Bundle f5804g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public o(c cVar, Bundle bundle) {
                super(0);
                this.f5803f = cVar;
                this.f5804g = bundle;
            }

            public final Object invoke() {
                e eVar = this.f5803f.f5745f;
                Bundle bundle = this.f5804g;
                q7.k.b(bundle);
                eVar.e(bundle);
                return h7.h.f4787a;
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$onCommand$7", f = "WatchFaceService.kt", l = {1905}, m = "invokeSuspend")
        public static final class p extends l7.h implements p7.l<j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5805j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5806k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f5807l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ int f5808m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public p(c cVar, int i8, int i9, j7.d<? super p> dVar) {
                super(1, dVar);
                this.f5806k = cVar;
                this.f5807l = i8;
                this.f5808m = i9;
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5805j;
                c cVar = this.f5806k;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = cVar.f5748i;
                    this.f5805j = 1;
                    obj = oVar.s(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar.f5758t.getClass();
                Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                q7.k.d(ofEpochMilli, "ofEpochMilli(systemTimeP…er.getSystemTimeMillis())");
                ((p0) obj).f(2, new h0(this.f5807l, this.f5808m, ofEpochMilli));
                return h7.h.f4787a;
            }

            public final Object invoke(Object obj) {
                return new p(this.f5806k, this.f5807l, this.f5808m, (j7.d) obj).h(h7.h.f4787a);
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$onCommand$8", f = "WatchFaceService.kt", l = {1917}, m = "invokeSuspend")
        public static final class q extends l7.h implements p7.l<j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5809j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5810k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f5811l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ int f5812m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public q(c cVar, int i8, int i9, j7.d<? super q> dVar) {
                super(1, dVar);
                this.f5810k = cVar;
                this.f5811l = i8;
                this.f5812m = i9;
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5809j;
                c cVar = this.f5810k;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = cVar.f5748i;
                    this.f5809j = 1;
                    obj = oVar.s(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar.f5758t.getClass();
                Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                q7.k.d(ofEpochMilli, "ofEpochMilli(systemTimeP…er.getSystemTimeMillis())");
                ((p0) obj).f(0, new h0(this.f5811l, this.f5812m, ofEpochMilli));
                return h7.h.f4787a;
            }

            public final Object invoke(Object obj) {
                return new q(this.f5810k, this.f5811l, this.f5812m, (j7.d) obj).h(h7.h.f4787a);
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$onCommand$9", f = "WatchFaceService.kt", l = {1931}, m = "invokeSuspend")
        public static final class r extends l7.h implements p7.l<j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5813j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5814k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f5815l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ int f5816m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public r(c cVar, int i8, int i9, j7.d<? super r> dVar) {
                super(1, dVar);
                this.f5814k = cVar;
                this.f5815l = i8;
                this.f5816m = i9;
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5813j;
                c cVar = this.f5814k;
                if (i8 == 0) {
                    a1.a.I(obj);
                    y7.o oVar = cVar.f5748i;
                    this.f5813j = 1;
                    obj = oVar.s(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar.f5758t.getClass();
                Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
                q7.k.d(ofEpochMilli, "ofEpochMilli(systemTimeP…er.getSystemTimeMillis())");
                ((p0) obj).f(1, new h0(this.f5815l, this.f5816m, ofEpochMilli));
                return h7.h.f4787a;
            }

            public final Object invoke(Object obj) {
                return new r(this.f5814k, this.f5815l, this.f5816m, (j7.d) obj).h(h7.h.f4787a);
            }
        }

        public static final class s implements SurfaceHolder.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f5817a;

            public s(c cVar) {
                this.f5817a = cVar;
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
                q7.k.e(surfaceHolder, "holder");
                c cVar = this.f5817a;
                if (cVar.f5748i.V()) {
                    cVar.f();
                }
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                q7.k.e(surfaceHolder, "holder");
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                q7.k.e(surfaceHolder, "holder");
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$onDestroy$1$1", f = "WatchFaceService.kt", l = {1826, 1829}, m = "invokeSuspend")
        public static final class t extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5818j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ c f5819k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public t(c cVar, j7.d<? super t> dVar) {
                super(2, dVar);
                this.f5819k = cVar;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new t(this.f5819k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((t) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5818j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    c cVar = this.f5819k;
                    if (cVar.f5748i.V()) {
                        this.f5818j = 1;
                        obj = cVar.f5748i.s(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        y7.o oVar = cVar.f5747h;
                        if (oVar.V()) {
                            this.f5818j = 2;
                            obj = oVar.s(this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            ((i0) obj).f5614b.a();
                        }
                        return h7.h.f4787a;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else if (i8 == 2) {
                    a1.a.I(obj);
                    ((i0) obj).f5614b.a();
                    return h7.h.f4787a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ((p0) obj).d();
                return h7.h.f4787a;
            }
        }

        public static final class u extends q7.l implements p7.a<h7.h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5820f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public u(c cVar) {
                super(0);
                this.f5820f = cVar;
            }

            public final Object invoke() {
                this.f5820f.f();
                return h7.h.f4787a;
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$setUserStyle$1$1", f = "WatchFaceService.kt", l = {1586}, m = "invokeSuspend")
        public static final class v extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public Object f5821j;

            /* renamed from: k  reason: collision with root package name */
            public int f5822k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ c f5823l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ UserStyleWireFormat f5824m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public v(c cVar, UserStyleWireFormat userStyleWireFormat, j7.d<? super v> dVar) {
                super(2, dVar);
                this.f5823l = cVar;
                this.f5824m = userStyleWireFormat;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new v(this.f5823l, this.f5824m, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((v) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                c cVar;
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5822k;
                if (i8 == 0) {
                    a1.a.I(obj);
                    c cVar2 = this.f5823l;
                    y7.o oVar = cVar2.f5746g;
                    this.f5821j = cVar2;
                    this.f5822k = 1;
                    Object s8 = oVar.s(this);
                    if (s8 == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                    obj = s8;
                } else if (i8 == 1) {
                    cVar = (c) this.f5821j;
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u1.b bVar = ((b) obj).f5739b;
                int i9 = c.O;
                cVar.getClass();
                bVar.a(new u1.e(new u1.f(this.f5824m), bVar.f7605a));
                WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams = cVar.y;
                if (wallpaperInteractiveWatchFaceInstanceParams != null) {
                    UserStyleWireFormat userStyleWireFormat = new UserStyleWireFormat(((u1.e) bVar.f7606b.getValue()).a());
                    if (!wallpaperInteractiveWatchFaceInstanceParams.a().equals(userStyleWireFormat)) {
                        wallpaperInteractiveWatchFaceInstanceParams.f2281i = userStyleWireFormat;
                        wallpaperInteractiveWatchFaceInstanceParams.f2282j = i7.k.f4879f;
                        cVar.notifyColorsChanged();
                        k3.j.K(cVar.f5743c, (g1) null, new b1(t0.this, cVar, wallpaperInteractiveWatchFaceInstanceParams, (j7.d<? super b1>) null), 3);
                    }
                }
                return h7.h.f4787a;
            }
        }

        public static final class w implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ c f5825f;

            public w(c cVar) {
                this.f5825f = cVar;
            }

            public final void run() {
                this.f5825f.f();
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$updateContentDescriptionLabels$1", f = "WatchFaceService.kt", l = {2706, 2707}, m = "invokeSuspend")
        public static final class x extends l7.h implements p7.p<z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public Object f5826j;

            /* renamed from: k  reason: collision with root package name */
            public int f5827k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ c f5828l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ List<h7.d<Integer, b.a>> f5829m;

            public static final class a<T> implements Comparator {
                public final int compare(T t8, T t9) {
                    return a1.a.m((Integer) ((h7.d) t8).f4781f, (Integer) ((h7.d) t9).f4781f);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public x(c cVar, List<h7.d<Integer, b.a>> list, j7.d<? super x> dVar) {
                super(2, dVar);
                this.f5828l = cVar;
                this.f5829m = list;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new x(this.f5828l, this.f5829m, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((x) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
                r15 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
                k3.j.n(r1, r14);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0174, code lost:
                throw r15;
             */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0084 A[Catch:{ all -> 0x0170 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0087 A[Catch:{ all -> 0x0170 }] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0 A[Catch:{ all -> 0x0170 }] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00fe A[Catch:{ all -> 0x0170 }] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0148 A[Catch:{ all -> 0x0170 }, LOOP:2: B:40:0x0142->B:42:0x0148, LOOP_END] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object h(java.lang.Object r15) {
                /*
                    r14 = this;
                    k7.a r0 = k7.a.f5217f
                    int r1 = r14.f5827k
                    n1.t0$c r2 = r14.f5828l
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r4) goto L_0x001e
                    if (r1 != r3) goto L_0x0016
                    java.lang.Object r0 = r14.f5826j
                    n1.i0 r0 = (n1.i0) r0
                    a1.a.I(r15)
                    goto L_0x0049
                L_0x0016:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L_0x001e:
                    a1.a.I(r15)
                    goto L_0x0038
                L_0x0022:
                    a1.a.I(r15)
                    java.lang.String r15 = "WatchFaceService.updateContentDescriptionLabels A"
                    android.os.Trace.beginSection(r15)
                    android.os.Trace.endSection()
                    y7.o r15 = r2.f5747h
                    r14.f5827k = r4
                    java.lang.Object r15 = r15.s(r14)
                    if (r15 != r0) goto L_0x0038
                    return r0
                L_0x0038:
                    n1.i0 r15 = (n1.i0) r15
                    y7.o r1 = r2.f5746g
                    r14.f5826j = r15
                    r14.f5827k = r3
                    java.lang.Object r1 = r1.s(r14)
                    if (r1 != r0) goto L_0x0047
                    return r0
                L_0x0047:
                    r0 = r15
                    r15 = r1
                L_0x0049:
                    n1.t0$b r15 = (n1.t0.b) r15
                    v1.c r1 = new v1.c
                    java.lang.String r5 = "WatchFaceService.updateContentDescriptionLabels"
                    r1.<init>(r5)
                    java.util.List<h7.d<java.lang.Integer, b.a>> r14 = r14.f5829m
                    n1.b0 r0 = r0.f5614b     // Catch:{ all -> 0x016e }
                    n1.l r15 = r15.f5738a     // Catch:{ all -> 0x016e }
                    h7.d r5 = new h7.d     // Catch:{ all -> 0x016e }
                    java.lang.Integer r6 = new java.lang.Integer     // Catch:{ all -> 0x016e }
                    r7 = -1
                    r6.<init>(r7)     // Catch:{ all -> 0x016e }
                    b.a r7 = new b.a     // Catch:{ all -> 0x016e }
                    float r8 = r0.f5519g     // Catch:{ all -> 0x016e }
                    float r3 = (float) r3     // Catch:{ all -> 0x016e }
                    float r8 = r8 / r3
                    float r9 = r0.f5520h     // Catch:{ all -> 0x016e }
                    float r9 = r9 / r3
                    android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x016e }
                    float r10 = r0.f5519g     // Catch:{ all -> 0x016e }
                    float r11 = r10 - r8
                    int r11 = (int) r11     // Catch:{ all -> 0x016e }
                    float r12 = r0.f5520h     // Catch:{ all -> 0x016e }
                    float r13 = r12 - r9
                    int r13 = (int) r13     // Catch:{ all -> 0x016e }
                    float r10 = r10 + r8
                    int r8 = (int) r10     // Catch:{ all -> 0x016e }
                    float r12 = r12 + r9
                    int r9 = (int) r12     // Catch:{ all -> 0x016e }
                    r3.<init>(r11, r13, r8, r9)     // Catch:{ all -> 0x016e }
                    android.content.Context r8 = r2.e     // Catch:{ all -> 0x016e }
                    boolean r8 = android.text.format.DateFormat.is24HourFormat(r8)     // Catch:{ all -> 0x016e }
                    if (r8 == 0) goto L_0x0087
                    java.lang.String r8 = "HH:mm"
                    goto L_0x0089
                L_0x0087:
                    java.lang.String r8 = "h:mm a"
                L_0x0089:
                    android.support.wearable.complications.ComplicationText r9 = new android.support.wearable.complications.ComplicationText     // Catch:{ all -> 0x016e }
                    android.support.wearable.complications.TimeFormatText r10 = new android.support.wearable.complications.TimeFormatText     // Catch:{ all -> 0x016e }
                    r11 = 0
                    r10.<init>(r8, r4, r11)     // Catch:{ all -> 0x016e }
                    r9.<init>((java.lang.CharSequence) r11, (android.support.wearable.complications.TimeDependentText) r10)     // Catch:{ all -> 0x016e }
                    r7.<init>(r3, r9)     // Catch:{ all -> 0x016e }
                    r5.<init>(r6, r7)     // Catch:{ all -> 0x016e }
                    r14.add(r5)     // Catch:{ all -> 0x016e }
                    android.graphics.Rect r3 = r0.f5518f     // Catch:{ all -> 0x016e }
                    java.util.LinkedHashMap r15 = r15.e     // Catch:{ all -> 0x016e }
                    java.util.Set r15 = r15.entrySet()     // Catch:{ all -> 0x016e }
                    java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x016e }
                L_0x00a9:
                    boolean r5 = r15.hasNext()     // Catch:{ all -> 0x016e }
                    r6 = 0
                    if (r5 == 0) goto L_0x00f2
                    java.lang.Object r5 = r15.next()     // Catch:{ all -> 0x016e }
                    java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x016e }
                    java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x016e }
                    n1.h r5 = (n1.h) r5     // Catch:{ all -> 0x016e }
                    boolean r7 = r5.f5576q     // Catch:{ all -> 0x016e }
                    if (r7 == 0) goto L_0x00a9
                    int r7 = r5.f5562b     // Catch:{ all -> 0x016e }
                    if (r7 != r4) goto L_0x00c5
                    goto L_0x00a9
                L_0x00c5:
                    a8.g r7 = r5.D     // Catch:{ all -> 0x016e }
                    java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x016e }
                    q1.b r7 = (q1.b) r7     // Catch:{ all -> 0x016e }
                    android.content.Context r8 = r2.e     // Catch:{ all -> 0x016e }
                    android.support.wearable.complications.TimeDependentText r8 = r7.c(r8)     // Catch:{ all -> 0x016e }
                    if (r8 == 0) goto L_0x00a9
                    h7.d r9 = new h7.d     // Catch:{ all -> 0x016e }
                    int r10 = r5.f5580v     // Catch:{ all -> 0x016e }
                    java.lang.Integer r12 = new java.lang.Integer     // Catch:{ all -> 0x016e }
                    r12.<init>(r10)     // Catch:{ all -> 0x016e }
                    b.a r10 = new b.a     // Catch:{ all -> 0x016e }
                    android.graphics.Rect r5 = r5.b(r3, r6)     // Catch:{ all -> 0x016e }
                    android.app.PendingIntent r6 = r7.f6419b     // Catch:{ all -> 0x016e }
                    r10.<init>(r5, r8)     // Catch:{ all -> 0x016e }
                    r10.f2494h = r6     // Catch:{ all -> 0x016e }
                    r9.<init>(r12, r10)     // Catch:{ all -> 0x016e }
                    r14.add(r9)     // Catch:{ all -> 0x016e }
                    goto L_0x00a9
                L_0x00f2:
                    java.util.Collection<h7.d<java.lang.Integer, n1.q>> r15 = r0.f5523k     // Catch:{ all -> 0x016e }
                    java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x016e }
                L_0x00f8:
                    boolean r0 = r15.hasNext()     // Catch:{ all -> 0x016e }
                    if (r0 == 0) goto L_0x012c
                    java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x016e }
                    h7.d r0 = (h7.d) r0     // Catch:{ all -> 0x016e }
                    A r3 = r0.f4781f     // Catch:{ all -> 0x016e }
                    B r0 = r0.f4782g
                    b.a r5 = new b.a     // Catch:{ all -> 0x016e }
                    r7 = r0
                    n1.q r7 = (n1.q) r7     // Catch:{ all -> 0x016e }
                    android.graphics.Rect r7 = r7.f5706b     // Catch:{ all -> 0x016e }
                    r8 = r0
                    n1.q r8 = (n1.q) r8     // Catch:{ all -> 0x016e }
                    q1.c r8 = r8.f5705a     // Catch:{ all -> 0x016e }
                    android.support.wearable.complications.ComplicationText r8 = r8.a()     // Catch:{ all -> 0x016e }
                    r5.<init>(r7, r8)     // Catch:{ all -> 0x016e }
                    n1.q r0 = (n1.q) r0     // Catch:{ all -> 0x016e }
                    android.app.PendingIntent r0 = r0.f5707c     // Catch:{ all -> 0x016e }
                    r5.f2494h = r0     // Catch:{ all -> 0x016e }
                    h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x016e }
                    h7.d r0 = new h7.d     // Catch:{ all -> 0x016e }
                    r0.<init>(r3, r5)     // Catch:{ all -> 0x016e }
                    r14.add(r0)     // Catch:{ all -> 0x016e }
                    goto L_0x00f8
                L_0x012c:
                    n1.t0$c$x$a r15 = new n1.t0$c$x$a     // Catch:{ all -> 0x016e }
                    r15.<init>()     // Catch:{ all -> 0x016e }
                    java.util.List r14 = i7.i.Y(r14, r15)     // Catch:{ all -> 0x016e }
                    java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x016e }
                    int r0 = i7.f.M(r14)     // Catch:{ all -> 0x016e }
                    r15.<init>(r0)     // Catch:{ all -> 0x016e }
                    java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x016e }
                L_0x0142:
                    boolean r0 = r14.hasNext()     // Catch:{ all -> 0x016e }
                    if (r0 == 0) goto L_0x0156
                    java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x016e }
                    h7.d r0 = (h7.d) r0     // Catch:{ all -> 0x016e }
                    B r0 = r0.f4782g     // Catch:{ all -> 0x016e }
                    b.a r0 = (b.a) r0     // Catch:{ all -> 0x016e }
                    r15.add(r0)     // Catch:{ all -> 0x016e }
                    goto L_0x0142
                L_0x0156:
                    b.a[] r14 = new b.a[r6]     // Catch:{ all -> 0x016e }
                    java.lang.Object[] r14 = r15.toArray(r14)     // Catch:{ all -> 0x016e }
                    b.a[] r14 = (b.a[]) r14     // Catch:{ all -> 0x016e }
                    r2.E(r14)     // Catch:{ all -> 0x016e }
                    r2.f5756q = r4     // Catch:{ all -> 0x016e }
                    r2.B()     // Catch:{ all -> 0x016e }
                    h7.h r14 = h7.h.f4787a     // Catch:{ all -> 0x016e }
                    k3.j.n(r1, r11)
                    h7.h r14 = h7.h.f4787a
                    return r14
                L_0x016e:
                    r14 = move-exception
                    throw r14     // Catch:{ all -> 0x0170 }
                L_0x0170:
                    r15 = move-exception
                    k3.j.n(r1, r14)
                    throw r15
                */
                throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.x.h(java.lang.Object):java.lang.Object");
            }
        }

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper", f = "WatchFaceService.kt", l = {1687}, m = "updateInstance$watchface_release")
        public static final class y extends l7.c {

            /* renamed from: i  reason: collision with root package name */
            public Object f5830i;

            /* renamed from: j  reason: collision with root package name */
            public String f5831j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f5832k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ c f5833l;

            /* renamed from: m  reason: collision with root package name */
            public int f5834m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public y(c cVar, j7.d<? super y> dVar) {
                super(dVar);
                this.f5833l = cVar;
            }

            public final Object h(Object obj) {
                this.f5832k = obj;
                this.f5834m |= Integer.MIN_VALUE;
                return this.f5833l.I((String) null, this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x014f, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0156, code lost:
            monitor-enter(androidx.wear.watchface.control.h.f2293b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r13 = androidx.wear.watchface.control.h.f2294c;
            androidx.wear.watchface.control.h.f2294c = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x015c, code lost:
            if (r13 != null) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x015e, code lost:
            android.util.Log.e("WatchFaceService", "takePendingWallpaperInteractiveWatchFaceInstance failed", r10);
            r13.f2297b.q(new s1.a(r10));
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(android.os.Handler r12, android.os.Handler r13, android.content.ComponentName r14) {
            /*
                r10 = this;
                n1.t0.this = r11
                r10.<init>(r11)
                r10.f5741a = r12
                r10.f5742b = r13
                int r0 = z7.h.f8729a
                z7.f r0 = new z7.f
                r1 = 0
                r2 = 0
                r0.<init>(r13, r1, r2)
                z7.f r13 = r0.f8728k
                c8.c r13 = y7.a0.a(r13)
                r10.f5743c = r13
                z7.f r13 = new z7.f
                r13.<init>(r12, r1, r2)
                z7.f r13 = r13.f8728k
                c8.c r13 = y7.a0.a(r13)
                r10.f5744d = r13
                java.lang.String r13 = "null cannot be cast to non-null type android.content.Context"
                q7.k.c(r11, r13)
                r10.e = r11
                n1.t0$e r13 = new n1.t0$e
                r13.<init>(r10)
                r10.f5745f = r13
                y7.o r13 = k3.j.d()
                r10.f5746g = r13
                y7.o r13 = k3.j.d()
                r10.f5747h = r13
                y7.o r13 = k3.j.d()
                r10.f5748i = r13
                y7.o r13 = k3.j.d()
                r10.f5749j = r13
                y7.o r13 = k3.j.d()
                r10.f5750k = r13
                androidx.appcompat.widget.p r13 = new androidx.appcompat.widget.p
                r13.<init>((android.os.Handler) r12)
                r10.f5751l = r13
                n1.y r12 = new n1.y
                r12.<init>()
                a8.g r13 = r12.f5877d
                boolean r0 = r10.isVisible()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r13.setValue(r0)
                a8.g r13 = r12.f5875b
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r13.setValue(r0)
                r13 = 1
                if (r14 == 0) goto L_0x0078
                r14 = r13
                goto L_0x0079
            L_0x0078:
                r14 = r2
            L_0x0079:
                r12.f5884l = r14
                a8.g r14 = r12.f5882j
                java.lang.String r0 = "keyguard"
                java.lang.Object r0 = r11.getSystemService(r0)
                java.lang.String r3 = "null cannot be cast to non-null type android.app.KeyguardManager"
                q7.k.c(r0, r3)
                android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
                boolean r0 = r0.isDeviceLocked()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r14.setValue(r0)
                r10.f5752m = r12
                r10.f5753n = r13
                n1.g1 r14 = new n1.g1
                r14.<init>()
                r10.f5758t = r14
                int r14 = r11.f5735c
                r10.f5759u = r14
                n1.t0$c$f r0 = new n1.t0$c$f
                r0.<init>(r10)
                r10.w = r0
                n1.t0$c$w r0 = new n1.t0$c$w
                r0.<init>(r10)
                r10.f5761x = r0
                b.a[] r0 = new b.a[r2]
                r10.f5762z = r0
                r10.A = r13
                i7.k r13 = i7.k.f4879f
                a8.g r13 = a1.a.c(r13)
                r10.F = r13
                java.lang.String r13 = "?"
                r10.I = r13
                k3.j r13 = new k3.j
                r13.<init>()
                r10.J = r13
                java.lang.Object r13 = new java.lang.Object
                r13.<init>()
                r10.K = r13
                android.os.RemoteCallbackList r13 = new android.os.RemoteCallbackList
                r13.<init>()
                r10.L = r13
                java.lang.String r13 = "DirectBoot"
                java.lang.String r0 = "Mismatch between pendingWallpaperInstance id "
                v1.c r2 = new v1.c
                java.lang.String r3 = "EngineWrapper.maybeCreateWCSApi"
                r2.<init>(r3)
                boolean r12 = r12.f5884l     // Catch:{ all -> 0x0178 }
                if (r12 == 0) goto L_0x00ea
                goto L_0x01c1
            L_0x00ea:
                java.lang.Object r12 = androidx.wear.watchface.control.h.f2293b     // Catch:{ all -> 0x0178 }
                monitor-enter(r12)     // Catch:{ all -> 0x0178 }
                androidx.wear.watchface.control.h$b r3 = androidx.wear.watchface.control.h.f2294c     // Catch:{ all -> 0x01c5 }
                androidx.wear.watchface.control.h.f2294c = r1     // Catch:{ all -> 0x01c5 }
                monitor-exit(r12)     // Catch:{ all -> 0x0178 }
                java.lang.String r4 = "WatchFaceService"
                if (r3 != 0) goto L_0x017a
                r5 = 30
                if (r14 < r5) goto L_0x017a
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r14 = n1.t0.g(r11)     // Catch:{ all -> 0x0178 }
                r10.y = r14     // Catch:{ all -> 0x0178 }
                if (r14 == 0) goto L_0x017a
                boolean r5 = r10.K()     // Catch:{ all -> 0x0178 }
                if (r5 != 0) goto L_0x017a
                v1.a r11 = new v1.a     // Catch:{ all -> 0x0178 }
                r11.<init>(r13)     // Catch:{ all -> 0x0178 }
                r1.h0 r10 = r10.s(r14, r13)     // Catch:{ Exception -> 0x014f }
                monitor-enter(r12)     // Catch:{ Exception -> 0x014f }
                androidx.wear.watchface.control.h$b r13 = androidx.wear.watchface.control.h.f2294c     // Catch:{ all -> 0x0151 }
                androidx.wear.watchface.control.h.f2294c = r1     // Catch:{ all -> 0x0151 }
                monitor-exit(r12)     // Catch:{ Exception -> 0x014f }
                if (r13 == 0) goto L_0x016d
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r12 = r13.f2296a
                java.lang.String r3 = r12.f2278f     // Catch:{ Exception -> 0x014f }
                java.lang.String r5 = r14.f2278f     // Catch:{ Exception -> 0x014f }
                boolean r3 = q7.k.a(r3, r5)     // Catch:{ Exception -> 0x014f }
                if (r3 == 0) goto L_0x012b
                r1.k r12 = r13.f2297b     // Catch:{ Exception -> 0x014f }
                r12.m(r10)     // Catch:{ Exception -> 0x014f }
                goto L_0x016d
            L_0x012b:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
                r10.<init>(r0)     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = r12.f2278f     // Catch:{ Exception -> 0x014f }
                r10.append(r12)     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = " and constructed instance id "
                r10.append(r12)     // Catch:{ Exception -> 0x014f }
                java.lang.String r12 = r14.f2278f     // Catch:{ Exception -> 0x014f }
                r10.append(r12)     // Catch:{ Exception -> 0x014f }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x014f }
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x014f }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x014f }
                r12.<init>(r10)     // Catch:{ Exception -> 0x014f }
                throw r12     // Catch:{ Exception -> 0x014f }
            L_0x014d:
                r10 = move-exception
                goto L_0x0174
            L_0x014f:
                r10 = move-exception
                goto L_0x0154
            L_0x0151:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ Exception -> 0x014f }
                throw r10     // Catch:{ Exception -> 0x014f }
            L_0x0154:
                java.lang.Object r12 = androidx.wear.watchface.control.h.f2293b     // Catch:{ all -> 0x014d }
                monitor-enter(r12)     // Catch:{ all -> 0x014d }
                androidx.wear.watchface.control.h$b r13 = androidx.wear.watchface.control.h.f2294c     // Catch:{ all -> 0x0171 }
                androidx.wear.watchface.control.h.f2294c = r1     // Catch:{ all -> 0x0171 }
                monitor-exit(r12)     // Catch:{ all -> 0x014d }
                if (r13 == 0) goto L_0x016d
                java.lang.String r12 = "takePendingWallpaperInteractiveWatchFaceInstance failed"
                android.util.Log.e(r4, r12, r10)     // Catch:{ all -> 0x014d }
                r1.k r12 = r13.f2297b     // Catch:{ all -> 0x014d }
                s1.a r13 = new s1.a     // Catch:{ all -> 0x014d }
                r13.<init>((java.lang.Exception) r10)     // Catch:{ all -> 0x014d }
                r12.q(r13)     // Catch:{ all -> 0x014d }
            L_0x016d:
                r11.close()     // Catch:{ all -> 0x0178 }
                goto L_0x01c1
            L_0x0171:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x014d }
                throw r10     // Catch:{ all -> 0x014d }
            L_0x0174:
                r11.close()     // Catch:{ all -> 0x0178 }
                throw r10     // Catch:{ all -> 0x0178 }
            L_0x0178:
                r10 = move-exception
                goto L_0x01c8
            L_0x017a:
                if (r3 != 0) goto L_0x0180
                androidx.wear.watchface.control.h$b r3 = androidx.wear.watchface.control.h.a.e(r10)     // Catch:{ all -> 0x0178 }
            L_0x0180:
                if (r3 == 0) goto L_0x01bf
                v1.a r12 = new v1.a     // Catch:{ all -> 0x0178 }
                java.lang.String r13 = "Create PendingWallpaperInteractiveWatchFaceInstance"
                r12.<init>(r13)     // Catch:{ all -> 0x0178 }
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r13 = r3.f2296a     // Catch:{ Exception -> 0x0198 }
                java.lang.String r14 = "Boot with pendingWallpaperInstance"
                r1.h0 r13 = r10.s(r13, r14)     // Catch:{ Exception -> 0x0198 }
                r1.k r14 = r3.f2297b     // Catch:{ Exception -> 0x0198 }
                r14.m(r13)     // Catch:{ Exception -> 0x0198 }
                r5 = r13
                goto L_0x01a9
            L_0x0198:
                r13 = move-exception
                java.lang.String r14 = "createInteractiveInstance failed"
                android.util.Log.e(r4, r14, r13)     // Catch:{ all -> 0x0178 }
                r1.k r14 = r3.f2297b     // Catch:{ all -> 0x0178 }
                s1.a r0 = new s1.a     // Catch:{ all -> 0x0178 }
                r0.<init>((java.lang.Exception) r13)     // Catch:{ all -> 0x0178 }
                r14.q(r0)     // Catch:{ all -> 0x0178 }
                r5 = r1
            L_0x01a9:
                r12.close()     // Catch:{ all -> 0x0178 }
                androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r6 = r3.f2296a     // Catch:{ all -> 0x0178 }
                r10.y = r6     // Catch:{ all -> 0x0178 }
                c8.c r12 = r10.f5743c     // Catch:{ all -> 0x0178 }
                n1.z0 r13 = new n1.z0     // Catch:{ all -> 0x0178 }
                r9 = 0
                r4 = r13
                r7 = r11
                r8 = r10
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0178 }
                r10 = 3
                k3.j.K(r12, r1, r13, r10)     // Catch:{ all -> 0x0178 }
            L_0x01bf:
                h7.h r10 = h7.h.f4787a     // Catch:{ all -> 0x0178 }
            L_0x01c1:
                k3.j.n(r2, r1)
                return
            L_0x01c5:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0178 }
                throw r10     // Catch:{ all -> 0x0178 }
            L_0x01c8:
                throw r10     // Catch:{ all -> 0x01c9 }
            L_0x01c9:
                r11 = move-exception
                k3.j.n(r2, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.<init>(n1.t0, android.os.Handler, android.os.Handler, android.content.ComponentName):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
            k3.j.n(r0, r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void A(n1.l r2, n1.b0 r3) {
            /*
                java.lang.String r0 = "complicationSlotsManager"
                q7.k.e(r2, r0)
                java.lang.String r0 = "renderer"
                q7.k.e(r3, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "initStyleAndComplications"
                r0.<init>(r1)
                n1.t0$c$i r1 = new n1.t0$c$i     // Catch:{ all -> 0x0020 }
                r1.<init>()     // Catch:{ all -> 0x0020 }
                r2.e(r3, r1)     // Catch:{ all -> 0x0020 }
                h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x0020 }
                r2 = 0
                k3.j.n(r0, r2)
                return
            L_0x0020:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r3 = move-exception
                k3.j.n(r0, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.A(n1.l, n1.b0):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x015f A[Catch:{ all -> 0x01d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01a4 A[Catch:{ all -> 0x004c }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m(n1.t0.c r22, n1.l r23, u1.b r24, y7.n r25, y7.n r26, n1.j1 r27, j7.d r28) {
            /*
                r0 = r22
                r1 = r27
                r2 = r28
                r22.getClass()
                boolean r3 = r2 instanceof n1.w0
                if (r3 == 0) goto L_0x001c
                r3 = r2
                n1.w0 r3 = (n1.w0) r3
                int r4 = r3.r
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L_0x001c
                int r4 = r4 - r5
                r3.r = r4
                goto L_0x0021
            L_0x001c:
                n1.w0 r3 = new n1.w0
                r3.<init>(r0, r2)
            L_0x0021:
                java.lang.Object r2 = r3.f5861p
                k7.a r4 = k7.a.f5217f
                int r5 = r3.r
                r6 = 3
                r7 = 2
                r8 = 1
                r9 = 0
                if (r5 == 0) goto L_0x009e
                if (r5 == r8) goto L_0x0074
                if (r5 == r7) goto L_0x0057
                if (r5 != r6) goto L_0x004f
                java.lang.Object r0 = r3.f5858m
                n1.p0 r0 = (n1.p0) r0
                java.lang.Object r1 = r3.f5857l
                n1.t0 r1 = (n1.t0) r1
                java.lang.Object r4 = r3.f5856k
                java.io.Closeable r4 = (java.io.Closeable) r4
                java.lang.Object r5 = r3.f5855j
                n1.j1 r5 = (n1.j1) r5
                java.lang.Object r3 = r3.f5854i
                n1.t0$c r3 = (n1.t0.c) r3
                a1.a.I(r2)     // Catch:{ all -> 0x004c }
                goto L_0x0196
            L_0x004c:
                r0 = move-exception
                goto L_0x01d2
            L_0x004f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0057:
                java.lang.Object r0 = r3.f5859n
                n1.p0 r0 = (n1.p0) r0
                java.lang.Object r1 = r3.f5858m
                n1.t0 r1 = (n1.t0) r1
                java.lang.Object r5 = r3.f5857l
                java.io.Closeable r5 = (java.io.Closeable) r5
                java.lang.Object r7 = r3.f5856k
                n1.j1 r7 = (n1.j1) r7
                java.lang.Object r10 = r3.f5855j
                y7.n r10 = (y7.n) r10
                java.lang.Object r11 = r3.f5854i
                n1.t0$c r11 = (n1.t0.c) r11
                a1.a.I(r2)     // Catch:{ all -> 0x01d4 }
                goto L_0x017c
            L_0x0074:
                java.lang.Object r0 = r3.f5860o
                n1.c r0 = (n1.c) r0
                java.lang.Object r1 = r3.f5859n
                n1.b r1 = (n1.b) r1
                java.lang.Object r5 = r3.f5858m
                n1.j1 r5 = (n1.j1) r5
                java.lang.Object r10 = r3.f5857l
                y7.n r10 = (y7.n) r10
                java.lang.Object r11 = r3.f5856k
                u1.b r11 = (u1.b) r11
                java.lang.Object r12 = r3.f5855j
                n1.l r12 = (n1.l) r12
                java.lang.Object r13 = r3.f5854i
                n1.t0$c r13 = (n1.t0.c) r13
                a1.a.I(r2)
                r21 = r0
                r20 = r1
                r1 = r5
                r18 = r11
                r19 = r12
                goto L_0x0145
            L_0x009e:
                a1.a.I(r2)
                n1.b r2 = new n1.b
                y7.o r5 = r0.f5748i
                c8.c r10 = r0.f5744d
                r2.<init>(r1, r0, r5, r10)
                v1.c r5 = new v1.c
                java.lang.String r10 = "create BroadcastsReceiver"
                r5.<init>(r10)
                boolean r10 = r1.f5639j     // Catch:{ all -> 0x01de }
                if (r10 == 0) goto L_0x00b7
                r10 = r9
                goto L_0x0117
            L_0x00b7:
                n1.t0 r10 = n1.t0.this     // Catch:{ all -> 0x01de }
                java.lang.String r11 = "accessibility"
                java.lang.Object r10 = r10.getSystemService(r11)     // Catch:{ all -> 0x01de }
                java.lang.String r11 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
                q7.k.c(r10, r11)     // Catch:{ all -> 0x01de }
                android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10     // Catch:{ all -> 0x01de }
                r10.addAccessibilityStateChangeListener(r0)     // Catch:{ all -> 0x01de }
                n1.c r10 = new n1.c     // Catch:{ all -> 0x01de }
                android.content.Context r11 = r0.e
                r10.<init>(r11, r2)     // Catch:{ all -> 0x01de }
                android.content.IntentFilter r12 = new android.content.IntentFilter     // Catch:{ all -> 0x01de }
                java.lang.String r13 = "android.intent.action.BATTERY_CHANGED"
                r12.<init>(r13)     // Catch:{ all -> 0x01de }
                android.content.Intent r11 = r11.registerReceiver(r9, r12)     // Catch:{ all -> 0x01de }
                r12 = -1
                if (r11 == 0) goto L_0x00e5
                java.lang.String r13 = "status"
                int r13 = r11.getIntExtra(r13, r12)     // Catch:{ all -> 0x01de }
                goto L_0x00e6
            L_0x00e5:
                r13 = r12
            L_0x00e6:
                n1.c$a r14 = r10.f5534b     // Catch:{ all -> 0x01de }
                if (r13 == r7) goto L_0x00f1
                r15 = 5
                if (r13 == r15) goto L_0x00f1
                r14.i()     // Catch:{ all -> 0x01de }
                goto L_0x00f4
            L_0x00f1:
                r14.g()     // Catch:{ all -> 0x01de }
            L_0x00f4:
                if (r11 == 0) goto L_0x0108
                java.lang.String r13 = "level"
                int r13 = r11.getIntExtra(r13, r12)     // Catch:{ all -> 0x01de }
                java.lang.String r15 = "scale"
                int r11 = r11.getIntExtra(r15, r12)     // Catch:{ all -> 0x01de }
                int r13 = r13 * 100
                float r12 = (float) r13     // Catch:{ all -> 0x01de }
                float r11 = (float) r11     // Catch:{ all -> 0x01de }
                float r12 = r12 / r11
                goto L_0x010a
            L_0x0108:
                r12 = 1120403456(0x42c80000, float:100.0)
            L_0x010a:
                r11 = 1097859072(0x41700000, float:15.0)
                int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r11 >= 0) goto L_0x0114
                r14.d()     // Catch:{ all -> 0x01de }
                goto L_0x0117
            L_0x0114:
                r14.c()     // Catch:{ all -> 0x01de }
            L_0x0117:
                k3.j.n(r5, r9)
                r3.f5854i = r0
                r5 = r23
                r3.f5855j = r5
                r11 = r24
                r3.f5856k = r11
                r12 = r26
                r3.f5857l = r12
                r3.f5858m = r1
                r3.f5859n = r2
                r3.f5860o = r10
                r3.r = r8
                r13 = r25
                java.lang.Object r13 = r13.M(r3)
                if (r13 != r4) goto L_0x013a
                goto L_0x01d1
            L_0x013a:
                r20 = r2
                r19 = r5
                r21 = r10
                r18 = r11
                r10 = r12
                r2 = r13
                r13 = r0
            L_0x0145:
                r15 = r2
                n1.i0 r15 = (n1.i0) r15
                v1.c r5 = new v1.c
                java.lang.String r0 = "WatchFaceImpl.init"
                r5.<init>(r0)
                n1.t0 r0 = n1.t0.this
                n1.p0 r2 = new n1.p0     // Catch:{ all -> 0x01d4 }
                r14 = r2
                r16 = r13
                r17 = r1
                r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01d4 }
                boolean r11 = r13.f5755p     // Catch:{ all -> 0x01d4 }
                if (r11 != 0) goto L_0x0178
                n1.b0 r11 = r2.f5692k     // Catch:{ all -> 0x01d4 }
                r3.f5854i = r13     // Catch:{ all -> 0x01d4 }
                r3.f5855j = r10     // Catch:{ all -> 0x01d4 }
                r3.f5856k = r1     // Catch:{ all -> 0x01d4 }
                r3.f5857l = r5     // Catch:{ all -> 0x01d4 }
                r3.f5858m = r0     // Catch:{ all -> 0x01d4 }
                r3.f5859n = r2     // Catch:{ all -> 0x01d4 }
                r3.f5860o = r9     // Catch:{ all -> 0x01d4 }
                r3.r = r7     // Catch:{ all -> 0x01d4 }
                java.lang.Object r7 = r11.h()     // Catch:{ all -> 0x01d4 }
                if (r7 != r4) goto L_0x0178
                goto L_0x01d1
            L_0x0178:
                r7 = r1
                r11 = r13
                r1 = r0
                r0 = r2
            L_0x017c:
                r3.f5854i = r11     // Catch:{ all -> 0x01d4 }
                r3.f5855j = r7     // Catch:{ all -> 0x01d4 }
                r3.f5856k = r5     // Catch:{ all -> 0x01d4 }
                r3.f5857l = r1     // Catch:{ all -> 0x01d4 }
                r3.f5858m = r0     // Catch:{ all -> 0x01d4 }
                r3.f5859n = r9     // Catch:{ all -> 0x01d4 }
                r3.f5860o = r9     // Catch:{ all -> 0x01d4 }
                r3.r = r6     // Catch:{ all -> 0x01d4 }
                java.lang.Object r2 = r10.M(r3)     // Catch:{ all -> 0x01d4 }
                if (r2 != r4) goto L_0x0193
                goto L_0x01d1
            L_0x0193:
                r4 = r5
                r5 = r7
                r3 = r11
            L_0x0196:
                y7.o r2 = r3.f5748i     // Catch:{ all -> 0x004c }
                r2.X(r0)     // Catch:{ all -> 0x004c }
                r2 = 0
                r3.E = r2     // Catch:{ all -> 0x004c }
                r0.w = r8     // Catch:{ all -> 0x004c }
                boolean r2 = r5.f5639j     // Catch:{ all -> 0x004c }
                if (r2 != 0) goto L_0x01c4
                r1.getClass()     // Catch:{ all -> 0x004c }
                v1.c r1 = new v1.c     // Catch:{ all -> 0x004c }
                java.lang.String r2 = "WatchFace.drawFirstFrame"
                r1.<init>(r2)     // Catch:{ all -> 0x004c }
                boolean r2 = r3.f5755p     // Catch:{ all -> 0x01bb }
                if (r2 != 0) goto L_0x01b5
                r0.e()     // Catch:{ all -> 0x01bb }
            L_0x01b5:
                h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x01bb }
                k3.j.n(r1, r9)     // Catch:{ all -> 0x004c }
                goto L_0x01c4
            L_0x01bb:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch:{ all -> 0x01be }
            L_0x01be:
                r0 = move-exception
                r3 = r0
                k3.j.n(r1, r2)     // Catch:{ all -> 0x004c }
                throw r3     // Catch:{ all -> 0x004c }
            L_0x01c4:
                a8.f<java.lang.String> r0 = r5.f5640k     // Catch:{ all -> 0x004c }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x004c }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x004c }
                k3.j.n(r4, r9)
                h7.h r4 = h7.h.f4787a
            L_0x01d1:
                return r4
            L_0x01d2:
                r1 = r0
                goto L_0x01d7
            L_0x01d4:
                r0 = move-exception
                r1 = r0
                r4 = r5
            L_0x01d7:
                throw r1     // Catch:{ all -> 0x01d8 }
            L_0x01d8:
                r0 = move-exception
                r2 = r0
                k3.j.n(r4, r1)
                throw r2
            L_0x01de:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x01e1 }
            L_0x01e1:
                r0 = move-exception
                r2 = r0
                k3.j.n(r5, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.m(n1.t0$c, n1.l, u1.b, y7.n, y7.n, n1.j1, j7.d):java.lang.Object");
        }

        public final void B() {
            if (this.f5759u >= 30) {
                Context context = this.e;
                Object systemService = context.getSystemService("accessibility");
                q7.k.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                if (((AccessibilityManager) systemService).isEnabled()) {
                    context.sendBroadcast(new Intent("androidx.watchface.action.WATCH_FACE_A11Y_LABELS_REFRESH"));
                    this.f5756q = false;
                }
            }
        }

        public final void C(r1.q qVar) {
            synchronized (this.K) {
                if (this.L.unregister(qVar)) {
                    qVar.toString();
                } else {
                    Log.w("WatchFaceService", "removeWatchFaceListener " + qVar + " failed because it's not registered");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
            k3.j.n(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
            throw r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void D(java.util.List<androidx.wear.watchface.data.IdAndComplicationDataWireFormat> r8) {
            /*
                r7 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.setComplicationDataList"
                r0.<init>(r1)
                a8.g r7 = r7.F     // Catch:{ all -> 0x00a2 }
            L_0x0009:
                java.lang.Object r1 = r7.getValue()     // Catch:{ all -> 0x00a2 }
                r2 = r1
                java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00a2 }
                int r3 = i7.f.M(r2)     // Catch:{ all -> 0x00a2 }
                int r3 = a1.a.C(r3)     // Catch:{ all -> 0x00a2 }
                r4 = 16
                if (r3 >= r4) goto L_0x001d
                r3 = r4
            L_0x001d:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00a2 }
                r4.<init>(r3)     // Catch:{ all -> 0x00a2 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x0026:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r3 == 0) goto L_0x003e
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a2 }
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r3 = (androidx.wear.watchface.data.IdAndComplicationDataWireFormat) r3     // Catch:{ all -> 0x00a2 }
                int r5 = r3.f2341f     // Catch:{ all -> 0x00a2 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a2 }
                android.support.wearable.complications.ComplicationData r3 = r3.f2342g     // Catch:{ all -> 0x00a2 }
                r4.put(r5, r3)     // Catch:{ all -> 0x00a2 }
                goto L_0x0026
            L_0x003e:
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00a2 }
                r2.<init>(r4)     // Catch:{ all -> 0x00a2 }
                java.util.Iterator r3 = r8.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x0047:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r4 == 0) goto L_0x005f
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00a2 }
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r4 = (androidx.wear.watchface.data.IdAndComplicationDataWireFormat) r4     // Catch:{ all -> 0x00a2 }
                int r5 = r4.f2341f     // Catch:{ all -> 0x00a2 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a2 }
                android.support.wearable.complications.ComplicationData r4 = r4.f2342g     // Catch:{ all -> 0x00a2 }
                r2.put(r5, r4)     // Catch:{ all -> 0x00a2 }
                goto L_0x0047
            L_0x005f:
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00a2 }
                int r4 = r2.size()     // Catch:{ all -> 0x00a2 }
                r3.<init>(r4)     // Catch:{ all -> 0x00a2 }
                java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a2 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a2 }
            L_0x0070:
                boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00a2 }
                if (r4 == 0) goto L_0x0095
                java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00a2 }
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00a2 }
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r5 = new androidx.wear.watchface.data.IdAndComplicationDataWireFormat     // Catch:{ all -> 0x00a2 }
                java.lang.Object r6 = r4.getKey()     // Catch:{ all -> 0x00a2 }
                java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x00a2 }
                int r6 = r6.intValue()     // Catch:{ all -> 0x00a2 }
                java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00a2 }
                android.support.wearable.complications.ComplicationData r4 = (android.support.wearable.complications.ComplicationData) r4     // Catch:{ all -> 0x00a2 }
                r5.<init>(r6, r4)     // Catch:{ all -> 0x00a2 }
                r3.add(r5)     // Catch:{ all -> 0x00a2 }
                goto L_0x0070
            L_0x0095:
                boolean r1 = r7.compareAndSet(r1, r3)     // Catch:{ all -> 0x00a2 }
                if (r1 == 0) goto L_0x0009
                h7.h r7 = h7.h.f4787a     // Catch:{ all -> 0x00a2 }
                r7 = 0
                k3.j.n(r0, r7)
                return
            L_0x00a2:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x00a4 }
            L_0x00a4:
                r8 = move-exception
                k3.j.n(r0, r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.D(java.util.List):void");
        }

        public final void E(b.a[] aVarArr) {
            q7.k.e(aVarArr, "value");
            this.f5762z = aVarArr;
            e eVar = this.f5745f;
            if (eVar.c()) {
                try {
                    eVar.b().t(aVarArr);
                } catch (RemoteException e4) {
                    Log.e("WatchFaceService", "Failed to set accessibility labels: ", e4);
                }
            }
        }

        public final void F(DeviceConfig deviceConfig) {
            if (!this.B) {
                boolean z8 = deviceConfig.f2337f;
                y yVar = this.f5752m;
                yVar.e = z8;
                yVar.f5878f = deviceConfig.f2338g;
                yVar.f5879g = deviceConfig.f2339h;
                yVar.f5880h = deviceConfig.f2340i;
                this.B = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
            throw r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            k3.j.n(r0, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void G(androidx.wear.watchface.style.data.UserStyleWireFormat r5) {
            /*
                r4 = this;
                java.lang.String r0 = "userStyle"
                q7.k.e(r5, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.setUserStyle"
                r0.<init>(r1)
                c8.c r1 = r4.f5744d     // Catch:{ all -> 0x001e }
                n1.t0$c$v r2 = new n1.t0$c$v     // Catch:{ all -> 0x001e }
                r3 = 0
                r2.<init>(r4, r5, r3)     // Catch:{ all -> 0x001e }
                r4 = 3
                k3.j.K(r1, r3, r2, r4)     // Catch:{ all -> 0x001e }
                h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x001e }
                k3.j.n(r0, r3)
                return
            L_0x001e:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r5 = move-exception
                k3.j.n(r0, r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.G(androidx.wear.watchface.style.data.UserStyleWireFormat):void");
        }

        public final void H(WatchUiState watchUiState, boolean z8) {
            b bVar;
            q7.k.e(watchUiState, "watchUiState");
            y yVar = this.f5752m;
            ((Number) yVar.f5874a.getValue()).intValue();
            a8.g gVar = yVar.f5875b;
            Objects.toString(gVar.getValue());
            if (this.A || !q7.k.a(Boolean.valueOf(watchUiState.f2366f), gVar.getValue())) {
                gVar.setValue(Boolean.valueOf(watchUiState.f2366f));
            }
            boolean z9 = this.A;
            a8.g gVar2 = yVar.f5874a;
            if (z9 || watchUiState.f2367g != ((Number) gVar2.getValue()).intValue()) {
                gVar2.setValue(Integer.valueOf(watchUiState.f2367g));
            }
            this.A = false;
            if (z8) {
                this.D = true;
                p0 z10 = z();
                if (z10 != null && (bVar = z10.e) != null) {
                    bVar.f5504g = true;
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0064 A[LOOP:0: B:16:0x005e->B:18:0x0064, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        public final java.lang.Object I(java.lang.String r8, j7.d<? super h7.h> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof n1.t0.c.y
                if (r0 == 0) goto L_0x0013
                r0 = r9
                n1.t0$c$y r0 = (n1.t0.c.y) r0
                int r1 = r0.f5834m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f5834m = r1
                goto L_0x0018
            L_0x0013:
                n1.t0$c$y r0 = new n1.t0$c$y
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f5832k
                k7.a r1 = k7.a.f5217f
                int r2 = r0.f5834m
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.String r8 = r0.f5831j
                java.lang.Object r7 = r0.f5830i
                n1.t0$c r7 = (n1.t0.c) r7
                a1.a.I(r9)
                goto L_0x0047
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                a1.a.I(r9)
                y7.o r9 = r7.f5748i
                r0.f5830i = r7
                r0.f5831j = r8
                r0.f5834m = r3
                java.lang.Object r9 = r9.s(r0)
                if (r9 != r1) goto L_0x0047
                return r1
            L_0x0047:
                n1.p0 r9 = (n1.p0) r9
                n1.l r9 = r9.f5686d
                java.util.LinkedHashMap r9 = r9.e
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r9.size()
                r0.<init>(r1)
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            L_0x005e:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto L_0x0086
                java.lang.Object r1 = r9.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r2 = new androidx.wear.watchface.data.IdAndComplicationDataWireFormat
                java.lang.Object r1 = r1.getKey()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                q1.n r4 = new q1.n
                r4.<init>()
                android.support.wearable.complications.ComplicationData r4 = r4.a()
                r2.<init>(r1, r4)
                r0.add(r2)
                goto L_0x005e
            L_0x0086:
                r7.D(r0)
                n1.t0 r9 = n1.t0.this
                android.content.Context r0 = r7.e
                r9.getClass()
                java.util.ArrayList r9 = n1.t0.e(r0, r8)
                if (r9 == 0) goto L_0x0099
                r7.D(r9)
            L_0x0099:
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r9 = androidx.wear.watchface.control.h.f2292a
                java.lang.String r9 = r7.y()
                java.lang.String r0 = "Already have an InteractiveWatchFaceImpl with id "
                java.lang.String r1 = "Expected an InteractiveWatchFaceImpl with id "
                java.lang.Object r2 = androidx.wear.watchface.control.h.f2293b
                monitor-enter(r2)
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r4 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x00ef }
                java.lang.Object r5 = r4.remove(r9)     // Catch:{ all -> 0x00ef }
                androidx.wear.watchface.control.h$c r5 = (androidx.wear.watchface.control.h.c) r5     // Catch:{ all -> 0x00ef }
                if (r5 == 0) goto L_0x00b2
                r6 = r3
                goto L_0x00b3
            L_0x00b2:
                r6 = 0
            L_0x00b3:
                if (r6 == 0) goto L_0x00e1
                boolean r9 = r4.containsKey(r8)     // Catch:{ all -> 0x00ef }
                r9 = r9 ^ r3
                if (r9 == 0) goto L_0x00d3
                java.lang.Object r9 = r4.put(r8, r5)     // Catch:{ all -> 0x00ef }
                androidx.wear.watchface.control.h$c r9 = (androidx.wear.watchface.control.h.c) r9     // Catch:{ all -> 0x00ef }
                monitor-exit(r2)
                r7.H = r8
                n1.y r7 = r7.f5752m
                a8.g r7 = r7.f5881i
                java.lang.String r8 = n1.i1.c(r8)
                r7.setValue(r8)
                h7.h r7 = h7.h.f4787a
                return r7
            L_0x00d3:
                java.lang.String r7 = r0.concat(r8)     // Catch:{ all -> 0x00ef }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ef }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
                r8.<init>(r7)     // Catch:{ all -> 0x00ef }
                throw r8     // Catch:{ all -> 0x00ef }
            L_0x00e1:
                java.lang.String r7 = r1.concat(r9)     // Catch:{ all -> 0x00ef }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ef }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
                r8.<init>(r7)     // Catch:{ all -> 0x00ef }
                throw r8     // Catch:{ all -> 0x00ef }
            L_0x00ef:
                r7 = move-exception
                monitor-exit(r2)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.I(java.lang.String, j7.d):java.lang.Object");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r7 = h7.h.f4787a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
            k3.j.n(r0, (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
            throw new java.lang.IllegalArgumentException(("The estimated wire size of the supplied UserStyleSchemas for watch face " + r4.getPackageName() + " is too big at " + r2 + " bytes. UserStyleSchemas get sent to the companion over bluetooth and should be as small as possible for this to be performant. The maximum size is 50000").toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
            k3.j.n(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
            throw r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
            if (r2 >= 50000) goto L_0x003e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void J(u1.l r8) {
            /*
                r7 = this;
                java.lang.String r0 = "schema"
                q7.k.e(r8, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "WatchFaceService.validateSchemaWireSize"
                r0.<init>(r1)
                java.util.List<u1.m> r8 = r8.f7637a     // Catch:{ all -> 0x0073 }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0073 }
                r1 = 0
                r2 = r1
            L_0x0014:
                boolean r3 = r8.hasNext()     // Catch:{ all -> 0x0073 }
                n1.t0 r4 = n1.t0.this
                if (r3 == 0) goto L_0x0038
                java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0073 }
                u1.m r3 = (u1.m) r3     // Catch:{ all -> 0x0073 }
                android.content.ComponentName r5 = r7.x()     // Catch:{ all -> 0x0073 }
                java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0073 }
                java.lang.String r6 = "getComponentName().packageName"
                q7.k.d(r5, r6)     // Catch:{ all -> 0x0073 }
                r4.getClass()     // Catch:{ all -> 0x0073 }
                int r3 = r3.a(r4)     // Catch:{ all -> 0x0073 }
                int r2 = r2 + r3
                goto L_0x0014
            L_0x0038:
                r7 = 50000(0xc350, float:7.0065E-41)
                if (r2 >= r7) goto L_0x003e
                r1 = 1
            L_0x003e:
                if (r1 == 0) goto L_0x0047
                h7.h r7 = h7.h.f4787a     // Catch:{ all -> 0x0073 }
                r7 = 0
                k3.j.n(r0, r7)
                return
            L_0x0047:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r7.<init>()     // Catch:{ all -> 0x0073 }
                java.lang.String r8 = "The estimated wire size of the supplied UserStyleSchemas for watch face "
                r7.append(r8)     // Catch:{ all -> 0x0073 }
                java.lang.String r8 = r4.getPackageName()     // Catch:{ all -> 0x0073 }
                r7.append(r8)     // Catch:{ all -> 0x0073 }
                java.lang.String r8 = " is too big at "
                r7.append(r8)     // Catch:{ all -> 0x0073 }
                r7.append(r2)     // Catch:{ all -> 0x0073 }
                java.lang.String r8 = " bytes. UserStyleSchemas get sent to the companion over bluetooth and should be as small as possible for this to be performant. The maximum size is 50000"
                r7.append(r8)     // Catch:{ all -> 0x0073 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0073 }
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0073 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0073 }
                r8.<init>(r7)     // Catch:{ all -> 0x0073 }
                throw r8     // Catch:{ all -> 0x0073 }
            L_0x0073:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r8 = move-exception
                k3.j.n(r0, r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.J(u1.l):void");
        }

        public final boolean K() {
            return this.f5748i.V() || this.E;
        }

        public final Context a() {
            return this.e;
        }

        public final void b() {
            if (q7.k.a(this.f5752m.f5875b.getValue(), Boolean.TRUE) && !this.D) {
                p();
            }
        }

        public final Handler c() {
            return this.f5742b;
        }

        public final void d() {
            z();
        }

        public final c8.c e() {
            return this.f5744d;
        }

        public final void f() {
            t0.this.getClass();
            if (this.f5753n && !this.f5760v) {
                this.f5760v = true;
                if (this.f5757s == null) {
                    this.f5757s = new f1();
                }
                f1 f1Var = this.f5757s;
                if (f1Var != null) {
                    f1Var.a(this.w);
                } else {
                    q7.k.h("choreographer");
                    throw null;
                }
            }
        }

        public final void g() {
            k3.j.K(this.f5744d, (g1) null, new x(this, new ArrayList(), (j7.d<? super x>) null), 3);
        }

        public final void h() {
            z();
        }

        public final Handler i() {
            return this.f5741a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
            k3.j.n(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(int[] r5) {
            /*
                r4 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "WatchFaceService.setActiveComplications"
                r0.<init>(r1)
                n1.t0$e r4 = r4.f5745f     // Catch:{ all -> 0x0036 }
                r4.getClass()     // Catch:{ all -> 0x0036 }
                boolean r1 = r4.c()     // Catch:{ all -> 0x0036 }
                if (r1 != 0) goto L_0x0013
                goto L_0x002f
            L_0x0013:
                r4.f5842i = r5     // Catch:{ all -> 0x0036 }
                a.a r1 = r4.b()     // Catch:{ RemoteException -> 0x0027 }
                boolean r2 = r4.f5840g     // Catch:{ RemoteException -> 0x0027 }
                r3 = 1
                if (r2 != 0) goto L_0x0020
                r2 = r3
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                r1.f(r5, r2)     // Catch:{ RemoteException -> 0x0027 }
                r4.f5840g = r3     // Catch:{ RemoteException -> 0x0027 }
                goto L_0x002f
            L_0x0027:
                r4 = move-exception
                java.lang.String r5 = "WatchFaceService"
                java.lang.String r1 = "Failed to set active complicationSlots: "
                android.util.Log.e(r5, r1, r4)     // Catch:{ all -> 0x0036 }
            L_0x002f:
                h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x0036 }
                r4 = 0
                k3.j.n(r0, r4)
                return
            L_0x0036:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0038 }
            L_0x0038:
                r5 = move-exception
                k3.j.n(r0, r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.j(int[]):void");
        }

        public final void k(int i8, ArrayList arrayList, int i9, int i10) {
            e eVar = this.f5745f;
            if (eVar.c()) {
                if (eVar.f5843j >= 2) {
                    eVar.b().p(i8, arrayList, i9, i10);
                    return;
                }
                if (i9 != -1) {
                    eVar.b().n(i8, i9, i10);
                }
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    eVar.b().e(i8, (ComponentName) arrayList.get(size), i10);
                }
            }
        }

        public final void l(Duration duration) {
            q7.k.e(duration, "delay");
            u uVar = new u(this);
            androidx.appcompat.widget.p pVar = this.f5751l;
            pVar.getClass();
            Runnable runnable = (Runnable) pVar.f786c;
            if (runnable != null) {
                ((Handler) pVar.f785b).removeCallbacks(runnable);
            }
            pVar.f786c = null;
            b0.c cVar = new b0.c(uVar, 6, pVar);
            ((Handler) pVar.f785b).postDelayed(cVar, duration.toMillis());
            pVar.f786c = cVar;
        }

        public final void n(r1.q qVar) {
            synchronized (this.K) {
                if (this.L.register(qVar)) {
                    qVar.toString();
                    qVar.u();
                    h7.h hVar = h7.h.f4787a;
                    k3.j.K(this.f5744d, (g1) null, new a(this, qVar, (j7.d<? super a>) null), 3);
                    return;
                }
                Log.w("WatchFaceService", "addWatchFaceListener " + qVar + " failed because its already registered");
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: r1.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object o(r1.s r5, j7.d<? super h7.h> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof n1.t0.c.b
                if (r0 == 0) goto L_0x0013
                r0 = r6
                n1.t0$c$b r0 = (n1.t0.c.b) r0
                int r1 = r0.f5769l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f5769l = r1
                goto L_0x0018
            L_0x0013:
                n1.t0$c$b r0 = new n1.t0$c$b
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f5767j
                k7.a r1 = k7.a.f5217f
                int r2 = r0.f5769l
                r3 = 1
                if (r2 == 0) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                java.lang.Object r4 = r0.f5766i
                r5 = r4
                r1.s r5 = (r1.s) r5
                a1.a.I(r6)
                goto L_0x0044
            L_0x002c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0034:
                a1.a.I(r6)
                r0.f5766i = r5
                r0.f5769l = r3
                y7.o r4 = r4.f5748i
                java.lang.Object r4 = r4.s(r0)
                if (r4 != r1) goto L_0x0044
                return r1
            L_0x0044:
                r5.a()     // Catch:{ Exception -> 0x0048 }
                goto L_0x0050
            L_0x0048:
                r4 = move-exception
                java.lang.String r5 = "WatchFaceService"
                java.lang.String r6 = "listener.onWatchfaceReady failed"
                android.util.Log.e(r5, r6, r4)
            L_0x0050:
                h7.h r4 = h7.h.f4787a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.o(r1.s, j7.d):java.lang.Object");
        }

        public final void onAccessibilityStateChanged(boolean z8) {
            if (this.f5756q && z8) {
                B();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            k3.j.n(r1, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
            throw r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r6 = r6.getInsets(android.view.WindowInsets.Type.systemBars());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onApplyWindowInsets(android.view.WindowInsets r6) {
            /*
                r5 = this;
                java.lang.String r0 = "unexpected chin size change ignored: "
                v1.c r1 = new v1.c
                java.lang.String r2 = "EngineWrapper.onApplyWindowInsets"
                r1.<init>(r2)
                super.onApplyWindowInsets(r6)     // Catch:{ all -> 0x0051 }
                if (r6 == 0) goto L_0x001b
                int r2 = android.view.WindowInsets.Type.systemBars()     // Catch:{ all -> 0x0051 }
                android.graphics.Insets r6 = r6.getInsets(r2)     // Catch:{ all -> 0x0051 }
                if (r6 == 0) goto L_0x001b
                int r6 = r6.bottom     // Catch:{ all -> 0x0051 }
                goto L_0x001c
            L_0x001b:
                r6 = 0
            L_0x001c:
                boolean r2 = r5.C     // Catch:{ all -> 0x0051 }
                n1.y r3 = r5.f5752m
                r4 = 0
                if (r2 == 0) goto L_0x0046
                int r5 = r3.f5883k     // Catch:{ all -> 0x0051 }
                if (r5 == r6) goto L_0x0042
                java.lang.String r5 = "WatchFaceService"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
                r2.<init>(r0)     // Catch:{ all -> 0x0051 }
                int r0 = r3.f5883k     // Catch:{ all -> 0x0051 }
                r2.append(r0)     // Catch:{ all -> 0x0051 }
                java.lang.String r0 = " != "
                r2.append(r0)     // Catch:{ all -> 0x0051 }
                r2.append(r6)     // Catch:{ all -> 0x0051 }
                java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0051 }
                android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0051 }
            L_0x0042:
                k3.j.n(r1, r4)
                return
            L_0x0046:
                r3.f5883k = r6     // Catch:{ all -> 0x0051 }
                r6 = 1
                r5.C = r6     // Catch:{ all -> 0x0051 }
                h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x0051 }
                k3.j.n(r1, r4)
                return
            L_0x0051:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r6 = move-exception
                k3.j.n(r1, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onApplyWindowInsets(android.view.WindowInsets):void");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
            n1.i1.a(r1.f5744d, r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
            n1.i1.b(r1.f5741a, r3, r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.os.Bundle onCommand(java.lang.String r2, int r3, int r4, int r5, android.os.Bundle r6, boolean r7) {
            /*
                r1 = this;
                int r5 = r1.f5759u
                r7 = 30
                r0 = 0
                if (r5 < r7) goto L_0x0010
                java.lang.String r1 = "onCommand Ignored"
                android.os.Trace.beginSection(r1)
                android.os.Trace.endSection()
                return r0
            L_0x0010:
                if (r2 == 0) goto L_0x00c4
                int r5 = r2.hashCode()
                switch(r5) {
                    case -1701550022: goto L_0x00af;
                    case -582128059: goto L_0x0099;
                    case 359721080: goto L_0x0088;
                    case 1088849725: goto L_0x0077;
                    case 1120086874: goto L_0x0066;
                    case 1661768753: goto L_0x0054;
                    case 1889250273: goto L_0x0041;
                    case 1956281239: goto L_0x002e;
                    case 2094999252: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x00c4
            L_0x001b:
                java.lang.String r5 = "android.wallpaper.touch"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0025
                goto L_0x00c4
            L_0x0025:
                n1.t0$c$q r2 = new n1.t0$c$q
                r2.<init>(r1, r3, r4, r0)
                java.lang.String r3 = "onCommand COMMAND_TOUCH"
                goto L_0x00a9
            L_0x002e:
                java.lang.String r3 = "com.google.android.wearable.action.REQUEST_STYLE"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0038
                goto L_0x00c4
            L_0x0038:
                n1.t0$c$m r2 = new n1.t0$c$m
                r2.<init>(r1)
                java.lang.String r3 = "onCommand COMMAND_REQUEST_STYLE"
                goto L_0x00bf
            L_0x0041:
                java.lang.String r3 = "com.google.android.wearable.action.COMPLICATION_DATA"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x004b
                goto L_0x00c4
            L_0x004b:
                n1.t0$c$l r2 = new n1.t0$c$l
                r2.<init>(r1, r6)
                java.lang.String r3 = "onCommand COMMAND_COMPLICATION_DATA"
                goto L_0x00bf
            L_0x0054:
                java.lang.String r3 = "com.google.android.wearable.action.SET_BINDER"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x005e
                goto L_0x00c4
            L_0x005e:
                n1.t0$c$n r2 = new n1.t0$c$n
                r2.<init>(r1, r6)
                java.lang.String r3 = "onCommand COMMAND_SET_BINDER"
                goto L_0x00bf
            L_0x0066:
                java.lang.String r3 = "com.google.android.wearable.action.AMBIENT_UPDATE"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x006f
                goto L_0x00c4
            L_0x006f:
                n1.t0$c$j r2 = new n1.t0$c$j
                r2.<init>(r1)
                java.lang.String r3 = "onCommand COMMAND_AMBIENT_UPDATE"
                goto L_0x00bf
            L_0x0077:
                java.lang.String r3 = "com.google.android.wearable.action.BACKGROUND_ACTION"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0080
                goto L_0x00c4
            L_0x0080:
                n1.t0$c$k r2 = new n1.t0$c$k
                r2.<init>(r1, r6)
                java.lang.String r3 = "onCommand COMMAND_BACKGROUND_ACTION"
                goto L_0x00bf
            L_0x0088:
                java.lang.String r5 = "android.wallpaper.tap"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0091
                goto L_0x00c4
            L_0x0091:
                n1.t0$c$p r2 = new n1.t0$c$p
                r2.<init>(r1, r3, r4, r0)
                java.lang.String r3 = "onCommand COMMAND_TAP"
                goto L_0x00a9
            L_0x0099:
                java.lang.String r5 = "android.wallpaper.touch_cancel"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00a2
                goto L_0x00c4
            L_0x00a2:
                n1.t0$c$r r2 = new n1.t0$c$r
                r2.<init>(r1, r3, r4, r0)
                java.lang.String r3 = "onCommand COMMAND_TOUCH_CANCEL"
            L_0x00a9:
                c8.c r1 = r1.f5744d
                n1.i1.a(r1, r3, r2)
                goto L_0x00c4
            L_0x00af:
                java.lang.String r3 = "com.google.android.wearable.action.SET_PROPERTIES"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00b8
                goto L_0x00c4
            L_0x00b8:
                n1.t0$c$o r2 = new n1.t0$c$o
                r2.<init>(r1, r6)
                java.lang.String r3 = "onCommand COMMAND_SET_PROPERTIES"
            L_0x00bf:
                android.os.Handler r1 = r1.f5741a
                n1.i1.b(r1, r3, r2)
            L_0x00c4:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onCommand(java.lang.String, int, int, int, android.os.Bundle, boolean):android.os.Bundle");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
            throw r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
            k3.j.n(r0, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreate(android.view.SurfaceHolder r5) {
            /*
                r4 = this;
                java.lang.String r0 = "holder"
                q7.k.e(r5, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.onCreate"
                r0.<init>(r1)
                n1.t0 r1 = n1.t0.this
                super.onCreate(r5)     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "power"
                java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "null cannot be cast to non-null type android.os.PowerManager"
                q7.k.c(r1, r2)     // Catch:{ all -> 0x0043 }
                android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "WatchFaceService:[AmbientUpdate]"
                r3 = 1
                android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r3, r2)     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "getSystemService(Context…e]\"\n                    )"
                q7.k.d(r1, r2)     // Catch:{ all -> 0x0043 }
                r4.r = r1     // Catch:{ all -> 0x0043 }
                android.os.PowerManager$WakeLock r1 = r4.w()     // Catch:{ all -> 0x0043 }
                r2 = 0
                r1.setReferenceCounted(r2)     // Catch:{ all -> 0x0043 }
                n1.t0$c$s r1 = new n1.t0$c$s     // Catch:{ all -> 0x0043 }
                r1.<init>(r4)     // Catch:{ all -> 0x0043 }
                r5.addCallback(r1)     // Catch:{ all -> 0x0043 }
                h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x0043 }
                r4 = 0
                k3.j.n(r0, r4)
                return
            L_0x0043:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0045 }
            L_0x0045:
                r5 = move-exception
                k3.j.n(r0, r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onCreate(android.view.SurfaceHolder):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
            if (r8.f5752m.f5884l == false) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00dc, code lost:
            if (r8.f5752m.f5884l != false) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
            q();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
            r8 = h7.h.f4787a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
            k3.j.n(r0, (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDestroy() {
            /*
                r8 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.onDestroy"
                r0.<init>(r1)
                n1.t0 r1 = n1.t0.this
                super.onDestroy()     // Catch:{ all -> 0x001c }
                androidx.appcompat.widget.p r2 = r8.f5751l     // Catch:{ all -> 0x001c }
                java.lang.Object r3 = r2.f786c     // Catch:{ all -> 0x001c }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x001c }
                if (r3 == 0) goto L_0x001f
                java.lang.Object r4 = r2.f785b     // Catch:{ all -> 0x001c }
                android.os.Handler r4 = (android.os.Handler) r4     // Catch:{ all -> 0x001c }
                r4.removeCallbacks(r3)     // Catch:{ all -> 0x001c }
                goto L_0x001f
            L_0x001c:
                r8 = move-exception
                goto L_0x0102
            L_0x001f:
                r3 = 0
                r2.f786c = r3     // Catch:{ all -> 0x001c }
                n1.y r2 = r8.f5752m     // Catch:{ all -> 0x001c }
                boolean r2 = r2.f5884l     // Catch:{ all -> 0x001c }
                if (r2 != 0) goto L_0x0035
                k3.j r2 = r8.J     // Catch:{ all -> 0x001c }
                r2.getClass()     // Catch:{ all -> 0x001c }
                int r2 = android.os.Process.myPid()     // Catch:{ all -> 0x001c }
                r4 = 0
                android.os.Process.setThreadPriority(r2, r4)     // Catch:{ all -> 0x001c }
            L_0x0035:
                r2 = 1
                r8.f5754o = r2     // Catch:{ all -> 0x001c }
                c8.c r2 = r8.f5743c     // Catch:{ all -> 0x001c }
                y7.a0.b(r2)     // Catch:{ all -> 0x001c }
                n1.t0 r2 = n1.t0.this     // Catch:{ all -> 0x001c }
                monitor-enter(r8)     // Catch:{ all -> 0x001c }
                android.os.HandlerThread r4 = r2.f5734b     // Catch:{ all -> 0x00ff }
                if (r4 == 0) goto L_0x0047
                r4.quitSafely()     // Catch:{ all -> 0x00ff }
            L_0x0047:
                r2.f5734b = r3     // Catch:{ all -> 0x00ff }
                h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x00ff }
                monitor-exit(r8)     // Catch:{ all -> 0x001c }
                android.os.Handler r2 = r8.f5741a     // Catch:{ all -> 0x001c }
                java.lang.Runnable r4 = r8.f5761x     // Catch:{ all -> 0x001c }
                r2.removeCallbacks(r4)     // Catch:{ all -> 0x001c }
                n1.f1 r2 = r8.f5757s     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0063
                n1.t0$c$f r4 = r8.w     // Catch:{ all -> 0x001c }
                java.lang.String r5 = "callback"
                q7.k.e(r4, r5)     // Catch:{ all -> 0x001c }
                android.view.Choreographer r2 = r2.f5555a     // Catch:{ all -> 0x001c }
                r2.removeFrameCallback(r4)     // Catch:{ all -> 0x001c }
            L_0x0063:
                java.lang.String r2 = r8.H     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0091
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r2 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x001c }
                java.lang.String r2 = r8.y()     // Catch:{ all -> 0x001c }
                java.lang.Object r4 = androidx.wear.watchface.control.h.f2293b     // Catch:{ all -> 0x001c }
                monitor-enter(r4)     // Catch:{ all -> 0x001c }
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r5 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x008e }
                java.lang.Object r6 = r5.get(r2)     // Catch:{ all -> 0x008e }
                androidx.wear.watchface.control.h$c r6 = (androidx.wear.watchface.control.h.c) r6     // Catch:{ all -> 0x008e }
                if (r6 == 0) goto L_0x0086
                r1.h0 r6 = r6.f2298a     // Catch:{ all -> 0x008e }
                if (r6 == 0) goto L_0x0086
                r1.c0 r7 = new r1.c0     // Catch:{ all -> 0x008e }
                r7.<init>(r6, r3)     // Catch:{ all -> 0x008e }
                k3.j.Z(r7)     // Catch:{ all -> 0x008e }
            L_0x0086:
                java.lang.Object r2 = r5.remove(r2)     // Catch:{ all -> 0x008e }
                androidx.wear.watchface.control.h$c r2 = (androidx.wear.watchface.control.h.c) r2     // Catch:{ all -> 0x008e }
                monitor-exit(r4)     // Catch:{ all -> 0x001c }
                goto L_0x0091
            L_0x008e:
                r8 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x001c }
                throw r8     // Catch:{ all -> 0x001c }
            L_0x0091:
                n1.t0 r2 = n1.t0.this     // Catch:{ all -> 0x001c }
                java.lang.String r4 = "accessibility"
                java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ all -> 0x001c }
                java.lang.String r4 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
                q7.k.c(r2, r4)     // Catch:{ all -> 0x001c }
                android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2     // Catch:{ all -> 0x001c }
                r2.removeAccessibilityStateChangeListener(r8)     // Catch:{ all -> 0x001c }
                n1.t0$c$t r2 = new n1.t0$c$t     // Catch:{ Exception -> 0x00c2 }
                r2.<init>(r8, r3)     // Catch:{ Exception -> 0x00c2 }
                k3.j.Z(r2)     // Catch:{ Exception -> 0x00c2 }
                android.os.PowerManager$WakeLock r2 = r8.r     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x00b6
                android.os.PowerManager$WakeLock r2 = r8.w()     // Catch:{ all -> 0x001c }
                r2.release()     // Catch:{ all -> 0x001c }
            L_0x00b6:
                r1.getClass()     // Catch:{ all -> 0x001c }
                n1.y r1 = r8.f5752m     // Catch:{ all -> 0x001c }
                boolean r1 = r1.f5884l     // Catch:{ all -> 0x001c }
                if (r1 != 0) goto L_0x00e1
                goto L_0x00de
            L_0x00c0:
                r2 = move-exception
                goto L_0x00e7
            L_0x00c2:
                r2 = move-exception
                java.lang.String r4 = "WatchFaceService"
                java.lang.String r5 = "WatchFace exception observed in onDestroy (may have occurred during init)"
                android.util.Log.e(r4, r5, r2)     // Catch:{ all -> 0x00c0 }
                android.os.PowerManager$WakeLock r2 = r8.r     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x00d5
                android.os.PowerManager$WakeLock r2 = r8.w()     // Catch:{ all -> 0x001c }
                r2.release()     // Catch:{ all -> 0x001c }
            L_0x00d5:
                r1.getClass()     // Catch:{ all -> 0x001c }
                n1.y r1 = r8.f5752m     // Catch:{ all -> 0x001c }
                boolean r1 = r1.f5884l     // Catch:{ all -> 0x001c }
                if (r1 != 0) goto L_0x00e1
            L_0x00de:
                r8.q()     // Catch:{ all -> 0x001c }
            L_0x00e1:
                h7.h r8 = h7.h.f4787a     // Catch:{ all -> 0x001c }
                k3.j.n(r0, r3)
                return
            L_0x00e7:
                android.os.PowerManager$WakeLock r3 = r8.r     // Catch:{ all -> 0x001c }
                if (r3 == 0) goto L_0x00f2
                android.os.PowerManager$WakeLock r3 = r8.w()     // Catch:{ all -> 0x001c }
                r3.release()     // Catch:{ all -> 0x001c }
            L_0x00f2:
                r1.getClass()     // Catch:{ all -> 0x001c }
                n1.y r1 = r8.f5752m     // Catch:{ all -> 0x001c }
                boolean r1 = r1.f5884l     // Catch:{ all -> 0x001c }
                if (r1 != 0) goto L_0x00fe
                r8.q()     // Catch:{ all -> 0x001c }
            L_0x00fe:
                throw r2     // Catch:{ all -> 0x001c }
            L_0x00ff:
                r1 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x001c }
                throw r1     // Catch:{ all -> 0x001c }
            L_0x0102:
                throw r8     // Catch:{ all -> 0x0103 }
            L_0x0103:
                r1 = move-exception
                k3.j.n(r0, r8)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onDestroy():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
            k3.j.n(r0, r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSurfaceChanged(android.view.SurfaceHolder r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                java.lang.String r0 = "holder"
                q7.k.e(r3, r0)
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.onSurfaceChanged"
                r0.<init>(r1)
                super.onSurfaceChanged(r3, r4, r5, r6)     // Catch:{ all -> 0x001b }
                y7.o r2 = r2.f5750k     // Catch:{ all -> 0x001b }
                r2.X(r3)     // Catch:{ all -> 0x001b }
                h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x001b }
                r2 = 0
                k3.j.n(r0, r2)
                return
            L_0x001b:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x001d }
            L_0x001d:
                r3 = move-exception
                k3.j.n(r0, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onSurfaceChanged(android.view.SurfaceHolder, int, int, int):void");
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            q7.k.e(surfaceHolder, "holder");
            this.f5755p = true;
        }

        public final void onSurfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            q7.k.e(surfaceHolder, "holder");
            p0 z8 = z();
            if (z8 != null) {
                z8.c();
                ZonedDateTime b9 = z8.b();
                q7.k.d(b9, "getZonedDateTime()");
                z8.f5692k.c(b9);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
            k3.j.n(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
            throw r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onVisibilityChanged(boolean r8) {
            /*
                r7 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "onVisibilityChanged"
                r0.<init>(r1)
                super.onVisibilityChanged(r8)     // Catch:{ all -> 0x0036 }
                int r1 = r7.f5759u     // Catch:{ all -> 0x0036 }
                y7.o r2 = r7.f5748i
                r3 = 30
                n1.t0$e r4 = r7.f5745f
                n1.t0 r5 = n1.t0.this
                r6 = 0
                if (r1 >= r3) goto L_0x0038
                android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0036 }
                java.lang.String r3 = "com.google.android.wearable.watchfaces.action.REQUEST_STATE"
                r1.<init>(r3)     // Catch:{ all -> 0x0036 }
                java.lang.String r3 = "watch_face_visible"
                r1.putExtra(r3, r8)     // Catch:{ all -> 0x0036 }
                r5.sendBroadcast(r1)     // Catch:{ all -> 0x0036 }
                boolean r1 = r2.V()     // Catch:{ all -> 0x0036 }
                if (r1 != 0) goto L_0x0038
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0036 }
                r4.f5839f = r7     // Catch:{ all -> 0x0036 }
                k3.j.n(r0, r6)
                return
            L_0x0036:
                r7 = move-exception
                goto L_0x0078
            L_0x0038:
                boolean r1 = r2.V()     // Catch:{ all -> 0x0036 }
                r2 = 0
                n1.y r3 = r7.f5752m
                if (r1 == 0) goto L_0x0057
                boolean r1 = r3.f5884l     // Catch:{ all -> 0x0036 }
                if (r1 != 0) goto L_0x0057
                k3.j r1 = r7.J
                if (r8 == 0) goto L_0x004d
                r1.a0()     // Catch:{ all -> 0x0036 }
                goto L_0x0057
            L_0x004d:
                r1.getClass()     // Catch:{ all -> 0x0036 }
                int r1 = android.os.Process.myPid()     // Catch:{ all -> 0x0036 }
                android.os.Process.setThreadPriority(r1, r2)     // Catch:{ all -> 0x0036 }
            L_0x0057:
                a8.g r1 = r3.f5877d     // Catch:{ all -> 0x0036 }
                if (r8 != 0) goto L_0x005f
                r5.getClass()     // Catch:{ all -> 0x0036 }
                goto L_0x0060
            L_0x005f:
                r2 = 1
            L_0x0060:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0036 }
                r1.setValue(r2)     // Catch:{ all -> 0x0036 }
                r4.f5839f = r6     // Catch:{ all -> 0x0036 }
                n1.p0 r7 = r7.z()     // Catch:{ all -> 0x0036 }
                if (r7 == 0) goto L_0x0072
                r7.g(r8)     // Catch:{ all -> 0x0036 }
            L_0x0072:
                h7.h r7 = h7.h.f4787a     // Catch:{ all -> 0x0036 }
                k3.j.n(r0, r6)
                return
            L_0x0078:
                throw r7     // Catch:{ all -> 0x0079 }
            L_0x0079:
                r8 = move-exception
                k3.j.n(r0, r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.onVisibilityChanged(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
            k3.j.n(r0, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void p() {
            /*
                r4 = this;
                v1.c r0 = new v1.c
                java.lang.String r1 = "EngineWrapper.ambientTickUpdate"
                r0.<init>(r1)
                n1.y r1 = r4.f5752m     // Catch:{ all -> 0x0052 }
                a8.g r1 = r1.f5875b     // Catch:{ all -> 0x0052 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0052 }
                q7.k.b(r1)     // Catch:{ all -> 0x0052 }
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0052 }
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0052 }
                if (r1 == 0) goto L_0x004b
                android.os.PowerManager$WakeLock r1 = r4.w()     // Catch:{ all -> 0x0052 }
                r2 = 100
                r1.acquire(r2)     // Catch:{ all -> 0x0052 }
                n1.p0 r1 = r4.z()     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0031
                r1.e()     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x002f }
            L_0x002f:
                r1 = move-exception
                goto L_0x0036
            L_0x0031:
                android.os.PowerManager$WakeLock r4 = r4.w()     // Catch:{ all -> 0x0052 }
                goto L_0x003e
            L_0x0036:
                java.lang.String r2 = "WatchFaceService"
                java.lang.String r3 = "ambientTickUpdate failed"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0042 }
                goto L_0x0031
            L_0x003e:
                r4.release()     // Catch:{ all -> 0x0052 }
                goto L_0x004b
            L_0x0042:
                r1 = move-exception
                android.os.PowerManager$WakeLock r4 = r4.w()     // Catch:{ all -> 0x0052 }
                r4.release()     // Catch:{ all -> 0x0052 }
                throw r1     // Catch:{ all -> 0x0052 }
            L_0x004b:
                h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x0052 }
                r4 = 0
                k3.j.n(r0, r4)
                return
            L_0x0052:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0054 }
            L_0x0054:
                r1 = move-exception
                k3.j.n(r0, r4)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.p():void");
        }

        public final void q() {
            a0.b(this.f5744d);
            a0.b(this.f5743c);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
            k3.j.n(r2, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
            throw r6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.wear.watchface.control.a r(androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams r6) {
            /*
                r5 = this;
                n1.y r0 = r5.f5752m
                java.lang.String r1 = "WatchFace already exists! Created by "
                java.lang.String r2 = "params"
                q7.k.e(r6, r2)
                v1.c r2 = new v1.c
                java.lang.String r3 = "EngineWrapper.createHeadlessInstance"
                r2.<init>(r3)
                n1.t0 r3 = n1.t0.this
                boolean r4 = r5.K()     // Catch:{ all -> 0x0080 }
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x0068
                androidx.wear.watchface.data.DeviceConfig r1 = r6.f2270g     // Catch:{ all -> 0x0080 }
                java.lang.String r4 = "params.deviceConfig"
                q7.k.d(r1, r4)     // Catch:{ all -> 0x0080 }
                r5.F(r1)     // Catch:{ all -> 0x0080 }
                n1.t0$c$c r1 = new n1.t0$c$c     // Catch:{ all -> 0x0080 }
                r1.<init>(r6)     // Catch:{ all -> 0x0080 }
                r4 = 0
                r5.f5753n = r4     // Catch:{ all -> 0x0080 }
                boolean r4 = r0.f5884l     // Catch:{ all -> 0x0080 }
                if (r4 == 0) goto L_0x005c
                a8.g r4 = r0.f5881i     // Catch:{ all -> 0x0080 }
                java.lang.String r6 = r6.f2273j     // Catch:{ all -> 0x0080 }
                java.lang.String r6 = n1.i1.c(r6)     // Catch:{ all -> 0x0080 }
                r4.setValue(r6)     // Catch:{ all -> 0x0080 }
                n1.j1 r6 = r0.a()     // Catch:{ all -> 0x0080 }
                java.lang.String r4 = "createHeadlessInstance"
                r5.t(r6, r1, r4)     // Catch:{ all -> 0x0080 }
                a8.g r6 = r0.f5877d     // Catch:{ all -> 0x0080 }
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0080 }
                r6.setValue(r1)     // Catch:{ all -> 0x0080 }
                a8.g r6 = r0.f5875b     // Catch:{ all -> 0x0080 }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0080 }
                r6.setValue(r0)     // Catch:{ all -> 0x0080 }
                androidx.wear.watchface.control.a r6 = new androidx.wear.watchface.control.a     // Catch:{ all -> 0x0080 }
                r6.<init>(r5, r3)     // Catch:{ all -> 0x0080 }
                r5 = 0
                k3.j.n(r2, r5)
                return r6
            L_0x005c:
                java.lang.String r5 = "Failed requirement."
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0080 }
                r6.<init>(r5)     // Catch:{ all -> 0x0080 }
                throw r6     // Catch:{ all -> 0x0080 }
            L_0x0068:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
                r6.<init>(r1)     // Catch:{ all -> 0x0080 }
                java.lang.String r5 = r5.I     // Catch:{ all -> 0x0080 }
                r6.append(r5)     // Catch:{ all -> 0x0080 }
                java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0080 }
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0080 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0080 }
                r6.<init>(r5)     // Catch:{ all -> 0x0080 }
                throw r6     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r6 = move-exception
                k3.j.n(r2, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.c.r(androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams):androidx.wear.watchface.control.a");
        }

        public final h0 s(WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams, String str) {
            y yVar = this.f5752m;
            q7.k.e(wallpaperInteractiveWatchFaceInstanceParams, "params");
            v1.c cVar = new v1.c("EngineWrapper.createInteractiveInstance");
            try {
                this.J.a0();
                boolean z8 = true;
                if (!(!K())) {
                    throw new IllegalArgumentException(("WatchFace already exists! Created by " + this.I).toString());
                } else if (!yVar.f5884l) {
                    DeviceConfig deviceConfig = wallpaperInteractiveWatchFaceInstanceParams.f2279g;
                    q7.k.d(deviceConfig, "params.deviceConfig");
                    F(deviceConfig);
                    WatchUiState watchUiState = wallpaperInteractiveWatchFaceInstanceParams.f2280h;
                    q7.k.d(watchUiState, "params.watchUiState");
                    H(watchUiState, false);
                    this.G = wallpaperInteractiveWatchFaceInstanceParams.a();
                    yVar.f5881i.setValue(i1.c(wallpaperInteractiveWatchFaceInstanceParams.f2278f));
                    j1 a9 = yVar.a();
                    List<IdAndComplicationDataWireFormat> list = wallpaperInteractiveWatchFaceInstanceParams.f2282j;
                    boolean z9 = list == null || list.isEmpty();
                    t0 t0Var = t0.this;
                    if (z9) {
                        Context context = this.e;
                        String str2 = wallpaperInteractiveWatchFaceInstanceParams.f2278f;
                        q7.k.d(str2, "params.instanceId");
                        t0Var.getClass();
                        list = t0.e(context, str2);
                    }
                    if (list != null) {
                        if (!list.isEmpty()) {
                            z8 = false;
                        }
                    }
                    if (!z8) {
                        for (IdAndComplicationDataWireFormat idAndComplicationDataWireFormat : list) {
                            int i8 = idAndComplicationDataWireFormat.f2341f;
                            Objects.toString(idAndComplicationDataWireFormat.f2342g);
                        }
                        D(list);
                    }
                    t0Var.getClass();
                    t(a9, (SurfaceHolder) null, str);
                    String str3 = wallpaperInteractiveWatchFaceInstanceParams.f2278f;
                    q7.k.d(str3, "params.instanceId");
                    h0 h0Var = new h0(this, str3);
                    HashMap<String, h.c> hashMap = androidx.wear.watchface.control.h.f2292a;
                    h.a.a(h0Var);
                    String str4 = wallpaperInteractiveWatchFaceInstanceParams.f2278f;
                    q7.k.d(str4, "params.instanceId");
                    this.H = str4;
                    k3.j.n(cVar, (Throwable) null);
                    return h0Var;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } catch (Throwable th) {
                k3.j.n(cVar, th);
                throw th;
            }
        }

        public final void t(j1 j1Var, SurfaceHolder surfaceHolder, String str) {
            Rect rect;
            String value = j1Var.f5640k.getValue();
            this.E = true;
            this.I = str;
            if (surfaceHolder != null) {
                rect = ((C0092c) surfaceHolder).getSurfaceFrame();
            } else {
                DisplayMetrics displayMetrics = t0.this.getResources().getDisplayMetrics();
                rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            this.M = rect;
            k3.j.K(this.f5743c, (g1) null, new d(this, j1Var, t0.this, surfaceHolder, (j7.d<? super d>) null), 3);
        }

        public final void u(t tVar) {
            String str;
            p0 z8;
            StringBuilder sb;
            StringBuilder sb2;
            t tVar2 = tVar;
            if (this.f5741a.getLooper().isCurrentThread()) {
                tVar2.println("WatchFaceEngine:");
                tVar.b();
                if (this.f5745f.c()) {
                    tVar2.println("WSL style init flow");
                    str = "watchFaceInitStarted=" + this.f5745f.f5841h;
                } else {
                    str = K() ? "Androidx style init flow" : this.f5759u < 30 ? "Expecting WSL style init" : "Expecting androidx style style init";
                }
                tVar2.println(str);
                if (this.f5745f.c()) {
                    tVar2.println("iWatchFaceService.asBinder().isBinderAlive=" + this.f5745f.b().asBinder().isBinderAlive());
                    if (this.f5745f.b().asBinder().isBinderAlive()) {
                        tVar2.println("iWatchFaceService.apiVersion=" + this.f5745f.b().getApiVersion());
                    }
                }
                tVar2.println("createdBy=" + this.I);
                tVar2.println("asyncWatchFaceConstructionPending=" + this.E);
                tVar2.println("systemViewOfContentDescriptionLabelsIsStale=" + this.f5756q);
                if (this.H != null) {
                    tVar2.println("interactiveInstanceId=".concat(y()));
                }
                tVar2.println("frameCallbackPending=" + this.f5760v);
                tVar2.println("destroyed=" + this.f5754o);
                tVar2.println("surfaceDestroyed=" + this.f5755p);
                tVar2.println("lastComplications=".concat(i7.i.W((Iterable) this.F.getValue(), (String) null, (p7.l) null, 63)));
                StringBuilder sb3 = new StringBuilder("pendingUpdateTime=");
                sb3.append(((Runnable) this.f5751l.f786c) != null);
                tVar2.println(sb3.toString());
                tVar2.println("Resource only package name null");
                synchronized (this.K) {
                    v("dump", new e(tVar2));
                }
                if (!this.f5754o && (z8 = z()) != null) {
                    tVar2.println("WatchFaceImpl (" + z8.f5699s + "): ");
                    tVar.b();
                    StringBuilder sb4 = new StringBuilder("mockTime.maxTime=");
                    x xVar = z8.f5695n;
                    sb4.append(xVar.f5865c);
                    tVar2.println(sb4.toString());
                    tVar2.println("mockTime.minTime=" + xVar.f5864b);
                    tVar2.println("mockTime.speed=" + xVar.f5863a);
                    tVar2.println("lastDrawTimeMillis=" + z8.f5698q);
                    tVar2.println("nextDrawTimeMillis=" + z8.r);
                    tVar2.println("muteMode=" + z8.f5697p);
                    tVar2.println("lastTappedComplicationId=" + z8.f5696o);
                    StringBuilder sb5 = new StringBuilder("currentUserStyleRepository.userStyle=");
                    u1.b bVar = z8.f5685c;
                    sb5.append(bVar.f7606b.getValue());
                    tVar2.println(sb5.toString());
                    tVar2.println("currentUserStyleRepository.schema=" + bVar.f7605a);
                    tVar2.println("editorObscuresWatchFace=" + z8.f5688g);
                    tVar2.println("additionalContentDescriptionLabels:");
                    tVar.b();
                    b0 b0Var = z8.f5692k;
                    for (h7.d next : b0Var.f5523k) {
                        if (Build.TYPE.equals("userdebug")) {
                            sb2 = new StringBuilder();
                            sb2.append(((Number) next.f4781f).intValue());
                            sb2.append(": ");
                            sb2.append(next.f4782g);
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(((Number) next.f4781f).intValue());
                            sb2.append(": Redacted");
                        }
                        tVar2.println(sb2.toString());
                    }
                    tVar.a();
                    i0.d dVar = z8.f5694m;
                    dVar.getClass();
                    tVar2.println("OverlayStyle:");
                    tVar.b();
                    tVar2.println("backgroundColor=" + dVar.f5623a);
                    tVar2.println("foregroundColor=" + dVar.f5624b);
                    tVar.a();
                    j1 j1Var = z8.f5684b;
                    j1Var.getClass();
                    tVar2.println("WatchState:");
                    tVar.b();
                    tVar2.println("interruptionFilter=" + j1Var.f5631a.getValue());
                    tVar2.println("isAmbient=" + j1Var.f5632b.getValue());
                    tVar2.println("isBatteryLowAndNotCharging=" + j1Var.f5633c.getValue());
                    tVar2.println("isVisible=" + j1Var.f5634d.getValue());
                    tVar2.println("hasLowBitAmbient=" + j1Var.e);
                    tVar2.println("hasBurnInProtection=" + j1Var.f5635f);
                    tVar2.println("analogPreviewReferenceTimeMillis=" + j1Var.f5636g);
                    tVar2.println("digitalPreviewReferenceTimeMillis=" + j1Var.f5637h);
                    tVar2.println("chinHeight=" + j1Var.f5638i);
                    tVar2.println("isHeadless=" + j1Var.f5639j);
                    tVar2.println("watchFaceInstanceId=" + j1Var.f5640k.getValue());
                    tVar.a();
                    l lVar = z8.f5686d;
                    lVar.getClass();
                    tVar2.println("ComplicationSlotsManager:");
                    StringBuilder sb6 = new StringBuilder("lastComplicationTapDownEvents=");
                    HashMap hashMap = lVar.f5655f;
                    ArrayList arrayList = new ArrayList(hashMap.size());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        arrayList.add(((Number) entry.getKey()).intValue() + "->" + entry.getValue());
                    }
                    sb6.append(i7.i.W(arrayList, ", ", (p7.l) null, 62));
                    tVar2.println(sb6.toString());
                    tVar.b();
                    for (Map.Entry value : lVar.e.entrySet()) {
                        h hVar = (h) value.getValue();
                        hVar.getClass();
                        tVar2.println("ComplicationSlot " + hVar.f5561a + ':');
                        tVar.b();
                        tVar2.println("fixedComplicationDataSource=" + hVar.f5565f);
                        tVar2.println("enabled=" + hVar.f5576q);
                        tVar2.println("boundsType=" + hVar.f5562b);
                        tVar2.println("configExtras=" + hVar.f5569j);
                        tVar2.println("supportedTypes=".concat(i7.i.W(hVar.f5564d, (String) null, i.f5608f, 31)));
                        tVar2.println("initiallyEnabled=" + hVar.e);
                        StringBuilder sb7 = new StringBuilder("defaultDataSourcePolicy.primaryDataSource=");
                        p1.g gVar = hVar.f5577s;
                        sb7.append(gVar.f6289a);
                        tVar2.println(sb7.toString());
                        tVar2.println("defaultDataSourcePolicy.primaryDataSourceDefaultDataSourceType=" + gVar.f6290b);
                        tVar2.println("defaultDataSourcePolicy.secondaryDataSource=" + gVar.f6291c);
                        tVar2.println("defaultDataSourcePolicy.secondaryDataSourceDefaultDataSourceType=" + gVar.f6292d);
                        tVar2.println("defaultDataSourcePolicy.systemDataSourceFallback=" + gVar.e);
                        tVar2.println("defaultDataSourcePolicy.systemDataSourceFallbackDefaultType=" + gVar.f6293f);
                        tVar2.println("timelineComplicationData=" + hVar.E);
                        StringBuilder sb8 = new StringBuilder("timelineEntries=");
                        List<ComplicationData> list = hVar.F;
                        sb8.append(list != null ? i7.i.W(list, (String) null, (p7.l) null, 63) : null);
                        tVar2.println(sb8.toString());
                        tVar2.println("data=" + hVar.c().a());
                        tVar2.println("boundingArc=" + hVar.f5567h);
                        tVar2.println("complicationSlotBounds=" + hVar.f5574o);
                        tVar2.println("lastComplicationUpdate=" + hVar.f5571l);
                        tVar2.println("data history");
                        h.c cVar = hVar.f5572m;
                        if (cVar != null) {
                            tVar.b();
                            int i8 = cVar.f5588g;
                            while (true) {
                                if (!(i8 != cVar.f5589h)) {
                                    break;
                                }
                                i8 = (i8 + 1) % 50;
                                h.a aVar = cVar.f5587f[i8];
                                q7.k.b(aVar);
                                tVar2.println(aVar.f5583a + " @ " + LocalDateTime.ofInstant(aVar.f5584b, ZoneId.systemDefault()));
                            }
                            tVar.a();
                        }
                        tVar.a();
                    }
                    tVar.a();
                    b0.b bVar2 = (b0.b) b0Var;
                    tVar2.println("CanvasRenderer:");
                    tVar.b();
                    tVar2.println("canvasType=" + bVar2.f5528n);
                    tVar2.println("screenBounds=" + bVar2.f5518f);
                    tVar2.println("interactiveDrawModeUpdateDelayMillis=" + bVar2.f5515b);
                    tVar2.println("shouldAnimate=" + bVar2.f());
                    z zVar = bVar2.f5521i;
                    zVar.getClass();
                    tVar2.println("RenderParameters:");
                    tVar.b();
                    tVar2.println("drawMode=" + zVar.f5891a.name());
                    tVar2.println("watchFaceLayers=".concat(i7.i.W(zVar.f5892b, (String) null, (p7.l) null, 63)));
                    StringBuilder sb9 = new StringBuilder("lastComplicationTapDownEvents=");
                    Map<Integer, h0> map = zVar.f5894d;
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry next2 : map.entrySet()) {
                        arrayList2.add(((Number) next2.getKey()).intValue() + "->" + next2.getValue());
                    }
                    sb9.append(i7.i.W(arrayList2, ", ", (p7.l) null, 62));
                    tVar2.println(sb9.toString());
                    z.a aVar2 = zVar.f5893c;
                    if (aVar2 != null) {
                        tVar2.println("HighlightLayer:");
                        tVar.b();
                        z.b bVar3 = aVar2.f5895a;
                        if (bVar3 instanceof z.b.a) {
                            tVar2.println("HighlightedElement.AllComplicationSlots:");
                        } else {
                            if (bVar3 instanceof z.b.C0093b) {
                                tVar2.println("HighlightedElement.ComplicationSlot:");
                                tVar.b();
                                sb = new StringBuilder("id=");
                                sb.append(((z.b.C0093b) bVar3).f5899a);
                            } else if (bVar3 instanceof z.b.c) {
                                tVar2.println("HighlightedElement.UserStyle:");
                                tVar.b();
                                sb = new StringBuilder("id=");
                                sb.append(((z.b.c) bVar3).f5900a);
                            }
                            tVar2.println(sb.toString());
                            tVar.a();
                        }
                        tVar2.println("highlightTint=" + aVar2.f5896b);
                        tVar2.println("backgroundTint=" + aVar2.f5897c);
                        tVar.a();
                    }
                    tVar.a();
                    q7.k.e(tVar2.f5729b, "writer");
                    tVar.a();
                    b bVar4 = z8.e;
                    bVar4.getClass();
                    tVar2.println("BroadcastsObserver:");
                    tVar.b();
                    tVar2.println("batteryLow=" + bVar4.e);
                    tVar2.println("charging=" + bVar4.f5503f);
                    tVar2.println("sysUiHasSentWatchUiState=" + bVar4.f5504g);
                    tVar.a();
                    tVar.a();
                }
                tVar.a();
                return;
            }
            throw new IllegalArgumentException("dump must be called from the UIThread".toString());
        }

        public final void v(String str, p7.l lVar) {
            RemoteCallbackList<r1.q> remoteCallbackList = this.L;
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            while (beginBroadcast > 0) {
                beginBroadcast--;
                r1.q broadcastItem = remoteCallbackList.getBroadcastItem(beginBroadcast);
                try {
                    q7.k.d(broadcastItem, "listener");
                    lVar.invoke(broadcastItem);
                } catch (Exception e4) {
                    Log.e("WatchFaceService", "In " + str + " broadcastToListeners failed for " + broadcastItem.asBinder(), e4);
                }
            }
            remoteCallbackList.finishBroadcast();
        }

        public final PowerManager.WakeLock w() {
            PowerManager.WakeLock wakeLock = this.r;
            if (wakeLock != null) {
                return wakeLock;
            }
            q7.k.h("ambientUpdateWakelock");
            throw null;
        }

        public final ComponentName x() {
            Context context = this.e;
            return new ComponentName(context.getPackageName(), context.getClass().getName());
        }

        public final String y() {
            String str = this.H;
            if (str != null) {
                return str;
            }
            q7.k.h("interactiveInstanceId");
            throw null;
        }

        public final p0 z() {
            if (this.f5749j.V()) {
                k3.j.Z(new g(this, (j7.d<? super g>) null));
            }
            if (this.f5748i.V()) {
                return (p0) k3.j.Z(new h(this, (j7.d<? super h>) null));
            }
            return null;
        }
    }

    public interface d {
        long a();

        ZoneId b();
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final c f5835a;

        /* renamed from: b  reason: collision with root package name */
        public a.a f5836b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f5837c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f5838d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f5839f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5840g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5841h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f5842i;

        /* renamed from: j  reason: collision with root package name */
        public int f5843j = -1;

        @l7.e(c = "androidx.wear.watchface.WatchFaceService$WslFlow$onPropertiesChanged$1", f = "WatchFaceService.kt", l = {1129}, m = "invokeSuspend")
        public static final class a extends l7.h implements p<y7.z, j7.d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5844j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ e f5845k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, j7.d<? super a> dVar) {
                super(2, dVar);
                this.f5845k = eVar;
            }

            public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
                return new a(this.f5845k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((a) c((y7.z) obj, (j7.d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5844j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    this.f5844j = 1;
                    if (e.a(this.f5845k, this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return h7.h.f4787a;
            }
        }

        public e(c cVar) {
            k.e(cVar, "engineWrapper");
            this.f5835a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object a(n1.t0.e r8, j7.d r9) {
            /*
                n1.t0$c r0 = r8.f5835a
                boolean r1 = r9 instanceof n1.c1
                if (r1 == 0) goto L_0x0015
                r1 = r9
                n1.c1 r1 = (n1.c1) r1
                int r2 = r1.f5542m
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f5542m = r2
                goto L_0x001a
            L_0x0015:
                n1.c1 r1 = new n1.c1
                r1.<init>(r8, r9)
            L_0x001a:
                java.lang.Object r9 = r1.f5540k
                k7.a r2 = k7.a.f5217f
                int r3 = r1.f5542m
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0041
                if (r3 != r4) goto L_0x0039
                java.lang.Object r8 = r1.f5539j
                java.io.Closeable r8 = (java.io.Closeable) r8
                java.lang.Object r0 = r1.f5538i
                n1.t0$e r0 = (n1.t0.e) r0
                a1.a.I(r9)     // Catch:{ all -> 0x0036 }
                r7 = r9
                r9 = r8
                r8 = r0
                r0 = r7
                goto L_0x0081
            L_0x0036:
                r9 = move-exception
                goto L_0x00b4
            L_0x0039:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0041:
                a1.a.I(r9)
                v1.c r9 = new v1.c
                java.lang.String r3 = "EngineWrapper.maybeCreateWatchFace"
                r9.<init>(r3)
                boolean r3 = r8.c()     // Catch:{ all -> 0x00b0 }
                if (r3 == 0) goto L_0x00a7
                android.os.Bundle r3 = r8.f5838d     // Catch:{ all -> 0x00b0 }
                if (r3 == 0) goto L_0x00a7
                boolean r3 = r0.K()     // Catch:{ all -> 0x00b0 }
                if (r3 != 0) goto L_0x00a7
                r8.f5841h = r4     // Catch:{ all -> 0x00b0 }
                android.os.Bundle r3 = r8.f5838d     // Catch:{ all -> 0x00b0 }
                q7.k.b(r3)     // Catch:{ all -> 0x00b0 }
                r8.e(r3)     // Catch:{ all -> 0x00b0 }
                r8.f5838d = r5     // Catch:{ all -> 0x00b0 }
                n1.y r3 = r0.f5752m     // Catch:{ all -> 0x00b0 }
                n1.j1 r3 = r3.a()     // Catch:{ all -> 0x00b0 }
                java.lang.String r6 = "maybeCreateWatchFace"
                r0.t(r3, r5, r6)     // Catch:{ all -> 0x00b0 }
                y7.o r0 = r0.f5748i     // Catch:{ all -> 0x00b0 }
                r1.f5538i = r8     // Catch:{ all -> 0x00b0 }
                r1.f5539j = r9     // Catch:{ all -> 0x00b0 }
                r1.f5542m = r4     // Catch:{ all -> 0x00b0 }
                java.lang.Object r0 = r0.s(r1)     // Catch:{ all -> 0x00b0 }
                if (r0 != r2) goto L_0x0081
                goto L_0x00af
            L_0x0081:
                n1.p0 r0 = (n1.p0) r0     // Catch:{ all -> 0x00b0 }
                android.os.Bundle r1 = r8.f5837c     // Catch:{ all -> 0x00b0 }
                if (r1 == 0) goto L_0x008c
                r8.d(r1)     // Catch:{ all -> 0x00b0 }
                r8.f5837c = r5     // Catch:{ all -> 0x00b0 }
            L_0x008c:
                boolean r1 = r8.e     // Catch:{ all -> 0x00b0 }
                if (r1 == 0) goto L_0x0093
                r8.f()     // Catch:{ all -> 0x00b0 }
            L_0x0093:
                java.lang.Boolean r1 = r8.f5839f     // Catch:{ all -> 0x00b0 }
                if (r1 == 0) goto L_0x00a2
                n1.t0$c r2 = r8.f5835a     // Catch:{ all -> 0x00b0 }
                boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00b0 }
                r2.onVisibilityChanged(r1)     // Catch:{ all -> 0x00b0 }
                r8.f5839f = r5     // Catch:{ all -> 0x00b0 }
            L_0x00a2:
                n1.l r8 = r0.f5686d     // Catch:{ all -> 0x00b0 }
                r8.f()     // Catch:{ all -> 0x00b0 }
            L_0x00a7:
                r8 = r9
                h7.h r9 = h7.h.f4787a     // Catch:{ all -> 0x0036 }
                k3.j.n(r8, r5)
                h7.h r2 = h7.h.f4787a
            L_0x00af:
                return r2
            L_0x00b0:
                r8 = move-exception
                r7 = r9
                r9 = r8
                r8 = r7
            L_0x00b4:
                throw r9     // Catch:{ all -> 0x00b5 }
            L_0x00b5:
                r0 = move-exception
                k3.j.n(r8, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.e.a(n1.t0$e, j7.d):java.lang.Object");
        }

        public final a.a b() {
            a.a aVar = this.f5836b;
            if (aVar != null) {
                return aVar;
            }
            k.h("iWatchFaceService");
            throw null;
        }

        public final boolean c() {
            return this.f5836b != null;
        }

        public final void d(Bundle bundle) {
            c cVar = this.f5835a;
            if (!cVar.f5748i.V()) {
                this.f5837c = bundle;
                return;
            }
            y yVar = cVar.f5752m;
            cVar.H(new WatchUiState(bundle.getInt("interruption_filter", ((Number) k3.j.C(yVar.f5874a, 0)).intValue()), bundle.getBoolean("ambient_mode", ((Boolean) k3.j.C(yVar.f5875b, Boolean.FALSE)).booleanValue())), true);
            this.f5837c = null;
        }

        public final void e(Bundle bundle) {
            boolean z8 = this.f5841h;
            c cVar = this.f5835a;
            if (!z8) {
                this.f5838d = bundle;
                k3.j.K(cVar.f5744d, (g1) null, new a(this, (j7.d<? super a>) null), 3);
                return;
            }
            cVar.F(new DeviceConfig(bundle.getBoolean("low_bit_ambient"), bundle.getBoolean("burn_in_protection"), 1602318600000L, 1602321000000L));
        }

        public final void f() {
            boolean z8;
            c cVar = this.f5835a;
            if (!cVar.f5748i.V()) {
                z8 = true;
            } else {
                k3.j.K(cVar.f5744d, (g1) null, new e1(this, (j7.d<? super e1>) null), 3);
                z8 = false;
            }
            this.e = z8;
        }
    }

    public static final class f extends q7.l implements p7.a<k1> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t0 f5846f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(t0 t0Var) {
            super(0);
            this.f5846f = t0Var;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x032b: MOVE  (r9v2 int) = (r19v0 int)
            	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
            	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
            */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0330 A[LOOP:0: B:19:0x0080->B:130:0x0330, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0339 A[EDGE_INSN: B:140:0x0339->B:131:0x0339 ?: BREAK  
        EDGE_INSN: B:142:0x0339->B:131:0x0339 ?: BREAK  ] */
        public final java.lang.Object invoke() {
            /*
                r32 = this;
                r0 = r32
                n1.t0 r0 = r0.f5846f
                r0.getClass()
                r1 = 0
                android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch:{ Exception -> 0x0024 }
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x0024 }
                java.lang.Class r4 = r0.getClass()     // Catch:{ Exception -> 0x0024 }
                r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0024 }
                r4 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r2 = r2.getServiceInfo(r3, r4)     // Catch:{ Exception -> 0x0024 }
                android.os.Bundle r2 = r2.metaData     // Catch:{ Exception -> 0x0024 }
                java.lang.String r3 = "androidx.wear.watchface.XmlSchemaAndComplicationSlotsDefinition"
                int r2 = r2.getInt(r3)     // Catch:{ Exception -> 0x0024 }
                goto L_0x0025
            L_0x0024:
                r2 = r1
            L_0x0025:
                r3 = 0
                if (r2 != 0) goto L_0x0031
                n1.k1 r0 = new n1.k1
                i7.k r1 = i7.k.f4879f
                r0.<init>(r3, r1, r3)
                goto L_0x0341
            L_0x0031:
                android.content.res.Resources r11 = r0.getResources()
                java.lang.String r4 = "resources"
                q7.k.d(r11, r4)
                android.content.res.Resources r0 = r0.getResources()
                android.content.res.XmlResourceParser r0 = r0.getXml(r2)
                java.lang.String r2 = "resources.getXml(resourceId)"
                q7.k.d(r0, r2)
                java.lang.String r2 = "XmlWatchFace"
                k3.j.M(r0, r2)
                java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
                java.lang.String r4 = "complicationScaleX"
                r5 = 1065353216(0x3f800000, float:1.0)
                float r12 = r0.getAttributeFloatValue(r2, r4, r5)
                java.lang.String r4 = "complicationScaleY"
                float r13 = r0.getAttributeFloatValue(r2, r4, r5)
                r14 = 0
                int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                r15 = 1
                if (r4 <= 0) goto L_0x0064
                r4 = r15
                goto L_0x0065
            L_0x0064:
                r4 = r1
            L_0x0065:
                if (r4 == 0) goto L_0x034e
                int r4 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r4 <= 0) goto L_0x006d
                r4 = r15
                goto L_0x006e
            L_0x006d:
                r4 = r1
            L_0x006e:
                if (r4 == 0) goto L_0x0342
                int r10 = r0.getDepth()
                int r4 = r0.next()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r5 = r3
                r16 = r5
            L_0x0080:
                r6 = 2
                if (r4 != r6) goto L_0x031b
                java.lang.String r4 = r0.getName()
                if (r4 == 0) goto L_0x02f7
                int r7 = r4.hashCode()
                r8 = -1068743121(0xffffffffc04c462f, float:-3.1917837)
                if (r7 == r8) goto L_0x02aa
                r8 = 54247292(0x33bbf7c, float:5.5174174E-37)
                java.lang.String r17 = "Expected a UserStyleSchema node"
                if (r7 == r8) goto L_0x00e6
                r5 = 606678471(0x24292dc7, float:3.668481E-17)
                if (r7 != r5) goto L_0x02f7
                java.lang.String r5 = "UserStyleSchema"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x02f7
                java.lang.String r4 = r0.getName()
                boolean r4 = q7.k.a(r4, r5)
                if (r4 == 0) goto L_0x00dc
                java.util.HashMap r17 = new java.util.HashMap
                r17.<init>()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                u1.k r7 = new u1.k
                r4 = r7
                r5 = r0
                r6 = r8
                r3 = r7
                r7 = r11
                r14 = r8
                r8 = r12
                r18 = r9
                r9 = r13
                r19 = r10
                r10 = r17
                r4.<init>(r5, r6, r7, r8, r9, r10)
                k3.j.J(r0, r3)
                u1.l r5 = new u1.l
                r5.<init>(r14)
                r4 = r16
                r6 = r18
                r8 = 0
                goto L_0x0321
            L_0x00dc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r17.toString()
                r0.<init>(r1)
                throw r0
            L_0x00e6:
                r18 = r9
                r19 = r10
                java.lang.String r3 = "ComplicationSlot"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L_0x02f7
                h7.i r4 = n1.k1.a.f5648b
                java.lang.String r4 = r0.getName()
                boolean r4 = q7.k.a(r4, r3)
                if (r4 == 0) goto L_0x02a0
                java.lang.String r4 = "slotId"
                java.lang.Integer r4 = k3.j.y(r11, r0, r4)
                if (r4 == 0) goto L_0x0108
                r7 = r15
                goto L_0x0109
            L_0x0108:
                r7 = r1
            L_0x0109:
                if (r7 == 0) goto L_0x0294
                java.lang.String r7 = "accessibilityTraversalIndex"
                boolean r8 = k3.j.F(r0, r7)
                if (r8 == 0) goto L_0x011e
                int r7 = r0.getAttributeIntValue(r2, r7, r1)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r22 = r7
                goto L_0x0120
            L_0x011e:
                r22 = 0
            L_0x0120:
                java.lang.String r7 = "boundsType"
                boolean r8 = k3.j.F(r0, r7)
                if (r8 == 0) goto L_0x0288
                int r7 = r0.getAttributeIntValue(r2, r7, r1)
                if (r7 == 0) goto L_0x0140
                if (r7 == r15) goto L_0x013d
                if (r7 != r6) goto L_0x0135
                r23 = r6
                goto L_0x0142
            L_0x0135:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unknown boundsType"
                r0.<init>(r1)
                throw r0
            L_0x013d:
                r23 = r15
                goto L_0x0142
            L_0x0140:
                r23 = r1
            L_0x0142:
                java.lang.String r6 = "supportedTypes"
                boolean r7 = k3.j.F(r0, r6)
                if (r7 == 0) goto L_0x027c
                java.lang.String r6 = k3.j.B(r11, r0, r6)
                if (r6 == 0) goto L_0x0268
                r7 = 124(0x7c, float:1.74E-43)
                java.lang.String r7 = java.lang.String.valueOf(r7)
                w7.l.t(r1)
                int r8 = w7.l.q(r1, r6, r7, r1)
                r9 = -1
                if (r8 == r9) goto L_0x018e
                java.util.ArrayList r10 = new java.util.ArrayList
                r14 = 10
                r10.<init>(r14)
                r14 = r1
            L_0x0168:
                java.lang.CharSequence r14 = r6.subSequence(r14, r8)
                java.lang.String r14 = r14.toString()
                r10.add(r14)
                int r14 = r7.length()
                int r14 = r14 + r8
                int r8 = w7.l.q(r14, r6, r7, r1)
                if (r8 != r9) goto L_0x0168
                int r7 = r6.length()
                java.lang.CharSequence r6 = r6.subSequence(r14, r7)
                java.lang.String r6 = r6.toString()
                r10.add(r6)
                goto L_0x0196
            L_0x018e:
                java.lang.String r6 = r6.toString()
                java.util.List r10 = a1.a.A(r6)
            L_0x0196:
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = i7.f.M(r10)
                r6.<init>(r7)
                java.util.Iterator r7 = r10.iterator()
            L_0x01a3:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x01df
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                h7.i r9 = n1.k1.a.f5648b
                java.lang.Object r9 = r9.getValue()
                java.util.Map r9 = (java.util.Map) r9
                java.lang.Object r9 = r9.get(r8)
                q1.d r9 = (q1.d) r9
                if (r9 == 0) goto L_0x01c3
                r6.add(r9)
                goto L_0x01a3
            L_0x01c3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unrecognised type "
                r1.<init>(r2)
                r1.append(r8)
                java.lang.String r2 = " for ComplicationSlot "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01df:
                p1.g r26 = p1.g.a.a(r11, r0, r3)
                java.lang.String r3 = "initiallyEnabled"
                boolean r27 = r0.getAttributeBooleanValue(r2, r3, r15)
                java.lang.String r3 = "fixedComplicationDataSource"
                boolean r28 = r0.getAttributeBooleanValue(r2, r3, r1)
                java.lang.String r3 = "name"
                boolean r7 = k3.j.F(r0, r3)
                if (r7 == 0) goto L_0x0202
                int r3 = r0.getAttributeResourceValue(r2, r3, r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r29 = r3
                goto L_0x0204
            L_0x0202:
                r29 = 0
            L_0x0204:
                java.lang.String r3 = "screenReaderName"
                boolean r7 = k3.j.F(r0, r3)
                if (r7 == 0) goto L_0x0217
                int r3 = r0.getAttributeResourceValue(r2, r3, r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r30 = r3
                goto L_0x0219
            L_0x0217:
                r30 = 0
            L_0x0219:
                java.lang.String r3 = "startArcAngle"
                boolean r7 = k3.j.F(r0, r3)
                if (r7 == 0) goto L_0x023a
                n1.a r7 = new n1.a
                r8 = 0
                float r3 = r0.getAttributeFloatValue(r2, r3, r8)
                java.lang.String r9 = "totalArcAngle"
                float r9 = r0.getAttributeFloatValue(r2, r9, r8)
                java.lang.String r10 = "arcThickness"
                float r10 = r0.getAttributeFloatValue(r2, r10, r8)
                r7.<init>(r3, r9, r10)
                r31 = r7
                goto L_0x023d
            L_0x023a:
                r8 = 0
                r31 = 0
            L_0x023d:
                p1.f r24 = p1.f.a.a(r11, r0, r12, r13)
                if (r24 == 0) goto L_0x0245
                r3 = r15
                goto L_0x0246
            L_0x0245:
                r3 = r1
            L_0x0246:
                if (r3 == 0) goto L_0x025c
                n1.k1$a r3 = new n1.k1$a
                int r21 = r4.intValue()
                r20 = r3
                r25 = r6
                r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                r6 = r18
                r6.add(r3)
                goto L_0x031f
            L_0x025c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ComplicationSlot must have either one ComplicationSlotBounds child node or one per ComplicationType."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0268:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Unable to extract the supported type(s) for ComplicationSlot "
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x027c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "A ComplicationSlot must have a supportedTypes attribute"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0288:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "A ComplicationSlot must have a boundsType attribute"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0294:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "A ComplicationSlot must have a slotId attribute"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x02a0:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r17.toString()
                r0.<init>(r1)
                throw r0
            L_0x02aa:
                r6 = r9
                r19 = r10
                r8 = r14
                java.lang.String r3 = "UserStyleFlavors"
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L_0x02f7
                if (r5 == 0) goto L_0x02ba
                r4 = r15
                goto L_0x02bb
            L_0x02ba:
                r4 = r1
            L_0x02bb:
                if (r4 == 0) goto L_0x02eb
                java.lang.String r4 = "schema"
                q7.k.e(r5, r4)
                java.lang.String r4 = r0.getName()
                boolean r3 = q7.k.a(r4, r3)
                if (r3 == 0) goto L_0x02df
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                u1.i r4 = new u1.i
                r4.<init>(r0, r3, r11, r5)
                k3.j.J(r0, r4)
                u1.j r4 = new u1.j
                r4.<init>(r3)
                goto L_0x0321
            L_0x02df:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected a UserStyleFlavors node"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x02eb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "A UserStyleFlavors node requires a previous UserStyleSchema node"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x02f7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unexpected node "
                r2.<init>(r3)
                java.lang.String r3 = r0.getName()
                r2.append(r3)
                java.lang.String r3 = " at line "
                r2.append(r3)
                int r0 = r0.getLineNumber()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x031b:
                r6 = r9
                r19 = r10
                r8 = r14
            L_0x031f:
                r4 = r16
            L_0x0321:
                int r3 = r0.next()
                if (r3 == r15) goto L_0x0339
                int r7 = r0.getDepth()
                r9 = r19
                if (r7 > r9) goto L_0x0330
                goto L_0x0339
            L_0x0330:
                r16 = r4
                r14 = r8
                r10 = r9
                r4 = r3
                r9 = r6
                r3 = 0
                goto L_0x0080
            L_0x0339:
                r0.close()
                n1.k1 r0 = new n1.k1
                r0.<init>(r5, r6, r4)
            L_0x0341:
                return r0
            L_0x0342:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "complicationScaleY should be positive"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x034e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "complicationScaleX should be positive"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.t0.f.invoke():java.lang.Object");
        }
    }

    public static ArrayList e(Context context, String str) {
        ArrayList arrayList;
        k.e(context, "context");
        k.e(str, "fileName");
        v1.c cVar = new v1.c("WatchFaceService.readComplicationCache");
        byte[] f9 = f(context, str);
        if (f9 != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(f9));
                arrayList = new ArrayList();
                int readInt = objectInputStream.readInt();
                for (int i8 = 0; i8 < readInt; i8++) {
                    int readInt2 = objectInputStream.readInt();
                    Object readObject = objectInputStream.readObject();
                    k.c(readObject, "null cannot be cast to non-null type android.support.wearable.complications.ComplicationData");
                    ComplicationData complicationData = (ComplicationData) readObject;
                    arrayList.add(new IdAndComplicationDataWireFormat(readInt2, complicationData));
                    complicationData.toString();
                }
                objectInputStream.close();
            } catch (Exception e4) {
                Log.w("WatchFaceService", "Failed to read to complication cache due to exception", e4);
            }
            k3.j.n(cVar, (Throwable) null);
            return arrayList;
        }
        arrayList = null;
        k3.j.n(cVar, (Throwable) null);
        return arrayList;
        try {
        } catch (Throwable th) {
            k3.j.n(cVar, r7);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        k3.j.n(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        k3.j.n(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r6 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] f(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "context"
            q7.k.e(r5, r0)
            java.lang.String r0 = "fileName"
            q7.k.e(r6, r0)
            v1.c r0 = new v1.c
            java.lang.String r1 = "WatchFaceService.readComplicationCache"
            r0.<init>(r1)
            r1 = 0
            android.content.Context r5 = r5.createDeviceProtectedStorageContext()     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            java.io.FileInputStream r5 = r5.openFileInput(r6)     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            java.lang.String r6 = "it"
            q7.k.d(r5, r6)     // Catch:{ all -> 0x0048 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0048 }
            int r2 = r5.available()     // Catch:{ all -> 0x0048 }
            r3 = 8192(0x2000, float:1.14794E-41)
            int r2 = java.lang.Math.max(r3, r2)     // Catch:{ all -> 0x0048 }
            r6.<init>(r2)     // Catch:{ all -> 0x0048 }
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x0048 }
        L_0x0030:
            int r3 = r5.read(r2)     // Catch:{ all -> 0x0048 }
            if (r3 < 0) goto L_0x003b
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0030
        L_0x003b:
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "buffer.toByteArray()"
            q7.k.d(r6, r2)     // Catch:{ all -> 0x0048 }
            k3.j.n(r5, r1)     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            goto L_0x0057
        L_0x0048:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            k3.j.n(r5, r6)     // Catch:{ Exception -> 0x0056, all -> 0x004f }
            throw r2     // Catch:{ Exception -> 0x0056, all -> 0x004f }
        L_0x004f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            k3.j.n(r0, r5)
            throw r6
        L_0x0056:
            r6 = r1
        L_0x0057:
            k3.j.n(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.t0.f(android.content.Context, java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        k3.j.n(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        k3.j.n(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams g(android.content.Context r4) {
        /*
            java.lang.String r0 = "directboot.prefs"
            java.lang.String r1 = "context"
            q7.k.e(r4, r1)
            v1.c r1 = new v1.c
            java.lang.String r2 = "WatchFaceService.readDirectBootPrefs"
            r1.<init>(r2)
            r2 = 0
            android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            java.io.FileInputStream r4 = r4.openFileInput(r0)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            g1.c r0 = new g1.c     // Catch:{ all -> 0x0026 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0026 }
            g1.d r0 = r0.E()     // Catch:{ all -> 0x0026 }
            androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r0 = (androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams) r0     // Catch:{ all -> 0x0026 }
            k3.j.n(r4, r2)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            goto L_0x0035
        L_0x0026:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r3 = move-exception
            k3.j.n(r4, r0)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            throw r3     // Catch:{ Exception -> 0x0034, all -> 0x002d }
        L_0x002d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            k3.j.n(r1, r4)
            throw r0
        L_0x0034:
            r0 = r2
        L_0x0035:
            k3.j.n(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.t0.g(android.content.Context):androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        k3.j.n(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.wear.watchface.style.data.UserStyleWireFormat h(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "context"
            q7.k.e(r3, r0)
            java.lang.String r0 = "fileName"
            q7.k.e(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0050 }
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch:{ FileNotFoundException -> 0x0050 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0050 }
            boolean r3 = r1 instanceof java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0050 }
            if (r3 == 0) goto L_0x001f
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ FileNotFoundException -> 0x0050 }
            goto L_0x0027
        L_0x001f:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0050 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r1, r4)     // Catch:{ FileNotFoundException -> 0x0050 }
            r1 = r3
        L_0x0027:
            java.lang.String r3 = r1.readLine()     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            java.lang.String r4 = r1.readLine()     // Catch:{ all -> 0x0049 }
            if (r4 != 0) goto L_0x003b
        L_0x0034:
            h7.h r3 = h7.h.f4787a     // Catch:{ all -> 0x0049 }
            r3 = 0
            k3.j.n(r1, r3)     // Catch:{ FileNotFoundException -> 0x0050 }
            goto L_0x0050
        L_0x003b:
            r2 = 2
            byte[] r4 = android.util.Base64.decode(r4, r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "decode(value, Base64.NO_WRAP)"
            q7.k.d(r4, r2)     // Catch:{ all -> 0x0049 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0049 }
            goto L_0x0027
        L_0x0049:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004b }
        L_0x004b:
            r4 = move-exception
            k3.j.n(r1, r3)     // Catch:{ FileNotFoundException -> 0x0050 }
            throw r4     // Catch:{ FileNotFoundException -> 0x0050 }
        L_0x0050:
            androidx.wear.watchface.style.data.UserStyleWireFormat r3 = new androidx.wear.watchface.style.data.UserStyleWireFormat
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.t0.h(android.content.Context, java.lang.String):androidx.wear.watchface.style.data.UserStyleWireFormat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        k3.j.n(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(android.content.Context r1, java.lang.String r2, byte[] r3) {
        /*
            java.lang.String r0 = "context"
            q7.k.e(r1, r0)
            java.lang.String r0 = "fileName"
            q7.k.e(r2, r0)
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
            r0 = 0
            java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)
            r1.write(r3)     // Catch:{ all -> 0x001d }
            h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x001d }
            r2 = 0
            k3.j.n(r1, r2)
            return
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            k3.j.n(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.t0.j(android.content.Context, java.lang.String, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        k3.j.n(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        k3.j.n(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(android.content.Context r3, androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r4) {
        /*
            java.lang.String r0 = "directboot.prefs"
            java.lang.String r1 = "context"
            q7.k.e(r3, r1)
            java.lang.String r1 = "prefs"
            q7.k.e(r4, r1)
            v1.c r1 = new v1.c
            java.lang.String r2 = "WatchFaceService.writeDirectBootPrefs"
            r1.<init>(r2)
            android.content.Context r3 = r3.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0038 }
            r2 = 0
            java.io.FileOutputStream r3 = r3.openFileOutput(r0, r2)     // Catch:{ all -> 0x0038 }
            g1.c r0 = new g1.c     // Catch:{ all -> 0x0031 }
            r2 = 0
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0031 }
            r0.f0(r4)     // Catch:{ all -> 0x0031 }
            r0.a()     // Catch:{ all -> 0x0031 }
            h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x0031 }
            k3.j.n(r3, r2)     // Catch:{ all -> 0x0038 }
            k3.j.n(r1, r2)
            return
        L_0x0031:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            k3.j.n(r3, r4)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x003a }
        L_0x003a:
            r4 = move-exception
            k3.j.n(r1, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.t0.k(android.content.Context, androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams):void");
    }

    public l a(u1.b bVar) {
        h7.f fVar = this.f5733a;
        if (((k1) fVar.getValue()).f5646b.isEmpty()) {
            return new l(i7.k.f4879f, bVar);
        }
        k1 k1Var = (k1) fVar.getValue();
        throw new h7.c("You must override WatchFaceService.getComplicationSlotInflationFactory to provide additional details needed to inflate ComplicationSlotsManager");
    }

    public u1.l b() {
        List list;
        u1.l lVar = ((k1) this.f5733a.getValue()).f5645a;
        if (lVar == null || (list = lVar.f7637a) == null) {
            list = i7.k.f4879f;
        }
        return new u1.l(list);
    }

    public abstract Object c(SurfaceHolder surfaceHolder, j1 j1Var, l lVar, u1.b bVar, j7.d<? super i0> dVar);

    public final Handler d() {
        Handler handler;
        synchronized (this) {
            if (this.f5734b == null) {
                HandlerThread handlerThread = new HandlerThread("WatchFaceBackground", -2);
                handlerThread.setUncaughtExceptionHandler(new q0());
                handlerThread.start();
                this.f5734b = handlerThread;
            }
            HandlerThread handlerThread2 = this.f5734b;
            k.b(handlerThread2);
            handler = new Handler(handlerThread2.getLooper());
        }
        return handler;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        k.e(fileDescriptor, "fd");
        k.e(printWriter, "writer");
        k.e(strArr, "args");
        super.dump(fileDescriptor, printWriter, strArr);
        t tVar = new t(printWriter);
        tVar.println("AndroidX WatchFaceService " + getPackageName());
        HashMap<String, h.c> hashMap = androidx.wear.watchface.control.h.f2292a;
        h.a.b(tVar);
        h7.f fVar = t1.l.f7438f;
        t1.l a9 = l.c.a();
        a9.getClass();
        tVar.println("EditorService:");
        tVar.b();
        synchronized (a9.f7439a) {
            for (Map.Entry next : a9.f7441c.entrySet()) {
                int intValue = ((Number) next.getKey()).intValue();
                n nVar = (n) next.getValue();
                tVar.println("id = " + intValue + ", alive = " + nVar.asBinder().isBinderAlive());
                if (nVar.asBinder().isBinderAlive()) {
                    tVar.println(1 + " = {observer.apiVersion}");
                }
            }
            h7.h hVar = h7.h.f4787a;
        }
        tVar.a();
        HashSet<androidx.wear.watchface.control.a> hashSet = androidx.wear.watchface.control.a.f2242c;
        a.b.a(tVar);
        tVar.f5729b.flush();
    }

    public final void i(ContextWrapper contextWrapper) {
        k.e(contextWrapper, "context");
        attachBaseContext(contextWrapper);
    }

    public final WallpaperService.Engine onCreateEngine() {
        return new c(new Handler(Looper.getMainLooper()), d(), (ComponentName) null);
    }
}
