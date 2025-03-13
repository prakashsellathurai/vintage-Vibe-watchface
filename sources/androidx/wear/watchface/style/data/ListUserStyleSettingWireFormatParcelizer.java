package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class ListUserStyleSettingWireFormatParcelizer {
    public static ListUserStyleSettingWireFormat read(a aVar) {
        ListUserStyleSettingWireFormat listUserStyleSettingWireFormat = new ListUserStyleSettingWireFormat();
        listUserStyleSettingWireFormat.f2424f = aVar.C(1, listUserStyleSettingWireFormat.f2424f);
        listUserStyleSettingWireFormat.f2430l = aVar.u(100, listUserStyleSettingWireFormat.f2430l);
        listUserStyleSettingWireFormat.f2431m = aVar.u(101, listUserStyleSettingWireFormat.f2431m);
        listUserStyleSettingWireFormat.f2432n = aVar.k(102, listUserStyleSettingWireFormat.f2432n);
        listUserStyleSettingWireFormat.f2433o = aVar.u(103, listUserStyleSettingWireFormat.f2433o);
        listUserStyleSettingWireFormat.f2416p = aVar.u(104, listUserStyleSettingWireFormat.f2416p);
        listUserStyleSettingWireFormat.f2425g = aVar.o(2, listUserStyleSettingWireFormat.f2425g);
        listUserStyleSettingWireFormat.f2426h = aVar.o(3, listUserStyleSettingWireFormat.f2426h);
        listUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(listUserStyleSettingWireFormat.f2427i, 4);
        listUserStyleSettingWireFormat.f2428j = aVar.t(listUserStyleSettingWireFormat.f2428j, 5);
        listUserStyleSettingWireFormat.f2429k = aVar.u(6, listUserStyleSettingWireFormat.f2429k);
        return listUserStyleSettingWireFormat;
    }

    public static void write(ListUserStyleSettingWireFormat listUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, listUserStyleSettingWireFormat.f2424f);
        aVar.V(100, listUserStyleSettingWireFormat.f2430l);
        aVar.V(101, listUserStyleSettingWireFormat.f2431m);
        aVar.L(102, listUserStyleSettingWireFormat.f2432n);
        aVar.V(103, listUserStyleSettingWireFormat.f2433o);
        aVar.V(104, listUserStyleSettingWireFormat.f2416p);
        aVar.P(2, listUserStyleSettingWireFormat.f2425g);
        aVar.P(3, listUserStyleSettingWireFormat.f2426h);
        aVar.a0(listUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(listUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, listUserStyleSettingWireFormat.f2429k);
    }
}
