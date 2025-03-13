package b6;

import android.graphics.Color;
import android.graphics.drawable.Icon;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2612b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2613c;

    /* renamed from: d  reason: collision with root package name */
    public final Icon f2614d;
    public final ArrayList<Color> e;

    public c(String str, String str2, String str3, Icon icon, ArrayList arrayList) {
        ArrayList<Color> arrayList2 = new ArrayList<>();
        this.e = arrayList2;
        this.f2611a = str;
        this.f2612b = str2;
        this.f2613c = str3;
        this.f2614d = icon;
        arrayList2.addAll(arrayList);
    }
}
