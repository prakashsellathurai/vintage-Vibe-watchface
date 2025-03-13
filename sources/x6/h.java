package x6;

import a7.a;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import i5.j;
import java.util.ArrayList;
import java.util.EnumSet;
import o6.q;
import o6.s;
import v6.b;
import x6.c;

public class h extends s implements e, a {

    /* renamed from: j  reason: collision with root package name */
    public boolean f8196j = true;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f8197k = null;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f8198l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public int f8199m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final EnumSet<c.a> f8200n = EnumSet.noneOf(c.a.class);

    /* renamed from: o  reason: collision with root package name */
    public boolean f8201o = true;

    public h(b bVar) {
        super(bVar);
    }

    public Drawable B(int i8, int i9) {
        ArrayList arrayList = this.f8198l;
        a7.b bVar = !arrayList.isEmpty() ? (a7.b) arrayList.get(this.f8199m) : null;
        if (bVar != null) {
            q qVar = this.f6175c;
            this.f8197k = qVar != null && (qVar instanceof b) && ((b) qVar).I ? bVar.a() : bVar.b(i8, i9);
        }
        Drawable drawable = this.f8197k;
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, i8, i9));
        }
        return this.f8197k;
    }

    public final void h(c.a aVar) {
        if (aVar == c.a.f8185g && i(aVar) && this.f8201o) {
            this.f8201o = false;
        } else if (i(aVar)) {
            this.f8199m = (this.f8199m + 1) % this.f8198l.size();
            A();
        }
    }

    public final boolean i(c.a aVar) {
        return this.f8200n.contains(aVar);
    }

    public void r() {
        super.r();
        ArrayList arrayList = this.f8198l;
        arrayList.forEach(new j(11));
        arrayList.clear();
    }
}
