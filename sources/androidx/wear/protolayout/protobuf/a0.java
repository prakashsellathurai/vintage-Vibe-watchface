package androidx.wear.protolayout.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class a0 extends b0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: f  reason: collision with root package name */
        public final Map.Entry<K, a0> f2057f;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f2057f = entry;
        }

        public final K getKey() {
            return this.f2057f.getKey();
        }

        public final Object getValue() {
            a0 value = this.f2057f.getValue();
            if (value == null) {
                return null;
            }
            return value.a((o0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof o0) {
                a0 value = this.f2057f.getValue();
                o0 o0Var = value.f2059a;
                value.f2060b = null;
                value.f2059a = (o0) obj;
                return o0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f2058f;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f2058f = it;
        }

        public final boolean hasNext() {
            return this.f2058f.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f2058f.next();
            return next.getValue() instanceof a0 ? new a(next) : next;
        }

        public final void remove() {
            this.f2058f.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((o0) null).equals(obj);
    }

    public final int hashCode() {
        return a((o0) null).hashCode();
    }

    public final String toString() {
        return a((o0) null).toString();
    }
}
