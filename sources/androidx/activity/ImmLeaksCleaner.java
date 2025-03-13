package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

final class ImmLeaksCleaner implements p {

    /* renamed from: f  reason: collision with root package name */
    public static int f268f;

    public ImmLeaksCleaner() {
        throw null;
    }

    public final void c(r rVar, m.a aVar) {
        if (aVar == m.a.ON_DESTROY) {
            if (f268f == 0) {
                Class<InputMethodManager> cls = InputMethodManager.class;
                try {
                    f268f = 2;
                    cls.getDeclaredField("mServedView").setAccessible(true);
                    cls.getDeclaredField("mNextServedView").setAccessible(true);
                    cls.getDeclaredField("mH").setAccessible(true);
                    f268f = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f268f == 1) {
                throw null;
            }
        }
    }
}
