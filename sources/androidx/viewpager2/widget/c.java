package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class c extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f2020a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f2021b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f2022c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f2023d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2024f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2025g = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f2026h;

    /* renamed from: i  reason: collision with root package name */
    public int f2027i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2028j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2029k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2030l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2031m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2032a;

        /* renamed from: b  reason: collision with root package name */
        public float f2033b;

        /* renamed from: c  reason: collision with root package name */
        public int f2034c;
    }

    public c(ViewPager2 viewPager2) {
        this.f2021b = viewPager2;
        RecyclerView recyclerView = viewPager2.f1996j;
        this.f2022c = recyclerView;
        this.f2023d = (LinearLayoutManager) recyclerView.getLayoutManager();
        e();
    }

    public final void a(int i8, RecyclerView recyclerView) {
        ViewPager2.e eVar;
        int i9 = this.e;
        boolean z8 = true;
        if (!(i9 == 1 && this.f2024f == 1) && i8 == 1) {
            this.f2031m = false;
            this.e = 1;
            int i10 = this.f2027i;
            if (i10 != -1) {
                this.f2026h = i10;
                this.f2027i = -1;
            } else if (this.f2026h == -1) {
                this.f2026h = this.f2023d.O0();
            }
            d(1);
            return;
        }
        if (!(i9 == 1 || i9 == 4) || i8 != 2) {
            boolean z9 = i9 == 1 || i9 == 4;
            a aVar = this.f2025g;
            if (z9 && i8 == 0) {
                f();
                if (!this.f2029k) {
                    int i11 = aVar.f2032a;
                    if (!(i11 == -1 || (eVar = this.f2020a) == null)) {
                        eVar.b(0.0f, i11, 0);
                    }
                } else if (aVar.f2034c == 0) {
                    int i12 = this.f2026h;
                    int i13 = aVar.f2032a;
                    if (i12 != i13) {
                        c(i13);
                    }
                } else {
                    z8 = false;
                }
                if (z8) {
                    d(0);
                    e();
                }
            }
            if (this.e == 2 && i8 == 0 && this.f2030l) {
                f();
                if (aVar.f2034c == 0) {
                    int i14 = this.f2027i;
                    int i15 = aVar.f2032a;
                    if (i14 != i15) {
                        if (i15 == -1) {
                            i15 = 0;
                        }
                        c(i15);
                    }
                    d(0);
                    e();
                }
            }
        } else if (this.f2029k) {
            d(2);
            this.f2028j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r7 < 0) == (r5.f2021b.f1993g.B() == 1)) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r5.f2026h == r7) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f2029k = r6
            r5.f()
            boolean r0 = r5.f2028j
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.f2025g
            r3 = 0
            if (r0 == 0) goto L_0x003f
            r5.f2028j = r3
            if (r8 > 0) goto L_0x002b
            if (r8 != 0) goto L_0x0029
            if (r7 >= 0) goto L_0x0018
            r7 = r6
            goto L_0x0019
        L_0x0018:
            r7 = r3
        L_0x0019:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f2021b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.f1993g
            int r8 = r8.B()
            if (r8 != r6) goto L_0x0025
            r8 = r6
            goto L_0x0026
        L_0x0025:
            r8 = r3
        L_0x0026:
            if (r7 != r8) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = r6
        L_0x002c:
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f2034c
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f2032a
            int r7 = r7 + r6
            goto L_0x0038
        L_0x0036:
            int r7 = r2.f2032a
        L_0x0038:
            r5.f2027i = r7
            int r8 = r5.f2026h
            if (r8 == r7) goto L_0x004b
            goto L_0x0048
        L_0x003f:
            int r7 = r5.e
            if (r7 != 0) goto L_0x004b
            int r7 = r2.f2032a
            if (r7 != r1) goto L_0x0048
            r7 = r3
        L_0x0048:
            r5.c(r7)
        L_0x004b:
            int r7 = r2.f2032a
            if (r7 != r1) goto L_0x0050
            r7 = r3
        L_0x0050:
            float r8 = r2.f2033b
            int r0 = r2.f2034c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f2020a
            if (r4 == 0) goto L_0x005b
            r4.b(r8, r7, r0)
        L_0x005b:
            int r7 = r2.f2032a
            int r8 = r5.f2027i
            if (r7 == r8) goto L_0x0063
            if (r8 != r1) goto L_0x0071
        L_0x0063:
            int r7 = r2.f2034c
            if (r7 != 0) goto L_0x0071
            int r7 = r5.f2024f
            if (r7 == r6) goto L_0x0071
            r5.d(r3)
            r5.e()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i8) {
        ViewPager2.e eVar = this.f2020a;
        if (eVar != null) {
            eVar.c(i8);
        }
    }

    public final void d(int i8) {
        if ((this.e != 3 || this.f2024f != 0) && this.f2024f != i8) {
            this.f2024f = i8;
            ViewPager2.e eVar = this.f2020a;
            if (eVar != null) {
                eVar.a(i8);
            }
        }
    }

    public final void e() {
        this.e = 0;
        this.f2024f = 0;
        a aVar = this.f2025g;
        aVar.f2032a = -1;
        aVar.f2033b = 0.0f;
        aVar.f2034c = 0;
        this.f2026h = -1;
        this.f2027i = -1;
        this.f2028j = false;
        this.f2029k = false;
        this.f2031m = false;
        this.f2030l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        if (r3[r12 - 1][1] >= r5) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0143 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r12 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r12.f2023d
            int r1 = r0.O0()
            androidx.viewpager2.widget.c$a r2 = r12.f2025g
            r2.f2032a = r1
            r3 = 0
            r4 = 0
            r5 = -1
            if (r1 != r5) goto L_0x0016
            r2.f2032a = r5
            r2.f2033b = r3
            r2.f2034c = r4
            return
        L_0x0016:
            android.view.View r1 = r0.q(r1)
            if (r1 != 0) goto L_0x0023
            r2.f2032a = r5
            r2.f2033b = r3
            r2.f2034c = r4
            return
        L_0x0023:
            int r5 = androidx.recyclerview.widget.RecyclerView.l.C(r1)
            int r6 = androidx.recyclerview.widget.RecyclerView.l.J(r1)
            int r7 = androidx.recyclerview.widget.RecyclerView.l.L(r1)
            int r8 = androidx.recyclerview.widget.RecyclerView.l.u(r1)
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x0049
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r5 = r5 + r10
            int r10 = r9.rightMargin
            int r6 = r6 + r10
            int r10 = r9.topMargin
            int r7 = r7 + r10
            int r9 = r9.bottomMargin
            int r8 = r8 + r9
        L_0x0049:
            int r9 = r1.getHeight()
            int r9 = r9 + r7
            int r9 = r9 + r8
            int r8 = r1.getWidth()
            int r8 = r8 + r5
            int r8 = r8 + r6
            int r6 = r0.f1554p
            r10 = 1
            if (r6 != 0) goto L_0x005c
            r6 = r10
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView r11 = r12.f2022c
            if (r6 == 0) goto L_0x007d
            int r1 = r1.getLeft()
            int r1 = r1 - r5
            int r5 = r11.getPaddingLeft()
            int r1 = r1 - r5
            androidx.viewpager2.widget.ViewPager2 r12 = r12.f2021b
            androidx.viewpager2.widget.ViewPager2$d r12 = r12.f1993g
            int r12 = r12.B()
            if (r12 != r10) goto L_0x0077
            r12 = r10
            goto L_0x0078
        L_0x0077:
            r12 = r4
        L_0x0078:
            if (r12 == 0) goto L_0x007b
            int r1 = -r1
        L_0x007b:
            r9 = r8
            goto L_0x0088
        L_0x007d:
            int r12 = r1.getTop()
            int r12 = r12 - r7
            int r1 = r11.getPaddingTop()
            int r1 = r12 - r1
        L_0x0088:
            int r12 = -r1
            r2.f2034c = r12
            if (r12 >= 0) goto L_0x016b
            j1.b r12 = new j1.b
            int r12 = r0.w()
            if (r12 != 0) goto L_0x0097
            goto L_0x0122
        L_0x0097:
            int r1 = r0.f1554p
            if (r1 != 0) goto L_0x009d
            r1 = r10
            goto L_0x009e
        L_0x009d:
            r1 = r4
        L_0x009e:
            r3 = 2
            int[] r5 = new int[r3]
            r5[r10] = r3
            r5[r4] = r12
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r5)
            int[][] r3 = (int[][]) r3
            r5 = r4
        L_0x00ae:
            if (r5 >= r12) goto L_0x00f6
            android.view.View r6 = r0.v(r5)
            if (r6 == 0) goto L_0x00ee
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x00c1
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x00c3
        L_0x00c1:
            android.view.ViewGroup$MarginLayoutParams r7 = j1.b.f4965a
        L_0x00c3:
            r8 = r3[r5]
            if (r1 == 0) goto L_0x00ce
            int r9 = r6.getLeft()
            int r11 = r7.leftMargin
            goto L_0x00d4
        L_0x00ce:
            int r9 = r6.getTop()
            int r11 = r7.topMargin
        L_0x00d4:
            int r9 = r9 - r11
            r8[r4] = r9
            r8 = r3[r5]
            if (r1 == 0) goto L_0x00e2
            int r6 = r6.getRight()
            int r7 = r7.rightMargin
            goto L_0x00e8
        L_0x00e2:
            int r6 = r6.getBottom()
            int r7 = r7.bottomMargin
        L_0x00e8:
            int r6 = r6 + r7
            r8[r10] = r6
            int r5 = r5 + 1
            goto L_0x00ae
        L_0x00ee:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "null view contained in the view hierarchy"
            r12.<init>(r0)
            throw r12
        L_0x00f6:
            j1.a r1 = new j1.a
            r1.<init>()
            java.util.Arrays.sort(r3, r1)
            r1 = r10
        L_0x00ff:
            if (r1 >= r12) goto L_0x0111
            int r5 = r1 + -1
            r5 = r3[r5]
            r5 = r5[r10]
            r6 = r3[r1]
            r6 = r6[r4]
            if (r5 == r6) goto L_0x010e
            goto L_0x0124
        L_0x010e:
            int r1 = r1 + 1
            goto L_0x00ff
        L_0x0111:
            r1 = r3[r4]
            r5 = r1[r10]
            r1 = r1[r4]
            int r5 = r5 - r1
            if (r1 > 0) goto L_0x0124
            int r12 = r12 - r10
            r12 = r3[r12]
            r12 = r12[r10]
            if (r12 >= r5) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r12 = r10
            goto L_0x0125
        L_0x0124:
            r12 = r4
        L_0x0125:
            if (r12 == 0) goto L_0x012d
            int r12 = r0.w()
            if (r12 > r10) goto L_0x0148
        L_0x012d:
            int r12 = r0.w()
            r1 = r4
        L_0x0132:
            if (r1 >= r12) goto L_0x0143
            android.view.View r3 = r0.v(r1)
            boolean r3 = j1.b.a(r3)
            if (r3 == 0) goto L_0x0140
            r12 = r10
            goto L_0x0144
        L_0x0140:
            int r1 = r1 + 1
            goto L_0x0132
        L_0x0143:
            r12 = r4
        L_0x0144:
            if (r12 == 0) goto L_0x0148
            r12 = r10
            goto L_0x0149
        L_0x0148:
            r12 = r4
        L_0x0149:
            if (r12 == 0) goto L_0x0153
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r12.<init>(r0)
            throw r12
        L_0x0153:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r10]
            int r2 = r2.f2034c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r12.<init>(r0)
            throw r12
        L_0x016b:
            if (r9 != 0) goto L_0x016e
            goto L_0x0172
        L_0x016e:
            float r12 = (float) r12
            float r0 = (float) r9
            float r3 = r12 / r0
        L_0x0172:
            r2.f2033b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.f():void");
    }
}
