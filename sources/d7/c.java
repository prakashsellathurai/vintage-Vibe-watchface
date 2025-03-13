package d7;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import d7.a;
import d7.b;

public final class c extends a {

    /* renamed from: n  reason: collision with root package name */
    public final float f4113n;

    /* renamed from: o  reason: collision with root package name */
    public final float f4114o;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.graphics.Paint$Align[] r0 = android.graphics.Paint.Align.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4115a = r0
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4115a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Paint$Align r1 = android.graphics.Paint.Align.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.c.a.<clinit>():void");
        }
    }

    public c(b7.a aVar, Paint.Align align, boolean z8, Path.Direction direction, float f9, float f10, float f11, float f12, float f13, float f14) {
        super(aVar, align, z8, direction, f9, f10, f11, f12, f13, f14);
        this.f4113n = f13 / 2.0f;
        this.f4114o = f14 / 2.0f;
        h();
        this.f4096k = true;
    }

    public final a.b g(Paint.Align align, Rect rect) {
        float f9;
        float f10;
        float o8 = o(b.a.START_ANGLE);
        float o9 = o(b.a.END_ANGLE);
        float d9 = a(b.a.RADIUS).d();
        boolean z8 = false;
        float f11 = 0.0f;
        if (rect == null || Float.compare(o8, o9) == 0) {
            return new a.b(o8, o9, 0.0f, false);
        }
        int i8 = a.f4115a[align.ordinal()];
        float f12 = 359.9999f;
        boolean z9 = this.f4123b;
        if (i8 != 1) {
            if (i8 != 2) {
                float f13 = this.f4092g;
                if (((float) rect.width()) < f13) {
                    float width = (f13 - ((float) rect.width())) * 0.5f;
                    float r = r(width, o8, d9, this.f4090d);
                    Path.Direction direction = this.f4090d;
                    Path.Direction direction2 = Path.Direction.CCW;
                    if (direction == direction2) {
                        direction2 = Path.Direction.CW;
                    }
                    float r8 = r(width, o9, d9, direction2);
                    o8 = a.t(o8 + r);
                    o9 = a.t(o9 + r8);
                } else if (!z9) {
                    if (((float) rect.width()) > this.f4095j) {
                        if (this.f4090d != Path.Direction.CW) {
                            f12 = -359.9999f;
                        }
                        float t8 = a.t(f12 + o8);
                        f10 = (((float) rect.width()) - this.f4092g) * 0.5f;
                        o9 = t8;
                    } else {
                        float width2 = (((float) rect.width()) - this.f4092g) * 0.5f;
                        Path.Direction direction3 = this.f4090d;
                        Path.Direction direction4 = Path.Direction.CCW;
                        if (direction3 == direction4) {
                            direction4 = Path.Direction.CW;
                        }
                        float r9 = r(width2, o8, d9, direction4);
                        float r10 = r(width2, o9, d9, this.f4090d);
                        float t9 = a.t(o8 + r9);
                        o9 = a.t(o9 + r10);
                        o8 = t9;
                    }
                }
                return new a.b(o8, o9, f11, z8);
            }
            if (((float) rect.width()) < this.f4092g) {
                float width3 = (float) rect.width();
                Path.Direction direction5 = this.f4090d;
                Path.Direction direction6 = Path.Direction.CCW;
                if (direction5 == direction6) {
                    direction6 = Path.Direction.CW;
                }
                o8 = a.t(r(width3, o9, d9, direction6) + o9);
            } else if (!z9) {
                if (((float) rect.width()) > this.f4095j) {
                    if (this.f4090d != Path.Direction.CW) {
                        f12 = -359.9999f;
                    }
                    float t10 = a.t(o9 - f12);
                    f10 = ((float) rect.width()) - this.f4095j;
                    o8 = t10;
                } else {
                    float width4 = (float) rect.width();
                    Path.Direction direction7 = this.f4090d;
                    Path.Direction direction8 = Path.Direction.CCW;
                    if (direction7 == direction8) {
                        direction8 = Path.Direction.CW;
                    }
                    o8 = a.t(r(width4, o9, d9, direction8) + o9);
                }
            }
            return new a.b(o8, o9, f11, z8);
            f11 = f10;
        } else {
            if (!z9 && ((float) rect.width()) > this.f4092g) {
                if (((float) rect.width()) > this.f4095j) {
                    if (this.f4090d != Path.Direction.CW) {
                        f12 = -359.9999f;
                    }
                    f9 = a.t(f12 + o8);
                } else {
                    f9 = a.t(r((float) rect.width(), o8, d9, this.f4090d) + o8);
                }
                o9 = f9;
            }
            return new a.b(o8, o9, f11, z8);
        }
        z8 = true;
        return new a.b(o8, o9, f11, z8);
    }

    public final RectF i() {
        float d9 = a(b.a.CENTER_X).d();
        float d10 = a(b.a.CENTER_Y).d();
        PointF B = this.f4093h.B();
        float f9 = this.f4113n;
        float f10 = B.x;
        float f11 = this.f4114o;
        float f12 = B.y;
        return new RectF((d9 - f9) * f10, (d10 - f11) * f12, (d9 + f9) * f10, (d10 + f11) * f12);
    }

    public final float l(RectF rectF, float f9, float f10) {
        Path path = new Path();
        path.addArc(rectF, f9, f10);
        return new PathMeasure(path, false).getLength();
    }

    public final float m() {
        return l(this.e, o(b.a.START_ANGLE), 359.9999f);
    }

    public final Path n(float f9) {
        float d9 = a(b.a.CENTER_X).d();
        float d10 = a(b.a.CENTER_Y).d();
        float f10 = f9 * 0.5f;
        float f11 = this.f4113n + f10;
        float f12 = this.f4114o + f10;
        RectF rectF = new RectF(d9 - f11, d10 - f12, f11 + d9, f12 + d10);
        Path path = new Path();
        path.moveTo(d9, d10);
        path.arcTo(rectF, o(b.a.START_ANGLE), this.f4091f);
        return path;
    }

    public final PointF p(float f9, boolean z8) {
        double d9 = (double) (-((float) Math.toRadians((double) f9)));
        float cos = (float) (((double) (this.f4113n - 0.0f)) * Math.cos(d9));
        float sin = (float) (((double) (this.f4114o - 0.0f)) * Math.sin(d9));
        if (!z8) {
            cos += a(b.a.CENTER_X).d();
            sin = a(b.a.CENTER_Y).d() - sin;
        }
        return new PointF(cos, sin);
    }

    public final float q(float f9) {
        PointF p8 = p(f9, true);
        double pow = Math.pow((double) this.f4114o, 2.0d) * ((double) p8.x);
        double pow2 = Math.pow((double) this.f4113n, 2.0d) * ((double) p8.y);
        double d9 = pow > 0.0d ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        if (pow2 != 0.0d) {
            d9 = (-pow) / pow2;
        }
        return (float) (-Math.toDegrees(Math.atan(d9)));
    }

    public final float r(float f9, float f10, float f11, Path.Direction direction) {
        float f12 = this.f4095j;
        if (f9 > f12) {
            return r(f9 - f12, f10, f11, direction) + ((float) (direction == Path.Direction.CW ? 360 : -360));
        }
        float r = super.r(f9, f10, f11, direction);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f13 = direction == Path.Direction.CW ? 10.0f : -10.0f;
        int i8 = 0;
        float f14 = 0.0f;
        while (i8 < 100) {
            float l8 = f9 - l(this.e, f10, r);
            if (Math.abs(l8) < 1.0f) {
                break;
            }
            if (i8 != 0 && (f14 * l8 < 0.0f || Math.abs(l8) > Math.abs(f14))) {
                f13 *= -0.8f;
            }
            r += f13;
            i8++;
            f14 = l8;
        }
        String.format("findSweepAngle try[%d] -> %dms", new Object[]{Integer.valueOf(i8), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)});
        return r;
    }
}
