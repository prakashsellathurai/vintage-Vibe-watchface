package androidx.wear.watchface.control.data;

import android.content.ComponentName;
import androidx.wear.watchface.data.DeviceConfig;
import g1.a;

public final class HeadlessWatchFaceInstanceParamsParcelizer {
    public static HeadlessWatchFaceInstanceParams read(a aVar) {
        HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams = new HeadlessWatchFaceInstanceParams();
        headlessWatchFaceInstanceParams.f2269f = (ComponentName) aVar.z(headlessWatchFaceInstanceParams.f2269f, 1);
        headlessWatchFaceInstanceParams.f2270g = (DeviceConfig) aVar.F(headlessWatchFaceInstanceParams.f2270g, 2);
        headlessWatchFaceInstanceParams.f2271h = aVar.t(headlessWatchFaceInstanceParams.f2271h, 3);
        headlessWatchFaceInstanceParams.f2272i = aVar.t(headlessWatchFaceInstanceParams.f2272i, 4);
        headlessWatchFaceInstanceParams.f2273j = aVar.C(5, headlessWatchFaceInstanceParams.f2273j);
        return headlessWatchFaceInstanceParams;
    }

    public static void write(HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams, a aVar) {
        aVar.H(false, false);
        aVar.a0(headlessWatchFaceInstanceParams.f2269f, 1);
        aVar.g0(headlessWatchFaceInstanceParams.f2270g, 2);
        aVar.U(headlessWatchFaceInstanceParams.f2271h, 3);
        aVar.U(headlessWatchFaceInstanceParams.f2272i, 4);
        aVar.c0(5, headlessWatchFaceInstanceParams.f2273j);
    }
}
