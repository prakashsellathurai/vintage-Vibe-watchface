package c5;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

public final class e extends k {
    public e(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        TextInputLayout textInputLayout = this.f2680a;
        textInputLayout.setEndIconOnClickListener((View.OnClickListener) null);
        textInputLayout.setEndIconOnLongClickListener((View.OnLongClickListener) null);
    }
}
