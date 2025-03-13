package o2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.List;
import k3.j;
import k3.k;
import p2.f;
import p2.g;
import s2.b;
import s2.c;
import y2.h;

public final class i {
    public static final f<Boolean> e = f.a(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder");

    /* renamed from: f  reason: collision with root package name */
    public static final a f6035f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque f6036g = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f6037a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f6038b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6039c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f6040d;

    public static class a implements h.b {
        public final void a(Bitmap bitmap, c cVar) {
        }

        public final void b() {
        }
    }

    static {
        char[] cArr = k.f5169a;
    }

    public i(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, b bVar) {
        this.f6040d = list;
        j.l(displayMetrics);
        this.f6038b = displayMetrics;
        j.l(cVar);
        this.f6037a = cVar;
        j.l(bVar);
        this.f6039c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, o2.i.a r7, s2.c r8) {
        /*
            boolean r0 = r6.inJustDecodeBounds
            if (r0 == 0) goto L_0x000a
            r0 = 10485760(0xa00000, float:1.469368E-38)
            r5.mark(r0)
            goto L_0x000d
        L_0x000a:
            r7.getClass()
        L_0x000d:
            int r0 = r6.outWidth
            int r1 = r6.outHeight
            java.lang.String r2 = r6.outMimeType
            java.util.concurrent.locks.Lock r3 = y2.q.f8392b
            r3.lock()
            r4 = 0
            android.graphics.Bitmap r7 = com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeStream(r5, r4, r6)     // Catch:{ IllegalArgumentException -> 0x0028 }
            r3.unlock()
            boolean r6 = r6.inJustDecodeBounds
            if (r6 == 0) goto L_0x0027
            r5.reset()
        L_0x0027:
            return r7
        L_0x0028:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r6)     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "WebpDownsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x004b }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004e
            r5.reset()     // Catch:{ IOException -> 0x004d }
            android.graphics.Bitmap r1 = r6.inBitmap     // Catch:{ IOException -> 0x004d }
            r8.e(r1)     // Catch:{ IOException -> 0x004d }
            r6.inBitmap = r4     // Catch:{ IOException -> 0x004d }
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004d }
            java.util.concurrent.locks.Lock r6 = y2.q.f8392b
            r6.unlock()
            return r5
        L_0x004b:
            r5 = move-exception
            goto L_0x004f
        L_0x004d:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004f:
            java.util.concurrent.locks.Lock r6 = y2.q.f8392b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.c(java.io.InputStream, android.graphics.BitmapFactory$Options, o2.i$a, s2.c):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i8, int i9, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i8 + ", outHeight: " + i9 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final y2.c a(InputStream inputStream, int i8, int i9, g gVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        g gVar2 = gVar;
        a aVar = f6035f;
        j.j("You must provide an InputStream that supports mark()", inputStream.markSupported());
        byte[] bArr = (byte[]) this.f6039c.d(65536, byte[].class);
        synchronized (i.class) {
            arrayDeque = f6036g;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        p2.b bVar = (p2.b) gVar2.c(h.f8354f);
        y2.g gVar3 = (y2.g) gVar2.c(h.f8356h);
        boolean booleanValue = ((Boolean) gVar2.c(h.f8357i)).booleanValue();
        f fVar = h.f8358j;
        if (gVar2.c(fVar) != null) {
            boolean booleanValue2 = ((Boolean) gVar2.c(fVar)).booleanValue();
        }
        try {
            y2.c e4 = y2.c.e(b(inputStream, options2, gVar3, bVar, i8, i9, booleanValue, aVar), this.f6037a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f6039c.put(bArr);
            return e4;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f6036g;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f6039c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(java.io.InputStream r23, android.graphics.BitmapFactory.Options r24, y2.g r25, p2.b r26, int r27, int r28, boolean r29, o2.i.a r30) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r30
            int r5 = k3.f.f5137a
            android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 1
            r2.inJustDecodeBounds = r5
            s2.c r6 = r0.f6037a
            c(r1, r2, r4, r6)
            r7 = 0
            r2.inJustDecodeBounds = r7
            int r8 = r2.outWidth
            int r9 = r2.outHeight
            s2.b r10 = r0.f6039c
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r11 = r0.f6040d
            int r12 = com.bumptech.glide.load.a.a(r10, r1, r11)
            int r13 = y2.q.a(r12)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r27
            r7 = r28
            if (r15 != r14) goto L_0x0033
            r15 = r8
        L_0x0033:
            if (r7 != r14) goto L_0x0036
            r7 = r9
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r14 = com.bumptech.glide.load.a.b(r10, r1, r11)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "WebpDownsampler"
            if (r8 <= 0) goto L_0x0196
            if (r9 > 0) goto L_0x0044
            goto L_0x0196
        L_0x0044:
            r17 = r12
            r12 = 90
            if (r13 == r12) goto L_0x0054
            r12 = 270(0x10e, float:3.78E-43)
            if (r13 != r12) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            float r12 = r3.b(r8, r9, r15, r7)
            goto L_0x0058
        L_0x0054:
            float r12 = r3.b(r9, r8, r15, r7)
        L_0x0058:
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x0157
            int r13 = r3.a(r8, r9, r15, r7)
            if (r13 == 0) goto L_0x014f
            float r0 = (float) r8
            r18 = r10
            float r10 = r12 * r0
            r19 = r11
            double r10 = (double) r10
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 + r20
            int r10 = (int) r10
            float r11 = (float) r9
            r28 = r5
            float r5 = r12 * r11
            double r3 = (double) r5
            double r3 = r3 + r20
            int r3 = (int) r3
            int r4 = r8 / r10
            int r3 = r9 / r3
            r5 = 1
            if (r13 != r5) goto L_0x0085
            int r3 = java.lang.Math.max(r4, r3)
            goto L_0x0089
        L_0x0085:
            int r3 = java.lang.Math.min(r4, r3)
        L_0x0089:
            int r3 = java.lang.Integer.highestOneBit(r3)
            int r3 = java.lang.Math.max(r5, r3)
            if (r13 != r5) goto L_0x009c
            float r4 = (float) r3
            float r5 = r16 / r12
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x009c
            int r3 = r3 << 1
        L_0x009c:
            r2.inSampleSize = r3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r14 != r4) goto L_0x00bd
            r4 = 8
            int r5 = java.lang.Math.min(r3, r4)
            float r5 = (float) r5
            float r0 = r0 / r5
            double r12 = (double) r0
            double r12 = java.lang.Math.ceil(r12)
            int r0 = (int) r12
            float r11 = r11 / r5
            double r10 = (double) r11
            double r10 = java.lang.Math.ceil(r10)
            int r5 = (int) r10
            int r3 = r3 / r4
            if (r3 <= 0) goto L_0x00dc
            int r0 = r0 / r3
            int r5 = r5 / r3
            goto L_0x00dc
        L_0x00bd:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r14 == r4) goto L_0x00ff
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r14 != r4) goto L_0x00c6
            goto L_0x00ff
        L_0x00c6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r14 == r4) goto L_0x00f1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r14 != r4) goto L_0x00cf
            goto L_0x00f1
        L_0x00cf:
            int r0 = r8 % r3
            if (r0 != 0) goto L_0x00e1
            int r0 = r9 % r3
            if (r0 == 0) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            int r0 = r8 / r3
            int r5 = r9 / r3
        L_0x00dc:
            r3 = r25
            r4 = r30
            goto L_0x0112
        L_0x00e1:
            r0 = 1
            r2.inJustDecodeBounds = r0
            r4 = r30
            c(r1, r2, r4, r6)
            r0 = 0
            r2.inJustDecodeBounds = r0
            int r0 = r2.outWidth
            int r5 = r2.outHeight
            goto L_0x0110
        L_0x00f1:
            r4 = r30
            float r3 = (float) r3
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            float r11 = r11 / r3
            int r5 = java.lang.Math.round(r11)
            goto L_0x0110
        L_0x00ff:
            r4 = r30
            float r3 = (float) r3
            float r0 = r0 / r3
            double r12 = (double) r0
            double r12 = java.lang.Math.floor(r12)
            int r0 = (int) r12
            float r11 = r11 / r3
            double r10 = (double) r11
            double r10 = java.lang.Math.floor(r10)
            int r5 = (int) r10
        L_0x0110:
            r3 = r25
        L_0x0112:
            float r0 = r3.b(r0, r5, r15, r7)
            double r10 = (double) r0
            r12 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r12 = r12 * r10
            double r12 = r12 + r20
            int r0 = (int) r12
            float r3 = (float) r0
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r5
            double r12 = (double) r3
            double r10 = r10 / r12
            double r12 = (double) r0
            double r10 = r10 * r12
            double r10 = r10 + r20
            int r0 = (int) r10
            r2.inTargetDensity = r0
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            r2.inDensity = r3
            if (r0 <= 0) goto L_0x0139
            if (r0 == r3) goto L_0x0139
            r0 = 1
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            if (r0 == 0) goto L_0x0143
            r0 = 1
            r2.inScaled = r0
            r5 = r28
            r0 = 0
            goto L_0x014a
        L_0x0143:
            r0 = 0
            r2.inTargetDensity = r0
            r2.inDensity = r0
            r5 = r28
        L_0x014a:
            r3 = 2
            android.util.Log.isLoggable(r5, r3)
            goto L_0x019d
        L_0x014f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot scale with factor: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = "x"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r3 = "], target: ["
            r1.append(r3)
            r1.append(r15)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0196:
            r18 = r10
            r19 = r11
            r17 = r12
            r0 = 0
        L_0x019d:
            p2.b r3 = p2.b.f6300f
            r10 = r26
            if (r10 == r3) goto L_0x01d7
            r3 = r18
            r11 = r19
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.a.b(r3, r1, r11)     // Catch:{ IOException -> 0x01b0 }
            boolean r3 = r3.hasAlpha()     // Catch:{ IOException -> 0x01b0 }
            goto L_0x01bb
        L_0x01b0:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r5, r3)
            if (r3 == 0) goto L_0x01ba
            java.util.Objects.toString(r26)
        L_0x01ba:
            r3 = r0
        L_0x01bb:
            if (r3 == 0) goto L_0x01c0
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x01c2
        L_0x01c0:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
        L_0x01c2:
            r2.inPreferredConfig = r3
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGB_565
            if (r3 == r10) goto L_0x01d3
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_4444
            if (r3 == r10) goto L_0x01d3
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ALPHA_8
            if (r3 != r10) goto L_0x01d1
            goto L_0x01d3
        L_0x01d1:
            r3 = 1
            goto L_0x01dc
        L_0x01d3:
            r3 = 1
            r2.inDither = r3
            goto L_0x01dc
        L_0x01d7:
            r3 = 1
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            r2.inPreferredConfig = r10
        L_0x01dc:
            int r10 = r2.inSampleSize
            if (r29 == 0) goto L_0x01e1
            goto L_0x0217
        L_0x01e1:
            int r7 = r2.inTargetDensity
            if (r7 <= 0) goto L_0x01ec
            int r11 = r2.inDensity
            if (r11 <= 0) goto L_0x01ec
            if (r7 == r11) goto L_0x01ec
            r0 = r3
        L_0x01ec:
            if (r0 == 0) goto L_0x01f4
            float r0 = (float) r7
            int r3 = r2.inDensity
            float r3 = (float) r3
            float r16 = r0 / r3
        L_0x01f4:
            float r0 = (float) r8
            float r3 = (float) r10
            float r0 = r0 / r3
            double r7 = (double) r0
            double r7 = java.lang.Math.ceil(r7)
            int r0 = (int) r7
            float r7 = (float) r9
            float r7 = r7 / r3
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            int r3 = (int) r7
            float r0 = (float) r0
            float r0 = r0 * r16
            int r15 = java.lang.Math.round(r0)
            float r0 = (float) r3
            float r0 = r0 * r16
            int r7 = java.lang.Math.round(r0)
            r0 = 2
            android.util.Log.isLoggable(r5, r0)
        L_0x0217:
            if (r15 <= 0) goto L_0x0228
            if (r7 <= 0) goto L_0x0228
            android.graphics.Bitmap$Config r0 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r3) goto L_0x0222
            goto L_0x0228
        L_0x0222:
            android.graphics.Bitmap r0 = r6.c(r15, r7, r0)
            r2.inBitmap = r0
        L_0x0228:
            android.graphics.Bitmap r0 = c(r1, r2, r4, r6)
            r30.getClass()
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r5, r1)
            if (r1 == 0) goto L_0x0248
            d(r0)
            android.graphics.Bitmap r1 = r2.inBitmap
            d(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.getName()
            android.os.SystemClock.elapsedRealtimeNanos()
        L_0x0248:
            if (r0 == 0) goto L_0x0263
            r1 = r22
            android.util.DisplayMetrics r1 = r1.f6038b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            r1 = r17
            android.graphics.Bitmap r1 = y2.q.c(r6, r0, r1)
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x0264
            r6.e(r0)
            goto L_0x0264
        L_0x0263:
            r1 = 0
        L_0x0264:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.b(java.io.InputStream, android.graphics.BitmapFactory$Options, y2.g, p2.b, int, int, boolean, o2.i$a):android.graphics.Bitmap");
    }
}
