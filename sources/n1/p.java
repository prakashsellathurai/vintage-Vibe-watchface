package n1;

import android.graphics.Rect;
import q7.k;

public interface p {
    boolean a(h hVar, Rect rect, int i8, int i9) {
        k.e(hVar, "complicationSlot");
        k.e(rect, "screenBounds");
        return b(hVar, rect, i8, i9, false);
    }

    boolean b(h hVar, Rect rect, int i8, int i9, boolean z8) {
        k.e(hVar, "complicationSlot");
        k.e(rect, "screenBounds");
        return a(hVar, rect, i8, i9);
    }
}
