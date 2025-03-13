package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p.d;
import p.e;
import p.g;

public final class f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f714f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static f0 f715g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f716h = new a();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, g<ColorStateList>> f717a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, d<WeakReference<Drawable.ConstantState>>> f718b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f719c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f720d;
    public b e;

    public static class a extends e<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    public interface b {
    }

    public static synchronized f0 c() {
        f0 f0Var;
        synchronized (f0.class) {
            if (f715g == null) {
                f715g = new f0();
            }
            f0Var = f715g;
        }
        return f0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (f0.class) {
            a aVar = f716h;
            aVar.getClass();
            int i9 = (i8 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.a(Integer.valueOf(mode.hashCode() + i9));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i8, mode);
                aVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.b(Integer.valueOf(i9 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j8, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            d dVar = this.f718b.get(context);
            if (dVar == null) {
                dVar = new d();
                this.f718b.put(context, dVar);
            }
            dVar.f(j8, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable b(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.util.TypedValue r0 = r7.f719c
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.f719c = r0
        L_0x000b:
            android.util.TypedValue r0 = r7.f719c
            android.content.res.Resources r1 = r8.getResources()
            r2 = 1
            r1.getValue(r9, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r7.d(r8, r3)
            if (r1 == 0) goto L_0x0026
            return r1
        L_0x0026:
            androidx.appcompat.widget.f0$b r1 = r7.e
            if (r1 != 0) goto L_0x002b
            goto L_0x006b
        L_0x002b:
            r1 = -2146959280(0xffffffff80080050, float:-7.34796E-40)
            if (r9 != r1) goto L_0x004c
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r1 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r5 = -2146959281(0xffffffff8008004f, float:-7.34795E-40)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r6 = 0
            r1[r6] = r5
            r5 = -2146959279(0xffffffff80080051, float:-7.34797E-40)
            android.graphics.drawable.Drawable r5 = r7.e(r8, r5)
            r1[r2] = r5
            r9.<init>(r1)
            goto L_0x006c
        L_0x004c:
            r1 = -2146959245(0xffffffff80080073, float:-7.34845E-40)
            if (r9 != r1) goto L_0x0055
            r9 = -2147024837(0xffffffff8007003b, float:-6.42931E-40)
            goto L_0x0066
        L_0x0055:
            r1 = -2146959246(0xffffffff80080072, float:-7.34844E-40)
            if (r9 != r1) goto L_0x005e
            r9 = -2147024836(0xffffffff8007003c, float:-6.42933E-40)
            goto L_0x0066
        L_0x005e:
            r1 = -2146959244(0xffffffff80080074, float:-7.34847E-40)
            if (r9 != r1) goto L_0x006b
            r9 = -2147024835(0xffffffff8007003d, float:-6.42934E-40)
        L_0x0066:
            android.graphics.drawable.LayerDrawable r9 = androidx.appcompat.widget.i.a.c(r7, r8, r9)
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x0076
            int r0 = r0.changingConfigurations
            r9.setChangingConfigurations(r0)
            r7.a(r8, r3, r9)
        L_0x0076:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f718b     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            p.d r0 = (p.d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.d(r5, r1)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.g(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(Context context, int i8) {
        return f(context, i8, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f720d     // Catch:{ all -> 0x0062 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002d
        L_0x0008:
            r11.f720d = r2     // Catch:{ all -> 0x0062 }
            r0 = -2146959218(0xffffffff8008008e, float:-7.34883E-40)
            android.graphics.drawable.Drawable r0 = r11.e(r12, r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x00eb
            boolean r3 = r0 instanceof f1.b     // Catch:{ all -> 0x0062 }
            if (r3 != 0) goto L_0x002a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00eb
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r11.b(r12, r13)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = a0.a.f10a     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r0 = a0.a.b.b(r12, r13)     // Catch:{ all -> 0x0062 }
        L_0x0039:
            if (r0 == 0) goto L_0x00e5
            android.content.res.ColorStateList r3 = r11.h(r12, r13)     // Catch:{ all -> 0x0062 }
            r4 = 0
            if (r3 == 0) goto L_0x0065
            boolean r12 = androidx.appcompat.widget.w.a(r0)     // Catch:{ all -> 0x0062 }
            if (r12 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch:{ all -> 0x0062 }
        L_0x004c:
            d0.b.h(r0, r3)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.f0$b r12 = r11.e     // Catch:{ all -> 0x0062 }
            if (r12 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r12 = -2146959231(0xffffffff80080081, float:-7.34865E-40)
            if (r13 != r12) goto L_0x005b
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0062 }
        L_0x005b:
            if (r4 == 0) goto L_0x00e5
            d0.b.i(r0, r4)     // Catch:{ all -> 0x0062 }
            goto L_0x00e5
        L_0x0062:
            r12 = move-exception
            goto L_0x00f5
        L_0x0065:
            androidx.appcompat.widget.f0$b r3 = r11.e     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x00dc
            r3 = -2146959236(0xffffffff8008007c, float:-7.34858E-40)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            r7 = 16908288(0x1020000, float:2.387723E-38)
            r8 = -2147221282(0xffffffff800400de, float:-3.67653E-40)
            r9 = -2147221280(0xffffffff800400e0, float:-3.67656E-40)
            if (r13 != r3) goto L_0x00a3
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0062 }
            int r7 = androidx.appcompat.widget.k0.c(r12, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.i.f736b     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r3, r7, r10)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0062 }
            int r6 = androidx.appcompat.widget.k0.c(r12, r9)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r3, r6, r10)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x0062 }
            int r3 = androidx.appcompat.widget.k0.c(r12, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r1, r3, r10)     // Catch:{ all -> 0x0062 }
            goto L_0x00d8
        L_0x00a3:
            r3 = -2146959245(0xffffffff80080073, float:-7.34845E-40)
            if (r13 == r3) goto L_0x00b2
            r3 = -2146959246(0xffffffff80080072, float:-7.34844E-40)
            if (r13 == r3) goto L_0x00b2
            r3 = -2146959244(0xffffffff80080074, float:-7.34847E-40)
            if (r13 != r3) goto L_0x00d9
        L_0x00b2:
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0062 }
            int r7 = androidx.appcompat.widget.k0.b(r12, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.i.f736b     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r3, r7, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0062 }
            int r6 = androidx.appcompat.widget.k0.c(r12, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r3, r6, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x0062 }
            int r3 = androidx.appcompat.widget.k0.c(r12, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.i.a.e(r1, r3, r9)     // Catch:{ all -> 0x0062 }
        L_0x00d8:
            r1 = r2
        L_0x00d9:
            if (r1 == 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            boolean r12 = r11.i(r12, r13, r0)     // Catch:{ all -> 0x0062 }
            if (r12 != 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00e5
            r0 = r4
        L_0x00e5:
            if (r0 == 0) goto L_0x00e9
            android.graphics.Rect r12 = androidx.appcompat.widget.w.f833a     // Catch:{ all -> 0x0062 }
        L_0x00e9:
            monitor-exit(r11)
            return r0
        L_0x00eb:
            r11.f720d = r1     // Catch:{ all -> 0x0062 }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x0062 }
            throw r12     // Catch:{ all -> 0x0062 }
        L_0x00f5:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, p.g<android.content.res.ColorStateList>> r0 = r3.f717a     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            p.g r0 = (p.g) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.c(r5, r1)     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r4 = move-exception
            goto L_0x004c
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004a
            androidx.appcompat.widget.f0$b r0 = r3.e     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            androidx.appcompat.widget.i$a r0 = (androidx.appcompat.widget.i.a) r0     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0015 }
        L_0x0025:
            if (r1 == 0) goto L_0x0049
            java.util.WeakHashMap<android.content.Context, p.g<android.content.res.ColorStateList>> r0 = r3.f717a     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            r3.f717a = r0     // Catch:{ all -> 0x0015 }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, p.g<android.content.res.ColorStateList>> r0 = r3.f717a     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            p.g r0 = (p.g) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0046
            p.g r0 = new p.g     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            java.util.WeakHashMap<android.content.Context, p.g<android.content.res.ColorStateList>> r2 = r3.f717a     // Catch:{ all -> 0x0015 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0015 }
        L_0x0046:
            r0.a(r5, r1)     // Catch:{ all -> 0x0015 }
        L_0x0049:
            r0 = r1
        L_0x004a:
            monitor-exit(r3)
            return r0
        L_0x004c:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            r5 = this;
            androidx.appcompat.widget.f0$b r5 = r5.e
            r0 = 0
            if (r5 == 0) goto L_0x0074
            androidx.appcompat.widget.i$a r5 = (androidx.appcompat.widget.i.a) r5
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.i.f736b
            int[] r2 = r5.f739a
            boolean r2 = androidx.appcompat.widget.i.a.a(r2, r7)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L_0x0017
            r5 = -2147221280(0xffffffff800400e0, float:-3.67656E-40)
            goto L_0x004a
        L_0x0017:
            int[] r2 = r5.f741c
            boolean r2 = androidx.appcompat.widget.i.a.a(r2, r7)
            if (r2 == 0) goto L_0x0023
            r5 = -2147221282(0xffffffff800400de, float:-3.67653E-40)
            goto L_0x004a
        L_0x0023:
            int[] r5 = r5.f742d
            boolean r5 = androidx.appcompat.widget.i.a.a(r5, r7)
            if (r5 == 0) goto L_0x002e
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0047
        L_0x002e:
            r5 = -2146959259(0xffffffff80080065, float:-7.34826E-40)
            if (r7 != r5) goto L_0x0042
            r5 = 1109603123(0x42233333, float:40.8)
            int r5 = java.lang.Math.round(r5)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r1
            r1 = r7
            r7 = r5
            r5 = r3
            goto L_0x0052
        L_0x0042:
            r5 = -2146959277(0xffffffff80080053, float:-7.348E-40)
            if (r7 != r5) goto L_0x004d
        L_0x0047:
            r5 = 16842801(0x1010031, float:2.3693695E-38)
        L_0x004a:
            r7 = r5
            r5 = r3
            goto L_0x004f
        L_0x004d:
            r5 = r0
            r7 = r5
        L_0x004f:
            r2 = r1
            r1 = r7
            r7 = r4
        L_0x0052:
            if (r5 == 0) goto L_0x0070
            boolean r5 = androidx.appcompat.widget.w.a(r8)
            if (r5 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x005e:
            int r5 = androidx.appcompat.widget.k0.c(r6, r1)
            android.graphics.PorterDuffColorFilter r5 = androidx.appcompat.widget.i.c(r5, r2)
            r8.setColorFilter(r5)
            if (r7 == r4) goto L_0x006e
            r8.setAlpha(r7)
        L_0x006e:
            r5 = r3
            goto L_0x0071
        L_0x0070:
            r5 = r0
        L_0x0071:
            if (r5 == 0) goto L_0x0074
            r0 = r3
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
