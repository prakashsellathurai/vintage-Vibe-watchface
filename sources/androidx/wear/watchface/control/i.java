package androidx.wear.watchface.control;

import j7.d;
import j7.f;
import k3.j;
import l7.e;
import l7.h;
import p7.p;
import r1.h0;
import y7.z;

@e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$release$1$1$1", f = "InteractiveWatchFaceImpl.kt", l = {182}, m = "invokeSuspend")
public final class i extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f2300j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f2301k;

    @e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$release$1$1$1$1", f = "InteractiveWatchFaceImpl.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f2302j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h0 f2303k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f2303k = h0Var;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f2303k, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final java.lang.Object h(java.lang.Object r5) {
            /*
                r4 = this;
                k7.a r0 = k7.a.f5217f
                int r1 = r4.f2302j
                r2 = 1
                if (r1 == 0) goto L_0x0015
                if (r1 != r2) goto L_0x000d
                a1.a.I(r5)
                goto L_0x0029
            L_0x000d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0015:
                a1.a.I(r5)
                r1.h0 r5 = r4.f2303k
                n1.t0$c r5 = r5.f6708a
                if (r5 == 0) goto L_0x002b
                y7.o r5 = r5.f5748i
                r4.f2302j = r2
                java.lang.Object r5 = r5.s(r4)
                if (r5 != r0) goto L_0x0029
                return r0
            L_0x0029:
                n1.p0 r5 = (n1.p0) r5
            L_0x002b:
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r5 = androidx.wear.watchface.control.h.f2292a
                r1.h0 r4 = r4.f2303k
                java.lang.String r4 = r4.f6709b
                java.lang.String r5 = "instanceId"
                q7.k.e(r4, r5)
                java.lang.Object r5 = androidx.wear.watchface.control.h.f2293b
                monitor-enter(r5)
                java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r0 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x0062 }
                java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0062 }
                androidx.wear.watchface.control.h$c r1 = (androidx.wear.watchface.control.h.c) r1     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x005e
                int r2 = r1.f2299b     // Catch:{ all -> 0x0062 }
                int r2 = r2 + -1
                r1.f2299b = r2     // Catch:{ all -> 0x0062 }
                if (r2 != 0) goto L_0x005c
                r1.h0 r1 = r1.f2298a     // Catch:{ all -> 0x0062 }
                r1.getClass()     // Catch:{ all -> 0x0062 }
                r1.c0 r2 = new r1.c0     // Catch:{ all -> 0x0062 }
                r3 = 0
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0062 }
                k3.j.Z(r2)     // Catch:{ all -> 0x0062 }
                r0.remove(r4)     // Catch:{ all -> 0x0062 }
            L_0x005c:
                h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x0062 }
            L_0x005e:
                monitor-exit(r5)
                h7.h r4 = h7.h.f4787a
                return r4
            L_0x0062:
                r4 = move-exception
                monitor-exit(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.watchface.control.i.a.h(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h0 h0Var, d<? super i> dVar) {
        super(2, dVar);
        this.f2301k = h0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new i(this.f2301k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((i) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        h0 h0Var = this.f2301k;
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f2300j;
        if (i8 == 0) {
            a1.a.I(obj);
            f f9 = h0Var.f6710c.f();
            a aVar2 = new a(h0Var, (d<? super a>) null);
            this.f2300j = 1;
            if (j.i0(f9, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                a1.a.I(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7.h.f4787a;
    }
}
