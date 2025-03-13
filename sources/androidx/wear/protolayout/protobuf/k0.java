package androidx.wear.protolayout.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class k0 implements j0 {
    public final Object a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.f2119f) {
                i0Var = i0Var.isEmpty() ? new i0() : new i0(i0Var);
            }
            i0Var.b();
            if (!i0Var2.isEmpty()) {
                i0Var.putAll(i0Var2);
            }
        }
        return i0Var;
    }

    public final int b(Object obj, int i8, Object obj2) {
        i0 i0Var = (i0) obj;
        h0 h0Var = (h0) obj2;
        if (i0Var.isEmpty()) {
            return 0;
        }
        Iterator it = i0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        h0Var.getClass();
        j.B(i8);
        throw null;
    }

    public final boolean c(Object obj) {
        return !((i0) obj).f2119f;
    }

    public final Object d(Object obj) {
        ((i0) obj).f2119f = false;
        return obj;
    }

    public final void e(Object obj) {
        ((h0) obj).getClass();
    }

    public final Object f() {
        i0<?, ?> i0Var = i0.f2118g;
        return i0Var.isEmpty() ? new i0() : new i0(i0Var);
    }

    public final Map<?, ?> g(Object obj) {
        return (i0) obj;
    }

    public final Map<?, ?> h(Object obj) {
        return (i0) obj;
    }
}
