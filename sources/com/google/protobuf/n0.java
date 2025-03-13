package com.google.protobuf;

import com.google.protobuf.k0;
import java.util.Map;

public final class n0 implements m0 {
    public final Object a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (!l0Var2.isEmpty()) {
            if (!l0Var.f3721f) {
                l0Var = l0Var.c();
            }
            l0Var.b();
            if (!l0Var2.isEmpty()) {
                l0Var.putAll(l0Var2);
            }
        }
        return l0Var;
    }

    public final int b(Object obj, int i8, Object obj2) {
        l0 l0Var = (l0) obj;
        k0 k0Var = (k0) obj2;
        int i9 = 0;
        if (!l0Var.isEmpty()) {
            for (Map.Entry entry : l0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                k0Var.getClass();
                int B = l.B(i8);
                int a9 = k0.a(k0Var.f3705a, key, value);
                i9 += B + l.D(a9) + a9;
            }
        }
        return i9;
    }

    public final boolean c(Object obj) {
        return !((l0) obj).f3721f;
    }

    public final Object d(Object obj) {
        ((l0) obj).f3721f = false;
        return obj;
    }

    public final k0.a<?, ?> e(Object obj) {
        return ((k0) obj).f3705a;
    }

    public final Object f() {
        return l0.f3720g.c();
    }

    public final Map<?, ?> g(Object obj) {
        return (l0) obj;
    }

    public final Map<?, ?> h(Object obj) {
        return (l0) obj;
    }
}
