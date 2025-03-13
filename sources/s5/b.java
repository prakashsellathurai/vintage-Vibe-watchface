package s5;

import android.os.Handler;
import android.os.Looper;
import b0.c;
import java.util.HashMap;
import o6.g;
import o6.n;
import o6.x;

public final class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7210a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public i5.b f7211b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f7212c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public boolean f7213d = false;

    public final void a(g gVar, x xVar) {
        this.f7210a.put(gVar, xVar);
        gVar.k(new c(this, 12, gVar));
    }
}
