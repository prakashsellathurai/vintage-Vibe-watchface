package a2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import b2.a;
import b2.d;
import b2.h;
import e2.e;
import java.util.ArrayList;
import java.util.List;
import k2.g;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final List f66a;

    public b(int i8) {
        if (i8 != 2) {
            this.f66a = new ArrayList();
        } else {
            this.f66a = new ArrayList();
        }
    }

    public /* synthetic */ b(ArrayList arrayList) {
        this.f66a = arrayList;
    }

    public final a a() {
        List list = this.f66a;
        return ((l2.a) list.get(0)).c() ? new d(1, list) : new h(list);
    }

    public final List b() {
        return this.f66a;
    }

    public final boolean c() {
        List list = this.f66a;
        return list.size() == 1 && ((l2.a) list.get(0)).c();
    }

    public final void d(Path path) {
        List list = this.f66a;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                s sVar = (s) list.get(size);
                ThreadLocal<PathMeasure> threadLocal = g.f5118a;
                if (sVar != null && !sVar.f161a) {
                    g.a(path, sVar.f164d.l() / 100.0f, sVar.e.l() / 100.0f, sVar.f165f.l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
