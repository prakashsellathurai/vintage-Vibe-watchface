package n1;

import android.app.PendingIntent;
import android.graphics.Rect;
import java.util.Objects;
import q1.c;
import q1.r;
import q7.k;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final c f5705a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f5706b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f5707c = null;

    public q(r rVar, Rect rect) {
        k.e(rect, "bounds");
        this.f5705a = rVar;
        this.f5706b = rect;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return k.a(this.f5705a, qVar.f5705a) && k.a(this.f5706b, qVar.f5706b) && k.a(this.f5707c, qVar.f5707c);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f5705a, this.f5706b, this.f5707c});
    }
}
