package s5;

public final class w {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: y6.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: y6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: y6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: y6.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: y6.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: y6.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(r5.e r12, i6.e r13, v6.b r14, x6.g r15) {
        /*
            java.lang.String r0 = r13.f4862a
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1068217000(0xffffffffc0544d58, float:-3.3172207)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L_0x0032
            r2 = 1245011483(0x4a355e1b, float:2971526.8)
            if (r1 == r2) goto L_0x0027
            r2 = 1788091833(0x6a941db9, float:8.953069E25)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "SequenceImages"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            r0 = r3
            goto L_0x003d
        L_0x0027:
            java.lang.String r1 = "AnimatedImages"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            r0 = r4
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "AnimatedImage"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003c
        L_0x003a:
            r0 = -1
            goto L_0x003d
        L_0x003c:
            r0 = r5
        L_0x003d:
            java.lang.String r1 = "thumbnail"
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00df
            if (r0 == r4) goto L_0x00d2
            if (r0 == r3) goto L_0x0049
            goto L_0x0167
        L_0x0049:
            boolean r8 = r14.I
            android.util.SizeF r14 = r14.E()
            android.util.Size r0 = new android.util.Size
            float r3 = r14.getWidth()
            int r3 = (int) r3
            float r14 = r14.getHeight()
            int r14 = (int) r14
            r0.<init>(r3, r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r3 = "Image"
            java.util.ArrayList r3 = i6.g.b(r13, r3)
            s5.a r6 = new s5.a
            r6.<init>(r4, r14)
            r3.forEach(r6)
            i6.a r1 = r13.b(r1)
            java.lang.String r1 = r1.e(r2)
            java.lang.String r2 = "loopCount"
            i6.a r13 = r13.b(r2)
            int r13 = r13.c(r4)
            y6.d r2 = new y6.d
            java.lang.Object r3 = r14.get(r5)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            int r9 = r0.getWidth()
            int r10 = r0.getHeight()
            r6 = r2
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.f8538k = r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r14)
            r2.f8540m = r12
            if (r1 == 0) goto L_0x00b6
            boolean r12 = r1.isEmpty()
            if (r12 != 0) goto L_0x00b6
            j6.b r12 = r2.f8524b
            int r13 = r2.e
            int r14 = r2.f8527f
            android.graphics.drawable.BitmapDrawable r12 = r12.k(r1, r13, r14)
            r2.f8528g = r12
        L_0x00b6:
            java.util.Objects.requireNonNull(r15)
            s5.v r12 = new s5.v
            r12.<init>(r15, r4)
            r2.f8531j = r12
            java.util.ArrayList r12 = r15.f8194u
            int r13 = r12.size()
            if (r13 != 0) goto L_0x00cd
            r15.f8193t = r2
            r15.C()
        L_0x00cd:
            r12.add(r2)
            goto L_0x0167
        L_0x00d2:
            java.util.ArrayList r13 = r13.f4863b
            i5.g r0 = new i5.g
            r1 = 4
            r0.<init>(r15, r14, r12, r1)
            r13.forEach(r0)
            goto L_0x0167
        L_0x00df:
            boolean r8 = r14.I
            android.util.SizeF r14 = r14.E()
            android.util.Size r0 = new android.util.Size
            float r6 = r14.getWidth()
            int r6 = (int) r6
            float r14 = r14.getHeight()
            int r14 = (int) r14
            r0.<init>(r6, r14)
            java.lang.String r14 = "resource"
            i6.a r14 = r13.b(r14)
            java.lang.String r7 = r14.e(r2)
            java.lang.String r14 = "format"
            i6.a r14 = r13.b(r14)
            java.lang.String r6 = "IMAGE"
            java.lang.String r14 = r14.e(r6)
            i6.a r13 = r13.b(r1)
            java.lang.String r13 = r13.e(r2)
            int r9 = r0.getWidth()
            int r10 = r0.getHeight()
            int r14 = b6.a.D(r14)
            int r14 = s.g.b(r14)
            if (r14 == r4) goto L_0x0134
            if (r14 == r3) goto L_0x012e
            y6.d r14 = new y6.d
            r6 = r14
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0139
        L_0x012e:
            y6.e r14 = new y6.e
            r14.<init>(r7, r9, r10, r12)
            goto L_0x0139
        L_0x0134:
            y6.b r14 = new y6.b
            r14.<init>(r7, r9, r10, r12)
        L_0x0139:
            if (r13 == 0) goto L_0x014d
            boolean r12 = r13.isEmpty()
            if (r12 != 0) goto L_0x014d
            j6.b r12 = r14.f8524b
            int r0 = r14.e
            int r1 = r14.f8527f
            android.graphics.drawable.BitmapDrawable r12 = r12.k(r13, r0, r1)
            r14.f8528g = r12
        L_0x014d:
            java.util.Objects.requireNonNull(r15)
            s5.v r12 = new s5.v
            r12.<init>(r15, r5)
            r14.f8531j = r12
            java.util.ArrayList r12 = r15.f8194u
            int r13 = r12.size()
            if (r13 != 0) goto L_0x0164
            r15.f8193t = r14
            r15.C()
        L_0x0164:
            r12.add(r14)
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.w.a(r5.e, i6.e, v6.b, x6.g):void");
    }
}
