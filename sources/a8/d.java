package a8;

import h7.h;
import l7.c;
import l7.e;
import q7.k;
import s.g;
import y7.m0;
import y7.n0;

public class d<T> extends b8.a<e> implements c, b, a {

    /* renamed from: j  reason: collision with root package name */
    public final int f195j = 1;

    /* renamed from: k  reason: collision with root package name */
    public final int f196k = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public final int f197l = 2;

    /* renamed from: m  reason: collision with root package name */
    public Object[] f198m;

    /* renamed from: n  reason: collision with root package name */
    public long f199n;

    /* renamed from: o  reason: collision with root package name */
    public long f200o;

    /* renamed from: p  reason: collision with root package name */
    public int f201p;

    /* renamed from: q  reason: collision with root package name */
    public int f202q;

    public static final class a implements m0 {

        /* renamed from: f  reason: collision with root package name */
        public final d<?> f203f;

        /* renamed from: g  reason: collision with root package name */
        public final long f204g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f205h;

        /* renamed from: i  reason: collision with root package name */
        public final j7.d<h> f206i;

        public a(d dVar, long j8, Object obj, y7.h hVar) {
            this.f203f = dVar;
            this.f204g = j8;
            this.f205h = obj;
            this.f206i = hVar;
        }

        public final void f() {
            d<?> dVar = this.f203f;
            synchronized (dVar) {
                if (this.f204g >= dVar.k()) {
                    Object[] objArr = dVar.f198m;
                    k.b(objArr);
                    int i8 = (int) this.f204g;
                    if (objArr[(objArr.length - 1) & i8] == this) {
                        objArr[i8 & (objArr.length - 1)] = a1.a.f13b;
                        dVar.f();
                        h hVar = h.f4787a;
                    }
                }
            }
        }
    }

    @e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    public static final class b<T> extends c {

        /* renamed from: i  reason: collision with root package name */
        public Object f207i;

        /* renamed from: j  reason: collision with root package name */
        public Object f208j;

        /* renamed from: k  reason: collision with root package name */
        public Object f209k;

        /* renamed from: l  reason: collision with root package name */
        public Object f210l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f211m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ d<T> f212n;

        /* renamed from: o  reason: collision with root package name */
        public int f213o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d<T> dVar, j7.d<? super b> dVar2) {
            super(dVar2);
            this.f212n = dVar;
        }

