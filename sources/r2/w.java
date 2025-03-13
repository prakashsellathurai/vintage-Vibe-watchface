package r2;

import androidx.appcompat.widget.p;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p.a;
import p2.e;
import p2.k;
import r2.h;
import r2.m;
import v2.n;

public final class w implements h, d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final h.a f6905f;

    /* renamed from: g  reason: collision with root package name */
    public final i<?> f6906g;

    /* renamed from: h  reason: collision with root package name */
    public int f6907h;

    /* renamed from: i  reason: collision with root package name */
    public int f6908i = -1;

    /* renamed from: j  reason: collision with root package name */
    public e f6909j;

    /* renamed from: k  reason: collision with root package name */
    public List<n<File, ?>> f6910k;

    /* renamed from: l  reason: collision with root package name */
    public int f6911l;

    /* renamed from: m  reason: collision with root package name */
    public volatile n.a<?> f6912m;

    /* renamed from: n  reason: collision with root package name */
    public File f6913n;

    /* renamed from: o  reason: collision with root package name */
    public x f6914o;

    public w(i<?> iVar, h.a aVar) {
        this.f6906g = iVar;
        this.f6905f = aVar;
    }

    public final boolean a() {
        List list;
        ArrayList d9;
        ArrayList a9 = this.f6906g.a();
        if (a9.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f6906g;
        i iVar2 = iVar.f6772c.f2922b;
        Class<?> cls = iVar.f6773d.getClass();
        Class<?> cls2 = iVar.f6775g;
        Class<Transcode> cls3 = iVar.f6779k;
        p pVar = iVar2.f2942h;
        k3.i iVar3 = (k3.i) ((AtomicReference) pVar.f785b).getAndSet((Object) null);
        if (iVar3 == null) {
            iVar3 = new k3.i(cls, cls2, cls3);
        } else {
            iVar3.f5144a = cls;
            iVar3.f5145b = cls2;
            iVar3.f5146c = cls3;
        }
        synchronized (((a) pVar.f786c)) {
            list = (List) ((a) pVar.f786c).getOrDefault(iVar3, null);
        }
        ((AtomicReference) pVar.f785b).set(iVar3);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            v2.p pVar2 = iVar2.f2936a;
            synchronized (pVar2) {
                d9 = pVar2.f7887a.d(cls);
            }
            Iterator it = d9.iterator();
            while (it.hasNext()) {
                Iterator it2 = iVar2.f2938c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!iVar2.f2940f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            p pVar3 = iVar2.f2942h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((a) pVar3.f786c)) {
                ((a) pVar3.f786c).put(new k3.i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list2 = this.f6910k;
                if (list2 != null) {
                    if (this.f6911l < list2.size()) {
                        this.f6912m = null;
                        boolean z8 = false;
                        while (!z8) {
                            if (!(this.f6911l < this.f6910k.size())) {
                                break;
                            }
                            List<n<File, ?>> list3 = this.f6910k;
                            int i8 = this.f6911l;
                            this.f6911l = i8 + 1;
                            File file = this.f6913n;
                            i<?> iVar4 = this.f6906g;
                            this.f6912m = list3.get(i8).a(file, iVar4.e, iVar4.f6774f, iVar4.f6777i);
                            if (this.f6912m != null) {
                                if (this.f6906g.c(this.f6912m.f7886c.a()) != null) {
                                    this.f6912m.f7886c.f(this.f6906g.f6783o, this);
                                    z8 = true;
                                }
                            }
                        }
                        return z8;
                    }
                }
                int i9 = this.f6908i + 1;
                this.f6908i = i9;
                if (i9 >= arrayList.size()) {
                    int i10 = this.f6907h + 1;
                    this.f6907h = i10;
                    if (i10 >= a9.size()) {
                        return false;
                    }
                    this.f6908i = 0;
                }
                e eVar = (e) a9.get(this.f6907h);
                Class cls5 = (Class) arrayList.get(this.f6908i);
                k<Z> e = this.f6906g.e(cls5);
                i<?> iVar5 = this.f6906g;
                this.f6914o = new x(iVar5.f6772c.f2921a, eVar, iVar5.f6782n, iVar5.e, iVar5.f6774f, e, cls5, iVar5.f6777i);
                File a10 = ((m.c) iVar5.f6776h).a().a(this.f6914o);
                this.f6913n = a10;
                if (a10 != null) {
                    this.f6909j = eVar;
                    this.f6910k = this.f6906g.f6772c.f2922b.e(a10);
                    this.f6911l = 0;
                }
            }
        } else if (File.class.equals(this.f6906g.f6779k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f6906g.f6773d.getClass() + " to " + this.f6906g.f6779k);
        }
    }

    public final void c(Exception exc) {
        this.f6905f.f(this.f6914o, exc, this.f6912m.f7886c, p2.a.f6297i);
    }

    public final void cancel() {
        n.a<?> aVar = this.f6912m;
        if (aVar != null) {
            aVar.f7886c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f6905f.g(this.f6909j, obj, this.f6912m.f7886c, p2.a.f6297i, this.f6914o);
    }
}
