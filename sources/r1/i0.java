package r1;

import android.view.SurfaceHolder;
import q7.k;

public final class i0 implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f6712a;

    public i0(k0 k0Var) {
        this.f6712a = k0Var;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        k.e(surfaceHolder, "surfaceHolder");
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k.e(surfaceHolder, "surfaceHolder");
        this.f6712a.f6723d.X(surfaceHolder);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k.e(surfaceHolder, "surfaceHolder");
    }
}
