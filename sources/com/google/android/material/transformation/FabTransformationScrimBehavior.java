package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f4.h;
import java.util.ArrayList;
import k3.j;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f3579c = new h(75);

    /* renamed from: d  reason: collision with root package name */
    public final h f3580d = new h(0);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3581a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3582b;

        public a(boolean z8, View view) {
            this.f3581a = z8;
            this.f3582b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f3581a) {
                this.f3582b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f3581a) {
                this.f3582b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public final AnimatorSet t(View view, View view2, boolean z8, boolean z9) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        h hVar = z8 ? this.f3579c : this.f3580d;
        if (z8) {
            if (!z9) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        j.R(animatorSet, arrayList);
        animatorSet.addListener(new a(z8, view2));
        return animatorSet;
    }
}
