package androidx.wear.protolayout.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class k1 extends AbstractList<String> implements d0, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public final d0 f2131f;

    public class a implements ListIterator<String> {

        /* renamed from: f  reason: collision with root package name */
        public final ListIterator<String> f2132f;

        public a(k1 k1Var, int i8) {
            this.f2132f = k1Var.f2131f.listIterator(i8);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f2132f.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f2132f.hasPrevious();
        }

        public final Object next() {
            return this.f2132f.next();
        }

        public final int nextIndex() {
            return this.f2132f.nextIndex();
        }

        public final Object previous() {
            return this.f2132f.previous();
        }

        public final int previousIndex() {
            return this.f2132f.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<String> f2133f;

        public b(k1 k1Var) {
            this.f2133f = k1Var.f2131f.iterator();
        }

        public final boolean hasNext() {
            return this.f2133f.hasNext();
        }

        public final Object next() {
            return this.f2133f.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public k1(d0 d0Var) {
        this.f2131f = d0Var;
    }

    public final d0 c() {
        return this;
    }

    public final Object d(int i8) {
        return this.f2131f.d(i8);
    }

    public final List<?> e() {
        return this.f2131f.e();
    }

    public final void g(g gVar) {
        throw new UnsupportedOperationException();
    }

    public final Object get(int i8) {
        return (String) this.f2131f.get(i8);
    }

    public final Iterator<String> iterator() {
        return new b(this);
    }

    public final ListIterator<String> listIterator(int i8) {
        return new a(this, i8);
    }

    public final int size() {
        return this.f2131f.size();
    }
}
