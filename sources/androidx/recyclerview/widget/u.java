package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class u extends a0 {

    /* renamed from: d  reason: collision with root package name */
    public s f1908d;
    public r e;

    public class a extends o {
        public a(Context context) {
            super(context);
        }

        public final void c(View view, RecyclerView.w.a aVar) {
            u uVar = u.this;
            int[] b9 = uVar.b(uVar.f1776a.getLayoutManager(), view);
            int i8 = b9[0];
            int i9 = b9[1];
            int g9 = g(Math.max(Math.abs(i8), Math.abs(i9)));
            if (g9 > 0) {
                DecelerateInterpolator decelerateInterpolator = this.f1896j;
                aVar.f1706a = i8;
                aVar.f1707b = i9;
                aVar.f1708c = g9;
                aVar.e = decelerateInterpolator;
                aVar.f1710f = true;
            }
        }

        public final float f(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public final int h(int i8) {
            return Math.min(100, super.h(i8));
        }
    }

    public final int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.d()) {
            iArr[0] = g(view, i(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.e()) {
            iArr[1] = g(view, j(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final RecyclerView.w c(RecyclerView.l lVar) {
        if (!(lVar instanceof RecyclerView.w.b)) {
            return null;
        }
        return new a(this.f1776a.getContext());
    }

    public View d(RecyclerView.l lVar) {
        t i8;
        if (lVar.e()) {
            i8 = j(lVar);
        } else if (!lVar.d()) {
            return null;
        } else {
            i8 = i(lVar);
        }
        return h(lVar, i8);
    }

    public final int e(RecyclerView.l lVar, int i8, int i9) {
        PointF a9;
        int A = lVar.A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        t j8 = lVar.e() ? j(lVar) : lVar.d() ? i(lVar) : null;
        if (j8 == null) {
            return -1;
        }
        int w = lVar.w();
        boolean z8 = false;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < w; i12++) {
            View v8 = lVar.v(i12);
            if (v8 != null) {
                int g9 = g(v8, j8);
                if (g9 <= 0 && g9 > i11) {
                    view2 = v8;
                    i11 = g9;
                }
                if (g9 >= 0 && g9 < i10) {
                    view = v8;
                    i10 = g9;
                }
            }
        }
        int i13 = 1;
        boolean z9 = !lVar.d() ? i9 > 0 : i8 > 0;
        if (z9 && view != null) {
            return RecyclerView.l.H(view);
        }
        if (!z9 && view2 != null) {
            return RecyclerView.l.H(view2);
        }
        if (z9) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int H = RecyclerView.l.H(view);
        int A2 = lVar.A();
        if ((lVar instanceof RecyclerView.w.b) && (a9 = ((RecyclerView.w.b) lVar).a(A2 - 1)) != null && (a9.x < 0.0f || a9.y < 0.0f)) {
            z8 = true;
        }
        if (z8 == z9) {
            i13 = -1;
        }
        int i14 = H + i13;
        if (i14 < 0 || i14 >= A) {
            return -1;
        }
        return i14;
    }

    public final int g(View view, t tVar) {
        return (tVar.e(view) + (tVar.c(view) / 2)) - (tVar.k() + (tVar.l() / 2));
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
        s sVar = this.f1908d;
        if (sVar == null || sVar.f1905a != lVar) {
            this.f1908d = new s(lVar);
        }
        return this.f1908d;
    }
}
