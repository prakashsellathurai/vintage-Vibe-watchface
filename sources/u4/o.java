package u4;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class o extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f7785a;

    public final void b(int i8, boolean z8) {
        super.setVisibility(i8);
        if (z8) {
            this.f7785a = i8;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7785a;
    }

    public void setVisibility(int i8) {
        b(i8, true);
    }
}
