package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f0 extends c<Long> implements RandomAccess, x0 {

    /* renamed from: g  reason: collision with root package name */
    public long[] f2094g;

    /* renamed from: h  reason: collision with root package name */
    public int f2095h;

    static {
        new f0(new long[0], 0).f2061f = false;
    }

    public f0() {
        this(new long[10], 0);
    }

    public f0(long[] jArr, int i8) {
        this.f2094g = jArr;
        this.f2095h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f2095h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2095h);
        }
        long[] jArr = this.f2094g;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[(((i9 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f2094g, i8, jArr2, i8 + 1, this.f2095h - i8);
            this.f2094g = jArr2;
        }
        this.f2094g[i8] = longValue;
        this.f2095h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        i();
        Charset charset = x.f2214a;
        collection.getClass();
        if (!(collection instanceof f0)) {
            return super.addAll(collection);
        }
        f0 f0Var = (f0) collection;
        int i8 = f0Var.f2095h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f2095h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.f2094g;
            if (i10 > jArr.length) {
                this.f2094g = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(f0Var.f2094g, 0, this.f2094g, this.f2095h, f0Var.f2095h);
            this.f2095h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x.c b(int i8) {
        if (i8 >= this.f2095h) {
            return new f0(Arrays.copyOf(this.f2094g, i8), this.f2095h);
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
        if (!(obj instanceof f0)) {
            return super.equals(obj);
        }
        f0 f0Var = (f0) obj;
        if (this.f2095h != f0Var.f2095h) {
            return false;
        }
        long[] jArr = f0Var.f2094g;
        for (int i8 = 0; i8 < this.f2095h; i8++) {
            if (this.f2094g[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Long.valueOf(this.f2094g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f2095h; i9++) {
            i8 = (i8 * 31) + x.b(this.f2094g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.f2095h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f2094g[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(long j8) {
        i();
        int i8 = this.f2095h;
        long[] jArr = this.f2094g;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[(((i8 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f2094g = jArr2;
        }
        long[] jArr3 = this.f2094g;
        int i9 = this.f2095h;
        this.f2095h = i9 + 1;
        jArr3[i9] = j8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f2095h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2095h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        long[] jArr = this.f2094g;
        long j8 = jArr[i8];
        int i9 = this.f2095h;
        if (i8 < i9 - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (i9 - i8) - 1);
        }
        this.f2095h--;
        this.modCount++;
        return Long.valueOf(j8);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            long[] jArr = this.f2094g;
            System.arraycopy(jArr, i9, jArr, i8, this.f2095h - i9);
            this.f2095h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        k(i8);
        long[] jArr = this.f2094g;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    public final int size() {
        return this.f2095h;
    }

    public final boolean add(Object obj) {
        j(((Long) obj).longValue());
        return true;
    }
}
