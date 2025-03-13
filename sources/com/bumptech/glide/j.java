package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import g3.a;
import g3.b;
import g3.c;
import g3.d;
import g3.e;
import g3.f;
import g3.h;
import g3.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.k;
import r2.l;

public final class j<TranscodeType> extends a<j<TranscodeType>> {
    public final Context F;
    public final k G;
    public final Class<TranscodeType> H;
    public final f I;
    public l<?, ? super TranscodeType> J;
    public Object K;
    public ArrayList L;
    public j<TranscodeType> M;
    public j<TranscodeType> N;
    public final boolean O = true;
    public boolean P;
    public boolean Q;

    static {
        f fVar = (f) ((f) ((f) new f().d(l.f6824b)).g()).j(true);
    }

    @SuppressLint({"CheckResult"})
    public j(b bVar, k kVar, Context context) {
        f fVar;
        Class<Bitmap> cls = Bitmap.class;
        this.G = kVar;
        this.H = cls;
        this.F = context;
        Map<Class<?>, l<?, ?>> map = kVar.f2959a.f2915c.e;
        l<?, ? super TranscodeType> lVar = map.get(cls);
        if (lVar == null) {
            for (Map.Entry next : map.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                }
            }
        }
        this.J = lVar == null ? f.f2920j : lVar;
        this.I = bVar.f2915c;
        Iterator<e<Object>> it = kVar.f2966i.iterator();
        while (it.hasNext()) {
            n(it.next());
        }
        synchronized (kVar) {
            fVar = kVar.f2967j;
        }
        o(fVar);
    }

    public final a a(a aVar) {
        k3.j.l(aVar);
        return (j) super.a(aVar);
    }

    public final j<TranscodeType> n(e<TranscodeType> eVar) {
        if (this.A) {
            return clone().n(eVar);
        }
        if (eVar != null) {
            if (this.L == null) {
                this.L = new ArrayList();
            }
            this.L.add(eVar);
        }
        h();
        return this;
    }

    public final j<TranscodeType> o(a<?> aVar) {
        k3.j.l(aVar);
        return (j) super.a(aVar);
    }

    public final c p(int i8, int i9, h hVar, l lVar, j jVar, d dVar, h3.a aVar, Object obj) {
        b bVar;
        b bVar2;
        i iVar;
        int i10;
        h hVar2;
        int i11;
        int i12;
        j jVar2 = jVar;
        Object obj2 = obj;
        if (this.N != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        j<TranscodeType> jVar3 = this.M;
        if (jVar3 == null) {
            iVar = t(i8, i9, hVar, lVar, jVar, bVar2, aVar, obj);
        } else if (!this.Q) {
            l<?, ? super TranscodeType> lVar2 = jVar3.O ? lVar : jVar3.J;
            if (a.e(jVar3.f4552f, 8)) {
                hVar2 = this.M.f4555i;
            } else {
                int ordinal = hVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    hVar2 = h.f2931f;
                } else if (ordinal == 2) {
                    hVar2 = h.f2932g;
                } else if (ordinal == 3) {
                    hVar2 = h.f2933h;
                } else {
                    throw new IllegalArgumentException("unknown priority: " + this.f4555i);
                }
            }
            h hVar3 = hVar2;
            j<TranscodeType> jVar4 = this.M;
            int i13 = jVar4.f4562p;
            int i14 = jVar4.f4561o;
            if (k.g(i8, i9)) {
                j<TranscodeType> jVar5 = this.M;
                if (!k.g(jVar5.f4562p, jVar5.f4561o)) {
                    i12 = jVar2.f4562p;
                    i11 = jVar2.f4561o;
                    i iVar2 = new i(obj2, bVar2);
                    h3.a aVar2 = aVar;
                    i iVar3 = iVar2;
                    h t8 = t(i8, i9, hVar, lVar, jVar, iVar2, aVar2, obj);
                    this.Q = true;
                    j<TranscodeType> jVar6 = this.M;
                    c p8 = jVar6.p(i12, i11, hVar3, lVar2, jVar6, iVar3, aVar2, obj);
                    this.Q = false;
                    i iVar4 = iVar3;
                    iVar4.f4599c = t8;
                    iVar4.f4600d = p8;
                    iVar = iVar4;
                }
            }
            i11 = i14;
            i12 = i13;
            i iVar22 = new i(obj2, bVar2);
            h3.a aVar22 = aVar;
            i iVar32 = iVar22;
            h t82 = t(i8, i9, hVar, lVar, jVar, iVar22, aVar22, obj);
            this.Q = true;
            j<TranscodeType> jVar62 = this.M;
            c p82 = jVar62.p(i12, i11, hVar3, lVar2, jVar62, iVar32, aVar22, obj);
            this.Q = false;
            i iVar42 = iVar32;
            iVar42.f4599c = t82;
            iVar42.f4600d = p82;
            iVar = iVar42;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar;
        }
        j<TranscodeType> jVar7 = this.N;
        int i15 = jVar7.f4562p;
        int i16 = jVar7.f4561o;
        if (k.g(i8, i9)) {
            j<TranscodeType> jVar8 = this.N;
            if (!k.g(jVar8.f4562p, jVar8.f4561o)) {
                int i17 = jVar2.f4562p;
                i10 = jVar2.f4561o;
                i15 = i17;
                j<TranscodeType> jVar9 = this.N;
                c p9 = jVar9.p(i15, i10, jVar9.f4555i, jVar9.J, jVar9, bVar, aVar, obj);
                bVar.f4572c = iVar;
                bVar.f4573d = p9;
                return bVar;
            }
        }
        i10 = i16;
        j<TranscodeType> jVar92 = this.N;
        c p92 = jVar92.p(i15, i10, jVar92.f4555i, jVar92.J, jVar92, bVar, aVar, obj);
        bVar.f4572c = iVar;
        bVar.f4573d = p92;
        return bVar;
    }

    /* renamed from: q */
    public final j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.J = jVar.J.clone();
        if (jVar.L != null) {
            jVar.L = new ArrayList(jVar.L);
        }
        j<TranscodeType> jVar2 = jVar.M;
        if (jVar2 != null) {
            jVar.M = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.N;
        if (jVar3 != null) {
            jVar.N = jVar3.clone();
        }
        return jVar;
    }

    public final void r(h3.a aVar) {
        k3.j.l(aVar);
        if (this.P) {
            Object obj = new Object();
            c p8 = p(this.f4562p, this.f4561o, this.f4555i, this.J, this, (d) null, aVar, obj);
            c cVar = aVar.f4750c;
            if (p8.h(cVar)) {
                if (!(!this.f4560n && cVar.j())) {
                    k3.j.l(cVar);
                    if (!cVar.isRunning()) {
                        cVar.g();
                        return;
                    }
                    return;
                }
            }
            this.G.l(aVar);
            aVar.f4750c = p8;
            k kVar = this.G;
            synchronized (kVar) {
                kVar.f2963f.f4034a.add(aVar);
                d3.l lVar = kVar.f2962d;
                ((Set) lVar.f4026c).add(p8);
                if (!lVar.f4025b) {
                    p8.g();
                } else {
                    p8.clear();
                    Log.isLoggable("RequestTracker", 2);
                    ((List) lVar.f4027d).add(p8);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final j<TranscodeType> s(Object obj) {
        if (this.A) {
            return clone().s(obj);
        }
        this.K = obj;
        this.P = true;
        h();
        return this;
    }

    public final h t(int i8, int i9, h hVar, l lVar, j jVar, d dVar, h3.a aVar, Object obj) {
        Context context = this.F;
        Object obj2 = this.K;
        Class<TranscodeType> cls = this.H;
        ArrayList arrayList = this.L;
        f fVar = this.I;
        return new h(context, fVar, obj, obj2, cls, jVar, i8, i9, hVar, aVar, arrayList, dVar, fVar.f2925f, lVar.f2971f);
    }
}
