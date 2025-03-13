package d2;

import f2.l;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<l> f3992a;

    /* renamed from: b  reason: collision with root package name */
    public final char f3993b;

    /* renamed from: c  reason: collision with root package name */
    public final double f3994c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3995d;
    public final String e;

    public d(ArrayList arrayList, char c9, double d9, String str, String str2) {
        this.f3992a = arrayList;
        this.f3993b = c9;
        this.f3994c = d9;
        this.f3995d = str;
        this.e = str2;
    }

    public static int a(char c9, String str, String str2) {
        return ((((0 + c9) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return a(this.f3993b, this.e, this.f3995d);
    }
}
