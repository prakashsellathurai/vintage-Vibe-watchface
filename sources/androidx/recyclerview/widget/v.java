package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

public final class v implements b.C0016b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1910a;

    public v(RecyclerView recyclerView) {
        this.f1910a = recyclerView;
    }

    public final int a() {
        return this.f1910a.getChildCount();
    }

    public final void b(int i8) {
        RecyclerView recyclerView = this.f1910a;
        View childAt = recyclerView.getChildAt(i8);
        if (childAt != null) {
            recyclerView.n(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i8);
    }
}
