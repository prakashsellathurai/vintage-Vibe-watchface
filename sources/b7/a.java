package b7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c7.n;
import c7.o;
import d7.d;
import d7.f;
import i5.g;
import java.util.ArrayList;
import java.util.Iterator;
import n1.c0;
import o6.m;
import o6.q;
import o6.r;

public class a extends r implements m, d {
    public final o F = new o(this.f6137k);
    public String G = "";
    public f H;
    public final ArrayList<n> I = new ArrayList<>();
    public Rect J = new Rect();

    public a(q qVar) {
        super(qVar);
        this.f6148x = true;
    }

    public final boolean H(Canvas canvas) {
        boolean z8 = this.f6149z;
        Paint paint = this.f6137k;
        if (z8) {
            RectF D = D();
            L((int) D.width(), (int) D.height());
            ArrayList<n> arrayList = this.I;
            Paint paint2 = paint;
            this.H.f(this.f6147v, paint2, D(), this.J, arrayList);
            this.f6149z = false;
        }
        canvas.drawBitmap(this.w, this.f6139m, paint);
        return true;
    }

    public final void J() {
        this.f6149z = true;
        this.H.d();
    }

    public final void K() {
        super.K();
    }

    public final void T() {
        super.K();
    }

    public final void c() {
        a1.a aVar = new a1.a();
        com.samsung.android.wearable.watchfacestudio.editor.q qVar = new com.samsung.android.wearable.watchfacestudio.editor.q(18);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            ArrayList l8 = ((q) it.next()).l(aVar, qVar, this.F);
            if (l8 != null) {
                arrayList.addAll(l8);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it2.hasNext()) {
            n nVar = (n) it2.next();
            if (nVar.f2821i) {
                z9 = true;
            }
            sb.append(nVar.f2818f);
        }
        if (z9 || !this.G.equals(sb.toString())) {
            this.G = sb.toString();
            toString();
            ArrayList<n> arrayList2 = this.I;
            arrayList2.clear();
            if (!sb.toString().isEmpty()) {
                f fVar = this.H;
                fVar.getClass();
                Rect rect = new Rect();
                arrayList.stream().map(new c0(3, fVar)).filter(new com.samsung.android.wearable.watchfacestudio.editor.q(19)).forEach(new g(fVar, arrayList2, rect, 5));
                this.J = rect;
            }
            z8 = true;
        }
        if (z8) {
            super.K();
        }
    }

    public final void r() {
        super.r();
        f fVar = this.H;
        if (fVar != null) {
            fVar.b();
        }
    }
}
