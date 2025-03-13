package c8;

import a1.a;
import c8.b;
import h2.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.k;

public abstract class b<N extends b<N>> {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2834f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2835g;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<b> cls = b.class;
        Class<Object> cls2 = Object.class;
        f2834f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f2835g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public b(N n8) {
        this._prev = n8;
    }

    public abstract boolean a();

    public final void b() {
        boolean z8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2834f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        d dVar = a.f26i;
        if (!((obj == dVar ? null : (b) obj) == null)) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2835g;
                b bVar = (b) atomicReferenceFieldUpdater2.get(this);
                while (bVar != null && bVar.a()) {
                    bVar = (b) atomicReferenceFieldUpdater2.get(bVar);
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                b bVar2 = obj2 == dVar ? null : (b) obj2;
                k.b(bVar2);
                while (bVar2.a()) {
                    Object obj3 = atomicReferenceFieldUpdater.get(bVar2);
                    b bVar3 = obj3 == dVar ? null : (b) obj3;
                    if (bVar3 == null) {
                        break;
                    }
                    bVar2 = bVar3;
                }
                do {
                    Object obj4 = atomicReferenceFieldUpdater2.get(bVar2);
                    b bVar4 = ((b) obj4) == null ? null : bVar;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(bVar2, obj4, bVar4)) {
                            if (atomicReferenceFieldUpdater2.get(bVar2) != obj4) {
                                z8 = false;
                                continue;
                                break;
                            }
                        } else {
                            z8 = true;
                            continue;
                            break;
                        }
                    }
                } while (!z8);
                if (bVar != null) {
                    atomicReferenceFieldUpdater.set(bVar, bVar2);
                }
                if (bVar2.a()) {
                    Object obj5 = atomicReferenceFieldUpdater.get(bVar2);
                    if (!((obj5 == dVar ? null : (b) obj5) == null)) {
                        continue;
                    }
                }
                if (bVar == null || !bVar.a()) {
                    return;
                }
            }
        }
    }
}
