package c8;

import y7.g1;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final g1 f2865a;

    /* JADX WARNING: type inference failed for: r0v9, types: [v7.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = c8.s.f2870a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean.parseBoolean(r0)
        L_0x0010:
            java.lang.Class<c8.l> r0 = c8.l.class
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ all -> 0x0083 }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)     // Catch:{ all -> 0x0083 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "<this>"
            q7.k.e(r0, r2)     // Catch:{ all -> 0x0083 }
            v7.e r2 = new v7.e     // Catch:{ all -> 0x0083 }
            r2.<init>(r0)     // Catch:{ all -> 0x0083 }
            boolean r0 = r2 instanceof v7.a     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            v7.a r0 = new v7.a     // Catch:{ all -> 0x0083 }
            r0.<init>(r2)     // Catch:{ all -> 0x0083 }
            r2 = r0
        L_0x0033:
            java.util.List r0 = v7.h.n0(r2)     // Catch:{ all -> 0x0083 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0083 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r3 != 0) goto L_0x0043
            r3 = r1
            goto L_0x006a
        L_0x0043:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0083 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r4 != 0) goto L_0x004e
            goto L_0x006a
        L_0x004e:
            r4 = r3
            c8.l r4 = (c8.l) r4     // Catch:{ all -> 0x0083 }
            int r4 = r4.c()     // Catch:{ all -> 0x0083 }
        L_0x0055:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0083 }
            r6 = r5
            c8.l r6 = (c8.l) r6     // Catch:{ all -> 0x0083 }
            int r6 = r6.c()     // Catch:{ all -> 0x0083 }
            if (r4 >= r6) goto L_0x0064
            r3 = r5
            r4 = r6
        L_0x0064:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x0055
        L_0x006a:
            c8.l r3 = (c8.l) r3     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x007b
            y7.g1 r1 = r3.b(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0076
        L_0x0073:
            r3.a()     // Catch:{ all -> 0x0083 }
        L_0x0076:
            if (r1 == 0) goto L_0x007b
            f2865a = r1
            return
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.m.<clinit>():void");
    }
}
