package o6;

import j6.b;
import java.util.ArrayList;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final n f6190a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6191b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6192c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6193d;
    public final int e;

    public x(g gVar, int i8, b bVar) {
        this.f6192c = new ArrayList();
        this.e = 0;
        this.e = i8;
        this.f6191b = bVar;
    }

    public x(g gVar, String str) {
        this.f6192c = new ArrayList();
        this.e = 0;
        this.f6193d = str;
    }

    public x(g gVar, String str, ArrayList arrayList, v5.b bVar, s5.b bVar2) {
        this(gVar, str);
        this.f6190a = bVar2;
        this.f6192c = new ArrayList(arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            this.f6192c.add(i8, new w(this, bVar, (z5.b) arrayList.get(i8), i8).f4416b.h());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0 = r1.f5035a.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        android.util.Log.w("DWF:ResourceManager", "Failed getText with " + r0 + ": " + r1.getMessage());
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r4 = this;
            int r0 = r4.e
            if (r0 == 0) goto L_0x0039
            j6.b r1 = r4.f6191b
            r1.getClass()
            android.content.res.Resources r2 = r1.e     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ NotFoundException -> 0x0010 }
            goto L_0x003b
        L_0x0010:
            android.content.res.Resources r1 = r1.f5035a     // Catch:{ NotFoundException -> 0x0017 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ NotFoundException -> 0x0017 }
            goto L_0x003b
        L_0x0017:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed getText with "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            java.lang.String r0 = r1.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "DWF:ResourceManager"
            android.util.Log.w(r1, r0)
            r0 = 0
            goto L_0x003b
        L_0x0039:
            java.lang.String r0 = r4.f6193d
        L_0x003b:
            java.util.ArrayList r4 = r4.f6192c
            int r1 = r4.size()
            if (r1 <= 0) goto L_0x0047
            java.lang.String r0 = n6.g.c(r0, r4)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.x.a():java.lang.String");
    }
}
