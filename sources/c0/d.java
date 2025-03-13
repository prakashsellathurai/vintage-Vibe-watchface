package c0;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;

public final class d extends e {
    public static Font a(FontFamily fontFamily, int i8) {
        FontStyle fontStyle = new FontStyle((i8 & 1) != 0 ? 700 : 400, (i8 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int b9 = b(fontStyle, font.getStyle());
        for (int i9 = 1; i9 < fontFamily.getSize(); i9++) {
            Font font2 = fontFamily.getFont(i9);
            int b10 = b(fontStyle, font2.getStyle());
            if (b10 < b9) {
                font = font2;
                b9 = b10;
            }
        }
        return font;
    }

    public static int b(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }
}
