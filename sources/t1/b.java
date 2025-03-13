package t1;

import a8.g;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.health.services.client.impl.i;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.wear.watchface.data.IdAndComplicationDataWireFormat;
import androidx.wear.watchface.editor.EditorSession;
import androidx.wear.watchface.editor.data.EditorStateWireFormat;
import androidx.wear.watchface.style.data.UserStyleWireFormat;
import h7.f;
import j7.d;
import java.io.Closeable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.j;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.e;
import l7.h;
import n1.i0;
import n1.i1;
import n1.s;
import p7.p;
import q7.k;
import t1.l;
import y7.o;
import y7.r1;
import y7.z;

public abstract class b implements EditorSession {

    /* renamed from: f  reason: collision with root package name */
    public ComponentActivity f7377f;

    /* renamed from: g  reason: collision with root package name */
    public j f7378g;

    /* renamed from: h  reason: collision with root package name */
    public final z f7379h;

    /* renamed from: i  reason: collision with root package name */
    public final y f7380i;

    /* renamed from: j  reason: collision with root package name */
    public final o1.c f7381j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7382k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7383l;

    /* renamed from: m  reason: collision with root package name */
    public final v1.a f7384m = new v1.a("EditorSession");

    /* renamed from: n  reason: collision with root package name */
    public final c f7385n;

    /* renamed from: o  reason: collision with root package name */
    public final o1.c f7386o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7387p;

    /* renamed from: q  reason: collision with root package name */
    public final o f7388q;
    public final g r;

    /* renamed from: s  reason: collision with root package name */
    public final g f7389s;

    /* renamed from: t  reason: collision with root package name */
    public o f7390t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.activity.result.c<h> f7391u;

    /* renamed from: v  reason: collision with root package name */
    public final f f7392v;

