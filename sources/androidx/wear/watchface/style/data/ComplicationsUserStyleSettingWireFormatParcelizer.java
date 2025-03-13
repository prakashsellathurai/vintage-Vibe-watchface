package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class ComplicationsUserStyleSettingWireFormatParcelizer {
    public static ComplicationsUserStyleSettingWireFormat read(a aVar) {
        ComplicationsUserStyleSettingWireFormat complicationsUserStyleSettingWireFormat = new ComplicationsUserStyleSettingWireFormat();
        complicationsUserStyleSettingWireFormat.f2424f = aVar.C(1, complicationsUserStyleSettingWireFormat.f2424f);
        complicationsUserStyleSettingWireFormat.f2430l = aVar.u(100, complicationsUserStyleSettingWireFormat.f2430l);
        complicationsUserStyleSettingWireFormat.f2431m = aVar.u(101, complicationsUserStyleSettingWireFormat.f2431m);
        complicationsUserStyleSettingWireFormat.f2432n = aVar.k(102, complicationsUserStyleSettingWireFormat.f2432n);
        complicationsUserStyleSettingWireFormat.f2433o = aVar.u(103, complicationsUserStyleSettingWireFormat.f2433o);
        complicationsUserStyleSettingWireFormat.f2413p = aVar.u(104, complicationsUserStyleSettingWireFormat.f2413p);
        complicationsUserStyleSettingWireFormat.f2425g = aVar.o(2, complicationsUserStyleSettingWireFormat.f2425g);
        complicationsUserStyleSettingWireFormat.f2426h = aVar.o(3, complicationsUserStyleSettingWireFormat.f2426h);
        complicationsUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(complicationsUserStyleSettingWireFormat.f2427i, 4);
        complicationsUserStyleSettingWireFormat.f2428j = aVar.t(complicationsUserStyleSettingWireFormat.f2428j, 5);
        complicationsUserStyleSettingWireFormat.f2429k = aVar.u(6, complicationsUserStyleSettingWireFormat.f2429k);
        return complicationsUserStyleSettingWireFormat;
    }

    public static void write(ComplicationsUserStyleSettingWireFormat complicationsUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, complicationsUserStyleSettingWireFormat.f2424f);
        aVar.V(100, complicationsUserStyleSettingWireFormat.f2430l);
        aVar.V(101, complicationsUserStyleSettingWireFormat.f2431m);
        aVar.L(102, complicationsUserStyleSettingWireFormat.f2432n);
        aVar.V(103, complicationsUserStyleSettingWireFormat.f2433o);
        aVar.V(104, complicationsUserStyleSettingWireFormat.f2413p);
        aVar.P(2, complicationsUserStyleSettingWireFormat.f2425g);
        aVar.P(3, complicationsUserStyleSettingWireFormat.f2426h);
        aVar.a0(complicationsUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(complicationsUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, complicationsUserStyleSettingWireFormat.f2429k);
    }
}
