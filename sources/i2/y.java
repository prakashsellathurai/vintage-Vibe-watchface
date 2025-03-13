package i2;

import android.graphics.PointF;
import d2.a;
import f2.j;
import j2.b;
import java.util.ArrayList;
import java.util.Collections;
import k2.f;

public final class y implements e0<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final y f4836a = new y();

    /* renamed from: b  reason: collision with root package name */
    public static final b.a f4837b = b.a.a("c", "v", "i", "o");

    public final Object d(b bVar, float f9) {
        if (bVar.t() == 1) {
            bVar.a();
        }
        bVar.c();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z8 = false;
        while (bVar.j()) {
            int v8 = bVar.v(f4837b);
            if (v8 == 0) {
                z8 = bVar.n();
            } else if (v8 == 1) {
                arrayList = m.c(bVar, f9);
            } else if (v8 == 2) {
                arrayList2 = m.c(bVar, f9);
            } else if (v8 != 3) {
                bVar.w();
                bVar.x();
            } else {
                arrayList3 = m.c(bVar, f9);
            }
        }
        bVar.g();
        if (bVar.t() == 2) {
            bVar.d();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new j(new PointF(), false, Collections.emptyList());
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i8 = 1; i8 < size; i8++) {
                PointF pointF2 = (PointF) arrayList.get(i8);
                int i9 = i8 - 1;
                arrayList4.add(new a(f.a((PointF) arrayList.get(i9), (PointF) arrayList3.get(i9)), f.a(pointF2, (PointF) arrayList2.get(i8)), pointF2));
            }
            if (z8) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i10 = size - 1;
                arrayList4.add(new a(f.a((PointF) arrayList.get(i10), (PointF) arrayList3.get(i10)), f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new j(pointF, z8, arrayList4);
        }
    }
}
