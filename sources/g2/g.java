package g2;

import a2.d;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import d2.e;
import java.util.ArrayList;
import java.util.Collections;
import y1.l;

public final class g extends b {
    public final d y;

    public g(l lVar, e eVar) {
        super(lVar, eVar);
        d dVar = new d(lVar, this, new f2.l("__container", eVar.f4530a, false));
        this.y = dVar;
        dVar.d(Collections.emptyList(), Collections.emptyList());
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        this.y.a(rectF, this.f4517l, z8);
    }

    public final void k(Canvas canvas, Matrix matrix, int i8) {
        this.y.f(canvas, matrix, i8);
    }

    public final void o(e eVar, int i8, ArrayList arrayList, e eVar2) {
        this.y.c(eVar, i8, arrayList, eVar2);
    }
}
