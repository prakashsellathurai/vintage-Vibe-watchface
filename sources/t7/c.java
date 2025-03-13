package t7;

public final class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final c f7541i = new c(1, 0);

    public c(int i8, int i9) {
        super(i8, i9, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (t7.c) r3;
        r0 = r3.f7534f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r3.f7535g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof t7.c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            t7.c r0 = (t7.c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            t7.c r3 = (t7.c) r3
            int r0 = r3.f7534f
            int r1 = r2.f7534f
            if (r1 != r0) goto L_0x0023
            int r3 = r3.f7535g
            int r2 = r2.f7535g
            if (r2 != r3) goto L_0x0023
        L_0x0021:
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f7535g + (this.f7534f * 31);
    }

    public final boolean isEmpty() {
        return this.f7534f > this.f7535g;
    }

    public final String toString() {
        return this.f7534f + ".." + this.f7535g;
    }
}
