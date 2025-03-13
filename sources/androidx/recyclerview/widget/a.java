package androidx.recyclerview.widget;

import androidx.recyclerview.widget.q;
import java.util.ArrayList;
import s.e;

public final class a implements q.a {

    /* renamed from: a  reason: collision with root package name */
    public final e f1768a = new e(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1769b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1770c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0015a f1771d;
    public final q e;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0015a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1772a;

        /* renamed from: b  reason: collision with root package name */
        public int f1773b;

        /* renamed from: c  reason: collision with root package name */
        public Object f1774c;

        /* renamed from: d  reason: collision with root package name */
        public int f1775d;

        public b(Object obj, int i8, int i9, int i10) {
            this.f1772a = i8;
            this.f1773b = i9;
            this.f1775d = i10;
            this.f1774c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i8 = this.f1772a;
            if (i8 != bVar.f1772a) {
                return false;
            }
            if (i8 == 8 && Math.abs(this.f1775d - this.f1773b) == 1 && this.f1775d == bVar.f1773b && this.f1773b == bVar.f1775d) {
                return true;
            }
            if (this.f1775d != bVar.f1775d || this.f1773b != bVar.f1773b) {
                return false;
            }
            Object obj2 = this.f1774c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f1774c)) {
                    return false;
                }
            } else if (bVar.f1774c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f1772a * 31) + this.f1773b) * 31) + this.f1775d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i8 = this.f1772a;
            sb.append(i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f1773b);
            sb.append("c:");
            sb.append(this.f1775d);
            sb.append(",p:");
            sb.append(this.f1774c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(w wVar) {
        this.f1771d = wVar;
        this.e = new q(this);
    }

    public final boolean a(int i8) {
        ArrayList<b> arrayList = this.f1770c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = arrayList.get(i9);
            int i10 = bVar.f1772a;
            if (i10 == 8) {
                if (f(bVar.f1775d, i9 + 1) == i8) {
                    return true;
                }
            } else if (i10 == 1) {
                int i11 = bVar.f1773b;
                int i12 = bVar.f1775d + i11;
                while (i11 < i12) {
                    if (f(i11, i9 + 1) == i8) {
                        return true;
                    }
                    i11++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f1770c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((w) this.f1771d).a(arrayList.get(i8));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f1769b;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = arrayList.get(i8);
            int i9 = bVar.f1772a;
            C0015a aVar = this.f1771d;
            if (i9 == 1) {
                w wVar = (w) aVar;
                wVar.a(bVar);
                wVar.d(bVar.f1773b, bVar.f1775d);
            } else if (i9 == 2) {
                w wVar2 = (w) aVar;
                wVar2.a(bVar);
                int i10 = bVar.f1773b;
                int i11 = bVar.f1775d;
                RecyclerView recyclerView = wVar2.f1911a;
                recyclerView.N(i10, true, i11);
                recyclerView.f1601i0 = true;
                recyclerView.f1595f0.f1714c += i11;
            } else if (i9 == 4) {
                w wVar3 = (w) aVar;
                wVar3.a(bVar);
                wVar3.c(bVar.f1773b, bVar.f1775d, bVar.f1774c);
            } else if (i9 == 8) {
                w wVar4 = (w) aVar;
                wVar4.a(bVar);
                wVar4.e(bVar.f1773b, bVar.f1775d);
            }
        }
        l(arrayList);
    }

    public final void d(b bVar) {
        int i8;
        e eVar;
        int i9 = bVar.f1772a;
        if (i9 == 1 || i9 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m8 = m(bVar.f1773b, i9);
        int i10 = bVar.f1773b;
        int i11 = bVar.f1772a;
        if (i11 == 2) {
            i8 = 0;
        } else if (i11 == 4) {
            i8 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i12 = 1;
        int i13 = 1;
        while (true) {
            int i14 = bVar.f1775d;
            eVar = this.f1768a;
            if (i12 >= i14) {
                break;
            }
            int m9 = m(bVar.f1773b + (i8 * i12), bVar.f1772a);
            int i15 = bVar.f1772a;
            if (i15 == 2 ? m9 == m8 : i15 == 4 && m9 == m8 + 1) {
                i13++;
            } else {
                b h8 = h(bVar.f1774c, i15, m8, i13);
                e(h8, i10);
                h8.f1774c = null;
                eVar.a(h8);
                if (bVar.f1772a == 4) {
                    i10 += i13;
                }
                i13 = 1;
                m8 = m9;
            }
            i12++;
        }
        Object obj = bVar.f1774c;
        bVar.f1774c = null;
        eVar.a(bVar);
        if (i13 > 0) {
            b h9 = h(obj, bVar.f1772a, m8, i13);
            e(h9, i10);
            h9.f1774c = null;
            eVar.a(h9);
        }
    }

    public final void e(b bVar, int i8) {
        w wVar = (w) this.f1771d;
        wVar.a(bVar);
        int i9 = bVar.f1772a;
        if (i9 == 2) {
            int i10 = bVar.f1775d;
            RecyclerView recyclerView = wVar.f1911a;
            recyclerView.N(i8, true, i10);
            recyclerView.f1601i0 = true;
            recyclerView.f1595f0.f1714c += i10;
        } else if (i9 == 4) {
            wVar.c(i8, bVar.f1775d, bVar.f1774c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i8, int i9) {
        ArrayList<b> arrayList = this.f1770c;
        int size = arrayList.size();
        while (i9 < size) {
            b bVar = arrayList.get(i9);
            int i10 = bVar.f1772a;
            if (i10 == 8) {
                int i11 = bVar.f1773b;
                if (i11 == i8) {
                    i8 = bVar.f1775d;
                } else {
                    if (i11 < i8) {
                        i8--;
                    }
                    if (bVar.f1775d <= i8) {
                        i8++;
                    }
                }
            } else {
                int i12 = bVar.f1773b;
                if (i12 > i8) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = bVar.f1775d;
                    if (i8 < i12 + i13) {
                        return -1;
                    }
                    i8 -= i13;
                } else if (i10 == 1) {
                    i8 += bVar.f1775d;
                }
            }
            i9++;
        }
        return i8;
    }

    public final boolean g() {
        return this.f1769b.size() > 0;
    }

    public final b h(Object obj, int i8, int i9, int i10) {
        b bVar = (b) this.f1768a.b();
        if (bVar == null) {
            return new b(obj, i8, i9, i10);
        }
        bVar.f1772a = i8;
        bVar.f1773b = i9;
        bVar.f1775d = i10;
        bVar.f1774c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f1770c.add(bVar);
        int i8 = bVar.f1772a;
        C0015a aVar = this.f1771d;
        if (i8 == 1) {
            ((w) aVar).d(bVar.f1773b, bVar.f1775d);
        } else if (i8 == 2) {
            int i9 = bVar.f1773b;
            int i10 = bVar.f1775d;
            RecyclerView recyclerView = ((w) aVar).f1911a;
            recyclerView.N(i9, false, i10);
            recyclerView.f1601i0 = true;
        } else if (i8 == 4) {
            ((w) aVar).c(bVar.f1773b, bVar.f1775d, bVar.f1774c);
        } else if (i8 == 8) {
            ((w) aVar).e(bVar.f1773b, bVar.f1775d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015d, code lost:
        if (r5 > r12.f1773b) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
        if (r5 >= r12.f1773b) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1769b
            androidx.recyclerview.widget.q r2 = r0.e
            r2.getClass()
        L_0x0009:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r1.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f1772a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01cf
            int r7 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r1.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f1772a
            if (r13 == r4) goto L_0x01a5
            androidx.recyclerview.widget.q$a r8 = r2.f1904a
            if (r13 == r10) goto L_0x00af
            if (r13 == r9) goto L_0x0045
            goto L_0x0009
        L_0x0045:
            int r5 = r11.f1775d
            int r10 = r12.f1773b
            if (r5 >= r10) goto L_0x0050
            int r10 = r10 + -1
            r12.f1773b = r10
            goto L_0x0065
        L_0x0050:
            int r13 = r12.f1775d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0065
            int r13 = r13 + -1
            r12.f1775d = r13
            int r5 = r11.f1773b
            java.lang.Object r10 = r12.f1774c
            r13 = r8
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r10, r9, r5, r4)
            goto L_0x0066
        L_0x0065:
            r4 = r6
        L_0x0066:
            int r5 = r11.f1773b
            int r10 = r12.f1773b
            if (r5 > r10) goto L_0x0071
            int r10 = r10 + 1
            r12.f1773b = r10
            goto L_0x0088
        L_0x0071:
            int r13 = r12.f1775d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0088
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f1774c
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r5 = r14.h(r13, r9, r5, r10)
            int r9 = r12.f1775d
            int r9 = r9 - r10
            r12.f1775d = r9
            goto L_0x0089
        L_0x0088:
            r5 = r6
        L_0x0089:
            r1.set(r7, r11)
            int r7 = r12.f1775d
            if (r7 <= 0) goto L_0x0094
            r1.set(r3, r12)
            goto L_0x00a3
        L_0x0094:
            r1.remove(r3)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f1774c = r6
            s.e r6 = r8.f1768a
            r6.a(r12)
        L_0x00a3:
            if (r4 == 0) goto L_0x00a8
            r1.add(r3, r4)
        L_0x00a8:
            if (r5 == 0) goto L_0x0009
            r1.add(r3, r5)
            goto L_0x0009
        L_0x00af:
            int r9 = r11.f1773b
            int r13 = r11.f1775d
            int r14 = r12.f1773b
            if (r9 >= r13) goto L_0x00c4
            if (r14 != r9) goto L_0x00c2
            int r15 = r12.f1775d
            int r9 = r13 - r9
            if (r15 != r9) goto L_0x00c2
            r5 = r4
            r9 = 0
            goto L_0x00d2
        L_0x00c2:
            r5 = 0
            goto L_0x00ce
        L_0x00c4:
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00d0
            int r15 = r12.f1775d
            int r9 = r9 - r13
            if (r15 != r9) goto L_0x00d0
            r5 = r4
        L_0x00ce:
            r9 = r5
            goto L_0x00d2
        L_0x00d0:
            r9 = r4
            r5 = 0
        L_0x00d2:
            if (r13 >= r14) goto L_0x00d9
            int r14 = r14 + -1
            r12.f1773b = r14
            goto L_0x00fb
        L_0x00d9:
            int r15 = r12.f1775d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00fb
            int r15 = r15 + -1
            r12.f1775d = r15
            r11.f1772a = r10
            r11.f1775d = r4
            int r3 = r12.f1775d
            if (r3 != 0) goto L_0x0009
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r12.f1774c = r6
            s.e r3 = r8.f1768a
            r3.a(r12)
            goto L_0x0009
        L_0x00fb:
            int r4 = r11.f1773b
            int r13 = r12.f1773b
            if (r4 > r13) goto L_0x0106
            int r13 = r13 + 1
            r12.f1773b = r13
            goto L_0x011d
        L_0x0106:
            int r14 = r12.f1775d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x011d
            int r13 = r13 - r4
            int r4 = r4 + 1
            r14 = r8
            androidx.recyclerview.widget.a r14 = (androidx.recyclerview.widget.a) r14
            androidx.recyclerview.widget.a$b r4 = r14.h(r6, r10, r4, r13)
            int r10 = r11.f1773b
            int r13 = r12.f1773b
            int r10 = r10 - r13
            r12.f1775d = r10
            goto L_0x011e
        L_0x011d:
            r4 = r6
        L_0x011e:
            if (r5 == 0) goto L_0x0134
            r1.set(r3, r12)
            r1.remove(r7)
            androidx.recyclerview.widget.a r8 = (androidx.recyclerview.widget.a) r8
            r8.getClass()
            r11.f1774c = r6
            s.e r3 = r8.f1768a
            r3.a(r11)
            goto L_0x0009
        L_0x0134:
            if (r9 == 0) goto L_0x0160
            if (r4 == 0) goto L_0x014e
            int r5 = r11.f1773b
            int r6 = r4.f1773b
            if (r5 <= r6) goto L_0x0143
            int r6 = r4.f1775d
            int r5 = r5 - r6
            r11.f1773b = r5
        L_0x0143:
            int r5 = r11.f1775d
            int r6 = r4.f1773b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.f1775d
            int r5 = r5 - r6
            r11.f1775d = r5
        L_0x014e:
            int r5 = r11.f1773b
            int r6 = r12.f1773b
            if (r5 <= r6) goto L_0x0159
            int r6 = r12.f1775d
            int r5 = r5 - r6
            r11.f1773b = r5
        L_0x0159:
            int r5 = r11.f1775d
            int r6 = r12.f1773b
            if (r5 <= r6) goto L_0x018e
            goto L_0x0189
        L_0x0160:
            if (r4 == 0) goto L_0x0178
            int r5 = r11.f1773b
            int r6 = r4.f1773b
            if (r5 < r6) goto L_0x016d
            int r6 = r4.f1775d
            int r5 = r5 - r6
            r11.f1773b = r5
        L_0x016d:
            int r5 = r11.f1775d
            int r6 = r4.f1773b
            if (r5 < r6) goto L_0x0178
            int r6 = r4.f1775d
            int r5 = r5 - r6
            r11.f1775d = r5
        L_0x0178:
            int r5 = r11.f1773b
            int r6 = r12.f1773b
            if (r5 < r6) goto L_0x0183
            int r6 = r12.f1775d
            int r5 = r5 - r6
            r11.f1773b = r5
        L_0x0183:
            int r5 = r11.f1775d
            int r6 = r12.f1773b
            if (r5 < r6) goto L_0x018e
        L_0x0189:
            int r6 = r12.f1775d
            int r5 = r5 - r6
            r11.f1775d = r5
        L_0x018e:
            r1.set(r3, r12)
            int r5 = r11.f1773b
            int r6 = r11.f1775d
            if (r5 == r6) goto L_0x019b
            r1.set(r7, r11)
            goto L_0x019e
        L_0x019b:
            r1.remove(r7)
        L_0x019e:
            if (r4 == 0) goto L_0x0009
            r1.add(r3, r4)
            goto L_0x0009
        L_0x01a5:
            int r4 = r11.f1775d
            int r6 = r12.f1773b
            if (r4 >= r6) goto L_0x01ad
            r5 = r8
            goto L_0x01ae
        L_0x01ad:
            r5 = 0
        L_0x01ae:
            int r8 = r11.f1773b
            if (r8 >= r6) goto L_0x01b4
            int r5 = r5 + 1
        L_0x01b4:
            if (r6 > r8) goto L_0x01bb
            int r6 = r12.f1775d
            int r8 = r8 + r6
            r11.f1773b = r8
        L_0x01bb:
            int r6 = r12.f1773b
            if (r6 > r4) goto L_0x01c4
            int r8 = r12.f1775d
            int r4 = r4 + r8
            r11.f1775d = r4
        L_0x01c4:
            int r6 = r6 + r5
            r12.f1773b = r6
            r1.set(r3, r12)
            r1.set(r7, r11)
            goto L_0x0009
        L_0x01cf:
            int r2 = r1.size()
            r3 = 0
        L_0x01d4:
            if (r3 >= r2) goto L_0x02af
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            int r12 = r11.f1772a
            if (r12 == r4) goto L_0x02a3
            s.e r13 = r0.f1768a
            androidx.recyclerview.widget.a$a r14 = r0.f1771d
            if (r12 == r10) goto L_0x0247
            if (r12 == r9) goto L_0x01f1
            if (r12 == r7) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            r0.i(r11)
        L_0x01ee:
            r7 = r10
            goto L_0x02a7
        L_0x01f1:
            int r12 = r11.f1773b
            int r15 = r11.f1775d
            int r15 = r15 + r12
            r5 = r12
            r7 = 0
        L_0x01f8:
            if (r12 >= r15) goto L_0x022c
            r10 = r14
            androidx.recyclerview.widget.w r10 = (androidx.recyclerview.widget.w) r10
            androidx.recyclerview.widget.RecyclerView$a0 r10 = r10.b(r12)
            if (r10 != 0) goto L_0x0219
            boolean r10 = r0.a(r12)
            if (r10 == 0) goto L_0x020a
            goto L_0x0219
        L_0x020a:
            if (r8 != r4) goto L_0x0217
            java.lang.Object r8 = r11.f1774c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.i(r5)
            r5 = r12
            r7 = 0
        L_0x0217:
            r8 = 0
            goto L_0x0227
        L_0x0219:
            if (r8 != 0) goto L_0x0226
            java.lang.Object r8 = r11.f1774c
            androidx.recyclerview.widget.a$b r5 = r0.h(r8, r9, r5, r7)
            r0.d(r5)
            r5 = r12
            r7 = 0
        L_0x0226:
            r8 = r4
        L_0x0227:
            int r7 = r7 + r4
            int r12 = r12 + 1
            r10 = 2
            goto L_0x01f8
        L_0x022c:
            int r10 = r11.f1775d
            if (r7 == r10) goto L_0x023b
            java.lang.Object r10 = r11.f1774c
            r11.f1774c = r6
            r13.a(r11)
            androidx.recyclerview.widget.a$b r11 = r0.h(r10, r9, r5, r7)
        L_0x023b:
            if (r8 != 0) goto L_0x0241
            r0.d(r11)
            goto L_0x0244
        L_0x0241:
            r0.i(r11)
        L_0x0244:
            r7 = 2
            goto L_0x02a7
        L_0x0247:
            int r5 = r11.f1773b
            int r7 = r11.f1775d
            int r7 = r7 + r5
            r8 = r5
            r10 = 0
            r12 = -1
        L_0x024f:
            if (r8 >= r7) goto L_0x0289
            r15 = r14
            androidx.recyclerview.widget.w r15 = (androidx.recyclerview.widget.w) r15
            androidx.recyclerview.widget.RecyclerView$a0 r15 = r15.b(r8)
            if (r15 != 0) goto L_0x0270
            boolean r15 = r0.a(r8)
            if (r15 == 0) goto L_0x0261
            goto L_0x0270
        L_0x0261:
            r15 = 2
            if (r12 != r4) goto L_0x026d
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.i(r12)
            r12 = r4
            goto L_0x026e
        L_0x026d:
            r12 = 0
        L_0x026e:
            r15 = 0
            goto L_0x027e
        L_0x0270:
            r15 = 2
            if (r12 != 0) goto L_0x027c
            androidx.recyclerview.widget.a$b r12 = r0.h(r6, r15, r5, r10)
            r0.d(r12)
            r12 = r4
            goto L_0x027d
        L_0x027c:
            r12 = 0
        L_0x027d:
            r15 = r4
        L_0x027e:
            if (r12 == 0) goto L_0x0284
            int r8 = r8 - r10
            int r7 = r7 - r10
            r10 = r4
            goto L_0x0286
        L_0x0284:
            int r10 = r10 + 1
        L_0x0286:
            int r8 = r8 + r4
            r12 = r15
            goto L_0x024f
        L_0x0289:
            int r7 = r11.f1775d
            if (r10 == r7) goto L_0x0298
            r11.f1774c = r6
            r13.a(r11)
            r7 = 2
            androidx.recyclerview.widget.a$b r11 = r0.h(r6, r7, r5, r10)
            goto L_0x0299
        L_0x0298:
            r7 = 2
        L_0x0299:
            if (r12 != 0) goto L_0x029f
            r0.d(r11)
            goto L_0x02a7
        L_0x029f:
            r0.i(r11)
            goto L_0x02a7
        L_0x02a3:
            r7 = r10
            r0.i(r11)
        L_0x02a7:
            int r3 = r3 + 1
            r10 = r7
            r7 = 8
            r8 = -1
            goto L_0x01d4
        L_0x02af:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f1774c = null;
        this.f1768a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k((b) arrayList.get(i8));
        }
        arrayList.clear();
    }

    public final int m(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList<b> arrayList = this.f1770c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i16 = bVar.f1772a;
            if (i16 == 8) {
                int i17 = bVar.f1773b;
                int i18 = bVar.f1775d;
                if (i17 < i18) {
                    i12 = i17;
                    i11 = i18;
                } else {
                    i11 = i17;
                    i12 = i18;
                }
                if (i8 < i12 || i8 > i11) {
                    if (i8 < i17) {
                        if (i9 == 1) {
                            bVar.f1773b = i17 + 1;
                            i13 = i18 + 1;
                        } else if (i9 == 2) {
                            bVar.f1773b = i17 - 1;
                            i13 = i18 - 1;
                        }
                        bVar.f1775d = i13;
                    }
                } else if (i12 == i17) {
                    if (i9 == 1) {
                        i15 = i18 + 1;
                    } else {
                        if (i9 == 2) {
                            i15 = i18 - 1;
                        }
                        i8++;
                    }
                    bVar.f1775d = i15;
                    i8++;
                } else {
                    if (i9 == 1) {
                        i14 = i17 + 1;
                    } else {
                        if (i9 == 2) {
                            i14 = i17 - 1;
                        }
                        i8--;
                    }
                    bVar.f1773b = i14;
                    i8--;
                }
            } else {
                int i19 = bVar.f1773b;
                if (i19 > i8) {
                    if (i9 == 1) {
                        i10 = i19 + 1;
                    } else if (i9 == 2) {
                        i10 = i19 - 1;
                    }
                    bVar.f1773b = i10;
                } else if (i16 == 1) {
                    i8 -= bVar.f1775d;
                } else if (i16 == 2) {
                    i8 += bVar.f1775d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f1772a == 8) {
                int i20 = bVar2.f1775d;
                if (i20 != bVar2.f1773b && i20 >= 0) {
                }
            } else if (bVar2.f1775d > 0) {
            }
            arrayList.remove(size2);
            k(bVar2);
        }
        return i8;
    }
}
