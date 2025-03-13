package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j0.x;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0016b f1781a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1782b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1783c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f1784a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f1785b;

        public final void a(int i8) {
            if (i8 >= 64) {
                a aVar = this.f1785b;
                if (aVar != null) {
                    aVar.a(i8 - 64);
                    return;
                }
                return;
            }
            this.f1784a &= ~(1 << i8);
        }

        public final int b(int i8) {
            long j8;
            a aVar = this.f1785b;
            if (aVar == null) {
                if (i8 >= 64) {
                    j8 = this.f1784a;
                }
                j8 = ((1 << i8) - 1) & this.f1784a;
            } else {
                if (i8 >= 64) {
                    return aVar.b(i8 - 64) + Long.bitCount(this.f1784a);
                }
                j8 = ((1 << i8) - 1) & this.f1784a;
            }
            return Long.bitCount(j8);
        }

        public final void c() {
            if (this.f1785b == null) {
                this.f1785b = new a();
            }
        }

        public final boolean d(int i8) {
            if (i8 >= 64) {
                c();
                return this.f1785b.d(i8 - 64);
            }
            return ((1 << i8) & this.f1784a) != 0;
        }

        public final void e(int i8, boolean z8) {
            if (i8 >= 64) {
                c();
                this.f1785b.e(i8 - 64, z8);
                return;
            }
            long j8 = this.f1784a;
            boolean z9 = (Long.MIN_VALUE & j8) != 0;
            long j9 = (1 << i8) - 1;
            this.f1784a = ((j8 & (~j9)) << 1) | (j8 & j9);
            if (z8) {
                h(i8);
            } else {
                a(i8);
            }
            if (z9 || this.f1785b != null) {
                c();
                this.f1785b.e(0, z9);
            }
        }

        public final boolean f(int i8) {
            if (i8 >= 64) {
                c();
                return this.f1785b.f(i8 - 64);
            }
            long j8 = 1 << i8;
            long j9 = this.f1784a;
            boolean z8 = (j9 & j8) != 0;
            long j10 = j9 & (~j8);
            this.f1784a = j10;
            long j11 = j8 - 1;
            this.f1784a = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
            a aVar = this.f1785b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1785b.f(0);
            }
            return z8;
        }

        public final void g() {
            this.f1784a = 0;
            a aVar = this.f1785b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i8) {
            if (i8 >= 64) {
                c();
                this.f1785b.h(i8 - 64);
                return;
            }
            this.f1784a |= 1 << i8;
        }

        public final String toString() {
            if (this.f1785b == null) {
                return Long.toBinaryString(this.f1784a);
            }
            return this.f1785b.toString() + "xx" + Long.toBinaryString(this.f1784a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    public interface C0016b {
    }

    public b(v vVar) {
        this.f1781a = vVar;
    }

    public final void a(View view, int i8, boolean z8) {
        C0016b bVar = this.f1781a;
        int a9 = i8 < 0 ? ((v) bVar).a() : f(i8);
        this.f1782b.e(a9, z8);
        if (z8) {
            i(view);
        }
        RecyclerView recyclerView = ((v) bVar).f1910a;
        recyclerView.addView(view, a9);
        RecyclerView.a0 I = RecyclerView.I(view);
        RecyclerView.d dVar = recyclerView.f1604k;
        if (!(dVar == null || I == null)) {
            dVar.j(I);
        }
        ArrayList arrayList = recyclerView.A;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.n) recyclerView.A.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        C0016b bVar = this.f1781a;
        int a9 = i8 < 0 ? ((v) bVar).a() : f(i8);
        this.f1782b.e(a9, z8);
        if (z8) {
            i(view);
        }
        v vVar = (v) bVar;
        vVar.getClass();
        RecyclerView.a0 I = RecyclerView.I(view);
        RecyclerView recyclerView = vVar.f1910a;
        if (I != null) {
            if (I.k() || I.o()) {
                I.f1639j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
        }
        recyclerView.attachViewToParent(view, a9, layoutParams);
    }

    public final void c(int i8) {
        RecyclerView.a0 I;
        int f9 = f(i8);
        this.f1782b.f(f9);
        v vVar = (v) this.f1781a;
        View childAt = vVar.f1910a.getChildAt(f9);
        RecyclerView recyclerView = vVar.f1910a;
        if (!(childAt == null || (I = RecyclerView.I(childAt)) == null)) {
            if (!I.k() || I.o()) {
                I.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
        }
        recyclerView.detachViewFromParent(f9);
    }

    public final View d(int i8) {
        return ((v) this.f1781a).f1910a.getChildAt(f(i8));
    }

    public final int e() {
        return ((v) this.f1781a).a() - this.f1783c.size();
    }

    public final int f(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int a9 = ((v) this.f1781a).a();
        int i9 = i8;
        while (i9 < a9) {
            a aVar = this.f1782b;
            int b9 = i8 - (i9 - aVar.b(i9));
            if (b9 == 0) {
                while (aVar.d(i9)) {
                    i9++;
                }
                return i9;
            }
            i9 += b9;
        }
        return -1;
    }

    public final View g(int i8) {
        return ((v) this.f1781a).f1910a.getChildAt(i8);
    }

    public final int h() {
        return ((v) this.f1781a).a();
    }

    public final void i(View view) {
        this.f1783c.add(view);
        v vVar = (v) this.f1781a;
        vVar.getClass();
        RecyclerView.a0 I = RecyclerView.I(view);
        if (I != null) {
            int i8 = I.f1646q;
            View view2 = I.f1631a;
            if (i8 == -1) {
                int[] iArr = x.f4957a;
                i8 = x.c.c(view2);
            }
            I.f1645p = i8;
            RecyclerView recyclerView = vVar.f1910a;
            if (recyclerView.K()) {
                I.f1646q = 4;
                recyclerView.s0.add(I);
                return;
            }
            int[] iArr2 = x.f4957a;
            x.c.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f1783c.contains(view);
    }

    public final void k(View view) {
        if (this.f1783c.remove(view)) {
            v vVar = (v) this.f1781a;
            vVar.getClass();
            RecyclerView.a0 I = RecyclerView.I(view);
            if (I != null) {
                int i8 = I.f1645p;
                RecyclerView recyclerView = vVar.f1910a;
                if (recyclerView.K()) {
                    I.f1646q = i8;
                    recyclerView.s0.add(I);
                } else {
                    int[] iArr = x.f4957a;
                    x.c.s(I.f1631a, i8);
                }
                I.f1645p = 0;
            }
        }
    }

    public final String toString() {
        return this.f1782b.toString() + ", hidden list:" + this.f1783c.size();
    }
}
