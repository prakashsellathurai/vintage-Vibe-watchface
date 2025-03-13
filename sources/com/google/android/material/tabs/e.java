package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.samsung.android.wearable.watchfacestudio.editor.w;
import java.lang.ref.WeakReference;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f3429a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f3430b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3431c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.d<?> f3432d;
    public boolean e;

    public class a extends RecyclerView.f {
        public a() {
        }

        public final void a() {
            e.this.a();
        }
    }

    public interface b {
    }

    public static class c extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f3434a;

        /* renamed from: b  reason: collision with root package name */
        public int f3435b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f3436c = 0;

        public c(TabLayout tabLayout) {
            this.f3434a = new WeakReference<>(tabLayout);
        }

        public final void a(int i8) {
            this.f3435b = this.f3436c;
            this.f3436c = i8;
        }

        public final void b(float f9, int i8, int i9) {
            TabLayout tabLayout = this.f3434a.get();
            if (tabLayout != null) {
                int i10 = this.f3436c;
                boolean z8 = false;
                boolean z9 = i10 != 2 || this.f3435b == 1;
                if (!(i10 == 2 && this.f3435b == 0)) {
                    z8 = true;
                }
                tabLayout.k(i8, f9, z9, z8);
            }
        }

        public final void c(int i8) {
            TabLayout tabLayout = this.f3434a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8 && i8 < tabLayout.getTabCount()) {
                int i9 = this.f3436c;
                tabLayout.j(tabLayout.g(i8), i9 == 0 || (i9 == 2 && this.f3435b == 0));
            }
        }
    }

    public static class d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f3437a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3438b;

        public d(ViewPager2 viewPager2, boolean z8) {
            this.f3437a = viewPager2;
            this.f3438b = z8;
        }

        public final void a() {
        }

        public final void b() {
        }

        public final void c(TabLayout.f fVar) {
            int i8 = fVar.f3402d;
            ViewPager2 viewPager2 = this.f3437a;
            if (!((androidx.viewpager2.widget.c) viewPager2.f2000n.f1189b).f2031m) {
                viewPager2.b(i8, this.f3438b);
                return;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
    }

    public e(TabLayout tabLayout, ViewPager2 viewPager2, androidx.health.services.client.impl.d dVar) {
        this.f3429a = tabLayout;
        this.f3430b = viewPager2;
        this.f3431c = dVar;
    }

    public final void a() {
        int min;
        TabLayout tabLayout = this.f3429a;
        tabLayout.i();
        RecyclerView.d<?> dVar = this.f3432d;
        if (dVar != null) {
            int c9 = dVar.c();
            for (int i8 = 0; i8 < c9; i8++) {
                TabLayout.f h8 = tabLayout.h();
                ((androidx.health.services.client.impl.d) this.f3431c).getClass();
                int i9 = w.A0;
                tabLayout.a(h8, false);
            }
            if (c9 > 0 && (min = Math.min(this.f3430b.getCurrentItem(), tabLayout.getTabCount() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.j(tabLayout.g(min), true);
            }
        }
    }
}
