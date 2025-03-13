package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.health.services.client.R;
import c5.k;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import u4.j;

public final class c extends k {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3528d = new a();
    public final b e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final C0041c f3529f = new C0041c();

    public class a extends j {
        public a() {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            c cVar = c.this;
            cVar.f2682c.setChecked(!c.d(cVar));
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.f2682c.setChecked(true ^ c.d(cVar));
            TextWatcher textWatcher = cVar.f3528d;
            editText.removeTextChangedListener(textWatcher);
            editText.addTextChangedListener(textWatcher);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    public class C0041c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ EditText f3533f;

            public a(EditText editText) {
                this.f3533f = editText;
            }

            public final void run() {
                this.f3533f.removeTextChangedListener(c.this.f3528d);
            }
        }

        public C0041c() {
        }

        public final void a(TextInputLayout textInputLayout, int i8) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i8 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public final void onClick(View view) {
            c cVar = c.this;
            EditText editText = cVar.f2680a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(c.d(cVar) ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                TextInputLayout textInputLayout = cVar.f2680a;
                textInputLayout.l(textInputLayout.f3448e0, textInputLayout.f3452g0);
            }
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f2680a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public final void a() {
        Drawable a9 = g.a.a(this.f2681b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.f2680a;
        textInputLayout.setEndIconDrawable(a9);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new d());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3443b0;
        b bVar = this.e;
        linkedHashSet.add(bVar);
        if (textInputLayout.e != null) {
            bVar.a(textInputLayout);
        }
        textInputLayout.f3450f0.add(this.f3529f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
