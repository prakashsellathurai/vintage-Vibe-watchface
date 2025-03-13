package u6;

import android.graphics.Paint;
import e7.d;
import e7.i;
import e7.k;
import s5.x;
import u6.c;
import w5.f;

public final class b extends d implements d {

    /* renamed from: f  reason: collision with root package name */
    public final c f7804f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final k f7805g;

    public b(x xVar) {
        super(xVar);
        this.f7810a.setStyle(Paint.Style.STROKE);
        this.f7805g = new k(this);
    }

    public final f a(i.a aVar) {
        return this.f7804f.b(aVar);
    }

    public final void e(i.a aVar, f fVar) {
        c.a aVar2 = c.a.f7806h;
        if (aVar2.equals(aVar)) {
            float d9 = fVar.d();
            this.f7804f.d(aVar2, new f(d9));
            this.f7810a.setStrokeWidth(d9);
            t6.d dVar = this.f7811b;
            if (dVar != null) {
                ((x) dVar).a();
            }
        }
    }
}
