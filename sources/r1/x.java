package r1;

import n1.h;
import n1.m;
import n1.n;
import n1.p0;
import q7.k;
import q7.l;

public final class x extends l implements p7.l<p0, Long> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6736f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f6737g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(int i8, int i9) {
        super(1);
        this.f6736f = i8;
        this.f6737g = i9;
    }

    public final Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        k.e(p0Var, "it");
        n1.l lVar = p0Var.f5686d;
        lVar.getClass();
        int i8 = this.f6736f;
        int i9 = this.f6737g;
        h b9 = lVar.b(new m(lVar, i8, i9));
        if (b9 == null) {
            b9 = lVar.b(new n(lVar, i8, i9));
        }
        if (b9 != null) {
            return Long.valueOf((long) b9.f5561a);
        }
        return null;
    }
}
