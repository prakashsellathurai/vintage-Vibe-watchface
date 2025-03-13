package t4;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7492a;

    public a(d dVar) {
        this.f7492a = dVar;
    }

    public final boolean onPreDraw() {
        d dVar = this.f7492a;
        float rotation = dVar.r.getRotation();
        if (dVar.f3341l == rotation) {
            return true;
        }
        dVar.f3341l = rotation;
        dVar.k();
        return true;
    }
}
