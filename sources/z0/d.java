package z0;

import android.view.Choreographer;

public final /* synthetic */ class d implements Choreographer.FrameCallback {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f8673f;

    public /* synthetic */ d(Runnable runnable) {
        this.f8673f = runnable;
    }

    public final void doFrame(long j8) {
        this.f8673f.run();
    }
}
