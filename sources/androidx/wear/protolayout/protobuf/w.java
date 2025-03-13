package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w extends c<Integer> implements RandomAccess, x0 {

    /* renamed from: g  reason: collision with root package name */
    public int[] f2212g;

    /* renamed from: h  reason: collision with root package name */
    public int f2213h;

    static {
        new w(new int[0], 0).f2061f = false;
    }

    public w() {
        this(new int[10], 0);
    }

    public w(int[] iArr, int i8) {
        this.f2212g = iArr;
        this.f2213h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f2213h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2213h);
        }
        int[] iArr = this.f2212g;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
        } else {
            int[] iArr2 = new int[(((i9 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f2212g, i8, iArr2, i8 + 1, this.f2213h - i8);
            this.f2212g = iArr2;
        }
        this.f2212g[i8] = intValue;
        this.f2213h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        i();
        Charset charset = x.f2214a;
        collection.getClass();
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i8 = wVar.f2213h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f2213h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.f2212g;
            if (i10 > iArr.length) {
                this.f2212g = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(wVar.f2212g, 0, this.f2212g, this.f2213h, wVar.f2213h);
            this.f2213h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x.c b(int i8) {
        if (i8 >= this.f2213h) {
            return new w(Arrays.copyOf(this.f2212g, i8), this.f2213h);
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
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f2213h != wVar.f2213h) {
            return false;
        }
        int[] iArr = wVar.f2212g;
        for (int i8 = 0; i8 < this.f2213h; i8++) {
            if (this.f2212g[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Integer.valueOf(this.f2212g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f2213h; i9++) {
            i8 = (i8 * 31) + this.f2212g[i9];
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f2213h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f2212g[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(int i8) {
        i();
        int i9 = this.f2213h;
        int[] iArr = this.f2212g;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[(((i9 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f2212g = iArr2;
        }
        int[] iArr3 = this.f2212g;
        int i10 = this.f2213h;
        this.f2213h = i10 + 1;
        iArr3[i10] = i8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f2213h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2213h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        int[] iArr = this.f2212g;
        int i9 = iArr[i8];
        int i10 = this.f2213h;
        if (i8 < i10 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i10 - i8) - 1);
        }
        this.f2213h--;
        this.modCount++;
        return Integer.valueOf(i9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            int[] iArr = this.f2212g;
            System.arraycopy(iArr, i9, iArr, i8, this.f2213h - i9);
            this.f2213h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        k(i8);
        int[] iArr = this.f2212g;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    public final int size() {
        return this.f2213h;
    }

    public final boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
