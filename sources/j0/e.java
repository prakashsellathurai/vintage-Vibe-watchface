package j0;

import android.view.DisplayCutout;
import i0.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f4946a;

    public e(DisplayCutout displayCutout) {
        this.f4946a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return b.a(this.f4946a, ((e) obj).f4946a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f4946a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4946a + "}";
    }
}
