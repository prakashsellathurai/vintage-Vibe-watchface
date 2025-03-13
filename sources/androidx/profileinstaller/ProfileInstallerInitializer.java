package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import z0.d;

public class ProfileInstallerInitializer implements c1.b<c> {

    public static class a {
        public static void a(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new d(runnable));
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public final List<Class<? extends c1.b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        a.a(new b0.c(this, 5, context.getApplicationContext()));
        return new c();
    }
}
