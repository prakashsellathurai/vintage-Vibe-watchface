package i4;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j0.x;
import k0.g;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4840a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4840a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f4840a;
        boolean z8 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        int[] iArr = x.f4957a;
        boolean z9 = x.d.d(view) == 1;
        int i8 = swipeDismissBehavior.f3071c;
        if ((i8 == 0 && z9) || (i8 == 1 && !z9)) {
            z8 = true;
        }
        int width = view.getWidth();
        if (z8) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }
}
