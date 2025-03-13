package c8;

import c8.v;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q7.k;
import y7.r0;

public class u<T extends v & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2878b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    public T[] f2879a;

    public final void a(r0.c cVar) {
        cVar.e((r0.d) this);
        T[] tArr = this.f2879a;
        if (tArr == null) {
            tArr = new v[4];
            this.f2879a = tArr;
        } else if (b() >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, b() * 2);
            k.d(copyOf, "copyOf(this, newSize)");
            tArr = (v[]) copyOf;
            this.f2879a = tArr;
        }
        int b9 = b();
        f2878b.set(this, b9 + 1);
        tArr[b9] = cVar;
        cVar.f8608g = b9;
        d(b9);
    }

    public final int b() {
        return f2878b.get(this);
    }

    public final T c(int i8) {
        T[] tArr = this.f2879a;
        k.b(tArr);
        f2878b.set(this, b() - 1);
        if (i8 < b()) {
            e(i8, b());
            int i9 = (i8 - 1) / 2;
            if (i8 > 0) {
                T t8 = tArr[i8];
                k.b(t8);
                T t9 = tArr[i9];
                k.b(t9);
                if (((Comparable) t8).compareTo(t9) < 0) {
                    e(i8, i9);
                    d(i9);
                }
            }
            while (true) {
                int i10 = (i8 * 2) + 1;
                if (i10 >= b()) {
                    break;
                }
                T[] tArr2 = this.f2879a;
                k.b(tArr2);
                int i11 = i10 + 1;
                if (i11 < b()) {
                    T t10 = tArr2[i11];
                    k.b(t10);
                    T t11 = tArr2[i10];
                    k.b(t11);
                    if (((Comparable) t10).compareTo(t11) < 0) {
                        i10 = i11;
                    }
                }
                T t12 = tArr2[i8];
                k.b(t12);
                T t13 = tArr2[i10];
                k.b(t13);
                if (((Comparable) t12).compareTo(t13) <= 0) {
                    break;
                }
                e(i8, i10);
                i8 = i10;
            }
        }
        T t14 = tArr[b()];
        k.b(t14);
        t14.e((r0.d) null);
        t14.setIndex(-1);
        tArr[b()] = null;
        return t14;
    }

    public final void d(int i8) {
        while (i8 > 0) {
            T[] tArr = this.f2879a;
            k.b(tArr);
            int i9 = (i8 - 1) / 2;
            T t8 = tArr[i9];
            k.b(t8);
            T t9 = tArr[i8];
            k.b(t9);
            if (((Comparable) t8).compareTo(t9) > 0) {
                e(i8, i9);
                i8 = i9;
            } else {
                return;
            }
        }
    }

    public final void e(int i8, int i9) {
        T[] tArr = this.f2879a;
        k.b(tArr);
        T t8 = tArr[i9];
        k.b(t8);
        T t9 = tArr[i8];
        k.b(t9);
        tArr[i8] = t8;
        tArr[i9] = t9;
        t8.setIndex(i8);
        t9.setIndex(i9);
    }
}
