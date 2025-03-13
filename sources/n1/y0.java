package n1;

import a8.b;
import a8.g;
import android.support.wearable.complications.ComplicationData;
import android.util.Log;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import c1.c;
import j7.d;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import q7.k;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$listenForComplicationChanges$1", f = "WatchFaceService.kt", l = {1670}, m = "invokeSuspend")
public final class y0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5885j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t0.c f5886k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ l f5887l;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t0.c f5888f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f5889g;

        public a(t0.c cVar, l lVar) {
            this.f5888f = cVar;
            this.f5889g = lVar;
        }

        public final Object emit(Object obj, d dVar) {
            t0.c cVar = this.f5888f;
            cVar.f5758t.getClass();
            Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
            Iterator it = ((List) obj).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                l lVar = this.f5889g;
                if (hasNext) {
                    IdAndComplicationDataWireFormat idAndComplicationDataWireFormat = (IdAndComplicationDataWireFormat) it.next();
                    int i8 = idAndComplicationDataWireFormat.f2341f;
                    ComplicationData complicationData = idAndComplicationDataWireFormat.f2342g;
                    k.d(complicationData, "idAndComplicationData.complicationData");
                    boolean z8 = false;
                    q1.b i9 = q1.e.i(complicationData, false);
                    k.d(ofEpochMilli, "now");
                    lVar.getClass();
                    h hVar = (h) lVar.e.get(Integer.valueOf(i8));
                    if (hVar == null) {
                        Log.e("ComplicationSlotsManager", "onComplicationDataUpdate failed due to invalid complicationSlotId=" + i8 + " with data=" + i9);
                    } else {
                        if (hVar.A || !k.a(hVar.c().a(), i9)) {
                            z8 = true;
                        }
                        hVar.A = z8;
                        hVar.h(i9, ofEpochMilli);
                    }
                } else {
                    lVar.f();
                    cVar.f();
                    return h7.h.f4787a;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(t0.c cVar, l lVar, d<? super y0> dVar) {
        super(2, dVar);
        this.f5886k = cVar;
        this.f5887l = lVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new y0(this.f5886k, this.f5887l, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((y0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5885j;
        if (i8 == 0) {
            a1.a.I(obj);
            t0.c cVar = this.f5886k;
            g gVar = cVar.F;
            a aVar2 = new a(cVar, this.f5887l);
            this.f5885j = 1;
            if (gVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a1.a.I(obj);
        }
        throw new c();
    }
}
