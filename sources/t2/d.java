package t2;

import java.io.File;
import m2.a;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f7471a;

    /* renamed from: b  reason: collision with root package name */
    public final File f7472b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7473c;

    /* renamed from: d  reason: collision with root package name */
    public final b f7474d = new b();
    public a e;

    @Deprecated
    public d(File file, long j8) {
        this.f7472b = file;
        this.f7473c = j8;
        this.f7471a = new j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(p2.e r5) {
        /*
            r4 = this;
            t2.j r0 = r4.f7471a
            java.lang.String r0 = r0.a(r5)
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x0012
            java.util.Objects.toString(r5)
        L_0x0012:
            monitor-enter(r4)     // Catch:{ IOException -> 0x0030 }
            m2.a r5 = r4.e     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x0021
            java.io.File r5 = r4.f7472b     // Catch:{ all -> 0x0032 }
            long r2 = r4.f7473c     // Catch:{ all -> 0x0032 }
            m2.a r5 = m2.a.o(r5, r2)     // Catch:{ all -> 0x0032 }
            r4.e = r5     // Catch:{ all -> 0x0032 }
        L_0x0021:
            m2.a r5 = r4.e     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0030 }
            m2.a$e r4 = r5.j(r0)     // Catch:{ IOException -> 0x0030 }
            if (r4 == 0) goto L_0x0041
            java.io.File[] r4 = r4.f5437a     // Catch:{ IOException -> 0x0030 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ IOException -> 0x0030 }
            goto L_0x0042
        L_0x0030:
            r4 = move-exception
            goto L_0x0035
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0030 }
            throw r5     // Catch:{ IOException -> 0x0030 }
        L_0x0035:
            r5 = 5
            boolean r5 = android.util.Log.isLoggable(r1, r5)
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = "Unable to get from disk cache"
            android.util.Log.w(r1, r5, r4)
        L_0x0041:
            r4 = 0
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.d.a(p2.e):java.io.File");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0098 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(p2.e r7, r2.g r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            t2.j r1 = r6.f7471a
            java.lang.String r1 = r1.a(r7)
            t2.b r2 = r6.f7474d
            monitor-enter(r2)
            java.util.HashMap r3 = r2.f7464a     // Catch:{ all -> 0x00be }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x00be }
            t2.b$a r3 = (t2.b.a) r3     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x0033
            t2.b$b r3 = r2.f7465b     // Catch:{ all -> 0x00be }
            java.util.ArrayDeque r4 = r3.f7468a     // Catch:{ all -> 0x00be }
            monitor-enter(r4)     // Catch:{ all -> 0x00be }
            java.util.ArrayDeque r3 = r3.f7468a     // Catch:{ all -> 0x0030 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0030 }
            t2.b$a r3 = (t2.b.a) r3     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x002a
            t2.b$a r3 = new t2.b$a     // Catch:{ all -> 0x00be }
            r3.<init>()     // Catch:{ all -> 0x00be }
        L_0x002a:
            java.util.HashMap r4 = r2.f7464a     // Catch:{ all -> 0x00be }
            r4.put(r1, r3)     // Catch:{ all -> 0x00be }
            goto L_0x0033
        L_0x0030:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r6     // Catch:{ all -> 0x00be }
        L_0x0033:
            int r4 = r3.f7467b     // Catch:{ all -> 0x00be }
            r5 = 1
            int r4 = r4 + r5
            r3.f7467b = r4     // Catch:{ all -> 0x00be }
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            java.util.concurrent.locks.ReentrantLock r2 = r3.f7466a
            r2.lock()
            java.lang.String r2 = "DiskLruCacheWrapper"
            r3 = 2
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x004b
            java.util.Objects.toString(r7)     // Catch:{ all -> 0x00b7 }
        L_0x004b:
            monitor-enter(r6)     // Catch:{ IOException -> 0x008e }
            m2.a r7 = r6.e     // Catch:{ all -> 0x00a3 }
            if (r7 != 0) goto L_0x005a
            java.io.File r7 = r6.f7472b     // Catch:{ all -> 0x00a3 }
            long r2 = r6.f7473c     // Catch:{ all -> 0x00a3 }
            m2.a r7 = m2.a.o(r7, r2)     // Catch:{ all -> 0x00a3 }
            r6.e = r7     // Catch:{ all -> 0x00a3 }
        L_0x005a:
            m2.a r7 = r6.e     // Catch:{ all -> 0x00a3 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x008e }
            m2.a$e r2 = r7.j(r1)     // Catch:{ IOException -> 0x008e }
            if (r2 == 0) goto L_0x0069
        L_0x0063:
            t2.b r6 = r6.f7474d
            r6.a(r1)
            return
        L_0x0069:
            m2.a$c r7 = r7.g(r1)     // Catch:{ IOException -> 0x008e }
            if (r7 == 0) goto L_0x0099
            java.io.File r0 = r7.b()     // Catch:{ all -> 0x0090 }
            DataType r2 = r8.f6768b     // Catch:{ all -> 0x0090 }
            p2.g r3 = r8.f6769c     // Catch:{ all -> 0x0090 }
            p2.d<DataType> r8 = r8.f6767a     // Catch:{ all -> 0x0090 }
            boolean r8 = r8.f(r2, r0, r3)     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x0086
            m2.a r8 = m2.a.this     // Catch:{ all -> 0x0090 }
            m2.a.a(r8, r7, r5)     // Catch:{ all -> 0x0090 }
            r7.f5429c = r5     // Catch:{ all -> 0x0090 }
        L_0x0086:
            boolean r8 = r7.f5429c     // Catch:{ IOException -> 0x008e }
            if (r8 != 0) goto L_0x0063
            r7.a()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0063
        L_0x008e:
            r7 = move-exception
            goto L_0x00a6
        L_0x0090:
            r8 = move-exception
            boolean r0 = r7.f5429c     // Catch:{ IOException -> 0x008e }
            if (r0 != 0) goto L_0x0098
            r7.a()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            throw r8     // Catch:{ IOException -> 0x008e }
        L_0x0099:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x008e }
            java.lang.String r8 = r0.concat(r1)     // Catch:{ IOException -> 0x008e }
            r7.<init>(r8)     // Catch:{ IOException -> 0x008e }
            throw r7     // Catch:{ IOException -> 0x008e }
        L_0x00a3:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x008e }
            throw r7     // Catch:{ IOException -> 0x008e }
        L_0x00a6:
            java.lang.String r8 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r8 = android.util.Log.isLoggable(r8, r0)     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x0063
            java.lang.String r8 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r8, r0, r7)     // Catch:{ all -> 0x00b7 }
            goto L_0x0063
        L_0x00b7:
            r7 = move-exception
            t2.b r6 = r6.f7474d
            r6.a(r1)
            throw r7
        L_0x00be:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00be }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.d.c(p2.e, r2.g):void");
    }
}
