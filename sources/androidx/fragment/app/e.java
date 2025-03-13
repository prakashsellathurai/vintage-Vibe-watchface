package androidx.fragment.app;

import android.animation.Animator;
import f0.a;

public final class e implements a.C0054a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1151a;

    public e(Animator animator) {
        this.f1151a = animator;
    }

    public final void onCancel() {
        this.f1151a.end();
    }
}
