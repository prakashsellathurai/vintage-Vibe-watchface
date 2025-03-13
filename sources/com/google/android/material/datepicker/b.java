package com.google.android.material.datepicker;

import a1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import j0.x;
import v4.c;
import y4.f;
import y4.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3226a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f3227b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3228c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f3229d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3230f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i8, i iVar, Rect rect) {
        a.j(rect.left);
        a.j(rect.top);
        a.j(rect.right);
        a.j(rect.bottom);
        this.f3226a = rect;
        this.f3227b = colorStateList2;
        this.f3228c = colorStateList;
        this.f3229d = colorStateList3;
        this.e = i8;
        this.f3230f = iVar;
    }

    public static b a(Context context, int i8) {
        if (i8 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, a.X);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList a9 = c.a(context, obtainStyledAttributes, 4);
            ColorStateList a10 = c.a(context, obtainStyledAttributes, 9);
            ColorStateList a11 = c.a(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            i iVar = new i(i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new y4.a((float) 0)));
            obtainStyledAttributes.recycle();
            return new b(a9, a10, a11, dimensionPixelSize, iVar, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    public final void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        i iVar = this.f3230f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.j(this.f3228c);
        fVar.f8412a.f8442k = (float) this.e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f8412a;
        ColorStateList colorStateList = bVar.f8436d;
        ColorStateList colorStateList2 = this.f3229d;
        if (colorStateList != colorStateList2) {
            bVar.f8436d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f3227b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f3226a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        int[] iArr = x.f4957a;
        x.c.q(textView, insetDrawable);
    }
}
