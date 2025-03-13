package j0;

import android.view.View;
import android.view.ViewParent;

public final class b0 {
    public static boolean a(ViewParent viewParent, View view, float f9, float f10, boolean z8) {
        return viewParent.onNestedFling(view, f9, f10, z8);
    }

    public static boolean b(ViewParent viewParent, View view, float f9, float f10) {
        return viewParent.onNestedPreFling(view, f9, f10);
    }

    public static void c(ViewParent viewParent, View view, int i8, int i9, int[] iArr) {
        viewParent.onNestedPreScroll(view, i8, i9, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i8, int i9, int i10, int i11) {
        viewParent.onNestedScroll(view, i8, i9, i10, i11);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i8) {
        viewParent.onNestedScrollAccepted(view, view2, i8);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i8) {
        return viewParent.onStartNestedScroll(view, view2, i8);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
