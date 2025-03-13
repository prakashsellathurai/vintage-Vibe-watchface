package com.google.protobuf;

public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile r0 f3627a;

    /* renamed from: b  reason: collision with root package name */
    public volatile i f3628b;

    static {
        q.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.protobuf.r0 a(com.google.protobuf.r0 r2) {
        /*
            r1 = this;
            com.google.protobuf.r0 r0 = r1.f3627a
            if (r0 == 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            monitor-enter(r1)
            com.google.protobuf.r0 r0 = r1.f3627a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x000b
            goto L_0x0018
        L_0x000b:
            r1.f3627a = r2     // Catch:{ b0 -> 0x0012 }
            com.google.protobuf.i$f r0 = com.google.protobuf.i.f3648g     // Catch:{ b0 -> 0x0012 }
            r1.f3628b = r0     // Catch:{ b0 -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f3627a = r2     // Catch:{ all -> 0x001c }
            com.google.protobuf.i$f r2 = com.google.protobuf.i.f3648g     // Catch:{ all -> 0x001c }
            r1.f3628b = r2     // Catch:{ all -> 0x001c }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
        L_0x0019:
            com.google.protobuf.r0 r1 = r1.f3627a
            return r1
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e0.a(com.google.protobuf.r0):com.google.protobuf.r0");
    }

    public final i b() {
        if (this.f3628b != null) {
            return this.f3628b;
        }
        synchronized (this) {
            if (this.f3628b != null) {
                i iVar = this.f3628b;
                return iVar;
            }
            this.f3628b = this.f3627a == null ? i.f3648g : this.f3627a.toByteString();
            i iVar2 = this.f3628b;
            return iVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        r0 r0Var = this.f3627a;
        r0 r0Var2 = e0Var.f3627a;
        return (r0Var == null && r0Var2 == null) ? b().equals(e0Var.b()) : (r0Var == null || r0Var2 == null) ? r0Var != null ? r0Var.equals(e0Var.a(r0Var.getDefaultInstanceForType())) : a(r0Var2.getDefaultInstanceForType()).equals(r0Var2) : r0Var.equals(r0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
