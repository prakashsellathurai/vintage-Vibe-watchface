package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: p  reason: collision with root package name */
    public static final PorterDuff.Mode f1047p = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    public int f1048f;

    /* renamed from: g  reason: collision with root package name */
    public Object f1049g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f1050h;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f1051i;

    /* renamed from: j  reason: collision with root package name */
    public int f1052j;

    /* renamed from: k  reason: collision with root package name */
    public int f1053k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1054l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1055m;

    /* renamed from: n  reason: collision with root package name */
    public String f1056n;

    /* renamed from: o  reason: collision with root package name */
    public String f1057o;

    public static class a {
        public static Uri a(Object obj) {
            return c.d(obj);
        }

        public static Drawable b(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon c(IconCompat iconCompat, Context context) {
            Icon icon;
            String str;
            Uri uri;
            int i8 = iconCompat.f1048f;
            switch (i8) {
                case ComplicationOverlayWireFormat.ENABLED_UNKNOWN /*-1*/:
                    return (Icon) iconCompat.f1049g;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f1049g);
                    break;
                case 2:
                    if (i8 == -1) {
                        str = c.b(iconCompat.f1049g);
                    } else if (i8 == 2) {
                        String str2 = iconCompat.f1057o;
                        str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f1049g).split(":", -1)[0] : iconCompat.f1057o;
                    } else {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    icon = Icon.createWithResource(str, iconCompat.f1052j);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f1049g, iconCompat.f1052j, iconCompat.f1053k);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f1049g);
                    break;
                case 5:
                    icon = b.b((Bitmap) iconCompat.f1049g);
                    break;
                case 6:
                    if (i8 == -1) {
                        uri = a(iconCompat.f1049g);
                    } else if (i8 == 4 || i8 == 6) {
                        uri = Uri.parse((String) iconCompat.f1049g);
                    } else {
                        throw new IllegalStateException("called getUri() on " + iconCompat);
                    }
                    icon = d.a(uri);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f1054l;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1055m;
            if (mode != IconCompat.f1047p) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1048f = -1;
        this.f1050h = null;
        this.f1051i = null;
        this.f1052j = 0;
        this.f1053k = 0;
        this.f1054l = null;
        this.f1055m = f1047p;
        this.f1056n = null;
    }

    public IconCompat(int i8) {
        this.f1050h = null;
        this.f1051i = null;
        this.f1052j = 0;
        this.f1053k = 0;
        this.f1054l = null;
        this.f1055m = f1047p;
        this.f1056n = null;
        this.f1048f = i8;
    }

    public static IconCompat a(int i8, String str) {
        str.getClass();
        if (i8 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1052j = i8;
            iconCompat.f1049g = str;
            iconCompat.f1057o = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int b() {
        int i8 = this.f1048f;
        if (i8 == -1) {
            return c.a(this.f1049g);
        }
        if (i8 == 2) {
            return this.f1052j;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1048f
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r4 = r4.f1049g
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1048f
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f1048f
            switch(r1) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007d;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009d
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1049g
            r0.append(r1)
            goto L_0x009d
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1052j
            r0.append(r1)
            int r1 = r4.f1053k
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1053k
            goto L_0x009a
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f1057o
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009d
        L_0x007d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1049g
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1049g
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009a:
            r0.append(r1)
        L_0x009d:
            android.content.res.ColorStateList r1 = r4.f1054l
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1054l
            r0.append(r1)
        L_0x00ab:
            android.graphics.PorterDuff$Mode r1 = r4.f1055m
            android.graphics.PorterDuff$Mode r2 = f1047p
            if (r1 == r2) goto L_0x00bb
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r4 = r4.f1055m
            r0.append(r4)
        L_0x00bb:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
