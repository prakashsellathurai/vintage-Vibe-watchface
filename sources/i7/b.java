package i7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import k3.j;
import q7.c;
import q7.k;

public final class b<T> implements Collection<T> {

    /* renamed from: f  reason: collision with root package name */
    public final T[] f4870f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4871g = false;

    public b(Object[] objArr) {
        this.f4870f = objArr;
    }

    public final boolean add(T t8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i8;
        T[] tArr = this.f4870f;
        k.e(tArr, "<this>");
        if (obj != null) {
            int length = tArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if (k.a(obj, tArr[i9])) {
                    i8 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        } else {
            int length2 = tArr.length;
            i8 = 0;
            while (true) {
                if (i8 >= length2) {
                    break;
                } else if (tArr[i8] == null) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        i8 = -1;
        return i8 >= 0;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        k.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f4870f.length == 0;
    }

    public final Iterator<T> iterator() {
        T[] tArr = this.f4870f;
        k.e(tArr, "array");
        return new c(tArr);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f4870f.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f4870f;
        k.e(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (this.f4871g && k.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        k.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        return j.g0(this, tArr);
    }
}
