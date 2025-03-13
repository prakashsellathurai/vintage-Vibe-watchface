package c3;

import java.util.ArrayList;
import java.util.Iterator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2654a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f2655a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f2656b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f2657c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f2655a = cls;
            this.f2656b = cls2;
            this.f2657c = bVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f2654a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f2655a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f2656b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
