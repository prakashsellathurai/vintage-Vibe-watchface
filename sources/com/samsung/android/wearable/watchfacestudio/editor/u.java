package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.animation.Interpolator;

public final /* synthetic */ class u implements Interpolator {
    public final float getInterpolation(float f9) {
        int i8 = (f9 > 0.5f ? 1 : (f9 == 0.5f ? 0 : -1));
        float f10 = f9 * 2.0f;
        return i8 < 0 ? f10 : 2.0f - f10;
    }
}
