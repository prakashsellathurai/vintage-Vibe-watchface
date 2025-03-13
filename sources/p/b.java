package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k3.j;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f6207i;

    /* renamed from: j  reason: collision with root package name */
    public static int f6208j;

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f6209k;

    /* renamed from: l  reason: collision with root package name */
    public static int f6210l;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f6211m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final Object f6212n = new Object();

    /* renamed from: f  reason: collision with root package name */
    public int[] f6213f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f6214g;

    /* renamed from: h  reason: collision with root package name */
    public int f6215h;

    public class a extends c<E> {
        public a() {
            super(b.this.f6215h);
        }

        public final E a(int i8) {
            return b.this.f6214g[i8];
        }

        public final void b(int i8) {
            b.this.m(i8);
        }
    }

    public b(int i8) {
        if (i8 == 0) {
            this.f6213f = j.f5147a;
            this.f6214g = j.f5149c;
        } else {
            i(i8);
        }
        this.f6215h = 0;
    }

    public static void j(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (f6212n) {
                if (f6210l < 10) {
                    objArr[0] = f6209k;
                    objArr[1] = iArr;
                    for (int i9 = i8 - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f6209k = objArr;
                    f6210l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f6211m) {
                if (f6208j < 10) {
                    objArr[0] = f6207i;
                    objArr[1] = iArr;
                    for (int i10 = i8 - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f6207i = objArr;
                    f6208j++;
                }
            }
        }
    }

    public final boolean add(E e) {
        int i8;
        int i9;
        int i10 = this.f6215h;
        if (e == null) {
            i9 = l();
            i8 = 0;
        } else {
            int hashCode = e.hashCode();
            i8 = hashCode;
            i9 = k(hashCode, e);
        }
        if (i9 >= 0) {
            return false;
        }
        int i11 = ~i9;
        int[] iArr = this.f6213f;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f6214g;
            i(i12);
            if (i10 == this.f6215h) {
                int[] iArr2 = this.f6213f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f6214g, 0, objArr.length);
                }
                j(iArr, objArr, i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f6213f;
            int i13 = i11 + 1;
            int i14 = i10 - i11;
            System.arraycopy(iArr3, i11, iArr3, i13, i14);
            Object[] objArr2 = this.f6214g;
            System.arraycopy(objArr2, i11, objArr2, i13, i14);
        }
        int i15 = this.f6215h;
        if (i10 == i15) {
            int[] iArr4 = this.f6213f;
            if (i11 < iArr4.length) {
                iArr4[i11] = i8;
                this.f6214g[i11] = e;
                this.f6215h = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f6215h + collection.size();
        int i8 = this.f6215h;
        int[] iArr = this.f6213f;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f6214g;
            i(size);
            int i9 = this.f6215h;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.f6213f, 0, i9);
                System.arraycopy(objArr, 0, this.f6214g, 0, this.f6215h);
            }
            j(iArr, objArr, this.f6215h);
        }
        if (this.f6215h == i8) {
            for (Object add : collection) {
                z8 |= add(add);
            }
            return z8;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i8 = this.f6215h;
        if (i8 != 0) {
            int[] iArr = this.f6213f;
            Object[] objArr = this.f6214g;
            this.f6213f = j.f5147a;
            this.f6214g = j.f5149c;
            this.f6215h = 0;
            j(iArr, objArr, i8);
        }
        if (this.f6215h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return (obj == null ? l() : k(obj.hashCode(), obj)) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f6215h != set.size()) {
                return false;
            }
            int i8 = 0;
            while (i8 < this.f6215h) {
                try {
                    if (!set.contains(this.f6214g[i8])) {
                        return false;
                    }
                    i8++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f6213f;
        int i8 = this.f6215h;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    public final void i(int i8) {
        if (i8 == 8) {
            synchronized (f6212n) {
                Object[] objArr = f6209k;
                if (objArr != null) {
                    try {
                        this.f6214g = objArr;
                        f6209k = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f6213f = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f6210l--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f6209k = null;
                    f6210l = 0;
                }
            }
        } else if (i8 == 4) {
            synchronized (f6211m) {
                Object[] objArr2 = f6207i;
                if (objArr2 != null) {
                    try {
                        this.f6214g = objArr2;
                        f6207i = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f6213f = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f6208j--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f6207i = null;
                    f6208j = 0;
                }
            }
        }
        this.f6213f = new int[i8];
        this.f6214g = new Object[i8];
    }

    public final boolean isEmpty() {
        return this.f6215h <= 0;
    }

    public final Iterator<E> iterator() {
        return new a();
    }

    public final int k(int i8, Object obj) {
        int i9 = this.f6215h;
        if (i9 == 0) {
            return -1;
        }
        try {
            int h8 = j.h(i9, i8, this.f6213f);
            if (h8 < 0 || obj.equals(this.f6214g[h8])) {
                return h8;
            }
            int i10 = h8 + 1;
            while (i10 < i9 && this.f6213f[i10] == i8) {
                if (obj.equals(this.f6214g[i10])) {
                    return i10;
                }
                i10++;
            }
            int i11 = h8 - 1;
            while (i11 >= 0 && this.f6213f[i11] == i8) {
                if (obj.equals(this.f6214g[i11])) {
                    return i11;
                }
                i11--;
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int l() {
        int i8 = this.f6215h;
        if (i8 == 0) {
            return -1;
        }
        try {
            int h8 = j.h(i8, 0, this.f6213f);
            if (h8 < 0 || this.f6214g[h8] == null) {
                return h8;
            }
            int i9 = h8 + 1;
            while (i9 < i8 && this.f6213f[i9] == 0) {
                if (this.f6214g[i9] == null) {
                    return i9;
                }
                i9++;
            }
            int i10 = h8 - 1;
            while (i10 >= 0 && this.f6213f[i10] == 0) {
                if (this.f6214g[i10] == null) {
                    return i10;
                }
                i10--;
            }
            return ~i9;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void m(int i8) {
        int i9 = this.f6215h;
        Object[] objArr = this.f6214g;
        Object obj = objArr[i8];
        if (i9 <= 1) {
            clear();
            return;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f6213f;
        int i11 = 8;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i8 < i10) {
                int i12 = i8 + 1;
                int i13 = i10 - i8;
                System.arraycopy(iArr, i12, iArr, i8, i13);
                Object[] objArr2 = this.f6214g;
                System.arraycopy(objArr2, i12, objArr2, i8, i13);
            }
            this.f6214g[i10] = null;
        } else {
            if (i9 > 8) {
                i11 = i9 + (i9 >> 1);
            }
            i(i11);
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f6213f, 0, i8);
                System.arraycopy(objArr, 0, this.f6214g, 0, i8);
            }
            if (i8 < i10) {
                int i14 = i8 + 1;
                int i15 = i10 - i8;
                System.arraycopy(iArr, i14, this.f6213f, i8, i15);
                System.arraycopy(objArr, i14, this.f6214g, i8, i15);
            }
        }
        if (i9 == this.f6215h) {
            this.f6215h = i10;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean remove(Object obj) {
        int l8 = obj == null ? l() : k(obj.hashCode(), obj);
        if (l8 < 0) {
            return false;
        }
        m(l8);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z8 = false;
        for (Object remove : collection) {
            z8 |= remove(remove);
        }
        return z8;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z8 = false;
        for (int i8 = this.f6215h - 1; i8 >= 0; i8--) {
            if (!collection.contains(this.f6214g[i8])) {
                m(i8);
                z8 = true;
            }
        }
        return z8;
    }

    public final int size() {
        return this.f6215h;
    }

    public final Object[] toArray() {
        int i8 = this.f6215h;
        Object[] objArr = new Object[i8];
        System.arraycopy(this.f6214g, 0, objArr, 0, i8);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f6215h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f6215h);
        }
        System.arraycopy(this.f6214g, 0, tArr, 0, this.f6215h);
        int length = tArr.length;
        int i8 = this.f6215h;
        if (length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6215h * 14);
        sb.append('{');
        for (int i8 = 0; i8 < this.f6215h; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f6214g[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
