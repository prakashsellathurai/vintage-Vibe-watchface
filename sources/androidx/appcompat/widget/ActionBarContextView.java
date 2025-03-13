package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.services.client.R;

public class ActionBarContextView extends a {
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f483f;

    /* renamed from: g  reason: collision with root package name */
    public View f484g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f485h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f486i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f487j;

    /* renamed from: k  reason: collision with root package name */
    public final int f488k;

    /* renamed from: l  reason: collision with root package name */
    public final int f489l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f490m;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = -2147221474(0xffffffff8004001e, float:-3.67384E-40)
            r3.<init>(r4, r5, r0)
            int[] r1 = a1.a.f40p
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = g.a.a(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            int[] r0 = j0.x.f4957a
            j0.x.c.q(r3, r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f488k = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f489l = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f632b = r4
            r3 = 2
            r4 = -2146566139(0xffffffff800e0005, float:-1.285704E-39)
            r5.getResourceId(r3, r4)
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void c() {
        if (this.f485h == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f485h = linearLayout;
            this.f486i = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f487j = (TextView) this.f485h.findViewById(R.id.action_bar_subtitle);
            int i8 = this.f488k;
            if (i8 != 0) {
                this.f486i.setTextAppearance(getContext(), i8);
            }
            int i9 = this.f489l;
            if (i9 != 0) {
                this.f487j.setTextAppearance(getContext(), i9);
            }
        }
        this.f486i.setText(this.e);
        this.f487j.setText(this.f483f);
        boolean z8 = !TextUtils.isEmpty(this.e);
        boolean z9 = !TextUtils.isEmpty(this.f483f);
        int i10 = 0;
        this.f487j.setVisibility(z9 ? 0 : 8);
        LinearLayout linearLayout2 = this.f485h;
        if (!z8 && !z9) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f485h.getParent() == null) {
            addView(this.f485h);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f483f;
    }

    public CharSequence getTitle() {
        return this.e;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.e);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean a9 = s0.a(this);
        int paddingRight = a9 ? (i10 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f485h;
        if (!(linearLayout == null || this.f484g != null || linearLayout.getVisibility() == 8)) {
            paddingRight += a.b(paddingRight, paddingTop, paddingTop2, this.f485h, a9);
        }
        View view = this.f484g;
        if (view != null) {
            a.b(paddingRight, paddingTop, paddingTop2, view, a9);
        }
        if (a9) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    public final void onMeasure(int i8, int i9) {
        int i10 = 1073741824;
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i9) != 0) {
            int size = View.MeasureSpec.getSize(i8);
            int i11 = this.f632b;
            if (i11 <= 0) {
                i11 = View.MeasureSpec.getSize(i9);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i12 = i11 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
            LinearLayout linearLayout = this.f485h;
            if (linearLayout != null && this.f484g == null) {
                if (this.f490m) {
                    this.f485h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f485h.getMeasuredWidth();
                    boolean z8 = measuredWidth <= paddingLeft;
                    if (z8) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f485h.setVisibility(z8 ? 0 : 8);
                } else {
                    paddingLeft = a.a(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view = this.f484g;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i13 >= 0) {
                    paddingLeft = Math.min(i13, paddingLeft);
                }
                int i15 = layoutParams.height;
                if (i15 == -2) {
                    i10 = Integer.MIN_VALUE;
                }
                if (i15 >= 0) {
                    i12 = Math.min(i15, i12);
                }
                this.f484g.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(i12, i10));
            }
            if (this.f632b <= 0) {
                int childCount = getChildCount();
                int i16 = 0;
                for (int i17 = 0; i17 < childCount; i17++) {
                    int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i16) {
                        i16 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i16);
                return;
            }
            setMeasuredDimension(size, i11);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public void setContentHeight(int i8) {
        this.f632b = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f484g;
        if (view2 != null) {
            removeView(view2);
        }
        this.f484g = view;
        if (!(view == null || (linearLayout = this.f485h) == null)) {
            removeView(linearLayout);
            this.f485h = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f483f = charSequence;
        c();
    }

    public void setTitle(CharSequence charSequence) {
        this.e = charSequence;
        c();
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f490m) {
            requestLayout();
        }
        this.f490m = z8;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
