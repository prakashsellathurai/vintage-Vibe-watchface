package t0;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f7374a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7375b;

    public d(float[] fArr) {
        this.f7374a = fArr;
        this.f7375b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f7374a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f9), fArr.length - 2);
        float f10 = this.f7375b;
        float f11 = (f9 - (((float) min) * f10)) / f10;
        float f12 = fArr[min];
        return f12 + (f11 * (fArr[min + 1] - f12));
    }
}
