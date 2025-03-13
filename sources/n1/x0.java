package n1;

import a8.g;
import c1.c;
import j7.d;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import u1.b;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$initStyle$1$2$1", f = "WatchFaceService.kt", l = {2416}, m = "invokeSuspend")
public final class x0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5866j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f5867k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t0 f5868l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ t0.c f5869m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f5870n;

    public static final class a<T> implements a8.b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t0 f5871f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ t0.c f5872g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f5873h;

        public a(t0 t0Var, t0.c cVar, String str) {
            this.f5871f = t0Var;
            this.f5872g = cVar;
            this.f5873h = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
            k3.j.n(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r2, j7.d r3) {
            /*
                r1 = this;
                u1.e r2 = (u1.e) r2
                n1.t0$c r3 = r1.f5872g
                android.content.Context r3 = r3.e
                n1.t0 r0 = r1.f5871f
                r0.getClass()
                java.lang.String r0 = "context"
                q7.k.e(r3, r0)
                java.lang.String r1 = r1.f5873h
                java.lang.String r0 = "fileName"
                q7.k.e(r1, r0)
                java.lang.String r0 = "style"
                q7.k.e(r2, r0)
                r0 = 0
                java.io.FileOutputStream r1 = r3.openFileOutput(r1, r0)
                java.lang.String r3 = "context.openFileOutput(f…me, Context.MODE_PRIVATE)"
                q7.k.d(r1, r3)
                java.nio.charset.Charset r3 = w7.a.f8081a
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
                r0.<init>(r1, r3)
                boolean r1 = r0 instanceof java.io.BufferedWriter
                if (r1 == 0) goto L_0x0034
                java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
                goto L_0x003c
            L_0x0034:
                java.io.BufferedWriter r1 = new java.io.BufferedWriter
                r3 = 8192(0x2000, float:1.14794E-41)
                r1.<init>(r0, r3)
                r0 = r1
            L_0x003c:
                java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x007f }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007f }
            L_0x0044:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x007f }
                if (r2 == 0) goto L_0x0076
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x007f }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x007f }
                java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x007f }
                u1.m r3 = (u1.m) r3     // Catch:{ all -> 0x007f }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x007f }
                u1.m$h r2 = (u1.m.h) r2     // Catch:{ all -> 0x007f }
                u1.m$e r3 = r3.f7641a     // Catch:{ all -> 0x007f }
                java.lang.String r3 = r3.f7683a     // Catch:{ all -> 0x007f }
                r0.write(r3)     // Catch:{ all -> 0x007f }
                r0.newLine()     // Catch:{ all -> 0x007f }
                u1.m$h$a r2 = r2.f7694a     // Catch:{ all -> 0x007f }
                byte[] r2 = r2.f7696a     // Catch:{ all -> 0x007f }
                r3 = 2
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch:{ all -> 0x007f }
                r0.write(r2)     // Catch:{ all -> 0x007f }
                r0.newLine()     // Catch:{ all -> 0x007f }
                goto L_0x0044
            L_0x0076:
                h7.h r1 = h7.h.f4787a     // Catch:{ all -> 0x007f }
                r1 = 0
                k3.j.n(r0, r1)
                h7.h r1 = h7.h.f4787a
                return r1
            L_0x007f:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0081 }
            L_0x0081:
                r2 = move-exception
                k3.j.n(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.x0.a.emit(java.lang.Object, j7.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(b bVar, t0 t0Var, t0.c cVar, String str, d<? super x0> dVar) {
        super(2, dVar);
        this.f5867k = bVar;
        this.f5868l = t0Var;
        this.f5869m = cVar;
        this.f5870n = str;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new x0(this.f5867k, this.f5868l, this.f5869m, this.f5870n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((x0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5866j;
        if (i8 == 0) {
            a1.a.I(obj);
            g gVar = this.f5867k.f7606b;
            a aVar2 = new a(this.f5868l, this.f5869m, this.f5870n);
            this.f5866j = 1;
            if (gVar.collect(aVar2, this) == aVar) {
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
