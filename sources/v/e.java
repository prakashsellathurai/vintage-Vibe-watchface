package v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import k3.j;

public abstract class e extends a {

    /* renamed from: h  reason: collision with root package name */
    public boolean f7829h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7830i;

    public final void f(AttributeSet attributeSet) {
        super.f(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f5155j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 6) {
                    this.f7829h = true;
                } else if (index == 13) {
                    this.f7830i = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f7829h || this.f7830i) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i8 = 0; i8 < this.f920b; i8++) {
                View view = constraintLayout.f861a.get(this.f919a[i8]);
                if (view != null) {
                    if (this.f7829h) {
                        view.setVisibility(visibility);
                    }
                    if (this.f7830i && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        d();
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        d();
    }
}
