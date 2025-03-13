package n1;

public final /* synthetic */ class k0 implements AutoCloseable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f5643f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f5644g;

    public /* synthetic */ k0(AutoCloseable autoCloseable, AutoCloseable autoCloseable2) {
        this.f5643f = autoCloseable;
        this.f5644g = autoCloseable2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        k3.j.o(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r2 = this;
            java.lang.AutoCloseable r0 = r2.f5643f
            if (r0 == 0) goto L_0x0019
            java.lang.AutoCloseable r2 = r2.f5644g
            if (r2 == 0) goto L_0x000b
            r2.close()     // Catch:{ all -> 0x0012 }
        L_0x000b:
            h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x0012 }
            r2 = 0
            k3.j.o(r0, r2)
            goto L_0x0019
        L_0x0012:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r1 = move-exception
            k3.j.o(r0, r2)
            throw r1
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.k0.close():void");
    }
}
