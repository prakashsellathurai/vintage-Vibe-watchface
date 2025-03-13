package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class e extends c<Boolean> implements RandomAccess, x0 {

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f2069g;

    /* renamed from: h  reason: collision with root package name */
    public int f2070h;

    static {
        new e(new boolean[0], 0).f2061f = false;
    }

    public e() {
        this(new boolean[10], 0);
    }

    public e(boolean[] zArr, int i8) {
        this.f2069g = zArr;
        this.f2070h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f2070h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2070h);
        }
        boolean[] zArr = this.f2069g;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[(((i9 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f2069g, i8, zArr2, i8 + 1, this.f2070h - i8);
            this.f2069g = zArr2;
        }
        this.f2069g[i8] = booleanValue;
        this.f2070h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        i();
        Charset charset = x.f2214a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i8 = eVar.f2070h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f2070h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            boolean[] zArr = this.f2069g;
            if (i10 > zArr.length) {
                this.f2069g = Arrays.copyOf(zArr, i10);
            }
            System.arraycopy(eVar.f2069g, 0, this.f2069g, this.f2070h, eVar.f2070h);
            this.f2070h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x.c b(int i8) {
        if (i8 >= this.f2070h) {
            return new e(Arrays.copyOf(this.f2069g, i8), this.f2070h);
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
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.f2070h != eVar.f2070h) {
            return false;
        }
        boolean[] zArr = eVar.f2069g;
        for (int i8 = 0; i8 < this.f2070h; i8++) {
            if (this.f2069g[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Boolean.valueOf(this.f2069g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f2070h; i9++) {
            i8 = (i8 * 31) + x.a(this.f2069g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.f2070h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f2069g[i9] == booleanValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(boolean z8) {
        i();
        int i8 = this.f2070h;
        boolean[] zArr = this.f2069g;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i8 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f2069g = zArr2;
        }
        boolean[] zArr3 = this.f2069g;
        int i9 = this.f2070h;
        this.f2070h = i9 + 1;
        zArr3[i9] = z8;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f2070h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2070h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        boolean[] zArr = this.f2069g;
        boolean z8 = zArr[i8];
        int i9 = this.f2070h;
        if (i8 < i9 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i9 - i8) - 1);
        }
        this.f2070h--;
        this.modCount++;
        return Boolean.valueOf(z8);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            boolean[] zArr = this.f2069g;
            System.arraycopy(zArr, i9, zArr, i8, this.f2070h - i9);
            this.f2070h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        k(i8);
        boolean[] zArr = this.f2069g;
        boolean z8 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z8);
    }

    public final int size() {
        return this.f2070h;
    }

    public final boolean add(Object obj) {
        j(((Boolean) obj).booleanValue());
        return true;
    }
}
