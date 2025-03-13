package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.health.services.client.R;
import j0.a;
import k0.c;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3555d;

    public b(ClockFaceView clockFaceView) {
        this.f3555d = clockFaceView;
    }

    public final void d(View view, c cVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f3555d.y.get(intValue - 1));
        }
        cVar.g(c.C0072c.a(0, 1, intValue, 1, view.isSelected()));
    }
}
