package y6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j6.b;
import r5.e;

public abstract class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final e f8523a;

    /* renamed from: b  reason: collision with root package name */
    public final b f8524b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8525c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8526d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8527f;

    /* renamed from: g  reason: collision with root package name */
    public BitmapDrawable f8528g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8529h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f8530i = 0;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f8531j;

    public a(String str, boolean z8, int i8, int i9, e eVar) {
        this.f8526d = str;
        this.f8525c = z8;
        this.f8523a = eVar;
        this.f8524b = eVar.f7078i;
        this.e = i8;
        this.f8527f = i9;
    }

    public abstract int a();

    public abstract int b();

    public abstract float c();

    public abstract int d();

    public final void e() {
        if (this.f8531j != null) {
            boolean z8 = true;
            if (this.f8530i + 1 != d()) {
                z8 = false;
            }
            if (z8) {
                this.f8531j.run();
            }
        }
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public void i(float f9) {
        double floor = Math.floor((double) (f9 * ((float) d())));
        double d9 = (double) (d() - 1);
        if (floor < 0.0d) {
            floor = 0.0d;
        } else if (floor > d9) {
            floor = d9;
        }
        this.f8530i = (int) floor;
    }
}
