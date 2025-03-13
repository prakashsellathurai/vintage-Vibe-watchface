package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public abstract class a0 extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f1776a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f1777b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1778c = new a();

    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1779a = false;

        public a() {
        }

        public final void a(int i8, RecyclerView recyclerView) {
            if (i8 == 0 && this.f1779a) {
                this.f1779a = false;
                a0.this.f();
            }
        }

        public final void b(RecyclerView recyclerView, int i8, int i9) {
            if (i8 != 0 || i9 != 0) {
                this.f1779a = true;
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1776a;
        if (recyclerView2 != recyclerView) {
            a aVar = this.f1778c;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1599h0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                this.f1776a.setOnFlingListener((RecyclerView.o) null);
            }
            this.f1776a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f1776a.g(aVar);
                this.f1776a.setOnFlingListener(this);
                this.f1777b = new Scroller(this.f1776a.getContext(), new DecelerateInterpolator());
                f();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.l lVar, View view);

    public RecyclerView.w c(RecyclerView.l lVar) {
        if (!(lVar instanceof RecyclerView.w.b)) {
            return null;
        }
        return new b0(this, this.f1776a.getContext());
    }

    public abstract View d(RecyclerView.l lVar);

    public abstract int e(RecyclerView.l lVar, int i8, int i9);

    public final void f() {
        RecyclerView.l layoutManager;
        View d9;
        RecyclerView recyclerView = this.f1776a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d9 = d(layoutManager)) != null) {
            int[] b9 = b(layoutManager, d9);
            int i8 = b9[0];
            if (i8 != 0 || b9[1] != 0) {
                this.f1776a.a0(i8, b9[1], false);
            }
        }
    }
}
