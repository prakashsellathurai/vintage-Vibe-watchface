package m;

import java.util.HashMap;
import m.b;

public final class a<K, V> extends b<K, V> {

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f5338j = new HashMap<>();

    public final b.c<K, V> i(K k8) {
        return this.f5338j.get(k8);
    }

    public final V j(K k8) {
        V j8 = super.j(k8);
        this.f5338j.remove(k8);
        return j8;
    }

    public final V k(K k8, V v8) {
        b.c i8 = i(k8);
        if (i8 != null) {
            return i8.f5344g;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f5338j;
        b.c<K, V> cVar = new b.c<>(k8, v8);
        this.f5342i++;
        b.c<K, V> cVar2 = this.f5340g;
        if (cVar2 == null) {
            this.f5339f = cVar;
        } else {
            cVar2.f5345h = cVar;
            cVar.f5346i = cVar2;
        }
        this.f5340g = cVar;
        hashMap.put(k8, cVar);
        return null;
    }
}
