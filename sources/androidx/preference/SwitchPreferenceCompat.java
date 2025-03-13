package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import b0.e;
import k3.j;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.H, R.attr.switchPreferenceCompatStyle, 0);
        e.b(obtainStyledAttributes, 7, 0);
        e.b(obtainStyledAttributes, 6, 1);
        e.b(obtainStyledAttributes, 9, 3);
        e.b(obtainStyledAttributes, 8, 4);
        obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
}
