package q1;

import android.support.wearable.complications.ComplicationData;
import java.time.Instant;
import q7.k;

public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f6510c;

    /* renamed from: a  reason: collision with root package name */
    public final Instant f6511a;

    /* renamed from: b  reason: collision with root package name */
    public final Instant f6512b;

    static {
        Instant instant = Instant.MIN;
        k.d(instant, "MIN");
        Instant instant2 = Instant.MAX;
        k.d(instant2, "MAX");
        f6510c = new z(instant, instant2);
    }

    public z(Instant instant, Instant instant2) {
        this.f6511a = instant;
        this.f6512b = instant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(z.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.TimeRange");
        z zVar = (z) obj;
        return k.a(this.f6511a, zVar.f6511a) && k.a(this.f6512b, zVar.f6512b);
    }

    public final int hashCode() {
        return (this.f6511a.hashCode() * 31) + this.f6512b.hashCode();
    }

    public final String toString() {
        ComplicationData.Companion.getClass();
        if (ComplicationData.c.d()) {
            return "TimeRange(REDACTED)";
        }
        return "TimeRange(startDateTimeMillis=" + this.f6511a + ", endDateTimeMillis=" + this.f6512b + ')';
    }
}
