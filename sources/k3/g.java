package k3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5138a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f5139b;

    /* renamed from: c  reason: collision with root package name */
    public long f5140c;

    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f5141a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5142b;

        public a(int i8, Object obj) {
            this.f5141a = obj;
            this.f5142b = i8;
        }
    }

    public g(long j8) {
        this.f5139b = j8;
    }

    public final synchronized Y a(T t8) {
        a aVar;
        aVar = (a) this.f5138a.get(t8);
        return aVar != null ? aVar.f5141a : null;
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t8, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Y d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f5139b     // Catch:{ all -> 0x004c }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f5140c     // Catch:{ all -> 0x004c }
            long r5 = r5 + r1
            r7.f5140c = r5     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f5138a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            k3.g$a r2 = new k3.g$a     // Catch:{ all -> 0x004c }
            r2.<init>(r0, r9)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            k3.g$a r0 = (k3.g.a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f5140c     // Catch:{ all -> 0x004c }
            int r3 = r0.f5142b     // Catch:{ all -> 0x004c }
            long r5 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r5
            r7.f5140c = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f5141a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f5141a     // Catch:{ all -> 0x004c }
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f5139b     // Catch:{ all -> 0x004c }
            r7.e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r4 = r0.f5141a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.g.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized void e(long j8) {
        while (this.f5140c > j8) {
            Iterator it = this.f5138a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f5140c -= (long) aVar.f5142b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.f5141a);
        }
    }
}
