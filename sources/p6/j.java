package p6;

import a1.a;
import android.animation.Keyframe;
import android.os.SystemClock;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import w5.f;

public abstract class j extends c {
    public Keyframe[] r;

    public j(g gVar, LinearInterpolator linearInterpolator, int i8, int i9) {
        super(gVar, 30.0f, linearInterpolator, 0, i8, i9);
    }

    public final void c() {
        float f9;
        a aVar = (a) this;
        aVar.r = new Keyframe[3];
        float d9 = aVar.f6339h.d();
        if (d9 > 360.0f) {
            d9 -= 360.0f;
        }
        aVar.r[0] = Keyframe.ofFloat(0.0f, d9);
        if (aVar.e == 2) {
            f9 = d9 + 180.0f;
            if (d9 > 180.0f) {
                aVar.r[1] = Keyframe.ofFloat((360.0f - d9) / 180.0f, 360.0f);
                f9 -= 360.0f;
            } else {
                aVar.r[1] = Keyframe.ofFloat(0.5f, d9 + ((f9 - d9) / 2.0f));
            }
        } else {
            float f10 = d9 - 180.0f;
            if (d9 < 180.0f) {
                aVar.r[1] = Keyframe.ofFloat(1.0f - ((180.0f - d9) / 180.0f), 0.0f);
            } else {
                aVar.r[1] = Keyframe.ofFloat(0.5f, d9 + ((f10 - d9) / 2.0f));
            }
            f9 = f10;
        }
        aVar.r[2] = Keyframe.ofFloat(1.0f, f9);
        super.c();
        this.f6347p = this.f6348q - SystemClock.elapsedRealtime();
    }

    public final void j(float f9) {
        f fVar;
        Keyframe[] keyframeArr = this.r;
        if (keyframeArr == null || keyframeArr.length < 2) {
            Log.w("DWF:KeyframeAnimation", "No key frames were initialized");
            fVar = this.f6339h;
        } else {
            float k8 = a.k(f9, 0.0f, 1.0f);
            int i8 = 0;
            for (Keyframe fraction : this.r) {
                if (fraction.getFraction() < k8) {
                    i8++;
                }
            }
            if (i8 > 0) {
                i8--;
            }
            int i9 = i8 + 1;
            float fraction2 = this.r[i8].getFraction();
            float fraction3 = this.r[i9].getFraction();
            float f10 = fraction3 - k8;
            float f11 = fraction3 - fraction2;
            fVar = new f((((Float) this.r[i8].getValue()).floatValue() * (f10 / f11)) + (((Float) this.r[i9].getValue()).floatValue() * ((k8 - fraction2) / f11)));
        }
        i(fVar);
    }
}
