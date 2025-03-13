package com.samsung.android.wearable.watchfacestudio;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.health.services.client.impl.d;
import com.samsung.android.wearable.watchfacestudio.editor.q;
import g5.i;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import n1.b0;
import n1.e;
import n1.i0;
import n1.j0;
import n1.j1;
import n1.w;
import o6.t;
import q1.n;
import q7.k;
import r5.h;
import t1.f;
import u1.l;

public class WatchFaceStudioRuntime extends w {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f3833j = 0;
    public h e;

    /* renamed from: f  reason: collision with root package name */
    public f7.a f3834f;

    /* renamed from: g  reason: collision with root package name */
    public a f3835g;

    /* renamed from: h  reason: collision with root package name */
    public q5.a f3836h;

    /* renamed from: i  reason: collision with root package name */
    public Map<Integer, b> f3837i = new HashMap();

    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f3838a;

        /* renamed from: b  reason: collision with root package name */
        public q1.b f3839b = new n();

        public a(int i8) {
            this.f3838a = i8;
        }

        public final q1.b a() {
            return this.f3839b;
        }

        public final void b(b0 b0Var) {
        }

        public final void c(q1.b bVar, boolean z8) {
            WatchFaceStudioRuntime watchFaceStudioRuntime = WatchFaceStudioRuntime.this;
            Log.i("DWF:WatchFaceStudioRuntime", String.format("CanvasComplication loadData: runtime: %s", new Object[]{watchFaceStudioRuntime}));
            this.f3839b = bVar;
            Map<Integer, b> map = watchFaceStudioRuntime.f3837i;
            int i8 = this.f3838a;
            if (map != null) {
                map.put(Integer.valueOf(i8), new b(this.f3839b, z8));
            }
            watchFaceStudioRuntime.f3834f.u(i8, this.f3839b, Instant.now(), z8);
        }

        public final void d() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final q1.b f3841a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3842b;

