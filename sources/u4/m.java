package u4;

import android.view.View;
import j0.x;

public final class m implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        int[] iArr = x.f4957a;
        x.g.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
