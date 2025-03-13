package j3;

import java.security.MessageDigest;
import k3.j;
import p2.e;

public final class b implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f4982b;

    public b(Object obj) {
        j.l(obj);
        this.f4982b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4982b.toString().getBytes(e.f6307a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4982b.equals(((b) obj).f4982b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4982b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4982b + '}';
    }
}
