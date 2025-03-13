package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.services.client.R;

public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0008a f631a;

    /* renamed from: b  reason: collision with root package name */
    public int f632b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f633c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f634d;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0008a {
        public C0008a(a aVar) {
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f631a = new C0008a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int a(View view, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i9);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - 0);
    }

    public static int b(int i8, int i9, int i10, View view, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i9 + ((i10 - measuredHeight) / 2);
        if (z8) {
            view.layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
        } else {
            view.layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
        }
        return z8 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f632b;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a1.a.f34m, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f634d = false;
        }
        if (!this.f634d) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f634d = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f634d = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f633c = false;
        }
        if (!this.f633c) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f633c = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f633c = false;
        }
        return true;
    }

    public void setContentHeight(int i8) {
        this.f632b = i8;
        requestLayout();
    }

    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            super.setVisibility(i8);
        }
    }
}
