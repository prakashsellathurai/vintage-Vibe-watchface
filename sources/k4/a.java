package k4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import y4.f;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f5173a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f5173a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f5173a.f3096i;
        if (fVar != null) {
            f.b bVar = fVar.f8412a;
            if (bVar.f8441j != floatValue) {
                bVar.f8441j = floatValue;
                fVar.e = true;
                fVar.invalidateSelf();
            }
        }
    }
}
