package q3;

import android.content.Context;
import android.os.Handler;
import b4.b;
import b4.e;
import b4.f;
import c4.d;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import o3.a;
import p3.d;

public final class e0 extends d implements d.a, d.b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f6551i = e.f2602a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f6552b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6553c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6554d = f6551i;
    public final Set<Scope> e;

    /* renamed from: f  reason: collision with root package name */
    public final r3.d f6555f;

    /* renamed from: g  reason: collision with root package name */
    public f f6556g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f6557h;

    public e0(Context context, Handler handler, r3.d dVar) {
        this.f6552b = context;
        this.f6553c = handler;
        this.f6555f = dVar;
        this.e = dVar.f6955b;
    }

    public final void c(a aVar) {
        ((w) this.f6557h).b(aVar);
    }

    public final void h(int i8) {
        this.f6556g.n();
    }

    public final void i() {
        this.f6556g.p(this);
    }
}
