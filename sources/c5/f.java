package c5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import y4.i;

public final class f extends y4.f {

    /* renamed from: x  reason: collision with root package name */
    public final Paint f2673x;
    public final RectF y;

    /* renamed from: z  reason: collision with root package name */
    public int f2674z;

    public f() {
        this((i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(iVar == null ? new i() : iVar);
        Paint paint = new Paint(1);
        this.f2673x = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.y = new RectF();
    }

    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.f2674z = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.y, this.f2673x);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.f2674z);
        }
    }

    public final void n(float f9, float f10, float f11, float f12) {
        RectF rectF = this.y;
        if (f9 != rectF.left || f10 != rectF.top || f11 != rectF.right || f12 != rectF.bottom) {
            rectF.set(f9, f10, f11, f12);
            invalidateSelf();
        }
    }
}
