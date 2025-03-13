package w5;

import android.icu.util.TimeZone;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f8075a;

    /* renamed from: b  reason: collision with root package name */
    public TimeZone f8076b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f8077c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8078d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8079f;

    public i() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[SYNTHETIC, Splitter:B:15:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(int r4, java.lang.String r5, java.util.List<java.lang.String> r6, java.lang.String r7) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f8077c = r0
            r0 = 1
            r3.f8079f = r0
            r3.f8075a = r4
            boolean r4 = n6.g.e(r5)
            java.lang.String r1 = "DWF:IcuData"
            if (r4 == 0) goto L_0x0018
            goto L_0x002e
        L_0x0018:
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)     // Catch:{ ZoneRulesException -> 0x001d }
            goto L_0x0034
        L_0x001d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid timezone: "
            r4.<init>(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r1, r4)
        L_0x002e:
            r3.f8078d = r0
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getDefault()
        L_0x0034:
            r3.f8076b = r4
            if (r6 == 0) goto L_0x0042
            int r4 = r6.size()
            if (r4 >= r0) goto L_0x003f
            goto L_0x0042
        L_0x003f:
            r3.f8077c = r6
            goto L_0x0044
        L_0x0042:
            r3.e = r0
        L_0x0044:
            boolean r4 = n6.g.e(r7)
            if (r4 != 0) goto L_0x0067
            int r4 = b6.a.B(r7)     // Catch:{ IllegalArgumentException -> 0x0051 }
            r3.f8079f = r4     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unsupported calendar :"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r4 = ", falls back to default calendar."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r1, r3)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i.<init>(int, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = ((w5.i) r3).f8075a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof w5.i
            r1 = 0
            if (r0 == 0) goto L_0x000e
            w5.i r3 = (w5.i) r3
            int r3 = r3.f8075a
            int r2 = r2.f8075a
            if (r2 != r3) goto L_0x000e
            r1 = 1
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f8075a;
    }
}
