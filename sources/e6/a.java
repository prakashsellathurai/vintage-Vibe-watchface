package e6;

import e7.b;
import e7.h;
import java.util.Map;
import java.util.function.Predicate;
import o6.q;
import o6.t;

public final /* synthetic */ class a implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4253a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4254b;

    public /* synthetic */ a(int i8, Object obj) {
        this.f4253a = i8;
        this.f4254b = obj;
    }

    public final boolean test(Object obj) {
        int i8 = this.f4253a;
        Object obj2 = this.f4254b;
        switch (i8) {
            case 0:
                String str = (String) ((Map.Entry) obj).getValue();
                String str2 = ((e) obj2).f4261a;
                int lastIndexOf = str2.lastIndexOf(".");
                return str.equals(lastIndexOf == -1 ? null : str2.substring(0, lastIndexOf));
            case 1:
                return ((t) obj2).H == null && ((q) obj).isEnabled();
            default:
                return ((h) obj).f4280h.equals(((b) obj2).f4280h);
        }
    }
}
