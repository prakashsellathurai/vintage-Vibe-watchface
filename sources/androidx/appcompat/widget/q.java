package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import b0.b;
import j0.x;
import java.lang.ref.WeakReference;
import n0.j;
import n0.l;
import n0.m;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f789a;

    /* renamed from: b  reason: collision with root package name */
    public m0 f790b;

    /* renamed from: c  reason: collision with root package name */
    public m0 f791c;

    /* renamed from: d  reason: collision with root package name */
    public m0 f792d;
    public m0 e;

    /* renamed from: f  reason: collision with root package name */
    public m0 f793f;

    /* renamed from: g  reason: collision with root package name */
    public m0 f794g;

    /* renamed from: h  reason: collision with root package name */
    public m0 f795h;

    /* renamed from: i  reason: collision with root package name */
    public final t f796i;

    /* renamed from: j  reason: collision with root package name */
    public int f797j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f798k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f799l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f800m;

    public class a extends b.C0027b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f801a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f802b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f803c;

        public a(int i8, int i9, WeakReference weakReference) {
            this.f801a = i8;
            this.f802b = i9;
            this.f803c = weakReference;
        }

        public final void c(int i8) {
        }

        public final void d(Typeface typeface) {
            int i8 = this.f801a;
            if (i8 != -1) {
                typeface = Typeface.create(typeface, i8, (this.f802b & 2) != 0);
            }
            q qVar = q.this;
            if (qVar.f800m) {
                qVar.f799l = typeface;
                TextView textView = (TextView) this.f803c.get();
                if (textView != null) {
                    int[] iArr = x.f4957a;
                    if (x.f.b(textView)) {
                        textView.post(new r(textView, typeface, qVar.f797j));
                    } else {
                        textView.setTypeface(typeface, qVar.f797j);
                    }
                }
            }
        }
    }

    public q(TextView textView) {
        this.f789a = textView;
        this.f796i = new t(textView);
    }

    public static m0 c(Context context, i iVar, int i8) {
        ColorStateList h8;
        synchronized (iVar) {
            h8 = iVar.f738a.h(context, i8);
        }
        if (h8 == null) {
            return null;
        }
        m0 m0Var = new m0();
        m0Var.f779d = true;
        m0Var.f776a = h8;
        return m0Var;
    }

    public final void a(Drawable drawable, m0 m0Var) {
        if (drawable != null && m0Var != null) {
            i.e(drawable, m0Var, this.f789a.getDrawableState());
        }
    }

    public final void b() {
        m0 m0Var = this.f790b;
        TextView textView = this.f789a;
        if (!(m0Var == null && this.f791c == null && this.f792d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f790b);
            a(compoundDrawables[1], this.f791c);
            a(compoundDrawables[2], this.f792d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f793f != null || this.f794g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f793f);
            a(compoundDrawablesRelative[2], this.f794g);
        }
    }

    @SuppressLint({"NewApi"})
    public final void d(AttributeSet attributeSet, int i8) {
        String str;
        String str2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int i11;
        int resourceId;
        int i12;
        AttributeSet attributeSet2 = attributeSet;
        int i13 = i8;
        TextView textView = this.f789a;
        Context context = textView.getContext();
        i a9 = i.a();
        int[] iArr = a1.a.r;
        o0 l8 = o0.l(context, attributeSet2, iArr, i13);
        Context context2 = textView.getContext();
        TypedArray typedArray = l8.f782b;
        int[] iArr2 = x.f4957a;
        x.m.c(textView, context2, iArr, attributeSet, typedArray, i8, 0);
        int h8 = l8.h(0, -1);
        if (l8.k(3)) {
            this.f790b = c(context, a9, l8.h(3, 0));
        }
        if (l8.k(1)) {
            this.f791c = c(context, a9, l8.h(1, 0));
        }
        if (l8.k(4)) {
            this.f792d = c(context, a9, l8.h(4, 0));
        }
        if (l8.k(2)) {
            this.e = c(context, a9, l8.h(2, 0));
        }
        if (l8.k(5)) {
            this.f793f = c(context, a9, l8.h(5, 0));
        }
        if (l8.k(6)) {
            this.f794g = c(context, a9, l8.h(6, 0));
        }
        l8.m();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr3 = a1.a.F;
        if (h8 != -1) {
            o0 o0Var = new o0(context, context.obtainStyledAttributes(h8, iArr3));
            if (z10 || !o0Var.k(17)) {
                z9 = false;
                z8 = false;
            } else {
                z9 = o0Var.a(17, false);
                z8 = true;
            }
            f(context, o0Var);
            if (o0Var.k(18)) {
                str2 = o0Var.i(18);
                i12 = 16;
            } else {
                i12 = 16;
                str2 = null;
            }
            str = o0Var.k(i12) ? o0Var.i(i12) : null;
            o0Var.m();
        } else {
            z9 = false;
            z8 = false;
            str2 = null;
            str = null;
        }
        o0 o0Var2 = new o0(context, context.obtainStyledAttributes(attributeSet2, iArr3, i13, 0));
        if (!z10 && o0Var2.k(17)) {
            z9 = o0Var2.a(17, false);
            z8 = true;
        }
        if (o0Var2.k(18)) {
            str2 = o0Var2.i(18);
        }
        if (o0Var2.k(16)) {
            str = o0Var2.i(16);
        }
        String str3 = str;
        if (o0Var2.k(0) && o0Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, o0Var2);
        o0Var2.m();
        if (!z10 && z8) {
            textView.setAllCaps(z9);
        }
        Typeface typeface = this.f799l;
        if (typeface != null) {
            if (this.f798k == -1) {
                textView.setTypeface(typeface, this.f797j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            textView.setFontVariationSettings(str3);
        }
        if (str2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        int[] iArr4 = a1.a.f45s;
        t tVar = this.f796i;
        Context context3 = tVar.f832i;
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet2, iArr4, i13, 0);
        TextView textView2 = tVar.f831h;
        TypedArray typedArray2 = obtainStyledAttributes;
        Context context4 = context3;
        t tVar2 = tVar;
        x.m.c(textView2, textView2.getContext(), iArr4, attributeSet, typedArray2, i8, 0);
        TypedArray typedArray3 = typedArray2;
        if (typedArray3.hasValue(5)) {
            tVar2.f825a = typedArray3.getInt(5, 0);
        }
        float dimension = typedArray3.hasValue(4) ? typedArray3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArray3.hasValue(2) ? typedArray3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArray3.hasValue(1) ? typedArray3.getDimension(1, -1.0f) : -1.0f;
        if (typedArray3.hasValue(3) && (resourceId = typedArray3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray3.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr5 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr5[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                tVar2.f829f = t.a(iArr5);
                tVar2.c();
            }
            obtainTypedArray.recycle();
        }
        typedArray3.recycle();
        if (!tVar2.d()) {
            tVar2.f825a = 0;
        } else if (tVar2.f825a == 1) {
            if (!tVar2.f830g) {
                DisplayMetrics displayMetrics = context4.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i11 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i11 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                tVar2.e(dimension2, dimension3, dimension);
            }
            tVar2.b();
        }
        if (tVar2.f825a != 0) {
            int[] iArr6 = tVar2.f829f;
            if (iArr6.length > 0) {
                if (((float) textView.getAutoSizeStepGranularity()) != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(tVar2.f828d), Math.round(tVar2.e), Math.round(tVar2.f827c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr6, 0);
                }
            }
        }
        o0 o0Var3 = new o0(context, context.obtainStyledAttributes(attributeSet2, iArr4));
        int h9 = o0Var3.h(8, -1);
        Drawable b9 = h9 != -1 ? a9.b(context, h9) : null;
        int h10 = o0Var3.h(13, -1);
        Drawable b10 = h10 != -1 ? a9.b(context, h10) : null;
        int h11 = o0Var3.h(9, -1);
        Drawable b11 = h11 != -1 ? a9.b(context, h11) : null;
        int h12 = o0Var3.h(6, -1);
        Drawable b12 = h12 != -1 ? a9.b(context, h12) : null;
        int h13 = o0Var3.h(10, -1);
        Drawable b13 = h13 != -1 ? a9.b(context, h13) : null;
        int h14 = o0Var3.h(7, -1);
        Drawable b14 = h14 != -1 ? a9.b(context, h14) : null;
        if (b13 != null || b14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b13 == null) {
                b13 = compoundDrawablesRelative[0];
            }
            if (b10 == null) {
                b10 = compoundDrawablesRelative[1];
            }
            if (b14 == null) {
                b14 = compoundDrawablesRelative[2];
            }
            if (b12 == null) {
                b12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b13, b10, b14, b12);
        } else if (!(b9 == null && b10 == null && b11 == null && b12 == null)) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b9 == null) {
                    b9 = compoundDrawables[0];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[1];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[2];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b9, b10, b11, b12);
            } else {
                if (b10 == null) {
                    b10 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b12 == null) {
                    b12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b10, drawable2, b12);
            }
        }
        if (o0Var3.k(11)) {
            l.f(textView, o0Var3.b(11));
        }
        if (o0Var3.k(12)) {
            i9 = -1;
            l.g(textView, w.c(o0Var3.g(12, -1), (PorterDuff.Mode) null));
        } else {
            i9 = -1;
        }
        int d9 = o0Var3.d(14, i9);
        int d10 = o0Var3.d(17, i9);
        int d11 = o0Var3.d(18, i9);
        o0Var3.m();
        if (d9 != i9) {
            a1.a.j(d9);
            m.c(textView, d9);
        }
        if (d10 != i9) {
            a1.a.j(d10);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i15 = j.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (d10 > Math.abs(i15)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), d10 - i15);
            }
            i10 = -1;
        } else {
            i10 = i9;
        }
        if (d11 != i10) {
            a1.a.j(d11);
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (d11 != fontMetricsInt2) {
                textView.setLineSpacing((float) (d11 - fontMetricsInt2), 1.0f);
            }
        }
    }

    public final void e(Context context, int i8) {
        String i9;
        o0 o0Var = new o0(context, context.obtainStyledAttributes(i8, a1.a.F));
        boolean k8 = o0Var.k(17);
        TextView textView = this.f789a;
        if (k8) {
            textView.setAllCaps(o0Var.a(17, false));
        }
        if (o0Var.k(0) && o0Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, o0Var);
        if (o0Var.k(16) && (i9 = o0Var.i(16)) != null) {
            textView.setFontVariationSettings(i9);
        }
        o0Var.m();
        Typeface typeface = this.f799l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f797j);
        }
    }

    public final void f(Context context, o0 o0Var) {
        String i8;
        Typeface typeface;
        Typeface typeface2;
        this.f797j = o0Var.g(2, this.f797j);
        int g9 = o0Var.g(14, -1);
        this.f798k = g9;
        boolean z8 = false;
        if (g9 != -1) {
            this.f797j = (this.f797j & 2) | 0;
        }
        int i9 = 10;
        if (o0Var.k(10) || o0Var.k(15)) {
            this.f799l = null;
            if (o0Var.k(15)) {
                i9 = 15;
            }
            int i10 = this.f798k;
            int i11 = this.f797j;
            if (!context.isRestricted()) {
                try {
                    Typeface f9 = o0Var.f(i9, this.f797j, new a(i10, i11, new WeakReference(this.f789a)));
                    if (f9 != null) {
                        if (this.f798k != -1) {
                            f9 = Typeface.create(Typeface.create(f9, 0), this.f798k, (this.f797j & 2) != 0);
                        }
                        this.f799l = f9;
                    }
                    this.f800m = this.f799l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f799l == null && (i8 = o0Var.i(i9)) != null) {
                if (this.f798k != -1) {
                    Typeface create = Typeface.create(i8, 0);
                    int i12 = this.f798k;
                    if ((this.f797j & 2) != 0) {
                        z8 = true;
                    }
                    typeface = Typeface.create(create, i12, z8);
                } else {
                    typeface = Typeface.create(i8, this.f797j);
                }
                this.f799l = typeface;
            }
        } else if (o0Var.k(1)) {
            this.f800m = false;
            int g10 = o0Var.g(1, 1);
            if (g10 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (g10 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (g10 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f799l = typeface2;
        }
    }
}
