package androidx.wear.watchface.control.data;

import androidx.wear.watchface.data.DeviceConfig;
import androidx.wear.watchface.data.WatchUiState;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import g1.a;

public final class WallpaperInteractiveWatchFaceInstanceParamsParcelizer {
    public static WallpaperInteractiveWatchFaceInstanceParams read(a aVar) {
        WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams = new WallpaperInteractiveWatchFaceInstanceParams();
        wallpaperInteractiveWatchFaceInstanceParams.f2278f = aVar.C(1, wallpaperInteractiveWatchFaceInstanceParams.f2278f);
        wallpaperInteractiveWatchFaceInstanceParams.f2282j = aVar.u(100, wallpaperInteractiveWatchFaceInstanceParams.f2282j);
        wallpaperInteractiveWatchFaceInstanceParams.f2283k = aVar.C(101, wallpaperInteractiveWatchFaceInstanceParams.f2283k);
        wallpaperInteractiveWatchFaceInstanceParams.f2284l = aVar.C(102, wallpaperInteractiveWatchFaceInstanceParams.f2284l);
        wallpaperInteractiveWatchFaceInstanceParams.f2279g = (DeviceConfig) aVar.F(wallpaperInteractiveWatchFaceInstanceParams.f2279g, 2);
        wallpaperInteractiveWatchFaceInstanceParams.f2280h = (WatchUiState) aVar.F(wallpaperInteractiveWatchFaceInstanceParams.f2280h, 3);
        wallpaperInteractiveWatchFaceInstanceParams.f2281i = (UserStyleWireFormat) aVar.F(wallpaperInteractiveWatchFaceInstanceParams.f2281i, 4);
        return wallpaperInteractiveWatchFaceInstanceParams;
    }

    public static void write(WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams, a aVar) {
        aVar.H(true, false);
        aVar.c0(1, wallpaperInteractiveWatchFaceInstanceParams.f2278f);
        aVar.V(100, wallpaperInteractiveWatchFaceInstanceParams.f2282j);
        aVar.c0(101, wallpaperInteractiveWatchFaceInstanceParams.f2283k);
        aVar.c0(102, wallpaperInteractiveWatchFaceInstanceParams.f2284l);
        aVar.g0(wallpaperInteractiveWatchFaceInstanceParams.f2279g, 2);
        aVar.g0(wallpaperInteractiveWatchFaceInstanceParams.f2280h, 3);
        aVar.g0(wallpaperInteractiveWatchFaceInstanceParams.f2281i, 4);
    }
}
