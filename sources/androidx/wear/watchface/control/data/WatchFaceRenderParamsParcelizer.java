package androidx.wear.watchface.control.data;

import androidx.wear.watchface.data.RenderParametersWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.a;

public final class WatchFaceRenderParamsParcelizer {
    public static WatchFaceRenderParams read(a aVar) {
        WatchFaceRenderParams watchFaceRenderParams = new WatchFaceRenderParams();
        watchFaceRenderParams.f2285f = (RenderParametersWireFormat) aVar.F(watchFaceRenderParams.f2285f, 1);
        watchFaceRenderParams.f2288i = aVar.u(100, watchFaceRenderParams.f2288i);
        watchFaceRenderParams.f2286g = aVar.w(3, watchFaceRenderParams.f2286g);
        watchFaceRenderParams.f2287h = (UserStyleWireFormat) aVar.F(watchFaceRenderParams.f2287h, 5);
        return watchFaceRenderParams;
    }

    public static void write(WatchFaceRenderParams watchFaceRenderParams, a aVar) {
        aVar.H(false, false);
        aVar.g0(watchFaceRenderParams.f2285f, 1);
        aVar.V(100, watchFaceRenderParams.f2288i);
        aVar.W(3, watchFaceRenderParams.f2286g);
        aVar.g0(watchFaceRenderParams.f2287h, 5);
    }
}
