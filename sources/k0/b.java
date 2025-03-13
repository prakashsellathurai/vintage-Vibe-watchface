package k0;

import android.view.accessibility.AccessibilityEvent;

public final class b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i8) {
        accessibilityEvent.setContentChangeTypes(i8);
    }
}
