package androidx.fragment.app;

import androidx.activity.result.c;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1310a;

    public p(AtomicReference atomicReference) {
        this.f1310a = atomicReference;
    }

    public final void a(Object obj) {
        c cVar = (c) this.f1310a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
