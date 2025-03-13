package n1;

import j7.d;
import j7.f;
import k3.j;
import l7.e;
import l7.h;
import p7.l;
import p7.p;
import y7.z;

public final class i1 {

    @e(c = "androidx.wear.watchface.WatchFaceServiceKt$runBlockingWithTracing$1$1", f = "WatchFaceService.kt", l = {3131}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super R>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f5625j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f f5626k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ l<d<? super R>, Object> f5627l;

        @e(c = "androidx.wear.watchface.WatchFaceServiceKt$runBlockingWithTracing$1$1$1", f = "WatchFaceService.kt", l = {3131}, m = "invokeSuspend")
        /* renamed from: n1.i1$a$a  reason: collision with other inner class name */
        public static final class C0088a extends h implements p<z, d<? super R>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f5628j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ l<d<? super R>, Object> f5629k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0088a(l<? super d<? super R>, ? extends Object> lVar, d<? super C0088a> dVar) {
                super(2, dVar);
                this.f5629k = lVar;
            }

            public final d<h7.h> c(Object obj, d<?> dVar) {
                return new C0088a(this.f5629k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0088a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f5628j;
                if (i8 == 0) {
                    a1.a.I(obj);
                    this.f5628j = 1;
                    obj = this.f5629k.invoke(this);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, l<? super d<? super R>, ? extends Object> lVar, d<? super a> dVar) {
            super(2, dVar);
            this.f5626k = fVar;
            this.f5627l = lVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f5626k, this.f5627l, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f5625j;
            if (i8 == 0) {
                a1.a.I(obj);
                C0088a aVar2 = new C0088a(this.f5627l, (d<? super C0088a>) null);
                this.f5625j = 1;
                obj = j.i0(this.f5626k, aVar2, this);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        k3.j.n(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R a(y7.z r2, java.lang.String r3, p7.l<? super j7.d<? super R>, ? extends java.lang.Object> r4) {
        /*
            java.lang.String r0 = "<this>"
            q7.k.e(r2, r0)
            v1.c r0 = new v1.c
            r0.<init>(r3)
            j7.f r2 = r2.f()     // Catch:{ all -> 0x001c }
            n1.i1$a r3 = new n1.i1$a     // Catch:{ all -> 0x001c }
            r1 = 0
            r3.<init>(r2, r4, r1)     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = k3.j.Z(r3)     // Catch:{ all -> 0x001c }
            k3.j.n(r0, r1)
            return r2
        L_0x001c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001e }
        L_0x001e:
            r3 = move-exception
            k3.j.n(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i1.a(y7.z, java.lang.String, p7.l):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        k3.j.n(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.os.Handler r3, java.lang.String r4, p7.a r5) {
        /*
            java.lang.String r0 = "<this>"
            q7.k.e(r3, r0)
            v1.c r0 = new v1.c
            r0.<init>(r4)
            android.os.Looper r1 = r3.getLooper()     // Catch:{ all -> 0x002c }
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ all -> 0x002c }
            boolean r1 = q7.k.a(r1, r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x001e
            r5.invoke()     // Catch:{ all -> 0x002c }
            h7.h r3 = h7.h.f4787a     // Catch:{ all -> 0x002c }
            goto L_0x0027
        L_0x001e:
            b0.c r1 = new b0.c     // Catch:{ all -> 0x002c }
            r2 = 7
            r1.<init>(r4, r2, r5)     // Catch:{ all -> 0x002c }
            r3.post(r1)     // Catch:{ all -> 0x002c }
        L_0x0027:
            r3 = 0
            k3.j.n(r0, r3)
            return
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r4 = move-exception
            k3.j.n(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i1.b(android.os.Handler, java.lang.String, p7.a):void");
    }

    public static final String c(String str) {
        return (str == null || !str.startsWith("wfId-")) ? "defaultInstance" : str;
    }
}
