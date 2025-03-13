package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import f0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal<m> f1873j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    public static final Comparator<c> f1874k = new a();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<RecyclerView> f1875f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public long f1876g;

    /* renamed from: h  reason: collision with root package name */
    public long f1877h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<c> f1878i = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r5 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r5 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.m$c r6 = (androidx.recyclerview.widget.m.c) r6
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.RecyclerView r5 = r6.f1886d
                r0 = 0
                r1 = 1
                if (r5 != 0) goto L_0x000c
                r2 = r1
                goto L_0x000d
            L_0x000c:
                r2 = r0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r3 = r7.f1886d
                if (r3 != 0) goto L_0x0013
                r3 = r1
                goto L_0x0014
            L_0x0013:
                r3 = r0
            L_0x0014:
                r4 = -1
                if (r2 == r3) goto L_0x001d
                if (r5 != 0) goto L_0x001b
            L_0x0019:
                r0 = r1
                goto L_0x0037
            L_0x001b:
                r0 = r4
                goto L_0x0037
            L_0x001d:
                boolean r5 = r6.f1883a
                boolean r2 = r7.f1883a
                if (r5 == r2) goto L_0x0026
                if (r5 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r5 = r7.f1884b
                int r1 = r6.f1884b
                int r5 = r5 - r1
                if (r5 == 0) goto L_0x002f
            L_0x002d:
                r0 = r5
                goto L_0x0037
            L_0x002f:
                int r5 = r6.f1885c
                int r6 = r7.f1885c
                int r5 = r5 - r6
                if (r5 == 0) goto L_0x0037
                goto L_0x002d
            L_0x0037:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1879a;

        /* renamed from: b  reason: collision with root package name */
        public int f1880b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1881c;

        /* renamed from: d  reason: collision with root package name */
        public int f1882d;

        public final void a(int i8, int i9) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i9 >= 0) {
                int i10 = this.f1882d * 2;
                int[] iArr = this.f1881c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1881c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i10 >= iArr.length) {
                    int[] iArr3 = new int[(i10 * 2)];
                    this.f1881c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1881c;
                iArr4[i10] = i8;
                iArr4[i10 + 1] = i9;
                this.f1882d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z8) {
            boolean z9 = false;
            this.f1882d = 0;
            int[] iArr = this.f1881c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f1606l;
            if (recyclerView.f1604k != null && lVar != null && lVar.f1667i) {
                if (!z8) {
                    if (!recyclerView.f1620t || recyclerView.B || recyclerView.f1591d.g()) {
                        z9 = true;
                    }
                    if (!z9) {
                        lVar.h(this.f1879a, this.f1880b, recyclerView.f1595f0, this);
                    }
                } else if (!recyclerView.f1591d.g()) {
                    lVar.i(recyclerView.f1604k.c(), this);
                }
                int i8 = this.f1882d;
                if (i8 > lVar.f1668j) {
                    lVar.f1668j = i8;
                    lVar.f1669k = z8;
                    recyclerView.f1587b.k();
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1883a;

        /* renamed from: b  reason: collision with root package name */
        public int f1884b;

        /* renamed from: c  reason: collision with root package name */
        public int f1885c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1886d;
        public int e;
    }

    public static RecyclerView.a0 c(RecyclerView recyclerView, int i8, long j8) {
        boolean z8;
        int h8 = recyclerView.e.h();
        int i9 = 0;
        while (true) {
            if (i9 >= h8) {
                z8 = false;
                break;
            }
            RecyclerView.a0 I = RecyclerView.I(recyclerView.e.g(i9));
            if (I.f1633c == i8 && !I.g()) {
                z8 = true;
                break;
            }
            i9++;
        }
        if (z8) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f1587b;
        try {
            recyclerView.O();
            RecyclerView.a0 i10 = sVar.i(i8, j8);
            if (i10 != null) {
                if (!i10.f() || i10.g()) {
                    sVar.a(i10, false);
                } else {
                    sVar.f(i10.f1631a);
                }
            }
            return i10;
        } finally {
            recyclerView.P(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i8, int i9) {
        if (recyclerView.isAttachedToWindow() && this.f1876g == 0) {
            this.f1876g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1593e0;
        bVar.f1879a = i8;
        bVar.f1880b = i9;
    }

    public final void b(long j8) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f1875f;
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView3 = arrayList.get(i9);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f1593e0;
                bVar.b(recyclerView3, false);
                i8 += bVar.f1882d;
            }
        }
        ArrayList<c> arrayList2 = this.f1878i;
        arrayList2.ensureCapacity(i8);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView4 = arrayList.get(i11);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f1593e0;
                int abs = Math.abs(bVar2.f1879a) + Math.abs(bVar2.f1880b);
                for (int i12 = 0; i12 < bVar2.f1882d * 2; i12 += 2) {
                    if (i10 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i10);
                    }
                    int[] iArr = bVar2.f1881c;
                    int i13 = iArr[i12 + 1];
                    cVar2.f1883a = i13 <= abs;
                    cVar2.f1884b = abs;
                    cVar2.f1885c = i13;
                    cVar2.f1886d = recyclerView4;
                    cVar2.e = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(arrayList2, f1874k);
        for (int i14 = 0; i14 < arrayList2.size() && (recyclerView = cVar.f1886d) != null; i14++) {
            RecyclerView.a0 c9 = c(recyclerView, (cVar = arrayList2.get(i14)).e, cVar.f1883a ? Long.MAX_VALUE : j8);
            if (!(c9 == null || c9.f1632b == null || !c9.f() || c9.g() || (recyclerView2 = c9.f1632b.get()) == null)) {
                if (recyclerView2.B && recyclerView2.e.h() != 0) {
                    RecyclerView.i iVar = recyclerView2.K;
                    if (iVar != null) {
                        iVar.e();
                    }
                    RecyclerView.l lVar = recyclerView2.f1606l;
                    RecyclerView.s sVar = recyclerView2.f1587b;
                    if (lVar != null) {
                        lVar.k0(sVar);
                        recyclerView2.f1606l.l0(sVar);
                    }
                    sVar.f1690a.clear();
                    sVar.d();
                }
                b bVar3 = recyclerView2.f1593e0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f1882d != 0) {
                    try {
                        d.a("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f1595f0;
                        RecyclerView.d dVar = recyclerView2.f1604k;
                        xVar.f1715d = 1;
                        xVar.e = dVar.c();
                        xVar.f1717g = false;
                        xVar.f1718h = false;
                        xVar.f1719i = false;
                        for (int i15 = 0; i15 < bVar3.f1882d * 2; i15 += 2) {
                            c(recyclerView2, bVar3.f1881c[i15], j8);
                        }
                        long j9 = j8;
                        cVar.f1883a = false;
                        cVar.f1884b = 0;
                        cVar.f1885c = 0;
                        cVar.f1886d = null;
                        cVar.e = 0;
                    } finally {
                        d.b();
                    }
                }
            }
            long j10 = j8;
            cVar.f1883a = false;
            cVar.f1884b = 0;
            cVar.f1885c = 0;
            cVar.f1886d = null;
            cVar.e = 0;
        }
    }

    public final void run() {
        try {
            d.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f1875f;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j8 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    RecyclerView recyclerView = arrayList.get(i8);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j8 = Math.max(recyclerView.getDrawingTime(), j8);
                    }
                }
                if (j8 == 0) {
                    this.f1876g = 0;
                    d.b();
                    return;
                }
                b(TimeUnit.MILLISECONDS.toNanos(j8) + this.f1877h);
                this.f1876g = 0;
                d.b();
            }
        } finally {
            this.f1876g = 0;
            d.b();
        }
    }
}
