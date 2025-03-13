package a3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p2.g;
import p2.i;
import r2.v;

public final class c implements i<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f168a;

    public c(Context context) {
        this.f168a = context.getApplicationContext();
    }

    public final boolean a(Object obj, g gVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final /* bridge */ /* synthetic */ v b(Object obj, int i8, int i9, g gVar) {
        return c((Uri) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r2.v c(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAuthority()
            android.content.Context r6 = r6.f168a
            java.lang.String r1 = r6.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            android.content.Context r0 = r6.createPackageContext(r0, r2)     // Catch:{ NameNotFoundException -> 0x0017 }
            goto L_0x0023
        L_0x0017:
            r1 = move-exception
            java.lang.String r3 = r6.getPackageName()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00b6
        L_0x0022:
            r0 = r6
        L_0x0023:
            java.util.List r1 = r7.getPathSegments()
            int r3 = r1.size()
            r4 = 2
            r5 = 1
            if (r3 != r4) goto L_0x006e
            java.util.List r1 = r7.getPathSegments()
            java.lang.String r3 = r7.getAuthority()
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            android.content.res.Resources r4 = r0.getResources()
            int r3 = r4.getIdentifier(r1, r2, r3)
            if (r3 != 0) goto L_0x0057
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r4 = "android"
            int r3 = r3.getIdentifier(r1, r2, r4)
        L_0x0057:
            if (r3 == 0) goto L_0x005a
            goto L_0x0084
        L_0x005a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find resource id for: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x006e:
            int r1 = r1.size()
            java.lang.String r3 = "Unrecognized Uri format: "
            if (r1 != r5) goto L_0x00a4
            java.util.List r1 = r7.getPathSegments()
            java.lang.Object r1 = r1.get(r2)     // Catch:{ NumberFormatException -> 0x0091 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0091 }
            int r3 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0091 }
        L_0x0084:
            r7 = 0
            android.graphics.drawable.Drawable r6 = a3.a.a(r6, r0, r3, r7)
            if (r6 == 0) goto L_0x0090
            o2.k r7 = new o2.k
            r7.<init>(r6, r5)
        L_0x0090:
            return r7
        L_0x0091:
            r6 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r6)
            throw r0
        L_0x00a4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L_0x00b6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.c.c(android.net.Uri):r2.v");
    }
}
