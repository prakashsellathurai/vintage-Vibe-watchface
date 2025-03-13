package g3;

import b6.a;

public final class i implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f4597a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4598b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4599c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4600d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4601f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4602g;

    public i(Object obj, d dVar) {
        this.f4598b = obj;
        this.f4597a = dVar;
    }

    public final boolean a() {
        boolean z8;
        synchronized (this.f4598b) {
            if (!this.f4600d.a()) {
                if (!this.f4599c.a()) {
                    z8 = false;
                }
            }
            z8 = true;
        }
        return z8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(g3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4598b
            monitor-enter(r0)
            g3.c r1 = r2.f4600d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f4601f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.e = r1     // Catch:{ all -> 0x0028 }
            g3.d r3 = r2.f4597a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.b(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f4601f     // Catch:{ all -> 0x0028 }
            boolean r3 = b6.a.b(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            g3.c r2 = r2.f4600d     // Catch:{ all -> 0x0028 }
            r2.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.b(g3.c):void");
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f4598b) {
            z8 = this.e == 3;
        }
        return z8;
    }

    public final void clear() {
        synchronized (this.f4598b) {
            this.f4602g = false;
            this.e = 3;
            this.f4601f = 3;
            this.f4600d.clear();
            this.f4599c.clear();
        }
    }

    public final boolean d(c cVar) {
        boolean z8;
        boolean z9;
        synchronized (this.f4598b) {
            d dVar = this.f4597a;
            z8 = false;
            if (dVar != null) {
                if (!dVar.d(this)) {
                    z9 = false;
                    if (z9 && cVar.equals(this.f4599c) && !a()) {
                        z8 = true;
                    }
                }
            }
            z9 = true;
            z8 = true;
        }
        return z8;
    }

    public final boolean e(c cVar) {
        boolean z8;
        boolean z9;
        synchronized (this.f4598b) {
            d dVar = this.f4597a;
            z8 = false;
            if (dVar != null) {
                if (!dVar.e(this)) {
                    z9 = false;
                    if (z9 && cVar.equals(this.f4599c) && this.e != 2) {
                        z8 = true;
                    }
                }
            }
            z9 = true;
            z8 = true;
        }
        return z8;
    }

    public final void f() {
        synchronized (this.f4598b) {
            if (!a.b(this.f4601f)) {
                this.f4601f = 2;
                this.f4600d.f();
            }
            if (!a.b(this.e)) {
                this.e = 2;
                this.f4599c.f();
            }
        }
    }

    public final void g() {
        synchronized (this.f4598b) {
            this.f4602g = true;
            try {
                if (!(this.e == 4 || this.f4601f == 1)) {
                    this.f4601f = 1;
                    this.f4600d.g();
                }
                if (this.f4602g && this.e != 1) {
                    this.e = 1;
                    this.f4599c.g();
                }
            } finally {
                this.f4602g = false;
            }
        }
    }

    public final d getRoot() {
        synchronized (this.f4598b) {
            d dVar = this.f4597a;
            this = this;
            if (dVar != null) {
                this = dVar.getRoot();
            }
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(g3.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof g3.i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            g3.i r4 = (g3.i) r4
            g3.c r0 = r3.f4599c
            if (r0 != 0) goto L_0x0010
            g3.c r0 = r4.f4599c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            g3.c r0 = r3.f4599c
            g3.c r2 = r4.f4599c
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            g3.c r0 = r3.f4600d
            if (r0 != 0) goto L_0x0023
            g3.c r3 = r4.f4600d
            if (r3 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            g3.c r3 = r3.f4600d
            g3.c r4 = r4.f4600d
            boolean r3 = r3.h(r4)
            if (r3 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.h(g3.c):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(g3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4598b
            monitor-enter(r0)
            g3.c r1 = r2.f4599c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f4601f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.e = r1     // Catch:{ all -> 0x001b }
            g3.d r3 = r2.f4597a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.i(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.i(g3.c):void");
    }

    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f4598b) {
            z8 = true;
            if (this.e != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    public final boolean j() {
        boolean z8;
        synchronized (this.f4598b) {
            z8 = this.e == 4;
        }
        return z8;
    }

    public final boolean k(c cVar) {
        boolean z8;
        boolean z9;
        synchronized (this.f4598b) {
            d dVar = this.f4597a;
            z8 = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z9 = false;
                    if (z9 && (cVar.equals(this.f4599c) || this.e != 4)) {
                        z8 = true;
                    }
                }
            }
            z9 = true;
            z8 = true;
        }
        return z8;
    }
}
