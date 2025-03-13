package a8;

import a1.a;
import b8.b;
import j7.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h extends b<g<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f226a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");
    private volatile Object _state;

    public final boolean a(Object obj) {
        g gVar = (g) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f226a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, a.f15c);
        return true;
    }

    public final d[] b(Object obj) {
        g gVar = (g) obj;
        f226a.set(this, (Object) null);
        return a.e;
    }
}
