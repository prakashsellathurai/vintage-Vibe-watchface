package g8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;

public final class f extends AbstractList<c> implements RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public final c[] f4691f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4692g;

    public f(c[] cVarArr, int[] iArr) {
        this.f4691f = cVarArr;
        this.f4692g = iArr;
    }

    public static void i(long j8, a aVar, int i8, ArrayList arrayList, int i9, int i10, ArrayList arrayList2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        a aVar2;
        a aVar3 = aVar;
        int i16 = i8;
        ArrayList arrayList3 = arrayList;
        int i17 = i9;
        int i18 = i10;
        ArrayList arrayList4 = arrayList2;
        if (i17 < i18) {
            int i19 = i17;
            while (i19 < i18) {
                if (((c) arrayList3.get(i19)).j() >= i16) {
                    i19++;
                } else {
                    throw new AssertionError();
                }
            }
            c cVar = (c) arrayList.get(i9);
            c cVar2 = (c) arrayList3.get(i18 - 1);
            if (i16 == cVar.j()) {
                int intValue = ((Integer) arrayList4.get(i17)).intValue();
                int i20 = i17 + 1;
                i11 = i20;
                i12 = intValue;
                cVar = (c) arrayList3.get(i20);
            } else {
                i12 = -1;
                i11 = i17;
            }
            long j9 = 4;
            if (cVar.f(i16) != cVar2.f(i16)) {
                int i21 = 1;
                for (int i22 = i11 + 1; i22 < i18; i22++) {
                    if (((c) arrayList3.get(i22 - 1)).f(i16) != ((c) arrayList3.get(i22)).f(i16)) {
                        i21++;
                    }
                }
                long j10 = j8 + ((long) ((int) (aVar3.f4683g / 4))) + 2 + ((long) (i21 * 2));
                aVar3.u(i21);
                aVar3.u(i12);
                for (int i23 = i11; i23 < i18; i23++) {
                    byte f9 = ((c) arrayList3.get(i23)).f(i16);
                    if (i23 == i11 || f9 != ((c) arrayList3.get(i23 - 1)).f(i16)) {
                        aVar3.u(f9 & 255);
                    }
                }
                a aVar4 = new a();
                int i24 = i11;
                while (i24 < i18) {
                    byte f10 = ((c) arrayList3.get(i24)).f(i16);
                    int i25 = i24 + 1;
                    int i26 = i25;
                    while (true) {
                        if (i26 >= i18) {
                            i14 = i18;
                            break;
                        } else if (f10 != ((c) arrayList3.get(i26)).f(i16)) {
                            i14 = i26;
                            break;
                        } else {
                            i26++;
                        }
                    }
                    if (i25 == i14 && i16 + 1 == ((c) arrayList3.get(i24)).j()) {
                        aVar3.u(((Integer) arrayList4.get(i24)).intValue());
                        i15 = i14;
                        aVar2 = aVar4;
                    } else {
                        aVar3.u((int) ((((long) ((int) (aVar4.f4683g / j9))) + j10) * -1));
                        i15 = i14;
                        aVar2 = aVar4;
                        i(j10, aVar4, i16 + 1, arrayList, i24, i14, arrayList2);
                    }
                    aVar4 = aVar2;
                    i24 = i15;
                    j9 = 4;
                }
                a aVar5 = aVar4;
                aVar3.s(aVar5, aVar5.f4683g);
                return;
            }
            int min = Math.min(cVar.j(), cVar2.j());
            int i27 = 0;
            int i28 = i16;
            while (i28 < min && cVar.f(i28) == cVar2.f(i28)) {
                i27++;
                i28++;
            }
            long j11 = 1 + j8 + ((long) ((int) (aVar3.f4683g / 4))) + 2 + ((long) i27);
            aVar3.u(-i27);
            aVar3.u(i12);
            int i29 = i16;
            while (true) {
                i13 = i16 + i27;
                if (i29 >= i13) {
                    break;
                }
                aVar3.u(cVar.f(i29) & 255);
                i29++;
            }
            if (i11 + 1 != i18) {
                a aVar6 = new a();
                aVar3.u((int) ((((long) ((int) (aVar6.f4683g / 4))) + j11) * -1));
                i(j11, aVar6, i13, arrayList, i11, i10, arrayList2);
                aVar3.s(aVar6, aVar6.f4683g);
            } else if (i13 == ((c) arrayList3.get(i11)).j()) {
                aVar3.u(((Integer) arrayList4.get(i11)).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static f j(c... cVarArr) {
        int i8;
        boolean z8 = false;
        if (cVarArr.length == 0) {
            return new f(new c[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(cVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList2.add(-1);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.set(Collections.binarySearch(arrayList, cVarArr[i10]), Integer.valueOf(i10));
        }
        if (((c) arrayList.get(0)).j() != 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                c cVar = (c) arrayList.get(i11);
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < arrayList.size()) {
                    c cVar2 = (c) arrayList.get(i13);
                    cVar2.getClass();
                    if (!cVar2.i(cVar, cVar.j())) {
                        continue;
                        break;
                    } else if (cVar2.j() == cVar.j()) {
                        throw new IllegalArgumentException("duplicate option: " + cVar2);
                    } else if (((Integer) arrayList2.get(i13)).intValue() > ((Integer) arrayList2.get(i11)).intValue()) {
                        arrayList.remove(i13);
                        arrayList2.remove(i13);
                    } else {
                        i13++;
                    }
                }
                i11 = i12;
            }
            a aVar = new a();
            i(0, aVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i14 = (int) (aVar.f4683g / 4);
            int[] iArr = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                long j8 = aVar.f4683g;
                if (j8 >= 4) {
                    j jVar = aVar.f4682f;
                    int i16 = jVar.f4704b;
                    int i17 = jVar.f4705c;
                    if (i17 - i16 < 4) {
                        i8 = ((aVar.d() & 255) << 24) | ((aVar.d() & 255) << 16) | ((aVar.d() & 255) << 8) | (aVar.d() & 255);
                    } else {
                        int i18 = i16 + 1;
                        byte[] bArr = jVar.f4703a;
                        int i19 = i18 + 1;
                        byte b9 = ((bArr[i16] & 255) << 24) | ((bArr[i18] & 255) << 16);
                        int i20 = i19 + 1;
                        byte b10 = b9 | ((bArr[i19] & 255) << 8);
                        int i21 = i20 + 1;
                        byte b11 = b10 | (bArr[i20] & 255);
                        aVar.f4683g = j8 - 4;
                        if (i21 == i17) {
                            aVar.f4682f = jVar.a();
                            k.a(jVar);
                        } else {
                            jVar.f4704b = i21;
                        }
                        i8 = b11;
                    }
                    iArr[i15] = i8;
                    i15++;
                } else {
                    throw new IllegalStateException("size < 4: " + aVar.f4683g);
                }
            }
            if (aVar.f4683g == 0) {
                z8 = true;
            }
            if (z8) {
                return new f((c[]) cVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final Object get(int i8) {
        return this.f4691f[i8];
    }

    public final int size() {
        return this.f4691f.length;
    }
}
