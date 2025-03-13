package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3554a;

    public a(ClockFaceView clockFaceView) {
        this.f3554a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3554a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3539v.f3543b) - clockFaceView.C;
        if (height != clockFaceView.f3557t) {
            clockFaceView.f3557t = height;
            clockFaceView.h();
            int i8 = clockFaceView.f3557t;
            ClockHandView clockHandView = clockFaceView.f3539v;
            clockHandView.f3550j = i8;
            clockHandView.invalidate();
        }
        return true;
    }
}
