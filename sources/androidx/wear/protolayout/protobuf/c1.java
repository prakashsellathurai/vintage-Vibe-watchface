package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.r;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2063a;

    /* renamed from: b  reason: collision with root package name */
    public static final h1<?, ?> f2064b = z(false);

    /* renamed from: c  reason: collision with root package name */
    public static final h1<?, ?> f2065c = z(true);

    /* renamed from: d  reason: collision with root package name */
    public static final j1 f2066d = new j1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.wear.protolayout.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f2063a = cls;
    }

    public static <T, FT extends r.a<FT>> void A(o<FT> oVar, T t8, T t9) {
        e1<T, Object> e1Var;
        r<FT> c9 = oVar.c(t9);
        if (!c9.i()) {
            r<FT> d9 = oVar.d(t8);
            d9.getClass();
            int i8 = 0;
            while (true) {
                e1Var = c9.f2169a;
                if (i8 >= e1Var.d()) {
                    break;
                }
                d9.n(e1Var.c(i8));
                i8++;
            }
            for (Map.Entry<T, Object> n8 : e1Var.e()) {
                d9.n(n8);
            }
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB C(Object obj, int i8, int i9, UB ub, h1<UT, UB> h1Var) {
        if (ub == null) {
            ub = h1Var.f(obj);
        }
        h1Var.e(i8, (long) i9, ub);
        return ub;
    }

    public static void D(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).booleanValue();
                    Logger logger = j.f2125b;
                    i10++;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.G(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : 0);
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.H(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
        }
    }

    public static void E(int i8, List list, k kVar) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                kVar.f2130a.I(i8, (g) list.get(i9));
            }
        }
    }

    public static void F(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).doubleValue();
                    Logger logger = j.f2125b;
                    i10 += 8;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.M(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                double doubleValue = ((Double) list.get(i9)).doubleValue();
                jVar.getClass();
                jVar.L(i8, Double.doubleToRawLongBits(doubleValue));
                i9++;
            }
        }
    }

    public static void G(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += j.s(((Integer) list.get(i11)).intValue());
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.O(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.N(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void H(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).intValue();
                    Logger logger = j.f2125b;
                    i10 += 4;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.K(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.J(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void I(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).longValue();
                    Logger logger = j.f2125b;
                    i10 += 8;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.M(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.L(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void J(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).floatValue();
                    Logger logger = j.f2125b;
                    i10 += 4;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.K(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                float floatValue = ((Float) list.get(i9)).floatValue();
                jVar.getClass();
                jVar.J(i8, Float.floatToRawIntBits(floatValue));
                i9++;
            }
        }
    }

    public static void K(int i8, List list, k kVar, b1 b1Var) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                kVar.h(i8, b1Var, list.get(i9));
            }
        }
    }

    public static void L(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += j.s(((Integer) list.get(i11)).intValue());
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.O(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.N(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void M(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += j.F(((Long) list.get(i11)).longValue());
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.X(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.W(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void N(int i8, List list, k kVar, b1 b1Var) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                kVar.k(i8, b1Var, list.get(i9));
            }
        }
    }

    public static void O(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).intValue();
                    Logger logger = j.f2125b;
                    i10 += 4;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.K(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.J(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void P(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).longValue();
                    Logger logger = j.f2125b;
                    i10 += 8;
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.M(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.L(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void Q(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += j.D((intValue >> 31) ^ (intValue << 1));
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    int intValue2 = ((Integer) list.get(i9)).intValue();
                    jVar.V((intValue2 >> 31) ^ (intValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                int intValue3 = ((Integer) list.get(i9)).intValue();
                jVar.U(i8, (intValue3 >> 31) ^ (intValue3 << 1));
                i9++;
            }
        }
    }

    public static void R(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += j.F((longValue >> 63) ^ (longValue << 1));
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    long longValue2 = ((Long) list.get(i9)).longValue();
                    jVar.X((longValue2 >> 63) ^ (longValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                long longValue3 = ((Long) list.get(i9)).longValue();
                jVar.W(i8, (longValue3 >> 63) ^ (longValue3 << 1));
                i9++;
            }
        }
    }

    public static void S(int i8, List list, k kVar) {
        if (list != null && !list.isEmpty()) {
            kVar.getClass();
            boolean z8 = list instanceof d0;
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                d0 d0Var = (d0) list;
                while (i9 < list.size()) {
                    Object d9 = d0Var.d(i9);
                    if (d9 instanceof String) {
                        jVar.S(i8, (String) d9);
                    } else {
                        jVar.I(i8, (g) d9);
                    }
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.S(i8, (String) list.get(i9));
                i9++;
            }
        }
    }

    public static void T(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += j.D(((Integer) list.get(i11)).intValue());
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.V(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.U(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void U(int i8, List list, k kVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            j jVar = kVar.f2130a;
            int i9 = 0;
            if (z8) {
                jVar.T(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += j.F(((Long) list.get(i11)).longValue());
                }
                jVar.V(i10);
                while (i9 < list.size()) {
                    jVar.X(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                jVar.W(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static int a(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j.j(i8);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i8, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = size * j.B(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int size2 = list.get(i9).size();
            B += j.D(size2) + size2;
        }
        return B;
    }

    public static int d(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * j.B(i8));
    }

    public static int e(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i8 = 0;
            while (i9 < size) {
                wVar.k(i9);
                i8 += j.s(wVar.f2212g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + j.s(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static int f(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j.n(i8);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j.o(i8);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i8, List<o0> list, b1 b1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += j.q(i8, list.get(i10), b1Var);
        }
        return i9;
    }

    public static int k(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * j.B(i8));
    }

    public static int l(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i8 = 0;
            while (i9 < size) {
                wVar.k(i9);
                i8 += j.s(wVar.f2212g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + j.s(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static int m(int i8, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return n(list) + (list.size() * j.B(i8));
    }

    public static int n(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i8 = 0;
            while (i9 < size) {
                f0Var.k(i9);
                i8 += j.F(f0Var.f2094g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + j.F(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static int o(int i8, b1 b1Var, Object obj) {
        if (obj instanceof b0) {
            return j.B(i8) + j.u((b0) obj);
        }
        int B = j.B(i8);
        int d9 = ((a) ((o0) obj)).d(b1Var);
        return B + j.D(d9) + d9;
    }

    public static int p(int i8, List<?> list, b1 b1Var) {
        int i9;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = j.B(i8) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof b0) {
                i9 = j.u((b0) obj);
            } else {
                int d9 = ((a) ((o0) obj)).d(b1Var);
                i9 = d9 + j.D(d9);
            }
            B += i9;
        }
        return B;
    }

    public static int q(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r(list) + (size * j.B(i8));
    }

    public static int r(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i8 = 0;
            while (i9 < size) {
                wVar.k(i9);
                int i10 = wVar.f2212g[i9];
                i8 += j.D((i10 >> 31) ^ (i10 << 1));
                i9++;
            }
        } else {
            int i11 = 0;
            while (i9 < size) {
                int intValue = list.get(i9).intValue();
                i11 = i8 + j.D((intValue >> 31) ^ (intValue << 1));
                i9++;
            }
        }
        return i8;
    }

    public static int s(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * j.B(i8));
    }

    public static int t(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i8 = 0;
            while (i9 < size) {
                f0Var.k(i9);
                long j8 = f0Var.f2094g[i9];
                i8 += j.F((j8 >> 63) ^ (j8 << 1));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                long longValue = list.get(i9).longValue();
                i10 = i8 + j.F((longValue >> 63) ^ (longValue << 1));
                i9++;
            }
        }
        return i8;
    }

    public static int u(int i8, List<?> list) {
        int i9;
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int B = j.B(i8) * size;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            while (i11 < size) {
                Object d9 = d0Var.d(i11);
                if (d9 instanceof g) {
                    int size2 = ((g) d9).size();
                    i10 = j.D(size2) + size2;
                } else {
                    i10 = j.A((String) d9);
                }
                B += i10;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof g) {
                    int size3 = ((g) obj).size();
                    i9 = j.D(size3) + size3;
                } else {
                    i9 = j.A((String) obj);
                }
                B += i9;
                i11++;
            }
        }
        return B;
    }

    public static int v(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return w(list) + (size * j.B(i8));
    }

    public static int w(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof w) {
            w wVar = (w) list;
            i8 = 0;
            while (i9 < size) {
                wVar.k(i9);
                i8 += j.D(wVar.f2212g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + j.D(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static int x(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return y(list) + (size * j.B(i8));
    }

    public static int y(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            i8 = 0;
            while (i9 < size) {
                f0Var.k(i9);
                i8 += j.F(f0Var.f2094g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + j.F(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static h1<?, ?> z(boolean z8) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.wear.protolayout.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (h1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z8)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
