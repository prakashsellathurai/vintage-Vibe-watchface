package com.bumptech.glide;

import c3.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import f3.c;
import f3.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l3.a;
import p2.j;
import v2.n;
import v2.o;
import v2.p;
import v2.r;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final p f2936a;

    /* renamed from: b  reason: collision with root package name */
    public final f3.a f2937b;

    /* renamed from: c  reason: collision with root package name */
    public final f3.c f2938c;

    /* renamed from: d  reason: collision with root package name */
    public final f3.d f2939d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final c3.c f2940f;

    /* renamed from: g  reason: collision with root package name */
    public final a2.b f2941g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.appcompat.widget.p f2942h = new androidx.appcompat.widget.p(5);

    /* renamed from: i  reason: collision with root package name */
    public final f3.b f2943i = new f3.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f2944j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m8, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m8);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        a.c cVar = new a.c(new i0.e(20), new l3.b(), new l3.c());
        this.f2944j = cVar;
        this.f2936a = new p(cVar);
        this.f2937b = new f3.a();
        this.f2938c = new f3.c();
        this.f2939d = new f3.d();
        this.e = new f();
        this.f2940f = new c3.c();
        this.f2941g = new a2.b(2);
        List<String> asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        f3.c cVar2 = this.f2938c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f4383a);
            cVar2.f4383a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f4383a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f4383a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, o oVar) {
        p pVar = this.f2936a;
        synchronized (pVar) {
            r rVar = pVar.f7887a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f7901a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f7888b.f7889a.clear();
        }
    }

    public final void b(Class cls, j jVar) {
        f3.d dVar = this.f2939d;
        synchronized (dVar) {
            dVar.f4388a.add(new d.a(cls, jVar));
        }
    }

    public final void c(p2.i iVar, Class cls, Class cls2, String str) {
        f3.c cVar = this.f2938c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a(cls, cls2, iVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        a2.b bVar = this.f2941g;
        synchronized (bVar) {
            list = bVar.f66a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f2936a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0148a aVar = (p.a.C0148a) pVar.f7888b.f7889a.get(cls);
            list = aVar == null ? null : aVar.f7890a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f7887a.a(cls));
                if (((p.a.C0148a) pVar.f7888b.f7889a.put(cls, new p.a.C0148a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z8 = true;
            for (int i8 = 0; i8 < size; i8++) {
                n nVar = list.get(i8);
                if (nVar.b(model)) {
                    if (z8) {
                        emptyList = new ArrayList<>(size - i8);
                        z8 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final void f(p2.i iVar, Class cls, Class cls2, String str) {
        f3.c cVar = this.f2938c;
        synchronized (cVar) {
            cVar.a(str).add(0, new c.a(cls, cls2, iVar));
        }
    }

    public final void g(e.a aVar) {
        f fVar = this.e;
        synchronized (fVar) {
            fVar.f2984a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, c3.b bVar) {
        c3.c cVar = this.f2940f;
        synchronized (cVar) {
            cVar.f2654a.add(new c.a(cls, cls2, bVar));
        }
    }
}
