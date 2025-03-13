package v2;

import com.bumptech.glide.i;
import i0.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k3.j;
import l3.a;
import p2.g;
import v2.n;

public final class r {
    public static final c e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f7900f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7901a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f7902b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f7903c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f7904d;

    public static class a implements n<Object, Object> {
        public final n.a<Object> a(Object obj, int i8, int i9, g gVar) {
            return null;
        }

        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f7905a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f7906b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f7907c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f7905a = cls;
            this.f7906b = cls2;
            this.f7907c = oVar;
        }
    }

    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = e;
        this.f7904d = cVar;
        this.f7902b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f7901a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f7903c.contains(bVar)) {
                    if (bVar.f7905a.isAssignableFrom(cls)) {
                        this.f7903c.add(bVar);
                        n<? extends Model, ? extends Data> b9 = bVar.f7907c.b(this);
                        j.l(b9);
                        arrayList.add(b9);
                        this.f7903c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f7903c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7901a.iterator();
            boolean z8 = false;
            while (true) {
                boolean z9 = true;
                if (!it.hasNext()) {
                    break;
                }
                b bVar = (b) it.next();
                if (this.f7903c.contains(bVar)) {
                    z8 = true;
                } else {
                    if (!bVar.f7905a.isAssignableFrom(cls) || !bVar.f7906b.isAssignableFrom(cls2)) {
                        z9 = false;
                    }
                    if (z9) {
                        this.f7903c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f7903c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f7902b;
                d<List<Throwable>> dVar = this.f7904d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z8) {
                return f7900f;
            } else {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f7903c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> b9 = bVar.f7907c.b(this);
        j.l(b9);
        return b9;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f7901a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f7906b) && bVar.f7905a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f7906b);
            }
        }
        return arrayList;
    }
}
