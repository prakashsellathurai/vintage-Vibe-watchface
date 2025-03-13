package r2;

import com.bumptech.glide.load.data.d;
import p2.e;
import r2.h;
import v2.n;

public final class z implements d.a<Object> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n.a f6925f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a0 f6926g;

    public z(a0 a0Var, n.a aVar) {
        this.f6926g = a0Var;
        this.f6925f = aVar;
    }

    public final void c(Exception exc) {
        a0 a0Var = this.f6926g;
        n.a<?> aVar = this.f6925f;
        n.a<?> aVar2 = a0Var.f6746k;
        if (aVar2 != null && aVar2 == aVar) {
            f fVar = a0Var.f6747l;
            d<Data> dVar = aVar.f7886c;
            a0Var.f6742g.f(fVar, exc, dVar, dVar.e());
        }
    }

    public final void d(Object obj) {
        a0 a0Var = this.f6926g;
        n.a<?> aVar = this.f6925f;
        n.a<?> aVar2 = a0Var.f6746k;
        if (aVar2 != null && aVar2 == aVar) {
            l lVar = a0Var.f6741f.f6784p;
            if (obj == null || !lVar.c(aVar.f7886c.e())) {
                h.a aVar3 = a0Var.f6742g;
                e eVar = aVar.f7884a;
                d<Data> dVar = aVar.f7886c;
                aVar3.g(eVar, obj, dVar, dVar.e(), a0Var.f6747l);
                return;
            }
            a0Var.f6745j = obj;
            a0Var.f6742g.e();
        }
    }
}
