package c7;

import android.graphics.Color;
import java.util.Locale;
import o6.q;

public final class a extends q {

    /* renamed from: o  reason: collision with root package name */
    public final j f2790o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2791p;

    /* renamed from: q  reason: collision with root package name */
    public final float f2792q;
    public Color r = Color.valueOf(-1);

    public a(q qVar, String str, float f9, j jVar) {
        super(qVar);
        this.f2791p = str;
        this.f2792q = f9;
        this.f2790o = jVar;
    }

    public final void D() {
    }

    public final void E(o oVar) {
        if (this.f2828l) {
            oVar.setTextSize(this.f2792q);
            String str = this.f2791p;
            oVar.f2823b = str;
            oVar.e = true;
            j jVar = this.f2790o;
            oVar.f2822a = jVar;
            oVar.f2824c = jVar.b(str);
            oVar.setColor(this.r.toArgb());
        }
    }

    public final String q() {
        int argb = (this.r.toArgb() >> 24) & 255;
        int argb2 = (this.r.toArgb() >> 16) & 255;
        int argb3 = (this.r.toArgb() >> 8) & 255;
        int argb4 = this.r.toArgb() & 255;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[6];
        objArr[0] = this.f2791p;
        n nVar = this.f2826j;
        objArr[1] = nVar == null ? null : nVar.f2818f;
        objArr[2] = Integer.valueOf(argb2);
        objArr[3] = Integer.valueOf(argb3);
        objArr[4] = Integer.valueOf(argb4);
        objArr[5] = Integer.valueOf(argb);
        return String.format(locale, "%s: %s rgba(%d, %d, %d, %d)", objArr);
    }
}
