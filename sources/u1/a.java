package u1;

import q7.k;

public final /* synthetic */ class a implements AutoCloseable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f7602f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f7603g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f7604h;

    public /* synthetic */ a(b bVar, e eVar, e eVar2) {
        this.f7602f = bVar;
        this.f7603g = eVar;
        this.f7604h = eVar2;
    }

    public final void close() {
        b bVar = this.f7602f;
        k.e(bVar, "this$0");
        e eVar = this.f7603g;
        k.e(eVar, "$newUserStyle");
        e eVar2 = this.f7604h;
        k.e(eVar2, "$originalStyle");
        bVar.f7606b.compareAndSet(eVar, eVar2);
    }
}
