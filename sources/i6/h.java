package i6;

import java.util.ArrayList;
import java.util.List;
import s5.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final f f4869a = new f();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f4869a.f4867b.get("DataSource");
        if (list != null) {
            list.forEach(new a(2, arrayList));
        }
        return arrayList;
    }
}
