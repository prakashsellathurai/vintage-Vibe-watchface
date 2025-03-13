package i6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xml.sax.Attributes;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f4862a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4863b;

    /* renamed from: c  reason: collision with root package name */
    public e f4864c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f4865d;

    public e() {
        this("", (Attributes) null);
    }

    public e(String str, Attributes attributes) {
        this.f4863b = new ArrayList();
        this.f4864c = null;
        this.f4865d = new LinkedHashMap();
        this.f4862a = str;
        if (attributes != null) {
            for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                this.f4865d.put(attributes.getQName(i8), new a(attributes.getValue(i8)));
            }
        }
    }

    public void a(e eVar) {
        eVar.f4864c = this;
        this.f4863b.add(eVar);
    }

    public final a b(String str) {
        a aVar = (a) this.f4865d.get(str);
        return aVar == null ? new a() : aVar;
    }

    public final boolean c(String str) {
        return this.f4865d.get(str) != null;
    }
}
