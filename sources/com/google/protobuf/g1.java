package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.u;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3638a;

    /* renamed from: b  reason: collision with root package name */
    public static final m1<?, ?> f3639b = B(false);

    /* renamed from: c  reason: collision with root package name */
    public static final m1<?, ?> f3640c = B(true);

    /* renamed from: d  reason: collision with root package name */
    public static final o1 f3641d = new o1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3638a = cls;
    }

    public static <UT, UB> UB A(int i8, List<Integer> list, a0.e eVar, UB ub, m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                int intValue = list.get(i10).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, Integer.valueOf(intValue));
                    }
                    i9++;
                } else {
                    ub = E(i8, intValue, ub, m1Var);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub = E(i8, intValue2, ub, m1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static m1<?, ?> B(boolean z8) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (m1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z8)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends u.a<FT>> void C(r<FT> rVar, T t8, T t9) {
        i1<T, Object> i1Var;
        u<FT> c9 = rVar.c(t9);
        if (!c9.j()) {
            u<FT> d9 = rVar.d(t8);
            d9.getClass();
            int i8 = 0;
            while (true) {
                i1Var = c9.f3777a;
                if (i8 >= i1Var.d()) {
                    break;
                }
                d9.n(i1Var.c(i8));
                i8++;
            }
            for (Map.Entry<T, Object> n8 : i1Var.e()) {
                d9.n(n8);
            }
        }
    }

    public static boolean D(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB E(int i8, int i9, UB ub, m1<UT, UB> m1Var) {
        if (ub == null) {
            ub = m1Var.m();
        }
        m1Var.e(i8, (long) i9, ub);
        return ub;
    }

    public static void F(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).booleanValue();
                    Logger logger = l.f3712b;
                    i10++;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.H(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : 0);
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.I(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
        }
    }

    public static void G(int i8, List list, m mVar) {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                mVar.f3722a.K(i8, (i) list.get(i9));
            }
        }
    }

    public static void H(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).doubleValue();
                    Logger logger = l.f3712b;
                    i10 += 8;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.P(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                double doubleValue = ((Double) list.get(i9)).doubleValue();
                lVar.getClass();
                lVar.O(i8, Double.doubleToRawLongBits(doubleValue));
                i9++;
            }
        }
    }

    public static void I(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += l.s(((Integer) list.get(i11)).intValue());
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.R(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.Q(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void J(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).intValue();
                    Logger logger = l.f3712b;
                    i10 += 4;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.N(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.M(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void K(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).longValue();
                    Logger logger = l.f3712b;
                    i10 += 8;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.P(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.O(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void L(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).floatValue();
                    Logger logger = l.f3712b;
                    i10 += 4;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.N(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                float floatValue = ((Float) list.get(i9)).floatValue();
                lVar.getClass();
                lVar.M(i8, Float.floatToRawIntBits(floatValue));
                i9++;
            }
        }
    }

    public static void M(int i8, List list, m mVar, f1 f1Var) {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                mVar.h(i8, f1Var, list.get(i9));
            }
        }
    }

    public static void N(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += l.s(((Integer) list.get(i11)).intValue());
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.R(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.Q(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void O(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += l.F(((Long) list.get(i11)).longValue());
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.c0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.b0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void P(int i8, List list, m mVar, f1 f1Var) {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                mVar.k(i8, f1Var, list.get(i9));
            }
        }
    }

    public static void Q(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).intValue();
                    Logger logger = l.f3712b;
                    i10 += 4;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.N(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.M(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void R(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).longValue();
                    Logger logger = l.f3712b;
                    i10 += 8;
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.P(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.O(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void S(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += l.D((intValue >> 31) ^ (intValue << 1));
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    int intValue2 = ((Integer) list.get(i9)).intValue();
                    lVar.a0((intValue2 >> 31) ^ (intValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                int intValue3 = ((Integer) list.get(i9)).intValue();
                lVar.Z(i8, (intValue3 >> 31) ^ (intValue3 << 1));
                i9++;
            }
        }
    }

    public static void T(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += l.F((longValue >> 63) ^ (longValue << 1));
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    long longValue2 = ((Long) list.get(i9)).longValue();
                    lVar.c0((longValue2 >> 63) ^ (longValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                long longValue3 = ((Long) list.get(i9)).longValue();
                lVar.b0(i8, (longValue3 >> 63) ^ (longValue3 << 1));
                i9++;
            }
        }
    }

    public static void U(int i8, List list, m mVar) {
        if (list != null && !list.isEmpty()) {
            mVar.getClass();
            boolean z8 = list instanceof g0;
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                g0 g0Var = (g0) list;
                while (i9 < list.size()) {
                    Object d9 = g0Var.d(i9);
                    if (d9 instanceof String) {
                        lVar.W(i8, (String) d9);
                    } else {
                        lVar.K(i8, (i) d9);
                    }
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.W(i8, (String) list.get(i9));
                i9++;
            }
        }
    }

    public static void V(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += l.D(((Integer) list.get(i11)).intValue());
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.a0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.Z(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void W(int i8, List list, m mVar, boolean z8) {
        if (list != null && !list.isEmpty()) {
            l lVar = mVar.f3722a;
            int i9 = 0;
            if (z8) {
                lVar.Y(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += l.F(((Long) list.get(i11)).longValue());
                }
                lVar.a0(i10);
                while (i9 < list.size()) {
                    lVar.c0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                lVar.b0(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static int a(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * l.j(i8);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i8, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = size * l.B(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int size2 = list.get(i9).size();
            B += l.D(size2) + size2;
        }
        return B;
    }

    public static int d(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * l.B(i8));
    }

    public static int e(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i8 = 0;
            while (i9 < size) {
                i8 += l.s(zVar.l(i9));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + l.s(list.get(i9).intValue());
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
        return size * l.n(i8);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * l.o(i8);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i8, List<r0> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += l.q(i8, list.get(i10), f1Var);
        }
        return i9;
    }

    public static int k(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * l.B(i8));
    }

    public static int l(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i8 = 0;
            while (i9 < size) {
                i8 += l.s(zVar.l(i9));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + l.s(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    public static int m(int i8, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return n(list) + (list.size() * l.B(i8));
    }

    public static int n(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i8 = 0;
            while (i9 < size) {
                i0Var.k(i9);
                i8 += l.F(i0Var.f3655g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + l.F(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static int o(int i8, f1 f1Var, Object obj) {
        if (obj instanceof e0) {
            return l.B(i8) + l.u((e0) obj);
        }
        int B = l.B(i8);
        int serializedSize = ((a) ((r0) obj)).getSerializedSize(f1Var);
        return B + l.D(serializedSize) + serializedSize;
    }

    public static int p(int i8, List<?> list, f1 f1Var) {
        int i9;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = l.B(i8) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof e0) {
                i9 = l.u((e0) obj);
            } else {
                int serializedSize = ((a) ((r0) obj)).getSerializedSize(f1Var);
                i9 = serializedSize + l.D(serializedSize);
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
        return r(list) + (size * l.B(i8));
    }

    public static int r(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i8 = 0;
            while (i9 < size) {
                int l8 = zVar.l(i9);
                i8 += l.D((l8 >> 31) ^ (l8 << 1));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                int intValue = list.get(i9).intValue();
                i10 = i8 + l.D((intValue >> 31) ^ (intValue << 1));
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
        return t(list) + (size * l.B(i8));
    }

    public static int t(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i8 = 0;
            while (i9 < size) {
                i0Var.k(i9);
                long j8 = i0Var.f3655g[i9];
                i8 += l.F((j8 >> 63) ^ (j8 << 1));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                long longValue = list.get(i9).longValue();
                i10 = i8 + l.F((longValue >> 63) ^ (longValue << 1));
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
        int B = l.B(i8) * size;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            while (i11 < size) {
                Object d9 = g0Var.d(i11);
                if (d9 instanceof i) {
                    int size2 = ((i) d9).size();
                    i10 = l.D(size2) + size2;
                } else {
                    i10 = l.A((String) d9);
                }
                B += i10;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof i) {
                    int size3 = ((i) obj).size();
                    i9 = l.D(size3) + size3;
                } else {
                    i9 = l.A((String) obj);
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
        return w(list) + (size * l.B(i8));
    }

    public static int w(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i8 = 0;
            while (i9 < size) {
                i8 += l.D(zVar.l(i9));
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + l.D(list.get(i9).intValue());
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
        return y(list) + (size * l.B(i8));
    }

    public static int y(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i8 = 0;
            while (i9 < size) {
                i0Var.k(i9);
                i8 += l.F(i0Var.f3655g[i9]);
                i9++;
            }
        } else {
            int i10 = 0;
            while (i9 < size) {
                i10 = i8 + l.F(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static Object z(int i8, AbstractList abstractList, a0.d dVar, Object obj, m1 m1Var) {
        if (dVar == null) {
            return obj;
        }
        int size = abstractList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) abstractList.get(i10)).intValue();
            if (dVar.findValueByNumber(intValue) != null) {
                if (i10 != i9) {
                    abstractList.set(i9, Integer.valueOf(intValue));
                }
                i9++;
            } else {
                obj = E(i8, intValue, obj, m1Var);
            }
        }
        if (i9 != size) {
            abstractList.subList(i9, size).clear();
        }
        return obj;
    }
}
