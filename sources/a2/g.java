package a2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.m;
import d2.e;
import f2.k;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import k3.j;
import y1.l;
import y1.q;

public final class g implements e, a.C0028a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f84a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f85b = new z1.a(1);

    /* renamed from: c  reason: collision with root package name */
    public final b f86c;

    /* renamed from: d  reason: collision with root package name */
    public final String f87d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f88f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final a<Integer, Integer> f89g;

    /* renamed from: h  reason: collision with root package name */
    public final a<Integer, Integer> f90h;

    /* renamed from: i  reason: collision with root package name */
    public m f91i;

    /* renamed from: j  reason: collision with root package name */
    public final l f92j;

    public g(l lVar, b bVar, k kVar) {
        e2.a aVar;
        Path path = new Path();
        this.f84a = path;
        this.f86c = bVar;
        this.f87d = kVar.f4354c;
        this.e = kVar.f4356f;
        this.f92j = lVar;
        e2.a aVar2 = kVar.f4355d;
        if (aVar2 == null || (aVar = kVar.e) == null) {
            this.f89g = null;
            this.f90h = null;
            return;
        }
        path.setFillType(kVar.f4353b);
        a<Integer, Integer> a9 = aVar2.a();
        this.f89g = a9;
        a9.a(this);
        bVar.e(a9);
        a<Integer, Integer> a10 = aVar.a();
        this.f90h = a10;
        a10.a(this);
        bVar.e(a10);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f84a;
        path.reset();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f88f;
            if (i8 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i8)).g(), matrix);
                i8++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final void b() {
        this.f92j.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = list2.get(i8);
            if (cVar instanceof m) {
                this.f88f.add((m) cVar);
            }
        }
    }

    public final void f(Canvas canvas, Matrix matrix, int i8) {
        if (!this.e) {
            Paint paint = this.f85b;
            b2.b bVar = (b2.b) this.f89g;
            paint.setColor(bVar.l(bVar.b(), bVar.d()));
            PointF pointF = f.f5117a;
            int i9 = 0;
            paint.setAlpha(Math.max(0, Math.min(255, (int) ((((((float) i8) / 255.0f) * ((float) this.f90h.f().intValue())) / 100.0f) * 255.0f))));
            m mVar = this.f91i;
            if (mVar != null) {
                paint.setColorFilter((ColorFilter) mVar.f());
            }
            Path path = this.f84a;
            path.reset();
            while (true) {
                ArrayList arrayList = this.f88f;
                if (i9 < arrayList.size()) {
                    path.addPath(((m) arrayList.get(i9)).g(), matrix);
                    i9++;
                } else {
                    canvas.drawPath(path, paint);
                    j.s();
                    return;
                }
            }
        }
    }

    public final String getName() {
        return this.f87d;
    }

    public final void h(i0 i0Var, Object obj) {
        a<Integer, Integer> aVar;
        if (obj == q.f8299a) {
            aVar = this.f89g;
        } else if (obj == q.f8302d) {
            aVar = this.f90h;
        } else if (obj == q.E) {
            m mVar = this.f91i;
            b bVar = this.f86c;
            if (mVar != null) {
                bVar.n(mVar);
            }
            if (i0Var == null) {
                this.f91i = null;
                return;
            }
            m mVar2 = new m(i0Var, null);
            this.f91i = mVar2;
            mVar2.a(this);
            bVar.e(this.f91i);
            return;
        } else {
            return;
        }
        aVar.k(i0Var);
    }
}
