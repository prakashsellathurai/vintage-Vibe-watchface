package k6;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f5195f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5196g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5197h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f5198i;

    public /* synthetic */ f(k kVar, int i8, AtomicReference atomicReference, String str) {
        this.f5195f = kVar;
        this.f5196g = i8;
        this.f5197h = atomicReference;
        this.f5198i = str;
    }

    public final void run() {
        l lVar = this.f5195f;
        int i8 = this.f5196g;
        AtomicReference atomicReference = this.f5197h;
        String str = this.f5198i;
        synchronized (lVar) {
            ((k) lVar).e = i8;
            atomicReference.set(lVar.a(str));
        }
    }
}
