package u1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.util.Map;
import p7.q;
import q7.k;
import q7.l;

public final class p extends l implements p7.p<Resources, XmlResourceParser, Object> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q<Resources, XmlResourceParser, Map<String, ? extends m>, Object> f7708f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map<String, m> f7709g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(q<? super Resources, ? super XmlResourceParser, ? super Map<String, ? extends m>, Object> qVar, Map<String, ? extends m> map) {
        super(2);
        this.f7708f = qVar;
        this.f7709g = map;
    }

    public final Object g(Object obj, Object obj2) {
        Resources resources = (Resources) obj;
        XmlResourceParser xmlResourceParser = (XmlResourceParser) obj2;
        k.e(resources, "resources");
        k.e(xmlResourceParser, "parser");
        return this.f7708f.d(resources, xmlResourceParser, this.f7709g);
    }
}
