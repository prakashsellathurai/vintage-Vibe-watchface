package n1;

import android.hardware.display.DisplayManager;
import android.view.Display;
import q7.k;

public final class l0 implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f5662a;

    public l0(p0 p0Var) {
        this.f5662a = p0Var;
    }

    public final void onDisplayAdded(int i8) {
    }

    public final void onDisplayChanged(int i8) {
        p0 p0Var = this.f5662a;
        Display display = p0Var.f5700t.getDisplay(0);
        k.b(display);
        if (display.getState() == 1 && k.a(p0Var.f5684b.f5634d.getValue(), Boolean.FALSE)) {
            p0Var.f5692k.b();
            p0Var.f5692k.b();
        }
    }

    public final void onDisplayRemoved(int i8) {
    }
}
