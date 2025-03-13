package a2;

import android.graphics.Path;
import b2.a;
import f2.m;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import y1.l;

public final class q implements m, a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f152a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f153b;

    /* renamed from: c  reason: collision with root package name */
    public final l f154c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Path> f155d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final b f156f = new b(0);

    public q(l lVar, b bVar, m mVar) {
        mVar.getClass();
        this.f153b = mVar.f4363d;
        this.f154c = lVar;
        a<?, Path> a9 = mVar.f4362c.a();
        this.f155d = a9;
        bVar.e(a9);
        a9.a(this);
    }

    public final void b() {
        this.e = false;
        this.f154c.invalidateSelf();
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
                        this.f156f.f66a.add(sVar);
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
        boolean z8 = this.e;
        Path path = this.f152a;
        if (z8) {
            return path;
        }
        path.reset();
        if (this.f153b) {
            this.e = true;
            return path;
        }
        path.set(this.f155d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f156f.d(path);
        this.e = true;
        return path;
    }
}
