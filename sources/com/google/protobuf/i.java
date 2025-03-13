package com.google.protobuf;

import androidx.fragment.app.u;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final f f3648g = new f(a0.f3591c);

    /* renamed from: h  reason: collision with root package name */
    public static final d f3649h = (d.a() ? new g() : new b());

    /* renamed from: f  reason: collision with root package name */
    public int f3650f = 0;

    public static abstract class a implements Iterator {
        public final Object next() {
            h hVar = (h) this;
            int i8 = hVar.f3642f;
            if (i8 < hVar.f3643g) {
                hVar.f3642f = i8 + 1;
                return Byte.valueOf(hVar.f3644h.n(i8));
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        public final byte[] a(byte[] bArr, int i8, int i9) {
            return Arrays.copyOfRange(bArr, i8, i9 + i8);
        }
    }

    public static final class c extends f {

        /* renamed from: j  reason: collision with root package name */
        public final int f3651j;

        /* renamed from: k  reason: collision with root package name */
        public final int f3652k;

        public c(byte[] bArr, int i8, int i9) {
            super(bArr);
            i.j(i8, i8 + i9, bArr.length);
            this.f3651j = i8;
            this.f3652k = i9;
        }

        public final byte i(int i8) {
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
            StringBuilder sb;
            int i9 = this.f3652k;
            if (((i9 - (i8 + 1)) | i8) >= 0) {
                return this.f3653i[this.f3651j + i8];
            } else if (i8 < 0) {
                sb.append(i8);
                String sb2 = sb.toString();
                throw arrayIndexOutOfBoundsException;
            } else {
                sb = new StringBuilder("Index > length: ");
                sb.append(i8);
                sb.append(", ");
                sb.append(i9);
                arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(sb.toString());
                throw arrayIndexOutOfBoundsException;
            }
        }

        public final void m(int i8, byte[] bArr) {
            System.arraycopy(this.f3653i, this.f3651j + 0, bArr, 0, i8);
        }

        public final byte n(int i8) {
            return this.f3653i[this.f3651j + i8];
        }

        public final int size() {
            return this.f3652k;
        }

        public final int w() {
            return this.f3651j;
        }
    }

    public interface d {
        byte[] a(byte[] bArr, int i8, int i9);
    }

    public static abstract class e extends i {
        public final Iterator iterator() {
            return new h(this);
        }
    }

    public static class f extends e {

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f3653i;

        public f(byte[] bArr) {
            bArr.getClass();
            this.f3653i = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i8 = this.f3650f;
            int i9 = fVar.f3650f;
            if (i8 != 0 && i9 != 0 && i8 != i9) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= fVar.size()) {
                int w = w() + size;
                int w8 = w();
                int w9 = fVar.w() + 0;
                while (w8 < w) {
                    if (this.f3653i[w8] != fVar.f3653i[w9]) {
                        return false;
                    }
                    w8++;
                    w9++;
                }
                return true;
            } else {
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + fVar.size());
            }
        }

        public byte i(int i8) {
            return this.f3653i[i8];
        }

        public void m(int i8, byte[] bArr) {
            System.arraycopy(this.f3653i, 0, bArr, 0, i8);
        }

        public byte n(int i8) {
            return this.f3653i[i8];
        }

        public final boolean o() {
            int w = w();
            return r1.d(this.f3653i, w, size() + w);
        }

        public final j p() {
            return j.f(this.f3653i, w(), size(), true);
        }

        public final int q(int i8, int i9) {
            int w = w() + 0;
            Charset charset = a0.f3589a;
            for (int i10 = w; i10 < w + i9; i10++) {
                i8 = (i8 * 31) + this.f3653i[i10];
            }
            return i8;
        }

        public final i r(int i8) {
            int j8 = i.j(0, i8, size());
            if (j8 == 0) {
                return i.f3648g;
            }
            return new c(this.f3653i, w() + 0, j8);
        }

        public int size() {
            return this.f3653i.length;
        }

        public final String t(Charset charset) {
            return new String(this.f3653i, w(), size(), charset);
        }

        public final void v(u uVar) {
            uVar.i(this.f3653i, w(), size());
        }

        public int w() {
            return 0;
        }
    }

    public static final class g implements d {
        public final byte[] a(byte[] bArr, int i8, int i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return bArr2;
        }
    }

    public static int j(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) >= 0) {
            return i11;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        } else if (i9 < i8) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
        }
    }

    public static f k(byte[] bArr, int i8, int i9) {
        j(i8, i8 + i9, bArr.length);
        return new f(f3649h.a(bArr, i8, i9));
    }

    public static f l(String str) {
        return new f(str.getBytes(a0.f3590b));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f3650f;
        if (i8 == 0) {
            int size = size();
            i8 = q(size, size);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f3650f = i8;
        }
        return i8;
    }

    public abstract byte i(int i8);

    public Iterator iterator() {
        return new h(this);
    }

    public abstract void m(int i8, byte[] bArr);

    public abstract byte n(int i8);

    public abstract boolean o();

    public abstract j p();

    public abstract int q(int i8, int i9);

    public abstract i r(int i8);

    public final byte[] s() {
        int size = size();
        if (size == 0) {
            return a0.f3591c;
        }
        byte[] bArr = new byte[size];
        m(size, bArr);
        return bArr;
    }

    public abstract int size();

    public abstract String t(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = k1.a(this);
        } else {
            str = k1.a(r(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String u() {
        return size() == 0 ? "" : t(a0.f3590b);
    }

    public abstract void v(u uVar);
}
