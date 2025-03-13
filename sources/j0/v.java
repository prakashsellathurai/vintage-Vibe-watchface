package j0;

import android.text.TextUtils;
import android.view.View;
import androidx.health.services.client.R;
import j0.x;

public final class v extends x.a<CharSequence> {
    public v() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public final Object b(View view) {
        return x.n.a(view);
    }

    public final void c(View view, Object obj) {
        x.n.b(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
