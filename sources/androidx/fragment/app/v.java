package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.health.services.client.R;
import j0.d0;
import j0.x;
import java.util.ArrayList;
import java.util.Iterator;
import k3.j;

public final class v extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<View> f1353a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<View> f1354b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1355c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1356d = true;

    public v(Context context, AttributeSet attributeSet, b0 b0Var) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5152g);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        n C = b0Var.C(id);
        if (classAttribute != null && C == null) {
            if (id <= 0) {
                String concat = string != null ? " with tag ".concat(string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + concat);
            }
            x F = b0Var.F();
            context.getClassLoader();
            n instantiate = n.instantiate(b0.this.f1114o.f1360b, classAttribute, (Bundle) null);
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(b0Var);
            aVar.f1206p = true;
            instantiate.G = this;
            aVar.f(getId(), instantiate, string, 1);
            if (!aVar.f1197g) {
                aVar.f1198h = false;
                aVar.f1082q.y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = b0Var.f1103c.f().iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            n nVar = h0Var.f1182c;
            if (nVar.f1274x == getId() && (view = nVar.H) != null && view.getParent() == null) {
                nVar.G = this;
                h0Var.b();
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f1354b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1353a == null) {
                this.f1353a = new ArrayList<>();
            }
            this.f1353a.add(view);
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof n ? (n) tag : null) != null) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof n ? (n) tag : null) != null) {
            return super.addViewInLayout(view, i8, layoutParams, z8);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        d0 g9 = d0.g(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1355c;
        d0 g10 = onApplyWindowInsetsListener != null ? d0.g(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), (View) null) : x.e(this, g9);
        if (!g10.f4933a.j()) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                x.a(getChildAt(i8), g10);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f1356d && this.f1353a != null) {
            for (int i8 = 0; i8 < this.f1353a.size(); i8++) {
                super.drawChild(canvas, this.f1353a.get(i8), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        ArrayList<View> arrayList;
        if (!this.f1356d || (arrayList = this.f1353a) == null || arrayList.size() <= 0 || !this.f1353a.contains(view)) {
            return super.drawChild(canvas, view, j8);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1354b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1353a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1356d = true;
            }
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public final void removeDetachedView(View view, boolean z8) {
        if (z8) {
            a(view);
        }
        super.removeDetachedView(view, z8);
    }

    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i8) {
        a(getChildAt(i8));
        super.removeViewAt(i8);
    }

    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            a(getChildAt(i10));
        }
        super.removeViews(i8, i9);
    }

    public final void removeViewsInLayout(int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            a(getChildAt(i10));
        }
        super.removeViewsInLayout(i8, i9);
    }

    public void setDrawDisappearingViewsLast(boolean z8) {
        this.f1356d = z8;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1355c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1354b == null) {
                this.f1354b = new ArrayList<>();
            }
            this.f1354b.add(view);
        }
        super.startViewTransition(view);
    }
}
