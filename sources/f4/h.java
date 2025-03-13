package f4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f4404a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f4405b = 300;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f4406c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f4407d = 0;
    public int e = 1;

    public h(long j8) {
        this.f4404a = j8;
        this.f4405b = 150;
    }

    public h(long j8, long j9, TimeInterpolator timeInterpolator) {
        this.f4404a = j8;
        this.f4405b = j9;
        this.f4406c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f4404a);
        animator.setDuration(this.f4405b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4407d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4406c;
        return timeInterpolator != null ? timeInterpolator : a.f4392b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4404a == hVar.f4404a && this.f4405b == hVar.f4405b && this.f4407d == hVar.f4407d && this.e == hVar.e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f4404a;
        long j9 = this.f4405b;
        return (((((((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) ((j9 >>> 32) ^ j9))) * 31) + b().getClass().hashCode()) * 31) + this.f4407d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4404a + " duration: " + this.f4405b + " interpolator: " + b().getClass() + " repeatCount: " + this.f4407d + " repeatMode: " + this.e + "}\n";
    }
}
