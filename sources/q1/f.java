package q1;

import android.content.res.Resources;
import android.support.wearable.complications.ComplicationText;
import java.time.Instant;
import q7.k;

public final class f implements c {

    /* renamed from: c  reason: collision with root package name */
    public final ComplicationText f6452c;

    public f(ComplicationText complicationText) {
        this.f6452c = complicationText;
    }

    public final ComplicationText a() {
        return this.f6452c;
    }

    public final CharSequence b(Resources resources, Instant instant) {
        k.e(resources, "resources");
        k.e(instant, "instant");
        CharSequence textAt = this.f6452c.getTextAt(resources, instant.toEpochMilli());
        k.d(textAt, "delegate.getTextAt(resou…, instant.toEpochMilli())");
        return textAt;
    }

    public final boolean c() {
        return this.f6452c.isAlwaysEmpty();
    }

    public final Instant d(Instant instant) {
        String str;
        Instant instant2;
        k.e(instant, "afterInstant");
        long nextChangeTime = this.f6452c.getNextChangeTime(instant.toEpochMilli());
        if (nextChangeTime == Long.MAX_VALUE) {
            instant2 = Instant.MAX;
            str = "{\n            Instant.MAX\n        }";
        } else {
            instant2 = Instant.ofEpochMilli(nextChangeTime);
            str = "{\n            Instant.of…nextChangeTime)\n        }";
        }
        k.d(instant2, str);
        return instant2;
    }

    public final boolean e() {
        return this.f6452c.isPlaceholder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z8 = obj instanceof f;
        ComplicationText complicationText = this.f6452c;
        if (z8) {
            return k.a(complicationText, ((f) obj).f6452c);
        }
        if (obj instanceof r) {
            return k.a(((r) obj).f6485c.f6452c, complicationText);
        }
        if (obj instanceof x) {
            ((x) obj).getClass();
            throw null;
        } else if (!(obj instanceof y)) {
            return false;
        } else {
            ((y) obj).getClass();
            throw null;
        }
    }

    public final int hashCode() {
        return this.f6452c.hashCode();
    }

    public final String toString() {
        String complicationText = this.f6452c.toString();
        k.d(complicationText, "delegate.toString()");
        return complicationText;
    }
}
