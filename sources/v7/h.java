package v7;

import a1.a;
import i7.k;
import java.util.ArrayList;
import java.util.List;

public class h extends f {
    public static final <T> List<T> n0(d<? extends T> dVar) {
        ArrayList arrayList = new ArrayList();
        for (Object add : dVar) {
            arrayList.add(add);
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : a.A(arrayList.get(0)) : k.f4879f;
    }
}
