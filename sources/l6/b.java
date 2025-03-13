package l6;

import android.graphics.Bitmap;
import l6.d;

public final class b extends d {

    public static class a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f5321a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5322b;

        public a(Bitmap bitmap) {
            this.f5321a = bitmap;
            this.f5322b = bitmap.getByteCount();
        }
    }

    public b(String str, Bitmap bitmap, float f9) {
        super(str, new a(bitmap), f9);
    }
}
