package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import androidx.health.services.client.R;
import c5.k;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

public final class a extends k {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3495d = new C0037a();
    public final View.OnFocusChangeListener e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final c f3496f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final d f3497g = new d();

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f3498h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f3499i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0037a implements TextWatcher {
        public C0037a() {
        }

        public final void afterTextChanged(Editable editable) {
            a aVar = a.this;
            if (aVar.f2680a.getSuffixText() == null) {
                aVar.d(editable.length() > 0);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public final void onFocusChange(View view, boolean z8) {
            boolean z9 = true;
            if (!(!TextUtils.isEmpty(((EditText) view).getText())) || !z8) {
                z9 = false;
            }
            a.this.d(z9);
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                r3 = 1
                if (r1 <= 0) goto L_0x0018
                r1 = r3
                goto L_0x0019
            L_0x0018:
                r1 = r2
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r3 = r2
            L_0x001d:
                r5.setEndIconVisible(r3)
                r5.setEndIconCheckable(r2)
                com.google.android.material.textfield.a r4 = com.google.android.material.textfield.a.this
                android.view.View$OnFocusChangeListener r5 = r4.e
                r0.setOnFocusChangeListener(r5)
                android.text.TextWatcher r4 = r4.f3495d
                r0.removeTextChangedListener(r4)
                r0.addTextChangedListener(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.a.c.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0038a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ EditText f3504f;

            public C0038a(EditText editText) {
                this.f3504f = editText;
            }

            public final void run() {
                this.f3504f.removeTextChangedListener(a.this.f3495d);
            }
        }

        public d() {
        }

        public final void a(TextInputLayout textInputLayout, int i8) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i8 == 2) {
                editText.post(new C0038a(editText));
                if (editText.getOnFocusChangeListener() == a.this.e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public final void onClick(View view) {
            a aVar = a.this;
            Editable text = aVar.f2680a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = aVar.f2680a;
            textInputLayout.l(textInputLayout.f3448e0, textInputLayout.f3452g0);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public final void a() {
        Drawable a9 = g.a.a(this.f2681b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f2680a;
        textInputLayout.setEndIconDrawable(a9);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new e());
        LinkedHashSet<TextInputLayout.f> linkedHashSet = textInputLayout.f3443b0;
        c cVar = this.f3496f;
        linkedHashSet.add(cVar);
        if (textInputLayout.e != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f3450f0.add(this.f3497g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(f4.a.f4394d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new c5.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        LinearInterpolator linearInterpolator = f4.a.f4391a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new c5.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3498h = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f3498h.addListener(new c5.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new c5.c(this));
        this.f3499i = ofFloat3;
        ofFloat3.addListener(new c5.b(this));
    }

    public final void c(boolean z8) {
        if (this.f2680a.getSuffixText() != null) {
            d(z8);
        }
    }

    public final void d(boolean z8) {
        boolean z9 = this.f2680a.h() == z8;
        if (z8 && !this.f3498h.isRunning()) {
            this.f3499i.cancel();
            this.f3498h.start();
            if (z9) {
                this.f3498h.end();
            }
        } else if (!z8) {
            this.f3498h.cancel();
            this.f3499i.start();
            if (z9) {
                this.f3499i.end();
            }
        }
    }
}
