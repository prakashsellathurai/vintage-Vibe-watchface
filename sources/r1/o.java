package r1;

import android.util.Log;
import r1.k;
import v1.a;

public final class o extends k.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6724a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f6725b;

    public o(k kVar, a aVar) {
        this.f6724a = kVar;
        this.f6725b = aVar;
    }

    public final int getApiVersion() {
        try {
            return this.f6724a.getApiVersion();
        } catch (Throwable th) {
            Log.e("IWatchFaceInstanceServiceStub", "getApiVersion failed", th);
            throw th;
        }
    }

    public final void m(j jVar) {
        a aVar = this.f6725b;
        k kVar = this.f6724a;
        try {
            aVar.close();
            kVar.m(jVar);
        } catch (Throwable th) {
            Log.e("IWatchFaceInstanceServiceStub", "onInteractiveWatchFaceCreated failed", th);
            throw th;
        }
    }

    public final void q(s1.a aVar) {
        q7.k.e(aVar, "exception");
        a aVar2 = this.f6725b;
        k kVar = this.f6724a;
        try {
            aVar2.close();
            kVar.q(aVar);
        } catch (Throwable th) {
            Log.e("IWatchFaceInstanceServiceStub", "onInteractiveWatchFaceCrashed failed", th);
            throw th;
        }
    }
}
