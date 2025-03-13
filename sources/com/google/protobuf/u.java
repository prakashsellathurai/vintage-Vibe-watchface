package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.r0;
import com.google.protobuf.u.a;
import com.google.protobuf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class u<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final u f3776d = new u(0);

    /* renamed from: a  reason: collision with root package name */
    public final i1<T, Object> f3777a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3778b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3779c;

    public interface a<T extends a<T>> extends Comparable<T> {
        boolean a();

        s1 b();

        t1 c();

        boolean d();

        int getNumber();

        y.a m(r0.a aVar, r0 r0Var);
    }

    public u() {
        int i8 = i1.f3657l;
        this.f3777a = new h1(16);
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(s1 s1Var, int i8, Object obj) {
        int B = l.B(i8);
        if (s1Var == s1.f3757n) {
            B *= 2;
        }
        return B + e(s1Var, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r3 = com.google.protobuf.l.f3712b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r3 = com.google.protobuf.l.f3712b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        return 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(com.google.protobuf.s1 r3, java.lang.Object r4) {
        /*
            int r3 = r3.ordinal()
            r0 = 1
            switch(r3) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bc;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00ae;
                case 8: goto L_0x0095;
                case 9: goto L_0x008c;
                case 10: goto L_0x0073;
                case 11: goto L_0x0056;
                case 12: goto L_0x004b;
                case 13: goto L_0x0031;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00bc;
                case 16: goto L_0x0021;
                case 17: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "There is no way to get here, but the compiler thinks otherwise."
            r3.<init>(r4)
            throw r3
        L_0x0010:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            int r3 = com.google.protobuf.l.F(r3)
            return r3
        L_0x0021:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r4 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.protobuf.l.D(r3)
            return r3
        L_0x0031:
            boolean r3 = r4 instanceof com.google.protobuf.a0.c
            if (r3 == 0) goto L_0x0040
            com.google.protobuf.a0$c r4 = (com.google.protobuf.a0.c) r4
            int r3 = r4.getNumber()
            int r3 = com.google.protobuf.l.s(r3)
            return r3
        L_0x0040:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.protobuf.l.s(r3)
            return r3
        L_0x004b:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.protobuf.l.D(r3)
            return r3
        L_0x0056:
            boolean r3 = r4 instanceof com.google.protobuf.i
            if (r3 == 0) goto L_0x0068
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            int r3 = r4.size()
            int r4 = com.google.protobuf.l.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x0068:
            byte[] r4 = (byte[]) r4
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            int r3 = r4.length
            int r4 = com.google.protobuf.l.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x0073:
            boolean r3 = r4 instanceof com.google.protobuf.d0
            if (r3 == 0) goto L_0x007e
            com.google.protobuf.d0 r4 = (com.google.protobuf.d0) r4
            int r3 = com.google.protobuf.l.u(r4)
            return r3
        L_0x007e:
            com.google.protobuf.r0 r4 = (com.google.protobuf.r0) r4
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            int r3 = r4.getSerializedSize()
            int r4 = com.google.protobuf.l.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x008c:
            com.google.protobuf.r0 r4 = (com.google.protobuf.r0) r4
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            int r3 = r4.getSerializedSize()
            return r3
        L_0x0095:
            boolean r3 = r4 instanceof com.google.protobuf.i
            if (r3 == 0) goto L_0x00a7
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            int r3 = r4.size()
            int r4 = com.google.protobuf.l.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x00a7:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.protobuf.l.A(r4)
            return r3
        L_0x00ae:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            return r0
        L_0x00b6:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.intValue()
            goto L_0x00e8
        L_0x00bc:
            java.lang.Long r4 = (java.lang.Long) r4
            r4.longValue()
            goto L_0x00f1
        L_0x00c2:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = com.google.protobuf.l.s(r3)
            return r3
        L_0x00cd:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.protobuf.l.F(r3)
            return r3
        L_0x00d8:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = com.google.protobuf.l.F(r3)
            return r3
        L_0x00e3:
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
        L_0x00e8:
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            r3 = 4
            return r3
        L_0x00ec:
            java.lang.Double r4 = (java.lang.Double) r4
            r4.doubleValue()
        L_0x00f1:
            java.util.logging.Logger r3 = com.google.protobuf.l.f3712b
            r3 = 8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u.e(com.google.protobuf.s1, java.lang.Object):int");
    }

    public static int f(a<?> aVar, Object obj) {
        s1 b9 = aVar.b();
        int number = aVar.getNumber();
        if (!aVar.a()) {
            return d(b9, number, obj);
        }
        int i8 = 0;
        List<Object> list = (List) obj;
        if (aVar.d()) {
            for (Object e : list) {
                i8 += e(b9, e);
            }
            return l.B(number) + i8 + l.D(i8);
        }
        for (Object d9 : list) {
            i8 += d(b9, number, d9);
        }
        return i8;
    }

    public static int h(Map.Entry entry) {
        int B;
        int D;
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.c() != t1.MESSAGE || aVar.a() || aVar.d()) {
            return f(aVar, value);
        }
        if (value instanceof d0) {
            B = (l.B(1) * 2) + l.C(2, ((a) entry.getKey()).getNumber());
            D = l.B(3) + l.u((d0) value);
        } else {
            B = (l.B(1) * 2) + l.C(2, ((a) entry.getKey()).getNumber());
            int B2 = l.B(3);
            int serializedSize = ((r0) value).getSerializedSize();
            D = B2 + l.D(serializedSize) + serializedSize;
        }
        return B + D;
    }

    public static <T extends a<T>> boolean l(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.c() == t1.MESSAGE) {
            boolean a9 = aVar.a();
            Object value = entry.getValue();
            if (a9) {
                for (r0 isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof r0) {
                if (!((r0) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof d0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r6 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r5.getNumber()), r5.b().f3761f, r6.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r6 instanceof com.google.protobuf.d0) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r6 instanceof com.google.protobuf.a0.c) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(com.google.protobuf.u.a r5, java.lang.Object r6) {
        /*
            com.google.protobuf.s1 r0 = r5.b()
            java.nio.charset.Charset r1 = com.google.protobuf.a0.f3589a
            r6.getClass()
            com.google.protobuf.t1 r0 = r0.f3761f
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003d;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0034;
                case 5: goto L_0x0031;
                case 6: goto L_0x0027;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r0 = r6 instanceof com.google.protobuf.r0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r6 instanceof com.google.protobuf.d0
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x001e:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x002f
            boolean r0 = r6 instanceof com.google.protobuf.a0.c
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x0027:
            boolean r0 = r6 instanceof com.google.protobuf.i
            if (r0 != 0) goto L_0x002f
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0043
        L_0x002f:
            r0 = r2
            goto L_0x0044
        L_0x0031:
            boolean r0 = r6 instanceof java.lang.String
            goto L_0x0044
        L_0x0034:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0037:
            boolean r0 = r6 instanceof java.lang.Double
            goto L_0x0044
        L_0x003a:
            boolean r0 = r6 instanceof java.lang.Float
            goto L_0x0044
        L_0x003d:
            boolean r0 = r6 instanceof java.lang.Long
            goto L_0x0044
        L_0x0040:
            boolean r0 = r6 instanceof java.lang.Integer
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.getNumber()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.google.protobuf.s1 r5 = r5.b()
            com.google.protobuf.t1 r5 = r5.f3761f
            r3[r2] = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u.p(com.google.protobuf.u$a, java.lang.Object):void");
    }

    public static void q(l lVar, s1 s1Var, int i8, Object obj) {
        if (s1Var == s1.f3757n) {
            lVar.Y(i8, 3);
            ((r0) obj).writeTo(lVar);
            lVar.Y(i8, 4);
            return;
        }
        lVar.Y(i8, s1Var.f3762g);
        switch (s1Var.ordinal()) {
            case 0:
                lVar.P(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                lVar.N(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                lVar.c0(((Long) obj).longValue());
                return;
            case 3:
                lVar.c0(((Long) obj).longValue());
                return;
            case 4:
                lVar.R(((Integer) obj).intValue());
                return;
            case 5:
                lVar.P(((Long) obj).longValue());
                return;
            case 6:
                lVar.N(((Integer) obj).intValue());
                return;
            case 7:
                lVar.H(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (!(obj instanceof i)) {
                    lVar.X((String) obj);
                    return;
                }
                break;
            case 9:
                ((r0) obj).writeTo(lVar);
                return;
            case 10:
                lVar.T((r0) obj);
                return;
            case 11:
                if (!(obj instanceof i)) {
                    byte[] bArr = (byte[]) obj;
                    lVar.J(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                lVar.a0(((Integer) obj).intValue());
                return;
            case 13:
                lVar.R(obj instanceof a0.c ? ((a0.c) obj).getNumber() : ((Integer) obj).intValue());
                return;
            case 14:
                lVar.N(((Integer) obj).intValue());
                return;
            case 15:
                lVar.P(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                lVar.a0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                lVar.c0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        lVar.L((i) obj);
    }

    public final void a(y.d dVar, Object obj) {
        List list;
        if (dVar.f3814i) {
            p(dVar, obj);
            Object g9 = g(dVar);
            if (g9 == null) {
                list = new ArrayList();
                this.f3777a.put(dVar, list);
            } else {
                list = (List) g9;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public final u<T> clone() {
        i1<T, Object> i1Var;
        u<T> uVar = new u<>();
        int i8 = 0;
        while (true) {
            i1Var = this.f3777a;
            if (i8 >= i1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c9 = i1Var.c(i8);
            uVar.o((a) c9.getKey(), c9.getValue());
            i8++;
        }
        for (Map.Entry next : i1Var.e()) {
            uVar.o((a) next.getKey(), next.getValue());
        }
        uVar.f3779c = this.f3779c;
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.f3777a.equals(((u) obj).f3777a);
    }

    public final Object g(T t8) {
        Object obj = this.f3777a.get(t8);
        return obj instanceof d0 ? ((d0) obj).a((r0) null) : obj;
    }

    public final int hashCode() {
        return this.f3777a.hashCode();
    }

    public final int i() {
        i1<T, Object> i1Var;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i1Var = this.f3777a;
            if (i8 >= i1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c9 = i1Var.c(i8);
            i9 += f((a) c9.getKey(), c9.getValue());
            i8++;
        }
        for (Map.Entry next : i1Var.e()) {
            i9 += f((a) next.getKey(), next.getValue());
        }
        return i9;
    }

    public final boolean j() {
        return this.f3777a.isEmpty();
    }

    public final boolean k() {
        int i8 = 0;
        while (true) {
            i1<T, Object> i1Var = this.f3777a;
            if (i8 >= i1Var.d()) {
                for (Map.Entry<T, Object> l8 : i1Var.e()) {
                    if (!l(l8)) {
                        return false;
                    }
                }
                return true;
            } else if (!l(i1Var.c(i8))) {
                return false;
            } else {
                i8++;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> m() {
        boolean z8 = this.f3779c;
        i1<T, Object> i1Var = this.f3777a;
        return z8 ? new d0.b(i1Var.entrySet().iterator()) : i1Var.entrySet().iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = g(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.util.Map.Entry<T, java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.protobuf.u$a r0 = (com.google.protobuf.u.a) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof com.google.protobuf.d0
            if (r1 == 0) goto L_0x0015
            com.google.protobuf.d0 r5 = (com.google.protobuf.d0) r5
            r1 = 0
            com.google.protobuf.r0 r5 = r5.a(r1)
        L_0x0015:
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r4.g(r0)
            if (r1 != 0) goto L_0x0026
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0026:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x002c:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = c(r2)
            r3.add(r2)
            goto L_0x002c
        L_0x0041:
            com.google.protobuf.t1 r1 = r0.c()
            com.google.protobuf.t1 r2 = com.google.protobuf.t1.MESSAGE
            if (r1 != r2) goto L_0x0061
            java.lang.Object r1 = r4.g(r0)
            if (r1 != 0) goto L_0x0050
            goto L_0x0061
        L_0x0050:
            com.google.protobuf.r0 r1 = (com.google.protobuf.r0) r1
            com.google.protobuf.r0$a r1 = r1.toBuilder()
            com.google.protobuf.r0 r5 = (com.google.protobuf.r0) r5
            com.google.protobuf.y$a r5 = r0.m(r1, r5)
            com.google.protobuf.r0 r1 = r5.build()
            goto L_0x0065
        L_0x0061:
            java.lang.Object r1 = c(r5)
        L_0x0065:
            com.google.protobuf.i1<T, java.lang.Object> r4 = r4.f3777a
            r4.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u.n(java.util.Map$Entry):void");
    }

    public final void o(T t8, Object obj) {
        if (!t8.a()) {
            p(t8, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p(t8, it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof d0) {
            this.f3779c = true;
        }
        this.f3777a.put(t8, obj);
    }

    public u(int i8) {
        int i9 = i1.f3657l;
        h1 h1Var = new h1(0);
        this.f3777a = h1Var;
        if (!this.f3778b) {
            h1Var.g();
            this.f3778b = true;
        }
        if (!this.f3778b) {
            h1Var.g();
            this.f3778b = true;
        }
    }
}
