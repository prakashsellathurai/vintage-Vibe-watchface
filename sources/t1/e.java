package t1;

import j7.d;
import java.util.Iterator;
import java.util.Map;
import l7.h;
import p1.c;
import p7.p;
import q1.b;
import y7.z;

@l7.e(c = "androidx.wear.watchface.editor.BaseEditorSession$fetchComplicationsData$1", f = "EditorSession.kt", l = {674, 694}, m = "invokeSuspend")
public final class e extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public Iterator f7414j;

    /* renamed from: k  reason: collision with root package name */
    public Object f7415k;

    /* renamed from: l  reason: collision with root package name */
    public Map f7416l;

    /* renamed from: m  reason: collision with root package name */
    public Object f7417m;

    /* renamed from: n  reason: collision with root package name */
    public int f7418n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f7419o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f7420p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b f7421q;

    @l7.e(c = "androidx.wear.watchface.editor.BaseEditorSession$fetchComplicationsData$1$2$1", f = "EditorSession.kt", l = {688}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super b>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f7422j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f7423k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ c f7424l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ c.C0104c f7425m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, c cVar, c.C0104c cVar2, d<? super a> dVar) {
            super(2, dVar);
            this.f7423k = bVar;
            this.f7424l = cVar;
            this.f7425m = cVar2;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f7423k, this.f7424l, this.f7425m, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f7422j;
            if (i8 == 0) {
                a1.a.I(obj);
                p1.a aVar2 = this.f7425m.f6260b;
                this.f7422j = 1;
                obj = this.f7423k.d(this.f7424l, aVar2, this);
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
    public e(c cVar, b bVar, d<? super e> dVar) {
        super(2, dVar);
        this.f7420p = cVar;
        this.f7421q = bVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        e eVar = new e(this.f7420p, this.f7421q, dVar);
        eVar.f7419o = obj;
        return eVar;
    }

    public final Object g(Object obj, Object obj2) {
        return ((e) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013a A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0148 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149 A[Catch:{ all -> 0x00da }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            k7.a r0 = k7.a.f5217f
            int r2 = r1.f7418n
            i7.l r3 = i7.l.f4880f
            p1.c r4 = r1.f7420p
            r5 = 2
            t1.b r6 = r1.f7421q
            r7 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r7) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            java.lang.Object r2 = r1.f7417m
            java.util.Map r4 = r1.f7416l
            java.lang.Object r6 = r1.f7415k
            kotlinx.coroutines.flow.MutableStateFlow r6 = (kotlinx.coroutines.flow.MutableStateFlow) r6
            java.util.Iterator r7 = r1.f7414j
            java.lang.Object r8 = r1.f7419o
            java.util.Map r8 = (java.util.Map) r8
            a1.a.I(r17)     // Catch:{ all -> 0x00da }
            r9 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            r5 = r2
            r2 = r17
            goto L_0x0136
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            java.lang.Object r2 = r1.f7419o
            y7.z r2 = (y7.z) r2
            a1.a.I(r17)     // Catch:{ all -> 0x00da }
            r8 = r17
            goto L_0x0069
        L_0x0040:
            a1.a.I(r17)
            java.lang.Object r2 = r1.f7419o
            y7.z r2 = (y7.z) r2
            r8 = r6
            t1.u r8 = (t1.u) r8     // Catch:{ all -> 0x00da }
            android.content.ComponentName r8 = r8.w     // Catch:{ all -> 0x00da }
            kotlinx.coroutines.flow.MutableStateFlow r9 = r6.p()     // Catch:{ all -> 0x00da }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x00da }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00da }
            java.util.Set r9 = r9.keySet()     // Catch:{ all -> 0x00da }
            int[] r9 = i7.i.b0(r9)     // Catch:{ all -> 0x00da }
            r1.f7419o = r2     // Catch:{ all -> 0x00da }
            r1.f7418n = r7     // Catch:{ all -> 0x00da }
            java.io.Serializable r8 = r4.c(r8, r9, r1)     // Catch:{ all -> 0x00da }
            if (r8 != r0) goto L_0x0069
            return r0
        L_0x0069:
            p1.c$c[] r8 = (p1.c.C0104c[]) r8     // Catch:{ all -> 0x00da }
            a8.g r9 = r6.f7389s     // Catch:{ all -> 0x00da }
            r11 = 0
            r12 = 16
            if (r8 == 0) goto L_0x0094
            int r13 = r8.length     // Catch:{ all -> 0x00da }
            int r13 = a1.a.C(r13)     // Catch:{ all -> 0x00da }
            if (r13 >= r12) goto L_0x007a
            r13 = r12
        L_0x007a:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00da }
            r14.<init>(r13)     // Catch:{ all -> 0x00da }
            int r13 = r8.length     // Catch:{ all -> 0x00da }
            r15 = 0
        L_0x0081:
            if (r15 >= r13) goto L_0x0095
            r10 = r8[r15]     // Catch:{ all -> 0x00da }
            int r5 = r10.f6259a     // Catch:{ all -> 0x00da }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00da }
            p1.a r10 = r10.f6260b     // Catch:{ all -> 0x00da }
            r14.put(r5, r10)     // Catch:{ all -> 0x00da }
            int r15 = r15 + 1
            r5 = 2
            goto L_0x0081
        L_0x0094:
            r14 = r11
        L_0x0095:
            if (r14 != 0) goto L_0x0098
            r14 = r3
        L_0x0098:
            r9.setValue(r14)     // Catch:{ all -> 0x00da }
            a8.g r5 = r6.r     // Catch:{ all -> 0x00da }
            if (r8 == 0) goto L_0x014a
            int r9 = r8.length     // Catch:{ all -> 0x00da }
            int r9 = a1.a.C(r9)     // Catch:{ all -> 0x00da }
            if (r9 >= r12) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r12 = r9
        L_0x00a8:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00da }
            r9.<init>(r12)     // Catch:{ all -> 0x00da }
            int r10 = r8.length     // Catch:{ all -> 0x00da }
            r12 = 0
        L_0x00af:
            if (r12 >= r10) goto L_0x00ee
            r13 = r8[r12]     // Catch:{ all -> 0x00da }
            int r14 = r13.f6259a     // Catch:{ all -> 0x00da }
            java.lang.Integer r15 = new java.lang.Integer     // Catch:{ all -> 0x00da }
            r15.<init>(r14)     // Catch:{ all -> 0x00da }
            t1.e$a r14 = new t1.e$a     // Catch:{ all -> 0x00da }
            r14.<init>(r6, r4, r13, r11)     // Catch:{ all -> 0x00da }
            j7.g r13 = j7.g.f5052f     // Catch:{ all -> 0x00da }
            j7.f r11 = r2.f()     // Catch:{ all -> 0x00da }
            j7.f r11 = y7.u.a(r11, r13, r7)     // Catch:{ all -> 0x00da }
            d8.c r13 = y7.l0.f8580a     // Catch:{ all -> 0x00da }
            if (r11 == r13) goto L_0x00dd
            j7.e$a r7 = j7.e.a.f5050f     // Catch:{ all -> 0x00da }
            j7.f$b r7 = r11.d(r7)     // Catch:{ all -> 0x00da }
            if (r7 != 0) goto L_0x00dd
            j7.f r11 = r11.t(r13)     // Catch:{ all -> 0x00da }
            goto L_0x00dd
        L_0x00da:
            r0 = move-exception
            goto L_0x015e
        L_0x00dd:
            y7.f0 r7 = new y7.f0     // Catch:{ all -> 0x00da }
            r13 = 1
            r7.<init>(r11, r13)     // Catch:{ all -> 0x00da }
            r7.k0(r13, r7, r14)     // Catch:{ all -> 0x00da }
            r9.put(r15, r7)     // Catch:{ all -> 0x00da }
            int r12 = r12 + 1
            r7 = r13
            r11 = 0
            goto L_0x00af
        L_0x00ee:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00da }
            int r4 = r9.size()     // Catch:{ all -> 0x00da }
            int r4 = a1.a.C(r4)     // Catch:{ all -> 0x00da }
            r2.<init>(r4)     // Catch:{ all -> 0x00da }
            java.util.Set r4 = r9.entrySet()     // Catch:{ all -> 0x00da }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00da }
            r7 = r4
            r6 = r5
            r4 = r2
        L_0x0106:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x0146
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x00da }
            r5 = r2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00da }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00da }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00da }
            y7.e0 r2 = (y7.e0) r2     // Catch:{ all -> 0x00da }
            r1.f7419o = r4     // Catch:{ all -> 0x00da }
            r1.f7414j = r7     // Catch:{ all -> 0x00da }
            r1.f7415k = r6     // Catch:{ all -> 0x00da }
            r1.f7416l = r4     // Catch:{ all -> 0x00da }
            r1.f7417m = r5     // Catch:{ all -> 0x00da }
            r8 = 2
            r1.f7418n = r8     // Catch:{ all -> 0x00da }
            java.lang.Object r2 = r2.M(r1)     // Catch:{ all -> 0x00da }
            if (r2 != r0) goto L_0x0133
            return r0
        L_0x0133:
            r9 = r7
            r7 = r6
            r6 = r4
        L_0x0136:
            q1.b r2 = (q1.b) r2     // Catch:{ all -> 0x00da }
            if (r2 != 0) goto L_0x013f
            q1.h r2 = new q1.h     // Catch:{ all -> 0x00da }
            r2.<init>()     // Catch:{ all -> 0x00da }
        L_0x013f:
            r4.put(r5, r2)     // Catch:{ all -> 0x00da }
            r4 = r6
            r6 = r7
            r7 = r9
            goto L_0x0106
        L_0x0146:
            if (r4 == 0) goto L_0x0149
            goto L_0x014c
        L_0x0149:
            r5 = r6
        L_0x014a:
            r4 = r3
            r6 = r5
        L_0x014c:
            r6.setValue(r4)     // Catch:{ all -> 0x00da }
            t1.b r0 = r1.f7421q     // Catch:{ all -> 0x00da }
            y7.o r0 = r0.f7388q     // Catch:{ all -> 0x00da }
            h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x00da }
            r0.X(r2)     // Catch:{ all -> 0x00da }
            p1.c r0 = r1.f7420p
            r0.close()
            return r2
        L_0x015e:
            p1.c r1 = r1.f7420p
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.h(java.lang.Object):java.lang.Object");
    }
}
