package y1;

import android.content.Context;
import java.util.concurrent.Callable;

public final class h implements Callable<r<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f8238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8239b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f8240c;

    public h(Context context, String str, String str2) {
        this.f8238a = context;
        this.f8239b = str;
        this.f8240c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r12 = this;
            android.content.Context r0 = r12.f8238a
            h2.e r1 = k3.j.J
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<h2.e> r4 = h2.e.class
            monitor-enter(r4)
            h2.e r1 = k3.j.J     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0038
            h2.e r1 = new h2.e     // Catch:{ all -> 0x003a }
            h2.d r5 = k3.j.K     // Catch:{ all -> 0x003a }
            if (r5 != 0) goto L_0x002e
            java.lang.Class<h2.d> r5 = h2.d.class
            monitor-enter(r5)     // Catch:{ all -> 0x003a }
            h2.d r6 = k3.j.K     // Catch:{ all -> 0x002b }
            if (r6 != 0) goto L_0x0028
            h2.d r6 = new h2.d     // Catch:{ all -> 0x002b }
            y1.c r7 = new y1.c     // Catch:{ all -> 0x002b }
            r7.<init>(r0)     // Catch:{ all -> 0x002b }
            r6.<init>(r3, r7)     // Catch:{ all -> 0x002b }
            k3.j.K = r6     // Catch:{ all -> 0x002b }
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            r5 = r6
            goto L_0x002e
        L_0x002b:
            r12 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r12     // Catch:{ all -> 0x003a }
        L_0x002e:
            y7.b0 r0 = new y7.b0     // Catch:{ all -> 0x003a }
            r0.<init>(r2)     // Catch:{ all -> 0x003a }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x003a }
            k3.j.J = r1     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r12
        L_0x003d:
            java.lang.String r0 = r12.f8239b
            java.lang.String r4 = r12.f8240c
            h2.b r5 = h2.b.f4741h
            r6 = 0
            if (r4 != 0) goto L_0x0048
            goto L_0x00bc
        L_0x0048:
            h2.d r7 = r1.f4746a
            r7.getClass()
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0099 }
            java.io.File r9 = r7.d()     // Catch:{ FileNotFoundException -> 0x0099 }
            h2.b r10 = h2.b.f4740g     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r11 = h2.d.c(r0, r10, r3)     // Catch:{ FileNotFoundException -> 0x0099 }
            r8.<init>(r9, r11)     // Catch:{ FileNotFoundException -> 0x0099 }
            boolean r9 = r8.exists()     // Catch:{ FileNotFoundException -> 0x0099 }
            if (r9 == 0) goto L_0x0063
            goto L_0x0078
        L_0x0063:
            java.io.File r8 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0099 }
            java.io.File r7 = r7.d()     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r9 = h2.d.c(r0, r5, r3)     // Catch:{ FileNotFoundException -> 0x0099 }
            r8.<init>(r7, r9)     // Catch:{ FileNotFoundException -> 0x0099 }
            boolean r7 = r8.exists()     // Catch:{ FileNotFoundException -> 0x0099 }
            if (r7 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r8 = r6
        L_0x0078:
            if (r8 != 0) goto L_0x007b
            goto L_0x0099
        L_0x007b:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0099 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r9 = r8.getAbsolutePath()
            java.lang.String r11 = ".zip"
            boolean r9 = r9.endsWith(r11)
            if (r9 == 0) goto L_0x008d
            r10 = r5
        L_0x008d:
            r8.getAbsolutePath()
            k2.c.a()
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r10, r7)
            goto L_0x009a
        L_0x0099:
            r8 = r6
        L_0x009a:
            if (r8 != 0) goto L_0x009d
            goto L_0x00bc
        L_0x009d:
            java.lang.Object r7 = r8.first
            h2.b r7 = (h2.b) r7
            java.lang.Object r8 = r8.second
            java.io.InputStream r8 = (java.io.InputStream) r8
            if (r7 != r5) goto L_0x00b1
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream
            r5.<init>(r8)
            y1.r r5 = y1.g.f(r5, r0)
            goto L_0x00b5
        L_0x00b1:
            y1.r r5 = y1.g.c(r8, r0)
        L_0x00b5:
            V r5 = r5.f8321a
            if (r5 == 0) goto L_0x00bc
            y1.f r5 = (y1.f) r5
            goto L_0x00bd
        L_0x00bc:
            r5 = r6
        L_0x00bd:
            if (r5 == 0) goto L_0x00c5
            y1.r r0 = new y1.r
            r0.<init>(r5)
            goto L_0x011f
        L_0x00c5:
            k2.c.a()
            java.lang.String r5 = "LottieFetchResult close failed "
            k2.c.a()
            y7.b0 r7 = r1.f4747b     // Catch:{ Exception -> 0x00e4 }
            r7.getClass()     // Catch:{ Exception -> 0x00e4 }
            h2.a r6 = y7.b0.j(r0)     // Catch:{ Exception -> 0x00e4 }
            java.net.HttpURLConnection r7 = r6.f4739f
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x00e6 }
            int r8 = r8 / 100
            if (r8 != r2) goto L_0x00e6
            r3 = 1
            goto L_0x00e6
        L_0x00e2:
            r12 = move-exception
            goto L_0x0131
        L_0x00e4:
            r0 = move-exception
            goto L_0x010f
        L_0x00e6:
            if (r3 == 0) goto L_0x00f8
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r7.getContentType()     // Catch:{ Exception -> 0x00e4 }
            y1.r r0 = r1.a(r0, r2, r3, r4)     // Catch:{ Exception -> 0x00e4 }
            k2.c.a()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x0106
        L_0x00f8:
            y1.r r0 = new y1.r     // Catch:{ Exception -> 0x00e4 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r6.a()     // Catch:{ Exception -> 0x00e4 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00e4 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x00e4 }
        L_0x0106:
            r6.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x011f
        L_0x010a:
            r1 = move-exception
            k2.c.c(r5, r1)
            goto L_0x011f
        L_0x010f:
            y1.r r1 = new y1.r     // Catch:{ all -> 0x00e2 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x011e
            r6.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x011e
        L_0x011a:
            r0 = move-exception
            k2.c.c(r5, r0)
        L_0x011e:
            r0 = r1
        L_0x011f:
            java.lang.String r12 = r12.f8240c
            if (r12 == 0) goto L_0x0130
            V r1 = r0.f8321a
            if (r1 == 0) goto L_0x0130
            d2.g r2 = d2.g.f3999b
            y1.f r1 = (y1.f) r1
            p.e<java.lang.String, y1.f> r2 = r2.f4000a
            r2.b(r12, r1)
        L_0x0130:
            return r0
        L_0x0131:
            if (r6 == 0) goto L_0x013b
            r6.close()     // Catch:{ IOException -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r0 = move-exception
            k2.c.c(r5, r0)
        L_0x013b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.h.call():java.lang.Object");
    }
}
