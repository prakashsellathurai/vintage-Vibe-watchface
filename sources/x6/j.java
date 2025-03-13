package x6;

import android.util.Log;
import java.util.ArrayList;
import o6.k;
import s5.q;
import s5.r;
import v6.b;

public final class j implements o6.j, r, q, d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8204a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8205b;

    /* renamed from: c  reason: collision with root package name */
    public final k f8206c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8207d = new ArrayList();

    public j(b bVar, boolean z8, boolean z9) {
        this.f8206c = bVar;
        this.f8204a = z8;
        this.f8205b = z9;
    }

    public final void a() {
        Log.i("DWF:PartVisibilityProvider", "onAttached : " + e());
        g(e());
    }

    public final void b(boolean z8) {
        Log.i("DWF:PartVisibilityProvider", "onNodeStatusChanged :" + this.f8206c.isEnabled() + "->" + z8);
        g(e());
    }

    public final void c(f fVar) {
        ArrayList arrayList = this.f8207d;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
    }

    public final void d(boolean z8) {
        Log.i("DWF:PartVisibilityProvider", "onAmbientStateChanged :" + this.f8205b + "->" + z8);
        this.f8205b = z8;
        g(e());
    }

    public final boolean e() {
        return this.f8204a && this.f8206c.isEnabled() && !this.f8205b;
    }

    public final void f(boolean z8) {
        Log.i("DWF:PartVisibilityProvider", "onRunningStateChanged :" + this.f8204a + "->" + z8);
        this.f8204a = z8;
        g(e());
    }

    public final void g(boolean z8) {
        Log.i("DWF:PartVisibilityProvider", "onVisibilityChanged : " + z8);
        this.f8207d.forEach(new i(0, z8));
    }
}
