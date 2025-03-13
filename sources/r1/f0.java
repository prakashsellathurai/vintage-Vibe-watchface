package r1;

import android.util.Log;
import androidx.wear.watchface.data.WatchUiState;
import h7.h;
import n1.p0;
import n1.t0;
import q7.k;
import q7.l;

public final class f0 extends l implements p7.l<p0, Object> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h0 f6701f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ WatchUiState f6702g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, WatchUiState watchUiState) {
        super(1);
        this.f6701f = h0Var;
        this.f6702g = watchUiState;
    }

    public final Object invoke(Object obj) {
        k.e((p0) obj, "it");
        h0 h0Var = this.f6701f;
        t0.c cVar = h0Var.f6708a;
        if (cVar != null) {
            cVar.H(this.f6702g, true);
            return h.f4787a;
        }
        return Integer.valueOf(Log.d("InteractiveWatchFaceImpl", "setWatchUiState ignored due to null engine id " + h0Var.f6709b));
    }
}
