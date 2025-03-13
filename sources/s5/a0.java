package s5;

import android.content.Context;
import x6.c;
import x6.f;

public final /* synthetic */ class a0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f7209b;

    public /* synthetic */ a0(Context context, c cVar) {
        this.f7208a = context;
        this.f7209b = cVar;
    }

    public final void b(boolean z8) {
        if (z8) {
            this.f7208a.sendBroadcast(this.f7209b.a(c.a.f8185g));
        }
    }
}
