package com.bumptech.glide.integration.webp;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import y2.o;

public final class b {

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f2952a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2953b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2954c;

        /* renamed from: d  reason: collision with root package name */
        public int f2955d;

        public a(byte[] bArr, int i8, int i9) {
            this.f2952a = bArr;
            this.f2953b = i8;
            this.f2954c = i9;
            this.f2955d = i8;
        }

        public final int a() {
            return (b() & 255) | ((b() << 8) & 65280);
        }

        public final int b() {
            int i8 = this.f2955d;
            if (i8 >= this.f2953b + this.f2954c) {
                return -1;
            }
            this.f2955d = i8 + 1;
            return this.f2952a[i8];
        }

        public final long c() {
            int min = (int) Math.min((long) ((this.f2953b + this.f2954c) - this.f2955d), 4);
            this.f2955d += min;
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.integration.webp.b$b  reason: collision with other inner class name */
    public static final class C0031b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f2956a;

        public C0031b(ByteBuffer byteBuffer) {
            this.f2956a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int a() {
            return (b() & 255) | ((b() << 8) & 65280);
        }

        public final int b() {
            ByteBuffer byteBuffer = this.f2956a;
            if (byteBuffer.remaining() < 1) {
                return -1;
            }
            return byteBuffer.get();
        }

        public final long c() {
            ByteBuffer byteBuffer = this.f2956a;
            int min = (int) Math.min((long) byteBuffer.remaining(), 4);
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public interface c {
        int a();

        int b();

        long c();
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f2957a;

        public d(InputStream inputStream) {
            this.f2957a = inputStream;
        }

        public final int a() {
            InputStream inputStream = this.f2957a;
            return (inputStream.read() & 255) | ((inputStream.read() << 8) & 65280);
        }

        public final int b() {
            return this.f2957a.read();
        }

        public final long c() {
            long j8 = 4;
            while (j8 > 0) {
                InputStream inputStream = this.f2957a;
                long skip = inputStream.skip(j8);
                if (skip > 0) {
                    j8 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j8--;
                }
            }
            return 4 - j8;
        }
    }

    public static int a(c cVar) {
        if ((((cVar.a() << 16) & -65536) | (cVar.a() & 65535)) != 1380533830) {
            return 7;
        }
        cVar.c();
        if ((((cVar.a() << 16) & -65536) | (cVar.a() & 65535)) != 1464156752) {
            return 7;
        }
        int a9 = ((cVar.a() << 16) & -65536) | (cVar.a() & 65535);
        if (a9 == 1448097824) {
            return 1;
        }
        if (a9 == 1448097868) {
            cVar.c();
            return (cVar.b() & 8) != 0 ? 3 : 2;
        } else if (a9 != 1448097880) {
            return 7;
        } else {
            cVar.c();
            int b9 = cVar.b();
            if ((b9 & 2) != 0) {
                return 6;
            }
            return (b9 & 16) != 0 ? 5 : 4;
        }
    }

    public static int b(InputStream inputStream, s2.b bVar) {
        if (inputStream == null) {
            return 7;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o(inputStream, bVar);
        }
        inputStream.mark(21);
        try {
            return a(new d(inputStream));
        } finally {
            inputStream.reset();
        }
    }
}
