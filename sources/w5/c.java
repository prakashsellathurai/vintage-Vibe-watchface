package w5;

import android.util.Log;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f8018a;

    public c(String str) {
        if (str.isEmpty()) {
            Log.e("DWF:DataSource", "invalid source");
        }
        this.f8018a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f8018a.equals(((c) obj).f8018a);
    }

    public final int hashCode() {
        String str = this.f8018a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
