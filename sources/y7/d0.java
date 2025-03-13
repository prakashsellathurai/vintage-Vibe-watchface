package y7;

import c8.m;
import c8.s;
import d8.c;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f8554a;

    static {
        String str;
        g0 g0Var;
        int i8 = s.f2870a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            c cVar = l0.f8580a;
            g1 g1Var = m.f2865a;
            g1Var.P();
            if (g1Var instanceof g0) {
                g0Var = (g0) g1Var;
                f8554a = g0Var;
            }
        }
        g0Var = c0.f8550o;
        f8554a = g0Var;
    }
}
