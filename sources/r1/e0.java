package r1;

import h7.h;
import java.time.Instant;
import n1.h0;
import n1.p0;
import q7.k;
import q7.l;

public final class e0 extends l implements p7.l<p0, h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6696f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f6697g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6698h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h0 f6699i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(int i8, int i9, int i10, h0 h0Var) {
        super(1);
        this.f6696f = i8;
        this.f6697g = i9;
        this.f6698h = i10;
        this.f6699i = h0Var;
    }

    public final Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        k.e(p0Var, "watchFaceImpl");
        Instant ofEpochMilli = Instant.ofEpochMilli(this.f6699i.f6711d.a());
        k.d(ofEpochMilli, "ofEpochMilli(systemTimeP…er.getSystemTimeMillis())");
        p0Var.f(this.f6696f, new h0(this.f6697g, this.f6698h, ofEpochMilli));
        return h.f4787a;
    }
}
