package i2;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import j2.b;
import java.lang.ref.WeakReference;
import p.g;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f4817a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static g<WeakReference<Interpolator>> f4818b;

    /* renamed from: c  reason: collision with root package name */
    public static final b.a f4819c = b.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    public static final b.a f4820d = b.a.a("x", "y");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.animation.Interpolator a(android.graphics.PointF r7, android.graphics.PointF r8) {
        /*
            float r0 = r7.x
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = k2.f.b(r0, r1, r2)
            r7.x = r0
            float r0 = r7.y
            r3 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r0 = k2.f.b(r0, r3, r4)
            r7.y = r0
            float r0 = r8.x
            float r0 = k2.f.b(r0, r1, r2)
            r8.x = r0
            float r0 = r8.y
            float r0 = k2.f.b(r0, r3, r4)
            r8.y = r0
            float r1 = r7.x
            float r3 = r7.y
            float r4 = r8.x
            java.lang.ThreadLocal<android.graphics.PathMeasure> r5 = k2.g.f5118a
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x003b
            r6 = 527(0x20f, float:7.38E-43)
            float r6 = (float) r6
            float r6 = r6 * r1
            int r1 = (int) r6
            goto L_0x003d
        L_0x003b:
            r1 = 17
        L_0x003d:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x0046
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
        L_0x0046:
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004f
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = (int) r1
        L_0x004f:
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0058
            int r1 = r1 * 31
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = (int) r1
        L_0x0058:
            java.lang.Class<i2.n> r0 = i2.n.class
            monitor-enter(r0)
            p.g<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r3 = f4818b     // Catch:{ all -> 0x00c5 }
            if (r3 != 0) goto L_0x0066
            p.g r3 = new p.g     // Catch:{ all -> 0x00c5 }
            r3.<init>()     // Catch:{ all -> 0x00c5 }
            f4818b = r3     // Catch:{ all -> 0x00c5 }
        L_0x0066:
            p.g<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r3 = f4818b     // Catch:{ all -> 0x00c5 }
            r4 = 0
            java.lang.Object r3 = r3.c(r1, r4)     // Catch:{ all -> 0x00c5 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x00c5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r0 = r3.get()
            r4 = r0
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
        L_0x0079:
            if (r3 == 0) goto L_0x007d
            if (r4 != 0) goto L_0x00c4
        L_0x007d:
            float r0 = r7.x     // Catch:{ IllegalArgumentException -> 0x008a }
            float r3 = r7.y     // Catch:{ IllegalArgumentException -> 0x008a }
            float r4 = r8.x     // Catch:{ IllegalArgumentException -> 0x008a }
            float r6 = r8.y     // Catch:{ IllegalArgumentException -> 0x008a }
            android.view.animation.PathInterpolator r7 = l0.a.b(r0, r3, r4, r6)     // Catch:{ IllegalArgumentException -> 0x008a }
            goto L_0x00b1
        L_0x008a:
            r0 = move-exception
            java.lang.String r3 = "The Path cannot loop back on itself."
            java.lang.String r0 = r0.getMessage()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ac
            float r0 = r7.x
            float r0 = java.lang.Math.min(r0, r2)
            float r7 = r7.y
            float r2 = r8.x
            float r2 = java.lang.Math.max(r2, r5)
            float r8 = r8.y
            android.view.animation.PathInterpolator r7 = l0.a.b(r0, r7, r2, r8)
            goto L_0x00b1
        L_0x00ac:
            android.view.animation.LinearInterpolator r7 = new android.view.animation.LinearInterpolator
            r7.<init>()
        L_0x00b1:
            r4 = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c4 }
            r7.<init>(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c4 }
            java.lang.Class<i2.n> r8 = i2.n.class
            monitor-enter(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c4 }
            p.g<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f4818b     // Catch:{ all -> 0x00c1 }
            r0.d(r1, r7)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c4
        L_0x00c1:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c1 }
            throw r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00c4 }
        L_0x00c4:
            return r4
        L_0x00c5:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.n.a(android.graphics.PointF, android.graphics.PointF):android.view.animation.Interpolator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c4, code lost:
        r10 = r8;
        r3 = r19;
        r15 = r20;
        r8 = r21;
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cf, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d1, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d3, code lost:
        r3 = r19;
        r8 = r21;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> l2.a<T> b(j2.b r23, y1.f r24, float r25, i2.e0<T> r26, boolean r27, boolean r28) {
        /*
            r0 = r23
            r1 = r25
            r2 = r26
            android.view.animation.LinearInterpolator r3 = f4817a
            j2.b$a r8 = f4819c
            if (r27 == 0) goto L_0x0233
            if (r28 == 0) goto L_0x0233
            r23.c()
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x001f:
            boolean r19 = r23.j()
            if (r19 == 0) goto L_0x01d9
            int r19 = r0.v(r8)
            j2.b$a r4 = f4820d
            switch(r19) {
                case 0: goto L_0x01b4;
                case 1: goto L_0x01a5;
                case 2: goto L_0x0195;
                case 3: goto L_0x0108;
                case 4: goto L_0x0068;
                case 5: goto L_0x0054;
                case 6: goto L_0x0047;
                case 7: goto L_0x003c;
                default: goto L_0x002e;
            }
        L_0x002e:
            r19 = r3
            r21 = r8
            r22 = r9
            r8 = r10
            r20 = r15
            r23.x()
            goto L_0x01cf
        L_0x003c:
            android.graphics.PointF r4 = i2.m.b(r0, r1)
            r19 = r3
            r9 = r4
            r21 = r8
            goto L_0x01d3
        L_0x0047:
            android.graphics.PointF r4 = i2.m.b(r0, r1)
            r19 = r3
            r15 = r4
            r21 = r8
            r22 = r9
            goto L_0x01d1
        L_0x0054:
            int r4 = r23.q()
            r11 = 1
            r19 = r3
            r21 = r8
            r22 = r9
            r20 = r15
            if (r4 != r11) goto L_0x0065
            goto L_0x01cf
        L_0x0065:
            r11 = 0
            goto L_0x01cf
        L_0x0068:
            r19 = r3
            int r3 = r23.t()
            r20 = r15
            r15 = 3
            if (r3 != r15) goto L_0x00fd
            r23.c()
            r3 = 0
            r6 = 0
            r7 = 0
            r15 = 0
        L_0x007a:
            boolean r21 = r23.j()
            if (r21 == 0) goto L_0x00e7
            r21 = r8
            int r8 = r0.v(r4)
            r22 = r9
            if (r8 == 0) goto L_0x00ba
            r9 = 1
            if (r8 == r9) goto L_0x0091
            r23.x()
            goto L_0x009e
        L_0x0091:
            int r6 = r23.t()
            r8 = 7
            if (r6 != r8) goto L_0x00a0
            double r8 = r23.o()
            float r6 = (float) r8
            r15 = r6
        L_0x009e:
            r8 = r10
            goto L_0x00e1
        L_0x00a0:
            r23.a()
            double r8 = r23.o()
            float r6 = (float) r8
            int r8 = r23.t()
            r9 = 7
            if (r8 != r9) goto L_0x00b6
            r8 = r10
            double r9 = r23.o()
            float r9 = (float) r9
            goto L_0x00b8
        L_0x00b6:
            r8 = r10
            r9 = r6
        L_0x00b8:
            r15 = r9
            goto L_0x00de
        L_0x00ba:
            r8 = r10
            int r3 = r23.t()
            r7 = 7
            if (r3 != r7) goto L_0x00c9
            double r9 = r23.o()
            float r3 = (float) r9
            r7 = r3
            goto L_0x00e1
        L_0x00c9:
            r23.a()
            double r9 = r23.o()
            float r3 = (float) r9
            int r9 = r23.t()
            if (r9 != r7) goto L_0x00dd
            double r9 = r23.o()
            float r7 = (float) r9
            goto L_0x00de
        L_0x00dd:
            r7 = r3
        L_0x00de:
            r23.d()
        L_0x00e1:
            r10 = r8
            r8 = r21
            r9 = r22
            goto L_0x007a
        L_0x00e7:
            r21 = r8
            r22 = r9
            r8 = r10
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r6)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r7, r15)
            r23.g()
            r7 = r3
            r6 = r4
            goto L_0x01cf
        L_0x00fd:
            r21 = r8
            r22 = r9
            android.graphics.PointF r3 = i2.m.b(r0, r1)
            r10 = r3
            goto L_0x01cf
        L_0x0108:
            r19 = r3
            r21 = r8
            r22 = r9
            r8 = r10
            r20 = r15
            int r3 = r23.t()
            r9 = 3
            if (r3 != r9) goto L_0x018f
            r23.c()
            r3 = 0
            r5 = 0
            r9 = 0
            r10 = 0
        L_0x011f:
            boolean r14 = r23.j()
            if (r14 == 0) goto L_0x017f
            int r14 = r0.v(r4)
            if (r14 == 0) goto L_0x0157
            r15 = 1
            if (r14 == r15) goto L_0x0132
            r23.x()
            goto L_0x011f
        L_0x0132:
            int r5 = r23.t()
            r14 = 7
            if (r5 != r14) goto L_0x0140
            double r14 = r23.o()
            float r10 = (float) r14
            r5 = r10
            goto L_0x011f
        L_0x0140:
            r23.a()
            double r14 = r23.o()
            float r5 = (float) r14
            int r10 = r23.t()
            r14 = 7
            if (r10 != r14) goto L_0x0155
            double r14 = r23.o()
            float r10 = (float) r14
            goto L_0x017b
        L_0x0155:
            r10 = r5
            goto L_0x017b
        L_0x0157:
            int r3 = r23.t()
            r14 = 7
            if (r3 != r14) goto L_0x0165
            double r14 = r23.o()
            float r9 = (float) r14
            r3 = r9
            goto L_0x011f
        L_0x0165:
            r23.a()
            double r14 = r23.o()
            float r3 = (float) r14
            int r9 = r23.t()
            r14 = 7
            if (r9 != r14) goto L_0x017a
            double r14 = r23.o()
            float r9 = (float) r14
            goto L_0x017b
        L_0x017a:
            r9 = r3
        L_0x017b:
            r23.d()
            goto L_0x011f
        L_0x017f:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r5)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r9, r10)
            r23.g()
            r14 = r3
            r5 = r4
            goto L_0x01c4
        L_0x018f:
            android.graphics.PointF r3 = i2.m.b(r0, r1)
            r13 = r3
            goto L_0x01c4
        L_0x0195:
            r19 = r3
            r21 = r8
            r22 = r9
            r8 = r10
            r20 = r15
            java.lang.Object r3 = r2.d(r0, r1)
            r17 = r3
            goto L_0x01cf
        L_0x01a5:
            r19 = r3
            r21 = r8
            r22 = r9
            r8 = r10
            r20 = r15
            java.lang.Object r3 = r2.d(r0, r1)
            r12 = r3
            goto L_0x01cf
        L_0x01b4:
            r19 = r3
            r21 = r8
            r22 = r9
            r8 = r10
            r20 = r15
            double r3 = r23.o()
            float r3 = (float) r3
            r16 = r3
        L_0x01c4:
            r10 = r8
            r3 = r19
            r15 = r20
            r8 = r21
            r9 = r22
            goto L_0x001f
        L_0x01cf:
            r15 = r20
        L_0x01d1:
            r9 = r22
        L_0x01d3:
            r3 = r19
            r8 = r21
            goto L_0x001f
        L_0x01d9:
            r19 = r3
            r22 = r9
            r8 = r10
            r20 = r15
            r23.g()
            if (r11 == 0) goto L_0x01e8
            r17 = r12
            goto L_0x0207
        L_0x01e8:
            if (r13 == 0) goto L_0x01f1
            if (r8 == 0) goto L_0x01f1
            android.view.animation.Interpolator r3 = a(r13, r8)
            goto L_0x0209
        L_0x01f1:
            if (r5 == 0) goto L_0x0207
            if (r14 == 0) goto L_0x0207
            if (r6 == 0) goto L_0x0207
            if (r7 == 0) goto L_0x0207
            android.view.animation.Interpolator r0 = a(r5, r6)
            android.view.animation.Interpolator r1 = a(r14, r7)
            r14 = r0
            r15 = r1
            r13 = r17
            r3 = 0
            goto L_0x020d
        L_0x0207:
            r3 = r19
        L_0x0209:
            r13 = r17
            r14 = 0
            r15 = 0
        L_0x020d:
            if (r14 == 0) goto L_0x021c
            if (r15 == 0) goto L_0x021c
            l2.a r0 = new l2.a
            r10 = r0
            r11 = r24
            r7 = r20
            r10.<init>((y1.f) r11, (java.lang.Object) r12, (java.lang.Object) r13, (android.view.animation.Interpolator) r14, (android.view.animation.Interpolator) r15, (float) r16)
            goto L_0x022c
        L_0x021c:
            r7 = r20
            l2.a r0 = new l2.a
            r1 = 0
            r10 = r0
            r11 = r24
            r14 = r3
            r15 = r16
            r16 = r1
            r10.<init>((y1.f) r11, r12, r13, (android.view.animation.Interpolator) r14, (float) r15, (java.lang.Float) r16)
        L_0x022c:
            r0.f5281o = r7
            r7 = r22
            r0.f5282p = r7
            return r0
        L_0x0233:
            r19 = r3
            r21 = r8
            if (r27 == 0) goto L_0x02be
            r23.c()
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r18 = 0
        L_0x0245:
            boolean r6 = r23.j()
            if (r6 == 0) goto L_0x0298
            r6 = r21
            int r8 = r0.v(r6)
            r9 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 0: goto L_0x028e;
                case 1: goto L_0x0287;
                case 2: goto L_0x027f;
                case 3: goto L_0x0279;
                case 4: goto L_0x0273;
                case 5: goto L_0x0266;
                case 6: goto L_0x0260;
                case 7: goto L_0x025b;
                default: goto L_0x0256;
            }
        L_0x0256:
            r12 = 1
            r23.x()
            goto L_0x0295
        L_0x025b:
            android.graphics.PointF r5 = i2.m.b(r0, r1)
            goto L_0x0264
        L_0x0260:
            android.graphics.PointF r4 = i2.m.b(r0, r1)
        L_0x0264:
            r12 = 1
            goto L_0x0295
        L_0x0266:
            int r8 = r23.q()
            r12 = 1
            r21 = r6
            if (r8 != r12) goto L_0x0271
            r11 = r12
            goto L_0x0245
        L_0x0271:
            r11 = 0
            goto L_0x0245
        L_0x0273:
            r12 = 1
            android.graphics.PointF r3 = i2.m.b(r0, r9)
            goto L_0x0295
        L_0x0279:
            r12 = 1
            android.graphics.PointF r7 = i2.m.b(r0, r9)
            goto L_0x0295
        L_0x027f:
            r12 = 1
            java.lang.Object r8 = r2.d(r0, r1)
            r18 = r8
            goto L_0x0295
        L_0x0287:
            r12 = 1
            java.lang.Object r8 = r2.d(r0, r1)
            r10 = r8
            goto L_0x0295
        L_0x028e:
            r12 = 1
            double r8 = r23.o()
            float r8 = (float) r8
            r13 = r8
        L_0x0295:
            r21 = r6
            goto L_0x0245
        L_0x0298:
            r23.g()
            if (r11 == 0) goto L_0x02a1
            r11 = r10
            r12 = r19
            goto L_0x02b0
        L_0x02a1:
            if (r7 == 0) goto L_0x02ab
            if (r3 == 0) goto L_0x02ab
            android.view.animation.Interpolator r0 = a(r7, r3)
            r3 = r0
            goto L_0x02ad
        L_0x02ab:
            r3 = r19
        L_0x02ad:
            r12 = r3
            r11 = r18
        L_0x02b0:
            l2.a r0 = new l2.a
            r14 = 0
            r8 = r0
            r9 = r24
            r8.<init>((y1.f) r9, r10, r11, (android.view.animation.Interpolator) r12, (float) r13, (java.lang.Float) r14)
            r0.f5281o = r4
            r0.f5282p = r5
            return r0
        L_0x02be:
            java.lang.Object r0 = r2.d(r0, r1)
            l2.a r1 = new l2.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.n.b(j2.b, y1.f, float, i2.e0, boolean, boolean):l2.a");
    }
}
