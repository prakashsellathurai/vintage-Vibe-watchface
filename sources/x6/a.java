package x6;

import android.util.Log;
import java.util.ArrayList;
import java.util.EnumSet;
import x6.c;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f8161a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8162b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumSet<c.a> f8163c = EnumSet.noneOf(c.a.class);

    /* renamed from: d  reason: collision with root package name */
    public boolean f8164d = true;

    public a(b bVar, g gVar) {
        this.f8161a = bVar;
        this.f8162b = gVar;
    }

    public final void h(c.a aVar) {
        if (aVar == c.a.f8185g && i(aVar) && this.f8164d) {
            this.f8164d = false;
        } else if (i(aVar)) {
            Log.i("DWF:ResourceChanger", "Show next animation");
            b bVar = this.f8161a;
            bVar.e();
            g gVar = this.f8162b;
            y6.a aVar2 = gVar.f8193t;
            if (aVar2 != null) {
                aVar2.g();
                aVar2.f8529h = false;
            }
            ArrayList arrayList = gVar.f8194u;
            int size = (gVar.f8195v + 1) % arrayList.size();
            gVar.f8195v = size;
            gVar.f8193t = (y6.a) arrayList.get(size);
            gVar.C();
            gVar.A();
            Log.i("DWF:AnimationController", "onReady");
            bVar.c(bVar.f8166b);
        }
    }

    public final boolean i(c.a aVar) {
        return this.f8163c.contains(aVar);
    }
}
