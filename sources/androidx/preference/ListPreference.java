package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.health.services.client.R;
import androidx.preference.Preference;
import b0.e;
import k3.j;

public class ListPreference extends DialogPreference {

    /* renamed from: m  reason: collision with root package name */
    public final CharSequence[] f1520m;

    /* renamed from: n  reason: collision with root package name */
    public final String f1521n;

    public static final class a implements Preference.a<ListPreference> {

        /* renamed from: a  reason: collision with root package name */
        public static a f1522a;

        public final CharSequence a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            listPreference.getClass();
            if (TextUtils.isEmpty((CharSequence) null)) {
                return listPreference.f1523f.getString(R.string.not_set);
            }
            return null;
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    public final CharSequence e() {
        Preference.a aVar = this.f1529l;
        if (aVar != null) {
            return aVar.a(this);
        }
        Object h8 = h();
        CharSequence e = super.e();
        String str = this.f1521n;
        if (str == null) {
            return e;
        }
        Object[] objArr = new Object[1];
        if (h8 == null) {
            h8 = "";
        }
        objArr[0] = h8;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, e)) {
            return e;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public final Object g(TypedArray typedArray, int i8) {
        return typedArray.getString(i8);
    }

    public final CharSequence h() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.A, i8, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1520m = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (a.f1522a == null) {
                a.f1522a = new a();
            }
            this.f1529l = a.f1522a;
            f();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.C, i8, 0);
        this.f1521n = e.b(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
