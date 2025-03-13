package h2;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public final class a implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final HttpURLConnection f4739f;

    public a(HttpURLConnection httpURLConnection) {
        this.f4739f = httpURLConnection;
    }

    public static String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[SYNTHETIC, Splitter:B:10:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r3 = this;
            java.net.HttpURLConnection r3 = r3.f4739f
            java.lang.String r0 = "Unable to fetch "
            int r1 = r3.getResponseCode()     // Catch:{ IOException -> 0x000f }
            int r1 = r1 / 100
            r2 = 2
            if (r1 != r2) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0014
            r3 = 0
            goto L_0x003c
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x003d }
            java.net.URL r0 = r3.getURL()     // Catch:{ IOException -> 0x003d }
            r1.append(r0)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = ". Failed with "
            r1.append(r0)     // Catch:{ IOException -> 0x003d }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x003d }
            r1.append(r0)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = "\n"
            r1.append(r0)     // Catch:{ IOException -> 0x003d }
            java.lang.String r3 = c(r3)     // Catch:{ IOException -> 0x003d }
            r1.append(r3)     // Catch:{ IOException -> 0x003d }
            java.lang.String r3 = r1.toString()     // Catch:{ IOException -> 0x003d }
        L_0x003c:
            return r3
        L_0x003d:
            r3 = move-exception
            java.lang.String r0 = "get error failed "
            k2.c.c(r0, r3)
            java.lang.String r3 = r3.getMessage()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.a():java.lang.String");
    }

    public final void close() {
        this.f4739f.disconnect();
    }
}
