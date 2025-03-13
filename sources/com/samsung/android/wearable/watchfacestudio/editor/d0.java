package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import h6.a;

public final /* synthetic */ class d0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f3882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f3883b;

    public /* synthetic */ d0(a aVar, ConstraintLayout constraintLayout) {
        this.f3882a = aVar;
        this.f3883b = constraintLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i8 = VerticalOptionView.K0;
        int action = motionEvent.getAction();
        this.f3882a.a(motionEvent.getRawX(), motionEvent.getRawY(), action);
        this.f3883b.dispatchTouchEvent(motionEvent);
        return false;
    }
}
