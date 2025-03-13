package j2;

import g8.c;
import g8.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public abstract class b implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4966j = new String[128];

    /* renamed from: f  reason: collision with root package name */
    public int f4967f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f4968g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    public String[] f4969h = new String[32];

    /* renamed from: i  reason: collision with root package name */
    public int[] f4970i = new int[32];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f4971a;

        /* renamed from: b  reason: collision with root package name */
        public final f f4972b;

        public a(String[] strArr, f fVar) {
            this.f4971a = strArr;
            this.f4972b = fVar;
        }

        public static a a(String... strArr) {
            String str;
            try {
                c[] cVarArr = new c[strArr.length];
                g8.a aVar = new g8.a();
                for (int i8 = 0; i8 < strArr.length; i8++) {
                    String str2 = strArr[i8];
                    String[] strArr2 = b.f4966j;
                    aVar.t(34);
                    int length = str2.length();
                    int i9 = 0;
                    for (int i10 = 0; i10 < length; i10++) {
                        char charAt = str2.charAt(i10);
                        if (charAt < 128) {
                            str = strArr2[charAt];
                            if (str == null) {
                            }
                        } else if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i9 < i10) {
                            aVar.v(str2, i9, i10);
                        }
                        aVar.v(str, 0, str.length());
                        i9 = i10 + 1;
                    }
                    if (i9 < length) {
                        aVar.v(str2, i9, length);
                    }
                    aVar.t(34);
                    aVar.d();
                    cVarArr[i8] = new c(aVar.g(aVar.f4683g));
                }
                return new a((String[]) strArr.clone(), f.j(cVarArr));
            } catch (EOFException e) {
                throw new AssertionError(e);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f4966j[i8] = String.format("\\u%04x", new Object[]{Integer.valueOf(i8)});
        }
        String[] strArr = f4966j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void g();

    public final String h() {
        int i8 = this.f4967f;
        int[] iArr = this.f4968g;
        String[] strArr = this.f4969h;
        int[] iArr2 = this.f4970i;
        StringBuilder sb = new StringBuilder("$");
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(iArr2[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append('.');
                String str = strArr[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean j();

    public abstract boolean n();

    public abstract double o();

    public abstract int q();

    public abstract String s();

    public abstract int t();

    public final void u(int i8) {
        int i9 = this.f4967f;
        int[] iArr = this.f4968g;
        if (i9 == iArr.length) {
            if (i9 != 256) {
                this.f4968g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f4969h;
                this.f4969h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f4970i;
                this.f4970i = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new c1.c("Nesting too deep at " + h());
            }
        }
        int[] iArr3 = this.f4968g;
        int i10 = this.f4967f;
        this.f4967f = i10 + 1;
        iArr3[i10] = i8;
    }

    public abstract int v(a aVar);

    public abstract void w();

    public abstract void x();

    public final void z(String str) {
        throw new a(str + " at path " + h());
    }
}
