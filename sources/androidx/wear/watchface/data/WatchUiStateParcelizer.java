package androidx.wear.watchface.data;

import g1.a;

public final class WatchUiStateParcelizer {
    public static WatchUiState read(a aVar) {
        WatchUiState watchUiState = new WatchUiState();
        watchUiState.f2366f = aVar.i(1, watchUiState.f2366f);
        watchUiState.f2367g = aVar.t(watchUiState.f2367g, 2);
        return watchUiState;
    }

    public static void write(WatchUiState watchUiState, a aVar) {
        aVar.H(true, false);
        aVar.J(1, watchUiState.f2366f);
        aVar.U(watchUiState.f2367g, 2);
    }
}
