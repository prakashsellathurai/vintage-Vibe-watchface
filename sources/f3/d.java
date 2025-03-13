package f3;

import java.util.ArrayList;
import p2.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4388a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f4389a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T> f4390b;

        public a(Class<T> cls, j<T> jVar) {
            this.f4389a = cls;
            this.f4390b = jVar;
        }
    }

    public final synchronized <Z> j<Z> a(Class<Z> cls) {
        int size = this.f4388a.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = (a) this.f4388a.get(i8);
            if (aVar.f4389a.isAssignableFrom(cls)) {
                return aVar.f4390b;
            }
        }
        return null;
    }
}
