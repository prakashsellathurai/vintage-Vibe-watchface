package v1;

import android.graphics.drawable.Icon;
import java.util.Objects;
import k3.j;
import q7.k;

public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r4 != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(android.graphics.drawable.Icon r4, android.graphics.drawable.Icon r5) {
        /*
            r0 = 1
            if (r4 == r5) goto L_0x0052
            r1 = 0
            if (r4 != 0) goto L_0x0008
            if (r5 == 0) goto L_0x004b
        L_0x0008:
            if (r4 == 0) goto L_0x004d
            if (r5 == 0) goto L_0x004d
            int r2 = r4.getType()
            int r3 = r5.getType()
            if (r2 != r3) goto L_0x004d
            int r2 = r4.getType()
            r3 = 2
            if (r2 == r3) goto L_0x002e
            r3 = 4
            if (r2 == r3) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            android.net.Uri r4 = r4.getUri()
            android.net.Uri r5 = r5.getUri()
        L_0x0029:
            boolean r4 = q7.k.a(r4, r5)
            goto L_0x0049
        L_0x002e:
            int r2 = r4.getResId()
            int r3 = r5.getResId()
            if (r2 != r3) goto L_0x0048
            java.lang.String r4 = r4.getResPackage()
            java.lang.String r5 = r5.getResPackage()
            boolean r4 = q7.k.a(r4, r5)
            if (r4 == 0) goto L_0x0048
            r4 = r0
            goto L_0x0049
        L_0x0048:
            r4 = r1
        L_0x0049:
            if (r4 == 0) goto L_0x004d
        L_0x004b:
            r4 = r0
            goto L_0x004e
        L_0x004d:
            r4 = r1
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.b.a(android.graphics.drawable.Icon, android.graphics.drawable.Icon):boolean");
    }

    public static final int b(Icon icon) {
        k.e(icon, "<this>");
        j jVar = j.f5163s;
        int type = icon.getType();
        if (type == 2) {
            return Objects.hash(new Object[]{Integer.valueOf(icon.getType()), Integer.valueOf(icon.getResId()), icon.getResPackage()});
        } else if (type != 4) {
            return jVar.hashCode();
        } else {
            return Objects.hash(new Object[]{Integer.valueOf(icon.getType()), icon.getUri()});
        }
    }
}
