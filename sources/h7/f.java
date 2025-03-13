package h7;

import java.io.Serializable;
import p7.a;
import q7.k;

public final class f<T> implements b<T>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public a<? extends T> f4784f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f4785g = a1.a.f35m0;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4786h = this;

    public f(a aVar) {
        k.e(aVar, "initializer");
        this.f4784f = aVar;
    }

    public final T getValue() {
        T t8;
        T t9 = this.f4785g;
        T t10 = a1.a.f35m0;
        if (t9 != t10) {
            return t9;
        }
        synchronized (this.f4786h) {
            t8 = this.f4785g;
            if (t8 == t10) {
                a aVar = this.f4784f;
                k.b(aVar);
                t8 = aVar.invoke();
                this.f4785g = t8;
                this.f4784f = null;
            }
        }
        return t8;
    }

    public final String toString() {
        return this.f4785g != a1.a.f35m0 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
