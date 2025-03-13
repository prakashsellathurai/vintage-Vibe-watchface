package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import b0.e;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e.a(context, R.attr.preferenceCategoryStyle, 16842892));
    }
}
