package d8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4162b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4163c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4164d;
    public static final AtomicIntegerFieldUpdater e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f4165a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<l> cls = l.class;
        f4162b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f4163c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f4164d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final g a(g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4163c;
        if (atomicIntegerFieldUpdater.get(this) - f4164d.get(this) == 127) {
            return gVar;
        }
        boolean z8 = true;
        if (gVar.f4152g.g() != 1) {
            z8 = false;
        }
        if (z8) {
            e.incrementAndGet(this);
        }
        int i8 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<g> atomicReferenceArray = this.f4165a;
            if (atomicReferenceArray.get(i8) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i8, gVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final g b() {
        g andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4164d;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 - f4163c.get(this) == 0) {
                return null;
            }
            int i9 = i8 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 + 1) && (andSet = this.f4165a.getAndSet(i9, (Object) null)) != null) {
                boolean z8 = true;
                if (andSet.f4152g.g() != 1) {
                    z8 = false;
                }
                if (z8) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final g c(int i8, boolean z8) {
        int i9 = i8 & 127;
        AtomicReferenceArray<g> atomicReferenceArray = this.f4165a;
        g gVar = atomicReferenceArray.get(i9);
        if (gVar != null) {
            boolean z9 = false;
            if ((gVar.f4152g.g() == 1) == z8) {
                while (true) {
                    if (!atomicReferenceArray.compareAndSet(i9, gVar, (Object) null)) {
                        if (atomicReferenceArray.get(i9) != gVar) {
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    if (z8) {
                        e.decrementAndGet(this);
                    }
                    return gVar;
                }
            }
        }
        return null;
    }
}
