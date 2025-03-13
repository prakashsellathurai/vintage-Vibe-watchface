package l2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import y1.f;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f5268a;

    /* renamed from: b  reason: collision with root package name */
    public final T f5269b;

    /* renamed from: c  reason: collision with root package name */
    public T f5270c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f5271d;
    public final Interpolator e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f5272f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5273g;

    /* renamed from: h  reason: collision with root package name */
    public Float f5274h;

    /* renamed from: i  reason: collision with root package name */
    public float f5275i;

    /* renamed from: j  reason: collision with root package name */
    public float f5276j;

    /* renamed from: k  reason: collision with root package name */
    public int f5277k;

    /* renamed from: l  reason: collision with root package name */
    public int f5278l;

    /* renamed from: m  reason: collision with root package name */
    public float f5279m;

    /* renamed from: n  reason: collision with root package name */
    public float f5280n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f5281o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f5282p;

    public a(T t8) {
        this.f5275i = -3987645.8f;
        this.f5276j = -3987645.8f;
        this.f5277k = 784923401;
        this.f5278l = 784923401;
        this.f5279m = Float.MIN_VALUE;
        this.f5280n = Float.MIN_VALUE;
        this.f5281o = null;
        this.f5282p = null;
        this.f5268a = null;
        this.f5269b = t8;
        this.f5270c = t8;
        this.f5271d = null;
        this.e = null;
        this.f5272f = null;
        this.f5273g = Float.MIN_VALUE;
        this.f5274h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(f fVar, T t8, T t9, Interpolator interpolator, float f9, Float f10) {
        this.f5275i = -3987645.8f;
        this.f5276j = -3987645.8f;
        this.f5277k = 784923401;
        this.f5278l = 784923401;
        this.f5279m = Float.MIN_VALUE;
        this.f5280n = Float.MIN_VALUE;
        this.f5281o = null;
        this.f5282p = null;
        this.f5268a = fVar;
        this.f5269b = t8;
        this.f5270c = t9;
        this.f5271d = interpolator;
        this.e = null;
        this.f5272f = null;
        this.f5273g = f9;
        this.f5274h = f10;
    }

    public a(f fVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f9) {
        this.f5275i = -3987645.8f;
        this.f5276j = -3987645.8f;
        this.f5277k = 784923401;
        this.f5278l = 784923401;
        this.f5279m = Float.MIN_VALUE;
        this.f5280n = Float.MIN_VALUE;
        this.f5281o = null;
        this.f5282p = null;
        this.f5268a = fVar;
        this.f5269b = obj;
        this.f5270c = obj2;
        this.f5271d = null;
        this.e = interpolator;
        this.f5272f = interpolator2;
        this.f5273g = f9;
        this.f5274h = null;
    }

    public a(f fVar, T t8, T t9, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f9, Float f10) {
        this.f5275i = -3987645.8f;
        this.f5276j = -3987645.8f;
        this.f5277k = 784923401;
        this.f5278l = 784923401;
        this.f5279m = Float.MIN_VALUE;
        this.f5280n = Float.MIN_VALUE;
        this.f5281o = null;
        this.f5282p = null;
        this.f5268a = fVar;
        this.f5269b = t8;
        this.f5270c = t9;
        this.f5271d = interpolator;
        this.e = interpolator2;
        this.f5272f = interpolator3;
        this.f5273g = f9;
        this.f5274h = f10;
    }

    public final float a() {
        float f9 = 1.0f;
        f fVar = this.f5268a;
        if (fVar == null) {
            return 1.0f;
        }
        if (this.f5280n == Float.MIN_VALUE) {
            if (this.f5274h != null) {
                f9 = b() + ((this.f5274h.floatValue() - this.f5273g) / (fVar.f8229l - fVar.f8228k));
            }
            this.f5280n = f9;
        }
        return this.f5280n;
    }

    public final float b() {
        f fVar = this.f5268a;
        if (fVar == null) {
            return 0.0f;
        }
        if (this.f5279m == Float.MIN_VALUE) {
            float f9 = fVar.f8228k;
            this.f5279m = (this.f5273g - f9) / (fVar.f8229l - f9);
        }
        return this.f5279m;
    }

    public final boolean c() {
        return this.f5271d == null && this.e == null && this.f5272f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f5269b + ", endValue=" + this.f5270c + ", startFrame=" + this.f5273g + ", endFrame=" + this.f5274h + ", interpolator=" + this.f5271d + '}';
    }
}
