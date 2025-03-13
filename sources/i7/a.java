package i7;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class a<E> extends AbstractList<E> implements List<E> {
    public final E remove(int i8) {
        c cVar = (c) this;
        int i9 = cVar.f4875h;
        if (i8 < 0 || i8 >= i9) {
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        } else if (i8 == a1.a.u(cVar)) {
            if (!cVar.isEmpty()) {
                int l8 = cVar.l(cVar.f4873f + a1.a.u(cVar));
                E[] eArr = cVar.f4874g;
                E e = eArr[l8];
                eArr[l8] = null;
                cVar.f4875h--;
                return e;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i8 == 0) {
            return cVar.removeFirst();
        } else {
            int l9 = cVar.l(cVar.f4873f + i8);
            E[] eArr2 = cVar.f4874g;
            E e4 = eArr2[l9];
            if (i8 < (cVar.f4875h >> 1)) {
                int i10 = cVar.f4873f;
                if (l9 >= i10) {
                    f.N(eArr2, eArr2, i10 + 1, i10, l9);
                } else {
                    f.N(eArr2, eArr2, 1, 0, l9);
                    Object[] objArr = cVar.f4874g;
                    objArr[0] = objArr[objArr.length - 1];
                    int i11 = cVar.f4873f;
                    f.N(objArr, objArr, i11 + 1, i11, objArr.length - 1);
                }
                Object[] objArr2 = cVar.f4874g;
                int i12 = cVar.f4873f;
                objArr2[i12] = null;
                cVar.f4873f = cVar.k(i12);
            } else {
                int l10 = cVar.l(cVar.f4873f + a1.a.u(cVar));
                Object[] objArr3 = cVar.f4874g;
                int i13 = l9 + 1;
                if (l9 <= l10) {
                    f.N(objArr3, objArr3, l9, i13, l10 + 1);
                } else {
                    f.N(objArr3, objArr3, l9, i13, objArr3.length);
                    Object[] objArr4 = cVar.f4874g;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    f.N(objArr4, objArr4, 0, 1, l10 + 1);
                }
                cVar.f4874g[l10] = null;
            }
            cVar.f4875h--;
            return e4;
        }
    }

    public final int size() {
        return ((c) this).f4875h;
    }
}
