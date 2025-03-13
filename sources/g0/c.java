package g0;

import a1.a;
import android.os.Handler;
import c0.c;
import g0.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f4445a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4446b;

    public c(c.a aVar, Handler handler) {
        this.f4445a = aVar;
        this.f4446b = handler;
    }

    public final void a(k.a aVar) {
        int i8 = aVar.f4467b;
        boolean z8 = i8 == 0;
        Handler handler = this.f4446b;
        a aVar2 = this.f4445a;
        if (z8) {
            handler.post(new a(aVar2, aVar.f4466a));
        } else {
            handler.post(new b(aVar2, i8));
        }
    }
}
