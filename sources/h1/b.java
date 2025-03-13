package h1;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import j0.d0;
import j0.p;
import j0.x;

public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f4737a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f4738b;

    public b(ViewPager viewPager) {
        this.f4738b = viewPager;
    }

    public final d0 a(View view, d0 d0Var) {
        d0 e = x.e(view, d0Var);
        if (e.f4933a.j()) {
            return e;
        }
        int b9 = e.b();
        Rect rect = this.f4737a;
        rect.left = b9;
        rect.top = e.d();
        rect.right = e.c();
        rect.bottom = e.a();
        ViewPager viewPager = this.f4738b;
        int childCount = viewPager.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            d0 a9 = x.a(viewPager.getChildAt(i8), e);
            rect.left = Math.min(a9.b(), rect.left);
            rect.top = Math.min(a9.d(), rect.top);
            rect.right = Math.min(a9.c(), rect.right);
            rect.bottom = Math.min(a9.a(), rect.bottom);
        }
        int i9 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        d0.c cVar = new d0.c(e);
        cVar.d(c0.b.a(i9, i10, i11, i12));
        return cVar.b();
    }
}
