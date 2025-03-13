package n6;

import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import java.util.Locale;

public final class i {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.icu.util.ULocale a(java.lang.String r4, java.util.List r5) {
        /*
            android.icu.util.ULocale r0 = android.icu.util.ULocale.getDefault()
            java.lang.String r0 = r0.toString()
            int r1 = r5.size()
            if (r1 != 0) goto L_0x000f
            goto L_0x002f
        L_0x000f:
            java.util.stream.Stream r1 = r5.stream()
            r5.g r2 = new r5.g
            r3 = 4
            r2.<init>(r3, r0)
            java.util.stream.Stream r0 = r1.filter(r2)
            java.util.Optional r0 = r0.findFirst()
            r1 = 0
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.orElse(r5)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L_0x002f:
            boolean r5 = n6.g.e(r4)
            if (r5 != 0) goto L_0x0049
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "@calendar="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x0049:
            android.icu.util.ULocale r4 = new android.icu.util.ULocale
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.i.a(java.lang.String, java.util.List):android.icu.util.ULocale");
    }

    public static int b(Calendar calendar) {
        boolean z8 = true;
        int i8 = calendar.get(2) + 1;
        int i9 = calendar.get(1);
        if (i8 != 2) {
            return (i8 == 4 || i8 == 6 || i8 == 9 || i8 == 11) ? 30 : 31;
        }
        if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
            z8 = false;
        }
        return !z8 ? 28 : 29;
    }

    public static float c(Calendar calendar) {
        return ((float) (calendar.get(2) + 1)) + (((float) (calendar.get(5) - 1)) / ((float) b(calendar)));
    }

    public static String d(TimeZone timeZone, long j8, boolean z8) {
        int offset = (z8 ? timeZone.getOffset(j8) : timeZone.getRawOffset()) / 60000;
        int i8 = offset / 60;
        int i9 = offset % 60;
        StringBuilder sb = new StringBuilder();
        if (i8 > 0) {
            sb.append("+");
        }
        sb.append(i8);
        if (i9 != 0) {
            sb.append(String.format(Locale.getDefault(), ":%02d", new Object[]{Integer.valueOf(Math.abs(i9))}));
        }
        return sb.toString();
    }
}
