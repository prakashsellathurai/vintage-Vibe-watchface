package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

public final class e extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2036a;

    public e(ViewPager2 viewPager2) {
        this.f2036a = viewPager2;
    }

    public final void c(int i8) {
        ViewPager2 viewPager2 = this.f2036a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f1996j.requestFocus(2);
        }
    }
}
