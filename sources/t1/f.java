package t1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import p1.a;
import q7.k;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7426a;

    /* renamed from: b  reason: collision with root package name */
    public int f7427b;

    /* renamed from: c  reason: collision with root package name */
    public Object f7428c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7429d;

    public f(int i8, a aVar, Bundle bundle) {
        this.f7426a = 0;
        k.e(bundle, "extras");
        this.f7427b = i8;
        this.f7428c = aVar;
        this.f7429d = bundle;
    }

    public final Object a() {
        return Integer.valueOf(this.f7427b);
    }

    public final String toString() {
        switch (this.f7426a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f7427b);
                sb.append(',');
                sb.append((a) this.f7428c);
                sb.append(',');
                Bundle bundle = (Bundle) this.f7429d;
                k.e(bundle, "<this>");
                Set<String> keySet = bundle.keySet();
                k.d(keySet, "keySet()");
                ArrayList arrayList = new ArrayList(i7.f.M(keySet));
                for (String str : keySet) {
                    arrayList.add(str + ": " + bundle.get(str));
                }
                sb.append(arrayList);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca A[SYNTHETIC, Splitter:B:38:0x00ca] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.util.ArrayList r9) {
        /*
            r8 = this;
            r0 = 1
            r8.f7426a = r0
            r8.<init>()
            java.lang.String r1 = "ANALOG"
            r8.f7428c = r1
            r1 = 0
            r8.f7429d = r1
            r2 = -1
            r8.f7427b = r2
            java.util.Iterator r9 = r9.iterator()
        L_0x0014:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00e1
            java.lang.Object r3 = r9.next()
            i6.e r3 = (i6.e) r3
            java.lang.String r4 = "key"
            i6.a r4 = r3.b(r4)
            java.lang.String r4 = r4.d()
            java.lang.String r5 = "value"
            i6.a r3 = r3.b(r5)
            java.lang.String r3 = r3.d()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0014
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0041
            goto L_0x0014
        L_0x0041:
            int r5 = r4.hashCode()
            r6 = -134180698(0xfffffffff80090a6, float:-1.0430435E34)
            r7 = 2
            if (r5 == r6) goto L_0x006c
            r6 = 984161540(0x3aa91d04, float:0.0012902324)
            if (r5 == r6) goto L_0x0061
            r6 = 1604690155(0x5fa5a0eb, float:2.3869595E19)
            if (r5 == r6) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            java.lang.String r5 = "CLOCK_TYPE"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x005f
            goto L_0x0074
        L_0x005f:
            r5 = r7
            goto L_0x0077
        L_0x0061:
            java.lang.String r5 = "PREVIEW_TIME"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x006a
            goto L_0x0074
        L_0x006a:
            r5 = r0
            goto L_0x0077
        L_0x006c:
            java.lang.String r5 = "STEP_GOAL"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0076
        L_0x0074:
            r5 = r2
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            java.lang.String r6 = "DWF:WatchFaceMetadata"
            if (r5 == 0) goto L_0x00ca
            if (r5 == r0) goto L_0x009e
            if (r5 == r7) goto L_0x009a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "unhandled metadata: "
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = "::"
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r6, r3)
            goto L_0x0014
        L_0x009a:
            r8.f7428c = r3
            goto L_0x0014
        L_0x009e:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "HH:mm:ss"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r4.<init>(r5, r7)
            java.lang.String r5 = "UTC"
            java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r5)
            r4.setTimeZone(r5)
            java.util.Date r3 = r4.parse(r3)     // Catch:{ ParseException -> 0x00bd }
            if (r3 == 0) goto L_0x00c5
            java.time.Instant r3 = r3.toInstant()     // Catch:{ ParseException -> 0x00bd }
            goto L_0x00c6
        L_0x00bd:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            android.util.Log.e(r6, r3)
        L_0x00c5:
            r3 = r1
        L_0x00c6:
            r8.f7429d = r3
            goto L_0x0014
        L_0x00ca:
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00d3 }
            int r3 = java.lang.Math.max(r4, r0)     // Catch:{ NumberFormatException -> 0x00d3 }
            goto L_0x00dd
        L_0x00d3:
            java.lang.String r4 = "fail to parse int: "
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.w(r6, r3)
            r3 = r2
        L_0x00dd:
            r8.f7427b = r3
            goto L_0x0014
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.f.<init>(java.util.ArrayList):void");
    }
}
