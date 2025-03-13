package y6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import k6.j;
import k6.k;
import r5.e;
import z6.c;
import z6.d;

public class b extends a {

    /* renamed from: k  reason: collision with root package name */
    public Drawable f8532k;

    /* renamed from: l  reason: collision with root package name */
    public k.a f8533l;

    /* renamed from: m  reason: collision with root package name */
    public c f8534m;

    /* renamed from: n  reason: collision with root package name */
    public d f8535n;

    public b(String str, int i8, int i9, e eVar) {
        super(str, true, i8, i9, eVar);
    }

    public final int a() {
        return this.f8533l.f5215c;
    }

    public final int b() {
        return this.f8533l.f5214b;
    }

    public final float c() {
        return this.f8533l.f5216d;
    }

    public final int d() {
        return this.f8533l.f5213a;
    }

    public final void draw(Canvas canvas) {
        this.f8532k.draw(canvas);
    }

    public void f() {
        String str = this.f8526d;
        j6.b bVar = this.f8524b;
        try {
            k d9 = bVar.d(this, str);
            d9.e = 0;
            j jVar = bVar.f5041h;
            jVar.f5207b = d9;
            this.f8532k = bVar.j(this.e, this.f8527f, jVar.c(str));
            this.f8533l = bVar.d(this, str).f5212g;
            d dVar = new d();
            dVar.f8716h = 0;
            dVar.f8708d = str;
            dVar.e = true;
            dVar.f8709f = new androidx.activity.b(10, this);
            this.f8535n = dVar;
        } catch (Exception e) {
            Log.w("DWF:AnimatedGifDrawable", e.getMessage());
        }
        Drawable drawable = this.f8532k;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            Log.w("DWF:AnimatedGifDrawable", "Couldn't load first frame for " + str);
            return;
        }
        this.f8535n.c((BitmapDrawable) drawable);
        this.f8534m = new c(bVar, this.f8523a.f7071a.getResources(), this.f8535n);
    }

    public final void g() {
        c cVar = this.f8534m;
        if (cVar != null) {
            cVar.f8713a.b();
        }
        this.f8530i = 0;
        this.f8532k = null;
    }

    public final int getAlpha() {
        return this.f8532k.getAlpha();
    }

    public final int getOpacity() {
        return this.f8532k.getOpacity();
    }

    public final void h() {
        String str = this.f8526d;
        j6.b bVar = this.f8524b;
        this.f8530i = 0;
        try {
            k d9 = bVar.d(this, str);
            d9.e = 0;
            j jVar = bVar.f5041h;
            jVar.f5207b = d9;
            BitmapDrawable j8 = bVar.j(this.e, this.f8527f, jVar.c(str));
            this.f8532k = j8;
            if (j8 != null) {
                this.f8535n.c(j8);
            }
        } catch (Exception unused) {
            Log.w("DWF:AnimatedGifDrawable", "Couldn't load first frame for " + str);
        }
    }

    public final void i(float f9) {
        super.i(f9);
        d dVar = this.f8535n;
        dVar.f8716h = this.f8530i;
        dVar.e = true;
        this.f8532k = this.f8534m.f8713a.a();
    }

    public final void setAlpha(int i8) {
        this.f8532k.setAlpha(i8);
    }

    public final void setBounds(int i8, int i9, int i10, int i11) {
        super.setBounds(i8, i9, i10, i11);
        this.f8532k.setBounds(i8, i9, i10, i11);
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f8532k.setBounds(rect);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8532k.setColorFilter(colorFilter);
    }
}
