package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class CustomValueUserStyleSettingWireFormatParcelizer {
    public static CustomValueUserStyleSettingWireFormat read(a aVar) {
        CustomValueUserStyleSettingWireFormat customValueUserStyleSettingWireFormat = new CustomValueUserStyleSettingWireFormat();
        customValueUserStyleSettingWireFormat.f2424f = aVar.C(1, customValueUserStyleSettingWireFormat.f2424f);
        customValueUserStyleSettingWireFormat.f2430l = aVar.u(100, customValueUserStyleSettingWireFormat.f2430l);
        customValueUserStyleSettingWireFormat.f2431m = aVar.u(101, customValueUserStyleSettingWireFormat.f2431m);
        customValueUserStyleSettingWireFormat.f2432n = aVar.k(102, customValueUserStyleSettingWireFormat.f2432n);
        customValueUserStyleSettingWireFormat.f2433o = aVar.u(103, customValueUserStyleSettingWireFormat.f2433o);
        customValueUserStyleSettingWireFormat.f2425g = aVar.o(2, customValueUserStyleSettingWireFormat.f2425g);
        customValueUserStyleSettingWireFormat.f2426h = aVar.o(3, customValueUserStyleSettingWireFormat.f2426h);
        customValueUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(customValueUserStyleSettingWireFormat.f2427i, 4);
        customValueUserStyleSettingWireFormat.f2428j = aVar.t(customValueUserStyleSettingWireFormat.f2428j, 5);
        customValueUserStyleSettingWireFormat.f2429k = aVar.u(6, customValueUserStyleSettingWireFormat.f2429k);
        return customValueUserStyleSettingWireFormat;
    }

    public static void write(CustomValueUserStyleSettingWireFormat customValueUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, customValueUserStyleSettingWireFormat.f2424f);
        aVar.V(100, customValueUserStyleSettingWireFormat.f2430l);
        aVar.V(101, customValueUserStyleSettingWireFormat.f2431m);
        aVar.L(102, customValueUserStyleSettingWireFormat.f2432n);
        aVar.V(103, customValueUserStyleSettingWireFormat.f2433o);
        aVar.P(2, customValueUserStyleSettingWireFormat.f2425g);
        aVar.P(3, customValueUserStyleSettingWireFormat.f2426h);
        aVar.a0(customValueUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(customValueUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, customValueUserStyleSettingWireFormat.f2429k);
    }
}
