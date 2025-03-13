package c7;

import android.graphics.Color;
import android.graphics.Typeface;
import b6.a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Predicate;
import o6.q;

public final class i extends q {

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2803o;

    /* renamed from: p  reason: collision with root package name */
    public String f2804p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2805q;
    public final int r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2806s;

    /* renamed from: t  reason: collision with root package name */
    public final float f2807t;

    /* renamed from: u  reason: collision with root package name */
    public Color f2808u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f2809v;

    public i(q qVar, float f9, int i8, int i9, int i10) {
        super(qVar);
        this.f2809v = null;
        this.f2803o = true;
        this.f2807t = f9;
        this.f2805q = i8;
        this.r = i9;
        this.f2806s = i10;
        this.f2808u = Color.valueOf(-1);
    }

    public i(q qVar, String str, float f9, int i8, int i9, int i10) {
        super(qVar);
        this.f2809v = null;
        this.f2804p = str;
        this.f2803o = false;
        this.f2807t = f9;
        this.f2805q = i8;
        this.r = i9;
        this.f2806s = i10;
        this.f2808u = Color.valueOf(-1);
    }

    public final void D() {
        Typeface typeface;
        this.f2830n.getClass();
        int h8 = a.h(this.r);
        boolean c9 = a.c(this.f2805q);
        if (!this.f2803o) {
            String str = this.f2804p;
            int i8 = this.f2806s;
            if (!"normal".equals(a.i(i8))) {
                str = (str + "-") + a.i(i8);
            }
            if (this.f2830n.h(str)) {
                this.f2804p = str;
                typeface = this.f2830n.b(str);
            } else if (this.f2830n.h(this.f2804p)) {
                typeface = this.f2830n.b(this.f2804p);
            } else {
                this.f2804p = str;
                typeface = Typeface.create(str, 0);
            }
            this.f2809v = typeface;
        }
        if (this.f2809v == null) {
            this.f2809v = Typeface.DEFAULT;
        }
        this.f2809v = Typeface.create(this.f2809v, h8, c9);
    }

    public final void E(o oVar) {
        if (this.f2828l) {
            this.f2830n.getClass();
            Typeface typeface = this.f2809v;
            if (typeface != null) {
                oVar.setTypeface(typeface);
            }
            oVar.setTextSize(this.f2807t);
            oVar.f2823b = this.f2804p;
            oVar.e = true;
            oVar.setColor(this.f2808u.toArgb());
        }
    }

    public final String q() {
        int argb = (this.f2808u.toArgb() >> 24) & 255;
        int argb2 = (this.f2808u.toArgb() >> 16) & 255;
        int argb3 = (this.f2808u.toArgb() >> 8) & 255;
        int argb4 = this.f2808u.toArgb() & 255;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[6];
        objArr[0] = this.f2804p;
        n nVar = this.f2826j;
        objArr[1] = nVar == null ? null : nVar.f2818f;
        objArr[2] = Integer.valueOf(argb2);
        objArr[3] = Integer.valueOf(argb3);
        objArr[4] = Integer.valueOf(argb4);
        objArr[5] = Integer.valueOf(argb);
        return String.format(locale, "%s: %s rgba(%d, %d, %d, %d)", objArr);
    }

    public final ArrayList u(a1.a aVar, Predicate predicate, o oVar) {
        o oVar2;
        if (oVar.e) {
            oVar2 = new o(oVar);
            aVar.K(this, oVar2);
        } else {
            aVar.K(this, oVar);
            oVar2 = new o(oVar);
        }
        return B(aVar, predicate, oVar2);
    }
}
