package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.health.services.client.R;

public class d extends AutoCompleteTextView {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f699c = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final e f700a;

    /* renamed from: b  reason: collision with root package name */
    public final q f701b;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        l0.a(context);
        k0.a(this, getContext());
        o0 l8 = o0.l(getContext(), attributeSet, f699c, R.attr.autoCompleteTextViewStyle);
        if (l8.k(0)) {
            setDropDownBackgroundDrawable(l8.e(0));
        }
        l8.m();
        e eVar = new e(this);
        this.f700a = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        q qVar = new q(this);
        this.f701b = qVar;
        qVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        qVar.b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f700a;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f701b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f700a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f700a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.D(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f700a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f700a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(g.a.a(getContext(), i8));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f700a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f700a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        q qVar = this.f701b;
        if (qVar != null) {
            qVar.e(context, i8);
        }
    }
}
