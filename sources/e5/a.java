package e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExpandableTransformationBehavior f4252a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f4252a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4252a.f3568b = null;
    }
}
