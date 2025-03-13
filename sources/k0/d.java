package k0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5101a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final d f5102a;

        public a(d dVar) {
            this.f5102a = dVar;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            c a9 = this.f5102a.a(i8);
            if (a9 == null) {
                return null;
            }
            return a9.f5085a;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i8) {
            this.f5102a.getClass();
            return null;
        }

        public final boolean performAction(int i8, int i9, Bundle bundle) {
            return this.f5102a.c(i8, i9, bundle);
        }
    }

    public static class b extends a {
        public b(d dVar) {
            super(dVar);
        }

        public final AccessibilityNodeInfo findFocus(int i8) {
            c b9 = this.f5102a.b(i8);
            if (b9 == null) {
                return null;
            }
            return b9.f5085a;
        }
    }

    public static class c extends b {
        public c(d dVar) {
            super(dVar);
        }

        public final void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f5102a.getClass();
        }
    }

    public d() {
        this.f5101a = new c(this);
    }

    public d(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f5101a = accessibilityNodeProvider;
    }

    public c a(int i8) {
        return null;
    }

    public c b(int i8) {
        return null;
    }

    public boolean c(int i8, int i9, Bundle bundle) {
        return false;
    }
}
