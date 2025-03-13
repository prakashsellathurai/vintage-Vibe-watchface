package a2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import d2.e;
import d2.f;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.g;
import k3.j;
import y1.l;

public final class d implements e, m, a.C0028a, f {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f67a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f68b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f69c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f70d;
    public final RectF e;

    /* renamed from: f  reason: collision with root package name */
    public final String f71f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f72g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f73h;

    /* renamed from: i  reason: collision with root package name */
    public final l f74i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f75j;

    /* renamed from: k  reason: collision with root package name */
    public final b2.l f76k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(y1.l r8, g2.b r9, f2.l r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f4357a
            boolean r4 = r10.f4359c
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List<f2.b> r10 = r10.f4358b
            int r0 = r10.size()
            r5.<init>(r0)
            r0 = 0
            r1 = r0
        L_0x0011:
            int r2 = r10.size()
            if (r1 >= r2) goto L_0x0029
            java.lang.Object r2 = r10.get(r1)
            f2.b r2 = (f2.b) r2
            a2.c r2 = r2.a(r8, r9)
            if (r2 == 0) goto L_0x0026
            r5.add(r2)
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0029:
            int r1 = r10.size()
            if (r0 >= r1) goto L_0x0040
            java.lang.Object r1 = r10.get(r0)
            f2.b r1 = (f2.b) r1
            boolean r2 = r1 instanceof e2.d
            if (r2 == 0) goto L_0x003d
            e2.d r1 = (e2.d) r1
            r6 = r1
            goto L_0x0042
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0040:
            r10 = 0
            r6 = r10
        L_0x0042:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.<init>(y1.l, g2.b, f2.l):void");
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Matrix matrix2 = this.f69c;
        matrix2.set(matrix);
        b2.l lVar = this.f76k;
        if (lVar != null) {
            matrix2.preConcat(lVar.d());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<c> list = this.f73h;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = list.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).a(rectF2, matrix2, z8);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public final void b() {
        this.f74i.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        String str = this.f71f;
        if (eVar.c(i8, str) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                eVar2.getClass();
                e eVar3 = new e(eVar2);
                eVar3.f3997a.add(str);
                if (eVar.a(i8, str)) {
                    e eVar4 = new e(eVar3);
                    eVar4.f3998b = this;
                    arrayList.add(eVar4);
                }
                eVar2 = eVar3;
            }
            if (eVar.d(i8, str)) {
                int b9 = i8 + eVar.b(i8, str);
                int i9 = 0;
                while (true) {
                    List<c> list = this.f73h;
                    if (i9 < list.size()) {
                        c cVar = list.get(i9);
                        if (cVar instanceof f) {
                            ((f) cVar).c(eVar, b9, arrayList, eVar2);
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void d(List<c> list, List<c> list2) {
        int size = list.size();
        List<c> list3 = this.f73h;
        ArrayList arrayList = new ArrayList(size + list3.size());
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = list3.get(size2);
            cVar.d(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    public final List<m> e() {
        if (this.f75j == null) {
            this.f75j = new ArrayList();
            int i8 = 0;
            while (true) {
                List<c> list = this.f73h;
                if (i8 >= list.size()) {
                    break;
                }
                c cVar = list.get(i8);
                if (cVar instanceof m) {
                    this.f75j.add((m) cVar);
                }
                i8++;
            }
        }
        return this.f75j;
    }

    public final void f(Canvas canvas, Matrix matrix, int i8) {
        boolean z8;
        if (!this.f72g) {
            Matrix matrix2 = this.f69c;
            matrix2.set(matrix);
            b2.l lVar = this.f76k;
            if (lVar != null) {
                matrix2.preConcat(lVar.d());
                a<Integer, Integer> aVar = lVar.f2550j;
                i8 = (int) ((((((float) (aVar == null ? 100 : aVar.f().intValue())) / 100.0f) * ((float) i8)) / 255.0f) * 255.0f);
            }
            boolean z9 = this.f74i.f8265q;
            boolean z10 = false;
            List<c> list = this.f73h;
            if (z9) {
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (i9 < list.size()) {
                        if ((list.get(i9) instanceof e) && (i10 = i10 + 1) >= 2) {
                            z8 = true;
                            break;
                        }
                        i9++;
                    } else {
                        z8 = false;
                        break;
                    }
                }
                if (z8 && i8 != 255) {
                    z10 = true;
                }
            }
            if (z10) {
                RectF rectF = this.f68b;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(rectF, matrix2, true);
                Paint paint = this.f67a;
                paint.setAlpha(i8);
                ThreadLocal<PathMeasure> threadLocal = g.f5118a;
                canvas.saveLayer(rectF, paint);
                j.s();
            }
            if (z10) {
                i8 = 255;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = list.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).f(canvas, matrix2, i8);
                }
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public final Path g() {
        Matrix matrix = this.f69c;
        matrix.reset();
        b2.l lVar = this.f76k;
        if (lVar != null) {
            matrix.set(lVar.d());
        }
        Path path = this.f70d;
        path.reset();
        if (this.f72g) {
            return path;
        }
        List<c> list = this.f73h;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof m) {
                path.addPath(((m) cVar).g(), matrix);
            }
        }
        return path;
    }

    public final String getName() {
        return this.f71f;
    }

    public final void h(i0 i0Var, Object obj) {
        b2.l lVar = this.f76k;
        if (lVar != null) {
            lVar.c(i0Var, obj);
        }
    }

    public d(l lVar, b bVar, String str, boolean z8, ArrayList arrayList, e2.d dVar) {
        this.f67a = new z1.a();
        this.f68b = new RectF();
        this.f69c = new Matrix();
        this.f70d = new Path();
        this.e = new RectF();
        this.f71f = str;
        this.f74i = lVar;
        this.f72g = z8;
        this.f73h = arrayList;
        if (dVar != null) {
            b2.l lVar2 = new b2.l(dVar);
            this.f76k = lVar2;
            lVar2.a(bVar);
            lVar2.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
            } else {
                return;
            }
        }
    }
}
