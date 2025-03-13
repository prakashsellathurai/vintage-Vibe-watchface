package j0;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j0.x;
import java.lang.reflect.Field;
import java.util.Objects;

public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f4932b = i.f4943h;

    /* renamed from: a  reason: collision with root package name */
    public final j f4933a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f4934a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f4935b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f4936c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f4937d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4934a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4935b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4936c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsets.Builder f4938a;

        public b() {
            this.f4938a = new WindowInsets.Builder();
        }

        public b(d0 d0Var) {
            super(d0Var);
            WindowInsets.Builder builder;
            WindowInsets f9 = d0Var.f();
            if (f9 == null) {
                builder = new WindowInsets.Builder();
            }
            this.f4938a = builder;
        }

        public d0 b() {
            a();
            d0 g9 = d0.g(this.f4938a.build(), (View) null);
            g9.f4933a.l((c0.b[]) null);
            return g9;
        }

        public void c(c0.b bVar) {
            this.f4938a.setStableInsets(bVar.c());
        }

        public void d(c0.b bVar) {
            this.f4938a.setSystemWindowInsets(bVar.c());
        }
    }

    public static class c extends b {
        public c() {
        }

        public c(d0 d0Var) {
            super(d0Var);
        }
    }

    public static class d {
        public d() {
            this(new d0());
        }

        public d(d0 d0Var) {
        }

        public final void a() {
        }

        public d0 b() {
            throw null;
        }

        public void c(c0.b bVar) {
            throw null;
        }

        public void d(c0.b bVar) {
            throw null;
        }
    }

    public static class e extends j {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f4939c;

        /* renamed from: d  reason: collision with root package name */
        public c0.b f4940d = null;
        public c0.b e;

        public e(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f4939c = windowInsets;
        }

        private c0.b n(View view) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void d(View view) {
            c0.b n8 = n(view);
            if (n8 == null) {
                n8 = c0.b.e;
            }
            o(n8);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.e, ((e) obj).e);
        }

        public final c0.b h() {
            if (this.f4940d == null) {
                WindowInsets windowInsets = this.f4939c;
                this.f4940d = c0.b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f4940d;
        }

        public d0 i(int i8, int i9, int i10, int i11) {
            c cVar = new c(d0.g(this.f4939c, (View) null));
            cVar.d(d0.e(h(), i8, i9, i10, i11));
            cVar.c(d0.e(g(), i8, i9, i10, i11));
            return cVar.b();
        }

        public boolean k() {
            return this.f4939c.isRound();
        }

        public void l(c0.b[] bVarArr) {
        }

        public void m(d0 d0Var) {
        }

        public void o(c0.b bVar) {
            this.e = bVar;
        }
    }

    public static class f extends e {

        /* renamed from: f  reason: collision with root package name */
        public c0.b f4941f = null;

        public f(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public d0 b() {
            return d0.g(this.f4939c.consumeStableInsets(), (View) null);
        }

        public d0 c() {
            return d0.g(this.f4939c.consumeSystemWindowInsets(), (View) null);
        }

        public final c0.b g() {
            if (this.f4941f == null) {
                WindowInsets windowInsets = this.f4939c;
                this.f4941f = c0.b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f4941f;
        }

        public boolean j() {
            return this.f4939c.isConsumed();
        }
    }

    public static class g extends f {
        public g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public d0 a() {
            return d0.g(this.f4939c.consumeDisplayCutout(), (View) null);
        }

        public e e() {
            DisplayCutout displayCutout = this.f4939c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new e(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f4939c, gVar.f4939c) && Objects.equals(this.e, gVar.e);
        }

        public int hashCode() {
            return this.f4939c.hashCode();
        }
    }

    public static class h extends g {

        /* renamed from: g  reason: collision with root package name */
        public c0.b f4942g = null;

        public h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public c0.b f() {
            if (this.f4942g == null) {
                this.f4942g = c0.b.b(this.f4939c.getMandatorySystemGestureInsets());
            }
            return this.f4942g;
        }

        public d0 i(int i8, int i9, int i10, int i11) {
            return d0.g(this.f4939c.inset(i8, i9, i10, i11), (View) null);
        }
    }

    public static class i extends h {

        /* renamed from: h  reason: collision with root package name */
        public static final d0 f4943h = d0.g(WindowInsets.CONSUMED, (View) null);

        public i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        public final void d(View view) {
        }
    }

    public static class j {

        /* renamed from: b  reason: collision with root package name */
        public static final d0 f4944b = new c().b().f4933a.a().f4933a.b().f4933a.c();

        /* renamed from: a  reason: collision with root package name */
        public final d0 f4945a;

        public j(d0 d0Var) {
            this.f4945a = d0Var;
        }

        public d0 a() {
            return this.f4945a;
        }

        public d0 b() {
            return this.f4945a;
        }

        public d0 c() {
            return this.f4945a;
        }

        public void d(View view) {
        }

        public e e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return k() == jVar.k() && j() == jVar.j() && i0.b.a(h(), jVar.h()) && i0.b.a(g(), jVar.g()) && i0.b.a(e(), jVar.e());
        }

        public c0.b f() {
            return h();
        }

        public c0.b g() {
            return c0.b.e;
        }

        public c0.b h() {
            return c0.b.e;
        }

        public int hashCode() {
            return i0.b.b(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e());
        }

        public d0 i(int i8, int i9, int i10, int i11) {
            return f4944b;
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public void l(c0.b[] bVarArr) {
        }

        public void m(d0 d0Var) {
        }
    }

    public d0() {
        this.f4933a = new j(this);
    }

    public d0(WindowInsets windowInsets) {
        this.f4933a = new i(this, windowInsets);
    }

    public static c0.b e(c0.b bVar, int i8, int i9, int i10, int i11) {
        int max = Math.max(0, bVar.f2634a - i8);
        int max2 = Math.max(0, bVar.f2635b - i9);
        int max3 = Math.max(0, bVar.f2636c - i10);
        int max4 = Math.max(0, bVar.f2637d - i11);
        return (max == i8 && max2 == i9 && max3 == i10 && max4 == i11) ? bVar : c0.b.a(max, max2, max3, max4);
    }

    public static d0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        d0 d0Var = new d0(windowInsets);
        if (view != null) {
            int[] iArr = x.f4957a;
            if (x.f.b(view)) {
                d0 a9 = x.i.a(view);
                j jVar = d0Var.f4933a;
                jVar.m(a9);
                jVar.d(view.getRootView());
            }
        }
        return d0Var;
    }

    @Deprecated
    public final int a() {
        return this.f4933a.h().f2637d;
    }

    @Deprecated
    public final int b() {
        return this.f4933a.h().f2634a;
    }

    @Deprecated
    public final int c() {
        return this.f4933a.h().f2636c;
    }

    @Deprecated
    public final int d() {
        return this.f4933a.h().f2635b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return i0.b.a(this.f4933a, ((d0) obj).f4933a);
    }

    public final WindowInsets f() {
        j jVar = this.f4933a;
        if (jVar instanceof e) {
            return ((e) jVar).f4939c;
        }
        return null;
    }

    public final int hashCode() {
        j jVar = this.f4933a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
