package k3;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class h extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public int f5143f = Integer.MIN_VALUE;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    public final long a(long j8) {
        int i8 = this.f5143f;
        if (i8 == 0) {
            return -1;
        }
        return (i8 == Integer.MIN_VALUE || j8 <= ((long) i8)) ? j8 : (long) i8;
    }

    public final int available() {
        int i8 = this.f5143f;
        int available = super.available();
        return i8 == Integer.MIN_VALUE ? available : Math.min(i8, available);
    }

    public final void c(long j8) {
        int i8 = this.f5143f;
        if (i8 != Integer.MIN_VALUE && j8 != -1) {
            this.f5143f = (int) (((long) i8) - j8);
        }
    }

    public final synchronized void mark(int i8) {
        super.mark(i8);
        this.f5143f = i8;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        c(1);
        return read;
    }

    public final int read(byte[] bArr, int i8, int i9) {
        int a9 = (int) a((long) i9);
        if (a9 == -1) {
            return -1;
        }
        int read = super.read(bArr, i8, a9);
        c((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f5143f = Integer.MIN_VALUE;
    }

    public final long skip(long j8) {
        long a9 = a(j8);
        if (a9 == -1) {
            return 0;
        }
        long skip = super.skip(a9);
        c(skip);
        return skip;
    }
}
