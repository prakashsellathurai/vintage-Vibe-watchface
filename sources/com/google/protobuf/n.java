package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class n extends c<Double> implements a0.b, RandomAccess, a1 {

    /* renamed from: i  reason: collision with root package name */
    public static final n f3723i;

    /* renamed from: g  reason: collision with root package name */
    public double[] f3724g;

    /* renamed from: h  reason: collision with root package name */
    public int f3725h;

    static {
        n nVar = new n(new double[0], 0);
        f3723i = nVar;
        nVar.f3599f = false;
    }

    public n() {
        this(new double[10], 0);
    }

    public n(double[] dArr, int i8) {
        this.f3724g = dArr;
        this.f3725h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        double doubleValue = ((Double) obj).doubleValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f3725h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3725h);
        }
        double[] dArr = this.f3724g;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[(((i9 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f3724g, i8, dArr2, i8 + 1, this.f3725h - i8);
            this.f3724g = dArr2;
        }
        this.f3724g[i8] = doubleValue;
        this.f3725h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        i();
        Charset charset = a0.f3589a;
        collection.getClass();
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i8 = nVar.f3725h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f3725h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            double[] dArr = this.f3724g;
            if (i10 > dArr.length) {
                this.f3724g = Arrays.copyOf(dArr, i10);
            }
            System.arraycopy(nVar.f3724g, 0, this.f3724g, this.f3725h, nVar.f3725h);
            this.f3725h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3725h) {
            return new n(Arrays.copyOf(this.f3724g, i8), this.f3725h);
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
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f3725h != nVar.f3725h) {
            return false;
        }
        double[] dArr = nVar.f3724g;
        for (int i8 = 0; i8 < this.f3725h; i8++) {
            if (Double.doubleToLongBits(this.f3724g[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Double.valueOf(this.f3724g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f3725h; i9++) {
            i8 = (i8 * 31) + a0.b(Double.doubleToLongBits(this.f3724g[i9]));
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i8 = this.f3725h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f3724g[i9] == doubleValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(double d9) {
        i();
        int i8 = this.f3725h;
        double[] dArr = this.f3724g;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[(((i8 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f3724g = dArr2;
        }
        double[] dArr3 = this.f3724g;
        int i9 = this.f3725h;
        this.f3725h = i9 + 1;
        dArr3[i9] = d9;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f3725h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3725h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        double[] dArr = this.f3724g;
        double d9 = dArr[i8];
        int i9 = this.f3725h;
        if (i8 < i9 - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (i9 - i8) - 1);
        }
        this.f3725h--;
        this.modCount++;
        return Double.valueOf(d9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            double[] dArr = this.f3724g;
            System.arraycopy(dArr, i9, dArr, i8, this.f3725h - i9);
            this.f3725h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        i();
        k(i8);
        double[] dArr = this.f3724g;
        double d9 = dArr[i8];
        dArr[i8] = doubleValue;
        return Double.valueOf(d9);
    }

    public final int size() {
        return this.f3725h;
    }

    public final boolean add(Object obj) {
        j(((Double) obj).doubleValue());
        return true;
    }
}
