package j6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ImageDecoder;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import m6.c;
import m6.d;
import n6.g;

public final class a extends b {
    public a(Context context, Context context2) {
        super(context, context2);
    }

    public static String p(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(46);
        return lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : str;
    }

    public final Typeface b(String str) {
        String p8 = p(str);
        Resources resources = this.e;
        int identifier = resources.getIdentifier(p8, "font", this.f5039f);
        if (identifier != 0) {
            return resources.getFont(identifier);
        }
        return null;
    }

    public final ImageDecoder.Source e(String str) {
        if (g.e(str)) {
            return null;
        }
        String p8 = p(str);
        Resources resources = this.e;
        int identifier = resources.getIdentifier(p8, "drawable", this.f5039f);
        if (identifier != 0) {
            return ImageDecoder.createSource(resources, identifier);
        }
        Log.e("DWF:AndroidResourceManager", "Not found '" + str + "' from drawable res");
        return null;
    }

    public final boolean h(String str) {
        return this.e.getIdentifier(p(str), "font", this.f5039f) != 0;
    }

    public final InputStream m(String str) {
        String p8 = p(str);
        Resources resources = this.e;
        String str2 = this.f5039f;
        int identifier = resources.getIdentifier(p8, "raw", str2);
        if (identifier != 0) {
            return resources.openRawResource(identifier);
        }
        int identifier2 = resources.getIdentifier(p(str), "drawable", str2);
        return this.f5038d.getContentResolver().openInputStream(Uri.parse("android.resource://" + b.a(resources.getResourcePackageName(identifier2), resources.getResourceTypeName(identifier2), resources.getResourceEntryName(identifier2))));
    }

    public final InputStream n() {
        InputStream inputStream;
        InputStream inputStream2;
        String p8 = p("watch_face_shapes.xml");
        Resources resources = this.e;
        String str = this.f5039f;
        int identifier = resources.getIdentifier(p8, "xml", str);
        InputStream inputStream3 = null;
        if (identifier == 0) {
            int identifier2 = resources.getIdentifier(p("watchface.xml"), "raw", str);
            if (identifier2 != 0) {
                inputStream2 = resources.openRawResource(identifier2);
                this.f5040g = inputStream2;
            } else {
                inputStream2 = null;
            }
            if (inputStream2 != null) {
                return inputStream2;
            }
            int identifier3 = resources.getIdentifier(p("watchface.xml"), "xml", str);
            if (identifier3 == 0) {
                return null;
            }
            InputStream openRawResource = resources.openRawResource(identifier3);
            this.f5040g = openRawResource;
            return openRawResource;
        }
        XmlResourceParser xml = resources.getXml(identifier);
        try {
            ArrayList a9 = d.a(xml);
            if (a9.size() == 0) {
                int identifier4 = resources.getIdentifier(p("watchface.xml"), "raw", str);
                if (identifier4 != 0) {
                    inputStream = resources.openRawResource(identifier4);
                    this.f5040g = inputStream;
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    inputStream3 = inputStream;
                } else {
                    int identifier5 = resources.getIdentifier(p("watchface.xml"), "xml", str);
                    if (identifier5 != 0) {
                        inputStream3 = resources.openRawResource(identifier5);
                        this.f5040g = inputStream3;
                    }
                }
                if (xml == null) {
                    return inputStream3;
                }
            } else {
                d a10 = new c(Resources.getSystem().getDisplayMetrics().widthPixels, this.f5035a.getConfiguration().isScreenRound(), Resources.getSystem().getDisplayMetrics().heightPixels).a(a9);
                int i8 = a10.f5466d;
                if (i8 == 0) {
                    Log.e("DWF:AndroidResourceManager", String.format("Shape definition for %s, %sx%s has an invalid layout", new Object[]{a10.f5463a, Integer.valueOf(a10.f5464b), Integer.valueOf(a10.f5465c)}));
                    if (xml == null) {
                        return null;
                    }
                } else {
                    inputStream3 = resources.openRawResource(i8);
                    this.f5040g = inputStream3;
                    if (xml == null) {
                        return inputStream3;
                    }
                }
            }
            xml.close();
            return inputStream3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
