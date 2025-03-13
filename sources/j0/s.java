package j0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f4954a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f4955b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f4956c;

    public s(ViewGroup viewGroup, Runnable runnable) {
        this.f4954a = viewGroup;
        this.f4955b = viewGroup.getViewTreeObserver();
        this.f4956c = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            s sVar = new s(viewGroup, runnable);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(sVar);
            viewGroup.addOnAttachStateChangeListener(sVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f4955b.isAlive();
        View view = this.f4954a;
        (isAlive ? this.f4955b : view.getViewTreeObserver()).removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f4956c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4955b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4955b.isAlive();
        View view2 = this.f4954a;
        (isAlive ? this.f4955b : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
