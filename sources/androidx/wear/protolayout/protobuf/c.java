package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c<E> extends AbstractList<E> implements x.c<E> {

    /* renamed from: f  reason: collision with root package name */
    public boolean f2061f = true;

    public final void a() {
        this.f2061f = false;
    }

    public boolean add(E e) {
        i();
        return super.add(e);
    }

    public boolean addAll(int i8, Collection<? extends E> collection) {
        i();
        return super.addAll(i8, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        i();
        return super.addAll(collection);
    }

    public void clear() {
        i();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!get(i8).equals(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f2061f;
    }

    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + get(i9).hashCode();
        }
        return i8;
    }

    public final void i() {
        if (!this.f2061f) {
            throw new UnsupportedOperationException();
        }
    }

    public abstract E remove(int i8);

    public final boolean remove(Object obj) {
        i();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        i();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        i();
        return super.retainAll(collection);
    }
}
