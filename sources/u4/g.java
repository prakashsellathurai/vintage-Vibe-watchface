package u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f7770a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f7771b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Animator.AnimatorListener f7772c = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f7771b == animator) {
                gVar.f7771b = null;
            }
        }
    }

    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7772c);
        this.f7770a.add(bVar);
    }
}
