package q3;

import android.os.Handler;
import q3.b;

public final class o implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6573a;

    public o(d dVar) {
        this.f6573a = dVar;
    }

    public final void a(boolean z8) {
        Handler handler = this.f6573a.f6549l;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
