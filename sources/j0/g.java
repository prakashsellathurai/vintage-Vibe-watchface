package j0;

import android.view.ViewGroup;

public final class g {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
        marginLayoutParams.resolveLayoutDirection(i8);
    }

    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
        marginLayoutParams.setLayoutDirection(i8);
    }

    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
        marginLayoutParams.setMarginEnd(i8);
    }

    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
        marginLayoutParams.setMarginStart(i8);
    }
}
