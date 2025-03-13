package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class CustomValueUserStyleSetting2WireFormatParcelizer {
    public static CustomValueUserStyleSetting2WireFormat read(a aVar) {
        CustomValueUserStyleSetting2WireFormat customValueUserStyleSetting2WireFormat = new CustomValueUserStyleSetting2WireFormat();
        customValueUserStyleSetting2WireFormat.f2424f = aVar.C(1, customValueUserStyleSetting2WireFormat.f2424f);
        customValueUserStyleSetting2WireFormat.f2430l = aVar.u(100, customValueUserStyleSetting2WireFormat.f2430l);
        customValueUserStyleSetting2WireFormat.f2431m = aVar.u(101, customValueUserStyleSetting2WireFormat.f2431m);
        customValueUserStyleSetting2WireFormat.f2432n = aVar.k(102, customValueUserStyleSetting2WireFormat.f2432n);
        customValueUserStyleSetting2WireFormat.f2433o = aVar.u(103, customValueUserStyleSetting2WireFormat.f2433o);
        customValueUserStyleSetting2WireFormat.f2425g = aVar.o(2, customValueUserStyleSetting2WireFormat.f2425g);
        customValueUserStyleSetting2WireFormat.f2426h = aVar.o(3, customValueUserStyleSetting2WireFormat.f2426h);
        customValueUserStyleSetting2WireFormat.f2427i = (Icon) aVar.z(customValueUserStyleSetting2WireFormat.f2427i, 4);
        customValueUserStyleSetting2WireFormat.f2428j = aVar.t(customValueUserStyleSetting2WireFormat.f2428j, 5);
        customValueUserStyleSetting2WireFormat.f2429k = aVar.u(6, customValueUserStyleSetting2WireFormat.f2429k);
        return customValueUserStyleSetting2WireFormat;
    }

    public static void write(CustomValueUserStyleSetting2WireFormat customValueUserStyleSetting2WireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, customValueUserStyleSetting2WireFormat.f2424f);
        aVar.V(100, customValueUserStyleSetting2WireFormat.f2430l);
        aVar.V(101, customValueUserStyleSetting2WireFormat.f2431m);
        aVar.L(102, customValueUserStyleSetting2WireFormat.f2432n);
        aVar.V(103, customValueUserStyleSetting2WireFormat.f2433o);
        aVar.P(2, customValueUserStyleSetting2WireFormat.f2425g);
        aVar.P(3, customValueUserStyleSetting2WireFormat.f2426h);
        aVar.a0(customValueUserStyleSetting2WireFormat.f2427i, 4);
        aVar.U(customValueUserStyleSetting2WireFormat.f2428j, 5);
        aVar.V(6, customValueUserStyleSetting2WireFormat.f2429k);
    }
}
