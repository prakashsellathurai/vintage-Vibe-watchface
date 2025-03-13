package com.google.android.material.timepicker;

import a1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.health.services.client.R;
import com.google.android.material.timepicker.ClockHandView;
import j0.x;
import java.util.Arrays;
import k0.c;
import v4.c;

class ClockFaceView extends c implements ClockHandView.a {
    public final int[] A;
    public final float[] B;
    public final int C;
    public String[] D;
    public float E;
    public final ColorStateList F;

    /* renamed from: v  reason: collision with root package name */
    public final ClockHandView f3539v;
    public final Rect w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public final RectF f3540x = new RectF();
    public final SparseArray<TextView> y;

    /* renamed from: z  reason: collision with root package name */
    public final b f3541z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.y = sparseArray;
        this.B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.O, R.attr.materialClockStyle, -2146303261);
        Resources resources = getResources();
        ColorStateList a9 = c.a(context, obtainStyledAttributes, 1);
        this.F = a9;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3539v = clockHandView;
        this.C = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a9.getColorForState(new int[]{16842913}, a9.getDefaultColor());
        this.A = new int[]{colorForState, colorForState, a9.getDefaultColor()};
        clockHandView.f3542a.add(this);
        Object obj = g.a.f4440a;
        int defaultColor = context.getColorStateList(R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a10 != null ? a10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3541z = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.D = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i8 = 0; i8 < Math.max(this.D.length, size); i8++) {
            TextView textView = sparseArray.get(i8);
            if (i8 >= this.D.length) {
                removeView(textView);
                sparseArray.remove(i8);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i8, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.D[i8]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i8));
                x.i(textView, this.f3541z);
                textView.setTextColor(this.F);
            }
        }
    }

    public final void a(float f9) {
        if (Math.abs(this.E - f9) > 0.001f) {
            this.E = f9;
            i();
        }
    }

    public final void i() {
        RectF rectF = this.f3539v.e;
        int i8 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.y;
            if (i8 < sparseArray.size()) {
                TextView textView = sparseArray.get(i8);
                if (textView != null) {
                    Rect rect = this.w;
                    textView.getDrawingRect(rect);
                    rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                    offsetDescendantRectToMyCoords(textView, rect);
                    RectF rectF2 = this.f3540x;
                    rectF2.set(rect);
                    textView.getPaint().setShader(!RectF.intersects(rectF, rectF2) ? null : new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.A, this.B, Shader.TileMode.CLAMP));
                    textView.invalidate();
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(1, this.D.length, 1).f5099a);
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        i();
    }
}
