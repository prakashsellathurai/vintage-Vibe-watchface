package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import h7.h;
import i7.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k3.j;
import p7.a;
import q7.k;
import q7.l;
import u1.m;

public final class i extends l implements a<h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ XmlResourceParser f7626f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList<h> f7627g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Resources f7628h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l f7629i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(XmlResourceParser xmlResourceParser, ArrayList<h> arrayList, Resources resources, l lVar) {
        super(0);
        this.f7626f = xmlResourceParser;
        this.f7627g = arrayList;
        this.f7628h = resources;
        this.f7629i = lVar;
    }

    public final Object invoke() {
        XmlResourceParser xmlResourceParser = this.f7626f;
        if (k.a(xmlResourceParser.getName(), "UserStyleFlavor")) {
            Resources resources = this.f7628h;
            k.e(resources, "resources");
            l lVar = this.f7629i;
            k.e(lVar, "schema");
            if (k.a(xmlResourceParser.getName(), "UserStyleFlavor")) {
                String B = j.B(resources, xmlResourceParser, "id");
                if (B != null) {
                    d dVar = new d(lVar.c());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    j.J(xmlResourceParser, new g(xmlResourceParser, resources, lVar, dVar, linkedHashMap));
                    HashMap<m, m.h> hashMap = dVar.f7611f;
                    k.e(hashMap, "selectedOptions");
                    Set<Map.Entry> entrySet = new HashMap(hashMap).entrySet();
                    int C = a1.a.C(f.M(entrySet));
                    if (C < 16) {
                        C = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C);
                    for (Map.Entry entry : entrySet) {
                        linkedHashMap2.put(((m) entry.getKey()).f7641a.f7683a, ((m.h) entry.getValue()).f7694a.f7696a);
                    }
                    f fVar = new f((Map<String, byte[]>) linkedHashMap2);
                    int size = linkedHashMap.size();
                    this.f7627g.add(new h(B, fVar, size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : a1.a.J(linkedHashMap) : i7.l.f4880f));
                    return h.f4787a;
                }
                throw new IllegalArgumentException("UserStyleFlavor must have an id".toString());
            }
            throw new IllegalArgumentException("Expected a UserStyleFlavor node".toString());
        }
        throw new p1.h(xmlResourceParser);
    }
}
