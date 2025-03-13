package e7;

import e7.i;
import i0.a;
import w5.f;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4273a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f4274b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i.a f4275c;

    public /* synthetic */ g(h hVar, i.a aVar, int i8) {
        this.f4273a = i8;
        this.f4274b = hVar;
        this.f4275c = aVar;
    }

    public final void accept(Object obj) {
        int i8 = this.f4273a;
        i.a aVar = this.f4275c;
        h hVar = this.f4274b;
        switch (i8) {
            case 0:
                hVar.f4279g.j(aVar, (f) obj);
                return;
            default:
                hVar.f4279g.j(aVar, new f(hVar.f4279g.a(aVar).d() + ((f) obj).d()));
                return;
        }
    }
}
