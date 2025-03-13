package g2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.i0;
import b2.m;
import c2.b;
import java.io.IOException;
import k2.c;
import k2.g;
import y1.l;
import y1.n;
import y1.q;
import z1.a;

public final class d extends b {
    public final Rect A = new Rect();
    public m B;
    public final Paint y = new a(3);

    /* renamed from: z  reason: collision with root package name */
    public final Rect f4529z = new Rect();

    public d(l lVar, e eVar) {
        super(lVar, eVar);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        Bitmap r = r();
        if (r != null) {
            rectF.set(0.0f, 0.0f, ((float) r.getWidth()) * g.c(), ((float) r.getHeight()) * g.c());
            this.f4517l.mapRect(rectF);
        }
    }

    public final void h(i0 i0Var, Object obj) {
        super.h(i0Var, obj);
        if (obj != q.E) {
            return;
        }
        if (i0Var == null) {
            this.B = null;
        } else {
            this.B = new m(i0Var, null);
        }
    }

    public final void k(Canvas canvas, Matrix matrix, int i8) {
        Bitmap r = r();
        if (r != null && !r.isRecycled()) {
            float c9 = g.c();
            Paint paint = this.y;
            paint.setAlpha(i8);
            m mVar = this.B;
            if (mVar != null) {
                paint.setColorFilter((ColorFilter) mVar.f());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = r.getWidth();
            int height = r.getHeight();
            Rect rect = this.f4529z;
            rect.set(0, 0, width, height);
            Rect rect2 = this.A;
            rect2.set(0, 0, (int) (((float) r.getWidth()) * c9), (int) (((float) r.getHeight()) * c9));
            canvas.drawBitmap(r, rect, rect2, paint);
            canvas.restore();
        }
    }

    public final Bitmap r() {
        b bVar;
        String str;
        Bitmap decodeStream;
        String str2 = this.f4519n.f4535g;
        l lVar = this.f4518m;
        if (lVar.getCallback() == null) {
            bVar = null;
        } else {
            b bVar2 = lVar.f8257i;
            if (bVar2 != null) {
                Drawable.Callback callback = lVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = bVar2.f2649a;
                if (!((context == null && context2 == null) || context2.equals(context))) {
                    lVar.f8257i = null;
                }
            }
            if (lVar.f8257i == null) {
                lVar.f8257i = new b(lVar.getCallback(), lVar.f8258j, lVar.f8251b.f8222d);
            }
            bVar = lVar.f8257i;
        }
        if (bVar == null) {
            return null;
        }
        String str3 = bVar.f2650b;
        n nVar = bVar.f2651c.get(str2);
        if (nVar == null) {
            return null;
        }
        Bitmap bitmap = nVar.f8298d;
        if (bitmap != null) {
            return bitmap;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str4 = nVar.f8297c;
        if (!str4.startsWith("data:") || str4.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        decodeStream = BitmapFactory.decodeStream(bVar.f2649a.getAssets().open(str3 + str4), (Rect) null, options);
                        int i8 = nVar.f8295a;
                        int i9 = nVar.f8296b;
                        ThreadLocal<PathMeasure> threadLocal = g.f5118a;
                        if (!(decodeStream.getWidth() == i8 && decodeStream.getHeight() == i9)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i8, i9, true);
                            decodeStream.recycle();
                            decodeStream = createScaledBitmap;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Unable to decode image.";
                        c.c(str, e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e4) {
                e = e4;
                str = "Unable to open asset.";
                c.c(str, e);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str4.substring(str4.indexOf(44) + 1), 0);
                decodeStream = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            } catch (IllegalArgumentException e9) {
                e = e9;
                str = "data URL did not have correct base64 format.";
                c.c(str, e);
                return null;
            }
        }
        Bitmap bitmap2 = decodeStream;
        synchronized (b.f2648d) {
            bVar.f2651c.get(str2).f8298d = bitmap2;
        }
        return bitmap2;
    }
}
