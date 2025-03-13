package a8;

import b8.b;
import h7.h;
import j7.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.c;
import l7.e;

public final class g<T> extends b8.a<h> implements MutableStateFlow<T>, a {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f216k = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: j  reason: collision with root package name */
    public int f217j;

    @e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    public static final class a extends c {

        /* renamed from: i  reason: collision with root package name */
        public Object f218i;

        /* renamed from: j  reason: collision with root package name */
        public Object f219j;

        /* renamed from: k  reason: collision with root package name */
        public Object f220k;

        /* renamed from: l  reason: collision with root package name */
        public Object f221l;

        /* renamed from: m  reason: collision with root package name */
        public Object f222m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f223n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ g<T> f224o;

        /* renamed from: p  reason: collision with root package name */
        public int f225p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g<T> gVar, d<? super a> dVar) {
            super(dVar);
            this.f224o = gVar;
        }

        public final Object h(Object obj) {
            this.f223n = obj;
            this.f225p |= Integer.MIN_VALUE;
            return this.f224o.collect((b) null, this);
        }
    }

    public g(Object obj) {
        this._state = obj;
    }

    public final b b() {
        return new h();
    }

    public final b[] c() {
        return new h[2];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: a8.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e1 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e3 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f6 A[Catch:{ all -> 0x0155 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f7 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0115 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117 A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011a A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(a8.b<? super T> r19, j7.d<?> r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            boolean r3 = r2 instanceof a8.g.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            a8.g$a r3 = (a8.g.a) r3
            int r4 = r3.f225p
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f225p = r4
            goto L_0x001e
        L_0x0019:
            a8.g$a r3 = new a8.g$a
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f223n
            k7.a r4 = k7.a.f5217f
            int r5 = r3.f225p
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x0090
            if (r5 == r6) goto L_0x0072
            if (r5 == r7) goto L_0x0054
            if (r5 != r8) goto L_0x004c
            java.lang.Object r0 = r3.f222m
            java.lang.Object r1 = r3.f221l
            y7.z0 r1 = (y7.z0) r1
            java.lang.Object r5 = r3.f220k
            a8.h r5 = (a8.h) r5
            java.lang.Object r10 = r3.f219j
            a8.b r10 = (a8.b) r10
            java.lang.Object r11 = r3.f218i
            a8.g r11 = (a8.g) r11
            a1.a.I(r2)     // Catch:{ all -> 0x006f }
            r2 = r1
            r1 = r11
            r11 = r10
            r10 = r5
        L_0x0049:
            r5 = r4
            goto L_0x00c1
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            java.lang.Object r0 = r3.f222m
            java.lang.Object r1 = r3.f221l
            y7.z0 r1 = (y7.z0) r1
            java.lang.Object r5 = r3.f220k
            a8.h r5 = (a8.h) r5
            java.lang.Object r10 = r3.f219j
            a8.b r10 = (a8.b) r10
            java.lang.Object r11 = r3.f218i
            a8.g r11 = (a8.g) r11
            a1.a.I(r2)     // Catch:{ all -> 0x006f }
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            goto L_0x00fd
        L_0x006f:
            r0 = move-exception
            goto L_0x015d
        L_0x0072:
            java.lang.Object r0 = r3.f220k
            r1 = r0
            a8.h r1 = (a8.h) r1
            java.lang.Object r0 = r3.f219j
            a8.b r0 = (a8.b) r0
            java.lang.Object r5 = r3.f218i
            a8.g r5 = (a8.g) r5
            a1.a.I(r2)     // Catch:{ all -> 0x0088 }
            r17 = r5
            r5 = r1
            r1 = r17
            goto L_0x00b0
        L_0x0088:
            r0 = move-exception
            r17 = r5
            r5 = r1
            r1 = r17
            goto L_0x015c
        L_0x0090:
            a1.a.I(r2)
            b8.b r2 = r18.a()
            a8.h r2 = (a8.h) r2
            boolean r5 = r0 instanceof a8.i     // Catch:{ all -> 0x015a }
            if (r5 == 0) goto L_0x00af
            r5 = r0
            a8.i r5 = (a8.i) r5     // Catch:{ all -> 0x015a }
            r3.f218i = r1     // Catch:{ all -> 0x015a }
            r3.f219j = r0     // Catch:{ all -> 0x015a }
            r3.f220k = r2     // Catch:{ all -> 0x015a }
            r3.f225p = r6     // Catch:{ all -> 0x015a }
            java.lang.Object r5 = r5.a(r3)     // Catch:{ all -> 0x015a }
            if (r5 != r4) goto L_0x00af
            return r4
        L_0x00af:
            r5 = r2
        L_0x00b0:
            j7.f r2 = r3.f5330g     // Catch:{ all -> 0x0158 }
            q7.k.b(r2)     // Catch:{ all -> 0x0158 }
            y7.z0$b r10 = y7.z0.b.f8628f     // Catch:{ all -> 0x0158 }
            j7.f$b r2 = r2.d(r10)     // Catch:{ all -> 0x0158 }
            y7.z0 r2 = (y7.z0) r2     // Catch:{ all -> 0x0158 }
            r11 = r0
            r10 = r5
            r0 = r9
            goto L_0x0049
        L_0x00c1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f216k     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.get(r1)     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x00d5
            boolean r13 = r2.c()     // Catch:{ all -> 0x0155 }
            if (r13 == 0) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            java.util.concurrent.CancellationException r0 = r2.D()     // Catch:{ all -> 0x0155 }
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x00d5:
            if (r0 == 0) goto L_0x00dd
            boolean r13 = q7.k.a(r0, r12)     // Catch:{ all -> 0x0155 }
            if (r13 != 0) goto L_0x0102
        L_0x00dd:
            h2.d r0 = a1.a.f20f     // Catch:{ all -> 0x0155 }
            if (r12 != r0) goto L_0x00e3
            r0 = r9
            goto L_0x00e4
        L_0x00e3:
            r0 = r12
        L_0x00e4:
            r3.f218i = r1     // Catch:{ all -> 0x0155 }
            r3.f219j = r11     // Catch:{ all -> 0x0155 }
            r3.f220k = r10     // Catch:{ all -> 0x0155 }
            r3.f221l = r2     // Catch:{ all -> 0x0155 }
            r3.f222m = r12     // Catch:{ all -> 0x0155 }
            r3.f225p = r7     // Catch:{ all -> 0x0155 }
            java.lang.Object r0 = r11.emit(r0, r3)     // Catch:{ all -> 0x0155 }
            if (r0 != r4) goto L_0x00f7
            return r4
        L_0x00f7:
            r0 = r12
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x00fd:
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x0102:
            r10.getClass()     // Catch:{ all -> 0x0155 }
            h2.d r12 = a1.a.f15c     // Catch:{ all -> 0x0155 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = a8.h.f226a     // Catch:{ all -> 0x0155 }
            java.lang.Object r13 = r13.getAndSet(r10, r12)     // Catch:{ all -> 0x0155 }
            q7.k.b(r13)     // Catch:{ all -> 0x0155 }
            h2.d r14 = a1.a.f17d     // Catch:{ all -> 0x0155 }
            r15 = 0
            if (r13 != r14) goto L_0x0117
            r13 = r6
            goto L_0x0118
        L_0x0117:
            r13 = r15
        L_0x0118:
            if (r13 != 0) goto L_0x00c1
            r3.f218i = r1     // Catch:{ all -> 0x0155 }
            r3.f219j = r11     // Catch:{ all -> 0x0155 }
            r3.f220k = r10     // Catch:{ all -> 0x0155 }
            r3.f221l = r2     // Catch:{ all -> 0x0155 }
            r3.f222m = r0     // Catch:{ all -> 0x0155 }
            r3.f225p = r8     // Catch:{ all -> 0x0155 }
            y7.h r13 = new y7.h     // Catch:{ all -> 0x0155 }
            j7.d r14 = a1.a.x(r3)     // Catch:{ all -> 0x0155 }
            r13.<init>(r6, r14)     // Catch:{ all -> 0x0155 }
            r13.v()     // Catch:{ all -> 0x0155 }
        L_0x0132:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = a8.h.f226a     // Catch:{ all -> 0x0155 }
            boolean r16 = r14.compareAndSet(r10, r12, r13)     // Catch:{ all -> 0x0155 }
            if (r16 == 0) goto L_0x013c
            r15 = r6
            goto L_0x0142
        L_0x013c:
            java.lang.Object r14 = r14.get(r10)     // Catch:{ all -> 0x0155 }
            if (r14 == r12) goto L_0x0132
        L_0x0142:
            if (r15 != 0) goto L_0x0149
            h7.h r12 = h7.h.f4787a     // Catch:{ all -> 0x0155 }
            r13.i(r12)     // Catch:{ all -> 0x0155 }
        L_0x0149:
            java.lang.Object r12 = r13.u()     // Catch:{ all -> 0x0155 }
            if (r12 != r5) goto L_0x0150
            goto L_0x0152
        L_0x0150:
            h7.h r12 = h7.h.f4787a     // Catch:{ all -> 0x0155 }
        L_0x0152:
            if (r12 != r4) goto L_0x00c1
            return r4
        L_0x0155:
            r0 = move-exception
            r5 = r10
            goto L_0x015c
        L_0x0158:
            r0 = move-exception
            goto L_0x015c
        L_0x015a:
            r0 = move-exception
            r5 = r2
        L_0x015c:
            r11 = r1
        L_0x015d:
            r11.d(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.g.collect(a8.b, j7.d):java.lang.Object");
    }

    public final boolean compareAndSet(T t8, T t9) {
        T t10 = a1.a.f20f;
        if (t8 == null) {
            t8 = t10;
        }
        if (t9 == null) {
            t9 = t10;
        }
        return e(t8, t9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r12 = (a8.h[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r12 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        r0 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r3 >= r0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r4 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r4 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        r5 = a8.h.f226a;
        r6 = r5.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r6 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r7 = a1.a.f17d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r6 != r7) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        r8 = a1.a.f15c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r6 != r8) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (r5.compareAndSet(r4, r6, r7) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r5.get(r4) == r6) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0059, code lost:
        if (r5 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        if (r5.compareAndSet(r4, r6, r8) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r5.get(r4) == r6) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        if (r5 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        ((y7.h) r6).i(h7.h.f4787a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0077, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12 = r10.f217j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007a, code lost:
        if (r12 != r11) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007c, code lost:
        r10.f217j = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007f, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0080, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r11 = r10.f2615f;
        r0 = h7.h.f4787a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0085, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f216k     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x0093 }
            r2 = 0
            if (r11 == 0) goto L_0x0012
            boolean r11 = q7.k.a(r1, r11)     // Catch:{ all -> 0x0093 }
            if (r11 != 0) goto L_0x0012
            monitor-exit(r10)
            return r2
        L_0x0012:
            boolean r11 = q7.k.a(r1, r12)     // Catch:{ all -> 0x0093 }
            r1 = 1
            if (r11 == 0) goto L_0x001b
            monitor-exit(r10)
            return r1
        L_0x001b:
            r0.set(r10, r12)     // Catch:{ all -> 0x0093 }
            int r11 = r10.f217j     // Catch:{ all -> 0x0093 }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x008d
            int r11 = r11 + r1
            r10.f217j = r11     // Catch:{ all -> 0x0093 }
            S[] r12 = r10.f2615f     // Catch:{ all -> 0x0093 }
            h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x0093 }
            monitor-exit(r10)
        L_0x002c:
            a8.h[] r12 = (a8.h[]) r12
            if (r12 == 0) goto L_0x0077
            int r0 = r12.length
            r3 = r2
        L_0x0032:
            if (r3 >= r0) goto L_0x0077
            r4 = r12[r3]
            if (r4 == 0) goto L_0x0074
        L_0x0038:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a8.h.f226a
            java.lang.Object r6 = r5.get(r4)
            if (r6 != 0) goto L_0x0041
            goto L_0x0074
        L_0x0041:
            h2.d r7 = a1.a.f17d
            if (r6 != r7) goto L_0x0046
            goto L_0x0074
        L_0x0046:
            h2.d r8 = a1.a.f15c
            if (r6 != r8) goto L_0x005c
        L_0x004a:
            boolean r8 = r5.compareAndSet(r4, r6, r7)
            if (r8 == 0) goto L_0x0052
            r5 = r1
            goto L_0x0059
        L_0x0052:
            java.lang.Object r8 = r5.get(r4)
            if (r8 == r6) goto L_0x004a
            r5 = r2
        L_0x0059:
            if (r5 == 0) goto L_0x0038
            goto L_0x0074
        L_0x005c:
            boolean r7 = r5.compareAndSet(r4, r6, r8)
            if (r7 == 0) goto L_0x0064
            r5 = r1
            goto L_0x006b
        L_0x0064:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r6) goto L_0x005c
            r5 = r2
        L_0x006b:
            if (r5 == 0) goto L_0x0038
            y7.h r6 = (y7.h) r6
            h7.h r4 = h7.h.f4787a
            r6.i(r4)
        L_0x0074:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x0077:
            monitor-enter(r10)
            int r12 = r10.f217j     // Catch:{ all -> 0x008a }
            if (r12 != r11) goto L_0x0081
            int r11 = r11 + r1
            r10.f217j = r11     // Catch:{ all -> 0x008a }
            monitor-exit(r10)
            return r1
        L_0x0081:
            S[] r11 = r10.f2615f     // Catch:{ all -> 0x008a }
            h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x008a }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x002c
        L_0x008a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x008d:
            int r11 = r11 + 2
            r10.f217j = r11     // Catch:{ all -> 0x0093 }
            monitor-exit(r10)
            return r1
        L_0x0093:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.g.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object emit(T t8, d<? super h> dVar) {
        setValue(t8);
        return h.f4787a;
    }

    public final List<T> getReplayCache() {
        return a1.a.A(getValue());
    }

    public final T getValue() {
        T t8 = a1.a.f20f;
        T t9 = f216k.get(this);
        if (t9 == t8) {
            return null;
        }
        return t9;
    }

    public final void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final void setValue(T t8) {
        if (t8 == null) {
            t8 = a1.a.f20f;
        }
        e((Object) null, t8);
    }

    public final boolean tryEmit(T t8) {
        setValue(t8);
        return true;
    }
}
