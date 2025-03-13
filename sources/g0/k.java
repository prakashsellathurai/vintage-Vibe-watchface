package g0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.e;
import p.f;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final e<String, Typeface> f4462a = new e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f4463b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4464c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final f<String, ArrayList<i0.a<a>>> f4465d = new f<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f4466a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4467b;

        public a(int i8) {
            this.f4466a = null;
            this.f4467b = i8;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f4466a = typeface;
            this.f4467b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4463b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g0.k.a a(java.lang.String r12, android.content.Context r13, g0.f r14, int r15) {
        /*
            p.e<java.lang.String, android.graphics.Typeface> r0 = f4462a
            java.lang.Object r1 = r0.a(r12)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            g0.k$a r12 = new g0.k$a
            r12.<init>((android.graphics.Typeface) r1)
            return r12
        L_0x0010:
            g0.l r14 = g0.e.a(r13, r14)     // Catch:{ NameNotFoundException -> 0x00ce }
            r1 = 1
            r2 = 0
            r3 = -3
            g0.m[] r4 = r14.f4469b
            int r14 = r14.f4468a
            if (r14 == 0) goto L_0x0022
            if (r14 == r1) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            r14 = -2
            goto L_0x003e
        L_0x0022:
            if (r4 == 0) goto L_0x003d
            int r14 = r4.length
            if (r14 != 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            int r14 = r4.length
            r5 = r2
        L_0x002a:
            if (r5 >= r14) goto L_0x003b
            r6 = r4[r5]
            int r6 = r6.e
            if (r6 == 0) goto L_0x0038
            if (r6 >= 0) goto L_0x0036
        L_0x0034:
            r14 = r3
            goto L_0x003e
        L_0x0036:
            r14 = r6
            goto L_0x003e
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x003b:
            r14 = r2
            goto L_0x003e
        L_0x003d:
            r14 = r1
        L_0x003e:
            if (r14 == 0) goto L_0x0046
            g0.k$a r12 = new g0.k$a
            r12.<init>((int) r14)
            return r12
        L_0x0046:
            c0.d r14 = c0.c.f2638a
            r14.getClass()
            android.content.ContentResolver r13 = r13.getContentResolver()
            r14 = 0
            int r5 = r4.length     // Catch:{ Exception -> 0x00bd }
            r7 = r14
            r6 = r2
        L_0x0053:
            if (r6 >= r5) goto L_0x00a1
            r8 = r4[r6]     // Catch:{ Exception -> 0x00bd }
            android.net.Uri r9 = r8.f4470a     // Catch:{ IOException -> 0x009e }
            java.lang.String r10 = "r"
            android.os.ParcelFileDescriptor r9 = r13.openFileDescriptor(r9, r10, r14)     // Catch:{ IOException -> 0x009e }
            if (r9 != 0) goto L_0x0064
            if (r9 == 0) goto L_0x009e
            goto L_0x0090
        L_0x0064:
            android.graphics.fonts.Font$Builder r10 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0094 }
            r10.<init>(r9)     // Catch:{ all -> 0x0094 }
            int r11 = r8.f4472c     // Catch:{ all -> 0x0094 }
            android.graphics.fonts.Font$Builder r10 = r10.setWeight(r11)     // Catch:{ all -> 0x0094 }
            boolean r11 = r8.f4473d     // Catch:{ all -> 0x0094 }
            if (r11 == 0) goto L_0x0075
            r11 = r1
            goto L_0x0076
        L_0x0075:
            r11 = r2
        L_0x0076:
            android.graphics.fonts.Font$Builder r10 = r10.setSlant(r11)     // Catch:{ all -> 0x0094 }
            int r8 = r8.f4471b     // Catch:{ all -> 0x0094 }
            android.graphics.fonts.Font$Builder r8 = r10.setTtcIndex(r8)     // Catch:{ all -> 0x0094 }
            android.graphics.fonts.Font r8 = r8.build()     // Catch:{ all -> 0x0094 }
            if (r7 != 0) goto L_0x008d
            android.graphics.fonts.FontFamily$Builder r10 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0094 }
            r10.<init>(r8)     // Catch:{ all -> 0x0094 }
            r7 = r10
            goto L_0x0090
        L_0x008d:
            r7.addFont(r8)     // Catch:{ all -> 0x0094 }
        L_0x0090:
            r9.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x009e
        L_0x0094:
            r8 = move-exception
            r9.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch:{ IOException -> 0x009e }
        L_0x009d:
            throw r8     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x00a1:
            if (r7 != 0) goto L_0x00a4
            goto L_0x00bd
        L_0x00a4:
            android.graphics.fonts.FontFamily r13 = r7.build()     // Catch:{ Exception -> 0x00bd }
            android.graphics.Typeface$CustomFallbackBuilder r1 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x00bd }
            r1.<init>(r13)     // Catch:{ Exception -> 0x00bd }
            android.graphics.fonts.Font r13 = c0.d.a(r13, r15)     // Catch:{ Exception -> 0x00bd }
            android.graphics.fonts.FontStyle r13 = r13.getStyle()     // Catch:{ Exception -> 0x00bd }
            android.graphics.Typeface$CustomFallbackBuilder r13 = r1.setStyle(r13)     // Catch:{ Exception -> 0x00bd }
            android.graphics.Typeface r14 = r13.build()     // Catch:{ Exception -> 0x00bd }
        L_0x00bd:
            if (r14 == 0) goto L_0x00c8
            r0.b(r12, r14)
            g0.k$a r12 = new g0.k$a
            r12.<init>((android.graphics.Typeface) r14)
            return r12
        L_0x00c8:
            g0.k$a r12 = new g0.k$a
            r12.<init>((int) r3)
            return r12
        L_0x00ce:
            g0.k$a r12 = new g0.k$a
            r13 = -1
            r12.<init>((int) r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.a(java.lang.String, android.content.Context, g0.f, int):g0.k$a");
    }
}
