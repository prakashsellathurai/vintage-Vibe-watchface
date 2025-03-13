package p1;

import android.content.ComponentName;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.util.ArrayList;
import k3.j;
import q1.d;
import q7.k;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f6289a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6290b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f6291c;

    /* renamed from: d  reason: collision with root package name */
    public final d f6292d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final d f6293f;

    public static final class a {
        public static g a(Resources resources, XmlResourceParser xmlResourceParser, String str) {
            k.e(resources, "resources");
            k.e(xmlResourceParser, "parser");
            String B = j.B(resources, xmlResourceParser, "primaryDataSource");
            d dVar = null;
            ComponentName unflattenFromString = B != null ? ComponentName.unflattenFromString(B) : null;
            boolean z8 = false;
            d a9 = j.F(xmlResourceParser, "primaryDataSourceDefaultType") ? d.a.a(xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "primaryDataSourceDefaultType", 0)) : null;
            String B2 = j.B(resources, xmlResourceParser, "secondaryDataSource");
            ComponentName unflattenFromString2 = B2 != null ? ComponentName.unflattenFromString(B2) : null;
            if (j.F(xmlResourceParser, "secondaryDataSourceDefaultType")) {
                dVar = d.a.a(xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "secondaryDataSourceDefaultType", 0));
            }
            d dVar2 = dVar;
            if (j.F(xmlResourceParser, "systemDataSourceFallback")) {
                int attributeIntValue = xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "systemDataSourceFallback", 0);
                if (j.F(xmlResourceParser, "systemDataSourceFallbackDefaultType")) {
                    d a10 = d.a.a(xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "systemDataSourceFallbackDefaultType", 0));
                    if (unflattenFromString2 != null) {
                        if (unflattenFromString != null) {
                            if (a9 != null) {
                                if (dVar2 != null) {
                                    z8 = true;
                                }
                                if (z8) {
                                    return new g(unflattenFromString, a9, unflattenFromString2, dVar2, attributeIntValue, a10);
                                }
                                throw new IllegalArgumentException("If a secondaryDataSource is specified, a secondaryDataSourceDefaultType must be too".toString());
                            }
                            throw new IllegalArgumentException("If a secondaryDataSource is specified, a primaryDataSourceDefaultType must be too".toString());
                        }
                        throw new IllegalArgumentException("If a secondaryDataSource is specified, a primaryDataSource must be too".toString());
                    } else if (unflattenFromString == null) {
                        return new g(attributeIntValue, a10);
                    } else {
                        if (a9 != null) {
                            z8 = true;
                        }
                        if (z8) {
                            return new g(unflattenFromString, a9, attributeIntValue, a10);
                        }
                        throw new IllegalArgumentException("If a primaryDataSource is specified, a primaryDataSourceDefaultType must be too".toString());
                    }
                } else {
                    throw new IllegalArgumentException(("A " + str + " must have a systemDataSourceFallbackDefaultType attribute").toString());
                }
            } else {
                throw new IllegalArgumentException(("A " + str + " must have a systemDataSourceFallback attribute").toString());
            }
        }
    }

    public g() {
        this.f6289a = null;
        this.f6290b = null;
        this.f6291c = null;
        this.f6292d = null;
        this.e = -1;
        this.f6293f = d.NOT_CONFIGURED;
    }

    public g(int i8, d dVar) {
        this.f6289a = null;
        this.f6290b = null;
        this.f6291c = null;
        this.f6292d = null;
        this.e = i8;
        this.f6293f = dVar;
    }

    public g(ComponentName componentName, d dVar, int i8, d dVar2) {
        k.e(dVar, "primaryDataSourceDefaultType");
        this.f6289a = componentName;
        this.f6290b = dVar;
        this.f6291c = null;
        this.f6292d = null;
        this.e = i8;
        this.f6293f = dVar2;
    }

    public g(ComponentName componentName, d dVar, ComponentName componentName2, d dVar2, int i8, d dVar3) {
        k.e(componentName, "primaryDataSource");
        k.e(dVar, "primaryDataSourceDefaultType");
        k.e(dVar2, "secondaryDataSourceDefaultType");
        this.f6289a = componentName;
        this.f6290b = dVar;
        this.f6291c = componentName2;
        this.f6292d = dVar2;
        this.e = i8;
        this.f6293f = dVar3;
    }

    public final ArrayList<ComponentName> a() {
        ArrayList<ComponentName> arrayList = new ArrayList<>();
        ComponentName componentName = this.f6289a;
        if (componentName != null) {
            arrayList.add(componentName);
        }
        ComponentName componentName2 = this.f6291c;
        if (componentName2 != null) {
            arrayList.add(componentName2);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.DefaultComplicationDataSourcePolicy");
        g gVar = (g) obj;
        return k.a(this.f6289a, gVar.f6289a) && k.a(this.f6291c, gVar.f6291c) && this.e == gVar.e && this.f6290b == gVar.f6290b && this.f6292d == gVar.f6292d && this.f6293f == gVar.f6293f;
    }

    public final int hashCode() {
        int i8 = 0;
        ComponentName componentName = this.f6289a;
        int hashCode = (componentName != null ? componentName.hashCode() : 0) * 31;
        ComponentName componentName2 = this.f6291c;
        int hashCode2 = (((hashCode + (componentName2 != null ? componentName2.hashCode() : 0)) * 31) + this.e) * 31;
        d dVar = this.f6290b;
        int i9 = (hashCode2 + (dVar != null ? dVar.f6450f : 0)) * 31;
        d dVar2 = this.f6292d;
        if (dVar2 != null) {
            i8 = dVar2.f6450f;
        }
        return ((i9 + i8) * 31) + this.f6293f.f6450f;
    }

    public final String toString() {
        return "DefaultComplicationDataSourcePolicy[primary(" + this.f6289a + ", " + this.f6290b + "), secondary(" + this.f6291c + ", " + this.f6292d + "), system(" + this.e + ", " + this.f6293f + ")]";
    }
}
