package f3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4383a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4384b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f4385a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f4386b;

        /* renamed from: c  reason: collision with root package name */
        public final i<T, R> f4387c;

        public a(Class<T> cls, Class<R> cls2, i<T, R> iVar) {
            this.f4385a = cls;
            this.f4386b = cls2;
            this.f4387c = iVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f4383a.contains(str)) {
            this.f4383a.add(str);
        }
        list = (List) this.f4384b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f4384b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4383a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f4384b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f4385a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f4386b)) && !arrayList.contains(aVar.f4386b)) {
                        arrayList.add(aVar.f4386b);
                    }
                }
            }
        }
        return arrayList;
    }
}
