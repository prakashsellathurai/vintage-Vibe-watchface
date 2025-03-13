package p;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class a<K, V> extends f<K, V> implements Map<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public a<K, V>.a f6195m;

    /* renamed from: n  reason: collision with root package name */
    public a<K, V>.c f6196n;

    /* renamed from: o  reason: collision with root package name */
    public a<K, V>.e f6197o;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    public final class C0101a extends AbstractSet<Map.Entry<K, V>> {
        public C0101a() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final int size() {
            return a.this.f6235h;
        }
    }

    public final class b extends c<K> {
        public b() {
            super(a.this.f6235h);
        }

        public final K a(int i8) {
            return a.this.h(i8);
        }

        public final void b(int i8) {
            a.this.j(i8);
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k8) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            a.this.clear();
        }

        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        public final boolean containsAll(Collection<?> collection) {
            a aVar = a.this;
            aVar.getClass();
            for (Object containsKey : collection) {
                if (!aVar.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size() && containsAll(set)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        public final int hashCode() {
            a aVar = a.this;
            int i8 = 0;
            for (int i9 = aVar.f6235h - 1; i9 >= 0; i9--) {
                Object h8 = aVar.h(i9);
                i8 += h8 == null ? 0 : h8.hashCode();
            }
            return i8;
        }

        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        public final Iterator<K> iterator() {
            return new b();
        }

        public final boolean remove(Object obj) {
            a aVar = a.this;
            int e = aVar.e(obj);
            if (e < 0) {
                return false;
            }
            aVar.j(e);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f6235h;
            for (Object remove : collection) {
                aVar.remove(remove);
            }
            return i8 != aVar.f6235h;
        }

        public final boolean retainAll(Collection<?> collection) {
            return a.this.m(collection);
        }

        public final int size() {
            return a.this.f6235h;
        }

        public final Object[] toArray() {
            a aVar = a.this;
            int i8 = aVar.f6235h;
            Object[] objArr = new Object[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                objArr[i9] = aVar.h(i9);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return a.this.n(0, tArr);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public int f6201f;

        /* renamed from: g  reason: collision with root package name */
        public int f6202g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6203h;

        public d() {
            this.f6201f = a.this.f6235h - 1;
        }

        public final boolean equals(Object obj) {
            if (!this.f6203h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i8 = this.f6202g;
                a aVar = a.this;
                Object h8 = aVar.h(i8);
                if (!(key == h8 || (key != null && key.equals(h8)))) {
                    return false;
                }
                Object value = entry.getValue();
                Object l8 = aVar.l(this.f6202g);
                return value == l8 || (value != null && value.equals(l8));
            }
        }

        public final K getKey() {
            if (this.f6203h) {
                return a.this.h(this.f6202g);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f6203h) {
                return a.this.l(this.f6202g);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f6202g < this.f6201f;
        }

        public final int hashCode() {
            if (this.f6203h) {
                int i8 = this.f6202g;
                a aVar = a.this;
                Object h8 = aVar.h(i8);
                Object l8 = aVar.l(this.f6202g);
                int i9 = 0;
                int hashCode = h8 == null ? 0 : h8.hashCode();
                if (l8 != null) {
                    i9 = l8.hashCode();
                }
                return hashCode ^ i9;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f6202g++;
                this.f6203h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f6203h) {
                a.this.j(this.f6202g);
                this.f6202g--;
                this.f6201f--;
                this.f6203h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v8) {
            if (this.f6203h) {
                return a.this.k(this.f6202g, v8);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v8) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            a.this.clear();
        }

        public final boolean contains(Object obj) {
            return a.this.g(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        public final Iterator<V> iterator() {
            return new f();
        }

        public final boolean remove(Object obj) {
            a aVar = a.this;
            int g9 = aVar.g(obj);
            if (g9 < 0) {
                return false;
            }
            aVar.j(g9);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f6235h;
            int i9 = 0;
            boolean z8 = false;
            while (i9 < i8) {
                if (collection.contains(aVar.l(i9))) {
                    aVar.j(i9);
                    i9--;
                    i8--;
                    z8 = true;
                }
                i9++;
            }
            return z8;
        }

        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i8 = aVar.f6235h;
            int i9 = 0;
            boolean z8 = false;
            while (i9 < i8) {
                if (!collection.contains(aVar.l(i9))) {
                    aVar.j(i9);
                    i9--;
                    i8--;
                    z8 = true;
                }
                i9++;
            }
            return z8;
        }

        public final int size() {
            return a.this.f6235h;
        }

        public final Object[] toArray() {
            a aVar = a.this;
            int i8 = aVar.f6235h;
            Object[] objArr = new Object[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                objArr[i9] = aVar.l(i9);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return a.this.n(1, tArr);
        }
    }

    public final class f extends c<V> {
        public f() {
            super(a.this.f6235h);
        }

        public final V a(int i8) {
            return a.this.l(i8);
        }

        public final void b(int i8) {
            a.this.j(i8);
        }
    }

    public a() {
    }

    public a(int i8) {
        super(i8);
    }

    public a(a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.a aVar = this.f6195m;
        if (aVar != null) {
            return aVar;
        }
        a<K, V>.a aVar2 = new C0101a();
        this.f6195m = aVar2;
        return aVar2;
    }

    public final Set<K> keySet() {
        a<K, V>.c cVar = this.f6196n;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f6196n = cVar2;
        return cVar2;
    }

    public final boolean m(Collection<?> collection) {
        int i8 = this.f6235h;
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (!collection.contains(h(i9))) {
                j(i9);
            }
        }
        return i8 != this.f6235h;
    }

    public final Object[] n(int i8, Object[] objArr) {
        int i9 = this.f6235h;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = this.f6234g[(i10 << 1) + i8];
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b(this.f6235h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        a<K, V>.e eVar = this.f6197o;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f6197o = eVar2;
        return eVar2;
    }
}
