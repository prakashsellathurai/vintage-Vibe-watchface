package a2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.c;
import b2.m;
import d2.e;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import k2.g;
import k3.j;
import y1.l;
import y1.q;

public abstract class a implements a.C0028a, k, e {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f51a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f52b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f53c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f54d = new RectF();
    public final l e;

    /* renamed from: f  reason: collision with root package name */
    public final b f55f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f56g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f57h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f58i;

    /* renamed from: j  reason: collision with root package name */
    public final c f59j;

    /* renamed from: k  reason: collision with root package name */
    public final b2.a<?, Integer> f60k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f61l;

    /* renamed from: m  reason: collision with root package name */
    public final c f62m;

    /* renamed from: n  reason: collision with root package name */
    public m f63n;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    public static final class C0003a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f64a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final s f65b;

        public C0003a(s sVar) {
            this.f65b = sVar;
        }
    }

    public a(l lVar, b bVar, Paint.Cap cap, Paint.Join join, float f9, e2.a aVar, e2.b bVar2, List<e2.b> list, e2.b bVar3) {
        z1.a aVar2 = new z1.a(1);
        this.f58i = aVar2;
        this.e = lVar;
        this.f55f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f9);
        this.f60k = aVar.a();
        this.f59j = (c) bVar2.a();
        this.f62m = (c) (bVar3 == null ? null : bVar3.a());
        this.f61l = new ArrayList(list.size());
        this.f57h = new float[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f61l.add(list.get(i8).a());
        }
        bVar.e(this.f60k);
        bVar.e(this.f59j);
        for (int i9 = 0; i9 < this.f61l.size(); i9++) {
            bVar.e((b2.a) this.f61l.get(i9));
        }
        c cVar = this.f62m;
        if (cVar != null) {
            bVar.e(cVar);
        }
        this.f60k.a(this);
        this.f59j.a(this);
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((b2.a) this.f61l.get(i10)).a(this);
        }
        c cVar2 = this.f62m;
        if (cVar2 != null) {
            cVar2.a(this);
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f52b;
        path.reset();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f56g;
            if (i8 < arrayList.size()) {
                C0003a aVar = (C0003a) arrayList.get(i8);
                for (int i9 = 0; i9 < aVar.f64a.size(); i9++) {
                    path.addPath(((m) aVar.f64a.get(i9)).g(), matrix);
                }
                i8++;
            } else {
                RectF rectF2 = this.f54d;
                path.computeBounds(rectF2, false);
                float l8 = this.f59j.l() / 2.0f;
                rectF2.set(rectF2.left - l8, rectF2.top - l8, rectF2.right + l8, rectF2.bottom + l8);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                j.s();
                return;
            }
        }
    }

    public final void b() {
        this.e.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0003a aVar = null;
        s sVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f163c == 2) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f56g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f163c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    C0003a aVar2 = new C0003a(sVar3);
                    sVar3.c(this);
                    aVar = aVar2;
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new C0003a(sVar);
                }
                aVar.f64a.add((m) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public void f(Canvas canvas, Matrix matrix, int i8) {
        boolean z8;
        float[] fArr;
        a aVar = this;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr2 = g.f5121d.get();
        boolean z9 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix2.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            j.s();
            return;
        }
        b2.e eVar = (b2.e) aVar.f60k;
        float l8 = (((float) i8) / 255.0f) * ((float) eVar.l(eVar.b(), eVar.d()));
        float f9 = 100.0f;
        Paint paint = aVar.f58i;
        PointF pointF = f.f5117a;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((l8 / 100.0f) * 255.0f))));
        paint.setStrokeWidth(aVar.f59j.l() * g.d(matrix));
        if (paint.getStrokeWidth() <= 0.0f) {
            j.s();
            return;
        }
        ArrayList arrayList = aVar.f61l;
        if (!arrayList.isEmpty()) {
            float d9 = g.d(matrix);
            int i9 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.f57h;
                if (i9 >= size) {
                    break;
                }
                float floatValue = ((Float) ((b2.a) arrayList.get(i9)).f()).floatValue();
                fArr[i9] = floatValue;
                if (i9 % 2 == 0) {
                    if (floatValue < 1.0f) {
                        fArr[i9] = 1.0f;
                    }
                } else if (floatValue < 0.1f) {
                    fArr[i9] = 0.1f;
                }
                fArr[i9] = fArr[i9] * d9;
                i9++;
            }
            c cVar = aVar.f62m;
            paint.setPathEffect(new DashPathEffect(fArr, cVar == null ? 0.0f : d9 * ((Float) cVar.f()).floatValue()));
        }
        j.s();
        m mVar = aVar.f63n;
        if (mVar != null) {
            paint.setColorFilter((ColorFilter) mVar.f());
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.f56g;
            if (i10 < arrayList2.size()) {
                C0003a aVar2 = (C0003a) arrayList2.get(i10);
                s sVar = aVar2.f65b;
                Path path = aVar.f52b;
                ArrayList arrayList3 = aVar2.f64a;
                if (sVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        path.addPath(((m) arrayList3.get(size2)).g(), matrix2);
                    }
                    PathMeasure pathMeasure = aVar.f51a;
                    pathMeasure.setPath(path, z9);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    s sVar2 = aVar2.f65b;
                    float floatValue2 = (((Float) sVar2.f165f.f()).floatValue() * length) / 360.0f;
                    float floatValue3 = ((((Float) sVar2.f164d.f()).floatValue() * length) / f9) + floatValue2;
                    float floatValue4 = ((((Float) sVar2.e.f()).floatValue() * length) / f9) + floatValue2;
                    int size3 = arrayList3.size() - 1;
                    float f10 = 0.0f;
                    while (size3 >= 0) {
                        Path path2 = aVar.f53c;
                        path2.set(((m) arrayList3.get(size3)).g());
                        path2.transform(matrix2);
                        pathMeasure.setPath(path2, z9);
                        float length2 = pathMeasure.getLength();
                        if (floatValue4 > length) {
                            float f11 = floatValue4 - length;
                            if (f11 < f10 + length2 && f10 < f11) {
                                g.a(path2, floatValue3 > length ? (floatValue3 - length) / length2 : 0.0f, Math.min(f11 / length2, 1.0f), 0.0f);
                                canvas2.drawPath(path2, paint);
                                f10 += length2;
                                size3--;
                                aVar = this;
                                z9 = false;
                            }
                        }
                        float f12 = f10 + length2;
                        if (f12 >= floatValue3 && f10 <= floatValue4) {
                            if (f12 > floatValue4 || floatValue3 >= f10) {
                                g.a(path2, floatValue3 < f10 ? 0.0f : (floatValue3 - f10) / length2, floatValue4 > f12 ? 1.0f : (floatValue4 - f10) / length2, 0.0f);
                            }
                            canvas2.drawPath(path2, paint);
                        }
                        f10 += length2;
                        size3--;
                        aVar = this;
                        z9 = false;
                    }
                    j.s();
                    z8 = true;
                } else {
                    path.reset();
                    z8 = true;
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((m) arrayList3.get(size4)).g(), matrix2);
                    }
                    j.s();
                    canvas2.drawPath(path, paint);
                    j.s();
                }
                i10++;
                aVar = this;
                boolean z10 = z8;
                z9 = false;
                f9 = 100.0f;
            } else {
                j.s();
                return;
            }
        }
    }

    public void h(i0 i0Var, Object obj) {
        b2.a aVar;
        if (obj == q.f8302d) {
            aVar = this.f60k;
        } else if (obj == q.f8314q) {
            aVar = this.f59j;
        } else if (obj == q.E) {
            m mVar = this.f63n;
            b bVar = this.f55f;
            if (mVar != null) {
                bVar.n(mVar);
            }
            if (i0Var == null) {
                this.f63n = null;
                return;
            }
            m mVar2 = new m(i0Var, null);
            this.f63n = mVar2;
            mVar2.a(this);
            bVar.e(this.f63n);
            return;
        } else {
            return;
        }
        aVar.k(i0Var);
    }
}
