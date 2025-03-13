package v2;

import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import i0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k3.j;
import p2.e;
import p2.g;
import r2.r;
import v2.n;

public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f7891a;

    /* renamed from: b  reason: collision with root package name */
    public final d<List<Throwable>> f7892b;

    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f7893f;

        /* renamed from: g  reason: collision with root package name */
        public final i0.d<List<Throwable>> f7894g;

        /* renamed from: h  reason: collision with root package name */
        public int f7895h;

        /* renamed from: i  reason: collision with root package name */
        public h f7896i;

        /* renamed from: j  reason: collision with root package name */
        public d.a<? super Data> f7897j;

        /* renamed from: k  reason: collision with root package name */
        public List<Throwable> f7898k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f7899l;

        public a(ArrayList arrayList, i0.d dVar) {
            this.f7894g = dVar;
            if (!arrayList.isEmpty()) {
                this.f7893f = arrayList;
                this.f7895h = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f7893f.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.f7898k;
            if (list != null) {
                this.f7894g.a(list);
            }
            this.f7898k = null;
            for (com.bumptech.glide.load.data.d<Data> b9 : this.f7893f) {
                b9.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.f7898k;
            j.l(list);
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.f7899l = true;
            for (com.bumptech.glide.load.data.d<Data> cancel : this.f7893f) {
                cancel.cancel();
            }
        }

        public final void d(Data data) {
            if (data != null) {
                this.f7897j.d(data);
            } else {
                g();
            }
        }

        public final p2.a e() {
            return this.f7893f.get(0).e();
        }

        public final void f(h hVar, d.a<? super Data> aVar) {
            this.f7896i = hVar;
            this.f7897j = aVar;
            this.f7898k = this.f7894g.b();
            this.f7893f.get(this.f7895h).f(hVar, this);
            if (this.f7899l) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f7899l) {
                if (this.f7895h < this.f7893f.size() - 1) {
                    this.f7895h++;
                    f(this.f7896i, this.f7897j);
                    return;
                }
                j.l(this.f7898k);
                this.f7897j.c(new r("Fetch failed", new ArrayList(this.f7898k)));
            }
        }
    }

    public q(ArrayList arrayList, i0.d dVar) {
        this.f7891a = arrayList;
        this.f7892b = dVar;
    }

    public final n.a<Data> a(Model model, int i8, int i9, g gVar) {
        n.a a9;
        List<n<Model, Data>> list = this.f7891a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = list.get(i10);
            if (nVar.b(model) && (a9 = nVar.a(model, i8, i9, gVar)) != null) {
                arrayList.add(a9.f7886c);
                eVar = a9.f7884a;
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a<>(eVar, new a(arrayList, this.f7892b));
    }

    public final boolean b(Model model) {
        for (n<Model, Data> b9 : this.f7891a) {
            if (b9.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f7891a.toArray()) + '}';
    }
}
