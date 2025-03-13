package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.b;
import androidx.activity.result.f;
import d.a;

public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f287f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a.C0047a f288g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f289h;

    public e(ComponentActivity.b bVar, int i8, a.C0047a aVar) {
        this.f289h = bVar;
        this.f287f = i8;
        this.f288g = aVar;
    }

    public final void run() {
        b<O> bVar;
        T t8 = this.f288g.f3974a;
        ComponentActivity.b bVar2 = this.f289h;
        String str = (String) bVar2.f314b.get(Integer.valueOf(this.f287f));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f317f.get(str);
            if (aVar == null || (bVar = aVar.f320a) == null) {
                bVar2.f319h.remove(str);
                bVar2.f318g.put(str, t8);
            } else if (bVar2.e.remove(str)) {
                bVar.a(t8);
            }
        }
    }
}
