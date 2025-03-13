package v2;

import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import p2.g;
import v2.n;

public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f7915a = new u<>();

    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f7916a = new a<>();

        public final n<Model, Model> b(r rVar) {
            return u.f7915a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: f  reason: collision with root package name */
        public final Model f7917f;

        public b(Model model) {
            this.f7917f = model;
        }

        public final Class<Model> a() {
            return this.f7917f.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p2.a e() {
            return p2.a.f6294f;
        }

        public final void f(h hVar, d.a<? super Model> aVar) {
            aVar.d(this.f7917f);
        }
    }

    public final n.a<Model> a(Model model, int i8, int i9, g gVar) {
        return new n.a<>(new j3.b(model), new b(model));
    }

    public final boolean b(Model model) {
        return true;
    }
}
