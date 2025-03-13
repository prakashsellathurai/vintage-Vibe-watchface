package com.google.protobuf;

public enum v {
    DOUBLE_LIST_PACKED(35, 3, r18),
    SINT64_LIST_PACKED(48, 3, r3);
    

    /* renamed from: i  reason: collision with root package name */
    public static final v[] f3799i = null;

    /* renamed from: f  reason: collision with root package name */
    public final int f3801f;

    /* access modifiers changed from: public */
    static {
        int i8;
        v[] values = values();
        f3799i = new v[values.length];
        for (v vVar : values) {
            f3799i[vVar.f3801f] = vVar;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.Object] */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    v(int r3, java.lang.Object r4, com.google.protobuf.c0 r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f3801f = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.<init>(java.lang.String, int, int, int, com.google.protobuf.c0):void");
    }

    public final int e() {
        return this.f3801f;
    }
}
