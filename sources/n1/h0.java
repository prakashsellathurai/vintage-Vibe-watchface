package n1;

import java.time.Instant;
import q7.k;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5592a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5593b;

    /* renamed from: c  reason: collision with root package name */
    public final Instant f5594c;

    public h0(int i8, int i9, Instant instant) {
        this.f5592a = i8;
        this.f5593b = i9;
        this.f5594c = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(h0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.TapEvent");
        h0 h0Var = (h0) obj;
        return this.f5592a == h0Var.f5592a && this.f5593b == h0Var.f5593b && k.a(this.f5594c, h0Var.f5594c);
    }

    public final int hashCode() {
        return (((this.f5592a * 31) + this.f5593b) * 31) + this.f5594c.hashCode();
    }

    public final String toString() {
        return "[" + this.f5592a + ", " + this.f5593b + " @" + this.f5594c + ']';
    }
}
