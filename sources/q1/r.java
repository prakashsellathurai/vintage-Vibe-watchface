package q1;

import android.content.res.Resources;
import android.support.wearable.complications.ComplicationText;
import java.time.Instant;
import q7.k;

public final class r implements c {

    /* renamed from: c  reason: collision with root package name */
    public final f f6485c;

    public r(ComplicationText complicationText) {
        this.f6485c = new f(complicationText);
    }

    public final ComplicationText a() {
        return this.f6485c.f6452c;
    }

    public final CharSequence b(Resources resources, Instant instant) {
        k.e(resources, "resources");
        k.e(instant, "instant");
        return this.f6485c.b(resources, instant);
    }

    public final boolean c() {
        return this.f6485c.c();
    }

    public final Instant d(Instant instant) {
        k.e(instant, "afterInstant");
        return this.f6485c.d(instant);
    }

    public final boolean e() {
        return this.f6485c.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.PlainComplicationText");
        return k.a(this.f6485c, ((r) obj).f6485c);
    }

    public final int hashCode() {
        return this.f6485c.hashCode();
    }

    public final String toString() {
        return this.f6485c.toString();
    }
}
