package i2;

import j2.b;
import l2.c;

public final class x implements e0<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final x f4835a = new x();

    public final Object d(b bVar, float f9) {
        boolean z8 = true;
        if (bVar.t() != 1) {
            z8 = false;
        }
        if (z8) {
            bVar.a();
        }
        float o8 = (float) bVar.o();
        float o9 = (float) bVar.o();
        while (bVar.j()) {
            bVar.x();
        }
        if (z8) {
            bVar.d();
        }
        return new c((o8 / 100.0f) * f9, (o9 / 100.0f) * f9);
    }
}
