package c7;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import o6.q;

public final class k extends q {

    /* renamed from: o  reason: collision with root package name */
    public final String f2810o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2811p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2812q;
    public final int r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2813s;

    /* renamed from: t  reason: collision with root package name */
    public int f2814t = -1;

    public k(q qVar, int i8, int i9, int i10, int i11, String str) {
        super(qVar);
        this.f2811p = i8;
        this.f2812q = i9;
        this.r = i10;
        this.f2813s = i11;
        this.f2810o = str;
    }

    public final void D() {
        H(this.f2830n.k(this.f2810o, this.f2811p, this.f2812q));
    }

    public final void H(Drawable drawable) {
        if (drawable != null) {
            int i8 = -this.r;
            int i9 = (this.f2811p + i8) - this.f2813s;
            int i10 = this.f2812q;
            h hVar = new h(drawable, new Rect(i8, 0, i9, i10));
            hVar.f2802k = Integer.valueOf(this.f2814t);
            this.f2826j = hVar;
            String str = this.f6174b;
            Objects.toString(this.f2826j);
            new Rect(i8, 0, i9, i10).toString();
        }
    }

    public final String q() {
        int i8 = this.f2814t;
        return String.format("%s: (%d, %d, %d, %d) rgba(%d, %d, %d, %d)", new Object[]{this.f2810o, Integer.valueOf(this.f2811p), Integer.valueOf(this.f2812q), Integer.valueOf(this.r), Integer.valueOf(this.f2813s), Integer.valueOf((i8 >> 16) & 255), Integer.valueOf((i8 >> 8) & 255), Integer.valueOf(i8 & 255), Integer.valueOf((i8 >> 24) & 255)});
    }
}
