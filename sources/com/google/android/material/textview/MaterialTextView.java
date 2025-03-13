package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.s;
import androidx.health.services.client.R;
import d5.a;
import v4.b;

public class MaterialTextView extends s {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        TypedValue a9 = b.a(context2, R.attr.textAppearanceLineHeightEnabled);
        boolean z8 = true;
        if ((a9 != null && a9.type == 18 && a9.data == 0) ? false : true) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a1.a.f12a0;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int e = e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(e == -1 ? false : z8)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(resourceId, theme);
                }
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i8 = -1;
        for (int i9 = 0; i9 < iArr.length && i8 < 0; i9++) {
            int i10 = iArr[i9];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
                i8 = typedArray.getDimensionPixelSize(i10, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i8 = dimensionPixelSize;
            }
        }
        return i8;
    }

    public final void d(int i8, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i8, a1.a.Z);
        int e = e(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e >= 0) {
            setLineHeight(e);
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        TypedValue a9 = b.a(context, R.attr.textAppearanceLineHeightEnabled);
        if ((a9 != null && a9.type == 18 && a9.data == 0) ? false : true) {
            d(i8, context.getTheme());
        }
    }
}
