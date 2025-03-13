package k3;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f5144a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f5145b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f5146c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f5144a = cls;
        this.f5145b = cls2;
        this.f5146c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5144a.equals(iVar.f5144a) && this.f5145b.equals(iVar.f5145b) && k.a(this.f5146c, iVar.f5146c);
    }

    public final int hashCode() {
        int hashCode = ((this.f5144a.hashCode() * 31) + this.f5145b.hashCode()) * 31;
        Class<?> cls = this.f5146c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f5144a + ", second=" + this.f5145b + '}';
    }
}
