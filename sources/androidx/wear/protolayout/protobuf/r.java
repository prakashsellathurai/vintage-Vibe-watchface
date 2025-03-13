package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.a0;
import androidx.wear.protolayout.protobuf.o0;
import androidx.wear.protolayout.protobuf.r.a;
import androidx.wear.protolayout.protobuf.v;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

public final class r<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final r f2168d = new r(0);

    /* renamed from: a  reason: collision with root package name */
    public final e1<T, Object> f2169a = new d1(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f2170b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2171c;

    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void b();

        o1 c();

        void d();

        void getNumber();

        v.a k(o0.a aVar, o0 o0Var);
    }

    public r() {
        int i8 = e1.f2074l;
    }

    public static Object b(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int c(n1 n1Var, int i8, Object obj) {
        int B = j.B(i8);
        if (n1Var == n1.f2152f) {
            B *= 2;
        }
        return B + d(n1Var, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.f2125b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.f2125b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f5, code lost:
        return 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(androidx.wear.protolayout.protobuf.n1 r3, java.lang.Object r4) {
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
            int r3 = androidx.wear.protolayout.protobuf.j.F(r3)
            return r3
        L_0x0021:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r4 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = androidx.wear.protolayout.protobuf.j.D(r3)
            return r3
        L_0x0031:
            boolean r3 = r4 instanceof androidx.wear.protolayout.protobuf.x.a
            if (r3 == 0) goto L_0x0040
            androidx.wear.protolayout.protobuf.x$a r4 = (androidx.wear.protolayout.protobuf.x.a) r4
            int r3 = r4.getNumber()
            int r3 = androidx.wear.protolayout.protobuf.j.s(r3)
            return r3
        L_0x0040:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = androidx.wear.protolayout.protobuf.j.s(r3)
            return r3
        L_0x004b:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            int r3 = androidx.wear.protolayout.protobuf.j.D(r3)
            return r3
        L_0x0056:
            boolean r3 = r4 instanceof androidx.wear.protolayout.protobuf.g
            if (r3 == 0) goto L_0x0068
            androidx.wear.protolayout.protobuf.g r4 = (androidx.wear.protolayout.protobuf.g) r4
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            int r3 = r4.size()
            int r4 = androidx.wear.protolayout.protobuf.j.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x0068:
            byte[] r4 = (byte[]) r4
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            int r3 = r4.length
            int r4 = androidx.wear.protolayout.protobuf.j.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x0073:
            boolean r3 = r4 instanceof androidx.wear.protolayout.protobuf.a0
            if (r3 == 0) goto L_0x007e
            androidx.wear.protolayout.protobuf.a0 r4 = (androidx.wear.protolayout.protobuf.a0) r4
            int r3 = androidx.wear.protolayout.protobuf.j.u(r4)
            return r3
        L_0x007e:
            androidx.wear.protolayout.protobuf.o0 r4 = (androidx.wear.protolayout.protobuf.o0) r4
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            int r3 = r4.getSerializedSize()
            int r4 = androidx.wear.protolayout.protobuf.j.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x008c:
            androidx.wear.protolayout.protobuf.o0 r4 = (androidx.wear.protolayout.protobuf.o0) r4
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            int r3 = r4.getSerializedSize()
            return r3
        L_0x0095:
            boolean r3 = r4 instanceof androidx.wear.protolayout.protobuf.g
            if (r3 == 0) goto L_0x00a7
            androidx.wear.protolayout.protobuf.g r4 = (androidx.wear.protolayout.protobuf.g) r4
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            int r3 = r4.size()
            int r4 = androidx.wear.protolayout.protobuf.j.D(r3)
            int r4 = r4 + r3
            return r4
        L_0x00a7:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = androidx.wear.protolayout.protobuf.j.A(r4)
            return r3
        L_0x00ae:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
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
            int r3 = androidx.wear.protolayout.protobuf.j.s(r3)
            return r3
        L_0x00cd:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = androidx.wear.protolayout.protobuf.j.F(r3)
            return r3
        L_0x00d8:
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            int r3 = androidx.wear.protolayout.protobuf.j.F(r3)
            return r3
        L_0x00e3:
            java.lang.Float r4 = (java.lang.Float) r4
            r4.floatValue()
        L_0x00e8:
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            r3 = 4
            return r3
        L_0x00ec:
            java.lang.Double r4 = (java.lang.Double) r4
            r4.doubleValue()
        L_0x00f1:
            java.util.logging.Logger r3 = androidx.wear.protolayout.protobuf.j.f2125b
            r3 = 8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r.d(androidx.wear.protolayout.protobuf.n1, java.lang.Object):int");
    }

    public static int e(a<?> aVar, Object obj) {
        aVar.b();
        aVar.getNumber();
        aVar.a();
        return c((n1) null, 0, obj);
    }

    public static int g(Map.Entry entry) {
        int B;
        int D;
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.c() != o1.MESSAGE) {
            return e(aVar, value);
        }
        aVar.a();
        aVar.d();
        if (value instanceof a0) {
            ((a) entry.getKey()).getNumber();
            B = (j.B(1) * 2) + j.C(2, 0);
            D = j.B(3) + j.u((a0) value);
        } else {
            ((a) entry.getKey()).getNumber();
            B = (j.B(1) * 2) + j.C(2, 0);
            int B2 = j.B(3);
            int serializedSize = ((o0) value).getSerializedSize();
            D = B2 + j.D(serializedSize) + serializedSize;
        }
        return B + D;
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.c() != o1.MESSAGE) {
            return true;
        }
        aVar.a();
        Object value = entry.getValue();
        if (value instanceof p0) {
            return ((p0) value).isInitialized();
        }
        if (value instanceof a0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void p(a aVar, Object obj) {
        aVar.b();
        Charset charset = x.f2214a;
        obj.getClass();
        throw null;
    }

    /* renamed from: a */
    public final r<T> clone() {
        e1<T, Object> e1Var;
        r<T> rVar = new r<>();
        int i8 = 0;
        while (true) {
            e1Var = this.f2169a;
            if (i8 >= e1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c9 = e1Var.c(i8);
            rVar.o((a) c9.getKey(), c9.getValue());
            i8++;
        }
        for (Map.Entry next : e1Var.e()) {
            rVar.o((a) next.getKey(), next.getValue());
        }
        rVar.f2171c = this.f2171c;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f2169a.equals(((r) obj).f2169a);
    }

    public final Object f(T t8) {
        Object obj = this.f2169a.get(t8);
        return obj instanceof a0 ? ((a0) obj).a((o0) null) : obj;
    }

    public final int h() {
        e1<T, Object> e1Var;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            e1Var = this.f2169a;
            if (i8 >= e1Var.d()) {
                break;
            }
            Map.Entry<T, Object> c9 = e1Var.c(i8);
            i9 += e((a) c9.getKey(), c9.getValue());
            i8++;
        }
        for (Map.Entry next : e1Var.e()) {
            i9 += e((a) next.getKey(), next.getValue());
        }
        return i9;
    }

    public final int hashCode() {
        return this.f2169a.hashCode();
    }

    public final boolean i() {
        return this.f2169a.isEmpty();
    }

    public final boolean j() {
        int i8 = 0;
        while (true) {
            e1<T, Object> e1Var = this.f2169a;
            if (i8 >= e1Var.d()) {
                for (Map.Entry<T, Object> k8 : e1Var.e()) {
                    if (!k(k8)) {
                        return false;
                    }
                }
                return true;
            } else if (!k(e1Var.c(i8))) {
                return false;
            } else {
                i8++;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        boolean z8 = this.f2171c;
        e1<T, Object> e1Var = this.f2169a;
        return z8 ? new a0.b(e1Var.entrySet().iterator()) : e1Var.entrySet().iterator();
    }

    public final void m() {
        if (!this.f2170b) {
            int i8 = 0;
            while (true) {
                e1<T, Object> e1Var = this.f2169a;
                if (i8 < e1Var.d()) {
                    Map.Entry<T, Object> c9 = e1Var.c(i8);
                    if (c9.getValue() instanceof v) {
                        v vVar = (v) c9.getValue();
                        vVar.getClass();
                        y0 y0Var = y0.f2217c;
                        y0Var.getClass();
                        y0Var.a(vVar.getClass()).b(vVar);
                        vVar.p();
                    }
                    i8++;
                } else {
                    e1Var.g();
                    this.f2170b = true;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r1 = f(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.util.Map.Entry<T, java.lang.Object> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r4.getKey()
            androidx.wear.protolayout.protobuf.r$a r0 = (androidx.wear.protolayout.protobuf.r.a) r0
            java.lang.Object r4 = r4.getValue()
            boolean r1 = r4 instanceof androidx.wear.protolayout.protobuf.a0
            if (r1 == 0) goto L_0x0015
            androidx.wear.protolayout.protobuf.a0 r4 = (androidx.wear.protolayout.protobuf.a0) r4
            r1 = 0
            androidx.wear.protolayout.protobuf.o0 r4 = r4.a(r1)
        L_0x0015:
            r0.a()
            androidx.wear.protolayout.protobuf.o1 r1 = r0.c()
            androidx.wear.protolayout.protobuf.o1 r2 = androidx.wear.protolayout.protobuf.o1.MESSAGE
            if (r1 != r2) goto L_0x0038
            java.lang.Object r1 = r3.f(r0)
            if (r1 != 0) goto L_0x0027
            goto L_0x0038
        L_0x0027:
            androidx.wear.protolayout.protobuf.o0 r1 = (androidx.wear.protolayout.protobuf.o0) r1
            androidx.wear.protolayout.protobuf.v$a r1 = r1.toBuilder()
            androidx.wear.protolayout.protobuf.o0 r4 = (androidx.wear.protolayout.protobuf.o0) r4
            androidx.wear.protolayout.protobuf.v$a r4 = r0.k(r1, r4)
            androidx.wear.protolayout.protobuf.v r4 = r4.c()
            goto L_0x003c
        L_0x0038:
            java.lang.Object r4 = b(r4)
        L_0x003c:
            androidx.wear.protolayout.protobuf.e1<T, java.lang.Object> r3 = r3.f2169a
            r3.put(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r.n(java.util.Map$Entry):void");
    }

    public final void o(T t8, Object obj) {
        t8.a();
        p(t8, obj);
        throw null;
    }

    public r(int i8) {
        int i9 = e1.f2074l;
        m();
        m();
    }
}
