package androidx.wear.watchface.data;

import g1.a;

public final class WatchFaceOverlayStyleWireFormatParcelizer {
    public static WatchFaceOverlayStyleWireFormat read(a aVar) {
        WatchFaceOverlayStyleWireFormat watchFaceOverlayStyleWireFormat = new WatchFaceOverlayStyleWireFormat();
        watchFaceOverlayStyleWireFormat.f2362f = aVar.i(1, watchFaceOverlayStyleWireFormat.f2362f);
        watchFaceOverlayStyleWireFormat.f2363g = aVar.t(watchFaceOverlayStyleWireFormat.f2363g, 2);
        watchFaceOverlayStyleWireFormat.f2364h = aVar.i(3, watchFaceOverlayStyleWireFormat.f2364h);
        watchFaceOverlayStyleWireFormat.f2365i = aVar.t(watchFaceOverlayStyleWireFormat.f2365i, 4);
        return watchFaceOverlayStyleWireFormat;
    }

    public static void write(WatchFaceOverlayStyleWireFormat watchFaceOverlayStyleWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.J(1, watchFaceOverlayStyleWireFormat.f2362f);
        aVar.U(watchFaceOverlayStyleWireFormat.f2363g, 2);
        aVar.J(3, watchFaceOverlayStyleWireFormat.f2364h);
        aVar.U(watchFaceOverlayStyleWireFormat.f2365i, 4);
    }
}
