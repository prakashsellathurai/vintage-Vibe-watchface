package p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.support.wearable.complications.b;
import android.util.Log;
import java.io.Closeable;
import java.util.NoSuchElementException;
import k3.j;
import q7.k;
import y7.g;
import y7.h;
import y7.o;

public final class c implements AutoCloseable {

    /* renamed from: f  reason: collision with root package name */
    public final ServiceConnection f6249f;

    /* renamed from: g  reason: collision with root package name */
    public Context f6250g;

    /* renamed from: h  reason: collision with root package name */
    public final o f6251h = j.d();

    /* renamed from: i  reason: collision with root package name */
    public final Object f6252i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public boolean f6253j;

    public static final class a extends android.support.wearable.complications.a {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int f6254d = 0;

        /* renamed from: a  reason: collision with root package name */
        public final android.support.wearable.complications.b f6255a;

        /* renamed from: b  reason: collision with root package name */
        public g<? super q1.b> f6256b;

        /* renamed from: c  reason: collision with root package name */
        public final IBinder.DeathRecipient f6257c;

        public a(android.support.wearable.complications.b bVar, h hVar) {
            this.f6255a = bVar;
            this.f6256b = hVar;
            androidx.health.services.client.impl.ipc.internal.a aVar = new androidx.health.services.client.impl.ipc.internal.a(1, this);
            this.f6257c = aVar;
            bVar.asBinder().linkToDeath(aVar, 0);
            g<? super q1.b> gVar = this.f6256b;
            if (gVar != null) {
                gVar.b(new b(this));
            }
        }

        public final void c() {
            try {
                this.f6255a.asBinder().unlinkToDeath(this.f6257c, 0);
            } catch (NoSuchElementException e) {
                Log.w("ComplicationDataS", "retrievePreviewComplicationData encountered", e);
            }
        }
    }

    public final class b implements ServiceConnection {
        public b() {
        }

        public final void onBindingDied(ComponentName componentName) {
            c cVar = c.this;
            synchronized (cVar.f6252i) {
                cVar.f6253j = true;
                h7.h hVar = h7.h.f4787a;
            }
            c.this.f6251h.G(new d());
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            k.e(componentName, "name");
            k.e(iBinder, "service");
            o oVar = c.this.f6251h;
            int i8 = b.a.f239a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.wearable.complications.IProviderInfoService");
            oVar.X((queryLocalInterface == null || !(queryLocalInterface instanceof android.support.wearable.complications.b)) ? new b.a.C0005a(iBinder) : (android.support.wearable.complications.b) queryLocalInterface);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            k.e(componentName, "name");
            c cVar = c.this;
            synchronized (cVar.f6252i) {
                cVar.f6253j = true;
                h7.h hVar = h7.h.f4787a;
            }
            c.this.f6251h.G(new d());
        }
    }

    /* renamed from: p1.c$c  reason: collision with other inner class name */
    public static final class C0104c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6259a;

        /* renamed from: b  reason: collision with root package name */
        public final a f6260b;

