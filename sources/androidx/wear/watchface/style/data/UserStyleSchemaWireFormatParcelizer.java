package androidx.wear.watchface.style.data;

import g1.a;

public final class UserStyleSchemaWireFormatParcelizer {
    public static UserStyleSchemaWireFormat read(a aVar) {
        UserStyleSchemaWireFormat userStyleSchemaWireFormat = new UserStyleSchemaWireFormat();
        userStyleSchemaWireFormat.f2423f = aVar.u(1, userStyleSchemaWireFormat.f2423f);
        return userStyleSchemaWireFormat;
    }

    public static void write(UserStyleSchemaWireFormat userStyleSchemaWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.V(1, userStyleSchemaWireFormat.f2423f);
    }
}
