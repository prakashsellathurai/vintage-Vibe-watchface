package androidx.health.services.client.impl.ipc.internal;

import b0.c;
import g5.d;
import g5.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DefaultExecutionTracker implements ExecutionTracker {
    private final Set<l<?>> mFuturesInProgress = new HashSet();

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$track$0(l lVar) {
        synchronized (this.mFuturesInProgress) {
            this.mFuturesInProgress.remove(lVar);
        }
    }

    public void cancelPendingFutures(Throwable th) {
        HashSet hashSet;
        synchronized (this.mFuturesInProgress) {
            hashSet = new HashSet(this.mFuturesInProgress);
            this.mFuturesInProgress.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((l) it.next()).l(th);
        }
    }

    public void track(l<?> lVar) {
        synchronized (this.mFuturesInProgress) {
            this.mFuturesInProgress.add(lVar);
            lVar.a(new c(this, 4, lVar), d.f4656f);
        }
    }
}
