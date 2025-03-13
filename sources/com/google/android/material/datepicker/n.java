package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j0.a;
import k0.c;

public final class n extends a {
    public final void d(View view, c cVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
    }
}