        public final Object h(Object obj) {
            this.f211m = obj;
            this.f213o |= Integer.MIN_VALUE;
            return d.g(this.f212n, (b) null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: a8.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0 A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.lang.Object g(a8.d<T> r8, a8.b<? super T> r9, j7.d<?> r10) {
        /*
            boolean r0 = r10 instanceof a8.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            a8.d$b r0 = (a8.d.b) r0
            int r1 = r0.f213o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f213o = r1
            goto L_0x0018
        L_0x0013:
            a8.d$b r0 = new a8.d$b
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f211m
            k7.a r1 = k7.a.f5217f
            int r2 = r0.f213o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            java.lang.Object r8 = r0.f210l
            y7.z0 r8 = (y7.z0) r8
            java.lang.Object r9 = r0.f209k
            a8.e r9 = (a8.e) r9
            java.lang.Object r2 = r0.f208j
            a8.b r2 = (a8.b) r2
            java.lang.Object r5 = r0.f207i
            a8.d r5 = (a8.d) r5
            a1.a.I(r10)     // Catch:{ all -> 0x0046 }
            goto L_0x0097
        L_0x0046:
            r8 = move-exception
        L_0x0047:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00d5
        L_0x004c:
            java.lang.Object r8 = r0.f209k
            r9 = r8
            a8.e r9 = (a8.e) r9
            java.lang.Object r8 = r0.f208j
            a8.b r8 = (a8.b) r8
            java.lang.Object r2 = r0.f207i
            a8.d r2 = (a8.d) r2
            a1.a.I(r10)     // Catch:{ all -> 0x005f }
            r10 = r8
            r8 = r2
            goto L_0x0087
        L_0x005f:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00d5
        L_0x0065:
            a1.a.I(r10)
            b8.b r10 = r8.a()
            a8.e r10 = (a8.e) r10
            boolean r2 = r9 instanceof a8.i     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x0084
            r2 = r9
            a8.i r2 = (a8.i) r2     // Catch:{ all -> 0x00d4 }
            r0.f207i = r8     // Catch:{ all -> 0x00d4 }
            r0.f208j = r9     // Catch:{ all -> 0x00d4 }
            r0.f209k = r10     // Catch:{ all -> 0x00d4 }
            r0.f213o = r5     // Catch:{ all -> 0x00d4 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x00d4 }
            if (r2 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0087:
            j7.f r2 = r0.f5330g     // Catch:{ all -> 0x00cf }
            q7.k.b(r2)     // Catch:{ all -> 0x00cf }
            y7.z0$b r5 = y7.z0.b.f8628f     // Catch:{ all -> 0x00cf }
            j7.f$b r2 = r2.d(r5)     // Catch:{ all -> 0x00cf }
            y7.z0 r2 = (y7.z0) r2     // Catch:{ all -> 0x00cf }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0097:
            java.lang.Object r10 = r5.o(r9)     // Catch:{ all -> 0x0046 }
            h2.d r6 = a1.a.f13b     // Catch:{ all -> 0x0046 }
            if (r10 != r6) goto L_0x00b0
            r0.f207i = r5     // Catch:{ all -> 0x0046 }
            r0.f208j = r2     // Catch:{ all -> 0x0046 }
            r0.f209k = r9     // Catch:{ all -> 0x0046 }
            r0.f210l = r8     // Catch:{ all -> 0x0046 }
            r0.f213o = r4     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r5.e(r9, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x00b0:
            if (r8 == 0) goto L_0x00be
            boolean r6 = r8.c()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            java.util.concurrent.CancellationException r8 = r8.D()     // Catch:{ all -> 0x0046 }
            throw r8     // Catch:{ all -> 0x0046 }
        L_0x00be:
            r0.f207i = r5     // Catch:{ all -> 0x0046 }
            r0.f208j = r2     // Catch:{ all -> 0x0046 }
            r0.f209k = r9     // Catch:{ all -> 0x0046 }
            r0.f210l = r8     // Catch:{ all -> 0x0046 }
            r0.f213o = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x0046 }
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x00cf:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x0047
        L_0x00d4:
            r9 = move-exception
        L_0x00d5:
            r8.d(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.d.g(a8.d, a8.b, j7.d):java.lang.Object");
    }

    public final b8.b b() {
        return new e();
    }

    public final b8.b[] c() {
        return new e[2];
    }

    public final Object collect(b<? super T> bVar, j7.d<?> dVar) {
        return g(this, bVar, dVar);
    }

    public final Object e(e eVar, b bVar) {
        y7.h hVar = new y7.h(1, a1.a.x(bVar));
        hVar.v();
        synchronized (this) {
            if (n(eVar) < 0) {
                eVar.f215b = hVar;
            } else {
                hVar.i(h.f4787a);
            }
            h hVar2 = h.f4787a;
        }
        Object u8 = hVar.u();
        return u8 == k7.a.f5217f ? u8 : h.f4787a;
    }

    public final Object emit(T t8, j7.d<? super h> dVar) {
        a aVar;
        j7.d[] dVarArr;
        if (!tryEmit(t8)) {
            y7.h hVar = new y7.h(1, a1.a.x(dVar));
            hVar.v();
            j7.d[] dVarArr2 = a1.a.e;
            synchronized (this) {
                if (m(t8)) {
                    hVar.i(h.f4787a);
                    dVarArr = j(dVarArr2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, ((long) (this.f201p + this.f202q)) + k(), t8, hVar);
                    i(aVar2);
                    this.f202q++;
                    if (this.f196k == 0) {
                        dVarArr2 = j(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                hVar.b(new n0(0, aVar));
            }
            for (j7.d dVar2 : dVarArr) {
                if (dVar2 != null) {
                    dVar2.i(h.f4787a);
                }
            }
            Object u8 = hVar.u();
            k7.a aVar3 = k7.a.f5217f;
            if (u8 != aVar3) {
                u8 = h.f4787a;
            }
            if (u8 == aVar3) {
                return u8;
            }
        }
        return h.f4787a;
    }

    public final void f() {
        if (this.f196k != 0 || this.f202q > 1) {
            Object[] objArr = this.f198m;
            k.b(objArr);
            while (this.f202q > 0) {
                long k8 = k();
                int i8 = this.f201p;
                int i9 = this.f202q;
                if (objArr[((int) ((k8 + ((long) (i8 + i9))) - 1)) & (objArr.length - 1)] == a1.a.f13b) {
                    this.f202q = i9 - 1;
                    objArr[((int) (k() + ((long) (this.f201p + this.f202q)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        S[] sArr;
        Object[] objArr = this.f198m;
        k.b(objArr);
        objArr[((int) k()) & (objArr.length - 1)] = null;
        this.f201p--;
        long k8 = k() + 1;
        if (this.f199n < k8) {
            this.f199n = k8;
        }
        if (this.f200o < k8) {
            if (!(this.f2616g == 0 || (sArr = this.f2615f) == null)) {
                for (S s8 : sArr) {
                    if (s8 != null) {
                        e eVar = (e) s8;
                        long j8 = eVar.f214a;
                        if (j8 >= 0 && j8 < k8) {
                            eVar.f214a = k8;
                        }
                    }
                }
            }
            this.f200o = k8;
        }
    }

    public final void i(Object obj) {
        int i8 = this.f201p + this.f202q;
        Object[] objArr = this.f198m;
        if (objArr == null) {
            objArr = l(0, 2, (Object[]) null);
        } else if (i8 >= objArr.length) {
            objArr = l(i8, objArr.length * 2, objArr);
        }
        objArr[((int) (k() + ((long) i8))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j7.d<h7.h>[] j(j7.d<h7.h>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f2616g
            if (r1 == 0) goto L_0x0043
            S[] r1 = r10.f2615f
            if (r1 == 0) goto L_0x0043
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x0043
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0040
            a8.e r4 = (a8.e) r4
            y7.h r5 = r4.f215b
            if (r5 != 0) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            long r6 = r10.n(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0040
            int r6 = r11.length
            if (r0 < r6) goto L_0x0035
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            q7.k.d(r11, r6)
        L_0x0035:
            r6 = r11
            j7.d[] r6 = (j7.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f215b = r0
            r0 = r7
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0043:
            j7.d[] r11 = (j7.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.d.j(j7.d[]):j7.d[]");
    }

    public final long k() {
        return Math.min(this.f200o, this.f199n);
    }

    public final Object[] l(int i8, int i9, Object[] objArr) {
        if (i9 > 0) {
            Object[] objArr2 = new Object[i9];
            this.f198m = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long k8 = k();
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = (int) (((long) i10) + k8);
                objArr2[i11 & (i9 - 1)] = objArr[(objArr.length - 1) & i11];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean m(T t8) {
        int i8 = this.f2616g;
        int i9 = this.f195j;
        if (i8 == 0) {
            if (i9 != 0) {
                i(t8);
                int i10 = this.f201p + 1;
                this.f201p = i10;
                if (i10 > i9) {
                    h();
                }
                this.f200o = k() + ((long) this.f201p);
            }
            return true;
        }
        int i11 = this.f201p;
        int i12 = this.f196k;
        if (i11 >= i12 && this.f200o <= this.f199n) {
            int b9 = g.b(this.f197l);
            if (b9 == 0) {
                return false;
            }
            if (b9 == 2) {
                return true;
            }
        }
        i(t8);
        int i13 = this.f201p + 1;
        this.f201p = i13;
        if (i13 > i12) {
            h();
        }
        long k8 = k() + ((long) this.f201p);
        long j8 = this.f199n;
        if (((int) (k8 - j8)) > i9) {
            p(1 + j8, this.f200o, k() + ((long) this.f201p), k() + ((long) this.f201p) + ((long) this.f202q));
        }
        return true;
    }

    public final long n(e eVar) {
        long j8 = eVar.f214a;
        if (j8 < k() + ((long) this.f201p)) {
            return j8;
        }
        if (this.f196k <= 0 && j8 <= k() && this.f202q != 0) {
            return j8;
        }
        return -1;
    }

    public final Object o(e eVar) {
        Object obj;
        j7.d[] dVarArr = a1.a.e;
        synchronized (this) {
            long n8 = n(eVar);
            if (n8 < 0) {
                obj = a1.a.f13b;
            } else {
                long j8 = eVar.f214a;
                Object[] objArr = this.f198m;
                k.b(objArr);
                Object obj2 = objArr[((int) n8) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f205h;
                }
                eVar.f214a = n8 + 1;
                Object obj3 = obj2;
                dVarArr = q(j8);
                obj = obj3;
            }
        }
        for (j7.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.i(h.f4787a);
            }
        }
        return obj;
    }

    public final void p(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long k8 = k(); k8 < min; k8++) {
            Object[] objArr = this.f198m;
            k.b(objArr);
            objArr[((int) k8) & (objArr.length - 1)] = null;
        }
        this.f199n = j8;
        this.f200o = j9;
        this.f201p = (int) (j10 - min);
        this.f202q = (int) (j11 - j10);
    }

    public final j7.d<h>[] q(long j8) {
        long j9;
        long j10;
        long j11;
        S[] sArr;
        int i8 = (j8 > this.f200o ? 1 : (j8 == this.f200o ? 0 : -1));
        j7.d<h>[] dVarArr = a1.a.e;
        if (i8 > 0) {
            return dVarArr;
        }
        long k8 = k();
        long j12 = ((long) this.f201p) + k8;
        int i9 = this.f196k;
        if (i9 == 0 && this.f202q > 0) {
            j12++;
        }
        if (!(this.f2616g == 0 || (sArr = this.f2615f) == null)) {
            for (S s8 : sArr) {
                if (s8 != null) {
                    long j13 = ((e) s8).f214a;
                    if (j13 >= 0 && j13 < j12) {
                        j12 = j13;
                    }
                }
            }
        }
        if (j12 <= this.f200o) {
            return dVarArr;
        }
        long k9 = k() + ((long) this.f201p);
        int min = this.f2616g > 0 ? Math.min(this.f202q, i9 - ((int) (k9 - j12))) : this.f202q;
        long j14 = ((long) this.f202q) + k9;
        h2.d dVar = a1.a.f13b;
        if (min > 0) {
            dVarArr = new j7.d[min];
            Object[] objArr = this.f198m;
            k.b(objArr);
            long j15 = k9;
            int i10 = 0;
            while (true) {
                if (k9 >= j14) {
                    j10 = j12;
                    j9 = j14;
                    break;
                }
                j10 = j12;
                int i11 = (int) k9;
                Object obj = objArr[(objArr.length - 1) & i11];
                if (obj != dVar) {
                    j9 = j14;
                    k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) obj;
                    int i12 = i10 + 1;
                    dVarArr[i10] = aVar.f206i;
                    objArr[i11 & (objArr.length - 1)] = dVar;
                    objArr[((int) j15) & (objArr.length - 1)] = aVar.f205h;
                    j11 = 1;
                    j15++;
                    if (i12 >= min) {
                        break;
                    }
                    i10 = i12;
                } else {
                    j9 = j14;
                    j11 = 1;
                }
                k9 += j11;
                j12 = j10;
                j14 = j9;
            }
            k9 = j15;
        } else {
            j10 = j12;
            j9 = j14;
        }
        j7.d<h>[] dVarArr2 = dVarArr;
        int i13 = (int) (k9 - k8);
        long j16 = this.f2616g == 0 ? k9 : j10;
        long max = Math.max(this.f199n, k9 - ((long) Math.min(this.f195j, i13)));
        if (i9 == 0 && max < j9) {
            Object[] objArr2 = this.f198m;
            k.b(objArr2);
            if (k.a(objArr2[((int) max) & (objArr2.length - 1)], dVar)) {
                k9++;
                max++;
            }
        }
        p(max, j16, k9, j9);
        f();
        return (dVarArr2.length == 0) ^ true ? j(dVarArr2) : dVarArr2;
    }

    public final boolean tryEmit(T t8) {
        int i8;
        boolean z8;
        j7.d[] dVarArr = a1.a.e;
        synchronized (this) {
            if (m(t8)) {
                dVarArr = j(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (j7.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.i(h.f4787a);
            }
        }
        return z8;
    }
}
