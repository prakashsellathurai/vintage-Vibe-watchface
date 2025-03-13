package u5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import u5.d;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.b f7803a;

    public g(d.b bVar) {
        this.f7803a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        d.b bVar = this.f7803a;
        bVar.f7795b = false;
        Iterator it = d.this.f7786a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }
}
