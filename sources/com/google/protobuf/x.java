package com.google.protobuf;

public final class x implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x f3809a = new x();

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.p0 a(java.lang.Class<?> r3) {
        /*
            r2 = this;
            java.lang.Class<com.google.protobuf.y> r2 = com.google.protobuf.y.class
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Class r2 = r3.asSubclass(r2)     // Catch:{ Exception -> 0x0017 }
            com.google.protobuf.y r2 = com.google.protobuf.y.getDefaultInstance(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r2 = r2.buildMessageInfo()     // Catch:{ Exception -> 0x0017 }
            com.google.protobuf.p0 r2 = (com.google.protobuf.p0) r2     // Catch:{ Exception -> 0x0017 }
            return r2
        L_0x0017:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "Unable to get message info for "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3, r2)
            throw r0
        L_0x0028:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "Unsupported message type: "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x.a(java.lang.Class):com.google.protobuf.p0");
    }

    public final boolean b(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }
}
