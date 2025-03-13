package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.health.services.client.R;
import java.util.ArrayList;

public final class c extends androidx.appcompat.view.menu.a {

    /* renamed from: h  reason: collision with root package name */
    public d f651h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f652i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f653j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f654k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f655l;

    /* renamed from: m  reason: collision with root package name */
    public int f656m;

    /* renamed from: n  reason: collision with root package name */
    public int f657n;

    /* renamed from: o  reason: collision with root package name */
    public int f658o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f659p;

    /* renamed from: q  reason: collision with root package name */
    public final SparseBooleanArray f660q = new SparseBooleanArray();
    public e r;

    /* renamed from: s  reason: collision with root package name */
    public a f661s;

    /* renamed from: t  reason: collision with root package name */
    public C0009c f662t;

    /* renamed from: u  reason: collision with root package name */
    public b f663u;

    /* renamed from: v  reason: collision with root package name */
    public final f f664v = new f();

    public class a extends androidx.appcompat.view.menu.f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, j jVar, View view) {
            super(context, jVar, view, false);
            boolean z8 = false;
            if (!((jVar.f473x.f438x & 32) == 32 ? true : z8)) {
                View view2 = c.this.f651h;
                this.f445f = view2 == null ? (View) c.this.f361g : view2;
            }
            f fVar = c.this.f664v;
            this.f448i = fVar;
            k.d dVar = this.f449j;
            if (dVar != null) {
                dVar.j(fVar);
            }
        }

        public final void c() {
            c.this.f661s = null;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0009c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final e f667f;

        public C0009c(e eVar) {
            this.f667f = eVar;
        }

        public final void run() {
            d.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.d dVar = cVar.f358c;
            if (!(dVar == null || (aVar = dVar.e) == null)) {
                aVar.b(dVar);
            }
            View view = (View) cVar.f361g;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar = this.f667f;
                boolean z8 = true;
                if (!eVar.b()) {
                    if (eVar.f445f == null) {
                        z8 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z8) {
                    cVar.r = eVar;
                }
            }
            cVar.f662t = null;
        }
    }

    public class d extends m implements ActionMenuView.a {

        public class a extends z {
            public a(View view) {
                super(view);
            }

            public final k.f b() {
                e eVar = c.this.r;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                c.this.l();
                return true;
            }

            public final boolean d() {
                c cVar = c.this;
                if (cVar.f662t != null) {
                    return false;
                }
                cVar.f();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setTooltipText(getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean c() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.l();
            return true;
        }

        public final boolean setFrame(int i8, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i8, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                d0.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view) {
            super(context, dVar, view, true);
            this.f446g = 8388613;
            f fVar = c.this.f664v;
            this.f448i = fVar;
            k.d dVar2 = this.f449j;
            if (dVar2 != null) {
                dVar2.j(fVar);
            }
        }

        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.d dVar = cVar.f358c;
            if (dVar != null) {
                dVar.c(true);
            }
            cVar.r = null;
            super.c();
        }
    }

    public class f implements g.a {
        public f() {
        }

        public final void a(androidx.appcompat.view.menu.d dVar, boolean z8) {
            if (dVar instanceof j) {
                dVar.j().c(false);
            }
            g.a aVar = c.this.e;
            if (aVar != null) {
                aVar.a(dVar, z8);
            }
        }

        public final boolean b(androidx.appcompat.view.menu.d dVar) {
            c cVar = c.this;
            if (dVar == cVar.f358c) {
                return false;
            }
            ((j) dVar).f473x.getClass();
            cVar.getClass();
            g.a aVar = cVar.e;
            if (aVar != null) {
                return aVar.b(dVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context);
    }

    public final void a(androidx.appcompat.view.menu.d dVar, boolean z8) {
        f();
        a aVar = this.f661s;
        if (aVar != null && aVar.b()) {
            aVar.f449j.dismiss();
        }
        g.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.a(dVar, z8);
        }
    }

    public final View c(androidx.appcompat.view.menu.e eVar, View view, ViewGroup viewGroup) {
        h.a aVar;
        View actionView = eVar.getActionView();
        int i8 = 0;
        if (actionView == null || eVar.e()) {
            if (view instanceof h.a) {
                aVar = (h.a) view;
            } else {
                aVar = (h.a) this.f359d.inflate(this.f360f, viewGroup, false);
            }
            aVar.b(eVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f361g);
            if (this.f663u == null) {
                this.f663u = new b();
            }
            actionMenuItemView.setPopupCallback(this.f663u);
            actionView = (View) aVar;
        }
        if (eVar.C) {
            i8 = 8;
        }
        actionView.setVisibility(i8);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return actionView;
    }

    public final void d(Context context, androidx.appcompat.view.menu.d dVar) {
        this.f357b = context;
        LayoutInflater.from(context);
        this.f358c = dVar;
        Resources resources = context.getResources();
        if (!this.f655l) {
            this.f654k = true;
        }
        int i8 = 2;
        this.f656m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600 || ((i9 > 960 && i10 > 720) || (i9 > 720 && i10 > 960))) {
            i8 = 5;
        } else if (i9 >= 500 || ((i9 > 640 && i10 > 480) || (i9 > 480 && i10 > 640))) {
            i8 = 4;
        } else if (i9 >= 360) {
            i8 = 3;
        }
        this.f658o = i8;
        int i11 = this.f656m;
        if (this.f654k) {
            if (this.f651h == null) {
                d dVar2 = new d(this.f356a);
                this.f651h = dVar2;
                if (this.f653j) {
                    dVar2.setImageDrawable(this.f652i);
                    this.f652i = null;
                    this.f653j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f651h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f651h.getMeasuredWidth();
        } else {
            this.f651h = null;
        }
        this.f657n = i11;
        float f9 = resources.getDisplayMetrics().density;
    }

    public final void e() {
        h hVar;
        int i8;
        boolean z8;
        ViewGroup viewGroup = (ViewGroup) this.f361g;
        ArrayList<androidx.appcompat.view.menu.e> arrayList = null;
        boolean z9 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.d dVar = this.f358c;
            if (dVar != null) {
                dVar.i();
                ArrayList<androidx.appcompat.view.menu.e> k8 = this.f358c.k();
                int size = k8.size();
                i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    androidx.appcompat.view.menu.e eVar = k8.get(i9);
                    if ((eVar.f438x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i8);
                        androidx.appcompat.view.menu.e itemData = childAt instanceof h.a ? ((h.a) childAt).getItemData() : null;
                        View c9 = c(eVar, childAt, viewGroup);
                        if (eVar != itemData) {
                            c9.setPressed(false);
                            c9.jumpDrawablesToCurrentState();
                        }
                        if (c9 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) c9.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(c9);
                            }
                            ((ViewGroup) this.f361g).addView(c9, i8);
                        }
                        i8++;
                    }
                }
            } else {
                i8 = 0;
            }
            while (i8 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i8) == this.f651h) {
                    z8 = false;
                } else {
                    viewGroup.removeViewAt(i8);
                    z8 = true;
                }
                if (!z8) {
                    i8++;
                }
            }
        }
        ((View) this.f361g).requestLayout();
        androidx.appcompat.view.menu.d dVar2 = this.f358c;
        if (dVar2 != null) {
            dVar2.i();
            ArrayList<androidx.appcompat.view.menu.e> arrayList2 = dVar2.f406i;
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                j0.b bVar = arrayList2.get(i10).A;
            }
        }
        androidx.appcompat.view.menu.d dVar3 = this.f358c;
        if (dVar3 != null) {
            dVar3.i();
            arrayList = dVar3.f407j;
        }
        if (this.f654k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z9 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z9 = true;
            }
        }
        d dVar4 = this.f651h;
        if (z9) {
            if (dVar4 == null) {
                this.f651h = new d(this.f356a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f651h.getParent();
            if (viewGroup3 != this.f361g) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f651h);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f361g;
                d dVar5 = this.f651h;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                cVar.gravity = 16;
                cVar.f524a = true;
                actionMenuView.addView(dVar5, cVar);
            }
        } else if (dVar4 != null && dVar4.getParent() == (hVar = this.f361g)) {
            ((ViewGroup) hVar).removeView(this.f651h);
        }
        ((ActionMenuView) this.f361g).setOverflowReserved(this.f654k);
    }

    public final boolean f() {
        h hVar;
        C0009c cVar = this.f662t;
        if (cVar == null || (hVar = this.f361g) == null) {
            e eVar = this.r;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f449j.dismiss();
            }
            return true;
        }
        ((View) hVar).removeCallbacks(cVar);
        this.f662t = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(androidx.appcompat.view.menu.j r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.d r2 = r0.w
            androidx.appcompat.view.menu.d r3 = r8.f358c
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.j r0 = (androidx.appcompat.view.menu.j) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.h r2 = r8.f361g
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x001f:
            if (r4 >= r3) goto L_0x0038
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.h.a
            if (r6 == 0) goto L_0x0035
            r6 = r5
            androidx.appcompat.view.menu.h$a r6 = (androidx.appcompat.view.menu.h.a) r6
            androidx.appcompat.view.menu.e r6 = r6.getItemData()
            androidx.appcompat.view.menu.e r7 = r0.f473x
            if (r6 != r7) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r1
        L_0x003c:
            androidx.appcompat.view.menu.e r0 = r9.f473x
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L_0x0046:
            r3 = 1
            if (r2 >= r0) goto L_0x005e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x005b
            r0 = r3
            goto L_0x005f
        L_0x005b:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005e:
            r0 = r1
        L_0x005f:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f357b
            r2.<init>(r4, r9, r5)
            r8.f661s = r2
            r2.f447h = r0
            k.d r2 = r2.f449j
            if (r2 == 0) goto L_0x0071
            r2.o(r0)
        L_0x0071:
            androidx.appcompat.widget.c$a r0 = r8.f661s
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007b
        L_0x0079:
            r1 = r3
            goto L_0x0084
        L_0x007b:
            android.view.View r2 = r0.f445f
            if (r2 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r0.d(r1, r1, r1, r1)
            goto L_0x0079
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            androidx.appcompat.view.menu.g$a r8 = r8.e
            if (r8 == 0) goto L_0x008d
            r8.b(r9)
        L_0x008d:
            return r3
        L_0x008e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.g(androidx.appcompat.view.menu.j):boolean");
    }

    public final boolean h() {
        int i8;
        ArrayList<androidx.appcompat.view.menu.e> arrayList;
        int i9;
        boolean z8;
        c cVar = this;
        androidx.appcompat.view.menu.d dVar = cVar.f358c;
        if (dVar != null) {
            arrayList = dVar.k();
            i8 = arrayList.size();
        } else {
            i8 = 0;
            arrayList = null;
        }
        int i10 = cVar.f658o;
        int i11 = cVar.f657n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f361g;
        int i12 = 0;
        boolean z9 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i9 = 2;
            z8 = true;
            if (i12 >= i8) {
                break;
            }
            androidx.appcompat.view.menu.e eVar = arrayList.get(i12);
            int i15 = eVar.y;
            if ((i15 & 2) == 2) {
                i13++;
            } else {
                if ((i15 & 1) == 1) {
                    i14++;
                } else {
                    z9 = true;
                }
            }
            if (cVar.f659p && eVar.C) {
                i10 = 0;
            }
            i12++;
        }
        if (cVar.f654k && (z9 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.f660q;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < i8) {
            androidx.appcompat.view.menu.e eVar2 = arrayList.get(i17);
            int i19 = eVar2.y;
            boolean z10 = (i19 & 2) == i9 ? z8 : false;
            int i20 = eVar2.f419b;
            if (z10) {
                View c9 = cVar.c(eVar2, (View) null, viewGroup);
                c9.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c9.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z8);
                }
                eVar2.f(z8);
            } else {
                if ((i19 & true) == z8 ? z8 : false) {
                    boolean z11 = sparseBooleanArray.get(i20);
                    boolean z12 = ((i16 > 0 || z11) && i11 > 0) ? z8 : false;
                    if (z12) {
                        View c10 = cVar.c(eVar2, (View) null, viewGroup);
                        c10.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = c10.getMeasuredWidth();
                        i11 -= measuredWidth2;
                        if (i18 == 0) {
                            i18 = measuredWidth2;
                        }
                        z12 &= i11 + i18 > 0;
                    }
                    if (z12 && i20 != 0) {
                        sparseBooleanArray.put(i20, true);
                    } else if (z11) {
                        sparseBooleanArray.put(i20, false);
                        int i21 = 0;
                        while (i21 < i17) {
                            androidx.appcompat.view.menu.e eVar3 = arrayList.get(i21);
                            if (eVar3.f419b == i20) {
                                if ((eVar3.f438x & 32) == 32) {
                                    i16++;
                                }
                                eVar3.f(false);
                            }
                            i21++;
                        }
                    }
                    if (z12) {
                        i16--;
                    }
                    eVar2.f(z12);
                } else {
                    eVar2.f(false);
                    i17++;
                    i9 = 2;
                    cVar = this;
                    z8 = true;
                }
            }
            i17++;
            i9 = 2;
            cVar = this;
            z8 = true;
        }
        return z8;
    }

    public final boolean i() {
        e eVar = this.r;
        return eVar != null && eVar.b();
    }

    public final boolean l() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f654k || i() || (dVar = this.f358c) == null || this.f361g == null || this.f662t != null) {
            return false;
        }
        dVar.i();
        if (dVar.f407j.isEmpty()) {
            return false;
        }
        C0009c cVar = new C0009c(new e(this.f357b, this.f358c, this.f651h));
        this.f662t = cVar;
        ((View) this.f361g).post(cVar);
        return true;
    }
}
