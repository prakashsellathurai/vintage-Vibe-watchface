package androidx.wear.protolayout.protobuf;

public abstract class h1<T, B> {
    public abstract void a(int i8, int i9, Object obj);

    public abstract void b(int i8, long j8, Object obj);

    public abstract void c(B b9, int i8, T t8);

    public abstract void d(B b9, int i8, g gVar);

    public abstract void e(int i8, long j8, Object obj);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t8);

    public abstract int i(T t8);

    public abstract void j(Object obj);

    public abstract T k(T t8, T t9);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[LOOP:0: B:16:0x0037->B:19:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(B r7, androidx.wear.protolayout.protobuf.a1 r8) {
        /*
            r6 = this;
            androidx.wear.protolayout.protobuf.i r8 = (androidx.wear.protolayout.protobuf.i) r8
            int r0 = r8.f2115b
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x006f
            if (r0 == r3) goto L_0x0062
            r4 = 2
            if (r0 == r4) goto L_0x005a
            r4 = 3
            r5 = 4
            if (r0 == r4) goto L_0x0030
            if (r0 == r5) goto L_0x002f
            r2 = 5
            if (r0 != r2) goto L_0x0027
            r8.v(r2)
            androidx.wear.protolayout.protobuf.h r8 = r8.f2114a
            int r8 = r8.k()
            r6.a(r1, r8, r7)
            return r3
        L_0x0027:
            int r6 = androidx.wear.protolayout.protobuf.y.f2216f
            androidx.wear.protolayout.protobuf.y$a r6 = new androidx.wear.protolayout.protobuf.y$a
            r6.<init>()
            throw r6
        L_0x002f:
            return r2
        L_0x0030:
            java.lang.Object r0 = r6.m()
            int r2 = r1 << 3
            r2 = r2 | r5
        L_0x0037:
            int r4 = r8.a()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x0046
            boolean r4 = r6.l(r0, r8)
            if (r4 != 0) goto L_0x0037
        L_0x0046:
            int r8 = r8.f2115b
            if (r2 != r8) goto L_0x0052
            java.lang.Object r8 = r6.q(r0)
            r6.c(r7, r1, r8)
            return r3
        L_0x0052:
            androidx.wear.protolayout.protobuf.y r6 = new androidx.wear.protolayout.protobuf.y
            java.lang.String r7 = "Protocol message end-group tag did not match expected tag."
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005a:
            androidx.wear.protolayout.protobuf.g r8 = r8.e()
            r6.d(r7, r1, r8)
            return r3
        L_0x0062:
            r8.v(r3)
            androidx.wear.protolayout.protobuf.h r8 = r8.f2114a
            long r4 = r8.l()
            r6.b(r1, r4, r7)
            return r3
        L_0x006f:
            r8.v(r2)
            androidx.wear.protolayout.protobuf.h r8 = r8.f2114a
            long r4 = r8.o()
            r6.e(r1, r4, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.h1.l(java.lang.Object, androidx.wear.protolayout.protobuf.a1):boolean");
    }

    public abstract B m();

    public abstract void n(Object obj, B b9);

    public abstract void o(Object obj, T t8);

    public abstract void p();

    public abstract T q(B b9);

    public abstract void r(Object obj, k kVar);

    public abstract void s(Object obj, k kVar);
}
