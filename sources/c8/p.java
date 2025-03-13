package c8;

import java.util.concurrent.atomic.AtomicReferenceArray;

public final class p<T> {
    private volatile AtomicReferenceArray<T> array;

    public p(int i8) {
        this.array = new AtomicReferenceArray<>(i8);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i8) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i8);
        }
        return null;
    }

    public final void c(int i8, T t8) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i8 < length) {
            atomicReferenceArray.set(i8, t8);
            return;
        }
        int i9 = i8 + 1;
        int i10 = length * 2;
        if (i9 < i10) {
            i9 = i10;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i9);
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i8, t8);
        this.array = atomicReferenceArray2;
    }
}
