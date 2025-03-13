package androidx.health.services.client.impl;

import android.graphics.Canvas;
import android.util.Log;
import androidx.activity.result.b;
import androidx.health.services.client.impl.ipc.RemoteOperation;
import j5.b;
import java.util.Collection;
import k6.j;
import n1.i0;
import o6.g;
import o6.l;
import o6.p;
import o6.q;
import q7.k;
import y7.o;

public final /* synthetic */ class i implements RemoteOperation, b, i0.e, b.e, j.b, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1384a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1385b;

    public /* synthetic */ i(int i8, Object obj) {
        this.f1384a = i8;
        this.f1385b = obj;
    }

    public final void a(Object obj) {
        t1.b bVar = (t1.b) this.f1385b;
        t1.i iVar = (t1.i) obj;
        k.e(bVar, "this$0");
        synchronized (bVar) {
            o oVar = bVar.f7390t;
            if (oVar == null) {
                Log.w("EditorSession", "Ignoring onComplicationDataSourceChooserResult due to null pendingComplicationDataSourceChooserResult");
                return;
            }
            bVar.f7390t = null;
            oVar.X(iVar);
        }
    }

    public final boolean b(q qVar) {
        int i8 = this.f1384a;
        Object obj = this.f1385b;
        switch (i8) {
            case 7:
                p pVar = (p) obj;
                pVar.getClass();
                if (qVar.s()) {
                    return ((g) qVar).A(pVar.f6171b, (Collection<Integer>) null);
                }
                return true;
            default:
                Canvas canvas = (Canvas) obj;
                if (qVar.s()) {
                    return ((g) qVar).A(canvas, (Collection<Integer>) null);
                }
                return true;
        }
    }

    public final Object execute(Object obj) {
        return ServiceBackedMeasureClient.getCapabilitiesAsync$lambda$4((ServiceBackedMeasureClient) this.f1385b, (IMeasureApiService) obj);
    }
}
