package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class p extends a0 {

    /* renamed from: d  reason: collision with root package name */
    public s f1903d;
    public r e;

    public final int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.d()) {
            t i8 = i(lVar);
            iArr[0] = (i8.e(view) + (i8.c(view) / 2)) - (i8.k() + (i8.l() / 2));
        } else {
            iArr[0] = 0;
        }
        if (lVar.e()) {
            t j8 = j(lVar);
            iArr[1] = (j8.e(view) + (j8.c(view) / 2)) - (j8.k() + (j8.l() / 2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final View d(RecyclerView.l lVar) {
        t tVar;
        if (lVar.e()) {
            tVar = j(lVar);
        } else if (!lVar.d()) {
            return null;
        } else {
            tVar = i(lVar);
        }
        return h(lVar, tVar);
    }

    public final int e(RecyclerView.l lVar, int i8, int i9) {
        int A;
        View d9;
        int H;
        int i10;
        PointF a9;
        int i11;
        int i12;
        if (!(lVar instanceof RecyclerView.w.b) || (A = lVar.A()) == 0 || (d9 = d(lVar)) == null || (H = RecyclerView.l.H(d9)) == -1 || (a9 = ((RecyclerView.w.b) lVar).a(i10)) == null) {
            return -1;
        }
        int i13 = 0;
        if (lVar.d()) {
            i11 = g(lVar, i(lVar), i8, 0);
            if (a9.x < 0.0f) {
                i11 = -i11;
            }
        } else {
            i11 = 0;
        }
        if (lVar.e()) {
            i12 = g(lVar, j(lVar), 0, i9);
            if (a9.y < 0.0f) {
                i12 = -i12;
            }
        } else {
            i12 = 0;
        }
        if (lVar.e()) {
            i11 = i12;
        }
        if (i11 == 0) {
            return -1;
        }
        int i14 = H + i11;
        if (i14 >= 0) {
            i13 = i14;
        }
        return i13 >= A ? A - 1 : i13;
    }

    public final int g(RecyclerView.l lVar, t tVar, int i8, int i9) {
        int max;
        this.f1777b.fling(0, 0, i8, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f1777b.getFinalX(), this.f1777b.getFinalY()};
        int w = lVar.w();
        float f9 = 1.0f;
        if (w != 0) {
            View view = null;
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i12 = 0; i12 < w; i12++) {
                View v8 = lVar.v(i12);
                int H = RecyclerView.l.H(v8);
                if (H != -1) {
                    if (H < i11) {
                        view = v8;
                        i11 = H;
                    }
                    if (H > i10) {
                        view2 = v8;
                        i10 = H;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(tVar.b(view), tVar.b(view2)) - Math.min(tVar.e(view), tVar.e(view2))) == 0)) {
                f9 = (((float) max) * 1.0f) / ((float) ((i10 - i11) + 1));
            }
        }
        if (f9 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f9);
    }

    public final View h(RecyclerView.l lVar, t tVar) {
        int w = lVar.w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int k8 = tVar.k() + (tVar.l() / 2);
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < w; i9++) {
            View v8 = lVar.v(i9);
            int abs = Math.abs((tVar.e(v8) + (tVar.c(v8) / 2)) - k8);
            if (abs < i8) {
                view = v8;
                i8 = abs;
            }
        }
        return view;
    }

    public final t i(RecyclerView.l lVar) {
        r rVar = this.e;
        if (rVar == null || rVar.f1905a != lVar) {
            this.e = new r(lVar);
        }
        return this.e;
    }

    public final t j(RecyclerView.l lVar) {
        s sVar = this.f1903d;
        if (sVar == null || sVar.f1905a != lVar) {
            this.f1903d = new s(lVar);
        }
        return this.f1903d;
    }
}
