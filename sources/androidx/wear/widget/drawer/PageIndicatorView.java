package androidx.wear.widget.drawer;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.health.services.client.R;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

public class PageIndicatorView extends View implements ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2473a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2474b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    public final Paint f2475c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f2476d = new Paint(1);
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public float f2477f;

    /* renamed from: g  reason: collision with root package name */
    public float f2478g;

    /* renamed from: h  reason: collision with root package name */
    public int f2479h;

    /* renamed from: i  reason: collision with root package name */
    public int f2480i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2481j;

    /* renamed from: k  reason: collision with root package name */
    public int f2482k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2483l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2484m;

    /* renamed from: n  reason: collision with root package name */
    public float f2485n;

    /* renamed from: o  reason: collision with root package name */
    public float f2486o;

    /* renamed from: p  reason: collision with root package name */
    public float f2487p;

    /* renamed from: q  reason: collision with root package name */
    public int f2488q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f2489s;

    /* renamed from: t  reason: collision with root package name */
    public int f2490t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2491u;

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f44r0, 0, R.style.WsPageIndicatorViewStyle);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.f2477f = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f2478g = obtainStyledAttributes.getDimension(7, 0.0f);
        this.f2479h = obtainStyledAttributes.getColor(0, 0);
        this.f2480i = obtainStyledAttributes.getColor(1, 0);
        this.f2482k = obtainStyledAttributes.getInt(3, 0);
        int i8 = obtainStyledAttributes.getInt(4, 0);
        this.f2483l = i8;
        this.f2484m = obtainStyledAttributes.getInt(2, 0);
        this.f2481j = obtainStyledAttributes.getBoolean(5, false);
        this.f2485n = obtainStyledAttributes.getDimension(9, 0.0f);
        this.f2486o = obtainStyledAttributes.getDimension(10, 0.0f);
        this.f2487p = obtainStyledAttributes.getDimension(11, 0.0f);
        this.f2488q = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f2473a = paint;
        paint.setColor(this.f2479h);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f2475c = paint2;
        paint2.setColor(this.f2480i);
        paint2.setStyle(Paint.Style.FILL);
        if (isInEditMode()) {
            this.r = 5;
            this.f2489s = 2;
            this.f2481j = false;
        }
        if (this.f2481j) {
            this.f2491u = false;
            animate().alpha(0.0f).setStartDelay(2000).setDuration((long) i8).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        f();
    }

    public static void e(Paint paint, Paint paint2, float f9, float f10, int i8, int i9) {
        float f11 = f9 + f10;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f11, new int[]{i9, i9, 0}, new float[]{0.0f, f9 / f11, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i8);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(int i8) {
        if (this.f2490t != i8) {
            this.f2490t = i8;
            if (this.f2481j && i8 == 0) {
                if (this.f2491u) {
                    d((long) this.f2482k);
                    return;
                }
                this.f2491u = true;
                animate().cancel();
                animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f2484m).setListener(new x1.a(this)).start();
            }
        }
    }

    public final void b(float f9, int i8) {
        if (this.f2481j && this.f2490t == 1) {
            if (f9 != 0.0f) {
                if (!this.f2491u) {
                    c();
                }
            } else if (this.f2491u) {
                d(0);
            }
        }
    }

    public final void c() {
        this.f2491u = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0).setDuration((long) this.f2484m).start();
    }

    public final void d(long j8) {
        this.f2491u = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j8).setDuration((long) this.f2483l).start();
    }

    public final void f() {
        e(this.f2473a, this.f2474b, this.f2477f, this.f2487p, this.f2479h, this.f2488q);
        e(this.f2475c, this.f2476d, this.f2478g, this.f2487p, this.f2480i, this.f2488q);
    }

    public int getDotColor() {
        return this.f2479h;
    }

    public int getDotColorSelected() {
        return this.f2480i;
    }

    public int getDotFadeInDuration() {
        return this.f2484m;
    }

    public int getDotFadeOutDelay() {
        return this.f2482k;
    }

    public int getDotFadeOutDuration() {
        return this.f2483l;
    }

    public boolean getDotFadeWhenIdle() {
        return this.f2481j;
    }

    public float getDotRadius() {
        return this.f2477f;
    }

    public float getDotRadiusSelected() {
        return this.f2478g;
    }

    public int getDotShadowColor() {
        return this.f2488q;
    }

    public float getDotShadowDx() {
        return this.f2485n;
    }

    public float getDotShadowDy() {
        return this.f2486o;
    }

    public float getDotShadowRadius() {
        return this.f2487p;
    }

    public float getDotSpacing() {
        return (float) this.e;
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        float f9;
        super.onDraw(canvas);
        if (this.r > 1) {
            canvas.save();
            canvas.translate(((float) getPaddingLeft()) + (((float) this.e) / 2.0f), ((float) getHeight()) / 2.0f);
            for (int i8 = 0; i8 < this.r; i8++) {
                if (i8 == this.f2489s) {
                    canvas.drawCircle(this.f2485n, this.f2486o, this.f2478g + this.f2487p, this.f2476d);
                    f9 = this.f2478g;
                    paint = this.f2475c;
                } else {
                    canvas.drawCircle(this.f2485n, this.f2486o, this.f2477f + this.f2487p, this.f2474b);
                    f9 = this.f2477f;
                    paint = this.f2473a;
                }
                canvas.drawCircle(0.0f, 0.0f, f9, paint);
                canvas.translate((float) this.e, 0.0f);
            }
            canvas.restore();
        }
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int size = View.MeasureSpec.getMode(i8) == 1073741824 ? View.MeasureSpec.getSize(i8) : (this.r * this.e) + getPaddingLeft() + getPaddingRight();
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            i10 = View.MeasureSpec.getSize(i9);
        } else {
            float f9 = this.f2477f;
            float f10 = this.f2487p;
            i10 = ((int) (((float) ((int) Math.ceil((double) (Math.max(f9 + f10, this.f2478g + f10) * 2.0f)))) + this.f2486o)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(View.resolveSizeAndState(size, i8, 0), View.resolveSizeAndState(i10, i9, 0));
    }

    public void setDotColor(int i8) {
        if (this.f2479h != i8) {
            this.f2479h = i8;
            invalidate();
        }
    }

    public void setDotColorSelected(int i8) {
        if (this.f2480i != i8) {
            this.f2480i = i8;
            invalidate();
        }
    }

    public void setDotFadeOutDelay(int i8) {
        this.f2482k = i8;
    }

    public void setDotFadeWhenIdle(boolean z8) {
        this.f2481j = z8;
        if (!z8) {
            c();
        }
    }

    public void setDotRadius(int i8) {
        float f9 = (float) i8;
        if (this.f2477f != f9) {
            this.f2477f = f9;
            f();
            invalidate();
        }
    }

    public void setDotRadiusSelected(int i8) {
        float f9 = (float) i8;
        if (this.f2478g != f9) {
            this.f2478g = f9;
            f();
            invalidate();
        }
    }

    public void setDotShadowColor(int i8) {
        this.f2488q = i8;
        f();
        invalidate();
    }

    public void setDotShadowDx(float f9) {
        this.f2485n = f9;
        invalidate();
    }

    public void setDotShadowDy(float f9) {
        this.f2486o = f9;
        invalidate();
    }

    public void setDotShadowRadius(float f9) {
        if (this.f2487p != f9) {
            this.f2487p = f9;
            f();
            invalidate();
        }
    }

    public void setDotSpacing(int i8) {
        if (this.e != i8) {
            this.e = i8;
            requestLayout();
        }
    }

    public void setPager(ViewPager viewPager) {
        if (viewPager.D == null) {
            viewPager.D = new ArrayList();
        }
        viewPager.D.add(this);
        viewPager.getAdapter();
        setPagerAdapter((h1.a) null);
        viewPager.getAdapter();
    }

    public void setPagerAdapter(h1.a aVar) {
    }
}
