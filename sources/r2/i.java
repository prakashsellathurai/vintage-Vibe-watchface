package r2;

import a1.a;
import c3.b;
import c3.c;
import com.bumptech.glide.f;
import com.bumptech.glide.h;
import com.bumptech.glide.i;
import f3.a;
import f3.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2.d;
import p2.e;
import p2.g;
import p2.k;
import r2.j;
import v2.n;

public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6770a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6771b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public f f6772c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6773d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f6774f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f6775g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f6776h;

    /* renamed from: i  reason: collision with root package name */
    public g f6777i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, k<?>> f6778j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f6779k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6780l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6781m;

    /* renamed from: n  reason: collision with root package name */
    public e f6782n;

    /* renamed from: o  reason: collision with root package name */
    public h f6783o;

    /* renamed from: p  reason: collision with root package name */
    public l f6784p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6785q;
    public boolean r;

    public final ArrayList a() {
        boolean z8 = this.f6781m;
        ArrayList arrayList = this.f6771b;
        if (!z8) {
            this.f6781m = true;
            arrayList.clear();
            ArrayList b9 = b();
            int size = b9.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a aVar = (n.a) b9.get(i8);
                if (!arrayList.contains(aVar.f7884a)) {
                    arrayList.add(aVar.f7884a);
                }
                int i9 = 0;
                while (true) {
                    List<e> list = aVar.f7885b;
                    if (i9 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i9))) {
                        arrayList.add(list.get(i9));
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z8 = this.f6780l;
        ArrayList arrayList = this.f6770a;
        if (!z8) {
            this.f6780l = true;
            arrayList.clear();
            List e4 = this.f6772c.f2922b.e(this.f6773d);
            int size = e4.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a a9 = ((n) e4.get(i8)).a(this.f6773d, this.e, this.f6774f, this.f6777i);
                if (a9 != null) {
                    arrayList.add(a9);
                }
            }
        }
        return arrayList;
    }

    public final <Data> t<Data, ?, Transcode> c(Class<Data> cls) {
        t<Data, ?, Transcode> orDefault;
        ArrayList arrayList;
        boolean z8;
        b bVar;
        b bVar2;
        Class<Data> cls2 = cls;
        com.bumptech.glide.i iVar = this.f6772c.f2922b;
        Class<?> cls3 = this.f6775g;
        Class<Transcode> cls4 = this.f6779k;
        f3.b bVar3 = iVar.f2943i;
        k3.i andSet = bVar3.f4382b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new k3.i();
        }
        andSet.f5144a = cls2;
        andSet.f5145b = cls3;
        andSet.f5146c = cls4;
        synchronized (bVar3.f4381a) {
            orDefault = bVar3.f4381a.getOrDefault(andSet, null);
        }
        bVar3.f4382b.set(andSet);
        iVar.f2943i.getClass();
        if (f3.b.f4380c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iVar.f2938c.b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = iVar.f2940f.a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    c cVar = iVar.f2938c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar.f4383a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar.f4384b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.f4385a.isAssignableFrom(cls2) && cls5.isAssignableFrom(aVar.f4386b)) {
                                        arrayList.add(aVar.f4387c);
                                    }
                                }
                            }
                        }
                    }
                    c3.c cVar2 = iVar.f2940f;
                    synchronized (cVar2) {
                        if (cls6.isAssignableFrom(cls5)) {
                            bVar = a.f22g;
                        } else {
                            Iterator it4 = cVar2.f2654a.iterator();
                            while (it4.hasNext()) {
                                c.a aVar2 = (c.a) it4.next();
                                if (!aVar2.f2655a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f2656b)) {
                                    z8 = false;
                                    continue;
                                } else {
                                    z8 = true;
                                    continue;
                                }
                                if (z8) {
                                    bVar = aVar2.f2657c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        bVar2 = bVar;
                    }
                    k kVar = r0;
                    k kVar2 = new k(cls, cls5, cls6, arrayList, bVar2, iVar.f2944j);
                    arrayList2.add(kVar);
                }
            }
        }
        t<Data, ?, Transcode> tVar = arrayList2.isEmpty() ? null : new t<>(cls, cls3, cls4, arrayList2, iVar.f2944j);
        f3.b bVar4 = iVar.f2943i;
        synchronized (bVar4.f4381a) {
            bVar4.f4381a.put(new k3.i(cls2, cls3, cls4), tVar != null ? tVar : f3.b.f4380c);
        }
        return tVar;
    }

    public final <X> d<X> d(X x8) {
        d<T> dVar;
        f3.a aVar = this.f6772c.f2922b.f2937b;
        Class<?> cls = x8.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f4377a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0055a aVar2 = (a.C0055a) it.next();
                if (aVar2.f4378a.isAssignableFrom(cls)) {
                    dVar = aVar2.f4379b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new i.e(x8.getClass());
    }

    public final <Z> k<Z> e(Class<Z> cls) {
        k<Z> kVar = this.f6778j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, k<?>>> it = this.f6778j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f6778j.isEmpty() || !this.f6785q) {
            return x2.c.f8119b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
