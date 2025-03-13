package androidx.wear.protolayout.protobuf;

public enum s {
    DOUBLE_LIST_PACKED(35, 3, r18),
    SINT64_LIST_PACKED(48, 3, r3);
    

    /* renamed from: i  reason: collision with root package name */
    public static final s[] f2191i = null;

    /* renamed from: f  reason: collision with root package name */
    public final int f2193f;

    /* access modifiers changed from: public */
    static {
        int i8;
        s[] values = values();
        f2191i = new s[values.length];
        for (s sVar : values) {
            f2191i[sVar.f2193f] = sVar;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.Object] */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    s(int r3, java.lang.Object r4, androidx.wear.protolayout.protobuf.z r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2193f = r3
            if (r4 == 0) goto L_0x0019
            int r0 = r4 + -1
            r1 = 1
            if (r0 == r1) goto L_0x0010
            r2 = 3
            if (r0 == r2) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r5.getClass()
        L_0x0013:
            if (r4 != r1) goto L_0x0018
            r5.ordinal()
        L_0x0018:
            return
        L_0x0019:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.s.<init>(java.lang.String, int, int, int, androidx.wear.protolayout.protobuf.z):void");
    }

    public final int e() {
        return this.f2193f;
    }
}
