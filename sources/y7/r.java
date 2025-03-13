package y7;

import h7.h;
import p7.l;
import q7.k;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8599a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, h> f8600b;

    public r(l lVar, Object obj) {
        this.f8599a = obj;
        this.f8600b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k.a(this.f8599a, rVar.f8599a) && k.a(this.f8600b, rVar.f8600b);
    }

    public final int hashCode() {
        Object obj = this.f8599a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f8600b.hashCode();
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f8599a + ", onCancellation=" + this.f8600b + ')';
    }
}
