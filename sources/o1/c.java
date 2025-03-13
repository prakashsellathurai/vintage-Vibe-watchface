package o1;

import q7.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6003a;

    public c(String str) {
        this.f6003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.client.WatchFaceId");
        return k.a(this.f6003a, ((c) obj).f6003a);
    }

    public final int hashCode() {
        return this.f6003a.hashCode();
    }

    public final String toString() {
        return "WatchFaceId(id='" + this.f6003a + "')";
    }
}
