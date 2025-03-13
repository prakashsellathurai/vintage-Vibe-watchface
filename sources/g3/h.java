package g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.j;
import h3.a;
import h3.b;
import h3.c;
import i3.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import k3.e;
import k3.k;
import l3.d;
import r2.m;
import r2.v;

public final class h<R> implements c, b, g {
    public static final boolean B = Log.isLoggable("Request", 2);
    public final RuntimeException A;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f4575a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4576b;

    /* renamed from: c  reason: collision with root package name */
    public final e<R> f4577c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4578d;
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final f f4579f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4580g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<R> f4581h;

    /* renamed from: i  reason: collision with root package name */
    public final a<?> f4582i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4583j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4584k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bumptech.glide.h f4585l;

    /* renamed from: m  reason: collision with root package name */
    public final c<R> f4586m;

    /* renamed from: n  reason: collision with root package name */
    public final List<e<R>> f4587n;

    /* renamed from: o  reason: collision with root package name */
    public final i3.b<? super R> f4588o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f4589p;

    /* renamed from: q  reason: collision with root package name */
    public v<R> f4590q;
    public m.d r;

    /* renamed from: s  reason: collision with root package name */
    public volatile m f4591s;

    /* renamed from: t  reason: collision with root package name */
    public int f4592t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f4593u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f4594v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public int f4595x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4596z;

    public h(Context context, f fVar, Object obj, Object obj2, Class cls, j jVar, int i8, int i9, com.bumptech.glide.h hVar, a aVar, ArrayList arrayList, d dVar, m mVar, a.C0065a aVar2) {
        f fVar2 = fVar;
        Executor executor = e.f5135a;
        if (B) {
            String.valueOf(hashCode());
        }
        this.f4575a = new d.a();
        this.f4576b = obj;
        this.e = context;
        this.f4579f = fVar2;
        this.f4580g = obj2;
        this.f4581h = cls;
        this.f4582i = jVar;
        this.f4583j = i8;
        this.f4584k = i9;
        this.f4585l = hVar;
        this.f4586m = aVar;
        this.f4577c = null;
        this.f4587n = arrayList;
        this.f4578d = dVar;
        this.f4591s = mVar;
        this.f4588o = aVar2;
        this.f4589p = executor;
        this.f4592t = 1;
        if (this.A == null && fVar2.f2926g.f2929a.containsKey(com.bumptech.glide.e.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z8;
        synchronized (this.f4576b) {
            z8 = this.f4592t == 4;
        }
        return z8;
    }

    public final void b() {
        if (!this.f4596z) {
            this.f4575a.a();
            this.f4586m.g();
            m.d dVar = this.r;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f6846a.g(dVar.f6847b);
                }
                this.r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f4576b) {
            z8 = this.f4592t == 6;
        }
        return z8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r4.f4591s.getClass();
        r2.m.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4576b
            monitor-enter(r0)
            boolean r1 = r4.f4596z     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0045
            l3.d$a r1 = r4.f4575a     // Catch:{ all -> 0x004d }
            r1.a()     // Catch:{ all -> 0x004d }
            int r1 = r4.f4592t     // Catch:{ all -> 0x004d }
            r2 = 6
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0013:
            r4.b()     // Catch:{ all -> 0x004d }
            r2.v<R> r1 = r4.f4590q     // Catch:{ all -> 0x004d }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r4.f4590q = r3     // Catch:{ all -> 0x004d }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            g3.d r3 = r4.f4578d     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.e(r4)     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0037
            h3.c<R> r3 = r4.f4586m     // Catch:{ all -> 0x004d }
            r4.d()     // Catch:{ all -> 0x004d }
            r3.k()     // Catch:{ all -> 0x004d }
        L_0x0037:
            r4.f4592t = r2     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0044
            r2.m r4 = r4.f4591s
            r4.getClass()
            r2.m.d(r1)
        L_0x0044:
            return
        L_0x0045:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r4.<init>(r1)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ all -> 0x004d }
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.clear():void");
    }

    public final Drawable d() {
        int i8;
        if (this.f4594v == null) {
            a<?> aVar = this.f4582i;
            Drawable drawable = aVar.f4558l;
            this.f4594v = drawable;
            if (drawable == null && (i8 = aVar.f4559m) > 0) {
                this.f4594v = i(i8);
            }
        }
        return this.f4594v;
    }

