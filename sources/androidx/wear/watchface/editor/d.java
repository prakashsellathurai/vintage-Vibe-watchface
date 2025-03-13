package androidx.wear.watchface.editor;

import androidx.activity.ComponentActivity;
import androidx.wear.watchface.editor.EditorSession;
import k7.a;
import l7.e;
import l7.h;
import p7.p;
import q.a;
import q.b;
import t1.r;
import y7.z;

@e(c = "androidx.wear.watchface.editor.ListenableEditorSession$Companion$listenableCreateOnWatchEditorSession$1", f = "ListenableEditorSession.kt", l = {78}, m = "invokeSuspend")
public final class d extends h implements p<z, j7.d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public Object f2398j;

    /* renamed from: k  reason: collision with root package name */
    public int f2399k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b<r> f2400l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f2401m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b<r> bVar, ComponentActivity componentActivity, j7.d<? super d> dVar) {
        super(2, dVar);
        this.f2400l = bVar;
        this.f2401m = componentActivity;
    }

    public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
        return new d(this.f2400l, this.f2401m, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((d) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        b<r> bVar;
        a aVar = a.f5217f;
        int i8 = this.f2399k;
        b<r> bVar2 = this.f2400l;
        if (i8 == 0) {
            a1.a.I(obj);
            EditorSession.Companion companion = EditorSession.f2368a;
            ComponentActivity componentActivity = this.f2401m;
            this.f2398j = bVar2;
            this.f2399k = 1;
            obj = companion.a(componentActivity, this);
            if (obj == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else if (i8 == 1) {
            bVar = (b) this.f2398j;
            try {
                a1.a.I(obj);
            } catch (Exception e) {
                bVar2.getClass();
                if (q.a.f6358k.b(bVar2, (Object) null, new a.c(e))) {
                    q.a.c(bVar2);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar.h(new r((EditorSession) obj));
        return h7.h.f4787a;
    }
}
