package s5;

import android.graphics.Color;
import android.graphics.RectF;
import android.util.Log;
import e7.i;
import e7.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import n6.g;
import r5.e;
import r6.a;

public final class y {
    @SafeVarargs
    public static void a(e eVar, a aVar, i6.e eVar2, k kVar, Function<String, i.a>... functionArr) {
        Iterator it = eVar2.f4863b.iterator();
        while (it.hasNext()) {
            i6.e eVar3 = (i6.e) it.next();
            if ("Transform".equals(eVar3.f4862a)) {
                u.d(eVar, eVar3, aVar.C, kVar, functionArr);
            }
        }
    }

    public static RectF b(i6.e eVar) {
        float b9 = eVar.b("x").b(0.0f);
        float b10 = eVar.b("y").b(0.0f);
        return new RectF(b9, b10, eVar.b("width").b(0.0f) + b9, eVar.b("height").b(0.0f) + b10);
    }

    public static s6.a c(e eVar, a aVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        s6.a aVar2 = null;
        while (it.hasNext()) {
            try {
                aVar2 = f(eVar, aVar, aVar2, (i6.e) it.next());
            } catch (IllegalArgumentException e) {
                Log.w("DWF:PartDrawFactory", e.getMessage());
            }
        }
        return aVar2;
    }

    public static float[] d(String str) {
        String[] f9 = g.f(str);
        float[] fArr = new float[f9.length];
        int i8 = 0;
        while (i8 < f9.length) {
            try {
                fArr[i8] = Float.parseFloat(f9[i8]);
                i8++;
            } catch (NumberFormatException e) {
                Log.e("DWF:PartDrawFactory", "Wrong parameter for float array " + str + " error :" + e.getMessage());
            }
        }
        return fArr;
    }

    public static int[] e(String str) {
        String[] f9 = g.f(str);
        int[] iArr = new int[f9.length];
        int i8 = 0;
        while (i8 < f9.length) {
            try {
                iArr[i8] = Color.parseColor(f9[i8]);
                i8++;
            } catch (NumberFormatException e) {
                Log.e("DWF:PartDrawFactory", "Wrong parameter for colors " + str + " error :" + e.getMessage());
            }
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s6.a f(r5.e r18, r6.a r19, s6.a r20, i6.e r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            java.lang.String r3 = r2.f4862a
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1918582379(0xffffffff8da4c195, float:-1.01538835E-30)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == r5) goto L_0x0038
            r5 = -295301604(0xffffffffee660e1c, float:-1.7799652E28)
            if (r4 == r5) goto L_0x002d
            r5 = -238615921(0xfffffffff1c7028f, float:-1.9708995E30)
            if (r4 == r5) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            java.lang.String r4 = "RadialGradient"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            r3 = r6
            goto L_0x0043
        L_0x002d:
            java.lang.String r4 = "SweepGradient"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r3 = r7
            goto L_0x0043
        L_0x0038:
            java.lang.String r4 = "LinearGradient"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0042
        L_0x0040:
            r3 = -1
            goto L_0x0043
        L_0x0042:
            r3 = r8
        L_0x0043:
            java.lang.String r4 = "positions"
            java.lang.String r5 = "colors"
            java.lang.String r9 = ""
            r10 = 0
            if (r3 == 0) goto L_0x0112
            java.lang.String r11 = "centerY"
            java.lang.String r12 = "centerX"
            if (r3 == r7) goto L_0x00a7
            if (r3 == r6) goto L_0x0058
            r5 = r20
            goto L_0x0168
        L_0x0058:
            i6.a r3 = r2.b(r12)
            float r3 = r3.b(r10)
            i6.a r6 = r2.b(r11)
            float r6 = r6.b(r10)
            android.graphics.PointF r11 = new android.graphics.PointF
            r11.<init>(r3, r6)
            java.lang.String r3 = "radius"
            i6.a r3 = r2.b(r3)
            float r3 = r3.b(r10)
            i6.a r5 = r2.b(r5)
            java.lang.String r5 = r5.e(r9)
            i6.a r4 = r2.b(r4)
            java.lang.String r4 = r4.e(r9)
            s6.e r6 = new s6.e
            int[] r5 = e(r5)
            float[] r4 = d(r4)
            r6.<init>(r11, r3, r5, r4)
            java.util.function.Function[] r3 = new java.util.function.Function[r7]
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5 = 23
            r4.<init>(r5)
            r3[r8] = r4
            e7.k r4 = r6.f7259g
            a(r0, r1, r2, r4, r3)
            r5 = r6
            goto L_0x0168
        L_0x00a7:
            i6.a r3 = r2.b(r12)
            float r3 = r3.b(r10)
            i6.a r6 = r2.b(r11)
            float r6 = r6.b(r10)
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r3, r6)
            java.lang.String r3 = "startAngle"
            i6.a r3 = r2.b(r3)
            float r13 = r3.b(r10)
            java.lang.String r3 = "endAngle"
            i6.a r3 = r2.b(r3)
            r6 = 1135869952(0x43b40000, float:360.0)
            float r14 = r3.b(r6)
            i6.a r3 = r2.b(r5)
            java.lang.String r3 = r3.e(r9)
            i6.a r4 = r2.b(r4)
            java.lang.String r4 = r4.e(r9)
            java.lang.String r5 = "direction"
            i6.a r5 = r2.b(r5)
            java.lang.String r6 = "CLOCKWISE"
            java.lang.String r5 = r5.e(r6)
            s6.g r9 = new s6.g
            boolean r15 = r6.equals(r5)
            int[] r16 = e(r3)
            float[] r17 = d(r4)
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.util.function.Function[] r3 = new java.util.function.Function[r7]
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5 = 24
            r4.<init>(r5)
            r3[r8] = r4
            e7.k r4 = r9.f7259g
            a(r0, r1, r2, r4, r3)
            r5 = r9
            goto L_0x0168
        L_0x0112:
            java.lang.String r3 = "startX"
            i6.a r3 = r2.b(r3)
            float r12 = r3.b(r10)
            java.lang.String r3 = "startY"
            i6.a r3 = r2.b(r3)
            float r13 = r3.b(r10)
            java.lang.String r3 = "endX"
            i6.a r3 = r2.b(r3)
            float r14 = r3.b(r10)
            java.lang.String r3 = "endY"
            i6.a r3 = r2.b(r3)
            float r15 = r3.b(r10)
            i6.a r3 = r2.b(r5)
            java.lang.String r3 = r3.e(r9)
            i6.a r4 = r2.b(r4)
            java.lang.String r4 = r4.e(r9)
            s6.c r5 = new s6.c
            int[] r16 = e(r3)
            float[] r17 = d(r4)
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.util.function.Function[] r3 = new java.util.function.Function[r7]
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 22
            r4.<init>(r6)
            r3[r8] = r4
            e7.k r4 = r5.f7259g
            a(r0, r1, r2, r4, r3)
        L_0x0168:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.y.f(r5.e, r6.a, s6.a, i6.e):s6.a");
    }
}