    public final boolean e() {
        d dVar = this.f4578d;
        return dVar == null || !dVar.getRoot().a();
    }

    public final void f() {
        synchronized (this.f4576b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4576b
            monitor-enter(r0)
            boolean r1 = r6.f4596z     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x00a6
            l3.d$a r1 = r6.f4575a     // Catch:{ all -> 0x00ae }
            r1.a()     // Catch:{ all -> 0x00ae }
            int r1 = k3.f.f5137a     // Catch:{ all -> 0x00ae }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r6.f4580g     // Catch:{ all -> 0x00ae }
            r2 = 3
            if (r1 != 0) goto L_0x004f
            int r1 = r6.f4583j     // Catch:{ all -> 0x00ae }
            int r3 = r6.f4584k     // Catch:{ all -> 0x00ae }
            boolean r1 = k3.k.g(r1, r3)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0028
            int r1 = r6.f4583j     // Catch:{ all -> 0x00ae }
            r6.f4595x = r1     // Catch:{ all -> 0x00ae }
            int r1 = r6.f4584k     // Catch:{ all -> 0x00ae }
            r6.y = r1     // Catch:{ all -> 0x00ae }
        L_0x0028:
            android.graphics.drawable.Drawable r1 = r6.w     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x003e
            g3.a<?> r1 = r6.f4582i     // Catch:{ all -> 0x00ae }
            android.graphics.drawable.Drawable r3 = r1.f4565t     // Catch:{ all -> 0x00ae }
            r6.w = r3     // Catch:{ all -> 0x00ae }
            if (r3 != 0) goto L_0x003e
            int r1 = r1.f4566u     // Catch:{ all -> 0x00ae }
            if (r1 <= 0) goto L_0x003e
            android.graphics.drawable.Drawable r1 = r6.i(r1)     // Catch:{ all -> 0x00ae }
            r6.w = r1     // Catch:{ all -> 0x00ae }
        L_0x003e:
            android.graphics.drawable.Drawable r1 = r6.w     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0043
            r2 = 5
        L_0x0043:
            r2.r r1 = new r2.r     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x00ae }
            r6.k(r1, r2)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x004f:
            int r1 = r6.f4592t     // Catch:{ all -> 0x00ae }
            r3 = 2
            if (r1 == r3) goto L_0x009e
            r4 = 0
            r5 = 4
            if (r1 != r5) goto L_0x0061
            r2.v<R> r1 = r6.f4590q     // Catch:{ all -> 0x00ae }
            p2.a r2 = p2.a.f6298j     // Catch:{ all -> 0x00ae }
            r6.m(r1, r2, r4)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x0061:
            r6.f4592t = r2     // Catch:{ all -> 0x00ae }
            int r1 = r6.f4583j     // Catch:{ all -> 0x00ae }
            int r5 = r6.f4584k     // Catch:{ all -> 0x00ae }
            boolean r1 = k3.k.g(r1, r5)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0075
            int r1 = r6.f4583j     // Catch:{ all -> 0x00ae }
            int r5 = r6.f4584k     // Catch:{ all -> 0x00ae }
            r6.n(r1, r5)     // Catch:{ all -> 0x00ae }
            goto L_0x007a
        L_0x0075:
            h3.c<R> r1 = r6.f4586m     // Catch:{ all -> 0x00ae }
            r1.f(r6)     // Catch:{ all -> 0x00ae }
        L_0x007a:
            int r1 = r6.f4592t     // Catch:{ all -> 0x00ae }
            if (r1 == r3) goto L_0x0080
            if (r1 != r2) goto L_0x0095
        L_0x0080:
            g3.d r1 = r6.f4578d     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x008a
            boolean r1 = r1.d(r6)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x008b
        L_0x008a:
            r4 = 1
        L_0x008b:
            if (r4 == 0) goto L_0x0095
            h3.c<R> r1 = r6.f4586m     // Catch:{ all -> 0x00ae }
            r6.d()     // Catch:{ all -> 0x00ae }
            r1.e()     // Catch:{ all -> 0x00ae }
        L_0x0095:
            boolean r6 = B     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x009c
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00ae }
        L_0x009c:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x009e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = "Cannot restart a running request"
            r6.<init>(r1)     // Catch:{ all -> 0x00ae }
            throw r6     // Catch:{ all -> 0x00ae }
        L_0x00a6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r6.<init>(r1)     // Catch:{ all -> 0x00ae }
            throw r6     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.g():void");
    }

    public final boolean h(c cVar) {
        int i8;
        int i9;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i10;
        int i11;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f4576b) {
            i8 = this.f4583j;
            i9 = this.f4584k;
            obj = this.f4580g;
            cls = this.f4581h;
            aVar = this.f4582i;
            hVar = this.f4585l;
            List<e<R>> list = this.f4587n;
            size = list != null ? list.size() : 0;
        }
        h hVar3 = (h) cVar;
        synchronized (hVar3.f4576b) {
            i10 = hVar3.f4583j;
            i11 = hVar3.f4584k;
            obj2 = hVar3.f4580g;
            cls2 = hVar3.f4581h;
            aVar2 = hVar3.f4582i;
            hVar2 = hVar3.f4585l;
            List<e<R>> list2 = hVar3.f4587n;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i8 != i10 || i9 != i11) {
            return false;
        }
        char[] cArr = k.f5169a;
        return (obj == null ? obj2 == null : obj instanceof v2.k ? ((v2.k) obj).a() : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2;
    }

    public final Drawable i(int i8) {
        Resources.Theme theme = this.f4582i.f4569z;
        if (theme == null) {
            theme = this.e.getTheme();
        }
        f fVar = this.f4579f;
        return a3.a.a(fVar, fVar, i8, theme);
    }

    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f4576b) {
            int i8 = this.f4592t;
            if (i8 != 2) {
                if (i8 != 3) {
                    z8 = false;
                }
            }
            z8 = true;
        }
        return z8;
    }

    public final boolean j() {
        boolean z8;
        synchronized (this.f4576b) {
            z8 = this.f4592t == 4;
        }
        return z8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[Catch:{ all -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d9 A[Catch:{ all -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(r2.r r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Load failed for "
            l3.d$a r1 = r5.f4575a
            r1.a()
            java.lang.Object r1 = r5.f4576b
            monitor-enter(r1)
            r6.getClass()     // Catch:{ all -> 0x00e1 }
            com.bumptech.glide.f r2 = r5.f4579f     // Catch:{ all -> 0x00e1 }
            int r2 = r2.f2927h     // Catch:{ all -> 0x00e1 }
            if (r2 > r7) goto L_0x0045
            java.lang.String r7 = "Glide"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r3.<init>(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r5.f4580g     // Catch:{ all -> 0x00e1 }
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = " with size ["
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            int r0 = r5.f4595x     // Catch:{ all -> 0x00e1 }
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            int r0 = r5.y     // Catch:{ all -> 0x00e1 }
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00e1 }
            android.util.Log.w(r7, r0, r6)     // Catch:{ all -> 0x00e1 }
            r7 = 4
            if (r2 > r7) goto L_0x0045
            r6.e()     // Catch:{ all -> 0x00e1 }
        L_0x0045:
            r6 = 0
            r5.r = r6     // Catch:{ all -> 0x00e1 }
            r7 = 5
            r5.f4592t = r7     // Catch:{ all -> 0x00e1 }
            r7 = 1
            r5.f4596z = r7     // Catch:{ all -> 0x00e1 }
            r0 = 0
            java.util.List<g3.e<R>> r2 = r5.f4587n     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x006d
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008e }
            r3 = r0
        L_0x0058:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x008e }
            g3.e r4 = (g3.e) r4     // Catch:{ all -> 0x008e }
            r5.e()     // Catch:{ all -> 0x008e }
            boolean r4 = r4.b()     // Catch:{ all -> 0x008e }
            r3 = r3 | r4
            goto L_0x0058
        L_0x006d:
            r3 = r0
        L_0x006e:
            g3.e<R> r2 = r5.f4577c     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007d
            r5.e()     // Catch:{ all -> 0x008e }
            boolean r2 = r2.b()     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007d
            r2 = r7
            goto L_0x007e
        L_0x007d:
            r2 = r0
        L_0x007e:
            r2 = r2 | r3
            if (r2 != 0) goto L_0x00d3
            g3.d r2 = r5.f4578d     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0090
            boolean r2 = r2.d(r5)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            r7 = r0
            goto L_0x0090
        L_0x008e:
            r6 = move-exception
            goto L_0x00de
        L_0x0090:
            if (r7 != 0) goto L_0x0093
            goto L_0x00d3
        L_0x0093:
            java.lang.Object r7 = r5.f4580g     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00af
            android.graphics.drawable.Drawable r6 = r5.w     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x00ad
            g3.a<?> r6 = r5.f4582i     // Catch:{ all -> 0x008e }
            android.graphics.drawable.Drawable r7 = r6.f4565t     // Catch:{ all -> 0x008e }
            r5.w = r7     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00ad
            int r6 = r6.f4566u     // Catch:{ all -> 0x008e }
            if (r6 <= 0) goto L_0x00ad
            android.graphics.drawable.Drawable r6 = r5.i(r6)     // Catch:{ all -> 0x008e }
            r5.w = r6     // Catch:{ all -> 0x008e }
        L_0x00ad:
            android.graphics.drawable.Drawable r6 = r5.w     // Catch:{ all -> 0x008e }
        L_0x00af:
            if (r6 != 0) goto L_0x00c9
            android.graphics.drawable.Drawable r6 = r5.f4593u     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x00c7
            g3.a<?> r6 = r5.f4582i     // Catch:{ all -> 0x008e }
            android.graphics.drawable.Drawable r7 = r6.f4556j     // Catch:{ all -> 0x008e }
            r5.f4593u = r7     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x00c7
            int r6 = r6.f4557k     // Catch:{ all -> 0x008e }
            if (r6 <= 0) goto L_0x00c7
            android.graphics.drawable.Drawable r6 = r5.i(r6)     // Catch:{ all -> 0x008e }
            r5.f4593u = r6     // Catch:{ all -> 0x008e }
        L_0x00c7:
            android.graphics.drawable.Drawable r6 = r5.f4593u     // Catch:{ all -> 0x008e }
        L_0x00c9:
            if (r6 != 0) goto L_0x00ce
            r5.d()     // Catch:{ all -> 0x008e }
        L_0x00ce:
            h3.c<R> r6 = r5.f4586m     // Catch:{ all -> 0x008e }
            r6.b()     // Catch:{ all -> 0x008e }
        L_0x00d3:
            r5.f4596z = r0     // Catch:{ all -> 0x00e1 }
            g3.d r6 = r5.f4578d     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x00dc
            r6.i(r5)     // Catch:{ all -> 0x00e1 }
        L_0x00dc:
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            return
        L_0x00de:
            r5.f4596z = r0     // Catch:{ all -> 0x00e1 }
            throw r6     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.k(r2.r, int):void");
    }

    /* JADX INFO: finally extract failed */
    public final void l(v vVar, Object obj, p2.a aVar) {
        boolean z8;
        e();
        this.f4592t = 4;
        this.f4590q = vVar;
        if (this.f4579f.f2927h <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.f4580g);
            int i8 = k3.f.f5137a;
            SystemClock.elapsedRealtimeNanos();
        }
        boolean z9 = true;
        this.f4596z = true;
        try {
            List<e<R>> list = this.f4587n;
            if (list != null) {
                z8 = false;
                for (e<R> c9 : list) {
                    z8 |= c9.c();
                }
            } else {
                z8 = false;
            }
            e<R> eVar = this.f4577c;
            if (eVar == null || !eVar.c()) {
                z9 = false;
            }
            if (!z9 && !z8) {
                this.f4588o.getClass();
                this.f4586m.i(obj);
            }
            this.f4596z = false;
            d dVar = this.f4578d;
            if (dVar != null) {
                dVar.b(this);
            }
        } catch (Throwable th) {
            this.f4596z = false;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r6.f4591s.getClass();
        r2.m.d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(r2.v<?> r7, p2.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r9 = "Expected to receive an object of "
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            l3.d$a r1 = r6.f4575a
            r1.a()
            r1 = 0
            java.lang.Object r2 = r6.f4576b     // Catch:{ all -> 0x00b6 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b6 }
            r6.r = r1     // Catch:{ all -> 0x00b2 }
            r3 = 5
            if (r7 != 0) goto L_0x002f
            r2.r r7 = new r2.r     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r9 = r6.f4581h     // Catch:{ all -> 0x00b2 }
            r8.append(r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = " inside, but instead got null."
            r8.append(r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00b2 }
            r7.<init>(r8)     // Catch:{ all -> 0x00b2 }
            r6.k(r7, r3)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            return
        L_0x002f:
            java.lang.Object r0 = r7.get()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x0066
            java.lang.Class<R> r4 = r6.f4581h     // Catch:{ all -> 0x00b2 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x00b2 }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ all -> 0x00b2 }
            if (r4 != 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            g3.d r9 = r6.f4578d     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x004f
            boolean r9 = r9.k(r6)     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r9 = 0
            goto L_0x0050
        L_0x004f:
            r9 = 1
        L_0x0050:
            if (r9 != 0) goto L_0x0061
            r6.f4590q = r1     // Catch:{ all -> 0x00af }
            r8 = 4
            r6.f4592t = r8     // Catch:{ all -> 0x00af }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            r2.m r6 = r6.f4591s
            r6.getClass()
            r2.m.d(r7)
            return
        L_0x0061:
            r6.l(r7, r0, r8)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            return
        L_0x0066:
            r6.f4590q = r1     // Catch:{ all -> 0x00af }
            r2.r r8 = new r2.r     // Catch:{ all -> 0x00af }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>(r9)     // Catch:{ all -> 0x00af }
            java.lang.Class<R> r9 = r6.f4581h     // Catch:{ all -> 0x00af }
            r1.append(r9)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = " but instead got "
            r1.append(r9)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0080
            java.lang.Class r9 = r0.getClass()     // Catch:{ all -> 0x00af }
            goto L_0x0082
        L_0x0080:
            java.lang.String r9 = ""
        L_0x0082:
            r1.append(r9)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = "{"
            r1.append(r9)     // Catch:{ all -> 0x00af }
            r1.append(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = "} inside Resource{"
            r1.append(r9)     // Catch:{ all -> 0x00af }
            r1.append(r7)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = "}."
            r1.append(r9)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009f
            java.lang.String r9 = ""
            goto L_0x00a1
        L_0x009f:
            java.lang.String r9 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a1:
            r1.append(r9)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00af }
            r8.<init>(r9)     // Catch:{ all -> 0x00af }
            r6.k(r8, r3)     // Catch:{ all -> 0x00af }
            goto L_0x0057
        L_0x00af:
            r8 = move-exception
            r1 = r7
            goto L_0x00b4
        L_0x00b2:
            r7 = move-exception
            r8 = r7
        L_0x00b4:
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            throw r8     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r7 = move-exception
            if (r1 == 0) goto L_0x00c1
            r2.m r6 = r6.f4591s
            r6.getClass()
            r2.m.d(r1)
        L_0x00c1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.h.m(r2.v, p2.a, boolean):void");
    }

    public final void n(int i8, int i9) {
        Object obj;
        int i10 = i8;
        int i11 = i9;
        this.f4575a.a();
        Object obj2 = this.f4576b;
        synchronized (obj2) {
            try {
                boolean z8 = B;
                if (z8) {
                    int i12 = k3.f.f5137a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.f4592t == 3) {
                    this.f4592t = 2;
                    float f9 = this.f4582i.f4553g;
                    if (i10 != Integer.MIN_VALUE) {
                        i10 = Math.round(((float) i10) * f9);
                    }
                    this.f4595x = i10;
                    this.y = i11 == Integer.MIN_VALUE ? i11 : Math.round(f9 * ((float) i11));
                    if (z8) {
                        int i13 = k3.f.f5137a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    m mVar = this.f4591s;
                    f fVar = this.f4579f;
                    Object obj3 = this.f4580g;
                    a<?> aVar = this.f4582i;
                    Object obj4 = obj2;
                    try {
                        obj = obj4;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        this.r = mVar.b(fVar, obj3, aVar.f4563q, this.f4595x, this.y, aVar.f4568x, this.f4581h, this.f4585l, aVar.f4554h, aVar.w, aVar.r, aVar.D, aVar.f4567v, aVar.f4560n, aVar.B, aVar.E, aVar.C, this, this.f4589p);
                        if (this.f4592t != 2) {
                            this.r = null;
                        }
                        if (z8) {
                            int i14 = k3.f.f5137a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }
}
