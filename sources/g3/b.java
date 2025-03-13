package g3;

public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4570a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4571b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4572c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4573d;
    public int e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4574f = 3;

    public b(Object obj, d dVar) {
        this.f4570a = obj;
        this.f4571b = dVar;
    }

    public final boolean a() {
        boolean z8;
        synchronized (this.f4570a) {
            if (!this.f4572c.a()) {
                if (!this.f4573d.a()) {
                    z8 = false;
                }
            }
            z8 = true;
        }
        return z8;
    }

    public final void b(c cVar) {
        synchronized (this.f4570a) {
            if (cVar.equals(this.f4572c)) {
                this.e = 4;
            } else if (cVar.equals(this.f4573d)) {
                this.f4574f = 4;
            }
            d dVar = this.f4571b;
            if (dVar != null) {
                dVar.b(this);
            }
        }
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f4570a) {
            z8 = this.e == 3 && this.f4574f == 3;
        }
        return z8;
    }

    public final void clear() {
        synchronized (this.f4570a) {
            this.e = 3;
            this.f4572c.clear();
            if (this.f4574f != 3) {
                this.f4574f = 3;
                this.f4573d.clear();
            }
        }
    }

    public final boolean d(c cVar) {
        boolean z8;
        boolean z9;
        synchronized (this.f4570a) {
            d dVar = this.f4571b;
            z8 = false;
            if (dVar != null) {
                if (!dVar.d(this)) {
                    z9 = false;
                    if (z9 && l(cVar)) {
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
        synchronized (this.f4570a) {
            d dVar = this.f4571b;
            z8 = false;
            if (dVar != null) {
                if (!dVar.e(this)) {
                    z9 = false;
                    if (z9 && l(cVar)) {
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
        synchronized (this.f4570a) {
            if (this.e == 1) {
                this.e = 2;
                this.f4572c.f();
            }
            if (this.f4574f == 1) {
                this.f4574f = 2;
                this.f4573d.f();
            }
        }
    }

    public final void g() {
        synchronized (this.f4570a) {
            if (this.e != 1) {
                this.e = 1;
                this.f4572c.g();
            }
        }
    }

    public final d getRoot() {
        synchronized (this.f4570a) {
            d dVar = this.f4571b;
            this = this;
            if (dVar != null) {
                this = dVar.getRoot();
            }
        }
        return this;
    }

    public final boolean h(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f4572c.h(bVar.f4572c) && this.f4573d.h(bVar.f4573d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(g3.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4570a
            monitor-enter(r0)
            g3.c r1 = r2.f4573d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f4574f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f4574f = r1     // Catch:{ all -> 0x0027 }
            g3.c r2 = r2.f4573d     // Catch:{ all -> 0x0027 }
            r2.g()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f4574f = r1     // Catch:{ all -> 0x0027 }
            g3.d r3 = r2.f4571b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.i(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.b.i(g3.c):void");
    }

    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f4570a) {
            z8 = true;
            if (this.e != 1) {
                if (this.f4574f != 1) {
                    z8 = false;
                }
            }
        }
        return z8;
    }

    public final boolean j() {
        boolean z8;
        synchronized (this.f4570a) {
            if (this.e != 4) {
                if (this.f4574f != 4) {
                    z8 = false;
                }
            }
            z8 = true;
        }
        return z8;
    }

    public final boolean k(c cVar) {
        boolean z8;
        boolean z9;
        synchronized (this.f4570a) {
            d dVar = this.f4571b;
            z8 = false;
            if (dVar != null) {
                if (!dVar.k(this)) {
                    z9 = false;
                    if (z9 && l(cVar)) {
                        z8 = true;
                    }
                }
            }
            z9 = true;
            z8 = true;
        }
        return z8;
    }

    public final boolean l(c cVar) {
        return cVar.equals(this.f4572c) || (this.e == 5 && cVar.equals(this.f4573d));
    }
}
