package r2;

import java.security.MessageDigest;
import p2.e;

public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    public final e f6765b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6766c;

    public f(e eVar, e eVar2) {
        this.f6765b = eVar;
        this.f6766c = eVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f6765b.a(messageDigest);
        this.f6766c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6765b.equals(fVar.f6765b) && this.f6766c.equals(fVar.f6766c);
    }

    public final int hashCode() {
        return (this.f6765b.hashCode() * 31) + this.f6766c.hashCode();
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f6765b + ", signature=" + this.f6766c + '}';
    }
}
