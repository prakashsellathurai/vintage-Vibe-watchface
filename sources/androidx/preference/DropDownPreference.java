package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import androidx.health.services.client.R;

public class DropDownPreference extends ListPreference {

    /* renamed from: o  reason: collision with root package name */
    public final ArrayAdapter f1518o;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f1518o = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1520m;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void f() {
        ArrayAdapter arrayAdapter = this.f1518o;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
