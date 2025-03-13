package androidx.preference;

import android.content.res.TypedArray;
import android.text.TextUtils;
import androidx.health.services.client.R;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {

    public static final class a implements Preference.a<EditTextPreference> {

        /* renamed from: a  reason: collision with root package name */
        public static a f1519a;

        public final CharSequence a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            editTextPreference.getClass();
            if (TextUtils.isEmpty((CharSequence) null)) {
                return editTextPreference.f1523f.getString(R.string.not_set);
            }
            return null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = -2147221149(0xffffffff80040163, float:-3.6784E-40)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = b0.e.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = k3.j.f5168z
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L_0x002d
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.f1519a
            if (r5 != 0) goto L_0x0029
            androidx.preference.EditTextPreference$a r5 = new androidx.preference.EditTextPreference$a
            r5.<init>()
            androidx.preference.EditTextPreference.a.f1519a = r5
        L_0x0029:
            androidx.preference.EditTextPreference$a r5 = androidx.preference.EditTextPreference.a.f1519a
            r3.f1529l = r5
        L_0x002d:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object g(TypedArray typedArray, int i8) {
        return typedArray.getString(i8);
    }
}
