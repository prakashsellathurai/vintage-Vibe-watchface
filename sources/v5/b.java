package v5;

import android.content.Context;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import android.util.Log;
import b6.a;
import d6.d;
import d6.e;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r5.j;
import w5.c;
import w5.f;
import w5.g;
import w5.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f7952a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7953b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final e f7954c;

    /* renamed from: d  reason: collision with root package name */
    public ZonedDateTime f7955d = ZonedDateTime.now();

    public b(Context context, boolean z8, j jVar) {
        this.f7952a = new d(context, z8, jVar);
        this.f7954c = new e();
        if (!z8) {
            b(w5.e.a(w5.d.f8034k0), new a(this, 0));
            b(w5.e.a(w5.d.f8021c0), new a(this, 1));
        }
    }

    public static void a(b bVar) {
        boolean z8;
        e eVar = bVar.f7954c;
        if (!eVar.f4068c.equals(ULocale.getDefault()) || !eVar.f4069d.equals(TimeZone.getDefault())) {
            eVar.f4068c = ULocale.getDefault();
            eVar.f4069d = TimeZone.getDefault();
            i iVar = eVar.f4067b;
            HashMap hashMap = eVar.f4066a;
            if (iVar != null) {
                hashMap.remove(iVar);
                eVar.f4067b = new i(System.identityHashCode(eVar), (String) null, (List<String>) null, (String) null);
            }
            for (Map.Entry key : hashMap.entrySet()) {
                i iVar2 = (i) key.getKey();
                boolean z9 = iVar2.f8078d;
                if (z9 || iVar2.e) {
                    if (z9) {
                        iVar2.f8076b = eVar.f4069d;
                    }
                    int i8 = iVar2.f8079f;
                    ULocale a9 = n6.i.a(i8 == 0 ? null : a.a(i8), iVar2.f8077c);
                    hashMap.put(iVar2, new e.a(a9, Calendar.getInstance(iVar2.f8076b, a9)));
                }
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            bVar.i(ZonedDateTime.now());
            bVar.e();
        }
    }

    public final void b(c cVar, g gVar) {
        d6.b d9 = d(cVar);
        d9.getClass();
        String str = cVar.f8018a;
        if (!d9.e(str)) {
            Log.i("DWF:DataProvider", String.format("wrong source[%s]", new Object[]{str}));
            return;
        }
        HashMap hashMap = d9.f4049b;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
            d9.k(str);
        }
        list.add(gVar);
    }

    public final f c(c cVar) {
        f c9 = d(cVar).c(cVar);
        return c9 != null ? c9 : f.f8063k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r3.indexOf(".");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d6.b d(w5.c r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.f8018a
            boolean r0 = n6.g.e(r3)
            if (r0 == 0) goto L_0x0009
            goto L_0x0012
        L_0x0009:
            java.lang.String r0 = "."
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0015
        L_0x0012:
            java.lang.String r3 = ""
            goto L_0x001c
        L_0x0015:
            int r0 = r0 + 1
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L_0x001c:
            java.util.HashMap r0 = r2.f7953b
            java.lang.Object r3 = r0.get(r3)
            d6.b r3 = (d6.b) r3
            if (r3 != 0) goto L_0x0029
            d6.d r2 = r2.f7952a
            return r2
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.b.d(w5.c):d6.b");
    }

    public final void e() {
        d dVar = this.f7952a;
        dVar.f4063o.getClass();
        int ordinal = w5.d.f8027h.ordinal();
        while (true) {
            dVar.f4063o.getClass();
            if (ordinal < w5.d.f8030i0.ordinal()) {
                dVar.s(w5.d.values()[ordinal]);
                ordinal++;
            } else {
                return;
            }
        }
    }

    public final void f(boolean z8) {
        for (d6.b bVar : this.f7953b.values()) {
            if (bVar.e != z8) {
                bVar.e = z8;
                if (!z8 && bVar.f4048a != 2) {
                    bVar.b();
                }
                bVar.h(bVar.e);
            }
        }
        d dVar = this.f7952a;
        if (dVar.e != z8) {
            dVar.e = z8;
            if (!z8 && dVar.f4048a != 2) {
                dVar.b();
            }
            dVar.h(dVar.e);
        }
    }

    public final void g(boolean z8) {
        for (d6.b p8 : this.f7953b.values()) {
            p8.p(z8);
        }
        this.f7952a.p(z8);
    }

    public final void h(boolean z8) {
        for (d6.b bVar : this.f7953b.values()) {
            if (bVar.f4053g != z8) {
                bVar.f4053g = z8;
                bVar.j(z8);
            }
        }
        d dVar = this.f7952a;
        if (dVar.f4053g != z8) {
            dVar.f4053g = z8;
            dVar.j(z8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r3 < (r13 + 600.0d)) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.time.ZonedDateTime r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r0.f7955d = r1
            d6.d r2 = r0.f7952a
            c6.n r3 = r2.f4063o
            r3.getClass()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            c6.o r5 = new c6.o
            android.content.Context r6 = r3.f2716a
            r5.<init>(r6, r1)
            c6.o r6 = r3.f2773j
            java.util.HashSet r6 = r6.a(r5)
            r4.addAll(r6)
            r3.f2773j = r5
            java.util.HashMap r5 = r3.f2774k
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x003d
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = r3.f2774k
            c6.m r7 = new c6.m
            r7.<init>(r3, r1, r4, r5)
            r6.forEach(r7)
            r3.f2774k = r5
        L_0x003d:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x004d
            c6.c r1 = r3.f2717b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r1.a(r3)
        L_0x004d:
            c6.j r1 = r2.f4064p
            c6.n r3 = r2.f4063o
            c6.o r3 = r3.f2773j
            long r3 = r3.f2779c
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            double r3 = (double) r3
            boolean r5 = r1.g()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x016b
            double[] r5 = r1.f2745h
            r8 = r5[r7]
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r9 = 2
            java.lang.String r10 = "DWF:ModelMoonPhase"
            r11 = 4
            r12 = 3
            if (r8 < 0) goto L_0x0087
            r13 = r5[r11]
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            double r13 = r1.f2744g
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x00e3
            r15 = 4648488871632306176(0x4082c00000000000, double:600.0)
            double r13 = r13 + r15
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e3
            goto L_0x016b
        L_0x0087:
            java.lang.String r8 = "update moon phase value"
            android.util.Log.i(r10, r8)
            r13 = 4680673776000565248(0x40f5180000000000, double:86400.0)
            double r13 = r3 / r13
            r15 = 4667249838537048064(0x40c5670000000000, double:10958.0)
            double r13 = r13 - r15
            r15 = 4675252771358769152(0x40e1d5a000000000, double:36525.0)
            double r13 = r13 / r15
            r15 = 4653154539273610854(0x4093536666666666, double:1236.85)
            double r13 = r13 * r15
            double r15 = c6.j.n(r13, r7, r6)
            int r8 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c8
            r5[r7] = r15
            double r15 = c6.j.n(r13, r6, r6)
            r5[r6] = r15
            double r15 = c6.j.n(r13, r9, r6)
            r5[r9] = r15
            double r15 = c6.j.n(r13, r12, r6)
            r5[r12] = r15
            double r13 = c6.j.n(r13, r11, r6)
            r5[r11] = r13
            goto L_0x00e3
        L_0x00c8:
            r5[r11] = r15
            r8 = -1
            double r15 = c6.j.n(r13, r6, r8)
            r5[r12] = r15
            double r15 = c6.j.n(r13, r9, r8)
            r5[r9] = r15
            double r15 = c6.j.n(r13, r12, r8)
            r5[r6] = r15
            double r13 = c6.j.n(r13, r11, r8)
            r5[r7] = r13
        L_0x00e3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f2744g = r3
            r13 = r5[r7]
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            java.lang.String r9 = "MoonPhase timestamp value is error!!"
            if (r15 >= 0) goto L_0x00ff
            android.util.Log.e(r10, r9)
            r9 = r5[r7]
            r13 = r5[r11]
            double r13 = r9 - r13
            r15 = r5[r12]
            double r13 = r13 + r15
            goto L_0x0138
        L_0x00ff:
            r15 = r5[r6]
            int r17 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x010a
            r9 = r7
            r17 = r13
            r14 = r15
            goto L_0x011d
        L_0x010a:
            r13 = 2
            r17 = r5[r13]
            int r14 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0116
            r12 = r6
            r13 = r15
            r9 = r17
            goto L_0x0138
        L_0x0116:
            r14 = r5[r12]
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0122
            r9 = r13
        L_0x011d:
            r12 = r9
            r9 = r14
            r13 = r17
            goto L_0x0138
        L_0x0122:
            r16 = r5[r11]
            int r13 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x012c
            r13 = r14
            r9 = r16
            goto L_0x0138
        L_0x012c:
            android.util.Log.e(r10, r9)
            r13 = r5[r11]
            r9 = r5[r6]
            double r9 = r9 + r13
            r11 = r5[r7]
            double r9 = r9 - r11
            r12 = r7
        L_0x0138:
            double r9 = r9 - r13
            double r3 = r3 - r13
            double r11 = (double) r12
            r13 = 4619567317775286272(0x401c000000000000, double:7.0)
            double r11 = r11 * r13
            double r3 = r3 / r9
            double r3 = r3 * r13
            double r11 = r11 + r3
            double r3 = r1.f2746i
            c6.j$a r3 = c6.j.a.e(r3)
            int r3 = r3.ordinal()
            c6.j$a r4 = c6.j.a.e(r11)
            int r4 = r4.ordinal()
            if (r3 == r4) goto L_0x015f
            w5.d r3 = w5.d.f8053v0
            r8.add(r3)
            w5.d r3 = w5.d.f8054w0
            r8.add(r3)
        L_0x015f:
            r1.f2746i = r11
            w5.d r3 = w5.d.u0
            r8.add(r3)
            c6.c r1 = r1.f2717b
            r1.a(r8)
        L_0x016b:
            boolean r1 = r2.e
            if (r1 == 0) goto L_0x0174
            boolean r1 = r2.f4060l
            if (r1 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r6 = r7
        L_0x0175:
            if (r6 == 0) goto L_0x019b
            java.lang.String r1 = "DWF:DataManager"
            java.lang.String r3 = "flush pending changes"
            android.util.Log.i(r1, r3)
            java.util.HashMap r0 = r0.f7953b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0188:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0198
            java.lang.Object r1 = r0.next()
            d6.b r1 = (d6.b) r1
            r1.b()
            goto L_0x0188
        L_0x0198:
            r2.b()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.b.i(java.time.ZonedDateTime):void");
    }
}
