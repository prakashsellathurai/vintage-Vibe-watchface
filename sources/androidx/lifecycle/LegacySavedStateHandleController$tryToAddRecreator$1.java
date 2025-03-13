package androidx.lifecycle;

import androidx.lifecycle.m;
import androidx.savedstate.a;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements p {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f1400f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f1401g;

    public LegacySavedStateHandleController$tryToAddRecreator$1(m mVar, a aVar) {
        this.f1400f = mVar;
        this.f1401g = aVar;
    }

    public final void c(r rVar, m.a aVar) {
        if (aVar == m.a.ON_START) {
            this.f1400f.b(this);
            this.f1401g.d();
        }
    }
}
