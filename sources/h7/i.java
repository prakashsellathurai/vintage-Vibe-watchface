package h7;

import java.io.Serializable;
import n1.k1;
import p7.a;
import q7.k;

public final class i<T> implements b<T>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public a<? extends T> f4788f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4789g = a1.a.f35m0;

    public i(k1.a.C0089a aVar) {
        this.f4788f = aVar;
    }

    public final T getValue() {
        if (this.f4789g == a1.a.f35m0) {
            a<? extends T> aVar = this.f4788f;
            k.b(aVar);
            this.f4789g = aVar.invoke();
            this.f4788f = null;
        }
        return this.f4789g;
    }

    public final String toString() {
        return this.f4789g != a1.a.f35m0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
