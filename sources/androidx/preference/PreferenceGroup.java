package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import k3.j;
import p.f;

public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup() {
        throw null;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        new f();
        new Handler();
        new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.D, i8, 0);
        obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1) && obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)) != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.f1527j))) {
            Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        obtainStyledAttributes.recycle();
    }
}
