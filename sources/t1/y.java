package t1;

import java.time.Instant;
import n1.z;
import q7.k;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final z f7462a;

    /* renamed from: b  reason: collision with root package name */
    public final Instant f7463b;

    public y(z zVar, Instant instant) {
        this.f7462a = zVar;
        this.f7463b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(y.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.editor.PreviewScreenshotParams");
        y yVar = (y) obj;
        return k.a(this.f7462a, yVar.f7462a) && k.a(this.f7463b, yVar.f7463b);
    }

    public final int hashCode() {
        return (this.f7462a.hashCode() * 31) + this.f7463b.hashCode();
    }
}
