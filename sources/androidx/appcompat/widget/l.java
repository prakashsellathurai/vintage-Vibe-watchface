package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import j0.x;
import n0.e;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f771a;

    /* renamed from: b  reason: collision with root package name */
    public m0 f772b;

    public l(ImageView imageView) {
        this.f771a = imageView;
    }

    public final void a() {
        m0 m0Var;
        ImageView imageView = this.f771a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = w.f833a;
        }
        if (drawable != null && (m0Var = this.f772b) != null) {
            i.e(drawable, m0Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i8) {
        int h8;
        ImageView imageView = this.f771a;
        Context context = imageView.getContext();
        int[] iArr = a.f42q;
        o0 l8 = o0.l(context, attributeSet, iArr, i8);
        Context context2 = imageView.getContext();
        TypedArray typedArray = l8.f782b;
        int[] iArr2 = x.f4957a;
        x.m.c(imageView, context2, iArr, attributeSet, typedArray, i8, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable != null || (h8 = l8.h(1, -1)) == -1 || (drawable = g.a.a(imageView.getContext(), h8)) == null)) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = w.f833a;
            }
            if (l8.k(2)) {
                e.c(imageView, l8.b(2));
            }
            if (l8.k(3)) {
                e.d(imageView, w.c(l8.g(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            l8.m();
        }
    }
}
