package c6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.icu.text.DateFormatSymbols;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.TimeZone;
import android.util.Log;
import d6.c;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import w5.d;
import w5.f;

public final class n extends d {

    /* renamed from: g  reason: collision with root package name */
    public final a f2770g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final BroadcastReceiver f2771h = new a();

    /* renamed from: i  reason: collision with root package name */
    public TimeZone f2772i = TimeZone.getDefault();

    /* renamed from: j  reason: collision with root package name */
    public o f2773j = new o(this.f2716a, ZonedDateTime.now());

    /* renamed from: k  reason: collision with root package name */
    public HashMap f2774k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public boolean f2775l = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED")) {
                n.this.r();
            }
        }
    }

    public n(Context context, boolean z8, c cVar) {
        super(context, z8, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007a, code lost:
        r1.add(r4);
        r4 = w5.d.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bf, code lost:
        r1.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c2, code lost:
        r1.add(w5.d.L);
        r1.add(w5.d.M);
        r4 = w5.d.N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x011b, code lost:
        r1.add(r4);
        r1.add(w5.d.C);
        r4 = w5.d.D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(w5.d r4, w5.f r5) {
        /*
            r3 = this;
            c6.o r0 = r3.f2773j
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r4.ordinal()
            r2 = 3
            if (r4 == r2) goto L_0x019a
            r2 = 4
            if (r4 == r2) goto L_0x017e
            r2 = 45
            if (r4 == r2) goto L_0x0171
            r2 = 46
            if (r4 == r2) goto L_0x0164
            switch(r4) {
                case 1: goto L_0x0152;
                case 8: goto L_0x0127;
                case 14: goto L_0x00f6;
                case 16: goto L_0x00f6;
                case 18: goto L_0x00d0;
                case 20: goto L_0x00d0;
                case 24: goto L_0x008b;
                case 31: goto L_0x0080;
                case 35: goto L_0x004b;
                case 41: goto L_0x0034;
                case 51: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x01a9
        L_0x0021:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2789n = r4
            w5.d r4 = w5.d.f8024f0
            r1.add(r4)
            w5.d r4 = w5.d.f8028h0
            goto L_0x01a6
        L_0x0034:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2787l = r4
            w5.d r4 = w5.d.V
            r1.add(r4)
            w5.d r4 = w5.d.W
            r1.add(r4)
            w5.d r4 = w5.d.K
            goto L_0x007a
        L_0x004b:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2786k = r4
            w5.d r4 = w5.d.P
            r1.add(r4)
            w5.d r4 = w5.d.Q
            r1.add(r4)
            w5.d r4 = w5.d.I
            r1.add(r4)
            w5.d r4 = w5.d.R
            r1.add(r4)
            w5.d r4 = w5.d.S
            r1.add(r4)
            w5.d r4 = w5.d.J
            r1.add(r4)
            w5.d r4 = w5.d.K
            r1.add(r4)
            w5.d r4 = w5.d.T
        L_0x007a:
            r1.add(r4)
            w5.d r4 = w5.d.U
            goto L_0x00bf
        L_0x0080:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2785j = r4
            goto L_0x00c2
        L_0x008b:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2784i = r4
            w5.d r4 = w5.d.E
            r1.add(r4)
            w5.d r4 = w5.d.F
            r1.add(r4)
            w5.d r4 = w5.d.G
            r1.add(r4)
            w5.d r4 = w5.d.C
            r1.add(r4)
            w5.d r4 = w5.d.D
            r1.add(r4)
            w5.d r4 = w5.d.H
            r1.add(r4)
            w5.d r4 = w5.d.I
            r1.add(r4)
            w5.d r4 = w5.d.J
            r1.add(r4)
            w5.d r4 = w5.d.K
        L_0x00bf:
            r1.add(r4)
        L_0x00c2:
            w5.d r4 = w5.d.L
            r1.add(r4)
            w5.d r4 = w5.d.M
            r1.add(r4)
            w5.d r4 = w5.d.N
            goto L_0x01a6
        L_0x00d0:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2783h = r4
            w5.d r4 = w5.d.y
            r1.add(r4)
            w5.d r4 = w5.d.f8057z
            r1.add(r4)
            w5.d r4 = w5.d.A
            r1.add(r4)
            w5.d r4 = w5.d.B
            r1.add(r4)
            w5.d r4 = w5.d.f8048s
            r1.add(r4)
            w5.d r4 = w5.d.f8049t
            goto L_0x011b
        L_0x00f6:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2782g = r4
            w5.d r4 = w5.d.f8051u
            r1.add(r4)
            w5.d r4 = w5.d.f8052v
            r1.add(r4)
            w5.d r4 = w5.d.w
            r1.add(r4)
            w5.d r4 = w5.d.f8055x
            r1.add(r4)
            w5.d r4 = w5.d.f8045q
            r1.add(r4)
            w5.d r4 = w5.d.r
        L_0x011b:
            r1.add(r4)
            w5.d r4 = w5.d.C
            r1.add(r4)
            w5.d r4 = w5.d.D
            goto L_0x01a6
        L_0x0127:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2781f = r4
            w5.d r4 = w5.d.f8041o
            r1.add(r4)
            w5.d r4 = w5.d.f8043p
            r1.add(r4)
            w5.d r4 = w5.d.f8039n
            r1.add(r4)
            w5.d r4 = w5.d.f8045q
            r1.add(r4)
            w5.d r4 = w5.d.r
            r1.add(r4)
            w5.d r4 = w5.d.f8048s
            r1.add(r4)
            w5.d r4 = w5.d.f8049t
            goto L_0x01a6
        L_0x0152:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.f2780d = r4
            w5.d r4 = w5.d.f8027h
            r1.add(r4)
            w5.d r4 = w5.d.f8029i
            goto L_0x01a6
        L_0x0164:
            java.lang.String r4 = r5.h()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r0.f2788m = r4
            w5.d r4 = w5.d.f8019a0
            goto L_0x01a6
        L_0x0171:
            java.lang.String r4 = r5.h()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            r0.f2778b = r4
            w5.d r4 = w5.d.Z
            goto L_0x01a6
        L_0x017e:
            java.lang.String r4 = r5.h()
            int r4 = java.lang.Integer.parseInt(r4)
            r0.e = r4
            w5.d r4 = w5.d.f8033k
            r1.add(r4)
            w5.d r4 = w5.d.f8035l
            r1.add(r4)
            w5.d r4 = w5.d.f8029i
            r1.add(r4)
            w5.d r4 = w5.d.f8039n
            goto L_0x01a6
        L_0x019a:
            java.lang.String r4 = r5.h()
            long r4 = java.lang.Long.parseLong(r4)
            r0.f2779c = r4
            w5.d r4 = w5.d.f8031j
        L_0x01a6:
            r1.add(r4)
        L_0x01a9:
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x01b4
            c6.c r3 = r3.f2717b
            r3.a(r1)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.n.b(w5.d, w5.f):void");
    }

    public final void c() {
        s();
    }

    public final d d() {
        return d.f8027h;
    }

    public final f e(d dVar) {
        int ordinal = dVar.ordinal();
        int i8 = 2;
        int i9 = 12;
        int i10 = 24;
        a aVar = this.f2770g;
        int i11 = 0;
        boolean z8 = true;
        switch (ordinal) {
            case 1:
                return new f(this.f2773j.f2780d);
            case 2:
                o oVar = this.f2773j;
                return new f(((float) oVar.e) + (((float) oVar.f2780d) / 1000.0f));
            case 3:
                return new f(this.f2773j.f2779c);
            case 4:
                return new f(this.f2773j.e);
            case 5:
                return new f(String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(this.f2773j.e)}));
            case 6:
                o oVar2 = this.f2773j;
                int i12 = oVar2.f2783h;
                if (i12 != 24) {
                    i11 = i12;
                }
                return new f((i11 * 60 * 60) + (oVar2.f2781f * 60) + oVar2.e);
            case 7:
                o oVar3 = this.f2773j;
                return new f(((float) oVar3.f2781f) + (((float) oVar3.e) / 60.0f));
            case 8:
                return new f(this.f2773j.f2781f);
            case 9:
                return new f(String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(this.f2773j.f2781f)}));
            case 10:
                o oVar4 = this.f2773j;
                int i13 = oVar4.f2782g;
                if (i13 != 12) {
                    i11 = i13;
                }
                return new f(((float) i11) + (((float) oVar4.f2781f) / 60.0f));
            case 11:
                o oVar5 = this.f2773j;
                int i14 = oVar5.f2782g;
                if (i14 != 0) {
                    i9 = i14;
                }
                return new f(((float) i9) + (((float) oVar5.f2781f) / 60.0f));
            case 12:
                o oVar6 = this.f2773j;
                int i15 = oVar6.f2783h;
                if (i15 != 24) {
                    i11 = i15;
                }
                return new f(((float) i11) + (((float) oVar6.f2781f) / 60.0f));
            case 13:
                o oVar7 = this.f2773j;
                int i16 = oVar7.f2783h;
                if (i16 != 0) {
                    i10 = i16;
                }
                return new f(((float) i10) + (((float) oVar7.f2781f) / 60.0f));
            case 14:
                int i17 = this.f2773j.f2782g;
                if (i17 != 12) {
                    i11 = i17;
                }
                return new f(i11);
            case 15:
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[1];
                int i18 = this.f2773j.f2782g;
                if (i18 == 12) {
                    i18 = 0;
                }
                objArr[0] = Integer.valueOf(i18);
                return new f(String.format(locale, "%02d", objArr));
            case 16:
                int i19 = this.f2773j.f2782g;
                if (i19 != 0) {
                    i9 = i19;
                }
                return new f(i9);
            case 17:
                Locale locale2 = Locale.getDefault();
                Object[] objArr2 = new Object[1];
                int i20 = this.f2773j.f2782g;
                if (i20 != 0) {
                    i9 = i20;
                }
                objArr2[0] = Integer.valueOf(i9);
                return new f(String.format(locale2, "%02d", objArr2));
            case 18:
                int i21 = this.f2773j.f2783h;
                if (i21 != 24) {
                    i11 = i21;
                }
                return new f(i11);
            case 19:
                Locale locale3 = Locale.getDefault();
                Object[] objArr3 = new Object[1];
                int i22 = this.f2773j.f2783h;
                if (i22 == 24) {
                    i22 = 0;
                }
                objArr3[0] = Integer.valueOf(i22);
                return new f(String.format(locale3, "%02d", objArr3));
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                int i23 = this.f2773j.f2783h;
                if (i23 != 0) {
                    i10 = i23;
                }
                return new f(i10);
            case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                Locale locale4 = Locale.getDefault();
                Object[] objArr4 = new Object[1];
                int i24 = this.f2773j.f2783h;
                if (i24 != 0) {
                    i10 = i24;
                }
                objArr4[0] = Integer.valueOf(i10);
                return new f(String.format(locale4, "%02d", objArr4));
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                o oVar8 = this.f2773j;
                float f9 = (float) oVar8.f2784i;
                int i25 = oVar8.f2783h;
                if (i25 != 24) {
                    i11 = i25;
                }
                return new f(f9 + (((float) i11) / 24.0f));
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                o oVar9 = this.f2773j;
                float f10 = (float) oVar9.f2784i;
                int i26 = oVar9.f2783h;
                if (i26 != 24) {
                    i11 = i26;
                }
                return new f((f10 + (((float) i11) / 24.0f)) - 1.0f);
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                return new f(this.f2773j.f2784i);
            case EXERCISE_TYPE_EXERCISE_CLASS_VALUE:
                return new f(this.f2773j.f2784i - 1);
            case 27:
                return new f(this.f2773j.f2777a);
            case EXERCISE_TYPE_FRISBEE_DISC_VALUE:
                o oVar10 = this.f2773j;
                return new f(((float) oVar10.f2786k) + (((float) (oVar10.f2784i - 1)) / ((float) o())));
            case EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE:
                o oVar11 = this.f2773j;
                return new f((((float) oVar11.f2786k) + (((float) (oVar11.f2784i - 1)) / ((float) o()))) - 1.0f);
            case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
                o oVar12 = this.f2773j;
                return new f(((float) oVar12.f2787l) + (((((float) oVar12.f2786k) + (((float) (oVar12.f2784i - 1)) / ((float) o()))) - 1.0f) / 12.0f));
            case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
                return new f(this.f2773j.f2785j);
            case EXERCISE_TYPE_GOLF_VALUE:
                return new f(n(false));
            case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                return new f(n(true));
            case EXERCISE_TYPE_GYMNASTICS_VALUE:
                return new f(o());
            case EXERCISE_TYPE_HANDBALL_VALUE:
                return new f(this.f2773j.f2786k);
            case EXERCISE_TYPE_HIKING_VALUE:
                return new f(p(false));
            case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                return new f(p(true));
            case EXERCISE_TYPE_ICE_SKATING_VALUE:
                return new f(this.f2773j.f2786k - 1);
            case EXERCISE_TYPE_JUMP_ROPE_VALUE:
                o oVar13 = this.f2773j;
                return new f(((float) oVar13.f2787l) + (((float) (oVar13.f2786k - 1)) / 12.0f));
            case EXERCISE_TYPE_JUMPING_JACK_VALUE:
                return new f(this.f2773j.f2787l);
            case EXERCISE_TYPE_MEDITATION_VALUE:
                return new f(this.f2773j.f2778b);
            case EXERCISE_TYPE_PADDLING_VALUE:
                return new f(this.f2773j.f2788m);
            case EXERCISE_TYPE_PILATES_VALUE:
                return new f(this.f2772i.getID());
            case EXERCISE_TYPE_ROCK_CLIMBING_VALUE:
                return new f(this.f2773j.f2789n);
            case EXERCISE_TYPE_ROLLER_HOCKEY_VALUE:
                aVar.getClass();
                String country = Locale.getDefault().getCountry();
                if (!country.equals(aVar.f2706a)) {
                    aVar.f2707b = 1;
                    aVar.f2708c = new String[2];
                    aVar.f2706a = country;
                }
                if (aVar.f2707b == 1) {
                    Locale locale5 = Locale.getDefault();
                    boolean startsWith = DateTimePatternGenerator.getInstance().getBestPattern("hmma").startsWith("a");
                    if (locale5.getCountry().startsWith("HE")) {
                        startsWith = !startsWith;
                    }
                    if (!startsWith) {
                        i8 = 3;
                    }
                    aVar.f2707b = i8;
                }
                return new f(b6.a.e(aVar.f2707b));
            case EXERCISE_TYPE_ROWING_VALUE:
                o oVar14 = this.f2773j;
                aVar.getClass();
                String country2 = Locale.getDefault().getCountry();
                if (!country2.equals(aVar.f2706a)) {
                    aVar.f2707b = 1;
                    aVar.f2708c = new String[2];
                    aVar.f2706a = country2;
                }
                String[] strArr = aVar.f2708c;
                int i27 = oVar14.f2789n;
                if (strArr[i27] == null) {
                    if (i27 != 0) {
                        z8 = false;
                    }
                    strArr[i27] = LocalTime.of(z8 ? 9 : 21, 0).format(DateTimeFormatter.ofPattern("a").withLocale(Locale.getDefault()));
                }
                return new f(aVar.f2708c[oVar14.f2789n]);
            default:
                return null;
        }
    }

    public final boolean f(d dVar) {
        return g();
    }

    public final void i(d dVar) {
        Log.i("DWF:ModelTime", "onConnected");
        q();
    }

    public final void j(d dVar) {
        Log.i("DWF:ModelTime", "onDisconnected");
        s();
    }

    public final void k() {
        s();
    }

    public final void l() {
        if (!this.f2772i.equals(TimeZone.getDefault())) {
            r();
        }
        if (g()) {
            q();
        }
    }

    public final d m() {
        return d.f8030i0;
    }

    public final String n(boolean z8) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        return z8 ? dateFormatSymbols.getShortWeekdays()[this.f2773j.f2785j] : dateFormatSymbols.getWeekdays()[this.f2773j.f2785j];
    }

    public final int o() {
        o oVar = this.f2773j;
        int i8 = oVar.f2786k;
        if (i8 != 2) {
            return (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) ? 30 : 31;
        }
        int i9 = oVar.f2787l;
        return ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) ? 28 : 29;
    }

    public final String p(boolean z8) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        return z8 ? dateFormatSymbols.getShortMonths()[this.f2773j.f2786k - 1] : dateFormatSymbols.getMonths()[this.f2773j.f2786k - 1];
    }

    public final void q() {
        if (!this.f2775l) {
            Log.i("DWF:ModelTime", "registerReceiver");
            this.f2775l = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            this.f2716a.registerReceiver(this.f2771h, intentFilter);
        }
    }

    public final void r() {
        Log.i("DWF:ModelTime", "timezoneChanged: " + TimeZone.getDefault().getID());
        this.f2772i = TimeZone.getDefault();
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.f8021c0);
        this.f2717b.a(arrayList);
    }

    public final void s() {
        try {
            if (this.f2775l) {
                Log.i("DWF:ModelTime", "unregisterReceiver");
                this.f2775l = false;
                this.f2716a.unregisterReceiver(this.f2771h);
            }
        } catch (Exception e) {
            Log.e("DWF:ModelTime", e.getMessage());
        }
    }
}
