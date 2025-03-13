package androidx.wear.watchface.control.data;

import android.support.wearable.complications.ComplicationData;
import androidx.wear.watchface.data.RenderParametersWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.a;

public final class ComplicationRenderParamsParcelizer {
    public static ComplicationRenderParams read(a aVar) {
        ComplicationRenderParams complicationRenderParams = new ComplicationRenderParams();
        complicationRenderParams.f2260f = aVar.t(complicationRenderParams.f2260f, 1);
        complicationRenderParams.f2261g = (RenderParametersWireFormat) aVar.F(complicationRenderParams.f2261g, 2);
        complicationRenderParams.f2262h = aVar.w(4, complicationRenderParams.f2262h);
        complicationRenderParams.f2263i = (ComplicationData) aVar.z(complicationRenderParams.f2263i, 5);
        complicationRenderParams.f2264j = (UserStyleWireFormat) aVar.F(complicationRenderParams.f2264j, 6);
        return complicationRenderParams;
    }

    public static void write(ComplicationRenderParams complicationRenderParams, a aVar) {
        aVar.H(false, false);
        aVar.U(complicationRenderParams.f2260f, 1);
        aVar.g0(complicationRenderParams.f2261g, 2);
        aVar.W(4, complicationRenderParams.f2262h);
        aVar.a0(complicationRenderParams.f2263i, 5);
        aVar.g0(complicationRenderParams.f2264j, 6);
    }
}
