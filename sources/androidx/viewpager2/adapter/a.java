package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f1978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f1979b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f1980c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f1980c = fragmentStateAdapter;
        this.f1978a = frameLayout;
        this.f1979b = fVar;
    }

    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        FrameLayout frameLayout = this.f1978a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f1980c.p(this.f1979b);
        }
    }
}
