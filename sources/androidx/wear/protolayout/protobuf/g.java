package androidx.wear.protolayout.protobuf;

import androidx.fragment.app.u;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class g implements Iterable<Byte>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final f f2096g = new f(x.f2215b);

    /* renamed from: h  reason: collision with root package name */
    public static final d f2097h = (d.a() ? new C0020g() : new b());

    /* renamed from: f  reason: collision with root package name */
    public int f2098f = 0;

    public static abstract class a implements Iterator {
        public final Object next() {
            f fVar = (f) this;
            int i8 = fVar.f2091f;
            if (i8 < fVar.f2092g) {
                fVar.f2091f = i8 + 1;
                return Byte.valueOf(fVar.f2093h.k(i8));
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
        public final int f2099j;

        /* renamed from: k  reason: collision with root package name */
        public final int f2100k;

        public c(byte[] bArr, int i8, int i9) {
            super(bArr);
            g.j(i8, i8 + i9, bArr.length);
            this.f2099j = i8;
            this.f2100k = i9;
        }

        public final byte i(int i8) {
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
            StringBuilder sb;
            int i9 = this.f2100k;
            if (((i9 - (i8 + 1)) | i8) >= 0) {
                return this.f2101i[this.f2099j + i8];
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

        public final byte k(int i8) {
            return this.f2101i[this.f2099j + i8];
        }

        public final int q() {
            return this.f2099j;
        }

        public final int size() {
            return this.f2100k;
        }
    }

    public interface d {
        byte[] a(byte[] bArr, int i8, int i9);
    }

    public static abstract class e extends g {
        public final Iterator iterator() {
            return new f(this);
        }
    }

    public static class f extends e {

        /* renamed from: i  reason: collision with root package name */
        public final byte[] f2101i;

        public f(byte[] bArr) {
            bArr.getClass();
            this.f2101i = bArr;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i8 = this.f2098f;
            int i9 = fVar.f2098f;
            if (i8 != 0 && i9 != 0 && i8 != i9) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= fVar.size()) {
                int q8 = q() + size;
                int q9 = q();
                int q10 = fVar.q() + 0;
                while (q9 < q8) {
                    if (this.f2101i[q9] != fVar.f2101i[q10]) {
                        return false;
                    }
                    q9++;
                    q10++;
                }
                return true;
            } else {
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + fVar.size());
            }
        }

        public byte i(int i8) {
            return this.f2101i[i8];
        }

        public byte k(int i8) {
            return this.f2101i[i8];
        }

        public final boolean l() {
            int q8 = q();
            return m1.f2146a.c(q8, size() + q8, this.f2101i) == 0;
        }

        public final int m(int i8, int i9) {
            int q8 = q() + 0;
            Charset charset = x.f2214a;
            for (int i10 = q8; i10 < q8 + i9; i10++) {
                i8 = (i8 * 31) + this.f2101i[i10];
            }
            return i8;
        }

        public final f n(int i8) {
            int j8 = g.j(0, i8, size());
            if (j8 == 0) {
                return g.f2096g;
            }
            return new c(this.f2101i, q() + 0, j8);
        }

        public final String o(Charset charset) {
            return new String(this.f2101i, q(), size(), charset);
        }

        public final void p(u uVar) {
            uVar.i(this.f2101i, q(), size());
        }

        public int q() {
            return 0;
        }

        public int size() {
            return this.f2101i.length;
        }
    }

    /* renamed from: androidx.wear.protolayout.protobuf.g$g  reason: collision with other inner class name */
    public static final class C0020g implements d {
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

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f2098f;
        if (i8 == 0) {
            int size = size();
            i8 = m(size, size);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f2098f = i8;
        }
        return i8;
    }

    public abstract byte i(int i8);

    public Iterator iterator() {
        return new f(this);
    }

    public abstract byte k(int i8);

    public abstract boolean l();

    public abstract int m(int i8, int i9);

    public abstract f n(int i8);

    public abstract String o(Charset charset);

    public abstract void p(u uVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = a1.a.r(this);
        } else {
            str = a1.a.r(n(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
