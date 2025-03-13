package t3;

import android.content.Context;
import android.os.Handler;
import d4.h;
import p3.a;
import p3.c;
import q3.b0;
import q3.f0;
import q3.h0;
import q3.j;
import r3.o;
import r3.p;
import y3.d;

public final class c extends p3.c<p> {

    /* renamed from: i  reason: collision with root package name */
    public static final a<p> f7490i = new a<>(new b(), new a.f());

    public c(Context context) {
        super(context, f7490i, c.a.f6325b);
    }

    public final h b(o oVar) {
        j.a aVar = new j.a();
        o3.c[] cVarArr = {d.f8406a};
        aVar.f6566a = new h2.d(7, oVar);
        f0 f0Var = new f0(aVar, cVarArr, false);
        d4.d dVar = new d4.d();
        q3.d dVar2 = this.f6324h;
        dVar2.getClass();
        Handler handler = dVar2.f6549l;
        handler.sendMessage(handler.obtainMessage(4, new b0(new h0(f0Var, dVar, this.f6323g), dVar2.f6546i.get(), this)));
        return dVar.f4036a;
    }
}
