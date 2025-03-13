package f7;

import android.content.ComponentName;
import android.util.Log;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import b6.a;
import x5.d;

public final class b extends d {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.String r13) {
        /*
            r12 = this;
            r12.<init>()
            r13.getClass()
            int r0 = r13.hashCode()
            r1 = 0
            r2 = -1
            r3 = 3
            r4 = 4
            r5 = 5
            r6 = 6
            r7 = 7
            r8 = 9
            r9 = 12
            r10 = 1
            r11 = 2
            switch(r0) {
                case -1008373095: goto L_0x00ab;
                case -232312636: goto L_0x009f;
                case -196823971: goto L_0x0093;
                case 2090926: goto L_0x0088;
                case 66096429: goto L_0x007d;
                case 71273697: goto L_0x0072;
                case 76454699: goto L_0x0067;
                case 131690940: goto L_0x005c;
                case 307714664: goto L_0x004f;
                case 467017262: goto L_0x0043;
                case 599887453: goto L_0x0036;
                case 1686257440: goto L_0x0029;
                case 2074232729: goto L_0x001d;
                default: goto L_0x001a;
            }
        L_0x001a:
            r0 = r2
            goto L_0x00b6
        L_0x001d:
            java.lang.String r0 = "DAY_OF_WEEK"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0026
            goto L_0x001a
        L_0x0026:
            r0 = r9
            goto L_0x00b6
        L_0x0029:
            java.lang.String r0 = "SUNRISE_SUNSET"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0032
            goto L_0x001a
        L_0x0032:
            r0 = 11
            goto L_0x00b6
        L_0x0036:
            java.lang.String r0 = "WATCH_BATTERY"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x003f
            goto L_0x001a
        L_0x003f:
            r0 = 10
            goto L_0x00b6
        L_0x0043:
            java.lang.String r0 = "NEXT_EVENT"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x004c
            goto L_0x001a
        L_0x004c:
            r0 = r8
            goto L_0x00b6
        L_0x004f:
            java.lang.String r0 = "TIME_AND_DATE"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x001a
        L_0x0058:
            r0 = 8
            goto L_0x00b6
        L_0x005c:
            java.lang.String r0 = "STEP_COUNT"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0065
            goto L_0x001a
        L_0x0065:
            r0 = r7
            goto L_0x00b6
        L_0x0067:
            java.lang.String r0 = "UNREAD_NOTIFICATION_COUNT"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0070
            goto L_0x001a
        L_0x0070:
            r0 = r6
            goto L_0x00b6
        L_0x0072:
            java.lang.String r0 = "WORLD_CLOCK"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x007b
            goto L_0x001a
        L_0x007b:
            r0 = r5
            goto L_0x00b6
        L_0x007d:
            java.lang.String r0 = "EMPTY"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0086
            goto L_0x001a
        L_0x0086:
            r0 = r4
            goto L_0x00b6
        L_0x0088:
            java.lang.String r0 = "DATE"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0091
            goto L_0x001a
        L_0x0091:
            r0 = r3
            goto L_0x00b6
        L_0x0093:
            java.lang.String r0 = "FAVORITE_CONTACT"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x009d
            goto L_0x001a
        L_0x009d:
            r0 = r11
            goto L_0x00b6
        L_0x009f:
            java.lang.String r0 = "APP_SHORTCUT"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x00a9
            goto L_0x001a
        L_0x00a9:
            r0 = r10
            goto L_0x00b6
        L_0x00ab:
            java.lang.String r0 = "DAY_AND_DATE"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x00b5
            goto L_0x001a
        L_0x00b5:
            r0 = r1
        L_0x00b6:
            switch(r0) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00f9;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00ec;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00e2;
                case 7: goto L_0x00dd;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00ce;
                case 11: goto L_0x00c9;
                case 12: goto L_0x00c6;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            java.lang.String r0 = "convertSystemProvider: not supported: "
            java.lang.String r0 = r0.concat(r13)
            java.lang.String r2 = "DWF:ComplicationTypeConverter"
            android.util.Log.w(r2, r0)
            r0 = 0
            goto L_0x0104
        L_0x00c6:
            r0 = 13
            goto L_0x0100
        L_0x00c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x0104
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0104
        L_0x00d3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x0104
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0104
        L_0x00dd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0104
        L_0x00e2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x0104
        L_0x00e7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0104
        L_0x00ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0104
        L_0x00f1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            goto L_0x0104
        L_0x00f6:
            r0 = 14
            goto L_0x0100
        L_0x00f9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0104
        L_0x00fe:
            r0 = 16
        L_0x0100:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0104:
            if (r0 != 0) goto L_0x0122
            java.lang.String r0 = "/"
            java.lang.String[] r13 = r13.split(r0)
            int r0 = r13.length
            if (r0 >= r11) goto L_0x0110
            return
        L_0x0110:
            r0 = r13[r1]
            r13 = r13[r10]
            if (r0 == 0) goto L_0x012a
            if (r13 == 0) goto L_0x012a
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r0, r13)
            r12.f8159b = r1
            r12.f8160c = r3
            goto L_0x012a
        L_0x0122:
            r12.f8160c = r11
            int r13 = r0.intValue()
            r12.f8158a = r13
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.b.<init>(java.lang.String):void");
    }

    public final String toString() {
        String format;
        String str;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f8160c;
        if (i8 == 2) {
            Object[] objArr = new Object[1];
            int i9 = this.f8158a;
            switch (i9) {
                case ComplicationOverlayWireFormat.ENABLED_UNKNOWN:
                    str = "EMPTY";
                    break;
                case 1:
                    str = "WATCH_BATTERY";
                    break;
                case 2:
                    str = "DATE";
                    break;
                case 3:
                    str = "TIME_AND_DATE";
                    break;
                case 4:
                    str = "STEP_COUNT";
                    break;
                case 5:
                    str = "WORLD_CLOCK";
                    break;
                case 6:
                    str = "APP_SHORTCUT";
                    break;
                case 7:
                    str = "UNREAD_NOTIFICATION_COUNT";
                    break;
                case 9:
                    str = "NEXT_EVENT";
                    break;
                case 12:
                    str = "SUNRISE_SUNSET";
                    break;
                case 13:
                    str = "DAY_OF_WEEK";
                    break;
                case 14:
                    str = "FAVORITE_CONTACT";
                    break;
                case 16:
                    str = "DAY_AND_DATE";
                    break;
                default:
                    Log.w("DWF:ComplicationTypeConverter", "convertSystemProviderToString: not supported: " + i9);
                    str = null;
                    break;
            }
            objArr[0] = str;
            format = String.format("  default provider : %s", objArr);
        } else {
            if (i8 == 3) {
                Object[] objArr2 = new Object[1];
                ComponentName componentName = this.f8159b;
                objArr2[0] = componentName == null ? "null" : componentName.toString();
                format = String.format("  default provider : %s", objArr2);
            }
            sb.append(String.format(" (%s)", new Object[]{a.l(this.f8160c)}));
            return sb.toString();
        }
        sb.append(format);
        sb.append(String.format(" (%s)", new Object[]{a.l(this.f8160c)}));
        return sb.toString();
    }
}
