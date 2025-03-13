package c5;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2678a;

    public i(b bVar) {
        this.f2678a = bVar;
    }

    public final void onDismiss() {
        b bVar = this.f2678a;
        bVar.f3511i = true;
        bVar.f3513k = System.currentTimeMillis();
        bVar.f(false);
    }
}
