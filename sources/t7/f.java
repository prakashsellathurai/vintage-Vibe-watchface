package t7;

public final class f extends d {
    static {
        new f(1, 0);
    }

    public f(long j8, long j9) {
        super(j8, j9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if ((r10.f7542f > r10.f7543g) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof t7.f
            r1 = 0
            if (r0 == 0) goto L_0x0032
            long r2 = r10.f7542f
            long r4 = r10.f7543g
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r10 <= 0) goto L_0x0010
            r10 = r0
            goto L_0x0011
        L_0x0010:
            r10 = r1
        L_0x0011:
            if (r10 == 0) goto L_0x0023
            r10 = r11
            t7.f r10 = (t7.f) r10
            long r6 = r10.f7542f
            long r8 = r10.f7543g
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0020
            r10 = r0
            goto L_0x0021
        L_0x0020:
            r10 = r1
        L_0x0021:
            if (r10 != 0) goto L_0x0031
        L_0x0023:
            t7.f r11 = (t7.f) r11
            long r6 = r11.f7542f
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0032
            long r10 = r11.f7543g
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j8 = this.f7542f;
        long j9 = this.f7543g;
        if (j8 > j9) {
            return -1;
        }
        return (int) ((((long) 31) * (j8 ^ (j8 >>> 32))) + ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        return this.f7542f + ".." + this.f7543g;
    }
}
