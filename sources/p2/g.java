package p2;

import java.security.MessageDigest;
import k3.b;
import p2.f;

public final class g implements e {

    /* renamed from: b  reason: collision with root package name */
    public final b f6312b = new b();

    public final void a(MessageDigest messageDigest) {
        int i8 = 0;
        while (true) {
            b bVar = this.f6312b;
            if (i8 < bVar.f6235h) {
                f fVar = (f) bVar.h(i8);
                Object l8 = this.f6312b.l(i8);
                f.b<T> bVar2 = fVar.f6309b;
                if (fVar.f6311d == null) {
                    fVar.f6311d = fVar.f6310c.getBytes(e.f6307a);
                }
                bVar2.a(fVar.f6311d, l8, messageDigest);
                i8++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(f<T> fVar) {
        b bVar = this.f6312b;
        return bVar.containsKey(fVar) ? bVar.getOrDefault(fVar, null) : fVar.f6308a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6312b.equals(((g) obj).f6312b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6312b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f6312b + '}';
    }
}
