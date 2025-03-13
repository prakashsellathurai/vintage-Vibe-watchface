package l5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.health.services.client.R;
import androidx.wear.watchface.editor.EditorSession;
import com.samsung.android.wearable.watchfacestudio.editor.h;
import com.samsung.android.wearable.watchfacestudio.editor.n;
import com.samsung.android.wearable.watchfacestudio.editor.w;
import java.util.List;
import k3.j;
import q.b;
import q1.d;
import q7.k;
import t1.q;
import t1.r;
import y5.e;
import y7.g1;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f5309a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f5310b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public C0077a f5311c;

    /* renamed from: d  reason: collision with root package name */
    public h f5312d;
    public Integer e;

    /* renamed from: l5.a$a  reason: collision with other inner class name */
    public static class C0077a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5313a;

        /* renamed from: b  reason: collision with root package name */
        public final List<d> f5314b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f5315c;

        /* renamed from: d  reason: collision with root package name */
        public final e f5316d;
        public final Size e;

        public C0077a(int i8, List<d> list, RectF rectF, e eVar, Size size) {
            this.f5313a = i8;
            this.f5314b = list;
            this.f5315c = rectF;
            this.f5316d = eVar;
            this.e = size;
        }
    }

    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint paint = new Paint(1);
        this.f5309a = paint;
        setVisibility(4);
        setClickable(true);
        paint.setColor(getResources().getColor(R.color.colorPrimary, (Resources.Theme) null));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getComplicationStroke());
    }

    private float getComplicationStroke() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.complication_stroke, typedValue, false);
        return typedValue.getFloat();
    }

    private Region getTouchRegionInsideOutline() {
        Path d9 = this.f5311c.f5316d.d(0.0f);
        RectF rectF = new RectF();
        d9.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(d9, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region;
    }

    public final void a(Canvas canvas, Paint paint) {
        PointF pointF = new PointF(((float) canvas.getWidth()) / ((float) this.f5311c.e.getWidth()), ((float) canvas.getHeight()) / ((float) this.f5311c.e.getHeight()));
        canvas.save();
        canvas.scale(pointF.x, pointF.y);
        canvas.drawPath(this.f5311c.f5316d.e(getComplicationStroke()), paint);
        canvas.restore();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        e eVar = this.f5311c.f5316d;
        RectF f9 = eVar.f();
        PointF pointF = new PointF(((float) canvas.getWidth()) / f9.width(), ((float) canvas.getHeight()) / f9.height());
        Path d9 = eVar.d(getComplicationStroke());
        canvas.save();
        canvas.scale(pointF.x, pointF.y);
        canvas.drawPath(d9, this.f5309a);
        canvas.restore();
    }

    public Integer getKey() {
        return this.e;
    }

    public final void layout(int i8, int i9, int i10, int i11) {
        C0077a aVar = this.f5311c;
        aVar.getClass();
        float f9 = (float) (i10 - i8);
        RectF rectF = aVar.f5315c;
        float f10 = (float) (i11 - i9);
        RectF rectF2 = new RectF(rectF.left * f9, rectF.top * f10, f9 * rectF.right, f10 * rectF.bottom);
        rectF2.offset((float) i8, (float) i9);
        float width = rectF2.width();
        float height = rectF2.height();
        float strokeWidth = (this.f5309a.getStrokeWidth() / 2.0f) - 4.0f;
        RectF rectF3 = this.f5310b;
        rectF3.set(0.0f, 0.0f, width, height);
        rectF3.inset(strokeWidth, strokeWidth);
        super.layout((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!getTouchRegionInsideOutline().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        h hVar = this.f5312d;
        int i8 = this.f5311c.f5313a;
        w wVar = hVar.f3893b;
        r rVar = wVar.f3934f0;
        rVar.getClass();
        b bVar = new b();
        EditorSession editorSession = rVar.f7450f;
        k.c(editorSession, "null cannot be cast to non-null type androidx.wear.watchface.editor.BaseEditorSession");
        j.K(((t1.b) editorSession).f7379h, (g1) null, new q(bVar, rVar, i8, (j7.d<? super q>) null), 3);
        bVar.a(new n(0), wVar.f3929a0.getMainExecutor());
        super.performClick();
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
