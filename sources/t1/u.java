package t1;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.wear.watchface.editor.EditorSession;
import h7.f;
import j7.d;
import java.lang.reflect.Proxy;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k3.j;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.h;
import n1.h;
import n1.i0;
import n1.i1;
import o1.c;
import p1.g;
import p7.p;
import q1.b;
import q7.k;
import u1.e;
import u1.l;
import y7.n1;
import y7.z;

public final class u extends b {
    public final f A = a1.a.z(new t(this));
    public final c B;
    public final f C;
    public final MutableStateFlow<e> D;
    public e E;
    public c8.c F;
    public n1 G;
    public final ComponentName w;

    /* renamed from: x  reason: collision with root package name */
    public final u1.f f7456x;
    public i0.b y;

    /* renamed from: z  reason: collision with root package name */
    public final f f7457z = a1.a.z(new w(this));

    @l7.e(c = "androidx.wear.watchface.editor.OnWatchFaceEditorSessionImpl$releaseResources$1", f = "EditorSession.kt", l = {969}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f7458j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ u f7459k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7459k = uVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f7459k, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
            if (r5 == r0) goto L_0x0083;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object h(java.lang.Object r6) {
            /*
                r5 = this;
                k7.a r0 = k7.a.f5217f
                int r1 = r5.f7458j
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x000e
                a1.a.I(r6)
                goto L_0x0086
            L_0x000e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0016:
                a1.a.I(r6)
                t1.u r6 = r5.f7459k
                c8.c r1 = r6.F
                r3 = 0
                if (r1 == 0) goto L_0x008f
                y7.a0.b(r1)
                y7.n1 r6 = r6.G
                if (r6 == 0) goto L_0x0089
                r5.f7458j = r2
            L_0x0029:
                java.lang.Object r1 = r6.R()
                boolean r3 = r1 instanceof y7.w0
                r4 = 0
                if (r3 != 0) goto L_0x0034
                r1 = r4
                goto L_0x003b
            L_0x0034:
                int r1 = r6.f0(r1)
                if (r1 < 0) goto L_0x0029
                r1 = r2
            L_0x003b:
                if (r1 != 0) goto L_0x0058
                j7.f r5 = r5.f5330g
                q7.k.b(r5)
                y7.z0$b r6 = y7.z0.b.f8628f
                j7.f$b r5 = r5.d(r6)
                y7.z0 r5 = (y7.z0) r5
                if (r5 == 0) goto L_0x0081
                boolean r6 = r5.c()
                if (r6 == 0) goto L_0x0053
                goto L_0x0081
            L_0x0053:
                java.util.concurrent.CancellationException r5 = r5.D()
                throw r5
            L_0x0058:
                y7.h r1 = new y7.h
                j7.d r5 = a1.a.x(r5)
                r1.<init>(r2, r5)
                r1.v()
                y7.m1 r5 = new y7.m1
                r5.<init>(r1)
                y7.m0 r5 = r6.A(r4, r2, r5)
                y7.n0 r6 = new y7.n0
                r6.<init>(r4, r5)
                r1.b(r6)
                java.lang.Object r5 = r1.u()
                if (r5 != r0) goto L_0x007c
                goto L_0x007e
            L_0x007c:
                h7.h r5 = h7.h.f4787a
            L_0x007e:
                if (r5 != r0) goto L_0x0081
                goto L_0x0083
            L_0x0081:
                h7.h r5 = h7.h.f4787a
            L_0x0083:
                if (r5 != r0) goto L_0x0086
                return r0
            L_0x0086:
                h7.h r5 = h7.h.f4787a
                return r5
            L_0x0089:
                java.lang.String r5 = "fetchComplicationsDataJob"
                q7.k.h(r5)
                throw r3
            L_0x008f:
                java.lang.String r5 = "backgroundCoroutineScope"
                q7.k.h(r5)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.u.a.h(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(ComponentActivity componentActivity, ComponentName componentName, c cVar, u1.f fVar, EditorSession.Companion.b bVar, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, y yVar) {
        super(componentActivity, bVar, lifecycleCoroutineScopeImpl, yVar, cVar);
        k.e(componentActivity, "activity");
        k.e(componentName, "watchFaceComponentName");
        k.e(cVar, "watchFaceIdInternal");
        k.e(bVar, "complicationDataSourceInfoRetrieverProvider");
        this.w = componentName;
        this.f7456x = fVar;
        this.B = new c(i1.c(cVar.f6003a));
        this.C = a1.a.z(new x(this));
        Class<MutableStateFlow> cls = MutableStateFlow.class;
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new s(this));
        k.c(newProxyInstance, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<androidx.wear.watchface.style.UserStyle>");
        this.D = (MutableStateFlow) newProxyInstance;
    }

    public final ComponentName J() {
        return this.w;
    }

    public final LinkedHashMap a() {
        q1.d dVar;
        u uVar = this;
        i0.b bVar = uVar.y;
        String str = "editorDelegate";
        if (bVar != null) {
            LinkedHashMap linkedHashMap = bVar.i().e;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a1.a.C(linkedHashMap.size()));
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                s();
                b bVar2 = (b) ((Map) uVar.r.getValue()).get(entry.getKey());
                if (bVar2 == null || (dVar = bVar2.f6418a) == null) {
                    dVar = ((b) ((n1.h) entry.getValue()).D.getValue()).f6418a;
                }
                n1.h hVar = (n1.h) entry.getValue();
                i0.b bVar3 = uVar.y;
                if (bVar3 != null) {
                    Rect a9 = hVar.a(bVar3.k(), dVar, false);
                    int i8 = ((n1.h) entry.getValue()).f5562b;
                    List<q1.d> list = ((n1.h) entry.getValue()).f5564d;
                    g gVar = ((n1.h) entry.getValue()).f5577s;
                    boolean z8 = ((n1.h) entry.getValue()).f5576q;
                    boolean z9 = ((n1.h) entry.getValue()).e;
                    q1.d dVar2 = ((n1.h) entry.getValue()).c().a().f6418a;
                    Iterator it2 = it;
                    String str2 = str;
                    o1.a aVar = r8;
                    q1.d dVar3 = dVar2;
                    o1.a aVar2 = new o1.a(a9, i8, list, gVar, z8, z9, dVar3, ((n1.h) entry.getValue()).f5565f, ((n1.h) entry.getValue()).f5569j, ((n1.h) entry.getValue()).f5581x, ((n1.h) entry.getValue()).f5582z, ((n1.h) entry.getValue()).f5567h);
                    linkedHashMap2.put(key, aVar);
                    uVar = this;
                    it = it2;
                    str = str2;
                } else {
                    k.h(str);
                    throw null;
                }
            }
            return linkedHashMap2;
        }
        k.h(str);
        throw null;
    }

    public final MutableStateFlow<e> b() {
        return this.D;
    }

    public final l e() {
        return (l) this.f7457z.getValue();
    }

    public final Instant f() {
        return (Instant) this.A.getValue();
    }

    public final Intent g() {
        i0.b bVar = this.y;
        if (bVar != null) {
            return bVar.m();
        }
        k.h("editorDelegate");
        throw null;
    }

    public final Intent h() {
        i0.b bVar = this.y;
        if (bVar != null) {
            return bVar.l();
        }
        k.h("editorDelegate");
        throw null;
    }

    public final c k() {
        return this.B;
    }

    public final void n(int i8, p1.a aVar, p1.a aVar2) {
        p1.a aVar3;
        i0.b bVar = this.y;
        if (bVar != null) {
            n1.h hVar = (n1.h) bVar.i().e.get(Integer.valueOf(i8));
            if (hVar != null) {
                h.b bVar2 = hVar.C;
                if (!(bVar2 == null || (aVar3 = bVar2.f5585a) == null)) {
                    aVar = aVar3;
                }
                hVar.C = new h.b(aVar, aVar2);
                if (bVar2 == null) {
                    hVar.e(new q1.h(), false);
                    return;
                }
                return;
            }
            return;
        }
        k.h("editorDelegate");
        throw null;
    }

    public final void q() {
        e eVar;
        if (!this.f7387p && (eVar = this.E) != null) {
            this.D.setValue(eVar);
        }
        i0.b bVar = this.y;
        if (bVar != null) {
            n1.l i8 = bVar.i();
            boolean z8 = this.f7387p;
            for (n1.h hVar : i8.e.values()) {
                h.b bVar2 = hVar.C;
                if (bVar2 != null) {
                    if (z8) {
                        p1.a aVar = bVar2.f5585a;
                        ComponentName componentName = aVar != null ? aVar.e : null;
                        p1.a aVar2 = bVar2.f5586b;
                        if (!k.a(componentName, aVar2 != null ? aVar2.e : null)) {
                            q1.h hVar2 = new q1.h();
                            Instant now = Instant.now();
                            k.d(now, "now()");
                            hVar.h(hVar2, now);
                        }
                    }
                    hVar.C = null;
                    hVar.e(hVar.B, false);
                }
            }
        }
        if (this.G != null) {
            j.Z(new a(this, (d<? super a>) null));
        }
        i0.b bVar3 = this.y;
        if (bVar3 != null) {
            bVar3.g((v) null);
            i0.b bVar4 = this.y;
            if (bVar4 != null) {
                bVar4.a();
            } else {
                k.h("editorDelegate");
                throw null;
            }
        }
    }

    public final void t(boolean z8) {
        i0.b bVar = this.y;
        if (bVar != null) {
            bVar.d(z8);
        } else {
            k.h("editorDelegate");
            throw null;
        }
    }
}
