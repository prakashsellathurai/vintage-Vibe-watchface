package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f765a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f766b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f767c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f768d = {16842919};
    public static final int[] e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f769f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f770g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.f46t);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i8) {
        ColorStateList d9 = d(context, i8);
        if (d9 != null && d9.isStateful()) {
            return d9.getColorForState(f766b, d9.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f765a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f9 = typedValue.getFloat();
        int c9 = c(context, i8);
        return c0.a.b(c9, Math.round(((float) Color.alpha(c9)) * f9));
    }

    public static int c(Context context, int i8) {
        int[] iArr = f770g;
        iArr[0] = i8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i8) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f770g;
        iArr[0] = i8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = g.a.f4440a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