    @e(c = "androidx.wear.watchface.editor.BaseEditorSession$close$1", f = "EditorSession.kt", l = {716}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f7393j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f7394k;

        @e(c = "androidx.wear.watchface.editor.BaseEditorSession$close$1$1", f = "EditorSession.kt", l = {717}, m = "invokeSuspend")
        /* renamed from: t1.b$a$a  reason: collision with other inner class name */
        public static final class C0121a extends h implements p<z, d<? super h7.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f7395j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ b f7396k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0121a(b bVar, d<? super C0121a> dVar) {
                super(2, dVar);
                this.f7396k = bVar;
            }

            public final d<h7.h> c(Object obj, d<?> dVar) {
                return new C0121a(this.f7396k, dVar);
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0121a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                Bundle bundle;
                y yVar;
                k7.a aVar = k7.a.f5217f;
                int i8 = this.f7395j;
                boolean z8 = true;
                if (i8 == 0) {
                    a1.a.I(obj);
                    o oVar = this.f7396k.f7388q;
                    this.f7395j = 1;
                    if (oVar.s(this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    a1.a.I(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b bVar = this.f7396k;
                if (!bVar.f7387p || (yVar = bVar.f7380i) == null) {
                    bundle = null;
                } else {
                    n1.z zVar = yVar.f7462a;
                    Instant instant = yVar.f7463b;
                    Map map = (Map) bVar.r.getValue();
                    u uVar = (u) bVar;
                    k.e(zVar, "renderParameters");
                    k.e(instant, "instant");
                    uVar.s();
                    if (zVar.f5891a != s.f5711f) {
                        z8 = false;
                    }
                    if (z8) {
                        i0.b bVar2 = uVar.y;
                        if (bVar2 != null) {
                            if (k.a(instant, EditorSession.f2369b)) {
                                i0.b bVar3 = uVar.y;
                                if (bVar3 != null) {
                                    instant = bVar3.f();
                                } else {
                                    k.h("editorDelegate");
                                    throw null;
                                }
                            }
                            bundle = a.b.a(bVar2.j(zVar, instant, map));
                        } else {
                            k.h("editorDelegate");
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("Currently only DrawMode.INTERACTIVE is supported".toString());
                    }
                }
                f fVar = l.f7438f;
                l a9 = l.c.a();
                b bVar4 = this.f7396k;
                String str = bVar4.f7381j.f6003a;
                UserStyleWireFormat userStyleWireFormat = new UserStyleWireFormat(((u) bVar4).D.getValue().a());
                b bVar5 = this.f7396k;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) this.f7396k.r.getValue()).entrySet()) {
                    Object obj2 = bVar5.p().getValue().get(entry.getKey());
                    k.b(obj2);
                    IdAndComplicationDataWireFormat idAndComplicationDataWireFormat = ((o1.a) obj2).e ? new IdAndComplicationDataWireFormat(((Number) entry.getKey()).intValue(), ((q1.b) entry.getValue()).a()) : null;
                    if (idAndComplicationDataWireFormat != null) {
                        arrayList.add(idAndComplicationDataWireFormat);
                    }
                }
                EditorStateWireFormat editorStateWireFormat = new EditorStateWireFormat(str, userStyleWireFormat, arrayList, this.f7396k.f7387p, bundle);
                a9.getClass();
                synchronized (a9.f7439a) {
                    for (Map.Entry<Integer, n> value : a9.f7441c.entrySet()) {
                        n nVar = (n) value.getValue();
                        if (nVar.asBinder().isBinderAlive()) {
                            nVar.k(editorStateWireFormat);
                        }
                    }
                }
                return h7.h.f4787a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7394k = bVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f7394k, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f7393j;
            b bVar = this.f7394k;
            if (i8 == 0) {
                a1.a.I(obj);
                C0121a aVar2 = new C0121a(bVar, (d<? super C0121a>) null);
                this.f7393j = 1;
                if (j.j0(500, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                try {
                    a1.a.I(obj);
                } catch (r1 e) {
                    Log.w("EditorSession", "Ignoring exception in close", e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar.q();
            bVar.f7382k = true;
            bVar.f7384m.close();
            bVar.f7377f = null;
            bVar.f7378g = null;
            bVar.f7391u = null;
            return h7.h.f4787a;
        }
    }

    @e(c = "androidx.wear.watchface.editor.BaseEditorSession", f = "EditorSession.kt", l = {649}, m = "getPreviewData$watchface_editor_release")
    /* renamed from: t1.b$b  reason: collision with other inner class name */
    public static final class C0122b extends l7.c {

        /* renamed from: i  reason: collision with root package name */
        public Object f7397i;

        /* renamed from: j  reason: collision with root package name */
        public Object f7398j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f7399k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ b f7400l;

        /* renamed from: m  reason: collision with root package name */
        public int f7401m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0122b(b bVar, d<? super C0122b> dVar) {
            super(dVar);
            this.f7400l = bVar;
        }

        public final Object h(Object obj) {
            this.f7399k = obj;
            this.f7401m |= Integer.MIN_VALUE;
            return this.f7400l.d((p1.c) null, (p1.a) null, this);
        }
    }

    @e(c = "androidx.wear.watchface.editor.BaseEditorSession", f = "EditorSession.kt", l = {555, 572, 584}, m = "openComplicationDataSourceChooser$suspendImpl")
    public static final class c extends l7.c {

        /* renamed from: i  reason: collision with root package name */
        public Object f7402i;

        /* renamed from: j  reason: collision with root package name */
        public Closeable f7403j;

        /* renamed from: k  reason: collision with root package name */
        public Object f7404k;

        /* renamed from: l  reason: collision with root package name */
        public Object f7405l;

        /* renamed from: m  reason: collision with root package name */
        public Object f7406m;

        /* renamed from: n  reason: collision with root package name */
        public int f7407n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f7408o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ b f7409p;

        /* renamed from: q  reason: collision with root package name */
        public int f7410q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, d<? super c> dVar) {
            super(dVar);
            this.f7409p = bVar;
        }

        public final Object h(Object obj) {
            this.f7408o = obj;
            this.f7410q |= Integer.MIN_VALUE;
            return b.o(this.f7409p, 0, this);
        }
    }

    public b(ComponentActivity componentActivity, EditorSession.Companion.b bVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, y yVar, o1.c cVar) {
        k.e(cVar, "watchFaceIdInternal");
        this.f7377f = componentActivity;
        this.f7378g = bVar;
        this.f7379h = lifecycleCoroutineScopeImpl;
        this.f7380i = yVar;
        this.f7381j = cVar;
        c cVar2 = new c(this);
        this.f7385n = cVar2;
        this.f7386o = new o1.c(i1.c(cVar.f6003a));
        f fVar = l.f7438f;
        l a9 = l.c.a();
        a9.getClass();
        synchronized (a9.f7439a) {
            a9.e.add(cVar2);
        }
        this.f7387p = true;
        this.f7388q = j.d();
        i7.l lVar = i7.l.f4880f;
        this.r = a1.a.c(lVar);
        this.f7389s = a1.a.c(lVar);
        ComponentActivity componentActivity2 = this.f7377f;
        k.b(componentActivity2);
        g gVar = new g();
        i iVar = new i(1, this);
        this.f7391u = componentActivity2.f251l.c("activity_rq#" + componentActivity2.f250k.getAndIncrement(), componentActivity2, gVar, iVar);
        this.f7392v = a1.a.z(new d(this));
        a1.a.z(new a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: p1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: p1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: t1.b} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0177 A[Catch:{ all -> 0x006c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0190 A[Catch:{ all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public static java.lang.Object o(t1.b r18, int r19, j7.d<? super t1.f> r20) {
        /*
            r7 = r18
            r0 = r19
            r1 = r20
            java.lang.String r2 = "Can't configure fixed complication ID "
            boolean r3 = r1 instanceof t1.b.c
            if (r3 == 0) goto L_0x001b
            r3 = r1
            t1.b$c r3 = (t1.b.c) r3
            int r4 = r3.f7410q
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.f7410q = r4
            goto L_0x0020
        L_0x001b:
            t1.b$c r3 = new t1.b$c
            r3.<init>(r7, r1)
        L_0x0020:
            r8 = r3
            java.lang.Object r1 = r8.f7408o
            k7.a r9 = k7.a.f5217f
            int r3 = r8.f7410q
            r10 = 2
            r11 = 3
            r12 = 1
            r13 = 0
            if (r3 == 0) goto L_0x007f
            if (r3 == r12) goto L_0x006f
            if (r3 == r10) goto L_0x0054
            if (r3 != r11) goto L_0x004c
            int r0 = r8.f7407n
            java.lang.Object r2 = r8.f7406m
            p1.a r2 = (p1.a) r2
            java.lang.Object r3 = r8.f7405l
            p1.c r3 = (p1.c) r3
            java.lang.Object r4 = r8.f7404k
            t1.i r4 = (t1.i) r4
            java.io.Closeable r5 = r8.f7403j
            java.lang.Object r6 = r8.f7402i
            t1.b r6 = (t1.b) r6
            a1.a.I(r1)     // Catch:{ all -> 0x006c }
            goto L_0x0178
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            int r0 = r8.f7407n
            java.lang.Object r2 = r8.f7405l
            r3 = r2
            p1.c r3 = (p1.c) r3
            java.lang.Object r2 = r8.f7404k
            t1.i r2 = (t1.i) r2
            java.io.Closeable r5 = r8.f7403j
            java.lang.Object r4 = r8.f7402i
            r6 = r4
            t1.b r6 = (t1.b) r6
            a1.a.I(r1)     // Catch:{ all -> 0x006c }
            r4 = r2
            goto L_0x0130
        L_0x006c:
            r0 = move-exception
            goto L_0x01b6
        L_0x006f:
            int r0 = r8.f7407n
            java.io.Closeable r2 = r8.f7403j
            java.lang.Object r3 = r8.f7402i
            t1.b r3 = (t1.b) r3
            a1.a.I(r1)     // Catch:{ all -> 0x007c }
            goto L_0x00fb
        L_0x007c:
            r0 = move-exception
            goto L_0x01cb
        L_0x007f:
            a1.a.I(r1)
            v1.c r14 = new v1.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "BaseEditorSession.openComplicationDataSourceChooser "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r14.<init>(r1)
            r18.s()     // Catch:{ all -> 0x01fb }
            kotlinx.coroutines.flow.MutableStateFlow r1 = r18.p()     // Catch:{ all -> 0x01fb }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x01fb }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x01fb }
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ all -> 0x01fb }
            r3.<init>(r0)     // Catch:{ all -> 0x01fb }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x01fb }
            q7.k.b(r1)     // Catch:{ all -> 0x01fb }
            o1.a r1 = (o1.a) r1     // Catch:{ all -> 0x01fb }
            boolean r1 = r1.f5994h     // Catch:{ all -> 0x01fb }
            r1 = r1 ^ r12
            if (r1 == 0) goto L_0x01e5
            r7.t(r12)     // Catch:{ all -> 0x01fb }
            y7.o r15 = k3.j.d()     // Catch:{ all -> 0x01fb }
            monitor-enter(r18)     // Catch:{ all -> 0x01fb }
            y7.o r1 = r7.f7390t     // Catch:{ all -> 0x01d9 }
            if (r1 != 0) goto L_0x01db
            r7.f7390t = r15     // Catch:{ all -> 0x01d9 }
            androidx.activity.result.c<t1.h> r6 = r7.f7391u     // Catch:{ all -> 0x01d9 }
            q7.k.b(r6)     // Catch:{ all -> 0x01d9 }
            t1.h r5 = new t1.h     // Catch:{ all -> 0x01d9 }
            o1.c r1 = r7.f7381j     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r1.f6003a     // Catch:{ all -> 0x01d9 }
            android.content.Intent r16 = r18.g()     // Catch:{ all -> 0x01d9 }
            android.content.Intent r17 = r18.h()     // Catch:{ all -> 0x01d9 }
            r1 = r5
            r2 = r18
            r3 = r19
            r11 = r5
            r5 = r16
            r10 = r6
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01d9 }
            r10.a(r11)     // Catch:{ all -> 0x01d9 }
            h7.h r1 = h7.h.f4787a     // Catch:{ all -> 0x01d9 }
            monitor-exit(r18)     // Catch:{ all -> 0x01fb }
            r8.f7402i = r7     // Catch:{ all -> 0x01c8 }
            r8.f7403j = r14     // Catch:{ all -> 0x01c8 }
            r8.f7407n = r0     // Catch:{ all -> 0x01c8 }
            r8.f7410q = r12     // Catch:{ all -> 0x01c8 }
            java.lang.Object r1 = r15.s(r8)     // Catch:{ all -> 0x01c8 }
            if (r1 != r9) goto L_0x00f9
            return r9
        L_0x00f9:
            r3 = r7
            r2 = r14
        L_0x00fb:
            t1.i r1 = (t1.i) r1     // Catch:{ all -> 0x007c }
            monitor-enter(r3)     // Catch:{ all -> 0x01c5 }
            r3.f7390t = r13     // Catch:{ all -> 0x01c2 }
            h7.h r4 = h7.h.f4787a     // Catch:{ all -> 0x01c2 }
            monitor-exit(r3)     // Catch:{ all -> 0x01c5 }
            r4 = 0
            r3.t(r4)     // Catch:{ all -> 0x01c5 }
            if (r1 != 0) goto L_0x010d
            k3.j.n(r2, r13)
            return r13
        L_0x010d:
            t1.j r4 = r3.f7378g     // Catch:{ all -> 0x01c5 }
            q7.k.b(r4)     // Catch:{ all -> 0x01c5 }
            p1.c r4 = r4.a()     // Catch:{ all -> 0x01c5 }
            y7.o r5 = r3.f7388q     // Catch:{ all -> 0x01ba }
            r8.f7402i = r3     // Catch:{ all -> 0x01ba }
            r8.f7403j = r2     // Catch:{ all -> 0x01ba }
            r8.f7404k = r1     // Catch:{ all -> 0x01ba }
            r8.f7405l = r4     // Catch:{ all -> 0x01ba }
            r8.f7407n = r0     // Catch:{ all -> 0x01ba }
            r6 = 2
            r8.f7410q = r6     // Catch:{ all -> 0x01ba }
            java.lang.Object r5 = r5.s(r8)     // Catch:{ all -> 0x01ba }
            if (r5 != r9) goto L_0x012c
            return r9
        L_0x012c:
            r5 = r2
            r6 = r3
            r3 = r4
            r4 = r1
        L_0x0130:
            a8.g r1 = r6.f7389s     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x006c }
            java.lang.Integer r2 = new java.lang.Integer     // Catch:{ all -> 0x006c }
            r2.<init>(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x006c }
            r2 = r1
            p1.a r2 = (p1.a) r2     // Catch:{ all -> 0x006c }
            a8.g r1 = r6.f7389s     // Catch:{ all -> 0x006c }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x006c }
            a8.g r10 = r6.f7389s     // Catch:{ all -> 0x006c }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x006c }
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x006c }
            r7.<init>(r10)     // Catch:{ all -> 0x006c }
            java.lang.Integer r10 = new java.lang.Integer     // Catch:{ all -> 0x006c }
            r10.<init>(r0)     // Catch:{ all -> 0x006c }
            p1.a r11 = r4.f7434a     // Catch:{ all -> 0x006c }
            r7.put(r10, r11)     // Catch:{ all -> 0x006c }
            r1.setValue(r7)     // Catch:{ all -> 0x006c }
            p1.a r1 = r4.f7434a     // Catch:{ all -> 0x006c }
            r8.f7402i = r6     // Catch:{ all -> 0x006c }
            r8.f7403j = r5     // Catch:{ all -> 0x006c }
            r8.f7404k = r4     // Catch:{ all -> 0x006c }
            r8.f7405l = r3     // Catch:{ all -> 0x006c }
            r8.f7406m = r2     // Catch:{ all -> 0x006c }
            r8.f7407n = r0     // Catch:{ all -> 0x006c }
            r7 = 3
            r8.f7410q = r7     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r6.d(r3, r1, r8)     // Catch:{ all -> 0x006c }
            if (r1 != r9) goto L_0x0178
            return r9
        L_0x0178:
            q1.b r1 = (q1.b) r1     // Catch:{ all -> 0x006c }
            a8.g r7 = r6.r     // Catch:{ all -> 0x006c }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x006c }
            a8.g r9 = r6.r     // Catch:{ all -> 0x006c }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x006c }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x006c }
            r8.<init>(r9)     // Catch:{ all -> 0x006c }
            java.lang.Integer r9 = new java.lang.Integer     // Catch:{ all -> 0x006c }
            r9.<init>(r0)     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x0195
            q1.h r1 = new q1.h     // Catch:{ all -> 0x006c }
            r1.<init>()     // Catch:{ all -> 0x006c }
        L_0x0195:
            r8.put(r9, r1)     // Catch:{ all -> 0x006c }
            r7.setValue(r8)     // Catch:{ all -> 0x006c }
            p1.a r1 = r4.f7434a     // Catch:{ all -> 0x006c }
            r6.n(r0, r2, r1)     // Catch:{ all -> 0x006c }
            t1.f r1 = new t1.f     // Catch:{ all -> 0x006c }
            p1.a r2 = r4.f7434a     // Catch:{ all -> 0x006c }
            android.os.Bundle r4 = r4.f7435b     // Catch:{ all -> 0x006c }
            r1.<init>(r0, r2, r4)     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x01b3 }
            r6.j()     // Catch:{ all -> 0x01b3 }
            k3.j.n(r5, r13)
            return r1
        L_0x01b3:
            r0 = move-exception
            r14 = r5
            goto L_0x01fc
        L_0x01b6:
            r4 = r3
            r2 = r5
            r3 = r6
            goto L_0x01bb
        L_0x01ba:
            r0 = move-exception
        L_0x01bb:
            r4.close()     // Catch:{ all -> 0x01c5 }
            r3.j()     // Catch:{ all -> 0x01c5 }
            throw r0     // Catch:{ all -> 0x01c5 }
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01c5 }
            throw r0     // Catch:{ all -> 0x01c5 }
        L_0x01c5:
            r0 = move-exception
            r14 = r2
            goto L_0x01fc
        L_0x01c8:
            r0 = move-exception
            r3 = r7
            r2 = r14
        L_0x01cb:
            monitor-enter(r3)     // Catch:{ all -> 0x01d5 }
            r3.f7390t = r13     // Catch:{ all -> 0x01d2 }
            h7.h r1 = h7.h.f4787a     // Catch:{ all -> 0x01d2 }
            monitor-exit(r3)     // Catch:{ all -> 0x01d5 }
            throw r0     // Catch:{ all -> 0x01d5 }
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d5 }
            throw r0     // Catch:{ all -> 0x01d5 }
        L_0x01d5:
            r0 = move-exception
            r1 = r0
            r14 = r2
            goto L_0x01fd
        L_0x01d9:
            r0 = move-exception
            goto L_0x01e3
        L_0x01db:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01d9 }
            java.lang.String r1 = "Concurrent openComplicationDataSourceChooser invocation is not supported"
            r0.<init>(r1)     // Catch:{ all -> 0x01d9 }
            throw r0     // Catch:{ all -> 0x01d9 }
        L_0x01e3:
            monitor-exit(r18)     // Catch:{ all -> 0x01fb }
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x01e5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r1.<init>(r2)     // Catch:{ all -> 0x01fb }
            r1.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fb }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fb }
            r1.<init>(r0)     // Catch:{ all -> 0x01fb }
            throw r1     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r0 = move-exception
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            throw r1     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r0 = move-exception
            r2 = r0
            k3.j.n(r14, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.o(t1.b, int, j7.d):java.lang.Object");
    }

    public final Object E(int i8, d<? super f> dVar) {
        return o(this, i8, dVar);
    }

    public final a8.f K() {
        return this.f7389s;
    }

    public abstract LinkedHashMap a();

    /* renamed from: c */
    public final MutableStateFlow<Map<Integer, o1.a>> p() {
        return (MutableStateFlow) this.f7392v.getValue();
    }

    public final void close() {
        if (!this.f7383l) {
            s();
            f fVar = l.f7438f;
            l a9 = l.c.a();
            c cVar = this.f7385n;
            a9.getClass();
            k.e(cVar, "closeCallback");
            synchronized (a9.f7439a) {
                a9.e.remove(cVar);
            }
            j.Z(new a(this, (d<? super a>) null));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|44|45|46|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        r6 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b A[SYNTHETIC, Splitter:B:37:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(p1.c r7, p1.a r8, j7.d<? super q1.b> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof t1.b.C0122b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            t1.b$b r0 = (t1.b.C0122b) r0
            int r1 = r0.f7401m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7401m = r1
            goto L_0x0018
        L_0x0013:
            t1.b$b r0 = new t1.b$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r6 = r0.f7399k
            k7.a r9 = k7.a.f5217f
            int r1 = r0.f7401m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            java.lang.Object r7 = r0.f7398j
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r8 = r0.f7397i
            p1.a r8 = (p1.a) r8
            a1.a.I(r6)     // Catch:{ Exception -> 0x008a }
            goto L_0x006c
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            a1.a.I(r6)
            v1.c r6 = new v1.c
            java.lang.String r1 = "BaseEditorSession.getPreviewData"
            r6.<init>(r1)
            if (r8 != 0) goto L_0x0048
            k3.j.n(r6, r3)
            return r3
        L_0x0048:
            android.content.ComponentName r1 = r8.e     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x005a
            h7.f r7 = r8.f6246f     // Catch:{ all -> 0x0058 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0058 }
            q1.b r7 = (q1.b) r7     // Catch:{ all -> 0x0058 }
            k3.j.n(r6, r3)
            return r7
        L_0x0058:
            r7 = move-exception
            goto L_0x0096
        L_0x005a:
            q1.d r4 = r8.f6245d     // Catch:{ Exception -> 0x0089 }
            r0.f7397i = r8     // Catch:{ Exception -> 0x0089 }
            r0.f7398j = r6     // Catch:{ Exception -> 0x0089 }
            r0.f7401m = r2     // Catch:{ Exception -> 0x0089 }
            java.lang.Object r7 = r7.d(r1, r4, r0)     // Catch:{ Exception -> 0x0089 }
            if (r7 != r9) goto L_0x0069
            return r9
        L_0x0069:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x006c:
            q1.b r6 = (q1.b) r6     // Catch:{ Exception -> 0x008a }
            if (r6 == 0) goto L_0x007b
            q1.d r9 = r6.f6418a     // Catch:{ Exception -> 0x008a }
            q1.d r0 = r8.f6245d     // Catch:{ Exception -> 0x008a }
            if (r9 == r0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            k3.j.n(r7, r3)
            return r6
        L_0x007b:
            h7.f r6 = r8.f6246f     // Catch:{ Exception -> 0x008a }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x008a }
            q1.b r6 = (q1.b) r6     // Catch:{ Exception -> 0x008a }
            k3.j.n(r7, r3)
            return r6
        L_0x0087:
            r6 = move-exception
            goto L_0x0099
        L_0x0089:
            r7 = r6
        L_0x008a:
            h7.f r6 = r8.f6246f     // Catch:{ all -> 0x0087 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x0087 }
            q1.b r6 = (q1.b) r6     // Catch:{ all -> 0x0087 }
            k3.j.n(r7, r3)
            return r6
        L_0x0096:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0099:
            throw r6     // Catch:{ all -> 0x009a }
        L_0x009a:
            r8 = move-exception
            k3.j.n(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.d(p1.c, p1.a, j7.d):java.lang.Object");
    }

    public Intent g() {
        return null;
    }

    public Intent h() {
        return null;
    }

    public final void j() {
        if (this.f7392v.f4785g != a1.a.f35m0) {
            p().setValue(a());
        }
    }

    public o1.c k() {
        return this.f7386o;
    }

    public final void l(boolean z8) {
        this.f7387p = z8;
    }

    public void n(int i8, p1.a aVar, p1.a aVar2) {
    }

    public abstract void q();

    public final a8.f r() {
        return this.r;
    }

    public final void s() {
        if (!this.f7383l && !(!this.f7382k)) {
            throw new IllegalArgumentException("EditorSession method called after close()".toString());
        }
    }

    public void t(boolean z8) {
    }
}
