package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.health.services.client.R;
import j0.x;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f474a;

    /* renamed from: b  reason: collision with root package name */
    public View f475b;

    /* renamed from: c  reason: collision with root package name */
    public View f476c;

    /* renamed from: d  reason: collision with root package name */
    public View f477d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f478f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f479g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f480h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f481i;

    /* renamed from: j  reason: collision with root package name */
    public final int f482j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        int[] iArr = x.f4957a;
        x.c.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f34m);
        boolean z8 = false;
        this.e = obtainStyledAttributes.getDrawable(0);
        this.f478f = obtainStyledAttributes.getDrawable(2);
        this.f482j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f480h = true;
            this.f479g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f480h ? this.e == null && this.f478f == null : this.f479g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f478f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f478f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f479g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f479g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f475b;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f478f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f479g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f476c = findViewById(R.id.action_bar);
        this.f477d = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f474a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f475b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f480h
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f479g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.e
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f476c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.e
            android.view.View r7 = r4.f476c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f476c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f476c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f476c
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f477d
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.e
            android.view.View r7 = r4.f477d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f477d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f477d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f477d
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.e
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f481i = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f478f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f476c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x001c
            int r0 = r6.f482j
            if (r0 < 0) goto L_0x001c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f476c
            if (r7 != 0) goto L_0x0024
            return
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.f475b
            if (r0 == 0) goto L_0x0089
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0089
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x0089
            android.view.View r0 = r6.f476c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x004d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = r4
            goto L_0x004e
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 != 0) goto L_0x0053
            android.view.View r0 = r6.f476c
            goto L_0x0069
        L_0x0053:
            android.view.View r0 = r6.f477d
            if (r0 == 0) goto L_0x0065
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x0065
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r3 = r4
        L_0x0065:
            if (r3 != 0) goto L_0x006d
            android.view.View r0 = r6.f477d
        L_0x0069:
            int r4 = a(r0)
        L_0x006d:
            if (r7 != r1) goto L_0x0074
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0077
        L_0x0074:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0077:
            int r8 = r6.getMeasuredWidth()
            android.view.View r0 = r6.f475b
            int r0 = a(r0)
            int r4 = r4 + r0
            int r7 = java.lang.Math.min(r4, r7)
            r6.setMeasuredDimension(r8, r7)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f476c;
            if (view != null) {
                this.e.setBounds(view.getLeft(), this.f476c.getTop(), this.f476c.getRight(), this.f476c.getBottom());
            }
        }
        boolean z8 = true;
        if (!this.f480h ? !(this.e == null && this.f478f == null) : this.f479g != null) {
            z8 = false;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f479g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f479g);
        }
        this.f479g = drawable;
        boolean z8 = this.f480h;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z8 && (drawable2 = this.f479g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z8 ? this.e == null && this.f478f == null : this.f479g == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f478f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f478f);
        }
        this.f478f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f481i && (drawable2 = this.f478f) != null) {
                drawable2.setBounds(this.f475b.getLeft(), this.f475b.getTop(), this.f475b.getRight(), this.f475b.getBottom());
            }
        }
        boolean z8 = true;
        if (!this.f480h ? !(this.e == null && this.f478f == null) : this.f479g != null) {
            z8 = false;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(i0 i0Var) {
        View view = this.f475b;
        if (view != null) {
            removeView(view);
        }
        this.f475b = i0Var;
        if (i0Var != null) {
            addView(i0Var);
            ViewGroup.LayoutParams layoutParams = i0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            i0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z8) {
        this.f474a = z8;
        setDescendantFocusability(z8 ? 393216 : 262144);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f478f;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f479g;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.e;
        boolean z8 = this.f480h;
        return (drawable == drawable2 && !z8) || (drawable == this.f478f && this.f481i) || ((drawable == this.f479g && z8) || super.verifyDrawable(drawable));
    }
}
