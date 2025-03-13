package y4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f8490a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f8491b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f8492c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f8493d;
    @Deprecated
    public float e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f8494f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8495g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8496h = new ArrayList();

    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f8497b;

        public a(c cVar) {
            this.f8497b = cVar;
        }

        public final void a(Matrix matrix, x4.a aVar, int i8, Canvas canvas) {
            x4.a aVar2 = aVar;
            int i9 = i8;
            Canvas canvas2 = canvas;
            c cVar = this.f8497b;
            float f9 = cVar.f8505f;
            float f10 = cVar.f8506g;
            RectF rectF = new RectF(cVar.f8502b, cVar.f8503c, cVar.f8504d, cVar.e);
            aVar.getClass();
            boolean z8 = f10 < 0.0f;
            Path path = aVar2.f8130g;
            int[] iArr = x4.a.f8123k;
            if (z8) {
                iArr[0] = 0;
                iArr[1] = aVar2.f8129f;
                iArr[2] = aVar2.e;
                iArr[3] = aVar2.f8128d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f9, f10);
                path.close();
                float f11 = (float) (-i9);
                rectF.inset(f11, f11);
                iArr[0] = 0;
                iArr[1] = aVar2.f8128d;
                iArr[2] = aVar2.e;
                iArr[3] = aVar2.f8129f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f12 = 1.0f - (((float) i9) / width);
                float[] fArr = x4.a.f8124l;
                fArr[1] = f12;
                fArr[2] = ((1.0f - f12) / 2.0f) + f12;
                Paint paint = aVar2.f8126b;
                paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                if (!z8) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f8131h);
                }
                canvas.drawArc(rectF, f9, f10, true, paint);
                canvas.restore();
            }
        }
    }

    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f8498b;

        /* renamed from: c  reason: collision with root package name */
        public final float f8499c;

        /* renamed from: d  reason: collision with root package name */
        public final float f8500d;

        public b(d dVar, float f9, float f10) {
            this.f8498b = dVar;
            this.f8499c = f9;
            this.f8500d = f10;
        }

        public final void a(Matrix matrix, x4.a aVar, int i8, Canvas canvas) {
            x4.a aVar2 = aVar;
            int i9 = i8;
            Canvas canvas2 = canvas;
            d dVar = this.f8498b;
            float f9 = dVar.f8508c;
            float f10 = this.f8500d;
            float f11 = dVar.f8507b;
            float f12 = this.f8499c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f9 - f10), (double) (f11 - f12)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f12, f10);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += (float) i9;
            rectF.offset(0.0f, (float) (-i9));
            int[] iArr = x4.a.f8121i;
            iArr[0] = aVar2.f8129f;
            iArr[1] = aVar2.e;
            iArr[2] = aVar2.f8128d;
            Paint paint = aVar2.f8127c;
            float f13 = rectF.left;
            paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, x4.a.f8122j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas2.concat(matrix2);
            canvas2.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f8498b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f8508c - this.f8500d) / (dVar.f8507b - this.f8499c))));
        }
    }

    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f8501h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f8502b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f8503c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f8504d;
        @Deprecated
        public float e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f8505f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f8506g;

        public c(float f9, float f10, float f11, float f12) {
            this.f8502b = f9;
            this.f8503c = f10;
            this.f8504d = f11;
            this.e = f12;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8509a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f8501h;
            rectF.set(this.f8502b, this.f8503c, this.f8504d, this.e);
            path.arcTo(rectF, this.f8505f, this.f8506g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f8507b;

        /* renamed from: c  reason: collision with root package name */
        public float f8508c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f8509a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f8507b, this.f8508c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f8509a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f8510a = new Matrix();

        public abstract void a(Matrix matrix, x4.a aVar, int i8, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f9, float f10, float f11, float f12, float f13, float f14) {
        c cVar = new c(f9, f10, f11, f12);
        cVar.f8505f = f13;
        cVar.f8506g = f14;
        this.f8495g.add(cVar);
        a aVar = new a(cVar);
        float f15 = f13 + f14;
        boolean z8 = f14 < 0.0f;
        if (z8) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        float f16 = z8 ? (180.0f + f15) % 360.0f : f15;
        b(f13);
        this.f8496h.add(aVar);
        this.e = f16;
        double d9 = (double) f15;
        this.f8492c = ((f9 + f11) * 0.5f) + (((f11 - f9) / 2.0f) * ((float) Math.cos(Math.toRadians(d9))));
        this.f8493d = ((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d9))));
    }

    public final void b(float f9) {
        float f10 = this.e;
        if (f10 != f9) {
            float f11 = ((f9 - f10) + 360.0f) % 360.0f;
            if (f11 <= 180.0f) {
                float f12 = this.f8492c;
                float f13 = this.f8493d;
                c cVar = new c(f12, f13, f12, f13);
                cVar.f8505f = this.e;
                cVar.f8506g = f11;
                this.f8496h.add(new a(cVar));
                this.e = f9;
            }
        }
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f8495g;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e) arrayList.get(i8)).a(matrix, path);
        }
    }

    public final void d(float f9, float f10) {
        d dVar = new d();
        dVar.f8507b = f9;
        dVar.f8508c = f10;
        this.f8495g.add(dVar);
        b bVar = new b(dVar, this.f8492c, this.f8493d);
        b(bVar.b() + 270.0f);
        this.f8496h.add(bVar);
        this.e = bVar.b() + 270.0f;
        this.f8492c = f9;
        this.f8493d = f10;
    }

    public final void e(float f9, float f10, float f11) {
        this.f8490a = 0.0f;
        this.f8491b = f9;
        this.f8492c = 0.0f;
        this.f8493d = f9;
        this.e = f10;
        this.f8494f = (f10 + f11) % 360.0f;
        this.f8495g.clear();
        this.f8496h.clear();
    }
}
