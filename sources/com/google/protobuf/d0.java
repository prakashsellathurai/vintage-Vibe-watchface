package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class d0 extends e0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: f  reason: collision with root package name */
        public final Map.Entry<K, d0> f3617f;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f3617f = entry;
        }

        public final K getKey() {
            return this.f3617f.getKey();
        }

        public final Object getValue() {
            d0 value = this.f3617f.getValue();
            if (value == null) {
                return null;
            }
            return value.a((r0) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof r0) {
                d0 value = this.f3617f.getValue();
                r0 r0Var = value.f3627a;
                value.f3628b = null;
                value.f3627a = (r0) obj;
                return r0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f3618f;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f3618f = it;
        }

        public final boolean hasNext() {
            return this.f3618f.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f3618f.next();
            return next.getValue() instanceof d0 ? new a(next) : next;
        }

        public final void remove() {
            this.f3618f.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((r0) null).equals(obj);
    }

    public final int hashCode() {
        return a((r0) null).hashCode();
    }

    public final String toString() {
        return a((r0) null).toString();
    }
}
