package androidx.wear.protolayout.protobuf;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile o0 f2059a;

    /* renamed from: b  reason: collision with root package name */
    public volatile g f2060b;

    static {
        n.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.wear.protolayout.protobuf.o0 a(androidx.wear.protolayout.protobuf.o0 r2) {
        /*
            r1 = this;
            androidx.wear.protolayout.protobuf.o0 r0 = r1.f2059a
            if (r0 == 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            monitor-enter(r1)
            androidx.wear.protolayout.protobuf.o0 r0 = r1.f2059a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x000b
            goto L_0x0018
        L_0x000b:
            r1.f2059a = r2     // Catch:{ y -> 0x0012 }
            androidx.wear.protolayout.protobuf.g$f r0 = androidx.wear.protolayout.protobuf.g.f2096g     // Catch:{ y -> 0x0012 }
            r1.f2060b = r0     // Catch:{ y -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f2059a = r2     // Catch:{ all -> 0x001c }
            androidx.wear.protolayout.protobuf.g$f r2 = androidx.wear.protolayout.protobuf.g.f2096g     // Catch:{ all -> 0x001c }
            r1.f2060b = r2     // Catch:{ all -> 0x001c }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
        L_0x0019:
            androidx.wear.protolayout.protobuf.o0 r1 = r1.f2059a
            return r1
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.b0.a(androidx.wear.protolayout.protobuf.o0):androidx.wear.protolayout.protobuf.o0");
    }

    public final g b() {
        if (this.f2060b != null) {
            return this.f2060b;
        }
        synchronized (this) {
            if (this.f2060b != null) {
                g gVar = this.f2060b;
                return gVar;
            }
            this.f2060b = this.f2059a == null ? g.f2096g : this.f2059a.toByteString();
            g gVar2 = this.f2060b;
            return gVar2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        o0 o0Var = this.f2059a;
        o0 o0Var2 = b0Var.f2059a;
        return (o0Var == null && o0Var2 == null) ? b().equals(b0Var.b()) : (o0Var == null || o0Var2 == null) ? o0Var != null ? o0Var.equals(b0Var.a(o0Var.b())) : a(o0Var2.b()).equals(o0Var2) : o0Var.equals(o0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
