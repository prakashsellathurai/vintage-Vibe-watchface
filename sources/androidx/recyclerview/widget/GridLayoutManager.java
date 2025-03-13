package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import j0.x;
import java.util.Arrays;
import k0.c;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public final a K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1551f = 0;

        public b(int i8, int i9) {
            super(i8, i9);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1552a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f1553b = new SparseIntArray();

        public static int a(int i8, int i9) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i10++;
                if (i10 == i9) {
                    i11++;
                    i10 = 0;
                } else if (i10 > i9) {
                    i11++;
                    i10 = 1;
                }
            }
            return i10 + 1 > i9 ? i11 + 1 : i11;
        }

        public final void b() {
            this.f1552a.clear();
        }
    }

    public GridLayoutManager(int i8) {
        super(1);
        p1(i8);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        p1(RecyclerView.l.I(context, attributeSet, i8, i9).f1677b);
    }

    public final boolean D0() {
        return this.f1561z == null && !this.E;
    }

    public final void F0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        int i8 = this.F;
        int i9 = 0;
        while (i9 < this.F) {
            int i10 = cVar.f1573d;
            if ((i10 >= 0 && i10 < xVar.b()) && i8 > 0) {
                ((m.b) cVar2).a(cVar.f1573d, Math.max(0, cVar.f1575g));
                this.K.getClass();
                i8--;
                cVar.f1573d += cVar.e;
                i9++;
            } else {
                return;
            }
        }
    }

    public final int K(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1554p == 0) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return l1(xVar.b() - 1, sVar, xVar) + 1;
    }

    public final View S0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z8, boolean z9) {
        int i8;
        int i9;
        int w = w();
        int i10 = 1;
        if (z9) {
            i9 = w() - 1;
            i8 = -1;
            i10 = -1;
        } else {
            i8 = w;
            i9 = 0;
        }
        int b9 = xVar.b();
        K0();
        int k8 = this.r.k();
        int g9 = this.r.g();
        View view = null;
        View view2 = null;
        while (i9 != i8) {
            View v8 = v(i9);
            int H2 = RecyclerView.l.H(v8);
            if (H2 >= 0 && H2 < b9 && m1(H2, sVar, xVar) == 0) {
                if (((RecyclerView.m) v8.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v8;
                    }
                } else if (this.r.e(v8) < g9 && this.r.b(v8) >= k8) {
                    return v8;
                } else {
                    if (view == null) {
                        view = v8;
                    }
                }
            }
            i9 += i10;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00df, code lost:
        if (r13 == (r2 > r15)) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010f, code lost:
        if (r13 == (r2 > r9)) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View U(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1661b
            r4 = 0
            r5 = r23
            if (r3 != 0) goto L_0x000f
        L_0x000d:
            r3 = r4
            goto L_0x001f
        L_0x000f:
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L_0x0016
        L_0x0015:
            goto L_0x000d
        L_0x0016:
            androidx.recyclerview.widget.b r6 = r0.f1660a
            boolean r6 = r6.j(r3)
            if (r6 == 0) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r4
        L_0x0022:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r7 = r6.e
            int r6 = r6.f1551f
            int r6 = r6 + r7
            android.view.View r5 = super.U(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0034
            return r4
        L_0x0034:
            r5 = r24
            int r5 = r0.J0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x003f
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            boolean r10 = r0.f1558u
            if (r5 == r10) goto L_0x0046
            r5 = r8
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r10 = -1
            if (r5 == 0) goto L_0x0052
            int r5 = r22.w()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x0059
        L_0x0052:
            int r5 = r22.w()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x0059:
            int r13 = r0.f1554p
            if (r13 != r8) goto L_0x0065
            boolean r13 = r22.X0()
            if (r13 == 0) goto L_0x0065
            r13 = r8
            goto L_0x0066
        L_0x0065:
            r13 = 0
        L_0x0066:
            int r14 = r0.l1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0072:
            if (r10 == r11) goto L_0x0153
            r17 = r11
            int r11 = r0.l1(r10, r1, r2)
            android.view.View r1 = r0.v(r10)
            if (r1 != r3) goto L_0x0082
            goto L_0x0153
        L_0x0082:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0098
            if (r11 == r14) goto L_0x0098
            if (r4 == 0) goto L_0x008e
            goto L_0x0153
        L_0x008e:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0143
        L_0x0098:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.e
            r18 = r3
            int r3 = r11.f1551f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b0
            if (r2 != r7) goto L_0x00b0
            if (r3 != r6) goto L_0x00b0
            return r1
        L_0x00b0:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c3
            if (r5 != 0) goto L_0x00c3
        L_0x00c0:
            r21 = r5
            goto L_0x00e1
        L_0x00c3:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e7
            if (r5 <= r8) goto L_0x00d8
            goto L_0x00e1
        L_0x00d8:
            if (r5 != r8) goto L_0x0114
            if (r2 <= r15) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r13 != r5) goto L_0x0114
        L_0x00e1:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x0119
        L_0x00e7:
            if (r4 != 0) goto L_0x0114
            r19 = r8
            androidx.recyclerview.widget.c0 r8 = r0.f1662c
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            androidx.recyclerview.widget.c0 r8 = r0.f1663d
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0118
            if (r5 <= r12) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            if (r5 != r12) goto L_0x0118
            if (r2 <= r9) goto L_0x010e
            r5 = r20
            goto L_0x010f
        L_0x010e:
            r5 = 0
        L_0x010f:
            if (r13 != r5) goto L_0x0118
        L_0x0111:
            r5 = r20
            goto L_0x0119
        L_0x0114:
            r19 = r8
            r20 = 1
        L_0x0118:
            r5 = 0
        L_0x0119:
            if (r5 == 0) goto L_0x0143
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0132
            int r4 = r11.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0147
        L_0x0132:
            int r5 = r11.e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0147
        L_0x0143:
            r8 = r19
            r5 = r21
        L_0x0147:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0072
        L_0x0153:
            r21 = r5
            if (r4 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r4 = r21
        L_0x015a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final void Y(RecyclerView.s sVar, RecyclerView.x xVar, View view, k0.c cVar) {
        int i8;
        int i9;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            X(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int l12 = l1(bVar.a(), sVar, xVar);
        int i10 = 1;
        if (this.f1554p == 0) {
            int i11 = l12;
            l12 = bVar.e;
            i9 = i11;
            i8 = 1;
            i10 = bVar.f1551f;
        } else {
            i9 = bVar.e;
            i8 = bVar.f1551f;
        }
        cVar.g(c.C0072c.a(l12, i10, i9, i8, false));
    }

    public final void Y0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
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
        int i19;
        boolean z8;
        View b9;
        RecyclerView.s sVar2 = sVar;
        RecyclerView.x xVar2 = xVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j8 = this.r.j();
        boolean z9 = j8 != 1073741824;
        int i20 = w() > 0 ? this.G[this.F] : 0;
        if (z9) {
            q1();
        }
        boolean z10 = cVar2.e == 1;
        int i21 = this.F;
        if (!z10) {
            i21 = m1(cVar2.f1573d, sVar2, xVar2) + n1(cVar2.f1573d, sVar2, xVar2);
        }
        int i22 = 0;
        while (i22 < this.F) {
            int i23 = cVar2.f1573d;
            if (!(i23 >= 0 && i23 < xVar.b()) || i21 <= 0) {
                break;
            }
            int i24 = cVar2.f1573d;
            int n12 = n1(i24, sVar2, xVar2);
            if (n12 <= this.F) {
                i21 -= n12;
                if (i21 < 0 || (b9 = cVar2.b(sVar2)) == null) {
                    break;
                }
                this.H[i22] = b9;
                i22++;
            } else {
                throw new IllegalArgumentException("Item at position " + i24 + " requires " + n12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
        }
        if (i22 == 0) {
            bVar2.f1567b = true;
            return;
        }
        if (z10) {
            i8 = 1;
            i9 = i22;
            i10 = 0;
        } else {
            i10 = i22 - 1;
            i9 = -1;
            i8 = -1;
        }
        int i25 = 0;
        while (i10 != i9) {
            View view = this.H[i10];
            b bVar3 = (b) view.getLayoutParams();
            int n13 = n1(RecyclerView.l.H(view), sVar2, xVar2);
            bVar3.f1551f = n13;
            bVar3.e = i25;
            i25 += n13;
            i10 += i8;
        }
        float f9 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i22; i27++) {
            View view2 = this.H[i27];
            if (cVar2.f1579k != null) {
                z8 = false;
                if (z10) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z10) {
                z8 = false;
                b(view2, -1, false);
            } else {
                z8 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1661b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(z8 ? 1 : 0, z8, z8, z8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            o1(view2, j8, z8);
            int c9 = this.r.c(view2);
            if (c9 > i26) {
                i26 = c9;
            }
            float d9 = (((float) this.r.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f1551f);
            if (d9 > f9) {
                f9 = d9;
            }
        }
        if (z9) {
            j1(Math.max(Math.round(f9 * ((float) this.F)), i20));
            i26 = 0;
            for (int i28 = 0; i28 < i22; i28++) {
                View view3 = this.H[i28];
                o1(view3, 1073741824, true);
                int c10 = this.r.c(view3);
                if (c10 > i26) {
                    i26 = c10;
                }
            }
        }
        for (int i29 = 0; i29 < i22; i29++) {
            View view4 = this.H[i29];
            if (this.r.c(view4) != i26) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect2 = bVar4.f1681b;
                int i30 = rect2.top + rect2.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i31 = rect2.left + rect2.right + bVar4.leftMargin + bVar4.rightMargin;
                int k1 = k1(bVar4.e, bVar4.f1551f);
                if (this.f1554p == 1) {
                    i19 = RecyclerView.l.x(false, k1, 1073741824, i31, bVar4.width);
                    i18 = View.MeasureSpec.makeMeasureSpec(i26 - i30, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i31, 1073741824);
                    i18 = RecyclerView.l.x(false, k1, 1073741824, i30, bVar4.height);
                    i19 = makeMeasureSpec;
                }
                if (A0(view4, i19, i18, (RecyclerView.m) view4.getLayoutParams())) {
                    view4.measure(i19, i18);
                }
            }
        }
        bVar2.f1566a = i26;
        if (this.f1554p == 1) {
            if (cVar2.f1574f == -1) {
                i17 = cVar2.f1571b;
                i16 = i17 - i26;
            } else {
                int i32 = cVar2.f1571b;
                i16 = i32;
                i17 = i26 + i32;
            }
            i13 = 0;
            i12 = i16;
            i11 = i17;
            i14 = 0;
        } else {
            if (cVar2.f1574f == -1) {
                i14 = cVar2.f1571b;
                i15 = i14 - i26;
            } else {
                int i33 = cVar2.f1571b;
                i15 = i33;
                i14 = i26 + i33;
            }
            i12 = 0;
            i13 = i15;
            i11 = 0;
        }
        for (int i34 = 0; i34 < i22; i34++) {
            View view5 = this.H[i34];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f1554p != 1) {
                i12 = G() + this.G[bVar5.e];
                i11 = this.r.d(view5) + i12;
            } else if (X0()) {
                i14 = E() + this.G[this.F - bVar5.e];
                i13 = i14 - this.r.d(view5);
            } else {
                i13 = this.G[bVar5.e] + E();
                i14 = this.r.d(view5) + i13;
            }
            RecyclerView.l.P(view5, i13, i12, i14, i11);
            if (bVar5.c() || bVar5.b()) {
                bVar2.f1568c = true;
            }
            bVar2.f1569d = view5.hasFocusable() | bVar2.f1569d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void Z(int i8, int i9) {
        a aVar = this.K;
        aVar.b();
        aVar.f1553b.clear();
    }

    public final void Z0(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i8) {
        q1();
        if (xVar.b() > 0 && !xVar.f1717g) {
            boolean z8 = i8 == 1;
            int m12 = m1(aVar.f1563b, sVar, xVar);
            if (z8) {
                while (m12 > 0) {
                    int i9 = aVar.f1563b;
                    if (i9 <= 0) {
                        break;
                    }
                    int i10 = i9 - 1;
                    aVar.f1563b = i10;
                    m12 = m1(i10, sVar, xVar);
                }
            } else {
                int b9 = xVar.b() - 1;
                int i11 = aVar.f1563b;
                while (i11 < b9) {
                    int i12 = i11 + 1;
                    int m13 = m1(i12, sVar, xVar);
                    if (m13 <= m12) {
                        break;
                    }
                    i11 = i12;
                    m12 = m13;
                }
                aVar.f1563b = i11;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final void a0() {
        a aVar = this.K;
        aVar.b();
        aVar.f1553b.clear();
    }

    public final void b0(int i8, int i9) {
        a aVar = this.K;
        aVar.b();
        aVar.f1553b.clear();
    }

    public final void c0(int i8, int i9) {
        a aVar = this.K;
        aVar.b();
        aVar.f1553b.clear();
    }

    public final void d0(int i8, int i9) {
        a aVar = this.K;
        aVar.b();
        aVar.f1553b.clear();
    }

    public final void e0(RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z8 = xVar.f1717g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z8) {
            int w = w();
            for (int i8 = 0; i8 < w; i8++) {
                b bVar = (b) v(i8).getLayoutParams();
                int a9 = bVar.a();
                sparseIntArray2.put(a9, bVar.f1551f);
                sparseIntArray.put(a9, bVar.e);
            }
        }
        super.e0(sVar, xVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final boolean f(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    public final void f0(RecyclerView.x xVar) {
        super.f0(xVar);
        this.E = false;
    }

    public final void f1(boolean z8) {
        if (!z8) {
            super.f1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void j1(int i8) {
        int i9;
        int[] iArr = this.G;
        int i10 = this.F;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i8)) {
            iArr = new int[(i10 + 1)];
        }
        int i11 = 0;
        iArr[0] = 0;
        int i12 = i8 / i10;
        int i13 = i8 % i10;
        int i14 = 0;
        for (int i15 = 1; i15 <= i10; i15++) {
            i11 += i13;
            if (i11 <= 0 || i10 - i11 >= i13) {
                i9 = i12;
            } else {
                i9 = i12 + 1;
                i11 -= i10;
            }
            i14 += i9;
            iArr[i15] = i14;
        }
        this.G = iArr;
    }

    public final int k(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public final int k1(int i8, int i9) {
        if (this.f1554p != 1 || !X0()) {
            int[] iArr = this.G;
            return iArr[i9 + i8] - iArr[i8];
        }
        int[] iArr2 = this.G;
        int i10 = this.F;
        return iArr2[i10 - i8] - iArr2[(i10 - i8) - i9];
    }

    public final int l(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final int l1(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z8 = xVar.f1717g;
        a aVar = this.K;
        if (!z8) {
            int i9 = this.F;
            aVar.getClass();
            return c.a(i8, i9);
        }
        int b9 = sVar.b(i8);
        if (b9 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i8);
            return 0;
        }
        int i10 = this.F;
        aVar.getClass();
        return c.a(b9, i10);
    }

    public final int m1(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z8 = xVar.f1717g;
        a aVar = this.K;
        if (!z8) {
            int i9 = this.F;
            aVar.getClass();
            return i8 % i9;
        }
        int i10 = this.J.get(i8, -1);
        if (i10 != -1) {
            return i10;
        }
        int b9 = sVar.b(i8);
        if (b9 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
            return 0;
        }
        int i11 = this.F;
        aVar.getClass();
        return b9 % i11;
    }

    public final int n(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public final int n1(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        boolean z8 = xVar.f1717g;
        a aVar = this.K;
        if (!z8) {
            aVar.getClass();
            return 1;
        }
        int i9 = this.I.get(i8, -1);
        if (i9 != -1) {
            return i9;
        }
        if (sVar.b(i8) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    public final int o(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final void o1(View view, int i8, boolean z8) {
        int i9;
        int i10;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1681b;
        int i11 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i12 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int k1 = k1(bVar.e, bVar.f1551f);
        if (this.f1554p == 1) {
            i9 = RecyclerView.l.x(false, k1, i8, i12, bVar.width);
            i10 = RecyclerView.l.x(true, this.r.l(), this.f1671m, i11, bVar.height);
        } else {
            int x8 = RecyclerView.l.x(false, k1, i8, i11, bVar.height);
            int x9 = RecyclerView.l.x(true, this.r.l(), this.f1670l, i12, bVar.width);
            i10 = x8;
            i9 = x9;
        }
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z8 ? A0(view, i9, i10, mVar) : y0(view, i9, i10, mVar)) {
            view.measure(i9, i10);
        }
    }

    public final void p1(int i8) {
        if (i8 != this.F) {
            this.E = true;
            if (i8 >= 1) {
                this.F = i8;
                this.K.b();
                p0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i8);
        }
    }

    public final int q0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        q1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.q0(i8, sVar, xVar);
    }

    public final void q1() {
        int i8;
        int i9;
        if (this.f1554p == 1) {
            i9 = this.f1672n - F();
            i8 = E();
        } else {
            i9 = this.f1673o - D();
            i8 = G();
        }
        j1(i9 - i8);
    }

    public final RecyclerView.m r() {
        return this.f1554p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final RecyclerView.m s(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final int s0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        q1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.s0(i8, sVar, xVar);
    }

    public final RecyclerView.m t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void v0(Rect rect, int i8, int i9) {
        int i10;
        int i11;
        if (this.G == null) {
            super.v0(rect, i8, i9);
        }
        int E2 = E() + F();
        int G2 = G() + D();
        if (this.f1554p == 1) {
            int height = rect.height() + G2;
            RecyclerView recyclerView = this.f1661b;
            int[] iArr = x.f4957a;
            i11 = RecyclerView.l.g(i9, height, x.c.d(recyclerView));
            int[] iArr2 = this.G;
            i10 = RecyclerView.l.g(i8, iArr2[iArr2.length - 1] + E2, x.c.e(this.f1661b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f1661b;
            int[] iArr3 = x.f4957a;
            i10 = RecyclerView.l.g(i8, width, x.c.e(recyclerView2));
            int[] iArr4 = this.G;
            i11 = RecyclerView.l.g(i9, iArr4[iArr4.length - 1] + G2, x.c.d(this.f1661b));
        }
        this.f1661b.setMeasuredDimension(i10, i11);
    }

    public final int y(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1554p == 1) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return l1(xVar.b() - 1, sVar, xVar) + 1;
    }
}
