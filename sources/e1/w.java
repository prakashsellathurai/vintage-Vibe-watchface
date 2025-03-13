package e1;

import android.view.View;
import android.view.WindowId;

public final class w implements x {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f4238a;

    public w(View view) {
        this.f4238a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).f4238a.equals(this.f4238a);
    }

    public final int hashCode() {
        return this.f4238a.hashCode();
    }
}
