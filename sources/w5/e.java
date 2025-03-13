package w5;

import java.util.Arrays;
import java.util.HashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f8060a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8061b = false;

    public static c a(d dVar) {
        return new c(dVar.f8059f[0]);
    }

    public static boolean b(c cVar) {
        d c9 = c(cVar.f8018a);
        return c9 != d.f8025g && c9.ordinal() > 0 && c9.ordinal() < d.f8030i0.ordinal();
    }

    public static d c(String str) {
        boolean z8 = f8061b;
        HashMap hashMap = f8060a;
        if (!z8) {
            f8061b = true;
            for (d dVar : d.values()) {
                String[] strArr = dVar.f8059f;
                if (strArr.length > 0 && strArr[0] != null) {
                    for (String put : (String[]) Arrays.copyOf(strArr, strArr.length)) {
                        hashMap.put(put, dVar);
                    }
                }
            }
        }
        d dVar2 = (d) hashMap.get(str);
        return dVar2 == null ? d.f8025g : dVar2;
    }
}
