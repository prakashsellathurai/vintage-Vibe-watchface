package y2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import s2.b;

public final class o extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    public volatile byte[] f8381f;

    /* renamed from: g  reason: collision with root package name */
    public int f8382g;

    /* renamed from: h  reason: collision with root package name */
    public int f8383h;

    /* renamed from: i  reason: collision with root package name */
    public int f8384i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f8385j;

    /* renamed from: k  reason: collision with root package name */
    public final b f8386k;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public o(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f8386k = bVar;
        this.f8381f = (byte[]) bVar.d(65536, byte[].class);
    }

    public static void d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i8;
        int i9 = this.f8384i;
        if (i9 == -1 || this.f8385j - i9 >= (i8 = this.f8383h)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f8384i = -1;
                this.f8385j = 0;
                this.f8382g = read;
            }
            return read;
        }
        if (i9 == 0 && i8 > bArr.length && this.f8382g == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i8) {
                i8 = length;
            }
            byte[] bArr2 = (byte[]) this.f8386k.d(i8, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f8381f = bArr2;
            this.f8386k.c(bArr);
            bArr = bArr2;
        } else if (i9 > 0) {
            System.arraycopy(bArr, i9, bArr, 0, bArr.length - i9);
        }
        int i10 = this.f8385j - this.f8384i;
        this.f8385j = i10;
        this.f8384i = 0;
        this.f8382g = 0;
        int read2 = inputStream.read(bArr, i10, bArr.length - i10);
        int i11 = this.f8385j;
        if (read2 > 0) {
            i11 += read2;
        }
        this.f8382g = i11;
        return read2;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f8381f == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f8382g - this.f8385j) + inputStream.available();
    }

    public final synchronized void c() {
        if (this.f8381f != null) {
            this.f8386k.c(this.f8381f);
            this.f8381f = null;
        }
    }

    public final void close() {
        if (this.f8381f != null) {
            this.f8386k.c(this.f8381f);
            this.f8381f = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i8) {
        this.f8383h = Math.max(this.f8383h, i8);
        this.f8384i = this.f8385j;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f8381f     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f8385j     // Catch:{ all -> 0x003d }
            int r4 = r6.f8382g     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f8381f     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f8381f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            d()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f8382g     // Catch:{ all -> 0x003d }
            int r2 = r6.f8385j     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f8385j = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            d()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.o.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0052, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f8381f     // Catch:{ all -> 0x0088 }
            r1 = 0
            if (r0 == 0) goto L_0x0084
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r6 = 0
            return r6
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            int r3 = r6.f8385j     // Catch:{ all -> 0x0088 }
            int r4 = r6.f8382g     // Catch:{ all -> 0x0088 }
            if (r3 >= r4) goto L_0x0030
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r3 = r6.f8385j     // Catch:{ all -> 0x0088 }
            int r3 = r3 + r4
            r6.f8385j = r3     // Catch:{ all -> 0x0088 }
            if (r4 == r9) goto L_0x002e
            int r3 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r3 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0031
        L_0x002e:
            monitor-exit(r6)
            return r4
        L_0x0030:
            r3 = r9
        L_0x0031:
            int r4 = r6.f8384i     // Catch:{ all -> 0x0088 }
            r5 = -1
            if (r4 != r5) goto L_0x0046
            int r4 = r0.length     // Catch:{ all -> 0x0088 }
            if (r3 < r4) goto L_0x0046
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0070
            if (r3 != r9) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            int r5 = r9 - r3
        L_0x0044:
            monitor-exit(r6)
            return r5
        L_0x0046:
            int r4 = r6.a(r2, r0)     // Catch:{ all -> 0x0088 }
            if (r4 != r5) goto L_0x0053
            if (r3 != r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            int r5 = r9 - r3
        L_0x0051:
            monitor-exit(r6)
            return r5
        L_0x0053:
            byte[] r4 = r6.f8381f     // Catch:{ all -> 0x0088 }
            if (r0 == r4) goto L_0x0060
            byte[] r0 = r6.f8381f     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            d()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0060:
            int r4 = r6.f8382g     // Catch:{ all -> 0x0088 }
            int r5 = r6.f8385j     // Catch:{ all -> 0x0088 }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0068
            r4 = r3
        L_0x0068:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x0088 }
            int r5 = r6.f8385j     // Catch:{ all -> 0x0088 }
            int r5 = r5 + r4
            r6.f8385j = r5     // Catch:{ all -> 0x0088 }
        L_0x0070:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0075
            monitor-exit(r6)
            return r9
        L_0x0075:
            int r5 = r2.available()     // Catch:{ all -> 0x0088 }
            if (r5 != 0) goto L_0x007e
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x007e:
            int r8 = r8 + r4
            goto L_0x0031
        L_0x0080:
            d()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0084:
            d()     // Catch:{ all -> 0x0088 }
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.o.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.f8381f != null) {
            int i8 = this.f8384i;
            if (-1 != i8) {
                this.f8385j = i8;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f8385j + " markLimit: " + this.f8383h);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0;
        }
        byte[] bArr = this.f8381f;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i8 = this.f8382g;
                int i9 = this.f8385j;
                if (((long) (i8 - i9)) >= j8) {
                    this.f8385j = (int) (((long) i9) + j8);
                    return j8;
                }
                long j9 = ((long) i8) - ((long) i9);
                this.f8385j = i8;
                if (this.f8384i == -1 || j8 > ((long) this.f8383h)) {
                    long skip = inputStream.skip(j8 - j9);
                    if (skip > 0) {
                        this.f8384i = -1;
                    }
                    return j9 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j9;
                } else {
                    int i10 = this.f8382g;
                    int i11 = this.f8385j;
                    if (((long) (i10 - i11)) >= j8 - j9) {
                        this.f8385j = (int) ((((long) i11) + j8) - j9);
                        return j8;
                    }
                    long j10 = (j9 + ((long) i10)) - ((long) i11);
                    this.f8385j = i10;
                    return j10;
                }
            } else {
                d();
                throw null;
            }
        } else {
            d();
            throw null;
        }
    }
}
