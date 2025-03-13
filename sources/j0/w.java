package j0;

import android.view.View;
import androidx.health.services.client.R;
import j0.x;

public final class w extends x.a<Boolean> {
    public w() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(x.l.c(view));
    }

    public final void c(View view, Object obj) {
        x.l.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !x.a.a((Boolean) obj, (Boolean) obj2);
    }
}
