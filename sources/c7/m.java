package c7;

import o6.q;

public final class m extends q {

    /* renamed from: o  reason: collision with root package name */
    public final String f2816o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2817p;

    public m(q qVar, String str, boolean z8) {
        super(qVar);
        this.f2816o = str;
        this.f2817p = z8;
        this.f2826j = new n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<c7.n> C(java.util.ArrayList<c7.n> r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = r13.f6176d
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            o6.q r2 = (o6.q) r2
            boolean r2 = r2.isEnabled()
            if (r2 != 0) goto L_0x000b
            r1 = r3
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            if (r1 == 0) goto L_0x0107
            java.lang.String r1 = r13.f2816o
            java.lang.String r2 = "DWF:TemplateProperty"
            if (r1 != 0) goto L_0x0033
            java.lang.String r14 = "parse: string is null"
            android.util.Log.w(r2, r14)
            java.lang.String r14 = ""
            goto L_0x0104
        L_0x0033:
            boolean r5 = r13.f2817p
            java.lang.String r6 = "plurals"
            java.lang.String r7 = "PLURALS_"
            if (r5 == 0) goto L_0x0063
            j6.b r5 = r13.f2830n
            if (r5 == 0) goto L_0x0063
            boolean r8 = r1.startsWith(r7)
            if (r8 == 0) goto L_0x0058
            android.content.res.Resources r8 = r5.e
            java.lang.String r9 = r5.f5039f
            int r8 = r8.getIdentifier(r1, r6, r9)
            if (r8 != 0) goto L_0x0059
            android.content.res.Resources r8 = r5.f5035a
            java.lang.String r5 = r5.f5036b
            int r8 = r8.getIdentifier(r1, r6, r5)
            goto L_0x0059
        L_0x0058:
            r8 = r3
        L_0x0059:
            if (r8 == 0) goto L_0x0063
            int r5 = r14.size()
            if (r5 != r4) goto L_0x0063
            r5 = r4
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            r8 = 0
            if (r5 == 0) goto L_0x00d9
            java.lang.Object r5 = r14.get(r3)
            c7.n r5 = (c7.n) r5
            java.lang.String r5 = r5.f2818f
            java.lang.String r9 = "-?\\d+(\\.\\d+)?"
            boolean r10 = r5.matches(r9)
            if (r10 == 0) goto L_0x00d1
            boolean r9 = r5.matches(r9)
            if (r9 == 0) goto L_0x008d
            float r9 = java.lang.Float.parseFloat(r5)
            double r9 = (double) r9
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 % r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x008d
            r9 = r4
            goto L_0x008e
        L_0x008d:
            r9 = r3
        L_0x008e:
            if (r9 == 0) goto L_0x00d1
            float r2 = java.lang.Float.parseFloat(r5)
            int r2 = (int) r2
            j6.b r5 = r13.f2830n
            r5.getClass()
            boolean r7 = r1.startsWith(r7)
            if (r7 != 0) goto L_0x00a1
            goto L_0x00cf
        L_0x00a1:
            java.lang.String r7 = r5.f5039f
            android.content.res.Resources r9 = r5.e
            int r7 = r9.getIdentifier(r1, r6, r7)
            if (r7 == 0) goto L_0x00b8
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r3] = r5
            java.lang.String r2 = r9.getQuantityString(r7, r2, r4)
            goto L_0x00da
        L_0x00b8:
            java.lang.String r7 = r5.f5036b
            android.content.res.Resources r5 = r5.f5035a
            int r6 = r5.getIdentifier(r1, r6, r7)
            if (r6 == 0) goto L_0x00cf
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r4[r3] = r7
            java.lang.String r2 = r5.getQuantityString(r6, r2, r4)
            goto L_0x00da
        L_0x00cf:
            r2 = r1
            goto L_0x00da
        L_0x00d1:
            java.lang.String r3 = "plural is true, but the element isn't number."
            android.util.Log.e(r2, r3)
            java.lang.String r2 = "Error"
            goto L_0x00da
        L_0x00d9:
            r2 = r8
        L_0x00da:
            if (r2 == 0) goto L_0x00de
            r14 = r2
            goto L_0x0104
        L_0x00de:
            j6.b r2 = r13.f2830n
            if (r2 == 0) goto L_0x00ee
            int r2 = r2.f(r1)
            if (r2 == 0) goto L_0x00ee
            j6.b r2 = r13.f2830n
            java.lang.String r8 = r2.o(r1)
        L_0x00ee:
            if (r8 == 0) goto L_0x00f1
            r1 = r8
        L_0x00f1:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f r3 = new r5.f
            r4 = 22
            r3.<init>(r4, r2)
            r14.forEach(r3)
            java.lang.String r14 = n6.g.c(r1, r2)
        L_0x0104:
            r13.G(r14)
        L_0x0107:
            c7.n r13 = r13.f2826j
            java.lang.Object r13 = r13.clone()
            c7.n r13 = (c7.n) r13
            r0.add(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.m.C(java.util.ArrayList):java.util.ArrayList");
    }

    public final void D() {
    }
}
