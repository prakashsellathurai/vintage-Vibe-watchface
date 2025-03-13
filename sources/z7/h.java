package z7;

import a1.a;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h7.e;
import q7.k;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8729a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new f(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = a.q(th);
        }
        if (obj instanceof e.a) {
            obj = null;
        }
        g gVar = (g) obj;
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
        k.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
