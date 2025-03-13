package k6;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f5199f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5200g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f5201h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f5202i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f5203j;

    public /* synthetic */ g(j jVar, AtomicReference atomicReference, String str, int i8, int i9) {
        this.f5199f = jVar;
        this.f5200g = atomicReference;
        this.f5201h = str;
        this.f5202i = i8;
        this.f5203j = i9;
    }

    public final void run() {
        this.f5200g.set(this.f5199f.e(this.f5201h, this.f5202i, this.f5203j));
    }
}