        public b(q1.b bVar, boolean z8) {
            this.f3841a = bVar;
            this.f3842b = z8;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0253, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025a, code lost:
        if (r10.equals("STEP_COUNT") != false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025d, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0264, code lost:
        if (r10.equals("UNREAD_NOTIFICATION_COUNT") != false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0267, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026e, code lost:
        if (r10.equals("WORLD_CLOCK") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0271, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0278, code lost:
        if (r10.equals("EMPTY") != false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x027b, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0281, code lost:
        if (r10.equals("DATE") != false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0284, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028a, code lost:
        if (r10.equals("FAVORITE_CONTACT") != false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028d, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0293, code lost:
        if (r10.equals("APP_SHORTCUT") != false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0297, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029d, code lost:
        if (r10.equals("DAY_AND_DATE") != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a1, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a2, code lost:
        switch(r3) {
            case 0: goto L_0x02e4;
            case 1: goto L_0x02df;
            case 2: goto L_0x02dc;
            case 3: goto L_0x02da;
            case 4: goto L_0x02d5;
            case 5: goto L_0x02d0;
            case 6: goto L_0x02cb;
            case 7: goto L_0x02c4;
            case 8: goto L_0x02c2;
            case 9: goto L_0x02bd;
            case 10: goto L_0x02bb;
            case 11: goto L_0x02b6;
            case 12: goto L_0x02b3;
            default: goto L_0x02a5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a5, code lost:
        android.util.Log.w("DWF:ComplicationTypeConverter", "convertSystemProvider: not supported: ".concat(r10));
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b3, code lost:
        r3 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b6, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bb, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02bd, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c2, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02c4, code lost:
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c5, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02cb, code lost:
        r3 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d0, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d5, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02da, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02dc, code lost:
        r3 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02df, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e4, code lost:
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e6, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ea, code lost:
        if (r3 != null) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ec, code lost:
        r3 = r10.split("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f4, code lost:
        if (r3.length >= 2) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f7, code lost:
        r6 = r3[0];
        r3 = r3[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fd, code lost:
        if (r6 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ff, code lost:
        if (r3 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0301, code lost:
        r1 = new android.content.ComponentName(r6, r3);
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0308, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x030a, code lost:
        r3.intValue();
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x030f, code lost:
        if (r0 != 3) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0311, code lost:
        if (r3 != 3) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0313, code lost:
        r30 = new p1.g(r12, a1.a.n(r9.f8154i), r1, a1.a.n(r9.f8156k), r9.f8150d.f8158a, a1.a.n(r9.f8151f));
        android.util.Log.i("DWF:WatchFaceStudioRuntime", "complication primaryProvider : " + r12);
        r3 = new java.lang.StringBuilder("complication secondProvider : ");
        r3.append(r1);
        r28 = r30;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0356, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e9, code lost:
        r12 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x041f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0440, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0444, code lost:
        if (r3 != null) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0446, code lost:
        r1 = r1.split("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x044e, code lost:
        if (r1.length >= 2) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0450, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0452, code lost:
        r5 = 0;
        r3 = r1[0];
        r1 = r1[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0458, code lost:
        if (r3 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x045a, code lost:
        if (r1 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x045c, code lost:
        r0 = new android.content.ComponentName(r3, r1);
        r1 = 3;
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0464, code lost:
        r1 = 3;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0467, code lost:
        r5 = 0;
        r3.intValue();
        r1 = 3;
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x046d, code lost:
        if (r11 != r1) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x046f, code lost:
        r1 = new p1.g(r0, a1.a.n(r9.f8154i), r9.f8150d.f8158a, a1.a.n(r9.f8151f));
        r3 = new java.lang.StringBuilder("complication primaryProvider : ");
        r3.append(r0);
        r28 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0196, code lost:
        switch(r12) {
            case 0: goto L_0x01d8;
            case 1: goto L_0x01d3;
            case 2: goto L_0x01d0;
            case 3: goto L_0x01ce;
            case 4: goto L_0x01c9;
            case 5: goto L_0x01c4;
            case 6: goto L_0x01bf;
            case 7: goto L_0x01b8;
            case 8: goto L_0x01b6;
            case 9: goto L_0x01b1;
            case 10: goto L_0x01af;
            case 11: goto L_0x01aa;
            case 12: goto L_0x01a7;
            default: goto L_0x0199;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0199, code lost:
        android.util.Log.w("DWF:ComplicationTypeConverter", "convertSystemProvider: not supported: ".concat(r1));
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a7, code lost:
        r0 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01aa, code lost:
        r0 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01af, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b1, code lost:
        r0 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b6, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b9, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01bf, code lost:
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c4, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c9, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ce, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d0, code lost:
        r0 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d3, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d8, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01da, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01de, code lost:
        if (r0 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e0, code lost:
        r0 = r1.split("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        if (r0.length >= 2) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01eb, code lost:
        r12 = r0[0];
        r0 = r0[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f1, code lost:
        if (r12 == null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f3, code lost:
        if (r0 == null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f5, code lost:
        r12 = new android.content.ComponentName(r12, r0);
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fd, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        r0.intValue();
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0203, code lost:
        r12 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0205, code lost:
        r1 = new android.content.ComponentName("", "");
        r10.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0211, code lost:
        switch(r10.hashCode()) {
            case -1008373095: goto L_0x0299;
            case -232312636: goto L_0x028f;
            case -196823971: goto L_0x0286;
            case 2090926: goto L_0x027d;
            case 66096429: goto L_0x0274;
            case 71273697: goto L_0x026a;
            case 76454699: goto L_0x0260;
            case 131690940: goto L_0x0256;
            case 307714664: goto L_0x024c;
            case 467017262: goto L_0x023f;
            case 599887453: goto L_0x0232;
            case 1686257440: goto L_0x0225;
            case 2074232729: goto L_0x0218;
            default: goto L_0x0214;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0214, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021e, code lost:
        if (r10.equals("DAY_OF_WEEK") != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0221, code lost:
        r3 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022b, code lost:
        if (r10.equals("SUNRISE_SUNSET") != false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022e, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0238, code lost:
        if (r10.equals("WATCH_BATTERY") != false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x023b, code lost:
        r3 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0245, code lost:
        if (r10.equals("NEXT_EVENT") != false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0248, code lost:
        r3 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0250, code lost:
        if (r10.equals("TIME_AND_DATE") != false) goto L_0x0253;
     */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0626  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n1.l a(u1.b r45) {
        /*
            r44 = this;
            r0 = r44
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r4 = "createComplicationSlotsManager: runtime: %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r4 = "DWF:WatchFaceStudioRuntime"
            android.util.Log.i(r4, r2)
            r5.h r2 = r0.e
            if (r2 == 0) goto L_0x0018
            goto L_0x001f
        L_0x0018:
            r5.h r2 = new r5.h
            r2.<init>(r0)
            r0.e = r2
        L_0x001f:
            f7.a r2 = new f7.a
            r2.<init>(r0)
            r0.f3834f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.h r5 = r0.e
            java.util.List r5 = r5.a()
            r5.h r6 = r0.e
            i6.h r6 = r6.f7088a
            java.util.ArrayList r6 = r6.a()
            java.util.stream.Stream r6 = r6.stream()
            r5.g r7 = new r5.g
            java.lang.String r8 = "[STEP_"
            r7.<init>(r3, r8)
            boolean r6 = r6.anyMatch(r7)
            if (r6 == 0) goto L_0x0052
            x5.c r6 = i5.a.f4841a
            r7 = r5
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r6)
        L_0x0052:
            i5.j r6 = new i5.j
            r6.<init>(r3)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.forEach(r6)
            e6.b r6 = new e6.b
            r6.<init>()
            r5.h r7 = r0.e
            g6.c r7 = r7.c()
            int r7 = r7.e
            r5.h r8 = r0.e
            g6.c r8 = r8.c()
            int r8 = r8.f4674f
            java.util.Iterator r5 = r5.iterator()
        L_0x0075:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x063d
            java.lang.Object r9 = r5.next()
            x5.c r9 = (x5.c) r9
            y5.e r10 = r9.f8157l
            android.graphics.RectF r10 = r10.f()
            android.graphics.RectF r11 = new android.graphics.RectF
            float r12 = r10.left
            float r13 = (float) r7
            float r12 = r12 / r13
            float r14 = r10.top
            float r15 = (float) r8
            float r14 = r14 / r15
            float r1 = r10.right
            float r1 = r1 / r13
            float r10 = r10.bottom
            float r10 = r10 / r15
            r11.<init>(r12, r14, r1, r10)
            java.lang.String r1 = r9.f8153h
            java.lang.String r10 = r9.f8155j
            boolean r12 = n6.g.d(r1)
            java.lang.String r14 = "TIME_AND_DATE"
            java.lang.String r15 = "STEP_COUNT"
            java.lang.String r13 = "UNREAD_NOTIFICATION_COUNT"
            java.lang.String r3 = "WORLD_CLOCK"
            r16 = r5
            java.lang.String r5 = "DATE"
            r17 = r7
            java.lang.String r7 = "FAVORITE_CONTACT"
            r18 = r8
            java.lang.String r8 = "APP_SHORTCUT"
            r19 = r6
            java.lang.String r6 = "DAY_AND_DATE"
            r20 = r2
            java.lang.String r2 = "EMPTY"
            r21 = -1
            r22 = 5
            r23 = 6
            r24 = 7
            r25 = 9
            r26 = 12
            r27 = r11
            java.lang.String r11 = ""
            r28 = 0
            if (r12 == 0) goto L_0x0359
            boolean r12 = n6.g.d(r10)
            if (r12 == 0) goto L_0x0359
            android.content.ComponentName r12 = new android.content.ComponentName
            r12.<init>(r11, r11)
            r1.getClass()
            int r29 = r1.hashCode()
            switch(r29) {
                case -1008373095: goto L_0x018b;
                case -232312636: goto L_0x0180;
                case -196823971: goto L_0x0175;
                case 2090926: goto L_0x016a;
                case 66096429: goto L_0x015f;
                case 71273697: goto L_0x0153;
                case 76454699: goto L_0x0147;
                case 131690940: goto L_0x013b;
                case 307714664: goto L_0x012d;
                case 467017262: goto L_0x011d;
                case 599887453: goto L_0x010d;
                case 1686257440: goto L_0x00fd;
                case 2074232729: goto L_0x00ed;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            r29 = r12
        L_0x00e9:
            r12 = r21
            goto L_0x0196
        L_0x00ed:
            r29 = r12
            java.lang.String r12 = "DAY_OF_WEEK"
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x00f9
            goto L_0x0193
        L_0x00f9:
            r12 = r26
            goto L_0x0196
        L_0x00fd:
            r29 = r12
            java.lang.String r12 = "SUNRISE_SUNSET"
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x0109
            goto L_0x0193
        L_0x0109:
            r12 = 11
            goto L_0x0196
        L_0x010d:
            r29 = r12
            java.lang.String r12 = "WATCH_BATTERY"
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x0119
            goto L_0x0193
        L_0x0119:
            r12 = 10
            goto L_0x0196
        L_0x011d:
            r29 = r12
            java.lang.String r12 = "NEXT_EVENT"
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x0129
            goto L_0x0193
        L_0x0129:
            r12 = r25
            goto L_0x0196
        L_0x012d:
            r29 = r12
            boolean r12 = r1.equals(r14)
            if (r12 != 0) goto L_0x0137
            goto L_0x0193
        L_0x0137:
            r12 = 8
            goto L_0x0196
        L_0x013b:
            r29 = r12
            boolean r12 = r1.equals(r15)
            if (r12 != 0) goto L_0x0144
            goto L_0x0193
        L_0x0144:
            r12 = r24
            goto L_0x0196
        L_0x0147:
            r29 = r12
            boolean r12 = r1.equals(r13)
            if (r12 != 0) goto L_0x0150
            goto L_0x0193
        L_0x0150:
            r12 = r23
            goto L_0x0196
        L_0x0153:
            r29 = r12
            boolean r12 = r1.equals(r3)
            if (r12 != 0) goto L_0x015c
            goto L_0x0193
        L_0x015c:
            r12 = r22
            goto L_0x0196
        L_0x015f:
            r29 = r12
            boolean r12 = r1.equals(r2)
            if (r12 != 0) goto L_0x0168
            goto L_0x0193
        L_0x0168:
            r12 = 4
            goto L_0x0196
        L_0x016a:
            r29 = r12
            boolean r12 = r1.equals(r5)
            if (r12 != 0) goto L_0x0173
            goto L_0x0193
        L_0x0173:
            r12 = 3
            goto L_0x0196
        L_0x0175:
            r29 = r12
            boolean r12 = r1.equals(r7)
            if (r12 != 0) goto L_0x017e
            goto L_0x0193
        L_0x017e:
            r12 = 2
            goto L_0x0196
        L_0x0180:
            r29 = r12
            boolean r12 = r1.equals(r8)
            if (r12 != 0) goto L_0x0189
            goto L_0x0193
        L_0x0189:
            r12 = 1
            goto L_0x0196
        L_0x018b:
            r29 = r12
            boolean r12 = r1.equals(r6)
            if (r12 != 0) goto L_0x0195
        L_0x0193:
            goto L_0x00e9
        L_0x0195:
            r12 = 0
        L_0x0196:
            switch(r12) {
                case 0: goto L_0x01d8;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01d0;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01c9;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01bf;
                case 7: goto L_0x01b8;
                case 8: goto L_0x01b6;
                case 9: goto L_0x01b1;
                case 10: goto L_0x01af;
                case 11: goto L_0x01aa;
                case 12: goto L_0x01a7;
                default: goto L_0x0199;
            }
        L_0x0199:
            java.lang.String r12 = "convertSystemProvider: not supported: "
            java.lang.String r12 = r12.concat(r1)
            java.lang.String r0 = "DWF:ComplicationTypeConverter"
            android.util.Log.w(r0, r12)
            r0 = r28
            goto L_0x01de
        L_0x01a7:
            r0 = 13
            goto L_0x01da
        L_0x01aa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            goto L_0x01de
        L_0x01af:
            r0 = 1
            goto L_0x01da
        L_0x01b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            goto L_0x01de
        L_0x01b6:
            r0 = 3
            goto L_0x01b9
        L_0x01b8:
            r0 = 4
        L_0x01b9:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = r12
            goto L_0x01de
        L_0x01bf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            goto L_0x01de
        L_0x01c4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            goto L_0x01de
        L_0x01c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            goto L_0x01de
        L_0x01ce:
            r0 = 2
            goto L_0x01da
        L_0x01d0:
            r0 = 14
            goto L_0x01da
        L_0x01d3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            goto L_0x01de
        L_0x01d8:
            r0 = 16
        L_0x01da:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01de:
            if (r0 != 0) goto L_0x01ff
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            r12 = 2
            if (r1 >= r12) goto L_0x01eb
            goto L_0x01fd
        L_0x01eb:
            r1 = 0
            r12 = r0[r1]
            r1 = 1
            r0 = r0[r1]
            if (r12 == 0) goto L_0x01fd
            if (r0 == 0) goto L_0x01fd
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r12, r0)
            r12 = r1
            r0 = 3
            goto L_0x0205
        L_0x01fd:
            r0 = 1
            goto L_0x0203
        L_0x01ff:
            r0.intValue()
            r0 = 2
        L_0x0203:
            r12 = r29
        L_0x0205:
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r11, r11)
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1008373095: goto L_0x0299;
                case -232312636: goto L_0x028f;
                case -196823971: goto L_0x0286;
                case 2090926: goto L_0x027d;
                case 66096429: goto L_0x0274;
                case 71273697: goto L_0x026a;
                case 76454699: goto L_0x0260;
                case 131690940: goto L_0x0256;
                case 307714664: goto L_0x024c;
                case 467017262: goto L_0x023f;
                case 599887453: goto L_0x0232;
                case 1686257440: goto L_0x0225;
                case 2074232729: goto L_0x0218;
                default: goto L_0x0214;
            }
        L_0x0214:
            r3 = r21
            goto L_0x02a2
        L_0x0218:
            java.lang.String r3 = "DAY_OF_WEEK"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0221
            goto L_0x0214
        L_0x0221:
            r3 = r26
            goto L_0x02a2
        L_0x0225:
            java.lang.String r3 = "SUNRISE_SUNSET"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x022e
            goto L_0x0214
        L_0x022e:
            r3 = 11
            goto L_0x02a2
        L_0x0232:
            java.lang.String r3 = "WATCH_BATTERY"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x023b
            goto L_0x0214
        L_0x023b:
            r3 = 10
            goto L_0x02a2
        L_0x023f:
            java.lang.String r3 = "NEXT_EVENT"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0248
            goto L_0x0214
        L_0x0248:
            r3 = r25
            goto L_0x02a2
        L_0x024c:
            boolean r3 = r10.equals(r14)
            if (r3 != 0) goto L_0x0253
            goto L_0x0214
        L_0x0253:
            r3 = 8
            goto L_0x02a2
        L_0x0256:
            boolean r3 = r10.equals(r15)
            if (r3 != 0) goto L_0x025d
            goto L_0x0214
        L_0x025d:
            r3 = r24
            goto L_0x02a2
        L_0x0260:
            boolean r3 = r10.equals(r13)
            if (r3 != 0) goto L_0x0267
            goto L_0x0214
        L_0x0267:
            r3 = r23
            goto L_0x02a2
        L_0x026a:
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0271
            goto L_0x0214
        L_0x0271:
            r3 = r22
            goto L_0x02a2
        L_0x0274:
            boolean r3 = r10.equals(r2)
            if (r3 != 0) goto L_0x027b
            goto L_0x0214
        L_0x027b:
            r3 = 4
            goto L_0x02a2
        L_0x027d:
            boolean r3 = r10.equals(r5)
            if (r3 != 0) goto L_0x0284
            goto L_0x0214
        L_0x0284:
            r3 = 3
            goto L_0x02a2
        L_0x0286:
            boolean r3 = r10.equals(r7)
            if (r3 != 0) goto L_0x028d
            goto L_0x0214
        L_0x028d:
            r3 = 2
            goto L_0x02a2
        L_0x028f:
            boolean r3 = r10.equals(r8)
            if (r3 != 0) goto L_0x0297
            goto L_0x0214
        L_0x0297:
            r3 = 1
            goto L_0x02a2
        L_0x0299:
            boolean r3 = r10.equals(r6)
            if (r3 != 0) goto L_0x02a1
            goto L_0x0214
        L_0x02a1:
            r3 = 0
        L_0x02a2:
            switch(r3) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02df;
                case 2: goto L_0x02dc;
                case 3: goto L_0x02da;
                case 4: goto L_0x02d5;
                case 5: goto L_0x02d0;
                case 6: goto L_0x02cb;
                case 7: goto L_0x02c4;
                case 8: goto L_0x02c2;
                case 9: goto L_0x02bd;
                case 10: goto L_0x02bb;
                case 11: goto L_0x02b6;
                case 12: goto L_0x02b3;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            java.lang.String r3 = "convertSystemProvider: not supported: "
            java.lang.String r3 = r3.concat(r10)
            java.lang.String r5 = "DWF:ComplicationTypeConverter"
            android.util.Log.w(r5, r3)
            r3 = r28
            goto L_0x02ea
        L_0x02b3:
            r3 = 13
            goto L_0x02e6
        L_0x02b6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            goto L_0x02ea
        L_0x02bb:
            r3 = 1
            goto L_0x02e6
        L_0x02bd:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)
            goto L_0x02ea
        L_0x02c2:
            r3 = 3
            goto L_0x02c5
        L_0x02c4:
            r3 = 4
        L_0x02c5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r3 = r5
            goto L_0x02ea
        L_0x02cb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            goto L_0x02ea
        L_0x02d0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            goto L_0x02ea
        L_0x02d5:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            goto L_0x02ea
        L_0x02da:
            r3 = 2
            goto L_0x02e6
        L_0x02dc:
            r3 = 14
            goto L_0x02e6
        L_0x02df:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            goto L_0x02ea
        L_0x02e4:
            r3 = 16
        L_0x02e6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x02ea:
            if (r3 != 0) goto L_0x030a
            java.lang.String r3 = "/"
            java.lang.String[] r3 = r10.split(r3)
            int r5 = r3.length
            r6 = 2
            if (r5 >= r6) goto L_0x02f7
            goto L_0x0308
        L_0x02f7:
            r5 = 0
            r6 = r3[r5]
            r5 = 1
            r3 = r3[r5]
            if (r6 == 0) goto L_0x0308
            if (r3 == 0) goto L_0x0308
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r6, r3)
            r3 = 3
            goto L_0x030e
        L_0x0308:
            r3 = 1
            goto L_0x030e
        L_0x030a:
            r3.intValue()
            r3 = 2
        L_0x030e:
            r5 = 3
            if (r0 != r5) goto L_0x0356
            if (r3 != r5) goto L_0x0356
            p1.g r0 = new p1.g
            x5.a r3 = r9.f8154i
            q1.d r32 = a1.a.n(r3)
            x5.a r3 = r9.f8156k
            q1.d r34 = a1.a.n(r3)
            x5.d r3 = r9.f8150d
            int r3 = r3.f8158a
            x5.a r5 = r9.f8151f
            q1.d r36 = a1.a.n(r5)
            r30 = r0
            r31 = r12
            r33 = r1
            r35 = r3
            r30.<init>(r31, r32, r33, r34, r35, r36)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "complication primaryProvider : "
            r3.<init>(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "complication secondProvider : "
            r3.<init>(r5)
            r3.append(r1)
            r28 = r0
            r5 = 0
            goto L_0x0490
        L_0x0356:
            r5 = 0
            goto L_0x04c3
        L_0x0359:
            boolean r0 = n6.g.d(r1)
            if (r0 == 0) goto L_0x0498
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r11, r11)
            r1.getClass()
            int r10 = r1.hashCode()
            switch(r10) {
                case -1008373095: goto L_0x03f3;
                case -232312636: goto L_0x03e9;
                case -196823971: goto L_0x03e0;
                case 2090926: goto L_0x03d7;
                case 66096429: goto L_0x03ce;
                case 71273697: goto L_0x03c4;
                case 76454699: goto L_0x03ba;
                case 131690940: goto L_0x03b0;
                case 307714664: goto L_0x03a6;
                case 467017262: goto L_0x0399;
                case 599887453: goto L_0x038c;
                case 1686257440: goto L_0x037f;
                case 2074232729: goto L_0x0372;
                default: goto L_0x036e;
            }
        L_0x036e:
            r3 = r21
            goto L_0x03fc
        L_0x0372:
            java.lang.String r3 = "DAY_OF_WEEK"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x037b
            goto L_0x036e
        L_0x037b:
            r3 = r26
            goto L_0x03fc
        L_0x037f:
            java.lang.String r3 = "SUNRISE_SUNSET"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0388
            goto L_0x036e
        L_0x0388:
            r3 = 11
            goto L_0x03fc
        L_0x038c:
            java.lang.String r3 = "WATCH_BATTERY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0395
            goto L_0x036e
        L_0x0395:
            r3 = 10
            goto L_0x03fc
        L_0x0399:
            java.lang.String r3 = "NEXT_EVENT"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x03a2
            goto L_0x036e
        L_0x03a2:
            r3 = r25
            goto L_0x03fc
        L_0x03a6:
            boolean r3 = r1.equals(r14)
            if (r3 != 0) goto L_0x03ad
            goto L_0x036e
        L_0x03ad:
            r3 = 8
            goto L_0x03fc
        L_0x03b0:
            boolean r3 = r1.equals(r15)
            if (r3 != 0) goto L_0x03b7
            goto L_0x036e
        L_0x03b7:
            r3 = r24
            goto L_0x03fc
        L_0x03ba:
            boolean r3 = r1.equals(r13)
            if (r3 != 0) goto L_0x03c1
            goto L_0x036e
        L_0x03c1:
            r3 = r23
            goto L_0x03fc
        L_0x03c4:
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x03cb
            goto L_0x036e
        L_0x03cb:
            r3 = r22
            goto L_0x03fc
        L_0x03ce:
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L_0x03d5
            goto L_0x036e
        L_0x03d5:
            r3 = 4
            goto L_0x03fc
        L_0x03d7:
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L_0x03de
            goto L_0x036e
        L_0x03de:
            r3 = 3
            goto L_0x03fc
        L_0x03e0:
            boolean r3 = r1.equals(r7)
            if (r3 != 0) goto L_0x03e7
            goto L_0x036e
        L_0x03e7:
            r3 = 2
            goto L_0x03fc
        L_0x03e9:
            boolean r3 = r1.equals(r8)
            if (r3 != 0) goto L_0x03f1
            goto L_0x036e
        L_0x03f1:
            r3 = 1
            goto L_0x03fc
        L_0x03f3:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x03fb
            goto L_0x036e
        L_0x03fb:
            r3 = 0
        L_0x03fc:
            switch(r3) {
                case 0: goto L_0x043e;
                case 1: goto L_0x0439;
                case 2: goto L_0x0436;
                case 3: goto L_0x0434;
                case 4: goto L_0x042f;
                case 5: goto L_0x042a;
                case 6: goto L_0x0425;
                case 7: goto L_0x041e;
                case 8: goto L_0x041c;
                case 9: goto L_0x0417;
                case 10: goto L_0x0415;
                case 11: goto L_0x0410;
                case 12: goto L_0x040d;
                default: goto L_0x03ff;
            }
        L_0x03ff:
            java.lang.String r3 = "convertSystemProvider: not supported: "
            java.lang.String r3 = r3.concat(r1)
            java.lang.String r5 = "DWF:ComplicationTypeConverter"
            android.util.Log.w(r5, r3)
            r3 = r28
            goto L_0x0444
        L_0x040d:
            r3 = 13
            goto L_0x0440
        L_0x0410:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            goto L_0x0444
        L_0x0415:
            r3 = 1
            goto L_0x0440
        L_0x0417:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)
            goto L_0x0444
        L_0x041c:
            r3 = 3
            goto L_0x041f
        L_0x041e:
            r3 = 4
        L_0x041f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r3 = r5
            goto L_0x0444
        L_0x0425:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            goto L_0x0444
        L_0x042a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            goto L_0x0444
        L_0x042f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            goto L_0x0444
        L_0x0434:
            r3 = 2
            goto L_0x0440
        L_0x0436:
            r3 = 14
            goto L_0x0440
        L_0x0439:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            goto L_0x0444
        L_0x043e:
            r3 = 16
        L_0x0440:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0444:
            if (r3 != 0) goto L_0x0467
            java.lang.String r3 = "/"
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r5 = 2
            if (r3 >= r5) goto L_0x0452
            r5 = 0
            goto L_0x0464
        L_0x0452:
            r5 = 0
            r3 = r1[r5]
            r6 = 1
            r1 = r1[r6]
            if (r3 == 0) goto L_0x0464
            if (r1 == 0) goto L_0x0464
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r3, r1)
            r1 = 3
            r11 = 3
            goto L_0x046d
        L_0x0464:
            r1 = 3
            r11 = 1
            goto L_0x046d
        L_0x0467:
            r5 = 0
            r3.intValue()
            r1 = 3
            r11 = 2
        L_0x046d:
            if (r11 != r1) goto L_0x04c3
            p1.g r1 = new p1.g
            x5.a r3 = r9.f8154i
            q1.d r3 = a1.a.n(r3)
            x5.d r6 = r9.f8150d
            int r6 = r6.f8158a
            x5.a r7 = r9.f8151f
            q1.d r7 = a1.a.n(r7)
            r1.<init>(r0, r3, r6, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "complication primaryProvider : "
            r3.<init>(r6)
            r3.append(r0)
            r28 = r1
        L_0x0490:
            java.lang.String r0 = r3.toString()
            android.util.Log.i(r4, r0)
            goto L_0x04c3
        L_0x0498:
            r5 = 0
            x5.d r0 = r9.f8150d
            int r1 = r0.f8160c
            r3 = 2
            if (r1 != r3) goto L_0x04c3
            p1.g r1 = new p1.g
            int r0 = r0.f8158a
            x5.a r3 = r9.f8151f
            q1.d r3 = a1.a.n(r3)
            r1.<init>(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "complication defaultProvider : "
            r0.<init>(r3)
            x5.d r3 = r9.f8150d
            int r3 = r3.f8158a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r4, r0)
            goto L_0x04c5
        L_0x04c3:
            r1 = r28
        L_0x04c5:
            if (r1 == 0) goto L_0x0626
            int r0 = r9.f8147a
            androidx.health.services.client.impl.c r3 = new androidx.health.services.client.impl.c
            r7 = 4
            r6 = r44
            r3.<init>(r6, r7, r9)
            java.util.ArrayList r7 = r9.f8149c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x04dc:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x04f0
            java.lang.Object r10 = r7.next()
            x5.a r10 = (x5.a) r10
            q1.d r10 = a1.a.n(r10)
            r8.add(r10)
            goto L_0x04dc
        L_0x04f0:
            r32 = 0
            p1.f r7 = new p1.f
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>()
            q1.d[] r11 = q1.d.values()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            int r13 = r11.length
            int r13 = a1.a.C(r13)
            r14 = 16
            if (r13 >= r14) goto L_0x050a
            r13 = 16
        L_0x050a:
            r12.<init>(r13)
            int r13 = r11.length
            r14 = r5
        L_0x050f:
            if (r14 >= r13) goto L_0x051c
            r15 = r11[r14]
            r5 = r27
            r12.put(r15, r5)
            int r14 = r14 + 1
            r5 = 0
            goto L_0x050f
        L_0x051c:
            q1.d[] r5 = q1.d.values()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r13 = r5.length
            int r13 = a1.a.C(r13)
            r14 = 16
            if (r13 >= r14) goto L_0x052c
            goto L_0x052d
        L_0x052c:
            r14 = r13
        L_0x052d:
            r11.<init>(r14)
            int r13 = r5.length
            r14 = 0
        L_0x0532:
            if (r14 >= r13) goto L_0x053c
            r15 = r5[r14]
            r11.put(r15, r10)
            int r14 = r14 + 1
            goto L_0x0532
        L_0x053c:
            r7.<init>(r12, r11)
            a1.a r41 = new a1.a
            r41.<init>()
            r42 = 0
            q1.d r5 = q1.d.NOT_CONFIGURED
            r38 = 1
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            q7.k.d(r10, r2)
            if (r0 < 0) goto L_0x0554
            r2 = r38
            goto L_0x0555
        L_0x0554:
            r2 = 0
        L_0x0555:
            if (r2 == 0) goto L_0x061a
            boolean r2 = r9.f8152g
            r11 = 1
            r40 = r2 ^ 1
            q1.d r2 = r1.f6290b
            if (r2 == 0) goto L_0x0569
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0567
            goto L_0x0569
        L_0x0567:
            r2 = 0
            goto L_0x056a
        L_0x0569:
            r2 = r11
        L_0x056a:
            java.lang.String r12 = " must be in the supportedTypes list: "
            if (r2 == 0) goto L_0x05fa
            q1.d r2 = r1.f6292d
            if (r2 == 0) goto L_0x057b
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0579
            goto L_0x057b
        L_0x0579:
            r2 = 0
            goto L_0x057c
        L_0x057b:
            r2 = r11
        L_0x057c:
            if (r2 == 0) goto L_0x05da
            q1.d r2 = r1.f6293f
            if (r2 == r5) goto L_0x058b
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0589
            goto L_0x058b
        L_0x0589:
            r2 = 0
            goto L_0x058c
        L_0x058b:
            r2 = r11
        L_0x058c:
            if (r2 == 0) goto L_0x05ba
            n1.h r2 = new n1.h
            r29 = r2
            r30 = r0
            r31 = r0
            r33 = r7
            r34 = r3
            r35 = r8
            r36 = r1
            r37 = r5
            r39 = r10
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r0 = r20
            r0.add(r2)
            r2 = r19
            java.util.HashMap r1 = r2.f4255a
            int r3 = r9.f8147a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = r9.f8148b
            r1.put(r3, r5)
            goto L_0x062d
        L_0x05ba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "defaultDataSourcePolicy.systemDataSourceFallbackDefaultType "
            r0.<init>(r2)
            q1.d r1 = r1.f6293f
            r0.append(r1)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x05da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "defaultDataSourcePolicy.secondaryDataSourceDefaultType "
            r0.<init>(r2)
            q1.d r1 = r1.f6292d
            r0.append(r1)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x05fa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "defaultDataSourcePolicy.primaryDataSourceDefaultType "
            r0.<init>(r2)
            q1.d r1 = r1.f6290b
            r0.append(r1)
            r0.append(r12)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x061a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "id must be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0626:
            r6 = r44
            r2 = r19
            r0 = r20
            r11 = 1
        L_0x062d:
            r1 = r11
            r5 = r16
            r7 = r17
            r8 = r18
            r3 = 0
            r43 = r2
            r2 = r0
            r0 = r6
            r6 = r43
            goto L_0x0075
        L_0x063d:
            r43 = r6
            r6 = r0
            r0 = r2
            r2 = r43
            java.util.HashMap r1 = r2.f4255a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0650
            f7.a r1 = r6.f3834f
            r1.f4259k = r2
            goto L_0x0655
        L_0x0650:
            java.lang.String r1 = "no complication"
            android.util.Log.i(r4, r1)
        L_0x0655:
            n1.l r1 = new n1.l
            r2 = r45
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.WatchFaceStudioRuntime.a(u1.b):n1.l");
    }

    public final l b() {
        if (this.f3836h == null) {
            if (this.e == null) {
                this.e = new h(this);
            }
            this.f3836h = new q5.a(this.e);
        }
        return this.f3836h.f6609c.f7605a;
    }

    @SuppressLint({"RestrictedApi"})
    public final i l(SurfaceHolder surfaceHolder, j1 j1Var, n1.l lVar, u1.b bVar) {
        j1 j1Var2 = j1Var;
        boolean z8 = true;
        Log.i("DWF:WatchFaceStudioRuntime", String.format("createWatchFaceFuture: headless(%s), runtime: %s", new Object[]{Boolean.valueOf(j1Var2.f5639j), this}));
        if (this.e == null) {
            this.e = new h(this);
        }
        f fVar = this.e.f7096j;
        this.f3835g = new a(this, surfaceHolder, lVar, bVar, j1Var, this.e, this.f3834f, new c(this, j1Var2));
        String str = Build.FINGERPRINT;
        if (!str.startsWith("google/sdk_gwear") && !str.startsWith("samsung")) {
            z8 = false;
        }
        if (z8) {
            this.f3835g.getClass();
            r5.e.f7070o = 0;
        }
        i0 i0Var = new i0(((String) fVar.f7428c).equals("DIGITAL") ? 1 : 0, this.f3835g);
        i0Var.f5615c = new androidx.health.services.client.impl.i(2, this);
        Instant instant = (Instant) fVar.f7429d;
        if (instant != null) {
            k.e(instant, "previewReferenceTimeMillis");
            i0Var.f5617f = instant;
        }
        return new i(i0Var);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        j0 j0Var;
        Log.i("DWF:WatchFaceStudioRuntime", "onConfigurationChanged: " + configuration.toString());
        a aVar = this.f3835g;
        t tVar = aVar.y.f7110h.f7238b.f6183d;
        tVar.getClass();
        tVar.m(new d(12), new q(16));
        if ((!aVar.A.booleanValue() || aVar.D.f3853a) && (j0Var = aVar.e) != null) {
            j0Var.f();
        }
    }
}
