package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f2986h = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final int f2987i = 31;

    /* renamed from: f  reason: collision with root package name */
    public final byte f2988f;

    /* renamed from: g  reason: collision with root package name */
    public int f2989g;

    public g(int i8, InputStream inputStream) {
        super(inputStream);
        if (i8 < -1 || i8 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i8);
        }
        this.f2988f = (byte) i8;
    }

    public final void mark(int i8) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i8;
        int i9 = this.f2989g;
        int read = (i9 < 2 || i9 > (i8 = f2987i)) ? super.read() : i9 == i8 ? this.f2988f : f2986h[i9 - 2] & 255;
        if (read != -1) {
            this.f2989g++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = this.f2989g;
        int i12 = f2987i;
        if (i11 > i12) {
            i10 = super.read(bArr, i8, i9);
        } else if (i11 == i12) {
            bArr[i8] = this.f2988f;
            i10 = 1;
        } else if (i11 < 2) {
            i10 = super.read(bArr, i8, 2 - i11);
        } else {
            int min = Math.min(i12 - i11, i9);
            System.arraycopy(f2986h, this.f2989g - 2, bArr, i8, min);
            i10 = min;
        }
        if (i10 > 0) {
            this.f2989g += i10;
        }
        return i10;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j8) {
        long skip = super.skip(j8);
        if (skip > 0) {
            this.f2989g = (int) (((long) this.f2989g) + skip);
        }
        return skip;
    }
}
