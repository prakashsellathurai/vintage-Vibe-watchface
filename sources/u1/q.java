package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Icon;
import h7.h;
import java.util.ArrayList;
import java.util.Map;
import k3.j;
import p7.a;
import q7.k;
import q7.l;
import q7.p;
import u1.m;

public final class q extends l implements a<h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ XmlResourceParser f7710f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Resources f7711g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map<String, m> f7712h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList<m> f7713i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<m.i> f7714j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(XmlResourceParser xmlResourceParser, Resources resources, Map<String, ? extends m> map, ArrayList<m> arrayList, p<m.i> pVar) {
        super(0);
        this.f7710f = xmlResourceParser;
        this.f7711g = resources;
        this.f7712h = map;
        this.f7713i = arrayList;
        this.f7714j = pVar;
    }

    public final Object invoke() {
        XmlResourceParser xmlResourceParser = this.f7710f;
        String name = xmlResourceParser.getName();
        boolean a9 = k.a(name, "ChildSetting");
        Resources resources = this.f7711g;
        if (a9) {
            String B = j.B(resources, xmlResourceParser, "id");
            boolean z8 = true;
            if (B != null) {
                m mVar = this.f7712h.get(B);
                if (mVar == null) {
                    z8 = false;
                }
                if (z8) {
                    this.f7713i.add(mVar);
                } else {
                    throw new IllegalArgumentException(("Unknown ChildSetting id " + B + ", note only backward references are supported.").toString());
                }
            } else {
                throw new IllegalArgumentException("ChildSetting must have an id".toString());
            }
        } else if (k.a(name, "OnWatchEditorData")) {
            p<m.i> pVar = this.f7714j;
            if (pVar.f6643f == null) {
                k.e(resources, "resources");
                int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "icon", -1);
                pVar.f6643f = new m.i(attributeResourceValue != -1 ? Icon.createWithResource(resources.getResourcePackageName(attributeResourceValue), attributeResourceValue) : null);
            } else {
                throw new p1.h(xmlResourceParser);
            }
        } else {
            throw new p1.h(xmlResourceParser);
        }
        return h.f4787a;
    }
}
