package c5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

public final class n extends k {
    public n(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        TextInputLayout textInputLayout = this.f2680a;
        textInputLayout.setEndIconOnClickListener((View.OnClickListener) null);
        textInputLayout.setEndIconDrawable((Drawable) null);
        textInputLayout.setEndIconContentDescription((CharSequence) null);
    }
}
