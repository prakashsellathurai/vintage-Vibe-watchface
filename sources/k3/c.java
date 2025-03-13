package k3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public final long f5130f;

    /* renamed from: g  reason: collision with root package name */
    public int f5131g;

    public c(InputStream inputStream, long j8) {
        super(inputStream);
        this.f5130f = j8;
    }

    public final void a(int i8) {
        int i9 = this.f5131g;
        if (i8 >= 0) {
            this.f5131g = i9 + i8;
            return;
        }
        long j8 = this.f5130f;
        if (j8 - ((long) i9) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j8 + ", but read: " + this.f5131g);
        }
    }

    public final synchronized int available() {
        return (int) Math.max(this.f5130f - ((long) this.f5131g), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i8, int i9) {
        int read;
        read = super.read(bArr, i8, i9);
        a(read);
        return read;
    }
}
