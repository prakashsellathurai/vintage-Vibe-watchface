package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import j0.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.w.b {
    public int A;
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final Runnable K;

    /* renamed from: p  reason: collision with root package name */
    public int f1732p = -1;

    /* renamed from: q  reason: collision with root package name */
    public f[] f1733q;
    public t r;

    /* renamed from: s  reason: collision with root package name */
    public t f1734s;

    /* renamed from: t  reason: collision with root package name */
    public int f1735t;

    /* renamed from: u  reason: collision with root package name */
    public int f1736u;

    /* renamed from: v  reason: collision with root package name */
    public final n f1737v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1738x;
    public BitSet y;

    /* renamed from: z  reason: collision with root package name */
    public int f1739z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.F0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1741a;

        /* renamed from: b  reason: collision with root package name */
        public int f1742b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1743c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1744d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1745f;

        public b() {
            a();
        }

        public final void a() {
            this.f1741a = -1;
            this.f1742b = Integer.MIN_VALUE;
            this.f1743c = false;
            this.f1744d = false;
            this.e = false;
            int[] iArr = this.f1745f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {
        public f e;

        public c(int i8, int i9) {
            super(i8, i9);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1747a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1748b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0014a();

            /* renamed from: f  reason: collision with root package name */
            public int f1749f;

            /* renamed from: g  reason: collision with root package name */
            public int f1750g;

            /* renamed from: h  reason: collision with root package name */
            public int[] f1751h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f1752i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0014a implements Parcelable.Creator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final Object[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1749f = parcel.readInt();
                this.f1750g = parcel.readInt();
                this.f1752i = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1751h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f1749f + ", mGapDir=" + this.f1750g + ", mHasUnwantedGapAfter=" + this.f1752i + ", mGapPerSpan=" + Arrays.toString(this.f1751h) + '}';
            }

            public final void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.f1749f);
                parcel.writeInt(this.f1750g);
                parcel.writeInt(this.f1752i ? 1 : 0);
                int[] iArr = this.f1751h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1751h);
            }
        }

        public final void a() {
            int[] iArr = this.f1747a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1748b = null;
        }

        public final void b(int i8) {
            int[] iArr = this.f1747a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i8, 10) + 1)];
                this.f1747a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int length = iArr.length;
                while (length <= i8) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1747a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1747a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f1747a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1748b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1748b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f1749f
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1748b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1748b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1748b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f1749f
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f1748b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f1748b
                r3.remove(r2)
                int r0 = r0.f1749f
                goto L_0x005f
            L_0x005e:
                r0 = r1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f1747a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r5 = r5.f1747a
                int r5 = r5.length
                return r5
            L_0x006b:
                int r0 = r0 + 1
                int[] r2 = r5.f1747a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r5 = r5.f1747a
                java.util.Arrays.fill(r5, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.c(int):int");
        }

        public final void d(int i8, int i9) {
            int[] iArr = this.f1747a;
            if (iArr != null && i8 < iArr.length) {
                int i10 = i8 + i9;
                b(i10);
                int[] iArr2 = this.f1747a;
                System.arraycopy(iArr2, i8, iArr2, i10, (iArr2.length - i8) - i9);
                Arrays.fill(this.f1747a, i8, i10, -1);
                List<a> list = this.f1748b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1748b.get(size);
                        int i11 = aVar.f1749f;
                        if (i11 >= i8) {
                            aVar.f1749f = i11 + i9;
                        }
                    }
                }
            }
        }

        public final void e(int i8, int i9) {
            int[] iArr = this.f1747a;
            if (iArr != null && i8 < iArr.length) {
                int i10 = i8 + i9;
                b(i10);
                int[] iArr2 = this.f1747a;
                System.arraycopy(iArr2, i10, iArr2, i8, (iArr2.length - i8) - i9);
                int[] iArr3 = this.f1747a;
                Arrays.fill(iArr3, iArr3.length - i9, iArr3.length, -1);
                List<a> list = this.f1748b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1748b.get(size);
                        int i11 = aVar.f1749f;
                        if (i11 >= i8) {
                            if (i11 < i10) {
                                this.f1748b.remove(size);
                            } else {
                                aVar.f1749f = i11 - i9;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f1753f;

        /* renamed from: g  reason: collision with root package name */
        public int f1754g;

        /* renamed from: h  reason: collision with root package name */
        public int f1755h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f1756i;

        /* renamed from: j  reason: collision with root package name */
        public int f1757j;

        /* renamed from: k  reason: collision with root package name */
        public int[] f1758k;

        /* renamed from: l  reason: collision with root package name */
        public List<d.a> f1759l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1760m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1761n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1762o;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1753f = parcel.readInt();
            this.f1754g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1755h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1756i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1757j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1758k = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z8 = false;
            this.f1760m = parcel.readInt() == 1;
            this.f1761n = parcel.readInt() == 1;
            this.f1762o = parcel.readInt() == 1 ? true : z8;
            this.f1759l = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1755h = eVar.f1755h;
            this.f1753f = eVar.f1753f;
            this.f1754g = eVar.f1754g;
            this.f1756i = eVar.f1756i;
            this.f1757j = eVar.f1757j;
            this.f1758k = eVar.f1758k;
            this.f1760m = eVar.f1760m;
            this.f1761n = eVar.f1761n;
            this.f1762o = eVar.f1762o;
            this.f1759l = eVar.f1759l;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f1753f);
            parcel.writeInt(this.f1754g);
            parcel.writeInt(this.f1755h);
            if (this.f1755h > 0) {
                parcel.writeIntArray(this.f1756i);
            }
            parcel.writeInt(this.f1757j);
            if (this.f1757j > 0) {
                parcel.writeIntArray(this.f1758k);
            }
            parcel.writeInt(this.f1760m ? 1 : 0);
            parcel.writeInt(this.f1761n ? 1 : 0);
            parcel.writeInt(this.f1762o ? 1 : 0);
            parcel.writeList(this.f1759l);
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f1763a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1764b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1765c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f1766d = 0;
        public final int e;

        public f(int i8) {
            this.e = i8;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f1763a;
            View view = arrayList.get(arrayList.size() - 1);
            c h8 = h(view);
            this.f1765c = StaggeredGridLayoutManager.this.r.b(view);
            h8.getClass();
        }

        public final void b() {
            this.f1763a.clear();
            this.f1764b = Integer.MIN_VALUE;
            this.f1765c = Integer.MIN_VALUE;
            this.f1766d = 0;
        }

        public final int c() {
            boolean z8 = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.f1763a;
            return z8 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z8 = StaggeredGridLayoutManager.this.w;
            ArrayList<View> arrayList = this.f1763a;
            return z8 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i8, int i9) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k8 = staggeredGridLayoutManager.r.k();
            int g9 = staggeredGridLayoutManager.r.g();
            int i10 = i9 > i8 ? 1 : -1;
            while (i8 != i9) {
                View view = this.f1763a.get(i8);
                int e4 = staggeredGridLayoutManager.r.e(view);
                int b9 = staggeredGridLayoutManager.r.b(view);
                boolean z8 = false;
                boolean z9 = e4 <= g9;
                if (b9 >= k8) {
                    z8 = true;
                }
                if (z9 && z8 && (e4 < k8 || b9 > g9)) {
                    return RecyclerView.l.H(view);
                }
                i8 += i10;
            }
            return -1;
        }

        public final int f(int i8) {
            int i9 = this.f1765c;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            if (this.f1763a.size() == 0) {
                return i8;
            }
            a();
            return this.f1765c;
        }

        public final View g(int i8, int i9) {
            ArrayList<View> arrayList = this.f1763a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i9 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.w && RecyclerView.l.H(view2) >= i8) || ((!staggeredGridLayoutManager.w && RecyclerView.l.H(view2) <= i8) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    View view3 = arrayList.get(i10);
                    if ((staggeredGridLayoutManager.w && RecyclerView.l.H(view3) <= i8) || ((!staggeredGridLayoutManager.w && RecyclerView.l.H(view3) >= i8) || !view3.hasFocusable())) {
                        break;
                    }
                    i10++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i8) {
            int i9 = this.f1764b;
            if (i9 != Integer.MIN_VALUE) {
                return i9;
            }
            ArrayList<View> arrayList = this.f1763a;
            if (arrayList.size() == 0) {
                return i8;
            }
            View view = arrayList.get(0);
            c h8 = h(view);
            this.f1764b = StaggeredGridLayoutManager.this.r.e(view);
            h8.getClass();
            return this.f1764b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.w = false;
        this.f1738x = false;
        this.f1739z = -1;
        this.A = Integer.MIN_VALUE;
        d dVar = new d();
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.l.d I2 = RecyclerView.l.I(context, attributeSet, i8, i9);
        int i10 = I2.f1676a;
        if (i10 == 0 || i10 == 1) {
            c((String) null);
            if (i10 != this.f1735t) {
                this.f1735t = i10;
                t tVar = this.r;
                this.r = this.f1734s;
                this.f1734s = tVar;
                p0();
            }
            int i11 = I2.f1677b;
            c((String) null);
            if (i11 != this.f1732p) {
                dVar.a();
                p0();
                this.f1732p = i11;
                this.y = new BitSet(this.f1732p);
                this.f1733q = new f[this.f1732p];
                for (int i12 = 0; i12 < this.f1732p; i12++) {
                    this.f1733q[i12] = new f(i12);
                }
                p0();
            }
            boolean z8 = I2.f1678c;
            c((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.f1760m == z8)) {
                eVar.f1760m = z8;
            }
            this.w = z8;
            p0();
            this.f1737v = new n();
            this.r = t.a(this, this.f1735t);
            this.f1734s = t.a(this, 1 - this.f1735t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int g1(int i8, int i9, int i10) {
        if (i9 == 0 && i10 == 0) {
            return i8;
        }
        int mode = View.MeasureSpec.getMode(i8);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - i9) - i10), mode) : i8;
    }

    public final void B0(RecyclerView recyclerView, int i8) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1699a = i8;
        C0(oVar);
    }

    public final boolean D0() {
        return this.F == null;
    }

    public final int E0(int i8) {
        if (w() == 0) {
            return this.f1738x ? 1 : -1;
        }
        return (i8 < O0()) != this.f1738x ? -1 : 1;
    }

    public final boolean F0() {
        int i8;
        if (!(w() == 0 || this.C == 0 || !this.f1665g)) {
            if (this.f1738x) {
                i8 = P0();
                O0();
            } else {
                i8 = O0();
                P0();
            }
            if (i8 == 0 && T0() != null) {
                this.B.a();
                this.f1664f = true;
                p0();
                return true;
            }
        }
        return false;
    }

    public final int G0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.r;
        boolean z8 = this.I;
        return y.a(xVar, tVar, L0(!z8), K0(!z8), this, this.I);
    }

    public final int H0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.r;
        boolean z8 = this.I;
        return y.b(xVar, tVar, L0(!z8), K0(!z8), this, this.I, this.f1738x);
    }

    public final int I0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.r;
        boolean z8 = this.I;
        return y.c(xVar, tVar, L0(!z8), K0(!z8), this, this.I);
    }

    public final int J0(RecyclerView.s sVar, n nVar, RecyclerView.x xVar) {
        f fVar;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView.s sVar2 = sVar;
        n nVar2 = nVar;
        int i19 = 0;
        int i20 = 1;
        this.y.set(0, this.f1732p, true);
        n nVar3 = this.f1737v;
        int i21 = nVar3.f1894i ? nVar2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar2.e == 1 ? nVar2.f1892g + nVar2.f1888b : nVar2.f1891f - nVar2.f1888b;
        int i22 = nVar2.e;
        for (int i23 = 0; i23 < this.f1732p; i23++) {
            if (!this.f1733q[i23].f1763a.isEmpty()) {
                f1(this.f1733q[i23], i22, i21);
            }
        }
        int g9 = this.f1738x ? this.r.g() : this.r.k();
        boolean z9 = false;
        while (true) {
            int i24 = nVar2.f1889c;
            if (((i24 < 0 || i24 >= xVar.b()) ? i19 : i20) == 0 || (!nVar3.f1894i && this.y.isEmpty())) {
                int i25 = i19;
            } else {
                View view = sVar2.i(nVar2.f1889c, Long.MAX_VALUE).f1631a;
                nVar2.f1889c += nVar2.f1890d;
                c cVar = (c) view.getLayoutParams();
                int a9 = cVar.a();
                d dVar = this.B;
                int[] iArr = dVar.f1747a;
                int i26 = (iArr == null || a9 >= iArr.length) ? -1 : iArr[a9];
                if ((i26 == -1 ? i20 : i19) != 0) {
                    if (W0(nVar2.e)) {
                        i18 = this.f1732p - i20;
                        i17 = -1;
                        i16 = -1;
                    } else {
                        i16 = i20;
                        i17 = this.f1732p;
                        i18 = i19;
                    }
                    f fVar2 = null;
                    if (nVar2.e == i20) {
                        int k8 = this.r.k();
                        int i27 = Integer.MAX_VALUE;
                        while (i18 != i17) {
                            f fVar3 = this.f1733q[i18];
                            int f9 = fVar3.f(k8);
                            if (f9 < i27) {
                                i27 = f9;
                                fVar2 = fVar3;
                            }
                            i18 += i16;
                        }
                    } else {
                        int g10 = this.r.g();
                        int i28 = Integer.MIN_VALUE;
                        while (i18 != i17) {
                            f fVar4 = this.f1733q[i18];
                            int i29 = fVar4.i(g10);
                            if (i29 > i28) {
                                fVar2 = fVar4;
                                i28 = i29;
                            }
                            i18 += i16;
                        }
                    }
                    fVar = fVar2;
                    dVar.b(a9);
                    dVar.f1747a[a9] = fVar.e;
                } else {
                    fVar = this.f1733q[i26];
                }
                cVar.e = fVar;
                if (nVar2.e == 1) {
                    z8 = false;
                    b(view, -1, false);
                } else {
                    z8 = false;
                    b(view, 0, false);
                }
                if (this.f1735t == 1) {
                    i10 = RecyclerView.l.x(z8, this.f1736u, this.f1670l, z8 ? 1 : 0, cVar.width);
                    i9 = RecyclerView.l.x(true, this.f1673o, this.f1671m, G() + D(), cVar.height);
                    i8 = 0;
                } else {
                    i10 = RecyclerView.l.x(true, this.f1672n, this.f1670l, E() + F(), cVar.width);
                    i8 = 0;
                    i9 = RecyclerView.l.x(false, this.f1736u, this.f1671m, 0, cVar.height);
                }
                RecyclerView recyclerView = this.f1661b;
                Rect rect = this.G;
                if (recyclerView == null) {
                    rect.set(i8, i8, i8, i8);
                } else {
                    rect.set(recyclerView.J(view));
                }
                c cVar2 = (c) view.getLayoutParams();
                int g12 = g1(i10, cVar2.leftMargin + rect.left, cVar2.rightMargin + rect.right);
                int g13 = g1(i9, cVar2.topMargin + rect.top, cVar2.bottomMargin + rect.bottom);
                if (y0(view, g12, g13, cVar2)) {
                    view.measure(g12, g13);
                }
                if (nVar2.e == 1) {
                    i12 = fVar.f(g9);
                    i11 = this.r.c(view) + i12;
                } else {
                    i11 = fVar.i(g9);
                    i12 = i11 - this.r.c(view);
                }
                int i30 = nVar2.e;
                f fVar5 = cVar.e;
                fVar5.getClass();
                if (i30 == 1) {
                    c cVar3 = (c) view.getLayoutParams();
                    cVar3.e = fVar5;
                    ArrayList<View> arrayList = fVar5.f1763a;
                    arrayList.add(view);
                    fVar5.f1765c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        fVar5.f1764b = Integer.MIN_VALUE;
                    }
                    if (cVar3.c() || cVar3.b()) {
                        fVar5.f1766d += StaggeredGridLayoutManager.this.r.c(view);
                    }
                } else {
                    c cVar4 = (c) view.getLayoutParams();
                    cVar4.e = fVar5;
                    ArrayList<View> arrayList2 = fVar5.f1763a;
                    arrayList2.add(0, view);
                    fVar5.f1764b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        fVar5.f1765c = Integer.MIN_VALUE;
                    }
                    if (cVar4.c() || cVar4.b()) {
                        fVar5.f1766d += StaggeredGridLayoutManager.this.r.c(view);
                    }
                }
                if (!U0() || this.f1735t != 1) {
                    i13 = this.f1734s.k() + (fVar.e * this.f1736u);
                    i14 = this.f1734s.c(view) + i13;
                } else {
                    i14 = this.f1734s.g() - (((this.f1732p - 1) - fVar.e) * this.f1736u);
                    i13 = i14 - this.f1734s.c(view);
                }
                if (this.f1735t == 1) {
                    int i31 = i13;
                    i13 = i12;
                    i12 = i31;
                    int i32 = i14;
                    i14 = i11;
                    i11 = i32;
                }
                RecyclerView.l.P(view, i12, i13, i11, i14);
                f1(fVar, nVar3.e, i21);
                Y0(sVar2, nVar3);
                if (!nVar3.f1893h || !view.hasFocusable()) {
                    i15 = 0;
                } else {
                    i15 = 0;
                    this.y.set(fVar.e, false);
                }
                i19 = i15;
                i20 = 1;
                z9 = true;
            }
        }
        int i252 = i19;
        if (!z9) {
            Y0(sVar2, nVar3);
        }
        int k9 = nVar3.e == -1 ? this.r.k() - R0(this.r.k()) : Q0(this.r.g()) - this.r.g();
        return k9 > 0 ? Math.min(nVar2.f1888b, k9) : i252;
    }

    public final View K0(boolean z8) {
        int k8 = this.r.k();
        int g9 = this.r.g();
        View view = null;
        for (int w8 = w() - 1; w8 >= 0; w8--) {
            View v8 = v(w8);
            int e4 = this.r.e(v8);
            int b9 = this.r.b(v8);
            if (b9 > k8 && e4 < g9) {
                if (b9 <= g9 || !z8) {
                    return v8;
                }
                if (view == null) {
                    view = v8;
                }
            }
        }
        return view;
    }

    public final View L0(boolean z8) {
        int k8 = this.r.k();
        int g9 = this.r.g();
        int w8 = w();
        View view = null;
        for (int i8 = 0; i8 < w8; i8++) {
            View v8 = v(i8);
            int e4 = this.r.e(v8);
            if (this.r.b(v8) > k8 && e4 < g9) {
                if (e4 >= k8 || !z8) {
                    return v8;
                }
                if (view == null) {
                    view = v8;
                }
            }
        }
        return view;
    }

    public final void M0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z8) {
        int g9;
        int Q0 = Q0(Integer.MIN_VALUE);
        if (Q0 != Integer.MIN_VALUE && (g9 = this.r.g() - Q0) > 0) {
            int i8 = g9 - (-c1(-g9, sVar, xVar));
            if (z8 && i8 > 0) {
                this.r.p(i8);
            }
        }
    }

    public final boolean N() {
        return this.C != 0;
    }

    public final void N0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z8) {
        int k8;
        int R0 = R0(Integer.MAX_VALUE);
        if (R0 != Integer.MAX_VALUE && (k8 = R0 - this.r.k()) > 0) {
            int c12 = k8 - c1(k8, sVar, xVar);
            if (z8 && c12 > 0) {
                this.r.p(-c12);
            }
        }
    }

    public final int O0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.l.H(v(0));
    }

    public final int P0() {
        int w8 = w();
        if (w8 == 0) {
            return 0;
        }
        return RecyclerView.l.H(v(w8 - 1));
    }

    public final void Q(int i8) {
        super.Q(i8);
        for (int i9 = 0; i9 < this.f1732p; i9++) {
            f fVar = this.f1733q[i9];
            int i10 = fVar.f1764b;
            if (i10 != Integer.MIN_VALUE) {
                fVar.f1764b = i10 + i8;
            }
            int i11 = fVar.f1765c;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f1765c = i11 + i8;
            }
        }
    }

    public final int Q0(int i8) {
        int f9 = this.f1733q[0].f(i8);
        for (int i9 = 1; i9 < this.f1732p; i9++) {
            int f10 = this.f1733q[i9].f(i8);
            if (f10 > f9) {
                f9 = f10;
            }
        }
        return f9;
    }

    public final void R(int i8) {
        super.R(i8);
        for (int i9 = 0; i9 < this.f1732p; i9++) {
            f fVar = this.f1733q[i9];
            int i10 = fVar.f1764b;
            if (i10 != Integer.MIN_VALUE) {
                fVar.f1764b = i10 + i8;
            }
            int i11 = fVar.f1765c;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f1765c = i11 + i8;
            }
        }
    }

    public final int R0(int i8) {
        int i9 = this.f1733q[0].i(i8);
        for (int i10 = 1; i10 < this.f1732p; i10++) {
            int i11 = this.f1733q[i10].i(i8);
            if (i11 < i9) {
                i9 = i11;
            }
        }
        return i9;
    }

    public final void S() {
        this.B.a();
        for (int i8 = 0; i8 < this.f1732p; i8++) {
            this.f1733q[i8].b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1738x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.P0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.O0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001a
            if (r8 >= r9) goto L_0x0016
            int r2 = r9 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001d
        L_0x001a:
            int r2 = r8 + r9
        L_0x001c:
            r3 = r8
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0036
            r6 = 2
            if (r10 == r6) goto L_0x0032
            if (r10 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L_0x0039
        L_0x0032:
            r4.e(r8, r9)
            goto L_0x0039
        L_0x0036:
            r4.d(r8, r9)
        L_0x0039:
            if (r2 > r0) goto L_0x003c
            return
        L_0x003c:
            boolean r8 = r7.f1738x
            if (r8 == 0) goto L_0x0045
            int r8 = r7.O0()
            goto L_0x0049
        L_0x0045:
            int r8 = r7.P0()
        L_0x0049:
            if (r3 > r8) goto L_0x004e
            r7.p0()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0(int, int, int):void");
    }

    public final void T(RecyclerView recyclerView) {
        Runnable runnable = this.K;
        RecyclerView recyclerView2 = this.f1661b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i8 = 0; i8 < this.f1732p; i8++) {
            this.f1733q[i8].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r10 == r11) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View T0() {
        /*
            r13 = this;
            int r0 = r13.w()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f1732p
            r2.<init>(r3)
            int r3 = r13.f1732p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f1735t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.U0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f1738x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0100
            android.view.View r7 = r13.v(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r10 = r13.f1738x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f1765c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f1765c
        L_0x0056:
            androidx.recyclerview.widget.t r11 = r13.r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1763a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0098
        L_0x006a:
            int r10 = r9.f1764b
            if (r10 == r11) goto L_0x006f
            goto L_0x008a
        L_0x006f:
            java.util.ArrayList<android.view.View> r10 = r9.f1763a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r12 = r12.r
            int r10 = r12.e(r10)
            r9.f1764b = r10
            r11.getClass()
            int r10 = r9.f1764b
        L_0x008a:
            androidx.recyclerview.widget.t r11 = r13.r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x00a6
            java.util.ArrayList<android.view.View> r10 = r9.f1763a
            java.lang.Object r10 = r10.get(r4)
        L_0x0098:
            android.view.View r10 = (android.view.View) r10
            r9.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            r9.getClass()
            r9 = r1
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            if (r9 == 0) goto L_0x00aa
            return r7
        L_0x00aa:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L_0x00b1:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.v(r0)
            boolean r10 = r13.f1738x
            if (r10 == 0) goto L_0x00ce
            androidx.recyclerview.widget.t r10 = r13.r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.t r11 = r13.r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00cb
            return r7
        L_0x00cb:
            if (r10 != r11) goto L_0x00e1
            goto L_0x00df
        L_0x00ce:
            androidx.recyclerview.widget.t r10 = r13.r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.t r11 = r13.r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00dd
            return r7
        L_0x00dd:
            if (r10 != r11) goto L_0x00e1
        L_0x00df:
            r10 = r1
            goto L_0x00e2
        L_0x00e1:
            r10 = r4
        L_0x00e2:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00f7
            r8 = r1
            goto L_0x00f8
        L_0x00f7:
            r8 = r4
        L_0x00f8:
            if (r3 >= 0) goto L_0x00fc
            r9 = r1
            goto L_0x00fd
        L_0x00fc:
            r9 = r4
        L_0x00fd:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0100:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0():android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.f1735t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.f1735t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (U0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (U0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View U(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f1661b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.b r0 = r8.f1660a
            boolean r0 = r0.j(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.b1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.f1735t
            if (r10 != r0) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.f1735t
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.f1735t
            if (r10 != r0) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.f1735t
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r3
            goto L_0x006e
        L_0x0054:
            int r10 = r8.f1735t
            if (r10 != r0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.U0()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.f1735t
            if (r10 != r0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.U0()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r0
            goto L_0x006e
        L_0x006d:
            r10 = r2
        L_0x006e:
            if (r10 != r3) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r3
            r3.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.e
            if (r10 != r0) goto L_0x0083
            int r4 = r8.P0()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.O0()
        L_0x0087:
            r8.e1(r4, r12)
            r8.d1(r10)
            androidx.recyclerview.widget.n r5 = r8.f1737v
            int r6 = r5.f1890d
            int r6 = r6 + r4
            r5.f1889c = r6
            androidx.recyclerview.widget.t r6 = r8.r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f1888b = r6
            r5.f1893h = r0
            r6 = 0
            r5.f1887a = r6
            r8.J0(r11, r5, r12)
            boolean r11 = r8.f1738x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00b7
            if (r11 == r9) goto L_0x00b7
            return r11
        L_0x00b7:
            boolean r11 = r8.W0(r10)
            if (r11 == 0) goto L_0x00d2
            int r11 = r8.f1732p
            int r11 = r11 - r0
        L_0x00c0:
            if (r11 < 0) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1733q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00cf
            if (r12 == r9) goto L_0x00cf
            return r12
        L_0x00cf:
            int r11 = r11 + -1
            goto L_0x00c0
        L_0x00d2:
            r11 = r6
        L_0x00d3:
            int r12 = r8.f1732p
            if (r11 >= r12) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1733q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e4
            if (r12 == r9) goto L_0x00e4
            return r12
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e7:
            boolean r11 = r8.w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ee
            r12 = r0
            goto L_0x00ef
        L_0x00ee:
            r12 = r6
        L_0x00ef:
            if (r11 != r12) goto L_0x00f3
            r11 = r0
            goto L_0x00f4
        L_0x00f3:
            r11 = r6
        L_0x00f4:
            if (r11 == 0) goto L_0x00fb
            int r12 = r3.c()
            goto L_0x00ff
        L_0x00fb:
            int r12 = r3.d()
        L_0x00ff:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0108
            if (r12 == r9) goto L_0x0108
            return r12
        L_0x0108:
            boolean r10 = r8.W0(r10)
            if (r10 == 0) goto L_0x0135
            int r10 = r8.f1732p
            int r10 = r10 - r0
        L_0x0111:
            if (r10 < 0) goto L_0x0156
            int r12 = r3.e
            if (r10 != r12) goto L_0x0118
            goto L_0x0132
        L_0x0118:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1733q
            if (r11 == 0) goto L_0x0123
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x0129
        L_0x0123:
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x0129:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0132
            if (r12 == r9) goto L_0x0132
            return r12
        L_0x0132:
            int r10 = r10 + -1
            goto L_0x0111
        L_0x0135:
            int r10 = r8.f1732p
            if (r6 >= r10) goto L_0x0156
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f1733q
            if (r11 == 0) goto L_0x0144
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014a
        L_0x0144:
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014a:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x0153
            if (r10 == r9) goto L_0x0153
            return r10
        L_0x0153:
            int r6 = r6 + 1
            goto L_0x0135
        L_0x0156:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final boolean U0() {
        return B() == 1;
    }

    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            View L0 = L0(false);
            View K0 = K0(false);
            if (L0 != null && K0 != null) {
                int H2 = RecyclerView.l.H(L0);
                int H3 = RecyclerView.l.H(K0);
                if (H2 < H3) {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H3);
                    return;
                }
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03e9, code lost:
        if (F0() != false) goto L_0x03ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V0(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            r4 = -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f1739z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.k0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f1739z
            if (r3 != r4) goto L_0x002f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r0.B
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x01f7
            r5.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00c0
            int r12 = r11.f1755h
            r13 = 0
            if (r12 <= 0) goto L_0x0087
            int r14 = r0.f1732p
            if (r12 != r14) goto L_0x0079
            r11 = r6
        L_0x0049:
            int r12 = r0.f1732p
            if (r11 >= r12) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f1733q
            r12 = r12[r11]
            r12.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            int[] r14 = r12.f1756i
            r14 = r14[r11]
            if (r14 == r10) goto L_0x006e
            boolean r12 = r12.f1761n
            if (r12 == 0) goto L_0x0067
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.g()
            goto L_0x006d
        L_0x0067:
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.k()
        L_0x006d:
            int r14 = r14 + r12
        L_0x006e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f1733q
            r12 = r12[r11]
            r12.f1764b = r14
            r12.f1765c = r14
            int r11 = r11 + 1
            goto L_0x0049
        L_0x0079:
            r11.f1756i = r13
            r11.f1755h = r6
            r11.f1757j = r6
            r11.f1758k = r13
            r11.f1759l = r13
            int r12 = r11.f1754g
            r11.f1753f = r12
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            boolean r12 = r11.f1762o
            r0.E = r12
            boolean r11 = r11.f1760m
            r0.c(r13)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            if (r12 == 0) goto L_0x009c
            boolean r13 = r12.f1760m
            if (r13 == r11) goto L_0x009c
            r12.f1760m = r11
        L_0x009c:
            r0.w = r11
            r16.p0()
            r16.b1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            int r12 = r11.f1753f
            if (r12 == r4) goto L_0x00af
            r0.f1739z = r12
            boolean r12 = r11.f1761n
            goto L_0x00b1
        L_0x00af:
            boolean r12 = r0.f1738x
        L_0x00b1:
            r5.f1743c = r12
            int r12 = r11.f1757j
            if (r12 <= r7) goto L_0x00c7
            int[] r12 = r11.f1758k
            r9.f1747a = r12
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r11 = r11.f1759l
            r9.f1748b = r11
            goto L_0x00c7
        L_0x00c0:
            r16.b1()
            boolean r11 = r0.f1738x
            r5.f1743c = r11
        L_0x00c7:
            boolean r11 = r2.f1717g
            if (r11 != 0) goto L_0x01b8
            int r11 = r0.f1739z
            if (r11 != r4) goto L_0x00d1
            goto L_0x01b8
        L_0x00d1:
            if (r11 < 0) goto L_0x01b4
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00db
            goto L_0x01b4
        L_0x00db:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00f0
            int r12 = r11.f1753f
            if (r12 == r4) goto L_0x00f0
            int r11 = r11.f1755h
            if (r11 >= r7) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            r5.f1742b = r10
            int r11 = r0.f1739z
            r5.f1741a = r11
            goto L_0x01b2
        L_0x00f0:
            int r11 = r0.f1739z
            android.view.View r11 = r0.q(r11)
            if (r11 == 0) goto L_0x0176
            boolean r12 = r0.f1738x
            if (r12 == 0) goto L_0x0101
            int r12 = r16.P0()
            goto L_0x0105
        L_0x0101:
            int r12 = r16.O0()
        L_0x0105:
            r5.f1741a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x0130
            boolean r12 = r5.f1743c
            if (r12 == 0) goto L_0x011f
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.g()
            int r13 = r0.A
            int r12 = r12 - r13
            androidx.recyclerview.widget.t r13 = r0.r
            int r11 = r13.b(r11)
            goto L_0x012e
        L_0x011f:
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.k()
            int r13 = r0.A
            int r12 = r12 + r13
            androidx.recyclerview.widget.t r13 = r0.r
            int r11 = r13.e(r11)
        L_0x012e:
            int r12 = r12 - r11
            goto L_0x0170
        L_0x0130:
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.c(r11)
            androidx.recyclerview.widget.t r13 = r0.r
            int r13 = r13.l()
            if (r12 <= r13) goto L_0x014e
            boolean r11 = r5.f1743c
            androidx.recyclerview.widget.t r12 = r0.r
            if (r11 == 0) goto L_0x0149
            int r11 = r12.g()
            goto L_0x015e
        L_0x0149:
            int r11 = r12.k()
            goto L_0x015e
        L_0x014e:
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.e(r11)
            androidx.recyclerview.widget.t r13 = r0.r
            int r13 = r13.k()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x0161
            int r11 = -r12
        L_0x015e:
            r5.f1742b = r11
            goto L_0x01b2
        L_0x0161:
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.g()
            androidx.recyclerview.widget.t r13 = r0.r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0173
        L_0x0170:
            r5.f1742b = r12
            goto L_0x01b2
        L_0x0173:
            r5.f1742b = r10
            goto L_0x01b2
        L_0x0176:
            int r11 = r0.f1739z
            r5.f1741a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x019b
            int r11 = r0.E0(r11)
            if (r11 != r7) goto L_0x0186
            r11 = r7
            goto L_0x0187
        L_0x0186:
            r11 = r6
        L_0x0187:
            r5.f1743c = r11
            if (r11 == 0) goto L_0x0192
            androidx.recyclerview.widget.t r11 = r8.r
            int r11 = r11.g()
            goto L_0x0198
        L_0x0192:
            androidx.recyclerview.widget.t r11 = r8.r
            int r11 = r11.k()
        L_0x0198:
            r5.f1742b = r11
            goto L_0x01b0
        L_0x019b:
            boolean r11 = r5.f1743c
            if (r11 == 0) goto L_0x01a7
            androidx.recyclerview.widget.t r11 = r8.r
            int r11 = r11.g()
            int r11 = r11 - r12
            goto L_0x01ae
        L_0x01a7:
            androidx.recyclerview.widget.t r11 = r8.r
            int r11 = r11.k()
            int r11 = r11 + r12
        L_0x01ae:
            r5.f1742b = r11
        L_0x01b0:
            r5.f1744d = r7
        L_0x01b2:
            r11 = r7
            goto L_0x01b9
        L_0x01b4:
            r0.f1739z = r4
            r0.A = r10
        L_0x01b8:
            r11 = r6
        L_0x01b9:
            if (r11 == 0) goto L_0x01bc
            goto L_0x01f5
        L_0x01bc:
            boolean r11 = r0.D
            int r12 = r18.b()
            if (r11 == 0) goto L_0x01d8
            int r11 = r16.w()
        L_0x01c8:
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x01f0
            android.view.View r13 = r0.v(r11)
            int r13 = androidx.recyclerview.widget.RecyclerView.l.H(r13)
            if (r13 < 0) goto L_0x01c8
            if (r13 >= r12) goto L_0x01c8
            goto L_0x01f1
        L_0x01d8:
            int r11 = r16.w()
            r13 = r6
        L_0x01dd:
            if (r13 >= r11) goto L_0x01f0
            android.view.View r14 = r0.v(r13)
            int r14 = androidx.recyclerview.widget.RecyclerView.l.H(r14)
            if (r14 < 0) goto L_0x01ed
            if (r14 >= r12) goto L_0x01ed
            r13 = r14
            goto L_0x01f1
        L_0x01ed:
            int r13 = r13 + 1
            goto L_0x01dd
        L_0x01f0:
            r13 = r6
        L_0x01f1:
            r5.f1741a = r13
            r5.f1742b = r10
        L_0x01f5:
            r5.e = r7
        L_0x01f7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 != 0) goto L_0x0212
            int r11 = r0.f1739z
            if (r11 != r4) goto L_0x0212
            boolean r11 = r5.f1743c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x020d
            boolean r11 = r16.U0()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x0212
        L_0x020d:
            r9.a()
            r5.f1744d = r7
        L_0x0212:
            int r9 = r16.w()
            if (r9 <= 0) goto L_0x02bd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r0.F
            if (r9 == 0) goto L_0x0220
            int r9 = r9.f1755h
            if (r9 >= r7) goto L_0x02bd
        L_0x0220:
            boolean r9 = r5.f1744d
            if (r9 == 0) goto L_0x023f
            r3 = r6
        L_0x0225:
            int r8 = r0.f1732p
            if (r3 >= r8) goto L_0x02bd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f1733q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f1742b
            if (r8 == r10) goto L_0x023c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f1733q
            r9 = r9[r3]
            r9.f1764b = r8
            r9.f1765c = r8
        L_0x023c:
            int r3 = r3 + 1
            goto L_0x0225
        L_0x023f:
            if (r3 != 0) goto L_0x025d
            int[] r3 = r5.f1745f
            if (r3 != 0) goto L_0x0246
            goto L_0x025d
        L_0x0246:
            r3 = r6
        L_0x0247:
            int r8 = r0.f1732p
            if (r3 >= r8) goto L_0x02bd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f1733q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f1745f
            r9 = r9[r3]
            r8.f1764b = r9
            r8.f1765c = r9
            int r3 = r3 + 1
            goto L_0x0247
        L_0x025d:
            r3 = r6
        L_0x025e:
            int r9 = r0.f1732p
            if (r3 >= r9) goto L_0x029c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f1733q
            r9 = r9[r3]
            boolean r11 = r0.f1738x
            int r12 = r5.f1742b
            if (r11 == 0) goto L_0x0271
            int r13 = r9.f(r10)
            goto L_0x0275
        L_0x0271:
            int r13 = r9.i(r10)
        L_0x0275:
            r9.b()
            if (r13 != r10) goto L_0x027b
            goto L_0x0299
        L_0x027b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            if (r11 == 0) goto L_0x0287
            androidx.recyclerview.widget.t r15 = r14.r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x0299
        L_0x0287:
            if (r11 != 0) goto L_0x0292
            androidx.recyclerview.widget.t r11 = r14.r
            int r11 = r11.k()
            if (r13 <= r11) goto L_0x0292
            goto L_0x0299
        L_0x0292:
            if (r12 == r10) goto L_0x0295
            int r13 = r13 + r12
        L_0x0295:
            r9.f1765c = r13
            r9.f1764b = r13
        L_0x0299:
            int r3 = r3 + 1
            goto L_0x025e
        L_0x029c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r0.f1733q
            int r9 = r3.length
            int[] r11 = r5.f1745f
            if (r11 == 0) goto L_0x02a6
            int r11 = r11.length
            if (r11 >= r9) goto L_0x02ad
        L_0x02a6:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f1733q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r5.f1745f = r8
        L_0x02ad:
            r8 = r6
        L_0x02ae:
            if (r8 >= r9) goto L_0x02bd
            int[] r11 = r5.f1745f
            r12 = r3[r8]
            int r12 = r12.i(r10)
            r11[r8] = r12
            int r8 = r8 + 1
            goto L_0x02ae
        L_0x02bd:
            r16.p(r17)
            androidx.recyclerview.widget.n r3 = r0.f1737v
            r3.f1887a = r6
            androidx.recyclerview.widget.t r8 = r0.f1734s
            int r8 = r8.l()
            int r9 = r0.f1732p
            int r9 = r8 / r9
            r0.f1736u = r9
            androidx.recyclerview.widget.t r9 = r0.f1734s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f1741a
            r0.e1(r8, r2)
            boolean r8 = r5.f1743c
            if (r8 == 0) goto L_0x02ec
            r0.d1(r4)
            r0.J0(r1, r3, r2)
            r0.d1(r7)
            goto L_0x02f5
        L_0x02ec:
            r0.d1(r7)
            r0.J0(r1, r3, r2)
            r0.d1(r4)
        L_0x02f5:
            int r4 = r5.f1741a
            int r8 = r3.f1890d
            int r4 = r4 + r8
            r3.f1889c = r4
            r0.J0(r1, r3, r2)
            androidx.recyclerview.widget.t r3 = r0.f1734s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x030b
            goto L_0x03aa
        L_0x030b:
            int r3 = r16.w()
            r4 = 0
            r8 = r6
        L_0x0311:
            if (r8 >= r3) goto L_0x0333
            android.view.View r9 = r0.v(r8)
            androidx.recyclerview.widget.t r11 = r0.f1734s
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0323
            goto L_0x0330
        L_0x0323:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x0330:
            int r8 = r8 + 1
            goto L_0x0311
        L_0x0333:
            int r8 = r0.f1736u
            int r9 = r0.f1732p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.recyclerview.widget.t r9 = r0.f1734s
            int r9 = r9.i()
            if (r9 != r10) goto L_0x034f
            androidx.recyclerview.widget.t r9 = r0.f1734s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x034f:
            int r9 = r0.f1732p
            int r9 = r4 / r9
            r0.f1736u = r9
            androidx.recyclerview.widget.t r9 = r0.f1734s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f1736u
            if (r4 != r8) goto L_0x0363
            goto L_0x03aa
        L_0x0363:
            r4 = r6
        L_0x0364:
            if (r4 >= r3) goto L_0x03aa
            android.view.View r9 = r0.v(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r10
            r10.getClass()
            boolean r11 = r16.U0()
            if (r11 == 0) goto L_0x0393
            int r11 = r0.f1735t
            if (r11 != r7) goto L_0x0393
            int r11 = r0.f1732p
            int r12 = r11 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.e
            int r10 = r10.e
            int r12 = r12 - r10
            int r12 = -r12
            int r13 = r0.f1736u
            int r12 = r12 * r13
            int r11 = r11 - r7
            int r11 = r11 - r10
            int r10 = -r11
            int r10 = r10 * r8
            int r12 = r12 - r10
            r9.offsetLeftAndRight(r12)
            goto L_0x03a7
        L_0x0393:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.e
            int r10 = r10.e
            int r11 = r0.f1736u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f1735t
            int r11 = r11 - r10
            if (r12 != r7) goto L_0x03a4
            r9.offsetLeftAndRight(r11)
            goto L_0x03a7
        L_0x03a4:
            r9.offsetTopAndBottom(r11)
        L_0x03a7:
            int r4 = r4 + 1
            goto L_0x0364
        L_0x03aa:
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03c1
            boolean r3 = r0.f1738x
            if (r3 == 0) goto L_0x03bb
            r0.M0(r1, r2, r7)
            r0.N0(r1, r2, r6)
            goto L_0x03c1
        L_0x03bb:
            r0.N0(r1, r2, r7)
            r0.M0(r1, r2, r6)
        L_0x03c1:
            if (r19 == 0) goto L_0x03ec
            boolean r3 = r2.f1717g
            if (r3 != 0) goto L_0x03ec
            int r3 = r0.C
            if (r3 == 0) goto L_0x03d9
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03d9
            android.view.View r3 = r16.T0()
            if (r3 == 0) goto L_0x03d9
            r3 = r7
            goto L_0x03da
        L_0x03d9:
            r3 = r6
        L_0x03da:
            if (r3 == 0) goto L_0x03ec
            java.lang.Runnable r3 = r0.K
            androidx.recyclerview.widget.RecyclerView r4 = r0.f1661b
            if (r4 == 0) goto L_0x03e5
            r4.removeCallbacks(r3)
        L_0x03e5:
            boolean r3 = r16.F0()
            if (r3 == 0) goto L_0x03ec
            goto L_0x03ed
        L_0x03ec:
            r7 = r6
        L_0x03ed:
            boolean r3 = r2.f1717g
            if (r3 == 0) goto L_0x03f4
            r5.a()
        L_0x03f4:
            boolean r3 = r5.f1743c
            r0.D = r3
            boolean r3 = r16.U0()
            r0.E = r3
            if (r7 == 0) goto L_0x0406
            r5.a()
            r0.V0(r1, r2, r6)
        L_0x0406:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public final boolean W0(int i8) {
        if (this.f1735t == 0) {
            return (i8 == -1) != this.f1738x;
        }
        return ((i8 == -1) == this.f1738x) == U0();
    }

    public final void X0(int i8, RecyclerView.x xVar) {
        int i9;
        int i10;
        if (i8 > 0) {
            i10 = P0();
            i9 = 1;
        } else {
            i10 = O0();
            i9 = -1;
        }
        n nVar = this.f1737v;
        nVar.f1887a = true;
        e1(i10, xVar);
        d1(i9);
        nVar.f1889c = i10 + nVar.f1890d;
        nVar.f1888b = Math.abs(i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y0(androidx.recyclerview.widget.RecyclerView.s r5, androidx.recyclerview.widget.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f1887a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f1894i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f1888b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f1892g
        L_0x0015:
            r4.Z0(r6, r5)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f1891f
        L_0x001b:
            r4.a1(r6, r5)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f1891f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1733q
            r1 = r1[r2]
            int r1 = r1.i(r0)
        L_0x002f:
            int r2 = r4.f1732p
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1733q
            r2 = r2[r3]
            int r2 = r2.i(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f1892g
            int r6 = r6.f1888b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f1892g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1733q
            r1 = r1[r2]
            int r1 = r1.f(r0)
        L_0x005a:
            int r2 = r4.f1732p
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1733q
            r2 = r2[r3]
            int r2 = r2.f(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f1892g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f1891f
            int r6 = r6.f1888b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.n):void");
    }

    public final void Z(int i8, int i9) {
        S0(i8, i9, 1);
    }

    public final void Z0(int i8, RecyclerView.s sVar) {
        int w8 = w() - 1;
        while (w8 >= 0) {
            View v8 = v(w8);
            if (this.r.e(v8) >= i8 && this.r.o(v8) >= i8) {
                c cVar = (c) v8.getLayoutParams();
                cVar.getClass();
                if (cVar.e.f1763a.size() != 1) {
                    f fVar = cVar.e;
                    ArrayList<View> arrayList = fVar.f1763a;
                    int size = arrayList.size();
                    View remove = arrayList.remove(size - 1);
                    c h8 = f.h(remove);
                    h8.e = null;
                    if (h8.c() || h8.b()) {
                        fVar.f1766d -= StaggeredGridLayoutManager.this.r.c(remove);
                    }
                    if (size == 1) {
                        fVar.f1764b = Integer.MIN_VALUE;
                    }
                    fVar.f1765c = Integer.MIN_VALUE;
                    m0(v8, sVar);
                    w8--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final PointF a(int i8) {
        int E0 = E0(i8);
        PointF pointF = new PointF();
        if (E0 == 0) {
            return null;
        }
        if (this.f1735t == 0) {
            pointF.x = (float) E0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) E0;
        }
        return pointF;
    }

    public final void a0() {
        this.B.a();
        p0();
    }

    public final void a1(int i8, RecyclerView.s sVar) {
        while (w() > 0) {
            View v8 = v(0);
            if (this.r.b(v8) <= i8 && this.r.n(v8) <= i8) {
                c cVar = (c) v8.getLayoutParams();
                cVar.getClass();
                if (cVar.e.f1763a.size() != 1) {
                    f fVar = cVar.e;
                    ArrayList<View> arrayList = fVar.f1763a;
                    View remove = arrayList.remove(0);
                    c h8 = f.h(remove);
                    h8.e = null;
                    if (arrayList.size() == 0) {
                        fVar.f1765c = Integer.MIN_VALUE;
                    }
                    if (h8.c() || h8.b()) {
                        fVar.f1766d -= StaggeredGridLayoutManager.this.r.c(remove);
                    }
                    fVar.f1764b = Integer.MIN_VALUE;
                    m0(v8, sVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void b0(int i8, int i9) {
        S0(i8, i9, 8);
    }

    public final void b1() {
        this.f1738x = (this.f1735t == 1 || !U0()) ? this.w : !this.w;
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(int i8, int i9) {
        S0(i8, i9, 2);
    }

    public final int c1(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (w() == 0 || i8 == 0) {
            return 0;
        }
        X0(i8, xVar);
        n nVar = this.f1737v;
        int J0 = J0(sVar, nVar, xVar);
        if (nVar.f1888b >= J0) {
            i8 = i8 < 0 ? -J0 : J0;
        }
        this.r.p(-i8);
        this.D = this.f1738x;
        nVar.f1888b = 0;
        Y0(sVar, nVar);
        return i8;
    }

    public final boolean d() {
        return this.f1735t == 0;
    }

    public final void d0(int i8, int i9) {
        S0(i8, i9, 4);
    }

    public final void d1(int i8) {
        n nVar = this.f1737v;
        nVar.e = i8;
        int i9 = 1;
        if (this.f1738x != (i8 == -1)) {
            i9 = -1;
        }
        nVar.f1890d = i9;
    }

    public final boolean e() {
        return this.f1735t == 1;
    }

    public final void e0(RecyclerView.s sVar, RecyclerView.x xVar) {
        V0(sVar, xVar, true);
    }

    public final void e1(int i8, RecyclerView.x xVar) {
        int i9;
        int i10;
        int i11;
        n nVar = this.f1737v;
        boolean z8 = false;
        nVar.f1888b = 0;
        nVar.f1889c = i8;
        RecyclerView.w wVar = this.e;
        if (!(wVar != null && wVar.e) || (i11 = xVar.f1712a) == -1) {
            i10 = 0;
            i9 = 0;
        } else {
            if (this.f1738x == (i11 < i8)) {
                i10 = this.r.l();
                i9 = 0;
            } else {
                i9 = this.r.l();
                i10 = 0;
            }
        }
        RecyclerView recyclerView = this.f1661b;
        if (recyclerView != null && recyclerView.f1596g) {
            nVar.f1891f = this.r.k() - i9;
            nVar.f1892g = this.r.g() + i10;
        } else {
            nVar.f1892g = this.r.f() + i10;
            nVar.f1891f = -i9;
        }
        nVar.f1893h = false;
        nVar.f1887a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z8 = true;
        }
        nVar.f1894i = z8;
    }

    public final boolean f(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public final void f0(RecyclerView.x xVar) {
        this.f1739z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void f1(f fVar, int i8, int i9) {
        int i10 = fVar.f1766d;
        if (i8 == -1) {
            int i11 = fVar.f1764b;
            if (i11 == Integer.MIN_VALUE) {
                View view = fVar.f1763a.get(0);
                c h8 = f.h(view);
                fVar.f1764b = StaggeredGridLayoutManager.this.r.e(view);
                h8.getClass();
                i11 = fVar.f1764b;
            }
            if (i11 + i10 > i9) {
                return;
            }
        } else {
            int i12 = fVar.f1765c;
            if (i12 == Integer.MIN_VALUE) {
                fVar.a();
                i12 = fVar.f1765c;
            }
            if (i12 - i10 < i9) {
                return;
            }
        }
        this.y.set(fVar.e, false);
    }

    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f1739z != -1) {
                eVar.f1756i = null;
                eVar.f1755h = 0;
                eVar.f1753f = -1;
                eVar.f1754g = -1;
                eVar.f1756i = null;
                eVar.f1755h = 0;
                eVar.f1757j = 0;
                eVar.f1758k = null;
                eVar.f1759l = null;
            }
            p0();
        }
    }

    public final void h(int i8, int i9, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        n nVar;
        int i10;
        int i11;
        if (this.f1735t != 0) {
            i8 = i9;
        }
        if (w() != 0 && i8 != 0) {
            X0(i8, xVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1732p) {
                this.J = new int[this.f1732p];
            }
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f1732p;
                nVar = this.f1737v;
                if (i12 >= i14) {
                    break;
                }
                if (nVar.f1890d == -1) {
                    i11 = nVar.f1891f;
                    i10 = this.f1733q[i12].i(i11);
                } else {
                    i11 = this.f1733q[i12].f(nVar.f1892g);
                    i10 = nVar.f1892g;
                }
                int i15 = i11 - i10;
                if (i15 >= 0) {
                    this.J[i13] = i15;
                    i13++;
                }
                i12++;
            }
            Arrays.sort(this.J, 0, i13);
            int i16 = 0;
            while (i16 < i13) {
                int i17 = nVar.f1889c;
                if (i17 >= 0 && i17 < xVar.b()) {
                    ((m.b) cVar).a(nVar.f1889c, this.J[i16]);
                    nVar.f1889c += nVar.f1890d;
                    i16++;
                } else {
                    return;
                }
            }
        }
    }

    public final Parcelable h0() {
        int i8;
        int i9;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f1760m = this.w;
        eVar2.f1761n = this.D;
        eVar2.f1762o = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f1747a) == null) {
            eVar2.f1757j = 0;
        } else {
            eVar2.f1758k = iArr;
            eVar2.f1757j = iArr.length;
            eVar2.f1759l = dVar.f1748b;
        }
        int i10 = -1;
        if (w() > 0) {
            eVar2.f1753f = this.D ? P0() : O0();
            View K0 = this.f1738x ? K0(true) : L0(true);
            if (K0 != null) {
                i10 = RecyclerView.l.H(K0);
            }
            eVar2.f1754g = i10;
            int i11 = this.f1732p;
            eVar2.f1755h = i11;
            eVar2.f1756i = new int[i11];
            for (int i12 = 0; i12 < this.f1732p; i12++) {
                if (this.D) {
                    i8 = this.f1733q[i12].f(Integer.MIN_VALUE);
                    if (i8 != Integer.MIN_VALUE) {
                        i9 = this.r.g();
                    } else {
                        eVar2.f1756i[i12] = i8;
                    }
                } else {
                    i8 = this.f1733q[i12].i(Integer.MIN_VALUE);
                    if (i8 != Integer.MIN_VALUE) {
                        i9 = this.r.k();
                    } else {
                        eVar2.f1756i[i12] = i8;
                    }
                }
                i8 -= i9;
                eVar2.f1756i[i12] = i8;
            }
        } else {
            eVar2.f1753f = -1;
            eVar2.f1754g = -1;
            eVar2.f1755h = 0;
        }
        return eVar2;
    }

    public final void i0(int i8) {
        if (i8 == 0) {
            F0();
        }
    }

    public final int j(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public final int k(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public final int l(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final int m(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public final int n(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public final int o(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final int q0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        return c1(i8, sVar, xVar);
    }

    public final RecyclerView.m r() {
        return this.f1735t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void r0(int i8) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f1753f == i8)) {
            eVar.f1756i = null;
            eVar.f1755h = 0;
            eVar.f1753f = -1;
            eVar.f1754g = -1;
        }
        this.f1739z = i8;
        this.A = Integer.MIN_VALUE;
        p0();
    }

    public final RecyclerView.m s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final int s0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        return c1(i8, sVar, xVar);
    }

    public final RecyclerView.m t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void v0(Rect rect, int i8, int i9) {
        int i10;
        int i11;
        int E2 = E() + F();
        int G2 = G() + D();
        if (this.f1735t == 1) {
            int height = rect.height() + G2;
            RecyclerView recyclerView = this.f1661b;
            int[] iArr = x.f4957a;
            i11 = RecyclerView.l.g(i9, height, x.c.d(recyclerView));
            i10 = RecyclerView.l.g(i8, (this.f1736u * this.f1732p) + E2, x.c.e(this.f1661b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1661b;
            int[] iArr2 = x.f4957a;
            i10 = RecyclerView.l.g(i8, width, x.c.e(recyclerView2));
            i11 = RecyclerView.l.g(i9, (this.f1736u * this.f1732p) + G2, x.c.d(this.f1661b));
        }
        this.f1661b.setMeasuredDimension(i10, i11);
    }
}
