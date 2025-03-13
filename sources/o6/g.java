package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.SizeF;
import e7.d;
import e7.i;
import e7.k;
import i5.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Random;
import n6.b;
import o6.h;
import w5.f;
import w5.i;

public abstract class g extends q implements d {
    public static boolean E = false;
    public boolean A = false;
    public boolean B = true;
    public i C = null;
    public final ArrayList D = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final k f6135i = new k(this, this);

    /* renamed from: j  reason: collision with root package name */
    public Integer f6136j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f6137k = new Paint(3);

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f6138l = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f6139m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    public ColorMatrix f6140n = new ColorMatrix();

    /* renamed from: o  reason: collision with root package name */
    public final h f6141o;

    /* renamed from: p  reason: collision with root package name */
    public float f6142p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f6143q = 0.0f;
    public final PointF r = new PointF(1.0f, 1.0f);

    /* renamed from: s  reason: collision with root package name */
    public final PointF f6144s = new PointF(1.0f, 1.0f);

    /* renamed from: t  reason: collision with root package name */
    public final g f6145t;

    /* renamed from: u  reason: collision with root package name */
    public final Matrix f6146u = new Matrix();

    /* renamed from: v  reason: collision with root package name */
    public Canvas f6147v = null;
    public Bitmap w = null;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6148x = false;
    public EnumSet<a> y = EnumSet.of(a.f6150f);

    /* renamed from: z  reason: collision with root package name */
    public boolean f6149z = true;

    public enum a {
        f6150f,
        f6151g;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public g(q qVar) {
        super(qVar);
        while (qVar != null && !qVar.s()) {
            qVar = qVar.f6175c;
        }
        this.f6145t = (g) qVar;
        this.f6141o = new h();
    }

    public final boolean A(Canvas canvas, Collection<Integer> collection) {
        h.a aVar = h.a.WIDTH;
        h hVar = this.f6141o;
        if (hVar.b(aVar).d() <= 0.0f || hVar.b(h.a.HEIGHT).d() <= 0.0f) {
            return false;
        }
        P();
        S();
        R();
        Paint paint = this.f6137k;
        paint.setAlpha((int) C());
        Q();
        if (paint.getAlpha() == 0) {
            return false;
        }
        boolean I = I(canvas, collection);
        if (E) {
            String str = this.f6174b;
            Matrix matrix = this.f6139m;
            RectF D2 = D();
            if (this.f6136j == null) {
                ColorMatrix colorMatrix = b.f5959a;
                Random random = new Random();
                this.f6136j = Integer.valueOf(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
            int intValue = this.f6136j.intValue();
            Paint paint2 = new Paint();
            paint2.setColor(intValue);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(1.0f);
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            Matrix matrix2 = new Matrix();
            matrix2.setTranslate(D2.width(), 0.0f);
            matrix2.postConcat(matrix);
            matrix2.getValues(fArr);
            Matrix matrix3 = new Matrix();
            matrix3.setTranslate(D2.width(), D2.height());
            matrix3.postConcat(matrix);
            matrix3.getValues(fArr);
            Matrix matrix4 = new Matrix();
            matrix4.setTranslate(0.0f, D2.height());
            matrix4.postConcat(matrix);
            matrix4.getValues(fArr);
            Point[] pointArr = {new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5])};
            Path path = new Path();
            Point point = pointArr[0];
            path.moveTo((float) point.x, (float) point.y);
            Point point2 = pointArr[1];
            path.lineTo((float) point2.x, (float) point2.y);
            Point point3 = pointArr[2];
            path.lineTo((float) point3.x, (float) point3.y);
            Point point4 = pointArr[3];
            path.lineTo((float) point4.x, (float) point4.y);
            path.close();
            canvas.drawPath(path, paint2);
            if (str != null && !str.isEmpty()) {
                canvas.drawText(str, D2.left, D2.bottom, paint2);
            }
        }
        return I;
    }

