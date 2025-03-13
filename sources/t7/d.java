package t7;

import java.util.Iterator;

public class d implements Iterable<Long> {

    /* renamed from: f  reason: collision with root package name */
    public final long f7542f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7543g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7544h;

    public d(long j8, long j9) {
        this.f7542f = j8;
        if (j8 < j9) {
            long j10 = j9 % 1;
            long j11 = j8 % 1;
            long j12 = ((j10 < 0 ? j10 + 1 : j10) - (j11 < 0 ? j11 + 1 : j11)) % 1;
            j9 -= j12 < 0 ? j12 + 1 : j12;
        }
        this.f7543g = j9;
        this.f7544h = 1;
    }

    public final Iterator iterator() {
        return new e(this.f7542f, this.f7543g, this.f7544h);
    }
}
