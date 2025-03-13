package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class UserStyleSettingWireFormatParcelizer {
    public static UserStyleSettingWireFormat read(a aVar) {
        UserStyleSettingWireFormat userStyleSettingWireFormat = new UserStyleSettingWireFormat();
        userStyleSettingWireFormat.f2424f = aVar.C(1, userStyleSettingWireFormat.f2424f);
        userStyleSettingWireFormat.f2430l = aVar.u(100, userStyleSettingWireFormat.f2430l);
        userStyleSettingWireFormat.f2431m = aVar.u(101, userStyleSettingWireFormat.f2431m);
        userStyleSettingWireFormat.f2432n = aVar.k(102, userStyleSettingWireFormat.f2432n);
        userStyleSettingWireFormat.f2433o = aVar.u(103, userStyleSettingWireFormat.f2433o);
        userStyleSettingWireFormat.f2425g = aVar.o(2, userStyleSettingWireFormat.f2425g);
        userStyleSettingWireFormat.f2426h = aVar.o(3, userStyleSettingWireFormat.f2426h);
        userStyleSettingWireFormat.f2427i = (Icon) aVar.z(userStyleSettingWireFormat.f2427i, 4);
        userStyleSettingWireFormat.f2428j = aVar.t(userStyleSettingWireFormat.f2428j, 5);
        userStyleSettingWireFormat.f2429k = aVar.u(6, userStyleSettingWireFormat.f2429k);
        return userStyleSettingWireFormat;
    }

    public static void write(UserStyleSettingWireFormat userStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, userStyleSettingWireFormat.f2424f);
        aVar.V(100, userStyleSettingWireFormat.f2430l);
        aVar.V(101, userStyleSettingWireFormat.f2431m);
        aVar.L(102, userStyleSettingWireFormat.f2432n);
        aVar.V(103, userStyleSettingWireFormat.f2433o);
        aVar.P(2, userStyleSettingWireFormat.f2425g);
        aVar.P(3, userStyleSettingWireFormat.f2426h);
        aVar.a0(userStyleSettingWireFormat.f2427i, 4);
        aVar.U(userStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, userStyleSettingWireFormat.f2429k);
    }
}
