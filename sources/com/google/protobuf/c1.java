package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.Arrays;
import java.util.RandomAccess;

public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: i  reason: collision with root package name */
    public static final c1<Object> f3612i;

    /* renamed from: g  reason: collision with root package name */
    public E[] f3613g;

    /* renamed from: h  reason: collision with root package name */
    public int f3614h;

    static {
        c1<Object> c1Var = new c1<>(0, new Object[0]);
        f3612i = c1Var;
        c1Var.f3599f = false;
    }

    public c1(int i8, Object[] objArr) {
        this.f3613g = objArr;
        this.f3614h = i8;
    }

    public final void add(int i8, E e) {
        int i9;
        i();
        if (i8 < 0 || i8 > (i9 = this.f3614h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3614h);
        }
        E[] eArr = this.f3613g;
        if (i9 < eArr.length) {
            System.arraycopy(eArr, i8, eArr, i8 + 1, i9 - i8);
        } else {
            E[] eArr2 = new Object[(((i9 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i8);
            System.arraycopy(this.f3613g, i8, eArr2, i8 + 1, this.f3614h - i8);
            this.f3613g = eArr2;
        }
        this.f3613g[i8] = e;
        this.f3614h++;
        this.modCount++;
    }

    public final boolean add(E e) {
        i();
        int i8 = this.f3614h;
        E[] eArr = this.f3613g;
        if (i8 == eArr.length) {
            this.f3613g = Arrays.copyOf(eArr, ((i8 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3613g;
        int i9 = this.f3614h;
        this.f3614h = i9 + 1;
        eArr2[i9] = e;
        this.modCount++;
        return true;
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3614h) {
            return new c1(this.f3614h, Arrays.copyOf(this.f3613g, i8));
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i8) {
        j(i8);
        return this.f3613g[i8];
    }

    public final void j(int i8) {
        if (i8 < 0 || i8 >= this.f3614h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3614h);
        }
    }

    public final E remove(int i8) {
        i();
        j(i8);
        E[] eArr = this.f3613g;
        E e = eArr[i8];
        int i9 = this.f3614h;
        if (i8 < i9 - 1) {
            System.arraycopy(eArr, i8 + 1, eArr, i8, (i9 - i8) - 1);
        }
        this.f3614h--;
        this.modCount++;
        return e;
    }

    public final E set(int i8, E e) {
        i();
        j(i8);
        E[] eArr = this.f3613g;
        E e4 = eArr[i8];
        eArr[i8] = e;
        this.modCount++;
        return e4;
    }

    public final int size() {
        return this.f3614h;
    }
}
