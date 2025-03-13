package j5;

import c6.d;
import w5.g;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f5019b;

    public /* synthetic */ c(d dVar, int i8) {
        this.f5018a = i8;
        this.f5019b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(w5.c r4, w5.f r5) {
        /*
            r3 = this;
            int r4 = r3.f5018a
            r0 = -1
            c6.d r3 = r3.f5019b
            switch(r4) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x006b
        L_0x0009:
            c6.f r3 = (c6.f) r3
            r3.getClass()
            java.lang.String r4 = r5.h()
            boolean r5 = n6.g.d(r4)
            if (r5 == 0) goto L_0x0051
            java.lang.String r5 = "\\d+"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0027:
            boolean r2 = r5.find()
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r5.group()
            r1.append(r2)
            goto L_0x0027
        L_0x0035:
            java.lang.String r5 = r1.toString()     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x0052
        L_0x003e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "fail to parse step count: "
            r5.<init>(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DWF:ModelHealth"
            android.util.Log.w(r5, r4)
        L_0x0051:
            r4 = r0
        L_0x0052:
            if (r4 == r0) goto L_0x0057
            r3.n(r4)
        L_0x0057:
            return
        L_0x0058:
            j5.e r3 = (j5.e) r3
            r3.getClass()
            java.lang.String r4 = r5.h()
            int r4 = r3.q(r4)
            if (r4 == r0) goto L_0x006a
            r3.u(r4)
        L_0x006a:
            return
        L_0x006b:
            c6.k r3 = (c6.k) r3
            r3.getClass()
            java.lang.String r4 = r5.h()
            int r4 = c6.k.n(r4)
            if (r4 < 0) goto L_0x007d
            r3.o(r4)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.c.g(w5.c, w5.f):void");
    }
}
