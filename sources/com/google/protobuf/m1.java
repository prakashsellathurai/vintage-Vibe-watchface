package com.google.protobuf;

public abstract class m1<T, B> {
    public abstract void a(int i8, int i9, Object obj);

    public abstract void b(int i8, long j8, Object obj);

    public abstract void c(B b9, int i8, T t8);

    public abstract void d(B b9, int i8, i iVar);

    public abstract void e(int i8, long j8, Object obj);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t8);

    public abstract int i(T t8);

    public abstract void j(Object obj);

    public abstract T k(T t8, T t9);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(B r7, com.google.protobuf.e1 r8) {
        /*
            r6 = this;
            int r0 = r8.a()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.p()
            r6.a(r1, r8, r7)
            return r2
        L_0x0021:
            com.google.protobuf.b0$a r6 = com.google.protobuf.b0.d()
            throw r6
        L_0x0026:
            r6 = 0
            return r6
        L_0x0028:
            java.lang.Object r0 = r6.m()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.t()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.l(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.a()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.q(r0)
            r6.c(r7, r1, r8)
            return r2
        L_0x004c:
            com.google.protobuf.b0 r6 = com.google.protobuf.b0.a()
            throw r6
        L_0x0051:
            com.google.protobuf.i r8 = r8.B()
            r6.d(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.f()
            r6.b(r1, r3, r7)
            return r2
        L_0x0061:
            long r3 = r8.L()
            r6.e(r1, r3, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m1.l(java.lang.Object, com.google.protobuf.e1):boolean");
    }

    public abstract B m();

    public abstract void n(Object obj, B b9);

    public abstract void o(Object obj, T t8);

    public abstract void p();

    public abstract T q(B b9);

    public abstract void r(Object obj, m mVar);

    public abstract void s(Object obj, m mVar);
}
