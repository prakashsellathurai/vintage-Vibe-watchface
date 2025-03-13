package f4;

import android.animation.TypeEvaluator;

public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4395a = new b();

    public final Object evaluate(float f9, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = pow3 + (f9 * (((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3));
        int round = Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f9)), 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f) | round | (Math.round((f10 + (((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f10) * f9)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * f9)), 0.45454545454545453d)) * 255.0f) << 8));
    }
}
