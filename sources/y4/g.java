package y4;

import android.graphics.RectF;
import java.util.Arrays;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f8452a;

    public g(float f9) {
        this.f8452a = f9;
    }

    public final float a(RectF rectF) {
        return this.f8452a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f8452a == ((g) obj).f8452a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8452a)});
    }
}
