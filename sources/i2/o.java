package i2;

import b2.g;
import j2.b;
import java.util.ArrayList;
import l2.a;
import y1.f;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f4821a = b.a.a("k");

    public static ArrayList a(b bVar, f fVar, float f9, e0 e0Var, boolean z8) {
        ArrayList arrayList = new ArrayList();
        if (bVar.t() == 6) {
            fVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bVar.c();
        while (bVar.j()) {
            if (bVar.v(f4821a) != 0) {
                bVar.x();
            } else if (bVar.t() == 1) {
                bVar.a();
                if (bVar.t() == 7) {
                    arrayList.add(n.b(bVar, fVar, f9, e0Var, false, z8));
                } else {
                    while (bVar.j()) {
                        arrayList.add(n.b(bVar, fVar, f9, e0Var, true, z8));
                    }
                }
                bVar.d();
            } else {
                arrayList.add(n.b(bVar, fVar, f9, e0Var, false, z8));
            }
        }
        bVar.g();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i8;
        T t8;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            i8 = size - 1;
            if (i9 >= i8) {
                break;
            }
            a aVar = (a) arrayList.get(i9);
            i9++;
            a aVar2 = (a) arrayList.get(i9);
            aVar.f5274h = Float.valueOf(aVar2.f5273g);
            if (aVar.f5270c == null && (t8 = aVar2.f5269b) != null) {
                aVar.f5270c = t8;
                if (aVar instanceof g) {
                    ((g) aVar).d();
                }
            }
        }
        a aVar3 = (a) arrayList.get(i8);
        if ((aVar3.f5269b == null || aVar3.f5270c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
