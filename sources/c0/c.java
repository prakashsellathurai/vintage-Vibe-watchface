package c0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import b0.b;
import p.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2638a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final e<String, Typeface> f2639b = new e<>(16);

    public static class a extends a1.a {
        public final b.C0027b s0;

        public a(b.C0027b bVar) {
            this.s0 = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r4.equals(r9) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r14, b0.a.b r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, b0.b.C0027b r21, boolean r22) {
        /*
            r0 = r14
            r1 = r15
            r2 = r20
            r3 = r21
            boolean r4 = r1 instanceof b0.a.e
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = -3
            if (r4 == 0) goto L_0x0156
            b0.a$e r1 = (b0.a.e) r1
            java.lang.String r4 = r1.f2503d
            if (r4 == 0) goto L_0x002e
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L_0x001b
            goto L_0x002e
        L_0x001b:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r5)
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r9, r5)
            if (r4 == 0) goto L_0x002e
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r4 = r6
        L_0x002f:
            if (r4 == 0) goto L_0x0037
            if (r3 == 0) goto L_0x0036
            r3.b(r4)
        L_0x0036:
            return r4
        L_0x0037:
            if (r22 == 0) goto L_0x003e
            int r4 = r1.f2502c
            if (r4 != 0) goto L_0x0041
            goto L_0x0040
        L_0x003e:
            if (r3 != 0) goto L_0x0041
        L_0x0040:
            r5 = r7
        L_0x0041:
            r4 = -1
            if (r22 == 0) goto L_0x0047
            int r7 = r1.f2501b
            goto L_0x0048
        L_0x0047:
            r7 = r4
        L_0x0048:
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r9.<init>(r10)
            c0.c$a r10 = new c0.c$a
            r10.<init>(r3)
            g0.f r1 = r1.f2500a
            g0.c r3 = new g0.c
            r3.<init>(r10, r9)
            if (r5 == 0) goto L_0x00d5
            p.e<java.lang.String, android.graphics.Typeface> r5 = g0.k.f4462a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = r1.e
            r5.append(r11)
            java.lang.String r11 = "-"
            r5.append(r11)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            p.e<java.lang.String, android.graphics.Typeface> r11 = g0.k.f4462a
            java.lang.Object r11 = r11.a(r5)
            android.graphics.Typeface r11 = (android.graphics.Typeface) r11
            if (r11 == 0) goto L_0x008e
            g0.a r0 = new g0.a
            r0.<init>(r10, r11)
            r9.post(r0)
            r13 = r16
            r6 = r11
            goto L_0x01ce
        L_0x008e:
            if (r7 != r4) goto L_0x009d
            g0.k$a r0 = g0.k.a(r5, r14, r1, r2)
            r3.a(r0)
            android.graphics.Typeface r6 = r0.f4466a
        L_0x0099:
            r13 = r16
            goto L_0x01ce
        L_0x009d:
            g0.g r4 = new g0.g
            r4.<init>(r5, r14, r1, r2)
            java.util.concurrent.ThreadPoolExecutor r0 = g0.k.f4463b     // Catch:{ InterruptedException -> 0x00c8 }
            java.util.concurrent.Future r0 = r0.submit(r4)     // Catch:{ InterruptedException -> 0x00c8 }
            long r4 = (long) r7
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00c1, InterruptedException -> 0x00bf, TimeoutException -> 0x00b7 }
            java.lang.Object r0 = r0.get(r4, r1)     // Catch:{ ExecutionException -> 0x00c1, InterruptedException -> 0x00bf, TimeoutException -> 0x00b7 }
            g0.k$a r0 = (g0.k.a) r0     // Catch:{ InterruptedException -> 0x00c8 }
            r3.a(r0)     // Catch:{ InterruptedException -> 0x00c8 }
            android.graphics.Typeface r6 = r0.f4466a     // Catch:{ InterruptedException -> 0x00c8 }
            goto L_0x0099
        L_0x00b7:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00c8 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00c8 }
            throw r0     // Catch:{ InterruptedException -> 0x00c8 }
        L_0x00bf:
            r0 = move-exception
            throw r0     // Catch:{ InterruptedException -> 0x00c8 }
        L_0x00c1:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00c8 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00c8 }
            throw r1     // Catch:{ InterruptedException -> 0x00c8 }
        L_0x00c8:
            g0.b r0 = new g0.b
            a1.a r1 = r3.f4445a
            r0.<init>(r1, r8)
            android.os.Handler r1 = r3.f4446b
            r1.post(r0)
            goto L_0x0099
        L_0x00d5:
            p.e<java.lang.String, android.graphics.Typeface> r4 = g0.k.f4462a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.e
            r4.append(r5)
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            p.e<java.lang.String, android.graphics.Typeface> r5 = g0.k.f4462a
            java.lang.Object r5 = r5.a(r4)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0104
            g0.a r0 = new g0.a
            r0.<init>(r10, r5)
            r9.post(r0)
            r13 = r16
            r6 = r5
            goto L_0x01ce
        L_0x0104:
            g0.h r5 = new g0.h
            r5.<init>(r3)
            java.lang.Object r9 = g0.k.f4464c
            monitor-enter(r9)
            p.f<java.lang.String, java.util.ArrayList<i0.a<g0.k$a>>> r3 = g0.k.f4465d     // Catch:{ all -> 0x0153 }
            java.lang.Object r7 = r3.getOrDefault(r4, r6)     // Catch:{ all -> 0x0153 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0153 }
            if (r7 == 0) goto L_0x011c
            r7.add(r5)     // Catch:{ all -> 0x0153 }
            monitor-exit(r9)     // Catch:{ all -> 0x0153 }
            goto L_0x0099
        L_0x011c:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0153 }
            r7.<init>()     // Catch:{ all -> 0x0153 }
            r7.add(r5)     // Catch:{ all -> 0x0153 }
            r3.put(r4, r7)     // Catch:{ all -> 0x0153 }
            monitor-exit(r9)     // Catch:{ all -> 0x0153 }
            g0.i r3 = new g0.i
            r3.<init>(r4, r14, r1, r2)
            java.util.concurrent.ThreadPoolExecutor r0 = g0.k.f4463b
            g0.j r1 = new g0.j
            r1.<init>(r4)
            android.os.Looper r4 = android.os.Looper.myLooper()
            if (r4 != 0) goto L_0x0144
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            goto L_0x0149
        L_0x0144:
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
        L_0x0149:
            g0.o r5 = new g0.o
            r5.<init>(r4, r3, r1)
            r0.execute(r5)
            goto L_0x0099
        L_0x0153:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0153 }
            throw r0
        L_0x0156:
            c0.d r0 = f2638a
            b0.a$c r1 = (b0.a.c) r1
            r0.getClass()
            b0.a$d[] r0 = r1.f2495a     // Catch:{ Exception -> 0x01c1 }
            int r1 = r0.length     // Catch:{ Exception -> 0x01c1 }
            r4 = r5
            r9 = r6
        L_0x0162:
            if (r4 >= r1) goto L_0x01a2
            r10 = r0[r4]     // Catch:{ Exception -> 0x01c1 }
            android.graphics.fonts.Font$Builder r11 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x019d }
            int r12 = r10.e     // Catch:{ IOException -> 0x019d }
            r13 = r16
            r11.<init>(r13, r12)     // Catch:{ IOException -> 0x019f }
            int r12 = r10.f2496a     // Catch:{ IOException -> 0x019f }
            android.graphics.fonts.Font$Builder r11 = r11.setWeight(r12)     // Catch:{ IOException -> 0x019f }
            boolean r12 = r10.f2497b     // Catch:{ IOException -> 0x019f }
            if (r12 == 0) goto L_0x017b
            r12 = r7
            goto L_0x017c
        L_0x017b:
            r12 = r5
        L_0x017c:
            android.graphics.fonts.Font$Builder r11 = r11.setSlant(r12)     // Catch:{ IOException -> 0x019f }
            int r12 = r10.f2499d     // Catch:{ IOException -> 0x019f }
            android.graphics.fonts.Font$Builder r11 = r11.setTtcIndex(r12)     // Catch:{ IOException -> 0x019f }
            java.lang.String r10 = r10.f2498c     // Catch:{ IOException -> 0x019f }
            android.graphics.fonts.Font$Builder r10 = r11.setFontVariationSettings(r10)     // Catch:{ IOException -> 0x019f }
            android.graphics.fonts.Font r10 = r10.build()     // Catch:{ IOException -> 0x019f }
            if (r9 != 0) goto L_0x0199
            android.graphics.fonts.FontFamily$Builder r11 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x019f }
            r11.<init>(r10)     // Catch:{ IOException -> 0x019f }
            r9 = r11
            goto L_0x019f
        L_0x0199:
            r9.addFont(r10)     // Catch:{ IOException -> 0x019f }
            goto L_0x019f
        L_0x019d:
            r13 = r16
        L_0x019f:
            int r4 = r4 + 1
            goto L_0x0162
        L_0x01a2:
            r13 = r16
            if (r9 != 0) goto L_0x01a7
            goto L_0x01c3
        L_0x01a7:
            android.graphics.fonts.FontFamily r0 = r9.build()     // Catch:{ Exception -> 0x01c3 }
            android.graphics.Typeface$CustomFallbackBuilder r1 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x01c3 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01c3 }
            android.graphics.fonts.Font r0 = c0.d.a(r0, r2)     // Catch:{ Exception -> 0x01c3 }
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch:{ Exception -> 0x01c3 }
            android.graphics.Typeface$CustomFallbackBuilder r0 = r1.setStyle(r0)     // Catch:{ Exception -> 0x01c3 }
            android.graphics.Typeface r6 = r0.build()     // Catch:{ Exception -> 0x01c3 }
            goto L_0x01c3
        L_0x01c1:
            r13 = r16
        L_0x01c3:
            if (r3 == 0) goto L_0x01ce
            if (r6 == 0) goto L_0x01cb
            r3.b(r6)
            goto L_0x01ce
        L_0x01cb:
            r3.a(r8)
        L_0x01ce:
            if (r6 == 0) goto L_0x01d9
            p.e<java.lang.String, android.graphics.Typeface> r0 = f2639b
            java.lang.String r1 = c(r16, r17, r18, r19, r20)
            r0.b(r1, r6)
        L_0x01d9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.c.a(android.content.Context, b0.a$b, android.content.res.Resources, int, java.lang.String, int, int, b0.b$b, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Resources resources, int i8, String str, int i9, int i10) {
        Typeface typeface;
        f2638a.getClass();
        try {
            Font build = new Font.Builder(resources, i8).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            f2639b.b(c(resources, i8, str, i9, i10), typeface);
        }
        return typeface;
    }

    public static String c(Resources resources, int i8, String str, int i9, int i10) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i9 + '-' + i8 + '-' + i10;
    }
}
