package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;

public class ListOptionWireFormat extends OptionWireFormat {

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2414g;

    /* renamed from: h  reason: collision with root package name */
    public Icon f2415h;

    public ListOptionWireFormat() {
        this.f2414g = "";
        this.f2415h = null;
    }

    public ListOptionWireFormat(byte[] bArr, CharSequence charSequence, Icon icon) {
        super(bArr);
        this.f2414g = charSequence;
        this.f2415h = icon;
    }
}
