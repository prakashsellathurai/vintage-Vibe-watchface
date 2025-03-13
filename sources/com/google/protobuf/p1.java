package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class p1 extends AbstractList<String> implements g0, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public final g0 f3734f;

    public class a implements ListIterator<String> {

        /* renamed from: f  reason: collision with root package name */
        public final ListIterator<String> f3735f;

        public a(p1 p1Var, int i8) {
            this.f3735f = p1Var.f3734f.listIterator(i8);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f3735f.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f3735f.hasPrevious();
        }

        public final Object next() {
            return this.f3735f.next();
        }

        public final int nextIndex() {
            return this.f3735f.nextIndex();
        }

        public final Object previous() {
            return this.f3735f.previous();
        }

        public final int previousIndex() {
            return this.f3735f.previousIndex();
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
        public final Iterator<String> f3736f;

        public b(p1 p1Var) {
            this.f3736f = p1Var.f3734f.iterator();
        }

        public final boolean hasNext() {
            return this.f3736f.hasNext();
        }

        public final Object next() {
            return this.f3736f.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p1(g0 g0Var) {
        this.f3734f = g0Var;
    }

    public final g0 c() {
        return this;
    }

    public final Object d(int i8) {
        return this.f3734f.d(i8);
    }

    public final List<?> e() {
        return this.f3734f.e();
    }

    public final Object get(int i8) {
        return (String) this.f3734f.get(i8);
    }

    public final void h(i iVar) {
        throw new UnsupportedOperationException();
    }

    public final Iterator<String> iterator() {
        return new b(this);
    }

    public final ListIterator<String> listIterator(int i8) {
        return new a(this, i8);
    }

    public final int size() {
        return this.f3734f.size();
    }
}
