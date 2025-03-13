package androidx.wear.watchface.control;

import androidx.wear.watchface.control.b;
import androidx.wear.watchface.control.data.IdTypeAndDefaultProviderPolicyWireFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.h;
import n1.t0;
import q7.k;
import q7.l;

public final class e extends l implements p7.l<b.a, IdTypeAndDefaultProviderPolicyWireFormat[]> {

    /* renamed from: f  reason: collision with root package name */
    public static final e f2289f = new e();

    public e() {
        super(1);
    }

    public final Object invoke(Object obj) {
        b.a aVar = (b.a) obj;
        k.e(aVar, "it");
        t0 t0Var = t0.this;
        LinkedHashMap linkedHashMap = t0Var.a(new u1.b(t0Var.b())).e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new IdTypeAndDefaultProviderPolicyWireFormat(((Number) entry.getKey()).intValue(), ((h) entry.getValue()).f5577s.a(), ((h) entry.getValue()).f5577s.e, ((h) entry.getValue()).f5577s.f6293f.f6450f));
        }
        return (IdTypeAndDefaultProviderPolicyWireFormat[]) arrayList.toArray(new IdTypeAndDefaultProviderPolicyWireFormat[0]);
    }
}
