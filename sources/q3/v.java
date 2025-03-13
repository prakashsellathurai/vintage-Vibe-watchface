package q3;

import android.util.Log;
import o3.a;
import p3.a;
import r3.i;

public final class v implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f6593f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6594g;

    public v(w wVar, a aVar) {
        this.f6594g = wVar;
        this.f6593f = aVar;
    }

    public final void run() {
        i iVar;
        w wVar = this.f6594g;
        t tVar = (t) wVar.f6599f.f6547j.get(wVar.f6596b);
        if (tVar != null) {
            a aVar = this.f6593f;
            if (aVar.f6080g == 0) {
                wVar.e = true;
                a.e eVar = wVar.f6595a;
                if (!eVar.o()) {
                    try {
                        eVar.d((i) null, eVar.b());
                    } catch (SecurityException e) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                        eVar.e("Failed to get service from broker.");
                        tVar.n(new o3.a(10), (RuntimeException) null);
                    }
                } else if (wVar.e && (iVar = wVar.f6597c) != null) {
                    eVar.d(iVar, wVar.f6598d);
                }
            } else {
                tVar.n(aVar, (RuntimeException) null);
            }
        }
    }
}
