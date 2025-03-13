package y2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import s2.c;
import s2.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8365a = new a();

    public class a extends d {
        public final void e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static c a(c cVar, Drawable drawable, int i8, int i9) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z8 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i8 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                bitmap = null;
                z8 = true;
            } else if (i9 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i8 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i9 = current.getIntrinsicHeight();
                }
                Lock lock = q.f8392b;
                lock.lock();
                Bitmap d9 = cVar.d(i8, i9, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d9);
                    current.setBounds(0, 0, i8, i9);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = d9;
                    z8 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                bitmap = null;
                z8 = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            bitmap = null;
            z8 = true;
        } else {
            bitmap = null;
        }
        if (!z8) {
            cVar = f8365a;
        }
        return c.e(bitmap, cVar);
    }
}
