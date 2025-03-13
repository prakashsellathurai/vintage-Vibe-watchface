package s5;

import android.graphics.drawable.Drawable;
import c7.k;
import f6.a;
import v5.b;
import w5.c;
import w5.f;

public final class f0 extends a {
    public final /* synthetic */ k e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(b bVar, c cVar, k kVar) {
        super(bVar, cVar);
        this.e = kVar;
    }

    public final void b(f fVar) {
        Drawable drawable = (Drawable) fVar.g();
        k kVar = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, kVar.f2811p, kVar.f2812q);
            kVar.H(drawable);
            kVar.A();
            return;
        }
        kVar.getClass();
    }
}
