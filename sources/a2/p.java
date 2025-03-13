package a2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.c;
import d2.e;
import e2.d;
import f2.i;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import y1.l;
import y1.q;

public final class p implements e, m, j, a.C0028a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f143a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f144b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final l f145c;

    /* renamed from: d  reason: collision with root package name */
    public final b f146d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f147f;

    /* renamed from: g  reason: collision with root package name */
    public final c f148g;

    /* renamed from: h  reason: collision with root package name */
    public final c f149h;

    /* renamed from: i  reason: collision with root package name */
    public final b2.l f150i;

    /* renamed from: j  reason: collision with root package name */
    public d f151j;

    public p(l lVar, b bVar, i iVar) {
        this.f145c = lVar;
        this.f146d = bVar;
        this.e = iVar.f4345b;
        this.f147f = iVar.f4347d;
        a<Float, Float> a9 = iVar.f4346c.a();
        this.f148g = (c) a9;
        bVar.e(a9);
        a9.a(this);
        a<Float, Float> a10 = ((e2.b) iVar.e).a();
        this.f149h = (c) a10;
        bVar.e(a10);
        a10.a(this);
        d dVar = (d) iVar.f4348f;
        dVar.getClass();
        b2.l lVar2 = new b2.l(dVar);
        this.f150i = lVar2;
        lVar2.a(bVar);
        lVar2.b(this);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        this.f151j.a(rectF, matrix, z8);
    }

    public final void b() {
        this.f145c.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        this.f151j.d(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.ListIterator<a2.c> r9) {
        /*
            r8 = this;
            a2.d r0 = r8.f151j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            a2.d r9 = new a2.d
            y1.l r2 = r8.f145c
            g2.b r3 = r8.f146d
            java.lang.String r4 = "Repeater"
            boolean r5 = r8.f147f
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f151j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.p.e(java.util.ListIterator):void");
    }

    public final void f(Canvas canvas, Matrix matrix, int i8) {
        float floatValue = ((Float) this.f148g.f()).floatValue();
        float floatValue2 = ((Float) this.f149h.f()).floatValue();
        b2.l lVar = this.f150i;
        float floatValue3 = lVar.f2553m.f().floatValue() / 100.0f;
        float floatValue4 = lVar.f2554n.f().floatValue() / 100.0f;
        int i9 = (int) floatValue;
        while (true) {
            i9--;
            if (i9 >= 0) {
                Matrix matrix2 = this.f143a;
                matrix2.set(matrix);
                float f9 = (float) i9;
                matrix2.preConcat(lVar.e(f9 + floatValue2));
                PointF pointF = f.f5117a;
                this.f151j.f(canvas, matrix2, (int) (((float) i8) * (((f9 / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
            } else {
                return;
            }
        }
    }

    public final Path g() {
        Path g9 = this.f151j.g();
        Path path = this.f144b;
        path.reset();
        float floatValue = ((Float) this.f148g.f()).floatValue();
        float floatValue2 = ((Float) this.f149h.f()).floatValue();
        int i8 = (int) floatValue;
        while (true) {
            i8--;
            if (i8 < 0) {
                return path;
            }
            Matrix matrix = this.f143a;
            matrix.set(this.f150i.e(((float) i8) + floatValue2));
            path.addPath(g9, matrix);
        }
    }

    public final String getName() {
        return this.e;
    }

    public final void h(i0 i0Var, Object obj) {
        c cVar;
        if (!this.f150i.c(i0Var, obj)) {
            if (obj == q.f8315s) {
                cVar = this.f148g;
            } else if (obj == q.f8316t) {
                cVar = this.f149h;
            } else {
                return;
            }
            cVar.k(i0Var);
        }
    }
}
