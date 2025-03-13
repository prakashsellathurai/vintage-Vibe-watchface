package s5;

import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import com.samsung.android.wearable.watchfacestudio.editor.p;
import e7.h;
import e7.i;
import e7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import n1.c0;
import o6.g;
import o6.h;
import o6.q;
import o6.x;
import p6.c;
import r5.e;
import t5.a;
import w5.f;
import z5.b;

public final class u {

    public class a implements i.a {
        public final f e() {
            return new f();
        }

        public final String getKey() {
            return "";
        }
    }

    public static t5.a a(e eVar, g gVar, String str) {
        t5.a aVar = (t5.a) Arrays.stream(a.b.values()).filter(new r5.g(2, str)).findFirst().map(new c0(1, eVar)).orElseGet(new s(eVar, str));
        ArrayList arrayList = gVar.D;
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
        return aVar;
    }

    public static BaseInterpolator b(String str, String str2) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1247059178:
                if (str.equals("EASE_IN")) {
                    c9 = 0;
                    break;
                }
                break;
            case -69901932:
                if (str.equals("CUBIC_BEZIER")) {
                    c9 = 1;
                    break;
                }
                break;
            case -4122787:
                if (str.equals("EASE_OUT")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1554270853:
                if (str.equals("EASE_IN_OUT")) {
                    c9 = 3;
                    break;
                }
                break;
            case 2037529515:
                if (str.equals("OVERSHOOT")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return new AccelerateInterpolator();
            case 1:
                LinearInterpolator linearInterpolator2 = new LinearInterpolator();
                if (str2 == null || str2.isEmpty()) {
                    return linearInterpolator2;
                }
                Float[] fArr = (Float[]) Arrays.stream(n6.g.f(str2)).map(new p(12)).toArray(new t());
                return fArr.length == 4 ? new PathInterpolator(fArr[0].floatValue(), fArr[1].floatValue(), fArr[2].floatValue(), fArr[3].floatValue()) : linearInterpolator2;
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return new AccelerateDecelerateInterpolator();
            case 4:
                return new OvershootInterpolator();
            default:
                return linearInterpolator;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: q6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: q6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: c7.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: c7.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: c7.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v53, resolved type: c7.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: c7.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: q6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: q6.b} */
    /* JADX WARNING: type inference failed for: r6v30, types: [o6.i, o6.g, o6.q] */
    /* JADX WARNING: type inference failed for: r6v48, types: [o6.g, o6.q, q6.c] */
    /* JADX WARNING: type inference failed for: r6v49, types: [o6.g, o6.q, q6.a] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04f5, code lost:
        r2 = r3;
        r3 = r0;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04fd, code lost:
        r2 = r3;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0a5b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0a5c, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0a5d, code lost:
        f(r36, r37, r38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0a60, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0a62, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0a6a, code lost:
        if (r1.hasNext() == false) goto L_0x0a76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0a6c, code lost:
        c(r7, (i6.e) r1.next(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0337  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(r5.e r36, i6.e r37, o6.q r38) {
        /*
            r7 = r36
            r0 = r37
            r1 = r38
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r2 = r0.f4862a
            r2.getClass()
            int r3 = r2.hashCode()
            r12 = 3
            java.lang.String r11 = "Complication"
            r10 = 7
            switch(r3) {
                case -2054647085: goto L_0x012a;
                case -2012724806: goto L_0x011f;
                case -1878000861: goto L_0x0114;
                case -1788718435: goto L_0x0109;
                case -1679829819: goto L_0x00fe;
                case -1480081314: goto L_0x00f5;
                case -1085510111: goto L_0x00ea;
                case -907842523: goto L_0x00df;
                case -802904872: goto L_0x00d1;
                case -497848882: goto L_0x00c3;
                case -439972669: goto L_0x00b5;
                case -180880237: goto L_0x00a7;
                case 54247292: goto L_0x0099;
                case 69076575: goto L_0x008b;
                case 174388488: goto L_0x007d;
                case 198012600: goto L_0x006f;
                case 269377782: goto L_0x0061;
                case 1142656251: goto L_0x0053;
                case 1252407287: goto L_0x0045;
                case 1252872160: goto L_0x0037;
                case 1778827486: goto L_0x0029;
                case 1843423419: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0135
        L_0x001b:
            java.lang.String r3 = "Expressions"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0025
            goto L_0x0135
        L_0x0025:
            r2 = 21
            goto L_0x0136
        L_0x0029:
            java.lang.String r3 = "AnalogClock"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0033
            goto L_0x0135
        L_0x0033:
            r2 = 20
            goto L_0x0136
        L_0x0037:
            java.lang.String r3 = "PartText"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0041
            goto L_0x0135
        L_0x0041:
            r2 = 19
            goto L_0x0136
        L_0x0045:
            java.lang.String r3 = "PartDraw"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004f
            goto L_0x0135
        L_0x004f:
            r2 = 18
            goto L_0x0136
        L_0x0053:
            java.lang.String r3 = "Condition"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x005d
            goto L_0x0135
        L_0x005d:
            r2 = 17
            goto L_0x0136
        L_0x0061:
            java.lang.String r3 = "DigitalClock"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x006b
            goto L_0x0135
        L_0x006b:
            r2 = 16
            goto L_0x0136
        L_0x006f:
            java.lang.String r3 = "Expression"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0079
            goto L_0x0135
        L_0x0079:
            r2 = 15
            goto L_0x0136
        L_0x007d:
            java.lang.String r3 = "PartImage"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0087
            goto L_0x0135
        L_0x0087:
            r2 = 14
            goto L_0x0136
        L_0x008b:
            java.lang.String r3 = "Group"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0095
            goto L_0x0135
        L_0x0095:
            r2 = 13
            goto L_0x0136
        L_0x0099:
            java.lang.String r3 = "ComplicationSlot"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00a3
            goto L_0x0135
        L_0x00a3:
            r2 = 12
            goto L_0x0136
        L_0x00a7:
            java.lang.String r3 = "HourHand"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00b1
            goto L_0x0135
        L_0x00b1:
            r2 = 11
            goto L_0x0136
        L_0x00b5:
            java.lang.String r3 = "MinuteHand"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00bf
            goto L_0x0135
        L_0x00bf:
            r2 = 10
            goto L_0x0136
        L_0x00c3:
            java.lang.String r3 = "BooleanConfiguration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00cd
            goto L_0x0135
        L_0x00cd:
            r2 = 9
            goto L_0x0136
        L_0x00d1:
            java.lang.String r3 = "ListConfiguration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00db
            goto L_0x0135
        L_0x00db:
            r2 = 8
            goto L_0x0136
        L_0x00df:
            java.lang.String r3 = "PartAnimatedImage"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00e8
            goto L_0x0135
        L_0x00e8:
            r2 = r10
            goto L_0x0136
        L_0x00ea:
            java.lang.String r3 = "Default"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00f3
            goto L_0x0135
        L_0x00f3:
            r2 = 6
            goto L_0x0136
        L_0x00f5:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x00fc
            goto L_0x0135
        L_0x00fc:
            r2 = 5
            goto L_0x0136
        L_0x00fe:
            java.lang.String r3 = "Compare"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0107
            goto L_0x0135
        L_0x0107:
            r2 = 4
            goto L_0x0136
        L_0x0109:
            java.lang.String r3 = "BooleanOption"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0112
            goto L_0x0135
        L_0x0112:
            r2 = r12
            goto L_0x0136
        L_0x0114:
            java.lang.String r3 = "SecondHand"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x011d
            goto L_0x0135
        L_0x011d:
            r2 = 2
            goto L_0x0136
        L_0x011f:
            java.lang.String r3 = "TimeText"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0128
            goto L_0x0135
        L_0x0128:
            r2 = 1
            goto L_0x0136
        L_0x012a:
            java.lang.String r3 = "ListOption"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r2 = 0
            goto L_0x0136
        L_0x0135:
            r2 = -1
        L_0x0136:
            java.util.ArrayList r3 = r0.f4863b
            java.lang.String r5 = "TAP"
            java.lang.String r15 = "change"
            java.lang.String r9 = "Gyro"
            java.lang.String r13 = "Localization"
            r25 = 1135869952(0x43b40000, float:360.0)
            java.lang.String r14 = "angle"
            r8 = 0
            java.lang.String r6 = "id"
            java.lang.String r4 = ""
            switch(r2) {
                case 0: goto L_0x0a57;
                case 1: goto L_0x082a;
                case 2: goto L_0x0703;
                case 3: goto L_0x0a57;
                case 4: goto L_0x06fb;
                case 5: goto L_0x0a57;
                case 6: goto L_0x06fb;
                case 7: goto L_0x054e;
                case 8: goto L_0x04f9;
                case 9: goto L_0x04f9;
                case 10: goto L_0x04ec;
                case 11: goto L_0x04e2;
                case 12: goto L_0x0430;
                case 13: goto L_0x03a4;
                case 14: goto L_0x0265;
                case 15: goto L_0x06fb;
                case 16: goto L_0x020d;
                case 17: goto L_0x06fb;
                case 18: goto L_0x01dc;
                case 19: goto L_0x01a5;
                case 20: goto L_0x014e;
                case 21: goto L_0x06fb;
                default: goto L_0x014c;
            }
        L_0x014c:
            goto L_0x04fd
        L_0x014e:
            i6.g.i(r37)
            r2 = r0
        L_0x0152:
            if (r2 == 0) goto L_0x0166
            i6.a r4 = r2.b(r14)
            float r4 = r4.b(r8)
            float r4 = r4 % r25
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            i6.e r2 = r2.f4864c
            goto L_0x0152
        L_0x0166:
            i6.g.g(r37)
            java.util.ArrayList r2 = i6.g.b(r0, r13)
            r2.isEmpty()
            r2 = r0
        L_0x0171:
            if (r2 == 0) goto L_0x0181
            java.util.ArrayList r4 = i6.g.b(r2, r9)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            i6.e r2 = r2.f4864c
            goto L_0x0171
        L_0x0181:
            q6.a r6 = new q6.a
            r6.<init>(r1)
            r5.d r2 = r7.f7074d
            r6.f6179h = r2
            v5.b r2 = r7.f7077h
            s5.p.a(r2, r6, r0)
            v5.b r2 = r7.f7077h
            s5.p.b(r2, r6, r0)
            w5.i r2 = r6.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r4.<init>(r12)
            e7.k r5 = r6.f6135i
            s5.p.c(r7, r0, r2, r5, r4)
            s5.p.d(r6, r0)
            goto L_0x04f5
        L_0x01a5:
            b7.a r2 = new b7.a
            r2.<init>(r1)
            r5.d r1 = r7.f7074d
            r2.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r2, r0)
            v5.b r1 = r7.f7077h
            s5.p.b(r1, r2, r0)
            w5.i r1 = r2.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r4.<init>(r10)
            e7.k r5 = r2.f6135i
            s5.p.c(r7, r0, r1, r5, r4)
            java.util.Iterator r0 = r3.iterator()
        L_0x01c8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d8
            java.lang.Object r1 = r0.next()
            i6.e r1 = (i6.e) r1
            s5.g0.a(r7, r1, r2, r2)
            goto L_0x01c8
        L_0x01d8:
            r2.c()
            return
        L_0x01dc:
            r6.a r2 = new r6.a
            r2.<init>(r1)
            r5.d r1 = r7.f7074d
            r2.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r2, r0)
            v5.b r1 = r7.f7077h
            s5.p.b(r1, r2, r0)
            w5.i r1 = r2.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5 = 9
            r4.<init>(r5)
            e7.k r5 = r2.f6135i
            s5.p.c(r7, r0, r1, r5, r4)
            s5.p.d(r2, r0)
            com.samsung.android.wearable.watchfacestudio.editor.r r0 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r1 = 5
            r0.<init>(r7, r1, r2)
            r3.forEach(r0)
            r2.c()
            return
        L_0x020d:
            i6.g.i(r37)
            r2 = r0
        L_0x0211:
            if (r2 == 0) goto L_0x0225
            i6.a r4 = r2.b(r14)
            float r4 = r4.b(r8)
            float r4 = r4 % r25
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0222
            goto L_0x0225
        L_0x0222:
            i6.e r2 = r2.f4864c
            goto L_0x0211
        L_0x0225:
            i6.g.g(r37)
            java.util.ArrayList r2 = i6.g.b(r0, r13)
            r2.isEmpty()
            r2 = r0
        L_0x0230:
            if (r2 == 0) goto L_0x0240
            java.util.ArrayList r4 = i6.g.b(r2, r9)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x023d
            goto L_0x0240
        L_0x023d:
            i6.e r2 = r2.f4864c
            goto L_0x0230
        L_0x0240:
            q6.c r6 = new q6.c
            r6.<init>(r1)
            r5.d r2 = r7.f7074d
            r6.f6179h = r2
            v5.b r2 = r7.f7077h
            s5.p.a(r2, r6, r0)
            v5.b r2 = r7.f7077h
            s5.p.b(r2, r6, r0)
            w5.i r2 = r6.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5 = 5
            r4.<init>(r5)
            e7.k r5 = r6.f6135i
            s5.p.c(r7, r0, r2, r5, r4)
            s5.p.d(r6, r0)
            goto L_0x04f5
        L_0x0265:
            v6.b r2 = new v6.b
            boolean r4 = i6.g.h(r37)
            r2.<init>(r1, r4)
            r5.d r1 = r7.f7074d
            r2.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r2, r0)
            v5.b r1 = r7.f7077h
            s5.p.b(r1, r2, r0)
            w5.i r1 = r2.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 10
            r4.<init>(r6)
            e7.k r6 = r2.f6135i
            s5.p.c(r7, r0, r1, r6, r4)
            s5.p.d(r2, r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x0291:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x039a
            java.lang.Object r1 = r0.next()
            i6.e r1 = (i6.e) r1
            java.lang.String r4 = r1.f4862a
            r4.getClass()
            int r6 = r4.hashCode()
            r9 = -2101383528(0xffffffff82bf6e98, float:-2.8128405E-37)
            java.lang.String r11 = "Image"
            if (r6 == r9) goto L_0x02cc
            r9 = -91964864(0xfffffffffa84ba40, float:-3.445804E35)
            if (r6 == r9) goto L_0x02c1
            r9 = 70760763(0x437b93b, float:2.15966E-36)
            if (r6 == r9) goto L_0x02b8
            goto L_0x02d4
        L_0x02b8:
            boolean r4 = r4.equals(r11)
            if (r4 != 0) goto L_0x02bf
            goto L_0x02d4
        L_0x02bf:
            r4 = 2
            goto L_0x02d7
        L_0x02c1:
            java.lang.String r6 = "ImageFilters"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x02ca
            goto L_0x02d4
        L_0x02ca:
            r4 = 1
            goto L_0x02d7
        L_0x02cc:
            java.lang.String r6 = "Images"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x02d6
        L_0x02d4:
            r4 = -1
            goto L_0x02d7
        L_0x02d6:
            r4 = 0
        L_0x02d7:
            if (r4 == 0) goto L_0x0337
            r6 = 1
            if (r4 == r6) goto L_0x02ed
            r6 = 2
            if (r4 == r6) goto L_0x02e0
            goto L_0x0291
        L_0x02e0:
            x6.h r4 = new x6.h
            r4.<init>(r2)
            r4.f6180i = r2
            s5.d0.a(r7, r1, r4)
            r2.H = r4
            goto L_0x0291
        L_0x02ed:
            java.util.ArrayList r1 = r1.f4863b
            java.util.Iterator r1 = r1.iterator()
        L_0x02f3:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0291
            java.lang.Object r4 = r1.next()
            i6.e r4 = (i6.e) r4
            java.lang.String r6 = r4.f4862a
            java.lang.String r9 = "HsbFilter"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x02f3
            java.lang.String r6 = "hueRotate"
            i6.a r6 = r4.b(r6)
            float r6 = r6.b(r8)
            java.lang.String r9 = "saturate"
            i6.a r9 = r4.b(r9)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9.b(r11)
            java.lang.String r12 = "brightness"
            i6.a r4 = r4.b(r12)
            float r4 = r4.b(r11)
            w6.a r11 = new w6.a
            r11.<init>(r6, r9, r4)
            java.util.ArrayList r4 = r2.J
            r4.add(r11)
            r2.K()
            goto L_0x02f3
        L_0x0337:
            x6.h r4 = new x6.h
            r4.<init>(r2)
            r4.f6180i = r2
            r2.H = r4
            i6.a r6 = r1.b(r15)
            java.lang.String r6 = r6.e(r5)
            boolean r9 = r5.equals(r6)
            if (r9 == 0) goto L_0x0365
            s5.b r9 = r7.f7081l
            java.util.HashMap r12 = r9.f7210a
            boolean r12 = r12.containsKey(r2)
            if (r12 != 0) goto L_0x0365
            o6.x r12 = new o6.x
            j6.b r13 = r7.f7078i
            r14 = -2146369496(0xffffffff80110028, float:-1.56126E-39)
            r12.<init>(r2, r14, r13)
            r9.a(r2, r12)
        L_0x0365:
            java.util.EnumSet r6 = s5.d0.c(r6)
            java.util.EnumSet<x6.c$a> r9 = r4.f8200n
            r9.addAll(r6)
            x6.j r6 = new x6.j
            boolean r9 = r7.f7083n
            boolean r12 = r7.f7082m
            r6.<init>(r2, r9, r12)
            r7.b(r6, r2)
            r7.d(r6, r2)
            boolean r9 = r6 instanceof s5.d
            if (r9 == 0) goto L_0x0385
            r9 = r6
            s5.d r9 = (s5.d) r9
            goto L_0x0386
        L_0x0385:
            r9 = 0
        L_0x0386:
            r2.p(r6, r9)
            s5.d0.b(r7, r2, r4, r6)
            java.util.ArrayList r1 = i6.g.b(r1, r11)
            com.samsung.android.wearable.watchfacestudio.editor.r r6 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r6.<init>(r7, r10, r4)
            r1.forEach(r6)
            goto L_0x0291
        L_0x039a:
            com.samsung.android.wearable.watchfacestudio.editor.r r0 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r1 = 6
            r0.<init>(r7, r1, r2)
            r3.forEach(r0)
            return
        L_0x03a4:
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 1
            r2.<init>(r4)
            i6.a r4 = r0.b(r6)
            java.lang.String r4 = r4.d()
            java.lang.String r5 = "COMPLICATION"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x03be
            r4 = 0
            r2.set(r4)
        L_0x03be:
            boolean r4 = r2.get()
            if (r4 == 0) goto L_0x03e8
            boolean r4 = i6.g.h(r37)
            if (r4 != 0) goto L_0x03e4
            java.lang.String r8 = "Variant"
            java.lang.String r9 = "Transform"
            java.lang.String r10 = "PartAnimatedImage"
            java.lang.String r11 = "Condition"
            java.lang.String r12 = "Template"
            java.lang.String r13 = "Number"
            java.lang.String r14 = "CountingNumber"
            java.lang.String[] r4 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14}
            boolean r4 = i6.g.f(r0, r4)
            if (r4 != 0) goto L_0x03e4
            r14 = 1
            goto L_0x03e5
        L_0x03e4:
            r14 = 0
        L_0x03e5:
            r2.set(r14)
        L_0x03e8:
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x040b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Optimized group : "
            r4.<init>(r5)
            java.lang.String r5 = "name"
            i6.a r5 = r0.b(r5)
            java.lang.String r5 = r5.d()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "DWF:DrawableNodeFactory"
            android.util.Log.i(r5, r4)
        L_0x040b:
            o6.i r6 = new o6.i
            r6.<init>(r1, r2)
            r5.d r2 = r7.f7074d
            r6.f6179h = r2
            v5.b r2 = r7.f7077h
            s5.p.a(r2, r6, r0)
            v5.b r2 = r7.f7077h
            s5.p.b(r2, r6, r0)
            w5.i r2 = r6.C
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r5 = 6
            r4.<init>(r5)
            e7.k r5 = r6.f6135i
            s5.p.c(r7, r0, r2, r5, r4)
            s5.p.d(r6, r0)
            goto L_0x04f5
        L_0x0430:
            boolean r2 = r7.f7076g
            if (r2 != 0) goto L_0x0435
            return
        L_0x0435:
            o6.b r6 = new o6.b
            r6.<init>(r1)
            r5.d r1 = r7.f7074d
            r6.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r6, r0)
            w5.i r1 = r6.C
            com.samsung.android.wearable.watchfacestudio.editor.p r2 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r3 = 11
            r2.<init>(r3)
            e7.k r3 = r6.f6135i
            s5.p.c(r7, r0, r1, r3, r2)
            s5.p.d(r6, r0)
            java.lang.String r1 = "slotId"
            i6.a r1 = r0.b(r1)
            java.lang.String r2 = "0"
            java.lang.String r8 = r1.e(r2)
            android.graphics.RectF r1 = new android.graphics.RectF
            android.graphics.RectF r2 = r6.D()
            r1.<init>(r2)
            android.graphics.Matrix r2 = r6.f6139m
            y5.e r1 = s5.h.b(r0, r1, r2)
            r6.H = r1
            java.lang.String r1 = "supportedTypes"
            i6.a r1 = r0.b(r1)
            java.lang.String r1 = r1.e(r4)
            java.util.List r1 = n6.g.g(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0486
            goto L_0x04e1
        L_0x0486:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r9 = i6.g.b(r0, r11)
            i5.f r10 = new i5.f
            r5 = 1
            r0 = r10
            r1 = r8
            r3 = r36
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r9.forEach(r10)
            z5.b r0 = new z5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[COMPLICATION."
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = ".TYPE]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            v5.b r2 = r7.f7077h
            r3 = 0
            r0.<init>(r1, r2, r3)
            s5.g r1 = new s5.g
            v5.b r2 = r7.f7077h
            r1.<init>(r2, r0, r8, r6)
            w5.f r0 = r1.f4416b
            s5.h.a(r0, r8, r6)
            s5.f r0 = new s5.f
            r2 = 0
            r0.<init>(r1, r2)
            r6.k(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "COMPLICATION."
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            a(r7, r6, r0)
        L_0x04e1:
            return
        L_0x04e2:
            q6.b r6 = s5.c.a(r36, r37, r38)
            java.lang.String r2 = "[HOUR_0_23_MINUTE]*30"
            s5.c.b(r7, r6, r2)
            goto L_0x04f5
        L_0x04ec:
            q6.b r6 = s5.c.a(r36, r37, r38)
            java.lang.String r2 = "[MINUTE_SECOND]*6"
            s5.c.b(r7, r6, r2)
        L_0x04f5:
            r2 = r3
            r3 = r0
            goto L_0x0a5c
        L_0x04f9:
            s5.i r2 = r7.f7080k
            if (r2 != 0) goto L_0x0502
        L_0x04fd:
            r2 = r3
            r13 = 0
            r3 = r0
            goto L_0x0a5b
        L_0x0502:
            o6.e r3 = new o6.e
            r3.<init>(r1)
            r5.d r1 = r7.f7074d
            r3.f6179h = r1
            i6.a r1 = r0.b(r6)
            java.lang.String r1 = r1.d()
            r3.f6174b = r1
            java.util.HashMap<o6.q, i6.e> r4 = r2.f7232a
            r4.put(r3, r0)
            w5.c r0 = new w5.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CONFIGURATION."
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            v5.b r1 = r7.f7077h
            r1.b(r0, r2)
            v5.b r1 = r7.f7077h
            w5.f r0 = r1.c(r0)
            java.lang.String r0 = r0.h()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x054a
            java.lang.String r0 = "DWF:NodeGenerator"
            java.lang.String r1 = "There is no candidate. It should be checked."
            android.util.Log.e(r0, r1)
            return
        L_0x054a:
            r2.a(r3, r0)
            return
        L_0x054e:
            v6.a r2 = new v6.a
            boolean r6 = i6.g.h(r37)
            r2.<init>(r1, r6)
            r5.d r1 = r7.f7074d
            r2.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r2, r0)
            v5.b r1 = r7.f7077h
            s5.p.b(r1, r2, r0)
            w5.i r1 = r2.C
            com.samsung.android.wearable.watchfacestudio.editor.p r6 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r9 = 8
            r6.<init>(r9)
            e7.k r9 = r2.f6135i
            s5.p.c(r7, r0, r1, r9, r6)
            s5.p.d(r2, r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x057a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x059a
            java.lang.Object r6 = r1.next()
            i6.e r6 = (i6.e) r6
            java.lang.String r9 = r6.f4862a
            java.lang.String r10 = "Thumbnail"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x057a
            java.lang.String r1 = "resource"
            i6.a r1 = r6.b(r1)
            java.lang.String r4 = r1.e(r4)
        L_0x059a:
            int r1 = r7.f7072b
            if (r1 != r12) goto L_0x05a0
            r14 = 1
            goto L_0x05a1
        L_0x05a0:
            r14 = 0
        L_0x05a1:
            j6.b r1 = r7.f7078i
            android.util.SizeF r6 = r2.E()
            float r9 = r6.getWidth()
            int r9 = (int) r9
            float r6 = r6.getHeight()
            int r6 = (int) r6
            if (r4 == 0) goto L_0x05be
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto L_0x05be
            android.graphics.drawable.BitmapDrawable r1 = r1.k(r4, r9, r6)
            goto L_0x05bf
        L_0x05be:
            r1 = 0
        L_0x05bf:
            x6.g r4 = new x6.g
            r4.<init>(r2, r1, r14)
            r4.f6180i = r2
            r2.H = r4
            i5.g r1 = new i5.g
            r1.<init>(r4, r2, r7, r12)
            r3.forEach(r1)
            if (r14 == 0) goto L_0x05d3
            goto L_0x05e2
        L_0x05d3:
            java.lang.String r1 = "AnimationController"
            i6.e r1 = i6.g.c(r0, r1)
            if (r1 != 0) goto L_0x05e6
            java.lang.String r0 = "DWF:PartAnimatedImageFactory"
            java.lang.String r1 = "Missing <AnimationController> animation does not work"
            android.util.Log.w(r0, r1)
        L_0x05e2:
            r19 = r3
            goto L_0x06ef
        L_0x05e6:
            x6.j r6 = new x6.j
            boolean r9 = r7.f7083n
            boolean r10 = r7.f7082m
            r6.<init>(r2, r9, r10)
            r7.b(r6, r2)
            r7.d(r6, r2)
            boolean r9 = r6 instanceof s5.d
            if (r9 == 0) goto L_0x05fd
            r9 = r6
            s5.d r9 = (s5.d) r9
            goto L_0x05fe
        L_0x05fd:
            r9 = 0
        L_0x05fe:
            r2.p(r6, r9)
            java.util.ArrayList r9 = r2.K
            boolean r10 = r9.contains(r6)
            if (r10 != 0) goto L_0x060c
            r9.add(r6)
        L_0x060c:
            java.lang.String r9 = "play"
            i6.a r9 = r1.b(r9)
            java.lang.String r10 = "ON_VISIBLE"
            java.lang.String r9 = r9.e(r10)
            java.lang.String r10 = "repeat"
            i6.a r10 = r1.b(r10)
            r11 = 0
            boolean r10 = r10.a(r11)
            java.lang.String r12 = "resumePlayBack"
            i6.a r12 = r1.b(r12)
            boolean r12 = r12.a(r11)
            java.lang.String r11 = "beforePlaying"
            i6.a r11 = r1.b(r11)
            java.lang.String r13 = "DO_NOTHING"
            java.lang.String r11 = r11.e(r13)
            java.lang.String r14 = "afterPlaying"
            i6.a r14 = r1.b(r14)
            java.lang.String r13 = r14.e(r13)
            java.lang.String r14 = "delayRepeat"
            i6.a r14 = r1.b(r14)
            float r14 = r14.b(r8)
            r19 = r3
            java.lang.String r3 = "delayPlay"
            i6.a r3 = r1.b(r3)
            float r3 = r3.b(r8)
            java.lang.String r8 = "loopCount"
            i6.a r1 = r1.b(r8)
            r8 = 0
            int r1 = r1.c(r8)
            s5.b r8 = r7.f7081l
            boolean r16 = r9.contains(r5)
            r20 = r5
            if (r16 == 0) goto L_0x0686
            java.util.HashMap r5 = r8.f7210a
            boolean r5 = r5.containsKey(r2)
            if (r5 != 0) goto L_0x0686
            o6.x r5 = new o6.x
            r21 = r15
            j6.b r15 = r7.f7078i
            r0 = -2146369373(0xffffffff801100a3, float:-1.561432E-39)
            r5.<init>(r2, r0, r15)
            r8.a(r2, r5)
            goto L_0x0688
        L_0x0686:
            r21 = r15
        L_0x0688:
            x6.b r0 = new x6.b
            p6.g r5 = r7.f7073c
            r0.<init>(r4, r5)
            java.util.EnumSet r5 = s5.d0.c(r9)
            java.util.EnumSet<x6.c$a> r8 = r0.f8165a
            r8.addAll(r5)
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r5
            long r8 = (long) r3
            r0.e = r8
            float r14 = r14 * r5
            long r8 = (long) r14
            r0.f8168d = r8
            r0.f8169f = r10
            r0.f8170g = r12
            int r3 = b6.a.C(r11)
            r0.f8166b = r3
            int r3 = b6.a.C(r13)
            r0.f8167c = r3
            r3 = -1
            int r1 = r1 + r3
            r0.f8174k = r1
            r6.c(r0)
            java.lang.String r1 = "AnimatedImages"
            r3 = r37
            i6.e r1 = i6.g.c(r3, r1)
            if (r1 == 0) goto L_0x06e0
            x6.a r3 = new x6.a
            r3.<init>(r0, r4)
            r4 = r21
            i6.a r1 = r1.b(r4)
            r4 = r20
            java.lang.String r1 = r1.e(r4)
            java.util.EnumSet r1 = s5.d0.c(r1)
            java.util.EnumSet<x6.c$a> r4 = r3.f8163c
            r4.addAll(r1)
            s5.d0.b(r7, r2, r3, r6)
        L_0x06e0:
            s5.d0.b(r7, r2, r0, r6)
            java.lang.String r1 = "DWF:AnimationController"
            java.lang.String r3 = "onReady"
            android.util.Log.i(r1, r3)
            int r1 = r0.f8166b
            r0.c(r1)
        L_0x06ef:
            com.samsung.android.wearable.watchfacestudio.editor.r r0 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r1 = 4
            r0.<init>(r7, r1, r2)
            r2 = r19
            r2.forEach(r0)
            return
        L_0x06fb:
            r2 = r3
            r3 = r0
            o6.q r0 = a1.a.t(r36, r37, r38)
            goto L_0x0a5d
        L_0x0703:
            r2 = r3
            r3 = r0
            q6.b r0 = s5.c.a(r36, r37, r38)
            java.lang.String r4 = "Sweep"
            i6.e r4 = i6.g.c(r3, r4)
            p6.g r5 = r7.f7073c
            int r6 = r7.f7072b
            e7.k r9 = r0.f6135i
            if (r4 == 0) goto L_0x0793
            java.lang.String r8 = "frequency"
            i6.a r4 = r4.b(r8)
            r8 = 15
            int r4 = r4.c(r8)
            r8 = 1
            int r4 = java.lang.Math.max(r4, r8)
            e7.h r10 = new e7.h
            o6.h$a r11 = o6.h.a.ANGLE
            z5.b r13 = new z5.b
            r14 = 10
            if (r4 <= r14) goto L_0x0745
            java.lang.Object[] r14 = new java.lang.Object[r8]
            w5.d r8 = w5.d.f8029i
            java.lang.String[] r8 = r8.f8059f
            r15 = 0
            r8 = r8[r15]
            r14[r15] = r8
            java.lang.String r8 = "[%s] * 6"
            java.lang.String r8 = java.lang.String.format(r8, r14)
            r15 = r12
            goto L_0x0773
        L_0x0745:
            r15 = 0
            java.util.Locale r8 = java.util.Locale.US
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            w5.d r12 = w5.d.f8033k
            java.lang.String[] r12 = r12.f8059f
            r12 = r12[r15]
            r14[r15] = r12
            w5.d r12 = w5.d.f8027h
            java.lang.String[] r12 = r12.f8059f
            r12 = r12[r15]
            r15 = 1
            r14[r15] = r12
            r12 = 1000(0x3e8, float:1.401E-42)
            int r12 = r12 / r4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15 = 2
            r14[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r15 = 3
            r14[r15] = r12
            java.lang.String r12 = "([%s] + (floor([%s] / %d )/ %d)) * 6"
            java.lang.String r8 = java.lang.String.format(r8, r12, r14)
        L_0x0773:
            v5.b r12 = r7.f7077h
            r14 = 0
            r13.<init>(r8, r12, r14)
            r8 = 1
            r10.<init>(r11, r13, r8)
            if (r6 == r15) goto L_0x081b
            r6 = 10
            if (r4 <= r6) goto L_0x081b
            p6.a r6 = new p6.a
            r11 = 2
            r6.<init>(r5, r11, r4)
            r10.m(r6)
            p6.c r4 = r10.f6332b
            r4.g(r8)
            goto L_0x081b
        L_0x0793:
            java.lang.String r4 = "Tick"
            i6.e r4 = i6.g.c(r3, r4)
            java.lang.String r10 = "[SECOND]*6"
            if (r4 == 0) goto L_0x0825
            java.lang.String r11 = "strength"
            i6.a r11 = r4.b(r11)
            float r11 = r11.b(r8)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r11 = a1.a.k(r11, r8, r12)
            java.lang.String r13 = "duration"
            i6.a r4 = r4.b(r13)
            float r4 = r4.b(r12)
            float r31 = a1.a.k(r4, r8, r12)
            z5.b r4 = new z5.b
            v5.b r12 = r7.f7077h
            w5.i r13 = r0.C
            r4.<init>(r10, r12, r13)
            e7.h r10 = new e7.h
            o6.h$a r12 = o6.h.a.ANGLE
            r13 = 1
            r10.<init>(r12, r4, r13)
            r4 = 3
            if (r6 == r4) goto L_0x0811
            int r4 = (r31 > r8 ? 1 : (r31 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0811
            r4 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 + r4
            r4 = 1023879938(0x3d072b02, float:0.033)
            float r4 = r31 - r4
            float r4 = r4 / r31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            r6.append(r11)
            java.lang.String r4 = " 1.0 1.0"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "CUBIC_BEZIER"
            android.view.animation.BaseInterpolator r32 = b(r6, r4)
            p6.c r4 = new p6.c
            r33 = 0
            r35 = 15
            r34 = 2
            r29 = r4
            r30 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r10.m(r4)
        L_0x0811:
            boolean r4 = r10.f4277d
            if (r4 == 0) goto L_0x081b
            p6.c r4 = r10.f6332b
            r5 = 1
            r4.g(r5)
        L_0x081b:
            r9.l(r10)
            v5.b r4 = r7.f7077h
            r10.l(r4)
            goto L_0x0a5d
        L_0x0825:
            s5.c.b(r7, r0, r10)
            goto L_0x0a5d
        L_0x082a:
            r2 = r3
            r14 = 0
            r3 = r0
            boolean r0 = r1 instanceof q6.c
            java.lang.String r5 = "DWF:DigitalClockFactory"
            if (r0 != 0) goto L_0x0838
            java.lang.String r0 = "try to create TimeText but parent is not DigitalClock"
            r1 = r5
            goto L_0x09f5
        L_0x0838:
            r0 = r1
            q6.c r0 = (q6.c) r0
            q6.d r8 = new q6.d
            r8.<init>(r0)
            r5.d r1 = r7.f7074d
            r8.f6179h = r1
            v5.b r1 = r7.f7077h
            s5.p.a(r1, r8, r3)
            w5.i r0 = r0.C
            r8.C = r0
            com.samsung.android.wearable.watchfacestudio.editor.p r1 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 4
            r1.<init>(r6)
            e7.k r6 = r8.f6135i
            s5.p.c(r7, r3, r0, r6, r1)
            s5.p.d(r8, r3)
            c7.p r0 = new c7.p
            r0.<init>(r8)
            java.lang.String r1 = "align"
            i6.a r1 = r3.b(r1)
            java.lang.String r6 = "CENTER"
            java.lang.String r1 = r1.e(r6)
            android.graphics.Paint$Align r1 = n6.g.a(r1)
            d7.f r6 = new d7.f
            r9 = 0
            r6.<init>(r1, r9)
            r6.f4124c = r8
            r8.H = r6
            s5.o.b(r7, r8, r0)
            java.util.Iterator r1 = r2.iterator()
            r2 = r14
        L_0x0882:
            boolean r6 = r1.hasNext()
            java.lang.String r9 = "SYNC_TO_DEVICE"
            if (r6 == 0) goto L_0x09c5
            java.lang.Object r6 = r1.next()
            i6.e r6 = (i6.e) r6
            java.lang.String r10 = r6.f4862a
            r10.getClass()
            java.lang.String r11 = "Font"
            boolean r11 = r10.equals(r11)
            java.lang.String r13 = "#FFFFFF"
            java.lang.String r15 = "color"
            java.lang.String r14 = "size"
            java.lang.String r12 = "family"
            if (r11 != 0) goto L_0x090d
            java.lang.String r9 = "BitmapFont"
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x08ae
            goto L_0x0907
        L_0x08ae:
            i6.a r2 = r6.b(r12)
            java.lang.String r2 = r2.d()
            s5.e r9 = r7.f7079j
            java.util.HashMap r9 = r9.f7218a
            boolean r9 = r9.containsKey(r2)
            if (r9 == 0) goto L_0x08f1
            c7.a r9 = new c7.a
            i6.a r10 = r6.b(r14)
            r11 = 40
            int r10 = r10.c(r11)
            float r10 = (float) r10
            s5.l r11 = new s5.l
            r11.<init>(r7)
            r9.<init>(r0, r2, r10, r11)
            i6.a r2 = r6.b(r15)
            java.lang.String r2 = r2.e(r13)
            v5.b r10 = r7.f7077h
            s5.j r11 = new s5.j
            r13 = 0
            r11.<init>(r9, r13)
            android.graphics.Color r2 = n6.b.a(r2, r10, r11, r9)
            if (r2 == 0) goto L_0x0903
            r9.r = r2
            r9.A()
            goto L_0x0903
        L_0x08f1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "BitmapFont doesn't have file: "
            r9.<init>(r10)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            android.util.Log.w(r5, r2)
            r9 = 0
        L_0x0903:
            r6.b(r12)
            r2 = r9
        L_0x0907:
            r29 = r1
            r16 = r5
            goto L_0x09be
        L_0x090d:
            i6.a r2 = r6.b(r12)
            java.lang.String r2 = r2.e(r9)
            boolean r9 = r2.equals(r9)
            java.lang.String r10 = "width"
            java.lang.String r11 = "weight"
            java.lang.String r12 = "slant"
            r29 = r1
            java.lang.String r1 = "NORMAL"
            if (r9 == 0) goto L_0x0963
            c7.i r2 = new c7.i
            i6.a r9 = r6.b(r14)
            r14 = 40
            int r9 = r9.c(r14)
            float r9 = (float) r9
            i6.a r12 = r6.b(r12)
            java.lang.String r12 = r12.e(r1)
            int r18 = b6.a.v(r12)
            i6.a r11 = r6.b(r11)
            java.lang.String r11 = r11.e(r1)
            int r19 = b6.a.w(r11)
            i6.a r10 = r6.b(r10)
            java.lang.String r1 = r10.e(r1)
            int r20 = b6.a.x(r1)
            r1 = r15
            r15 = r2
            r16 = r0
            r17 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            r9 = r1
            r16 = r5
            goto L_0x09a3
        L_0x0963:
            r9 = r15
            c7.i r15 = new c7.i
            i6.a r14 = r6.b(r14)
            r16 = r5
            r5 = 40
            int r5 = r14.c(r5)
            float r5 = (float) r5
            i6.a r12 = r6.b(r12)
            java.lang.String r12 = r12.e(r1)
            int r26 = b6.a.v(r12)
            i6.a r11 = r6.b(r11)
            java.lang.String r11 = r11.e(r1)
            int r27 = b6.a.w(r11)
            i6.a r10 = r6.b(r10)
            java.lang.String r1 = r10.e(r1)
            int r28 = b6.a.x(r1)
            r22 = r15
            r23 = r0
            r24 = r2
            r25 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r2 = r15
        L_0x09a3:
            i6.a r1 = r6.b(r9)
            java.lang.String r1 = r1.e(r13)
            v5.b r5 = r7.f7077h
            s5.k r6 = new s5.k
            r9 = 0
            r6.<init>(r2, r9)
            android.graphics.Color r1 = n6.b.a(r1, r5, r6, r2)
            if (r1 == 0) goto L_0x09be
            r2.f2808u = r1
            r2.A()
        L_0x09be:
            r5 = r16
            r1 = r29
            r14 = 0
            goto L_0x0882
        L_0x09c5:
            r16 = r5
            s5.o.b(r7, r8, r2)
            if (r2 != 0) goto L_0x09ce
            goto L_0x0a56
        L_0x09ce:
            java.lang.String r0 = "format"
            i6.a r0 = r3.b(r0)
            java.lang.String r0 = r0.e(r4)
            java.lang.String r1 = "((h{1,2})\\:m{1,2}\\:s{1,2}|(h{1,2})\\:m{1,2})|(h{1,2})|m{1,2}|s{1,2}"
            boolean r1 = r0.matches(r1)
            if (r1 != 0) goto L_0x09f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "time format is invalid ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "] only hh, h, mm, m, ss, s, : are allowed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r16
        L_0x09f5:
            android.util.Log.w(r1, r0)
            goto L_0x0a56
        L_0x09f9:
            java.lang.String r1 = "ss|s|mm|m|hh|h"
            java.lang.String r4 = "%s"
            java.lang.String r1 = r0.replaceAll(r1, r4)
            c7.m r4 = new c7.m
            r5 = 0
            r4.<init>(r2, r1, r5)
            r5.d r1 = r7.f7074d
            r4.f6179h = r1
            s5.o.b(r7, r8, r4)
            java.lang.String r1 = "hourFormat"
            i6.a r1 = r3.b(r1)
            java.lang.String r10 = r1.e(r9)
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            v5.b r2 = r7.f7077h
            java.util.stream.Stream r11 = java.util.Arrays.stream(r0)
            i5.e r12 = new i5.e
            r6 = 1
            r0 = r12
            r1 = r4
            r3 = r10
            r4 = r8
            r5 = r36
            r13 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.forEach(r12)
            r8.c()
            r10.getClass()
            boolean r0 = r10.equals(r9)
            if (r0 != 0) goto L_0x0a41
            goto L_0x0a56
        L_0x0a41:
            z5.b r0 = new z5.b
            v5.b r1 = r7.f7077h
            java.lang.String r2 = "[IS_24_HOUR_MODE]"
            r0.<init>(r2, r1, r13)
            s5.n r1 = new s5.n
            v5.b r2 = r7.f7077h
            r1.<init>(r2, r0, r8)
            w5.f r0 = r1.f4416b
            r0.a()
        L_0x0a56:
            return
        L_0x0a57:
            r2 = r3
            r3 = r0
            r0 = r1
            goto L_0x0a5d
        L_0x0a5b:
            r6 = r13
        L_0x0a5c:
            r0 = r6
        L_0x0a5d:
            f(r36, r37, r38)
            if (r0 == 0) goto L_0x0a76
            java.util.Iterator r1 = r2.iterator()
        L_0x0a66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a76
            java.lang.Object r2 = r1.next()
            i6.e r2 = (i6.e) r2
            c(r7, r2, r0)
            goto L_0x0a66
        L_0x0a76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.u.c(r5.e, i6.e, o6.q):void");
    }

    @SafeVarargs
    public static void d(e eVar, i6.e eVar2, w5.i iVar, k kVar, Function<String, i.a>... functionArr) {
        e eVar3 = eVar;
        i6.e eVar4 = eVar2;
        k kVar2 = kVar;
        eVar3.a(kVar2);
        eVar3.c(kVar2);
        ArrayList arrayList = new ArrayList();
        p6.g gVar = eVar3.f7073c;
        int i8 = 0;
        int i9 = 15;
        if (eVar3.f7072b != 3) {
            Iterator it = eVar4.f4863b.iterator();
            while (it.hasNext()) {
                i6.e eVar5 = (i6.e) it.next();
                if ("Animation".equals(eVar5.f4862a)) {
                    String e = eVar5.b("interpolation").e("LINEAR");
                    String e4 = eVar5.b("angleDirection").e("NONE");
                    float b9 = eVar5.b("duration").b(0.0f);
                    int c9 = eVar5.b("repeat").c(i8);
                    int c10 = eVar5.b("fps").c(i9);
                    if (((long) (1000.0f * b9)) <= 66 || c9 < -1 || c10 < 1) {
                        Log.i("DWF:NodeGenerator", "Wrong animation, duration:" + b9 + " repeat:" + c9 + " fps:" + c10);
                    } else {
                        arrayList.add(new c(gVar, b9, b(e, eVar5.b("controls").d()), c9, b6.a.z(e4), c10));
                    }
                    i8 = 0;
                    i9 = 15;
                }
            }
        }
        p6.a aVar = arrayList.isEmpty() ? null : (c) arrayList.get(arrayList.size() - 1);
        String d9 = eVar4.b("target").d();
        String d10 = eVar4.b("value").d();
        boolean z8 = aVar != null && d9.equals("angle") && Arrays.asList(new String[]{"[SECOND]*6", "6*[SECOND]", "[SECOND_MILLISECOND]*6", "6*[SECOND_MILLISECOND]"}).contains(d10.replaceAll("[()\\s]", "")) && (aVar.f6334b instanceof LinearInterpolator) && aVar.f6335c == 0 && aVar.f6333a == 1000 && aVar.f6342k == 15;
        if (z8) {
            d10 = d10.replaceAll("SECOND", "SECOND_MILLISECOND");
        }
        h hVar = new h(e(d9, functionArr), new b(d10, eVar3.f7077h, iVar), b6.a.y(eVar4.b("mode").e("TO")));
        if (z8) {
            aVar = new p6.a(gVar, aVar.e, aVar.f6342k);
        }
        if (aVar != null) {
            hVar.m(aVar);
            if (hVar.f4277d) {
                hVar.f6332b.g(true);
            }
        }
        kVar2.l(hVar);
        hVar.l(eVar3.f7077h);
    }

    @SafeVarargs
    public static i.a e(String str, Function<String, i.a>... functionArr) {
        i.a aVar = null;
        for (Function<String, i.a> apply : functionArr) {
            aVar = apply.apply(str);
            if (aVar != null) {
                break;
            }
        }
        if (aVar == null) {
            aVar = h.a.f(str);
        }
        if (aVar != null) {
            return aVar;
        }
        Log.e("DWF:NodeGenerator", "Unrecognized transform target value : " + str);
        return new a();
    }

    public static void f(e eVar, i6.e eVar2, q qVar) {
        if (qVar.s()) {
            g gVar = (g) qVar;
            String str = eVar2.f4862a;
            str.getClass();
            char c9 = 65535;
            switch (str.hashCode()) {
                case -2025975853:
                    if (str.equals("Launch")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1557374865:
                    if (str.equals("ScreenReader")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1238332596:
                    if (str.equals("Transform")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 2235087:
                    if (str.equals("Gyro")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    String d9 = eVar2.b("target").d();
                    if (n6.g.d(d9)) {
                        t5.a a9 = a(eVar, gVar, d9);
                        b bVar = eVar.f7081l;
                        if (!bVar.f7210a.containsKey(gVar)) {
                            int i8 = a9.e;
                            if (i8 == 0) {
                                bVar.a(gVar, new x(gVar, a9.f7496f));
                                return;
                            } else {
                                bVar.a(gVar, new x(gVar, i8, eVar.f7078i));
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    String d10 = eVar2.b("stringId").d();
                    if (n6.g.d(d10)) {
                        String o8 = eVar.f7078i.o(d10);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = eVar2.f4863b.iterator();
                        while (it.hasNext()) {
                            i6.e eVar3 = (i6.e) it.next();
                            if (eVar3.f4862a.equals("Parameter")) {
                                arrayList.add(new b(eVar3.b("expression").d(), eVar.f7077h, gVar.C));
                            } else {
                                Log.e("DWF:NodeGenerator", "Unrecognized tag name " + eVar3.f4862a);
                            }
                        }
                        eVar.f7081l.a(gVar, new x(gVar, o8, arrayList, eVar.f7077h, eVar.f7081l));
                        return;
                    }
                    Log.e("DWF:NodeGenerator", "Not valid string Id " + d10);
                    return;
                case 2:
                    d(eVar, eVar2, gVar.C, gVar.f6135i, new Function[0]);
                    return;
                case 3:
                    w5.i iVar = gVar.C;
                    if (eVar.f7072b != 3) {
                        i.a e = e("gyroX", new Function[0]);
                        String d11 = eVar2.b("x").d();
                        k kVar = gVar.f6135i;
                        g(eVar, iVar, kVar, e, d11);
                        g(eVar, iVar, kVar, e("gyroY", new Function[0]), eVar2.b("y").d());
                        g(eVar, iVar, kVar, e("gyroScaleX", new Function[0]), eVar2.b("scaleX").d());
                        g(eVar, iVar, kVar, e("gyroScaleY", new Function[0]), eVar2.b("scaleY").d());
                        g(eVar, iVar, kVar, e("gyroAngle", new Function[0]), eVar2.b("angle").d());
                        g(eVar, iVar, kVar, e("gyroAlpha", new Function[0]), eVar2.b("alpha").d());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static void g(e eVar, w5.i iVar, k kVar, i.a aVar, String str) {
        if (!n6.g.e(str)) {
            eVar.a(kVar);
            eVar.c(kVar);
            e7.h hVar = new e7.h(aVar, new b(str, eVar.f7077h, iVar), 1);
            kVar.l(hVar);
            hVar.m(new c(eVar.f7073c, 0.2f, new LinearInterpolator(), 0, 1, 15));
            if (hVar.f4277d) {
                hVar.f6332b.g(true);
            }
            hVar.l(eVar.f7077h);
        }
    }
}
