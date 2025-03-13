package c5;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public final class h implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f2676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2677b;

    public h(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f2677b = bVar;
        this.f2676a = autoCompleteTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 1) {
            b bVar = this.f2677b;
            bVar.getClass();
            long currentTimeMillis = System.currentTimeMillis() - bVar.f3513k;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                z8 = false;
            }
            if (z8) {
                bVar.f3511i = false;
            }
            b.d(bVar, this.f2676a);
        }
        return false;
    }
}
