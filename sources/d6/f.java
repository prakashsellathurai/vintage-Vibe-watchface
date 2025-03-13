package d6;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import w5.c;

public class f extends b {

    /* renamed from: j  reason: collision with root package name */
    public boolean f4073j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4074k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4075l;

    /* renamed from: m  reason: collision with root package name */
    public int f4076m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final KeyguardManager f4077n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4078o;

    /* renamed from: p  reason: collision with root package name */
    public final BroadcastReceiver f4079p;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            boolean isDeviceLocked;
            String action = intent.getAction();
            boolean equals = "android.intent.action.USER_PRESENT".equals(action);
            b bVar = b.f4086l;
            f fVar = f.this;
            if (equals) {
                if (fVar.f4075l) {
                    fVar.f4075l = false;
                    fVar.r(bVar);
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action) && fVar.f4075l != (isDeviceLocked = fVar.f4077n.isDeviceLocked())) {
                fVar.f4075l = isDeviceLocked;
                fVar.r(bVar);
            }
        }
    }

    public enum b {
        f4081g((int) null),
        f4082h("STATE.INTERRUPTION_FILTER"),
        f4083i("STATE.IS_AMBIENT"),
        f4084j("STATE.IS_VISIBLE"),
        f4085k("STATE.IS_BATTERY_LOW_AND_NOT_CHARGING"),
        f4086l("STATE.IS_DEVICE_LOCKED"),
        f4087m("STATE.HIDE_INFORMATION");
        

        /* renamed from: f  reason: collision with root package name */
        public final String f4089f;

        /* access modifiers changed from: public */
        b(String str) {
            this.f4089f = str;
        }

        public static b e(String str) {
            for (b bVar : values()) {
                String str2 = bVar.f4089f;
                if (str2 != null && str2.equals(str)) {
                    return bVar;
                }
            }
            return f4081g;
        }
    }

    public f(Context context, boolean z8) {
        super(context);
        a aVar = new a();
        this.f4079p = aVar;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        this.f4077n = keyguardManager;
        this.f4075l = keyguardManager.isDeviceLocked();
        if (!z8 && !this.f4078o) {
            this.f4078o = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f4051d.registerReceiver(aVar, intentFilter);
        }
    }

    public void a() {
        super.a();
        try {
            if (this.f4078o) {
                this.f4078o = false;
                this.f4051d.unregisterReceiver(this.f4079p);
            }
        } catch (Exception e) {
            Log.w("DWF:StateProvider", "unregisterReceiver: " + e.getMessage());
        }
    }

    public final w5.f c(c cVar) {
        switch (b.e(cVar.f8018a).ordinal()) {
            case 0:
                Log.w("DWF:StateProvider", "getCurrentValue: invalid type: " + cVar.f8018a);
                break;
            case 1:
                return new w5.f(b6.a.f(this.f4076m));
            case 2:
                return new w5.f(this.e);
            case 3:
                return new w5.f(this.f4073j);
            case 4:
                return new w5.f(this.f4074k);
            case 5:
                return new w5.f(this.f4075l);
            case 6:
                return new w5.f(q());
        }
        return new w5.f();
    }

    public final String d() {
        return "STATE.";
    }

    public final void h(boolean z8) {
        r(b.f4083i);
    }

    public final void m() {
    }

    public final void n() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        android.util.Log.w("DWF:StateProvider", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        r(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(w5.c r5, w5.f r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.f8018a
            d6.f$b r5 = d6.f.b.e(r5)
            int r5 = r5.ordinal()
            java.lang.String r0 = "DWF:StateProvider"
            switch(r5) {
                case 0: goto L_0x00af;
                case 1: goto L_0x004d;
                case 2: goto L_0x003c;
                case 3: goto L_0x002f;
                case 4: goto L_0x0022;
                case 5: goto L_0x0015;
                case 6: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x00b4
        L_0x0011:
            java.lang.String r4 = "Doesn't support to debug HIDE_INFORMATION. Need to check the runtime implementation"
            goto L_0x00b1
        L_0x0015:
            java.lang.String r5 = r6.h()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            r4.f4075l = r5
            d6.f$b r5 = d6.f.b.f4086l
            goto L_0x0048
        L_0x0022:
            java.lang.String r5 = r6.h()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            r4.f4074k = r5
            d6.f$b r5 = d6.f.b.f4085k
            goto L_0x0048
        L_0x002f:
            java.lang.String r5 = r6.h()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            r4.f4073j = r5
            d6.f$b r5 = d6.f.b.f4084j
            goto L_0x0048
        L_0x003c:
            java.lang.String r5 = r6.h()
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            r4.e = r5
            d6.f$b r5 = d6.f.b.f4083i
        L_0x0048:
            r4.r(r5)
            goto L_0x00b4
        L_0x004d:
            java.lang.String r5 = r6.h()
            r5.getClass()
            int r6 = r5.hashCode()
            r0 = 1
            r1 = 2
            r2 = 3
            r3 = 4
            switch(r6) {
                case -1424804364: goto L_0x008c;
                case -1392738031: goto L_0x0081;
                case -1218872027: goto L_0x0076;
                case 123469597: goto L_0x006b;
                case 814732015: goto L_0x0060;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0097
        L_0x0060:
            java.lang.String r6 = "INTERRUPTION_FILTER_ALARMS"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0069
            goto L_0x0097
        L_0x0069:
            r5 = r3
            goto L_0x0098
        L_0x006b:
            java.lang.String r6 = "INTERRUPTION_FILTER_UNKNOWN"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            r5 = r2
            goto L_0x0098
        L_0x0076:
            java.lang.String r6 = "INTERRUPTION_FILTER_NONE"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x007f
            goto L_0x0097
        L_0x007f:
            r5 = r1
            goto L_0x0098
        L_0x0081:
            java.lang.String r6 = "INTERRUPTION_FILTER_PRIORITY"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x008a
            goto L_0x0097
        L_0x008a:
            r5 = r0
            goto L_0x0098
        L_0x008c:
            java.lang.String r6 = "INTERRUPTION_FILTER_ALL"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r5 = 0
            goto L_0x0098
        L_0x0097:
            r5 = -1
        L_0x0098:
            if (r5 == 0) goto L_0x00a9
            if (r5 == r0) goto L_0x00a7
            if (r5 == r1) goto L_0x00a5
            if (r5 == r2) goto L_0x00aa
            if (r5 == r3) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            r0 = 5
            goto L_0x00aa
        L_0x00a5:
            r0 = r1
            goto L_0x00aa
        L_0x00a7:
            r0 = r2
            goto L_0x00aa
        L_0x00a9:
            r0 = r3
        L_0x00aa:
            r4.f4076m = r0
            d6.f$b r5 = d6.f.b.f4082h
            goto L_0x0048
        L_0x00af:
            java.lang.String r4 = "debugSetValue: invalid source"
        L_0x00b1:
            android.util.Log.w(r0, r4)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.f.o(w5.c, w5.f):void");
    }

    public boolean q() {
        return true;
    }

    public final void r(b bVar) {
        w5.f fVar;
        String str;
        switch (bVar.ordinal()) {
            case 1:
                g("STATE.INTERRUPTION_FILTER", new w5.f(b6.a.f(this.f4076m)), true);
                return;
            case 2:
                fVar = new w5.f(this.e);
                str = "STATE.IS_AMBIENT";
                break;
            case 3:
                fVar = new w5.f(this.f4073j);
                str = "STATE.IS_VISIBLE";
                break;
            case 4:
                fVar = new w5.f(this.f4074k);
                str = "STATE.IS_BATTERY_LOW_AND_NOT_CHARGING";
                break;
            case 5:
                fVar = new w5.f(this.f4075l);
                str = "STATE.IS_DEVICE_LOCKED";
                break;
            case 6:
                fVar = new w5.f(q());
                str = "STATE.HIDE_INFORMATION";
                break;
            default:
                return;
        }
        g(str, fVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        android.util.Log.w("DWF:StateProvider", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(d6.f.b r4, w5.f r5) {
        /*
            r3 = this;
            java.util.Objects.toString(r4)
            r5.h()
            int r4 = r4.ordinal()
            java.lang.String r0 = "DWF:StateProvider"
            switch(r4) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0041;
                case 2: goto L_0x0031;
                case 3: goto L_0x0024;
                case 4: goto L_0x0017;
                case 5: goto L_0x0014;
                case 6: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x006c
        L_0x0011:
            java.lang.String r3 = "HIDE_INFORMATION can be set only inside of StateProvider"
            goto L_0x0069
        L_0x0014:
            java.lang.String r3 = "IS_DEVICE_LOCKED can be set only inside of StateProvider"
            goto L_0x0069
        L_0x0017:
            boolean r4 = r5.a()
            boolean r5 = r3.f4074k
            if (r5 == r4) goto L_0x006c
            r3.f4074k = r4
            d6.f$b r4 = d6.f.b.f4085k
            goto L_0x003d
        L_0x0024:
            boolean r4 = r5.a()
            boolean r5 = r3.f4073j
            if (r5 == r4) goto L_0x006c
            r3.f4073j = r4
            d6.f$b r4 = d6.f.b.f4084j
            goto L_0x003d
        L_0x0031:
            boolean r4 = r5.a()
            boolean r5 = r3.e
            if (r5 == r4) goto L_0x006c
            r3.e = r4
            d6.f$b r4 = d6.f.b.f4083i
        L_0x003d:
            r3.r(r4)
            goto L_0x006c
        L_0x0041:
            int r4 = r5.e()
            r5 = 1
            if (r4 == 0) goto L_0x005b
            r0 = 4
            if (r4 == r5) goto L_0x005a
            r1 = 3
            r2 = 2
            if (r4 == r2) goto L_0x0058
            if (r4 == r1) goto L_0x0056
            if (r4 == r0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r5 = 5
            goto L_0x005b
        L_0x0056:
            r5 = r2
            goto L_0x005b
        L_0x0058:
            r5 = r1
            goto L_0x005b
        L_0x005a:
            r5 = r0
        L_0x005b:
            int r4 = r3.f4076m
            if (r4 == r5) goto L_0x006c
            r3.f4076m = r5
            d6.f$b r4 = d6.f.b.f4082h
            r3.r(r4)
            goto L_0x006c
        L_0x0067:
            java.lang.String r3 = "updateState: invalid source"
        L_0x0069:
            android.util.Log.w(r0, r3)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.f.s(d6.f$b, w5.f):void");
    }
}
