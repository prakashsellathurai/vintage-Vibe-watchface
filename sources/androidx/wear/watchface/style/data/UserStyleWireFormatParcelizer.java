package androidx.wear.watchface.style.data;

import g1.a;

public final class UserStyleWireFormatParcelizer {
    public static UserStyleWireFormat read(a aVar) {
        UserStyleWireFormat userStyleWireFormat = new UserStyleWireFormat();
        userStyleWireFormat.f2434f = aVar.x(userStyleWireFormat.f2434f, 1);
        return userStyleWireFormat;
    }

    public static void write(UserStyleWireFormat userStyleWireFormat, a aVar) {
        aVar.H(true, false);
        aVar.Y(userStyleWireFormat.f2434f, 1);
    }
}
