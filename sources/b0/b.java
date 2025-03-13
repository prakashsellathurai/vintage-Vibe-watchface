package b0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2504a = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        public static Drawable b(Resources resources, int i8, int i9, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i9, theme);
        }
    }

    /* renamed from: b0.b$b  reason: collision with other inner class name */
    public static abstract class C0027b {
        public final void a(int i8) {
            new Handler(Looper.getMainLooper()).post(new d(this, i8));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new c(this, 0, typeface));
        }

        public abstract void c(int i8);

        public abstract void d(Typeface typeface);
    }

    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r11 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        if (r11 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r15, int r16, android.util.TypedValue r17, int r18, b0.b.C0027b r19, boolean r20) {
        /*
            r10 = r16
            r0 = r17
            r7 = r18
            r11 = r19
            android.content.res.Resources r3 = r15.getResources()
            r1 = 1
            r3.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00bb
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = -3
            if (r1 != 0) goto L_0x002a
            if (r11 == 0) goto L_0x0097
        L_0x0025:
            r11.a(r14)
            goto L_0x0097
        L_0x002a:
            int r1 = r0.assetCookie
            p.e<java.lang.String, android.graphics.Typeface> r2 = c0.c.f2639b
            java.lang.String r1 = c0.c.c(r3, r10, r13, r1, r7)
            java.lang.Object r1 = r2.a(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0040
            if (r11 == 0) goto L_0x0098
            r11.b(r1)
            goto L_0x0098
        L_0x0040:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            if (r1 == 0) goto L_0x0076
            android.content.res.XmlResourceParser r1 = r3.getXml(r10)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            b0.a$b r2 = b0.a.a(r1, r3)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            if (r2 != 0) goto L_0x0061
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            if (r11 == 0) goto L_0x0097
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            goto L_0x0097
        L_0x0061:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            r1 = r15
            r4 = r16
            r5 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            android.graphics.Typeface r1 = c0.c.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            goto L_0x0098
        L_0x0072:
            r0 = move-exception
            goto L_0x0088
        L_0x0074:
            r0 = move-exception
            goto L_0x008b
        L_0x0076:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            android.graphics.Typeface r1 = c0.c.b(r3, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            if (r11 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0084
            r11.b(r1)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            goto L_0x0098
        L_0x0084:
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x0074, IOException -> 0x0072 }
            goto L_0x0098
        L_0x0088:
            java.lang.String r1 = "Failed to read xml resource "
            goto L_0x008d
        L_0x008b:
            java.lang.String r1 = "Failed to parse xml resource "
        L_0x008d:
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
            if (r11 == 0) goto L_0x0097
            goto L_0x0025
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 != 0) goto L_0x00ba
            if (r11 == 0) goto L_0x009d
            goto L_0x00ba
        L_0x009d:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            return r1
        L_0x00bb:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Resource \""
            r2.<init>(r4)
            java.lang.String r3 = r3.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r16)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.a(android.content.Context, int, android.util.TypedValue, int, b0.b$b, boolean):android.graphics.Typeface");
    }
}
