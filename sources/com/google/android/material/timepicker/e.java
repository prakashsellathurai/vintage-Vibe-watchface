package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f3561a;

    public e(TimePickerView timePickerView) {
        this.f3561a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        int i8 = TimePickerView.f3551t;
        this.f3561a.getClass();
        return onDoubleTap;
    }
}
