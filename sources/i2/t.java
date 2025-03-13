package i2;

import android.graphics.PointF;
import b6.a;
import j2.b;

public final class t implements e0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final t f4831a = new t();

    public final Object d(b bVar, float f9) {
        int t8 = bVar.t();
        if (t8 == 1 || t8 == 3) {
            return m.b(bVar, f9);
        }
        if (t8 == 7) {
            PointF pointF = new PointF(((float) bVar.o()) * f9, ((float) bVar.o()) * f9);
            while (bVar.j()) {
                bVar.x();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(a.p(t8)));
    }
}
