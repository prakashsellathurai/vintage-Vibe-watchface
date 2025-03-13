package u1;

import android.annotation.SuppressLint;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Icon;
import java.io.DataOutputStream;
import k3.j;
import p7.l;
import q7.k;

public final class r {
    public static final Object a(XmlResourceParser xmlResourceParser, String str, l lVar, Object obj, String str2) {
        if (j.F(xmlResourceParser, str)) {
            String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
            k.b(attributeValue);
            return lVar.invoke(attributeValue);
        } else if (obj != null) {
            return obj;
        } else {
            throw new IllegalArgumentException(str + " is required for " + str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final u1.t b(android.graphics.drawable.Icon r6, android.content.Context r7) {
        /*
            int r0 = r6.getType()
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L_0x004d
            r1 = 4
            java.lang.String r3 = "content"
            if (r0 == r1) goto L_0x002e
            r1 = 6
            if (r0 == r1) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            android.net.Uri r0 = r6.getUri()
            java.lang.String r0 = r0.getScheme()
            boolean r0 = q7.k.a(r0, r3)
            if (r0 == 0) goto L_0x004b
            android.content.ContentResolver r0 = r7.getContentResolver()
            android.net.Uri r1 = r6.getUri()
            java.io.InputStream r0 = r0.openInputStream(r1)
            if (r0 == 0) goto L_0x004b
            goto L_0x0063
        L_0x002e:
            android.net.Uri r0 = r6.getUri()
            java.lang.String r0 = r0.getScheme()
            boolean r0 = q7.k.a(r0, r3)
            if (r0 == 0) goto L_0x004b
            android.content.ContentResolver r0 = r7.getContentResolver()
            android.net.Uri r1 = r6.getUri()
            java.io.InputStream r0 = r0.openInputStream(r1)
            if (r0 == 0) goto L_0x004b
            goto L_0x0063
        L_0x004b:
            r1 = r2
            goto L_0x0090
        L_0x004d:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = r6.getResId()
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            java.io.InputStream r0 = r0.openRawResource(r1, r3)
            java.lang.String r1 = "context.resources.openRa…icon.resId, TypedValue())"
            q7.k.d(r0, r1)
        L_0x0063:
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r3 = "context.resources"
            q7.k.d(r1, r3)
            int r3 = r0.available()     // Catch:{ all -> 0x00a8 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00a8 }
            r4.<init>()     // Catch:{ all -> 0x00a8 }
            r5 = 1
            r4.inJustDecodeBounds = r5     // Catch:{ all -> 0x00a8 }
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch:{ all -> 0x00a8 }
            r5.<init>()     // Catch:{ all -> 0x00a8 }
            android.graphics.BitmapFactory.decodeResourceStream(r1, r5, r0, r2, r4)     // Catch:{ all -> 0x00a8 }
            u1.t r1 = new u1.t     // Catch:{ all -> 0x00a8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a8 }
            int r5 = r4.outWidth     // Catch:{ all -> 0x00a8 }
            int r4 = r4.outHeight     // Catch:{ all -> 0x00a8 }
            r1.<init>(r3, r5, r4)     // Catch:{ all -> 0x00a8 }
            r0.close()
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            return r1
        L_0x0093:
            android.graphics.drawable.Drawable r6 = r6.loadDrawable(r7)
            q7.k.b(r6)
            u1.t r7 = new u1.t
            int r0 = r6.getMinimumWidth()
            int r6 = r6.getMinimumHeight()
            r7.<init>(r2, r0, r6)
            return r7
        L_0x00a8:
            r6 = move-exception
            r0.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.r.b(android.graphics.drawable.Icon, android.content.Context):u1.t");
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static final void c(Icon icon, DataOutputStream dataOutputStream) {
        String str;
        dataOutputStream.writeInt(icon.getType());
        int type = icon.getType();
        if (type == 2) {
            dataOutputStream.writeInt(icon.getResId());
            str = icon.getResPackage();
        } else if (type == 4 || type == 6) {
            str = icon.getUri().toString();
        } else {
            return;
        }
        dataOutputStream.writeUTF(str);
    }
}
