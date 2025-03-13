package androidx.viewpager2.adapter;

public final class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f1984f;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f1984f = fragmentStateAdapter;
    }

    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f1984f;
        fragmentStateAdapter.f1966j = false;
        fragmentStateAdapter.n();
    }
}
