package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class t extends c<Float> implements RandomAccess, x0 {

    /* renamed from: g  reason: collision with root package name */
    public float[] f2198g;

    /* renamed from: h  reason: collision with root package name */
    public int f2199h;

    static {
        new t(0, new float[0]).f2061f = false;
    }

    public t() {
        this(0, new float[10]);
    }

    public t(int i8, float[] fArr) {
        this.f2198g = fArr;
        this.f2199h = i8;
    }

    public final void add(int i8, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        i();
        if (i8 < 0 || i8 > (i9 = this.f2199h)) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2199h);
        }
        float[] fArr = this.f2198g;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[(((i9 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f2198g, i8, fArr2, i8 + 1, this.f2199h - i8);
            this.f2198g = fArr2;
        }
        this.f2198g[i8] = floatValue;
        this.f2199h++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        i();
        Charset charset = x.f2214a;
        collection.getClass();
        if (!(collection instanceof t)) {
            return super.addAll(collection);
        }
        t tVar = (t) collection;
        int i8 = tVar.f2199h;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f2199h;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            float[] fArr = this.f2198g;
            if (i10 > fArr.length) {
                this.f2198g = Arrays.copyOf(fArr, i10);
            }
            System.arraycopy(tVar.f2198g, 0, this.f2198g, this.f2199h, tVar.f2199h);
            this.f2199h = i10;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x.c b(int i8) {
        if (i8 >= this.f2199h) {
            return new t(this.f2199h, Arrays.copyOf(this.f2198g, i8));
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
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        if (this.f2199h != tVar.f2199h) {
            return false;
        }
        float[] fArr = tVar.f2198g;
        for (int i8 = 0; i8 < this.f2199h; i8++) {
            if (Float.floatToIntBits(this.f2198g[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i8) {
        k(i8);
        return Float.valueOf(this.f2198g[i8]);
    }

    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f2199h; i9++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.f2198g[i9]);
        }
        return i8;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.f2199h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f2198g[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    public final void j(float f9) {
        i();
        int i8 = this.f2199h;
        float[] fArr = this.f2198g;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[(((i8 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f2198g = fArr2;
        }
        float[] fArr3 = this.f2198g;
        int i9 = this.f2199h;
        this.f2199h = i9 + 1;
        fArr3[i9] = f9;
    }

    public final void k(int i8) {
        if (i8 < 0 || i8 >= this.f2199h) {
            throw new IndexOutOfBoundsException("Index:" + i8 + ", Size:" + this.f2199h);
        }
    }

    public final Object remove(int i8) {
        i();
        k(i8);
        float[] fArr = this.f2198g;
        float f9 = fArr[i8];
        int i9 = this.f2199h;
        if (i8 < i9 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i9 - i8) - 1);
        }
        this.f2199h--;
        this.modCount++;
        return Float.valueOf(f9);
    }

    public final void removeRange(int i8, int i9) {
        i();
        if (i9 >= i8) {
            float[] fArr = this.f2198g;
            System.arraycopy(fArr, i9, fArr, i8, this.f2199h - i9);
            this.f2199h -= i9 - i8;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        i();
        k(i8);
        float[] fArr = this.f2198g;
        float f9 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f9);
    }

    public final int size() {
        return this.f2199h;
    }

    public final boolean add(Object obj) {
        j(((Float) obj).floatValue());
        return true;
    }
}
