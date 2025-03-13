package com.google.protobuf;

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

public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f3657l = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f3658f;

    /* renamed from: g  reason: collision with root package name */
    public List<i1<K, V>.b> f3659g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public Map<K, V> f3660h = Collections.emptyMap();

    /* renamed from: i  reason: collision with root package name */
    public boolean f3661i;

    /* renamed from: j  reason: collision with root package name */
    public volatile i1<K, V>.d f3662j;

    /* renamed from: k  reason: collision with root package name */
    public Map<K, V> f3663k = Collections.emptyMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f3664a = new C0044a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f3665b = new b();

        /* renamed from: com.google.protobuf.i1$a$a  reason: collision with other inner class name */
        public static class C0044a implements Iterator<Object> {
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
                return a.f3664a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<i1<K, V>.b> {

        /* renamed from: f  reason: collision with root package name */
        public final K f3666f;

        /* renamed from: g  reason: collision with root package name */
        public V f3667g;

        public b() {
            throw null;
        }

        public b(K k8, V v8) {
            this.f3666f = k8;
            this.f3667g = v8;
        }

        public final int compareTo(Object obj) {
            return this.f3666f.compareTo(((b) obj).f3666f);
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
            K k8 = this.f3666f;
            if (k8 == null ? key == null : k8.equals(key)) {
                V v8 = this.f3667g;
                Object value = entry.getValue();
                if (v8 == null ? value == null : v8.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f3666f;
        }

        public final V getValue() {
            return this.f3667g;
        }

        public final int hashCode() {
            int i8 = 0;
            K k8 = this.f3666f;
            int hashCode = k8 == null ? 0 : k8.hashCode();
            V v8 = this.f3667g;
            if (v8 != null) {
                i8 = v8.hashCode();
            }
            return hashCode ^ i8;
        }

        public final V setValue(V v8) {
            int i8 = i1.f3657l;
            i1.this.b();
            V v9 = this.f3667g;
            this.f3667g = v8;
            return v9;
        }

        public final String toString() {
            return this.f3666f + "=" + this.f3667g;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public int f3669f = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3670g;

        /* renamed from: h  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f3671h;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f3671h == null) {
                this.f3671h = i1.this.f3660h.entrySet().iterator();
            }
            return this.f3671h;
        }

        public final boolean hasNext() {
            int i8 = this.f3669f + 1;
            i1 i1Var = i1.this;
            if (i8 >= i1Var.f3659g.size()) {
                return !i1Var.f3660h.isEmpty() && a().hasNext();
            }
            return true;
        }

        public final Object next() {
            this.f3670g = true;
            int i8 = this.f3669f + 1;
            this.f3669f = i8;
            i1 i1Var = i1.this;
            return (Map.Entry) (i8 < i1Var.f3659g.size() ? i1Var.f3659g.get(this.f3669f) : a().next());
        }

        public final void remove() {
            if (this.f3670g) {
                this.f3670g = false;
                int i8 = i1.f3657l;
                i1 i1Var = i1.this;
                i1Var.b();
                if (this.f3669f < i1Var.f3659g.size()) {
                    int i9 = this.f3669f;
                    this.f3669f = i9 - 1;
                    i1Var.i(i9);
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
            i1.this.put((Comparable) entry.getKey(), value);
            return true;
        }

        public final void clear() {
            i1.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
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
            i1.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return i1.this.size();
        }
    }

    public i1(int i8) {
        this.f3658f = i8;
    }

    public final int a(K k8) {
        int size = this.f3659g.size() - 1;
        if (size >= 0) {
            int compareTo = k8.compareTo(this.f3659g.get(size).f3666f);
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
            int compareTo2 = k8.compareTo(this.f3659g.get(i9).f3666f);
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
        if (this.f3661i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i8) {
        return this.f3659g.get(i8);
    }

    public final void clear() {
        b();
        if (!this.f3659g.isEmpty()) {
            this.f3659g.clear();
        }
        if (!this.f3660h.isEmpty()) {
            this.f3660h.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f3660h.containsKey(comparable);
    }

    public final int d() {
        return this.f3659g.size();
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f3660h.isEmpty() ? a.f3665b : this.f3660h.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3662j == null) {
            this.f3662j = new d();
        }
        return this.f3662j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int d9 = d();
        if (d9 != i1Var.d()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i8 = 0; i8 < d9; i8++) {
            if (!c(i8).equals(i1Var.c(i8))) {
                return false;
            }
        }
        if (d9 != size) {
            return this.f3660h.equals(i1Var.f3660h);
        }
        return true;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f3660h.isEmpty() && !(this.f3660h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3660h = treeMap;
            this.f3663k = treeMap.descendingMap();
        }
        return (SortedMap) this.f3660h;
    }

    public void g() {
        if (!this.f3661i) {
            this.f3660h = this.f3660h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3660h);
            this.f3663k = this.f3663k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3663k);
            this.f3661i = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        return a9 >= 0 ? this.f3659g.get(a9).f3667g : this.f3660h.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k8, V v8) {
        b();
        int a9 = a(k8);
        if (a9 >= 0) {
            return this.f3659g.get(a9).setValue(v8);
        }
        b();
        boolean isEmpty = this.f3659g.isEmpty();
        int i8 = this.f3658f;
        if (isEmpty && !(this.f3659g instanceof ArrayList)) {
            this.f3659g = new ArrayList(i8);
        }
        int i9 = -(a9 + 1);
        if (i9 >= i8) {
            return f().put(k8, v8);
        }
        if (this.f3659g.size() == i8) {
            b remove = this.f3659g.remove(i8 - 1);
            f().put(remove.f3666f, remove.f3667g);
        }
        this.f3659g.add(i9, new b(k8, v8));
        return null;
    }

    public final int hashCode() {
        int d9 = d();
        int i8 = 0;
        for (int i9 = 0; i9 < d9; i9++) {
            i8 += this.f3659g.get(i9).hashCode();
        }
        return this.f3660h.size() > 0 ? i8 + this.f3660h.hashCode() : i8;
    }

    public final V i(int i8) {
        b();
        V v8 = this.f3659g.remove(i8).f3667g;
        if (!this.f3660h.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List<i1<K, V>.b> list = this.f3659g;
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
        if (this.f3660h.isEmpty()) {
            return null;
        }
        return this.f3660h.remove(comparable);
    }

    public final int size() {
        return this.f3659g.size() + this.f3660h.size();
    }
}
