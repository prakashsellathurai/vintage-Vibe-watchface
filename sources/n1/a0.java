package n1;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import q7.k;

public final class a0 implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f5497a;

    public a0(b0 b0Var) {
        this.f5497a = b0Var;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        k.e(surfaceHolder, "holder");
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        k.d(surfaceFrame, "holder.surfaceFrame");
        b0 b0Var = this.f5497a;
        b0Var.f5518f = surfaceFrame;
        b0Var.f5519g = b0Var.f5518f.exactCenterX();
        b0Var.f5520h = b0Var.f5518f.exactCenterY();
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k.e(surfaceHolder, "holder");
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k.e(surfaceHolder, "holder");
    }
}
