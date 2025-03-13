package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class b0 extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a0 f1786q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, Context context) {
        super(context);
        this.f1786q = a0Var;
    }

    public final void c(View view, RecyclerView.w.a aVar) {
        a0 a0Var = this.f1786q;
        RecyclerView recyclerView = a0Var.f1776a;
        if (recyclerView != null) {
            int[] b9 = a0Var.b(recyclerView.getLayoutManager(), view);
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
    }

    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
