package t1;

import androidx.wear.watchface.editor.EditorSession;
import j7.d;
import k7.a;
import l7.e;
import l7.h;
import p7.p;
import q.a;
import q.b;
import y7.z;

@e(c = "androidx.wear.watchface.editor.ListenableEditorSession$listenableOpenComplicationDataSourceChooser$1", f = "ListenableEditorSession.kt", l = {167}, m = "invokeSuspend")
public final class q extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public Object f7445j;

    /* renamed from: k  reason: collision with root package name */
    public int f7446k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b<f> f7447l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ r f7448m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f7449n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b<f> bVar, r rVar, int i8, d<? super q> dVar) {
        super(2, dVar);
        this.f7447l = bVar;
        this.f7448m = rVar;
        this.f7449n = i8;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new q(this.f7447l, this.f7448m, this.f7449n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((q) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        b<f> bVar;
        a aVar = a.f5217f;
        int i8 = this.f7446k;
        b<f> bVar2 = this.f7447l;
        if (i8 == 0) {
            a1.a.I(obj);
            EditorSession editorSession = this.f7448m.f7450f;
            int i9 = this.f7449n;
            this.f7445j = bVar2;
            this.f7446k = 1;
            obj = editorSession.E(i9, this);
            if (obj == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else if (i8 == 1) {
            bVar = (b) this.f7445j;
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
        bVar.h(obj);
        return h7.h.f4787a;
    }
}
