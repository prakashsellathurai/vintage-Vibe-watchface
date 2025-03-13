package p;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f6225a;

    /* renamed from: b  reason: collision with root package name */
    public int f6226b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6227c;

    /* renamed from: d  reason: collision with root package name */
    public int f6228d;
    public int e;

    public e(int i8) {
        if (i8 > 0) {
            this.f6227c = i8;
            this.f6225a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k8) {
        if (k8 != null) {
            synchronized (this) {
                V v8 = this.f6225a.get(k8);
                if (v8 != null) {
                    this.f6228d++;
                    return v8;
                }
                this.e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r3, V r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0085
            monitor-enter(r2)
            int r0 = r2.f6226b     // Catch:{ all -> 0x0082 }
            int r0 = r0 + 1
            r2.f6226b = r0     // Catch:{ all -> 0x0082 }
            java.util.LinkedHashMap<K, V> r0 = r2.f6225a     // Catch:{ all -> 0x0082 }
            java.lang.Object r3 = r0.put(r3, r4)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0019
            int r4 = r2.f6226b     // Catch:{ all -> 0x0082 }
            int r4 = r4 + -1
            r2.f6226b = r4     // Catch:{ all -> 0x0082 }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x0082 }
            int r4 = r2.f6227c
        L_0x001c:
            monitor-enter(r2)
            int r0 = r2.f6226b     // Catch:{ all -> 0x007f }
            if (r0 < 0) goto L_0x0060
            java.util.LinkedHashMap<K, V> r0 = r2.f6225a     // Catch:{ all -> 0x007f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x002d
            int r0 = r2.f6226b     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0060
        L_0x002d:
            int r0 = r2.f6226b     // Catch:{ all -> 0x007f }
            if (r0 <= r4) goto L_0x005e
            java.util.LinkedHashMap<K, V> r0 = r2.f6225a     // Catch:{ all -> 0x007f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x003a
            goto L_0x005e
        L_0x003a:
            java.util.LinkedHashMap<K, V> r0 = r2.f6225a     // Catch:{ all -> 0x007f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x007f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x007f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x007f }
            r0.getValue()     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap<K, V> r0 = r2.f6225a     // Catch:{ all -> 0x007f }
            r0.remove(r1)     // Catch:{ all -> 0x007f }
            int r0 = r2.f6226b     // Catch:{ all -> 0x007f }
            int r0 = r0 + -1
            r2.f6226b = r0     // Catch:{ all -> 0x007f }
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            goto L_0x001c
        L_0x005e:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            return r3
        L_0x0060:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r4.<init>()     // Catch:{ all -> 0x007f }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x007f }
            r4.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007f }
            r3.<init>(r4)     // Catch:{ all -> 0x007f }
            throw r3     // Catch:{ all -> 0x007f }
        L_0x007f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r3
        L_0x0082:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0082 }
            throw r3
        L_0x0085:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null || value == null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i8;
        int i9;
        i8 = this.f6228d;
        i9 = this.e + i8;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f6227c), Integer.valueOf(this.f6228d), Integer.valueOf(this.e), Integer.valueOf(i9 != 0 ? (i8 * 100) / i9 : 0)});
    }
}
