package y1;

import java.util.ArrayList;
import java.util.Iterator;
import k2.c;

public final class s implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f8323f;

    public s(t tVar) {
        this.f8323f = tVar;
    }

    public final void run() {
        if (this.f8323f.f8327d != null) {
            r<T> rVar = this.f8323f.f8327d;
            V v8 = rVar.f8321a;
            t tVar = this.f8323f;
            if (v8 != null) {
                synchronized (tVar) {
                    Iterator it = new ArrayList(tVar.f8324a).iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).a(v8);
                    }
                }
                return;
            }
            Throwable th = rVar.f8322b;
            synchronized (tVar) {
                ArrayList arrayList = new ArrayList(tVar.f8325b);
                if (arrayList.isEmpty()) {
                    c.c("Lottie encountered an error but no failure listener was added:", th);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((o) it2.next()).a(th);
                    }
                }
            }
        }
    }
}
