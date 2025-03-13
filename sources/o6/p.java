package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f6170a = null;

    /* renamed from: b  reason: collision with root package name */
    public Canvas f6171b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6172c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<g> f6173d = new ArrayList<>();

    public p() {
        Paint paint = new Paint(1);
        this.f6172c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
