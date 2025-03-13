package f8;

import h2.d;
import h7.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.q;
import q7.l;
import y7.b0;

public final class b extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4426f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");
    private volatile Object owner;

    public static final class a extends l implements q<e8.a<?>, Object, Object, p7.l<? super Throwable, ? extends h>> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f4427f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(3);
            this.f4427f = bVar;
        }

        public final Object d(Object obj, Object obj2, Object obj3) {
            e8.a aVar = (e8.a) obj;
            return new a(this.f4427f, obj2);
        }
    }

    public b(boolean z8) {
        super(z8 ? 1 : 0);
        this.owner = z8 ? null : a1.a.f33l0;
        new a(this);
    }

    public final boolean b() {
        return Math.max(e.e.get(this), 0) == 0;
    }

    public final void c(Object obj) {
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4426f;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            d dVar = a1.a.f33l0;
            if (obj2 != dVar) {
                boolean z8 = false;
                if (obj2 == obj || obj == null) {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z8 = true;
                            break;
                        }
                    }
                    if (z8) {
                        a();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + b0.l(this) + "[isLocked=" + b() + ",owner=" + f4426f.get(this) + ']';
    }
}
