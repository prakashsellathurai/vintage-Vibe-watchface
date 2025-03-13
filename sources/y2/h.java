package y2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import k3.j;
import k3.k;
import p2.f;
import p2.g;
import s2.c;

public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final f<p2.b> f8354f = f.a(p2.b.f6300f, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final f<p2.h> f8355g = f.a(p2.h.f6313f, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final f<g> f8356h = g.f8353d;

    /* renamed from: i  reason: collision with root package name */
    public static final f<Boolean> f8357i;

    /* renamed from: j  reason: collision with root package name */
    public static final f<Boolean> f8358j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f8359k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f8360l = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final c f8361a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f8362b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.b f8363c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f8364d;
    public final l e;

    public class a implements b {
        public final void a(Bitmap bitmap, c cVar) {
        }

        public final void b() {
        }
    }

    public interface b {
        void a(Bitmap bitmap, c cVar);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f8357i = f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f8358j = f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = k.f5169a;
    }

    public h(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, c cVar, s2.b bVar) {
        if (l.f8368f == null) {
            synchronized (l.class) {
                if (l.f8368f == null) {
                    l.f8368f = new l();
                }
            }
        }
        this.e = l.f8368f;
        this.f8364d = list;
        j.l(displayMetrics);
        this.f8362b = displayMetrics;
        j.l(cVar);
        this.f8361a = cVar;
        j.l(bVar);
        this.f8363c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(y2.m r4, android.graphics.BitmapFactory.Options r5, y2.h.b r6, s2.c r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.b()
            r4.b()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = y2.q.f8392b
            r3.lock()
            android.graphics.Bitmap r4 = r4.a(r5)     // Catch:{ IllegalArgumentException -> 0x001f }
            r3.unlock()
            return r4
        L_0x001d:
            r4 = move-exception
            goto L_0x0040
        L_0x001f:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x003f
            r7.e(r1)     // Catch:{ IOException -> 0x003e }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x003e }
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch:{ IOException -> 0x003e }
            java.util.concurrent.locks.Lock r5 = y2.q.f8392b
            r5.unlock()
            return r4
        L_0x003e:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x001d }
        L_0x0040:
            java.util.concurrent.locks.Lock r5 = y2.q.f8392b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.h.c(y2.m, android.graphics.BitmapFactory$Options, y2.h$b, s2.c):android.graphics.Bitmap");
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
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(m mVar, int i8, int i9, g gVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        g gVar2 = gVar;
        byte[] bArr = (byte[]) this.f8363c.d(65536, byte[].class);
        synchronized (h.class) {
            arrayDeque = f8360l;
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
        p2.b bVar2 = (p2.b) gVar2.c(f8354f);
        p2.h hVar = (p2.h) gVar2.c(f8355g);
        g gVar3 = (g) gVar2.c(g.f8353d);
        boolean booleanValue = ((Boolean) gVar2.c(f8357i)).booleanValue();
        f fVar = f8358j;
        try {
            c e4 = c.e(b(mVar, options2, gVar3, bVar2, hVar, gVar2.c(fVar) != null && ((Boolean) gVar2.c(fVar)).booleanValue(), i8, i9, booleanValue, bVar), this.f8361a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f8363c.c(bArr);
            return e4;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f8360l;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f8363c.c(bArr);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x025e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x030c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(y2.m r27, android.graphics.BitmapFactory.Options r28, y2.g r29, p2.b r30, p2.h r31, boolean r32, int r33, int r34, boolean r35, y2.h.b r36) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r36
            int r5 = k3.f.f5137a
            android.os.SystemClock.elapsedRealtimeNanos()
            r5 = 1
            r2.inJustDecodeBounds = r5
            s2.c r6 = r0.f8361a
            c(r1, r2, r4, r6)
            r7 = 0
            r2.inJustDecodeBounds = r7
            int r8 = r2.outWidth
            int r9 = r2.outHeight
            r10 = -1
            if (r8 == r10) goto L_0x0027
            if (r9 != r10) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r10 = r32
            goto L_0x0028
        L_0x0027:
            r10 = r7
        L_0x0028:
            int r11 = r27.c()
            int r12 = y2.q.a(r11)
            boolean r13 = y2.q.b(r11)
            r14 = 270(0x10e, float:3.78E-43)
            r15 = 90
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r33
            if (r5 != r7) goto L_0x004e
            if (r12 == r15) goto L_0x0045
            if (r12 != r14) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0046
        L_0x0045:
            r5 = 1
        L_0x0046:
            r14 = r34
            if (r5 == 0) goto L_0x004c
            r5 = r9
            goto L_0x0050
        L_0x004c:
            r5 = r8
            goto L_0x0050
        L_0x004e:
            r14 = r34
        L_0x0050:
            if (r14 != r7) goto L_0x0061
            if (r12 == r15) goto L_0x005b
            r7 = 270(0x10e, float:3.78E-43)
            if (r12 != r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = 1
        L_0x005c:
            if (r7 == 0) goto L_0x0060
            r14 = r8
            goto L_0x0061
        L_0x0060:
            r14 = r9
        L_0x0061:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r27.d()
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r15 = "Downsampler"
            if (r8 <= 0) goto L_0x01fb
            if (r9 > 0) goto L_0x007a
            r16 = r10
            r18 = r11
            r32 = r13
            r3 = r15
            r0 = 3
            r10 = r9
            r9 = r8
            r8 = r14
            goto L_0x0206
        L_0x007a:
            r18 = r11
            r11 = 90
            if (r12 == r11) goto L_0x0087
            r11 = 270(0x10e, float:3.78E-43)
            if (r12 != r11) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r11 = 0
            goto L_0x0088
        L_0x0087:
            r11 = 1
        L_0x0088:
            if (r11 == 0) goto L_0x008d
            r12 = r8
            r11 = r9
            goto L_0x008f
        L_0x008d:
            r11 = r8
            r12 = r9
        L_0x008f:
            r16 = r10
            float r10 = r3.b(r11, r12, r5, r14)
            r19 = 0
            int r19 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r19 <= 0) goto L_0x01b3
            r32 = r13
            int r13 = r3.a(r11, r12, r5, r14)
            if (r13 == 0) goto L_0x01ab
            float r0 = (float) r11
            r19 = r9
            float r9 = r10 * r0
            r20 = r8
            double r8 = (double) r9
            r21 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r21
            int r8 = (int) r8
            float r9 = (float) r12
            r23 = r15
            float r15 = r10 * r9
            r24 = r14
            double r14 = (double) r15
            double r14 = r14 + r21
            int r14 = (int) r14
            int r8 = r11 / r8
            int r14 = r12 / r14
            r15 = 1
            if (r13 != r15) goto L_0x00c7
            int r8 = java.lang.Math.max(r8, r14)
            goto L_0x00cb
        L_0x00c7:
            int r8 = java.lang.Math.min(r8, r14)
        L_0x00cb:
            int r8 = java.lang.Integer.highestOneBit(r8)
            int r8 = java.lang.Math.max(r15, r8)
            if (r13 != r15) goto L_0x00de
            float r13 = (float) r8
            float r10 = r17 / r10
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x00de
            int r8 = r8 << 1
        L_0x00de:
            r2.inSampleSize = r8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r7 != r10) goto L_0x00ff
            r7 = 8
            int r7 = java.lang.Math.min(r8, r7)
            float r7 = (float) r7
            float r0 = r0 / r7
            double r10 = (double) r0
            double r10 = java.lang.Math.ceil(r10)
            int r0 = (int) r10
            float r9 = r9 / r7
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r12 = (int) r9
            int r8 = r8 / 8
            if (r8 <= 0) goto L_0x0148
            int r0 = r0 / r8
            goto L_0x011c
        L_0x00ff:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r7 == r10) goto L_0x0138
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r7 != r10) goto L_0x0108
            goto L_0x0138
        L_0x0108:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r7 == r10) goto L_0x012c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r10 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r7 != r10) goto L_0x0111
            goto L_0x012c
        L_0x0111:
            int r0 = r11 % r8
            if (r0 != 0) goto L_0x011e
            int r0 = r12 % r8
            if (r0 == 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            int r11 = r11 / r8
            r0 = r11
        L_0x011c:
            int r12 = r12 / r8
            goto L_0x0148
        L_0x011e:
            r0 = 1
            r2.inJustDecodeBounds = r0
            c(r1, r2, r4, r6)
            r0 = 0
            r2.inJustDecodeBounds = r0
            int r0 = r2.outWidth
            int r7 = r2.outHeight
            goto L_0x0149
        L_0x012c:
            float r7 = (float) r8
            float r0 = r0 / r7
            int r0 = java.lang.Math.round(r0)
            float r9 = r9 / r7
            int r7 = java.lang.Math.round(r9)
            goto L_0x0147
        L_0x0138:
            float r7 = (float) r8
            float r0 = r0 / r7
            double r10 = (double) r0
            double r10 = java.lang.Math.floor(r10)
            int r0 = (int) r10
            float r9 = r9 / r7
            double r7 = (double) r9
            double r7 = java.lang.Math.floor(r7)
            int r7 = (int) r7
        L_0x0147:
            r12 = r7
        L_0x0148:
            r7 = r12
        L_0x0149:
            r8 = r24
            float r0 = r3.b(r0, r7, r5, r8)
            double r9 = (double) r0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0158
            r13 = r9
            goto L_0x015a
        L_0x0158:
            double r13 = r11 / r9
        L_0x015a:
            r24 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r13 = r13 * r24
            long r13 = java.lang.Math.round(r13)
            int r3 = (int) r13
            double r13 = (double) r3
            double r13 = r13 * r9
            double r13 = r13 + r21
            int r7 = (int) r13
            float r13 = (float) r7
            float r3 = (float) r3
            float r13 = r13 / r3
            double r13 = (double) r13
            double r13 = r9 / r13
            double r11 = (double) r7
            double r13 = r13 * r11
            double r13 = r13 + r21
            int r3 = (int) r13
            r2.inTargetDensity = r3
            if (r0 > 0) goto L_0x017b
            goto L_0x017f
        L_0x017b:
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r11 / r9
        L_0x017f:
            double r9 = r9 * r24
            long r9 = java.lang.Math.round(r9)
            int r0 = (int) r9
            r2.inDensity = r0
            int r3 = r2.inTargetDensity
            if (r3 <= 0) goto L_0x0192
            if (r0 <= 0) goto L_0x0192
            if (r3 == r0) goto L_0x0192
            r0 = 1
            goto L_0x0193
        L_0x0192:
            r0 = 0
        L_0x0193:
            if (r0 == 0) goto L_0x0199
            r0 = 1
            r2.inScaled = r0
            goto L_0x019e
        L_0x0199:
            r0 = 0
            r2.inTargetDensity = r0
            r2.inDensity = r0
        L_0x019e:
            r3 = r23
            r0 = 2
            android.util.Log.isLoggable(r3, r0)
            r0 = r26
            r10 = r19
            r9 = r20
            goto L_0x0211
        L_0x01ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x01b3:
            r20 = r8
            r19 = r9
            r8 = r14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot scale with factor: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = " from: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", source: ["
            r1.append(r2)
            r9 = r20
            r1.append(r9)
            java.lang.String r2 = "x"
            r1.append(r2)
            r10 = r19
            r1.append(r10)
            java.lang.String r3 = "], target: ["
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01fb:
            r16 = r10
            r18 = r11
            r32 = r13
            r3 = r15
            r10 = r9
            r9 = r8
            r8 = r14
            r0 = 3
        L_0x0206:
            boolean r11 = android.util.Log.isLoggable(r3, r0)
            if (r11 == 0) goto L_0x020f
            java.util.Objects.toString(r7)
        L_0x020f:
            r0 = r26
        L_0x0211:
            y2.l r7 = r0.e
            r11 = r32
            r12 = r16
            boolean r7 = r7.a(r5, r8, r12, r11)
            if (r7 == 0) goto L_0x0225
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            r2.inPreferredConfig = r11
            r15 = 0
            r2.inMutable = r15
            goto L_0x0226
        L_0x0225:
            r15 = 0
        L_0x0226:
            if (r7 == 0) goto L_0x022a
        L_0x0228:
            r7 = 1
            goto L_0x025a
        L_0x022a:
            p2.b r7 = p2.b.f6300f
            r11 = r30
            if (r11 == r7) goto L_0x0255
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r27.d()     // Catch:{ IOException -> 0x0239 }
            boolean r7 = r7.hasAlpha()     // Catch:{ IOException -> 0x0239 }
            goto L_0x0244
        L_0x0239:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r3, r7)
            if (r7 == 0) goto L_0x0243
            java.util.Objects.toString(r30)
        L_0x0243:
            r7 = r15
        L_0x0244:
            if (r7 == 0) goto L_0x0249
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x024b
        L_0x0249:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L_0x024b:
            r2.inPreferredConfig = r7
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r11) goto L_0x0228
            r7 = 1
            r2.inDither = r7
            goto L_0x025a
        L_0x0255:
            r7 = 1
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            r2.inPreferredConfig = r11
        L_0x025a:
            int r11 = r2.inSampleSize
            if (r9 < 0) goto L_0x0264
            if (r10 < 0) goto L_0x0264
            if (r35 == 0) goto L_0x0264
            r14 = r8
            goto L_0x029c
        L_0x0264:
            int r5 = r2.inTargetDensity
            if (r5 <= 0) goto L_0x0270
            int r8 = r2.inDensity
            if (r8 <= 0) goto L_0x0270
            if (r5 == r8) goto L_0x0270
            r8 = r7
            goto L_0x0271
        L_0x0270:
            r8 = r15
        L_0x0271:
            if (r8 == 0) goto L_0x0279
            float r5 = (float) r5
            int r8 = r2.inDensity
            float r8 = (float) r8
            float r17 = r5 / r8
        L_0x0279:
            float r5 = (float) r9
            float r8 = (float) r11
            float r5 = r5 / r8
            double r11 = (double) r5
            double r11 = java.lang.Math.ceil(r11)
            int r5 = (int) r11
            float r9 = (float) r10
            float r9 = r9 / r8
            double r8 = (double) r9
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r5 = (float) r5
            float r5 = r5 * r17
            int r5 = java.lang.Math.round(r5)
            float r8 = (float) r8
            float r8 = r8 * r17
            int r14 = java.lang.Math.round(r8)
            r8 = 2
            android.util.Log.isLoggable(r3, r8)
        L_0x029c:
            if (r5 <= 0) goto L_0x02b3
            if (r14 <= 0) goto L_0x02b3
            android.graphics.Bitmap$Config r8 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r9) goto L_0x02a7
            goto L_0x02b3
        L_0x02a7:
            android.graphics.Bitmap$Config r9 = r2.outConfig
            if (r9 != 0) goto L_0x02ac
            goto L_0x02ad
        L_0x02ac:
            r8 = r9
        L_0x02ad:
            android.graphics.Bitmap r5 = r6.c(r5, r14, r8)
            r2.inBitmap = r5
        L_0x02b3:
            p2.h r5 = p2.h.f6314g
            r8 = r31
            if (r8 != r5) goto L_0x02c5
            android.graphics.ColorSpace r5 = r2.outColorSpace
            if (r5 == 0) goto L_0x02c5
            boolean r5 = r5.isWideGamut()
            if (r5 == 0) goto L_0x02c5
            r5 = r7
            goto L_0x02c6
        L_0x02c5:
            r5 = r15
        L_0x02c6:
            if (r5 == 0) goto L_0x02cb
            android.graphics.ColorSpace$Named r5 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x02cd
        L_0x02cb:
            android.graphics.ColorSpace$Named r5 = android.graphics.ColorSpace.Named.SRGB
        L_0x02cd:
            android.graphics.ColorSpace r5 = android.graphics.ColorSpace.get(r5)
            r2.inPreferredColorSpace = r5
            android.graphics.Bitmap r1 = c(r1, r2, r4, r6)
            r4.a(r1, r6)
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x02f3
            d(r1)
            android.graphics.Bitmap r2 = r2.inBitmap
            d(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.getName()
            android.os.SystemClock.elapsedRealtimeNanos()
        L_0x02f3:
            if (r1 == 0) goto L_0x030c
            android.util.DisplayMetrics r0 = r0.f8362b
            int r0 = r0.densityDpi
            r1.setDensity(r0)
            r0 = r18
            android.graphics.Bitmap r0 = y2.q.c(r6, r1, r0)
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x030d
            r6.e(r1)
            goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.h.b(y2.m, android.graphics.BitmapFactory$Options, y2.g, p2.b, p2.h, boolean, int, int, boolean, y2.h$b):android.graphics.Bitmap");
    }
}
