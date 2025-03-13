package q1;

import android.content.res.Resources;
import android.support.wearable.complications.ComplicationText;
import java.time.Instant;
import q7.k;

public final class y implements c {
    public final ComplicationText a() {
        throw null;
    }

    public final CharSequence b(Resources resources, Instant instant) {
        k.e(resources, "resources");
        k.e(instant, "instant");
        throw null;
    }

    public final boolean c() {
        throw null;
    }

    public final Instant d(Instant instant) {
        k.e(instant, "afterInstant");
        throw null;
    }

    public final boolean e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(y.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.TimeFormatComplicationText");
        y yVar = (y) obj;
        return k.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
