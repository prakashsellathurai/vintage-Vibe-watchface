package y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import n6.a;

public final class a extends e {

    /* renamed from: f  reason: collision with root package name */
    public final float f8511f;

    /* renamed from: g  reason: collision with root package name */
    public final float f8512g;

    /* renamed from: h  reason: collision with root package name */
    public final float f8513h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8514i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8515j;

    /* renamed from: k  reason: collision with root package name */
    public Path f8516k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public Path f8517l = new Path();

    public a(RectF rectF, RectF rectF2, float f9, float f10, float f11, float f12, boolean z8, boolean z9, Matrix matrix) {
        super(rectF, rectF2, f9, matrix);
        this.f8513h = f10;
        this.f8511f = f11;
        this.f8512g = f12;
        this.f8514i = z8;
        this.f8515j = z9;
    }

    public final Path c(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF(rectF2);
        float f9 = this.f8513h;
        rectF3.inset(f9, f9);
        float f10 = this.f8511f - 0.049804688f;
        float f11 = this.f8512g - 0.049804688f;
        boolean z8 = this.f8514i;
        a.C0095a b9 = n6.a.b(f10, f11, Boolean.valueOf(z8));
        Path path = new Path();
        float f12 = b9.f5956a;
        float f13 = b9.f5957b;
        path.addArc(rectF2, f12, f13);
        path.lineTo(rectF2.centerX(), rectF2.centerY());
        path.close();
        Path path2 = new Path();
        path2.addArc(rectF3, f12, f13);
        path2.lineTo(rectF3.centerX(), rectF3.centerY());
        path2.close();
        path.op(path2, Path.Op.XOR);
        if (this.f8515j) {
            this.f8516k = g(rectF2, b9, path);
            this.f8517l = g(rectF2, n6.a.b(f11, f10, Boolean.valueOf(!z8)), path);
        }
        return path;
    }

    public final RectF f() {
        PathMeasure pathMeasure = new PathMeasure(e(0.0f), false);
        float[] fArr = new float[2];
        float[] fArr2 = {Float.MAX_VALUE, Float.MIN_VALUE, Float.MAX_VALUE, Float.MIN_VALUE};
        do {
            float length = pathMeasure.getLength();
            for (int i8 = 0; i8 <= 10; i8++) {
                pathMeasure.getPosTan((((float) i8) * length) / ((float) 10), fArr, (float[]) null);
                fArr2[0] = Math.min(fArr2[0], fArr[0]);
                fArr2[1] = Math.max(fArr2[1], fArr[0]);
                fArr2[2] = Math.min(fArr2[2], fArr[1]);
                fArr2[3] = Math.max(fArr2[3], fArr[1]);
            }
        } while (pathMeasure.nextContour());
        RectF rectF = new RectF(new RectF(fArr2[0], fArr2[2], fArr2[1], fArr2[3]));
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        if (this.f8515j) {
            Path path = this.f8516k;
            Matrix matrix = this.e;
            path.transform(matrix);
            path.computeBounds(rectF2, true);
            Path path2 = this.f8517l;
            path2.transform(matrix);
            path2.computeBounds(rectF3, true);
            rectF.union(rectF2);
            rectF.union(rectF3);
        }
        float f9 = (-this.f8513h) / 5.0f;
        rectF.inset(f9, f9);
        return rectF;
    }

    public final Path g(RectF rectF, a.C0095a aVar, Path path) {
        RectF rectF2 = new RectF(rectF);
        float f9 = this.f8513h / 2.0f;
        rectF2.inset(f9, f9);
        Path path2 = new Path();
        path2.arcTo(rectF2, aVar.f5956a, aVar.f5957b);
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        float[] fArr = {0.0f, 0.0f};
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        Path path3 = new Path();
        path3.moveTo(fArr[0], fArr[1]);
        path3.addCircle(fArr[0], fArr[1], f9 * Math.min(rectF2.width() / rectF2.height(), rectF2.height() / rectF2.width()), Path.Direction.CW);
        path.op(path3, Path.Op.UNION);
        return path3;
    }
}
