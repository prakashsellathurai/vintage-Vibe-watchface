package c0;

import android.graphics.Color;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2633a = 0;

    /* renamed from: c0.a$a  reason: collision with other inner class name */
    public static class C0030a {
        public static Color a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                float f9 = alpha + alpha2;
                components2[componentCount] = f9;
                if (f9 > 0.0f) {
                    alpha /= f9;
                    alpha2 /= f9;
                }
                for (int i8 = 0; i8 < componentCount; i8++) {
                    components2[i8] = (components[i8] * alpha) + (components2[i8] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
    }

    static {
        new ThreadLocal();
    }

    public static int a(int i8, int i9) {
        int alpha = Color.alpha(i9);
        int alpha2 = Color.alpha(i8);
        int i10 = 255 - alpha2;
        int i11 = 255 - (((255 - alpha) * i10) / 255);
        int i12 = 0;
        int red = i11 == 0 ? 0 : (((Color.red(i8) * 255) * alpha2) + ((Color.red(i9) * alpha) * i10)) / (i11 * 255);
        int green = i11 == 0 ? 0 : (((Color.green(i8) * 255) * alpha2) + ((Color.green(i9) * alpha) * i10)) / (i11 * 255);
        int blue = Color.blue(i8);
        int blue2 = Color.blue(i9);
        if (i11 != 0) {
            i12 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i10)) / (i11 * 255);
        }
        return Color.argb(i11, red, green, i12);
    }

    public static int b(int i8, int i9) {
        if (i9 >= 0 && i9 <= 255) {
            return (i8 & 16777215) | (i9 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
