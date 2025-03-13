package y2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import k3.j;

public final class f implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f8345a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8346b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8347a;

        public a(ByteBuffer byteBuffer) {
            this.f8347a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int a() {
            return b() | (b() << 8);
        }

        public final short b() {
            ByteBuffer byteBuffer = this.f8347a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new c.a();
        }

        public final long skip(long j8) {
            ByteBuffer byteBuffer = this.f8347a;
            int min = (int) Math.min((long) byteBuffer.remaining(), j8);
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f8348a;

        public b(byte[] bArr, int i8) {
            this.f8348a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i8);
        }

        public final short a(int i8) {
            ByteBuffer byteBuffer = this.f8348a;
            if (byteBuffer.remaining() - i8 >= 2) {
                return byteBuffer.getShort(i8);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        long skip(long j8);
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f8349a;

        public d(InputStream inputStream) {
            this.f8349a = inputStream;
        }

        public final int a() {
            return b() | (b() << 8);
        }

        public final short b() {
            int read = this.f8349a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public final int c(byte[] bArr, int i8) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8 && (i10 = this.f8349a.read(bArr, i9, i8 - i9)) != -1) {
                i9 += i10;
            }
            if (i9 != 0 || i10 != -1) {
                return i9;
            }
            throw new c.a();
        }

        public final long skip(long j8) {
            if (j8 < 0) {
                return 0;
            }
            long j9 = j8;
            while (j9 > 0) {
                InputStream inputStream = this.f8349a;
                long skip = inputStream.skip(j9);
                if (skip > 0) {
                    j9 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j9--;
                }
            }
            return j8 - j9;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType d(y2.f.c r5) {
        /*
            int r0 = r5.a()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r5.b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r5.b()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.b()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r5 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r5
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x0044:
            r0 = 4
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r5.a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x005c:
            int r2 = r5.a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r5.a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.b()     // Catch:{ a -> 0x00a0 }
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r5
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r5.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r5 = r5.b()     // Catch:{ a -> 0x00a0 }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r5
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r5
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f.d(y2.f$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int e(d dVar, byte[] bArr, int i8) {
        ByteOrder byteOrder;
        int i9;
        if (dVar.c(bArr, i8) != i8) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = f8345a;
        boolean z8 = bArr != null && i8 > bArr2.length;
        if (z8) {
            int i10 = 0;
            while (true) {
                if (i10 >= bArr2.length) {
                    break;
                } else if (bArr[i10] != bArr2[i10]) {
                    z8 = false;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (z8) {
            b bVar = new b(bArr, i8);
            short a9 = bVar.a(6);
            if (a9 != 18761) {
                if (a9 != 19789) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f8348a;
            byteBuffer.order(byteOrder);
            int i11 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
            short a10 = bVar.a(i11);
            for (int i12 = 0; i12 < a10; i12++) {
                int i13 = i11 + 2 + (i12 * 12);
                if (bVar.a(i13) == 274) {
                    short a11 = bVar.a(i13 + 2);
                    if (a11 >= 1 && a11 <= 12) {
                        int i14 = i13 + 4;
                        int i15 = byteBuffer.remaining() - i14 >= 4 ? byteBuffer.getInt(i14) : -1;
                        if (i15 >= 0) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            int i16 = i15 + f8346b[a11];
                            if (i16 <= 4 && (i9 = i13 + 8) >= 0 && i9 <= byteBuffer.remaining() && i16 >= 0 && i16 + i9 <= byteBuffer.remaining()) {
                                return bVar.a(i9);
                            }
                        }
                    }
                    Log.isLoggable("DfltImageHeaderParser", 3);
                }
            }
            return -1;
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        j.l(byteBuffer);
        return d(new a(byteBuffer));
    }

    public final int b(InputStream inputStream, s2.b bVar) {
        int i8;
        byte[] bArr;
        j.l(inputStream);
        d dVar = new d(inputStream);
        j.l(bVar);
        try {
            int a9 = dVar.a();
            if ((a9 & 65496) == 65496 || a9 == 19789 || a9 == 18761) {
                while (true) {
                    if (dVar.b() == 255) {
                        short b9 = dVar.b();
                        if (b9 != 218) {
                            if (b9 != 217) {
                                i8 = dVar.a() - 2;
                                if (b9 == 225) {
                                    break;
                                }
                                long j8 = (long) i8;
                                if (dVar.skip(j8) != j8) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Log.isLoggable("DfltImageHeaderParser", 3);
                i8 = -1;
                if (i8 != -1) {
                    bArr = (byte[]) bVar.d(i8, byte[].class);
                    int e = e(dVar, bArr, i8);
                    bVar.c(bArr);
                    return e;
                }
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.c(bArr);
            throw th;
        }
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        j.l(inputStream);
        return d(new d(inputStream));
    }
}
