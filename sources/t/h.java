package t;

import java.util.ArrayList;
import u.i;
import u.o;

public class h extends d implements g {

    /* renamed from: m0  reason: collision with root package name */
    public d[] f7368m0 = new d[4];

    /* renamed from: n0  reason: collision with root package name */
    public int f7369n0 = 0;

    public final void F(int i8, o oVar, ArrayList arrayList) {
        for (int i9 = 0; i9 < this.f7369n0; i9++) {
            d dVar = this.f7368m0[i9];
            ArrayList<d> arrayList2 = oVar.f7589a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i10 = 0; i10 < this.f7369n0; i10++) {
            i.a(this.f7368m0[i10], i8, arrayList, oVar);
        }
    }
}
