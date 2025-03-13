package d5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import j.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4045a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4046b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4046b, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z8 = (context instanceof b) && ((b) context).f4882a == resourceId;
        if (resourceId == 0 || z8) {
            return context;
        }
        b bVar = new b(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4045a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            bVar.getTheme().applyStyle(resourceId2, true);
        }
        return bVar;
    }
}
