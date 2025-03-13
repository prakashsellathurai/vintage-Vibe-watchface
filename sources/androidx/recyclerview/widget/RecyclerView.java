package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.health.services.client.R;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import j0.x;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k0.c;

public class RecyclerView extends ViewGroup implements j0.k {
    public static final Interpolator A0 = new b();
    public static final int[] y0 = {16843830};

    /* renamed from: z0  reason: collision with root package name */
    public static final Class<?>[] f1584z0;
    public ArrayList A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public h F;
    public EdgeEffect G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public i K;
    public int L;
    public int M;
    public VelocityTracker N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public o T;
    public final int U;
    public final int V;
    public final float W;

    /* renamed from: a  reason: collision with root package name */
    public final u f1585a;

    /* renamed from: a0  reason: collision with root package name */
    public final float f1586a0;

    /* renamed from: b  reason: collision with root package name */
    public final s f1587b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1588b0;

    /* renamed from: c  reason: collision with root package name */
    public v f1589c;

    /* renamed from: c0  reason: collision with root package name */
    public final z f1590c0;

    /* renamed from: d  reason: collision with root package name */
    public a f1591d;

    /* renamed from: d0  reason: collision with root package name */
    public m f1592d0;
    public b e;

    /* renamed from: e0  reason: collision with root package name */
    public final m.b f1593e0;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f1594f;

    /* renamed from: f0  reason: collision with root package name */
    public final x f1595f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1596g;

    /* renamed from: g0  reason: collision with root package name */
    public q f1597g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1598h;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList f1599h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1600i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1601i0;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f1602j;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1603j0;

    /* renamed from: k  reason: collision with root package name */
    public d f1604k;

    /* renamed from: k0  reason: collision with root package name */
    public final j f1605k0;

    /* renamed from: l  reason: collision with root package name */
    public l f1606l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1607l0;

    /* renamed from: m  reason: collision with root package name */
    public t f1608m;

    /* renamed from: m0  reason: collision with root package name */
    public x f1609m0;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f1610n;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f1611n0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<k> f1612o;

    /* renamed from: o0  reason: collision with root package name */
    public j0.l f1613o0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<p> f1614p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f1615p0;

    /* renamed from: q  reason: collision with root package name */
    public p f1616q;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f1617q0;
    public boolean r;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f1618r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1619s;
    public final ArrayList s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1620t;

    /* renamed from: t0  reason: collision with root package name */
    public final Runnable f1621t0;

    /* renamed from: u  reason: collision with root package name */
    public int f1622u;
    public boolean u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1623v;

    /* renamed from: v0  reason: collision with root package name */
    public int f1624v0;
    public boolean w;

    /* renamed from: w0  reason: collision with root package name */
    public int f1625w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1626x;

    /* renamed from: x0  reason: collision with root package name */
    public final c f1627x0;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f1628z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            long j8;
            RecyclerView recyclerView = RecyclerView.this;
            i iVar = recyclerView.K;
            if (iVar != null) {
                k kVar = (k) iVar;
                ArrayList<a0> arrayList = kVar.f1827h;
                boolean z8 = !arrayList.isEmpty();
                ArrayList<k.b> arrayList2 = kVar.f1829j;
                boolean z9 = !arrayList2.isEmpty();
                ArrayList<k.a> arrayList3 = kVar.f1830k;
                boolean z10 = !arrayList3.isEmpty();
                ArrayList<a0> arrayList4 = kVar.f1828i;
                boolean z11 = !arrayList4.isEmpty();
                if (z8 || z9 || z11 || z10) {
                    Iterator<a0> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j8 = kVar.f1655d;
                        if (!hasNext) {
                            break;
                        }
                        a0 next = it.next();
                        View view = next.f1631a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f1836q.add(next);
                        animate.setDuration(j8).alpha(0.0f).setListener(new f(view, animate, kVar, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z9) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        kVar.f1832m.add(arrayList5);
                        arrayList2.clear();
                        c cVar = new c(kVar, arrayList5);
                        if (z8) {
                            View view2 = ((k.b) arrayList5.get(0)).f1842a.f1631a;
                            int[] iArr = j0.x.f4957a;
                            x.c.n(view2, cVar, j8);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z10) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        kVar.f1833n.add(arrayList6);
                        arrayList3.clear();
                        d dVar = new d(kVar, arrayList6);
                        if (z8) {
                            View view3 = ((k.a) arrayList6.get(0)).f1837a.f1631a;
                            int[] iArr2 = j0.x.f4957a;
                            x.c.n(view3, dVar, j8);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z11) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList4);
                        kVar.f1831l.add(arrayList7);
                        arrayList4.clear();
                        e eVar = new e(kVar, arrayList7);
                        if (z8 || z9 || z10) {
                            long j9 = 0;
                            if (!z8) {
                                j8 = 0;
                            }
                            long j10 = z9 ? kVar.e : 0;
                            if (z10) {
                                j9 = kVar.f1656f;
                            }
                            View view4 = ((a0) arrayList7.get(0)).f1631a;
                            int[] iArr3 = j0.x.f4957a;
                            x.c.n(view4, eVar, j8 + Math.max(j10, j9));
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            recyclerView.f1607l0 = false;
        }
    }

    public static abstract class a0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f1630t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1631a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f1632b;

        /* renamed from: c  reason: collision with root package name */
        public int f1633c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1634d = -1;
        public long e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1635f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1636g = -1;

        /* renamed from: h  reason: collision with root package name */
        public a0 f1637h = null;

        /* renamed from: i  reason: collision with root package name */
        public a0 f1638i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f1639j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f1640k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f1641l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1642m = 0;

        /* renamed from: n  reason: collision with root package name */
        public s f1643n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1644o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1645p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1646q = -1;
        public RecyclerView r;

        /* renamed from: s  reason: collision with root package name */
        public d<? extends a0> f1647s;

        public a0(View view) {
            if (view != null) {
                this.f1631a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1639j) == 0) {
                if (this.f1640k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1640k = arrayList;
                    this.f1641l = Collections.unmodifiableList(arrayList);
                }
                this.f1640k.add(obj);
            }
        }

        public final void b(int i8) {
            this.f1639j = i8 | this.f1639j;
        }

