package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class y {
    public static int a(RecyclerView.x xVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z8) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return Math.abs(RecyclerView.l.H(view) - RecyclerView.l.H(view2)) + 1;
        }
        return Math.min(tVar.l(), tVar.b(view2) - tVar.e(view));
    }

    public static int b(RecyclerView.x xVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z8, boolean z9) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z9 ? Math.max(0, (xVar.b() - Math.max(RecyclerView.l.H(view), RecyclerView.l.H(view2))) - 1) : Math.max(0, Math.min(RecyclerView.l.H(view), RecyclerView.l.H(view2)));
        if (!z8) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(RecyclerView.l.H(view) - RecyclerView.l.H(view2)) + 1)))) + ((float) (tVar.k() - tVar.e(view))));
    }

    public static int c(RecyclerView.x xVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z8) {
        if (lVar.w() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return xVar.b();
        }
        return (int) ((((float) (tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(RecyclerView.l.H(view) - RecyclerView.l.H(view2)) + 1))) * ((float) xVar.b()));
    }
}
