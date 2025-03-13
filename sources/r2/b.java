package r2;

import r2.c;

public final class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f6748f;

    public b(c cVar) {
        this.f6748f = cVar;
    }

    public final void run() {
        c cVar = this.f6748f;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f6751c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
