package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.l;

public final class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1159b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.a f1160c;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f fVar = f.this;
            fVar.f1158a.endViewTransition(fVar.f1159b);
            fVar.f1160c.a();
        }
    }

    public f(View view, ViewGroup viewGroup, l.a aVar) {
        this.f1158a = viewGroup;
        this.f1159b = view;
        this.f1160c = aVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1158a.post(new a());
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
