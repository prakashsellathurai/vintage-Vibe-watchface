package y4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import y4.f;
import y7.b0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f8476a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f8477b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f8478c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f8479d = new PointF();
    public final Path e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f8480f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f8481g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f8482h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f8483i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f8484j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f8485k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8486l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f8487a = new j();
    }

    public j() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.f8476a[i8] = new l();
            this.f8477b[i8] = new Matrix();
            this.f8478c[i8] = new Matrix();
        }
    }

    public final void a(i iVar, float f9, RectF rectF, f.a aVar, Path path) {
        int i8;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        float f10;
        float f11;
        Path path2;
        char c9;
        float f12;
        float f13;
        float f14;
        j jVar = this;
        i iVar2 = iVar;
        float f15 = f9;
        RectF rectF2 = rectF;
        f.a aVar2 = aVar;
        Path path3 = path;
        path.rewind();
        Path path4 = jVar.e;
        path4.rewind();
        Path path5 = jVar.f8480f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            i8 = 4;
            matrixArr = jVar.f8478c;
            fArr = jVar.f8482h;
            matrixArr2 = jVar.f8477b;
            lVarArr = jVar.f8476a;
            if (i9 >= 4) {
                break;
            }
            c cVar = i9 != 1 ? i9 != 2 ? i9 != 3 ? iVar2.f8458f : iVar2.e : iVar2.f8460h : iVar2.f8459g;
            b0 b0Var = i9 != 1 ? i9 != 2 ? i9 != 3 ? iVar2.f8455b : iVar2.f8454a : iVar2.f8457d : iVar2.f8456c;
            l lVar = lVarArr[i9];
            b0Var.getClass();
            b0Var.k(f15, cVar.a(rectF2), lVar);
            int i10 = i9 + 1;
            float f16 = (float) (i10 * 90);
            matrixArr2[i9].reset();
            PointF pointF = jVar.f8479d;
            int i11 = i10;
            if (i9 == 1) {
                f14 = rectF2.right;
            } else if (i9 != 2) {
                f12 = i9 != 3 ? rectF2.right : rectF2.left;
                f13 = rectF2.top;
                pointF.set(f12, f13);
                matrixArr2[i9].setTranslate(pointF.x, pointF.y);
                matrixArr2[i9].preRotate(f16);
                l lVar2 = lVarArr[i9];
                fArr[0] = lVar2.f8492c;
                fArr[1] = lVar2.f8493d;
                matrixArr2[i9].mapPoints(fArr);
                matrixArr[i9].reset();
                matrixArr[i9].setTranslate(fArr[0], fArr[1]);
                matrixArr[i9].preRotate(f16);
                rectF2 = rectF;
                i9 = i11;
            } else {
                f14 = rectF2.left;
            }
            f12 = f14;
            f13 = rectF2.bottom;
            pointF.set(f12, f13);
            matrixArr2[i9].setTranslate(pointF.x, pointF.y);
            matrixArr2[i9].preRotate(f16);
            l lVar22 = lVarArr[i9];
            fArr[0] = lVar22.f8492c;
            fArr[1] = lVar22.f8493d;
            matrixArr2[i9].mapPoints(fArr);
            matrixArr[i9].reset();
            matrixArr[i9].setTranslate(fArr[0], fArr[1]);
            matrixArr[i9].preRotate(f16);
            rectF2 = rectF;
            i9 = i11;
        }
        char c10 = 1;
        char c11 = 0;
        int i12 = 0;
        while (i12 < i8) {
            l lVar3 = lVarArr[i12];
            fArr[c11] = lVar3.f8490a;
            fArr[c10] = lVar3.f8491b;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 0) {
                path3.moveTo(fArr[c11], fArr[c10]);
            } else {
                path3.lineTo(fArr[c11], fArr[c10]);
            }
            lVarArr[i12].c(matrixArr2[i12], path3);
            if (aVar2 != null) {
                l lVar4 = lVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                f fVar = f.this;
                BitSet bitSet = fVar.f8415d;
                lVar4.getClass();
                bitSet.set(i12, false);
                lVar4.b(lVar4.f8494f);
                fVar.f8413b[i12] = new k(new ArrayList(lVar4.f8496h), new Matrix(matrix));
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            l lVar5 = lVarArr[i12];
            fArr[0] = lVar5.f8492c;
            fArr[1] = lVar5.f8493d;
            matrixArr2[i12].mapPoints(fArr);
            l lVar6 = lVarArr[i14];
            float f17 = lVar6.f8490a;
            int i15 = i13;
            float[] fArr2 = jVar.f8483i;
            fArr2[0] = f17;
            fArr2[1] = lVar6.f8491b;
            matrixArr2[i14].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i12];
            fArr[0] = lVar7.f8492c;
            fArr[1] = lVar7.f8493d;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 1 || i12 == 3) {
                f11 = rectF.centerX();
                f10 = fArr[0];
            } else {
                f11 = rectF.centerY();
                f10 = fArr[1];
            }
            float abs = Math.abs(f11 - f10);
            l lVar8 = jVar.f8481g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            (i12 != 1 ? i12 != 2 ? i12 != 3 ? iVar2.f8462j : iVar2.f8461i : iVar2.f8464l : iVar2.f8463k).a(max, abs, f15, lVar8);
            Path path7 = jVar.f8484j;
            path7.reset();
            lVar8.c(matrixArr[i12], path7);
            if (!jVar.f8486l || (!jVar.b(path7, i12) && !jVar.b(path7, i14))) {
                path2 = path6;
                path3 = path;
                lVar8.c(matrixArr[i12], path3);
                aVar2 = aVar;
            } else {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f8490a;
                fArr[1] = lVar8.f8491b;
                matrixArr[i12].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i12], path2);
                aVar2 = aVar;
                path3 = path;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i12];
                f fVar2 = f.this;
                c9 = 0;
                fVar2.f8415d.set(i12 + 4, false);
                lVar8.b(lVar8.f8494f);
                fVar2.f8414c[i12] = new k(new ArrayList(lVar8.f8496h), new Matrix(matrix2));
            } else {
                c9 = 0;
            }
            jVar = this;
            c11 = c9;
            path4 = path2;
            i12 = i15;
            c10 = 1;
            i8 = 4;
            iVar2 = iVar;
        }
        Path path8 = path4;
        path.close();
        path8.close();
        if (!path8.isEmpty()) {
            path3.op(path8, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i8) {
        Path path2 = this.f8485k;
        path2.reset();
        this.f8476a[i8].c(this.f8477b[i8], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
