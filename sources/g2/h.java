package g2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.m;
import y1.l;
import y1.q;
import z1.a;

public final class h extends b {
    public final float[] A;
    public final Path B;
    public final e C;
    public m D;
    public final RectF y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final Paint f4550z;

    public h(l lVar, e eVar) {
        super(lVar, eVar);
        a aVar = new a();
        this.f4550z = aVar;
        this.A = new float[8];
        this.B = new Path();
        this.C = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f4540l);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        RectF rectF2 = this.y;
        e eVar = this.C;
        rectF2.set(0.0f, 0.0f, (float) eVar.f4538j, (float) eVar.f4539k);
        this.f4517l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    public final void h(i0 i0Var, Object obj) {
        super.h(i0Var, obj);
        if (obj != q.E) {
            return;
        }
        if (i0Var == null) {
            this.D = null;
        } else {
            this.D = new m(i0Var, null);
        }
    }

    public final void k(Canvas canvas, Matrix matrix, int i8) {
        e eVar = this.C;
        int alpha = Color.alpha(eVar.f4540l);
        if (alpha != 0) {
            b2.a<Integer, Integer> aVar = this.f4525u.f2550j;
            int intValue = (int) ((((float) i8) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (aVar == null ? 100 : aVar.f().intValue()))) / 100.0f) * 255.0f);
            Paint paint = this.f4550z;
            paint.setAlpha(intValue);
            m mVar = this.D;
            if (mVar != null) {
                paint.setColorFilter((ColorFilter) mVar.f());
            }
            if (intValue > 0) {
                float[] fArr = this.A;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f9 = (float) eVar.f4538j;
                fArr[2] = f9;
                fArr[3] = 0.0f;
                fArr[4] = f9;
                float f10 = (float) eVar.f4539k;
                fArr[5] = f10;
                fArr[6] = 0.0f;
                fArr[7] = f10;
                matrix.mapPoints(fArr);
                Path path = this.B;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, paint);
            }
        }
    }
}
