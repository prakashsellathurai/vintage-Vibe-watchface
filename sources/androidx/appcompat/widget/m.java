package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.a;

public class m extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final e f774a;

    /* renamed from: b  reason: collision with root package name */
    public final l f775b;

    public m() {
        throw null;
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        l0.a(context);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f774a = eVar;
        eVar.d(attributeSet, i8);
        l lVar = new l(this);
        this.f775b = lVar;
        lVar.b(attributeSet, i8);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f774a;
        if (eVar != null) {
            eVar.a();
        }
        l lVar = this.f775b;
        if (lVar != null) {
            lVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f774a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f774a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        m0 m0Var;
        l lVar = this.f775b;
        if (lVar == null || (m0Var = lVar.f772b) == null) {
            return null;
        }
        return m0Var.f776a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        m0 m0Var;
        l lVar = this.f775b;
        if (lVar == null || (m0Var = lVar.f772b) == null) {
            return null;
        }
        return m0Var.f777b;
    }

    public final boolean hasOverlappingRendering() {
        return ((this.f775b.f771a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f774a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f774a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f775b;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f775b;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageResource(int i8) {
        Drawable drawable;
        l lVar = this.f775b;
        if (lVar != null) {
            ImageView imageView = lVar.f771a;
            if (i8 != 0) {
                drawable = a.a(imageView.getContext(), i8);
                if (drawable != null) {
                    Rect rect = w.f833a;
                }
            } else {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            lVar.a();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f775b;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f774a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f774a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f775b;
        if (lVar != null) {
            if (lVar.f772b == null) {
                lVar.f772b = new m0();
            }
            m0 m0Var = lVar.f772b;
            m0Var.f776a = colorStateList;
            m0Var.f779d = true;
            lVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f775b;
        if (lVar != null) {
            if (lVar.f772b == null) {
                lVar.f772b = new m0();
            }
            m0 m0Var = lVar.f772b;
            m0Var.f777b = mode;
            m0Var.f778c = true;
            lVar.a();
        }
    }
}
