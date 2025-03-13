package androidx.wear.watchface.control.data;

import g1.a;

public final class IdTypeAndDefaultProviderPolicyWireFormatParcelizer {
    public static IdTypeAndDefaultProviderPolicyWireFormat read(a aVar) {
        IdTypeAndDefaultProviderPolicyWireFormat idTypeAndDefaultProviderPolicyWireFormat = new IdTypeAndDefaultProviderPolicyWireFormat();
        idTypeAndDefaultProviderPolicyWireFormat.f2274f = aVar.t(idTypeAndDefaultProviderPolicyWireFormat.f2274f, 1);
        idTypeAndDefaultProviderPolicyWireFormat.f2275g = aVar.u(2, idTypeAndDefaultProviderPolicyWireFormat.f2275g);
        idTypeAndDefaultProviderPolicyWireFormat.f2276h = aVar.t(idTypeAndDefaultProviderPolicyWireFormat.f2276h, 3);
        idTypeAndDefaultProviderPolicyWireFormat.f2277i = aVar.t(idTypeAndDefaultProviderPolicyWireFormat.f2277i, 4);
        return idTypeAndDefaultProviderPolicyWireFormat;
    }

    public static void write(IdTypeAndDefaultProviderPolicyWireFormat idTypeAndDefaultProviderPolicyWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(idTypeAndDefaultProviderPolicyWireFormat.f2274f, 1);
        aVar.V(2, idTypeAndDefaultProviderPolicyWireFormat.f2275g);
        aVar.U(idTypeAndDefaultProviderPolicyWireFormat.f2276h, 3);
        aVar.U(idTypeAndDefaultProviderPolicyWireFormat.f2277i, 4);
    }
}
