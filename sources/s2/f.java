package s2;

import java.util.ArrayList;
import java.util.HashMap;
import s2.j;

public final class f<K extends j, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f7176a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7177b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f7178a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f7179b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f7180c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f7181d;

        public a() {
            this((Object) null);
        }

        public a(K k8) {
            this.f7181d = this;
            this.f7180c = this;
            this.f7178a = k8;
        }
    }

    public final V a(K k8) {
        HashMap hashMap = this.f7177b;
        a<K, V> aVar = (a) hashMap.get(k8);
        if (aVar == null) {
            aVar = new a<>(k8);
            hashMap.put(k8, aVar);
        } else {
            k8.a();
        }
        a<K, V> aVar2 = aVar.f7181d;
        aVar2.f7180c = aVar.f7180c;
        aVar.f7180c.f7181d = aVar2;
        a<K, V> aVar3 = this.f7176a;
        aVar.f7181d = aVar3;
        a<K, V> aVar4 = aVar3.f7180c;
        aVar.f7180c = aVar4;
        aVar4.f7181d = aVar;
        aVar.f7181d.f7180c = aVar;
        ArrayList arrayList = aVar.f7179b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return aVar.f7179b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k8, V v8) {
        HashMap hashMap = this.f7177b;
        a<K, V> aVar = (a) hashMap.get(k8);
        if (aVar == null) {
            aVar = new a<>(k8);
            a<K, V> aVar2 = aVar.f7181d;
            aVar2.f7180c = aVar.f7180c;
            aVar.f7180c.f7181d = aVar2;
            a<K, V> aVar3 = this.f7176a;
            aVar.f7181d = aVar3.f7181d;
            aVar.f7180c = aVar3;
            aVar3.f7181d = aVar;
            aVar.f7181d.f7180c = aVar;
            hashMap.put(k8, aVar);
        } else {
            k8.a();
        }
        if (aVar.f7179b == null) {
            aVar.f7179b = new ArrayList();
        }
        aVar.f7179b.add(v8);
    }

    public final V c() {
        a<K, V> aVar = this.f7176a;
        a<K, V> aVar2 = aVar.f7181d;
        while (true) {
            V v8 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f7179b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v8 = aVar2.f7179b.remove(size - 1);
            }
            if (v8 != null) {
                return v8;
            }
            a<K, V> aVar3 = aVar2.f7181d;
            aVar3.f7180c = aVar2.f7180c;
            aVar2.f7180c.f7181d = aVar3;
            HashMap hashMap = this.f7177b;
            K k8 = aVar2.f7178a;
            hashMap.remove(k8);
            ((j) k8).a();
            aVar2 = aVar2.f7181d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f7176a;
        a<K, V> aVar2 = aVar.f7180c;
        boolean z8 = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.f7178a);
            sb.append(':');
            ArrayList arrayList = aVar2.f7179b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            aVar2 = aVar2.f7180c;
            z8 = true;
        }
        if (z8) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
