package com.google.protobuf;

import com.google.protobuf.a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w extends c<Float> implements a0.f, RandomAccess, a1 {

    /* renamed from: i  reason: collision with root package name */
    public static final w f3806i;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3807g;

    /* renamed from: h  reason: collision with root package name */
    public int f3808h;

    static {
        w wVar = new w(0, new float[0]);
        f3806i = wVar;
        wVar.f3599f = false;
    }

    public w() {
        this(0, new float[10]);
    }

    public w(int i8, float[] fArr) {
        this.f3807g = fArr;
        this.f3808h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f3808h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3808h);
        }
        float[] fArr = this.f3807g;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[(((i9 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f3807g, i8, fArr2, i8 + 1, this.f3808h - i8);
            this.f3807g = fArr2;
        }
        this.f3807g[i8] = floatValue;
        this.f3808h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        i();
        Charset charset = a0.f3589a;
        collection.getClass();
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i8 = wVar.f3808h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f3808h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            float[] fArr = this.f3807g;
            if (i10 > fArr.length) {
                this.f3807g = Arrays.copyOf(fArr, i10);
            }
            System.arraycopy(wVar.f3807g, 0, this.f3807g, this.f3808h, wVar.f3808h);
            this.f3808h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final a0.j b(int i8) {
        if (i8 >= this.f3808h) {
            return new w(this.f3808h, Arrays.copyOf(this.f3807g, i8));
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
        if (this.f3808h != wVar.f3808h) {
            return false;
        }
        float[] fArr = wVar.f3807g;
        for (int i8 = 0; i8 < this.f3808h; i8++) {
            if (Float.floatToIntBits(this.f3807g[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Float.valueOf(this.f3807g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f3808h; i9++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.f3807g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.f3808h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f3807g[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(float f9) {
        i();
        int i8 = this.f3808h;
        float[] fArr = this.f3807g;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[(((i8 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f3807g = fArr2;
        }
        float[] fArr3 = this.f3807g;
        int i9 = this.f3808h;
        this.f3808h = i9 + 1;
        fArr3[i9] = f9;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f3808h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f3808h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        float[] fArr = this.f3807g;
        float f9 = fArr[i8];
        int i9 = this.f3808h;
        if (i8 < i9 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i9 - i8) - 1);
        }
        this.f3808h--;
        this.modCount++;
        return Float.valueOf(f9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            float[] fArr = this.f3807g;
            System.arraycopy(fArr, i9, fArr, i8, this.f3808h - i9);
            this.f3808h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        i();
        k(i8);
        float[] fArr = this.f3807g;
        float f9 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f9);
    }

    public final int size() {
        return this.f3808h;
    }

    public final boolean add(Object obj) {
        j(((Float) obj).floatValue());
        return true;
    }
}
