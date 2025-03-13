package k3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class d extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayDeque f5132h = new ArrayDeque(0);

    /* renamed from: f  reason: collision with root package name */
    public InputStream f5133f;

    /* renamed from: g  reason: collision with root package name */
    public IOException f5134g;

    static {
        char[] cArr = k.f5169a;
    }

    public final int available() {
        return this.f5133f.available();
    }

    public final void close() {
        this.f5133f.close();
    }

    public final void mark(int i8) {
        this.f5133f.mark(i8);
    }

    public final boolean markSupported() {
        return this.f5133f.markSupported();
    }

    public final int read() {
        try {
            return this.f5133f.read();
        } catch (IOException e) {
            this.f5134g = e;
            throw e;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f5133f.read(bArr);
        } catch (IOException e) {
            this.f5134g = e;
            throw e;
        }
    }

    public final int read(byte[] bArr, int i8, int i9) {
        try {
            return this.f5133f.read(bArr, i8, i9);
        } catch (IOException e) {
            this.f5134g = e;
            throw e;
        }
    }

    public final synchronized void reset() {
        this.f5133f.reset();
    }

    public final long skip(long j8) {
        try {
            return this.f5133f.skip(j8);
        } catch (IOException e) {
            this.f5134g = e;
            throw e;
        }
    }
}
