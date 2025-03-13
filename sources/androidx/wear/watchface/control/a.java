package androidx.wear.watchface.control;

import j7.d;
import j7.f;
import java.util.HashSet;
import java.util.Iterator;
import k3.j;
import l7.e;
import n1.t;
import n1.t0;
import p7.p;
import q7.k;
import r1.h;
import y7.z;

public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet<a> f2242c = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    public t0.c f2243a;

    /* renamed from: b  reason: collision with root package name */
    public t0 f2244b;

    @e(c = "androidx.wear.watchface.control.HeadlessWatchFaceImpl$1$1", f = "HeadlessWatchFaceImpl.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.wear.watchface.control.a$a  reason: collision with other inner class name */
    public static final class C0021a extends l7.h implements p<z, d<? super Boolean>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f2245j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f2246k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ a f2247l;

        @e(c = "androidx.wear.watchface.control.HeadlessWatchFaceImpl$1$1$1", f = "HeadlessWatchFaceImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.wear.watchface.control.a$a$a  reason: collision with other inner class name */
        public static final class C0022a extends l7.h implements p<z, d<? super Boolean>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ a f2248j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0022a(a aVar, d<? super C0022a> dVar) {
                super(2, dVar);
                this.f2248j = aVar;
            }

            public final d<h7.h> c(Object obj, d<?> dVar) {
                return new C0022a(this.f2248j, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0022a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                a1.a.I(obj);
                HashSet<a> hashSet = a.f2242c;
                return Boolean.valueOf(a.f2242c.add(this.f2248j));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0021a(a aVar, d<? super C0021a> dVar) {
            super(2, dVar);
            this.f2247l = aVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            C0021a aVar = new C0021a(this.f2247l, dVar);
            aVar.f2246k = obj;
            return aVar;
        }

        public final Object g(Object obj, Object obj2) {
            return ((C0021a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            f fVar;
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f2245j;
            if (i8 == 0) {
                a1.a.I(obj);
                z zVar = (z) this.f2246k;
                a aVar2 = this.f2247l;
                synchronized (zVar) {
                    t0.c cVar = aVar2.f2243a;
                    k.b(cVar);
                    fVar = cVar.f5744d.f2836f;
                }
                C0022a aVar3 = new C0022a(this.f2247l, (d<? super C0022a>) null);
                this.f2245j = 1;
                obj = j.i0(fVar, aVar3, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final class b {
        public static void a(t tVar) {
            tVar.println("HeadlessWatchFace instances:");
            tVar.b();
            Iterator<a> it = a.f2242c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                t0.c cVar = next.f2243a;
                k.b(cVar);
                if (cVar.f5741a.getLooper().isCurrentThread()) {
                    tVar.println("HeadlessWatchFaceImpl:");
                    tVar.b();
                    t0.c cVar2 = next.f2243a;
                    if (cVar2 != null) {
                        cVar2.u(tVar);
                    }
                    tVar.a();
                } else {
                    throw new IllegalArgumentException("dump must be called from the UIThread".toString());
                }
            }
            tVar.a();
        }
    }

    @e(c = "androidx.wear.watchface.control.HeadlessWatchFaceImpl$release$1$1$1", f = "HeadlessWatchFaceImpl.kt", l = {156}, m = "invokeSuspend")
    public static final class c extends l7.h implements p<z, d<? super t0.c>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f2249j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f2250k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ a f2251l;

        @e(c = "androidx.wear.watchface.control.HeadlessWatchFaceImpl$release$1$1$1$1", f = "HeadlessWatchFaceImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.wear.watchface.control.a$c$a  reason: collision with other inner class name */
        public static final class C0023a extends l7.h implements p<z, d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ a f2252j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0023a(a aVar, d<? super C0023a> dVar) {
                super(2, dVar);
                this.f2252j = aVar;
            }

            public final d<h7.h> c(Object obj, d<?> dVar) {
                return new C0023a(this.f2252j, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0023a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                a1.a.I(obj);
                HashSet<a> hashSet = a.f2242c;
                a.f2242c.remove(this.f2252j);
                a aVar = this.f2252j;
                synchronized (aVar) {
                    t0.c cVar = aVar.f2243a;
                    k.b(cVar);
                    cVar.onDestroy();
                    aVar.f2243a = null;
                    t0 t0Var = aVar.f2244b;
                    k.b(t0Var);
                    t0Var.onDestroy();
                    aVar.f2244b = null;
                }
                return h7.h.f4787a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar, d<? super c> dVar) {
            super(2, dVar);
            this.f2251l = aVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            c cVar = new c(this.f2251l, dVar);
            cVar.f2250k = obj;
            return cVar;
        }

        public final Object g(Object obj, Object obj2) {
            return ((c) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            t0.c cVar;
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f2249j;
            if (i8 == 0) {
                a1.a.I(obj);
                z zVar = (z) this.f2250k;
                a aVar2 = this.f2251l;
                synchronized (zVar) {
                    cVar = aVar2.f2243a;
                    k.b(cVar);
                }
                f fVar = cVar.f5744d.f2836f;
                C0023a aVar3 = new C0023a(this.f2251l, (d<? super C0023a>) null);
                this.f2250k = cVar;
                this.f2249j = 1;
                return j.i0(fVar, aVar3, this) == aVar ? aVar : cVar;
            } else if (i8 == 1) {
                t0.c cVar2 = (t0.c) this.f2250k;
                a1.a.I(obj);
                return cVar2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        k3.j.n(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(n1.t0.c r2, n1.t0 r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.f2243a = r2
            r1.f2244b = r3
            v1.c r2 = new v1.c
            java.lang.String r3 = "HeadlessWatchFaceImpl.init"
            r2.<init>(r3)
            androidx.wear.watchface.control.a$a r3 = new androidx.wear.watchface.control.a$a     // Catch:{ all -> 0x0021 }
            r0 = 0
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = k3.j.Z(r3)     // Catch:{ all -> 0x0021 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0021 }
            r1.booleanValue()     // Catch:{ all -> 0x0021 }
            k3.j.n(r2, r0)
            return
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            k3.j.n(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.a.<init>(n1.t0$c, n1.t0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        k3.j.n(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            v1.c r0 = new v1.c     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "HeadlessWatchFaceImpl.release"
            r0.<init>(r1)     // Catch:{ all -> 0x0023 }
            androidx.wear.watchface.control.a$c r1 = new androidx.wear.watchface.control.a$c     // Catch:{ all -> 0x001c }
            r2 = 0
            r1.<init>(r3, r2)     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = k3.j.Z(r1)     // Catch:{ all -> 0x001c }
            n1.t0$c r3 = (n1.t0.c) r3     // Catch:{ all -> 0x001c }
            r3.q()     // Catch:{ all -> 0x001c }
            h7.h r3 = h7.h.f4787a     // Catch:{ all -> 0x001c }
            k3.j.n(r0, r2)     // Catch:{ all -> 0x0023 }
            return
        L_0x001c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            k3.j.n(r0, r3)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            java.lang.String r0 = "release failed"
            java.lang.String r1 = "HeadlessWatchFaceImpl"
            android.util.Log.e(r1, r0, r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.a.c():void");
    }
}
