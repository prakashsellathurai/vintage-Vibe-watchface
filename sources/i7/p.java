package i7;

import java.util.Iterator;

public abstract class p implements Iterator<Long> {
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
