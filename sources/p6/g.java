package p6;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import java.util.ArrayList;

public final class g extends e {

    /* renamed from: d  reason: collision with root package name */
    public final Choreographer f6354d = Choreographer.getInstance();
    public final a e = new a();

    public class a implements Choreographer.FrameCallback {
        public a() {
        }

        public final void doFrame(long j8) {
            g gVar = g.this;
            if (!gVar.f6350b) {
                Log.w("DWF:FrameTimerVsync", "NOT RUNNING");
                return;
            }
            gVar.f6354d.postFrameCallback(this);
            new Handler(Looper.getMainLooper()).post(new f(this, j8));
        }
    }

    public final void a(i iVar) {
        ArrayList arrayList = this.f6351c;
        if (!arrayList.contains(iVar)) {
            arrayList.add(iVar);
        }
        if (!this.f6350b) {
            this.f6349a = 0;
            this.f6354d.postFrameCallback(this.e);
            this.f6350b = true;
        }
    }

    public final void b(i iVar) {
        ArrayList arrayList = this.f6351c;
        arrayList.remove(iVar);
        if (arrayList.size() < 1) {
            this.f6350b = false;
            this.f6354d.removeFrameCallback(this.e);
        }
    }
}
