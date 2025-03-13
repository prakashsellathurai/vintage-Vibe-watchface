package q7;

import h7.a;
import p7.b;
import p7.c;
import p7.d;
import p7.e;
import p7.f;
import p7.g;
import p7.h;
import p7.i;
import p7.j;
import p7.k;
import p7.l;
import p7.m;
import p7.n;
import p7.o;
import p7.p;
import p7.q;
import p7.r;
import p7.t;
import p7.u;
import p7.v;
import p7.w;

public final class s {
    public static void a(int i8, Object obj) {
        if (obj != null) {
            boolean z8 = false;
            if (obj instanceof a) {
                if ((obj instanceof h ? ((h) obj).getArity() : obj instanceof p7.a ? 0 : obj instanceof l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : obj instanceof r ? 4 : obj instanceof p7.s ? 5 : obj instanceof t ? 6 : obj instanceof u ? 7 : obj instanceof v ? 8 : obj instanceof w ? 9 : obj instanceof b ? 10 : obj instanceof c ? 11 : obj instanceof d ? 12 : obj instanceof e ? 13 : obj instanceof f ? 14 : obj instanceof g ? 15 : obj instanceof h ? 16 : obj instanceof i ? 17 : obj instanceof j ? 18 : obj instanceof k ? 19 : obj instanceof m ? 20 : obj instanceof n ? 21 : obj instanceof o ? 22 : -1) == i8) {
                    z8 = true;
                }
            }
            if (!z8) {
                String name = obj.getClass().getName();
                ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + ("kotlin.jvm.functions.Function" + i8));
                k.f(s.class.getName(), classCastException);
                throw classCastException;
            }
        }
    }
}
