package androidx.health.services.client.impl;

import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.data.WarmUpConfig;
import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import androidx.health.services.client.impl.request.MeasureRegistrationRequest;
import androidx.health.services.client.impl.request.MeasureUnregistrationRequest;
import c6.b;
import d6.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n1.f;
import o6.g;
import o6.i;
import o6.l;
import o6.q;

public final /* synthetic */ class c implements RemoteFutureOperation, f, c6.c, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1370a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1371b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1372c;

    public /* synthetic */ c(Object obj, int i8, Object obj2) {
        this.f1370a = i8;
        this.f1371b = obj;
        this.f1372c = obj2;
    }

    public final void a(List list) {
        d dVar = (d) this.f1371b;
        b bVar = (b) this.f1372c;
        dVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5.d dVar2 = (w5.d) it.next();
            bVar.getClass();
            dVar.t(dVar2, w5.d.O0.ordinal() < dVar2.ordinal() && dVar2.ordinal() < w5.d.R0.ordinal());
        }
    }

    public final boolean b(q qVar) {
        i iVar = (i) this.f1371b;
        Collection collection = (Collection) this.f1372c;
        iVar.getClass();
        if (!qVar.s()) {
            return true;
        }
        g gVar = (g) qVar;
        if (gVar.y.contains(g.a.f6150f)) {
            return gVar.A(iVar.f6147v, collection);
        }
        return false;
    }

    public final void execute(Object obj, g5.l lVar) {
        int i8 = this.f1370a;
        Object obj2 = this.f1372c;
        Object obj3 = this.f1371b;
        switch (i8) {
            case 0:
                ServiceBackedExerciseClient.prepareExerciseAsync$lambda$2((ServiceBackedExerciseClient) obj3, (WarmUpConfig) obj2, (IExerciseApiService) obj, lVar);
                return;
            case 1:
                ServiceBackedExerciseClient.startExerciseAsync$lambda$3((ServiceBackedExerciseClient) obj3, (ExerciseConfig) obj2, (IExerciseApiService) obj, lVar);
                return;
            case 2:
                ServiceBackedMeasureClient.registerMeasureCallback$lambda$2((MeasureRegistrationRequest) obj3, (MeasureCallbackStub) obj2, (IMeasureApiService) obj, lVar);
                return;
            default:
                ServiceBackedMeasureClient.unregisterMeasureCallbackAsync$lambda$3((MeasureUnregistrationRequest) obj3, (MeasureCallbackStub) obj2, (IMeasureApiService) obj, lVar);
                return;
        }
    }
}
