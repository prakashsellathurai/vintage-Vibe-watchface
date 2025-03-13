package n6;

public final class a {

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    public static class C0095a {

        /* renamed from: a  reason: collision with root package name */
        public final float f5956a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5957b;

        /* renamed from: c  reason: collision with root package name */
        public final float f5958c;

        public C0095a(float f9, float f10) {
            this.f5956a = f9;
            this.f5957b = f10;
            this.f5958c = f9 + f10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static n6.a.C0095a a(float r6, float r7, int r8) {
        /*
            float r0 = r7 - r6
            r1 = 1135869952(0x43b40000, float:360.0)
            float r0 = r0 % r1
            if (r8 == 0) goto L_0x003f
            int r8 = r8 + -1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r8 == r4) goto L_0x0025
            r5 = 2
            if (r8 == r5) goto L_0x0012
            goto L_0x0037
        L_0x0012:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0019
            float r1 = r0 - r1
            goto L_0x0038
        L_0x0019:
            if (r8 != 0) goto L_0x0020
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0020
            r2 = r4
        L_0x0020:
            if (r2 == 0) goto L_0x0037
            r1 = -1011613696(0xffffffffc3b40000, float:-360.0)
            goto L_0x0038
        L_0x0025:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x002b
            float r1 = r1 + r0
            goto L_0x0038
        L_0x002b:
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0034
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            r2 = r4
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r0
        L_0x0038:
            n6.a$a r6 = new n6.a$a
            float r7 = r7 - r1
            r6.<init>(r7, r1)
            return r6
        L_0x003f:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.a.a(float, float, int):n6.a$a");
    }

    public static C0095a b(float f9, float f10, Boolean bool) {
        return a(f9, f10, bool.booleanValue() ? 2 : 3);
    }
}
