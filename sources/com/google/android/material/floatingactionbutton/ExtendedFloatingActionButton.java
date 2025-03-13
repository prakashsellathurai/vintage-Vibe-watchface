package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import f4.g;
import j0.x;
import java.util.ArrayList;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int r = 0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3306a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3307b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3308c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3307b = false;
            this.f3308c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.Q);
            this.f3307b = obtainStyledAttributes.getBoolean(0, false);
            this.f3308c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public final /* bridge */ /* synthetic */ boolean a(View view) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1029h == 0) {
                fVar.f1029h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1023a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList j8 = coordinatorLayout.j(extendedFloatingActionButton);
            int size = j8.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view2 = (View) j8.get(i9);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1023a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i8);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!((this.f3307b || this.f3308c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).f1027f == appBarLayout.getId())) {
                return false;
            }
            if (this.f3306a == null) {
                this.f3306a = new Rect();
            }
            Rect rect = this.f3306a;
            u4.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i8 = ExtendedFloatingActionButton.r;
                throw null;
            }
            int i9 = ExtendedFloatingActionButton.r;
            throw null;
        }

        public final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!((this.f3307b || this.f3308c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).f1027f == view.getId())) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                int i8 = ExtendedFloatingActionButton.r;
                throw null;
            }
            int i9 = ExtendedFloatingActionButton.r;
            throw null;
        }
    }

    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            int[] iArr = x.f4957a;
            return Float.valueOf((float) x.d.f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            int[] iArr = x.f4957a;
            x.d.k(view, intValue, paddingTop, x.d.e(view), view.getPaddingBottom());
        }
    }

    public static class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            int[] iArr = x.f4957a;
            return Float.valueOf((float) x.d.e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int[] iArr = x.f4957a;
            x.d.k(view, x.d.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z8) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i8) {
        setExtendMotionSpec(g.a(getContext(), i8));
    }

    public void setExtended(boolean z8) {
        if (z8) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(g.a(getContext(), i8));
    }

    public final void setPadding(int i8, int i9, int i10, int i11) {
        super.setPadding(i8, i9, i10, i11);
    }

    public final void setPaddingRelative(int i8, int i9, int i10, int i11) {
        super.setPaddingRelative(i8, i9, i10, i11);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(g.a(getContext(), i8));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i8) {
        setShrinkMotionSpec(g.a(getContext(), i8));
    }

    public void setTextColor(int i8) {
        super.setTextColor(i8);
        getTextColors();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
