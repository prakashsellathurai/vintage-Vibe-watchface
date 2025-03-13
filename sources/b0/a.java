package b0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import g0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k3.j;
import org.xmlpull.v1.XmlPullParserException;

public final class a {

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    public static class C0026a {
        public static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final d[] f2495a;

        public c(d[] dVarArr) {
            this.f2495a = dVarArr;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f2496a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2497b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2498c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2499d;
        public final int e;

        public d(int i8, int i9, int i10, String str, String str2, boolean z8) {
            this.f2496a = i8;
            this.f2497b = z8;
            this.f2498c = str2;
            this.f2499d = i9;
            this.e = i10;
        }
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final f f2500a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2501b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2502c;

        /* renamed from: d  reason: collision with root package name */
        public final String f2503d;

        public e(f fVar, int i8, int i9, String str) {
            this.f2500a = fVar;
            this.f2502c = i8;
            this.f2501b = i9;
            this.f2503d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j.f5166v);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j.w);
                                int i8 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i8 = 1;
                                }
                                int i9 = obtainAttributes2.getInt(i8, 400);
                                boolean z8 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i10 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i10 = 3;
                                }
                                int i11 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i11 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i11);
                                int i12 = obtainAttributes2.getInt(i10, 0);
                                int i13 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i13, 0);
                                String string6 = obtainAttributes2.getString(i13);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new d(i9, i12, resourceId2, string6, string5, z8));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new c((d[]) arrayList.toArray(new d[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new f(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i8) {
        if (i8 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (C0026a.a(obtainTypedArray, 0) == 1) {
                for (int i9 = 0; i9 < obtainTypedArray.length(); i9++) {
                    int resourceId = obtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i8);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }
}
