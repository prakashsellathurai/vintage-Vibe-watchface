package n0;

import android.widget.PopupWindow;

public final class i {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z8) {
        popupWindow.setOverlapAnchor(z8);
    }

    public static void d(PopupWindow popupWindow, int i8) {
        popupWindow.setWindowLayoutType(i8);
    }
}
