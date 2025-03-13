package r1;

import android.graphics.Rect;
import androidx.wear.watchface.data.IdAndComplicationStateWireFormat;
import java.util.List;
import n1.t0;
import q7.k;
import q7.l;

public final class w extends l implements p7.l<t0.b, List<? extends IdAndComplicationStateWireFormat>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t0.c f6735f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(t0.c cVar) {
        super(1);
        this.f6735f = cVar;
    }

    public final Object invoke(Object obj) {
        t0.b bVar = (t0.b) obj;
        k.e(bVar, "it");
        t0.c cVar = this.f6735f;
        k.b(cVar);
        Rect rect = cVar.M;
        if (rect != null) {
            return bVar.f5738a.c(rect);
        }
        k.h("screenBounds");
        throw null;
    }
}
