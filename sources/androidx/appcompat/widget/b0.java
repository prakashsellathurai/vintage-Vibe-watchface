package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class b0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f650a;

    public b0(c0 c0Var) {
        this.f650a = c0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j8) {
        x xVar;
        if (i8 != -1 && (xVar = this.f650a.f675c) != null) {
            xVar.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
