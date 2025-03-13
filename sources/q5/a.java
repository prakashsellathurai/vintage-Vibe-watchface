package q5;

import android.content.res.Resources;
import j6.b;
import java.util.Arrays;
import java.util.List;
import n6.g;
import u1.s;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final List<s> f6606d = Arrays.asList(new s[]{s.f7716g, s.f7717h, s.f7718i});

    /* renamed from: a  reason: collision with root package name */
    public final Resources f6607a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6608b;

    /* renamed from: c  reason: collision with root package name */
    public final u1.b f6609c;

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r8v3, types: [u1.m$a] */
    /* JADX WARNING: type inference failed for: r8v4, types: [u1.m$f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(r5.h r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r24.<init>()
            android.content.Context r2 = r1.f7090c
            android.content.res.Resources r2 = r2.getResources()
            r0.f6607a = r2
            j6.b r2 = r1.e
            r0.f6608b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r1 = r25.b()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0130
            java.lang.Object r3 = r1.next()
            b6.b r3 = (b6.b) r3
            java.lang.String r4 = r3.f2605c
            r5 = 3
            int r6 = r3.f2603a
            if (r6 != r5) goto L_0x003d
            r7 = -2146369487(0xffffffff80110031, float:-1.561272E-39)
            goto L_0x0040
        L_0x003d:
            r7 = -2146369440(0xffffffff80110060, float:-1.561338E-39)
        L_0x0040:
            int r11 = r0.a(r7, r4)
            if (r6 != r5) goto L_0x004a
            r4 = -2146369486(0xffffffff80110032, float:-1.561273E-39)
            goto L_0x004d
        L_0x004a:
            r4 = -2146369439(0xffffffff80110061, float:-1.56134E-39)
        L_0x004d:
            java.lang.String r5 = r3.e
            int r12 = r0.a(r4, r5)
            int r4 = s.g.b(r6)
            java.lang.String r5 = r3.f2604b
            java.lang.String r7 = "DWF:UserStyleRepositoryHelper"
            java.lang.String r8 = r3.f2606d
            if (r4 == 0) goto L_0x00fc
            r9 = 1
            if (r4 == r9) goto L_0x0076
            r10 = 2
            if (r4 == r10) goto L_0x0076
            java.lang.String r3 = b6.a.m(r6)
            java.lang.String r4 = "Wrong configuration type:"
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.w(r7, r3)
            r21 = r1
            goto L_0x00fa
        L_0x0076:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r4 = r3.f2608g
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r10 = r6
        L_0x0083:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x00d7
            java.lang.Object r13 = r4.next()
            b6.c r13 = (b6.c) r13
            u1.m$f$b r15 = new u1.m$f$b
            u1.m$h$a r9 = new u1.m$h$a
            r21 = r1
            java.lang.String r1 = r13.f2611a
            r9.<init>((java.lang.String) r1)
            android.content.res.Resources r1 = r0.f6607a
            r22 = r4
            r4 = -2146369442(0xffffffff8011005e, float:-1.561335E-39)
            r16 = r15
            java.lang.String r15 = r13.f2612b
            int r18 = r0.a(r4, r15)
            r4 = -2146369441(0xffffffff8011005f, float:-1.561337E-39)
            java.lang.String r15 = r13.f2613c
            int r19 = r0.a(r4, r15)
            android.graphics.drawable.Icon r4 = r13.f2614d
            r23 = r16
            r15 = r23
            r16 = r9
            r17 = r1
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r1 = r23
            r14.add(r1)
            java.lang.String r1 = r13.f2611a
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00cf
            r6 = r10
        L_0x00cf:
            r1 = 1
            int r10 = r10 + r1
            r9 = r1
            r1 = r21
            r4 = r22
            goto L_0x0083
        L_0x00d7:
            r21 = r1
            r1 = r9
            int r4 = r14.size()
            if (r4 <= r1) goto L_0x00fa
            u1.m$f r1 = new u1.m$f
            u1.m$e r9 = new u1.m$e
            r9.<init>(r5)
            android.content.res.Resources r10 = r0.f6607a
            android.graphics.drawable.Icon r13 = r3.f2607f
            java.util.List<u1.s> r15 = f6606d
            java.lang.Object r3 = r14.get(r6)
            r16 = r3
            u1.m$f$b r16 = (u1.m.f.b) r16
            r8 = r1
            r8.<init>((u1.m.e) r9, (android.content.res.Resources) r10, (int) r11, (int) r12, (android.graphics.drawable.Icon) r13, (java.util.ArrayList) r14, (java.util.List) r15, (u1.m.f.b) r16)
            goto L_0x0115
        L_0x00fa:
            r1 = 0
            goto L_0x0115
        L_0x00fc:
            r21 = r1
            u1.m$a r1 = new u1.m$a
            u1.m$e r9 = new u1.m$e
            r9.<init>(r5)
            android.content.res.Resources r10 = r0.f6607a
            android.graphics.drawable.Icon r13 = r3.f2607f
            java.util.List<u1.s> r14 = f6606d
            java.lang.String r3 = "TRUE"
            boolean r15 = r3.equals(r8)
            r8 = r1
            r8.<init>((u1.m.e) r9, (android.content.res.Resources) r10, (int) r11, (int) r12, (android.graphics.drawable.Icon) r13, (java.util.List) r14, (boolean) r15)
        L_0x0115:
            if (r1 == 0) goto L_0x011b
            r2.add(r1)
            goto L_0x012c
        L_0x011b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "failed to parse UserStyleSetting:"
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r7, r1)
        L_0x012c:
            r1 = r21
            goto L_0x0026
        L_0x0130:
            u1.b r1 = new u1.b
            u1.l r3 = new u1.l
            r3.<init>(r2)
            r1.<init>(r3)
            r0.f6609c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.<init>(r5.h):void");
    }

    public final int a(int i8, String str) {
        int f9 = g.d(str) ? this.f6608b.f(str) : 0;
        return f9 == 0 ? i8 : f9;
    }
}
