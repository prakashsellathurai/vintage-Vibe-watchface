package h7;

import java.io.Serializable;
import q7.k;

public final class e<T> implements Serializable {

    public static final class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final Throwable f4783f;

        public a(Throwable th) {
            k.e(th, "exception");
            this.f4783f = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (k.a(this.f4783f, ((a) obj).f4783f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f4783f.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f4783f + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f4783f;
        }
        return null;
    }
}
