package f8;

import c8.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class g extends r<g> {

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceArray f4439j = new AtomicReferenceArray(f.f4438f);

    public g(long j8, g gVar, int i8) {
        super(j8, gVar, i8);
    }

    public final int d() {
        return f.f4438f;
    }

    public final void e(int i8) {
        this.f4439j.set(i8, f.e);
        if (r.f2868i.incrementAndGet(this) == f.f4438f) {
            b();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2869h + ", hashCode=" + hashCode() + ']';
    }
}
