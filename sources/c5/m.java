package c5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.services.client.R;
import com.google.android.material.textfield.TextInputLayout;
import f4.a;
import j0.x;
import java.util.ArrayList;
import k3.j;
import v4.c;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2687a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f2688b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f2689c;

    /* renamed from: d  reason: collision with root package name */
    public int f2690d;
    public FrameLayout e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f2691f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2692g;

    /* renamed from: h  reason: collision with root package name */
    public int f2693h;

    /* renamed from: i  reason: collision with root package name */
    public int f2694i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2695j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2696k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f2697l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2698m;

    /* renamed from: n  reason: collision with root package name */
    public int f2699n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f2700o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f2701p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2702q;
    public TextView r;

    /* renamed from: s  reason: collision with root package name */
    public int f2703s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f2704t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f2705u;

    public m(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2687a = context;
        this.f2688b = textInputLayout;
        this.f2692g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i8) {
        if (this.f2689c == null && this.e == null) {
            Context context = this.f2687a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2689c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2689c;
            TextInputLayout textInputLayout = this.f2688b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.e = new FrameLayout(context);
            this.f2689c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i8 == 0 || i8 == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
        } else {
            this.f2689c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2689c.setVisibility(0);
        this.f2690d++;
    }

    public final void b() {
        LinearLayout linearLayout = this.f2689c;
        TextInputLayout textInputLayout = this.f2688b;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f2687a;
            boolean d9 = c.d(context);
            LinearLayout linearLayout2 = this.f2689c;
            int[] iArr = x.f4957a;
            int f9 = x.d.f(editText);
            if (d9) {
                f9 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d9) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e4 = x.d.e(editText);
            if (d9) {
                e4 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            x.d.k(linearLayout2, f9, dimensionPixelSize, e4, 0);
        }
    }

    public final void c() {
        Animator animator = this.f2691f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z8, TextView textView, int i8, int i9, int i10) {
        if (textView != null && z8) {
            if (i8 == i10 || i8 == i9) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i10 == i8 ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(a.f4391a);
                arrayList.add(ofFloat);
                if (i10 == i8) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f2692g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(a.f4394d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        return this.f2694i == 1 && this.f2697l != null && !TextUtils.isEmpty(this.f2695j);
    }

    public final TextView f(int i8) {
        if (i8 == 1) {
            return this.f2697l;
        }
        if (i8 != 2) {
            return null;
        }
        return this.r;
    }

    public final int g() {
        TextView textView = this.f2697l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final void h() {
        this.f2695j = null;
        c();
        if (this.f2693h == 1) {
            this.f2694i = (!this.f2702q || TextUtils.isEmpty(this.f2701p)) ? 0 : 2;
        }
        k(this.f2693h, j(this.f2697l, (CharSequence) null), this.f2694i);
    }

    public final void i(TextView textView, int i8) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f2689c;
        if (viewGroup2 != null) {
            boolean z8 = true;
            if (!(i8 == 0 || i8 == 1)) {
                z8 = false;
            }
            if (z8 && (viewGroup = this.e) != null) {
                viewGroup2 = viewGroup;
            }
            viewGroup2.removeView(textView);
            int i9 = this.f2690d - 1;
            this.f2690d = i9;
            LinearLayout linearLayout = this.f2689c;
            if (i9 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        int[] iArr = x.f4957a;
        TextInputLayout textInputLayout = this.f2688b;
        return x.f.c(textInputLayout) && textInputLayout.isEnabled() && (this.f2694i != this.f2693h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void k(int i8, boolean z8, int i9) {
        TextView f9;
        TextView f10;
        int i10 = i8;
        boolean z9 = z8;
        int i11 = i9;
        if (i10 != i11) {
            if (z9) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f2691f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i8;
                int i13 = i9;
                d(arrayList2, this.f2702q, this.r, 2, i12, i13);
                d(arrayList2, this.f2696k, this.f2697l, 1, i12, i13);
                j.R(animatorSet, arrayList);
                animatorSet.addListener(new l(this, i9, f(i8), i8, f(i11)));
                animatorSet.start();
            } else if (i10 != i11) {
                if (!(i11 == 0 || (f10 = f(i11)) == null)) {
                    f10.setVisibility(0);
                    f10.setAlpha(1.0f);
                }
                if (!(i10 == 0 || (f9 = f(i8)) == null)) {
                    f9.setVisibility(4);
                    if (i10 == 1) {
                        f9.setText((CharSequence) null);
                    }
                }
                this.f2693h = i11;
            }
            TextInputLayout textInputLayout = this.f2688b;
            textInputLayout.r();
            textInputLayout.t(z9, false);
            textInputLayout.A();
        }
    }
}
