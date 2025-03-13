package n1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f5560a;

    static {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        f5560a = paint;
    }
}
