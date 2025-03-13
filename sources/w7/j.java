package w7;

import h7.d;
import java.util.List;
import p7.p;
import q7.l;

public final class j extends l implements p<CharSequence, Integer, d<? extends Integer, ? extends Integer>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List<String> f8093f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f8094g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(List<String> list, boolean z8) {
        super(2);
        this.f8093f = list;
        this.f8094g = z8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r0 = "$this$$receiver"
            q7.k.e(r13, r0)
            boolean r0 = r12.f8094g
            r7 = 0
            java.util.List<java.lang.String> r12 = r12.f8093f
            r1 = 0
            if (r0 != 0) goto L_0x004d
            int r2 = r12.size()
            r3 = 1
            if (r2 != r3) goto L_0x004d
            int r0 = r12.size()
            if (r0 == 0) goto L_0x0045
            if (r0 != r3) goto L_0x003d
            java.lang.Object r12 = r12.get(r1)
            java.lang.String r12 = (java.lang.String) r12
            int r13 = w7.l.q(r14, r13, r12, r1)
            if (r13 >= 0) goto L_0x0032
            goto L_0x00d5
        L_0x0032:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            h7.d r14 = new h7.d
            r14.<init>(r13, r12)
            goto L_0x00d6
        L_0x003d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "List has more than one element."
            r12.<init>(r13)
            throw r12
        L_0x0045:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "List is empty."
            r12.<init>(r13)
            throw r12
        L_0x004d:
            t7.c r2 = new t7.c
            if (r14 >= 0) goto L_0x0052
            r14 = r1
        L_0x0052:
            int r1 = r13.length()
            r2.<init>(r14, r1)
            boolean r1 = r13 instanceof java.lang.String
            int r8 = r2.f7536h
            int r9 = r2.f7535g
            if (r1 == 0) goto L_0x009e
            if (r8 <= 0) goto L_0x0065
            if (r14 <= r9) goto L_0x0069
        L_0x0065:
            if (r8 >= 0) goto L_0x00d5
            if (r9 > r14) goto L_0x00d5
        L_0x0069:
            java.util.Iterator r10 = r12.iterator()
        L_0x006d:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.Object r11 = r10.next()
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r1 = 0
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.length()
            r2 = r14
            r6 = r0
            boolean r1 = w7.i.o(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x006d
            goto L_0x008c
        L_0x008b:
            r11 = r7
        L_0x008c:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x009a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            h7.d r14 = new h7.d
            r14.<init>(r12, r11)
            goto L_0x00d6
        L_0x009a:
            if (r14 == r9) goto L_0x00d5
            int r14 = r14 + r8
            goto L_0x0069
        L_0x009e:
            if (r8 <= 0) goto L_0x00a2
            if (r14 <= r9) goto L_0x00a6
        L_0x00a2:
            if (r8 >= 0) goto L_0x00d5
            if (r9 > r14) goto L_0x00d5
        L_0x00a6:
            java.util.Iterator r1 = r12.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            boolean r3 = w7.l.s(r3, r13, r14, r4, r0)
            if (r3 == 0) goto L_0x00aa
            goto L_0x00c3
        L_0x00c2:
            r2 = r7
        L_0x00c3:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            h7.d r14 = new h7.d
            r14.<init>(r12, r2)
            goto L_0x00d6
        L_0x00d1:
            if (r14 == r9) goto L_0x00d5
            int r14 = r14 + r8
            goto L_0x00a6
        L_0x00d5:
            r14 = r7
        L_0x00d6:
            if (r14 == 0) goto L_0x00eb
            B r12 = r14.f4782g
            java.lang.String r12 = (java.lang.String) r12
            int r12 = r12.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            h7.d r7 = new h7.d
            A r13 = r14.f4781f
            r7.<init>(r13, r12)
        L_0x00eb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.j.g(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
