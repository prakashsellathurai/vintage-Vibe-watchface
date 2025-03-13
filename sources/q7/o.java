package q7;

import q7.d;
import u7.a;
import u7.d;
import y7.b0;

public abstract class o extends d implements d {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6642m = false;

    public o() {
        super(d.a.f6635f, (Class) null, (String) null, (String) null, false);
    }

    public final a c() {
        if (this.f6642m) {
            return this;
        }
        a aVar = this.f6629f;
        if (aVar == null) {
            aVar = a();
            this.f6629f = aVar;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return b().equals(oVar.b()) && this.f6632i.equals(oVar.f6632i) && this.f6633j.equals(oVar.f6633j) && k.a(this.f6630g, oVar.f6630g);
        } else if (obj instanceof u7.d) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return (((b().hashCode() * 31) + this.f6632i.hashCode()) * 31) + this.f6633j.hashCode();
    }

    public final String toString() {
        a c9 = c();
        if (c9 != this) {
            return c9.toString();
        }
        return "property " + this.f6632i + " (Kotlin reflection is not available)";
    }

    public o(Object obj) {
        super(obj, b0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }
}
