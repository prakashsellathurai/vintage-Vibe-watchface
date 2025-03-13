package i7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k3.j;

public final class k implements List, Serializable, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public static final k f4879f = new k();

    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        q7.k.e((Void) obj, "element");
        return false;
    }

    public final boolean containsAll(Collection collection) {
        q7.k.e(collection, "elements");
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final Object get(int i8) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i8 + '.');
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        q7.k.e((Void) obj, "element");
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Iterator iterator() {
        return j.f4878f;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        q7.k.e((Void) obj, "element");
        return -1;
    }

    public final ListIterator listIterator() {
        return j.f4878f;
    }

    public final ListIterator listIterator(int i8) {
        if (i8 == 0) {
            return j.f4878f;
        }
        throw new IndexOutOfBoundsException("Index: " + i8);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final List subList(int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9);
    }

    public final Object[] toArray() {
        return j.f0(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        q7.k.e(tArr, "array");
        return j.g0(this, tArr);
    }

    public final String toString() {
        return "[]";
    }
}
