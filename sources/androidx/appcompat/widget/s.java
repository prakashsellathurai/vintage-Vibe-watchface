package androidx.appcompat.widget;

import a1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c0.c;
import c0.d;
import h0.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n0.k;
import n0.l;
import n0.m;

public class s extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public final e f821a;

    /* renamed from: b  reason: collision with root package name */
    public final q f822b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f823c;

    /* renamed from: d  reason: collision with root package name */
    public Future<b> f824d;

    public s() {
        throw null;
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        l0.a(context);
        this.f823c = false;
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f821a = eVar;
        eVar.d(attributeSet, i8);
        q qVar = new q(this);
        this.f822b = qVar;
        qVar.d(attributeSet, i8);
        qVar.b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f821a;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f821a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f821a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        m0 m0Var = this.f822b.f795h;
        if (m0Var != null) {
            return m0Var.f776a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        m0 m0Var = this.f822b.f795h;
        if (m0Var != null) {
            return m0Var.f777b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<b> future = this.f824d;
        if (future != null) {
            try {
                this.f824d = null;
                future.get().getClass();
                setText((CharSequence) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public b.a getTextMetricsParamsCompat() {
        return new b.a(m.b(this));
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f822b.getClass();
        a.D(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.getClass();
        }
    }

    public void onMeasure(int i8, int i9) {
        Future<b> future = this.f824d;
        if (future != null) {
            try {
                this.f824d = null;
                future.get().getClass();
                setText((CharSequence) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i8, i9);
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
    }

    public void setAutoSizeTextTypeWithDefaults(int i8) {
        super.setAutoSizeTextTypeWithDefaults(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f821a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f821a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a9 = i8 != 0 ? g.a.a(context, i8) : null;
        Drawable a10 = i9 != 0 ? g.a.a(context, i9) : null;
        Drawable a11 = i10 != 0 ? g.a.a(context, i10) : null;
        if (i11 != 0) {
            drawable = g.a.a(context, i11);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a9, a10, a11, drawable);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a9 = i8 != 0 ? g.a.a(context, i8) : null;
        Drawable a10 = i9 != 0 ? g.a.a(context, i9) : null;
        Drawable a11 = i10 != 0 ? g.a.a(context, i10) : null;
        if (i11 != 0) {
            drawable = g.a.a(context, i11);
        }
        setCompoundDrawablesWithIntrinsicBounds(a9, a10, a11, drawable);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setFirstBaselineToTopHeight(int i8) {
        super.setFirstBaselineToTopHeight(i8);
    }

    public void setLastBaselineToBottomHeight(int i8) {
        super.setLastBaselineToBottomHeight(i8);
    }

    public void setLineHeight(int i8) {
        a.j(i8);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i8 != fontMetricsInt) {
            setLineSpacing((float) (i8 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(b bVar) {
        bVar.getClass();
        setText((CharSequence) null);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f821a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f821a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        q qVar = this.f822b;
        if (qVar.f795h == null) {
            qVar.f795h = new m0();
        }
        m0 m0Var = qVar.f795h;
        m0Var.f776a = colorStateList;
        m0Var.f779d = colorStateList != null;
        qVar.f790b = m0Var;
        qVar.f791c = m0Var;
        qVar.f792d = m0Var;
        qVar.e = m0Var;
        qVar.f793f = m0Var;
        qVar.f794g = m0Var;
        qVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        q qVar = this.f822b;
        if (qVar.f795h == null) {
            qVar.f795h = new m0();
        }
        m0 m0Var = qVar.f795h;
        m0Var.f777b = mode;
        m0Var.f778c = mode != null;
        qVar.f790b = m0Var;
        qVar.f791c = m0Var;
        qVar.f792d = m0Var;
        qVar.e = m0Var;
        qVar.f793f = m0Var;
        qVar.f794g = m0Var;
        qVar.b();
    }

    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.e(context, i8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<b> future) {
        this.f824d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i8;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f4726b;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i8 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i8 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i8 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i8 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i8 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i8 = 7;
            }
            k.h(this, i8);
            getPaint().set(aVar.f4725a);
            l.e(this, aVar.f4727c);
            l.h(this, aVar.f4728d);
        }
        i8 = 1;
        k.h(this, i8);
        getPaint().set(aVar.f4725a);
        l.e(this, aVar.f4727c);
        l.h(this, aVar.f4728d);
    }

    public final void setTextSize(int i8, float f9) {
        super.setTextSize(i8, f9);
    }

    public final void setTypeface(Typeface typeface, int i8) {
        Typeface typeface2;
        if (!this.f823c) {
            if (typeface == null || i8 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                d dVar = c.f2638a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i8);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f823c = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i8);
            } finally {
                this.f823c = false;
            }
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f822b;
        if (qVar != null) {
            qVar.b();
        }
    }
}
