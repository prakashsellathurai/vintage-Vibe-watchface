package s5;

import a7.d;
import android.graphics.drawable.Drawable;
import f6.a;
import v5.b;
import w5.c;
import w5.f;

public final class c0 extends a {
    public final /* synthetic */ d e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(b bVar, c cVar, d dVar) {
        super(bVar, cVar);
        this.e = dVar;
    }

    public final void b(f fVar) {
        this.e.c(fVar.g() instanceof Drawable ? (Drawable) fVar.g() : null);
    }
}