        public final int c() {
            int i8 = this.f1636g;
            return i8 == -1 ? this.f1633c : i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f1640k;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.Object> d() {
            /*
                r1 = this;
                int r0 = r1.f1639j
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L_0x0014
                java.util.ArrayList r0 = r1.f1640k
                if (r0 == 0) goto L_0x0014
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0011
                goto L_0x0014
            L_0x0011:
                java.util.List<java.lang.Object> r1 = r1.f1641l
                return r1
            L_0x0014:
                java.util.List<java.lang.Object> r1 = f1630t
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0.d():java.util.List");
        }

        public final boolean e() {
            View view = this.f1631a;
            return (view.getParent() == null || view.getParent() == this.r) ? false : true;
        }

        public final boolean f() {
            return (this.f1639j & 1) != 0;
        }

        public final boolean g() {
            return (this.f1639j & 4) != 0;
        }

        public final boolean h() {
            if ((this.f1639j & 16) == 0) {
                int[] iArr = j0.x.f4957a;
                if (!x.c.i(this.f1631a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            return (this.f1639j & 8) != 0;
        }

        public final boolean j() {
            return this.f1643n != null;
        }

        public final boolean k() {
            return (this.f1639j & 256) != 0;
        }

        public final void l(int i8, boolean z8) {
            if (this.f1634d == -1) {
                this.f1634d = this.f1633c;
            }
            if (this.f1636g == -1) {
                this.f1636g = this.f1633c;
            }
            if (z8) {
                this.f1636g += i8;
            }
            this.f1633c += i8;
            View view = this.f1631a;
            if (view.getLayoutParams() != null) {
                ((m) view.getLayoutParams()).f1682c = true;
            }
        }

        public final void m() {
            this.f1639j = 0;
            this.f1633c = -1;
            this.f1634d = -1;
            this.e = -1;
            this.f1636g = -1;
            this.f1642m = 0;
            this.f1637h = null;
            this.f1638i = null;
            ArrayList arrayList = this.f1640k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f1639j &= -1025;
            this.f1645p = 0;
            this.f1646q = -1;
            RecyclerView.i(this);
        }

        public final void n(boolean z8) {
            int i8;
            int i9 = this.f1642m;
            int i10 = z8 ? i9 - 1 : i9 + 1;
            this.f1642m = i10;
            if (i10 < 0) {
                this.f1642m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z8 && i10 == 1) {
                i8 = this.f1639j | 16;
            } else if (z8 && i10 == 0) {
                i8 = this.f1639j & -17;
            } else {
                return;
            }
            this.f1639j = i8;
        }

        public final boolean o() {
            return (this.f1639j & 128) != 0;
        }

        public final boolean p() {
            return (this.f1639j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1633c + " id=" + this.e + ", oldPos=" + this.f1634d + ", pLpos:" + this.f1636g);
            if (j()) {
                sb.append(" scrap ");
                sb.append(this.f1644o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z8 = true;
            if ((this.f1639j & 2) != 0) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                sb.append(" not recyclable(" + this.f1642m + ")");
            }
            if ((this.f1639j & 512) == 0 && !g()) {
                z8 = false;
            }
            if (z8) {
                sb.append(" undefined adapter position");
            }
            if (this.f1631a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public class b implements Interpolator {
        public final float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class c {
        public c() {
        }
    }

    public static abstract class d<VH extends a0> {

        /* renamed from: a  reason: collision with root package name */
        public final e f1649a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1650b = false;

        /* renamed from: c  reason: collision with root package name */
        public final int f1651c = 1;

        public abstract int c();

        public long d(int i8) {
            return -1;
        }

        public void e(RecyclerView recyclerView) {
        }

        public abstract void f(VH vh, int i8);

        public abstract a0 g(ViewGroup viewGroup);

        public void h(RecyclerView recyclerView) {
        }

        public boolean i(VH vh) {
            return false;
        }

        public void j(VH vh) {
        }

        public void k(VH vh) {
        }
    }

    public static class e extends Observable<f> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((f) this.mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
    }

    public static class h {
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f1652a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f1653b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final long f1654c = 120;

        /* renamed from: d  reason: collision with root package name */
        public final long f1655d = 120;
        public final long e = 250;

        /* renamed from: f  reason: collision with root package name */
        public final long f1656f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1657a;

            /* renamed from: b  reason: collision with root package name */
            public int f1658b;

            public final void a(a0 a0Var) {
                View view = a0Var.f1631a;
                this.f1657a = view.getLeft();
                this.f1658b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void b(a0 a0Var) {
            RecyclerView recyclerView;
            int i8 = a0Var.f1639j & 14;
            if (!a0Var.g() && (i8 & 4) == 0 && (recyclerView = a0Var.r) != null) {
                recyclerView.F(a0Var);
            }
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public final void c(a0 a0Var) {
            b bVar = this.f1652a;
            if (bVar != null) {
                j jVar = (j) bVar;
                boolean z8 = true;
                a0Var.n(true);
                if (a0Var.f1637h != null && a0Var.f1638i == null) {
                    a0Var.f1637h = null;
                }
                a0Var.f1638i = null;
                if (!((a0Var.f1639j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.c0();
                    b bVar2 = recyclerView.e;
                    v vVar = (v) bVar2.f1781a;
                    RecyclerView recyclerView2 = vVar.f1910a;
                    View view = a0Var.f1631a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.k(view);
                    } else {
                        b.a aVar = bVar2.f1782b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            bVar2.k(view);
                            vVar.b(indexOfChild);
                        } else {
                            z8 = false;
                        }
                    }
                    if (z8) {
                        a0 I = RecyclerView.I(view);
                        s sVar = recyclerView.f1587b;
                        sVar.j(I);
                        sVar.g(I);
                    }
                    recyclerView.d0(!z8);
                    if (!z8 && a0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public abstract void d(a0 a0Var);

        public abstract void e();

        public abstract boolean f();
    }

    public class j implements i.b {
        public j() {
        }
    }

    public static abstract class k {
        public void d(RecyclerView recyclerView) {
        }

        public void e(Canvas canvas) {
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public b f1660a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1661b;

        /* renamed from: c  reason: collision with root package name */
        public final c0 f1662c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f1663d;
        public w e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1664f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1665g = false;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1666h = true;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f1667i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f1668j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1669k;

        /* renamed from: l  reason: collision with root package name */
        public int f1670l;

        /* renamed from: m  reason: collision with root package name */
        public int f1671m;

        /* renamed from: n  reason: collision with root package name */
        public int f1672n;

        /* renamed from: o  reason: collision with root package name */
        public int f1673o;

        public class a implements c0.b {
            public a() {
            }

            public final int a() {
                l lVar = l.this;
                return lVar.f1672n - lVar.F();
            }

            public final int b(View view) {
                l.this.getClass();
                return (view.getLeft() - l.C(view)) - ((m) view.getLayoutParams()).leftMargin;
            }

            public final View c(int i8) {
                return l.this.v(i8);
            }

            public final int d() {
                return l.this.E();
            }

            public final int e(View view) {
                l.this.getClass();
                return view.getRight() + l.J(view) + ((m) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements c0.b {
            public b() {
            }

            public final int a() {
                l lVar = l.this;
                return lVar.f1673o - lVar.D();
            }

            public final int b(View view) {
                l.this.getClass();
                return (view.getTop() - l.L(view)) - ((m) view.getLayoutParams()).topMargin;
            }

            public final View c(int i8) {
                return l.this.v(i8);
            }

            public final int d() {
                return l.this.G();
            }

            public final int e(View view) {
                l.this.getClass();
                return view.getBottom() + l.u(view) + ((m) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1676a;

            /* renamed from: b  reason: collision with root package name */
            public int f1677b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1678c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1679d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f1662c = new c0(aVar);
            this.f1663d = new c0(bVar);
        }

        public static int C(View view) {
            return ((m) view.getLayoutParams()).f1681b.left;
        }

        public static int H(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public static d I(Context context, AttributeSet attributeSet, int i8, int i9) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f11a, i8, i9);
            dVar.f1676a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1677b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1678c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1679d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int J(View view) {
            return ((m) view.getLayoutParams()).f1681b.right;
        }

        public static int L(View view) {
            return ((m) view.getLayoutParams()).f1681b.top;
        }

        public static boolean O(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i9);
            int size = View.MeasureSpec.getSize(i9);
            if (i10 > 0 && i8 != i10) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i8;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i8;
            }
            return true;
        }

        public static void P(View view, int i8, int i9, int i10, int i11) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f1681b;
            view.layout(i8 + rect.left + mVar.leftMargin, i9 + rect.top + mVar.topMargin, (i10 - rect.right) - mVar.rightMargin, (i11 - rect.bottom) - mVar.bottomMargin);
        }

        public static int g(int i8, int i9, int i10) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i9, i10) : size : Math.min(size, Math.max(i9, i10));
        }

        public static int u(View view) {
            return ((m) view.getLayoutParams()).f1681b.bottom;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r6 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x001a
                if (r8 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r8 != r1) goto L_0x002f
                if (r6 == r2) goto L_0x0020
                if (r6 == 0) goto L_0x002f
                if (r6 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r8 < 0) goto L_0x001e
            L_0x001c:
                r6 = r3
                goto L_0x0031
            L_0x001e:
                if (r8 != r1) goto L_0x0022
            L_0x0020:
                r8 = r5
                goto L_0x0031
            L_0x0022:
                if (r8 != r0) goto L_0x002f
                if (r6 == r2) goto L_0x002c
                if (r6 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r8 = r5
                r6 = r7
                goto L_0x0031
            L_0x002c:
                r8 = r5
                r6 = r2
                goto L_0x0031
            L_0x002f:
                r6 = r7
                r8 = r6
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.x(boolean, int, int, int, int):int");
        }

        public static void z(View view, Rect rect) {
            int[] iArr = RecyclerView.y0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f1681b;
            rect.set((view.getLeft() - rect2.left) - mVar.leftMargin, (view.getTop() - rect2.top) - mVar.topMargin, view.getRight() + rect2.right + mVar.rightMargin, view.getBottom() + rect2.bottom + mVar.bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.f1661b;
            d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public final boolean A0(View view, int i8, int i9, m mVar) {
            return !this.f1666h || !O(view.getMeasuredWidth(), i8, mVar.width) || !O(view.getMeasuredHeight(), i9, mVar.height);
        }

        public final int B() {
            RecyclerView recyclerView = this.f1661b;
            int[] iArr = j0.x.f4957a;
            return x.d.d(recyclerView);
        }

        public void B0(RecyclerView recyclerView, int i8) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void C0(w wVar) {
            w wVar2 = this.e;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.e)) {
                wVar2.d();
            }
            this.e = wVar;
            RecyclerView recyclerView = this.f1661b;
            z zVar = recyclerView.f1590c0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1727h.abortAnimation();
            if (wVar.f1705h) {
                Log.w("RecyclerView", "An instance of " + wVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            wVar.f1700b = recyclerView;
            wVar.f1701c = this;
            int i8 = wVar.f1699a;
            if (i8 != -1) {
                recyclerView.f1595f0.f1712a = i8;
                wVar.e = true;
                wVar.f1702d = true;
                wVar.f1703f = recyclerView.f1606l.q(i8);
                wVar.f1700b.f1590c0.a();
                wVar.f1705h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int D() {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean D0() {
            return false;
        }

        public final int E() {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int G() {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int K(s sVar, x xVar) {
            return -1;
        }

        public final void M(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((m) view.getLayoutParams()).f1681b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f1661b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1661b.f1602j;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean N() {
            return false;
        }

        public void Q(int i8) {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                int e4 = recyclerView.e.e();
                for (int i9 = 0; i9 < e4; i9++) {
                    recyclerView.e.d(i9).offsetLeftAndRight(i8);
                }
            }
        }

        public void R(int i8) {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                int e4 = recyclerView.e.e();
                for (int i9 = 0; i9 < e4; i9++) {
                    recyclerView.e.d(i9).offsetTopAndBottom(i8);
                }
            }
        }

        public void S() {
        }

        public void T(RecyclerView recyclerView) {
        }

        public View U(View view, int i8, s sVar, x xVar) {
            return null;
        }

        public void V(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1661b;
            s sVar = recyclerView.f1587b;
            x xVar = recyclerView.f1595f0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z8 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1661b.canScrollVertically(-1) && !this.f1661b.canScrollHorizontally(-1) && !this.f1661b.canScrollHorizontally(1)) {
                    z8 = false;
                }
                accessibilityEvent.setScrollable(z8);
                d dVar = this.f1661b.f1604k;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.c());
                }
            }
        }

        public void W(s sVar, x xVar, k0.c cVar) {
            boolean canScrollVertically = this.f1661b.canScrollVertically(-1);
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            if (canScrollVertically || this.f1661b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (this.f1661b.canScrollVertically(1) || this.f1661b.canScrollHorizontally(1)) {
                cVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(K(sVar, xVar), y(sVar, xVar), 0).f5099a);
        }

        public final void X(View view, k0.c cVar) {
            a0 I = RecyclerView.I(view);
            if (I != null && !I.i() && !this.f1660a.j(I.f1631a)) {
                RecyclerView recyclerView = this.f1661b;
                Y(recyclerView.f1587b, recyclerView.f1595f0, view, cVar);
            }
        }

        public void Y(s sVar, x xVar, View view, k0.c cVar) {
        }

        public void Z(int i8, int i9) {
        }

        public void a0() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r9, int r10, boolean r11) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r0 = androidx.recyclerview.widget.RecyclerView.I(r9)
                r1 = 0
                r2 = 1
                if (r11 != 0) goto L_0x0017
                boolean r11 = r0.i()
                if (r11 == 0) goto L_0x000f
                goto L_0x0017
            L_0x000f:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f1661b
                androidx.recyclerview.widget.d0 r11 = r11.f1594f
                r11.b(r0)
                goto L_0x0031
            L_0x0017:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f1661b
                androidx.recyclerview.widget.d0 r11 = r11.f1594f
                p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r11 = r11.f1797a
                java.lang.Object r3 = r11.getOrDefault(r0, r1)
                androidx.recyclerview.widget.d0$a r3 = (androidx.recyclerview.widget.d0.a) r3
                if (r3 != 0) goto L_0x002c
                androidx.recyclerview.widget.d0$a r3 = androidx.recyclerview.widget.d0.a.a()
                r11.put(r0, r3)
            L_0x002c:
                int r11 = r3.f1800a
                r11 = r11 | r2
                r3.f1800a = r11
            L_0x0031:
                android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r11 = (androidx.recyclerview.widget.RecyclerView.m) r11
                boolean r3 = r0.p()
                r4 = 0
                if (r3 != 0) goto L_0x012d
                boolean r3 = r0.j()
                if (r3 == 0) goto L_0x0046
                goto L_0x012d
            L_0x0046:
                android.view.ViewParent r3 = r9.getParent()
                androidx.recyclerview.widget.RecyclerView r5 = r8.f1661b
                r6 = -1
                if (r3 != r5) goto L_0x0108
                androidx.recyclerview.widget.b r3 = r8.f1660a
                androidx.recyclerview.widget.b$b r5 = r3.f1781a
                androidx.recyclerview.widget.v r5 = (androidx.recyclerview.widget.v) r5
                androidx.recyclerview.widget.RecyclerView r5 = r5.f1910a
                int r5 = r5.indexOfChild(r9)
                if (r5 != r6) goto L_0x005f
            L_0x005d:
                r5 = r6
                goto L_0x006d
            L_0x005f:
                androidx.recyclerview.widget.b$a r3 = r3.f1782b
                boolean r7 = r3.d(r5)
                if (r7 == 0) goto L_0x0068
                goto L_0x005d
            L_0x0068:
                int r3 = r3.b(r5)
                int r5 = r5 - r3
            L_0x006d:
                if (r10 != r6) goto L_0x0075
                androidx.recyclerview.widget.b r10 = r8.f1660a
                int r10 = r10.e()
            L_0x0075:
                if (r5 == r6) goto L_0x00e5
                if (r5 == r10) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r8 = r8.f1661b
                androidx.recyclerview.widget.RecyclerView$l r8 = r8.f1606l
                android.view.View r9 = r8.v(r5)
                if (r9 == 0) goto L_0x00c8
                r8.v(r5)
                androidx.recyclerview.widget.b r3 = r8.f1660a
                r3.c(r5)
                android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.I(r9)
                boolean r6 = r5.i()
                if (r6 == 0) goto L_0x00b6
                androidx.recyclerview.widget.RecyclerView r6 = r8.f1661b
                androidx.recyclerview.widget.d0 r6 = r6.f1594f
                p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r6 = r6.f1797a
                java.lang.Object r1 = r6.getOrDefault(r5, r1)
                androidx.recyclerview.widget.d0$a r1 = (androidx.recyclerview.widget.d0.a) r1
                if (r1 != 0) goto L_0x00b0
                androidx.recyclerview.widget.d0$a r1 = androidx.recyclerview.widget.d0.a.a()
                r6.put(r5, r1)
            L_0x00b0:
                int r6 = r1.f1800a
                r2 = r2 | r6
                r1.f1800a = r2
                goto L_0x00bd
            L_0x00b6:
                androidx.recyclerview.widget.RecyclerView r1 = r8.f1661b
                androidx.recyclerview.widget.d0 r1 = r1.f1594f
                r1.b(r5)
            L_0x00bd:
                androidx.recyclerview.widget.b r8 = r8.f1660a
                boolean r1 = r5.i()
                r8.b(r9, r10, r3, r1)
                goto L_0x0148
            L_0x00c8:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                java.lang.String r11 = "Cannot move a child from non-existing index:"
                r10.<init>(r11)
                r10.append(r5)
                androidx.recyclerview.widget.RecyclerView r8 = r8.f1661b
                java.lang.String r8 = r8.toString()
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                r9.<init>(r8)
                throw r9
            L_0x00e5:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r11.<init>(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r8.f1661b
                int r9 = r0.indexOfChild(r9)
                r11.append(r9)
                androidx.recyclerview.widget.RecyclerView r8 = r8.f1661b
                java.lang.String r8 = r8.y()
                r11.append(r8)
                java.lang.String r8 = r11.toString()
                r10.<init>(r8)
                throw r10
            L_0x0108:
                androidx.recyclerview.widget.b r1 = r8.f1660a
                r1.a(r9, r10, r4)
                r11.f1682c = r2
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.e
                if (r8 == 0) goto L_0x0148
                boolean r10 = r8.e
                if (r10 == 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r10 = r8.f1700b
                r10.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r10 = androidx.recyclerview.widget.RecyclerView.I(r9)
                if (r10 == 0) goto L_0x0126
                int r6 = r10.c()
            L_0x0126:
                int r10 = r8.f1699a
                if (r6 != r10) goto L_0x0148
                r8.f1703f = r9
                goto L_0x0148
            L_0x012d:
                boolean r1 = r0.j()
                if (r1 == 0) goto L_0x0139
                androidx.recyclerview.widget.RecyclerView$s r1 = r0.f1643n
                r1.j(r0)
                goto L_0x013f
            L_0x0139:
                int r1 = r0.f1639j
                r1 = r1 & -33
                r0.f1639j = r1
            L_0x013f:
                androidx.recyclerview.widget.b r8 = r8.f1660a
                android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
                r8.b(r9, r10, r1, r4)
            L_0x0148:
                boolean r8 = r11.f1683d
                if (r8 == 0) goto L_0x0153
                android.view.View r8 = r0.f1631a
                r8.invalidate()
                r11.f1683d = r4
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.b(android.view.View, int, boolean):void");
        }

        public void b0(int i8, int i9) {
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                recyclerView.h(str);
            }
        }

        public void c0(int i8, int i9) {
        }

        public boolean d() {
            return false;
        }

        public void d0(int i8, int i9) {
        }

        public boolean e() {
            return false;
        }

        public void e0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean f(m mVar) {
            return mVar != null;
        }

        public void f0(x xVar) {
        }

        public void g0(Parcelable parcelable) {
        }

        public void h(int i8, int i9, x xVar, c cVar) {
        }

        public Parcelable h0() {
            return null;
        }

        public void i(int i8, c cVar) {
        }

        public void i0(int i8) {
        }

        public int j(x xVar) {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006a A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean j0(androidx.recyclerview.widget.RecyclerView.s r2, androidx.recyclerview.widget.RecyclerView.x r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f1661b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x003e
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = r3
                r4 = r2
                goto L_0x0068
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0027
                int r2 = r1.f1673o
                int r5 = r1.G()
                int r2 = r2 - r5
                int r5 = r1.D()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x0028
            L_0x0027:
                r2 = r3
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f1661b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f1672n
                int r5 = r1.E()
                int r4 = r4 - r5
                int r5 = r1.F()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x0068
            L_0x003e:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0051
                int r2 = r1.f1673o
                int r4 = r1.G()
                int r2 = r2 - r4
                int r4 = r1.D()
                int r2 = r2 - r4
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f1661b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f1672n
                int r5 = r1.E()
                int r4 = r4 - r5
                int r5 = r1.F()
                int r4 = r4 - r5
                goto L_0x0068
            L_0x0067:
                r4 = r3
            L_0x0068:
                if (r2 != 0) goto L_0x006d
                if (r4 != 0) goto L_0x006d
                return r3
            L_0x006d:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f1661b
                r1.a0(r4, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.j0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        public int k(x xVar) {
            return 0;
        }

        public final void k0(s sVar) {
            int w = w();
            while (true) {
                w--;
                if (w < 0) {
                    return;
                }
                if (!RecyclerView.I(v(w)).o()) {
                    View v8 = v(w);
                    n0(w);
                    sVar.f(v8);
                }
            }
        }

        public int l(x xVar) {
            return 0;
        }

        public final void l0(s sVar) {
            ArrayList<a0> arrayList;
            int size = sVar.f1690a.size();
            int i8 = size - 1;
            while (true) {
                arrayList = sVar.f1690a;
                if (i8 < 0) {
                    break;
                }
                View view = arrayList.get(i8).f1631a;
                a0 I = RecyclerView.I(view);
                if (!I.o()) {
                    I.n(false);
                    if (I.k()) {
                        this.f1661b.removeDetachedView(view, false);
                    }
                    i iVar = this.f1661b.K;
                    if (iVar != null) {
                        iVar.d(I);
                    }
                    I.n(true);
                    a0 I2 = RecyclerView.I(view);
                    I2.f1643n = null;
                    I2.f1644o = false;
                    I2.f1639j &= -33;
                    sVar.g(I2);
                }
                i8--;
            }
            arrayList.clear();
            ArrayList<a0> arrayList2 = sVar.f1691b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f1661b.invalidate();
            }
        }

        public int m(x xVar) {
            return 0;
        }

        public final void m0(View view, s sVar) {
            b bVar = this.f1660a;
            v vVar = (v) bVar.f1781a;
            int indexOfChild = vVar.f1910a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f1782b.f(indexOfChild)) {
                    bVar.k(view);
                }
                vVar.b(indexOfChild);
            }
            sVar.f(view);
        }

        public int n(x xVar) {
            return 0;
        }

        public final void n0(int i8) {
            if (v(i8) != null) {
                b bVar = this.f1660a;
                int f9 = bVar.f(i8);
                v vVar = (v) bVar.f1781a;
                View childAt = vVar.f1910a.getChildAt(f9);
                if (childAt != null) {
                    if (bVar.f1782b.f(f9)) {
                        bVar.k(childAt);
                    }
                    vVar.b(f9);
                }
            }
        }

        public int o(x xVar) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
            if (r8 == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean o0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.E()
                int r1 = r8.G()
                int r2 = r8.f1672n
                int r3 = r8.F()
                int r2 = r2 - r3
                int r3 = r8.f1673o
                int r4 = r8.D()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.B()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00ab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0074
                goto L_0x00a8
            L_0x0074:
                int r11 = r8.E()
                int r13 = r8.G()
                int r3 = r8.f1672n
                int r4 = r8.F()
                int r3 = r3 - r4
                int r4 = r8.f1673o
                int r5 = r8.D()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r8 = r8.f1661b
                android.graphics.Rect r8 = r8.f1598h
                z(r10, r8)
                int r10 = r8.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x00a8
                int r10 = r8.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x00a8
                int r10 = r8.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x00a8
                int r8 = r8.bottom
                int r8 = r8 - r1
                if (r8 > r13) goto L_0x00a6
                goto L_0x00a8
            L_0x00a6:
                r8 = r7
                goto L_0x00a9
            L_0x00a8:
                r8 = r0
            L_0x00a9:
                if (r8 == 0) goto L_0x00b0
            L_0x00ab:
                if (r2 != 0) goto L_0x00b1
                if (r1 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                return r0
            L_0x00b1:
                if (r12 == 0) goto L_0x00b7
                r9.scrollBy(r2, r1)
                goto L_0x00ba
            L_0x00b7:
                r9.a0(r2, r1, r0)
            L_0x00ba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.o0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public final void p(s sVar) {
            int w = w();
            while (true) {
                w--;
                if (w >= 0) {
                    View v8 = v(w);
                    a0 I = RecyclerView.I(v8);
                    if (!I.o()) {
                        if (!I.g() || I.i() || this.f1661b.f1604k.f1650b) {
                            v(w);
                            this.f1660a.c(w);
                            sVar.h(v8);
                            this.f1661b.f1594f.b(I);
                        } else {
                            n0(w);
                            sVar.g(I);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void p0() {
            RecyclerView recyclerView = this.f1661b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public View q(int i8) {
            int w = w();
            for (int i9 = 0; i9 < w; i9++) {
                View v8 = v(i9);
                a0 I = RecyclerView.I(v8);
                if (I != null && I.c() == i8 && !I.o() && (this.f1661b.f1595f0.f1717g || !I.i())) {
                    return v8;
                }
            }
            return null;
        }

        public int q0(int i8, s sVar, x xVar) {
            return 0;
        }

        public abstract m r();

        public void r0(int i8) {
        }

        public m s(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public int s0(int i8, s sVar, x xVar) {
            return 0;
        }

        public m t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public final void t0(RecyclerView recyclerView) {
            u0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void u0(int i8, int i9) {
            this.f1672n = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            this.f1670l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.y0;
            }
            this.f1673o = View.MeasureSpec.getSize(i9);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f1671m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.y0;
            }
        }

        public final View v(int i8) {
            b bVar = this.f1660a;
            if (bVar != null) {
                return bVar.d(i8);
            }
            return null;
        }

        public void v0(Rect rect, int i8, int i9) {
            int width = rect.width() + E() + F();
            int height = rect.height() + G() + D();
            RecyclerView recyclerView = this.f1661b;
            int[] iArr = j0.x.f4957a;
            this.f1661b.setMeasuredDimension(g(i8, width, x.c.e(recyclerView)), g(i9, height, x.c.d(this.f1661b)));
        }

        public final int w() {
            b bVar = this.f1660a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void w0(int i8, int i9) {
            int w = w();
            if (w == 0) {
                this.f1661b.m(i8, i9);
                return;
            }
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < w; i14++) {
                View v8 = v(i14);
                Rect rect = this.f1661b.f1598h;
                z(v8, rect);
                int i15 = rect.left;
                if (i15 < i13) {
                    i13 = i15;
                }
                int i16 = rect.right;
                if (i16 > i10) {
                    i10 = i16;
                }
                int i17 = rect.top;
                if (i17 < i11) {
                    i11 = i17;
                }
                int i18 = rect.bottom;
                if (i18 > i12) {
                    i12 = i18;
                }
            }
            this.f1661b.f1598h.set(i13, i11, i10, i12);
            v0(this.f1661b.f1598h, i8, i9);
        }

        public final void x0(RecyclerView recyclerView) {
            int i8;
            if (recyclerView == null) {
                this.f1661b = null;
                this.f1660a = null;
                i8 = 0;
                this.f1672n = 0;
            } else {
                this.f1661b = recyclerView;
                this.f1660a = recyclerView.e;
                this.f1672n = recyclerView.getWidth();
                i8 = recyclerView.getHeight();
            }
            this.f1673o = i8;
            this.f1670l = 1073741824;
            this.f1671m = 1073741824;
        }

        public int y(s sVar, x xVar) {
            return -1;
        }

        public final boolean y0(View view, int i8, int i9, m mVar) {
            return view.isLayoutRequested() || !this.f1666h || !O(view.getWidth(), i8, mVar.width) || !O(view.getHeight(), i9, mVar.height);
        }

        public boolean z0() {
            return false;
        }
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public a0 f1680a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1681b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1682c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1683d = false;

        public m(int i8, int i9) {
            super(i8, i9);
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public m(m mVar) {
            super(mVar);
        }

        public final int a() {
            return this.f1680a.c();
        }

        public final boolean b() {
            return (this.f1680a.f1639j & 2) != 0;
        }

        public final boolean c() {
            return this.f1680a.i();
        }
    }

    public interface n {
        void a(View view);

        void b();
    }

    public static abstract class o {
    }

    public interface p {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    public static abstract class q {
        public void a(int i8, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i8, int i9) {
        }
    }

    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1684a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1685b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<a0> f1686a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f1687b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1688c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1689d = 0;
        }

        public final a a(int i8) {
            SparseArray<a> sparseArray = this.f1684a;
            a aVar = sparseArray.get(i8);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i8, aVar2);
            return aVar2;
        }
    }

    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<a0> f1690a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a0> f1691b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a0> f1692c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f1693d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1694f;

        /* renamed from: g  reason: collision with root package name */
        public r f1695g;

        public s() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f1690a = arrayList;
            this.f1693d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f1694f = 2;
        }

        public final void a(a0 a0Var, boolean z8) {
            RecyclerView.i(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            x xVar = recyclerView.f1609m0;
            if (xVar != null) {
                x.a aVar = xVar.e;
                boolean z9 = aVar instanceof x.a;
                View view = a0Var.f1631a;
                j0.x.i(view, z9 ? (j0.a) aVar.e.remove(view) : null);
            }
            if (z8) {
                t tVar = recyclerView.f1608m;
                if (tVar != null) {
                    tVar.a();
                }
                ArrayList arrayList = recyclerView.f1610n;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((t) arrayList.get(i8)).a();
                }
                d dVar = recyclerView.f1604k;
                if (dVar != null) {
                    dVar.k(a0Var);
                }
                if (recyclerView.f1595f0 != null) {
                    recyclerView.f1594f.c(a0Var);
                }
            }
            a0Var.f1647s = null;
            a0Var.r = null;
            r c9 = c();
            c9.getClass();
            int i9 = a0Var.f1635f;
            ArrayList<a0> arrayList2 = c9.a(i9).f1686a;
            if (c9.f1684a.get(i9).f1687b > arrayList2.size()) {
                a0Var.m();
                arrayList2.add(a0Var);
            }
        }

        public final int b(int i8) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i8 >= 0 && i8 < recyclerView.f1595f0.b()) {
                return !recyclerView.f1595f0.f1717g ? i8 : recyclerView.f1591d.f(i8, 0);
            }
            throw new IndexOutOfBoundsException("invalid position " + i8 + ". State item count is " + recyclerView.f1595f0.b() + recyclerView.y());
        }

        public final r c() {
            if (this.f1695g == null) {
                this.f1695g = new r();
            }
            return this.f1695g;
        }

        public final void d() {
            ArrayList<a0> arrayList = this.f1692c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.y0;
            m.b bVar = RecyclerView.this.f1593e0;
            int[] iArr2 = bVar.f1881c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f1882d = 0;
        }

        public final void e(int i8) {
            ArrayList<a0> arrayList = this.f1692c;
            a(arrayList.get(i8), true);
            arrayList.remove(i8);
        }

        public final void f(View view) {
            a0 I = RecyclerView.I(view);
            boolean k8 = I.k();
            RecyclerView recyclerView = RecyclerView.this;
            if (k8) {
                recyclerView.removeDetachedView(view, false);
            }
            if (I.j()) {
                I.f1643n.j(I);
            } else if (I.p()) {
                I.f1639j &= -33;
            }
            g(I);
            if (recyclerView.K != null && !I.h()) {
                recyclerView.K.d(I);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g(androidx.recyclerview.widget.RecyclerView.a0 r12) {
            /*
                r11 = this;
                boolean r0 = r12.j()
                r1 = 0
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 1
                android.view.View r4 = r12.f1631a
                if (r0 != 0) goto L_0x0105
                android.view.ViewParent r0 = r4.getParent()
                if (r0 == 0) goto L_0x0014
                goto L_0x0105
            L_0x0014:
                boolean r0 = r12.k()
                if (r0 != 0) goto L_0x00ea
                boolean r0 = r12.o()
                if (r0 != 0) goto L_0x00d2
                int r0 = r12.f1639j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                int[] r0 = j0.x.f4957a
                boolean r0 = j0.x.c.i(r4)
                if (r0 == 0) goto L_0x0030
                r0 = r3
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView$d r4 = r2.f1604k
                if (r4 == 0) goto L_0x003f
                if (r0 == 0) goto L_0x003f
                boolean r4 = r4.i(r12)
                if (r4 == 0) goto L_0x003f
                r4 = r3
                goto L_0x0040
            L_0x003f:
                r4 = r1
            L_0x0040:
                if (r4 != 0) goto L_0x004c
                boolean r4 = r12.h()
                if (r4 == 0) goto L_0x0049
                goto L_0x004c
            L_0x0049:
                r11 = r1
                goto L_0x00c1
            L_0x004c:
                int r4 = r11.f1694f
                if (r4 <= 0) goto L_0x00b8
                int r4 = r12.f1639j
                r4 = r4 & 526(0x20e, float:7.37E-43)
                if (r4 == 0) goto L_0x0058
                r4 = r3
                goto L_0x0059
            L_0x0058:
                r4 = r1
            L_0x0059:
                if (r4 != 0) goto L_0x00b8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r4 = r11.f1692c
                int r5 = r4.size()
                int r6 = r11.f1694f
                if (r5 < r6) goto L_0x006c
                if (r5 <= 0) goto L_0x006c
                r11.e(r1)
                int r5 = r5 + -1
            L_0x006c:
                int[] r6 = androidx.recyclerview.widget.RecyclerView.y0
                if (r5 <= 0) goto L_0x00b3
                int r6 = r12.f1633c
                androidx.recyclerview.widget.m$b r7 = r2.f1593e0
                int[] r8 = r7.f1881c
                if (r8 == 0) goto L_0x008a
                int r8 = r7.f1882d
                int r8 = r8 * 2
                r9 = r1
            L_0x007d:
                if (r9 >= r8) goto L_0x008a
                int[] r10 = r7.f1881c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x0087
                r6 = r3
                goto L_0x008b
            L_0x0087:
                int r9 = r9 + 2
                goto L_0x007d
            L_0x008a:
                r6 = r1
            L_0x008b:
                if (r6 != 0) goto L_0x00b3
            L_0x008d:
                int r5 = r5 + -1
                if (r5 < 0) goto L_0x00b2
                java.lang.Object r6 = r4.get(r5)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.a0) r6
                int r6 = r6.f1633c
                int[] r8 = r7.f1881c
                if (r8 == 0) goto L_0x00af
                int r8 = r7.f1882d
                int r8 = r8 * 2
                r9 = r1
            L_0x00a2:
                if (r9 >= r8) goto L_0x00af
                int[] r10 = r7.f1881c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x00ac
                r6 = r3
                goto L_0x00b0
            L_0x00ac:
                int r9 = r9 + 2
                goto L_0x00a2
            L_0x00af:
                r6 = r1
            L_0x00b0:
                if (r6 != 0) goto L_0x008d
            L_0x00b2:
                int r5 = r5 + r3
            L_0x00b3:
                r4.add(r5, r12)
                r4 = r3
                goto L_0x00b9
            L_0x00b8:
                r4 = r1
            L_0x00b9:
                if (r4 != 0) goto L_0x00bf
                r11.a(r12, r3)
                r1 = r3
            L_0x00bf:
                r11 = r1
                r1 = r4
            L_0x00c1:
                androidx.recyclerview.widget.d0 r2 = r2.f1594f
                r2.c(r12)
                if (r1 != 0) goto L_0x00d1
                if (r11 != 0) goto L_0x00d1
                if (r0 == 0) goto L_0x00d1
                r11 = 0
                r12.f1647s = r11
                r12.r = r11
            L_0x00d1:
                return
            L_0x00d2:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r12.<init>(r0)
                java.lang.String r0 = r2.y()
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x00ea:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r0.<init>(r1)
                r0.append(r12)
                java.lang.String r12 = r2.y()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            L_0x0105:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r5 = "Scrapped or attached views may not be recycled. isScrap:"
                r0.<init>(r5)
                boolean r12 = r12.j()
                r0.append(r12)
                java.lang.String r12 = " isAttached:"
                r0.append(r12)
                android.view.ViewParent r12 = r4.getParent()
                if (r12 == 0) goto L_0x0121
                r1 = r3
            L_0x0121:
                r0.append(r1)
                java.lang.String r12 = r2.y()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.g(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r6 = androidx.recyclerview.widget.RecyclerView.I(r6)
                int r0 = r6.f1639j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x000e
                r1 = r2
                goto L_0x000f
            L_0x000e:
                r1 = r3
            L_0x000f:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                if (r1 != 0) goto L_0x005b
                r0 = r0 & 2
                if (r0 == 0) goto L_0x0019
                r0 = r2
                goto L_0x001a
            L_0x0019:
                r0 = r3
            L_0x001a:
                if (r0 == 0) goto L_0x005b
                androidx.recyclerview.widget.RecyclerView$i r0 = r4.K
                if (r0 == 0) goto L_0x0045
                java.util.List r1 = r6.d()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x003f
                boolean r0 = r0.f1914g
                if (r0 == 0) goto L_0x0039
                boolean r0 = r6.g()
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = r3
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = r3
                goto L_0x0040
            L_0x003f:
                r0 = r2
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r0 = r3
                goto L_0x0046
            L_0x0045:
                r0 = r2
            L_0x0046:
                if (r0 == 0) goto L_0x0049
                goto L_0x005b
            L_0x0049:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f1691b
                if (r0 != 0) goto L_0x0054
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f1691b = r0
            L_0x0054:
                r6.f1643n = r5
                r6.f1644o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r5 = r5.f1691b
                goto L_0x008c
            L_0x005b:
                boolean r0 = r6.g()
                if (r0 == 0) goto L_0x0086
                boolean r0 = r6.i()
                if (r0 != 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView$d r0 = r4.f1604k
                boolean r0 = r0.f1650b
                if (r0 == 0) goto L_0x006e
                goto L_0x0086
            L_0x006e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r6.<init>(r0)
                java.lang.String r0 = r4.y()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L_0x0086:
                r6.f1643n = r5
                r6.f1644o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r5 = r5.f1690a
            L_0x008c:
                r5.add(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.h(android.view.View):void");
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d1, code lost:
            if (r10.f1635f != 0) goto L_0x01e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x02d8, code lost:
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x0422, code lost:
            if (r10.g() == false) goto L_0x040c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x044f, code lost:
            if ((r8 == 0 || r8 + r11 < r26) == false) goto L_0x0451;
         */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x031c  */
        /* JADX WARNING: Removed duplicated region for block: B:297:0x0520  */
        /* JADX WARNING: Removed duplicated region for block: B:298:0x0525  */
        /* JADX WARNING: Removed duplicated region for block: B:305:0x053e A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0145  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.a0 i(int r25, long r26) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                if (r1 < 0) goto L_0x0546
                androidx.recyclerview.widget.RecyclerView$x r3 = r2.f1595f0
                int r3 = r3.b()
                if (r1 >= r3) goto L_0x0546
                androidx.recyclerview.widget.RecyclerView$x r3 = r2.f1595f0
                boolean r4 = r3.f1717g
                r5 = 0
                r8 = 32
                if (r4 == 0) goto L_0x0084
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r4 = r0.f1691b
                if (r4 == 0) goto L_0x007d
                int r4 = r4.size()
                if (r4 != 0) goto L_0x0024
                goto L_0x007d
            L_0x0024:
                r9 = r5
            L_0x0025:
                if (r9 >= r4) goto L_0x0042
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r10 = r0.f1691b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$a0 r10 = (androidx.recyclerview.widget.RecyclerView.a0) r10
                boolean r11 = r10.p()
                if (r11 != 0) goto L_0x003f
                int r11 = r10.c()
                if (r11 != r1) goto L_0x003f
                r10.b(r8)
                goto L_0x007e
            L_0x003f:
                int r9 = r9 + 1
                goto L_0x0025
            L_0x0042:
                androidx.recyclerview.widget.RecyclerView$d r9 = r2.f1604k
                boolean r9 = r9.f1650b
                if (r9 == 0) goto L_0x007d
                androidx.recyclerview.widget.a r9 = r2.f1591d
                int r9 = r9.f(r1, r5)
                if (r9 <= 0) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$d r10 = r2.f1604k
                int r10 = r10.c()
                if (r9 >= r10) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$d r10 = r2.f1604k
                long r9 = r10.d(r9)
                r11 = r5
            L_0x005f:
                if (r11 >= r4) goto L_0x007d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r12 = r0.f1691b
                java.lang.Object r12 = r12.get(r11)
                androidx.recyclerview.widget.RecyclerView$a0 r12 = (androidx.recyclerview.widget.RecyclerView.a0) r12
                boolean r13 = r12.p()
                if (r13 != 0) goto L_0x007a
                long r13 = r12.e
                int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r13 != 0) goto L_0x007a
                r12.b(r8)
                r10 = r12
                goto L_0x007e
            L_0x007a:
                int r11 = r11 + 1
                goto L_0x005f
            L_0x007d:
                r10 = 0
            L_0x007e:
                if (r10 == 0) goto L_0x0082
                r4 = 1
                goto L_0x0086
            L_0x0082:
                r4 = r5
                goto L_0x0086
            L_0x0084:
                r4 = r5
                r10 = 0
            L_0x0086:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r0.f1692c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r11 = r0.f1690a
                r12 = -1
                if (r10 != 0) goto L_0x022f
                int r10 = r11.size()
                r13 = r5
            L_0x0092:
                if (r13 >= r10) goto L_0x00bf
                java.lang.Object r14 = r11.get(r13)
                androidx.recyclerview.widget.RecyclerView$a0 r14 = (androidx.recyclerview.widget.RecyclerView.a0) r14
                boolean r15 = r14.p()
                if (r15 != 0) goto L_0x00bc
                int r15 = r14.c()
                if (r15 != r1) goto L_0x00bc
                boolean r15 = r14.g()
                if (r15 != 0) goto L_0x00bc
                boolean r15 = r3.f1717g
                if (r15 != 0) goto L_0x00b6
                boolean r15 = r14.i()
                if (r15 != 0) goto L_0x00bc
            L_0x00b6:
                r14.b(r8)
                r10 = r14
                goto L_0x01af
            L_0x00bc:
                int r13 = r13 + 1
                goto L_0x0092
            L_0x00bf:
                androidx.recyclerview.widget.b r10 = r2.e
                java.util.ArrayList r13 = r10.f1783c
                int r14 = r13.size()
                r15 = r5
            L_0x00c8:
                if (r15 >= r14) goto L_0x00f3
                java.lang.Object r16 = r13.get(r15)
                android.view.View r16 = (android.view.View) r16
                androidx.recyclerview.widget.b$b r7 = r10.f1781a
                androidx.recyclerview.widget.v r7 = (androidx.recyclerview.widget.v) r7
                r7.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.I(r16)
                int r6 = r7.c()
                if (r6 != r1) goto L_0x00f0
                boolean r6 = r7.g()
                if (r6 != 0) goto L_0x00f0
                boolean r6 = r7.i()
                if (r6 != 0) goto L_0x00f0
                r6 = r16
                goto L_0x00f4
            L_0x00f0:
                int r15 = r15 + 1
                goto L_0x00c8
            L_0x00f3:
                r6 = 0
            L_0x00f4:
                if (r6 == 0) goto L_0x0188
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.I(r6)
                androidx.recyclerview.widget.b r10 = r2.e
                androidx.recyclerview.widget.b$b r13 = r10.f1781a
                androidx.recyclerview.widget.v r13 = (androidx.recyclerview.widget.v) r13
                androidx.recyclerview.widget.RecyclerView r13 = r13.f1910a
                int r13 = r13.indexOfChild(r6)
                if (r13 < 0) goto L_0x0174
                androidx.recyclerview.widget.b$a r14 = r10.f1782b
                boolean r15 = r14.d(r13)
                if (r15 == 0) goto L_0x0160
                r14.a(r13)
                r10.k(r6)
                androidx.recyclerview.widget.b r10 = r2.e
                androidx.recyclerview.widget.b$b r13 = r10.f1781a
                androidx.recyclerview.widget.v r13 = (androidx.recyclerview.widget.v) r13
                androidx.recyclerview.widget.RecyclerView r13 = r13.f1910a
                int r13 = r13.indexOfChild(r6)
                if (r13 != r12) goto L_0x0126
            L_0x0124:
                r13 = r12
                goto L_0x0134
            L_0x0126:
                androidx.recyclerview.widget.b$a r10 = r10.f1782b
                boolean r14 = r10.d(r13)
                if (r14 == 0) goto L_0x012f
                goto L_0x0124
            L_0x012f:
                int r10 = r10.b(r13)
                int r13 = r13 - r10
            L_0x0134:
                if (r13 == r12) goto L_0x0145
                androidx.recyclerview.widget.b r10 = r2.e
                r10.c(r13)
                r0.h(r6)
                r6 = 8224(0x2020, float:1.1524E-41)
                r7.b(r6)
                r10 = r7
                goto L_0x01af
            L_0x0145:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r1.<init>(r3)
                r1.append(r7)
                java.lang.String r2 = r2.y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0160:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "trying to unhide a view that was not hidden"
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0174:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "view is not a child, cannot hide "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0188:
                int r6 = r9.size()
                r7 = r5
            L_0x018d:
                if (r7 >= r6) goto L_0x01ae
                java.lang.Object r10 = r9.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r10 = (androidx.recyclerview.widget.RecyclerView.a0) r10
                boolean r13 = r10.g()
                if (r13 != 0) goto L_0x01ab
                int r13 = r10.c()
                if (r13 != r1) goto L_0x01ab
                boolean r13 = r10.e()
                if (r13 != 0) goto L_0x01ab
                r9.remove(r7)
                goto L_0x01af
            L_0x01ab:
                int r7 = r7 + 1
                goto L_0x018d
            L_0x01ae:
                r10 = 0
            L_0x01af:
                if (r10 == 0) goto L_0x022f
                boolean r6 = r10.i()
                if (r6 == 0) goto L_0x01ba
                boolean r6 = r3.f1717g
                goto L_0x01ea
            L_0x01ba:
                int r6 = r10.f1633c
                if (r6 < 0) goto L_0x0214
                androidx.recyclerview.widget.RecyclerView$d r7 = r2.f1604k
                int r7 = r7.c()
                if (r6 >= r7) goto L_0x0214
                boolean r6 = r3.f1717g
                if (r6 != 0) goto L_0x01d4
                androidx.recyclerview.widget.RecyclerView$d r6 = r2.f1604k
                r6.getClass()
                int r6 = r10.f1635f
                if (r6 == 0) goto L_0x01d4
                goto L_0x01e7
            L_0x01d4:
                androidx.recyclerview.widget.RecyclerView$d r6 = r2.f1604k
                boolean r7 = r6.f1650b
                if (r7 == 0) goto L_0x01e9
                long r13 = r10.e
                int r7 = r10.f1633c
                long r6 = r6.d(r7)
                int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r6 != 0) goto L_0x01e7
                goto L_0x01e9
            L_0x01e7:
                r6 = r5
                goto L_0x01ea
            L_0x01e9:
                r6 = 1
            L_0x01ea:
                if (r6 != 0) goto L_0x0212
                r6 = 4
                r10.b(r6)
                boolean r6 = r10.j()
                if (r6 == 0) goto L_0x0201
                android.view.View r6 = r10.f1631a
                r2.removeDetachedView(r6, r5)
                androidx.recyclerview.widget.RecyclerView$s r6 = r10.f1643n
                r6.j(r10)
                goto L_0x020d
            L_0x0201:
                boolean r6 = r10.p()
                if (r6 == 0) goto L_0x020d
                int r6 = r10.f1639j
                r6 = r6 & -33
                r10.f1639j = r6
            L_0x020d:
                r0.g(r10)
                r10 = 0
                goto L_0x022f
            L_0x0212:
                r4 = 1
                goto L_0x022f
            L_0x0214:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r1.<init>(r3)
                r1.append(r10)
                java.lang.String r2 = r2.y()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x022f:
                r15 = 2
                r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r19 = 0
                if (r10 != 0) goto L_0x03cf
                androidx.recyclerview.widget.a r6 = r2.f1591d
                int r6 = r6.f(r1, r5)
                if (r6 < 0) goto L_0x039f
                androidx.recyclerview.widget.RecyclerView$d r7 = r2.f1604k
                int r7 = r7.c()
                if (r6 >= r7) goto L_0x039f
                androidx.recyclerview.widget.RecyclerView$d r7 = r2.f1604k
                r7.getClass()
                androidx.recyclerview.widget.RecyclerView$d r7 = r2.f1604k
                boolean r13 = r7.f1650b
                if (r13 == 0) goto L_0x02e3
                long r13 = r7.d(r6)
                int r7 = r11.size()
                int r7 = r7 + r12
            L_0x025d:
                if (r7 < 0) goto L_0x02ae
                java.lang.Object r10 = r11.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r10 = (androidx.recyclerview.widget.RecyclerView.a0) r10
                r23 = r6
                long r5 = r10.e
                int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r5 != 0) goto L_0x02a8
                boolean r5 = r10.p()
                if (r5 != 0) goto L_0x02a8
                int r5 = r10.f1635f
                if (r5 != 0) goto L_0x028d
                r10.b(r8)
                boolean r5 = r10.i()
                if (r5 == 0) goto L_0x028b
                boolean r5 = r3.f1717g
                if (r5 != 0) goto L_0x028b
                int r5 = r10.f1639j
                r5 = r5 & -15
                r5 = r5 | r15
                r10.f1639j = r5
            L_0x028b:
                r6 = r10
                goto L_0x02d9
            L_0x028d:
                r11.remove(r7)
                android.view.View r5 = r10.f1631a
                r6 = 0
                r2.removeDetachedView(r5, r6)
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
                r10 = 0
                r5.f1643n = r10
                r5.f1644o = r6
                int r6 = r5.f1639j
                r6 = r6 & -33
                r5.f1639j = r6
                r0.g(r5)
            L_0x02a8:
                int r7 = r7 + -1
                r6 = r23
                r5 = 0
                goto L_0x025d
            L_0x02ae:
                r23 = r6
                int r5 = r9.size()
                int r5 = r5 + r12
            L_0x02b5:
                if (r5 < 0) goto L_0x02d8
                java.lang.Object r6 = r9.get(r5)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.a0) r6
                long r7 = r6.e
                int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r7 != 0) goto L_0x02d5
                boolean r7 = r6.e()
                if (r7 != 0) goto L_0x02d5
                int r7 = r6.f1635f
                if (r7 != 0) goto L_0x02d1
                r9.remove(r5)
                goto L_0x02d9
            L_0x02d1:
                r0.e(r5)
                goto L_0x02d8
            L_0x02d5:
                int r5 = r5 + -1
                goto L_0x02b5
            L_0x02d8:
                r6 = 0
            L_0x02d9:
                if (r6 == 0) goto L_0x02e2
                r5 = r23
                r6.f1633c = r5
                r10 = r6
                r4 = 1
                goto L_0x02e3
            L_0x02e2:
                r10 = r6
            L_0x02e3:
                if (r10 != 0) goto L_0x0322
                androidx.recyclerview.widget.RecyclerView$r r5 = r24.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$r$a> r5 = r5.f1684a
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                androidx.recyclerview.widget.RecyclerView$r$a r5 = (androidx.recyclerview.widget.RecyclerView.r.a) r5
                if (r5 == 0) goto L_0x0319
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r5 = r5.f1686a
                boolean r6 = r5.isEmpty()
                if (r6 != 0) goto L_0x0319
                int r6 = r5.size()
                int r6 = r6 + r12
            L_0x0301:
                if (r6 < 0) goto L_0x0319
                java.lang.Object r7 = r5.get(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
                boolean r7 = r7.e()
                if (r7 != 0) goto L_0x0316
                java.lang.Object r5 = r5.remove(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r5 = (androidx.recyclerview.widget.RecyclerView.a0) r5
                goto L_0x031a
            L_0x0316:
                int r6 = r6 + -1
                goto L_0x0301
            L_0x0319:
                r5 = 0
            L_0x031a:
                if (r5 == 0) goto L_0x0321
                r5.m()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.y0
            L_0x0321:
                r10 = r5
            L_0x0322:
                if (r10 != 0) goto L_0x03cf
                long r5 = r2.getNanoTime()
                int r7 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
                if (r7 == 0) goto L_0x0346
                androidx.recyclerview.widget.RecyclerView$r r7 = r0.f1695g
                r8 = 0
                androidx.recyclerview.widget.RecyclerView$r$a r7 = r7.a(r8)
                long r7 = r7.f1688c
                int r9 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
                if (r9 == 0) goto L_0x0341
                long r7 = r7 + r5
                int r7 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
                if (r7 >= 0) goto L_0x033f
                goto L_0x0341
            L_0x033f:
                r7 = 0
                goto L_0x0342
            L_0x0341:
                r7 = 1
            L_0x0342:
                if (r7 != 0) goto L_0x0346
                r7 = 0
                return r7
            L_0x0346:
                androidx.recyclerview.widget.RecyclerView$d r7 = r2.f1604k
                r7.getClass()
                java.lang.String r8 = "RV CreateView"
                f0.d.a(r8)     // Catch:{ all -> 0x039a }
                androidx.recyclerview.widget.RecyclerView$a0 r10 = r7.g(r2)     // Catch:{ all -> 0x039a }
                android.view.View r7 = r10.f1631a     // Catch:{ all -> 0x039a }
                android.view.ViewParent r7 = r7.getParent()     // Catch:{ all -> 0x039a }
                if (r7 != 0) goto L_0x0392
                r7 = 0
                r10.f1635f = r7     // Catch:{ all -> 0x039a }
                f0.d.b()
                int[] r7 = androidx.recyclerview.widget.RecyclerView.y0
                android.view.View r7 = r10.f1631a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
                if (r7 == 0) goto L_0x0373
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
                r8.<init>(r7)
                r10.f1632b = r8
            L_0x0373:
                long r7 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r9 = r0.f1695g
                long r7 = r7 - r5
                r5 = 0
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r9.a(r5)
                long r11 = r6.f1688c
                int r5 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
                if (r5 != 0) goto L_0x0386
                goto L_0x038f
            L_0x0386:
                r13 = 4
                long r11 = r11 / r13
                r21 = 3
                long r11 = r11 * r21
                long r7 = r7 / r13
                long r7 = r7 + r11
            L_0x038f:
                r6.f1688c = r7
                goto L_0x03cf
            L_0x0392:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x039a }
                java.lang.String r1 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r1)     // Catch:{ all -> 0x039a }
                throw r0     // Catch:{ all -> 0x039a }
            L_0x039a:
                r0 = move-exception
                f0.d.b()
                throw r0
            L_0x039f:
                r5 = r6
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r6 = "Inconsistency detected. Invalid item position "
                r4.<init>(r6)
                r4.append(r1)
                java.lang.String r1 = "(offset:"
                r4.append(r1)
                r4.append(r5)
                java.lang.String r1 = ").state:"
                r4.append(r1)
                int r1 = r3.b()
                r4.append(r1)
                java.lang.String r1 = r2.y()
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                r0.<init>(r1)
                throw r0
            L_0x03cf:
                if (r4 == 0) goto L_0x0400
                boolean r5 = r3.f1717g
                if (r5 != 0) goto L_0x0400
                int r5 = r10.f1639j
                r6 = r5 & 8192(0x2000, float:1.14794E-41)
                if (r6 == 0) goto L_0x03dd
                r6 = 1
                goto L_0x03de
            L_0x03dd:
                r6 = 0
            L_0x03de:
                if (r6 == 0) goto L_0x0400
                r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
                r6 = 0
                r5 = r5 | r6
                r10.f1639j = r5
                boolean r5 = r3.f1720j
                if (r5 == 0) goto L_0x0400
                androidx.recyclerview.widget.RecyclerView.i.b(r10)
                androidx.recyclerview.widget.RecyclerView$i r5 = r2.K
                r10.d()
                r5.getClass()
                androidx.recyclerview.widget.RecyclerView$i$c r5 = new androidx.recyclerview.widget.RecyclerView$i$c
                r5.<init>()
                r5.a(r10)
                r2.U(r10, r5)
            L_0x0400:
                boolean r5 = r3.f1717g
                if (r5 == 0) goto L_0x040e
                boolean r5 = r10.f()
                if (r5 == 0) goto L_0x040e
                r10.f1636g = r1
            L_0x040c:
                r6 = 0
                goto L_0x0451
            L_0x040e:
                boolean r5 = r10.f()
                if (r5 == 0) goto L_0x0424
                int r5 = r10.f1639j
                r5 = r5 & r15
                if (r5 == 0) goto L_0x041b
                r5 = 1
                goto L_0x041c
            L_0x041b:
                r5 = 0
            L_0x041c:
                if (r5 != 0) goto L_0x0424
                boolean r5 = r10.g()
                if (r5 == 0) goto L_0x040c
            L_0x0424:
                androidx.recyclerview.widget.a r5 = r2.f1591d
                r6 = 0
                int r5 = r5.f(r1, r6)
                r7 = 0
                r10.f1647s = r7
                r10.r = r2
                int r8 = r10.f1635f
                long r11 = r2.getNanoTime()
                int r9 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
                if (r9 == 0) goto L_0x0455
                androidx.recyclerview.widget.RecyclerView$r r9 = r0.f1695g
                androidx.recyclerview.widget.RecyclerView$r$a r8 = r9.a(r8)
                long r8 = r8.f1689d
                int r13 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r13 == 0) goto L_0x044e
                long r8 = r8 + r11
                int r8 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
                if (r8 >= 0) goto L_0x044c
                goto L_0x044e
            L_0x044c:
                r8 = r6
                goto L_0x044f
            L_0x044e:
                r8 = 1
            L_0x044f:
                if (r8 != 0) goto L_0x0455
            L_0x0451:
                r1 = r6
                r0 = 1
                goto L_0x0518
            L_0x0455:
                androidx.recyclerview.widget.RecyclerView$d r8 = r2.f1604k
                r8.getClass()
                androidx.recyclerview.widget.RecyclerView$d<? extends androidx.recyclerview.widget.RecyclerView$a0> r9 = r10.f1647s
                if (r9 != 0) goto L_0x0460
                r9 = 1
                goto L_0x0461
            L_0x0460:
                r9 = r6
            L_0x0461:
                if (r9 == 0) goto L_0x047c
                r10.f1633c = r5
                boolean r13 = r8.f1650b
                if (r13 == 0) goto L_0x046f
                long r13 = r8.d(r5)
                r10.e = r13
            L_0x046f:
                int r13 = r10.f1639j
                r13 = r13 & -520(0xfffffffffffffdf8, float:NaN)
                r14 = 1
                r13 = r13 | r14
                r10.f1639j = r13
                java.lang.String r13 = "RV OnBindView"
                f0.d.a(r13)
            L_0x047c:
                r10.f1647s = r8
                r10.d()
                r8.f(r10, r5)
                android.view.View r5 = r10.f1631a
                if (r9 == 0) goto L_0x04a5
                java.util.ArrayList r8 = r10.f1640k
                if (r8 == 0) goto L_0x048f
                r8.clear()
            L_0x048f:
                int r8 = r10.f1639j
                r8 = r8 & -1025(0xfffffffffffffbff, float:NaN)
                r10.f1639j = r8
                android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
                boolean r9 = r8 instanceof androidx.recyclerview.widget.RecyclerView.m
                if (r9 == 0) goto L_0x04a2
                androidx.recyclerview.widget.RecyclerView$m r8 = (androidx.recyclerview.widget.RecyclerView.m) r8
                r9 = 1
                r8.f1682c = r9
            L_0x04a2:
                f0.d.b()
            L_0x04a5:
                long r8 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r0 = r0.f1695g
                int r13 = r10.f1635f
                long r8 = r8 - r11
                androidx.recyclerview.widget.RecyclerView$r$a r0 = r0.a(r13)
                long r11 = r0.f1689d
                int r13 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
                if (r13 != 0) goto L_0x04b9
                goto L_0x04c1
            L_0x04b9:
                r13 = 4
                long r11 = r11 / r13
                r15 = 3
                long r11 = r11 * r15
                long r8 = r8 / r13
                long r8 = r8 + r11
            L_0x04c1:
                r0.f1689d = r8
                android.view.accessibility.AccessibilityManager r0 = r2.f1628z
                if (r0 == 0) goto L_0x04cf
                boolean r0 = r0.isEnabled()
                if (r0 == 0) goto L_0x04cf
                r0 = 1
                goto L_0x04d0
            L_0x04cf:
                r0 = r6
            L_0x04d0:
                if (r0 == 0) goto L_0x0510
                int[] r0 = j0.x.f4957a
                int r0 = j0.x.c.c(r5)
                if (r0 != 0) goto L_0x04df
                r0 = 1
                j0.x.c.s(r5, r0)
                goto L_0x04e0
            L_0x04df:
                r0 = 1
            L_0x04e0:
                androidx.recyclerview.widget.x r8 = r2.f1609m0
                if (r8 != 0) goto L_0x04e5
                goto L_0x0511
            L_0x04e5:
                androidx.recyclerview.widget.x$a r8 = r8.e
                boolean r9 = r8 instanceof androidx.recyclerview.widget.x.a
                if (r9 == 0) goto L_0x050c
                r8.getClass()
                android.view.View$AccessibilityDelegate r9 = j0.x.m.a(r5)
                if (r9 != 0) goto L_0x04f5
                goto L_0x0503
            L_0x04f5:
                boolean r7 = r9 instanceof j0.a.C0066a
                if (r7 == 0) goto L_0x04fe
                j0.a$a r9 = (j0.a.C0066a) r9
                j0.a r7 = r9.f4919a
                goto L_0x0503
            L_0x04fe:
                j0.a r7 = new j0.a
                r7.<init>(r9)
            L_0x0503:
                if (r7 == 0) goto L_0x050c
                if (r7 == r8) goto L_0x050c
                java.util.WeakHashMap r9 = r8.e
                r9.put(r5, r7)
            L_0x050c:
                j0.x.i(r5, r8)
                goto L_0x0511
            L_0x0510:
                r0 = 1
            L_0x0511:
                boolean r3 = r3.f1717g
                if (r3 == 0) goto L_0x0517
                r10.f1636g = r1
            L_0x0517:
                r1 = r0
            L_0x0518:
                android.view.View r3 = r10.f1631a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L_0x0525
                android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
                goto L_0x052f
            L_0x0525:
                boolean r5 = r2.checkLayoutParams(r3)
                if (r5 != 0) goto L_0x0537
                android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
            L_0x052f:
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
                android.view.View r3 = r10.f1631a
                r3.setLayoutParams(r2)
                goto L_0x053a
            L_0x0537:
                r2 = r3
                androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
            L_0x053a:
                r2.f1680a = r10
                if (r4 == 0) goto L_0x0542
                if (r1 == 0) goto L_0x0542
                r5 = r0
                goto L_0x0543
            L_0x0542:
                r5 = r6
            L_0x0543:
                r2.f1683d = r5
                return r10
            L_0x0546:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Invalid item position "
                r3.<init>(r4)
                r3.append(r1)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = "). Item count:"
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView$x r1 = r2.f1595f0
                int r1 = r1.b()
                r3.append(r1)
                java.lang.String r1 = r2.y()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.i(int, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public final void j(a0 a0Var) {
            (a0Var.f1644o ? this.f1691b : this.f1690a).remove(a0Var);
            a0Var.f1643n = null;
            a0Var.f1644o = false;
            a0Var.f1639j &= -33;
        }

        public final void k() {
            l lVar = RecyclerView.this.f1606l;
            this.f1694f = this.e + (lVar != null ? lVar.f1668j : 0);
            ArrayList<a0> arrayList = this.f1692c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1694f; size--) {
                e(size);
            }
        }
    }

    public interface t {
        void a();
    }

    public class u extends f {
        public u() {
        }

        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.h((String) null);
            recyclerView.f1595f0.f1716f = true;
            recyclerView.T(true);
            if (!recyclerView.f1591d.g()) {
                recyclerView.requestLayout();
            }
        }
    }

    public static class v extends p0.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public Parcelable f1698h;

        public class a implements Parcelable.ClassLoaderCreator<v> {
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new v[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1698h = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeParcelable(this.f1698h, 0);
        }
    }

    public static abstract class w {

        /* renamed from: a  reason: collision with root package name */
        public int f1699a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1700b;

        /* renamed from: c  reason: collision with root package name */
        public l f1701c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1702d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public View f1703f;

        /* renamed from: g  reason: collision with root package name */
        public final a f1704g = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1705h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f1706a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f1707b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f1708c = Integer.MIN_VALUE;

            /* renamed from: d  reason: collision with root package name */
            public int f1709d = -1;
            public Interpolator e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f1710f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f1711g = 0;

            public final void a(RecyclerView recyclerView) {
                int i8 = this.f1709d;
                if (i8 >= 0) {
                    this.f1709d = -1;
                    recyclerView.L(i8);
                    this.f1710f = false;
                } else if (this.f1710f) {
                    Interpolator interpolator = this.e;
                    if (interpolator == null || this.f1708c >= 1) {
                        int i9 = this.f1708c;
                        if (i9 >= 1) {
                            recyclerView.f1590c0.b(this.f1706a, this.f1707b, i9, interpolator);
                            int i10 = this.f1711g + 1;
                            this.f1711g = i10;
                            if (i10 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f1710f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1711g = 0;
                }
            }
        }

        public interface b {
            PointF a(int i8);
        }

        public final PointF a(int i8) {
            l lVar = this.f1701c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i8);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i8, int i9) {
            PointF a9;
            RecyclerView recyclerView = this.f1700b;
            int i10 = -1;
            if (this.f1699a == -1 || recyclerView == null) {
                d();
            }
            if (this.f1702d && this.f1703f == null && this.f1701c != null && (a9 = a(this.f1699a)) != null) {
                float f9 = a9.x;
                if (!(f9 == 0.0f && a9.y == 0.0f)) {
                    recyclerView.Y((int) Math.signum(f9), (int) Math.signum(a9.y), (int[]) null);
                }
            }
            boolean z8 = false;
            this.f1702d = false;
            View view = this.f1703f;
            a aVar = this.f1704g;
            if (view != null) {
                this.f1700b.getClass();
                a0 I = RecyclerView.I(view);
                if (I != null) {
                    i10 = I.c();
                }
                if (i10 == this.f1699a) {
                    View view2 = this.f1703f;
                    x xVar = recyclerView.f1595f0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1703f = null;
                }
            }
            if (this.e) {
                x xVar2 = recyclerView.f1595f0;
                o oVar = (o) this;
                if (oVar.f1700b.f1606l.w() == 0) {
                    oVar.d();
                } else {
                    int i11 = oVar.f1901o;
                    int i12 = i11 - i8;
                    if (i11 * i12 <= 0) {
                        i12 = 0;
                    }
                    oVar.f1901o = i12;
                    int i13 = oVar.f1902p;
                    int i14 = i13 - i9;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    oVar.f1902p = i14;
                    if (i12 == 0 && i14 == 0) {
                        PointF a10 = oVar.a(oVar.f1699a);
                        if (a10 != null) {
                            float f10 = a10.x;
                            if (!(f10 == 0.0f && a10.y == 0.0f)) {
                                float f11 = a10.y;
                                float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
                                float f12 = a10.x / sqrt;
                                a10.x = f12;
                                float f13 = a10.y / sqrt;
                                a10.y = f13;
                                oVar.f1897k = a10;
                                oVar.f1901o = (int) (f12 * 10000.0f);
                                oVar.f1902p = (int) (f13 * 10000.0f);
                                int h8 = oVar.h(10000);
                                LinearInterpolator linearInterpolator = oVar.f1895i;
                                aVar.f1706a = (int) (((float) oVar.f1901o) * 1.2f);
                                aVar.f1707b = (int) (((float) oVar.f1902p) * 1.2f);
                                aVar.f1708c = (int) (((float) h8) * 1.2f);
                                aVar.e = linearInterpolator;
                                aVar.f1710f = true;
                            }
                        }
                        aVar.f1709d = oVar.f1699a;
                        oVar.d();
                    }
                }
                if (aVar.f1709d >= 0) {
                    z8 = true;
                }
                aVar.a(recyclerView);
                if (z8 && this.e) {
                    this.f1702d = true;
                    recyclerView.f1590c0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.e) {
                this.e = false;
                o oVar = (o) this;
                oVar.f1902p = 0;
                oVar.f1901o = 0;
                oVar.f1897k = null;
                this.f1700b.f1595f0.f1712a = -1;
                this.f1703f = null;
                this.f1699a = -1;
                this.f1702d = false;
                l lVar = this.f1701c;
                if (lVar.e == this) {
                    lVar.e = null;
                }
                this.f1701c = null;
                this.f1700b = null;
            }
        }
    }

    public static class x {

        /* renamed from: a  reason: collision with root package name */
        public int f1712a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1713b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1714c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1715d = 1;
        public int e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1716f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1717g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1718h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1719i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1720j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1721k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1722l;

        /* renamed from: m  reason: collision with root package name */
        public long f1723m;

        /* renamed from: n  reason: collision with root package name */
        public int f1724n;

        public final void a(int i8) {
            if ((this.f1715d & i8) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i8) + " but it is " + Integer.toBinaryString(this.f1715d));
            }
        }

        public final int b() {
            return this.f1717g ? this.f1713b - this.f1714c : this.e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f1712a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f1719i + ", mPreviousLayoutItemCount=" + this.f1713b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1714c + ", mStructureChanged=" + this.f1716f + ", mInPreLayout=" + this.f1717g + ", mRunSimpleAnimations=" + this.f1720j + ", mRunPredictiveAnimations=" + this.f1721k + '}';
        }
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public int f1725f;

        /* renamed from: g  reason: collision with root package name */
        public int f1726g;

        /* renamed from: h  reason: collision with root package name */
        public OverScroller f1727h;

        /* renamed from: i  reason: collision with root package name */
        public Interpolator f1728i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1729j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1730k = false;

        public z() {
            Interpolator interpolator = RecyclerView.A0;
            this.f1728i = interpolator;
            this.f1727h = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a() {
            if (this.f1729j) {
                this.f1730k = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            int[] iArr = j0.x.f4957a;
            x.c.m(recyclerView, this);
        }

        public final void b(int i8, int i9, int i10, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i10 == Integer.MIN_VALUE) {
                int abs = Math.abs(i8);
                int abs2 = Math.abs(i9);
                boolean z8 = abs > abs2;
                int width = z8 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z8) {
                    abs = abs2;
                }
                i10 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
            }
            int i11 = i10;
            if (interpolator == null) {
                interpolator = RecyclerView.A0;
            }
            if (this.f1728i != interpolator) {
                this.f1728i = interpolator;
                this.f1727h = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f1726g = 0;
            this.f1725f = 0;
            recyclerView.setScrollState(2);
            this.f1727h.startScroll(0, 0, i8, i9, i11);
            a();
        }

        public final void run() {
            int i8;
            int i9;
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1606l == null) {
                recyclerView.removeCallbacks(this);
                this.f1727h.abortAnimation();
                return;
            }
            this.f1730k = false;
            this.f1729j = true;
            recyclerView.l();
            OverScroller overScroller = this.f1727h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f1725f;
                int i13 = currY - this.f1726g;
                this.f1725f = currX;
                this.f1726g = currY;
                int[] iArr = recyclerView.f1618r0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean r = recyclerView.r(i12, i13, iArr, (int[]) null, 1);
                int[] iArr2 = recyclerView.f1618r0;
                if (r) {
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.k(i12, i13);
                }
                if (recyclerView.f1604k != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.Y(i12, i13, iArr2);
                    int i14 = iArr2[0];
                    int i15 = iArr2[1];
                    int i16 = i12 - i14;
                    int i17 = i13 - i15;
                    w wVar = recyclerView.f1606l.e;
                    if (wVar != null && !wVar.f1702d && wVar.e) {
                        int b9 = recyclerView.f1595f0.b();
                        if (b9 == 0) {
                            wVar.d();
                        } else {
                            if (wVar.f1699a >= b9) {
                                wVar.f1699a = b9 - 1;
                            }
                            wVar.b(i14, i15);
                        }
                    }
                    i10 = i14;
                    i9 = i16;
                    i8 = i17;
                    i11 = i15;
                } else {
                    i9 = i12;
                    i8 = i13;
                    i11 = 0;
                    i10 = 0;
                }
                if (!recyclerView.f1612o.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f1618r0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i18 = i11;
                recyclerView.s(i10, i11, i9, i8, (int[]) null, 1, iArr3);
                int i19 = i9 - iArr2[0];
                int i20 = i8 - iArr2[1];
                if (!(i10 == 0 && i18 == 0)) {
                    recyclerView.t(i10, i18);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z8 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                w wVar2 = recyclerView.f1606l.e;
                if ((wVar2 != null && wVar2.f1702d) || !z8) {
                    a();
                    m mVar = recyclerView.f1592d0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i10, i18);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i21 = i19 < 0 ? -currVelocity : i19 > 0 ? currVelocity : 0;
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        if (i21 < 0) {
                            recyclerView.v();
                            if (recyclerView.G.isFinished()) {
                                recyclerView.G.onAbsorb(-i21);
                            }
                        } else if (i21 > 0) {
                            recyclerView.w();
                            if (recyclerView.I.isFinished()) {
                                recyclerView.I.onAbsorb(i21);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.x();
                            if (recyclerView.H.isFinished()) {
                                recyclerView.H.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.u();
                            if (recyclerView.J.isFinished()) {
                                recyclerView.J.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i21 == 0 && currVelocity == 0)) {
                            int[] iArr4 = j0.x.f4957a;
                            x.c.k(recyclerView);
                        }
                    }
                    m.b bVar = recyclerView.f1593e0;
                    int[] iArr5 = bVar.f1881c;
                    if (iArr5 != null) {
                        Arrays.fill(iArr5, -1);
                    }
                    bVar.f1882d = 0;
                }
            }
            w wVar3 = recyclerView.f1606l.e;
            if (wVar3 != null && wVar3.f1702d) {
                wVar3.b(0, 0);
            }
            this.f1729j = false;
            if (this.f1730k) {
                recyclerView.removeCallbacks(this);
                int[] iArr6 = j0.x.f4957a;
                x.c.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            y0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            f1584z0 = r1
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            A0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0225 A[Catch:{ NoSuchMethodException -> 0x0270, ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x022e A[Catch:{ NoSuchMethodException -> 0x0270, ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r18.<init>(r19, r20, r21)
            androidx.recyclerview.widget.RecyclerView$u r0 = new androidx.recyclerview.widget.RecyclerView$u
            r0.<init>()
            r10.f1585a = r0
            androidx.recyclerview.widget.RecyclerView$s r0 = new androidx.recyclerview.widget.RecyclerView$s
            r0.<init>()
            r10.f1587b = r0
            androidx.recyclerview.widget.d0 r0 = new androidx.recyclerview.widget.d0
            r0.<init>()
            r10.f1594f = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f1598h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f1600i = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f1602j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1610n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1612o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1614p = r0
            r14 = 0
            r10.f1622u = r14
            r10.B = r14
            r10.C = r14
            r10.D = r14
            r10.E = r14
            androidx.recyclerview.widget.RecyclerView$h r0 = new androidx.recyclerview.widget.RecyclerView$h
            r0.<init>()
            r10.F = r0
            androidx.recyclerview.widget.k r0 = new androidx.recyclerview.widget.k
            r0.<init>()
            r10.K = r0
            r10.L = r14
            r0 = -1
            r10.M = r0
            r1 = 1
            r10.W = r1
            r10.f1586a0 = r1
            r15 = 1
            r10.f1588b0 = r15
            androidx.recyclerview.widget.RecyclerView$z r1 = new androidx.recyclerview.widget.RecyclerView$z
            r1.<init>()
            r10.f1590c0 = r1
            androidx.recyclerview.widget.m$b r1 = new androidx.recyclerview.widget.m$b
            r1.<init>()
            r10.f1593e0 = r1
            androidx.recyclerview.widget.RecyclerView$x r1 = new androidx.recyclerview.widget.RecyclerView$x
            r1.<init>()
            r10.f1595f0 = r1
            r10.f1601i0 = r14
            r10.f1603j0 = r14
            androidx.recyclerview.widget.RecyclerView$j r1 = new androidx.recyclerview.widget.RecyclerView$j
            r1.<init>()
            r10.f1605k0 = r1
            r10.f1607l0 = r14
            r9 = 2
            int[] r2 = new int[r9]
            r10.f1611n0 = r2
            int[] r2 = new int[r9]
            r10.f1615p0 = r2
            int[] r2 = new int[r9]
            r10.f1617q0 = r2
            int[] r2 = new int[r9]
            r10.f1618r0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.s0 = r2
            androidx.recyclerview.widget.RecyclerView$a r2 = new androidx.recyclerview.widget.RecyclerView$a
            r2.<init>()
            r10.f1621t0 = r2
            r10.f1624v0 = r14
            r10.f1625w0 = r14
            androidx.recyclerview.widget.RecyclerView$c r2 = new androidx.recyclerview.widget.RecyclerView$c
            r2.<init>()
            r10.f1627x0 = r2
            r10.setScrollContainer(r15)
            r10.setFocusableInTouchMode(r15)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r19)
            int r3 = r2.getScaledTouchSlop()
            r10.S = r3
            float r3 = j0.z.a(r2)
            r10.W = r3
            float r3 = j0.z.b(r2)
            r10.f1586a0 = r3
            int r3 = r2.getScaledMinimumFlingVelocity()
            r10.U = r3
            int r2 = r2.getScaledMaximumFlingVelocity()
            r10.V = r2
            int r2 = r18.getOverScrollMode()
            if (r2 != r9) goto L_0x00ec
            r2 = r15
            goto L_0x00ed
        L_0x00ec:
            r2 = r14
        L_0x00ed:
            r10.setWillNotDraw(r2)
            androidx.recyclerview.widget.RecyclerView$i r2 = r10.K
            r2.f1652a = r1
            androidx.recyclerview.widget.a r1 = new androidx.recyclerview.widget.a
            androidx.recyclerview.widget.w r2 = new androidx.recyclerview.widget.w
            r2.<init>(r10)
            r1.<init>(r2)
            r10.f1591d = r1
            androidx.recyclerview.widget.b r1 = new androidx.recyclerview.widget.b
            androidx.recyclerview.widget.v r2 = new androidx.recyclerview.widget.v
            r2.<init>(r10)
            r1.<init>(r2)
            r10.e = r1
            int[] r1 = j0.x.f4957a
            int r1 = j0.x.k.b(r18)
            r8 = 8
            if (r1 != 0) goto L_0x0119
            j0.x.k.l(r10, r8)
        L_0x0119:
            int r1 = j0.x.c.c(r18)
            if (r1 != 0) goto L_0x0122
            j0.x.c.s(r10, r15)
        L_0x0122:
            android.content.Context r1 = r18.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.f1628z = r1
            androidx.recyclerview.widget.x r1 = new androidx.recyclerview.widget.x
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            int[] r3 = a1.a.f11a
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r3, r13, r14)
            r16 = 0
            r1 = r18
            r2 = r19
            r4 = r20
            r5 = r7
            r6 = r21
            r14 = r7
            r7 = r16
            j0.x.m.c(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r16 = r14.getString(r8)
            int r1 = r14.getInt(r9, r0)
            if (r1 != r0) goto L_0x015e
            r0 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r0)
        L_0x015e:
            boolean r0 = r14.getBoolean(r15, r15)
            r10.f1596g = r0
            r0 = 3
            r1 = 0
            boolean r2 = r14.getBoolean(r0, r1)
            r8 = 4
            if (r2 == 0) goto L_0x01cf
            r1 = 6
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r1 = 7
            android.graphics.drawable.Drawable r4 = r14.getDrawable(r1)
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r8)
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            r1 = 5
            android.graphics.drawable.Drawable r6 = r14.getDrawable(r1)
            if (r3 == 0) goto L_0x01b7
            if (r4 == 0) goto L_0x01b7
            if (r5 == 0) goto L_0x01b7
            if (r6 == 0) goto L_0x01b7
            android.content.Context r1 = r18.getContext()
            android.content.res.Resources r1 = r1.getResources()
            androidx.recyclerview.widget.l r2 = new androidx.recyclerview.widget.l
            r7 = -2147024718(0xffffffff800700b2, float:-6.43098E-40)
            int r7 = r1.getDimensionPixelSize(r7)
            r8 = -2147024716(0xffffffff800700b4, float:-6.43101E-40)
            int r8 = r1.getDimensionPixelSize(r8)
            r9 = -2147024717(0xffffffff800700b3, float:-6.431E-40)
            int r9 = r1.getDimensionPixelOffset(r9)
            r1 = r2
            r2 = r18
            r0 = 4
            r17 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x01d2
        L_0x01b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r18.y()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01cf:
            r0 = r8
            r17 = r9
        L_0x01d2:
            r14.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L_0x0329
            java.lang.String r2 = r16.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0329
            r3 = 0
            char r4 = r2.charAt(r3)
            r3 = 46
            if (r4 != r3) goto L_0x01f9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r19.getPackageName()
            r3.append(r4)
            goto L_0x0218
        L_0x01f9:
            java.lang.String r4 = "."
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x0202
            goto L_0x021f
        L_0x0202:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            r4.append(r3)
            r3 = r4
        L_0x0218:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x021f:
            boolean r3 = r18.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            if (r3 == 0) goto L_0x022e
            java.lang.Class r3 = r18.getClass()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            goto L_0x0232
        L_0x022e:
            java.lang.ClassLoader r3 = r19.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
        L_0x0232:
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$l> r4 = androidx.recyclerview.widget.RecyclerView.l.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.Class<?>[] r4 = f1584z0     // Catch:{ NoSuchMethodException -> 0x0258 }
            java.lang.reflect.Constructor r4 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0258 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x0258 }
            r5 = 0
            r0[r5] = r11     // Catch:{ NoSuchMethodException -> 0x0258 }
            r0[r15] = r12     // Catch:{ NoSuchMethodException -> 0x0258 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)     // Catch:{ NoSuchMethodException -> 0x0258 }
            r0[r17] = r6     // Catch:{ NoSuchMethodException -> 0x0258 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x0258 }
            r5 = 3
            r0[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0258 }
            goto L_0x0262
        L_0x0258:
            r0 = move-exception
            r4 = r0
            r5 = 0
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0270 }
            java.lang.reflect.Constructor r4 = r3.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0270 }
            r0 = 0
        L_0x0262:
            r4.setAccessible(r15)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            androidx.recyclerview.widget.RecyclerView$l r0 = (androidx.recyclerview.widget.RecyclerView.l) r0     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            goto L_0x0329
        L_0x0270:
            r0 = move-exception
            r0.initCause(r4)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.String r5 = r20.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            r3.<init>(r4, r0)     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
            throw r3     // Catch:{ ClassNotFoundException -> 0x030a, InvocationTargetException -> 0x02ed, InstantiationException -> 0x02d0, IllegalAccessException -> 0x02b1, ClassCastException -> 0x0292 }
        L_0x0292:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x02b1:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x02d0:
            r0 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x02ed:
            r0 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x030a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0329:
            int[] r3 = y0
            r8 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r3, r13, r8)
            r7 = 0
            r1 = r18
            r2 = r19
            r4 = r20
            r5 = r0
            r6 = r21
            j0.x.m.c(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.getBoolean(r8, r15)
            r0.recycle()
            r10.setNestedScrollingEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i8));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static a0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f1680a;
    }

    private j0.l getScrollingChildHelper() {
        if (this.f1613o0 == null) {
            this.f1613o0 = new j0.l(this);
        }
        return this.f1613o0;
    }

    public static void i(a0 a0Var) {
        Reference reference = a0Var.f1632b;
        if (reference != null) {
            Object obj = reference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        a0Var.f1632b = null;
                        return;
                    } else if (view != a0Var.f1631a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A(android.view.View):android.view.View");
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<p> arrayList = this.f1614p;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            p pVar = arrayList.get(i8);
            if (!pVar.b(motionEvent) || action == 3) {
                i8++;
            } else {
                this.f1616q = pVar;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int e4 = this.e.e();
        if (e4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < e4; i10++) {
            a0 I2 = I(this.e.d(i10));
            if (!I2.o()) {
                int c9 = I2.c();
                if (c9 < i8) {
                    i8 = c9;
                }
                if (c9 > i9) {
                    i9 = c9;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
    }

    public final a0 E(int i8) {
        a0 a0Var = null;
        if (this.B) {
            return null;
        }
        int h8 = this.e.h();
        for (int i9 = 0; i9 < h8; i9++) {
            a0 I2 = I(this.e.g(i9));
            if (I2 != null && !I2.i() && F(I2) == i8) {
                if (!this.e.j(I2.f1631a)) {
                    return I2;
                }
                a0Var = I2;
            }
        }
        return a0Var;
    }

    public final int F(a0 a0Var) {
        if (!((a0Var.f1639j & 524) != 0) && a0Var.f()) {
            a aVar = this.f1591d;
            int i8 = a0Var.f1633c;
            ArrayList<a.b> arrayList = aVar.f1769b;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                a.b bVar = arrayList.get(i9);
                int i10 = bVar.f1772a;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int i11 = bVar.f1773b;
                        if (i11 <= i8) {
                            int i12 = bVar.f1775d;
                            if (i11 + i12 <= i8) {
                                i8 -= i12;
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 8) {
                        int i13 = bVar.f1773b;
                        if (i13 == i8) {
                            i8 = bVar.f1775d;
                        } else {
                            if (i13 < i8) {
                                i8--;
                            }
                            if (bVar.f1775d <= i8) {
                                i8++;
                            }
                        }
                    }
                } else if (bVar.f1773b <= i8) {
                    i8 += bVar.f1775d;
                }
            }
            return i8;
        }
        return -1;
    }

    public final long G(a0 a0Var) {
        return this.f1604k.f1650b ? a0Var.e : (long) a0Var.f1633c;
    }

    public final a0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        m mVar = (m) view.getLayoutParams();
        boolean z8 = mVar.f1682c;
        Rect rect = mVar.f1681b;
        if (!z8) {
            return rect;
        }
        if (this.f1595f0.f1717g && (mVar.b() || mVar.f1680a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<k> arrayList = this.f1612o;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Rect rect2 = this.f1598h;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i8).getClass();
            ((m) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mVar.f1682c = false;
        return rect;
    }

    public final boolean K() {
        return this.D > 0;
    }

    public final void L(int i8) {
        if (this.f1606l != null) {
            setScrollState(2);
            this.f1606l.r0(i8);
            awakenScrollBars();
        }
    }

    public final void M() {
        int h8 = this.e.h();
        for (int i8 = 0; i8 < h8; i8++) {
            ((m) this.e.g(i8).getLayoutParams()).f1682c = true;
        }
        ArrayList<a0> arrayList = this.f1587b.f1692c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            m mVar = (m) arrayList.get(i9).f1631a.getLayoutParams();
            if (mVar != null) {
                mVar.f1682c = true;
            }
        }
    }

    public final void N(int i8, boolean z8, int i9) {
        int i10 = i8 + i9;
        int h8 = this.e.h();
        for (int i11 = 0; i11 < h8; i11++) {
            a0 I2 = I(this.e.g(i11));
            if (I2 != null && !I2.o()) {
                int i12 = I2.f1633c;
                if (i12 >= i10) {
                    I2.l(-i9, z8);
                } else if (i12 >= i8) {
                    I2.b(8);
                    I2.l(-i9, z8);
                    I2.f1633c = i8 - 1;
                }
                this.f1595f0.f1716f = true;
            }
        }
        s sVar = this.f1587b;
        ArrayList<a0> arrayList = sVar.f1692c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = arrayList.get(size);
                if (a0Var != null) {
                    int i13 = a0Var.f1633c;
                    if (i13 >= i10) {
                        a0Var.l(-i9, z8);
                    } else if (i13 >= i8) {
                        a0Var.b(8);
                        sVar.e(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void O() {
        this.D++;
    }

    public final void P(boolean z8) {
        int i8;
        boolean z9 = true;
        int i9 = this.D - 1;
        this.D = i9;
        if (i9 < 1) {
            this.D = 0;
            if (z8) {
                int i10 = this.y;
                this.y = 0;
                if (i10 != 0) {
                    AccessibilityManager accessibilityManager = this.f1628z;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z9 = false;
                    }
                    if (z9) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        k0.b.b(obtain, i10);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.s0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var.f1631a.getParent() == this && !a0Var.o() && (i8 = a0Var.f1646q) != -1) {
                        int[] iArr = j0.x.f4957a;
                        x.c.s(a0Var.f1631a, i8);
                        a0Var.f1646q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.M = motionEvent.getPointerId(i8);
            int x8 = (int) (motionEvent.getX(i8) + 0.5f);
            this.Q = x8;
            this.O = x8;
            int y8 = (int) (motionEvent.getY(i8) + 0.5f);
            this.R = y8;
            this.P = y8;
        }
    }

    public final void R() {
        if (!this.f1607l0 && this.r) {
            int[] iArr = j0.x.f4957a;
            x.c.m(this, this.f1621t0);
            this.f1607l0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r5.K != null && r5.f1606l.D0()) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S() {
        /*
            r5 = this;
            boolean r0 = r5.B
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.a r0 = r5.f1591d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1769b
            r0.l(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1770c
            r0.l(r1)
            boolean r0 = r5.C
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1606l
            r0.a0()
        L_0x0019:
            androidx.recyclerview.widget.RecyclerView$i r0 = r5.K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView$l r0 = r5.f1606l
            boolean r0 = r0.D0()
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            androidx.recyclerview.widget.a r0 = r5.f1591d
            r0.j()
            goto L_0x0037
        L_0x0032:
            androidx.recyclerview.widget.a r0 = r5.f1591d
            r0.c()
        L_0x0037:
            boolean r0 = r5.f1601i0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r5.f1603j0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = r2
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            boolean r3 = r5.f1620t
            if (r3 == 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView$i r3 = r5.K
            if (r3 == 0) goto L_0x0061
            boolean r3 = r5.B
            if (r3 != 0) goto L_0x0057
            if (r0 != 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$l r4 = r5.f1606l
            boolean r4 = r4.f1664f
            if (r4 == 0) goto L_0x0061
        L_0x0057:
            if (r3 == 0) goto L_0x005f
            androidx.recyclerview.widget.RecyclerView$d r3 = r5.f1604k
            boolean r3 = r3.f1650b
            if (r3 == 0) goto L_0x0061
        L_0x005f:
            r3 = r1
            goto L_0x0062
        L_0x0061:
            r3 = r2
        L_0x0062:
            androidx.recyclerview.widget.RecyclerView$x r4 = r5.f1595f0
            r4.f1720j = r3
            if (r3 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r5.B
            if (r0 != 0) goto L_0x0080
            androidx.recyclerview.widget.RecyclerView$i r0 = r5.K
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$l r5 = r5.f1606l
            boolean r5 = r5.D0()
            if (r5 == 0) goto L_0x007c
            r5 = r1
            goto L_0x007d
        L_0x007c:
            r5 = r2
        L_0x007d:
            if (r5 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r4.f1721k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.S():void");
    }

    public final void T(boolean z8) {
        this.C = z8 | this.C;
        this.B = true;
        int h8 = this.e.h();
        for (int i8 = 0; i8 < h8; i8++) {
            a0 I2 = I(this.e.g(i8));
            if (I2 != null && !I2.o()) {
                I2.b(6);
            }
        }
        M();
        s sVar = this.f1587b;
        ArrayList<a0> arrayList = sVar.f1692c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a0 a0Var = arrayList.get(i9);
            if (a0Var != null) {
                a0Var.b(6);
                a0Var.a((Object) null);
            }
        }
        d dVar = RecyclerView.this.f1604k;
        if (dVar == null || !dVar.f1650b) {
            sVar.d();
        }
    }

    public final void U(a0 a0Var, i.c cVar) {
        boolean z8 = false;
        int i8 = (a0Var.f1639j & -8193) | 0;
        a0Var.f1639j = i8;
        boolean z9 = this.f1595f0.f1718h;
        d0 d0Var = this.f1594f;
        if (z9) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            if (z8 && !a0Var.i() && !a0Var.o()) {
                d0Var.f1798b.f(G(a0Var), a0Var);
            }
        }
        p.f<a0, d0.a> fVar = d0Var.f1797a;
        d0.a orDefault = fVar.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = d0.a.a();
            fVar.put(a0Var, orDefault);
        }
        orDefault.f1801b = cVar;
        orDefault.f1800a |= 4;
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1598h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f1682c) {
                int i8 = rect.left;
                Rect rect2 = mVar.f1681b;
                rect.left = i8 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1606l.o0(this, view, this.f1598h, !this.f1620t, view2 == null);
    }

    public final void W() {
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z8 = false;
        e0(0);
        EdgeEffect edgeEffect = this.G;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = this.G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 |= this.J.isFinished();
        }
        if (z8) {
            int[] iArr = j0.x.f4957a;
            x.c.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r20.l()
            androidx.recyclerview.widget.RecyclerView$d r0 = r8.f1604k
            int[] r12 = r8.f1618r0
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0029
            r12[r14] = r14
            r12[r13] = r14
            r8.Y(r9, r10, r12)
            r0 = r12[r14]
            r1 = r12[r13]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r15 = r0
            r7 = r1
            r16 = r2
            r17 = r3
            goto L_0x002f
        L_0x0029:
            r7 = r14
            r15 = r7
            r16 = r15
            r17 = r16
        L_0x002f:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r8.f1612o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003a
            r20.invalidate()
        L_0x003a:
            int[] r6 = r8.f1618r0
            r6[r14] = r14
            r6[r13] = r14
            int[] r5 = r8.f1615p0
            r0 = r20
            r1 = r15
            r2 = r7
            r3 = r16
            r4 = r17
            r18 = r6
            r6 = r24
            r19 = r7
            r7 = r18
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r0 = r12[r14]
            int r1 = r16 - r0
            r2 = r12[r13]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x0064
            if (r2 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r0 = r14
            goto L_0x0065
        L_0x0064:
            r0 = r13
        L_0x0065:
            int r2 = r8.Q
            int[] r4 = r8.f1615p0
            r5 = r4[r14]
            int r2 = r2 - r5
            r8.Q = r2
            int r2 = r8.R
            r4 = r4[r13]
            int r2 = r2 - r4
            r8.R = r2
            int[] r2 = r8.f1617q0
            r6 = r2[r14]
            int r6 = r6 + r5
            r2[r14] = r6
            r5 = r2[r13]
            int r5 = r5 + r4
            r2[r13] = r5
            int r2 = r20.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x011b
            if (r11 == 0) goto L_0x0118
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = a1.a.y(r11, r2)
            if (r2 != 0) goto L_0x0118
            float r2 = r23.getX()
            float r1 = (float) r1
            float r4 = r23.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b8
            r20.v()
            android.widget.EdgeEffect r6 = r8.G
            float r11 = -r1
            int r12 = r20.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r20.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            goto L_0x00ce
        L_0x00b8:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d3
            r20.w()
            android.widget.EdgeEffect r6 = r8.I
            int r11 = r20.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r20.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
        L_0x00ce:
            n0.d.a.a(r6, r11, r4)
            r4 = r13
            goto L_0x00d4
        L_0x00d3:
            r4 = r14
        L_0x00d4:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ee
            r20.x()
            android.widget.EdgeEffect r4 = r8.H
            float r6 = -r3
            int r7 = r20.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r20.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            n0.d.a.a(r4, r6, r2)
            goto L_0x0108
        L_0x00ee:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0109
            r20.u()
            android.widget.EdgeEffect r4 = r8.J
            int r6 = r20.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r20.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            n0.d.a.a(r4, r6, r7)
        L_0x0108:
            r4 = r13
        L_0x0109:
            if (r4 != 0) goto L_0x0113
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0113
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0118
        L_0x0113:
            int[] r1 = j0.x.f4957a
            j0.x.c.k(r20)
        L_0x0118:
            r20.k(r21, r22)
        L_0x011b:
            r1 = r19
            if (r15 != 0) goto L_0x0121
            if (r1 == 0) goto L_0x0124
        L_0x0121:
            r8.t(r15, r1)
        L_0x0124:
            boolean r2 = r20.awakenScrollBars()
            if (r2 != 0) goto L_0x012d
            r20.invalidate()
        L_0x012d:
            if (r0 != 0) goto L_0x0135
            if (r15 != 0) goto L_0x0135
            if (r1 == 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r13 = r14
        L_0x0135:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.X(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Y(int i8, int i9, int[] iArr) {
        a0 a0Var;
        c0();
        O();
        f0.d.a("RV Scroll");
        x xVar = this.f1595f0;
        z(xVar);
        s sVar = this.f1587b;
        int q02 = i8 != 0 ? this.f1606l.q0(i8, sVar, xVar) : 0;
        int s02 = i9 != 0 ? this.f1606l.s0(i9, sVar, xVar) : 0;
        f0.d.b();
        int e4 = this.e.e();
        for (int i10 = 0; i10 < e4; i10++) {
            View d9 = this.e.d(i10);
            a0 H2 = H(d9);
            if (!(H2 == null || (a0Var = H2.f1638i) == null)) {
                int left = d9.getLeft();
                int top = d9.getTop();
                View view = a0Var.f1631a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        P(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = q02;
            iArr[1] = s02;
        }
    }

    public final void Z(int i8) {
        w wVar;
        if (!this.w) {
            setScrollState(0);
            z zVar = this.f1590c0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1727h.abortAnimation();
            l lVar = this.f1606l;
            if (!(lVar == null || (wVar = lVar.e) == null)) {
                wVar.d();
            }
            l lVar2 = this.f1606l;
            if (lVar2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lVar2.r0(i8);
            awakenScrollBars();
        }
    }

    public final void a0(int i8, int i9, boolean z8) {
        l lVar = this.f1606l;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.w) {
            int i10 = 0;
            if (!lVar.d()) {
                i8 = 0;
            }
            if (!this.f1606l.e()) {
                i9 = 0;
            }
            if (i8 != 0 || i9 != 0) {
                if (z8) {
                    if (i8 != 0) {
                        i10 = 1;
                    }
                    if (i9 != 0) {
                        i10 |= 2;
                    }
                    getScrollingChildHelper().g(i10, 1);
                }
                this.f1590c0.b(i8, i9, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        l lVar = this.f1606l;
        if (lVar != null) {
            lVar.getClass();
        }
        super.addFocusables(arrayList, i8, i9);
    }

    public final void b0(int i8) {
        if (!this.w) {
            l lVar = this.f1606l;
            if (lVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                lVar.B0(this, i8);
            }
        }
    }

    public final void c0() {
        int i8 = this.f1622u + 1;
        this.f1622u = i8;
        if (i8 == 1 && !this.w) {
            this.f1623v = false;
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f1606l.f((m) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.d()) {
            return this.f1606l.j(this.f1595f0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.d()) {
            return this.f1606l.k(this.f1595f0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.d()) {
            return this.f1606l.l(this.f1595f0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.e()) {
            return this.f1606l.m(this.f1595f0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.e()) {
            return this.f1606l.n(this.f1595f0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        l lVar = this.f1606l;
        if (lVar != null && lVar.e()) {
            return this.f1606l.o(this.f1595f0);
        }
        return 0;
    }

    public final void d0(boolean z8) {
        if (this.f1622u < 1) {
            this.f1622u = 1;
        }
        if (!z8 && !this.w) {
            this.f1623v = false;
        }
        if (this.f1622u == 1) {
            if (z8 && this.f1623v && !this.w && this.f1606l != null && this.f1604k != null) {
                o();
            }
            if (!this.w) {
                this.f1623v = false;
            }
        }
        this.f1622u--;
    }

    public final boolean dispatchNestedFling(float f9, float f10, boolean z8) {
        return getScrollingChildHelper().a(f9, f10, z8);
    }

    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
    }

    public final boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i8, i9, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return getScrollingChildHelper().e(i8, i9, i10, i11, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z8;
        int i8;
        float f9;
        super.draw(canvas);
        ArrayList<k> arrayList = this.f1612o;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.get(i9).e(canvas);
        }
        EdgeEffect edgeEffect = this.G;
        boolean z10 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z8 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1596g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.G;
            z8 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1596g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.H;
            z8 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.I;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1596g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.I;
            z8 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.J;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1596g) {
                f9 = (float) ((-getWidth()) + getPaddingRight());
                i8 = (-getHeight()) + getPaddingBottom();
            } else {
                f9 = (float) (-getWidth());
                i8 = -getHeight();
            }
            canvas.translate(f9, (float) i8);
            EdgeEffect edgeEffect8 = this.J;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z9 = true;
            }
            z8 |= z9;
            canvas.restoreToCount(save4);
        }
        if (z8 || this.K == null || arrayList.size() <= 0 || !this.K.f()) {
            z10 = z8;
        }
        if (z10) {
            int[] iArr = j0.x.f4957a;
            x.c.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        return super.drawChild(canvas, view, j8);
    }

    public final void e(a0 a0Var) {
        View view = a0Var.f1631a;
        boolean z8 = view.getParent() == this;
        this.f1587b.j(H(view));
        boolean k8 = a0Var.k();
        b bVar = this.e;
        if (k8) {
            bVar.b(view, -1, view.getLayoutParams(), true);
        } else if (!z8) {
            bVar.a(view, -1, true);
        } else {
            int indexOfChild = ((v) bVar.f1781a).f1910a.indexOfChild(view);
            if (indexOfChild >= 0) {
                bVar.f1782b.h(indexOfChild);
                bVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void e0(int i8) {
        getScrollingChildHelper().h(i8);
    }

    public final void f(k kVar) {
        l lVar = this.f1606l;
        if (lVar != null) {
            lVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<k> arrayList = this.f1612o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kVar);
        M();
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0160, code lost:
        if (r7 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0180, code lost:
        if (r5 > 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0183, code lost:
        if (r7 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0186, code lost:
        if (r5 < 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x018e, code lost:
        if ((r5 * r6) <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0196, code lost:
        if ((r5 * r6) >= 0) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            r3.getClass()
            androidx.recyclerview.widget.RecyclerView$d r3 = r0.f1604k
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.K()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.w
            if (r3 != 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = r5
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            androidx.recyclerview.widget.RecyclerView$x r7 = r0.f1595f0
            androidx.recyclerview.widget.RecyclerView$s r8 = r0.f1587b
            r11 = 33
            r12 = 17
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L_0x0093
            if (r2 == r14) goto L_0x0036
            if (r2 != r4) goto L_0x0093
        L_0x0036:
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x004c
            if (r2 != r14) goto L_0x0043
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0044
        L_0x0043:
            r3 = r11
        L_0x0044:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004c
            r3 = r4
            goto L_0x004d
        L_0x004c:
            r3 = r5
        L_0x004d:
            if (r3 != 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$l r15 = r0.f1606l
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            int r3 = r3.B()
            if (r3 != r4) goto L_0x0061
            r3 = r4
            goto L_0x0062
        L_0x0061:
            r3 = r5
        L_0x0062:
            if (r2 != r14) goto L_0x0066
            r15 = r4
            goto L_0x0067
        L_0x0066:
            r15 = r5
        L_0x0067:
            r3 = r3 ^ r15
            if (r3 == 0) goto L_0x006d
            r3 = 66
            goto L_0x006e
        L_0x006d:
            r3 = r12
        L_0x006e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0076
            r3 = r4
            goto L_0x0077
        L_0x0076:
            r3 = r5
        L_0x0077:
            if (r3 == 0) goto L_0x008e
            r16.l()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x0083
            return r13
        L_0x0083:
            r16.c0()
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            r3.U(r1, r2, r8, r7)
            r0.d0(r5)
        L_0x008e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b3
        L_0x0093:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b2
            if (r3 == 0) goto L_0x00b2
            r16.l()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x00a5
            return r13
        L_0x00a5:
            r16.c0()
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            android.view.View r3 = r3.U(r1, r2, r8, r7)
            r0.d0(r5)
            goto L_0x00b3
        L_0x00b2:
            r3 = r6
        L_0x00b3:
            if (r3 == 0) goto L_0x00ca
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00ca
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c6
            android.view.View r0 = super.focusSearch(r17, r18)
            return r0
        L_0x00c6:
            r0.V(r3, r13)
            return r1
        L_0x00ca:
            if (r3 == 0) goto L_0x0163
            if (r3 == r0) goto L_0x0163
            if (r3 != r1) goto L_0x00d2
            goto L_0x0163
        L_0x00d2:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto L_0x00db
            r4 = r5
            goto L_0x0198
        L_0x00db:
            if (r1 != 0) goto L_0x00df
            goto L_0x0198
        L_0x00df:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto L_0x00e7
            goto L_0x0198
        L_0x00e7:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r8 = r0.f1598h
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.f1600i
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.f1606l
            int r6 = r6.B()
            if (r6 != r4) goto L_0x0111
            r6 = -1
            goto L_0x0112
        L_0x0111:
            r6 = r4
        L_0x0112:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L_0x011c
            int r7 = r8.right
            if (r7 > r5) goto L_0x0124
        L_0x011c:
            int r7 = r8.right
            int r9 = r13.right
            if (r7 >= r9) goto L_0x0124
            r5 = r4
            goto L_0x0131
        L_0x0124:
            int r7 = r8.right
            int r9 = r13.right
            if (r7 > r9) goto L_0x012c
            if (r15 < r9) goto L_0x0130
        L_0x012c:
            if (r15 <= r5) goto L_0x0130
            r5 = -1
            goto L_0x0131
        L_0x0130:
            r5 = 0
        L_0x0131:
            int r7 = r8.top
            int r9 = r13.top
            if (r7 < r9) goto L_0x013b
            int r15 = r8.bottom
            if (r15 > r9) goto L_0x0143
        L_0x013b:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L_0x0143
            r7 = r4
            goto L_0x0150
        L_0x0143:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L_0x014b
            if (r7 < r10) goto L_0x014f
        L_0x014b:
            if (r7 <= r9) goto L_0x014f
            r7 = -1
            goto L_0x0150
        L_0x014f:
            r7 = 0
        L_0x0150:
            if (r2 == r4) goto L_0x0191
            if (r2 == r14) goto L_0x0189
            if (r2 == r12) goto L_0x0186
            if (r2 == r11) goto L_0x0183
            r6 = 66
            if (r2 == r6) goto L_0x0180
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0165
            if (r7 <= 0) goto L_0x0163
            goto L_0x0198
        L_0x0163:
            r4 = 0
            goto L_0x0198
        L_0x0165:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r0 = r16.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0180:
            if (r5 <= 0) goto L_0x0163
            goto L_0x0198
        L_0x0183:
            if (r7 >= 0) goto L_0x0163
            goto L_0x0198
        L_0x0186:
            if (r5 >= 0) goto L_0x0163
            goto L_0x0198
        L_0x0189:
            if (r7 > 0) goto L_0x0198
            if (r7 != 0) goto L_0x0163
            int r5 = r5 * r6
            if (r5 <= 0) goto L_0x0163
            goto L_0x0198
        L_0x0191:
            if (r7 < 0) goto L_0x0198
            if (r7 != 0) goto L_0x0163
            int r5 = r5 * r6
            if (r5 >= 0) goto L_0x0163
        L_0x0198:
            if (r4 == 0) goto L_0x019b
            goto L_0x019f
        L_0x019b:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(q qVar) {
        if (this.f1599h0 == null) {
            this.f1599h0 = new ArrayList();
        }
        this.f1599h0.add(qVar);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f1606l;
        if (lVar != null) {
            return lVar.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f1606l;
        if (lVar != null) {
            return lVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f1606l;
        if (lVar != null) {
            return lVar.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.f1604k;
    }

    public int getBaseline() {
        l lVar = this.f1606l;
        if (lVar == null) {
            return super.getBaseline();
        }
        lVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i8, int i9) {
        return super.getChildDrawingOrder(i8, i9);
    }

    public boolean getClipToPadding() {
        return this.f1596g;
    }

    public x getCompatAccessibilityDelegate() {
        return this.f1609m0;
    }

    public h getEdgeEffectFactory() {
        return this.F;
    }

    public i getItemAnimator() {
        return this.K;
    }

    public int getItemDecorationCount() {
        return this.f1612o.size();
    }

    public l getLayoutManager() {
        return this.f1606l;
    }

    public int getMaxFlingVelocity() {
        return this.V;
    }

    public int getMinFlingVelocity() {
        return this.U;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o getOnFlingListener() {
        return this.T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1588b0;
    }

    public r getRecycledViewPool() {
        return this.f1587b.c();
    }

    public int getScrollState() {
        return this.L;
    }

    public final void h(String str) {
        if (K()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
            }
            throw new IllegalStateException(str);
        } else if (this.E > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final boolean isAttachedToWindow() {
        return this.r;
    }

    public final boolean isLayoutSuppressed() {
        return this.w;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4951d;
    }

    public final void j() {
        int h8 = this.e.h();
        for (int i8 = 0; i8 < h8; i8++) {
            a0 I2 = I(this.e.g(i8));
            if (!I2.o()) {
                I2.f1634d = -1;
                I2.f1636g = -1;
            }
        }
        s sVar = this.f1587b;
        ArrayList<a0> arrayList = sVar.f1692c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a0 a0Var = arrayList.get(i9);
            a0Var.f1634d = -1;
            a0Var.f1636g = -1;
        }
        ArrayList<a0> arrayList2 = sVar.f1690a;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a0 a0Var2 = arrayList2.get(i10);
            a0Var2.f1634d = -1;
            a0Var2.f1636g = -1;
        }
        ArrayList<a0> arrayList3 = sVar.f1691b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                a0 a0Var3 = sVar.f1691b.get(i11);
                a0Var3.f1634d = -1;
                a0Var3.f1636g = -1;
            }
        }
    }

    public final void k(int i8, int i9) {
        boolean z8;
        EdgeEffect edgeEffect = this.G;
        if (edgeEffect == null || edgeEffect.isFinished() || i8 <= 0) {
            z8 = false;
        } else {
            this.G.onRelease();
            z8 = this.G.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i8 < 0) {
            this.I.onRelease();
            z8 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i9 > 0) {
            this.H.onRelease();
            z8 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.J;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i9 < 0) {
            this.J.onRelease();
            z8 |= this.J.isFinished();
        }
        if (z8) {
            int[] iArr = j0.x.f4957a;
            x.c.k(this);
        }
    }

    public final void l() {
        if (!this.f1620t || this.B) {
            f0.d.a("RV FullInvalidate");
            o();
            f0.d.b();
        } else if (this.f1591d.g()) {
            this.f1591d.getClass();
            if (this.f1591d.g()) {
                f0.d.a("RV FullInvalidate");
                o();
                f0.d.b();
            }
        }
    }

    public final void m(int i8, int i9) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = j0.x.f4957a;
        setMeasuredDimension(l.g(i8, paddingLeft, x.c.e(this)), l.g(i9, getPaddingTop() + getPaddingBottom(), x.c.d(this)));
    }

    public final void n(View view) {
        I(view);
        d dVar = this.f1604k;
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((n) this.A.get(size)).b();
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03f5, code lost:
        if (r0.e.j(getFocusedChild()) == false) goto L_0x04b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r23 = this;
            r0 = r23
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.f1604k
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r0)
            return
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView$l r1 = r0.f1606l
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r0)
            return
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$x r1 = r0.f1595f0
            r3 = 0
            r1.f1719i = r3
            boolean r4 = r0.u0
            r5 = 1
            if (r4 == 0) goto L_0x0034
            int r4 = r0.f1624v0
            int r6 = r23.getWidth()
            if (r4 != r6) goto L_0x0032
            int r4 = r0.f1625w0
            int r6 = r23.getHeight()
            if (r4 == r6) goto L_0x0034
        L_0x0032:
            r4 = r5
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            r0.f1624v0 = r3
            r0.f1625w0 = r3
            r0.u0 = r3
            int r6 = r1.f1715d
            if (r6 != r5) goto L_0x0043
            r23.p()
            goto L_0x0077
        L_0x0043:
            androidx.recyclerview.widget.a r6 = r0.f1591d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r7 = r6.f1770c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0057
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r6.f1769b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0057
            r6 = r5
            goto L_0x0058
        L_0x0057:
            r6 = r3
        L_0x0058:
            if (r6 != 0) goto L_0x0077
            if (r4 != 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f1606l
            int r4 = r4.f1672n
            int r6 = r23.getWidth()
            if (r4 != r6) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f1606l
            int r4 = r4.f1673o
            int r6 = r23.getHeight()
            if (r4 == r6) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f1606l
            r4.t0(r0)
            goto L_0x007f
        L_0x0077:
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f1606l
            r4.t0(r0)
            r23.q()
        L_0x007f:
            r4 = 4
            r1.a(r4)
            r23.c0()
            r23.O()
            r1.f1715d = r5
            boolean r6 = r1.f1720j
            r8 = 0
            androidx.recyclerview.widget.RecyclerView$s r9 = r0.f1587b
            androidx.recyclerview.widget.d0 r10 = r0.f1594f
            if (r6 == 0) goto L_0x0362
            androidx.recyclerview.widget.b r6 = r0.e
            int r6 = r6.e()
            int r6 = r6 - r5
        L_0x009b:
            if (r6 < 0) goto L_0x01fb
            androidx.recyclerview.widget.b r11 = r0.e
            android.view.View r11 = r11.d(r6)
            androidx.recyclerview.widget.RecyclerView$a0 r11 = I(r11)
            boolean r12 = r11.o()
            if (r12 == 0) goto L_0x00af
            goto L_0x01f3
        L_0x00af:
            long r12 = r0.G(r11)
            androidx.recyclerview.widget.RecyclerView$i r14 = r0.K
            r14.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r14 = new androidx.recyclerview.widget.RecyclerView$i$c
            r14.<init>()
            r14.a(r11)
            p.d<androidx.recyclerview.widget.RecyclerView$a0> r15 = r10.f1798b
            java.lang.Object r15 = r15.d(r12, r8)
            androidx.recyclerview.widget.RecyclerView$a0 r15 = (androidx.recyclerview.widget.RecyclerView.a0) r15
            p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r3 = r10.f1797a
            if (r15 == 0) goto L_0x01da
            boolean r16 = r15.o()
            if (r16 != 0) goto L_0x01da
            java.lang.Object r16 = r3.getOrDefault(r15, r8)
            r7 = r16
            androidx.recyclerview.widget.d0$a r7 = (androidx.recyclerview.widget.d0.a) r7
            if (r7 == 0) goto L_0x00e3
            int r7 = r7.f1800a
            r7 = r7 & r5
            if (r7 == 0) goto L_0x00e3
            r7 = r5
            goto L_0x00e4
        L_0x00e3:
            r7 = 0
        L_0x00e4:
            java.lang.Object r16 = r3.getOrDefault(r11, r8)
            r8 = r16
            androidx.recyclerview.widget.d0$a r8 = (androidx.recyclerview.widget.d0.a) r8
            if (r8 == 0) goto L_0x00f5
            int r8 = r8.f1800a
            r8 = r8 & r5
            if (r8 == 0) goto L_0x00f5
            r8 = r5
            goto L_0x00f6
        L_0x00f5:
            r8 = 0
        L_0x00f6:
            if (r7 == 0) goto L_0x00fc
            if (r15 != r11) goto L_0x00fc
            goto L_0x01da
        L_0x00fc:
            androidx.recyclerview.widget.RecyclerView$i$c r5 = r10.a(r15, r4)
            r4 = 0
            java.lang.Object r18 = r3.getOrDefault(r11, r4)
            androidx.recyclerview.widget.d0$a r18 = (androidx.recyclerview.widget.d0.a) r18
            if (r18 != 0) goto L_0x0111
            androidx.recyclerview.widget.d0$a r4 = androidx.recyclerview.widget.d0.a.a()
            r3.put(r11, r4)
            goto L_0x0113
        L_0x0111:
            r4 = r18
        L_0x0113:
            r4.f1802c = r14
            int r3 = r4.f1800a
            r14 = 8
            r3 = r3 | r14
            r4.f1800a = r3
            androidx.recyclerview.widget.RecyclerView$i$c r3 = r10.a(r11, r14)
            if (r5 != 0) goto L_0x01b0
            androidx.recyclerview.widget.b r3 = r0.e
            int r3 = r3.e()
            r4 = 0
        L_0x0129:
            if (r4 >= r3) goto L_0x018f
            androidx.recyclerview.widget.b r5 = r0.e
            android.view.View r5 = r5.d(r4)
            androidx.recyclerview.widget.RecyclerView$a0 r5 = I(r5)
            if (r5 != r11) goto L_0x0138
            goto L_0x018c
        L_0x0138:
            long r7 = r0.G(r5)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x018c
            androidx.recyclerview.widget.RecyclerView$d r1 = r0.f1604k
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x016b
            boolean r1 = r1.f1650b
            if (r1 == 0) goto L_0x016b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r5)
            r3.append(r2)
            r3.append(r11)
            java.lang.String r0 = r23.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x016b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r5)
            r3.append(r2)
            r3.append(r11)
            java.lang.String r0 = r23.y()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x018c:
            int r4 = r4 + 1
            goto L_0x0129
        L_0x018f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r3.<init>(r4)
            r3.append(r15)
            java.lang.String r4 = " cannot be found but it is necessary for "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = r23.y()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L_0x01f3
        L_0x01b0:
            r4 = 0
            r15.n(r4)
            if (r7 == 0) goto L_0x01b9
            r0.e(r15)
        L_0x01b9:
            if (r15 == r11) goto L_0x01ce
            if (r8 == 0) goto L_0x01c0
            r0.e(r11)
        L_0x01c0:
            r15.f1637h = r11
            r0.e(r15)
            r9.j(r15)
            r4 = 0
            r11.n(r4)
            r11.f1638i = r15
        L_0x01ce:
            androidx.recyclerview.widget.RecyclerView$i r4 = r0.K
            boolean r3 = r4.a(r15, r11, r5, r3)
            if (r3 == 0) goto L_0x01f3
            r23.R()
            goto L_0x01f3
        L_0x01da:
            r4 = 0
            java.lang.Object r5 = r3.getOrDefault(r11, r4)
            androidx.recyclerview.widget.d0$a r5 = (androidx.recyclerview.widget.d0.a) r5
            if (r5 != 0) goto L_0x01ea
            androidx.recyclerview.widget.d0$a r5 = androidx.recyclerview.widget.d0.a.a()
            r3.put(r11, r5)
        L_0x01ea:
            r5.f1802c = r14
            int r3 = r5.f1800a
            r4 = 8
            r3 = r3 | r4
            r5.f1800a = r3
        L_0x01f3:
            int r6 = r6 + -1
            r3 = 0
            r4 = 4
            r5 = 1
            r8 = 0
            goto L_0x009b
        L_0x01fb:
            p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r2 = r10.f1797a
            int r3 = r2.f6235h
            r4 = -1
            int r3 = r3 + r4
        L_0x0201:
            if (r3 < 0) goto L_0x0360
            java.lang.Object r4 = r2.h(r3)
            androidx.recyclerview.widget.RecyclerView$a0 r4 = (androidx.recyclerview.widget.RecyclerView.a0) r4
            java.lang.Object r5 = r2.j(r3)
            androidx.recyclerview.widget.d0$a r5 = (androidx.recyclerview.widget.d0.a) r5
            int r6 = r5.f1800a
            r7 = r6 & 3
            r8 = 3
            androidx.recyclerview.widget.RecyclerView$c r11 = r0.f1627x0
            if (r7 != r8) goto L_0x0219
            goto L_0x0221
        L_0x0219:
            r7 = r6 & 1
            if (r7 == 0) goto L_0x0231
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1801b
            if (r6 != 0) goto L_0x022e
        L_0x0221:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$l r7 = r6.f1606l
            android.view.View r4 = r4.f1631a
            androidx.recyclerview.widget.RecyclerView$s r6 = r6.f1587b
            r7.m0(r4, r6)
            goto L_0x034f
        L_0x022e:
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f1802c
            goto L_0x0294
        L_0x0231:
            r7 = r6 & 14
            r8 = 14
            if (r7 != r8) goto L_0x0239
            goto L_0x0300
        L_0x0239:
            r7 = r6 & 12
            r8 = 12
            if (r7 != r8) goto L_0x028d
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1801b
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f1802c
            r11.getClass()
            r8 = 0
            r4.n(r8)
            androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
            boolean r11 = r8.B
            if (r11 == 0) goto L_0x0259
            androidx.recyclerview.widget.RecyclerView$i r11 = r8.K
            boolean r4 = r11.a(r4, r4, r6, r7)
            if (r4 == 0) goto L_0x034f
            goto L_0x0288
        L_0x0259:
            androidx.recyclerview.widget.RecyclerView$i r11 = r8.K
            androidx.recyclerview.widget.z r11 = (androidx.recyclerview.widget.z) r11
            r11.getClass()
            int r12 = r6.f1657a
            int r13 = r7.f1657a
            if (r12 != r13) goto L_0x0272
            int r14 = r6.f1658b
            int r15 = r7.f1658b
            if (r14 == r15) goto L_0x026d
            goto L_0x0272
        L_0x026d:
            r11.c(r4)
            r4 = 0
            goto L_0x0286
        L_0x0272:
            int r6 = r6.f1658b
            int r7 = r7.f1658b
            r17 = r11
            r18 = r4
            r19 = r12
            r20 = r6
            r21 = r13
            r22 = r7
            boolean r4 = r17.g(r18, r19, r20, r21, r22)
        L_0x0286:
            if (r4 == 0) goto L_0x034f
        L_0x0288:
            r8.R()
            goto L_0x034f
        L_0x028d:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x02fc
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1801b
            r7 = 0
        L_0x0294:
            androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$s r11 = r8.f1587b
            r11.j(r4)
            r8.e(r4)
            r11 = 0
            r4.n(r11)
            androidx.recyclerview.widget.RecyclerView$i r11 = r8.K
            r17 = r11
            androidx.recyclerview.widget.z r17 = (androidx.recyclerview.widget.z) r17
            r17.getClass()
            int r11 = r6.f1657a
            int r6 = r6.f1658b
            android.view.View r12 = r4.f1631a
            if (r7 != 0) goto L_0x02b8
            int r13 = r12.getLeft()
            goto L_0x02ba
        L_0x02b8:
            int r13 = r7.f1657a
        L_0x02ba:
            if (r7 != 0) goto L_0x02c1
            int r7 = r12.getTop()
            goto L_0x02c3
        L_0x02c1:
            int r7 = r7.f1658b
        L_0x02c3:
            boolean r14 = r4.i()
            if (r14 != 0) goto L_0x02e9
            if (r11 != r13) goto L_0x02cd
            if (r6 == r7) goto L_0x02e9
        L_0x02cd:
            int r14 = r12.getWidth()
            int r14 = r14 + r13
            int r15 = r12.getHeight()
            int r15 = r15 + r7
            r12.layout(r13, r7, r14, r15)
            r18 = r4
            r19 = r11
            r20 = r6
            r21 = r13
            r22 = r7
            boolean r4 = r17.g(r18, r19, r20, r21, r22)
            goto L_0x02f6
        L_0x02e9:
            r6 = r17
            androidx.recyclerview.widget.k r6 = (androidx.recyclerview.widget.k) r6
            r6.l(r4)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r6 = r6.f1827h
            r6.add(r4)
            r4 = 1
        L_0x02f6:
            if (r4 == 0) goto L_0x034f
            r8.R()
            goto L_0x034f
        L_0x02fc:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x034f
        L_0x0300:
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1801b
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r5.f1802c
            androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
            r8.getClass()
            r11 = 0
            r4.n(r11)
            androidx.recyclerview.widget.RecyclerView$i r11 = r8.K
            r17 = r11
            androidx.recyclerview.widget.z r17 = (androidx.recyclerview.widget.z) r17
            r17.getClass()
            if (r6 == 0) goto L_0x0337
            int r11 = r6.f1657a
            int r12 = r7.f1657a
            if (r11 != r12) goto L_0x0324
            int r13 = r6.f1658b
            int r14 = r7.f1658b
            if (r13 == r14) goto L_0x0337
        L_0x0324:
            int r6 = r6.f1658b
            int r7 = r7.f1658b
            r18 = r4
            r19 = r11
            r20 = r6
            r21 = r12
            r22 = r7
            boolean r4 = r17.g(r18, r19, r20, r21, r22)
            goto L_0x034a
        L_0x0337:
            r6 = r17
            androidx.recyclerview.widget.k r6 = (androidx.recyclerview.widget.k) r6
            r6.l(r4)
            android.view.View r7 = r4.f1631a
            r11 = 0
            r7.setAlpha(r11)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r6 = r6.f1828i
            r6.add(r4)
            r4 = 1
        L_0x034a:
            if (r4 == 0) goto L_0x034f
            r8.R()
        L_0x034f:
            r4 = 0
            r5.f1800a = r4
            r4 = 0
            r5.f1801b = r4
            r5.f1802c = r4
            s.e r6 = androidx.recyclerview.widget.d0.a.f1799d
            r6.a(r5)
            int r3 = r3 + -1
            goto L_0x0201
        L_0x0360:
            r4 = 0
            goto L_0x0363
        L_0x0362:
            r4 = r8
        L_0x0363:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.f1606l
            r2.l0(r9)
            int r2 = r1.e
            r1.f1713b = r2
            r2 = 0
            r0.B = r2
            r0.C = r2
            r1.f1720j = r2
            r1.f1721k = r2
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            r3.f1664f = r2
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r9.f1691b
            if (r3 == 0) goto L_0x0380
            r3.clear()
        L_0x0380:
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            boolean r5 = r3.f1669k
            if (r5 == 0) goto L_0x038d
            r3.f1668j = r2
            r3.f1669k = r2
            r9.k()
        L_0x038d:
            androidx.recyclerview.widget.RecyclerView$l r3 = r0.f1606l
            r3.f0(r1)
            r3 = 1
            r0.P(r3)
            r0.d0(r2)
            p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r5 = r10.f1797a
            r5.clear()
            p.d<androidx.recyclerview.widget.RecyclerView$a0> r5 = r10.f1798b
            r5.a()
            int[] r5 = r0.f1611n0
            r6 = r5[r2]
            r7 = r5[r3]
            r0.C(r5)
            r8 = r5[r2]
            if (r8 != r6) goto L_0x03b7
            r5 = r5[r3]
            if (r5 == r7) goto L_0x03b5
            goto L_0x03b7
        L_0x03b5:
            r5 = r2
            goto L_0x03b8
        L_0x03b7:
            r5 = r3
        L_0x03b8:
            if (r5 == 0) goto L_0x03bd
            r0.t(r2, r2)
        L_0x03bd:
            boolean r3 = r0.f1588b0
            r5 = -1
            if (r3 == 0) goto L_0x04b0
            androidx.recyclerview.widget.RecyclerView$d r3 = r0.f1604k
            if (r3 == 0) goto L_0x04b0
            boolean r3 = r23.hasFocus()
            if (r3 == 0) goto L_0x04b0
            int r3 = r23.getDescendantFocusability()
            r7 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r7) goto L_0x04b0
            int r3 = r23.getDescendantFocusability()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r7) goto L_0x03e5
            boolean r3 = r23.isFocused()
            if (r3 == 0) goto L_0x03e5
            goto L_0x04b0
        L_0x03e5:
            boolean r3 = r23.isFocused()
            if (r3 != 0) goto L_0x03f9
            android.view.View r3 = r23.getFocusedChild()
            androidx.recyclerview.widget.b r7 = r0.e
            boolean r3 = r7.j(r3)
            if (r3 != 0) goto L_0x03f9
            goto L_0x04b0
        L_0x03f9:
            long r7 = r1.f1723m
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x043b
            androidx.recyclerview.widget.RecyclerView$d r3 = r0.f1604k
            boolean r3 = r3.f1650b
            if (r3 == 0) goto L_0x043b
            if (r3 != 0) goto L_0x0408
            goto L_0x043b
        L_0x0408:
            androidx.recyclerview.widget.b r3 = r0.e
            int r3 = r3.h()
            r9 = r2
            r10 = r4
        L_0x0410:
            if (r9 >= r3) goto L_0x043c
            androidx.recyclerview.widget.b r11 = r0.e
            android.view.View r11 = r11.g(r9)
            androidx.recyclerview.widget.RecyclerView$a0 r11 = I(r11)
            if (r11 == 0) goto L_0x0438
            boolean r12 = r11.i()
            if (r12 != 0) goto L_0x0438
            long r12 = r11.e
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0438
            androidx.recyclerview.widget.b r10 = r0.e
            android.view.View r12 = r11.f1631a
            boolean r10 = r10.j(r12)
            if (r10 == 0) goto L_0x0436
            r10 = r11
            goto L_0x0438
        L_0x0436:
            r10 = r11
            goto L_0x043c
        L_0x0438:
            int r9 = r9 + 1
            goto L_0x0410
        L_0x043b:
            r10 = r4
        L_0x043c:
            if (r10 == 0) goto L_0x0451
            androidx.recyclerview.widget.b r3 = r0.e
            android.view.View r7 = r10.f1631a
            boolean r3 = r3.j(r7)
            if (r3 != 0) goto L_0x0451
            boolean r3 = r7.hasFocusable()
            if (r3 != 0) goto L_0x044f
            goto L_0x0451
        L_0x044f:
            r8 = r7
            goto L_0x0497
        L_0x0451:
            androidx.recyclerview.widget.b r3 = r0.e
            int r3 = r3.e()
            if (r3 <= 0) goto L_0x0496
            int r3 = r1.f1722l
            r7 = -1
            if (r3 == r7) goto L_0x045f
            goto L_0x0460
        L_0x045f:
            r3 = r2
        L_0x0460:
            int r2 = r1.b()
            r7 = r3
        L_0x0465:
            if (r7 >= r2) goto L_0x047a
            androidx.recyclerview.widget.RecyclerView$a0 r8 = r0.E(r7)
            if (r8 != 0) goto L_0x046e
            goto L_0x047a
        L_0x046e:
            android.view.View r8 = r8.f1631a
            boolean r9 = r8.hasFocusable()
            if (r9 == 0) goto L_0x0477
            goto L_0x0497
        L_0x0477:
            int r7 = r7 + 1
            goto L_0x0465
        L_0x047a:
            int r2 = java.lang.Math.min(r2, r3)
            r3 = -1
            int r2 = r2 + r3
        L_0x0480:
            if (r2 < 0) goto L_0x0496
            androidx.recyclerview.widget.RecyclerView$a0 r3 = r0.E(r2)
            if (r3 != 0) goto L_0x0489
            goto L_0x0496
        L_0x0489:
            android.view.View r3 = r3.f1631a
            boolean r7 = r3.hasFocusable()
            if (r7 == 0) goto L_0x0493
            r8 = r3
            goto L_0x0497
        L_0x0493:
            int r2 = r2 + -1
            goto L_0x0480
        L_0x0496:
            r8 = r4
        L_0x0497:
            if (r8 == 0) goto L_0x04b0
            int r0 = r1.f1724n
            long r2 = (long) r0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x04ad
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x04ad
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto L_0x04ad
            r8 = r0
        L_0x04ad:
            r8.requestFocus()
        L_0x04b0:
            r1.f1723m = r5
            r0 = -1
            r1.f1722l = r0
            r1.f1724n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1 >= 30.0f) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.D = r0
            r1 = 1
            r5.r = r1
            boolean r2 = r5.f1620t
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.f1620t = r2
            androidx.recyclerview.widget.RecyclerView$l r2 = r5.f1606l
            if (r2 == 0) goto L_0x001e
            r2.f1665g = r1
        L_0x001e:
            r5.f1607l0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f1873j
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.f1592d0 = r1
            if (r1 != 0) goto L_0x005a
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f1592d0 = r1
            int[] r1 = j0.x.f4957a
            android.view.Display r1 = j0.x.d.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x004e:
            androidx.recyclerview.widget.m r2 = r5.f1592d0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1877h = r3
            r0.set(r2)
        L_0x005a:
            androidx.recyclerview.widget.m r0 = r5.f1592d0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f1875f
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        w wVar;
        super.onDetachedFromWindow();
        i iVar = this.K;
        if (iVar != null) {
            iVar.e();
        }
        setScrollState(0);
        z zVar = this.f1590c0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f1727h.abortAnimation();
        l lVar = this.f1606l;
        if (!(lVar == null || (wVar = lVar.e) == null)) {
            wVar.d();
        }
        this.r = false;
        l lVar2 = this.f1606l;
        if (lVar2 != null) {
            lVar2.f1665g = false;
            lVar2.T(this);
        }
        this.s0.clear();
        removeCallbacks(this.f1621t0);
        this.f1594f.getClass();
        do {
        } while (d0.a.f1799d.b() != null);
        m mVar = this.f1592d0;
        if (mVar != null) {
            mVar.f1875f.remove(this);
            this.f1592d0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<k> arrayList = this.f1612o;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).d(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            r8 = 0
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            boolean r0 = r6.w
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            int r0 = r16.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00dc
            int r0 = r16.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x003f
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$l r2 = r6.f1606l
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0057
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0065
        L_0x003f:
            int r0 = r16.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0063
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0059
            float r0 = -r2
        L_0x0057:
            r2 = r1
            goto L_0x0065
        L_0x0059:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0063
            r0 = r1
            goto L_0x0065
        L_0x0063:
            r0 = r1
            r2 = r0
        L_0x0065:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00dc
        L_0x006d:
            float r1 = r6.W
            float r2 = r2 * r1
            int r9 = (int) r2
            float r1 = r6.f1586a0
            float r0 = r0 * r1
            int r10 = (int) r0
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L_0x00dc
        L_0x0082:
            boolean r1 = r6.w
            if (r1 == 0) goto L_0x0087
            goto L_0x00dc
        L_0x0087:
            int[] r11 = r6.f1618r0
            r11[r8] = r8
            r12 = 1
            r11[r12] = r8
            boolean r13 = r0.d()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            boolean r14 = r0.e()
            if (r14 == 0) goto L_0x009d
            r0 = r13 | 2
            goto L_0x009e
        L_0x009d:
            r0 = r13
        L_0x009e:
            j0.l r1 = r15.getScrollingChildHelper()
            r1.g(r0, r12)
            if (r13 == 0) goto L_0x00a9
            r1 = r9
            goto L_0x00aa
        L_0x00a9:
            r1 = r8
        L_0x00aa:
            if (r14 == 0) goto L_0x00ae
            r2 = r10
            goto L_0x00af
        L_0x00ae:
            r2 = r8
        L_0x00af:
            int[] r3 = r6.f1618r0
            int[] r4 = r6.f1615p0
            r5 = 1
            r0 = r15
            boolean r0 = r0.r(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c1
            r0 = r11[r8]
            int r9 = r9 - r0
            r0 = r11[r12]
            int r10 = r10 - r0
        L_0x00c1:
            if (r13 == 0) goto L_0x00c5
            r0 = r9
            goto L_0x00c6
        L_0x00c5:
            r0 = r8
        L_0x00c6:
            if (r14 == 0) goto L_0x00ca
            r1 = r10
            goto L_0x00cb
        L_0x00ca:
            r1 = r8
        L_0x00cb:
            r15.X(r0, r1, r7, r12)
            androidx.recyclerview.widget.m r0 = r6.f1592d0
            if (r0 == 0) goto L_0x00d9
            if (r9 != 0) goto L_0x00d6
            if (r10 == 0) goto L_0x00d9
        L_0x00d6:
            r0.a(r15, r9, r10)
        L_0x00d9:
            r15.e0(r12)
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        if (this.w) {
            return false;
        }
        this.f1616q = null;
        if (B(motionEvent)) {
            W();
            setScrollState(0);
            return true;
        }
        l lVar = this.f1606l;
        if (lVar == null) {
            return false;
        }
        boolean d9 = lVar.d();
        boolean e4 = this.f1606l.e();
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1626x) {
                this.f1626x = false;
            }
            this.M = motionEvent.getPointerId(0);
            int x8 = (int) (motionEvent.getX() + 0.5f);
            this.Q = x8;
            this.O = x8;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.R = y8;
            this.P = y8;
            if (this.L == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f1617q0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e4) {
                d9 |= true;
            }
            getScrollingChildHelper().g(d9 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.N.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.M);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.M + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y9 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.L != 1) {
                int i8 = x9 - this.O;
                int i9 = y9 - this.P;
                if (!d9 || Math.abs(i8) <= this.S) {
                    z8 = false;
                } else {
                    this.Q = x9;
                    z8 = true;
                }
                if (e4 && Math.abs(i9) > this.S) {
                    this.R = y9;
                    z8 = true;
                }
                if (z8) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            W();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.M = motionEvent.getPointerId(actionIndex);
            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.Q = x10;
            this.O = x10;
            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.R = y10;
            this.P = y10;
        } else if (actionMasked == 6) {
            Q(motionEvent);
        }
        return this.L == 1;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        f0.d.a("RV OnLayout");
        o();
        f0.d.b();
        this.f1620t = true;
    }

    public final void onMeasure(int i8, int i9) {
        l lVar = this.f1606l;
        if (lVar == null) {
            m(i8, i9);
            return;
        }
        boolean N2 = lVar.N();
        boolean z8 = false;
        x xVar = this.f1595f0;
        if (N2) {
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f1606l.f1661b.m(i8, i9);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z8 = true;
            }
            this.u0 = z8;
            if (!z8 && this.f1604k != null) {
                if (xVar.f1715d == 1) {
                    p();
                }
                this.f1606l.u0(i8, i9);
                xVar.f1719i = true;
                q();
                this.f1606l.w0(i8, i9);
                if (this.f1606l.z0()) {
                    this.f1606l.u0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    xVar.f1719i = true;
                    q();
                    this.f1606l.w0(i8, i9);
                }
                this.f1624v0 = getMeasuredWidth();
                this.f1625w0 = getMeasuredHeight();
            }
        } else if (this.f1619s) {
            this.f1606l.f1661b.m(i8, i9);
        } else if (xVar.f1721k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            d dVar = this.f1604k;
            if (dVar != null) {
                xVar.e = dVar.c();
            } else {
                xVar.e = 0;
            }
            c0();
            this.f1606l.f1661b.m(i8, i9);
            d0(false);
            xVar.f1717g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f1589c = vVar;
        super.onRestoreInstanceState(vVar.f6241f);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f1589c;
        if (vVar2 != null) {
            vVar.f1698h = vVar2.f1698h;
        } else {
            l lVar = this.f1606l;
            vVar.f1698h = lVar != null ? lVar.h0() : null;
        }
        return vVar;
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10 || i9 != i11) {
            this.J = null;
            this.H = null;
            this.I = null;
            this.G = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0256, code lost:
        if (r7 == false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02ad, code lost:
        if (r0 != false) goto L_0x02b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            boolean r0 = r6.w
            r8 = 0
            if (r0 != 0) goto L_0x02e7
            boolean r0 = r6.f1626x
            if (r0 == 0) goto L_0x000f
            goto L_0x02e7
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f1616q
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r24.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = r8
            goto L_0x0031
        L_0x001d:
            boolean r0 = r23.B(r24)
            goto L_0x0031
        L_0x0022:
            r0.a(r7)
            int r0 = r24.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.f1616q = r0
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r23.W()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.d()
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1606l
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.N
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.N = r0
        L_0x0053:
            int r0 = r24.getActionMasked()
            int r2 = r24.getActionIndex()
            int[] r12 = r6.f1617q0
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            r3 = r12[r8]
            float r3 = (float) r3
            r4 = r12[r9]
            float r4 = (float) r4
            r13.offsetLocation(r3, r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x02b7
            r4 = 2
            java.lang.String r5 = "RecyclerView"
            if (r0 == r9) goto L_0x0190
            if (r0 == r4) goto L_0x00ae
            if (r0 == r1) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x02dc
        L_0x0085:
            r23.Q(r24)
            goto L_0x02dc
        L_0x008a:
            int r0 = r7.getPointerId(r2)
            r6.M = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.Q = r0
            r6.O = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.R = r0
            r6.P = r0
            goto L_0x02dc
        L_0x00a6:
            r23.W()
            r6.setScrollState(r8)
            goto L_0x02dc
        L_0x00ae:
            int r0 = r6.M
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.M
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            return r8
        L_0x00cf:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r15 = (int) r0
            int r0 = r6.Q
            int r0 = r0 - r14
            int r1 = r6.R
            int r1 = r1 - r15
            int r2 = r6.L
            if (r2 == r9) goto L_0x0114
            if (r10 == 0) goto L_0x00fa
            int r2 = r6.S
            if (r0 <= 0) goto L_0x00f1
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f6
        L_0x00f1:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f6:
            if (r0 == 0) goto L_0x00fa
            r2 = r9
            goto L_0x00fb
        L_0x00fa:
            r2 = r8
        L_0x00fb:
            if (r11 == 0) goto L_0x010f
            int r3 = r6.S
            if (r1 <= 0) goto L_0x0107
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010c
        L_0x0107:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010c:
            if (r1 == 0) goto L_0x010f
            r2 = r9
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r6.setScrollState(r9)
        L_0x0114:
            r16 = r0
            r17 = r1
            int r0 = r6.L
            if (r0 != r9) goto L_0x02dc
            int[] r5 = r6.f1618r0
            r5[r8] = r8
            r5[r9] = r8
            if (r10 == 0) goto L_0x0127
            r1 = r16
            goto L_0x0128
        L_0x0127:
            r1 = r8
        L_0x0128:
            if (r11 == 0) goto L_0x012d
            r2 = r17
            goto L_0x012e
        L_0x012d:
            r2 = r8
        L_0x012e:
            int[] r4 = r6.f1615p0
            r18 = 0
            r0 = r23
            r3 = r5
            r19 = r5
            r5 = r18
            boolean r0 = r0.r(r1, r2, r3, r4, r5)
            int[] r1 = r6.f1615p0
            if (r0 == 0) goto L_0x015e
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r23.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015e:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.Q = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.R = r15
            if (r10 == 0) goto L_0x0170
            r1 = r0
            goto L_0x0171
        L_0x0170:
            r1 = r8
        L_0x0171:
            if (r11 == 0) goto L_0x0175
            r3 = r2
            goto L_0x0176
        L_0x0175:
            r3 = r8
        L_0x0176:
            boolean r1 = r6.X(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x0183
            android.view.ViewParent r1 = r23.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0183:
            androidx.recyclerview.widget.m r1 = r6.f1592d0
            if (r1 == 0) goto L_0x02dc
            if (r0 != 0) goto L_0x018b
            if (r2 == 0) goto L_0x02dc
        L_0x018b:
            r1.a(r6, r0, r2)
            goto L_0x02dc
        L_0x0190:
            android.view.VelocityTracker r0 = r6.N
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.N
            int r1 = r6.V
            float r2 = (float) r1
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3, r2)
            r0 = 0
            if (r10 == 0) goto L_0x01ac
            android.view.VelocityTracker r2 = r6.N
            int r3 = r6.M
            float r2 = r2.getXVelocity(r3)
            float r2 = -r2
            goto L_0x01ad
        L_0x01ac:
            r2 = r0
        L_0x01ad:
            if (r11 == 0) goto L_0x01b9
            android.view.VelocityTracker r3 = r6.N
            int r7 = r6.M
            float r3 = r3.getYVelocity(r7)
            float r3 = -r3
            goto L_0x01ba
        L_0x01b9:
            r3 = r0
        L_0x01ba:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x01c2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02af
        L_0x01c2:
            int r0 = (int) r2
            int r2 = (int) r3
            androidx.recyclerview.widget.RecyclerView$l r3 = r6.f1606l
            if (r3 != 0) goto L_0x01cf
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r5, r0)
            goto L_0x02ac
        L_0x01cf:
            boolean r5 = r6.w
            if (r5 == 0) goto L_0x01d5
            goto L_0x02ac
        L_0x01d5:
            boolean r3 = r3.d()
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f1606l
            boolean r5 = r5.e()
            int r7 = r6.U
            if (r3 == 0) goto L_0x01e9
            int r10 = java.lang.Math.abs(r0)
            if (r10 >= r7) goto L_0x01ea
        L_0x01e9:
            r0 = r8
        L_0x01ea:
            if (r5 == 0) goto L_0x01f2
            int r10 = java.lang.Math.abs(r2)
            if (r10 >= r7) goto L_0x01f3
        L_0x01f2:
            r2 = r8
        L_0x01f3:
            if (r0 != 0) goto L_0x01f9
            if (r2 != 0) goto L_0x01f9
            goto L_0x02ac
        L_0x01f9:
            float r7 = (float) r0
            float r10 = (float) r2
            boolean r11 = r6.dispatchNestedPreFling(r7, r10)
            if (r11 != 0) goto L_0x02ac
            if (r3 != 0) goto L_0x0208
            if (r5 == 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r11 = r8
            goto L_0x0209
        L_0x0208:
            r11 = r9
        L_0x0209:
            r6.dispatchNestedFling(r7, r10, r11)
            androidx.recyclerview.widget.RecyclerView$o r7 = r6.T
            if (r7 == 0) goto L_0x0259
            androidx.recyclerview.widget.a0 r7 = (androidx.recyclerview.widget.a0) r7
            androidx.recyclerview.widget.RecyclerView r10 = r7.f1776a
            androidx.recyclerview.widget.RecyclerView$l r10 = r10.getLayoutManager()
            if (r10 != 0) goto L_0x021b
            goto L_0x0255
        L_0x021b:
            androidx.recyclerview.widget.RecyclerView r12 = r7.f1776a
            androidx.recyclerview.widget.RecyclerView$d r12 = r12.getAdapter()
            if (r12 != 0) goto L_0x0224
            goto L_0x0255
        L_0x0224:
            androidx.recyclerview.widget.RecyclerView r12 = r7.f1776a
            int r12 = r12.getMinFlingVelocity()
            int r14 = java.lang.Math.abs(r2)
            if (r14 > r12) goto L_0x0236
            int r14 = java.lang.Math.abs(r0)
            if (r14 <= r12) goto L_0x0255
        L_0x0236:
            boolean r12 = r10 instanceof androidx.recyclerview.widget.RecyclerView.w.b
            if (r12 != 0) goto L_0x023b
            goto L_0x0249
        L_0x023b:
            androidx.recyclerview.widget.RecyclerView$w r12 = r7.c(r10)
            if (r12 != 0) goto L_0x0242
            goto L_0x0249
        L_0x0242:
            int r7 = r7.e(r10, r0, r2)
            r14 = -1
            if (r7 != r14) goto L_0x024b
        L_0x0249:
            r7 = r8
            goto L_0x0251
        L_0x024b:
            r12.f1699a = r7
            r10.C0(r12)
            r7 = r9
        L_0x0251:
            if (r7 == 0) goto L_0x0255
            r7 = r9
            goto L_0x0256
        L_0x0255:
            r7 = r8
        L_0x0256:
            if (r7 == 0) goto L_0x0259
            goto L_0x02aa
        L_0x0259:
            if (r11 == 0) goto L_0x02ac
            if (r5 == 0) goto L_0x025f
            r3 = r3 | 2
        L_0x025f:
            j0.l r5 = r23.getScrollingChildHelper()
            r5.g(r3, r9)
            int r3 = -r1
            int r0 = java.lang.Math.min(r0, r1)
            int r17 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.min(r2, r1)
            int r18 = java.lang.Math.max(r3, r0)
            androidx.recyclerview.widget.RecyclerView$z r0 = r6.f1590c0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r1.setScrollState(r4)
            r0.f1726g = r8
            r0.f1725f = r8
            android.view.animation.Interpolator r2 = r0.f1728i
            android.view.animation.Interpolator r3 = A0
            if (r2 == r3) goto L_0x0295
            r0.f1728i = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1, r3)
            r0.f1727h = r2
        L_0x0295:
            android.widget.OverScroller r14 = r0.f1727h
            r15 = 0
            r16 = 0
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = 2147483647(0x7fffffff, float:NaN)
            r14.fling(r15, r16, r17, r18, r19, r20, r21, r22)
            r0.a()
        L_0x02aa:
            r0 = r9
            goto L_0x02ad
        L_0x02ac:
            r0 = r8
        L_0x02ad:
            if (r0 != 0) goto L_0x02b2
        L_0x02af:
            r6.setScrollState(r8)
        L_0x02b2:
            r23.W()
            r8 = r9
            goto L_0x02dc
        L_0x02b7:
            int r0 = r7.getPointerId(r8)
            r6.M = r0
            float r0 = r24.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.Q = r0
            r6.O = r0
            float r0 = r24.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.R = r0
            r6.P = r0
            if (r11 == 0) goto L_0x02d5
            r10 = r10 | 2
        L_0x02d5:
            j0.l r0 = r23.getScrollingChildHelper()
            r0.g(r10, r8)
        L_0x02dc:
            if (r8 != 0) goto L_0x02e3
            android.view.VelocityTracker r0 = r6.N
            r0.addMovement(r13)
        L_0x02e3:
            r13.recycle()
            return r9
        L_0x02e7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[EDGE_INSN: B:109:0x0098->B:38:0x0098 ?: BREAK  
    EDGE_INSN: B:110:0x0098->B:38:0x0098 ?: BREAK  
    EDGE_INSN: B:111:0x0098->B:38:0x0098 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView$x r0 = r14.f1595f0
            r1 = 1
            r0.a(r1)
            r14.z(r0)
            r2 = 0
            r0.f1719i = r2
            r14.c0()
            androidx.recyclerview.widget.d0 r3 = r14.f1594f
            p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r4 = r3.f1797a
            r4.clear()
            p.d<androidx.recyclerview.widget.RecyclerView$a0> r4 = r3.f1798b
            r4.a()
            r14.O()
            r14.S()
            boolean r4 = r14.f1588b0
            r5 = 0
            if (r4 == 0) goto L_0x0035
            boolean r4 = r14.hasFocus()
            if (r4 == 0) goto L_0x0035
            androidx.recyclerview.widget.RecyclerView$d r4 = r14.f1604k
            if (r4 == 0) goto L_0x0035
            android.view.View r4 = r14.getFocusedChild()
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            if (r4 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            android.view.View r4 = r14.A(r4)
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r4 = r5
            goto L_0x0045
        L_0x0041:
            androidx.recyclerview.widget.RecyclerView$a0 r4 = r14.H(r4)
        L_0x0045:
            r6 = -1
            r8 = -1
            if (r4 != 0) goto L_0x0051
            r0.f1723m = r6
            r0.f1722l = r8
            r0.f1724n = r8
            goto L_0x009a
        L_0x0051:
            androidx.recyclerview.widget.RecyclerView$d r9 = r14.f1604k
            boolean r9 = r9.f1650b
            if (r9 == 0) goto L_0x0059
            long r6 = r4.e
        L_0x0059:
            r0.f1723m = r6
            boolean r6 = r14.B
            if (r6 == 0) goto L_0x0061
        L_0x005f:
            r6 = r8
            goto L_0x0073
        L_0x0061:
            boolean r6 = r4.i()
            if (r6 == 0) goto L_0x006a
            int r6 = r4.f1634d
            goto L_0x0073
        L_0x006a:
            androidx.recyclerview.widget.RecyclerView r6 = r4.r
            if (r6 != 0) goto L_0x006f
            goto L_0x005f
        L_0x006f:
            int r6 = r6.F(r4)
        L_0x0073:
            r0.f1722l = r6
            android.view.View r4 = r4.f1631a
        L_0x0077:
            int r6 = r4.getId()
        L_0x007b:
            boolean r7 = r4.isFocused()
            if (r7 != 0) goto L_0x0098
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0098
            boolean r7 = r4.hasFocus()
            if (r7 == 0) goto L_0x0098
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r7 = r4.getId()
            if (r7 == r8) goto L_0x007b
            goto L_0x0077
        L_0x0098:
            r0.f1724n = r6
        L_0x009a:
            boolean r4 = r0.f1720j
            if (r4 == 0) goto L_0x00a4
            boolean r4 = r14.f1603j0
            if (r4 == 0) goto L_0x00a4
            r4 = r1
            goto L_0x00a5
        L_0x00a4:
            r4 = r2
        L_0x00a5:
            r0.f1718h = r4
            r14.f1603j0 = r2
            r14.f1601i0 = r2
            boolean r4 = r0.f1721k
            r0.f1717g = r4
            androidx.recyclerview.widget.RecyclerView$d r4 = r14.f1604k
            int r4 = r4.c()
            r0.e = r4
            int[] r4 = r14.f1611n0
            r14.C(r4)
            boolean r4 = r0.f1720j
            r6 = 2
            p.f<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.d0$a> r7 = r3.f1797a
            if (r4 == 0) goto L_0x013f
            androidx.recyclerview.widget.b r4 = r14.e
            int r4 = r4.e()
            r9 = r2
        L_0x00ca:
            if (r9 >= r4) goto L_0x013f
            androidx.recyclerview.widget.b r10 = r14.e
            android.view.View r10 = r10.d(r9)
            androidx.recyclerview.widget.RecyclerView$a0 r10 = I(r10)
            boolean r11 = r10.o()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.g()
            if (r11 == 0) goto L_0x00e9
            androidx.recyclerview.widget.RecyclerView$d r11 = r14.f1604k
            boolean r11 = r11.f1650b
            if (r11 != 0) goto L_0x00e9
            goto L_0x013c
        L_0x00e9:
            androidx.recyclerview.widget.RecyclerView$i r11 = r14.K
            androidx.recyclerview.widget.RecyclerView.i.b(r10)
            r10.d()
            r11.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r11 = new androidx.recyclerview.widget.RecyclerView$i$c
            r11.<init>()
            r11.a(r10)
            java.lang.Object r12 = r7.getOrDefault(r10, r5)
            androidx.recyclerview.widget.d0$a r12 = (androidx.recyclerview.widget.d0.a) r12
            if (r12 != 0) goto L_0x010b
            androidx.recyclerview.widget.d0$a r12 = androidx.recyclerview.widget.d0.a.a()
            r7.put(r10, r12)
        L_0x010b:
            r12.f1801b = r11
            int r11 = r12.f1800a
            r11 = r11 | 4
            r12.f1800a = r11
            boolean r11 = r0.f1718h
            if (r11 == 0) goto L_0x013c
            int r11 = r10.f1639j
            r11 = r11 & r6
            if (r11 == 0) goto L_0x011e
            r11 = r1
            goto L_0x011f
        L_0x011e:
            r11 = r2
        L_0x011f:
            if (r11 == 0) goto L_0x013c
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.o()
            if (r11 != 0) goto L_0x013c
            boolean r11 = r10.g()
            if (r11 != 0) goto L_0x013c
            long r11 = r14.G(r10)
            p.d<androidx.recyclerview.widget.RecyclerView$a0> r13 = r3.f1798b
            r13.f(r11, r10)
        L_0x013c:
            int r9 = r9 + 1
            goto L_0x00ca
        L_0x013f:
            boolean r3 = r0.f1721k
            if (r3 == 0) goto L_0x01dc
            androidx.recyclerview.widget.b r3 = r14.e
            int r3 = r3.h()
            r4 = r2
        L_0x014a:
            if (r4 >= r3) goto L_0x0167
            androidx.recyclerview.widget.b r9 = r14.e
            android.view.View r9 = r9.g(r4)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = I(r9)
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0164
            int r10 = r9.f1634d
            if (r10 != r8) goto L_0x0164
            int r10 = r9.f1633c
            r9.f1634d = r10
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x014a
        L_0x0167:
            boolean r3 = r0.f1716f
            r0.f1716f = r2
            androidx.recyclerview.widget.RecyclerView$l r4 = r14.f1606l
            androidx.recyclerview.widget.RecyclerView$s r8 = r14.f1587b
            r4.e0(r8, r0)
            r0.f1716f = r3
            r3 = r2
        L_0x0175:
            androidx.recyclerview.widget.b r4 = r14.e
            int r4 = r4.e()
            if (r3 >= r4) goto L_0x01dc
            androidx.recyclerview.widget.b r4 = r14.e
            android.view.View r4 = r4.d(r3)
            androidx.recyclerview.widget.RecyclerView$a0 r4 = I(r4)
            boolean r8 = r4.o()
            if (r8 == 0) goto L_0x018e
            goto L_0x01d9
        L_0x018e:
            java.lang.Object r8 = r7.getOrDefault(r4, r5)
            androidx.recyclerview.widget.d0$a r8 = (androidx.recyclerview.widget.d0.a) r8
            if (r8 == 0) goto L_0x019e
            int r8 = r8.f1800a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x019e
            r8 = r1
            goto L_0x019f
        L_0x019e:
            r8 = r2
        L_0x019f:
            if (r8 != 0) goto L_0x01d9
            androidx.recyclerview.widget.RecyclerView.i.b(r4)
            int r8 = r4.f1639j
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01ac
            r8 = r1
            goto L_0x01ad
        L_0x01ac:
            r8 = r2
        L_0x01ad:
            androidx.recyclerview.widget.RecyclerView$i r9 = r14.K
            r4.d()
            r9.getClass()
            androidx.recyclerview.widget.RecyclerView$i$c r9 = new androidx.recyclerview.widget.RecyclerView$i$c
            r9.<init>()
            r9.a(r4)
            if (r8 == 0) goto L_0x01c3
            r14.U(r4, r9)
            goto L_0x01d9
        L_0x01c3:
            java.lang.Object r8 = r7.getOrDefault(r4, r5)
            androidx.recyclerview.widget.d0$a r8 = (androidx.recyclerview.widget.d0.a) r8
            if (r8 != 0) goto L_0x01d2
            androidx.recyclerview.widget.d0$a r8 = androidx.recyclerview.widget.d0.a.a()
            r7.put(r4, r8)
        L_0x01d2:
            int r4 = r8.f1800a
            r4 = r4 | r6
            r8.f1800a = r4
            r8.f1801b = r9
        L_0x01d9:
            int r3 = r3 + 1
            goto L_0x0175
        L_0x01dc:
            r14.j()
            r14.P(r1)
            r14.d0(r2)
            r0.f1715d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        c0();
        O();
        x xVar = this.f1595f0;
        xVar.a(6);
        this.f1591d.c();
        xVar.e = this.f1604k.c();
        xVar.f1714c = 0;
        if (this.f1589c != null) {
            d dVar = this.f1604k;
            int b9 = s.g.b(dVar.f1651c);
            if (b9 == 1 ? dVar.c() > 0 : b9 != 2) {
                Parcelable parcelable = this.f1589c.f1698h;
                if (parcelable != null) {
                    this.f1606l.g0(parcelable);
                }
                this.f1589c = null;
            }
        }
        xVar.f1717g = false;
        this.f1606l.e0(this.f1587b, xVar);
        xVar.f1716f = false;
        xVar.f1720j = xVar.f1720j && this.K != null;
        xVar.f1715d = 4;
        P(true);
        d0(false);
    }

    public final boolean r(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return getScrollingChildHelper().c(i8, i9, iArr, iArr2, i10);
    }

    public final void removeDetachedView(View view, boolean z8) {
        a0 I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f1639j &= -257;
            } else if (!I2.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        n(view);
        super.removeDetachedView(view, z8);
    }

    public final void requestChildFocus(View view, View view2) {
        w wVar = this.f1606l.e;
        boolean z8 = true;
        if (!(wVar != null && wVar.e) && !K()) {
            z8 = false;
        }
        if (!z8 && view2 != null) {
            V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.f1606l.o0(this, view, rect, z8, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        ArrayList<p> arrayList = this.f1614p;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).c();
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    public final void requestLayout() {
        if (this.f1622u != 0 || this.w) {
            this.f1623v = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        getScrollingChildHelper().e(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public final void scrollBy(int i8, int i9) {
        l lVar = this.f1606l;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.w) {
            boolean d9 = lVar.d();
            boolean e4 = this.f1606l.e();
            if (d9 || e4) {
                if (!d9) {
                    i8 = 0;
                }
                if (!e4) {
                    i9 = 0;
                }
                X(i8, i9, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i8, int i9) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i8 = 0;
        if (K()) {
            int a9 = accessibilityEvent != null ? k0.b.a(accessibilityEvent) : 0;
            if (a9 != 0) {
                i8 = a9;
            }
            this.y |= i8;
            i8 = 1;
        }
        if (i8 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(x xVar) {
        this.f1609m0 = xVar;
        j0.x.i(this, xVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.f1604k;
        u uVar = this.f1585a;
        if (dVar2 != null) {
            dVar2.f1649a.unregisterObserver(uVar);
            this.f1604k.h(this);
        }
        i iVar = this.K;
        if (iVar != null) {
            iVar.e();
        }
        l lVar = this.f1606l;
        s sVar = this.f1587b;
        if (lVar != null) {
            lVar.k0(sVar);
            this.f1606l.l0(sVar);
        }
        sVar.f1690a.clear();
        sVar.d();
        a aVar = this.f1591d;
        aVar.l(aVar.f1769b);
        aVar.l(aVar.f1770c);
        d dVar3 = this.f1604k;
        this.f1604k = dVar;
        if (dVar != null) {
            dVar.f1649a.registerObserver(uVar);
            dVar.e(this);
        }
        l lVar2 = this.f1606l;
        if (lVar2 != null) {
            lVar2.S();
        }
        d dVar4 = this.f1604k;
        sVar.f1690a.clear();
        sVar.d();
        r c9 = sVar.c();
        if (dVar3 != null) {
            c9.f1685b--;
        }
        if (c9.f1685b == 0) {
            int i8 = 0;
            while (true) {
                SparseArray<r.a> sparseArray = c9.f1684a;
                if (i8 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i8).f1686a.clear();
                i8++;
            }
        }
        if (dVar4 != null) {
            c9.f1685b++;
        }
        this.f1595f0.f1716f = true;
        T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z8) {
        if (z8 != this.f1596g) {
            this.J = null;
            this.H = null;
            this.I = null;
            this.G = null;
        }
        this.f1596g = z8;
        super.setClipToPadding(z8);
        if (this.f1620t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        hVar.getClass();
        this.F = hVar;
        this.J = null;
        this.H = null;
        this.I = null;
        this.G = null;
    }

    public void setHasFixedSize(boolean z8) {
        this.f1619s = z8;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.K;
        if (iVar2 != null) {
            iVar2.e();
            this.K.f1652a = null;
        }
        this.K = iVar;
        if (iVar != null) {
            iVar.f1652a = this.f1605k0;
        }
    }

    public void setItemViewCacheSize(int i8) {
        s sVar = this.f1587b;
        sVar.e = i8;
        sVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(l lVar) {
        b.C0016b bVar;
        RecyclerView recyclerView;
        w wVar;
        if (lVar != this.f1606l) {
            int i8 = 0;
            setScrollState(0);
            z zVar = this.f1590c0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1727h.abortAnimation();
            l lVar2 = this.f1606l;
            if (!(lVar2 == null || (wVar = lVar2.e) == null)) {
                wVar.d();
            }
            l lVar3 = this.f1606l;
            s sVar = this.f1587b;
            if (lVar3 != null) {
                i iVar = this.K;
                if (iVar != null) {
                    iVar.e();
                }
                this.f1606l.k0(sVar);
                this.f1606l.l0(sVar);
                sVar.f1690a.clear();
                sVar.d();
                if (this.r) {
                    l lVar4 = this.f1606l;
                    lVar4.f1665g = false;
                    lVar4.T(this);
                }
                this.f1606l.x0((RecyclerView) null);
                this.f1606l = null;
            } else {
                sVar.f1690a.clear();
                sVar.d();
            }
            b bVar2 = this.e;
            bVar2.f1782b.g();
            ArrayList arrayList = bVar2.f1783c;
            int size = arrayList.size();
            while (true) {
                size--;
                bVar = bVar2.f1781a;
                if (size < 0) {
                    break;
                }
                v vVar = (v) bVar;
                vVar.getClass();
                a0 I2 = I((View) arrayList.get(size));
                if (I2 != null) {
                    int i9 = I2.f1645p;
                    RecyclerView recyclerView2 = vVar.f1910a;
                    if (recyclerView2.K()) {
                        I2.f1646q = i9;
                        recyclerView2.s0.add(I2);
                    } else {
                        int[] iArr = j0.x.f4957a;
                        x.c.s(I2.f1631a, i9);
                    }
                    I2.f1645p = 0;
                }
                arrayList.remove(size);
            }
            v vVar2 = (v) bVar;
            int a9 = vVar2.a();
            while (true) {
                recyclerView = vVar2.f1910a;
                if (i8 >= a9) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i8);
                recyclerView.n(childAt);
                childAt.clearAnimation();
                i8++;
            }
            recyclerView.removeAllViews();
            this.f1606l = lVar;
            if (lVar != null) {
                if (lVar.f1661b == null) {
                    lVar.x0(this);
                    if (this.r) {
                        this.f1606l.f1665g = true;
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + lVar + " is already attached to a RecyclerView:" + lVar.f1661b.y());
                }
            }
            sVar.k();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z8) {
        j0.l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4951d) {
            int[] iArr = j0.x.f4957a;
            x.h.z(scrollingChildHelper.f4950c);
        }
        scrollingChildHelper.f4951d = z8;
    }

    public void setOnFlingListener(o oVar) {
        this.T = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f1597g0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.f1588b0 = z8;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f1587b;
        r rVar2 = sVar.f1695g;
        if (rVar2 != null) {
            rVar2.f1685b--;
        }
        sVar.f1695g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f1695g.f1685b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.f1608m = tVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i8) {
        w wVar;
        if (i8 != this.L) {
            this.L = i8;
            if (i8 != 2) {
                z zVar = this.f1590c0;
                RecyclerView.this.removeCallbacks(zVar);
                zVar.f1727h.abortAnimation();
                l lVar = this.f1606l;
                if (!(lVar == null || (wVar = lVar.e) == null)) {
                    wVar.d();
                }
            }
            l lVar2 = this.f1606l;
            if (lVar2 != null) {
                lVar2.i0(i8);
            }
            q qVar = this.f1597g0;
            if (qVar != null) {
                qVar.a(i8, this);
            }
            ArrayList arrayList = this.f1599h0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((q) this.f1599h0.get(size)).a(i8, this);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i8) {
        int i9;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i8 != 0) {
            if (i8 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i8 + "; using default value");
            } else {
                i9 = viewConfiguration.getScaledPagingTouchSlop();
                this.S = i9;
            }
        }
        i9 = viewConfiguration.getScaledTouchSlop();
        this.S = i9;
    }

    public void setViewCacheExtension(y yVar) {
        this.f1587b.getClass();
    }

    public final boolean startNestedScroll(int i8) {
        return getScrollingChildHelper().g(i8, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z8) {
        w wVar;
        if (z8 != this.w) {
            h("Do not suppressLayout in layout or scroll");
            if (!z8) {
                this.w = false;
                if (!(!this.f1623v || this.f1606l == null || this.f1604k == null)) {
                    requestLayout();
                }
                this.f1623v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.w = true;
            this.f1626x = true;
            setScrollState(0);
            z zVar = this.f1590c0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f1727h.abortAnimation();
            l lVar = this.f1606l;
            if (lVar != null && (wVar = lVar.e) != null) {
                wVar.d();
            }
        }
    }

    public final void t(int i8, int i9) {
        this.E++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i8, scrollY - i9);
        q qVar = this.f1597g0;
        if (qVar != null) {
            qVar.b(this, i8, i9);
        }
        ArrayList arrayList = this.f1599h0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((q) this.f1599h0.get(size)).b(this, i8, i9);
            }
        }
        this.E--;
    }

    public final void u() {
        if (this.J == null) {
            this.F.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.J = edgeEffect;
            if (this.f1596g) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void v() {
        if (this.G == null) {
            this.F.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.G = edgeEffect;
            if (this.f1596g) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void w() {
        if (this.I == null) {
            this.F.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.I = edgeEffect;
            if (this.f1596g) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.H == null) {
            this.F.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.H = edgeEffect;
            if (this.f1596g) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1604k + ", layout:" + this.f1606l + ", context:" + getContext();
    }

    public final void z(x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1590c0.f1727h;
            overScroller.getFinalX();
            overScroller.getCurrX();
            xVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        xVar.getClass();
    }
}
