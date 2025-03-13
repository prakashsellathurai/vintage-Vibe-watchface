package h7;

import java.io.Serializable;
import q7.k;

public final class d<A, B> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final A f4781f;

    /* renamed from: g  reason: collision with root package name */
    public final B f4782g;

    public d(A a9, B b9) {
        this.f4781f = a9;
        this.f4782g = b9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.f4781f, dVar.f4781f) && k.a(this.f4782g, dVar.f4782g);
    }

    public final int hashCode() {
        int i8 = 0;
        A a9 = this.f4781f;
        int hashCode = (a9 == null ? 0 : a9.hashCode()) * 31;
        B b9 = this.f4782g;
        if (b9 != null) {
            i8 = b9.hashCode();
        }
        return hashCode + i8;
    }

    public final String toString() {
        return "(" + this.f4781f + ", " + this.f4782g + ')';
    }
}
