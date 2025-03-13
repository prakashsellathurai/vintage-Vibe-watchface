package s2;

import android.graphics.Bitmap;

public class d implements c {
    public final void a(int i8) {
    }

    public final void b() {
    }

    public final Bitmap c(int i8, int i9, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i9, config);
    }

    public final Bitmap d(int i8, int i9, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i9, config);
    }

    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
