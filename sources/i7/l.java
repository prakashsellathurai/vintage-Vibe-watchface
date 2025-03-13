package i7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import q7.k;

public final class l implements Map, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final l f4880f = new l();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        k.e((Void) obj, "value");
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m.f4881f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return m.f4881f;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return k.f4879f;
    }
}
