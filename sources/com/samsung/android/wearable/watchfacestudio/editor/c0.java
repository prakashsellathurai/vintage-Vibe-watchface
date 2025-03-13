package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final /* synthetic */ class c0 implements View.OnGenericMotionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VerticalOptionView f3879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f3880b;

    public /* synthetic */ c0(VerticalOptionView verticalOptionView, float f9) {
        this.f3879a = verticalOptionView;
        this.f3880b = f9;
    }

    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        int i8 = VerticalOptionView.K0;
        VerticalOptionView verticalOptionView = this.f3879a;
        verticalOptionView.getClass();
        boolean z8 = false;
        if (motionEvent.getAction() != 8 || !motionEvent.isFromSource(4194304)) {
            return false;
        }
        verticalOptionView.H0.onGenericMotion(view, motionEvent);
        int round = Math.round((-motionEvent.getAxisValue(26)) * this.f3880b);
        boolean canScrollVertically = view.canScrollVertically(round);
        if (canScrollVertically) {
            verticalOptionView.G0 = true;
            RecyclerView.d adapter = verticalOptionView.getAdapter();
            if (adapter instanceof a0) {
                a0 a0Var = (a0) adapter;
                int i9 = round > 0 ? a0Var.f3873f + 1 : round < 0 ? a0Var.f3873f - 1 : 0;
                if (i9 < 0) {
                    a0Var.getClass();
                } else if (i9 < a0Var.f3872d.f7645f.size()) {
                    a0Var.f3873f = i9;
                    z8 = true;
                }
                if (z8) {
                    verticalOptionView.b0(i9);
                    verticalOptionView.requestFocus();
                }
            }
        } else {
            verticalOptionView.f0(true);
        }
        return canScrollVertically;
    }
}
