package i6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xml.sax.Attributes;

public final class d extends b {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, Attributes attributes, int i8) {
        super(str, attributes);
        this.e = i8;
    }

    public final boolean d(String str) {
        LinkedHashMap linkedHashMap = this.f4865d;
        switch (this.e) {
            case 0:
                String d9 = g.d(this);
                return d9 != null && d9.contains(str);
            case 1:
                a aVar = (a) linkedHashMap.get("resource");
                return aVar != null && aVar.d().contains(str);
            case 2:
                a aVar2 = (a) linkedHashMap.get("source");
                return aVar2 != null && aVar2.d().contains(str);
            case 3:
                a aVar3 = (a) linkedHashMap.get("expression");
                return aVar3 != null && aVar3.d().contains(str);
            default:
                a aVar4 = (a) linkedHashMap.get("value");
                return aVar4 != null && aVar4.d().contains(str);
        }
    }

    public final String e() {
        LinkedHashMap linkedHashMap = this.f4865d;
        switch (this.e) {
            case 0:
                return g.d(this);
            case 1:
                a aVar = (a) linkedHashMap.get("resource");
                if (aVar != null) {
                    return aVar.d();
                }
                return null;
            case 2:
                a aVar2 = (a) linkedHashMap.get("source");
                if (aVar2 != null) {
                    return aVar2.d();
                }
                return null;
            case 3:
                a aVar3 = (a) linkedHashMap.get("expression");
                if (aVar3 != null) {
                    return aVar3.d();
                }
                return null;
            default:
                a aVar4 = (a) linkedHashMap.get("value");
                if (aVar4 != null) {
                    return aVar4.d();
                }
                return null;
        }
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = this.f4865d;
        switch (this.e) {
            case 0:
                ArrayList<c> e4 = g.e(this);
                if (!e4.isEmpty()) {
                    e4.get(0).e = str;
                    return;
                }
                return;
            case 1:
                linkedHashMap.put("resource", new a(str));
                return;
            case 2:
                linkedHashMap.put("source", new a(str));
                return;
            case 3:
                linkedHashMap.put("expression", new a(str));
                return;
            default:
                linkedHashMap.put("value", new a(str));
                return;
        }
    }
}
