package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class z extends c<Integer> implements a0.g, RandomAccess, a1 {

    /* renamed from: i  reason: collision with root package name */
    public static final z f3830i;

    /* renamed from: g  reason: collision with root package name */
    public int[] f3831g;

    /* renamed from: h  reason: collision with root package name */
    public int f3832h;

    static {
        z zVar = new z(new int[0], 0);
        f3830i = zVar;
        zVar.f3599f = false;
    }

    public z() {
        this(new int[10], 0);
    }

    public z(int[] iArr, int i8) {
        this.f3831g = iArr;
        this.f3832h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f3832h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3832h);
        }
        int[] iArr = this.f3831g;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
        } else {
            int[] iArr2 = new int[(((i9 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f3831g, i8, iArr2, i8 + 1, this.f3832h - i8);
            this.f3831g = iArr2;
        }
        this.f3831g[i8] = intValue;
        this.f3832h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        i();
        Charset charset = a0.f3589a;
        collection.getClass();
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i8 = zVar.f3832h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f3832h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.f3831g;
            if (i10 > iArr.length) {
                this.f3831g = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(zVar.f3831g, 0, this.f3831g, this.f3832h, zVar.f3832h);
            this.f3832h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3832h) {
            return new z(Arrays.copyOf(this.f3831g, i8), this.f3832h);
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
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f3832h != zVar.f3832h) {
            return false;
        }
        int[] iArr = zVar.f3831g;
        for (int i8 = 0; i8 < this.f3832h; i8++) {
            if (this.f3831g[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        return Integer.valueOf(l(i8));
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f3832h; i9++) {
            i8 = (i8 * 31) + this.f3831g[i9];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f3832h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f3831g[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(int i8) {
        i();
        int i9 = this.f3832h;
        int[] iArr = this.f3831g;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[(((i9 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f3831g = iArr2;
        }
        int[] iArr3 = this.f3831g;
        int i10 = this.f3832h;
        this.f3832h = i10 + 1;
        iArr3[i10] = i8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f3832h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3832h);
        }
    }

    public final int l(int i8) {
        k(i8);
        return this.f3831g[i8];
    }

    public final int m(int i8, int i9) {
        i();
        k(i8);
        int[] iArr = this.f3831g;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        int[] iArr = this.f3831g;
        int i9 = iArr[i8];
        int i10 = this.f3832h;
        if (i8 < i10 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i10 - i8) - 1);
        }
        this.f3832h--;
        this.modCount++;
        return Integer.valueOf(i9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            int[] iArr = this.f3831g;
            System.arraycopy(iArr, i9, iArr, i8, this.f3832h - i9);
            this.f3832h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        return Integer.valueOf(m(i8, ((Integer) obj).intValue()));
    }

    public final int size() {
        return this.f3832h;
    }

    public final boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
