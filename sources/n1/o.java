package n1;

import a8.b;
import a8.g;
import c1.c;
import j7.d;
import java.util.Map;
import l7.e;
import l7.h;
import n1.l;
import p7.p;
import q7.k;
import u1.m;
import y7.z;

@e(c = "androidx.wear.watchface.ComplicationSlotsManager$listenForStyleChanges$2", f = "ComplicationSlotsManager.kt", l = {177}, m = "invokeSuspend")
public final class o extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5675j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l f5676k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ q7.p<m.c.C0133c> f5677l;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f5678f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ q7.p<m.c.C0133c> f5679g;

        public a(l lVar, q7.p<m.c.C0133c> pVar) {
            this.f5678f = lVar;
            this.f5679g = pVar;
        }

        public final Object emit(Object obj, d dVar) {
            u1.e eVar = (u1.e) obj;
            l lVar = this.f5678f;
            u1.b bVar = lVar.f5651a;
            T b9 = bVar.f7605a.b((u1.e) bVar.f7606b.getValue());
            q7.p<m.c.C0133c> pVar = this.f5679g;
            if (!k.a(pVar.f6643f, b9)) {
                pVar.f6643f = b9;
                if (b9 == null) {
                    for (Map.Entry entry : lVar.e.entrySet()) {
                        int intValue = ((Number) entry.getKey()).intValue();
                        h hVar = (h) entry.getValue();
                        Object obj2 = lVar.f5656g.get(Integer.valueOf(intValue));
                        k.b(obj2);
                        l.a aVar = (l.a) obj2;
                        hVar.i(aVar.f5658a);
                        boolean z8 = hVar.f5576q;
                        boolean z9 = aVar.f5659b;
                        if (z8 != z9) {
                            hVar.f5576q = z9;
                            hVar.f5575p = true;
                        }
                        hVar.g(aVar.f5660c);
                        hVar.j(aVar.f5661d);
                        Integer num = hVar.f5582z;
                        Integer num2 = aVar.e;
                        if (!k.a(num, num2)) {
                            hVar.f5582z = num2;
                            hVar.y = true;
                        }
                    }
                    lVar.f();
                } else {
                    lVar.a(b9);
                }
            }
            return h7.h.f4787a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(l lVar, q7.p<m.c.C0133c> pVar, d<? super o> dVar) {
        super(2, dVar);
        this.f5676k = lVar;
        this.f5677l = pVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new o(this.f5676k, this.f5677l, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((o) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5675j;
        if (i8 == 0) {
            a1.a.I(obj);
            l lVar = this.f5676k;
            g gVar = lVar.f5651a.f7606b;
            a aVar2 = new a(lVar, this.f5677l);
            this.f5675j = 1;
            if (gVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a1.a.I(obj);
        }
        throw new c();
    }
}
