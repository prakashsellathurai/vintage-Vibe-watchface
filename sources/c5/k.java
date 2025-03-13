package c5;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f2680a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2681b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f2682c;

    public k(TextInputLayout textInputLayout) {
        this.f2680a = textInputLayout;
        this.f2681b = textInputLayout.getContext();
        this.f2682c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i8) {
        return true;
    }

    public void c(boolean z8) {
    }
}
