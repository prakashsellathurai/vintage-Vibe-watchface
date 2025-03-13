package n1;

import a8.b;
import a8.f;
import c1.c;
import j7.d;
import l7.e;
import l7.h;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceImpl$2", f = "WatchFace.kt", l = {818}, m = "invokeSuspend")
public final class m0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5666j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p0 f5667k;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p0 f5668f;

        public a(p0 p0Var) {
            this.f5668f = p0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            k3.j.n(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r1, j7.d r2) {
            /*
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                v1.c r1 = new v1.c
                java.lang.String r2 = "WatchFaceImpl.ambient"
                r1.<init>(r2)
                n1.p0 r0 = r0.f5668f
                boolean r2 = r0.w     // Catch:{ all -> 0x001e }
                if (r2 == 0) goto L_0x0012
                r0.e()     // Catch:{ all -> 0x001e }
            L_0x0012:
                r0.j()     // Catch:{ all -> 0x001e }
                h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x001e }
                r0 = 0
                k3.j.n(r1, r0)
                h7.h r0 = h7.h.f4787a
                return r0
            L_0x001e:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r2 = move-exception
                k3.j.n(r1, r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.m0.a.emit(java.lang.Object, j7.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, d<? super m0> dVar) {
        super(2, dVar);
        this.f5667k = p0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new m0(this.f5667k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((m0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5666j;
        if (i8 == 0) {
            a1.a.I(obj);
            p0 p0Var = this.f5667k;
            f<Boolean> fVar = p0Var.f5684b.f5632b;
            a aVar2 = new a(p0Var);
            this.f5666j = 1;
            if (fVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a1.a.I(obj);
        }
        throw new c();
    }
}
