package a2;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.c;
import e2.e;
import f2.i;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import y1.l;
import y1.q;

public final class o implements a.C0028a, k, m {

    /* renamed from: a  reason: collision with root package name */
    public final Path f134a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f135b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final String f136c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f137d;
    public final l e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, PointF> f138f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, PointF> f139g;

    /* renamed from: h  reason: collision with root package name */
    public final c f140h;

    /* renamed from: i  reason: collision with root package name */
    public final b f141i = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f142j;

    public o(l lVar, b bVar, i iVar) {
        this.f136c = iVar.f4345b;
        this.f137d = iVar.f4347d;
        this.e = lVar;
        a<?, PointF> a9 = iVar.e.a();
        this.f138f = a9;
        a<?, PointF> a10 = ((e) iVar.f4348f).a();
        this.f139g = a10;
        a<Float, Float> a11 = iVar.f4346c.a();
        this.f140h = (c) a11;
        bVar.e(a9);
        bVar.e(a10);
        bVar.e(a11);
        a9.a(this);
        a10.a(this);
        a11.a(this);
    }

    public final void b() {
        this.f142j = false;
        this.e.invalidateSelf();
    }

    public final void c(d2.e eVar, int i8, ArrayList arrayList, d2.e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
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
                        this.f141i.f66a.add(sVar);
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
        boolean z8 = this.f142j;
        Path path = this.f134a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f137d) {
            this.f142j = true;
            return path;
        }
        PointF f9 = this.f139g.f();
        float f10 = f9.x / 2.0f;
        float f11 = f9.y / 2.0f;
        c cVar = this.f140h;
        float l8 = cVar == null ? 0.0f : cVar.l();
        float min = Math.min(f10, f11);
        if (l8 > min) {
            l8 = min;
        }
        PointF f12 = this.f138f.f();
        path.moveTo(f12.x + f10, (f12.y - f11) + l8);
        path.lineTo(f12.x + f10, (f12.y + f11) - l8);
        int i8 = (l8 > 0.0f ? 1 : (l8 == 0.0f ? 0 : -1));
        RectF rectF = this.f135b;
        if (i8 > 0) {
            float f13 = f12.x + f10;
            float f14 = l8 * 2.0f;
            float f15 = f12.y + f11;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((f12.x - f10) + l8, f12.y + f11);
        if (i8 > 0) {
            float f16 = f12.x - f10;
            float f17 = f12.y + f11;
            float f18 = l8 * 2.0f;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(f12.x - f10, (f12.y - f11) + l8);
        if (i8 > 0) {
            float f19 = f12.x - f10;
            float f20 = f12.y - f11;
            float f21 = l8 * 2.0f;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((f12.x + f10) - l8, f12.y - f11);
        if (i8 > 0) {
            float f22 = f12.x + f10;
            float f23 = l8 * 2.0f;
            float f24 = f12.y - f11;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f141i.d(path);
        this.f142j = true;
        return path;
    }

    public final String getName() {
        return this.f136c;
    }

    public final void h(i0 i0Var, Object obj) {
        a aVar;
        if (obj == q.f8307j) {
            aVar = this.f139g;
        } else if (obj == q.f8309l) {
            aVar = this.f138f;
        } else if (obj == q.f8308k) {
            aVar = this.f140h;
        } else {
            return;
        }
        aVar.k(i0Var);
    }
}
