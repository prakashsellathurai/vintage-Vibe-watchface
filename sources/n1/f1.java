package n1;

import android.os.Looper;
import android.view.Choreographer;
import q7.k;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final Choreographer f5555a = Choreographer.getInstance();

    public f1() {
        if (!k.a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalArgumentException("Creating choreographer not on the main thread".toString());
        }
    }

    public final void a(Choreographer.FrameCallback frameCallback) {
        k.e(frameCallback, "callback");
        this.f5555a.postFrameCallback(frameCallback);
    }
}
