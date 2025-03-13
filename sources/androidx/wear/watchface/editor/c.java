package androidx.wear.watchface.editor;

import android.content.ComponentName;
import android.os.Handler;
import androidx.activity.ComponentActivity;
import androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams;
import androidx.wear.watchface.data.DeviceConfig;
import j7.d;
import k3.j;
import l7.e;
import l7.h;
import n1.i0;
import o1.b;
import p7.p;
import q7.k;
import t1.u;
import t1.v;
import u1.f;
import y7.a0;
import y7.g1;
import y7.o;
import y7.z;
import y7.z0;

@e(c = "androidx.wear.watchface.editor.EditorSession$Companion$createOnWatchEditorSessionImpl$2$1", f = "EditorSession.kt", l = {317}, m = "invokeSuspend")
public final class c extends h implements p<z, d<? super u>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f2389j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u f2390k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a f2391l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f2392m;

    @e(c = "androidx.wear.watchface.editor.EditorSession$Companion$createOnWatchEditorSessionImpl$2$1$1", f = "EditorSession.kt", l = {322, 337}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super u>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public Object f2393j;

        /* renamed from: k  reason: collision with root package name */
        public int f2394k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ u f2395l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a f2396m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f2397n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, a aVar, ComponentActivity componentActivity, d<? super a> dVar) {
            super(2, dVar);
            this.f2395l = uVar;
            this.f2396m = aVar;
            this.f2397n = componentActivity;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f2395l, this.f2396m, this.f2397n, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            u uVar;
            Object obj2;
            o oVar;
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f2394k;
            u uVar2 = this.f2395l;
            if (i8 == 0) {
                a1.a.I(obj);
                a aVar2 = this.f2396m;
                b bVar = aVar2.f2384d;
                if (bVar != null) {
                    i0.a aVar3 = i0.f5609g;
                    ComponentName componentName = aVar2.f2381a;
                    DeviceConfig deviceConfig = new DeviceConfig(bVar.f5999a, bVar.f6000b, bVar.f6001c, bVar.f6002d);
                    ComponentActivity componentActivity = this.f2397n;
                    HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams = new HeadlessWatchFaceInstanceParams(componentName, deviceConfig, componentActivity.getResources().getDisplayMetrics().widthPixels, componentActivity.getResources().getDisplayMetrics().heightPixels, aVar2.f2383c.f6003a);
                    this.f2393j = uVar2;
                    this.f2394k = 1;
                    obj2 = aVar3.a(componentName, headlessWatchFaceInstanceParams, componentActivity, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    i0.a aVar4 = i0.f5609g;
                    ComponentName componentName2 = aVar2.f2381a;
                    k.e(componentName2, "componentName");
                    i0.b bVar2 = i0.f5610h.get(componentName2);
                    if (bVar2 != null) {
                        oVar = new o((z0) null);
                        oVar.X(bVar2);
                    } else {
                        i0.f5611i = componentName2;
                        oVar = j.d();
                        i0.f5612j = oVar;
                    }
                    this.f2393j = uVar2;
                    this.f2394k = 2;
                    obj2 = oVar.s(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                uVar = uVar2;
            } else if (i8 == 1 || i8 == 2) {
                a1.a.I(obj);
                uVar = (u) this.f2393j;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0.b bVar3 = (i0.b) obj2;
            uVar.getClass();
            k.e(bVar3, "editorDelegate");
            uVar.y = bVar3;
            uVar.E = bVar3.b();
            f fVar = uVar.f7456x;
            if (fVar != null) {
                bVar3.h(new u1.e(fVar, bVar3.e()));
            }
            Handler c9 = bVar3.c();
            int i9 = z7.h.f8729a;
            c8.c a9 = a0.a(new z7.f(c9, (String) null, false).f8728k);
            uVar.F = a9;
            t1.j jVar = uVar.f7378g;
            k.b(jVar);
            uVar.G = j.K(a9, (g1) null, new v1.d("BaseEditorSession.fetchComplicationsData", new t1.e(jVar.a(), uVar, (d<? super t1.e>) null), (d<? super v1.d>) null), 3);
            bVar3.g(new v());
            return uVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(u uVar, a aVar, ComponentActivity componentActivity, d<? super c> dVar) {
        super(2, dVar);
        this.f2390k = uVar;
        this.f2391l = aVar;
        this.f2392m = componentActivity;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new c(this.f2390k, this.f2391l, this.f2392m, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((c) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f2389j;
        if (i8 == 0) {
            a1.a.I(obj);
            long millis = EditorSession.f2370c.toMillis();
            a aVar2 = new a(this.f2390k, this.f2391l, this.f2392m, (d<? super a>) null);
            this.f2389j = 1;
            obj = j.j0(millis, aVar2, this);
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
