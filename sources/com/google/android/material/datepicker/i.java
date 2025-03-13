package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.health.services.client.R;
import j0.a;
import k0.c;

public final class i extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f3261d;

    public i(g gVar) {
        this.f3261d = gVar;
    }

    public final void d(View view, c cVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        g gVar = this.f3261d;
        accessibilityNodeInfo.setHintText(gVar.getString(gVar.f3256j0.getVisibility() == 0 ? R.string.mtrl_picker_toggle_to_year_selection : R.string.mtrl_picker_toggle_to_day_selection));
    }
}
