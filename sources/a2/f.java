package a2;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.fragment.app.i0;
import b2.a;
import d2.e;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import y1.l;
import y1.q;

public final class f implements m, a.C0028a, k {

    /* renamed from: a  reason: collision with root package name */
    public final Path f77a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final String f78b;

    /* renamed from: c  reason: collision with root package name */
    public final l f79c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, PointF> f80d;
    public final a<?, PointF> e;

    /* renamed from: f  reason: collision with root package name */
    public final f2.a f81f;

    /* renamed from: g  reason: collision with root package name */
    public final b f82g = new b(0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f83h;

    public f(l lVar, b bVar, f2.a aVar) {
        this.f78b = aVar.f4304a;
        this.f79c = lVar;
        a<?, PointF> a9 = aVar.f4306c.a();
        this.f80d = a9;
        a<PointF, PointF> a10 = aVar.f4305b.a();
        this.e = a10;
        this.f81f = aVar;
        bVar.e(a9);
        bVar.e(a10);
        a9.a(this);
        a10.a(this);
    }

    public final void b() {
        this.f83h = false;
        this.f79c.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        k2.f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i8 < arrayList.size()) {
                c cVar = (c) arrayList.get(i8);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f163c == 1) {
                        this.f82g.f66a.add(sVar);
                        sVar.c(this);
                    }
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final Path g() {
        float f9;
        float f10;
        float f11;
        Path path;
        float f12;
        boolean z8 = this.f83h;
        Path path2 = this.f77a;
        if (z8) {
            return path2;
        }
        path2.reset();
        f2.a aVar = this.f81f;
        if (aVar.e) {
            this.f83h = true;
            return path2;
        }
        PointF f13 = this.f80d.f();
        float f14 = f13.x / 2.0f;
        float f15 = f13.y / 2.0f;
        float f16 = f14 * 0.55228f;
        float f17 = f15 * 0.55228f;
        path2.reset();
        if (aVar.f4307d) {
            f12 = -f15;
            path2.moveTo(0.0f, f12);
            float f18 = 0.0f - f16;
            float f19 = -f14;
            f9 = 0.0f - f17;
            path = path2;
            path.cubicTo(f18, f12, f19, f9, f19, 0.0f);
            f10 = f17 + 0.0f;
            path.cubicTo(f19, f10, f18, f15, 0.0f, f15);
            f11 = f16 + 0.0f;
        } else {
            f12 = -f15;
            path2.moveTo(0.0f, f12);
            float f20 = f16 + 0.0f;
            f9 = 0.0f - f17;
            path = path2;
            path.cubicTo(f20, f12, f14, f9, f14, 0.0f);
            f10 = f17 + 0.0f;
            path.cubicTo(f14, f10, f20, f15, 0.0f, f15);
            f11 = 0.0f - f16;
            f14 = -f14;
        }
        path.cubicTo(f11, f15, f14, f10, f14, 0.0f);
        path.cubicTo(f14, f9, f11, f12, 0.0f, f12);
        PointF f21 = this.e.f();
        path2.offset(f21.x, f21.y);
        path2.close();
        this.f82g.d(path2);
        this.f83h = true;
        return path2;
    }

    public final String getName() {
        return this.f78b;
    }

    public final void h(i0 i0Var, Object obj) {
        a<?, PointF> aVar;
        if (obj == q.f8306i) {
            aVar = this.f80d;
        } else if (obj == q.f8309l) {
            aVar = this.e;
        } else {
            return;
        }
        aVar.k(i0Var);
    }
}
