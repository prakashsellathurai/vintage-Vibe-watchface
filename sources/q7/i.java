package q7;

import u7.a;
import u7.c;

public class i extends d implements h, c {

    /* renamed from: m  reason: collision with root package name */
    public final int f6639m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6640n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.f6639m = i8;
        this.f6640n = i9 >> 1;
    }

    public final a a() {
        q.f6644a.getClass();
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [u7.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof q7.i
            r2 = 0
            if (r1 == 0) goto L_0x0046
            q7.i r5 = (q7.i) r5
            java.lang.String r1 = r5.f6632i
            java.lang.String r3 = r4.f6632i
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = r4.f6633j
            java.lang.String r3 = r5.f6633j
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0044
            int r1 = r4.f6640n
            int r3 = r5.f6640n
            if (r1 != r3) goto L_0x0044
            int r1 = r4.f6639m
            int r3 = r5.f6639m
            if (r1 != r3) goto L_0x0044
            java.lang.Object r1 = r4.f6630g
            java.lang.Object r3 = r5.f6630g
            boolean r1 = q7.k.a(r1, r3)
            if (r1 == 0) goto L_0x0044
            q7.e r4 = r4.b()
            q7.e r5 = r5.b()
            boolean r4 = q7.k.a(r4, r5)
            if (r4 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            return r0
        L_0x0046:
            boolean r0 = r5 instanceof u7.c
            if (r0 == 0) goto L_0x005a
            u7.a r0 = r4.f6629f
            if (r0 != 0) goto L_0x0054
            r4.a()
            r4.f6629f = r4
            goto L_0x0055
        L_0x0054:
            r4 = r0
        L_0x0055:
            boolean r4 = r5.equals(r4)
            return r4
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.i.equals(java.lang.Object):boolean");
    }

    public final int getArity() {
        return this.f6639m;
    }

    public final int hashCode() {
        return (((b() == null ? 0 : b().hashCode() * 31) + this.f6632i.hashCode()) * 31) + this.f6633j.hashCode();
    }

    public final String toString() {
        a aVar = this.f6629f;
        if (aVar == null) {
            a();
            this.f6629f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f6632i;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
