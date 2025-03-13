package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import h7.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.j;
import p1.g;
import p7.a;
import q7.k;
import q7.l;
import u1.m;

public final class g extends l implements a<h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ XmlResourceParser f7618f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Resources f7619g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l f7620h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f7621i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Map<Integer, p1.g> f7622j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(XmlResourceParser xmlResourceParser, Resources resources, l lVar, d dVar, LinkedHashMap linkedHashMap) {
        super(0);
        this.f7618f = xmlResourceParser;
        this.f7619g = resources;
        this.f7620h = lVar;
        this.f7621i = dVar;
        this.f7622j = linkedHashMap;
    }

    public final Object invoke() {
        T t8;
        m.h hVar;
        m.h hVar2;
        XmlResourceParser xmlResourceParser = this.f7618f;
        String name = xmlResourceParser.getName();
        boolean a9 = k.a(name, "StyleOption");
        boolean z8 = true;
        Resources resources = this.f7619g;
        if (a9) {
            String B = j.B(resources, xmlResourceParser, "id");
            if (!(B != null)) {
                throw new IllegalArgumentException("StyleOption must have an id".toString());
            } else if (j.F(xmlResourceParser, "value")) {
                String B2 = j.B(resources, xmlResourceParser, "value");
                m.e eVar = new m.e(B);
                l lVar = this.f7620h;
                lVar.getClass();
                Iterator<T> it = lVar.f7637a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t8 = null;
                        break;
                    }
                    t8 = it.next();
                    if (k.a(((m) t8).f7641a, eVar)) {
                        break;
                    }
                }
                m mVar = (m) t8;
                if (mVar == null) {
                    z8 = false;
                }
                if (z8) {
                    boolean z9 = mVar instanceof m.a;
                    d dVar = this.f7621i;
                    if (z9) {
                        m.a.C0128a aVar = m.a.C0128a.f7650d;
                        k.b(B2);
                        hVar = Boolean.parseBoolean(B2) ? m.a.C0128a.f7650d : m.a.C0128a.e;
                    } else {
                        if (mVar instanceof m.d) {
                            k.b(B2);
                            hVar2 = new m.d.b(Double.parseDouble(B2));
                        } else if (mVar instanceof m.g) {
                            k.b(B2);
                            hVar2 = new m.g.b(Long.parseLong(B2));
                        } else {
                            k.b(B2);
                            hVar = mVar.d(new m.h.a(B2));
                        }
                        dVar.i(mVar, hVar2);
                    }
                    dVar.i(mVar, hVar);
                } else {
                    throw new IllegalArgumentException("no setting found for id ".concat(B).toString());
                }
            } else {
                throw new IllegalArgumentException("value is required for BooleanOption".toString());
            }
        } else if (k.a(name, "ComplicationPolicy")) {
            Integer y = j.y(resources, xmlResourceParser, "slotId");
            if (y == null) {
                z8 = false;
            }
            if (z8) {
                this.f7622j.put(y, g.a.a(resources, xmlResourceParser, "ComplicationPolicy"));
            } else {
                throw new IllegalArgumentException("slotId is required for ComplicationPolicy".toString());
            }
        } else {
            throw new p1.h(xmlResourceParser);
        }
        return h.f4787a;
    }
}
