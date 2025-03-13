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
import java.util.List;

public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.w.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f1554p;

    /* renamed from: q  reason: collision with root package name */
    public c f1555q;
    public t r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1556s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1557t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1558u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1559v;
    public final boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f1560x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public d f1561z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public t f1562a;

        /* renamed from: b  reason: collision with root package name */
        public int f1563b;

        /* renamed from: c  reason: collision with root package name */
        public int f1564c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1565d;
        public boolean e;

        public a() {
            c();
        }

        public final void a(View view, int i8) {
            this.f1564c = this.f1565d ? this.f1562a.b(view) + this.f1562a.m() : this.f1562a.e(view);
            this.f1563b = i8;
        }

        public final void b(View view, int i8) {
            int m8 = this.f1562a.m();
            if (m8 >= 0) {
                a(view, i8);
                return;
            }
            this.f1563b = i8;
            if (this.f1565d) {
                int g9 = (this.f1562a.g() - m8) - this.f1562a.b(view);
                this.f1564c = this.f1562a.g() - g9;
                if (g9 > 0) {
                    int c9 = this.f1564c - this.f1562a.c(view);
                    int k8 = this.f1562a.k();
                    int min = c9 - (k8 + Math.min(this.f1562a.e(view) - k8, 0));
                    if (min < 0) {
                        this.f1564c += Math.min(g9, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int e4 = this.f1562a.e(view);
            int k9 = e4 - this.f1562a.k();
            this.f1564c = e4;
            if (k9 > 0) {
                int g10 = (this.f1562a.g() - Math.min(0, (this.f1562a.g() - m8) - this.f1562a.b(view))) - (e4 + this.f1562a.c(view));
                if (g10 < 0) {
                    this.f1564c -= Math.min(k9, -g10);
                }
            }
        }

        public final void c() {
            this.f1563b = -1;
            this.f1564c = Integer.MIN_VALUE;
            this.f1565d = false;
            this.e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f1563b + ", mCoordinate=" + this.f1564c + ", mLayoutFromEnd=" + this.f1565d + ", mValid=" + this.e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1566a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1567b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1568c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1569d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1570a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1571b;

        /* renamed from: c  reason: collision with root package name */
        public int f1572c;

        /* renamed from: d  reason: collision with root package name */
        public int f1573d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1574f;

        /* renamed from: g  reason: collision with root package name */
        public int f1575g;

        /* renamed from: h  reason: collision with root package name */
        public int f1576h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1577i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1578j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f1579k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1580l;

        public final void a(View view) {
            int a9;
            int size = this.f1579k.size();
            View view2 = null;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < size; i9++) {
                View view3 = this.f1579k.get(i9).f1631a;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a9 = (mVar.a() - this.f1573d) * this.e) >= 0 && a9 < i8) {
                    view2 = view3;
                    if (a9 == 0) {
                        break;
                    }
                    i8 = a9;
                }
            }
            this.f1573d = view2 == null ? -1 : ((RecyclerView.m) view2.getLayoutParams()).a();
        }

        public final View b(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.f1579k;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View view = this.f1579k.get(i8).f1631a;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.f1573d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = sVar.i(this.f1573d, Long.MAX_VALUE).f1631a;
            this.f1573d += this.e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f1581f;

        /* renamed from: g  reason: collision with root package name */
        public int f1582g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1583h;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1581f = parcel.readInt();
            this.f1582g = parcel.readInt();
            this.f1583h = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1581f = dVar.f1581f;
            this.f1582g = dVar.f1582g;
            this.f1583h = dVar.f1583h;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f1581f);
            parcel.writeInt(this.f1582g);
            parcel.writeInt(this.f1583h ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i8) {
        this.f1554p = 1;
        this.f1557t = false;
        this.f1558u = false;
        this.f1559v = false;
        this.w = true;
        this.f1560x = -1;
        this.y = Integer.MIN_VALUE;
        this.f1561z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        e1(i8);
        c((String) null);
        if (this.f1557t) {
            this.f1557t = false;
            p0();
        }
    }

    public void B0(RecyclerView recyclerView, int i8) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1699a = i8;
        C0(oVar);
    }

    public boolean D0() {
        return this.f1561z == null && this.f1556s == this.f1559v;
    }

    public void E0(RecyclerView.x xVar, int[] iArr) {
        int i8;
        int l8 = xVar.f1712a != -1 ? this.r.l() : 0;
        if (this.f1555q.f1574f == -1) {
            i8 = 0;
        } else {
            i8 = l8;
            l8 = 0;
        }
        iArr[0] = l8;
        iArr[1] = i8;
    }

    public void F0(RecyclerView.x xVar, c cVar, RecyclerView.l.c cVar2) {
        int i8 = cVar.f1573d;
        if (i8 >= 0 && i8 < xVar.b()) {
            ((m.b) cVar2).a(i8, Math.max(0, cVar.f1575g));
        }
    }

    public final int G0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        K0();
        t tVar = this.r;
        boolean z8 = !this.w;
        return y.a(xVar, tVar, N0(z8), M0(z8), this, this.w);
    }

    public final int H0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        K0();
        t tVar = this.r;
        boolean z8 = !this.w;
        return y.b(xVar, tVar, N0(z8), M0(z8), this, this.w, this.f1558u);
    }

    public final int I0(RecyclerView.x xVar) {
        if (w() == 0) {
            return 0;
        }
        K0();
        t tVar = this.r;
        boolean z8 = !this.w;
        return y.c(xVar, tVar, N0(z8), M0(z8), this, this.w);
    }

    public final int J0(int i8) {
        if (i8 == 1) {
            return (this.f1554p != 1 && X0()) ? 1 : -1;
        }
        if (i8 == 2) {
            return (this.f1554p != 1 && X0()) ? -1 : 1;
        }
        if (i8 == 17) {
            return this.f1554p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i8 == 33) {
            return this.f1554p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i8 == 66) {
            return this.f1554p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i8 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f1554p == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final void K0() {
        if (this.f1555q == null) {
            this.f1555q = new c();
        }
    }

    public final int L0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z8) {
        int i8 = cVar.f1572c;
        int i9 = cVar.f1575g;
        if (i9 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                cVar.f1575g = i9 + i8;
            }
            a1(sVar, cVar);
        }
        int i10 = cVar.f1572c + cVar.f1576h;
        while (true) {
            if (!cVar.f1580l && i10 <= 0) {
                break;
            }
            int i11 = cVar.f1573d;
            if (!(i11 >= 0 && i11 < xVar.b())) {
                break;
            }
            b bVar = this.B;
            bVar.f1566a = 0;
            bVar.f1567b = false;
            bVar.f1568c = false;
            bVar.f1569d = false;
            Y0(sVar, xVar, cVar, bVar);
            if (!bVar.f1567b) {
                int i12 = cVar.f1571b;
                int i13 = bVar.f1566a;
                cVar.f1571b = i12 + (cVar.f1574f * i13);
                if (!bVar.f1568c || cVar.f1579k != null || !xVar.f1717g) {
                    cVar.f1572c -= i13;
                    i10 -= i13;
                }
                int i14 = cVar.f1575g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    cVar.f1575g = i15;
                    int i16 = cVar.f1572c;
                    if (i16 < 0) {
                        cVar.f1575g = i15 + i16;
                    }
                    a1(sVar, cVar);
                }
                if (z8 && bVar.f1569d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - cVar.f1572c;
    }

    public final View M0(boolean z8) {
        int i8;
        int i9;
        if (this.f1558u) {
            i9 = w();
            i8 = 0;
        } else {
            i8 = w() - 1;
            i9 = -1;
        }
        return R0(i8, i9, z8);
    }

    public final boolean N() {
        return true;
    }

    public final View N0(boolean z8) {
        int i8;
        int i9;
        if (this.f1558u) {
            i8 = -1;
            i9 = w() - 1;
        } else {
            i8 = w();
            i9 = 0;
        }
        return R0(i9, i8, z8);
    }

    public final int O0() {
        View R0 = R0(0, w(), false);
        if (R0 == null) {
            return -1;
        }
        return RecyclerView.l.H(R0);
    }

    public final int P0() {
        View R0 = R0(w() - 1, -1, false);
        if (R0 == null) {
            return -1;
        }
        return RecyclerView.l.H(R0);
    }

    public final View Q0(int i8, int i9) {
        int i10;
        int i11;
        K0();
        if ((i9 > i8 ? 1 : i9 < i8 ? (char) 65535 : 0) == 0) {
            return v(i8);
        }
        if (this.r.e(v(i8)) < this.r.k()) {
            i11 = 16644;
            i10 = 16388;
        } else {
            i11 = 4161;
            i10 = 4097;
        }
        return (this.f1554p == 0 ? this.f1662c : this.f1663d).a(i8, i9, i11, i10);
    }

    public final View R0(int i8, int i9, boolean z8) {
        K0();
        return (this.f1554p == 0 ? this.f1662c : this.f1663d).a(i8, i9, z8 ? 24579 : 320, 320);
    }

    public View S0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z8, boolean z9) {
        int i8;
        int i9;
        int i10;
        K0();
        int w8 = w();
        if (z9) {
            i10 = w() - 1;
            i9 = -1;
            i8 = -1;
        } else {
            i9 = w8;
            i10 = 0;
            i8 = 1;
        }
        int b9 = xVar.b();
        int k8 = this.r.k();
        int g9 = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i9) {
            View v8 = v(i10);
            int H = RecyclerView.l.H(v8);
            int e = this.r.e(v8);
            int b10 = this.r.b(v8);
            if (H >= 0 && H < b9) {
                if (!((RecyclerView.m) v8.getLayoutParams()).c()) {
                    boolean z10 = b10 <= k8 && e < k8;
                    boolean z11 = e >= g9 && b10 > g9;
                    if (!z10 && !z11) {
                        return v8;
                    }
                    if (z8) {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = v8;
                        }
                    } else if (!z10) {
                        if (view != null) {
                        }
                        view = v8;
                    }
                    view2 = v8;
                } else if (view3 == null) {
                    view3 = v8;
                }
            }
            i10 += i8;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final void T(RecyclerView recyclerView) {
    }

    public final int T0(int i8, RecyclerView.s sVar, RecyclerView.x xVar, boolean z8) {
        int g9;
        int g10 = this.r.g() - i8;
        if (g10 <= 0) {
            return 0;
        }
        int i9 = -d1(-g10, sVar, xVar);
        int i10 = i8 + i9;
        if (!z8 || (g9 = this.r.g() - i10) <= 0) {
            return i9;
        }
        this.r.p(g9);
        return g9 + i9;
    }

    public View U(View view, int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        int J0;
        c1();
        if (w() == 0 || (J0 = J0(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        K0();
        g1(J0, (int) (((float) this.r.l()) * 0.33333334f), false, xVar);
        c cVar = this.f1555q;
        cVar.f1575g = Integer.MIN_VALUE;
        cVar.f1570a = false;
        L0(sVar, cVar, xVar, true);
        View Q0 = J0 == -1 ? this.f1558u ? Q0(w() - 1, -1) : Q0(0, w()) : this.f1558u ? Q0(0, w()) : Q0(w() - 1, -1);
        View W0 = J0 == -1 ? W0() : V0();
        if (!W0.hasFocusable()) {
            return Q0;
        }
        if (Q0 == null) {
            return null;
        }
        return W0;
    }

    public final int U0(int i8, RecyclerView.s sVar, RecyclerView.x xVar, boolean z8) {
        int k8;
        int k9 = i8 - this.r.k();
        if (k9 <= 0) {
            return 0;
        }
        int i9 = -d1(k9, sVar, xVar);
        int i10 = i8 + i9;
        if (!z8 || (k8 = i10 - this.r.k()) <= 0) {
            return i9;
        }
        this.r.p(-k8);
        return i9 - k8;
    }

    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(O0());
            accessibilityEvent.setToIndex(P0());
        }
    }

    public final View V0() {
        return v(this.f1558u ? 0 : w() - 1);
    }

    public final View W0() {
        return v(this.f1558u ? w() - 1 : 0);
    }

    public final boolean X0() {
        return B() == 1;
    }

    public void Y0(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        View b9 = cVar.b(sVar);
        if (b9 == null) {
            bVar.f1567b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) b9.getLayoutParams();
        if (cVar.f1579k == null) {
            if (this.f1558u == (cVar.f1574f == -1)) {
                b(b9, -1, false);
            } else {
                b(b9, 0, false);
            }
        } else {
            if (this.f1558u == (cVar.f1574f == -1)) {
                b(b9, -1, true);
            } else {
                b(b9, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) b9.getLayoutParams();
        Rect J = this.f1661b.J(b9);
        int x8 = RecyclerView.l.x(d(), this.f1672n, this.f1670l, E() + F() + mVar2.leftMargin + mVar2.rightMargin + J.left + J.right + 0, mVar2.width);
        int x9 = RecyclerView.l.x(e(), this.f1673o, this.f1671m, G() + D() + mVar2.topMargin + mVar2.bottomMargin + J.top + J.bottom + 0, mVar2.height);
        if (y0(b9, x8, x9, mVar2)) {
            b9.measure(x8, x9);
        }
        bVar.f1566a = this.r.c(b9);
        if (this.f1554p == 1) {
            if (X0()) {
                i11 = this.f1672n - F();
                i9 = i11 - this.r.d(b9);
            } else {
                int E = E();
                int i12 = E;
                i11 = this.r.d(b9) + E;
                i9 = i12;
            }
            int i13 = cVar.f1574f;
            i8 = cVar.f1571b;
            if (i13 == -1) {
                i10 = i8;
                i8 -= bVar.f1566a;
            } else {
                i10 = bVar.f1566a + i8;
            }
        } else {
            int G = G();
            int d9 = this.r.d(b9) + G;
            int i14 = cVar.f1574f;
            int i15 = cVar.f1571b;
            if (i14 == -1) {
                i10 = d9;
                i9 = i15 - bVar.f1566a;
                int i16 = G;
                i11 = i15;
                i8 = i16;
            } else {
                int i17 = bVar.f1566a + i15;
                i10 = d9;
                i9 = i15;
                i8 = G;
                i11 = i17;
            }
        }
        RecyclerView.l.P(b9, i9, i8, i11, i10);
        if (mVar.c() || mVar.b()) {
            bVar.f1568c = true;
        }
        bVar.f1569d = b9.hasFocusable();
    }

    public void Z0(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i8) {
    }

    public final PointF a(int i8) {
        if (w() == 0) {
            return null;
        }
        boolean z8 = false;
        int i9 = 1;
        if (i8 < RecyclerView.l.H(v(0))) {
            z8 = true;
        }
        if (z8 != this.f1558u) {
            i9 = -1;
        }
        return this.f1554p == 0 ? new PointF((float) i9, 0.0f) : new PointF(0.0f, (float) i9);
    }

    public final void a1(RecyclerView.s sVar, c cVar) {
        if (cVar.f1570a && !cVar.f1580l) {
            int i8 = cVar.f1575g;
            int i9 = cVar.f1577i;
            if (cVar.f1574f == -1) {
                int w8 = w();
                if (i8 >= 0) {
                    int f9 = (this.r.f() - i8) + i9;
                    if (this.f1558u) {
                        for (int i10 = 0; i10 < w8; i10++) {
                            View v8 = v(i10);
                            if (this.r.e(v8) < f9 || this.r.o(v8) < f9) {
                                b1(sVar, 0, i10);
                                return;
                            }
                        }
                        return;
                    }
                    int i11 = w8 - 1;
                    for (int i12 = i11; i12 >= 0; i12--) {
                        View v9 = v(i12);
                        if (this.r.e(v9) < f9 || this.r.o(v9) < f9) {
                            b1(sVar, i11, i12);
                            return;
                        }
                    }
                }
            } else if (i8 >= 0) {
                int i13 = i8 - i9;
                int w9 = w();
                if (this.f1558u) {
                    int i14 = w9 - 1;
                    for (int i15 = i14; i15 >= 0; i15--) {
                        View v10 = v(i15);
                        if (this.r.b(v10) > i13 || this.r.n(v10) > i13) {
                            b1(sVar, i14, i15);
                            return;
                        }
                    }
                    return;
                }
                for (int i16 = 0; i16 < w9; i16++) {
                    View v11 = v(i16);
                    if (this.r.b(v11) > i13 || this.r.n(v11) > i13) {
                        b1(sVar, 0, i16);
                        return;
                    }
                }
            }
        }
    }

    public final void b1(RecyclerView.s sVar, int i8, int i9) {
        if (i8 != i9) {
            if (i9 > i8) {
                while (true) {
                    i9--;
                    if (i9 >= i8) {
                        View v8 = v(i9);
                        n0(i9);
                        sVar.f(v8);
                    } else {
                        return;
                    }
                }
            } else {
                while (i8 > i9) {
                    View v9 = v(i8);
                    n0(i8);
                    sVar.f(v9);
                    i8--;
                }
            }
        }
    }

    public final void c(String str) {
        if (this.f1561z == null) {
            super.c(str);
        }
    }

    public final void c1() {
        this.f1558u = (this.f1554p == 1 || !X0()) ? this.f1557t : !this.f1557t;
    }

    public final boolean d() {
        return this.f1554p == 0;
    }

    public final int d1(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (w() == 0 || i8 == 0) {
            return 0;
        }
        K0();
        this.f1555q.f1570a = true;
        int i9 = i8 > 0 ? 1 : -1;
        int abs = Math.abs(i8);
        g1(i9, abs, true, xVar);
        c cVar = this.f1555q;
        int L0 = cVar.f1575g + L0(sVar, cVar, xVar, false);
        if (L0 < 0) {
            return 0;
        }
        if (abs > L0) {
            i8 = i9 * L0;
        }
        this.r.p(-i8);
        this.f1555q.f1578j = i8;
        return i8;
    }

    public final boolean e() {
        return this.f1554p == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e0(androidx.recyclerview.widget.RecyclerView.s r19, androidx.recyclerview.widget.RecyclerView.x r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1561z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f1560x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r20.b()
            if (r3 != 0) goto L_0x0019
            r18.k0(r19)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1561z
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002a
            int r3 = r3.f1581f
            if (r3 < 0) goto L_0x0025
            r7 = r5
            goto L_0x0026
        L_0x0025:
            r7 = r6
        L_0x0026:
            if (r7 == 0) goto L_0x002a
            r0.f1560x = r3
        L_0x002a:
            r18.K0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r3.f1570a = r6
            r18.c1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1661b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            androidx.recyclerview.widget.b r8 = r0.f1660a
            boolean r8 = r8.j(r3)
            if (r8 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r8 = r0.A
            boolean r9 = r8.e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0081
            int r9 = r0.f1560x
            if (r9 != r4) goto L_0x0081
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f1561z
            if (r9 == 0) goto L_0x005a
            goto L_0x0081
        L_0x005a:
            if (r3 == 0) goto L_0x024f
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.g()
            if (r9 >= r11) goto L_0x0078
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.b(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.k()
            if (r9 > r11) goto L_0x024f
        L_0x0078:
            int r9 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r8.b(r3, r9)
            goto L_0x024f
        L_0x0081:
            r8.c()
            boolean r3 = r0.f1558u
            boolean r9 = r0.f1559v
            r3 = r3 ^ r9
            r8.f1565d = r3
            boolean r3 = r2.f1717g
            if (r3 != 0) goto L_0x0189
            int r3 = r0.f1560x
            if (r3 != r4) goto L_0x0095
            goto L_0x0189
        L_0x0095:
            if (r3 < 0) goto L_0x0185
            int r9 = r20.b()
            if (r3 < r9) goto L_0x009f
            goto L_0x0185
        L_0x009f:
            int r3 = r0.f1560x
            r8.f1563b = r3
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f1561z
            if (r9 == 0) goto L_0x00ce
            int r11 = r9.f1581f
            if (r11 < 0) goto L_0x00ad
            r11 = r5
            goto L_0x00ae
        L_0x00ad:
            r11 = r6
        L_0x00ae:
            if (r11 == 0) goto L_0x00ce
            boolean r3 = r9.f1583h
            r8.f1565d = r3
            if (r3 == 0) goto L_0x00c2
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f1561z
            int r9 = r9.f1582g
            goto L_0x0176
        L_0x00c2:
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f1561z
            int r9 = r9.f1582g
            goto L_0x0180
        L_0x00ce:
            int r9 = r0.y
            if (r9 != r10) goto L_0x0168
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x0136
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.c(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.l()
            if (r9 <= r11) goto L_0x00e8
            goto L_0x0154
        L_0x00e8:
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.k()
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x0103
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.k()
            r8.f1564c = r3
            r8.f1565d = r6
            goto L_0x0183
        L_0x0103:
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.g()
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.b(r3)
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x011e
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.g()
            r8.f1564c = r3
            r8.f1565d = r5
            goto L_0x0183
        L_0x011e:
            boolean r9 = r8.f1565d
            if (r9 == 0) goto L_0x012f
            androidx.recyclerview.widget.t r9 = r0.r
            int r3 = r9.b(r3)
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.m()
            goto L_0x0180
        L_0x012f:
            androidx.recyclerview.widget.t r9 = r0.r
            int r3 = r9.e(r3)
            goto L_0x0181
        L_0x0136:
            int r3 = r18.w()
            if (r3 <= 0) goto L_0x0154
            android.view.View r3 = r0.v(r6)
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            int r9 = r0.f1560x
            if (r9 >= r3) goto L_0x014a
            r3 = r5
            goto L_0x014b
        L_0x014a:
            r3 = r6
        L_0x014b:
            boolean r9 = r0.f1558u
            if (r3 != r9) goto L_0x0151
            r3 = r5
            goto L_0x0152
        L_0x0151:
            r3 = r6
        L_0x0152:
            r8.f1565d = r3
        L_0x0154:
            boolean r3 = r8.f1565d
            if (r3 == 0) goto L_0x015f
            androidx.recyclerview.widget.t r3 = r8.f1562a
            int r3 = r3.g()
            goto L_0x0165
        L_0x015f:
            androidx.recyclerview.widget.t r3 = r8.f1562a
            int r3 = r3.k()
        L_0x0165:
            r8.f1564c = r3
            goto L_0x0183
        L_0x0168:
            boolean r3 = r0.f1558u
            r8.f1565d = r3
            if (r3 == 0) goto L_0x0178
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.g()
            int r9 = r0.y
        L_0x0176:
            int r3 = r3 - r9
            goto L_0x0181
        L_0x0178:
            androidx.recyclerview.widget.t r3 = r0.r
            int r3 = r3.k()
            int r9 = r0.y
        L_0x0180:
            int r3 = r3 + r9
        L_0x0181:
            r8.f1564c = r3
        L_0x0183:
            r3 = r5
            goto L_0x018a
        L_0x0185:
            r0.f1560x = r4
            r0.y = r10
        L_0x0189:
            r3 = r6
        L_0x018a:
            if (r3 == 0) goto L_0x018e
            goto L_0x024d
        L_0x018e:
            int r3 = r18.w()
            if (r3 != 0) goto L_0x0196
            goto L_0x0229
        L_0x0196:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f1661b
            if (r3 != 0) goto L_0x019c
        L_0x019a:
            r3 = 0
            goto L_0x01ab
        L_0x019c:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x019a
            androidx.recyclerview.widget.b r9 = r0.f1660a
            boolean r9 = r9.j(r3)
            if (r9 == 0) goto L_0x01ab
            goto L_0x019a
        L_0x01ab:
            if (r3 == 0) goto L_0x01d6
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r9 = (androidx.recyclerview.widget.RecyclerView.m) r9
            boolean r11 = r9.c()
            if (r11 != 0) goto L_0x01cb
            int r11 = r9.a()
            if (r11 < 0) goto L_0x01cb
            int r9 = r9.a()
            int r11 = r20.b()
            if (r9 >= r11) goto L_0x01cb
            r9 = r5
            goto L_0x01cc
        L_0x01cb:
            r9 = r6
        L_0x01cc:
            if (r9 == 0) goto L_0x01d6
            int r9 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r8.b(r3, r9)
            goto L_0x0227
        L_0x01d6:
            boolean r3 = r0.f1556s
            boolean r9 = r0.f1559v
            if (r3 == r9) goto L_0x01dd
            goto L_0x0229
        L_0x01dd:
            boolean r3 = r8.f1565d
            android.view.View r3 = r0.S0(r1, r2, r3, r9)
            if (r3 == 0) goto L_0x0229
            int r9 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r8.a(r3, r9)
            boolean r9 = r2.f1717g
            if (r9 != 0) goto L_0x0227
            boolean r9 = r18.D0()
            if (r9 == 0) goto L_0x0227
            androidx.recyclerview.widget.t r9 = r0.r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r3 = r11.b(r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.k()
            androidx.recyclerview.widget.t r12 = r0.r
            int r12 = r12.g()
            if (r3 > r11) goto L_0x0214
            if (r9 >= r11) goto L_0x0214
            r13 = r5
            goto L_0x0215
        L_0x0214:
            r13 = r6
        L_0x0215:
            if (r9 < r12) goto L_0x021b
            if (r3 <= r12) goto L_0x021b
            r3 = r5
            goto L_0x021c
        L_0x021b:
            r3 = r6
        L_0x021c:
            if (r13 != 0) goto L_0x0220
            if (r3 == 0) goto L_0x0227
        L_0x0220:
            boolean r3 = r8.f1565d
            if (r3 == 0) goto L_0x0225
            r11 = r12
        L_0x0225:
            r8.f1564c = r11
        L_0x0227:
            r3 = r5
            goto L_0x022a
        L_0x0229:
            r3 = r6
        L_0x022a:
            if (r3 == 0) goto L_0x022d
            goto L_0x024d
        L_0x022d:
            boolean r3 = r8.f1565d
            if (r3 == 0) goto L_0x0238
            androidx.recyclerview.widget.t r3 = r8.f1562a
            int r3 = r3.g()
            goto L_0x023e
        L_0x0238:
            androidx.recyclerview.widget.t r3 = r8.f1562a
            int r3 = r3.k()
        L_0x023e:
            r8.f1564c = r3
            boolean r3 = r0.f1559v
            if (r3 == 0) goto L_0x024a
            int r3 = r20.b()
            int r3 = r3 + r4
            goto L_0x024b
        L_0x024a:
            r3 = r6
        L_0x024b:
            r8.f1563b = r3
        L_0x024d:
            r8.e = r5
        L_0x024f:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r9 = r3.f1578j
            if (r9 < 0) goto L_0x0257
            r9 = r5
            goto L_0x0258
        L_0x0257:
            r9 = r4
        L_0x0258:
            r3.f1574f = r9
            int[] r3 = r0.D
            r3[r6] = r6
            r3[r5] = r6
            r0.E0(r2, r3)
            r9 = r3[r6]
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.k()
            int r9 = r9 + r11
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r6, r3)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.h()
            int r3 = r3 + r11
            boolean r11 = r2.f1717g
            if (r11 == 0) goto L_0x02b8
            int r11 = r0.f1560x
            if (r11 == r4) goto L_0x02b8
            int r12 = r0.y
            if (r12 == r10) goto L_0x02b8
            android.view.View r10 = r0.q(r11)
            if (r10 == 0) goto L_0x02b8
            boolean r11 = r0.f1558u
            if (r11 == 0) goto L_0x02a3
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.g()
            androidx.recyclerview.widget.t r12 = r0.r
            int r10 = r12.b(r10)
            int r11 = r11 - r10
            int r10 = r0.y
            goto L_0x02b2
        L_0x02a3:
            androidx.recyclerview.widget.t r11 = r0.r
            int r10 = r11.e(r10)
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.k()
            int r10 = r10 - r11
            int r11 = r0.y
        L_0x02b2:
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x02b7
            int r9 = r9 + r11
            goto L_0x02b8
        L_0x02b7:
            int r3 = r3 - r11
        L_0x02b8:
            boolean r10 = r8.f1565d
            if (r10 == 0) goto L_0x02c1
            boolean r10 = r0.f1558u
            if (r10 == 0) goto L_0x02c5
            goto L_0x02c7
        L_0x02c1:
            boolean r10 = r0.f1558u
            if (r10 == 0) goto L_0x02c7
        L_0x02c5:
            r10 = r4
            goto L_0x02c8
        L_0x02c7:
            r10 = r5
        L_0x02c8:
            r0.Z0(r1, r2, r8, r10)
            r18.p(r19)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.i()
            if (r11 != 0) goto L_0x02e2
            androidx.recyclerview.widget.t r11 = r0.r
            int r11 = r11.f()
            if (r11 != 0) goto L_0x02e2
            r11 = r5
            goto L_0x02e3
        L_0x02e2:
            r11 = r6
        L_0x02e3:
            r10.f1580l = r11
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.f1577i = r6
            boolean r10 = r8.f1565d
            if (r10 == 0) goto L_0x0337
            int r10 = r8.f1563b
            int r11 = r8.f1564c
            r0.i1(r10, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.f1576h = r9
            r0.L0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.f1555q
            int r10 = r9.f1571b
            int r11 = r9.f1573d
            int r9 = r9.f1572c
            if (r9 <= 0) goto L_0x030b
            int r3 = r3 + r9
        L_0x030b:
            int r9 = r8.f1563b
            int r12 = r8.f1564c
            r0.h1(r9, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.f1555q
            r9.f1576h = r3
            int r3 = r9.f1573d
            int r12 = r9.e
            int r3 = r3 + r12
            r9.f1573d = r3
            r0.L0(r1, r9, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r9 = r3.f1571b
            int r3 = r3.f1572c
            if (r3 <= 0) goto L_0x0383
            r0.i1(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.f1576h = r3
            r0.L0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r10 = r3.f1571b
            goto L_0x0383
        L_0x0337:
            int r10 = r8.f1563b
            int r11 = r8.f1564c
            r0.h1(r10, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.f1576h = r3
            r0.L0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r10 = r3.f1571b
            int r11 = r3.f1573d
            int r3 = r3.f1572c
            if (r3 <= 0) goto L_0x0350
            int r9 = r9 + r3
        L_0x0350:
            int r3 = r8.f1563b
            int r12 = r8.f1564c
            r0.i1(r3, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r3.f1576h = r9
            int r9 = r3.f1573d
            int r12 = r3.e
            int r9 = r9 + r12
            r3.f1573d = r9
            r0.L0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r9 = r3.f1571b
            int r3 = r3.f1572c
            if (r3 <= 0) goto L_0x037e
            r0.h1(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f1555q
            r10.f1576h = r3
            r0.L0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            int r3 = r3.f1571b
            r10 = r9
            r9 = r3
            goto L_0x0383
        L_0x037e:
            r17 = r10
            r10 = r9
            r9 = r17
        L_0x0383:
            int r3 = r18.w()
            if (r3 <= 0) goto L_0x03a7
            boolean r3 = r0.f1558u
            boolean r11 = r0.f1559v
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x039b
            int r3 = r0.T0(r9, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.U0(r10, r1, r2, r6)
            goto L_0x03a5
        L_0x039b:
            int r3 = r0.U0(r10, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.T0(r9, r1, r2, r6)
        L_0x03a5:
            int r10 = r10 + r3
            int r9 = r9 + r3
        L_0x03a7:
            boolean r3 = r2.f1721k
            if (r3 == 0) goto L_0x0446
            int r3 = r18.w()
            if (r3 == 0) goto L_0x0446
            boolean r3 = r2.f1717g
            if (r3 != 0) goto L_0x0446
            boolean r3 = r18.D0()
            if (r3 != 0) goto L_0x03bd
            goto L_0x0446
        L_0x03bd:
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f1693d
            int r11 = r3.size()
            android.view.View r12 = r0.v(r6)
            int r12 = androidx.recyclerview.widget.RecyclerView.l.H(r12)
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x03ce:
            if (r13 >= r11) goto L_0x0401
            java.lang.Object r16 = r3.get(r13)
            r5 = r16
            androidx.recyclerview.widget.RecyclerView$a0 r5 = (androidx.recyclerview.widget.RecyclerView.a0) r5
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x03df
            goto L_0x03fc
        L_0x03df:
            int r7 = r5.c()
            if (r7 >= r12) goto L_0x03e7
            r7 = 1
            goto L_0x03e8
        L_0x03e7:
            r7 = r6
        L_0x03e8:
            boolean r6 = r0.f1558u
            if (r7 == r6) goto L_0x03ee
            r6 = r4
            goto L_0x03ef
        L_0x03ee:
            r6 = 1
        L_0x03ef:
            android.view.View r5 = r5.f1631a
            androidx.recyclerview.widget.t r7 = r0.r
            int r5 = r7.c(r5)
            if (r6 != r4) goto L_0x03fb
            int r14 = r14 + r5
            goto L_0x03fc
        L_0x03fb:
            int r15 = r15 + r5
        L_0x03fc:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            goto L_0x03ce
        L_0x0401:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1555q
            r4.f1579k = r3
            if (r14 <= 0) goto L_0x0423
            android.view.View r3 = r18.W0()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r0.i1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r3.f1576h = r14
            r4 = 0
            r3.f1572c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r0.L0(r1, r3, r2, r4)
            goto L_0x0424
        L_0x0423:
            r4 = 0
        L_0x0424:
            if (r15 <= 0) goto L_0x0441
            android.view.View r3 = r18.V0()
            int r3 = androidx.recyclerview.widget.RecyclerView.l.H(r3)
            r0.h1(r3, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r3.f1576h = r15
            r3.f1572c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1555q
            r0.L0(r1, r3, r2, r4)
            goto L_0x0442
        L_0x0441:
            r5 = 0
        L_0x0442:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f1555q
            r1.f1579k = r5
        L_0x0446:
            boolean r1 = r2.f1717g
            if (r1 != 0) goto L_0x0453
            androidx.recyclerview.widget.t r1 = r0.r
            int r2 = r1.l()
            r1.f1906b = r2
            goto L_0x0456
        L_0x0453:
            r8.c()
        L_0x0456:
            boolean r1 = r0.f1559v
            r0.f1556s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.e0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void e1(int i8) {
        if (i8 == 0 || i8 == 1) {
            c((String) null);
            if (i8 != this.f1554p || this.r == null) {
                t a9 = t.a(this, i8);
                this.r = a9;
                this.A.f1562a = a9;
                this.f1554p = i8;
                p0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i8);
    }

    public void f0(RecyclerView.x xVar) {
        this.f1561z = null;
        this.f1560x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public void f1(boolean z8) {
        c((String) null);
        if (this.f1559v != z8) {
            this.f1559v = z8;
            p0();
        }
    }

    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f1561z = dVar;
            if (this.f1560x != -1) {
                dVar.f1581f = -1;
            }
            p0();
        }
    }

    public final void g1(int i8, int i9, boolean z8, RecyclerView.x xVar) {
        int i10;
        int i11 = 1;
        boolean z9 = false;
        this.f1555q.f1580l = this.r.i() == 0 && this.r.f() == 0;
        this.f1555q.f1574f = i8;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        E0(xVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i8 == 1) {
            z9 = true;
        }
        c cVar = this.f1555q;
        int i12 = z9 ? max2 : max;
        cVar.f1576h = i12;
        if (!z9) {
            max = max2;
        }
        cVar.f1577i = max;
        if (z9) {
            cVar.f1576h = i12 + this.r.h();
            View V0 = V0();
            c cVar2 = this.f1555q;
            if (this.f1558u) {
                i11 = -1;
            }
            cVar2.e = i11;
            int H = RecyclerView.l.H(V0);
            c cVar3 = this.f1555q;
            cVar2.f1573d = H + cVar3.e;
            cVar3.f1571b = this.r.b(V0);
            i10 = this.r.b(V0) - this.r.g();
        } else {
            View W0 = W0();
            this.f1555q.f1576h += this.r.k();
            c cVar4 = this.f1555q;
            if (!this.f1558u) {
                i11 = -1;
            }
            cVar4.e = i11;
            int H2 = RecyclerView.l.H(W0);
            c cVar5 = this.f1555q;
            cVar4.f1573d = H2 + cVar5.e;
            cVar5.f1571b = this.r.e(W0);
            i10 = (-this.r.e(W0)) + this.r.k();
        }
        c cVar6 = this.f1555q;
        cVar6.f1572c = i9;
        if (z8) {
            cVar6.f1572c = i9 - i10;
        }
        cVar6.f1575g = i10;
    }

    public final void h(int i8, int i9, RecyclerView.x xVar, RecyclerView.l.c cVar) {
        if (this.f1554p != 0) {
            i8 = i9;
        }
        if (w() != 0 && i8 != 0) {
            K0();
            g1(i8 > 0 ? 1 : -1, Math.abs(i8), true, xVar);
            F0(xVar, this.f1555q, cVar);
        }
    }

    public final Parcelable h0() {
        d dVar = this.f1561z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (w() > 0) {
            K0();
            boolean z8 = this.f1556s ^ this.f1558u;
            dVar2.f1583h = z8;
            if (z8) {
                View V0 = V0();
                dVar2.f1582g = this.r.g() - this.r.b(V0);
                dVar2.f1581f = RecyclerView.l.H(V0);
            } else {
                View W0 = W0();
                dVar2.f1581f = RecyclerView.l.H(W0);
                dVar2.f1582g = this.r.e(W0) - this.r.k();
            }
        } else {
            dVar2.f1581f = -1;
        }
        return dVar2;
    }

    public final void h1(int i8, int i9) {
        this.f1555q.f1572c = this.r.g() - i9;
        c cVar = this.f1555q;
        cVar.e = this.f1558u ? -1 : 1;
        cVar.f1573d = i8;
        cVar.f1574f = 1;
        cVar.f1571b = i9;
        cVar.f1575g = Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r7, androidx.recyclerview.widget.RecyclerView.l.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f1561z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f1581f
            if (r4 < 0) goto L_0x000d
            r5 = r1
            goto L_0x000e
        L_0x000d:
            r5 = r3
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f1583h
            goto L_0x0022
        L_0x0013:
            r6.c1()
            boolean r0 = r6.f1558u
            int r4 = r6.f1560x
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            r0 = r3
        L_0x0026:
            int r2 = r6.C
            if (r0 >= r2) goto L_0x0038
            if (r4 < 0) goto L_0x0038
            if (r4 >= r7) goto L_0x0038
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.m.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, androidx.recyclerview.widget.RecyclerView$l$c):void");
    }

    public final void i1(int i8, int i9) {
        this.f1555q.f1572c = i9 - this.r.k();
        c cVar = this.f1555q;
        cVar.f1573d = i8;
        cVar.e = this.f1558u ? 1 : -1;
        cVar.f1574f = -1;
        cVar.f1571b = i9;
        cVar.f1575g = Integer.MIN_VALUE;
    }

    public final int j(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public int k(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public int l(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final int m(RecyclerView.x xVar) {
        return G0(xVar);
    }

    public int n(RecyclerView.x xVar) {
        return H0(xVar);
    }

    public int o(RecyclerView.x xVar) {
        return I0(xVar);
    }

    public final View q(int i8) {
        int w8 = w();
        if (w8 == 0) {
            return null;
        }
        int H = i8 - RecyclerView.l.H(v(0));
        if (H >= 0 && H < w8) {
            View v8 = v(H);
            if (RecyclerView.l.H(v8) == i8) {
                return v8;
            }
        }
        return super.q(i8);
    }

    public int q0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1554p == 1) {
            return 0;
        }
        return d1(i8, sVar, xVar);
    }

    public RecyclerView.m r() {
        return new RecyclerView.m(-2, -2);
    }

    public final void r0(int i8) {
        this.f1560x = i8;
        this.y = Integer.MIN_VALUE;
        d dVar = this.f1561z;
        if (dVar != null) {
            dVar.f1581f = -1;
        }
        p0();
    }

    public int s0(int i8, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1554p == 0) {
            return 0;
        }
        return d1(i8, sVar, xVar);
    }

    public final boolean z0() {
        boolean z8;
        if (this.f1671m == 1073741824 || this.f1670l == 1073741824) {
            return false;
        }
        int w8 = w();
        int i8 = 0;
        while (true) {
            if (i8 >= w8) {
                z8 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = v(i8).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z8 = true;
                break;
            }
            i8++;
        }
        return z8;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f1554p = 1;
        this.f1557t = false;
        this.f1558u = false;
        this.f1559v = false;
        this.w = true;
        this.f1560x = -1;
        this.y = Integer.MIN_VALUE;
        this.f1561z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.l.d I = RecyclerView.l.I(context, attributeSet, i8, i9);
        e1(I.f1676a);
        boolean z8 = I.f1678c;
        c((String) null);
        if (z8 != this.f1557t) {
            this.f1557t = z8;
            p0();
        }
        f1(I.f1679d);
    }
}
