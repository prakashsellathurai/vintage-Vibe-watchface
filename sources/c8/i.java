package c8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.k;
import q7.n;
import y7.b0;

public class i {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2852f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2853g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2854h;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends a<i> {

        /* renamed from: b  reason: collision with root package name */
        public final i f2855b;

        /* renamed from: c  reason: collision with root package name */
        public i f2856c;

        public a(i iVar) {
            this.f2855b = iVar;
        }

        public final void b(Object obj, Object obj2) {
            i iVar = (i) obj;
            boolean z8 = true;
            boolean z9 = obj2 == null;
            i iVar2 = this.f2855b;
            i iVar3 = z9 ? iVar2 : this.f2856c;
            if (iVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f2852f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, iVar3)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != this) {
                            z8 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z8 && z9) {
                    i iVar4 = this.f2856c;
                    k.b(iVar4);
                    iVar2.b(iVar4);
                }
            }
        }
    }

    public /* synthetic */ class b extends n {
        public b(Object obj) {
            super(obj);
        }
    }

    static {
        Class<i> cls = i.class;
        Class<Object> cls2 = Object.class;
        f2852f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f2853g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f2854h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r6 = ((c8.o) r6).f2866a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r5.compareAndSet(r4, r2, r6) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r5.get(r4) == r2) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r7 != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c8.i a() {
        /*
            r11 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f2853g
            java.lang.Object r1 = r0.get(r11)
            c8.i r1 = (c8.i) r1
            r2 = r1
        L_0x0009:
            r3 = 0
            r4 = r3
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f2852f
            java.lang.Object r6 = r5.get(r2)
            r7 = 0
            r8 = 1
            if (r6 != r11) goto L_0x002a
            if (r1 != r2) goto L_0x0018
            return r2
        L_0x0018:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L_0x0020
            r7 = r8
            goto L_0x0026
        L_0x0020:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L_0x0018
        L_0x0026:
            if (r7 != 0) goto L_0x0029
            goto L_0x0000
        L_0x0029:
            return r2
        L_0x002a:
            boolean r9 = r11.m()
            if (r9 == 0) goto L_0x0031
            return r3
        L_0x0031:
            if (r6 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r9 = r6 instanceof c8.n
            if (r9 == 0) goto L_0x003e
            c8.n r6 = (c8.n) r6
            r6.a(r2)
            goto L_0x0000
        L_0x003e:
            boolean r9 = r6 instanceof c8.o
            if (r9 == 0) goto L_0x0062
            if (r4 == 0) goto L_0x005b
            c8.o r6 = (c8.o) r6
            c8.i r6 = r6.f2866a
        L_0x0048:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L_0x0050
            r7 = r8
            goto L_0x0056
        L_0x0050:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L_0x0048
        L_0x0056:
            if (r7 != 0) goto L_0x0059
            goto L_0x0000
        L_0x0059:
            r2 = r4
            goto L_0x0009
        L_0x005b:
            java.lang.Object r2 = r0.get(r2)
            c8.i r2 = (c8.i) r2
            goto L_0x000b
        L_0x0062:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            q7.k.c(r6, r4)
            r4 = r6
            c8.i r4 = (c8.i) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.a():c8.i");
    }

    public final void b(i iVar) {
        boolean z8;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2853g;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (i() == iVar) {
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                            z8 = false;
                            continue;
                            break;
                        }
                    } else {
                        z8 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z8);
        if (m()) {
            iVar.a();
        }
    }

    public final Object i() {
        while (true) {
            Object obj = f2852f.get(this);
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final i k() {
        i iVar;
        Object i8 = i();
        o oVar = i8 instanceof o ? (o) i8 : null;
        if (oVar != null && (iVar = oVar.f2866a) != null) {
            return iVar;
        }
        k.c(i8, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (i) i8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: c8.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c8.i l() {
        /*
            r2 = this;
            c8.i r0 = r2.a()
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f2853g
            java.lang.Object r2 = r1.get(r2)
            c8.i r2 = (c8.i) r2
            r0 = r2
        L_0x000f:
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.Object r2 = r1.get(r0)
            r0 = r2
            c8.i r0 = (c8.i) r0
            goto L_0x000f
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.l():c8.i");
    }

    public boolean m() {
        return i() instanceof o;
    }

    public String toString() {
        return new b(this) + '@' + b0.l(this);
    }
}
