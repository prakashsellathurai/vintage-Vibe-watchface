package m5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import l5.a;

public final class c extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f5452a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f5453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Paint f5454c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, ArrayList arrayList, Paint paint) {
        super(context);
        this.f5455d = dVar;
        this.f5453b = arrayList;
        this.f5454c = paint;
    }

    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.f5452a == null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.f5452a = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.f5452a);
            float min = ((float) Math.min(width, height)) / 2.0f;
            canvas2.drawCircle(min, min, min, this.f5455d.f5457b);
            for (a a9 : this.f5453b) {
                a9.a(canvas2, paint);
            }
        }
        canvas.drawBitmap(this.f5452a, 0.0f, 0.0f, this.f5454c);
    }
}
