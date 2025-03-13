package androidx.wear.watchface.style.data;

import g1.a;

public final class PerComplicationTypeMarginsParcelizer {
    public static PerComplicationTypeMargins read(a aVar) {
        PerComplicationTypeMargins perComplicationTypeMargins = new PerComplicationTypeMargins();
        perComplicationTypeMargins.f2418f = aVar.x(perComplicationTypeMargins.f2418f, 1);
        return perComplicationTypeMargins;
    }

    public static void write(PerComplicationTypeMargins perComplicationTypeMargins, a aVar) {
        aVar.H(false, false);
        aVar.Y(perComplicationTypeMargins.f2418f, 1);
    }
}
