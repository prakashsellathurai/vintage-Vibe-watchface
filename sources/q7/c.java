package q7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c<T> implements Iterator<T> {

    /* renamed from: f  reason: collision with root package name */
    public final T[] f6626f;

    /* renamed from: g  reason: collision with root package name */
    public int f6627g;

    public c(T[] tArr) {
        this.f6626f = tArr;
    }

    public final boolean hasNext() {
        return this.f6627g < this.f6626f.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f6626f;
            int i8 = this.f6627g;
            this.f6627g = i8 + 1;
            return tArr[i8];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6627g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
