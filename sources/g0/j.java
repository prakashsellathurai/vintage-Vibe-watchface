package g0;

import g0.k;
import i0.a;

public final class j implements a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4461a;

    public j(String str) {
        this.f4461a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r4 >= r2.size()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        ((i0.a) r2.get(r4)).accept(r5);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            g0.k$a r5 = (g0.k.a) r5
            java.lang.Object r0 = g0.k.f4464c
            monitor-enter(r0)
            p.f<java.lang.String, java.util.ArrayList<i0.a<g0.k$a>>> r1 = g0.k.f4465d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f4461a     // Catch:{ all -> 0x002e }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x002d
        L_0x0014:
            java.lang.String r4 = r4.f4461a     // Catch:{ all -> 0x002e }
            r1.remove(r4)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            r4 = 0
        L_0x001b:
            int r0 = r2.size()
            if (r4 >= r0) goto L_0x002d
            java.lang.Object r0 = r2.get(r4)
            i0.a r0 = (i0.a) r0
            r0.accept(r5)
            int r4 = r4 + 1
            goto L_0x001b
        L_0x002d:
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.j.accept(java.lang.Object):void");
    }
}
