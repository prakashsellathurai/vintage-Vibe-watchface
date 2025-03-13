package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import j0.x;
import java.lang.reflect.Method;

public final class s0 {
    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        int[] iArr = x.f4957a;
        return x.d.d(view) == 1;
    }
}
