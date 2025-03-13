package t1;

import androidx.activity.ComponentActivity;
import h7.f;
import j7.d;
import k3.j;
import l7.e;
import l7.h;
import p7.p;
import q7.k;
import t1.l;
import y7.g1;
import y7.z;

public final class c extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7411a;

    @e(c = "androidx.wear.watchface.editor.BaseEditorSession$closeCallback$1$onClose$1", f = "EditorSession.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ b f7412j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7412j = bVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f7412j, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            a1.a.I(obj);
            b bVar = this.f7412j;
            bVar.f7387p = false;
            bVar.f7382k = true;
            bVar.f7383l = true;
            bVar.q();
            f fVar = l.f7438f;
            l a9 = l.c.a();
            c cVar = bVar.f7385n;
            a9.getClass();
            k.e(cVar, "closeCallback");
            synchronized (a9.f7439a) {
                a9.e.remove(cVar);
            }
            bVar.f7384m.close();
            ComponentActivity componentActivity = bVar.f7377f;
            if (componentActivity != null) {
                componentActivity.finish();
            }
            bVar.f7377f = null;
            bVar.f7378g = null;
            bVar.f7391u = null;
            return h7.h.f4787a;
        }
    }

    public c(b bVar) {
        this.f7411a = bVar;
    }

    public final void a() {
        b bVar = this.f7411a;
        j.K(bVar.f7379h, (g1) null, new a(bVar, (d<? super a>) null), 3);
    }
}
