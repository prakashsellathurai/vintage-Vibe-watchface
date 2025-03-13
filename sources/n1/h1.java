package n1;

import a8.b;
import android.content.Context;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import j7.d;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.c;
import l7.e;
import l7.h;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$periodicallyWriteComplicationDataCache$1$1", f = "WatchFaceService.kt", l = {853}, m = "invokeSuspend")
public final class h1 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5595j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ MutableStateFlow<List<IdAndComplicationDataWireFormat>> f5596k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t0 f5597l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Context f5598m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f5599n;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t0 f5600f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Context f5601g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f5602h;

        @e(c = "androidx.wear.watchface.WatchFaceService$periodicallyWriteComplicationDataCache$1$1$1", f = "WatchFaceService.kt", l = {860}, m = "emit")
        /* renamed from: n1.h1$a$a  reason: collision with other inner class name */
        public static final class C0086a extends c {

            /* renamed from: i  reason: collision with root package name */
            public Object f5603i;

            /* renamed from: j  reason: collision with root package name */
            public List f5604j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f5605k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ a<T> f5606l;

            /* renamed from: m  reason: collision with root package name */
            public int f5607m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0086a(a<? super T> aVar, d<? super C0086a> dVar) {
                super(dVar);
                this.f5606l = aVar;
            }

            public final Object h(Object obj) {
                this.f5605k = obj;
                this.f5607m |= Integer.MIN_VALUE;
                return this.f5606l.emit((List<IdAndComplicationDataWireFormat>) null, this);
            }
        }

        public a(t0 t0Var, Context context, String str) {
            this.f5600f = t0Var;
            this.f5601g = context;
            this.f5602h = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[Catch:{ Exception -> 0x00a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.util.List<androidx.wear.watchface.data.IdAndComplicationDataWireFormat> r7, j7.d<? super h7.h> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof n1.h1.a.C0086a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                n1.h1$a$a r0 = (n1.h1.a.C0086a) r0
                int r1 = r0.f5607m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f5607m = r1
                goto L_0x0018
            L_0x0013:
                n1.h1$a$a r0 = new n1.h1$a$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f5605k
                k7.a r1 = k7.a.f5217f
                int r2 = r0.f5607m
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.util.List r7 = r0.f5604j
                java.lang.Object r6 = r0.f5603i
                n1.h1$a r6 = (n1.h1.a) r6
                a1.a.I(r8)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x0047
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0035:
                a1.a.I(r8)
                r0.f5603i = r6     // Catch:{ Exception -> 0x00a4 }
                r0.f5604j = r7     // Catch:{ Exception -> 0x00a4 }
                r0.f5607m = r3     // Catch:{ Exception -> 0x00a4 }
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = y7.h0.a(r4, r0)     // Catch:{ Exception -> 0x00a4 }
                if (r8 != r1) goto L_0x0047
                return r1
            L_0x0047:
                java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00a4 }
                r8.<init>()     // Catch:{ Exception -> 0x00a4 }
                java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00a4 }
                r0.<init>(r8)     // Catch:{ Exception -> 0x00a4 }
                int r1 = r7.size()     // Catch:{ Exception -> 0x00a4 }
                r0.writeInt(r1)     // Catch:{ Exception -> 0x00a4 }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00a4 }
            L_0x005c:
                boolean r1 = r7.hasNext()     // Catch:{ Exception -> 0x00a4 }
                if (r1 == 0) goto L_0x008b
                java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x00a4 }
                androidx.wear.watchface.data.IdAndComplicationDataWireFormat r1 = (androidx.wear.watchface.data.IdAndComplicationDataWireFormat) r1     // Catch:{ Exception -> 0x00a4 }
                int r2 = r1.f2341f     // Catch:{ Exception -> 0x00a4 }
                r0.writeInt(r2)     // Catch:{ Exception -> 0x00a4 }
                android.support.wearable.complications.ComplicationData r2 = r1.f2342g     // Catch:{ Exception -> 0x00a4 }
                int r2 = r2.getPersistencePolicy()     // Catch:{ Exception -> 0x00a4 }
                r2 = r2 & r3
                if (r2 == 0) goto L_0x0080
                q1.n r1 = new q1.n     // Catch:{ Exception -> 0x00a4 }
                r1.<init>()     // Catch:{ Exception -> 0x00a4 }
                android.support.wearable.complications.ComplicationData r1 = r1.a()     // Catch:{ Exception -> 0x00a4 }
                goto L_0x0087
            L_0x0080:
                android.support.wearable.complications.ComplicationData r1 = r1.f2342g     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r2 = "{\n                      …                        }"
                q7.k.d(r1, r2)     // Catch:{ Exception -> 0x00a4 }
            L_0x0087:
                r0.writeObject(r1)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x005c
            L_0x008b:
                r0.close()     // Catch:{ Exception -> 0x00a4 }
                byte[] r7 = r8.toByteArray()     // Catch:{ Exception -> 0x00a4 }
                n1.t0 r8 = r6.f5600f     // Catch:{ Exception -> 0x00a4 }
                android.content.Context r0 = r6.f5601g     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r6 = r6.f5602h     // Catch:{ Exception -> 0x00a4 }
                java.lang.String r1 = "byteArray"
                q7.k.d(r7, r1)     // Catch:{ Exception -> 0x00a4 }
                r8.getClass()     // Catch:{ Exception -> 0x00a4 }
                n1.t0.j(r0, r6, r7)     // Catch:{ Exception -> 0x00a4 }
                goto L_0x00ac
            L_0x00a4:
                r6 = move-exception
                java.lang.String r7 = "WatchFaceService"
                java.lang.String r8 = "Failed to write to complication cache due to exception"
                android.util.Log.w(r7, r8, r6)
            L_0x00ac:
                h7.h r6 = h7.h.f4787a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.h1.a.emit(java.util.List, j7.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(MutableStateFlow<List<IdAndComplicationDataWireFormat>> mutableStateFlow, t0 t0Var, Context context, String str, d<? super h1> dVar) {
        super(2, dVar);
        this.f5596k = mutableStateFlow;
        this.f5597l = t0Var;
        this.f5598m = context;
        this.f5599n = str;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new h1(this.f5596k, this.f5597l, this.f5598m, this.f5599n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((h1) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5595j;
        if (i8 == 0) {
            a1.a.I(obj);
            a aVar2 = new a(this.f5597l, this.f5598m, this.f5599n);
            this.f5595j = 1;
            if (this.f5596k.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a1.a.I(obj);
        }
        throw new c1.c();
    }
}
