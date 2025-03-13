package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d4.d;
import p3.b;

public abstract class g0<T> extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final d<T> f6559b;

    public g0(d dVar) {
        super(4);
        this.f6559b = dVar;
    }

    public final void a(Status status) {
        this.f6559b.a(new b(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f6559b.a(runtimeException);
    }

    public final void d(t<?> tVar) {
        try {
            h(tVar);
        } catch (DeadObjectException e) {
            a(j0.e(e));
            throw e;
        } catch (RemoteException e4) {
            a(j0.e(e4));
        } catch (RuntimeException e9) {
            this.f6559b.a(e9);
        }
    }

    public abstract void h(t<?> tVar);
}
