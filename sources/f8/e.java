package f8;

import a1.a;
import c8.b;
import c8.r;
import h2.d;
import h7.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k3.j;
import y7.g;

public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4430c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4431d;
    public static final AtomicIntegerFieldUpdater e;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f4432a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final c f4433b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    static {
        Class<e> cls = e.class;
        Class<Object> cls2 = Object.class;
        f4430c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f4431d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        e = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public e(int i8) {
        if (i8 >= 0 && i8 <= 1) {
            g gVar = new g(0, (g) null, 2);
            this.head = gVar;
            this.tail = gVar;
            this._availablePermits = 1 - i8;
            this.f4433b = new c(this);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a() {
        int i8;
        Object s8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i9 = this.f4432a;
            if (andIncrement >= i9) {
                do {
                    i8 = atomicIntegerFieldUpdater.get(this);
                    if (i8 <= i9 || atomicIntegerFieldUpdater.compareAndSet(this, i8, i9)) {
                    }
                    i8 = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i9).toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4430c;
                g gVar = (g) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f4431d.getAndIncrement(this);
                long j8 = andIncrement2 / ((long) f.f4438f);
                d dVar = d.f4429o;
                do {
                    s8 = a.s(gVar, j8, dVar);
                    if (s8 == a.f26i) {
                        break;
                    }
                    r A = j.A(s8);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f2869h >= A.f2869h) {
                            break;
                        } else if (!A.f()) {
                            z11 = false;
                            continue;
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, A)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        z12 = false;
                                        break;
                                    }
                                } else {
                                    z12 = true;
                                    break;
                                }
                            }
                            if (z12) {
                                if (rVar.c()) {
                                    rVar.b();
                                }
                            } else if (A.c()) {
                                A.b();
                            }
                        }
                    }
                    z11 = true;
                    continue;
                } while (!z11);
                g gVar2 = (g) j.A(s8);
                b.f2835g.lazySet(gVar2, (Object) null);
                if (gVar2.f2869h <= j8) {
                    int i10 = (int) (andIncrement2 % ((long) f.f4438f));
                    d dVar2 = f.f4435b;
                    AtomicReferenceArray atomicReferenceArray = gVar2.f4439j;
                    Object andSet = atomicReferenceArray.getAndSet(i10, dVar2);
                    if (andSet == null) {
                        int i11 = f.f4434a;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= i11) {
                                d dVar3 = f.f4435b;
                                d dVar4 = f.f4437d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i10, dVar3, dVar4)) {
                                        if (atomicReferenceArray.get(i10) != dVar3) {
                                            z9 = true;
                                            z10 = false;
                                            break;
                                        }
                                    } else {
                                        z9 = true;
                                        z10 = true;
                                        break;
                                    }
                                }
                                z8 = z10 ^ z9;
                                continue;
                            } else if (atomicReferenceArray.get(i10) == f.f4436c) {
                                z8 = true;
                                continue;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    } else if (andSet != f.e) {
                        if (andSet instanceof g) {
                            g gVar3 = (g) andSet;
                            Object k8 = gVar3.k(h.f4787a, this.f4433b);
                            if (k8 != null) {
                                gVar3.m(k8);
                                z8 = true;
                                continue;
                            }
                        } else if (andSet instanceof e8.a) {
                            h hVar = h.f4787a;
                            z8 = ((e8.a) andSet).a();
                            continue;
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                }
                z8 = false;
                continue;
            } else {
                return;
            }
        } while (!z8);
    }
}
