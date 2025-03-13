package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import java.util.ArrayList;
import java.util.List;

public class ComplicationsOptionWireFormat extends OptionWireFormat {

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2407g;

    /* renamed from: h  reason: collision with root package name */
    public Icon f2408h;

    /* renamed from: i  reason: collision with root package name */
    public ComplicationOverlayWireFormat[] f2409i;

    /* renamed from: j  reason: collision with root package name */
    public List<PerComplicationTypeMargins> f2410j;

    /* renamed from: k  reason: collision with root package name */
    public List<Integer> f2411k;

    /* renamed from: l  reason: collision with root package name */
    public List<Integer> f2412l;

    public ComplicationsOptionWireFormat() {
        this.f2409i = new ComplicationOverlayWireFormat[0];
    }

    public ComplicationsOptionWireFormat(byte[] bArr, CharSequence charSequence, Icon icon, ComplicationOverlayWireFormat[] complicationOverlayWireFormatArr, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(bArr);
        this.f2407g = charSequence;
        this.f2408h = icon;
        this.f2409i = complicationOverlayWireFormatArr;
        this.f2410j = arrayList;
        this.f2411k = arrayList2;
        this.f2412l = arrayList3;
    }
}
