package b2;

import android.graphics.PointF;
import androidx.fragment.app.i0;
import b2.a;
import java.util.ArrayList;
import java.util.Collections;
import l2.a;

public final class j extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f2536i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final PointF f2537j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f2538k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Float, Float> f2539l;

    /* renamed from: m  reason: collision with root package name */
    public i0 f2540m;

    /* renamed from: n  reason: collision with root package name */
    public i0 f2541n;

    public j(c cVar, c cVar2) {
        super(Collections.emptyList());
        this.f2538k = cVar;
        this.f2539l = cVar2;
        j(this.f2517d);
    }

    public final Object f() {
        return l(0.0f);
    }

    public final /* bridge */ /* synthetic */ Object g(a aVar, float f9) {
        return l(f9);
    }

    public final void j(float f9) {
        a<Float, Float> aVar = this.f2538k;
        aVar.j(f9);
        a<Float, Float> aVar2 = this.f2539l;
        aVar2.j(f9);
        this.f2536i.set(aVar.f().floatValue(), aVar2.f().floatValue());
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f2514a;
            if (i8 < arrayList.size()) {
                ((a.C0028a) arrayList.get(i8)).b();
                i8++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f9) {
        Float f10;
        a<Float, Float> aVar;
        l2.a<Float> b9;
        a<Float, Float> aVar2;
        l2.a<Float> b10;
        Float f11 = null;
        if (this.f2540m == null || (b10 = aVar2.b()) == null) {
            f10 = null;
        } else {
            (aVar2 = this.f2538k).d();
            Float f12 = b10.f5274h;
            i0 i0Var = this.f2540m;
            if (f12 != null) {
                f12.floatValue();
            }
            f10 = (Float) i0Var.j(b10.f5269b, b10.f5270c);
        }
        if (!(this.f2541n == null || (b9 = aVar.b()) == null)) {
            (aVar = this.f2539l).d();
            Float f13 = b9.f5274h;
            i0 i0Var2 = this.f2541n;
            if (f13 != null) {
                f13.floatValue();
            }
            f11 = (Float) i0Var2.j(b9.f5269b, b9.f5270c);
        }
        PointF pointF = this.f2536i;
        PointF pointF2 = this.f2537j;
        pointF2.set(f10 == null ? pointF.x : f10.floatValue(), 0.0f);
        pointF2.set(pointF2.x, f11 == null ? pointF.y : f11.floatValue());
        return pointF2;
    }
}
