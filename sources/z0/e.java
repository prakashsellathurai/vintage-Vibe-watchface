package z0;

import b6.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import k3.j;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f8674a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8675b = {112, 114, 109, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) {
        int i8 = 0;
        int i9 = 0;
        for (b bVar : bVarArr) {
            i9 += b(bVar.f8663a, bVar.f8664b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + (bVar.e * 2) + bVar.f8667f + (((((bVar.f8668g * 2) + 8) - 1) & -8) / 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f.f8678c)) {
            int length = bVarArr.length;
            while (i8 < length) {
                b bVar2 = bVarArr[i8];
                l(byteArrayOutputStream, bVar2, b(bVar2.f8663a, bVar2.f8664b, bArr));
                n(byteArrayOutputStream, bVar2);
                k(byteArrayOutputStream, bVar2);
                m(byteArrayOutputStream, bVar2);
                i8++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bVar3.f8663a, bVar3.f8664b, bArr));
            }
            int length2 = bVarArr.length;
            while (i8 < length2) {
                b bVar4 = bVarArr[i8];
                n(byteArrayOutputStream, bVar4);
                k(byteArrayOutputStream, bVar4);
                m(byteArrayOutputStream, bVar4);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f.f8679d;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            if (str3.equals(str4)) {
                return str2.replace(":", str3);
            }
            if (":".equals(str4)) {
                str2 = str2.replace(str3, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str3) || str2.contains(":")) {
                if (str3.equals(str4)) {
                    return str2.replace(":", str3);
                }
                if (":".equals(str4)) {
                    str2 = str2.replace(str3, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                sb.append(str3);
                sb.append(str2);
                return sb.toString();
            }
        }
    }

    public static int c(int i8, int i9, int i10) {
        if (i8 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i8 == 2) {
            return i9;
        } else {
            if (i8 == 4) {
                return i9 + i10;
            }
            throw new IllegalStateException("Unexpected flag: " + i8);
        }
    }

    public static int[] d(int i8, ByteArrayInputStream byteArrayInputStream) {
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += j.V(byteArrayInputStream);
            iArr[i10] = i9;
        }
        return iArr;
    }

    public static b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f.f8680f;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f.f8676a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int U = (int) j.U(1, fileInputStream);
                byte[] T = j.T(fileInputStream, (int) j.U(4, fileInputStream), (int) j.U(4, fileInputStream));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(T);
                    try {
                        b[] f9 = f(byteArrayInputStream, U, bVarArr);
                        byteArrayInputStream.close();
                        return f9;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f.f8681g)) {
            int V = j.V(fileInputStream);
            byte[] T2 = j.T(fileInputStream, (int) j.U(4, fileInputStream), (int) j.U(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(T2);
                try {
                    b[] g9 = g(byteArrayInputStream2, bArr2, V, bVarArr);
                    byteArrayInputStream2.close();
                    return g9;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static b[] f(ByteArrayInputStream byteArrayInputStream, int i8, b[] bVarArr) {
        int i9 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 == bVarArr.length) {
            String[] strArr = new String[i8];
            int[] iArr = new int[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                int V = j.V(byteArrayInputStream);
                iArr[i10] = j.V(byteArrayInputStream);
                strArr[i10] = new String(j.S(V, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            while (i9 < i8) {
                b bVar = bVarArr[i9];
                if (bVar.f8664b.equals(strArr[i9])) {
                    int i11 = iArr[i9];
                    bVar.e = i11;
                    bVar.f8669h = d(i11, byteArrayInputStream);
                    i9++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i8, b[] bVarArr) {
        b bVar;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 == bVarArr.length) {
            int i9 = 0;
            while (i9 < i8) {
                j.V(byteArrayInputStream);
                String str = new String(j.S(j.V(byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long U = j.U(4, byteArrayInputStream);
                int V = j.V(byteArrayInputStream);
                if (bVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i10].f8664b.equals(substring)) {
                            bVar = bVarArr[i10];
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    bVar.f8666d = U;
                    int[] d9 = d(V, byteArrayInputStream);
                    if (Arrays.equals(bArr, f.e)) {
                        bVar.e = V;
                        bVar.f8669h = d9;
                    }
                    i9++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f.f8677b)) {
            int U = (int) j.U(1, fileInputStream);
            byte[] T = j.T(fileInputStream, (int) j.U(4, fileInputStream), (int) j.U(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(T);
                try {
                    b[] i8 = i(byteArrayInputStream, str, U);
                    byteArrayInputStream.close();
                    return i8;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static b[] i(ByteArrayInputStream byteArrayInputStream, String str, int i8) {
        TreeMap<Integer, Integer> treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i9 = i8;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int V = j.V(byteArrayInputStream);
            int V2 = j.V(byteArrayInputStream);
            long U = j.U(4, byteArrayInputStream2);
            String str2 = str;
            bVarArr[i10] = new b(str2, new String(j.S(V, byteArrayInputStream2), StandardCharsets.UTF_8), j.U(4, byteArrayInputStream2), V2, (int) U, (int) j.U(4, byteArrayInputStream2), new int[V2], new TreeMap());
        }
        int i11 = 0;
        while (i11 < i9) {
            b bVar = bVarArr[i11];
            int available = byteArrayInputStream.available() - bVar.f8667f;
            int i12 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f8670i;
                if (available2 <= available) {
                    break;
                }
                i12 += j.V(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i12), 1);
                for (int V3 = j.V(byteArrayInputStream); V3 > 0; V3--) {
                    j.V(byteArrayInputStream);
                    int U2 = (int) j.U(1, byteArrayInputStream2);
                    if (!(U2 == 6 || U2 == 7)) {
                        while (U2 > 0) {
                            j.U(1, byteArrayInputStream2);
                            for (int U3 = (int) j.U(1, byteArrayInputStream2); U3 > 0; U3--) {
                                j.V(byteArrayInputStream);
                            }
                            U2--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f8669h = d(bVar.e, byteArrayInputStream2);
                int i13 = bVar.f8668g;
                BitSet valueOf = BitSet.valueOf(j.S(((((i13 * 2) + 8) - 1) & -8) / 8, byteArrayInputStream2));
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = 2;
                    if (!valueOf.get(c(2, i14, i13))) {
                        i15 = 0;
                    }
                    if (valueOf.get(c(4, i14, i13))) {
                        i15 |= 4;
                    }
                    if (i15 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i14));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                    }
                }
                i11++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    /* JADX INFO: finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        Throwable th;
        Throwable th2;
        ArrayList arrayList;
        int i8;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th3;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        b[] bVarArr2 = bVarArr;
        byte[] bArr3 = f.f8676a;
        int i9 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                j.m0(byteArrayOutputStream5, bVarArr2.length);
                int i10 = 2;
                int i11 = 2;
                for (b bVar : bVarArr2) {
                    j.l0(byteArrayOutputStream5, bVar.f8665c, 4);
                    j.l0(byteArrayOutputStream5, bVar.f8666d, 4);
                    j.l0(byteArrayOutputStream5, (long) bVar.f8668g, 4);
                    String b9 = b(bVar.f8663a, bVar.f8664b, bArr3);
                    int length = b9.getBytes(StandardCharsets.UTF_8).length;
                    j.m0(byteArrayOutputStream5, length);
                    i11 = i11 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream5.write(b9.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i11 == byteArray.length) {
                    g gVar = new g(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(gVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < bVarArr2.length) {
                        try {
                            b bVar2 = bVarArr2[i12];
                            j.m0(byteArrayOutputStream6, i12);
                            j.m0(byteArrayOutputStream6, bVar2.e);
                            i13 = i13 + 2 + 2 + (bVar2.e * 2);
                            k(byteArrayOutputStream6, bVar2);
                            i12++;
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i13 == byteArray2.length) {
                        g gVar2 = new g(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(gVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < bVarArr2.length) {
                            try {
                                b bVar3 = bVarArr2[i14];
                                int i16 = i9;
                                for (Map.Entry<Integer, Integer> value : bVar3.f8670i.entrySet()) {
                                    i16 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream2, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream3, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                j.m0(byteArrayOutputStream7, i14);
                                int length2 = byteArray3.length + i10 + byteArray4.length;
                                int i17 = i15 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                j.l0(byteArrayOutputStream7, (long) length2, 4);
                                j.m0(byteArrayOutputStream7, i16);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i15 = i17 + length2;
                                i14++;
                                arrayList3 = arrayList4;
                                i9 = 0;
                                i10 = 2;
                            } catch (Throwable th6) {
                                Throwable th7 = th6;
                                try {
                                    byteArrayOutputStream7.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i15 == byteArray5.length) {
                            g gVar3 = new g(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(gVar3);
                            long j8 = (long) 4;
                            long size = j8 + j8 + 4 + ((long) (arrayList2.size() * 16));
                            j.l0(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i18 = 0;
                            while (i18 < arrayList2.size()) {
                                g gVar4 = (g) arrayList2.get(i18);
                                j.l0(byteArrayOutputStream4, a.d(gVar4.f8682a), 4);
                                j.l0(byteArrayOutputStream4, size, 4);
                                boolean z8 = gVar4.f8684c;
                                byte[] bArr4 = gVar4.f8683b;
                                if (z8) {
                                    byte[] p8 = j.p(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(p8);
                                    j.l0(byteArrayOutputStream4, (long) p8.length, 4);
                                    j.l0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    i8 = p8.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    j.l0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    j.l0(byteArrayOutputStream4, 0, 4);
                                    i8 = bArr4.length;
                                }
                                size += (long) i8;
                                i18++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i19));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th9) {
                th.addSuppressed(th9);
            }
        } else {
            byte[] bArr5 = f.f8677b;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] a9 = a(bVarArr2, bArr5);
                j.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                j.l0(byteArrayOutputStream4, (long) a9.length, 4);
                byte[] p9 = j.p(a9);
                j.l0(byteArrayOutputStream4, (long) p9.length, 4);
                byteArrayOutputStream4.write(p9);
                return true;
            }
            byte[] bArr6 = f.f8679d;
            if (Arrays.equals(bArr2, bArr6)) {
                j.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                for (b bVar4 : bVarArr2) {
                    String b10 = b(bVar4.f8663a, bVar4.f8664b, bArr6);
                    j.m0(byteArrayOutputStream4, b10.getBytes(StandardCharsets.UTF_8).length);
                    j.m0(byteArrayOutputStream4, bVar4.f8669h.length);
                    j.l0(byteArrayOutputStream4, (long) (bVar4.f8670i.size() * 4), 4);
                    j.l0(byteArrayOutputStream4, bVar4.f8665c, 4);
                    byteArrayOutputStream4.write(b10.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : bVar4.f8670i.keySet()) {
                        j.m0(byteArrayOutputStream4, intValue.intValue());
                        j.m0(byteArrayOutputStream4, 0);
                    }
                    for (int m02 : bVar4.f8669h) {
                        j.m0(byteArrayOutputStream4, m02);
                    }
                }
                return true;
            }
            byte[] bArr7 = f.f8678c;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] a10 = a(bVarArr2, bArr7);
                j.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                j.l0(byteArrayOutputStream4, (long) a10.length, 4);
                byte[] p10 = j.p(a10);
                j.l0(byteArrayOutputStream4, (long) p10.length, 4);
                byteArrayOutputStream4.write(p10);
                return true;
            }
            byte[] bArr8 = f.e;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            j.m0(byteArrayOutputStream4, bVarArr2.length);
            for (b bVar5 : bVarArr2) {
                String b11 = b(bVar5.f8663a, bVar5.f8664b, bArr8);
                j.m0(byteArrayOutputStream4, b11.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = bVar5.f8670i;
                j.m0(byteArrayOutputStream4, treeMap.size());
                j.m0(byteArrayOutputStream4, bVar5.f8669h.length);
                j.l0(byteArrayOutputStream4, bVar5.f8665c, 4);
                byteArrayOutputStream4.write(b11.getBytes(StandardCharsets.UTF_8));
                for (Integer intValue2 : treeMap.keySet()) {
                    j.m0(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int m03 : bVar5.f8669h) {
                    j.m0(byteArrayOutputStream4, m03);
                }
            }
            return true;
        }
        throw th3;
        throw th;
        throw th4;
        throw th2;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i8 = 0;
        for (int valueOf : bVar.f8669h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            j.m0(byteArrayOutputStream, valueOf2.intValue() - i8);
            i8 = valueOf2.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        j.m0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        j.m0(byteArrayOutputStream, bVar.e);
        j.l0(byteArrayOutputStream, (long) bVar.f8667f, 4);
        j.l0(byteArrayOutputStream, bVar.f8665c, 4);
        j.l0(byteArrayOutputStream, (long) bVar.f8668g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((((bVar.f8668g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry next : bVar.f8670i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            int i8 = intValue2 & 2;
            int i9 = bVar.f8668g;
            if (i8 != 0) {
                int c9 = c(2, intValue, i9);
                int i10 = c9 / 8;
                bArr[i10] = (byte) ((1 << (c9 % 8)) | bArr[i10]);
            }
            if ((intValue2 & 4) != 0) {
                int c10 = c(4, intValue, i9);
                int i11 = c10 / 8;
                bArr[i11] = (byte) ((1 << (c10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i8 = 0;
        for (Map.Entry next : bVar.f8670i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                j.m0(byteArrayOutputStream, intValue - i8);
                j.m0(byteArrayOutputStream, 0);
                i8 = intValue;
            }
        }
    }
}
