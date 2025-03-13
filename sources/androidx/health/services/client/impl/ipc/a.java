package androidx.health.services.client.impl.ipc;

import android.os.IInterface;
import g5.l;

public final /* synthetic */ class a implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1386a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RemoteOperation f1387b;

    public /* synthetic */ a(RemoteOperation remoteOperation, int i8) {
        this.f1386a = i8;
        this.f1387b = remoteOperation;
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1386a;
        RemoteOperation remoteOperation = this.f1387b;
        switch (i8) {
            case 0:
                lVar.m(remoteOperation.execute((IInterface) obj));
                return;
            case 1:
                lVar.m(remoteOperation.execute((IInterface) obj));
                return;
            default:
                lVar.m(remoteOperation.execute((IInterface) obj));
                return;
        }
    }
}