        public C0104c(int i8, a aVar) {
            this.f6259a = i8;
            this.f6260b = aVar;
        }
    }

    public static final class d extends Exception {
    }

    @l7.e(c = "androidx.wear.watchface.complications.ComplicationDataSourceInfoRetriever", f = "ComplicationDataSourceInfoRetriever.kt", l = {246}, m = "awaitDeferredService")
    public static final class e extends l7.c {

        /* renamed from: i  reason: collision with root package name */
        public Object f6261i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f6262j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ c f6263k;

        /* renamed from: l  reason: collision with root package name */
        public int f6264l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c cVar, j7.d<? super e> dVar) {
            super(dVar);
            this.f6263k = cVar;
        }

        public final Object h(Object obj) {
            this.f6262j = obj;
            this.f6264l |= Integer.MIN_VALUE;
            return this.f6263k.a(this);
        }
    }

    @l7.e(c = "androidx.wear.watchface.complications.ComplicationDataSourceInfoRetriever", f = "ComplicationDataSourceInfoRetriever.kt", l = {187, 420}, m = "retrievePreviewComplicationData")
    public static final class f extends l7.c {

        /* renamed from: i  reason: collision with root package name */
        public ComponentName f6265i;

        /* renamed from: j  reason: collision with root package name */
        public Object f6266j;

        /* renamed from: k  reason: collision with root package name */
        public Closeable f6267k;

        /* renamed from: l  reason: collision with root package name */
        public Object f6268l;

        /* renamed from: m  reason: collision with root package name */
        public Object f6269m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f6270n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c f6271o;

        /* renamed from: p  reason: collision with root package name */
        public int f6272p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(c cVar, j7.d<? super f> dVar) {
            super(dVar);
            this.f6271o = cVar;
        }

        public final Object h(Object obj) {
            this.f6270n = obj;
            this.f6272p |= Integer.MIN_VALUE;
            return this.f6271o.d((ComponentName) null, (q1.d) null, this);
        }
    }

    public c(Context context) {
        k.e(context, "context");
        Intent intent = new Intent("android.support.wearable.complications.ACTION_GET_COMPLICATION_CONFIG");
        intent.setPackage("com.google.android.wearable.app");
        h7.h hVar = h7.h.f4787a;
        b bVar = new b();
        this.f6249f = bVar;
        this.f6250g = context;
        context.bindService(intent, bVar, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(j7.d<? super android.support.wearable.complications.b> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p1.c.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            p1.c$e r0 = (p1.c.e) r0
            int r1 = r0.f6264l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6264l = r1
            goto L_0x0018
        L_0x0013:
            p1.c$e r0 = new p1.c$e
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f6262j
            k7.a r1 = k7.a.f5217f
            int r2 = r0.f6264l
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f6261i
            java.io.Closeable r5 = (java.io.Closeable) r5
            a1.a.I(r6)     // Catch:{ all -> 0x002b }
            goto L_0x004f
        L_0x002b:
            r6 = move-exception
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            a1.a.I(r6)
            v1.c r6 = new v1.c
            java.lang.String r2 = "ComplicationDataSourceInfoRetriever.awaitDeferredService"
            r6.<init>(r2)
            y7.o r5 = r5.f6251h     // Catch:{ all -> 0x0056 }
            r0.f6261i = r6     // Catch:{ all -> 0x0056 }
            r0.f6264l = r3     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.s(r0)     // Catch:{ all -> 0x0056 }
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x004f:
            android.support.wearable.complications.b r6 = (android.support.wearable.complications.b) r6     // Catch:{ all -> 0x002b }
            r0 = 0
            k3.j.n(r5, r0)
            return r6
        L_0x0056:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x005a:
            throw r6     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            k3.j.n(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.a(j7.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.io.Serializable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: p1.c$c[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.io.Serializable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable c(android.content.ComponentName r10, int[] r11, j7.d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p1.d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            p1.d r0 = (p1.d) r0
            int r1 = r0.f6278n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6278n = r1
            goto L_0x0018
        L_0x0013:
            p1.d r0 = new p1.d
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f6276l
            k7.a r1 = k7.a.f5217f
            int r2 = r0.f6278n
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.f6275k
            java.io.Closeable r9 = (java.io.Closeable) r9
            int[] r11 = r0.f6274j
            android.content.ComponentName r10 = r0.f6273i
            a1.a.I(r12)     // Catch:{ all -> 0x002f }
            goto L_0x0061
        L_0x002f:
            r10 = move-exception
            goto L_0x009e
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            a1.a.I(r12)
            v1.c r12 = new v1.c
            java.lang.String r2 = "ComplicationDataSourceInfoRetriever.retrieveComplicationDataSourceInfo"
            r12.<init>(r2)
            java.lang.Object r2 = r9.f6252i     // Catch:{ all -> 0x00af }
            monitor-enter(r2)     // Catch:{ all -> 0x00af }
            boolean r4 = r9.f6253j     // Catch:{ all -> 0x00ac }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00a0
            h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x00ac }
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            r0.f6273i = r10     // Catch:{ all -> 0x00af }
            r0.f6274j = r11     // Catch:{ all -> 0x00af }
            r0.f6275k = r12     // Catch:{ all -> 0x00af }
            r0.f6278n = r3     // Catch:{ all -> 0x00af }
            java.lang.Object r9 = r9.a(r0)     // Catch:{ all -> 0x00af }
            if (r9 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r8 = r12
            r12 = r9
            r9 = r8
        L_0x0061:
            android.support.wearable.complications.b r12 = (android.support.wearable.complications.b) r12     // Catch:{ all -> 0x002f }
            android.support.wearable.complications.ComplicationProviderInfo[] r10 = r12.l(r10, r11)     // Catch:{ all -> 0x002f }
            r12 = 0
            if (r10 == 0) goto L_0x0099
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            int r1 = r10.length     // Catch:{ all -> 0x002f }
            r0.<init>(r1)     // Catch:{ all -> 0x002f }
            int r1 = r10.length     // Catch:{ all -> 0x002f }
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0074:
            if (r3 >= r1) goto L_0x0090
            r5 = r10[r3]     // Catch:{ all -> 0x002f }
            int r6 = r4 + 1
            p1.c$c r7 = new p1.c$c     // Catch:{ all -> 0x002f }
            r4 = r11[r4]     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0085
            p1.a r5 = p1.e.a(r5)     // Catch:{ all -> 0x002f }
            goto L_0x0086
        L_0x0085:
            r5 = r12
        L_0x0086:
            r7.<init>(r4, r5)     // Catch:{ all -> 0x002f }
            r0.add(r7)     // Catch:{ all -> 0x002f }
            int r3 = r3 + 1
            r4 = r6
            goto L_0x0074
        L_0x0090:
            p1.c$c[] r10 = new p1.c.C0104c[r2]     // Catch:{ all -> 0x002f }
            java.lang.Object[] r10 = r0.toArray(r10)     // Catch:{ all -> 0x002f }
            p1.c$c[] r10 = (p1.c.C0104c[]) r10     // Catch:{ all -> 0x002f }
            goto L_0x009a
        L_0x0099:
            r10 = r12
        L_0x009a:
            k3.j.n(r9, r12)
            return r10
        L_0x009e:
            r12 = r9
            goto L_0x00b1
        L_0x00a0:
            java.lang.String r9 = "retrieveComplicationDataSourceInfo called after close"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ac }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ac }
            r10.<init>(r9)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            r10 = r9
        L_0x00b1:
            throw r10     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r9 = move-exception
            k3.j.n(r12, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.c(android.content.ComponentName, int[], j7.d):java.io.Serializable");
    }

    public final void close() {
        synchronized (this.f6252i) {
            if (this.f6253j) {
                Log.e("ComplicationDataS", "Error ComplicationDataSourceInfoRetriever.close called when already closed", new Throwable());
            } else {
                this.f6253j = true;
                try {
                    Context context = this.f6250g;
                    if (context != null) {
                        context.unbindService(this.f6249f);
                    }
                    this.f6250g = null;
                    h7.h hVar = h7.h.f4787a;
                } catch (IllegalArgumentException e4) {
                    Log.e("ComplicationDataS", "unbindService failed", e4);
                }
            }
        }
        return;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: q1.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC, Splitter:B:38:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(android.content.ComponentName r9, q1.d r10, j7.d<? super q1.b> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p1.c.f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            p1.c$f r0 = (p1.c.f) r0
            int r1 = r0.f6272p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6272p = r1
            goto L_0x0018
        L_0x0013:
            p1.c$f r0 = new p1.c$f
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f6270n
            k7.a r1 = k7.a.f5217f
            int r2 = r0.f6272p
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.io.Closeable r8 = r0.f6267k
            a1.a.I(r11)     // Catch:{ all -> 0x0043 }
            goto L_0x00aa
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.io.Closeable r8 = r0.f6267k
            java.lang.Object r9 = r0.f6266j
            r10 = r9
            q1.d r10 = (q1.d) r10
            android.content.ComponentName r9 = r0.f6265i
            a1.a.I(r11)     // Catch:{ all -> 0x0043 }
            goto L_0x006c
        L_0x0043:
            r9 = move-exception
            goto L_0x00ae
        L_0x0045:
            a1.a.I(r11)
            v1.c r11 = new v1.c
            java.lang.String r2 = "ComplicationDataSourceInfoRetriever.requestPreviewComplicationData"
            r11.<init>(r2)
            java.lang.Object r2 = r8.f6252i     // Catch:{ all -> 0x00bf }
            monitor-enter(r2)     // Catch:{ all -> 0x00bf }
            boolean r6 = r8.f6253j     // Catch:{ all -> 0x00bc }
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x00b0
            h7.h r6 = h7.h.f4787a     // Catch:{ all -> 0x00bc }
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            r0.f6265i = r9     // Catch:{ all -> 0x00bf }
            r0.f6266j = r10     // Catch:{ all -> 0x00bf }
            r0.f6267k = r11     // Catch:{ all -> 0x00bf }
            r0.f6272p = r5     // Catch:{ all -> 0x00bf }
            java.lang.Object r8 = r8.a(r0)     // Catch:{ all -> 0x00bf }
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r7 = r11
            r11 = r8
            r8 = r7
        L_0x006c:
            android.support.wearable.complications.b r11 = (android.support.wearable.complications.b) r11     // Catch:{ all -> 0x0043 }
            int r2 = r11.getApiVersion()     // Catch:{ all -> 0x0043 }
            if (r2 >= r5) goto L_0x0078
            k3.j.n(r8, r4)
            return r4
        L_0x0078:
            r0.f6265i = r9     // Catch:{ all -> 0x0043 }
            r0.f6266j = r10     // Catch:{ all -> 0x0043 }
            r0.f6267k = r8     // Catch:{ all -> 0x0043 }
            r0.f6268l = r11     // Catch:{ all -> 0x0043 }
            r0.f6269m = r0     // Catch:{ all -> 0x0043 }
            r0.f6272p = r3     // Catch:{ all -> 0x0043 }
            y7.h r2 = new y7.h     // Catch:{ all -> 0x0043 }
            j7.d r0 = a1.a.x(r0)     // Catch:{ all -> 0x0043 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0043 }
            r2.v()     // Catch:{ all -> 0x0043 }
            p1.c$a r0 = new p1.c$a     // Catch:{ all -> 0x0043 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x0043 }
            int r10 = r10.f6450f     // Catch:{ all -> 0x0043 }
            boolean r9 = r11.r(r9, r10, r0)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x00a3
            r0.c()     // Catch:{ all -> 0x0043 }
            r2.i(r4)     // Catch:{ all -> 0x0043 }
        L_0x00a3:
            java.lang.Object r11 = r2.u()     // Catch:{ all -> 0x0043 }
            if (r11 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            k3.j.n(r8, r4)
            return r11
        L_0x00ae:
            r11 = r8
            goto L_0x00c1
        L_0x00b0:
            java.lang.String r8 = "retrievePreviewComplicationData called after close"
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00bc }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00bc }
            r9.<init>(r8)     // Catch:{ all -> 0x00bc }
            throw r9     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r8 = move-exception
            r9 = r8
        L_0x00c1:
            throw r9     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r8 = move-exception
            k3.j.n(r11, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.d(android.content.ComponentName, q1.d, j7.d):java.lang.Object");
    }
}
