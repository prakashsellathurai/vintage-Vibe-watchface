package q5;

import android.content.Context;
import d6.a;
import java.util.Map;
import u1.b;
import u1.m;
import w5.f;

public final class c extends a {

    /* renamed from: k  reason: collision with root package name */
    public final b f6610k;

    public c(Context context, Map<String, b6.b> map, b bVar) {
        super(context, map);
        this.f6610k = bVar;
    }

    public final f c(w5.c cVar) {
        String substring = cVar.f8018a.substring(14);
        int lastIndexOf = substring.lastIndexOf(".");
        int i8 = 0;
        if (lastIndexOf >= 0) {
            int parseInt = Integer.parseInt(substring.substring(lastIndexOf + 1));
            substring = substring.substring(0, lastIndexOf);
            i8 = parseInt;
        }
        Map map = (Map) this.f6610k.f7606b.getValue();
        for (Map.Entry key : map.entrySet()) {
            m mVar = (m) key.getKey();
            if (mVar.f7641a.f7683a.equals(substring)) {
                return (f) g7.a.a(this.f4047j.get(mVar.f7641a.f7683a), (m.h) map.get(mVar)).get(i8);
            }
        }
        return new f();
    }

    public final void f() {
        this.f6610k.f7606b.collect(new i5.c(4, this), new b());
        this.f4054h = true;
    }
}
