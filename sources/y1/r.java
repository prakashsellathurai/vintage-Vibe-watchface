package y1;

import java.util.Arrays;

public final class r<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f8321a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f8322b;

    public r(V v8) {
        this.f8321a = v8;
        this.f8322b = null;
    }

    public r(Throwable th) {
        this.f8322b = th;
        this.f8321a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        V v8 = this.f8321a;
        if (v8 != null && v8.equals(rVar.f8321a)) {
            return true;
        }
        Throwable th = this.f8322b;
        if (th == null || rVar.f8322b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8321a, this.f8322b});
    }
}
