package e6;

import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4255a = new HashMap();

    public final e a(int i8, String str) {
        HashMap hashMap = this.f4255a;
        if (!hashMap.containsKey(Integer.valueOf(i8))) {
            return e.f4260b;
        }
        return new e(String.format("%s.%s", new Object[]{(String) hashMap.get(Integer.valueOf(i8)), str}));
    }
}
