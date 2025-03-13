package r1;

import android.view.SurfaceControlViewHost;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import h7.h;
import k3.j;
import n1.r;
import p7.p;
import q7.k;
import r1.l;
import y7.o;
import y7.z;

public final class k0 extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final SurfaceControlViewHost f6720a;

    /* renamed from: b  reason: collision with root package name */
    public final z f6721b;

    /* renamed from: c  reason: collision with root package name */
    public final p<SurfaceHolder, WatchFaceRenderParams, h> f6722c;

    /* renamed from: d  reason: collision with root package name */
    public final o f6723d = j.d();

    public k0(SurfaceView surfaceView, SurfaceControlViewHost surfaceControlViewHost, z zVar, r.a aVar) {
        k.e(zVar, "uiThreadCoroutineScope");
        this.f6720a = surfaceControlViewHost;
        this.f6721b = zVar;
        this.f6722c = aVar;
        surfaceView.getHolder().addCallback(new i0(this));
    }
}
