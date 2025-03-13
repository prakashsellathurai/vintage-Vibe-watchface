package j1;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f4965a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f4965a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (a(viewGroup.getChildAt(i8))) {
                    return true;
                }
            }
        }
        return false;
    }
}
