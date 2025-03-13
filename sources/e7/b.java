package e7;

import com.samsung.android.wearable.watchfacestudio.editor.n;
import e7.i;
import w5.f;

public final class b extends h {

    /* renamed from: n  reason: collision with root package name */
    public f f4264n = f.f8063k;

    /* renamed from: o  reason: collision with root package name */
    public i0.a<Void> f4265o = new a();

    /* renamed from: p  reason: collision with root package name */
    public i0.a<f> f4266p = new C0052b();

    /* renamed from: q  reason: collision with root package name */
    public Runnable f4267q = new n(1);

    public class a implements i0.a<Void> {
        public a() {
        }

        public final void accept(Object obj) {
            Void voidR = (Void) obj;
            b bVar = b.this;
            bVar.o(bVar.f4281i.b());
            bVar.f4267q.run();
        }
    }

    /* renamed from: e7.b$b  reason: collision with other inner class name */
    public class C0052b implements i0.a<f> {
        public C0052b() {
        }

        public final void accept(Object obj) {
            b bVar = b.this;
            bVar.o((f) obj);
            bVar.f4267q.run();
        }
    }

    public class c extends f6.a {
        public c(v5.b bVar, z5.b bVar2) {
            super(bVar, bVar2);
        }

        public final void b(f fVar) {
            b.this.o(fVar);
        }
    }

    public class d extends p6.d {
        public d() {
        }

        public final void a() {
            b.this.f4267q.run();
        }
    }

    public b(i.a aVar, z5.b bVar) {
        super(aVar, bVar, 1);
        this.f4282j = false;
    }

    public final void l(v5.b bVar) {
        k(new s5.f(new c(bVar, this.f4281i), 7));
    }

    public final void m(p6.c cVar) {
        super.m(cVar);
        this.f4265o = new a(this, 0);
        this.f4266p = new a(this, 1);
        cVar.f6341j.add(new d());
    }
}
