package y4;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f8408a;

    public a(float f9) {
        this.f8408a = f9;
    }

    public final float a(RectF rectF) {
        return this.f8408a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f8408a == ((a) obj).f8408a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8408a)});
    }
}
