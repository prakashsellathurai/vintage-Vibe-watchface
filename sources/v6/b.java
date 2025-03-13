package v6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import o6.m;
import o6.q;
import o6.r;
import r5.f;
import x6.g;
import x6.h;

public class b extends r implements m {
    public final Paint F;
    public Drawable G;
    public h H;
    public final boolean I;
    public final ArrayList J;

    public b(q qVar) {
        super(qVar);
        this.F = new Paint(3);
        this.G = null;
        this.J = new ArrayList();
        this.I = true;
    }

    public b(q qVar, boolean z8) {
        super(qVar);
        this.F = new Paint(3);
        this.G = null;
        this.J = new ArrayList();
        this.I = z8;
    }

    public final boolean H(Canvas canvas) {
        RectF D = D();
        Drawable B = this.H.B((int) D.width(), (int) D.height());
        this.G = B;
        h hVar = this.H;
        if ((hVar instanceof g) && ((g) hVar).f8191q) {
            this.f6149z = true;
        }
        if (!hVar.f8196j) {
            return true;
        }
        if (B == null) {
            D().toShortString();
            return true;
        }
        boolean z8 = this.f6148x;
        Paint paint = this.f6137k;
        Matrix matrix = this.f6139m;
        if (z8) {
            if (this.f6149z) {
                L(canvas.getWidth(), canvas.getHeight());
                if (T(this.G) != null) {
                    this.f6147v.drawBitmap(T(this.G), matrix, this.F);
                }
                this.f6149z = false;
            }
            canvas.drawBitmap(this.w, 0.0f, 0.0f, paint);
        } else {
            Bitmap T = T(B);
            if (T != null) {
                canvas.drawBitmap(T, matrix, paint);
            }
        }
        return true;
    }

    public final void Q() {
        ColorMatrix colorMatrix = new ColorMatrix(this.f6140n);
        this.J.forEach(new f(19, colorMatrix));
        this.f6137k.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final Bitmap T(Drawable drawable) {
        RectF D = D();
        int width = (int) D.width();
        int height = (int) D.height();
        if (width <= 0 || height <= 0) {
            return null;
        }
        drawable.setBounds(new Rect(0, 0, width, height));
        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == width && drawable.getIntrinsicHeight() == height) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final void c() {
        this.f6149z = true;
        K();
    }

    public void r() {
        super.r();
        this.H.r();
        this.G = null;
    }
}
