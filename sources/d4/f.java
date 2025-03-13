package d4;

import java.util.concurrent.Executor;
import q3.z;

public final class f<TResult> implements g<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4038a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4039b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final b<TResult> f4040c;

    public f(Executor executor, b<TResult> bVar) {
        this.f4038a = executor;
        this.f4040c = bVar;
    }

    public final void a(h hVar) {
        synchronized (this.f4039b) {
            if (this.f4040c != null) {
                this.f4038a.execute(new z(this, 2, hVar));
            }
        }
    }
}
