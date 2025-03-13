package androidx.wear.watchface.style.data;

import g1.a;

public final class UserStyleFlavorsWireFormatParcelizer {
    public static UserStyleFlavorsWireFormat read(a aVar) {
        UserStyleFlavorsWireFormat userStyleFlavorsWireFormat = new UserStyleFlavorsWireFormat();
        userStyleFlavorsWireFormat.f2422f = aVar.u(1, userStyleFlavorsWireFormat.f2422f);
        return userStyleFlavorsWireFormat;
    }

    public static void write(UserStyleFlavorsWireFormat userStyleFlavorsWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.V(1, userStyleFlavorsWireFormat.f2422f);
    }
}
