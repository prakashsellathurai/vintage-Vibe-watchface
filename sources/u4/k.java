package u4;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.health.services.client.R;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7780a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7781b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f31k0, i8, i9);
        boolean z8 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z8) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f7781b, "Theme.MaterialComponents");
            }
        }
        c(context, f7780a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = a1.a.f31k0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L_0x001d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L_0x0038
            goto L_0x0037
        L_0x001d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x0023:
            if (r6 >= r5) goto L_0x0034
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L_0x0031
            r4.recycle()
            goto L_0x0038
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0034:
            r4.recycle()
        L_0x0037:
            r2 = 1
        L_0x0038:
            r0.recycle()
            if (r2 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.k.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z8 = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i8)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i8++;
            }
        }
        if (!z8) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, int... iArr2) {
        a(context, attributeSet, i8, i9);
        b(context, attributeSet, iArr, i8, i9, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
    }
}
