package v4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.widget.o0;
import g.a;

public final class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        if (typedArray.hasValue(i8) && (resourceId = typedArray.getResourceId(i8, 0)) != 0) {
            Object obj = a.f4440a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i8);
    }

    public static ColorStateList b(Context context, o0 o0Var, int i8) {
        int h8;
        if (o0Var.k(i8) && (h8 = o0Var.h(i8, 0)) != 0) {
            Object obj = a.f4440a;
            ColorStateList colorStateList = context.getColorStateList(h8);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return o0Var.b(i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = g.a.a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable c(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = g.a.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.c(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
