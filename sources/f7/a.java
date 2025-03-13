package f7;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.util.Log;
import e6.d;
import e6.e;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import q1.c;
import q1.j;
import q1.l;
import q1.u;
import w5.f;
import x5.b;

public final class a extends d {

    /* renamed from: p  reason: collision with root package name */
    public static final Instant f4419p = Instant.MAX;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f4420l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public final HashMap f4421m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f4422n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    public PendingIntent f4423o;

    public a(Context context) {
        super(context);
    }

    public static void t(String str, String str2, Instant instant) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("[%s] \"%s\"", new Object[]{str, str2}));
        if (instant != null) {
            try {
                sb.append(String.format(" (next update: %s)", new Object[]{instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_DATE_TIME)}));
            } catch (Exception unused) {
                sb.append(" (next update: /ERR/)");
            }
        }
        Log.i("DWF:WearComplicationProvider", sb.toString());
    }

    public final void s(Instant instant, boolean z8) {
        for (Map.Entry entry : this.f4420l.entrySet()) {
            e eVar = (e) entry.getKey();
            HashMap hashMap = this.f4421m;
            if (instant.isAfter(z8 ? Instant.ofEpochMilli(0) : (Instant) hashMap.get(eVar))) {
                c cVar = (c) entry.getValue();
                Instant d9 = cVar.d(instant);
                hashMap.put(eVar, d9);
                String valueOf = String.valueOf(cVar.b(this.f4051d.getResources(), instant));
                this.f4258j.put(eVar, new f(valueOf));
                String str = eVar.f4261a;
                g(str, c(new w5.c(str)), false);
                t(eVar.f4261a, valueOf, d9);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x014b, code lost:
        r10 = r18;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0182, code lost:
        x(r11, r16, r13, r4, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x018c, code lost:
        r11.a(x5.b.a.f8145q, new w5.f(x5.a.valueOf(r12.name()).toString()));
        r0 = q1.d.NO_PERMISSION;
        r1 = x5.b.a.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a6, code lost:
        if (r12 != r0) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ac, code lost:
        if (r6.f4423o != null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ae, code lost:
        r3 = r6.f4051d;
        r6.f4423o = android.app.PendingIntent.getActivity(r3, 0, androidx.wear.watchface.ComplicationHelperActivity.h(r3, new android.content.ComponentName(r3, r3.getClass()), (android.content.Intent) null, (android.content.Intent) null).addFlags(268435456), 201326592);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01cc, code lost:
        r0 = new w5.f((java.lang.Object) r6.f4423o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d2, code lost:
        r0 = new w5.f((java.lang.Object) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d7, code lost:
        r11.a(r1, r0);
        r0 = r11.f8133a.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e8, code lost:
        if (r0.hasNext() == false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ea, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        r2 = r6.f4259k.a(r7, ((x5.b.a) r1.getKey()).name());
        r1 = (w5.f) r1.getValue();
        r6.f4258j.put(r2, r1);
        g(r2.f4261a, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0211, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(int r16, q1.b r17, java.time.Instant r18, boolean r19) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            r0 = r17
            r1 = r19
            e6.b r2 = r6.f4259k
            java.lang.String r3 = "DWF:WearComplicationProvider"
            if (r2 != 0) goto L_0x0013
            java.lang.String r0 = "updateComplication: there is no complication list"
            android.util.Log.w(r3, r0)
            return
        L_0x0013:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Locale r4 = java.util.Locale.getDefault()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r9 = 0
            r5[r9] = r8
            q1.d r8 = r0.f6418a
            r10 = 1
            r5[r10] = r8
            java.lang.String r8 = "[%d:%s]"
            java.lang.String r4 = java.lang.String.format(r4, r8, r5)
            r2.append(r4)
            android.content.ComponentName r4 = r0.e
            if (r4 == 0) goto L_0x004e
            java.lang.String r5 = " "
            r2.append(r5)
            java.lang.String r5 = r4.getPackageName()
            r2.append(r5)
            java.lang.String r5 = "/"
            r2.append(r5)
            java.lang.String r4 = r4.getClassName()
            goto L_0x0050
        L_0x004e:
            java.lang.String r4 = " NoDataSource"
        L_0x0050:
            r2.append(r4)
            android.app.PendingIntent r8 = r0.f6419b
            if (r8 != 0) goto L_0x005a
            java.lang.String r4 = " NoTapAction"
            goto L_0x005c
        L_0x005a:
            java.lang.String r4 = ""
        L_0x005c:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r3, r2)
            java.util.HashMap r2 = r6.f4422n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            int r5 = r0.f6423g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r4, r5)
            x5.b r11 = new x5.b
            r11.<init>()
            q1.d r12 = r0.f6418a
            int r2 = r12.ordinal()
            x5.b$a r13 = x5.b.a.f8137i
            x5.b$a r4 = x5.b.a.f8136h
            switch(r2) {
                case 0: goto L_0x014f;
                case 1: goto L_0x014f;
                case 2: goto L_0x014f;
                case 3: goto L_0x0134;
                case 4: goto L_0x0117;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00a2;
                case 9: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x018c
        L_0x0089:
            r10 = r0
            q1.o r10 = (q1.o) r10
            q1.l r0 = r10.f6479l
            r15.v(r11, r7, r0, r1)
            q1.c r5 = r10.f6477j
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r5
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
            q1.c r0 = r10.f6478k
            goto L_0x014b
        L_0x00a2:
            q1.q r0 = (q1.q) r0
            x5.b$a r2 = x5.b.a.f8140l
            android.graphics.drawable.Icon r3 = r0.f6482j
            if (r3 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00b1
            r15.r(r7, r2, r3)
            goto L_0x018c
        L_0x00b1:
            w5.f r1 = new w5.f
            android.graphics.drawable.Icon r0 = r0.f6482j
            android.graphics.drawable.Drawable r0 = r15.q(r0)
            r1.<init>((java.lang.Object) r0)
            goto L_0x00bf
        L_0x00bd:
            w5.f r1 = w5.f.f8063k
        L_0x00bf:
            r11.a(r2, r1)
            goto L_0x018c
        L_0x00c4:
            q1.v r0 = (q1.v) r0
            q1.u r0 = r0.f6507j
            r15.w(r11, r7, r0, r1)
            goto L_0x018c
        L_0x00cd:
            q1.m r0 = (q1.m) r0
            q1.l r0 = r0.f6472j
            r15.v(r11, r7, r0, r1)
            goto L_0x018c
        L_0x00d6:
            r10 = r0
            q1.s r10 = (q1.s) r10
            q1.l r0 = r10.f6490n
            r15.v(r11, r7, r0, r1)
            q1.c r5 = r10.f6493q
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r5
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
            q1.c r4 = r10.f6492p
            r3 = r13
            r0.x(r1, r2, r3, r4, r5)
            x5.b$a r0 = x5.b.a.f8141m
            w5.f r1 = new w5.f
            float r2 = r10.f6488l
            r1.<init>((float) r2)
            r11.a(r0, r1)
            x5.b$a r0 = x5.b.a.f8142n
            w5.f r1 = new w5.f
            float r2 = r10.f6489m
            r1.<init>((float) r2)
            r11.a(r0, r1)
            x5.b$a r0 = x5.b.a.f8143o
            w5.f r1 = new w5.f
            float r2 = r10.f6486j
            r1.<init>((float) r2)
            r11.a(r0, r1)
            goto L_0x018c
        L_0x0117:
            r10 = r0
            q1.k r10 = (q1.k) r10
            q1.l r0 = r10.f6465l
            r15.v(r11, r7, r0, r1)
            q1.u r0 = r10.f6466m
            r15.w(r11, r7, r0, r1)
            q1.c r5 = r10.f6463j
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r5
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
            q1.c r0 = r10.f6464k
            goto L_0x014b
        L_0x0134:
            r10 = r0
            q1.t r10 = (q1.t) r10
            q1.l r0 = r10.f6499l
            r15.v(r11, r7, r0, r1)
            q1.c r5 = r10.f6497j
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r5
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
            q1.c r0 = r10.f6498k
        L_0x014b:
            r10 = r18
            r4 = r0
            goto L_0x0182
        L_0x014f:
            boolean r2 = r0 instanceof q1.n
            if (r2 == 0) goto L_0x0174
            q1.n r0 = (q1.n) r0
            q1.b r2 = r0.f6475j
            if (r2 == 0) goto L_0x0174
            java.lang.Object[] r4 = new java.lang.Object[r10]
            q1.d r2 = r2.f6418a
            java.lang.String r2 = r2.name()
            r4[r9] = r2
            java.lang.String r2 = "Used placeholder(%s) for NoData"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            android.util.Log.i(r3, r2)
            q1.b r0 = r0.f6475j
            r10 = r18
            r15.u(r7, r0, r10, r1)
            return
        L_0x0174:
            r10 = r18
            r14 = 0
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r14
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
        L_0x0182:
            r0 = r15
            r1 = r11
            r2 = r16
            r3 = r13
            r5 = r18
            r0.x(r1, r2, r3, r4, r5)
        L_0x018c:
            x5.b$a r0 = x5.b.a.f8145q
            w5.f r1 = new w5.f
            java.lang.String r2 = r12.name()
            x5.a r2 = x5.a.valueOf(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            r11.a(r0, r1)
            q1.d r0 = q1.d.NO_PERMISSION
            x5.b$a r1 = x5.b.a.r
            if (r12 != r0) goto L_0x01d2
            w5.f r0 = new w5.f
            android.app.PendingIntent r2 = r6.f4423o
            if (r2 != 0) goto L_0x01cc
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r3 = r6.f4051d
            java.lang.Class r4 = r3.getClass()
            r2.<init>(r3, r4)
            r4 = 0
            android.content.Intent r2 = androidx.wear.watchface.ComplicationHelperActivity.h(r3, r2, r4, r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r2 = r2.addFlags(r4)
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r3, r9, r2, r4)
            r6.f4423o = r2
        L_0x01cc:
            android.app.PendingIntent r2 = r6.f4423o
            r0.<init>((java.lang.Object) r2)
            goto L_0x01d7
        L_0x01d2:
            w5.f r0 = new w5.f
            r0.<init>((java.lang.Object) r8)
        L_0x01d7:
            r11.a(r1, r0)
            java.util.HashMap r0 = r11.f8133a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01e4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0211
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            e6.b r2 = r6.f4259k
            java.lang.Object r3 = r1.getKey()
            x5.b$a r3 = (x5.b.a) r3
            java.lang.String r3 = r3.name()
            e6.e r2 = r2.a(r7, r3)
            java.lang.Object r1 = r1.getValue()
            w5.f r1 = (w5.f) r1
            java.util.HashMap r3 = r6.f4258j
            r3.put(r2, r1)
            java.lang.String r2 = r2.f4261a
            r15.g(r2, r1, r9)
            goto L_0x01e4
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.a.u(int, q1.b, java.time.Instant, boolean):void");
    }

    @SuppressLint({"RestrictedApi"})
    public final void v(b bVar, int i8, l lVar, boolean z8) {
        b.a aVar = b.a.f8135g;
        b.a aVar2 = b.a.f8134f;
        if (lVar != null) {
            Icon icon = lVar.f6470a;
            if (!j.a(icon)) {
                Icon icon2 = lVar.f6471b;
                if (z8) {
                    r(i8, aVar2, icon2);
                    r(i8, aVar, icon);
                    return;
                }
                bVar.a(aVar2, new f((Object) q(icon2)));
                bVar.a(aVar, new f((Object) q(icon)));
                return;
            }
        }
        f fVar = f.f8063k;
        bVar.a(aVar2, fVar);
        bVar.a(aVar, fVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void w(b bVar, int i8, u uVar, boolean z8) {
        b.a aVar = b.a.f8139k;
        b.a aVar2 = b.a.f8138j;
        if (uVar != null) {
            Icon icon = uVar.f6504a;
            if (!j.a(icon)) {
                Icon icon2 = uVar.f6506c;
                if (z8) {
                    r(i8, aVar2, icon2);
                    r(i8, aVar, icon);
                } else {
                    bVar.a(aVar2, new f((Object) q(icon2)));
                    bVar.a(aVar, new f((Object) q(icon)));
                }
                b.a aVar3 = b.a.f8144p;
                int i9 = 2;
                if (uVar.f6505b == 2) {
                    i9 = 1;
                }
                bVar.a(aVar3, new f(i9));
                return;
            }
        }
        f fVar = f.f8063k;
        bVar.a(aVar2, fVar);
        bVar.a(aVar, fVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void x(b bVar, int i8, b.a aVar, c cVar, Instant instant) {
        Instant instant2;
        if (cVar == null || !cVar.e()) {
            String valueOf = cVar == null ? "" : String.valueOf(cVar.b(this.f4051d.getResources(), instant));
            bVar.a(aVar, new f(valueOf));
            e a9 = this.f4259k.a(i8, aVar.name());
            HashMap hashMap = this.f4421m;
            HashMap hashMap2 = this.f4420l;
            if (cVar == null || !(!f4419p.equals(cVar.d(instant)))) {
                if (hashMap2.containsKey(a9)) {
                    hashMap2.remove(a9);
                    hashMap.remove(a9);
                }
                instant2 = null;
            } else {
                hashMap2.put(a9, cVar);
                instant2 = cVar.d(instant);
                hashMap.put(a9, instant2);
            }
            String format = String.format(Locale.getDefault(), "%d:%s", new Object[]{Integer.valueOf(i8), aVar});
            if (cVar == null) {
                valueOf = "/EMPTY/";
            }
            t(format, valueOf, instant2);
            return;
        }
        bVar.a(aVar, f.f8062j);
    }
}
