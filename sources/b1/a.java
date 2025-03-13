package b1;

import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import q7.k;

public final /* synthetic */ class a implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ androidx.savedstate.a f2510f;

    public /* synthetic */ a(androidx.savedstate.a aVar) {
        this.f2510f = aVar;
    }

    public final void c(r rVar, m.a aVar) {
        boolean z8;
        androidx.savedstate.a aVar2 = this.f2510f;
        k.e(aVar2, "this$0");
        if (aVar == m.a.ON_START) {
            z8 = true;
        } else if (aVar == m.a.ON_STOP) {
            z8 = false;
        } else {
            return;
        }
        aVar2.f1921f = z8;
    }
}
