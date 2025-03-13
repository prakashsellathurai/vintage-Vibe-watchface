package u5;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Range;

public final class d extends b {
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7790f = false;

    public class a extends b {

        /* renamed from: h  reason: collision with root package name */
        public final Matrix f7791h = new Matrix();

        /* renamed from: i  reason: collision with root package name */
        public final Path f7792i = new Path();

        public a(Range<Float> range, float f9, r5.d dVar) {
            super(range, f9, dVar);
        }

        public final void a(Canvas canvas) {
            Path path = this.f7792i;
            path.reset();
            d dVar = d.this;
            RectF rectF = dVar.f7787b;
            path.addCircle(rectF.width() / 2.0f, rectF.height() / 2.0f, dVar.f7787b.width() / 2.0f, Path.Direction.CW);
            canvas.setMatrix(dVar.f7789d);
            canvas.clipPath(path);
            canvas.setMatrix(this.f7791h);
            PointF pointF = dVar.f7788c;
            canvas.drawCircle(pointF.x, pointF.y, this.f7796c, this.f7794a);
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final Paint f7794a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7795b = false;

        /* renamed from: c  reason: collision with root package name */
        public float f7796c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public final ValueAnimator f7797d;
        public final ValueAnimator e;

        /* renamed from: f  reason: collision with root package name */
        public final r5.d f7798f;

        public b(Range<Float> range, float f9, r5.d dVar) {
            Paint paint = new Paint(1);
            this.f7794a = paint;
            this.f7798f = dVar == null ? new androidx.health.services.client.impl.d(10) : dVar;
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleF", new float[]{range.getLower().floatValue(), range.getUpper().floatValue()})});
            ofPropertyValuesHolder.addUpdateListener(new f(this, f9));
            ofPropertyValuesHolder.setDuration(200);
            this.e = ofPropertyValuesHolder;
            ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 0.0f})});
            ofPropertyValuesHolder2.setDuration(200);
            ofPropertyValuesHolder2.addUpdateListener(new e(this));
            ofPropertyValuesHolder2.addListener(new g(this));
            this.f7797d = ofPropertyValuesHolder2;
            paint.setColor(Color.argb(0.2f, 1.0f, 1.0f, 1.0f));
        }

        public void a(Canvas canvas) {
            PointF pointF = d.this.f7788c;
            canvas.drawCircle(pointF.x, pointF.y, this.f7796c * (((float) Math.min(canvas.getWidth(), canvas.getHeight())) / 450.0f), this.f7794a);
        }
    }

    public d(int i8, RectF rectF, Matrix matrix, PointF pointF, r5.d dVar) {
        super(rectF, matrix, pointF);
        boolean z8 = false;
        float width = this.f7787b.width();
        float[] fArr = new float[9];
        this.f7789d.getValues(fArr);
        float f9 = width * fArr[0];
        if (i8 != 0) {
            this.e = i8 == 3 ? true : z8 ? new a(new Range(Float.valueOf(0.4f), Float.valueOf(1.0f)), f9, dVar) : new b(new Range(Float.valueOf(1.0f), Float.valueOf(1.1f)), 53.0f, dVar);
            b6.a.k(i8);
            return;
        }
        throw null;
    }

    public final void a() {
        this.f7790f = true;
        this.e.e.start();
    }

    public final void b() {
        if (this.f7790f) {
            this.f7790f = false;
            this.e.f7797d.start();
        }
    }

    public final void c() {
        b bVar = this.e;
        bVar.e.cancel();
        bVar.f7797d.cancel();
    }
}
