package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.health.services.client.R;
import g.a;

public class g extends CheckBox {

    /* renamed from: a  reason: collision with root package name */
    public final h f721a;

    /* renamed from: b  reason: collision with root package name */
    public final e f722b;

    /* renamed from: c  reason: collision with root package name */
    public final q f723c;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        l0.a(context);
        k0.a(this, getContext());
        h hVar = new h(this);
        this.f721a = hVar;
        hVar.b(attributeSet, i8);
        e eVar = new e(this);
        this.f722b = eVar;
        eVar.d(attributeSet, i8);
        q qVar = new q(this);
        this.f723c = qVar;
        qVar.d(attributeSet, i8);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f722b;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f723c;
        if (qVar != null) {
            qVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f721a;
        if (hVar != null) {
            hVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f722b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f722b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f721a;
        if (hVar != null) {
            return hVar.f725b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f721a;
        if (hVar != null) {
            return hVar.f726c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f722b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f722b;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setButtonDrawable(int i8) {
        setButtonDrawable(a.a(getContext(), i8));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f721a;
        if (hVar == null) {
            return;
        }
        if (hVar.f728f) {
            hVar.f728f = false;
            return;
        }
        hVar.f728f = true;
        hVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f722b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f722b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f721a;
        if (hVar != null) {
            hVar.f725b = colorStateList;
            hVar.f727d = true;
            hVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f721a;
        if (hVar != null) {
            hVar.f726c = mode;
            hVar.e = true;
            hVar.a();
        }
    }
}
