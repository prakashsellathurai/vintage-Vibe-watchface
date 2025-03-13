package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

public final class w implements a.C0015a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1911a;

    public w(RecyclerView recyclerView) {
        this.f1911a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i8 = bVar.f1772a;
        RecyclerView recyclerView = this.f1911a;
        if (i8 == 1) {
            recyclerView.f1606l.Z(bVar.f1773b, bVar.f1775d);
        } else if (i8 == 2) {
            recyclerView.f1606l.c0(bVar.f1773b, bVar.f1775d);
        } else if (i8 == 4) {
            recyclerView.f1606l.d0(bVar.f1773b, bVar.f1775d);
        } else if (i8 == 8) {
            recyclerView.f1606l.b0(bVar.f1773b, bVar.f1775d);
        }
    }

    public final RecyclerView.a0 b(int i8) {
        RecyclerView recyclerView = this.f1911a;
        int h8 = recyclerView.e.h();
        int i9 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i9 >= h8) {
                break;
            }
            RecyclerView.a0 I = RecyclerView.I(recyclerView.e.g(i9));
            if (I != null && !I.i() && I.f1633c == i8) {
                if (!recyclerView.e.j(I.f1631a)) {
                    a0Var = I;
                    break;
                }
                a0Var = I;
            }
            i9++;
        }
        if (a0Var != null && !recyclerView.e.j(a0Var.f1631a)) {
            return a0Var;
        }
        return null;
    }

    public final void c(int i8, int i9, Object obj) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f1911a;
        int h8 = recyclerView.e.h();
        int i12 = i9 + i8;
        for (int i13 = 0; i13 < h8; i13++) {
            View g9 = recyclerView.e.g(i13);
            RecyclerView.a0 I = RecyclerView.I(g9);
            if (I != null && !I.o() && (i11 = I.f1633c) >= i8 && i11 < i12) {
                I.b(2);
                I.a(obj);
                ((RecyclerView.m) g9.getLayoutParams()).f1682c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1587b;
        ArrayList<RecyclerView.a0> arrayList = sVar.f1692c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = arrayList.get(size);
                if (a0Var != null && (i10 = a0Var.f1633c) >= i8 && i10 < i12) {
                    a0Var.b(2);
                    sVar.e(size);
                }
            } else {
                recyclerView.f1603j0 = true;
                return;
            }
        }
    }

    public final void d(int i8, int i9) {
        RecyclerView recyclerView = this.f1911a;
        int h8 = recyclerView.e.h();
        for (int i10 = 0; i10 < h8; i10++) {
            RecyclerView.a0 I = RecyclerView.I(recyclerView.e.g(i10));
            if (I != null && !I.o() && I.f1633c >= i8) {
                I.l(i9, false);
                recyclerView.f1595f0.f1716f = true;
            }
        }
        ArrayList<RecyclerView.a0> arrayList = recyclerView.f1587b.f1692c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView.a0 a0Var = arrayList.get(i11);
            if (a0Var != null && a0Var.f1633c >= i8) {
                a0Var.l(i9, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1601i0 = true;
    }

    public final void e(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        RecyclerView recyclerView = this.f1911a;
        int h8 = recyclerView.e.h();
        int i17 = -1;
        if (i8 < i9) {
            i12 = i8;
            i11 = i9;
            i10 = -1;
        } else {
            i11 = i8;
            i12 = i9;
            i10 = 1;
        }
        for (int i18 = 0; i18 < h8; i18++) {
            RecyclerView.a0 I = RecyclerView.I(recyclerView.e.g(i18));
            if (I != null && (i16 = I.f1633c) >= i12 && i16 <= i11) {
                if (i16 == i8) {
                    I.l(i9 - i8, false);
                } else {
                    I.l(i10, false);
                }
                recyclerView.f1595f0.f1716f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1587b;
        sVar.getClass();
        if (i8 < i9) {
            i14 = i8;
            i13 = i9;
        } else {
            i13 = i8;
            i14 = i9;
            i17 = 1;
        }
        ArrayList<RecyclerView.a0> arrayList = sVar.f1692c;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            RecyclerView.a0 a0Var = arrayList.get(i19);
            if (a0Var != null && (i15 = a0Var.f1633c) >= i14 && i15 <= i13) {
                if (i15 == i8) {
                    a0Var.l(i9 - i8, false);
                } else {
                    a0Var.l(i17, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1601i0 = true;
    }
}
