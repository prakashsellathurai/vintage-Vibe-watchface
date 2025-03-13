package g4;

import a1.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.d0;
import j0.f;
import j0.x;
import java.util.ArrayList;

public abstract class c extends d<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4613c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4614d = new Rect();
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f4615f;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
        View u8;
        d0 lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 != -1 && i11 != -2) || (u8 = u(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (size > 0) {
            int[] iArr = x.f4957a;
            if (x.c.b(u8) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.d() + lastWindowInsets.a();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.r(view, i8, i9, View.MeasureSpec.makeMeasureSpec((size + w(u8)) - u8.getMeasuredHeight(), i11 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public final void t(CoordinatorLayout coordinatorLayout, View view, int i8) {
        View u8 = u(coordinatorLayout.j(view));
        int i9 = 0;
        if (u8 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f4613c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, u8.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + u8.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                int[] iArr = x.f4957a;
                if (x.c.b(coordinatorLayout) && !x.c.b(view)) {
                    rect.left += lastWindowInsets.b();
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f4614d;
            int i10 = fVar.f1025c;
            if (i10 == 0) {
                i10 = 8388659;
            }
            f.b(i10, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i8);
            if (this.f4615f != 0) {
                float v8 = v(u8);
                int i11 = this.f4615f;
                i9 = a.l((int) (v8 * ((float) i11)), 0, i11);
            }
            view.layout(rect2.left, rect2.top - i9, rect2.right, rect2.bottom - i9);
            i9 = rect2.top - u8.getBottom();
        } else {
            View view2 = view;
            coordinatorLayout.q(view, i8);
        }
        this.e = i9;
    }

    public abstract View u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}
