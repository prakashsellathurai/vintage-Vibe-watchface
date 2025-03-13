package k2;

import a2.k;
import android.graphics.PointF;
import d2.e;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f5117a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f9));
    }

    public static int c(float f9, float f10) {
        int i8 = (int) f9;
        int i9 = (int) f10;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (!((i8 ^ i9) >= 0) && i11 != 0) {
            i10--;
        }
        return i8 - (i9 * i10);
    }

    public static void d(e eVar, int i8, ArrayList arrayList, e eVar2, k kVar) {
        if (eVar.a(i8, kVar.getName())) {
            String name = kVar.getName();
            eVar2.getClass();
            e eVar3 = new e(eVar2);
            eVar3.f3997a.add(name);
            e eVar4 = new e(eVar3);
            eVar4.f3998b = kVar;
            arrayList.add(eVar4);
        }
    }
}
