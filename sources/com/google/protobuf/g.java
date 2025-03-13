package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class g extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* renamed from: i  reason: collision with root package name */
    public static final g f3635i;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f3636g;

    /* renamed from: h  reason: collision with root package name */
    public int f3637h;

    static {
        g gVar = new g(new boolean[0], 0);
        f3635i = gVar;
        gVar.f3599f = false;
    }

    public g() {
        this(new boolean[10], 0);
    }

    public g(boolean[] zArr, int i8) {
        this.f3636g = zArr;
        this.f3637h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f3637h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3637h);
        }
        boolean[] zArr = this.f3636g;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[(((i9 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f3636g, i8, zArr2, i8 + 1, this.f3637h - i8);
            this.f3636g = zArr2;
        }
        this.f3636g[i8] = booleanValue;
        this.f3637h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        i();
        Charset charset = a0.f3589a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i8 = gVar.f3637h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f3637h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            boolean[] zArr = this.f3636g;
            if (i10 > zArr.length) {
                this.f3636g = Arrays.copyOf(zArr, i10);
            }
            System.arraycopy(gVar.f3636g, 0, this.f3636g, this.f3637h, gVar.f3637h);
            this.f3637h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3637h) {
            return new g(Arrays.copyOf(this.f3636g, i8), this.f3637h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f3637h != gVar.f3637h) {
            return false;
        }
        boolean[] zArr = gVar.f3636g;
        for (int i8 = 0; i8 < this.f3637h; i8++) {
            if (this.f3636g[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Boolean.valueOf(this.f3636g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f3637h; i9++) {
            i8 = (i8 * 31) + a0.a(this.f3636g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f3637h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f3636g[i9] == booleanValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(boolean z8) {
        i();
        int i8 = this.f3637h;
        boolean[] zArr = this.f3636g;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i8 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f3636g = zArr2;
        }
        boolean[] zArr3 = this.f3636g;
        int i9 = this.f3637h;
        this.f3637h = i9 + 1;
        zArr3[i9] = z8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f3637h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3637h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        boolean[] zArr = this.f3636g;
        boolean z8 = zArr[i8];
        int i9 = this.f3637h;
        if (i8 < i9 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i9 - i8) - 1);
        }
        this.f3637h--;
        this.modCount++;
        return Boolean.valueOf(z8);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            boolean[] zArr = this.f3636g;
            System.arraycopy(zArr, i9, zArr, i8, this.f3637h - i9);
            this.f3637h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        k(i8);
        boolean[] zArr = this.f3636g;
        boolean z8 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z8);
    }

    public final int size() {
        return this.f3637h;
    }

    public final boolean add(Object obj) {
        j(((Boolean) obj).booleanValue());
        return true;
    }
}
