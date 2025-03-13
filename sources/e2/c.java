package e2;

import android.graphics.PointF;
import b2.a;
import b2.j;
import java.util.List;

public final class c implements e<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f4240a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4241b;

    public c(b bVar, b bVar2) {
        this.f4240a = bVar;
        this.f4241b = bVar2;
    }

    public final a<PointF, PointF> a() {
        return new j((b2.c) this.f4240a.a(), (b2.c) this.f4241b.a());
    }

    public final List<l2.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        return this.f4240a.c() && this.f4241b.c();
    }
}
