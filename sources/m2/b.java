package m2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class b implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f5438f;

    /* renamed from: g  reason: collision with root package name */
    public final Charset f5439g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5440h;

    /* renamed from: i  reason: collision with root package name */
    public int f5441i;

    /* renamed from: j  reason: collision with root package name */
    public int f5442j;

    public class a extends ByteArrayOutputStream {
        public a(int i8) {
            super(i8);
        }

        public final String toString() {
            int i8 = this.count;
            if (i8 > 0 && this.buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(this.buf, 0, i8, b.this.f5439g.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f5444a)) {
            this.f5438f = fileInputStream;
            this.f5439g = charset;
            this.f5440h = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final String a() {
        int i8;
        synchronized (this.f5438f) {
            byte[] bArr = this.f5440h;
            if (bArr != null) {
                if (this.f5441i >= this.f5442j) {
                    int read = this.f5438f.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f5441i = 0;
                        this.f5442j = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i9 = this.f5441i; i9 != this.f5442j; i9++) {
                    byte[] bArr2 = this.f5440h;
                    if (bArr2[i9] == 10) {
                        int i10 = this.f5441i;
                        if (i9 != i10) {
                            i8 = i9 - 1;
                            if (bArr2[i8] == 13) {
                                String str = new String(bArr2, i10, i8 - i10, this.f5439g.name());
                                this.f5441i = i9 + 1;
                                return str;
                            }
                        }
                        i8 = i9;
                        String str2 = new String(bArr2, i10, i8 - i10, this.f5439g.name());
                        this.f5441i = i9 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f5442j - this.f5441i) + 80);
                while (true) {
                    byte[] bArr3 = this.f5440h;
                    int i11 = this.f5441i;
                    aVar.write(bArr3, i11, this.f5442j - i11);
                    this.f5442j = -1;
                    byte[] bArr4 = this.f5440h;
                    int read2 = this.f5438f.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f5441i = 0;
                        this.f5442j = read2;
                        int i12 = 0;
                        while (true) {
                            if (i12 != this.f5442j) {
                                byte[] bArr5 = this.f5440h;
                                if (bArr5[i12] == 10) {
                                    int i13 = this.f5441i;
                                    if (i12 != i13) {
                                        aVar.write(bArr5, i13, i12 - i13);
                                    }
                                    this.f5441i = i12 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i12++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f5438f) {
            if (this.f5440h != null) {
                this.f5440h = null;
                this.f5438f.close();
            }
        }
    }
}
