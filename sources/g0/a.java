package g0;

import android.graphics.Typeface;
import b0.b;
import c0.c;

public final class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a1.a f4441f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Typeface f4442g;

    public a(a1.a aVar, Typeface typeface) {
        this.f4441f = aVar;
        this.f4442g = typeface;
    }

    public final void run() {
        b.C0027b bVar = ((c.a) this.f4441f).s0;
        if (bVar != null) {
            bVar.d(this.f4442g);
        }
    }
}
