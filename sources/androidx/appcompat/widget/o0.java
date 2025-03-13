package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.q;
import b0.b;
import g.a;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f781a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f782b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f783c;

    public o0(Context context, TypedArray typedArray) {
        this.f781a = context;
        this.f782b = typedArray;
    }

    public static o0 l(Context context, AttributeSet attributeSet, int[] iArr, int i8) {
        return new o0(context, context.obtainStyledAttributes(attributeSet, iArr, i8, 0));
    }

    public final boolean a(int i8, boolean z8) {
        return this.f782b.getBoolean(i8, z8);
    }

    public final ColorStateList b(int i8) {
        int resourceId;
        TypedArray typedArray = this.f782b;
        if (typedArray.hasValue(i8) && (resourceId = typedArray.getResourceId(i8, 0)) != 0) {
            Object obj = a.f4440a;
            ColorStateList colorStateList = this.f781a.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i8);
    }

    public final int c(int i8, int i9) {
        return this.f782b.getDimensionPixelOffset(i8, i9);
    }

    public final int d(int i8, int i9) {
        return this.f782b.getDimensionPixelSize(i8, i9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f782b
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x0016
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x0016
            android.content.Context r2 = r2.f781a
            android.graphics.drawable.Drawable r2 = g.a.a(r2, r1)
            return r2
        L_0x0016:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.e(int):android.graphics.drawable.Drawable");
    }

    public final Typeface f(int i8, int i9, q.a aVar) {
        int resourceId = this.f782b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f783c == null) {
            this.f783c = new TypedValue();
        }
        TypedValue typedValue = this.f783c;
        Object obj = b.f2504a;
        Context context = this.f781a;
        if (context.isRestricted()) {
            return null;
        }
        return b.a(context, resourceId, typedValue, i9, aVar, true);
    }

    public final int g(int i8, int i9) {
        return this.f782b.getInt(i8, i9);
    }

    public final int h(int i8, int i9) {
        return this.f782b.getResourceId(i8, i9);
    }

    public final String i(int i8) {
        return this.f782b.getString(i8);
    }

    public final CharSequence j(int i8) {
        return this.f782b.getText(i8);
    }

    public final boolean k(int i8) {
        return this.f782b.hasValue(i8);
    }

    public final void m() {
        this.f782b.recycle();
    }
}
