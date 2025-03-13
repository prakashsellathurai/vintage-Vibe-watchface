package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import androidx.health.services.client.R;
import j0.x;
import k.d;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f441a;

    /* renamed from: b  reason: collision with root package name */
    public final d f442b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f443c;

    /* renamed from: d  reason: collision with root package name */
    public final int f444d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public View f445f;

    /* renamed from: g  reason: collision with root package name */
    public int f446g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f447h;

    /* renamed from: i  reason: collision with root package name */
    public g.a f448i;

    /* renamed from: j  reason: collision with root package name */
    public d f449j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f450k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f451l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            f.this.c();
        }
    }

    public f(int i8, int i9, Context context, View view, d dVar, boolean z8) {
        this.f446g = 8388611;
        this.f451l = new a();
        this.f441a = context;
        this.f442b = dVar;
        this.f445f = view;
        this.f443c = z8;
        this.f444d = i8;
        this.e = i9;
    }

    public f(Context context, d dVar, View view, boolean z8) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, dVar, z8);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [k.d, androidx.appcompat.view.menu.g] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.i] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k.d a() {
        /*
            r14 = this;
            k.d r0 = r14.f449j
            if (r0 != 0) goto L_0x0077
            android.content.Context r0 = r14.f441a
            java.lang.String r1 = "window"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r1.getRealSize(r2)
            int r1 = r2.x
            int r2 = r2.y
            int r1 = java.lang.Math.min(r1, r2)
            android.content.res.Resources r0 = r0.getResources()
            r2 = -2147024874(0xffffffff80070016, float:-6.4288E-40)
            int r0 = r0.getDimensionPixelSize(r2)
            if (r1 < r0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0045
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f441a
            android.view.View r3 = r14.f445f
            int r4 = r14.f444d
            int r5 = r14.e
            boolean r6 = r14.f443c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0057
        L_0x0045:
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r10 = r14.f441a
            androidx.appcompat.view.menu.d r12 = r14.f442b
            android.view.View r11 = r14.f445f
            int r8 = r14.f444d
            int r9 = r14.e
            boolean r13 = r14.f443c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0057:
            androidx.appcompat.view.menu.d r1 = r14.f442b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f451l
            r0.r(r1)
            android.view.View r1 = r14.f445f
            r0.n(r1)
            androidx.appcompat.view.menu.g$a r1 = r14.f448i
            r0.j(r1)
            boolean r1 = r14.f447h
            r0.o(r1)
            int r1 = r14.f446g
            r0.p(r1)
            r14.f449j = r0
        L_0x0077:
            k.d r14 = r14.f449j
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.a():k.d");
    }

    public final boolean b() {
        d dVar = this.f449j;
        return dVar != null && dVar.i();
    }

    public void c() {
        this.f449j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f450k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i8, int i9, boolean z8, boolean z9) {
        d a9 = a();
        a9.s(z9);
        if (z8) {
            int i10 = this.f446g;
            View view = this.f445f;
            int[] iArr = x.f4957a;
            if ((Gravity.getAbsoluteGravity(i10, x.d.d(view)) & 7) == 5) {
                i8 -= this.f445f.getWidth();
            }
            a9.q(i8);
            a9.t(i9);
            int i11 = (int) ((this.f441a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f5080a = new Rect(i8 - i11, i9 - i11, i8 + i11, i9 + i11);
        }
        a9.c();
    }
}
