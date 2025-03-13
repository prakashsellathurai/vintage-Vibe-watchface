package c6;

import android.content.Context;
import android.util.Log;
import d6.c;
import java.util.HashMap;
import w5.f;
import w5.h;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2716a;

    /* renamed from: b  reason: collision with root package name */
    public c f2717b;

    /* renamed from: c  reason: collision with root package name */
    public h f2718c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2719d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f2720f = new HashMap();

    public d(Context context, boolean z8, c cVar) {
        this.f2716a = context;
        this.f2719d = z8;
        this.f2717b = cVar;
    }

    public final void a(w5.d dVar) {
        Log.i("DWF:Model", "connect: " + dVar);
        if (!this.f2719d && !f(dVar)) {
            i(dVar);
        }
        this.f2720f.put(dVar, Boolean.TRUE);
    }

    public abstract void b(w5.d dVar, f fVar);

    public void c() {
    }

    public abstract w5.d d();

    public abstract f e(w5.d dVar);

    public abstract boolean f(w5.d dVar);

    public final boolean g() {
        for (Boolean booleanValue : this.f2720f.values()) {
            if (booleanValue.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void h(boolean z8) {
    }

    public abstract void i(w5.d dVar);

    public abstract void j(w5.d dVar);

    public abstract void k();

    public abstract void l();

    public abstract w5.d m();
}
