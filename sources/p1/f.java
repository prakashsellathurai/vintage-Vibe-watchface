package p1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import h7.h;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import k3.j;
import q1.d;
import q7.k;
import q7.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<d, RectF> f6279a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, RectF> f6280b;

    public static final class a {

        /* renamed from: p1.f$a$a  reason: collision with other inner class name */
        public static final class C0105a extends l implements p7.a<h> {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ XmlResourceParser f6281f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Resources f6282g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ float f6283h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ float f6284i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ h7.b<HashMap<d, RectF>> f6285j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ h7.b<HashMap<d, RectF>> f6286k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0105a(XmlResourceParser xmlResourceParser, Resources resources, float f9, float f10, h7.f fVar, h7.f fVar2) {
                super(0);
                this.f6281f = xmlResourceParser;
                this.f6282g = resources;
                this.f6283h = f9;
                this.f6284i = f10;
                this.f6285j = fVar;
                this.f6286k = fVar2;
            }

            public final Object invoke() {
                RectF rectF;
                XmlResourceParser xmlResourceParser = this.f6281f;
                if (k.a(xmlResourceParser.getName(), "ComplicationSlotBounds")) {
                    boolean F = j.F(xmlResourceParser, "left");
                    float f9 = this.f6284i;
                    float f10 = this.f6283h;
                    Resources resources = this.f6282g;
                    if (F) {
                        rectF = new RectF(j.X(xmlResourceParser, "left", resources, f10), j.X(xmlResourceParser, "top", resources, f9), j.X(xmlResourceParser, "right", resources, f10), j.X(xmlResourceParser, "bottom", resources, f9));
                    } else if (j.F(xmlResourceParser, "center_x")) {
                        float X = j.X(xmlResourceParser, "size_x", resources, f10) / 2.0f;
                        float X2 = j.X(xmlResourceParser, "size_y", resources, f9) / 2.0f;
                        float X3 = j.X(xmlResourceParser, "center_x", resources, f10);
                        float X4 = j.X(xmlResourceParser, "center_y", resources, f9);
                        rectF = new RectF(X3 - X, X4 - X2, X3 + X, X4 + X2);
                    } else {
                        throw new IllegalArgumentException("ComplicationSlotBounds must either define top, bottom, left, rightor center_x, center_y, size_x, size_y should be specified");
                    }
                    Float w = j.w(xmlResourceParser, "marginLeft", resources, f10);
                    float f11 = 0.0f;
                    float floatValue = w != null ? w.floatValue() : 0.0f;
                    Float w8 = j.w(xmlResourceParser, "marginTop", resources, f9);
                    float floatValue2 = w8 != null ? w8.floatValue() : 0.0f;
                    Float w9 = j.w(xmlResourceParser, "marginRight", resources, f10);
                    float floatValue3 = w9 != null ? w9.floatValue() : 0.0f;
                    Float w10 = j.w(xmlResourceParser, "marginBottom", resources, f9);
                    if (w10 != null) {
                        f11 = w10.floatValue();
                    }
                    RectF rectF2 = new RectF(floatValue, floatValue2, floatValue3, f11);
                    String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res-auto", "complicationType");
                    h7.b<HashMap<d, RectF>> bVar = this.f6286k;
                    int i8 = 0;
                    h7.b<HashMap<d, RectF>> bVar2 = this.f6285j;
                    if (attributeValue != null) {
                        d a9 = d.a.a(xmlResourceParser.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "complicationType", 0));
                        if (!bVar2.getValue().containsKey(a9)) {
                            bVar2.getValue().put(a9, rectF);
                            bVar.getValue().put(a9, rectF2);
                        } else {
                            throw new IllegalArgumentException(("Duplicate " + a9).toString());
                        }
                    } else {
                        d[] values = d.values();
                        int length = values.length;
                        while (i8 < length) {
                            d dVar = values[i8];
                            if (!bVar2.getValue().containsKey(dVar)) {
                                bVar2.getValue().put(dVar, rectF);
                                bVar.getValue().put(dVar, rectF2);
                                i8++;
                            } else {
                                throw new IllegalArgumentException(("Duplicate " + dVar).toString());
                            }
                        }
                    }
                    return h.f4787a;
                }
                throw new h(xmlResourceParser);
            }
        }

        public static final class b extends l implements p7.a<HashMap<d, RectF>> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f6287f = new b();

            public b() {
                super(0);
            }

            public final Object invoke() {
                return new HashMap();
            }
        }

        public static final class c extends l implements p7.a<HashMap<d, RectF>> {

            /* renamed from: f  reason: collision with root package name */
            public static final c f6288f = new c();

            public c() {
                super(0);
            }

            public final Object invoke() {
                return new HashMap();
            }
        }

        public static f a(Resources resources, XmlResourceParser xmlResourceParser, float f9, float f10) {
            h7.f z8 = a1.a.z(b.f6287f);
            h7.f z9 = a1.a.z(c.f6288f);
            j.J(xmlResourceParser, new C0105a(xmlResourceParser, resources, f9, f10, z8, z9));
            if (((HashMap) z8.getValue()).isEmpty()) {
                return null;
            }
            HashMap hashMap = (HashMap) z8.getValue();
            HashMap hashMap2 = (HashMap) z9.getValue();
            k.e(hashMap, "partialPerComplicationTypeBounds");
            k.e(hashMap2, "partialPerComplicationTypeMargins");
            HashMap hashMap3 = new HashMap(hashMap);
            HashMap hashMap4 = new HashMap(hashMap2);
            for (d dVar : d.values()) {
                hashMap3.putIfAbsent(dVar, new RectF());
                hashMap4.putIfAbsent(dVar, new RectF());
            }
            return new f(hashMap3, hashMap4);
        }
    }

    public f(HashMap hashMap, HashMap hashMap2) {
        this.f6279a = hashMap;
        this.f6280b = hashMap2;
        boolean z8 = true;
        int i8 = 0;
        if (hashMap.size() == d.values().length) {
            if (hashMap2.size() != d.values().length ? false : z8) {
                d[] values = d.values();
                int length = values.length;
                while (i8 < length) {
                    d dVar = values[i8];
                    if (!this.f6279a.containsKey(dVar)) {
                        throw new IllegalArgumentException(("Missing bounds for " + dVar).toString());
                    } else if (this.f6280b.containsKey(dVar)) {
                        i8++;
                    } else {
                        throw new IllegalArgumentException(("Missing margins for " + dVar).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("perComplicationTypeMargins must contain entries for each ComplicationType".toString());
        }
        throw new IllegalArgumentException("perComplicationTypeBounds must contain entries for each ComplicationType".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.ComplicationSlotBounds");
        f fVar = (f) obj;
        if (!k.a(this.f6279a, fVar.f6279a)) {
            return false;
        }
        return k.a(this.f6280b, fVar.f6280b);
    }

    public final int hashCode() {
        Map<d, RectF> map = this.f6279a;
        k.e(map, "<this>");
        Map<d, RectF> map2 = this.f6280b;
        k.e(map2, "<this>");
        return (new TreeMap(map).hashCode() * 31) + new TreeMap(map2).hashCode();
    }

    public final String toString() {
        return "ComplicationSlotBounds(perComplicationTypeBounds=" + this.f6279a + ", perComplicationTypeMargins=" + this.f6280b + ')';
    }
}
