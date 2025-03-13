package com.google.android.material.transformation;

import a1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.health.services.client.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import f4.g;
import j0.x;
import java.util.HashMap;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public HashMap f3583i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void s(View view, View view2, boolean z8, boolean z9) {
        int i8;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                this.f3583i = new HashMap(childCount);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                boolean z10 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1023a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z10) {
                    HashMap hashMap = this.f3583i;
                    if (z8) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int[] iArr = x.f4957a;
                        i8 = 4;
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        i8 = ((Integer) this.f3583i.get(childAt)).intValue();
                        int[] iArr2 = x.f4957a;
                    }
                    x.c.s(childAt, i8);
                }
            }
            if (!z8) {
                this.f3583i = null;
            }
        }
        super.s(view, view2, z8, z9);
    }

    public final FabTransformationBehavior.b z(Context context, boolean z8) {
        int i8 = z8 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f3577a = g.a(context, i8);
        bVar.f3578b = new a();
        return bVar;
    }
}
