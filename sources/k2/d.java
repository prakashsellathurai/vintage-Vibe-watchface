package k2;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k3.j;
import y1.f;

public final class d extends a implements Choreographer.FrameCallback {

    /* renamed from: h  reason: collision with root package name */
    public float f5107h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5108i = false;

    /* renamed from: j  reason: collision with root package name */
    public long f5109j = 0;

    /* renamed from: k  reason: collision with root package name */
    public float f5110k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f5111l = 0;

    /* renamed from: m  reason: collision with root package name */
    public float f5112m = -2.14748365E9f;

    /* renamed from: n  reason: collision with root package name */
    public float f5113n = 2.14748365E9f;

    /* renamed from: o  reason: collision with root package name */
    public f f5114o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5115p = false;

    public final float b() {
        f fVar = this.f5114o;
        if (fVar == null) {
            return 0.0f;
        }
        float f9 = this.f5113n;
        return f9 == 2.14748365E9f ? fVar.f8229l : f9;
    }

    public final float c() {
        f fVar = this.f5114o;
        if (fVar == null) {
            return 0.0f;
        }
        float f9 = this.f5112m;
        return f9 == -2.14748365E9f ? fVar.f8228k : f9;
    }

    public final void cancel() {
        Iterator it = this.f5104g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(true);
    }

    public final boolean d() {
        return this.f5107h < 0.0f;
    }

    public final void doFrame(long j8) {
        if (this.f5115p) {
            e(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        f fVar = this.f5114o;
        if (fVar != null && this.f5115p) {
            long j9 = this.f5109j;
            long j10 = 0;
            if (j9 != 0) {
                j10 = j8 - j9;
            }
            float abs = ((float) j10) / ((1.0E9f / fVar.f8230m) / Math.abs(this.f5107h));
            float f9 = this.f5110k;
            if (d()) {
                abs = -abs;
            }
            float f10 = f9 + abs;
            this.f5110k = f10;
            float c9 = c();
            float b9 = b();
            PointF pointF = f.f5117a;
            boolean z8 = !(f10 >= c9 && f10 <= b9);
            this.f5110k = f.b(this.f5110k, c(), b());
            this.f5109j = j8;
            a();
            if (z8) {
                int repeatCount = getRepeatCount();
                CopyOnWriteArraySet copyOnWriteArraySet = this.f5104g;
                if (repeatCount == -1 || this.f5111l < getRepeatCount()) {
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f5111l++;
                    if (getRepeatMode() == 2) {
                        this.f5108i = !this.f5108i;
                        this.f5107h = -this.f5107h;
                    } else {
                        this.f5110k = d() ? b() : c();
                    }
                    this.f5109j = j8;
                } else {
                    this.f5110k = this.f5107h < 0.0f ? c() : b();
                    e(true);
                    boolean d9 = d();
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        ((Animator.AnimatorListener) it2.next()).onAnimationEnd(this, d9);
                    }
                }
            }
            if (this.f5114o != null) {
                float f11 = this.f5110k;
                if (f11 < this.f5112m || f11 > this.f5113n) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f5112m), Float.valueOf(this.f5113n), Float.valueOf(this.f5110k)}));
                }
            }
            j.s();
        }
    }

    public final void e(boolean z8) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z8) {
            this.f5115p = false;
        }
    }

    public final void f(float f9) {
        if (this.f5110k != f9) {
            this.f5110k = f.b(f9, c(), b());
            this.f5109j = 0;
            a();
        }
    }

    public final void g(float f9, float f10) {
        if (f9 <= f10) {
            f fVar = this.f5114o;
            float f11 = fVar == null ? -3.4028235E38f : fVar.f8228k;
            float f12 = fVar == null ? Float.MAX_VALUE : fVar.f8229l;
            this.f5112m = f.b(f9, f11, f12);
            this.f5113n = f.b(f10, f11, f12);
            f((float) ((int) f.b(this.f5110k, f9, f10)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f9), Float.valueOf(f10)}));
    }

    public final float getAnimatedFraction() {
        float f9;
        float c9;
        if (this.f5114o == null) {
            return 0.0f;
        }
        if (d()) {
            f9 = b();
            c9 = this.f5110k;
        } else {
            f9 = this.f5110k;
            c9 = c();
        }
        return (f9 - c9) / (b() - c());
    }

    public final Object getAnimatedValue() {
        float f9;
        f fVar = this.f5114o;
        if (fVar == null) {
            f9 = 0.0f;
        } else {
            float f10 = this.f5110k;
            float f11 = fVar.f8228k;
            f9 = (f10 - f11) / (fVar.f8229l - f11);
        }
        return Float.valueOf(f9);
    }

    public final long getDuration() {
        f fVar = this.f5114o;
        if (fVar == null) {
            return 0;
        }
        return (long) fVar.b();
    }

    public final boolean isRunning() {
        return this.f5115p;
    }

    public final void setRepeatMode(int i8) {
        super.setRepeatMode(i8);
        if (i8 != 2 && this.f5108i) {
            this.f5108i = false;
            this.f5107h = -this.f5107h;
        }
    }
}
