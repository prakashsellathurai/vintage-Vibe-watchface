package n1;

import q7.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f5494a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5495b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5496c;

    public a(float f9, float f10, float f11) {
        this.f5494a = f9;
        this.f5495b = f10;
        this.f5496c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.BoundingArc");
        a aVar = (a) obj;
        if (!(this.f5494a == aVar.f5494a)) {
            return false;
        }
        if (!(this.f5495b == aVar.f5495b)) {
            return false;
        }
        return (this.f5496c > aVar.f5496c ? 1 : (this.f5496c == aVar.f5496c ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return (((Float.hashCode(this.f5494a) * 31) + Float.hashCode(this.f5495b)) * 31) + Float.hashCode(this.f5496c);
    }

    public final String toString() {
        return "ArcParams(startAngle=" + this.f5494a + ", totalArcAngle=" + this.f5495b + ", thickness=" + this.f5496c + ')';
    }
}
