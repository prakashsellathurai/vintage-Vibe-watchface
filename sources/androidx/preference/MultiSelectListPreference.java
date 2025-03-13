package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;

public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            r0 = -2147221182(0xffffffff80040142, float:-3.67793E-40)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = b0.e.a(r3, r0, r1)
            r2.<init>(r3, r4, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int[] r2 = k3.j.B
            r1 = 0
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2, r0, r1)
            r3 = 2
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x0023
            r2.getTextArray(r1)
        L_0x0023:
            r3 = 3
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L_0x002e
            r3 = 1
            r2.getTextArray(r3)
        L_0x002e:
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object g(TypedArray typedArray, int i8) {
        CharSequence[] textArray = typedArray.getTextArray(i8);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
