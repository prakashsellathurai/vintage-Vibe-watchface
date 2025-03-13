package v4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.fragment.app.u;
import b0.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f7932a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f7933b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7934c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7935d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f7936f;

    /* renamed from: g  reason: collision with root package name */
    public final float f7937g;

    /* renamed from: h  reason: collision with root package name */
    public final float f7938h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7939i;

    /* renamed from: j  reason: collision with root package name */
    public final float f7940j;

    /* renamed from: k  reason: collision with root package name */
    public float f7941k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7942l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7943m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f7944n;

    public class a extends b.C0027b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f7945a;

        public a(u uVar) {
            this.f7945a = uVar;
        }

        public final void c(int i8) {
            d.this.f7943m = true;
            this.f7945a.f(i8);
        }

        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f7944n = Typeface.create(typeface, dVar.f7935d);
            dVar.f7943m = true;
            this.f7945a.g(dVar.f7944n, false);
        }
    }

    public d(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, a1.a.f25h0);
        this.f7941k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f7932a = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f7935d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i9 = !obtainStyledAttributes.hasValue(15) ? 10 : 15;
        this.f7942l = obtainStyledAttributes.getResourceId(i9, 0);
        this.f7934c = obtainStyledAttributes.getString(i9);
        obtainStyledAttributes.getBoolean(17, false);
        this.f7933b = c.a(context, obtainStyledAttributes, 6);
        this.f7936f = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f7937g = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f7938h = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i8, a1.a.Z);
        this.f7939i = obtainStyledAttributes2.hasValue(0);
        this.f7940j = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f7944n;
        int i8 = this.f7935d;
        if (typeface == null && (str = this.f7934c) != null) {
            this.f7944n = Typeface.create(str, i8);
        }
        if (this.f7944n == null) {
            int i9 = this.e;
            this.f7944n = i9 != 1 ? i9 != 2 ? i9 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f7944n = Typeface.create(this.f7944n, i8);
        }
    }

    public final void b(Context context, u uVar) {
        a();
        int i8 = this.f7942l;
        if (i8 == 0) {
            this.f7943m = true;
        }
        if (this.f7943m) {
            uVar.g(this.f7944n, true);
            return;
        }
        try {
            a aVar = new a(uVar);
            Object obj = b.f2504a;
            if (context.isRestricted()) {
                aVar.a(-4);
                return;
            }
            b.a(context, i8, new TypedValue(), 0, aVar, false);
        } catch (Resources.NotFoundException unused) {
            this.f7943m = true;
            uVar.f(1);
        } catch (Exception unused2) {
            this.f7943m = true;
            uVar.f(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, u uVar) {
        a();
        d(textPaint, this.f7944n);
        b(context, new e(this, textPaint, uVar));
        ColorStateList colorStateList = this.f7932a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f7933b;
        textPaint.setShadowLayer(this.f7938h, this.f7936f, this.f7937g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i8 = (~typeface.getStyle()) & this.f7935d;
        textPaint.setFakeBoldText((i8 & 1) != 0);
        textPaint.setTextSkewX((i8 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f7941k);
        if (this.f7939i) {
            textPaint.setLetterSpacing(this.f7940j);
        }
    }
}
