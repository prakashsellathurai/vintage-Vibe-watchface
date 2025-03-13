package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;

class Fragment$5 implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f1081f;

    public Fragment$5(n nVar) {
        this.f1081f = nVar;
    }

    public final void c(r rVar, m.a aVar) {
        View view;
        if (aVar == m.a.ON_STOP && (view = this.f1081f.H) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
