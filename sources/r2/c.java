package r2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k3.j;
import p2.e;
import r2.q;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6749a = false;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6750b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f6751c = new ReferenceQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public q.a f6752d;

    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final e f6753a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6754b;

        /* renamed from: c  reason: collision with root package name */
        public v<?> f6755c;

        public a(e eVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z8) {
            super(qVar, referenceQueue);
            v<Z> vVar;
            j.l(eVar);
            this.f6753a = eVar;
            if (!qVar.f6882f || !z8) {
                vVar = null;
            } else {
                vVar = qVar.f6884h;
                j.l(vVar);
            }
            this.f6755c = vVar;
            this.f6754b = qVar.f6882f;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a());
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(e eVar, q<?> qVar) {
        a aVar = (a) this.f6750b.put(eVar, new a(eVar, qVar, this.f6751c, this.f6749a));
        if (aVar != null) {
            aVar.f6755c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            this.f6750b.remove(aVar.f6753a);
            if (aVar.f6754b) {
                v<?> vVar = aVar.f6755c;
                if (vVar != null) {
                    this.f6752d.a(aVar.f6753a, new q(vVar, true, false, aVar.f6753a, this.f6752d));
                }
            }
        }
    }
}
