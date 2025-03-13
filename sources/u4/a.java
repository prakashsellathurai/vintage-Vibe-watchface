package u4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import k0.c;

public final class a extends j0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f7735d;

    public a(CheckableImageButton checkableImageButton) {
        this.f7735d = checkableImageButton;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f7735d.isChecked());
    }

    public final void d(View view, c cVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f7735d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f3360d);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
