package y6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.ArrayList;
import r5.e;
import z6.b;
import z6.c;

public final class d extends a {

    /* renamed from: k  reason: collision with root package name */
    public int f8538k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f8539l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f8540m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public c f8541n;

    /* renamed from: o  reason: collision with root package name */
    public b f8542o;

    public d(String str, boolean z8, int i8, int i9, e eVar) {
        super(str, z8, i8, i9, eVar);
    }

    public final int a() {
        return this.f8527f;
    }

    public final int b() {
        return this.e;
    }

    public final float c() {
        return ((float) d()) * 66.0f;
    }

    public final int d() {
        return this.f8540m.size() * this.f8538k;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8539l;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void f() {
        j6.b bVar = this.f8524b;
        String str = this.f8526d;
        int i8 = this.e;
        int i9 = this.f8527f;
        BitmapDrawable k8 = bVar.k(str, i8, i9);
        this.f8539l = k8;
        if (this.f8525c) {
            b bVar2 = new b();
            bVar2.f8708d = str;
            bVar2.e = true;
            bVar2.f8709f = new c(this, 0);
            this.f8542o = bVar2;
        } else {
            z6.e eVar = new z6.e();
            eVar.f8717h = i8;
            eVar.f8718i = i9;
            eVar.f8708d = str;
            eVar.e = true;
            eVar.f8709f = new c(this, 1);
            this.f8542o = eVar;
        }
        if (k8 != null) {
            this.f8542o.c(k8);
            this.f8541n = new c(bVar, this.f8523a.f7071a.getResources(), this.f8542o);
            return;
        }
        Log.w("DWF:AnimatedImageDrawable", "Unable to load file " + str);
    }

    public final void g() {
        this.f8539l = null;
        this.f8530i = 0;
        c cVar = this.f8541n;
        if (cVar != null) {
            cVar.f8713a.b();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f8539l;
        if (drawable == null) {
            return 0;
        }
        return drawable.getAlpha();
    }

    public final int getOpacity() {
        Drawable drawable = this.f8539l;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public final void h() {
        this.f8530i = 0;
        BitmapDrawable k8 = this.f8524b.k(this.f8526d, this.e, this.f8527f);
        this.f8539l = k8;
        if (k8 != null) {
            this.f8542o.c(k8);
        }
    }

    public final void i(float f9) {
        super.i(f9);
        int size = this.f8530i % this.f8540m.size();
        b bVar = this.f8542o;
        bVar.f8708d = (String) this.f8540m.get(size);
        bVar.e = true;
        this.f8539l = this.f8541n.f8713a.a();
    }

    public final void setAlpha(int i8) {
        Drawable drawable = this.f8539l;
        if (drawable != null) {
            drawable.setAlpha(i8);
        }
    }

    public final void setBounds(int i8, int i9, int i10, int i11) {
        super.setBounds(i8, i9, i10, i11);
        Drawable drawable = this.f8539l;
        if (drawable != null) {
            drawable.setBounds(i8, i9, i10, i11);
        }
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        Drawable drawable = this.f8539l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8539l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
