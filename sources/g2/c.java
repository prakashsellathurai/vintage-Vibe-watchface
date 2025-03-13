package g2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.m;
import d2.e;
import e2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.j;
import p.d;
import s.g;
import y1.f;
import y1.l;
import y1.q;

public final class c extends b {
    public final RectF A = new RectF();
    public final RectF B = new RectF();
    public final Paint C = new Paint();
    public a<Float, Float> y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f4528z = new ArrayList();

    public c(l lVar, e eVar, List<e> list, f fVar) {
        super(lVar, eVar);
        int i8;
        b bVar;
        b bVar2;
        b bVar3 = eVar.f4546s;
        if (bVar3 != null) {
            a<Float, Float> a9 = bVar3.a();
            this.y = a9;
            e(a9);
            this.y.a(this);
        } else {
            this.y = null;
        }
        d dVar = new d(fVar.f8226i.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            int b9 = g.b(eVar2.e);
            if (b9 == 0) {
                bVar2 = new c(lVar, eVar2, fVar.f8221c.get(eVar2.f4535g), fVar);
            } else if (b9 == 1) {
                bVar2 = new h(lVar, eVar2);
            } else if (b9 == 2) {
                bVar2 = new d(lVar, eVar2);
            } else if (b9 == 3) {
                bVar2 = new f(lVar, eVar2);
            } else if (b9 == 4) {
                bVar2 = new g(lVar, eVar2);
            } else if (b9 != 5) {
                k2.c.b("Unknown layer type ".concat(b6.a.o(eVar2.e)));
                bVar2 = null;
            } else {
                bVar2 = new i(lVar, eVar2);
            }
            if (bVar2 != null) {
                dVar.f(bVar2.f4519n.f4533d, bVar2);
                if (bVar4 != null) {
                    bVar4.f4522q = bVar2;
                    bVar4 = null;
                } else {
                    this.f4528z.add(0, bVar2);
                    int b10 = g.b(eVar2.f4548u);
                    if (b10 == 1 || b10 == 2) {
                        bVar4 = bVar2;
                    }
                }
            }
            size--;
        }
        for (i8 = 0; i8 < dVar.h(); i8++) {
            b bVar5 = (b) dVar.d(dVar.e(i8), (Long) null);
            if (!(bVar5 == null || (bVar = (b) dVar.d(bVar5.f4519n.f4534f, (Long) null)) == null)) {
                bVar5.r = bVar;
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        ArrayList arrayList = this.f4528z;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.A;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).a(rectF2, this.f4517l, true);
            rectF.union(rectF2);
        }
    }

    public final void h(i0 i0Var, Object obj) {
        super.h(i0Var, obj);
        if (obj != q.C) {
            return;
        }
        if (i0Var == null) {
            a<Float, Float> aVar = this.y;
            if (aVar != null) {
                aVar.k((i0) null);
                return;
            }
            return;
        }
        m mVar = new m(i0Var, null);
        this.y = mVar;
        mVar.a(this);
        e(this.y);
    }

    public final void k(Canvas canvas, Matrix matrix, int i8) {
        RectF rectF = this.B;
        e eVar = this.f4519n;
        rectF.set(0.0f, 0.0f, (float) eVar.f4543o, (float) eVar.f4544p);
        matrix.mapRect(rectF);
        boolean z8 = this.f4518m.f8265q;
        ArrayList arrayList = this.f4528z;
        boolean z9 = z8 && arrayList.size() > 1 && i8 != 255;
        if (z9) {
            Paint paint = this.C;
            paint.setAlpha(i8);
            ThreadLocal<PathMeasure> threadLocal = k2.g.f5118a;
            canvas.saveLayer(rectF, paint);
            j.s();
        } else {
            canvas.save();
        }
        if (z9) {
            i8 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty() ? canvas.clipRect(rectF) : true) {
                ((b) arrayList.get(size)).f(canvas, matrix, i8);
            }
        }
        canvas.restore();
        j.s();
    }

    public final void o(e eVar, int i8, ArrayList arrayList, e eVar2) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f4528z;
            if (i9 < arrayList2.size()) {
                ((b) arrayList2.get(i9)).c(eVar, i8, arrayList, eVar2);
                i9++;
            } else {
                return;
            }
        }
    }

    public final void p(boolean z8) {
        super.p(z8);
        Iterator it = this.f4528z.iterator();
        while (it.hasNext()) {
            ((b) it.next()).p(z8);
        }
    }

    public final void q(float f9) {
        super.q(f9);
        a<Float, Float> aVar = this.y;
        e eVar = this.f4519n;
        if (aVar != null) {
            f fVar = this.f4518m.f8251b;
            f9 = ((aVar.f().floatValue() * eVar.f4531b.f8230m) - eVar.f4531b.f8228k) / ((fVar.f8229l - fVar.f8228k) + 0.01f);
        }
        if (this.y == null) {
            f fVar2 = eVar.f4531b;
            f9 -= eVar.f4542n / (fVar2.f8229l - fVar2.f8228k);
        }
        float f10 = eVar.f4541m;
        if (f10 != 0.0f) {
            f9 /= f10;
        }
        ArrayList arrayList = this.f4528z;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((b) arrayList.get(size)).q(f9);
            } else {
                return;
            }
        }
    }
}
