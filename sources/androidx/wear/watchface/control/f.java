package androidx.wear.watchface.control;

import androidx.wear.watchface.control.b;
import androidx.wear.watchface.style.data.UserStyleFlavorsWireFormat;
import n1.k1;
import n1.t0;
import q7.k;
import q7.l;
import u1.j;

public final class f extends l implements p7.l<b.a, UserStyleFlavorsWireFormat> {

    /* renamed from: f  reason: collision with root package name */
    public static final f f2290f = new f();

    public f() {
        super(1);
    }

    public final Object invoke(Object obj) {
        b.a aVar = (b.a) obj;
        k.e(aVar, "it");
        t0 t0Var = t0.this;
        k.e(t0Var.a(new u1.b(t0Var.b())), "complicationSlotsManager");
        j jVar = ((k1) t0Var.f5733a.getValue()).f5647c;
        if (jVar == null) {
            jVar = new j();
        }
        return jVar.a();
    }
}
