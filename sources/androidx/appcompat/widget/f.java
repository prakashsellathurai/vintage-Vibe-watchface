package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.health.services.client.R;

public class f extends Button {

    /* renamed from: a  reason: collision with root package name */
    public final e f712a;

    /* renamed from: b  reason: collision with root package name */
    public final q f713b;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        l0.a(context);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f712a = eVar;
        eVar.d(attributeSet, i8);
        q qVar = new q(this);
        this.f713b = qVar;
        qVar.d(attributeSet, i8);
        qVar.b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f712a;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f713b;
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

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f712a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f712a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        m0 m0Var = this.f713b.f795h;
        if (m0Var != null) {
            return m0Var.f776a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        m0 m0Var = this.f713b.f795h;
        if (m0Var != null) {
            return m0Var.f777b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        q qVar = this.f713b;
        if (qVar != null) {
            qVar.getClass();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
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
        e eVar = this.f712a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f712a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setSupportAllCaps(boolean z8) {
        q qVar = this.f713b;
        if (qVar != null) {
            qVar.f789a.setAllCaps(z8);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f712a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f712a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        q qVar = this.f713b;
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
        q qVar = this.f713b;
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

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        q qVar = this.f713b;
        if (qVar != null) {
            qVar.e(context, i8);
        }
    }

    public final void setTextSize(int i8, float f9) {
        super.setTextSize(i8, f9);
    }
}
