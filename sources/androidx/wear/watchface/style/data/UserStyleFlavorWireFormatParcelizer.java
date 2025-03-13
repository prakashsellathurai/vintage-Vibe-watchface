package androidx.wear.watchface.style.data;

import g1.a;

public final class UserStyleFlavorWireFormatParcelizer {
    public static UserStyleFlavorWireFormat read(a aVar) {
        UserStyleFlavorWireFormat userStyleFlavorWireFormat = new UserStyleFlavorWireFormat();
        userStyleFlavorWireFormat.f2419f = aVar.C(1, userStyleFlavorWireFormat.f2419f);
        userStyleFlavorWireFormat.f2420g = (UserStyleWireFormat) aVar.F(userStyleFlavorWireFormat.f2420g, 2);
        userStyleFlavorWireFormat.f2421h = aVar.x(userStyleFlavorWireFormat.f2421h, 3);
        return userStyleFlavorWireFormat;
    }

    public static void write(UserStyleFlavorWireFormat userStyleFlavorWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, userStyleFlavorWireFormat.f2419f);
        aVar.g0(userStyleFlavorWireFormat.f2420g, 2);
        aVar.Y(userStyleFlavorWireFormat.f2421h, 3);
    }
}
