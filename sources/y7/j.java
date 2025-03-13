package y7;

import a1.a;
import c8.f;
import h7.h;
import j7.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.k;

public final class j extends b1 {

    /* renamed from: j  reason: collision with root package name */
    public final h<?> f8576j;

    public j(h<?> hVar) {
        this.f8576j = hVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return h.f4787a;
    }

    public final void n(Throwable th) {
        boolean z8;
        e1 o8 = o();
        h<?> hVar = this.f8576j;
        Throwable t8 = hVar.t(o8);
        boolean z9 = false;
        if (hVar.y()) {
            d<T> dVar = hVar.f8572i;
            k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            f fVar = (f) dVar;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f2839m;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                h2.d dVar2 = a.f30k;
                boolean z10 = true;
                if (k.a(obj, dVar2)) {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(fVar, dVar2, t8)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != dVar2) {
                                z8 = false;
                                break;
                            }
                        } else {
                            z8 = true;
                            break;
                        }
                    }
                    if (z8) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    break;
                } else {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            z9 = true;
        }
        if (!z9) {
            hVar.q(t8);
            if (!hVar.y()) {
                hVar.r();
            }
        }
    }
}
