package androidx.wear.widget;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import j0.x;
import java.util.Objects;

public class CircledImageView extends View {
    public static final ArgbEvaluator E = new ArgbEvaluator();
    public final Integer A;
    public int B;
    public final ValueAnimator.AnimatorUpdateListener C;
    public ValueAnimator D;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f2441a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2442b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2443c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2444d;
    public final w1.b e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2445f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2446g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2447h;

    /* renamed from: i  reason: collision with root package name */
    public float f2448i;

    /* renamed from: j  reason: collision with root package name */
    public float f2449j;

    /* renamed from: k  reason: collision with root package name */
    public float f2450k;

    /* renamed from: l  reason: collision with root package name */
    public float f2451l;

    /* renamed from: m  reason: collision with root package name */
    public final float f2452m;

    /* renamed from: n  reason: collision with root package name */
    public int f2453n;

    /* renamed from: o  reason: collision with root package name */
    public Paint.Cap f2454o;

    /* renamed from: p  reason: collision with root package name */
    public float f2455p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2456q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2457s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2458t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2459u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2460v;
    public long w;

    /* renamed from: x  reason: collision with root package name */
    public float f2461x;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f2462z;

    public class a implements Drawable.Callback {
        public a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            CircledImageView.this.invalidate();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            CircledImageView circledImageView = CircledImageView.this;
            if (intValue != circledImageView.B) {
                circledImageView.B = intValue;
                circledImageView.invalidate();
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f2465a = {-16777216, 0};

        /* renamed from: b  reason: collision with root package name */
        public final float[] f2466b = {0.6f, 1.0f};

        /* renamed from: c  reason: collision with root package name */
        public final RectF f2467c = new RectF();

        /* renamed from: d  reason: collision with root package name */
        public final float f2468d;
        public final Paint e;

        /* renamed from: f  reason: collision with root package name */
        public float f2469f;

        /* renamed from: g  reason: collision with root package name */
        public float f2470g;

        /* renamed from: h  reason: collision with root package name */
        public float f2471h;

        /* renamed from: i  reason: collision with root package name */
        public float f2472i;

        public c(float f9, float f10, float f11) {
            Paint paint = new Paint();
            this.e = paint;
            this.f2468d = f9;
            this.f2470g = 0.0f;
            this.f2471h = f10;
            this.f2472i = f11;
            this.f2469f = f10 + f11 + (f9 * 0.0f);
            paint.setColor(-16777216);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            a();
        }

        public final void a() {
            float f9 = this.f2471h + this.f2472i + (this.f2468d * this.f2470g);
            this.f2469f = f9;
            if (f9 > 0.0f) {
                RectF rectF = this.f2467c;
                this.e.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), this.f2469f, this.f2465a, this.f2466b, Shader.TileMode.MIRROR));
            }
        }
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f2456q = false;
        this.r = 1.0f;
        this.f2457s = false;
        this.w = 0;
        this.f2461x = 1.0f;
        this.y = 0.0f;
        this.C = new b();
        Context context2 = getContext();
        int[] iArr = a1.a.f43q0;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = x.f4957a;
        x.m.c(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f2447h = drawable;
        if (!(drawable == null || drawable.getConstantState() == null)) {
            Drawable newDrawable = this.f2447h.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.f2447h = newDrawable;
            this.f2447h = newDrawable.mutate();
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
        this.f2446g = colorStateList;
        if (colorStateList == null) {
            this.f2446g = ColorStateList.valueOf(context.getColor(17170432));
        }
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f2448i = dimension;
        this.f2444d = dimension;
        this.f2450k = obtainStyledAttributes.getDimension(7, dimension);
        this.f2453n = obtainStyledAttributes.getColor(2, -16777216);
        this.f2454o = Paint.Cap.values()[obtainStyledAttributes.getInt(1, 0)];
        float dimension2 = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f2455p = dimension2;
        if (dimension2 > 0.0f) {
            this.f2452m += dimension2 / 2.0f;
        }
        float dimension3 = obtainStyledAttributes.getDimension(13, 0.0f);
        if (dimension3 > 0.0f) {
            this.f2452m += dimension3;
        }
        this.f2461x = obtainStyledAttributes.getFloat(11, 0.0f);
        this.y = obtainStyledAttributes.getFloat(12, 0.0f);
        if (obtainStyledAttributes.hasValue(14)) {
            this.f2462z = Integer.valueOf(obtainStyledAttributes.getColor(14, 0));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.A = Integer.valueOf(obtainStyledAttributes.getInt(10, 0));
        }
        float fraction = obtainStyledAttributes.getFraction(6, 1, 1, 0.0f);
        this.f2449j = fraction;
        this.f2451l = obtainStyledAttributes.getFraction(8, 1, 1, fraction);
        float dimension4 = obtainStyledAttributes.getDimension(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.f2441a = new RectF();
        Paint paint = new Paint();
        this.f2442b = paint;
        paint.setAntiAlias(true);
        this.f2443c = new c(dimension4, getCircleRadius(), this.f2455p);
        w1.b bVar = new w1.b();
        this.e = bVar;
        bVar.setCallback(aVar);
        setWillNotDraw(false);
        a();
    }

    public final void a() {
        int colorForState = this.f2446g.getColorForState(getDrawableState(), this.f2446g.getDefaultColor());
        if (this.w > 0) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                this.D = new ValueAnimator();
            }
            this.D.setIntValues(new int[]{this.B, colorForState});
            this.D.setEvaluator(E);
            this.D.setDuration(this.w);
            this.D.addUpdateListener(this.C);
            this.D.start();
        } else if (colorForState != this.B) {
            this.B = colorForState;
            invalidate();
        }
    }

    public final void b(boolean z8) {
        this.f2458t = z8;
        w1.b bVar = this.e;
        if (bVar == null) {
            return;
        }
        if (!z8 || !this.f2459u || !this.f2460v) {
            bVar.f7980c.cancel();
            return;
        }
        ObjectAnimator objectAnimator = bVar.f7980c;
        if (!objectAnimator.isStarted()) {
            objectAnimator.start();
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a();
    }

    public ColorStateList getCircleColorStateList() {
        return this.f2446g;
    }

    public float getCircleRadius() {
        float f9 = this.f2448i;
        if (f9 <= 0.0f && this.f2449j > 0.0f) {
            f9 = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f2449j;
        }
        return f9 - this.f2452m;
    }

    public float getCircleRadiusPercent() {
        return this.f2449j;
    }

    public float getCircleRadiusPressed() {
        float f9 = this.f2450k;
        if (f9 <= 0.0f && this.f2451l > 0.0f) {
            f9 = ((float) Math.max(getMeasuredHeight(), getMeasuredWidth())) * this.f2451l;
        }
        return f9 - this.f2452m;
    }

    public float getCircleRadiusPressedPercent() {
        return this.f2451l;
    }

    public long getColorChangeAnimationDuration() {
        return this.w;
    }

    public int getDefaultCircleColor() {
        return this.f2446g.getDefaultColor();
    }

    public Drawable getImageDrawable() {
        return this.f2447h;
    }

    public float getInitialCircleRadius() {
        return this.f2444d;
    }

    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float circleRadiusPressed = this.f2457s ? getCircleRadiusPressed() : getCircleRadius();
        float alpha = getAlpha();
        c cVar = this.f2443c;
        if (cVar.f2468d > 0.0f && cVar.f2470g > 0.0f) {
            Paint paint = cVar.e;
            paint.setAlpha(Math.round(((float) paint.getAlpha()) * alpha));
            RectF rectF = cVar.f2467c;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), cVar.f2469f, paint);
        }
        int i8 = (this.f2455p > 0.0f ? 1 : (this.f2455p == 0.0f ? 0 : -1));
        Paint paint2 = this.f2442b;
        RectF rectF2 = this.f2441a;
        if (i8 > 0) {
            rectF2.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            rectF2.set(rectF2.centerX() - circleRadiusPressed, rectF2.centerY() - circleRadiusPressed, rectF2.centerX() + circleRadiusPressed, rectF2.centerY() + circleRadiusPressed);
            paint2.setColor(this.f2453n);
            paint2.setAlpha(Math.round(((float) paint2.getAlpha()) * getAlpha()));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.f2455p);
            paint2.setStrokeCap(this.f2454o);
            if (this.f2458t) {
                Rect rect = this.f2445f;
                rectF2.roundOut(rect);
                w1.b bVar = this.e;
                bVar.setBounds(rect);
                bVar.e = this.f2453n;
                bVar.f7981d = this.f2455p;
                bVar.draw(canvas);
            } else {
                canvas.drawArc(rectF2, -90.0f, this.r * 360.0f, false, paint2);
            }
        }
        if (!this.f2456q) {
            rectF2.set((float) paddingLeft, (float) paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
            paint2.setColor(this.B);
            paint2.setAlpha(Math.round(((float) paint2.getAlpha()) * getAlpha()));
            paint2.setStyle(Paint.Style.FILL);
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), circleRadiusPressed, paint2);
        }
        Drawable drawable = this.f2447h;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.f2462z;
            if (num != null) {
                this.f2447h.setTint(num.intValue());
            }
            this.f2447h.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        Drawable drawable = this.f2447h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f2447h.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f9 = this.f2461x;
            if (f9 <= 0.0f) {
                f9 = 1.0f;
            }
            float f10 = (float) intrinsicWidth;
            float f11 = (float) intrinsicHeight;
            float min = Math.min(1.0f, Math.min(f10 != 0.0f ? (((float) measuredWidth) * f9) / f10 : 1.0f, f11 != 0.0f ? (f9 * ((float) measuredHeight)) / f11 : 1.0f));
            int round = Math.round(f10 * min);
            int round2 = Math.round(min * f11);
            int round3 = ((measuredWidth - round) / 2) + Math.round(this.y * ((float) round));
            int i12 = (measuredHeight - round2) / 2;
            this.f2447h.setBounds(round3, i12, round + round3, round2 + i12);
        }
        super.onLayout(z8, i8, i9, i10, i11);
    }

    public final void onMeasure(int i8, int i9) {
        float circleRadius = getCircleRadius() + this.f2455p;
        c cVar = this.f2443c;
        float f9 = (circleRadius + (cVar.f2468d * cVar.f2470g)) * 2.0f;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? (int) Math.min(f9, (float) size) : (int) f9;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? (int) Math.min(f9, (float) size2) : (int) f9;
        }
        Integer num = this.A;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                size = size2;
            } else if (intValue == 2) {
                size2 = size;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final boolean onSetAlpha(int i8) {
        return true;
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        if (i8 != i10 || i9 != i11) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = i8 - getPaddingRight();
            int paddingBottom = i9 - getPaddingBottom();
            c cVar = this.f2443c;
            cVar.f2467c.set((float) paddingLeft, (float) paddingTop, (float) paddingRight, (float) paddingBottom);
            cVar.a();
        }
    }

    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        this.f2459u = i8 == 0;
        b(this.f2458t);
    }

    public final void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f2460v = i8 == 0;
        b(this.f2458t);
    }

    public void setCircleBorderCap(Paint.Cap cap) {
        if (cap != this.f2454o) {
            this.f2454o = cap;
            invalidate();
        }
    }

    public void setCircleBorderColor(int i8) {
        this.f2453n = i8;
    }

    public void setCircleBorderWidth(float f9) {
        if (f9 != this.f2455p) {
            this.f2455p = f9;
            c cVar = this.f2443c;
            cVar.f2472i = f9;
            cVar.a();
            invalidate();
        }
    }

    public void setCircleColor(int i8) {
        setCircleColorStateList(ColorStateList.valueOf(i8));
    }

    public void setCircleColorStateList(ColorStateList colorStateList) {
        if (!Objects.equals(colorStateList, this.f2446g)) {
            this.f2446g = colorStateList;
            a();
            invalidate();
        }
    }

    public void setCircleHidden(boolean z8) {
        if (z8 != this.f2456q) {
            this.f2456q = z8;
            invalidate();
        }
    }

    public void setCircleRadius(float f9) {
        if (f9 != this.f2448i) {
            this.f2448i = f9;
            float circleRadiusPressed = this.f2457s ? getCircleRadiusPressed() : getCircleRadius();
            c cVar = this.f2443c;
            cVar.f2471h = circleRadiusPressed;
            cVar.a();
            invalidate();
        }
    }

    public void setCircleRadiusPercent(float f9) {
        if (f9 != this.f2449j) {
            this.f2449j = f9;
            float circleRadiusPressed = this.f2457s ? getCircleRadiusPressed() : getCircleRadius();
            c cVar = this.f2443c;
            cVar.f2471h = circleRadiusPressed;
            cVar.a();
            invalidate();
        }
    }

    public void setCircleRadiusPressed(float f9) {
        if (f9 != this.f2450k) {
            this.f2450k = f9;
            invalidate();
        }
    }

    public void setCircleRadiusPressedPercent(float f9) {
        if (f9 != this.f2451l) {
            this.f2451l = f9;
            float circleRadiusPressed = this.f2457s ? getCircleRadiusPressed() : getCircleRadius();
            c cVar = this.f2443c;
            cVar.f2471h = circleRadiusPressed;
            cVar.a();
            invalidate();
        }
    }

    public void setColorChangeAnimationDuration(long j8) {
        this.w = j8;
    }

    public void setImageCirclePercentage(float f9) {
        float max = Math.max(0.0f, Math.min(1.0f, f9));
        if (max != this.f2461x) {
            this.f2461x = max;
            invalidate();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2447h;
        if (drawable != drawable2) {
            this.f2447h = drawable;
            if (!(drawable == null || drawable.getConstantState() == null)) {
                this.f2447h = this.f2447h.getConstantState().newDrawable(getResources(), getContext().getTheme()).mutate();
            }
            if (drawable != null && drawable2 != null && drawable2.getIntrinsicHeight() == drawable.getIntrinsicHeight() && drawable2.getIntrinsicWidth() == drawable.getIntrinsicWidth()) {
                this.f2447h.setBounds(drawable2.getBounds());
            } else {
                requestLayout();
            }
            invalidate();
        }
    }

    public void setImageHorizontalOffcenterPercentage(float f9) {
        if (f9 != this.y) {
            this.y = f9;
            invalidate();
        }
    }

    public void setImageResource(int i8) {
        setImageDrawable(i8 == 0 ? null : getContext().getDrawable(i8));
    }

    public void setImageTint(int i8) {
        Integer num = this.f2462z;
        if (num == null || i8 != num.intValue()) {
            this.f2462z = Integer.valueOf(i8);
            invalidate();
        }
    }

    public final void setPadding(int i8, int i9, int i10, int i11) {
        if (!(i8 == getPaddingLeft() && i9 == getPaddingTop() && i10 == getPaddingRight() && i11 == getPaddingBottom())) {
            c cVar = this.f2443c;
            cVar.f2467c.set((float) i8, (float) i9, (float) (getWidth() - i10), (float) (getHeight() - i11));
            cVar.a();
        }
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPressed(boolean z8) {
        super.setPressed(z8);
        if (z8 != this.f2457s) {
            this.f2457s = z8;
            float circleRadiusPressed = z8 ? getCircleRadiusPressed() : getCircleRadius();
            c cVar = this.f2443c;
            cVar.f2471h = circleRadiusPressed;
            cVar.a();
            invalidate();
        }
    }

    public void setProgress(float f9) {
        if (f9 != this.r) {
            this.r = f9;
            invalidate();
        }
    }

    public void setShadowVisibility(float f9) {
        c cVar = this.f2443c;
        if (f9 != cVar.f2470g) {
            cVar.f2470g = f9;
            cVar.a();
            invalidate();
        }
    }
}
