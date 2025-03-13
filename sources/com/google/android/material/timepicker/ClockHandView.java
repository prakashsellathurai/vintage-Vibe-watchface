package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.health.services.client.R;
import j0.x;
import java.util.ArrayList;
import java.util.Iterator;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3542a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final int f3543b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3544c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f3545d;
    public final RectF e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3546f;

    /* renamed from: g  reason: collision with root package name */
    public float f3547g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3548h;

    /* renamed from: i  reason: collision with root package name */
    public double f3549i;

    /* renamed from: j  reason: collision with root package name */
    public int f3550j;

    public interface a {
        void a(float f9);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f3545d = paint;
        this.e = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.P, R.attr.materialClockStyle, -2146303261);
        this.f3550j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3543b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3546f = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3544c = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        int[] iArr = x.f4957a;
        x.c.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final void a(float f9) {
        b(f9, false);
    }

    public final void b(float f9, boolean z8) {
        float f10 = f9 % 360.0f;
        this.f3547g = f10;
        this.f3549i = Math.toRadians((double) (f10 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f3550j) * ((float) Math.cos(this.f3549i)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f3550j) * ((float) Math.sin(this.f3549i)));
        float f11 = (float) this.f3543b;
        this.e.set(width - f11, height - f11, width + f11, height + f11);
        Iterator it = this.f3542a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f10);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f9 = (float) width;
        float f10 = (float) height;
        Paint paint = this.f3545d;
        paint.setStrokeWidth(0.0f);
        int i8 = this.f3543b;
        canvas.drawCircle((((float) this.f3550j) * ((float) Math.cos(this.f3549i))) + f9, (((float) this.f3550j) * ((float) Math.sin(this.f3549i))) + f10, (float) i8, paint);
        double sin = Math.sin(this.f3549i);
        double cos = Math.cos(this.f3549i);
        double d9 = (double) ((float) (this.f3550j - i8));
        paint.setStrokeWidth((float) this.f3546f);
        canvas.drawLine(f9, f10, (float) (width + ((int) (cos * d9))), (float) (height + ((int) (d9 * sin))), paint);
        canvas.drawCircle(f9, f10, this.f3544c, paint);
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        a(this.f3547g);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z10 = false;
        if (actionMasked == 0) {
            this.f3548h = false;
            z8 = true;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z9 = this.f3548h;
            z8 = false;
        } else {
            z9 = false;
            z8 = false;
        }
        boolean z11 = this.f3548h;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y - ((float) (getHeight() / 2))), (double) (x8 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f9 = (float) degrees;
        boolean z12 = this.f3547g != f9;
        if (!z8 || !z12) {
            if (z12 || z9) {
                a(f9);
            }
            this.f3548h = z11 | z10;
            return true;
        }
        z10 = true;
        this.f3548h = z11 | z10;
        return true;
    }
}
