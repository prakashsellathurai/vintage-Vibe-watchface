package s5;

import c6.n;
import c6.o;
import com.samsung.android.wearable.watchfacestudio.editor.q;
import i6.e;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import o6.g;
import v5.b;
import w5.i;

public final class p {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0195 A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(v5.b r18, o6.g r19, i6.e r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "x"
            i6.a r2 = r1.b(r2)
            r3 = 0
            int r2 = r2.c(r3)
            java.lang.String r4 = "y"
            i6.a r4 = r1.b(r4)
            int r4 = r4.c(r3)
            java.lang.String r5 = "width"
            i6.a r5 = r1.b(r5)
            int r5 = r5.c(r3)
            java.lang.String r6 = "height"
            i6.a r6 = r1.b(r6)
            int r6 = r6.c(r3)
            java.lang.String r7 = "angle"
            i6.a r7 = r1.b(r7)
            r8 = 0
            float r7 = r7.b(r8)
            java.lang.String r9 = "pivotX"
            i6.a r9 = r1.b(r9)
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9.b(r10)
            java.lang.String r11 = "pivotY"
            i6.a r11 = r1.b(r11)
            float r10 = r11.b(r10)
            java.lang.String r11 = "scaleX"
            i6.a r11 = r1.b(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11.b(r12)
            java.lang.String r13 = "scaleY"
            i6.a r13 = r1.b(r13)
            float r12 = r13.b(r12)
            java.lang.String r13 = "alpha"
            i6.a r13 = r1.b(r13)
            r14 = 255(0xff, float:3.57E-43)
            int r13 = r13.c(r14)
            java.lang.String r14 = "name"
            i6.a r14 = r1.b(r14)
            java.lang.String r14 = r14.d()
            java.lang.String r15 = "renderMode"
            i6.a r15 = r1.b(r15)
            java.lang.String r3 = "SOURCE"
            java.lang.String r15 = r15.e(r3)
            java.lang.String r8 = "tintColor"
            i6.a r1 = r1.b(r8)
            java.lang.String r8 = "#FFFFFF"
            java.lang.String r1 = r1.e(r8)
            o6.h$a r8 = o6.h.a.ALPHA
            r20 = r1
            w5.f r1 = new w5.f
            float r13 = (float) r13
            r16 = r3
            r3 = 1132396544(0x437f0000, float:255.0)
            r17 = r15
            r15 = 0
            float r3 = a1.a.k(r13, r15, r3)
            r1.<init>((float) r3)
            o6.h r3 = r0.f6141o
            r3.d(r8, r1)
            o6.h$a r1 = o6.h.a.ANGLE
            w5.f r8 = new w5.f
            r8.<init>((float) r7)
            r3.d(r1, r8)
            float r1 = (float) r2
            float r2 = (float) r4
            float r4 = (float) r5
            float r5 = (float) r6
            r0.N(r1, r2, r4, r5)
            o6.h$a r1 = o6.h.a.WIDTH
            w5.f r1 = r3.b(r1)
            float r1 = r1.d()
            float r1 = r1 * r9
            o6.h$a r2 = o6.h.a.HEIGHT
            w5.f r2 = r3.b(r2)
            float r2 = r2.d()
            float r2 = r2 * r10
            o6.h$a r4 = o6.h.a.PIVOT_X
            w5.f r5 = new w5.f
            r5.<init>((float) r1)
            r3.d(r4, r5)
            o6.h$a r1 = o6.h.a.PIVOT_Y
            w5.f r4 = new w5.f
            r4.<init>((float) r2)
            r3.d(r1, r4)
            r0.O(r11, r12)
            r0.f6174b = r14
            java.lang.Class<o6.g$a> r1 = o6.g.a.class
            java.util.EnumSet r2 = java.util.EnumSet.noneOf(r1)
            int r3 = r17.hashCode()
            r4 = -1843176421(0xffffffff92235c1b, float:-5.154726E-28)
            r5 = 1
            r6 = -1
            if (r3 == r4) goto L_0x0120
            r4 = 64897(0xfd81, float:9.094E-41)
            if (r3 == r4) goto L_0x0114
            r4 = 2359020(0x23feec, float:3.305691E-39)
            if (r3 == r4) goto L_0x0108
            goto L_0x012c
        L_0x0108:
            java.lang.String r3 = "MASK"
            r4 = r17
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x012c
            r3 = 0
            goto L_0x012d
        L_0x0114:
            r4 = r17
            java.lang.String r3 = "ALL"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x012c
            r3 = r5
            goto L_0x012d
        L_0x0120:
            r3 = r16
            r4 = r17
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x012c
            r3 = 2
            goto L_0x012d
        L_0x012c:
            r3 = r6
        L_0x012d:
            o6.g$a r4 = o6.g.a.f6151g
            if (r3 == 0) goto L_0x013e
            if (r3 == r5) goto L_0x0139
            o6.g$a r1 = o6.g.a.f6150f
            r2.add(r1)
            goto L_0x0141
        L_0x0139:
            java.util.EnumSet r2 = java.util.EnumSet.allOf(r1)
            goto L_0x0141
        L_0x013e:
            r2.add(r4)
        L_0x0141:
            r0.y = r2
            boolean r1 = r2.contains(r4)
            java.lang.String r2 = "DWF:DrawableNodeFactory"
            if (r1 == 0) goto L_0x018f
            o6.q r1 = r0.f6175c
        L_0x014d:
            if (r1 == 0) goto L_0x0156
            boolean r3 = r1 instanceof o6.i
            if (r3 != 0) goto L_0x0156
            o6.q r1 = r1.f6175c
            goto L_0x014d
        L_0x0156:
            if (r1 == 0) goto L_0x0179
            o6.i r1 = (o6.i) r1
            o6.p r3 = r1.G
            if (r3 != 0) goto L_0x0167
            o6.p r3 = new o6.p
            r3.<init>()
            r1.G = r3
            r1.f6148x = r5
        L_0x0167:
            o6.p r1 = r1.G
            java.util.ArrayList<o6.g> r3 = r1.f6173d
            r3.add(r0)
            b0.c r3 = new b0.c
            r4 = 15
            r3.<init>(r1, r4, r0)
            r0.k(r3)
            goto L_0x018f
        L_0x0179:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r0.f6174b
            r1.append(r3)
            java.lang.String r3 = " can not find parent group to register mask"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r2, r1)
        L_0x018f:
            int r1 = android.graphics.Color.parseColor(r20)     // Catch:{ Exception -> 0x0199 }
            if (r1 == r6) goto L_0x01b8
            r0.M(r1)     // Catch:{ Exception -> 0x0199 }
            goto L_0x01b8
        L_0x0199:
            r5.f r1 = new r5.f
            r1.<init>(r5, r0)
            r3 = r18
            r4 = r20
            android.graphics.Color r1 = n6.b.a(r4, r3, r1, r0)
            if (r1 != 0) goto L_0x01b1
            r0.M(r6)
            java.lang.String r0 = "Cannot parse theme color. Using theme color WHITE"
            android.util.Log.e(r2, r0)
            goto L_0x01b8
        L_0x01b1:
            int r1 = r1.toArgb()
            r0.M(r1)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.p.a(v5.b, o6.g, i6.e):void");
    }

