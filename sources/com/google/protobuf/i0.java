package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class i0 extends c<Long> implements a0.i, RandomAccess, a1 {

    /* renamed from: i  reason: collision with root package name */
    public static final i0 f3654i;

    /* renamed from: g  reason: collision with root package name */
    public long[] f3655g;

    /* renamed from: h  reason: collision with root package name */
    public int f3656h;

    static {
        i0 i0Var = new i0(new long[0], 0);
        f3654i = i0Var;
        i0Var.f3599f = false;
    }

    public i0() {
        this(new long[10], 0);
    }

    public i0(long[] jArr, int i8) {
        this.f3655g = jArr;
        this.f3656h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f3656h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3656h);
        }
        long[] jArr = this.f3655g;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[(((i9 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f3655g, i8, jArr2, i8 + 1, this.f3656h - i8);
            this.f3655g = jArr2;
        }
        this.f3655g[i8] = longValue;
        this.f3656h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        i();
        Charset charset = a0.f3589a;
        collection.getClass();
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i8 = i0Var.f3656h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f3656h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.f3655g;
            if (i10 > jArr.length) {
                this.f3655g = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(i0Var.f3655g, 0, this.f3655g, this.f3656h, i0Var.f3656h);
            this.f3656h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3656h) {
            return new i0(Arrays.copyOf(this.f3655g, i8), this.f3656h);
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
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f3656h != i0Var.f3656h) {
            return false;
        }
        long[] jArr = i0Var.f3655g;
        for (int i8 = 0; i8 < this.f3656h; i8++) {
            if (this.f3655g[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Long.valueOf(this.f3655g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f3656h; i9++) {
            i8 = (i8 * 31) + a0.b(this.f3655g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.f3656h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f3655g[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(long j8) {
        i();
        int i8 = this.f3656h;
        long[] jArr = this.f3655g;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[(((i8 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f3655g = jArr2;
        }
        long[] jArr3 = this.f3655g;
        int i9 = this.f3656h;
        this.f3656h = i9 + 1;
        jArr3[i9] = j8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f3656h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3656h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        long[] jArr = this.f3655g;
        long j8 = jArr[i8];
        int i9 = this.f3656h;
        if (i8 < i9 - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (i9 - i8) - 1);
        }
        this.f3656h--;
        this.modCount++;
        return Long.valueOf(j8);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            long[] jArr = this.f3655g;
            System.arraycopy(jArr, i9, jArr, i8, this.f3656h - i9);
            this.f3656h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        k(i8);
        long[] jArr = this.f3655g;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    public final int size() {
        return this.f3656h;
    }

    public final boolean add(Object obj) {
        j(((Long) obj).longValue());
        return true;
    }
}
