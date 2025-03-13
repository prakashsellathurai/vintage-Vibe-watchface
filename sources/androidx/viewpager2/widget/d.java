package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2035a;

    public d(ViewPager2 viewPager2) {
        this.f2035a = viewPager2;
    }

    public final void a(int i8) {
        if (i8 == 0) {
            this.f2035a.c();
        }
    }

    public final void c(int i8) {
        ViewPager2 viewPager2 = this.f2035a;
        if (viewPager2.f1991d != i8) {
            viewPager2.f1991d = i8;
            viewPager2.f2005t.b();
        }
    }
}
