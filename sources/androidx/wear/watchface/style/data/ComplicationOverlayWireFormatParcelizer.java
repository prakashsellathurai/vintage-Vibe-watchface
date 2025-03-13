package androidx.wear.watchface.style.data;

import g1.a;

public final class ComplicationOverlayWireFormatParcelizer {
    public static ComplicationOverlayWireFormat read(a aVar) {
        ComplicationOverlayWireFormat complicationOverlayWireFormat = new ComplicationOverlayWireFormat();
        complicationOverlayWireFormat.mComplicationSlotId = aVar.t(complicationOverlayWireFormat.mComplicationSlotId, 1);
        complicationOverlayWireFormat.mEnabled = aVar.t(complicationOverlayWireFormat.mEnabled, 2);
        complicationOverlayWireFormat.mPerComplicationTypeBounds = aVar.x(complicationOverlayWireFormat.mPerComplicationTypeBounds, 3);
        complicationOverlayWireFormat.mAccessibilityTraversalIndex = aVar.w(4, complicationOverlayWireFormat.mAccessibilityTraversalIndex);
        return complicationOverlayWireFormat;
    }

    public static void write(ComplicationOverlayWireFormat complicationOverlayWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(complicationOverlayWireFormat.mComplicationSlotId, 1);
        aVar.U(complicationOverlayWireFormat.mEnabled, 2);
        aVar.Y(complicationOverlayWireFormat.mPerComplicationTypeBounds, 3);
        aVar.W(4, complicationOverlayWireFormat.mAccessibilityTraversalIndex);
    }
}
