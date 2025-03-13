package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.health.services.client.R;
import b0.e;

public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e.a(context, R.attr.preferenceScreenStyle, 16842891));
    }
}
