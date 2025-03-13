package m5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import l5.a;

public final class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f5448a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f5449b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Paint f5450c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5451d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, Context context, ArrayList arrayList, Paint paint) {
        super(context);
        this.f5451d = dVar;
        this.f5449b = arrayList;
        this.f5450c = paint;
    }

    public final void onDraw(Canvas canvas) {
        if (this.f5448a == null) {
            this.f5448a = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.f5448a);
            for (a a9 : this.f5449b) {
                a9.a(canvas2, this.f5451d.f5457b);
            }
        }
        canvas.drawBitmap(this.f5448a, 0.0f, 0.0f, this.f5450c);
    }
}
