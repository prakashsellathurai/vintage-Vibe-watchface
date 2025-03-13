package com.google.android.material.snackbar;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.services.client.R;
import j0.x;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f3367a;

    /* renamed from: b  reason: collision with root package name */
    public Button f3368b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3369c;

    /* renamed from: d  reason: collision with root package name */
    public int f3370d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f21f0);
        this.f3369c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3370d = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i8, int i9, int i10) {
        boolean z8;
        if (i8 != getOrientation()) {
            setOrientation(i8);
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.f3367a.getPaddingTop() == i9 && this.f3367a.getPaddingBottom() == i10) {
            return z8;
        }
        TextView textView = this.f3367a;
        int[] iArr = x.f4957a;
        if (x.d.g(textView)) {
            x.d.k(textView, x.d.f(textView), i9, x.d.e(textView), i10);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i9, textView.getPaddingRight(), i10);
        return true;
    }

    public Button getActionView() {
        return this.f3368b;
    }

    public TextView getMessageView() {
        return this.f3367a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3367a = (TextView) findViewById(R.id.snackbar_text);
        this.f3368b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f3369c
            if (r0 <= 0) goto L_0x0016
            int r1 = r7.getMeasuredWidth()
            if (r1 <= r0) goto L_0x0016
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r8, r9)
        L_0x0016:
            android.content.res.Resources r0 = r7.getResources()
            r1 = -2147024733(0xffffffff800700a3, float:-6.43077E-40)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = -2147024734(0xffffffff800700a2, float:-6.43075E-40)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f3367a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f3370d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f3368b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3370d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i8) {
        this.f3370d = i8;
    }
}
