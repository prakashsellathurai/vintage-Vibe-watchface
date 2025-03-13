package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f1905a;

    /* renamed from: b  reason: collision with root package name */
    public int f1906b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1907c = new Rect();

    public t(RecyclerView.l lVar) {
        this.f1905a = lVar;
    }

    public static t a(RecyclerView.l lVar, int i8) {
        if (i8 == 0) {
            return new r(lVar);
        }
        if (i8 == 1) {
            return new s(lVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f1906b) {
            return 0;
        }
        return l() - this.f1906b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i8);
}
