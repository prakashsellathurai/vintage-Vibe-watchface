package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.health.services.client.R;
import d0.b;
import d5.a;
import j0.x;
import k3.j;
import u4.k;
import y4.f;

public class MaterialToolbar extends Toolbar {
    public Integer L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, -2146303256), attributeSet, 0);
        int i8 = 0;
        Context context2 = getContext();
        TypedArray d9 = k.d(context2, attributeSet, a1.a.f14b0, R.attr.toolbarStyle, -2146303256, new int[0]);
        if (d9.hasValue(0)) {
            setNavigationIconTint(d9.getColor(0, -1));
        }
        d9.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i8));
            fVar.h(context2);
            int[] iArr = x.f4957a;
            fVar.i(x.h.i(this));
            x.c.q(this, fVar);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            j.b0(this, (f) background);
        }
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        Drawable background = getBackground();
        if (background instanceof f) {
            ((f) background).i(f9);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (!(drawable == null || (num = this.L) == null)) {
            b.g(drawable, num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i8) {
        this.L = Integer.valueOf(i8);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
