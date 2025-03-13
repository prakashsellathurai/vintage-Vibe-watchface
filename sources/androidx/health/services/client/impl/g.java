package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.Client;
import f5.a;
import p7.l;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1381b;

    public /* synthetic */ g(int i8, Object obj) {
        this.f1380a = i8;
        this.f1381b = obj;
    }

    public final Object apply(Object obj) {
        int i8 = this.f1380a;
        Object obj2 = this.f1381b;
        switch (i8) {
            case 0:
                return ServiceBackedExerciseClient.getCapabilitiesAsync$lambda$16((l) obj2, obj);
            case 1:
                return ServiceBackedMeasureClient.getCapabilitiesAsync$lambda$5((l) obj2, obj);
            case 2:
                return ServiceBackedPassiveMonitoringClient.getCapabilitiesAsync$lambda$9((l) obj2, obj);
            default:
                return ((Client) obj2).lambda$getCurrentRemoteVersion$1((Integer) obj);
        }
    }
}
