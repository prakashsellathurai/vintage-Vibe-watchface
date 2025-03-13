package q1;

import android.content.res.Resources;
import android.support.wearable.complications.ComplicationText;
import java.time.Instant;
import l1.e;
import q7.k;

public final class g implements c {

    /* renamed from: c  reason: collision with root package name */
    public final f f6453c;

    public g(CharSequence charSequence, e.u uVar) {
        this.f6453c = new f(new ComplicationText(charSequence, uVar));
    }

    public final ComplicationText a() {
        return this.f6453c.f6452c;
    }

    public final CharSequence b(Resources resources, Instant instant) {
        k.e(resources, "resources");
        k.e(instant, "instant");
        return this.f6453c.b(resources, instant);
    }

    public final boolean c() {
        return this.f6453c.c();
    }

    public final Instant d(Instant instant) {
        k.e(instant, "afterInstant");
        return this.f6453c.d(instant);
    }

    public final boolean e() {
        return this.f6453c.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.complications.data.DynamicComplicationText");
        return k.a(this.f6453c, ((g) obj).f6453c);
    }

    public final int hashCode() {
        return this.f6453c.hashCode();
    }

    public final String toString() {
        return this.f6453c.toString();
    }
}
