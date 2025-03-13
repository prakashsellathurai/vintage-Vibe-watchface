package c8;

import a1.a;
import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import h7.e;
import h7.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l7.c;
import l7.d;
import q7.k;
import y7.b0;
import y7.k0;
import y7.q;
import y7.q0;
import y7.q1;
import y7.r;
import y7.w;

public final class f<T> extends k0<T> implements d, j7.d<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2839m = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i  reason: collision with root package name */
    public final w f2840i;

    /* renamed from: j  reason: collision with root package name */
    public final j7.d<T> f2841j;

    /* renamed from: k  reason: collision with root package name */
    public Object f2842k = a.f28j;

    /* renamed from: l  reason: collision with root package name */
    public final Object f2843l;

    public f(w wVar, c cVar) {
        super(-1);
        this.f2840i = wVar;
        this.f2841j = cVar;
        Object q8 = a().q(0, t.f2872b);
        k.b(q8);
        this.f2843l = q8;
    }

    public final j7.f a() {
        return this.f2841j.a();
    }

    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof r) {
            ((r) obj).f8600b.invoke(cancellationException);
        }
    }

    public final j7.d<T> d() {
        return this;
    }

    public final d e() {
        j7.d<T> dVar = this.f2841j;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final void i(Object obj) {
        j7.f a9;
        Object b9;
        j7.d<T> dVar = this.f2841j;
        j7.f a10 = dVar.a();
        Throwable a11 = e.a(obj);
        Object qVar = a11 == null ? obj : new q(a11, false);
        w wVar = this.f2840i;
        if (wVar.O()) {
            this.f2842k = qVar;
            this.f8578h = 0;
            wVar.N(a10, this);
            return;
        }
        q0 a12 = q1.a();
        if (a12.f8595h >= ComplicationOverlayWireFormat.NULL_ACCESSIBILITY_TRAVERSAL_INDEX) {
            this.f2842k = qVar;
            this.f8578h = 0;
            i7.c<k0<?>> cVar = a12.f8597j;
            if (cVar == null) {
                cVar = new i7.c<>();
                a12.f8597j = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a12.Q(true);
        try {
            a9 = a();
            b9 = t.b(a9, this.f2843l);
            dVar.i(obj);
            h hVar = h.f4787a;
            t.a(a9, b9);
            do {
            } while (a12.S());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a12.P(true);
                throw th2;
            }
        }
        a12.P(true);
    }

    public final Object j() {
        Object obj = this.f2842k;
        this.f2842k = a.f28j;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2840i + ", " + b0.m(this.f2841j) + ']';
    }
}