    public final PointF B() {
        PointF pointF = this.r;
        float f9 = pointF.x;
        PointF pointF2 = this.f6144s;
        return new PointF(f9 * pointF2.x, pointF.y * pointF2.y);
    }

    public final float C() {
        h.a aVar = h.a.GYRO_ALPHA;
        h hVar = this.f6141o;
        return (((float) hVar.b(aVar).e()) / 255.0f) * ((float) hVar.b(h.a.ALPHA).e());
    }

    public final RectF D() {
        PointF pointF = this.r;
        float f9 = pointF.x;
        float f10 = pointF.y;
        h hVar = this.f6141o;
        hVar.getClass();
        float d9 = hVar.b(h.a.X).d();
        float d10 = hVar.b(h.a.Y).d();
        return new RectF(d9, d10, (hVar.b(h.a.WIDTH).d() * f9) + d9, (hVar.b(h.a.HEIGHT).d() * f10) + d10);
    }

    public final SizeF E() {
        return new SizeF(D().width(), D().height());
    }

    public boolean F(String str, Matrix matrix, Point point) {
        boolean z8;
        ArrayList arrayList = this.D;
        if (!arrayList.isEmpty()) {
            RectF D2 = D();
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            Matrix matrix2 = new Matrix();
            matrix2.setTranslate(D2.width(), 0.0f);
            matrix2.postConcat(matrix);
            matrix2.getValues(fArr);
            Matrix matrix3 = new Matrix();
            matrix3.setTranslate(D2.width(), D2.height());
            matrix3.postConcat(matrix);
            matrix3.getValues(fArr);
            Matrix matrix4 = new Matrix();
            matrix4.setTranslate(0.0f, D2.height());
            matrix4.postConcat(matrix);
            matrix4.getValues(fArr);
            Point[] pointArr = {new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5]), new Point((int) fArr[2], (int) fArr[5])};
            int i8 = 0;
            while (true) {
                if (i8 >= 4) {
                    z8 = true;
                    break;
                }
                Point point2 = pointArr[i8];
                i8++;
                Point point3 = pointArr[i8 % 4];
                int i9 = point3.x;
                int i10 = point2.x;
                int i11 = i9 - i10;
                int i12 = point3.y;
                int i13 = point2.y;
                if (((double) ((i11 * (point.x - i10)) + ((i12 - i13) * (point.y - i13)))) < 0.0d) {
                    z8 = false;
                    break;
                }
            }
            if (z8) {
                if ("TAP".equals(str)) {
                    arrayList.forEach(new j(6));
                }
                return true;
            }
        }
        return false;
    }

    public final void G() {
        this.f6149z = true;
        g gVar = this.f6145t;
        if (gVar != null) {
            gVar.G();
        }
    }

    public abstract boolean H(Canvas canvas);

    public boolean I(Canvas canvas, Collection<Integer> collection) {
        if (collection == null || collection.contains(0)) {
            return H(canvas);
        }
        return true;
    }

    public void J() {
        this.f6149z = true;
    }

    public void K() {
        if (this.f6179h != null && isEnabled()) {
            this.f6179h.c();
        }
        this.f6149z = true;
        g gVar = this.f6145t;
        if (gVar != null) {
            gVar.K();
        }
    }

    public final void L(int i8, int i9) {
        if (i8 > 0 && i9 > 0) {
            Canvas canvas = this.f6147v;
            if (!(canvas != null && canvas.getWidth() == i8 && this.f6147v.getHeight() == i9)) {
                Bitmap bitmap = this.w;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.w = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                this.f6147v = new Canvas(this.w);
            }
            this.f6147v.drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    public final void M(int i8) {
        ColorMatrix colorMatrix = b.f5959a;
        this.f6140n = new ColorMatrix(new float[]{((float) Color.red(i8)) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((float) Color.green(i8)) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((float) Color.blue(i8)) / 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((float) Color.alpha(i8)) / 255.0f, 0.0f});
        K();
    }

    public final void N(float f9, float f10, float f11, float f12) {
        boolean z8 = this.A;
        h hVar = this.f6141o;
        if (!z8) {
            this.A = true;
            this.f6142p = f11;
            this.f6143q = f12;
            hVar.e(f9, f10, f11, f12);
            h.a aVar = h.a.PIVOT_X;
            float d9 = hVar.b(aVar).d();
            h.a aVar2 = h.a.PIVOT_Y;
            float d10 = hVar.b(aVar2).d();
            hVar.d(aVar, new f(d9));
            hVar.d(aVar2, new f(d10));
        }
        hVar.e(f9, f10, f11, f12);
    }

    public void O(float f9, float f10) {
        h.a aVar = h.a.SCALE_X;
        f fVar = new f(f9);
        h hVar = this.f6141o;
        hVar.d(aVar, fVar);
        hVar.d(h.a.SCALE_Y, new f(f10));
    }

    public void P() {
        PointF pointF = this.r;
        g gVar = this.f6145t;
        if (gVar != null) {
            PointF B2 = gVar.B();
            if (!pointF.equals(B2)) {
                pointF.set(B2);
                J();
            }
        }
        h.a aVar = h.a.WIDTH;
        h hVar = this.f6141o;
        float d9 = hVar.b(aVar).d();
        float d10 = hVar.b(h.a.HEIGHT).d();
        if (this.f6142p <= 0.0f) {
            this.f6142p = d9;
        }
        if (this.f6143q <= 0.0f) {
            this.f6143q = d10;
        }
        this.f6144s.set(d9 / this.f6142p, d10 / this.f6143q);
        PointF B3 = B();
        float d11 = hVar.b(h.a.PIVOT_X).d() * B3.x;
        float d12 = hVar.b(h.a.PIVOT_Y).d() * B3.y;
        Matrix matrix = this.f6138l;
        matrix.reset();
        matrix.setTranslate(hVar.b(h.a.X).d() * pointF.x, hVar.b(h.a.Y).d() * pointF.y);
        matrix.preTranslate(hVar.b(h.a.GYRO_X).d(), hVar.b(h.a.GYRO_Y).d());
        matrix.preRotate(hVar.b(h.a.ANGLE).d(), d11, d12);
        matrix.preRotate(hVar.b(h.a.GYRO_ANGLE).d(), d11, d12);
        matrix.preScale(hVar.b(h.a.SCALE_X).d(), hVar.b(h.a.SCALE_Y).d(), d11, d12);
        matrix.preScale(hVar.b(h.a.GYRO_SCALE_X).d(), hVar.b(h.a.GYRO_SCALE_Y).d(), d11, d12);
    }

    public void Q() {
        this.f6137k.setColorFilter(new ColorMatrixColorFilter(this.f6140n));
    }

    public void R() {
        Matrix matrix = this.f6146u;
        g gVar = this.f6145t;
        if (gVar == null ? false : !matrix.equals(gVar.f6139m)) {
            matrix.set(gVar.f6139m);
            J();
        }
    }

    public void S() {
        Matrix matrix = this.f6139m;
        matrix.set(this.f6138l);
        g gVar = this.f6145t;
        if (gVar != null) {
            matrix.postConcat(gVar.f6139m);
        }
    }

    public final f a(i.a aVar) {
        return this.f6141o.b(aVar);
    }

    public final void e(i.a aVar, f fVar) {
        if (aVar instanceof h.a) {
            int ordinal = ((h.a) aVar).ordinal();
            h hVar = this.f6141o;
            if (ordinal == 6) {
                hVar.d(aVar, fVar.f8067a == 2 ? new f(fVar.f() % 360) : new f(fVar.d()));
            } else if (ordinal == 7 || ordinal == 15) {
                hVar.d(aVar, new f(a1.a.k((float) fVar.e(), 0.0f, 255.0f)));
                this.f6137k.setAlpha((int) C());
                Q();
            } else {
                hVar.d(aVar, fVar);
            }
        }
        if (isEnabled()) {
            K();
        } else {
            G();
        }
    }

    public void r() {
        super.r();
        this.f6135i.m();
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final boolean s() {
        return true;
    }
}
