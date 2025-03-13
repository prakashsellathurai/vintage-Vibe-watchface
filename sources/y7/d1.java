package y7;

import c8.i;
import c8.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.j;
import q7.k;

public abstract class d1 extends s implements m0, w0 {

    /* renamed from: i  reason: collision with root package name */
    public e1 f8555i;

    public final boolean c() {
        return true;
    }

    public final h1 e() {
        return null;
    }

    public final void f() {
        boolean z8;
        i iVar;
        boolean z9;
        e1 o8 = o();
        do {
            Object R = o8.R();
            z8 = false;
            if (R instanceof d1) {
                if (R == this) {
                    p0 p0Var = j.V;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1.f8556f;
                        if (!atomicReferenceFieldUpdater.compareAndSet(o8, R, p0Var)) {
                            if (atomicReferenceFieldUpdater.get(o8) != R) {
                                continue;
                                break;
                            }
                        } else {
                            z8 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((R instanceof w0) && ((w0) R).e() != null) {
                do {
                    Object i8 = i();
                    if (!(i8 instanceof o)) {
                        if (i8 != this) {
                            k.c(i8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            iVar = (i) i8;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f2854h;
                            o oVar = (o) atomicReferenceFieldUpdater2.get(iVar);
                            if (oVar == null) {
                                oVar = new o(iVar);
                                atomicReferenceFieldUpdater2.lazySet(iVar, oVar);
                            }
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = i.f2852f;
                                if (!atomicReferenceFieldUpdater3.compareAndSet(this, i8, oVar)) {
                                    if (atomicReferenceFieldUpdater3.get(this) != i8) {
                                        z9 = false;
                                        continue;
                                        break;
                                    }
                                } else {
                                    z9 = true;
                                    continue;
                                    break;
                                }
                            }
                        } else {
                            i iVar2 = (i) i8;
                            return;
                        }
                    } else {
                        i iVar3 = ((o) i8).f2866a;
                        return;
                    }
                } while (!z9);
                iVar.a();
                return;
            } else {
                return;
            }
        } while (!z8);
    }

    public final e1 o() {
        e1 e1Var = this.f8555i;
        if (e1Var != null) {
            return e1Var;
        }
        k.h("job");
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this) + "[job@" + b0.l(o()) + ']';
    }
}
