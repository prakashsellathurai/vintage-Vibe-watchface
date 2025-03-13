package i5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import h6.a;
import java.util.Stack;
import o6.g;
import o6.t;
import r5.d;
import r5.k;
import s5.j0;

public final /* synthetic */ class b implements d, a.C0064a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.samsung.android.wearable.watchfacestudio.a f4842a;

    public /* synthetic */ b(com.samsung.android.wearable.watchfacestudio.a aVar) {
        this.f4842a = aVar;
    }

    public final void a(r5.b bVar, float f9, float f10) {
        com.samsung.android.wearable.watchfacestudio.a aVar = this.f4842a;
        if (!aVar.A.booleanValue()) {
            k kVar = aVar.y;
            if (kVar.e) {
                PointF pointF = kVar.f7107d;
                n6.d dVar = kVar.f7105b;
                Point point = new Point((int) ((f9 - pointF.x) / dVar.f5961a), (int) ((f10 - pointF.y) / dVar.f5962b));
                PointF pointF2 = new PointF(f9, f10);
                j0 j0Var = kVar.f7110h;
                t tVar = j0Var.f7238b.f6183d;
                tVar.H = null;
                androidx.health.services.client.impl.k kVar2 = new androidx.health.services.client.impl.k(tVar, bVar, point, 2);
                Stack stack = new Stack();
                stack.push(new Matrix());
                boolean z8 = true;
                tVar.n(kVar2, new e6.a(1, tVar), stack);
                g gVar = tVar.H;
                int ordinal = bVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        j0Var.f7240d.b();
                    }
                } else if (j0Var.e && gVar != null) {
                    RectF D = gVar.D();
                    if (D.width() != D.height()) {
                        z8 = false;
                    }
                    u5.d dVar2 = new u5.d(z8 ? 3 : 2, D, gVar.f6139m, pointF2, j0Var.f7239c.f7074d);
                    j0Var.f7240d = dVar2;
                    dVar2.f7786a.add(j0Var);
                    j0Var.f7240d.a();
                }
            }
        }
    }

    public final void c() {
        n1.j0 j0Var;
        com.samsung.android.wearable.watchfacestudio.a aVar = this.f4842a;
        if ((!aVar.A.booleanValue() || aVar.D.f3853a) && (j0Var = aVar.e) != null) {
            j0Var.f();
        }
    }
}
