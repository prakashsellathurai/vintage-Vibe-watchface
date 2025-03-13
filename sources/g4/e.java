package g4;

import android.view.View;
import j0.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f4618a;

    /* renamed from: b  reason: collision with root package name */
    public int f4619b;

    /* renamed from: c  reason: collision with root package name */
    public int f4620c;

    /* renamed from: d  reason: collision with root package name */
    public int f4621d;

    public e(View view) {
        this.f4618a = view;
    }

    public final void a() {
        int i8 = this.f4621d;
        View view = this.f4618a;
        int top = i8 - (view.getTop() - this.f4619b);
        int[] iArr = x.f4957a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f4620c));
    }
}
