package c8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class a<T> extends n {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2833a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile Object _consensus = a1.a.f24h;

    public final Object a(Object obj) {
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2833a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a1.a.f24h;
        if (obj2 == obj3) {
            Object c9 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == obj3) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z8 = false;
                            break;
                        }
                    } else {
                        z8 = true;
                        break;
                    }
                }
                obj2 = z8 ? c9 : atomicReferenceFieldUpdater.get(this);
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t8, Object obj);

    public abstract Object c(T t8);
}
