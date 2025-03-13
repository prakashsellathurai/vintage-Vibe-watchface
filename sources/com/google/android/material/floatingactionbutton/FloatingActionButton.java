package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.health.services.client.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import f4.g;
import j0.x;
import j4.b;
import java.util.ArrayList;
import java.util.Iterator;
import p.f;
import u4.d;
import u4.o;
import y4.i;
import y4.m;

public final class FloatingActionButton extends o implements s4.a, m, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f3309b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f3310c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f3311d;
    public PorterDuff.Mode e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f3312f;

    /* renamed from: g  reason: collision with root package name */
    public int f3313g;

    /* renamed from: h  reason: collision with root package name */
    public int f3314h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3315i;

    /* renamed from: j  reason: collision with root package name */
    public t4.b f3316j;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3317a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3318b;

        public BaseBehavior() {
            this.f3318b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.R);
            this.f3318b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1029h == 0) {
                fVar.f1029h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1023a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList j8 = coordinatorLayout.j(floatingActionButton);
            int size = j8.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view2 = (View) j8.get(i9);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1023a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i8);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            return this.f3318b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f1027f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3317a == null) {
                this.f3317a = new Rect();
            }
            Rect rect = this.f3317a;
            d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g((j4.b) null, false);
                return true;
            }
            floatingActionButton.k((b.a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.g((j4.b) null, false);
                return true;
            }
            floatingActionButton.k((b.a) null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    public class b implements x4.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.e {
        public c(FloatingActionButton floatingActionButton) {
        }

        public final void a() {
            throw null;
        }

        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private d getImpl() {
        if (this.f3316j == null) {
            this.f3316j = new t4.b(this, new b());
        }
        return this.f3316j;
    }

    public final boolean a() {
        throw null;
    }

    public final void c() {
        d impl = getImpl();
        if (impl.f3345p == null) {
            impl.f3345p = new ArrayList<>();
        }
        impl.f3345p.add((Object) null);
    }

    public final void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f3344o == null) {
            impl.f3344o = new ArrayList<>();
        }
        impl.f3344o.add(animatorListener);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().g(getDrawableState());
    }

    public final void e() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f3346q == null) {
            impl.f3346q = new ArrayList<>();
        }
        impl.f3346q.add(cVar);
    }

    public final int f(int i8) {
        int i9 = this.f3314h;
        if (i9 != 0) {
            return i9;
        }
        Resources resources = getResources();
        if (i8 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
        }
        return resources.getDimensionPixelSize(i8 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public final void g(j4.b bVar, boolean z8) {
        d impl = getImpl();
        a aVar = bVar == null ? null : new a(this, bVar);
        int visibility = impl.r.getVisibility();
        int i8 = impl.f3343n;
        boolean z9 = true;
        if (!(visibility != 0 ? i8 != 2 : i8 == 1)) {
            Animator animator = impl.f3338i;
            if (animator != null) {
                animator.cancel();
            }
            int[] iArr = x.f4957a;
            FloatingActionButton floatingActionButton = impl.r;
            if (!x.f.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z9 = false;
            }
            if (z9) {
                g gVar = impl.f3340k;
                if (gVar == null) {
                    if (impl.f3337h == null) {
                        impl.f3337h = g.a(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f3337h;
                    gVar.getClass();
                }
                AnimatorSet a9 = impl.a(gVar, 0.0f, 0.0f, 0.0f);
                a9.addListener(new b(impl, z8, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3345p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a9.addListener(it.next());
                    }
                }
                a9.start();
                return;
            }
            floatingActionButton.b(z8 ? 8 : 4, z8);
            if (aVar != null) {
                aVar.f3320a.a(aVar.f3321b);
            }
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f3309b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3310c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3335f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f3314h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f3340k;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3312f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3312f;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f3331a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f3339j;
    }

    public int getSize() {
        return this.f3313g;
    }

    public int getSizeDimension() {
        return f(this.f3313g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3311d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.f3315i;
    }

    public final boolean h() {
        d impl = getImpl();
        int visibility = impl.r.getVisibility();
        int i8 = impl.f3343n;
        if (visibility == 0) {
            if (i8 != 1) {
                return false;
            }
        } else if (i8 == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        d impl = getImpl();
        int visibility = impl.r.getVisibility();
        int i8 = impl.f3343n;
        if (visibility != 0) {
            if (i8 != 2) {
                return false;
            }
        } else if (i8 == 1) {
            return false;
        }
        return true;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f3311d;
            if (colorStateList == null) {
                drawable.clearColorFilter();
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(androidx.appcompat.widget.i.c(colorForState, mode));
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().e();
    }

    public final void k(b.a aVar, boolean z8) {
        d impl = getImpl();
        a aVar2 = aVar == null ? null : new a(this, aVar);
        int visibility = impl.r.getVisibility();
        int i8 = impl.f3343n;
        boolean z9 = true;
        if (!(visibility == 0 ? i8 != 1 : i8 == 2)) {
            Animator animator = impl.f3338i;
            if (animator != null) {
                animator.cancel();
            }
            int[] iArr = x.f4957a;
            FloatingActionButton floatingActionButton = impl.r;
            if (!x.f.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z9 = false;
            }
            Matrix matrix = impl.f3349u;
            if (z9) {
                if (floatingActionButton.getVisibility() != 0) {
                    floatingActionButton.setAlpha(0.0f);
                    floatingActionButton.setScaleY(0.0f);
                    floatingActionButton.setScaleX(0.0f);
                    impl.f3342m = 0.0f;
                    matrix.reset();
                    floatingActionButton.getDrawable();
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f3339j;
                if (gVar == null) {
                    if (impl.f3336g == null) {
                        impl.f3336g = g.a(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    gVar = impl.f3336g;
                    gVar.getClass();
                }
                AnimatorSet a9 = impl.a(gVar, 1.0f, 1.0f, 1.0f);
                a9.addListener(new c(impl, z8, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f3344o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a9.addListener(it.next());
                    }
                }
                a9.start();
                return;
            }
            floatingActionButton.b(0, z8);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f3342m = 1.0f;
            matrix.reset();
            floatingActionButton.getDrawable();
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f3320a.b();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof t4.b)) {
            ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
            if (impl.f3350v == null) {
                impl.f3350v = new t4.a(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f3350v);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f3350v;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f3350v = null;
        }
    }

    public final void onMeasure(int i8, int i9) {
        int sizeDimension = (getSizeDimension() + 0) / 2;
        getImpl().l();
        throw null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a5.a aVar = (a5.a) parcelable;
        super.onRestoreInstanceState(aVar.f6241f);
        Bundle orDefault = aVar.f170h.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        throw null;
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new f();
        throw null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int[] iArr = x.f4957a;
            if (x.f.c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i8) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3309b != colorStateList) {
            this.f3309b = colorStateList;
            getImpl().getClass();
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3310c != mode) {
            this.f3310c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f9) {
        d impl = getImpl();
        if (impl.f3334d != f9) {
            impl.f3334d = f9;
            impl.h(f9, impl.e, impl.f3335f);
        }
    }

    public void setCompatElevationResource(int i8) {
        setCompatElevation(getResources().getDimension(i8));
    }

    public void setCompatHoveredFocusedTranslationZ(float f9) {
        d impl = getImpl();
        if (impl.e != f9) {
            impl.e = f9;
            impl.h(impl.f3334d, f9, impl.f3335f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i8) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i8));
    }

    public void setCompatPressedTranslationZ(float f9) {
        d impl = getImpl();
        if (impl.f3335f != f9) {
            impl.f3335f = f9;
            impl.h(impl.f3334d, impl.e, f9);
        }
    }

    public void setCompatPressedTranslationZResource(int i8) {
        setCompatPressedTranslationZ(getResources().getDimension(i8));
    }

    public void setCustomSize(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i8 != this.f3314h) {
            this.f3314h = i8;
            requestLayout();
        }
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        if (z8 != getImpl().f3332b) {
            getImpl().f3332b = z8;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i8) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3340k = gVar;
    }

    public void setHideMotionSpecResource(int i8) {
        setHideMotionSpec(g.a(getContext(), i8));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.f3342m = impl.f3342m;
            Matrix matrix = impl.f3349u;
            matrix.reset();
            FloatingActionButton floatingActionButton = impl.r;
            floatingActionButton.getDrawable();
            floatingActionButton.setImageMatrix(matrix);
            if (this.f3311d != null) {
                j();
            }
        }
    }

    public void setImageResource(int i8) {
        throw null;
    }

    public void setRippleColor(int i8) {
        setRippleColor(ColorStateList.valueOf(i8));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3312f != colorStateList) {
            this.f3312f = colorStateList;
            getImpl().j();
        }
    }

    public void setScaleX(float f9) {
        super.setScaleX(f9);
        ArrayList<d.e> arrayList = getImpl().f3346q;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setScaleY(float f9) {
        super.setScaleY(f9);
        ArrayList<d.e> arrayList = getImpl().f3346q;
        if (arrayList != null) {
            Iterator<d.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z8) {
        d impl = getImpl();
        impl.f3333c = z8;
        impl.l();
        throw null;
    }

    public void setShapeAppearanceModel(i iVar) {
        getImpl().f3331a = iVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f3339j = gVar;
    }

    public void setShowMotionSpecResource(int i8) {
        setShowMotionSpec(g.a(getContext(), i8));
    }

    public void setSize(int i8) {
        this.f3314h = 0;
        if (i8 != this.f3313g) {
            this.f3313g = i8;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3311d != colorStateList) {
            this.f3311d = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            j();
        }
    }

    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
        getImpl().i();
    }

    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        getImpl().i();
    }

    public void setTranslationZ(float f9) {
        super.setTranslationZ(f9);
        getImpl().i();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f3315i != z8) {
            this.f3315i = z8;
            getImpl().f();
        }
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
    }
}
