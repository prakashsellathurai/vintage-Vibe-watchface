package y2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import k3.j;
import k3.k;
import r2.s;
import r2.v;

public final class c implements v, s {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8339f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8340g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f8341h;

    public c(Resources resources, v vVar) {
        j.l(resources);
        this.f8340g = resources;
        j.l(vVar);
        this.f8341h = vVar;
    }

    public static c e(Bitmap bitmap, s2.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, cVar);
    }

    public final void a() {
        switch (this.f8339f) {
            case 0:
                ((Bitmap) this.f8340g).prepareToDraw();
                return;
            default:
                v vVar = (v) this.f8341h;
                if (vVar instanceof s) {
                    ((s) vVar).a();
                    return;
                }
                return;
        }
    }

    public final int b() {
        switch (this.f8339f) {
            case 0:
                return k.c((Bitmap) this.f8340g);
            default:
                return ((v) this.f8341h).b();
        }
    }

    public final Class c() {
        switch (this.f8339f) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public final void d() {
        int i8 = this.f8339f;
        Object obj = this.f8341h;
        switch (i8) {
            case 0:
                ((s2.c) obj).e((Bitmap) this.f8340g);
                return;
            default:
                ((v) obj).d();
                return;
        }
    }

    public final Object get() {
        int i8 = this.f8339f;
        Object obj = this.f8340g;
        switch (i8) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((v) this.f8341h).get());
        }
    }

    public c(Bitmap bitmap, s2.c cVar) {
        if (bitmap != null) {
            this.f8340g = bitmap;
            if (cVar != null) {
                this.f8341h = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }
}
