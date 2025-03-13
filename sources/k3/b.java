package k3;

import p.a;

public final class b<K, V> extends a<K, V> {

    /* renamed from: p  reason: collision with root package name */
    public int f5129p;

    public final void clear() {
        this.f5129p = 0;
        super.clear();
    }

    public final int hashCode() {
        if (this.f5129p == 0) {
            this.f5129p = super.hashCode();
        }
        return this.f5129p;
    }

    public final void i(a aVar) {
        this.f5129p = 0;
        super.i(aVar);
    }

    public final V j(int i8) {
        this.f5129p = 0;
        return super.j(i8);
    }

    public final V k(int i8, V v8) {
        this.f5129p = 0;
        return super.k(i8, v8);
    }

    public final V put(K k8, V v8) {
        this.f5129p = 0;
        return super.put(k8, v8);
    }
}