    public static void b(b bVar, g gVar, e eVar) {
        n nVar;
        Iterator it = eVar.f4863b.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2.f4862a.equals("Localization")) {
                String e = eVar2.b("timeZone").e((String) null);
                if ("SYNC_TO_DEVICE".equals(e)) {
                    e = null;
                }
                String str = "locale";
                if (!eVar2.c(str)) {
                    str = "locales";
                }
                List<String> g9 = n6.g.g(eVar2.b(str).e((String) null));
                String e4 = eVar2.b("calendar").e((String) null);
                boolean z8 = true;
                if (!n6.g.d(e)) {
                    if (!(g9 != null && g9.stream().anyMatch(new q(12))) && !n6.g.d(e4)) {
                        z8 = false;
                    }
                }
                if (z8) {
                    gVar.C = new i(System.identityHashCode(gVar), e, g9, e4);
                    if (bVar != null && (nVar = bVar.f7952a.f4063o) != null && n6.g.d(e)) {
                        ZoneId of = ZoneId.of(e);
                        nVar.f2774k.put(new o(nVar.f2716a, ZonedDateTime.now(of)), of);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0010 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(r5.e r18, i6.e r19, w5.i r20, e7.k r21, java.util.function.Function<java.lang.String, e7.i.a> r22) {
        /*
            r0 = r18
            r1 = r21
            java.lang.String r2 = "Variant"
            r3 = r19
            java.util.ArrayList r2 = i6.g.b(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0010:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d3
            java.lang.Object r3 = r2.next()
            i6.e r3 = (i6.e) r3
            java.lang.String r4 = "mode"
            i6.a r4 = r3.b(r4)
            java.lang.String r5 = "AMBIENT"
            java.lang.String r4 = r4.e(r5)
            int r6 = r4.hashCode()
            r7 = 2
            r8 = 1
            r9 = -2076224911(0xffffffff843f5271, float:-2.2489797E-36)
            r10 = 0
            if (r6 == r9) goto L_0x0051
            r9 = -1653763102(0xffffffff9d6d93e2, float:-3.1443142E-21)
            if (r6 == r9) goto L_0x0047
            r9 = -174162312(0xfffffffff59e7e78, float:-4.0183008E32)
            if (r6 == r9) goto L_0x003f
            goto L_0x005b
        L_0x003f:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x005b
            r4 = r10
            goto L_0x005c
        L_0x0047:
            java.lang.String r5 = "LOW_BATTERY"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x005b
            r4 = r7
            goto L_0x005c
        L_0x0051:
            java.lang.String r5 = "CHARGING"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x005b
            r4 = r8
            goto L_0x005c
        L_0x005b:
            r4 = -1
        L_0x005c:
            if (r4 == 0) goto L_0x005f
            goto L_0x0010
        L_0x005f:
            r0.a(r1)
            r0.c(r1)
            java.lang.String r4 = "target"
            i6.a r4 = r3.b(r4)
            java.lang.String r5 = "alpha"
            java.lang.String r4 = r4.e(r5)
            java.util.function.Function[] r5 = new java.util.function.Function[r8]
            r5[r10] = r22
            e7.i$a r5 = s5.u.e(r4, r5)
            java.lang.String r6 = "value"
            i6.a r3 = r3.b(r6)
            java.lang.String r6 = "0"
            java.lang.String r3 = r3.e(r6)
            v5.b r6 = r0.f7077h
            z5.b r9 = new z5.b
            r10 = r20
            r9.<init>(r3, r6, r10)
            e7.b r3 = new e7.b
            r3.<init>(r5, r9)
            int r5 = r5.e.f7070o
            if (r5 <= 0) goto L_0x00c1
            r6 = 3
            int r9 = r0.f7072b
            if (r9 == r6) goto L_0x00c1
            p6.c r6 = new p6.c
            p6.g r12 = r0.f7073c
            float r5 = (float) r5
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r13 = r5 / r9
            android.view.animation.LinearInterpolator r14 = new android.view.animation.LinearInterpolator
            r14.<init>()
            r15 = 0
            java.lang.String r5 = "angle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b6
            r16 = r7
            goto L_0x00b8
        L_0x00b6:
            r16 = r8
        L_0x00b8:
            r17 = 15
            r11 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3.m(r6)
        L_0x00c1:
            java.util.ArrayList r4 = r1.f4292c
            r4.add(r3)
            e7.k$a r4 = r1.f4295g
            r3.f4279g = r4
            r3.f4276c = r1
            v5.b r4 = r0.f7077h
            r3.l(r4)
            goto L_0x0010
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.p.c(r5.e, i6.e, w5.i, e7.k, java.util.function.Function):void");
    }

    public static void d(g gVar, e eVar) {
        int i8 = 255;
        int c9 = eVar.b("alpha").c(255);
        Iterator<e> it = i6.g.b(eVar, "Variant").iterator();
        while (true) {
            if (!it.hasNext()) {
                i8 = c9;
                break;
            }
            e next = it.next();
            String e = next.b("mode").e("");
            String e4 = next.b("target").e("");
            String e9 = next.b("value").e("");
            if ("AMBIENT".equals(e) && "alpha".equals(e4)) {
                if (!e9.matches("-?\\d+(\\.\\d+)?")) {
                    break;
                }
                c9 = Integer.parseInt(e9);
            }
        }
        boolean z8 = true;
        boolean z9 = i8 != 0;
        g gVar2 = gVar.f6145t;
        if (gVar2 == null) {
            z8 = z9;
        } else if (!gVar2.B || !z9) {
            z8 = false;
        }
        gVar.B = z8;
    }
}
