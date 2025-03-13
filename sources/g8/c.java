package g8;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class c implements Serializable, Comparable<c> {

    /* renamed from: i  reason: collision with root package name */
    public static final char[] f4684i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: j  reason: collision with root package name */
    public static final c f4685j = new c((byte[]) new byte[0].clone());

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f4686f;

    /* renamed from: g  reason: collision with root package name */
    public transient int f4687g;

    /* renamed from: h  reason: collision with root package name */
    public transient String f4688h;

    public c(byte[] bArr) {
        this.f4686f = bArr;
    }

    public static c e(String str) {
        c cVar = new c(str.getBytes(n.f4713a));
        cVar.f4688h = str;
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r7 < r8) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            g8.c r10 = (g8.c) r10
            int r0 = r9.j()
            int r1 = r10.j()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = r6
            goto L_0x0031
        L_0x0029:
            r3 = r5
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.c.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int j8 = cVar.j();
            byte[] bArr = this.f4686f;
            if (j8 == bArr.length && cVar.h(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i8) {
        return this.f4686f[i8];
    }

    public String g() {
        byte[] bArr = this.f4686f;
        char[] cArr = new char[(bArr.length * 2)];
        int i8 = 0;
        for (byte b9 : bArr) {
            int i9 = i8 + 1;
            char[] cArr2 = f4684i;
            cArr[i8] = cArr2[(b9 >> 4) & 15];
            i8 = i9 + 1;
            cArr[i9] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public boolean h(int i8, int i9, int i10, byte[] bArr) {
        boolean z8;
        if (i8 < 0) {
            return false;
        }
        byte[] bArr2 = this.f4686f;
        if (i8 > bArr2.length - i10 || i9 < 0 || i9 > bArr.length - i10) {
            return false;
        }
        Charset charset = n.f4713a;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z8 = true;
                break;
            } else if (bArr2[i11 + i8] != bArr[i11 + i9]) {
                z8 = false;
                break;
            } else {
                i11++;
            }
        }
        return z8;
    }

    public int hashCode() {
        int i8 = this.f4687g;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = Arrays.hashCode(this.f4686f);
        this.f4687g = hashCode;
        return hashCode;
    }

    public boolean i(c cVar, int i8) {
        return cVar.h(0, 0, i8, this.f4686f);
    }

    public int j() {
        return this.f4686f.length;
    }

    public c l() {
        byte[] bArr = this.f4686f;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new c(bArr2);
        }
    }

    public String n() {
        String str = this.f4688h;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f4686f, n.f4713a);
        this.f4688h = str2;
        return str2;
    }

    public String toString() {
        byte[] bArr = this.f4686f;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String n8 = n();
        int length = n8.length();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = n8.length();
                break;
            } else if (i9 == 64) {
                break;
            } else {
                int codePointAt = n8.codePointAt(i8);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i9++;
                    i8 += Character.charCount(codePointAt);
                }
            }
        }
        i8 = -1;
        if (i8 != -1) {
            String replace = n8.substring(0, i8).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i8 < n8.length()) {
                return "[size=" + bArr.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (bArr.length <= 64) {
            return "[hex=" + g() + "]";
        } else {
            return "[size=" + bArr.length + " hex=" + l().g() + "…]";
        }
    }
}
