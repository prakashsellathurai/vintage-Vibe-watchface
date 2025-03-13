package b2;

import android.graphics.Path;
import android.graphics.PointF;
import f2.j;
import java.util.ArrayList;
import java.util.List;
import k2.c;
import k2.f;
import l2.a;

public final class i extends a<j, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final j f2534i = new j();

    /* renamed from: j  reason: collision with root package name */
    public final Path f2535j = new Path();

    public i(List<a<j>> list) {
        super(list);
    }

    public final Object g(a aVar, float f9) {
        a aVar2 = aVar;
        j jVar = (j) aVar2.f5269b;
        j jVar2 = (j) aVar2.f5270c;
        j jVar3 = this.f2534i;
        if (jVar3.f4350b == null) {
            jVar3.f4350b = new PointF();
        }
        jVar3.f4351c = jVar.f4351c || jVar2.f4351c;
        ArrayList arrayList = jVar.f4349a;
        int size = arrayList.size();
        int size2 = jVar2.f4349a.size();
        ArrayList arrayList2 = jVar2.f4349a;
        if (size != size2) {
            c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = jVar3.f4349a;
        if (arrayList3.size() < min) {
            for (int size3 = arrayList3.size(); size3 < min; size3++) {
                arrayList3.add(new d2.a());
            }
        } else if (arrayList3.size() > min) {
            for (int size4 = arrayList3.size() - 1; size4 >= min; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = jVar.f4350b;
        PointF pointF2 = jVar2.f4350b;
        float f10 = pointF.x;
        float f11 = pointF2.x;
        PointF pointF3 = f.f5117a;
        float f12 = f10 + ((f11 - f10) * f9);
        float f13 = pointF.y;
        float f14 = f13 + ((pointF2.y - f13) * f9);
        if (jVar3.f4350b == null) {
            jVar3.f4350b = new PointF();
        }
        jVar3.f4350b.set(f12, f14);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            d2.a aVar3 = (d2.a) arrayList.get(size5);
            d2.a aVar4 = (d2.a) arrayList2.get(size5);
            PointF pointF4 = aVar3.f3977a;
            PointF pointF5 = aVar4.f3977a;
            float f15 = pointF4.x;
            float f16 = pointF4.y;
            ((d2.a) arrayList3.get(size5)).f3977a.set(f15 + ((pointF5.x - f15) * f9), f16 + ((pointF5.y - f16) * f9));
            PointF pointF6 = aVar3.f3978b;
            float f17 = pointF6.x;
            PointF pointF7 = aVar4.f3978b;
            float f18 = pointF6.y;
            ((d2.a) arrayList3.get(size5)).f3978b.set(f17 + ((pointF7.x - f17) * f9), f18 + ((pointF7.y - f18) * f9));
            PointF pointF8 = aVar3.f3979c;
            float f19 = pointF8.x;
            PointF pointF9 = aVar4.f3979c;
            float f20 = pointF8.y;
            ((d2.a) arrayList3.get(size5)).f3979c.set(f19 + ((pointF9.x - f19) * f9), f20 + ((pointF9.y - f20) * f9));
        }
        Path path = this.f2535j;
        path.reset();
        PointF pointF10 = jVar3.f4350b;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = f.f5117a;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
            d2.a aVar5 = (d2.a) arrayList3.get(i8);
            PointF pointF12 = aVar5.f3977a;
            boolean equals = pointF12.equals(pointF11);
            PointF pointF13 = aVar5.f3978b;
            PointF pointF14 = aVar5.f3979c;
            if (!equals || !pointF13.equals(pointF14)) {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            } else {
                path.lineTo(pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (jVar3.f4351c) {
            path.close();
        }
        return path;
    }
}
