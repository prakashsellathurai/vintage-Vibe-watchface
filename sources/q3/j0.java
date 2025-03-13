package q3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6567a;

    public j0(int i8) {
        this.f6567a = i8;
    }

    public static /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(k kVar, boolean z8);

    public abstract void d(t<?> tVar);
}
