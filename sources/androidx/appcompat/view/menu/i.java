package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.x;
import androidx.health.services.client.R;
import k.d;

public final class i extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f453b;

    /* renamed from: c  reason: collision with root package name */
    public final d f454c;

    /* renamed from: d  reason: collision with root package name */
    public final c f455d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final int f456f;

    /* renamed from: g  reason: collision with root package name */
    public final int f457g;

    /* renamed from: h  reason: collision with root package name */
    public final int f458h;

    /* renamed from: i  reason: collision with root package name */
    public final e0 f459i;

    /* renamed from: j  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f460j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f461k = new b();

    /* renamed from: l  reason: collision with root package name */
    public PopupWindow.OnDismissListener f462l;

    /* renamed from: m  reason: collision with root package name */
    public View f463m;

    /* renamed from: n  reason: collision with root package name */
    public View f464n;

    /* renamed from: o  reason: collision with root package name */
    public g.a f465o;

    /* renamed from: p  reason: collision with root package name */
    public ViewTreeObserver f466p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f467q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public int f468s;

    /* renamed from: t  reason: collision with root package name */
    public int f469t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f470u;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            i iVar = i.this;
            if (iVar.i() && !iVar.f459i.f693x) {
                View view = iVar.f464n;
                if (view == null || !view.isShown()) {
                    iVar.dismiss();
                } else {
                    iVar.f459i.c();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            i iVar = i.this;
            ViewTreeObserver viewTreeObserver = iVar.f466p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    iVar.f466p = view.getViewTreeObserver();
                }
                iVar.f466p.removeGlobalOnLayoutListener(iVar.f460j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public i(int i8, int i9, Context context, View view, d dVar, boolean z8) {
        this.f453b = context;
        this.f454c = dVar;
        this.e = z8;
        this.f455d = new c(dVar, LayoutInflater.from(context), z8, R.layout.abc_popup_menu_item_layout);
        this.f457g = i8;
        this.f458h = i9;
        Resources resources = context.getResources();
        this.f456f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f463m = view;
        this.f459i = new e0(context, i8, i9);
        dVar.b(this, context);
    }

    public final void a(d dVar, boolean z8) {
        if (dVar == this.f454c) {
            dismiss();
            g.a aVar = this.f465o;
            if (aVar != null) {
                aVar.a(dVar, z8);
            }
        }
    }

    public final void c() {
        View view;
        boolean z8 = true;
        if (!i()) {
            if (this.f467q || (view = this.f463m) == null) {
                z8 = false;
            } else {
                this.f464n = view;
                e0 e0Var = this.f459i;
                e0Var.y.setOnDismissListener(this);
                e0Var.f687p = this;
                e0Var.f693x = true;
                PopupWindow popupWindow = e0Var.y;
                popupWindow.setFocusable(true);
                View view2 = this.f464n;
                boolean z9 = this.f466p == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f466p = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f460j);
                }
                view2.addOnAttachStateChangeListener(this.f461k);
                e0Var.f686o = view2;
                e0Var.f683l = this.f469t;
                boolean z10 = this.r;
                Context context = this.f453b;
                c cVar = this.f455d;
                if (!z10) {
                    this.f468s = d.m(cVar, context, this.f456f);
                    this.r = true;
                }
                e0Var.h(this.f468s);
                popupWindow.setInputMethodMode(2);
                Rect rect = this.f5080a;
                e0Var.w = rect != null ? new Rect(rect) : null;
                e0Var.c();
                x xVar = e0Var.f675c;
                xVar.setOnKeyListener(this);
                if (this.f470u) {
                    d dVar = this.f454c;
                    if (dVar.f410m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, xVar, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(dVar.f410m);
                        }
                        frameLayout.setEnabled(false);
                        xVar.addHeaderView(frameLayout, (Object) null, false);
                    }
                }
                e0Var.g(cVar);
                e0Var.c();
            }
        }
        if (!z8) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void dismiss() {
        if (i()) {
            this.f459i.dismiss();
        }
    }

    public final void e() {
        this.r = false;
        c cVar = this.f455d;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    public final ListView f() {
        return this.f459i.f675c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.appcompat.view.menu.j r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.f r0 = new androidx.appcompat.view.menu.f
            android.content.Context r5 = r9.f453b
            android.view.View r6 = r9.f464n
            boolean r8 = r9.e
            int r3 = r9.f457g
            int r4 = r9.f458h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.g$a r2 = r9.f465o
            r0.f448i = r2
            k.d r3 = r0.f449j
            if (r3 == 0) goto L_0x0023
            r3.j(r2)
        L_0x0023:
            boolean r2 = k.d.u(r10)
            r0.f447h = r2
            k.d r3 = r0.f449j
            if (r3 == 0) goto L_0x0030
            r3.o(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f462l
            r0.f450k = r2
            r2 = 0
            r9.f462l = r2
            androidx.appcompat.view.menu.d r2 = r9.f454c
            r2.c(r1)
            androidx.appcompat.widget.e0 r2 = r9.f459i
            int r3 = r2.f677f
            int r2 = r2.e()
            int r4 = r9.f469t
            android.view.View r5 = r9.f463m
            int[] r6 = j0.x.f4957a
            int r5 = j0.x.d.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f463m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f445f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.g$a r9 = r9.f465o
            if (r9 == 0) goto L_0x0079
            r9.b(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.g(androidx.appcompat.view.menu.j):boolean");
    }

    public final boolean h() {
        return false;
    }

    public final boolean i() {
        return !this.f467q && this.f459i.i();
    }

    public final void j(g.a aVar) {
        this.f465o = aVar;
    }

    public final void l(d dVar) {
    }

    public final void n(View view) {
        this.f463m = view;
    }

    public final void o(boolean z8) {
        this.f455d.f395c = z8;
    }

    public final void onDismiss() {
        this.f467q = true;
        this.f454c.c(true);
        ViewTreeObserver viewTreeObserver = this.f466p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f466p = this.f464n.getViewTreeObserver();
            }
            this.f466p.removeGlobalOnLayoutListener(this.f460j);
            this.f466p = null;
        }
        this.f464n.removeOnAttachStateChangeListener(this.f461k);
        PopupWindow.OnDismissListener onDismissListener = this.f462l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i8) {
        this.f469t = i8;
    }

    public final void q(int i8) {
        this.f459i.f677f = i8;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f462l = onDismissListener;
    }

    public final void s(boolean z8) {
        this.f470u = z8;
    }

    public final void t(int i8) {
        this.f459i.j(i8);
    }
}
