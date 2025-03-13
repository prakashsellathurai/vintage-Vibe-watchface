package y1;

import y1.l;

public final class m implements l.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8293b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f8294c;

    public m(l lVar, int i8, int i9) {
        this.f8294c = lVar;
        this.f8292a = i8;
        this.f8293b = i9;
    }

    public final void run() {
        l lVar = this.f8294c;
        f fVar = lVar.f8251b;
        int i8 = this.f8292a;
        int i9 = this.f8293b;
        if (fVar == null) {
            lVar.f8256h.add(new m(lVar, i8, i9));
            return;
        }
        lVar.f8252c.g((float) i8, ((float) i9) + 0.99f);
    }
}
