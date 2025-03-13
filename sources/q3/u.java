package q3;

import java.util.Arrays;
import o3.c;
import r3.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f6591a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6592b;

    public /* synthetic */ u(a aVar, c cVar) {
        this.f6591a = aVar;
        this.f6592b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof u)) {
            u uVar = (u) obj;
            return l.a(this.f6591a, uVar.f6591a) && l.a(this.f6592b, uVar.f6592b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6591a, this.f6592b});
    }

    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(this.f6591a, "key");
        aVar.a(this.f6592b, "feature");
        return aVar.toString();
    }
}
