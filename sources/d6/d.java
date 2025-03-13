package d6;

import android.content.Context;
import android.util.Log;
import c6.e;
import c6.f;
import c6.g;
import c6.j;
import c6.k;
import c6.l;
import c6.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w5.b;
import w5.c;
import w5.h;

public final class d extends b {

    /* renamed from: j  reason: collision with root package name */
    public boolean f4058j = false;

    /* renamed from: k  reason: collision with root package name */
    public long f4059k = 0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4060l = false;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f4061m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap<w5.d, c6.d> f4062n;

    /* renamed from: o  reason: collision with root package name */
    public n f4063o;

    /* renamed from: p  reason: collision with root package name */
    public j f4064p;

    /* renamed from: q  reason: collision with root package name */
    public f f4065q;
    public final h r;

    public d(Context context, boolean z8, h hVar) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f4061m = arrayList;
        this.f4062n = new HashMap<>();
        this.r = hVar;
        c cVar = new c(this, 0);
        Context context2 = this.f4051d;
        n nVar = new n(context2, z8, cVar);
        this.f4063o = nVar;
        v(nVar);
        v(new e(context2, z8, new c(this, 1)));
        v(new g(context2, z8, new c(this, 2)));
        v(new l(context2, z8, new c(this, 3)));
        j jVar = new j(context2, z8, new c(this, 4));
        this.f4064p = jVar;
        v(jVar);
        f fVar = new f(context2, z8, hVar, new c(this, 5));
        this.f4065q = fVar;
        v(fVar);
        v(new k(context2, z8, hVar, new c(this, 6)));
        v(new c6.h(context2, z8, new c(this, 7)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c6.d dVar = (c6.d) it.next();
            boolean z9 = this.e;
            if (dVar.e != z9) {
                dVar.e = z9;
                dVar.h(z9);
            }
        }
    }

    public final void a() {
        super.a();
        Iterator it = this.f4061m.iterator();
        while (it.hasNext()) {
            ((c6.d) it.next()).c();
        }
    }

    public final void b() {
        super.b();
        this.f4059k = 0;
        this.f4060l = false;
    }

    public final w5.f c(c cVar) {
        HashMap hashMap = w5.e.f8060a;
        return q(w5.e.c(cVar.f8018a));
    }

    public final String d() {
        return "";
    }

    public final boolean e(String str) {
        return w5.e.c(str) != w5.d.f8025g;
    }

    public final void f() {
        HashMap<w5.d, c6.d> hashMap = this.f4062n;
        for (Map.Entry<w5.d, c6.d> key : hashMap.entrySet()) {
            w5.d dVar = (w5.d) key.getKey();
            c6.d dVar2 = hashMap.get(dVar);
            if (this.f4049b.get(dVar.f8059f[0]) != null) {
                dVar2.a(dVar);
            }
        }
        this.f4054h = true;
        r();
    }

    public final void h(boolean z8) {
        Iterator it = this.f4061m.iterator();
        while (it.hasNext()) {
            c6.d dVar = (c6.d) it.next();
            if (dVar.e != z8) {
                dVar.e = z8;
                dVar.h(z8);
            }
        }
    }

    public final void i(boolean z8) {
        u();
    }

    public final void j(boolean z8) {
        u();
    }

    public final void k(String str) {
        if (this.f4054h) {
            w5.d c9 = w5.e.c(str);
            c6.d dVar = this.f4062n.get(c9);
            if (dVar != null) {
                dVar.a(c9);
                return;
            }
            Log.w("DWF:DefaultDataProvider", "onListenerEntryAdded: there is no model for " + str);
        }
    }

    public final void l(String str) {
        w5.d c9 = w5.e.c(str);
        c6.d dVar = this.f4062n.get(c9);
        if (dVar != null) {
            Log.i("DWF:Model", "disconnect: " + c9);
            if (!dVar.f2719d && dVar.f(c9)) {
                dVar.j(c9);
            }
            dVar.f2720f.put(c9, Boolean.FALSE);
        }
    }

    public final void m() {
        Iterator it = this.f4061m.iterator();
        while (it.hasNext()) {
            c6.d dVar = (c6.d) it.next();
            if (!dVar.f2719d) {
                dVar.k();
            }
        }
    }

    public final void n() {
        Iterator it = this.f4061m.iterator();
        while (it.hasNext()) {
            c6.d dVar = (c6.d) it.next();
            if (!dVar.f2719d) {
                dVar.l();
            }
        }
    }

    public final void o(c cVar, w5.f fVar) {
        HashMap hashMap = w5.e.f8060a;
        w5.d c9 = w5.e.c(cVar.f8018a);
        c6.d dVar = this.f4062n.get(c9);
        if (dVar != null) {
            dVar.b(c9, fVar);
        }
    }

    public final w5.f q(w5.d dVar) {
        if (this.f4052f && this.f4053g) {
            HashMap hashMap = b.f8017c;
            w5.f fVar = w5.f.f8063k;
            w5.f fVar2 = (w5.f) hashMap.getOrDefault(dVar, fVar);
            if (fVar2 != fVar) {
                return fVar2;
            }
        }
        if (this.f4058j) {
            HashMap hashMap2 = b.f8016b;
            w5.f fVar3 = w5.f.f8063k;
            w5.f fVar4 = (w5.f) hashMap2.getOrDefault(dVar, fVar3);
            if (fVar4 != fVar3) {
                return fVar4;
            }
        }
        c6.d dVar2 = this.f4062n.get(dVar);
        if (dVar2 == null) {
            return (w5.f) (this.f4058j ? b.f8016b : b.f8015a).getOrDefault(dVar, w5.f.f8063k);
        }
        w5.f e = dVar2.e(dVar);
        return e == null ? w5.f.f8063k : e;
    }

    public final void r() {
        for (String str : this.f4049b.keySet()) {
            if (str.isEmpty()) {
                Log.e("DWF:DataSource", "invalid source");
            }
            HashMap hashMap = w5.e.f8060a;
            g(str, q(w5.e.c(str)), false);
        }
    }

    public final void s(w5.d dVar) {
        g(dVar.f8059f[0], q(dVar), false);
    }

    public final void t(w5.d dVar, boolean z8) {
        g(dVar.f8059f[0], q(dVar), z8);
    }

    public final void u() {
        HashMap hashMap = b.f8015a;
        Iterator it = new ArrayList(b.f8017c.keySet()).iterator();
        while (it.hasNext()) {
            t((w5.d) it.next(), true);
        }
    }

    public final void v(c6.d dVar) {
        for (int ordinal = dVar.d().ordinal(); ordinal < dVar.m().ordinal(); ordinal++) {
            this.f4062n.put(w5.d.values()[ordinal], dVar);
        }
        ArrayList arrayList = this.f4061m;
        if (!arrayList.contains(dVar)) {
            arrayList.add(dVar);
        }
    }
}
