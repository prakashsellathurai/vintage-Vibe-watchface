package androidx.wear.watchface.data;

import g1.a;

public final class WatchFaceColorsWireFormatParcelizer {
    public static WatchFaceColorsWireFormat read(a aVar) {
        WatchFaceColorsWireFormat watchFaceColorsWireFormat = new WatchFaceColorsWireFormat();
        watchFaceColorsWireFormat.f2359f = aVar.t(watchFaceColorsWireFormat.f2359f, 1);
        watchFaceColorsWireFormat.f2360g = aVar.t(watchFaceColorsWireFormat.f2360g, 2);
        watchFaceColorsWireFormat.f2361h = aVar.t(watchFaceColorsWireFormat.f2361h, 3);
        return watchFaceColorsWireFormat;
    }

    public static void write(WatchFaceColorsWireFormat watchFaceColorsWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(watchFaceColorsWireFormat.f2359f, 1);
        aVar.U(watchFaceColorsWireFormat.f2360g, 2);
        aVar.U(watchFaceColorsWireFormat.f2361h, 3);
    }
}
