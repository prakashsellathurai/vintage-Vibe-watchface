package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import k3.j;

public class SeekBarPreference extends Preference {

    /* renamed from: m  reason: collision with root package name */
    public int f1530m;

    /* renamed from: n  reason: collision with root package name */
    public int f1531n;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.F, R.attr.seekBarPreferenceStyle, 0);
        int i8 = obtainStyledAttributes.getInt(3, 0);
        int i9 = obtainStyledAttributes.getInt(1, 100);
        i9 = i9 < i8 ? i8 : i9;
        if (i9 != this.f1530m) {
            this.f1530m = i9;
        }
        int i10 = obtainStyledAttributes.getInt(4, 0);
        if (i10 != this.f1531n) {
            this.f1531n = Math.min(this.f1530m - i8, Math.abs(i10));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final Object g(TypedArray typedArray, int i8) {
        return Integer.valueOf(typedArray.getInt(i8, 0));
    }
}
