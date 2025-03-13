package y4;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f8409a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8410b;

    public b(float f9, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f8409a;
            f9 += ((b) cVar).f8410b;
        }
        this.f8409a = cVar;
        this.f8410b = f9;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f8409a.a(rectF) + this.f8410b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8409a.equals(bVar.f8409a) && this.f8410b == bVar.f8410b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8409a, Float.valueOf(this.f8410b)});
    }
}
