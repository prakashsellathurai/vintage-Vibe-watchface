package q7;

public final class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f6641a;

    public m(Class cls) {
        k.e(cls, "jClass");
        this.f6641a = cls;
    }

    public final Class<?> a() {
        return this.f6641a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (k.a(this.f6641a, ((m) obj).f6641a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6641a.hashCode();
    }

    public final String toString() {
        return this.f6641a.toString() + " (Kotlin reflection is not available)";
    }
}
