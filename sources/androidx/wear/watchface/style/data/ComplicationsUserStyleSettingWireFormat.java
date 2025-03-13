package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class ComplicationsUserStyleSettingWireFormat extends UserStyleSettingWireFormat {

    /* renamed from: p  reason: collision with root package name */
    public List<CharSequence> f2413p;

    public ComplicationsUserStyleSettingWireFormat() {
    }

    public ComplicationsUserStyleSettingWireFormat(String str, CharSequence charSequence, CharSequence charSequence2, Icon icon, ArrayList arrayList, int i8, ArrayList arrayList2, Bundle bundle, ArrayList arrayList3, ArrayList arrayList4) {
        super(str, charSequence, charSequence2, icon, arrayList, i8, arrayList2, bundle, arrayList3);
        this.f2413p = arrayList4;
    }
}
