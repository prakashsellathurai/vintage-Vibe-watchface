package y7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class c1 extends e1 {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8552h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(z0 z0Var) {
        super(true);
        l lVar;
        boolean z8 = true;
        U(z0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1.f8557g;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar2 = kVar instanceof l ? (l) kVar : null;
        if (lVar2 != null) {
            while (true) {
                e1 o8 = lVar2.o();
                if (!o8.O()) {
                    k kVar2 = (k) atomicReferenceFieldUpdater.get(o8);
                    if (kVar2 instanceof l) {
                        lVar = (l) kVar2;
                        continue;
                    } else {
                        lVar = null;
                        continue;
                    }
                    if (lVar2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z8 = false;
        } else {
            z8 = false;
        }
        this.f8552h = z8;
    }

    public final boolean O() {
        return this.f8552h;
    }

    public final boolean P() {
        return true;
    }
}
