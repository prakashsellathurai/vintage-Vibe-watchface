package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.n;
import androidx.wear.protolayout.protobuf.v;
import java.util.Map;

public final class p extends o<v.d> {
    public final void a(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
    }

    public final Object b(n nVar, o0 o0Var, int i8) {
        nVar.getClass();
        return nVar.f2149a.get(new n.a(i8, o0Var));
    }

    public final r<v.d> c(Object obj) {
        return ((v.c) obj).extensions;
    }

    public final r<v.d> d(Object obj) {
        v.c cVar = (v.c) obj;
        r<v.d> rVar = cVar.extensions;
        if (rVar.f2170b) {
            cVar.extensions = rVar.clone();
        }
        return cVar.extensions;
    }

    public final boolean e(o0 o0Var) {
        return o0Var instanceof v.c;
    }

    public final void f(Object obj) {
        ((v.c) obj).extensions.m();
    }

    public final Object g(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    public final void h(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    public final void i(Object obj) {
        v.e eVar = (v.e) obj;
        throw null;
    }

    public final void j(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
        throw null;
    }
}
