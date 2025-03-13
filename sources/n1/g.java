package n1;

import java.time.Instant;
import q1.b;
import q7.k;

public final /* synthetic */ class g implements AutoCloseable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f5556f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f5557g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f5558h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Instant f5559i;

    public /* synthetic */ g(h hVar, b bVar, b bVar2, Instant instant) {
        this.f5556f = hVar;
        this.f5557g = bVar;
        this.f5558h = bVar2;
        this.f5559i = instant;
    }

    public final void close() {
        h hVar = this.f5556f;
        k.e(hVar, "this$0");
        b bVar = this.f5557g;
        k.e(bVar, "$complicationData");
        b bVar2 = this.f5558h;
        k.e(bVar2, "$originalComplicationData");
        if (hVar.E == bVar) {
            Instant instant = this.f5559i;
            k.d(instant, "originalInstant");
            hVar.k(bVar2, instant);
            hVar.f(instant, true, false);
        }
    }
}
