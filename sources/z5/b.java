package z5;

import a6.a;
import java.util.ArrayList;
import java.util.HashSet;
import s.g;
import w5.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f8699a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8700b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8701c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f8702d;

    public b() {
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:33|34|35|36|37|38) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00cf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r11, v5.b r12, w5.i r13) {
        /*
            r10 = this;
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f8700b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f8701c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f8702d = r0
            r10.f8699a = r11
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = "+-*/%!&|=><()?:,~\""
            r2 = 1
            r0.<init>(r11, r1, r2)
            r11 = 0
        L_0x0023:
            boolean r3 = r0.hasMoreTokens()
            r4 = 0
            if (r3 == 0) goto L_0x0175
            java.lang.String r3 = r0.nextToken(r1)
            java.lang.String r3 = r3.trim()
            java.lang.String r5 = "\""
            boolean r6 = r3.equals(r5)
            java.util.ArrayList r7 = r10.f8700b
            if (r6 == 0) goto L_0x005f
            java.lang.String r3 = ""
            java.lang.String r4 = r0.nextToken(r5)     // Catch:{ NoSuchElementException -> 0x0056 }
            boolean r6 = r4.equals(r5)     // Catch:{ NoSuchElementException -> 0x0056 }
            if (r6 == 0) goto L_0x004a
            r4 = r3
            goto L_0x004d
        L_0x004a:
            r0.nextToken(r5)     // Catch:{ NoSuchElementException -> 0x0056 }
        L_0x004d:
            a6.m r5 = new a6.m     // Catch:{ NoSuchElementException -> 0x0056 }
            r5.<init>(r4)     // Catch:{ NoSuchElementException -> 0x0056 }
            r7.add(r5)     // Catch:{ NoSuchElementException -> 0x0056 }
            goto L_0x0023
        L_0x0056:
            a6.m r4 = new a6.m
            r4.<init>(r3)
            r7.add(r4)
            goto L_0x0023
        L_0x005f:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0066
            goto L_0x0023
        L_0x0066:
            java.lang.String r5 = "["
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = "]"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L_0x0078
            r5 = r2
            goto L_0x0079
        L_0x0078:
            r5 = r4
        L_0x0079:
            if (r5 == 0) goto L_0x0082
            a6.d r5 = new a6.d
            r5.<init>(r3, r12, r13)
            goto L_0x013a
        L_0x0082:
            java.lang.String r5 = r3.substring(r4, r2)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0093
            a6.l r5 = new a6.l
            r5.<init>(r11, r3)
            goto L_0x013a
        L_0x0093:
            java.util.List<java.lang.String> r5 = a6.h.f182f
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x00a2
            a6.h r5 = new a6.h
            r5.<init>(r3, r12, r13)
            goto L_0x013a
        L_0x00a2:
            java.util.List<java.lang.String> r5 = a6.g.f180c
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x00b1
            a6.g r5 = new a6.g
            r5.<init>(r3)
            goto L_0x013a
        L_0x00b1:
            a6.i r5 = new a6.i     // Catch:{ NumberFormatException -> 0x00c0 }
            int r6 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00c0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00c0 }
            r5.<init>(r6)     // Catch:{ NumberFormatException -> 0x00c0 }
            goto L_0x013a
        L_0x00c0:
            a6.j r5 = new a6.j     // Catch:{ NumberFormatException -> 0x00cf }
            long r8 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x00cf }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00cf }
            r5.<init>(r6)     // Catch:{ NumberFormatException -> 0x00cf }
            goto L_0x013a
        L_0x00cf:
            a6.e r5 = new a6.e     // Catch:{ NumberFormatException -> 0x00dd }
            double r8 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00dd }
            java.lang.Double r6 = java.lang.Double.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00dd }
            r5.<init>(r6)     // Catch:{ NumberFormatException -> 0x00dd }
            goto L_0x013a
        L_0x00dd:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r3.toLowerCase(r5)
            r5.getClass()
            int r6 = r5.hashCode()
            r8 = -1
            switch(r6) {
                case 3392903: goto L_0x0105;
                case 3569038: goto L_0x00fa;
                case 97196323: goto L_0x00ef;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            goto L_0x010f
        L_0x00ef:
            java.lang.String r6 = "false"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00f8
            goto L_0x010f
        L_0x00f8:
            r8 = 2
            goto L_0x010f
        L_0x00fa:
            java.lang.String r6 = "true"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0103
            goto L_0x010f
        L_0x0103:
            r8 = r2
            goto L_0x010f
        L_0x0105:
            java.lang.String r6 = "null"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r8 = r4
        L_0x010f:
            switch(r8) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0126;
                case 2: goto L_0x0126;
                default: goto L_0x0112;
            }
        L_0x0112:
            a6.c r5 = new a6.c     // Catch:{ IllegalArgumentException -> 0x0120 }
            int r6 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x0120 }
            android.graphics.Color r6 = android.graphics.Color.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x0120 }
            r5.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x0120 }
            goto L_0x013a
        L_0x0120:
            a6.m r5 = new a6.m
            r5.<init>(r3)
            goto L_0x013a
        L_0x0126:
            a6.b r5 = new a6.b
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5.<init>(r3)
            goto L_0x013a
        L_0x0134:
            a6.k r3 = new a6.k
            r3.<init>()
            r5 = r3
        L_0x013a:
            int r3 = r5.f171a
            r6 = 10
            if (r3 != r6) goto L_0x016f
            r3 = r5
            a6.l r3 = (a6.l) r3
            if (r11 == 0) goto L_0x016a
            int r8 = r11.f171a
            if (r8 != r6) goto L_0x016a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r8 = r11
            a6.l r8 = (a6.l) r8
            java.lang.String r8 = r8.f188b
            r6.append(r8)
            java.lang.String r8 = r3.f188b
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            int r8 = a6.l.l(r11, r6)
            if (r8 == r2) goto L_0x016a
            r3.f189c = r8
            r3.f188b = r6
            r4 = r2
        L_0x016a:
            if (r4 == 0) goto L_0x016f
            r7.remove(r11)
        L_0x016f:
            r7.add(r5)
            r11 = r5
            goto L_0x0023
        L_0x0175:
            java.util.Stack r11 = new java.util.Stack
            r11.<init>()
            java.util.ArrayList r12 = r10.f8700b
            java.util.Iterator r12 = r12.iterator()
        L_0x0180:
            boolean r13 = r12.hasNext()
            java.util.ArrayList r0 = r10.f8701c
            if (r13 == 0) goto L_0x0192
            java.lang.Object r13 = r12.next()
            a6.a r13 = (a6.a) r13
            r13.c(r11, r0)
            goto L_0x0180
        L_0x0192:
            boolean r12 = r11.empty()
            if (r12 != 0) goto L_0x01a2
            java.lang.Object r12 = r11.pop()
            a6.a r12 = (a6.a) r12
            r0.add(r12)
            goto L_0x0192
        L_0x01a2:
            java.util.ArrayList r11 = r10.f8700b
            java.util.stream.Stream r11 = r11.stream()
            com.samsung.android.wearable.watchfacestudio.editor.q r12 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r13 = 5
            r12.<init>(r13)
            boolean r11 = r11.anyMatch(r12)
            if (r11 == 0) goto L_0x01b7
            r10.a()
        L_0x01b7:
            java.util.ArrayList r11 = r10.f8700b
            java.util.stream.Stream r12 = r11.stream()
            com.samsung.android.wearable.watchfacestudio.editor.q r13 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r0 = 6
            r13.<init>(r0)
            java.util.stream.Stream r12 = r12.filter(r13)
            z5.a r13 = new z5.a
            r13.<init>(r10, r4)
            r12.forEach(r13)
            java.util.stream.Stream r11 = r11.stream()
            com.samsung.android.wearable.watchfacestudio.editor.q r12 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r13 = 7
            r12.<init>(r13)
            java.util.stream.Stream r11 = r11.filter(r12)
            z5.a r12 = new z5.a
            r12.<init>(r10, r2)
            r11.forEach(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.b.<init>(java.lang.String, v5.b, w5.i):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x058b, code lost:
        if (r7 != null) goto L_0x0598;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x058d, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0319, code lost:
        r7 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a6.a a() {
        /*
            r23 = this;
            r0 = r23
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Stack r2 = new java.util.Stack
            r2.<init>()
            java.util.ArrayList r3 = r0.f8701c
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r4 = r3.hasNext()
            java.lang.String r6 = r0.f8699a
            java.lang.String r7 = "DWF:Expression"
            if (r4 == 0) goto L_0x0669
            java.lang.Object r4 = r3.next()
            a6.a r4 = (a6.a) r4
            int r8 = r4.f171a
            int r8 = s.g.b(r8)
            r9 = 3
            r10 = 24
            r11 = 2
            switch(r8) {
                case 0: goto L_0x0661;
                case 1: goto L_0x0661;
                case 2: goto L_0x0661;
                case 3: goto L_0x0661;
                case 4: goto L_0x0661;
                case 5: goto L_0x0661;
                case 6: goto L_0x0661;
                case 7: goto L_0x0661;
                case 8: goto L_0x00ea;
                case 9: goto L_0x0038;
                case 10: goto L_0x0030;
                case 11: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0012
        L_0x0030:
            a6.a r4 = r4.j(r2)
        L_0x0034:
            r2.push(r4)
            goto L_0x0012
        L_0x0038:
            a6.l r4 = (a6.l) r4
            int r5 = r4.f189c
            int r5 = s.g.b(r5)
            if (r5 == r10) goto L_0x00a9
            switch(r5) {
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                case 3: goto L_0x005f;
                case 4: goto L_0x0047;
                case 5: goto L_0x005f;
                case 6: goto L_0x0047;
                case 7: goto L_0x0047;
                case 8: goto L_0x0097;
                case 9: goto L_0x005f;
                case 10: goto L_0x005f;
                case 11: goto L_0x0097;
                case 12: goto L_0x005f;
                case 13: goto L_0x005f;
                case 14: goto L_0x005f;
                case 15: goto L_0x005f;
                case 16: goto L_0x0047;
                case 17: goto L_0x0047;
                case 18: goto L_0x0047;
                case 19: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00af
        L_0x0047:
            int r5 = r2.size()
            if (r5 >= r11) goto L_0x004e
            goto L_0x00af
        L_0x004e:
            java.lang.Object r5 = r2.pop()
            a6.a r5 = (a6.a) r5
            java.lang.Object r6 = r2.pop()
            a6.a r6 = (a6.a) r6
            a6.a r4 = r6.i(r4, r5)
            goto L_0x0034
        L_0x005f:
            int r5 = r2.size()
            if (r5 >= r11) goto L_0x0066
            goto L_0x00af
        L_0x0066:
            java.lang.Object r5 = r2.pop()
            a6.a r5 = (a6.a) r5
            java.lang.Object r6 = r2.pop()
            a6.a r6 = (a6.a) r6
            int r7 = r6.f171a
            int r7 = s.g.b(r7)
            int r8 = r5.f171a
            int r8 = s.g.b(r8)
            if (r7 < r8) goto L_0x0082
            r7 = r6
            goto L_0x0083
        L_0x0082:
            r7 = r5
        L_0x0083:
            int r8 = r6.f171a
            int r8 = s.g.b(r8)
            int r9 = r5.f171a
            int r9 = s.g.b(r9)
            if (r8 >= r9) goto L_0x0092
            r5 = r6
        L_0x0092:
            a6.a r4 = r7.i(r4, r5)
            goto L_0x0034
        L_0x0097:
            boolean r5 = r2.empty()
            if (r5 == 0) goto L_0x009e
            goto L_0x00af
        L_0x009e:
            java.lang.Object r5 = r2.pop()
            a6.a r5 = (a6.a) r5
            a6.a r4 = r5.h(r4)
            goto L_0x0034
        L_0x00a9:
            int r5 = r2.size()
            if (r5 >= r9) goto L_0x00cf
        L_0x00af:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "] invalid. NOT enough parameter on Operating "
            r5.append(r6)
            java.lang.String r4 = r4.f188b
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r7, r4)
            a6.k r4 = new a6.k
            r4.<init>()
            goto L_0x0034
        L_0x00cf:
            java.lang.Object r4 = r2.pop()
            a6.a r4 = (a6.a) r4
            java.lang.Object r5 = r2.pop()
            a6.a r5 = (a6.a) r5
            java.lang.Object r6 = r2.pop()
            a6.a r6 = (a6.a) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x0034
            r4 = r5
            goto L_0x0034
        L_0x00ea:
            a6.d r4 = (a6.d) r4
            w5.c r6 = r4.f175b
            java.lang.Object r7 = r1.get(r6)
            a6.a r7 = (a6.a) r7
            if (r7 != 0) goto L_0x0656
            boolean r7 = w5.e.b(r6)
            java.lang.String r8 = r6.f8018a
            v5.b r12 = r4.f176c
            if (r7 == 0) goto L_0x0590
            java.time.ZonedDateTime r7 = r12.f7955d
            w5.i r13 = r4.f177d
            d6.e r14 = r12.f7954c
            if (r13 != 0) goto L_0x010b
            w5.i r13 = r14.f4067b
            goto L_0x010e
        L_0x010b:
            r14.getClass()
        L_0x010e:
            java.time.Instant r15 = r7.toInstant()
            long r9 = r15.toEpochMilli()
            java.time.ZoneId r15 = r7.getZone()
            java.time.ZoneId r11 = java.time.ZoneId.systemDefault()
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x0146
            w5.i r11 = r14.f4067b
            android.icu.util.TimeZone r11 = r11.f8076b
            java.time.ZoneId r7 = r7.getZone()
            java.lang.String r7 = r7.getId()
            android.icu.util.TimeZone r7 = android.icu.util.TimeZone.getTimeZone(r7)
            int r11 = r11.getOffset(r9)
            r16 = r6
            long r5 = (long) r11
            int r7 = r7.getOffset(r9)
            r11 = r2
            r17 = r3
            long r2 = (long) r7
            long r5 = r5 - r2
            long r9 = r9 - r5
            goto L_0x014b
        L_0x0146:
            r11 = r2
            r17 = r3
            r16 = r6
        L_0x014b:
            w5.d r2 = w5.e.c(r8)
            android.icu.util.TimeZone r3 = r13.f8076b
            java.util.HashMap r5 = r14.f4066a
            java.lang.Object r6 = r5.get(r13)
            d6.e$a r6 = (d6.e.a) r6
            if (r6 != 0) goto L_0x017a
            int r6 = r13.f8079f
            if (r6 != 0) goto L_0x0161
            r6 = 0
            goto L_0x0165
        L_0x0161:
            java.lang.String r6 = b6.a.a(r6)
        L_0x0165:
            java.util.List<java.lang.String> r14 = r13.f8077c
            android.icu.util.ULocale r6 = n6.i.a(r6, r14)
            android.icu.util.TimeZone r14 = r13.f8076b
            android.icu.util.Calendar r14 = android.icu.util.Calendar.getInstance(r14, r6)
            d6.e$a r7 = new d6.e$a
            r7.<init>(r6, r14)
            r5.put(r13, r7)
            r6 = r7
        L_0x017a:
            android.icu.util.Calendar r5 = r6.f4071b
            r5.setTimeInMillis(r9)
            int r2 = r2.ordinal()
            android.icu.text.DateFormatSymbols r7 = r6.f4072c
            r13 = 9
            r18 = 1103101952(0x41c00000, float:24.0)
            r15 = 0
            r19 = 1114636288(0x42700000, float:60.0)
            r20 = 1094713344(0x41400000, float:12.0)
            r21 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r14 = "%02d"
            android.icu.util.ULocale r6 = r6.f4070a
            switch(r2) {
                case 4: goto L_0x0580;
                case 5: goto L_0x0563;
                case 6: goto L_0x0197;
                case 7: goto L_0x054c;
                case 8: goto L_0x0540;
                case 9: goto L_0x0523;
                case 10: goto L_0x0508;
                case 11: goto L_0x04ec;
                case 12: goto L_0x04ce;
                case 13: goto L_0x04b0;
                case 14: goto L_0x049d;
                case 15: goto L_0x047a;
                case 16: goto L_0x0467;
                case 17: goto L_0x0442;
                case 18: goto L_0x042f;
                case 19: goto L_0x040c;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03d5;
                case 22: goto L_0x03b8;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0370;
                case 26: goto L_0x0362;
                case 27: goto L_0x0356;
                case 28: goto L_0x034b;
                case 29: goto L_0x033e;
                case 30: goto L_0x0328;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f8;
                case 34: goto L_0x02ed;
                case 35: goto L_0x02df;
                case 36: goto L_0x02c1;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029f;
                case 39: goto L_0x0293;
                case 40: goto L_0x027d;
                case 41: goto L_0x0271;
                case 42: goto L_0x0253;
                case 43: goto L_0x023f;
                case 44: goto L_0x022c;
                case 45: goto L_0x0197;
                case 46: goto L_0x0218;
                case 47: goto L_0x01ff;
                case 48: goto L_0x01f4;
                case 49: goto L_0x01e9;
                case 50: goto L_0x01dd;
                case 51: goto L_0x01d2;
                case 52: goto L_0x01ab;
                case 53: goto L_0x019a;
                default: goto L_0x0197;
            }
        L_0x0197:
            r7 = 0
            goto L_0x058b
        L_0x019a:
            w5.f r2 = new w5.f
            java.lang.String[] r3 = r7.getAmPmStrings()
            int r5 = r5.get(r13)
            r3 = r3[r5]
            r2.<init>((java.lang.String) r3)
            goto L_0x0319
        L_0x01ab:
            w5.f r7 = new w5.f
            android.icu.text.DateTimePatternGenerator r2 = android.icu.text.DateTimePatternGenerator.getInstance(r6)
            java.lang.String r3 = "hmma"
            java.lang.String r2 = r2.getBestPattern(r3)
            java.lang.String r3 = "a"
            boolean r2 = r2.startsWith(r3)
            java.lang.String r3 = r6.getCountry()
            java.lang.String r5 = "he"
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x01cb
            r2 = r2 ^ 1
        L_0x01cb:
            r5 = 1
            r2 = r2 ^ r5
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x01d2:
            w5.f r7 = new w5.f
            int r2 = r5.get(r13)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x01dd:
            r5 = 1
            w5.f r7 = new w5.f
            java.lang.String r2 = n6.i.d(r3, r9, r5)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x01e9:
            w5.f r7 = new w5.f
            java.lang.String r2 = n6.i.d(r3, r9, r15)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x01f4:
            w5.f r7 = new w5.f
            java.lang.String r2 = r3.getID()
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x01ff:
            w5.f r7 = new w5.f
            android.icu.text.TimeZoneNames r2 = android.icu.text.TimeZoneNames.getTZDBInstance(r6)
            java.lang.String r3 = r3.getID()
            java.lang.String r3 = android.icu.util.TimeZone.getCanonicalID(r3)
            android.icu.text.TimeZoneNames$NameType r5 = android.icu.text.TimeZoneNames.NameType.SHORT_STANDARD
            java.lang.String r2 = r2.getDisplayName(r3, r5, r9)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x0218:
            w5.f r7 = new w5.f
            java.util.Date r2 = new java.util.Date
            long r5 = r5.getTimeInMillis()
            r2.<init>(r5)
            boolean r2 = r3.inDaylightTime(r2)
            r7.<init>((boolean) r2)
            goto L_0x058b
        L_0x022c:
            r2 = 2
            r5.setFirstDayOfWeek(r2)
            r3 = 4
            r5.setMinimalDaysInFirstWeek(r3)
            w5.f r7 = new w5.f
            int r2 = r5.get(r3)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x023f:
            r2 = 2
            r3 = 4
            r5.setFirstDayOfWeek(r2)
            r5.setMinimalDaysInFirstWeek(r3)
            w5.f r7 = new w5.f
            r2 = 3
            int r2 = r5.get(r2)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x0253:
            w5.f r7 = new w5.f
            java.util.Locale r3 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r2 = r5.get(r2)
            int r2 = r2 % 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r15] = r2
            java.lang.String r2 = java.lang.String.format(r3, r14, r6)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x0271:
            r2 = 1
            w5.f r7 = new w5.f
            int r2 = r5.get(r2)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x027d:
            r2 = 1
            w5.f r7 = new w5.f
            int r2 = r5.get(r2)
            float r2 = (float) r2
            r3 = 2
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r20
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x0293:
            r3 = 2
            w5.f r7 = new w5.f
            int r2 = r5.get(r3)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x029f:
            r3 = 2
            w5.f r2 = new w5.f
            java.lang.String[] r6 = r7.getShortMonths()
            int r3 = r5.get(r3)
            r3 = r6[r3]
            r2.<init>((java.lang.String) r3)
            goto L_0x0319
        L_0x02b0:
            r3 = 2
            w5.f r2 = new w5.f
            java.lang.String[] r6 = r7.getMonths()
            int r3 = r5.get(r3)
            r3 = r6[r3]
            r2.<init>((java.lang.String) r3)
            goto L_0x0319
        L_0x02c1:
            r3 = 2
            w5.f r7 = new w5.f
            java.util.Locale r6 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            int r3 = r5.get(r3)
            int r3 = r3 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r9[r15] = r2
            java.lang.String r2 = java.lang.String.format(r6, r14, r9)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x02df:
            r2 = 1
            r3 = 2
            w5.f r7 = new w5.f
            int r3 = r5.get(r3)
            int r3 = r3 + r2
            r7.<init>((int) r3)
            goto L_0x058b
        L_0x02ed:
            w5.f r7 = new w5.f
            int r2 = n6.i.b(r5)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x02f8:
            w5.f r2 = new w5.f
            java.lang.String[] r3 = r7.getShortWeekdays()
            r6 = 7
            int r5 = r5.get(r6)
            r3 = r3[r5]
            r2.<init>((java.lang.String) r3)
            goto L_0x0319
        L_0x0309:
            r6 = 7
            w5.f r2 = new w5.f
            java.lang.String[] r3 = r7.getWeekdays()
            int r5 = r5.get(r6)
            r3 = r3[r5]
            r2.<init>((java.lang.String) r3)
        L_0x0319:
            r7 = r2
            goto L_0x058b
        L_0x031c:
            r6 = 7
            w5.f r7 = new w5.f
            int r2 = r5.get(r6)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x0328:
            w5.f r7 = new w5.f
            r2 = 1
            int r2 = r5.get(r2)
            float r2 = (float) r2
            float r3 = n6.i.c(r5)
            float r3 = r3 - r21
            float r3 = r3 / r20
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x033e:
            w5.f r7 = new w5.f
            float r2 = n6.i.c(r5)
            float r2 = r2 - r21
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x034b:
            w5.f r7 = new w5.f
            float r2 = n6.i.c(r5)
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x0356:
            w5.f r7 = new w5.f
            r2 = 6
            int r2 = r5.get(r2)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x0362:
            w5.f r7 = new w5.f
            r2 = 5
            int r2 = r5.get(r2)
            int r2 = r2 + -1
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x0370:
            r2 = 5
            w5.f r7 = new w5.f
            java.util.Locale r6 = r6.toLocale()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r2 = r5.get(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r15] = r2
            java.lang.String r2 = java.lang.String.format(r6, r14, r3)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x038d:
            r2 = 5
            w5.f r7 = new w5.f
            int r2 = r5.get(r2)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x0399:
            r2 = 5
            w5.f r7 = new w5.f
            int r2 = r5.get(r2)
            float r2 = (float) r2
            r3 = 11
            int r3 = r5.get(r3)
            r5 = 24
            if (r3 != r5) goto L_0x03ac
            goto L_0x03ad
        L_0x03ac:
            r15 = r3
        L_0x03ad:
            float r3 = (float) r15
            float r3 = r3 / r18
            float r2 = r2 + r3
            float r2 = r2 - r21
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x03b8:
            w5.f r7 = new w5.f
            r2 = 5
            int r2 = r5.get(r2)
            float r2 = (float) r2
            r3 = 11
            int r3 = r5.get(r3)
            r5 = 24
            if (r3 != r5) goto L_0x03cb
            goto L_0x03cc
        L_0x03cb:
            r15 = r3
        L_0x03cc:
            float r3 = (float) r15
            float r3 = r3 / r18
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x03d5:
            w5.f r7 = new w5.f
            java.util.Locale r3 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 11
            int r5 = r5.get(r6)
            if (r5 != 0) goto L_0x03e9
            r10 = 24
            goto L_0x03ea
        L_0x03e9:
            r10 = r5
        L_0x03ea:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r2[r15] = r5
            java.lang.String r2 = java.lang.String.format(r3, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x03f9:
            w5.f r7 = new w5.f
            r2 = 11
            int r2 = r5.get(r2)
            if (r2 != 0) goto L_0x0406
            r10 = 24
            goto L_0x0407
        L_0x0406:
            r10 = r2
        L_0x0407:
            r7.<init>((int) r10)
            goto L_0x058b
        L_0x040c:
            w5.f r7 = new w5.f
            java.util.Locale r3 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 11
            int r5 = r5.get(r6)
            r6 = 24
            if (r5 != r6) goto L_0x0420
            r5 = r15
        L_0x0420:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r15] = r5
            java.lang.String r2 = java.lang.String.format(r3, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x042f:
            w5.f r7 = new w5.f
            r2 = 11
            int r2 = r5.get(r2)
            r3 = 24
            if (r2 != r3) goto L_0x043c
            goto L_0x043d
        L_0x043c:
            r15 = r2
        L_0x043d:
            r7.<init>((int) r15)
            goto L_0x058b
        L_0x0442:
            w5.f r7 = new w5.f
            java.util.Locale r3 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 10
            int r5 = r5.get(r6)
            if (r5 != 0) goto L_0x0456
            r22 = 12
            goto L_0x0458
        L_0x0456:
            r22 = r5
        L_0x0458:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r2[r15] = r5
            java.lang.String r2 = java.lang.String.format(r3, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x0467:
            w5.f r7 = new w5.f
            r2 = 10
            int r2 = r5.get(r2)
            if (r2 != 0) goto L_0x0474
            r14 = 12
            goto L_0x0475
        L_0x0474:
            r14 = r2
        L_0x0475:
            r7.<init>((int) r14)
            goto L_0x058b
        L_0x047a:
            w5.f r7 = new w5.f
            java.util.Locale r3 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 10
            int r5 = r5.get(r6)
            r6 = 12
            if (r5 != r6) goto L_0x048e
            r5 = r15
        L_0x048e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r15] = r5
            java.lang.String r2 = java.lang.String.format(r3, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x049d:
            w5.f r7 = new w5.f
            r2 = 10
            int r2 = r5.get(r2)
            r3 = 12
            if (r2 != r3) goto L_0x04aa
            goto L_0x04ab
        L_0x04aa:
            r15 = r2
        L_0x04ab:
            r7.<init>((int) r15)
            goto L_0x058b
        L_0x04b0:
            w5.f r7 = new w5.f
            r2 = 11
            int r2 = r5.get(r2)
            if (r2 != 0) goto L_0x04bd
            r10 = 24
            goto L_0x04be
        L_0x04bd:
            r10 = r2
        L_0x04be:
            float r2 = (float) r10
            r3 = 12
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r19
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x04ce:
            w5.f r7 = new w5.f
            r2 = 11
            int r2 = r5.get(r2)
            r3 = 24
            if (r2 != r3) goto L_0x04db
            goto L_0x04dc
        L_0x04db:
            r15 = r2
        L_0x04dc:
            float r2 = (float) r15
            r3 = 12
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r19
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x04ec:
            w5.f r7 = new w5.f
            r2 = 10
            int r6 = r5.get(r2)
            if (r6 != 0) goto L_0x04f8
            r6 = 12
        L_0x04f8:
            float r2 = (float) r6
            r3 = 12
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r19
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x0508:
            r3 = 12
            w5.f r7 = new w5.f
            r2 = 10
            int r2 = r5.get(r2)
            if (r2 != r3) goto L_0x0515
            goto L_0x0516
        L_0x0515:
            r15 = r2
        L_0x0516:
            float r2 = (float) r15
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r19
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x0523:
            r3 = 12
            w5.f r7 = new w5.f
            java.util.Locale r6 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.get(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r15] = r3
            java.lang.String r2 = java.lang.String.format(r6, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x0540:
            r3 = 12
            w5.f r7 = new w5.f
            int r2 = r5.get(r3)
            r7.<init>((int) r2)
            goto L_0x058b
        L_0x054c:
            r3 = 12
            w5.f r7 = new w5.f
            int r2 = r5.get(r3)
            float r2 = (float) r2
            r3 = 13
            int r3 = r5.get(r3)
            float r3 = (float) r3
            float r3 = r3 / r19
            float r2 = r2 + r3
            r7.<init>((float) r2)
            goto L_0x058b
        L_0x0563:
            r3 = 13
            w5.f r7 = new w5.f
            java.util.Locale r6 = r6.toLocale()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.get(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r15] = r3
            java.lang.String r2 = java.lang.String.format(r6, r14, r2)
            r7.<init>((java.lang.String) r2)
            goto L_0x058b
        L_0x0580:
            r3 = 13
            w5.f r7 = new w5.f
            int r2 = r5.get(r3)
            r7.<init>((int) r2)
        L_0x058b:
            if (r7 != 0) goto L_0x0598
            r2 = r16
            goto L_0x0594
        L_0x0590:
            r11 = r2
            r17 = r3
            r2 = r6
        L_0x0594:
            w5.f r7 = r12.c(r2)
        L_0x0598:
            if (r7 != 0) goto L_0x05b5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getConvertedToken: no value for "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "DWF:TokenDataProviderSource"
            android.util.Log.w(r3, r2)
            a6.k r2 = new a6.k
            r2.<init>()
        L_0x05b2:
            r7 = r2
            goto L_0x0650
        L_0x05b5:
            int r2 = r7.f8067a
            int r2 = s.g.b(r2)
            switch(r2) {
                case 0: goto L_0x063a;
                case 1: goto L_0x062b;
                case 2: goto L_0x061d;
                case 3: goto L_0x060f;
                case 4: goto L_0x0601;
                case 5: goto L_0x05e7;
                case 6: goto L_0x05d4;
                case 7: goto L_0x05c0;
                default: goto L_0x05be;
            }
        L_0x05be:
            goto L_0x0649
        L_0x05c0:
            java.lang.Object r2 = r7.g()
            if (r2 == 0) goto L_0x0649
            a6.m r2 = new a6.m
            java.lang.Object r3 = r7.g()
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            goto L_0x05b2
        L_0x05d4:
            android.graphics.Color r2 = r7.b()
            if (r2 != 0) goto L_0x05e0
            a6.k r2 = new a6.k
            r2.<init>()
            goto L_0x05b2
        L_0x05e0:
            a6.c r3 = new a6.c
            r3.<init>(r2)
            r7 = r3
            goto L_0x0650
        L_0x05e7:
            java.lang.String r2 = r7.h()
            boolean r2 = n6.g.e(r2)
            if (r2 == 0) goto L_0x05f7
            a6.k r2 = new a6.k
            r2.<init>()
            goto L_0x05b2
        L_0x05f7:
            a6.m r2 = new a6.m
            java.lang.String r3 = r7.h()
            r2.<init>(r3)
            goto L_0x05b2
        L_0x0601:
            a6.b r2 = new a6.b
            boolean r3 = r7.a()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            goto L_0x05b2
        L_0x060f:
            a6.e r2 = new a6.e
            double r5 = r7.c()
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            r2.<init>(r3)
            goto L_0x05b2
        L_0x061d:
            a6.f r2 = new a6.f
            float r3 = r7.d()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.<init>(r3)
            goto L_0x05b2
        L_0x062b:
            a6.j r2 = new a6.j
            long r5 = r7.f()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.<init>(r3)
            goto L_0x05b2
        L_0x063a:
            a6.i r2 = new a6.i
            int r3 = r7.e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            goto L_0x05b2
        L_0x0649:
            a6.k r2 = new a6.k
            r2.<init>()
            goto L_0x05b2
        L_0x0650:
            w5.c r2 = r4.f175b
            r1.put(r2, r7)
            goto L_0x0659
        L_0x0656:
            r11 = r2
            r17 = r3
        L_0x0659:
            r11.push(r7)
            r2 = r11
            r3 = r17
            goto L_0x0012
        L_0x0661:
            r11 = r2
            r17 = r3
            r11.push(r4)
            goto L_0x0012
        L_0x0669:
            r11 = r2
            int r0 = r11.size()
            r1 = 1
            if (r0 != r1) goto L_0x0678
            java.lang.Object r0 = r11.pop()
            a6.a r0 = (a6.a) r0
            return r0
        L_0x0678:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = " failed."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
            a6.b r0 = new a6.b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.b.a():a6.a");
    }

    public final f b() {
        a a9 = a();
        switch (g.b(a9.f171a)) {
            case 1:
                return new f(a9.a());
            case 2:
                return new f(a9.f());
            case 3:
                return new f(a9.g());
            case 4:
                return new f(a9.e());
            case 5:
                return new f(a9.d());
            case 6:
                return new f(a9.k());
            case 7:
                return new f(a9.b());
            default:
                return new f();
        }
    }

    public final String toString() {
        return "\"" + this.f8699a + "\"";
    }
}
