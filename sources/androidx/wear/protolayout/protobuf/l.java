package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class l extends c<Double> implements RandomAccess, x0 {

    /* renamed from: g  reason: collision with root package name */
    public double[] f2134g;

    /* renamed from: h  reason: collision with root package name */
    public int f2135h;

    static {
        new l(new double[0], 0).f2061f = false;
    }

    public l() {
        this(new double[10], 0);
    }

    public l(double[] dArr, int i8) {
        this.f2134g = dArr;
        this.f2135h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        double doubleValue = ((Double) obj).doubleValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f2135h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2135h);
        }
        double[] dArr = this.f2134g;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[(((i9 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f2134g, i8, dArr2, i8 + 1, this.f2135h - i8);
            this.f2134g = dArr2;
        }
        this.f2134g[i8] = doubleValue;
        this.f2135h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        i();
        Charset charset = x.f2214a;
        collection.getClass();
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i8 = lVar.f2135h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f2135h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            double[] dArr = this.f2134g;
            if (i10 > dArr.length) {
                this.f2134g = Arrays.copyOf(dArr, i10);
            }
            System.arraycopy(lVar.f2134g, 0, this.f2134g, this.f2135h, lVar.f2135h);
            this.f2135h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x.c b(int i8) {
        if (i8 >= this.f2135h) {
            return new l(Arrays.copyOf(this.f2134g, i8), this.f2135h);
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
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f2135h != lVar.f2135h) {
            return false;
        }
        double[] dArr = lVar.f2134g;
        for (int i8 = 0; i8 < this.f2135h; i8++) {
            if (Double.doubleToLongBits(this.f2134g[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Double.valueOf(this.f2134g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f2135h; i9++) {
            i8 = (i8 * 31) + x.b(Double.doubleToLongBits(this.f2134g[i9]));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i8 = this.f2135h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f2134g[i9] == doubleValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(double d9) {
        i();
        int i8 = this.f2135h;
        double[] dArr = this.f2134g;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[(((i8 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f2134g = dArr2;
        }
        double[] dArr3 = this.f2134g;
        int i9 = this.f2135h;
        this.f2135h = i9 + 1;
        dArr3[i9] = d9;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f2135h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2135h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        double[] dArr = this.f2134g;
        double d9 = dArr[i8];
        int i9 = this.f2135h;
        if (i8 < i9 - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (i9 - i8) - 1);
        }
        this.f2135h--;
        this.modCount++;
        return Double.valueOf(d9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            double[] dArr = this.f2134g;
            System.arraycopy(dArr, i9, dArr, i8, this.f2135h - i9);
            this.f2135h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        i();
        k(i8);
        double[] dArr = this.f2134g;
        double d9 = dArr[i8];
        dArr[i8] = doubleValue;
        return Double.valueOf(d9);
    }

    public final int size() {
        return this.f2135h;
    }

    public final boolean add(Object obj) {
        j(((Double) obj).doubleValue());
        return true;
    }
}
