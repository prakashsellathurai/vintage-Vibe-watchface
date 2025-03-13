package com.samsung.watchface.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import x0.a;

public class DebugBroadcastReceiver extends BroadcastReceiver {
    public static void a(Context context, String str, String str2, boolean z8) {
        Intent intent = new Intent("com.samsung.watchface.debug.SET_DATA_VALUE");
        intent.putExtra("source", str);
        intent.putExtra("value", str2);
        intent.putExtra("pause", z8);
        a.a(context).b(intent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f9, code lost:
        r12.putExtra("enabled", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fc, code lost:
        x0.a.a(r11).b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020b, code lost:
        x0.a.a(r11).b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            android.os.Bundle r10 = r12.getExtras()
            java.lang.String r0 = "com.samsung.watchface.DEBUG_WATCH_FACE"
            java.lang.String r12 = r12.getAction()
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0229
            if (r10 != 0) goto L_0x0014
            goto L_0x0229
        L_0x0014:
            java.lang.String r12 = "operation"
            java.lang.String r12 = r10.getString(r12)
            if (r12 != 0) goto L_0x001d
            return
        L_0x001d:
            int r0 = r12.hashCode()
            r1 = 7
            java.lang.String r2 = "setWatchFace"
            r3 = 5
            r4 = 2
            r5 = 1
            r6 = 0
            switch(r0) {
                case -1354792126: goto L_0x0095;
                case -934426579: goto L_0x008a;
                case -826951352: goto L_0x007f;
                case 3209: goto L_0x0074;
                case 101609: goto L_0x0069;
                case 3560141: goto L_0x005e;
                case 950484197: goto L_0x0053;
                case 1258307978: goto L_0x0049;
                case 1434012260: goto L_0x003b;
                case 1967687803: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x00a0
        L_0x002d:
            java.lang.String r0 = "pause_viewer"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0037
            goto L_0x00a0
        L_0x0037:
            r12 = 9
            goto L_0x00a1
        L_0x003b:
            java.lang.String r0 = "resume_viewer"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0045
            goto L_0x00a0
        L_0x0045:
            r12 = 8
            goto L_0x00a1
        L_0x0049:
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0051
            goto L_0x00a0
        L_0x0051:
            r12 = r1
            goto L_0x00a1
        L_0x0053:
            java.lang.String r0 = "compare"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x005c
            goto L_0x00a0
        L_0x005c:
            r12 = 6
            goto L_0x00a1
        L_0x005e:
            java.lang.String r0 = "time"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0067
            goto L_0x00a0
        L_0x0067:
            r12 = r3
            goto L_0x00a1
        L_0x0069:
            java.lang.String r0 = "fps"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0072
            goto L_0x00a0
        L_0x0072:
            r12 = 4
            goto L_0x00a1
        L_0x0074:
            java.lang.String r0 = "dm"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r12 = 3
            goto L_0x00a1
        L_0x007f:
            java.lang.String r0 = "drawRect"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0088
            goto L_0x00a0
        L_0x0088:
            r12 = r4
            goto L_0x00a1
        L_0x008a:
            java.lang.String r0 = "resume"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0093
            goto L_0x00a0
        L_0x0093:
            r12 = r5
            goto L_0x00a1
        L_0x0095:
            java.lang.String r0 = "config"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r12 = r6
            goto L_0x00a1
        L_0x00a0:
            r12 = -1
        L_0x00a1:
            java.lang.String r0 = "pause"
            java.lang.String r7 = "DWF:DebugBroadcastReceiver"
            java.lang.String r8 = "value"
            java.lang.String r9 = "enabled"
            switch(r12) {
                case 0: goto L_0x0213;
                case 1: goto L_0x0204;
                case 2: goto L_0x01ee;
                case 3: goto L_0x01be;
                case 4: goto L_0x01b2;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x0229
        L_0x00ae:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r12 = "com.samsung.watchface.debug.DEBUG_PAUSE_VIEWER"
            r10.<init>(r12)
            goto L_0x020b
        L_0x00b7:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r12 = "com.samsung.watchface.debug.DEBUG_RESUME_VIEWER"
            r10.<init>(r12)
            goto L_0x020b
        L_0x00c0:
            java.lang.String r10 = r10.getString(r8)
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_SET_WATCHFACE"
            r12.<init>(r0)
            r12.putExtra(r2, r10)
            goto L_0x01fc
        L_0x00d0:
            x0.a r10 = x0.a.a(r11)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r12 = "com.samsung.watchface.debug.DEBUG_COMPARE_RESULT"
            r11.<init>(r12)
            r10.b(r11)
            goto L_0x0229
        L_0x00e0:
            java.lang.String r12 = r10.getString(r8)
            if (r12 != 0) goto L_0x00ec
            java.lang.String r10 = "time: no time string"
            android.util.Log.e(r7, r10)
            return
        L_0x00ec:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r8 = "yyyy:MM:dd:EEE:HH:mm:ss:SSS"
            java.util.Locale r9 = java.util.Locale.getDefault()
            r2.<init>(r8, r9)
            boolean r10 = r10.getBoolean(r0, r5)
            java.util.Date r12 = r2.parse(r12)     // Catch:{ ParseException -> 0x01ac }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ ParseException -> 0x01ac }
            r0.setTime(r12)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.V     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            int r2 = r0.get(r5)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r2, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.P     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            int r2 = r0.get(r4)     // Catch:{ ParseException -> 0x01ac }
            int r2 = r2 + r5
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r2, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.E     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            int r2 = r0.get(r3)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r2, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.L     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            int r1 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r1, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.y     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            r1 = 11
            int r1 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r1, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.f8051u     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            r1 = 10
            int r1 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r1, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.f8041o     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            r1 = 12
            int r1 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r1, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.f8033k     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            r1 = 13
            int r1 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r1, r10)     // Catch:{ ParseException -> 0x01ac }
            w5.d r12 = w5.d.f8027h     // Catch:{ ParseException -> 0x01ac }
            java.lang.String[] r12 = r12.f8059f     // Catch:{ ParseException -> 0x01ac }
            r12 = r12[r6]     // Catch:{ ParseException -> 0x01ac }
            r1 = 14
            int r0 = r0.get(r1)     // Catch:{ ParseException -> 0x01ac }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ ParseException -> 0x01ac }
            a(r11, r12, r0, r10)     // Catch:{ ParseException -> 0x01ac }
            goto L_0x0229
        L_0x01ac:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            goto L_0x01ea
        L_0x01b2:
            boolean r10 = r10.getBoolean(r9, r6)
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r0 = "com.samsung.watchface.debug.ENABLE_FPS"
            r12.<init>(r0)
            goto L_0x01f9
        L_0x01be:
            java.lang.String r12 = "source"
            java.lang.String r12 = r10.getString(r12)
            java.lang.String r1 = r10.getString(r8)
            boolean r10 = r10.getBoolean(r0, r6)
            if (r12 == 0) goto L_0x01d4
            if (r1 == 0) goto L_0x01d4
            a(r11, r12, r1, r10)
            goto L_0x0229
        L_0x01d4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "dm: invalid parameters: "
            r10.<init>(r11)
            r10.append(r12)
            java.lang.String r11 = "/"
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
        L_0x01ea:
            android.util.Log.e(r7, r10)
            goto L_0x0229
        L_0x01ee:
            boolean r10 = r10.getBoolean(r9, r6)
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r0 = "com.samsung.watchface.debug.DEBUG_DRAW_BOUNDS"
            r12.<init>(r0)
        L_0x01f9:
            r12.putExtra(r9, r10)
        L_0x01fc:
            x0.a r10 = x0.a.a(r11)
            r10.b(r12)
            goto L_0x0229
        L_0x0204:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r12 = "com.samsung.watchface.debug.DEBUG_RESUME_DATA_MANAGER"
            r10.<init>(r12)
        L_0x020b:
            x0.a r11 = x0.a.a(r11)
            r11.b(r10)
            goto L_0x0229
        L_0x0213:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r12 = r11.getPackageName()
            java.lang.String r0 = "com.samsung.android.wearable.watchfacestudio.editor.EditorActivity"
            r10.setClassName(r12, r0)
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r10.setFlags(r12)
            r11.startActivity(r10)
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.watchface.debug.DebugBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
