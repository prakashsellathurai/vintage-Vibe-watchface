package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import b0.e;
import k3.j;

public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.y, i8, 0);
        e.b(obtainStyledAttributes, 9, 0);
        e.b(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        e.b(obtainStyledAttributes, 11, 3);
        e.b(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
