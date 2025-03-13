package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import p7.p;
import p7.r;
import q7.k;
import q7.l;

public final class n extends l implements p<Resources, XmlResourceParser, Object> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r<Resources, XmlResourceParser, Float, Float, Object> f7699f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ float f7700g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ float f7701h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(r<? super Resources, ? super XmlResourceParser, ? super Float, ? super Float, Object> rVar, float f9, float f10) {
        super(2);
        this.f7699f = rVar;
        this.f7700g = f9;
        this.f7701h = f10;
    }

    public final Object g(Object obj, Object obj2) {
        Resources resources = (Resources) obj;
        XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
        k.e(resources, "resources");
        k.e(xmlResourceParser, "parser");
        return this.f7699f.j(resources, xmlResourceParser, Float.valueOf(this.f7700g), Float.valueOf(this.f7701h));
    }
}
