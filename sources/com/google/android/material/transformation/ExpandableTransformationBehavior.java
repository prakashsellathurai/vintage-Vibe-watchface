package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import e5.a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f3568b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void s(View view, View view2, boolean z8, boolean z9) {
        AnimatorSet animatorSet = this.f3568b;
        boolean z10 = animatorSet != null;
        if (z10) {
            animatorSet.cancel();
        }
        AnimatorSet t8 = t(view, view2, z8, z10);
        this.f3568b = t8;
        t8.addListener(new a(this));
        this.f3568b.start();
        if (!z9) {
            this.f3568b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z8, boolean z9);
}
