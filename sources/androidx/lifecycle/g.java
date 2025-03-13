package androidx.lifecycle;

import androidx.lifecycle.x;
import c8.m;
import j7.d;
import j7.f;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k3.j;
import l7.c;
import l7.e;
import m.b;
import y7.a0;
import y7.g1;
import y7.l0;
import y7.n1;
import y7.o1;
import y7.z0;

public final class g<T> extends x<T> {

    /* renamed from: m  reason: collision with root package name */
    public d<T> f1464m;

    @e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_ktx_release")
    public static final class a extends c {

        /* renamed from: i  reason: collision with root package name */
        public /* synthetic */ Object f1465i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ g<T> f1466j;

        /* renamed from: k  reason: collision with root package name */
        public int f1467k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g<T> gVar, d<? super a> dVar) {
            super(dVar);
            this.f1466j = gVar;
        }

        public final Object h(Object obj) {
            this.f1465i = obj;
            this.f1467k |= Integer.MIN_VALUE;
            return this.f1466j.k(this);
        }
    }

    public g(f fVar, long j8, i iVar) {
        o1 o1Var = new o1((z0) fVar.d(z0.b.f8628f));
        d8.c cVar = l0.f8580a;
        g1 P = m.f2865a.P();
        P.getClass();
        this.f1464m = new d(this, iVar, j8, a0.a(f.a.a(P, fVar).t(o1Var)), new f(this));
    }

    public final void f() {
        b.e eVar = (b.e) this.f1517l.iterator();
        if (!eVar.hasNext()) {
            d<T> dVar = this.f1464m;
            if (dVar != null) {
                n1 n1Var = dVar.f1441g;
                if (n1Var != null) {
                    n1Var.H((CancellationException) null);
                }
                dVar.f1441g = null;
                if (dVar.f1440f == null) {
                    dVar.f1440f = j.K(dVar.f1439d, (g1) null, new c(dVar, (d<? super c>) null), 3);
                    return;
                }
                return;
            }
            return;
        }
        ((x.a) ((Map.Entry) eVar.next()).getValue()).getClass();
        throw null;
    }

    public final void g() {
        b.e eVar = (b.e) this.f1517l.iterator();
        if (!eVar.hasNext()) {
            d<T> dVar = this.f1464m;
            if (dVar == null) {
                return;
            }
            if (dVar.f1441g == null) {
                d8.c cVar = l0.f8580a;
                dVar.f1441g = j.K(dVar.f1439d, m.f2865a.P(), new b(dVar, (d<? super b>) null), 2);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        ((x.a) ((Map.Entry) eVar.next()).getValue()).getClass();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(j7.d<? super h7.h> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.g$a r0 = (androidx.lifecycle.g.a) r0
            int r1 = r0.f1467k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1467k = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.g$a r0 = new androidx.lifecycle.g$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f1465i
            int r0 = r0.f1467k
            if (r0 == 0) goto L_0x002b
            r4 = 1
            if (r0 != r4) goto L_0x0023
            r4 = 0
            goto L_0x002b
        L_0x0023:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            a1.a.I(r5)
            r4.getClass()
            h7.h r4 = h7.h.f4787a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.k(j7.d):java.lang.Object");
    }
}
