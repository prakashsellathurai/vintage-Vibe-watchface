package y2;

import android.graphics.Bitmap;
import k3.k;
import p2.g;
import p2.i;
import r2.v;

public final class r implements i<Bitmap, Bitmap> {

    public static final class a implements v<Bitmap> {

        /* renamed from: f  reason: collision with root package name */
        public final Bitmap f8393f;

        public a(Bitmap bitmap) {
            this.f8393f = bitmap;
        }

        public final int b() {
            return k.c(this.f8393f);
        }

        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        public final void d() {
        }

        public final Object get() {
            return this.f8393f;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g gVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }

    public final v b(Object obj, int i8, int i9, g gVar) {
        return new a((Bitmap) obj);
    }
}
