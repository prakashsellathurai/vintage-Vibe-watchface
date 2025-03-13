package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.w {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f1895i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f1896j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f1897k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f1898l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1899m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f1900n;

    /* renamed from: o  reason: collision with root package name */
    public int f1901o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1902p = 0;

    public o(Context context) {
        this.f1898l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == -1) {
            return i10 - i8;
        }
        if (i12 == 0) {
            int i13 = i10 - i8;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i11 - i9;
            if (i14 < 0) {
                return i14;
            }
            return 0;
        } else if (i12 == 1) {
            return i11 - i9;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public void c(View view, RecyclerView.w.a aVar) {
        int i8;
        int i9;
        int i10;
        PointF pointF = this.f1897k;
        int i11 = -1;
        int i12 = 0;
        int i13 = (pointF == null || pointF.x == 0.0f) ? 0 : i10 > 0 ? 1 : -1;
        RecyclerView.l lVar = this.f1701c;
        if (lVar == null || !lVar.d()) {
            i8 = 0;
        } else {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i8 = e((view.getLeft() - RecyclerView.l.C(view)) - mVar.leftMargin, view.getRight() + RecyclerView.l.J(view) + mVar.rightMargin, lVar.E(), lVar.f1672n - lVar.F(), i13);
        }
        PointF pointF2 = this.f1897k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i11 = 0;
        } else if (i9 > 0) {
            i11 = 1;
        }
        RecyclerView.l lVar2 = this.f1701c;
        if (lVar2 != null && lVar2.e()) {
            RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
            i12 = e((view.getTop() - RecyclerView.l.L(view)) - mVar2.topMargin, view.getBottom() + RecyclerView.l.u(view) + mVar2.bottomMargin, lVar2.G(), lVar2.f1673o - lVar2.D(), i11);
        }
        int g9 = g((int) Math.sqrt((double) ((i8 * i8) + (i12 * i12))));
        if (g9 > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f1896j;
            aVar.f1706a = -i8;
            aVar.f1707b = -i12;
            aVar.f1708c = g9;
            aVar.e = decelerateInterpolator;
            aVar.f1710f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public final int g(int i8) {
        return (int) Math.ceil(((double) h(i8)) / 0.3356d);
    }

    public int h(int i8) {
        float abs = (float) Math.abs(i8);
        if (!this.f1899m) {
            this.f1900n = f(this.f1898l);
            this.f1899m = true;
        }
        return (int) Math.ceil((double) (abs * this.f1900n));
    }
}
