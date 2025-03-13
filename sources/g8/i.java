package g8;

import java.io.EOFException;
import java.nio.ByteBuffer;

public final class i implements b {

    /* renamed from: f  reason: collision with root package name */
    public final a f4700f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final m f4701g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4702h;

    public i(m mVar) {
        this.f4701g = mVar;
    }

    public final long C(c cVar) {
        if (!this.f4702h) {
            long j8 = 0;
            while (true) {
                a aVar = this.f4700f;
                long c9 = aVar.c(cVar, j8);
                if (c9 != -1) {
                    return c9;
                }
                long j9 = aVar.f4683g;
                if (this.f4701g.y(aVar, 8192) == -1) {
                    return -1;
                }
                j8 = Math.max(j8, j9);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final int L(f fVar) {
        a aVar;
        if (!this.f4702h) {
            do {
                aVar = this.f4700f;
                int n8 = aVar.n(fVar, true);
                if (n8 == -1) {
                    return -1;
                }
                if (n8 != -2) {
                    aVar.o((long) fVar.f4691f[n8].j());
                    return n8;
                }
            } while (this.f4701g.y(aVar, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public final i a() {
        return new i(new g(this));
    }

    public final byte c() {
        if (m(1)) {
            return this.f4700f.d();
        }
        throw new EOFException();
    }

    public final void close() {
        if (!this.f4702h) {
            this.f4702h = true;
            this.f4701g.close();
            a aVar = this.f4700f;
            aVar.getClass();
            try {
                aVar.o(aVar.f4683g);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final a i() {
        return this.f4700f;
    }

    public final boolean isOpen() {
        return !this.f4702h;
    }

    public final boolean m(long j8) {
        a aVar;
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        } else if (!this.f4702h) {
            do {
                aVar = this.f4700f;
                if (aVar.f4683g >= j8) {
                    return true;
                }
            } while (this.f4701g.y(aVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        a aVar = this.f4700f;
        if (aVar.f4683g == 0 && this.f4701g.y(aVar, 8192) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f4701g + ")";
    }

    public final long y(a aVar, long j8) {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (!this.f4702h) {
            a aVar2 = this.f4700f;
            if (aVar2.f4683g == 0 && this.f4701g.y(aVar2, 8192) == -1) {
                return -1;
            }
            return aVar2.y(aVar, Math.min(8192, aVar2.f4683g));
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
