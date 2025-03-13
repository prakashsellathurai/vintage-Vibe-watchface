package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

public final class l0 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f1223a;

    public l0(Rect rect) {
        this.f1223a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f1223a;
    }
}
