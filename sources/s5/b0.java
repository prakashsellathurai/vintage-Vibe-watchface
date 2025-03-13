package s5;

import android.content.Context;
import w5.f;
import w5.g;
import x6.c;

public final /* synthetic */ class b0 implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7215b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f7216c;

    public /* synthetic */ b0(Context context, c cVar, int i8) {
        this.f7214a = i8;
        this.f7215b = context;
        this.f7216c = cVar;
    }

    public final void g(w5.c cVar, f fVar) {
        int i8 = this.f7214a;
        Context context = this.f7215b;
        c cVar2 = this.f7216c;
        switch (i8) {
            case 0:
                context.sendBroadcast(cVar2.a(c.a.f8186h));
                return;
            case 1:
                context.sendBroadcast(cVar2.a(c.a.f8187i));
                return;
            default:
                context.sendBroadcast(cVar2.a(c.a.f8188j));
                return;
        }
    }
}
