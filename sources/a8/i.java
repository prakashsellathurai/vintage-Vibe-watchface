package a8;

import h7.h;
import j7.d;
import l7.c;
import l7.e;

public final class i<T> implements b<T> {

    @e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    public static final class a extends c {

        /* renamed from: i  reason: collision with root package name */
        public Object f227i;

        /* renamed from: j  reason: collision with root package name */
        public Object f228j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f229k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ i<T> f230l;

        /* renamed from: m  reason: collision with root package name */
        public int f231m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i<T> iVar, d<? super a> dVar) {
            super(dVar);
            this.f230l = iVar;
        }

        public final Object h(Object obj) {
            this.f229k = obj;
            this.f231m |= Integer.MIN_VALUE;
            return this.f230l.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(j7.d<? super h7.h> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a8.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            a8.i$a r0 = (a8.i.a) r0
            int r1 = r0.f231m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f231m = r1
            goto L_0x0018
        L_0x0013:
            a8.i$a r0 = new a8.i$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f229k
            int r1 = r0.f231m
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0032
            r5 = 2
            if (r1 != r5) goto L_0x002a
            a1.a.I(r6)
        L_0x0027:
            h7.h r5 = h7.h.f4787a
            return r5
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            java.lang.Object r5 = r0.f228j
            b8.f r5 = (b8.f) r5
            java.lang.Object r0 = r0.f227i
            a8.i r0 = (a8.i) r0
            a1.a.I(r6)     // Catch:{ all -> 0x0044 }
            r5.n()
            r0.getClass()
            goto L_0x0027
        L_0x0044:
            r6 = move-exception
            goto L_0x005f
        L_0x0046:
            a1.a.I(r6)
            b8.f r6 = new b8.f
            j7.f r1 = r0.f5330g
            q7.k.b(r1)
            r6.<init>(r1)
            r0.f227i = r5     // Catch:{ all -> 0x005b }
            r0.f228j = r6     // Catch:{ all -> 0x005b }
            r0.f231m = r2     // Catch:{ all -> 0x005b }
            r5 = 0
            throw r5     // Catch:{ all -> 0x005b }
        L_0x005b:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x005f:
            r5.n()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.i.a(j7.d):java.lang.Object");
    }

    public final Object emit(T t8, d<? super h> dVar) {
        throw null;
    }
}
