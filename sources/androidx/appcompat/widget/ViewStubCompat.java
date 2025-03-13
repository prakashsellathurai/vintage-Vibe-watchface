package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f627a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f628b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<View> f629c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f630d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.I, 0, 0);
        this.f628b = obtainStyledAttributes.getResourceId(2, -1);
        this.f627a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f627a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f630d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f627a, viewGroup, false);
            int i8 = this.f628b;
            if (i8 != -1) {
                inflate.setId(i8);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f629c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f628b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f630d;
    }

    public int getLayoutResource() {
        return this.f627a;
    }

    public final void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i8) {
        this.f628b = i8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f630d = layoutInflater;
    }

    public void setLayoutResource(int i8) {
        this.f627a = i8;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i8) {
        WeakReference<View> weakReference = this.f629c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i8);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i8);
        if (i8 == 0 || i8 == 4) {
            a();
        }
    }
}
