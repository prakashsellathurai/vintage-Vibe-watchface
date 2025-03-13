package androidx.health.services.client.impl;

import android.os.IBinder;
import androidx.health.services.client.impl.ipc.Client;
import androidx.health.services.client.impl.ipc.RemoteOperation;
import com.google.android.material.tabs.e;
import com.samsung.android.wearable.watchfacestudio.editor.z;
import o6.g;
import o6.l;
import o6.q;
import o6.s;

public final /* synthetic */ class d implements Client.ServiceGetter, RemoteOperation, e.b, z.e, r5.d, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1373a;

    public /* synthetic */ d(int i8) {
        this.f1373a = i8;
    }

    public final void a() {
    }

    public final boolean b(q qVar) {
        if (qVar.s()) {
            ((g) qVar).f6149z = true;
        } else if (qVar instanceof s) {
            ((s) qVar).A();
        }
        return true;
    }

    public final void c() {
    }

    public final Object execute(Object obj) {
        switch (this.f1373a) {
            case 1:
                return ServiceBackedExerciseClient._init_$lambda$1((IExerciseApiService) obj);
            case 3:
                return ServiceBackedHealthServicesClient._init_$lambda$1((IHealthServicesApiService) obj);
            case 5:
                return ServiceBackedMeasureClient._init_$lambda$1((IMeasureApiService) obj);
            default:
                return ServiceBackedPassiveMonitoringClient._init_$lambda$1((IPassiveMonitoringApiService) obj);
        }
    }

    public final Object getService(IBinder iBinder) {
        switch (this.f1373a) {
            case 0:
                return ServiceBackedExerciseClient._init_$lambda$0(iBinder);
            case 2:
                return ServiceBackedHealthServicesClient._init_$lambda$0(iBinder);
            case 4:
                return ServiceBackedMeasureClient._init_$lambda$0(iBinder);
            default:
                return ServiceBackedPassiveMonitoringClient._init_$lambda$0(iBinder);
        }
    }
}
