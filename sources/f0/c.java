package f0;

import android.os.LocaleList;
import java.util.Locale;

public final class c {

    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    static {
        a.a(new Locale[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
