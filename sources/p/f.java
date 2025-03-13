package p;

import java.util.ConcurrentModificationException;
import java.util.Map;
import k3.j;

public class f<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f6229i;

    /* renamed from: j  reason: collision with root package name */
    public static int f6230j;

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f6231k;

    /* renamed from: l  reason: collision with root package name */
    public static int f6232l;

    /* renamed from: f  reason: collision with root package name */
    public int[] f6233f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f6234g;

    /* renamed from: h  reason: collision with root package name */
    public int f6235h;

    public f() {
        this.f6233f = j.f5147a;
        this.f6234g = j.f5149c;
        this.f6235h = 0;
    }

    public f(int i8) {
        if (i8 == 0) {
            this.f6233f = j.f5147a;
            this.f6234g = j.f5149c;
        } else {
            a(i8);
        }
        this.f6235h = 0;
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (f.class) {
                Object[] objArr = f6231k;
                if (objArr != null) {
                    this.f6234g = objArr;
                    f6231k = (Object[]) objArr[0];
                    this.f6233f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f6232l--;
                    return;
                }
            }
        } else if (i8 == 4) {
            synchronized (f.class) {
                Object[] objArr2 = f6229i;
                if (objArr2 != null) {
                    this.f6234g = objArr2;
                    f6229i = (Object[]) objArr2[0];
                    this.f6233f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f6230j--;
                    return;
                }
            }
        }
        this.f6233f = new int[i8];
        this.f6234g = new Object[(i8 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (f.class) {
                if (f6232l < 10) {
                    objArr[0] = f6231k;
                    objArr[1] = iArr;
                    for (int i9 = (i8 << 1) - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f6231k = objArr;
                    f6232l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f.class) {
                if (f6230j < 10) {
                    objArr[0] = f6229i;
                    objArr[1] = iArr;
                    for (int i10 = (i8 << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f6229i = objArr;
                    f6230j++;
                }
            }
        }
    }

    public final void b(int i8) {
        int i9 = this.f6235h;
        int[] iArr = this.f6233f;
        if (iArr.length < i8) {
            Object[] objArr = this.f6234g;
            a(i8);
            if (this.f6235h > 0) {
                System.arraycopy(iArr, 0, this.f6233f, 0, i9);
                System.arraycopy(objArr, 0, this.f6234g, 0, i9 << 1);
            }
            c(iArr, objArr, i9);
        }
        if (this.f6235h != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i8 = this.f6235h;
        if (i8 > 0) {
            int[] iArr = this.f6233f;
            Object[] objArr = this.f6234g;
            this.f6233f = j.f5147a;
            this.f6234g = j.f5149c;
            this.f6235h = 0;
            c(iArr, objArr, i8);
        }
        if (this.f6235h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i8, Object obj) {
        int i9 = this.f6235h;
        if (i9 == 0) {
            return -1;
        }
        try {
            int h8 = j.h(i9, i8, this.f6233f);
            if (h8 < 0 || obj.equals(this.f6234g[h8 << 1])) {
                return h8;
            }
            int i10 = h8 + 1;
            while (i10 < i9 && this.f6233f[i10] == i8) {
                if (obj.equals(this.f6234g[i10 << 1])) {
                    return i10;
                }
                i10++;
            }
            int i11 = h8 - 1;
            while (i11 >= 0 && this.f6233f[i11] == i8) {
                if (obj.equals(this.f6234g[i11 << 1])) {
                    return i11;
                }
                i11--;
            }
            return ~i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f6235h != fVar.f6235h) {
                    return false;
                }
                for (int i8 = 0; i8 < this.f6235h; i8++) {
                    Object h8 = h(i8);
                    Object l8 = l(i8);
                    Object orDefault = fVar.getOrDefault(h8, (Object) null);
                    if (l8 == null) {
                        if (orDefault != null || !fVar.containsKey(h8)) {
                            return false;
                        }
                    } else if (!l8.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f6235h != map.size()) {
                    return false;
                }
                for (int i9 = 0; i9 < this.f6235h; i9++) {
                    Object h9 = h(i9);
                    Object l9 = l(i9);
                    Object obj2 = map.get(h9);
                    if (l9 == null) {
                        if (obj2 != null || !map.containsKey(h9)) {
                            return false;
                        }
                    } else if (!l9.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    public final int f() {
        int i8 = this.f6235h;
        if (i8 == 0) {
            return -1;
        }
        try {
            int h8 = j.h(i8, 0, this.f6233f);
            if (h8 < 0 || this.f6234g[h8 << 1] == null) {
                return h8;
            }
            int i9 = h8 + 1;
            while (i9 < i8 && this.f6233f[i9] == 0) {
                if (this.f6234g[i9 << 1] == null) {
                    return i9;
                }
                i9++;
            }
            int i10 = h8 - 1;
            while (i10 >= 0 && this.f6233f[i10] == 0) {
                if (this.f6234g[i10 << 1] == null) {
                    return i10;
                }
                i10--;
            }
            return ~i9;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i8 = this.f6235h * 2;
        Object[] objArr = this.f6234g;
        if (obj == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (obj.equals(objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v8) {
        int e = e(obj);
        return e >= 0 ? this.f6234g[(e << 1) + 1] : v8;
    }

    public final K h(int i8) {
        return this.f6234g[i8 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f6233f;
        Object[] objArr = this.f6234g;
        int i8 = this.f6235h;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            i11 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public void i(a aVar) {
        int i8 = aVar.f6235h;
        b(this.f6235h + i8);
        if (this.f6235h != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(aVar.h(i9), aVar.l(i9));
            }
        } else if (i8 > 0) {
            System.arraycopy(aVar.f6233f, 0, this.f6233f, 0, i8);
            System.arraycopy(aVar.f6234g, 0, this.f6234g, 0, i8 << 1);
            this.f6235h = i8;
        }
    }

    public final boolean isEmpty() {
        return this.f6235h <= 0;
    }

    public V j(int i8) {
        V[] vArr = this.f6234g;
        int i9 = i8 << 1;
        V v8 = vArr[i9 + 1];
        int i10 = this.f6235h;
        if (i10 <= 1) {
            clear();
        } else {
            int i11 = i10 - 1;
            int[] iArr = this.f6233f;
            int i12 = 8;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                if (i8 < i11) {
                    int i13 = i8 + 1;
                    int i14 = i11 - i8;
                    System.arraycopy(iArr, i13, iArr, i8, i14);
                    Object[] objArr = this.f6234g;
                    System.arraycopy(objArr, i13 << 1, objArr, i9, i14 << 1);
                }
                Object[] objArr2 = this.f6234g;
                int i15 = i11 << 1;
                objArr2[i15] = null;
                objArr2[i15 + 1] = null;
            } else {
                if (i10 > 8) {
                    i12 = i10 + (i10 >> 1);
                }
                a(i12);
                if (i10 == this.f6235h) {
                    if (i8 > 0) {
                        System.arraycopy(iArr, 0, this.f6233f, 0, i8);
                        System.arraycopy(vArr, 0, this.f6234g, 0, i9);
                    }
                    if (i8 < i11) {
                        int i16 = i8 + 1;
                        int i17 = i11 - i8;
                        System.arraycopy(iArr, i16, this.f6233f, i8, i17);
                        System.arraycopy(vArr, i16 << 1, this.f6234g, i9, i17 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i10 == this.f6235h) {
                this.f6235h = i11;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v8;
    }

    public V k(int i8, V v8) {
        int i9 = (i8 << 1) + 1;
        V[] vArr = this.f6234g;
        V v9 = vArr[i9];
        vArr[i9] = v8;
        return v9;
    }

    public final V l(int i8) {
        return this.f6234g[(i8 << 1) + 1];
    }

    public V put(K k8, V v8) {
        int i8;
        int i9;
        int i10 = this.f6235h;
        if (k8 == null) {
            i9 = f();
            i8 = 0;
        } else {
            int hashCode = k8.hashCode();
            i8 = hashCode;
            i9 = d(hashCode, k8);
        }
        if (i9 >= 0) {
            int i11 = (i9 << 1) + 1;
            V[] vArr = this.f6234g;
            V v9 = vArr[i11];
            vArr[i11] = v8;
            return v9;
        }
        int i12 = ~i9;
        int[] iArr = this.f6233f;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f6234g;
            a(i13);
            if (i10 == this.f6235h) {
                int[] iArr2 = this.f6233f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f6234g, 0, objArr.length);
                }
                c(iArr, objArr, i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr3 = this.f6233f;
            int i14 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i14, i10 - i12);
            Object[] objArr2 = this.f6234g;
            System.arraycopy(objArr2, i12 << 1, objArr2, i14 << 1, (this.f6235h - i12) << 1);
        }
        int i15 = this.f6235h;
        if (i10 == i15) {
            int[] iArr4 = this.f6233f;
            if (i12 < iArr4.length) {
                iArr4[i12] = i8;
                Object[] objArr3 = this.f6234g;
                int i16 = i12 << 1;
                objArr3[i16] = k8;
                objArr3[i16 + 1] = v8;
                this.f6235h = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k8, V v8) {
        V orDefault = getOrDefault(k8, (Object) null);
        return orDefault == null ? put(k8, v8) : orDefault;
    }

    public final V remove(Object obj) {
        int e = e(obj);
        if (e >= 0) {
            return j(e);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e = e(obj);
        if (e < 0) {
            return false;
        }
        Object l8 = l(e);
        if (obj2 != l8 && (obj2 == null || !obj2.equals(l8))) {
            return false;
        }
        j(e);
        return true;
    }

    public final V replace(K k8, V v8) {
        int e = e(k8);
        if (e >= 0) {
            return k(e, v8);
        }
        return null;
    }

    public final boolean replace(K k8, V v8, V v9) {
        int e = e(k8);
        if (e < 0) {
            return false;
        }
        V l8 = l(e);
        if (l8 != v8 && (v8 == null || !v8.equals(l8))) {
            return false;
        }
        k(e, v9);
        return true;
    }

    public final int size() {
        return this.f6235h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6235h * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f6235h; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object h8 = h(i8);
            if (h8 != this) {
                sb.append(h8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l8 = l(i8);
            if (l8 != this) {
                sb.append(l8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
