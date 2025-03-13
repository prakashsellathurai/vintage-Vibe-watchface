package v2;

import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import k3.j;
import p2.e;
import p2.g;

public interface n<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final e f7884a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f7885b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f7886c;

        public a() {
            throw null;
        }

        public a(e eVar, d<Data> dVar) {
            List<e> emptyList = Collections.emptyList();
            j.l(eVar);
            this.f7884a = eVar;
            j.l(emptyList);
            this.f7885b = emptyList;
            j.l(dVar);
            this.f7886c = dVar;
        }
    }

    a<Data> a(Model model, int i8, int i9, g gVar);

    boolean b(Model model);
}
