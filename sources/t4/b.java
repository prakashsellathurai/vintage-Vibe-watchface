package t4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;

public final class b extends d {
    public b(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    public final float c() {
        return this.r.getElevation();
    }

    public final void d(Rect rect) {
        if (FloatingActionButton.this.f3315i) {
            super.d(rect);
            return;
        }
        boolean z8 = this.f3332b;
        int i8 = 0;
        FloatingActionButton floatingActionButton = this.r;
        if (!(!z8 || floatingActionButton.getSizeDimension() >= 0)) {
            i8 = (0 - floatingActionButton.getSizeDimension()) / 2;
        }
        rect.set(i8, i8, i8, i8);
    }

    public final void e() {
    }

    public final void f() {
        l();
        throw null;
    }

    public final void g(int[] iArr) {
    }

    public final void h(float f9, float f10, float f11) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.f3329x, m(f9, f11));
        stateListAnimator.addState(d.y, m(f9, f10));
        stateListAnimator.addState(d.f3330z, m(f9, f10));
        stateListAnimator.addState(d.A, m(f9, f10));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FloatingActionButton floatingActionButton = this.r;
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f9}).setDuration(0));
        arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.w);
        stateListAnimator.addState(d.B, animatorSet);
        stateListAnimator.addState(d.C, m(0.0f, 0.0f));
        floatingActionButton.setStateListAnimator(stateListAnimator);
        if (n()) {
            l();
            throw null;
        }
    }

    public final void j() {
    }

    public final void k() {
    }

    public final AnimatorSet m(float f9, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.r;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", new float[]{f9}).setDuration(0)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{f10}).setDuration(100));
        animatorSet.setInterpolator(d.w);
        return animatorSet;
    }

    public final boolean n() {
        if (FloatingActionButton.this.f3315i) {
            return true;
        }
        return !(!this.f3332b || this.r.getSizeDimension() >= 0);
    }
}
