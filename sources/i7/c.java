package i7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q7.k;

public final class c<E> extends a<E> {

    /* renamed from: i  reason: collision with root package name */
    public static final Object[] f4872i = new Object[0];

    /* renamed from: f  reason: collision with root package name */
    public int f4873f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f4874g = f4872i;

    /* renamed from: h  reason: collision with root package name */
    public int f4875h;

    public final void add(int i8, E e) {
        int i9;
        int i10 = this.f4875h;
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i10);
        } else if (i8 == i10) {
            addLast(e);
        } else {
            int i11 = i10 + 1;
            if (i8 == 0) {
                j(i11);
                int i12 = this.f4873f;
                if (i12 == 0) {
                    Object[] objArr = this.f4874g;
                    k.e(objArr, "<this>");
                    i12 = objArr.length;
                }
                int i13 = i12 - 1;
                this.f4873f = i13;
                this.f4874g[i13] = e;
                this.f4875h++;
                return;
            }
            j(i11);
            int l8 = l(this.f4873f + i8);
            int i14 = this.f4875h;
            if (i8 < ((i14 + 1) >> 1)) {
                if (l8 == 0) {
                    Object[] objArr2 = this.f4874g;
                    k.e(objArr2, "<this>");
                    i9 = objArr2.length - 1;
                } else {
                    i9 = l8 - 1;
                }
                int i15 = this.f4873f;
                if (i15 == 0) {
                    Object[] objArr3 = this.f4874g;
                    k.e(objArr3, "<this>");
                    i15 = objArr3.length;
                }
                int i16 = i15 - 1;
                int i17 = this.f4873f;
                Object[] objArr4 = this.f4874g;
                if (i9 >= i17) {
                    objArr4[i16] = objArr4[i17];
                    f.N(objArr4, objArr4, i17, i17 + 1, i9 + 1);
                } else {
                    f.N(objArr4, objArr4, i17 - 1, i17, objArr4.length);
                    Object[] objArr5 = this.f4874g;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    f.N(objArr5, objArr5, 0, 1, i9 + 1);
                }
                this.f4874g[i9] = e;
                this.f4873f = i16;
            } else {
                int l9 = l(this.f4873f + i14);
                Object[] objArr6 = this.f4874g;
                if (l8 < l9) {
                    f.N(objArr6, objArr6, l8 + 1, l8, l9);
                } else {
                    f.N(objArr6, objArr6, 1, 0, l9);
                    Object[] objArr7 = this.f4874g;
                    objArr7[0] = objArr7[objArr7.length - 1];
                    f.N(objArr7, objArr7, l8 + 1, l8, objArr7.length - 1);
                }
                this.f4874g[l8] = e;
            }
            this.f4875h++;
        }
    }

    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    public final boolean addAll(int i8, Collection<? extends E> collection) {
        k.e(collection, "elements");
        int i9 = this.f4875h;
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i10 = this.f4875h;
            if (i8 == i10) {
                return addAll(collection);
            }
            j(i10 + collection.size());
            int l8 = l(this.f4873f + this.f4875h);
            int l9 = l(this.f4873f + i8);
            int size = collection.size();
            if (i8 < ((this.f4875h + 1) >> 1)) {
                int i11 = this.f4873f;
                int i12 = i11 - size;
                if (l9 < i11) {
                    Object[] objArr = this.f4874g;
                    f.N(objArr, objArr, i12, i11, objArr.length);
                    Object[] objArr2 = this.f4874g;
                    int length = objArr2.length - size;
                    if (size >= l9) {
                        f.N(objArr2, objArr2, length, 0, l9);
                    } else {
                        f.N(objArr2, objArr2, length, 0, size);
                        Object[] objArr3 = this.f4874g;
                        f.N(objArr3, objArr3, 0, size, l9);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr4 = this.f4874g;
                    f.N(objArr4, objArr4, i12, i11, l9);
                } else {
                    Object[] objArr5 = this.f4874g;
                    i12 += objArr5.length;
                    int i13 = l9 - i11;
                    int length2 = objArr5.length - i12;
                    if (length2 >= i13) {
                        f.N(objArr5, objArr5, i12, i11, l9);
                    } else {
                        f.N(objArr5, objArr5, i12, i11, i11 + length2);
                        Object[] objArr6 = this.f4874g;
                        f.N(objArr6, objArr6, 0, this.f4873f + length2, l9);
                    }
                }
                this.f4873f = i12;
                l9 -= size;
                if (l9 < 0) {
                    l9 += this.f4874g.length;
                }
            } else {
                int i14 = l9 + size;
                if (l9 < l8) {
                    int i15 = size + l8;
                    Object[] objArr7 = this.f4874g;
                    if (i15 > objArr7.length) {
                        if (i14 >= objArr7.length) {
                            i14 -= objArr7.length;
                        } else {
                            int length3 = l8 - (i15 - objArr7.length);
                            f.N(objArr7, objArr7, 0, length3, l8);
                            Object[] objArr8 = this.f4874g;
                            f.N(objArr8, objArr8, i14, l9, length3);
                        }
                    }
                    f.N(objArr7, objArr7, i14, l9, l8);
                } else {
                    Object[] objArr9 = this.f4874g;
                    f.N(objArr9, objArr9, size, 0, l8);
                    Object[] objArr10 = this.f4874g;
                    if (i14 >= objArr10.length) {
                        f.N(objArr10, objArr10, i14 - objArr10.length, l9, objArr10.length);
                    } else {
                        f.N(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                        Object[] objArr11 = this.f4874g;
                        f.N(objArr11, objArr11, i14, l9, objArr11.length - size);
                    }
                }
            }
            i(l9, collection);
            return true;
        }
    }

    public final void addLast(E e) {
        j(this.f4875h + 1);
        this.f4874g[l(this.f4873f + this.f4875h)] = e;
        this.f4875h++;
    }

    public final void clear() {
        int l8 = l(this.f4873f + this.f4875h);
        int i8 = this.f4873f;
        if (i8 < l8) {
            Object[] objArr = this.f4874g;
            k.e(objArr, "<this>");
            Arrays.fill(objArr, i8, l8, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4874g;
            Arrays.fill(objArr2, this.f4873f, objArr2.length, (Object) null);
            Object[] objArr3 = this.f4874g;
            k.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, l8, (Object) null);
        }
        this.f4873f = 0;
        this.f4875h = 0;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E get(int i8) {
        int i9 = this.f4875h;
        if (i8 >= 0 && i8 < i9) {
            return this.f4874g[l(this.f4873f + i8)];
        }
        throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
    }

    public final void i(int i8, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f4874g.length;
        while (i8 < length && it.hasNext()) {
            this.f4874g[i8] = it.next();
            i8++;
        }
        int i9 = this.f4873f;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f4874g[i10] = it.next();
        }
        this.f4875h += collection.size();
    }

    public final int indexOf(Object obj) {
        int l8 = l(this.f4873f + this.f4875h);
        int i8 = this.f4873f;
        if (i8 < l8) {
            while (i8 < l8) {
                if (!k.a(obj, this.f4874g[i8])) {
                    i8++;
                }
            }
            return -1;
        } else if (i8 < l8) {
            return -1;
        } else {
            int length = this.f4874g.length;
            while (true) {
                if (i8 >= length) {
                    int i9 = 0;
                    while (i9 < l8) {
                        if (k.a(obj, this.f4874g[i9])) {
                            i8 = i9 + this.f4874g.length;
                        } else {
                            i9++;
                        }
                    }
                    return -1;
                } else if (k.a(obj, this.f4874g[i8])) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        return i8 - this.f4873f;
    }

    public final boolean isEmpty() {
        return this.f4875h == 0;
    }

    public final void j(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f4874g;
            if (i8 > objArr.length) {
                if (objArr == f4872i) {
                    if (i8 < 10) {
                        i8 = 10;
                    }
                    this.f4874g = new Object[i8];
                    return;
                }
                int length = objArr.length;
                int i9 = length + (length >> 1);
                if (i9 - i8 < 0) {
                    i9 = i8;
                }
                if (i9 - 2147483639 > 0) {
                    i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i9];
                f.N(objArr, objArr2, 0, this.f4873f, objArr.length);
                Object[] objArr3 = this.f4874g;
                int length2 = objArr3.length;
                int i10 = this.f4873f;
                f.N(objArr3, objArr2, length2 - i10, 0, i10);
                this.f4873f = 0;
                this.f4874g = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int k(int i8) {
        Object[] objArr = this.f4874g;
        k.e(objArr, "<this>");
        if (i8 == objArr.length - 1) {
            return 0;
        }
        return i8 + 1;
    }

    public final int l(int i8) {
        Object[] objArr = this.f4874g;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    public final int lastIndexOf(Object obj) {
        int i8;
        int l8 = l(this.f4873f + this.f4875h);
        int i9 = this.f4873f;
        if (i9 < l8) {
            i8 = l8 - 1;
            if (i9 <= i8) {
                while (!k.a(obj, this.f4874g[i8])) {
                    if (i8 != i9) {
                        i8--;
                    }
                }
            }
            return -1;
        }
        if (i9 > l8) {
            int i10 = l8 - 1;
            while (true) {
                if (-1 >= i10) {
                    Object[] objArr = this.f4874g;
                    k.e(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i11 = this.f4873f;
                    if (i11 <= length) {
                        while (!k.a(obj, this.f4874g[i8])) {
                            if (i8 != i11) {
                                length = i8 - 1;
                            }
                        }
                    }
                } else if (k.a(obj, this.f4874g[i10])) {
                    i8 = i10 + this.f4874g.length;
                    break;
                } else {
                    i10--;
                }
            }
        }
        return -1;
        return i8 - this.f4873f;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            q7.k.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x009b
            java.lang.Object[] r0 = r11.f4874g
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x009b
        L_0x0019:
            int r0 = r11.f4873f
            int r3 = r11.f4875h
            int r0 = r0 + r3
            int r0 = r11.l(r0)
            int r3 = r11.f4873f
            r4 = 0
            if (r3 >= r0) goto L_0x004c
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0041
            java.lang.Object[] r6 = r11.f4874g
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003d
            java.lang.Object[] r7 = r11.f4874g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0041:
            java.lang.Object[] r12 = r11.f4874g
            java.lang.String r2 = "<this>"
            q7.k.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r4)
            goto L_0x008e
        L_0x004c:
            java.lang.Object[] r5 = r11.f4874g
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x0051:
            if (r3 >= r5) goto L_0x006c
            java.lang.Object[] r8 = r11.f4874g
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0068
            java.lang.Object[] r8 = r11.f4874g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0069
        L_0x0068:
            r7 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x006c:
            int r3 = r11.l(r6)
            r5 = r3
        L_0x0071:
            if (r1 >= r0) goto L_0x008d
            java.lang.Object[] r3 = r11.f4874g
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0089
            java.lang.Object[] r3 = r11.f4874g
            r3[r5] = r6
            int r5 = r11.k(r5)
            goto L_0x008a
        L_0x0089:
            r7 = r2
        L_0x008a:
            int r1 = r1 + 1
            goto L_0x0071
        L_0x008d:
            r1 = r7
        L_0x008e:
            if (r1 == 0) goto L_0x009b
            int r12 = r11.f4873f
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0099
            java.lang.Object[] r12 = r11.f4874g
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0099:
            r11.f4875h = r5
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f4874g;
            int i8 = this.f4873f;
            E e = eArr[i8];
            eArr[i8] = null;
            this.f4873f = k(i8);
            this.f4875h--;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            q7.k.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0098
            java.lang.Object[] r0 = r11.f4874g
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0098
        L_0x0019:
            int r0 = r11.f4873f
            int r3 = r11.f4875h
            int r0 = r0 + r3
            int r0 = r11.l(r0)
            int r3 = r11.f4873f
            r4 = 0
            if (r3 >= r0) goto L_0x004b
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0040
            java.lang.Object[] r6 = r11.f4874g
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003c
            java.lang.Object[] r7 = r11.f4874g
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0040:
            java.lang.Object[] r12 = r11.f4874g
            java.lang.String r2 = "<this>"
            q7.k.e(r12, r2)
            java.util.Arrays.fill(r12, r5, r0, r4)
            goto L_0x008b
        L_0x004b:
            java.lang.Object[] r5 = r11.f4874g
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x0050:
            if (r3 >= r5) goto L_0x006a
            java.lang.Object[] r8 = r11.f4874g
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0066
            java.lang.Object[] r8 = r11.f4874g
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0067
        L_0x0066:
            r7 = r2
        L_0x0067:
            int r3 = r3 + 1
            goto L_0x0050
        L_0x006a:
            int r3 = r11.l(r6)
            r5 = r3
        L_0x006f:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f4874g
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f4874g
            r3[r5] = r6
            int r5 = r11.k(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0098
            int r12 = r11.f4873f
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0096
            java.lang.Object[] r12 = r11.f4874g
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0096:
            r11.f4875h = r5
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.retainAll(java.util.Collection):boolean");
    }

    public final E set(int i8, E e) {
        int i9 = this.f4875h;
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        }
        int l8 = l(this.f4873f + i8);
        E[] eArr = this.f4874g;
        E e4 = eArr[l8];
        eArr[l8] = e;
        return e4;
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f4875h]);
    }

    public final <T> T[] toArray(T[] tArr) {
        k.e(tArr, "array");
        int length = tArr.length;
        int i8 = this.f4875h;
        if (length < i8) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i8);
            k.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int l8 = l(this.f4873f + this.f4875h);
        int i9 = this.f4873f;
        if (i9 < l8) {
            f.N(this.f4874g, tArr, 0, i9, l8);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4874g;
            f.N(objArr, tArr, 0, this.f4873f, objArr.length);
            Object[] objArr2 = this.f4874g;
            f.N(objArr2, tArr, objArr2.length - this.f4873f, 0, l8);
        }
        int length2 = tArr.length;
        int i10 = this.f4875h;
        if (length2 > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        k.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j(this.f4875h + collection.size());
        i(l(this.f4873f + this.f4875h), collection);
        return true;
    }
}
