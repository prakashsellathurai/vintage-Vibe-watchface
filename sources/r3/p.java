package r3;

import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p3.a;

public final class p implements a.c {
    @RecentlyNonNull

    /* renamed from: b  reason: collision with root package name */
    public static final p f7026b = new p();

    /* renamed from: a  reason: collision with root package name */
    public final String f7027a = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.a(this.f7027a, ((p) obj).f7027a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7027a});
    }
}
