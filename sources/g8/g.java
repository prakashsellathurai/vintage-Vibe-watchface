package g8;

public final class g implements m {

    /* renamed from: f  reason: collision with root package name */
    public final b f4693f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4694g;

    /* renamed from: h  reason: collision with root package name */
    public j f4695h;

    /* renamed from: i  reason: collision with root package name */
    public int f4696i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4697j;

    /* renamed from: k  reason: collision with root package name */
    public long f4698k;

    public g(b bVar) {
        this.f4693f = bVar;
        a i8 = bVar.i();
        this.f4694g = i8;
        j jVar = i8.f4682f;
        this.f4695h = jVar;
        this.f4696i = jVar != null ? jVar.f4704b : -1;
    }

    public final void close() {
        this.f4697j = true;
    }

    public final long y(a aVar, long j8) {
        j jVar;
        j jVar2;
        if (!this.f4697j) {
            j jVar3 = this.f4695h;
            a aVar2 = this.f4694g;
            if (jVar3 == null || (jVar3 == (jVar2 = aVar2.f4682f) && this.f4696i == jVar2.f4704b)) {
                if (!this.f4693f.m(this.f4698k + 1)) {
                    return -1;
                }
                if (this.f4695h == null && (jVar = aVar2.f4682f) != null) {
                    this.f4695h = jVar;
                    this.f4696i = jVar.f4704b;
                }
                long min = Math.min(8192, aVar2.f4683g - this.f4698k);
                long j9 = this.f4698k;
                if (aVar != null) {
                    n.a(aVar2.f4683g, j9, min);
                    if (min != 0) {
                        aVar.f4683g += min;
                        j jVar4 = aVar2.f4682f;
                        while (true) {
                            long j10 = (long) (jVar4.f4705c - jVar4.f4704b);
                            if (j9 < j10) {
                                break;
                            }
                            j9 -= j10;
                            jVar4 = jVar4.f4707f;
                        }
                        long j11 = min;
                        while (j11 > 0) {
                            j c9 = jVar4.c();
                            int i8 = (int) (((long) c9.f4704b) + j9);
                            c9.f4704b = i8;
                            c9.f4705c = Math.min(i8 + ((int) j11), c9.f4705c);
                            j jVar5 = aVar.f4682f;
                            if (jVar5 == null) {
                                c9.f4708g = c9;
                                c9.f4707f = c9;
                                aVar.f4682f = c9;
                            } else {
                                jVar5.f4708g.b(c9);
                            }
                            j11 -= (long) (c9.f4705c - c9.f4704b);
                            jVar4 = jVar4.f4707f;
                            j9 = 0;
                        }
                    }
                    this.f4698k += min;
                    return min;
                }
                throw new IllegalArgumentException("out == null");
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }
}
