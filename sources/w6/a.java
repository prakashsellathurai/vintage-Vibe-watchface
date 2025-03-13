package w6;

import android.graphics.ColorMatrix;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f8080a;

    public a(float f9, float f10, float f11) {
        this.f8080a = new float[]{f9, f10, f11};
    }

    public final ColorMatrix a() {
        float[] fArr = this.f8080a;
        double d9 = (double) ((fArr[0] / 180.0f) * 3.1415927f);
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = f9 * f10;
        float cos = ((float) Math.cos(d9)) * f11;
        float sin = f11 * ((float) Math.sin(d9));
        float f12 = f10 * 0.299f;
        float f13 = f10 * 0.587f;
        float f14 = f10 * 0.114f;
        float f15 = f14 - (0.114f * cos);
        return new ColorMatrix(new float[]{(0.701f * cos) + f12 + (0.168f * sin), (f13 - (0.587f * cos)) + (0.33f * sin), f15 - (0.497f * sin), 0.0f, 0.0f, (f12 - (0.299f * cos)) - (0.328f * sin), (0.413f * cos) + f13 + (0.035f * sin), f15 + (0.292f * sin), 0.0f, 0.0f, (f12 - (0.3f * cos)) + (1.25f * sin), (f13 - (0.588f * cos)) - (1.05f * sin), (f14 + (cos * 0.886f)) - (sin * 0.203f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }
}
