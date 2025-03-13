package u1;

import java.util.Map;
import p1.g;
import q7.k;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f7623a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7624b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, g> f7625c;

    public h(String str, f fVar, Map<Integer, g> map) {
        k.e(str, "id");
        this.f7623a = str;
        this.f7624b = fVar;
        this.f7625c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyleFlavor");
        h hVar = (h) obj;
        return k.a(this.f7623a, hVar.f7623a) && k.a(this.f7624b, hVar.f7624b) && k.a(this.f7625c, hVar.f7625c);
    }

    public final int hashCode() {
        return (((this.f7623a.hashCode() * 31) + this.f7624b.hashCode()) * 31) + this.f7625c.hashCode();
    }

    public final String toString() {
        return "UserStyleFlavor[" + this.f7623a + ": " + this.f7624b + ", " + this.f7625c + ']';
    }
}
