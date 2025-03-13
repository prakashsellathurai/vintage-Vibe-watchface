package g5;

import androidx.health.services.client.impl.g;
import g5.a;
import g5.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public abstract class c<I, O, F, T> extends e.a<O> implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f4653o = 0;

    /* renamed from: m  reason: collision with root package name */
    public j<? extends I> f4654m;

    /* renamed from: n  reason: collision with root package name */
    public F f4655n;

    public static final class a<I, O> extends c<I, O, f5.a<? super I, ? extends O>, O> {
        public a(j jVar, g gVar) {
            super(jVar, gVar);
        }
    }

    public c(j<? extends I> jVar, F f9) {
        jVar.getClass();
        this.f4654m = jVar;
        this.f4655n = f9;
    }

    public final void d() {
        j<? extends I> jVar = this.f4654m;
        boolean z8 = true;
        if ((jVar != null) && isCancelled()) {
            Object obj = this.f4626f;
            if (!(obj instanceof a.b) || !((a.b) obj).f4631a) {
                z8 = false;
            }
            jVar.cancel(z8);
        }
        this.f4654m = null;
        this.f4655n = null;
    }

    public final String j() {
        String str;
        j<? extends I> jVar = this.f4654m;
        F f9 = this.f4655n;
        String j8 = super.j();
        if (jVar != null) {
            String valueOf = String.valueOf(jVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f9 != null) {
            String valueOf2 = String.valueOf(f9);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (j8 == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return j8.length() != 0 ? valueOf3.concat(j8) : new String(valueOf3);
        }
    }

    public final void run() {
        a.f fVar;
        a.c cVar;
        j<? extends I> jVar = this.f4654m;
        F f9 = this.f4655n;
        boolean z8 = true;
        boolean z9 = (this.f4626f instanceof a.b) | (jVar == null);
        if (f9 != null) {
            z8 = false;
        }
        if (!z9 && !z8) {
            this.f4654m = null;
            if (jVar.isCancelled()) {
                Object obj = this.f4626f;
                if (obj == null) {
                    if (jVar.isDone()) {
                        if (a.f4624k.b(this, (Object) null, a.i(jVar))) {
                            a.f(this);
                            return;
                        }
                        return;
                    }
                    fVar = new a.f(this, jVar);
                    if (a.f4624k.b(this, (Object) null, fVar)) {
                        try {
                            jVar.a(fVar, d.f4656f);
                            return;
                        } catch (Throwable unused) {
                            cVar = a.c.f4633b;
                        }
                    } else {
                        obj = this.f4626f;
                    }
                }
                if (obj instanceof a.b) {
                    jVar.cancel(((a.b) obj).f4631a);
                    return;
                }
                return;
            }
            try {
                try {
                    Object apply = ((f5.a) f9).apply(g.j(jVar));
                    this.f4655n = null;
                    a aVar = (a) this;
                    if (apply == null) {
                        apply = a.f4625l;
                    }
                    if (a.f4624k.b(aVar, (Object) null, apply)) {
                        a.f(aVar);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    this.f4655n = null;
                    throw th;
                }
            } catch (CancellationException unused2) {
                cancel(false);
                return;
            } catch (ExecutionException e) {
                l(e.getCause());
                return;
            } catch (RuntimeException e4) {
                l(e4);
                return;
            } catch (Error e9) {
                l(e9);
                return;
            }
        } else {
            return;
        }
        a.f4624k.b(this, fVar, cVar);
    }
}
