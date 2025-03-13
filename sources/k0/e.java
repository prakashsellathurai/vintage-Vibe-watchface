package k0;

import android.view.accessibility.AccessibilityRecord;

public final class e {
    public static int a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollX(i8);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollY(i8);
    }
}
