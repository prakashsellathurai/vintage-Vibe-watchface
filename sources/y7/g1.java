package y7;

import c8.m;
import d8.c;

public abstract class g1 extends w {
    public abstract g1 P();

    public String toString() {
        String str;
        g1 g1Var;
        c cVar = l0.f8580a;
        g1 g1Var2 = m.f2865a;
        if (this == g1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g1Var = g1Var2.P();
            } catch (UnsupportedOperationException unused) {
                g1Var = null;
            }
            str = this == g1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + b0.l(this);
    }
}
