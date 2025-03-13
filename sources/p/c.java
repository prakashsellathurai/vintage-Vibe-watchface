package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c<T> implements Iterator<T> {

    /* renamed from: f  reason: collision with root package name */
    public int f6217f;

    /* renamed from: g  reason: collision with root package name */
    public int f6218g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6219h;

    public c(int i8) {
        this.f6217f = i8;
    }

    public abstract T a(int i8);

    public abstract void b(int i8);

    public final boolean hasNext() {
        return this.f6218g < this.f6217f;
    }

    public final T next() {
        if (hasNext()) {
            T a9 = a(this.f6218g);
            this.f6218g++;
            this.f6219h = true;
            return a9;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f6219h) {
            int i8 = this.f6218g - 1;
            this.f6218g = i8;
            b(i8);
            this.f6217f--;
            this.f6219h = false;
            return;
        }
        throw new IllegalStateException();
    }
}
