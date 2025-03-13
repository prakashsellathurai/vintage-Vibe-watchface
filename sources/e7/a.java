package e7;

import w5.f;

public final /* synthetic */ class a implements i0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f4263b;

    public /* synthetic */ a(b bVar, int i8) {
        this.f4262a = i8;
        this.f4263b = bVar;
    }

    public final void accept(Object obj) {
        int i8 = this.f4262a;
        b bVar = this.f4263b;
        switch (i8) {
            case 0:
                Void voidR = (Void) obj;
                bVar.n(bVar.f4264n, bVar.f4281i.b());
                bVar.f6332b.c();
                return;
            default:
                bVar.n(bVar.f4279g.a(bVar.f4280h), (f) obj);
                bVar.f6332b.c();
                return;
        }
    }
}
