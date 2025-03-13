package l5;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class b extends RecyclerView.d<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final View.OnTouchListener f5317d;

    public static class a extends RecyclerView.a0 {
        public a(View view) {
            super(view);
        }
    }

    public b(View.OnTouchListener onTouchListener) {
        this.f5317d = onTouchListener;
    }

    public final int c() {
        return 1;
    }

    public final void f(RecyclerView.a0 a0Var, int i8) {
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setOnTouchListener(this.f5317d);
        return new a(view);
    }
}
