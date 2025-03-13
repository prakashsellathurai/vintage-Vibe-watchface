package androidx.fragment.app;

import androidx.fragment.app.s0;
import java.util.ArrayList;
import java.util.List;

public final class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f1136f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s0.d f1137g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l f1138h;

    public c(l lVar, ArrayList arrayList, s0.d dVar) {
        this.f1138h = lVar;
        this.f1136f = arrayList;
        this.f1137g = dVar;
    }

    public final void run() {
        List list = this.f1136f;
        s0.d dVar = this.f1137g;
        if (list.contains(dVar)) {
            list.remove(dVar);
            this.f1138h.getClass();
            dVar.f1330a.e(dVar.f1332c.H);
        }
    }
}
