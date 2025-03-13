package androidx.wear.protolayout.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class e1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f2074l = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f2075f;

    /* renamed from: g  reason: collision with root package name */
    public List<e1<K, V>.b> f2076g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public Map<K, V> f2077h = Collections.emptyMap();

    /* renamed from: i  reason: collision with root package name */
    public boolean f2078i;

    /* renamed from: j  reason: collision with root package name */
    public volatile e1<K, V>.d f2079j;

    /* renamed from: k  reason: collision with root package name */
    public Map<K, V> f2080k = Collections.emptyMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f2081a = new C0019a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f2082b = new b();

        /* renamed from: androidx.wear.protolayout.protobuf.e1$a$a  reason: collision with other inner class name */
        public static class C0019a implements Iterator<Object> {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            public final Iterator<Object> iterator() {
                return a.f2081a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<e1<K, V>.b> {

        /* renamed from: f  reason: collision with root package name */
        public final K f2083f;

        /* renamed from: g  reason: collision with root package name */
        public V f2084g;

        public b() {
            throw null;
        }

        public b(K k8, V v8) {
            this.f2083f = k8;
            this.f2084g = v8;
        }

        public final int compareTo(Object obj) {
            return this.f2083f.compareTo(((b) obj).f2083f);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k8 = this.f2083f;
            if (k8 == null ? key == null : k8.equals(key)) {
                V v8 = this.f2084g;
                Object value = entry.getValue();
                if (v8 == null ? value == null : v8.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f2083f;
        }

        public final V getValue() {
            return this.f2084g;
        }

        public final int hashCode() {
            int i8 = 0;
            K k8 = this.f2083f;
            int hashCode = k8 == null ? 0 : k8.hashCode();
            V v8 = this.f2084g;
            if (v8 != null) {
                i8 = v8.hashCode();
            }
            return hashCode ^ i8;
        }

        public final V setValue(V v8) {
            int i8 = e1.f2074l;
            e1.this.b();
            V v9 = this.f2084g;
            this.f2084g = v8;
            return v9;
        }

        public final String toString() {
            return this.f2083f + "=" + this.f2084g;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public int f2086f = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2087g;

        /* renamed from: h  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2088h;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f2088h == null) {
                this.f2088h = e1.this.f2077h.entrySet().iterator();
            }
            return this.f2088h;
        }

        public final boolean hasNext() {
            int i8 = this.f2086f + 1;
            e1 e1Var = e1.this;
            if (i8 >= e1Var.f2076g.size()) {
                return !e1Var.f2077h.isEmpty() && a().hasNext();
            }
            return true;
        }

        public final Object next() {
            this.f2087g = true;
            int i8 = this.f2086f + 1;
            this.f2086f = i8;
            e1 e1Var = e1.this;
            return (Map.Entry) (i8 < e1Var.f2076g.size() ? e1Var.f2076g.get(this.f2086f) : a().next());
        }

        public final void remove() {
            if (this.f2087g) {
                this.f2087g = false;
                int i8 = e1.f2074l;
                e1 e1Var = e1.this;
                e1Var.b();
                if (this.f2086f < e1Var.f2076g.size()) {
                    int i9 = this.f2086f;
                    this.f2086f = i9 - 1;
                    e1Var.i(i9);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            Object value = entry.getValue();
            e1.this.put((Comparable) entry.getKey(), value);
            return true;
        }

        public final void clear() {
            e1.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = e1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            e1.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return e1.this.size();
        }
    }

    public e1(int i8) {
        this.f2075f = i8;
    }

    public final int a(K k8) {
        int size = this.f2076g.size() - 1;
        if (size >= 0) {
            int compareTo = k8.compareTo(this.f2076g.get(size).f2083f);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) / 2;
            int compareTo2 = k8.compareTo(this.f2076g.get(i9).f2083f);
            if (compareTo2 < 0) {
                size = i9 - 1;
            } else if (compareTo2 <= 0) {
                return i9;
            } else {
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    public final void b() {
        if (this.f2078i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i8) {
        return this.f2076g.get(i8);
    }

    public final void clear() {
        b();
        if (!this.f2076g.isEmpty()) {
            this.f2076g.clear();
        }
        if (!this.f2077h.isEmpty()) {
            this.f2077h.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2077h.containsKey(comparable);
    }

    public final int d() {
        return this.f2076g.size();
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f2077h.isEmpty() ? a.f2082b : this.f2077h.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2079j == null) {
            this.f2079j = new d();
        }
        return this.f2079j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size != e1Var.size()) {
            return false;
        }
        int d9 = d();
        if (d9 != e1Var.d()) {
            return entrySet().equals(e1Var.entrySet());
        }
        for (int i8 = 0; i8 < d9; i8++) {
            if (!c(i8).equals(e1Var.c(i8))) {
                return false;
            }
        }
        if (d9 != size) {
            return this.f2077h.equals(e1Var.f2077h);
        }
        return true;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f2077h.isEmpty() && !(this.f2077h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2077h = treeMap;
            this.f2080k = treeMap.descendingMap();
        }
        return (SortedMap) this.f2077h;
    }

    public void g() {
        if (!this.f2078i) {
            this.f2077h = this.f2077h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2077h);
            this.f2080k = this.f2080k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2080k);
            this.f2078i = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        return a9 >= 0 ? this.f2076g.get(a9).f2084g : this.f2077h.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k8, V v8) {
        b();
        int a9 = a(k8);
        if (a9 >= 0) {
            return this.f2076g.get(a9).setValue(v8);
        }
        b();
        boolean isEmpty = this.f2076g.isEmpty();
        int i8 = this.f2075f;
        if (isEmpty && !(this.f2076g instanceof ArrayList)) {
            this.f2076g = new ArrayList(i8);
        }
        int i9 = -(a9 + 1);
        if (i9 >= i8) {
            return f().put(k8, v8);
        }
        if (this.f2076g.size() == i8) {
            b remove = this.f2076g.remove(i8 - 1);
            f().put(remove.f2083f, remove.f2084g);
        }
        this.f2076g.add(i9, new b(k8, v8));
        return null;
    }

    public final int hashCode() {
        int d9 = d();
        int i8 = 0;
        for (int i9 = 0; i9 < d9; i9++) {
            i8 += this.f2076g.get(i9).hashCode();
        }
        return this.f2077h.size() > 0 ? i8 + this.f2077h.hashCode() : i8;
    }

    public final V i(int i8) {
        b();
        V v8 = this.f2076g.remove(i8).f2084g;
        if (!this.f2077h.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List<e1<K, V>.b> list = this.f2076g;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v8;
    }

    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        if (a9 >= 0) {
            return i(a9);
        }
        if (this.f2077h.isEmpty()) {
            return null;
        }
        return this.f2077h.remove(comparable);
    }

    public final int size() {
        return this.f2076g.size() + this.f2077h.size();
    }
}
