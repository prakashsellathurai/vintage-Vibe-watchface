package v7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<d<T>> f7956a;

    public a(e eVar) {
        this.f7956a = new AtomicReference<>(eVar);
    }

    public final Iterator<T> iterator() {
        d andSet = this.f7956a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
