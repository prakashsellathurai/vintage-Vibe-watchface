package i7;

import java.util.Iterator;

public abstract class n implements Iterator<Float> {
    public abstract float a();

    public final /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
