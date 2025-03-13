package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public final Object g(TypedArray typedArray, int i8) {
        return Boolean.valueOf(typedArray.getBoolean(i8, false));
    }
}
