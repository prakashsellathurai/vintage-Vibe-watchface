package b2;

import android.graphics.PointF;
import androidx.fragment.app.i0;
import f2.c;
import java.util.List;
import k2.f;
import k3.j;
import l2.a;

public final class d extends f {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f2527i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f2528j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i8, List list) {
        super(list);
        this.f2527i = i8;
        if (i8 == 1) {
            super(list);
            this.f2528j = new PointF();
        } else if (i8 != 2) {
            int i9 = 0;
            c cVar = (c) ((a) list.get(0)).f5269b;
            i9 = cVar != null ? cVar.f4309b.length : i9;
            this.f2528j = new c(new float[i9], new int[i9]);
        } else {
            super(list);
            this.f2528j = new l2.c();
        }
    }

    public final Object g(a aVar, float f9) {
        T t8;
        T t9 = aVar.f5269b;
        int i8 = this.f2527i;
        Object obj = this.f2528j;
        switch (i8) {
            case 0:
                c cVar = (c) obj;
                c cVar2 = (c) t9;
                c cVar3 = (c) aVar.f5270c;
                cVar.getClass();
                int[] iArr = cVar2.f4309b;
                int length = iArr.length;
                int[] iArr2 = cVar3.f4309b;
                if (length == iArr2.length) {
                    for (int i9 = 0; i9 < iArr.length; i9++) {
                        float f10 = cVar2.f4308a[i9];
                        float f11 = cVar3.f4308a[i9];
                        PointF pointF = f.f5117a;
                        cVar.f4308a[i9] = f10 + ((f11 - f10) * f9);
                        cVar.f4309b[i9] = j.u(f9, iArr[i9], iArr2[i9]);
                    }
                    return cVar;
                }
                throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + iArr.length + " vs " + iArr2.length + ")");
            case 1:
                return l(aVar, f9, f9, f9);
            default:
                if (t9 == null || (t8 = aVar.f5270c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                l2.c cVar4 = (l2.c) t9;
                l2.c cVar5 = (l2.c) t8;
                i0 i0Var = this.e;
                if (i0Var != null) {
                    aVar.f5274h.floatValue();
                    e();
                    l2.c cVar6 = (l2.c) i0Var.j(cVar4, cVar5);
                    if (cVar6 != null) {
                        return cVar6;
                    }
                }
                l2.c cVar7 = (l2.c) obj;
                float f12 = cVar4.f5285a;
                float f13 = cVar5.f5285a;
                PointF pointF2 = f.f5117a;
                float f14 = cVar4.f5286b;
                cVar7.f5285a = f12 + ((f13 - f12) * f9);
                cVar7.f5286b = f14 + (f9 * (cVar5.f5286b - f14));
                return cVar7;
        }
    }

    public final /* bridge */ /* synthetic */ Object h(a aVar, float f9, float f10, float f11) {
        switch (this.f2527i) {
            case 1:
                return l(aVar, f9, f10, f11);
            default:
                super.h(aVar, f9, f10, f11);
                throw null;
        }
    }

    public final PointF l(a aVar, float f9, float f10, float f11) {
        T t8;
        T t9 = aVar.f5269b;
        if (t9 == null || (t8 = aVar.f5270c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t9;
        PointF pointF2 = (PointF) t8;
        i0 i0Var = this.e;
        if (i0Var != null) {
            aVar.f5274h.floatValue();
            e();
            PointF pointF3 = (PointF) i0Var.j(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f2528j;
        float f12 = pointF.x;
        float f13 = pointF.y;
        pointF4.set(f12 + (f10 * (pointF2.x - f12)), f13 + (f11 * (pointF2.y - f13)));
        return pointF4;
    }
}
