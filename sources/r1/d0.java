package r1;

import android.os.Bundle;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import n1.p0;
import q7.k;
import q7.l;

public final class d0 extends l implements p7.l<p0, Bundle> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ WatchFaceRenderParams f6694f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(WatchFaceRenderParams watchFaceRenderParams) {
        super(1);
        this.f6694f = watchFaceRenderParams;
    }

    public final Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        k.e(p0Var, "watchFaceImpl");
        return p0Var.i(this.f6694f);
    }
}
