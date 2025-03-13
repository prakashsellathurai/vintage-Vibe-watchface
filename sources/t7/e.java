package t7;

import i7.p;
import java.util.NoSuchElementException;

public final class e extends p {

    /* renamed from: f  reason: collision with root package name */
    public final long f7545f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7546g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7547h;

    /* renamed from: i  reason: collision with root package name */
    public long f7548i;

    public e(long j8, long j9, long j10) {
        this.f7545f = j10;
        this.f7546g = j9;
        boolean z8 = true;
        if (j10 <= 0 ? j8 < j9 : j8 > j9) {
            z8 = false;
        }
        this.f7547h = z8;
        this.f7548i = !z8 ? j9 : j8;
    }

    public final boolean hasNext() {
        return this.f7547h;
    }

    public final long nextLong() {
        long j8 = this.f7548i;
        if (j8 != this.f7546g) {
            this.f7548i = this.f7545f + j8;
        } else if (this.f7547h) {
            this.f7547h = false;
        } else {
            throw new NoSuchElementException();
        }
        return j8;
    }
}
